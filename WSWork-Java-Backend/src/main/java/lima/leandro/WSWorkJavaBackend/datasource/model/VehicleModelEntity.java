package lima.leandro.WSWorkJavaBackend.datasource.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter

@Entity
@Table(name = "vehicle_model")
public class VehicleModelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vehicleModelId;

    @Column(name = "vehicle_model_name")
    private String vehicleModelName;

    @Column(name = "fipe_value")
    private int fipeValue;

//    @ManyToOne
//    private BrandEntity brandEntity;
}
