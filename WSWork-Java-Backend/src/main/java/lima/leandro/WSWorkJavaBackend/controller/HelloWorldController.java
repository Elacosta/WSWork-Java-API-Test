package lima.leandro.WSWorkJavaBackend.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leandro Lima
 * @since 20/05/2022
 * @version 1.0.0 Bumblebee
 */
@RestController
public class HelloWorldController {

    /**
     * @return retorna uma String com boas vindas.
     */
    @GetMapping("/")
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<String>(
                "Bem-vind# à minha API!",
                new HttpHeaders(),
                HttpStatus.OK
        );
    }
}
