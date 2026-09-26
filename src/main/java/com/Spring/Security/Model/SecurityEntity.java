package com.Spring.Security.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="security_entity")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SecurityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String password;


}

