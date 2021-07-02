package uz.pdp.datarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Output {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Date date;

    @ManyToOne(optional = false)
    private  Warehouse warehouse;

    @ManyToOne(optional = false)
    private Currency currency;

    private String factureNumber;

    private int code;

    @ManyToOne(optional = false)
    private Client client;
}
