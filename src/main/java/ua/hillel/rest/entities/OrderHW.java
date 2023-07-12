package ua.hillel.rest.entities;

import lombok.Data;

@Data
public class OrderHW {
    private Long id;
    private Long petId;
    private Integer quantity;
    private String shipDate;
    private String status;
    private Boolean complete;
}

