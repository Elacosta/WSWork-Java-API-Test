package lima.leandro.WSWorkJavaBackend.service.brandService;

import lima.leandro.WSWorkJavaBackend.dto.BrandDTO;
import lima.leandro.WSWorkJavaBackend.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<BrandDTO> findAll() {
    return this.brandRepository.findAll()
            .stream()
            .map(BrandMapper::brandToDTO)
            .collect(Collectors.toList());
    }
}
