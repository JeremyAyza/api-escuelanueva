/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.apiescuelanueva.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.apiescuelanueva.entity.ApoderadoEntity;

import pe.com.apiescuelanueva.service.ApoderadoService;

@RestController
@RequestMapping("/apoderado")
public class ApoderadoController {
     @Autowired
    private ApoderadoService apoderadoservice;
    //GetMapping sirve para obtener valores

    @GetMapping
    public List<ApoderadoEntity> findAll() {
        return apoderadoservice.findAll();
    }
    @GetMapping("/custom")
    public List<ApoderadoEntity>findAllCustom()
    {
        return apoderadoservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional <ApoderadoEntity> findById(@PathVariable Long id )
    {
     return apoderadoservice.findById(id); 
    }
    @PostMapping
    public ApoderadoEntity add (@RequestBody ApoderadoEntity apo)
    {
        return apoderadoservice.add(apo);
    }
    @PutMapping("/{id}")
    public ApoderadoEntity update (@PathVariable long id,@RequestBody ApoderadoEntity apo)
    {
        apo.setCodigo(id);
        return apoderadoservice.update(apo);
    }
    @DeleteMapping("/{id}")
    public ApoderadoEntity delete(@PathVariable long id)      
    {
        ApoderadoEntity objdis=new ApoderadoEntity();
        
        objdis.setEstado(false);
        return apoderadoservice.delete(ApoderadoEntity.builder().codigo(id).build());
    }
    
}
