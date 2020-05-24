package com.giovannottix.petclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Giovanni Esposito.
 *
 * @since : 05/03/20, Sun
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "birth_day")
    private LocalDate birthDate;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType type;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<Visit> visits = new HashSet<>();

    @Builder
    public Pet(Long id, String name, LocalDate birthDate, PetType type,
               Owner owner, Set<Visit> visits) {
        super(id);
        this.name = name;
        this.birthDate = birthDate;
        this.type = type;
        this.owner = owner;

        if (visits != null) {
            this.visits = visits;
        }
    }

}
