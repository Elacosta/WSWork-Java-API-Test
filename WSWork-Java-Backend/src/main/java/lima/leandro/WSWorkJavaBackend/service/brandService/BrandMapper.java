package lima.leandro.WSWorkJavaBackend.service.brandService;


import lima.leandro.WSWorkJavaBackend.dto.BrandDTO;
import lima.leandro.WSWorkJavaBackend.entity.BrandEntity;

/**
 * @author Leandro Lima
 * @since 20/05/2022
 * @version 1.0.0 Bumblebee
 */
public class BrandMapper {

    /**
     * @param brandEntity recebe um objeto entidade
     * @return retorna um objeto DTO
     */
    public static BrandDTO brandToDTO(BrandEntity brandEntity) {
        BrandDTO brandDTO = new BrandDTO();
        brandDTO.setBrandId(brandEntity.getBrandId());
        brandDTO.setBrandName(brandEntity.getBrandName());
        return brandDTO;
    }

    /**
     * @param brandDTO recebe um objeto DTO
     * @return retorna um objeto entidade
     */
    public static BrandEntity DTOToBrand(BrandDTO brandDTO) {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(brandDTO.getBrandId());
        brandEntity.setBrandName(brandDTO.getBrandName());
        return brandEntity;
    }
}
