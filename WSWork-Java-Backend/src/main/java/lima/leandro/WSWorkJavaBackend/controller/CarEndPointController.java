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

@RestController
@RequestMapping("/cars/showAll")
public class CarEndPointController {

    @Autowired
    private CarEndPointFindByIdService carEndPointFindByIdService;

    @Autowired
    private CarEndPointFindAllService carEndPointFindAllService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<CarEndPointDTO> findById(@PathVariable long id) {
        return new ResponseEntity<CarEndPointDTO>(
                this.carEndPointFindByIdService.findById(id),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    @GetMapping
    public ResponseEntity<List<CarEndPointDTO>> findAll() {
        return new ResponseEntity<List<CarEndPointDTO>>(
                this.carEndPointFindAllService.findAll(),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

}
