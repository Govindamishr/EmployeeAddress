package com.geekster.govinda.EmployeeAddress.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String firstName;

    private String  lastName ;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn( name="fk_user_address-id")
    private Address address;

}
