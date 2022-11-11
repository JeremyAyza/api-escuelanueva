package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.ParentescoEntity;

public interface ParentescoService {
    //Funcion que permita mostrar todos los datos
    List<ParentescoEntity> findAll();
    //Funcion que permita mostrar todos los datos habilitados
    List<ParentescoEntity> findAllCustom();
    //Funcion para poder buscar por codigo
    Optional<ParentescoEntity> findById(Long id);
    //Funcion para registrar datos
    ParentescoEntity add (ParentescoEntity p); //p nombre de la variable parentesco
    //Funcion para actualizar datos
    ParentescoEntity update (ParentescoEntity p); //p nombre de la variable parentesco
    //Funcion para eliminar datos
    ParentescoEntity delete (ParentescoEntity p); //p nombre de la variable parentesco
}
