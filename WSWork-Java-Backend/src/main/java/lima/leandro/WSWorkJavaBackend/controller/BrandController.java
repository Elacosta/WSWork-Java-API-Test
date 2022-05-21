package lima.leandro.WSWorkJavaBackend.controller;

import lima.leandro.WSWorkJavaBackend.dto.BrandDTO;
import lima.leandro.WSWorkJavaBackend.repository.BrandRepository;
import lima.leandro.WSWorkJavaBackend.service.brandService.*;
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


    /**
     * @param id recebe o id do objeto para ser deletado
     * @return retorna true caso seja bem sucedido, senão, retorna false para errado
     */
    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public boolean delete(@Valid @PathVariable("id") long id) {
        return this.brandDeleteService.deleteById(id);
    }

    /**
     * @param brandDTO recebe um objeto DTO
     * @return retorna o objeto atualizado no banco
     */
    @PutMapping
    public ResponseEntity<BrandDTO> update(@RequestBody BrandDTO brandDTO) {
        return new ResponseEntity<BrandDTO>(
                this.brandUpdateService.update(brandDTO),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    /**
     * @param id Recebe o id do objeto para buscar no banco
     * @return retorna o objeto solicitado
     */
    @GetMapping(path = "/{id}")
    public ResponseEntity<BrandDTO> findById(@PathVariable("id") long id) {
        return new ResponseEntity<BrandDTO>(
                this.brandFindByIdService.findById(id),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    /**
     * @return retorna a lista de todos os objetos
     */
    @GetMapping
    public ResponseEntity<List<BrandDTO>> findAll() {
        return new ResponseEntity<List<BrandDTO>>(
                this.brandFindAllService.findAll(),
                new HttpHeaders(),
                HttpStatus.OK
        );
    }

    /**
     * @param brandDTO Recebe um objeto DTO
     * @return retorna o objeto que foi salvo no banco
     */
    @PostMapping
    public ResponseEntity<BrandDTO> save(@RequestBody BrandDTO brandDTO) {
        return new ResponseEntity<BrandDTO>(
                this.brandSaveService.save(brandDTO),
                new HttpHeaders(),
                HttpStatus.CREATED
        );
    }
}
