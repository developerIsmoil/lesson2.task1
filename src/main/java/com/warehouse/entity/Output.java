package com.warehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp date;
    private String facture_number;
    @Column(unique = true, nullable = false)
    private String code;
    @ManyToOne
    private Warehouse warehouse;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Currency currency;

}
