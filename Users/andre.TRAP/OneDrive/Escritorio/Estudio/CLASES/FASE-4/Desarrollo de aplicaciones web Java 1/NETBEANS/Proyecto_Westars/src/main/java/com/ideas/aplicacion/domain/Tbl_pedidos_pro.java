package com.ideas.aplicacion.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import lombok.Data;

@Data
@Entity
public class Tbl_pedidos_pro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idtbl_pedidos_pro; 
    private LocalDate Fecha_del_pedido;
    private String Tipo_de_tela;
    private String    Color;
    private int     Cantidad;
    private String    Ancho;
    private String    Largo;
   //@ManyToOne                                       //Relación de muchos a uno
   // private Empleado empleado;
    
}

