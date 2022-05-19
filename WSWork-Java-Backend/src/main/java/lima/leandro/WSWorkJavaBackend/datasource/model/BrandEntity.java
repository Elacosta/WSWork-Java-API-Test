package lima.leandro.WSWorkJavaBackend.datasource.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString

@Entity
@Table(name = "brand")
public class BrandEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private long brandId;

    @Column(name = "brand_name")
    private String brandName;

//    @OneToMany
//    private List<VehicleModelEntity> vehicleModelEntity;
}
