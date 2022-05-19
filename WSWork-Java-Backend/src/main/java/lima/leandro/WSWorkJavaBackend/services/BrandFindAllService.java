package lima.leandro.WSWorkJavaBackend.services;

import lima.leandro.WSWorkJavaBackend.datasource.model.BrandEntity;
import lima.leandro.WSWorkJavaBackend.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandFindAllService {

    @Autowired
    private BrandRepository brandRepository;

    public List<BrandEntity> findAll() {
        return (List<BrandEntity>) this.brandRepository.findAll();
    }
}
