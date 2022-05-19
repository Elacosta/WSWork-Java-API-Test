package lima.leandro.WSWorkJavaBackend.services;

import lima.leandro.WSWorkJavaBackend.datasource.model.BrandEntity;
import lima.leandro.WSWorkJavaBackend.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandUpdateService {
    @Autowired
    private BrandRepository brandRepository;

    public BrandEntity update(BrandEntity brandEntity) {
        return this.brandRepository.save(brandEntity);
    }

}
