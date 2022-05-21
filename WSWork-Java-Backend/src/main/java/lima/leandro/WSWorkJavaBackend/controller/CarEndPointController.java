package lima.leandro.WSWorkJavaBackend.controller;

import lima.leandro.WSWorkJavaBackend.dto.CarDTO;
import lima.leandro.WSWorkJavaBackend.dto.CarEndPointDTO;
import lima.leandro.WSWorkJavaBackend.service.carService.CarEndPointFindAllService;
import lima.leandro.WSWorkJavaBackend.service.carService.CarEndPointFindByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Leandro Lima
 * @since 21/05/2022
 * @version 1.0.0 Bumblebee
 */
@RestController
@RequestMapping("/cars/showAll")
public class CarEndPointController {

    @Autowired
    private CarEndPointFindByIdService carEndPointFindByIdService;

    @Autowired
    private CarEndPointFindAllService carEndPointFindAllService;

    /**
     * @param id recebe o id do objeto para ser pêgo do banco
     * @return retorna um objeto do banco de dados
     */
    @GetMapping(path = "/{id}")
    public ResponseEntity<CarEndPointDTO> findById(@PathVariable long id) {
        return new ResponseEntity<CarEndPointDTO>(
                this.carEndPointFindByIdService.findById(id),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    /**
     * @return retorna uma lista dos objetos no banco de dados
     */
    @GetMapping
    public ResponseEntity<List<CarEndPointDTO>> findAll() {
        return new ResponseEntity<List<CarEndPointDTO>>(
                this.carEndPointFindAllService.findAll(),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

}
