package lima.leandro.WSWorkJavaBackend.service.brandService;

import lima.leandro.WSWorkJavaBackend.dto.BrandDTO;
import lima.leandro.WSWorkJavaBackend.entity.BrandEntity;
import lima.leandro.WSWorkJavaBackend.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

/**
 * @author Leandro Lima
 * @since 19/05/2022
 * @version 1.0.0 Bumblebee
 */
@Service
public class BrandFindByIdService {
    @Autowired
    private BrandRepository brandRepository;

    /**
     * @param id recebe o id do objeto a ser procurado
     * @return retorna o objeto requisitado
     */
    public BrandDTO findById(long id) {
        Optional<BrandEntity> brandEntity = this.brandRepository.findById(id);
        return brandEntity
                .map(BrandMapper::brandToDTO)
                .orElse(null);
    }
}