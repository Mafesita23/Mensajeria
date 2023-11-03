package com.mensajeria.mensajeria.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "ciudades")
public class Ciudad extends Elemento {

}
