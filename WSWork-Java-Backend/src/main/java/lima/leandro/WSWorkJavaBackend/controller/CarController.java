package lima.leandro.WSWorkJavaBackend.controller;

import lima.leandro.WSWorkJavaBackend.dto.CarDTO;
import lima.leandro.WSWorkJavaBackend.dto.CarEndPointDTO;
import lima.leandro.WSWorkJavaBackend.service.carService.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Leandro Lima
 * @since 20/05/2022
 * @version 1.0.0 Bumblebee
 */
@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarSaveService carSaveService;

    @Autowired
    private CarFindAllService carFindAllService;

    @Autowired
    private CarFindByIdService carFindByIdService;

    @Autowired
    private CarUpdateService carUpdateService;

    @Autowired
    private CarDeleteService carDeleteService;

    /**
     * @param carDTO Recebe um objeto DTO
     * @return retorna o objeto salvo no banco
     */
    @PostMapping
    public ResponseEntity<CarDTO> save(@RequestBody CarDTO carDTO) {
        return new ResponseEntity<CarDTO>(
                this.carSaveService.save(carDTO),
                new HttpHeaders(),
                HttpStatus.CREATED
        );
    }

    /**
     * @return retorna todos os objetos cadastrados nop banco
     */
    @GetMapping
    public ResponseEntity<List<CarDTO>> findAll() {
        return new ResponseEntity<List<CarDTO>>(
                this.carFindAllService.findAll(),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    /**
     * @param id recebe o id do objeto à ser selecionado no banco
     * @return retorna o objeto selecionado do banco
     */
    @GetMapping(path = "/{id}")
    public ResponseEntity<CarDTO> findById(@PathVariable("id") long id) {
        return new ResponseEntity<CarDTO>(
                this.carFindByIdService.findById(id),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    /**
     * @param carDTO recebe o objeto para ser atualizado no banco
     * @return retorna o objeto atualizado no banco
     */
    @PutMapping
    public ResponseEntity<CarDTO> update(@RequestBody CarDTO carDTO) {
        return new ResponseEntity<CarDTO>(
                this.carUpdateService.update(carDTO),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public boolean delete(@Valid @PathVariable("id") long id) {
        return this.carDeleteService.deleteById(id);
    }

}
