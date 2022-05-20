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
public class BrandSaveService {

    @Autowired
    private BrandRepository brandRepository;

    /**
     * @param brandEntity recebe o objeto para ser salvo
     * @return retorna o objeto salvo na tabela do banco, caso não dê certo, retorna nulo
     */
    public BrandEntity save(BrandEntity brandEntity) {
        if (brandEntity.getBrandName().length()>3) {
            return this.brandRepository.save(brandEntity);
        }
        return null;
    }
}
