package lima.leandro.WSWorkJavaBackend.entity;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * @author Leandro Lima
 * @since 19/05/2022
 * @version 1.0.0 Bumblebee
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter

@Component

@Entity
@Table(name = "vehicle_model")
public class VehicleModelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_model_id")
    private long vehicleModelId;

    @Column(name = "vehicle_model_name")
    private String vehicleModelName;

    @Column(name = "fipe_value")
    private int fipeValue;

    @ManyToOne
    @JoinColumn(name = "brand_fk", foreignKey = @ForeignKey(name = "brand_fk"))
    private BrandEntity brandEntity;


}
