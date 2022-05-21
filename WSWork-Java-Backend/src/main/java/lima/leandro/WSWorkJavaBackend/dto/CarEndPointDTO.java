package lima.leandro.WSWorkJavaBackend.dto;

import lombok.Data;

/**
 * @author Leandro Lima
 * @since 21/05/2022
 * @version 1.0.0 Bumblebee
 */
@Data
public class CarEndPointDTO {

    public long carId;
    public long brandId;
    public String brandName;
    public String vehicleModelName;
    public int carYear;
    public String typeOfFuel;
    public int doorNumber;
    public int fipeValue;
    public String carColor;
    public int timestampRegister;

}
