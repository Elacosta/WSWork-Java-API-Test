package lima.leandro.WSWorkJavaBackend.entity;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * @author Leandro Lima
 * @since 19/05/2022
 * @version 1.0.0 Bumblebee
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString

@Component

@Entity
@Table(name = "brand")
public class BrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private long brandId;

    @Column(name = "brand_name")
    private String brandName;

}
