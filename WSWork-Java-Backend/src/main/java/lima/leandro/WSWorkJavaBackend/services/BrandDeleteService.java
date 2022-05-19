package lima.leandro.WSWorkJavaBackend.services;

import lima.leandro.WSWorkJavaBackend.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandDeleteService {
    @Autowired
    private BrandRepository brandRepository;

    public boolean deleteById(long id) {
        if (this.brandRepository.existsById(id)) {
            this.brandRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
