package lima.leandro.WSWorkJavaBackend.repository;

import lima.leandro.WSWorkJavaBackend.datasource.model.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<BrandEntity, Long> {
}
