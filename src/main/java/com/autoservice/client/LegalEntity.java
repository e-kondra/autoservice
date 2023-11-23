package com.autoservice.client;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LegalEntity extends ClientEntity{
    private String pvm;
    private String entityCode;
    private String entityRepresentative;

}
