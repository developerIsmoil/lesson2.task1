package com.warehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean active = true;
    private String code;
    @ManyToOne(optional = false)
    private Category category;
    @OneToOne
    private Attachment attachment;
    @ManyToOne(optional = false)
    private Measurement measurement;
}
