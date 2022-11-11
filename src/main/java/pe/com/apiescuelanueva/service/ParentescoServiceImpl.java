
package pe.com.apiescuelanueva.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.entity.ParentescoEntity;
import pe.com.apiescuelanueva.repository.ParentescoRepository;

//permite definir la clase como un servicio
@Service
public class ParentescoServiceImpl implements ParentescoService{

     @Autowired
    private ParentescoRepository parentescoRepository; 
      @Override
    public List<ParentescoEntity> findAll() {
       return parentescoRepository.findAll();
    }



   @Override
    public List<ParentescoEntity> findAllCustom() {
        return parentescoRepository.findAllCustom();
    }


   @Override
    public Optional<ParentescoEntity> findById(Long id) {
        return parentescoRepository.findById(id);
    }



   @Override
    public ParentescoEntity add(ParentescoEntity p) {
         return parentescoRepository.save(p);
    }



   @Override
    public ParentescoEntity update(ParentescoEntity p) {
        ParentescoEntity objparentesco=parentescoRepository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objparentesco);
        return parentescoRepository.save(objparentesco);
    }



   @Override
    public ParentescoEntity delete(ParentescoEntity p) {
          ParentescoEntity objparentesco=parentescoRepository.getById(p.getCodigo());
        objparentesco.setEstado(false);
        return parentescoRepository.save(objparentesco);
    }
}
