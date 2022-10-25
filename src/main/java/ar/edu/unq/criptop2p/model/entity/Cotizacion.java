package ar.edu.unq.criptop2p.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Cotizaciones")
public class Cotizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private long id;
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private CriptoMoneda criptoactivo;
    private double price;
    private Date fechaYHoraDeCotizacion;
    @Override
    public String toString(){
        return "Cotizacion";
    }
}
