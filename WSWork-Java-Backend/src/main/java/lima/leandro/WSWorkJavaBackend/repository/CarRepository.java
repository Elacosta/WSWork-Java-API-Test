package lima.leandro.WSWorkJavaBackend.repository;

import lima.leandro.WSWorkJavaBackend.model.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface CarRepository extends JpaRepository<CarEntity, Long>{
}
