package lima.leandro.WSWorkJavaBackend.controller;

import lima.leandro.WSWorkJavaBackend.dto.VehicleModelDTO;
import lima.leandro.WSWorkJavaBackend.service.vehicleModelService.*;
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
@RequestMapping("/vehiclemodels")
public class VehicleModelController {

    @Autowired
    private VehicleModelSaveService vehicleModelSaveService;

    @Autowired
    private VehicleModelFindAllService vehicleModelFindAllService;

    @Autowired
    private VehicleModelFindByIdService vehicleModelFindByIdService;

    @Autowired
    private VehicleModelUpdateService vehicleModelUpdateService;

    @Autowired
    private VehicleModelDeleteService vehicleModelDeleteService;

    /**
     * @param vehicleModelDTO Recebe um objeto DTO
     * @return retorna um objeto que foi salvo no banco
     */
    @PostMapping()
    public ResponseEntity<VehicleModelDTO> save(@Valid @RequestBody VehicleModelDTO vehicleModelDTO){
        return new ResponseEntity<VehicleModelDTO>(
                this.vehicleModelSaveService.save(vehicleModelDTO),
                new HttpHeaders(),
                HttpStatus.CREATED
        );
    }

    /**
     * @return retorna todos os objetos salvos no banco de dados
     */
    @GetMapping()
    public ResponseEntity<List<VehicleModelDTO>> findAll() {
        return new ResponseEntity<List<VehicleModelDTO>>(
                this.vehicleModelFindAllService.findAll(),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    /**
     * @param id recebe o id do objeto para ser puxado do banco de dados
     * @return retorna o objeto selecionado do banco de dados
     */
    @GetMapping(path = "/{id}")
    public ResponseEntity <VehicleModelDTO> findById(@Valid @PathVariable("id") long id) {
        return new ResponseEntity<VehicleModelDTO>(
                this.vehicleModelFindByIdService.findById(id),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    /**
     * @param vehicleModelDTO recebe um objeto DTO
     * @return retorna um objeto atualizado do banco
     */
    @PutMapping()
    public ResponseEntity<VehicleModelDTO> update(@Valid @RequestBody VehicleModelDTO vehicleModelDTO) {
        return new ResponseEntity<VehicleModelDTO>(
                this.vehicleModelUpdateService.update(vehicleModelDTO),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    /**
     * @param id recebe o id do objeto a ser deletado no banco de dados
     * @return retorna true caso haja sucesso ao deletar e false caso ocorra falha
     */
    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public boolean delete(@Valid @PathVariable("id") long id) {
        return this.vehicleModelDeleteService.deleteById(id);
    }

}
