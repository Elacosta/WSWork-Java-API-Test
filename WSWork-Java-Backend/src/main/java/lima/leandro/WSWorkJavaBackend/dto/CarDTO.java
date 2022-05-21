package lima.leandro.WSWorkJavaBackend.dto;

import lombok.Data;

/**
 * @author Leandro Lima
 * @since 20/05/2022
 * @version 1.0.0 Bumblebee
 */
@Data
public class CarDTO {

    public long carId;
    public int timestampRegister;
    public String typeOfFuel;
    public int carYear;
    public int doorNumber;
    public String carColor;
    public long vehicleModelId;
    public long brandId;

}
