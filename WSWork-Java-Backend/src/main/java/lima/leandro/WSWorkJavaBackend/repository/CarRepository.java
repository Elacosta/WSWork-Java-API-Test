package lima.leandro.WSWorkJavaBackend.repository;

import lima.leandro.WSWorkJavaBackend.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leandro Lima
 * @since 20/05/2022
 * @version 1.0.0 Bumblebee
 */
@RestController
public interface CarRepository extends JpaRepository<CarEntity, Long>{
}
