package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.ApoderadoEntity;


public interface ApoderadoService {
    //Funcion que permita mostrar todos los datos
    List<ApoderadoEntity> findAll();
    //Funcion que permita mostrar todos los datos habilitados
    List<ApoderadoEntity> findAllCustom();
    //Funcion para poder buscar por codigo
    Optional<ApoderadoEntity> findById(Long id);
    //Funcion para registrar datos
    ApoderadoEntity add (ApoderadoEntity a); //a nombre de la variable apoderado
    //Funcion para actualizar datos
    ApoderadoEntity update (ApoderadoEntity a); //a nombre de la variable apoderado
    //Funcion para eliminar datos
    ApoderadoEntity delete (ApoderadoEntity a); 
}