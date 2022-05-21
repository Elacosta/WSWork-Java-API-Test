package lima.leandro.WSWorkJavaBackend.dto;

import lombok.Data;

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
