
package pe.com.apiescuelanueva.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.entity.DistritoEntity;
import pe.com.apiescuelanueva.repository.DistritoRepository;
//permite definir la clase como un servicio
@Service
public class DistritoServiceImpl implements DistritoService{

    @Autowired
    private DistritoRepository distritoRepository;     

     @Override
    public List<DistritoEntity> findAll() {
       return distritoRepository.findAll();
    }



   @Override
    public List<DistritoEntity> findAllCustom() {
        return distritoRepository.findAllCustom();
     }



   @Override
    public Optional<DistritoEntity> findById(Long id) {
        return distritoRepository.findById(id);
    }



   @Override
    public DistritoEntity add(DistritoEntity d) {
        return distritoRepository.save(d);
    }



   @Override
    public DistritoEntity update(DistritoEntity d) {
        DistritoEntity objdistrito=distritoRepository.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objdistrito);
        return distritoRepository.save(objdistrito);
         
    }



   @Override
    public DistritoEntity delete(DistritoEntity d) {
       DistritoEntity objdistrito=distritoRepository.getById(d.getCodigo());
       objdistrito.setEstado(false);
       return distritoRepository.save(objdistrito);
    }
    

}
