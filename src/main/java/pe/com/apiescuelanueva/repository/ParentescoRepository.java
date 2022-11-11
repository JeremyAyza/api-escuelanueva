package pe.com.apiescuelanueva.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apiescuelanueva.entity.ParentescoEntity;


public interface ParentescoRepository extends JpaRepository<ParentescoEntity,Long>{
    @Query("select apo from ParentescoEntity apo where apo.estado=1")
    List<ParentescoEntity> findAllCustom();
}
