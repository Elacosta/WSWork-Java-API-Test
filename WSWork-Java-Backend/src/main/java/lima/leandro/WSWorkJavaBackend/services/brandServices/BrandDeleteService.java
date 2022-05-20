package lima.leandro.WSWorkJavaBackend.services.brandServices;

import lima.leandro.WSWorkJavaBackend.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Leandro Lima
 * @since 19/05/2022
 * @version 1.0.0 Bumblebee
 */
@Service
public class BrandDeleteService {

    @Autowired
    private BrandRepository brandRepository;

    /**
     * @param id recebe o id do objeto para ser deletado
     * @return retorna true caso seja deletado com sucesso ou false para falha ao deletar.
     */
    public boolean deleteById(long id) {
        if (this.brandRepository.existsById(id)) {
            this.brandRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
