package lima.leandro.WSWorkJavaBackend.controller;

import lima.leandro.WSWorkJavaBackend.model.BrandEntity;
import lima.leandro.WSWorkJavaBackend.repository.BrandRepository;
import lima.leandro.WSWorkJavaBackend.services.brandServices.*;
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
@RequestMapping("/brands")
public class BrandController {

    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private BrandDeleteService brandDeleteService;

    @Autowired
    private BrandFindAllService brandFindAllService;

    @Autowired
    private BrandFindByIdService brandFindByIdService;

    @Autowired
    private BrandSaveService brandSaveService;

    @Autowired
    private BrandUpdateService brandUpdateService;


    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public boolean delete(@Valid @PathVariable("id") long id) {
        return this.brandDeleteService.deleteById(id);
    }

    @PutMapping()
    public ResponseEntity<BrandEntity> update(@RequestBody BrandEntity brandEntity) {
        return new ResponseEntity<BrandEntity>(
                this.brandUpdateService.update(brandEntity),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<BrandEntity>> findById(@PathVariable("id") long id) {
        return new ResponseEntity<Optional<BrandEntity>>(
                this.brandFindByIdService.findById(id),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    @GetMapping()
    public ResponseEntity<List<BrandEntity>> findAll() {
        return new ResponseEntity<List<BrandEntity>>(
                this.brandFindAllService.findAll(),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    @PostMapping()
    public ResponseEntity<BrandEntity> save(@RequestBody BrandEntity brandEntity) {
        return new ResponseEntity<BrandEntity>(
                this.brandSaveService.save(brandEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );
    }
}
