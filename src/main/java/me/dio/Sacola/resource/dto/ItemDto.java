package me.dio.Sacola.resource.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
@Embeddable

public class ItemDto {
    private Long produtoId;
    private int quantidade;
    private Long sacolaId;
}
