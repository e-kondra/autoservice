package com.autoservice.client;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClientEntity {
    @Id @GeneratedValue()
    private Long id;
    private String name;
    private String address;
    private TextArea comment;
    private Boolean isActive;
}
