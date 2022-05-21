package lima.leandro.WSWorkJavaBackend.service.brandService;

import lima.leandro.WSWorkJavaBackend.dto.BrandDTO;
import lima.leandro.WSWorkJavaBackend.entity.BrandEntity;
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
     * @param brandDTO recebe o objeto DTO para se tornar entidade
     * @return retorna o objeto salvo no banco
     */
    public BrandDTO save(BrandDTO brandDTO) {
        BrandEntity brandEntity = this.brandRepository.save(
                BrandMapper.DTOToBrand(brandDTO)
        );
        return BrandMapper.brandToDTO(brandEntity);
    }
}
