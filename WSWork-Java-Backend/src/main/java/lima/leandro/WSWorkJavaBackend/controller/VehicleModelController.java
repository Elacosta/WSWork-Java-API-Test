package lima.leandro.WSWorkJavaBackend.controller;

import lima.leandro.WSWorkJavaBackend.model.VehicleModelEntity;
import lima.leandro.WSWorkJavaBackend.services.vehicleModelServices.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

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
     * @param vehicleModelEntity recebe um objeto
     * @return retorna o objeto salvo no banco de dados
     */
    @PostMapping()
    public ResponseEntity<VehicleModelEntity> save(@Valid @RequestBody VehicleModelEntity vehicleModelEntity){
        return new ResponseEntity<VehicleModelEntity>(
                this.vehicleModelSaveService.save(vehicleModelEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
                );
    }

    /**
     * @return retorna todos os objetos salvos no banco de dados
     */
    @GetMapping()
    public ResponseEntity<List<VehicleModelEntity>> findAll() {
        return new ResponseEntity<List<VehicleModelEntity>>(
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
    public ResponseEntity<Optional<VehicleModelEntity>> findById(@Valid @PathVariable("id") long id) {
        return new ResponseEntity<Optional<VehicleModelEntity>>(
                this.vehicleModelFindByIdService.findById(id),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    /**
     * @param vehicleModelEntity recebe um objeto para ser alterado no banco de dados
     * @return retorna o objeto após a alteraçao no banco de dados
     */
    @PutMapping()
    public ResponseEntity<VehicleModelEntity> update(@Valid @RequestBody VehicleModelEntity vehicleModelEntity) {
        return new ResponseEntity<VehicleModelEntity>(
                this.vehicleModelUpdateService.update(vehicleModelEntity),
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
