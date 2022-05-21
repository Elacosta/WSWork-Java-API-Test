package lima.leandro.WSWorkJavaBackend.repository;

import lima.leandro.WSWorkJavaBackend.entity.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Leandro Lima
 * @since 19/05/2022
 * @version 1.0.0 Bumblebee
 */
public interface BrandRepository extends JpaRepository<BrandEntity, Long> {
}
