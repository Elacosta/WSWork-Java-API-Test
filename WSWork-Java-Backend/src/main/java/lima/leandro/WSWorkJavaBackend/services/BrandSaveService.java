package lima.leandro.WSWorkJavaBackend.services;

import lima.leandro.WSWorkJavaBackend.datasource.model.BrandEntity;
import lima.leandro.WSWorkJavaBackend.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandSaveService {

    @Autowired
    private BrandRepository brandRepository;

    public BrandEntity save(BrandEntity brandEntity) {
        if (brandEntity.getBrandName().length()>3) {
            return this.brandRepository.save(brandEntity);
        }
        return null;
    }
}
