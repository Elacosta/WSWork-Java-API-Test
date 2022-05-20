package lima.leandro.WSWorkJavaBackend.services.brandServices;

import lima.leandro.WSWorkJavaBackend.model.BrandEntity;
import lima.leandro.WSWorkJavaBackend.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Leandro Lima
 * @since 20/05/2022
 * @version 1.0.0 Bumblebee
 */
@Service
public class BrandFindAllService {

    @Autowired
    private BrandRepository brandRepository;

    /**
     * @return retorna todos os objetos listados
     */
    public List<BrandEntity> findAll() {
        return (List<BrandEntity>) this.brandRepository.findAll();
    }
}
