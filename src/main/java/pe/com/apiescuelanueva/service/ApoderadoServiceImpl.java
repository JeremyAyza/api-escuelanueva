
package pe.com.apiescuelanueva.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.entity.ApoderadoEntity;
import pe.com.apiescuelanueva.repository.ApoderadoRepository;
//permite definir la clase como un servicio
@Service
public class ApoderadoServiceImpl implements ApoderadoService{

    @Autowired
    private ApoderadoRepository apoderadoRepository; 
    
    @Override
    public List<ApoderadoEntity> findAll() {
        return apoderadoRepository.findAll();
    }



   @Override
    public List<ApoderadoEntity> findAllCustom() {
        return apoderadoRepository.findAllCustom();
    }



   @Override
    public Optional<ApoderadoEntity> findById(Long id) {
        return apoderadoRepository.findById(id);

    }

   @Override
    public ApoderadoEntity add(ApoderadoEntity a) {
        return apoderadoRepository.save(a);

   }

   @Override
    public ApoderadoEntity update(ApoderadoEntity a) {
         ApoderadoEntity objapoderado=apoderadoRepository.getById(a.getCodigo());
        BeanUtils.copyProperties(a, objapoderado);
        return apoderadoRepository.save(objapoderado);
    }



   @Override
    public ApoderadoEntity delete(ApoderadoEntity a) {
     ApoderadoEntity objapoderado=apoderadoRepository.getById(a.getCodigo());
       objapoderado.setEstado(false);
       return apoderadoRepository.save(objapoderado);
    }
}
