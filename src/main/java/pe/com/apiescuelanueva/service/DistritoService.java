package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.DistritoEntity;

public interface DistritoService {
    //Funcion que permita mostrar todos los datos
    List<DistritoEntity> findAll();
    //Funcion que permita mostrar todos los datos habilitados
    List<DistritoEntity> findAllCustom();
    //Funcion para poder buscar por codigo
    Optional<DistritoEntity> findById(Long id);
    //Funcion para registrar datos
    DistritoEntity add (DistritoEntity d); //d nombre de la variable distrito
    //Funcion para actualizar datos
    DistritoEntity update (DistritoEntity d); //d nombre de la variable distrito
    //Funcion para eliminar datos
    DistritoEntity delete (DistritoEntity d); //d nombre de la variable distrito
}
