package me.dio.Sacola.service;

import me.dio.Sacola.model.Item;
import me.dio.Sacola.model.Sacola;
import me.dio.Sacola.resource.dto.ItemDto;

public interface SacolaService {
    Item incluirItemNaSacola(ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);
}
