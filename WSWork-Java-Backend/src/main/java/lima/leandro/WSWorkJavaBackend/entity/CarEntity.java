package lima.leandro.WSWorkJavaBackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * @author Leandro Lima
 * @since 20/05/2022
 * @version 1.0.0 Bumblebee
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Component

@Entity
@Table(name = "car")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private long carId;

    @Column(name = "timestamp_register")
    private int timestampRegister;

    @Column(name = "car_year")
    private int carYear;

    @Column(name = "type_of_fuel")
    private String typeOfFuel;

    @Column(name = "door_number")
    private int doorNumber;

    @Column(name = "car_color")
    private String carColor;

    @ManyToOne
    @JoinColumn(name = "vehicle_model_fk", foreignKey = @ForeignKey(name = "vehicle_model_fk"))
    private VehicleModelEntity vehicleModelEntity;

    @ManyToOne
    @JoinColumn(name = "brand_fk", foreignKey = @ForeignKey(name = "brand_fk"))
    private BrandEntity brandEntity;

}
