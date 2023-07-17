package com.hust.productionmove.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hust.productionmove.validator.RoleConstraint;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "units")
@Entity
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "Unit type cannot be null")
    @NotEmpty(message = "Unit type cannot be empty")
    @RoleConstraint
    @Column(nullable = false)
    private String type;

    @JsonIgnore
    @ToString.Exclude
    @OneToOne(mappedBy = "unit", cascade = CascadeType.ALL)
    private Factory factory;

    @JsonIgnore
    @ToString.Exclude
    @OneToOne(mappedBy = "unit", cascade = CascadeType.ALL)
    private Distributor distributor;

    @JsonIgnore
    @ToString.Exclude
    @OneToOne(mappedBy = "unit", cascade = CascadeType.ALL)
    private WarrantyCenter warrantyCenter;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "unit", cascade = CascadeType.ALL)
    private List<User> users;
}
