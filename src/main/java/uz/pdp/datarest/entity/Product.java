package uz.pdp.datarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @ManyToOne(optional = false)
    private Category category;

    @OneToOne(optional = false)
    private Attachment photo;

    private int code;

    @ManyToOne(optional = false)
    private Measurement measurement;

    @Column(nullable = false)
    private boolean active;

}
