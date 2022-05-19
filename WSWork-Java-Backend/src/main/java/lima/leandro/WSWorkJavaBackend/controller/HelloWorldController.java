package lima.leandro.WSWorkJavaBackend.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<String>(
                "Bem-vind# à minha API!",
                new HttpHeaders(),
                HttpStatus.OK
        );
    }
}
