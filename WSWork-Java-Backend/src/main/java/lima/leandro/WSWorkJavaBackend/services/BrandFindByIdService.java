package lima.leandro.WSWorkJavaBackend.services;

import lima.leandro.WSWorkJavaBackend.datasource.model.BrandEntity;
import lima.leandro.WSWorkJavaBackend.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class BrandFindByIdService {
    @Autowired
    private BrandRepository brandRepository;

    public Optional<BrandEntity> findById(long id) {
        return this.brandRepository.findById(id);
    }
}