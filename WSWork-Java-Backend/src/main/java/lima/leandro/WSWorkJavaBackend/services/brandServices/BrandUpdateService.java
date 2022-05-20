package lima.leandro.WSWorkJavaBackend.services.brandServices;

import lima.leandro.WSWorkJavaBackend.model.BrandEntity;
import lima.leandro.WSWorkJavaBackend.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Leandro Lima
 * @since 19/05/2022
 * @version 1.0.0 Bumblebee
 */
@Service
public class BrandUpdateService {
    @Autowired
    private BrandRepository brandRepository;

    /**
     * @param brandEntity recebe o objeto para receber o update
     * @return caso o objeto ja exista, ele será atualizado, senão, voltará nulo
     */
    public BrandEntity update(BrandEntity brandEntity) {
        if (brandRepository.existsById(brandEntity.getBrandId())) {
            return this.brandRepository.save(brandEntity);
        }
        return null;
    }

}
