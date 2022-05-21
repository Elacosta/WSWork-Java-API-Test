package lima.leandro.WSWorkJavaBackend.dto;


import lombok.Data;

/**
 * @author Leandro Lima
 * @since 20/05/2022
 * @version 1.0.0 Bumblebee
 */
@Data
public class VehicleModelDTO {

    public long vehicleModelId;
    public String vehicleModelName;
    public int fipeValue;
    public long brandId;

}
