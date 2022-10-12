package ar.edu.unq.criptop2p.webservice;

import ar.edu.unq.criptop2p.model.dto.CotizacionDTO;
import ar.edu.unq.criptop2p.model.dto.IntencionDTO;
import ar.edu.unq.criptop2p.service.interfaces.ICotizacionService;
import ar.edu.unq.criptop2p.service.interfaces.IIntencionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cotizacion")
public class CotizacionController {
    @Autowired
    private ICotizacionService cotizacionService;

    @GetMapping("/cotizaciones")
    public ResponseEntity<List<CotizacionDTO>> intenciones(){
        return  new ResponseEntity<>(cotizacionService.getCotizaciones(),HttpStatus.OK);
    }
}
