package me.dio.Sacola.resource;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import me.dio.Sacola.model.Item;
import me.dio.Sacola.model.Sacola;
import me.dio.Sacola.resource.dto.ItemDto;
import me.dio.Sacola.service.SacolaService;
import org.springframework.web.bind.annotation.*;

@Api(value="ifood-devweek/sacolas")

@RestController
@RequestMapping("ifood-devweek/sacolas")
@RequiredArgsConstructor
public class SacolaResource {
    private final SacolaService sacolaService;

    @PostMapping
    public Item incluirItemNaSacola(@RequestBody ItemDto itemDto) {
        return sacolaService.incluirItemNaSacola(itemDto);
    }

    @GetMapping("/{id}")
    public Sacola verSacola(@PathVariable("id") Long Id){
        return sacolaService.verSacola(Id);
    }

    @PatchMapping("/fecharSacola/{sacolaId}")
    public Sacola fecharSacola(@PathVariable("sacolaId") Long sacolaId,
                               @RequestParam("formaPagamento") int formaPagamento){
        return sacolaService.fecharSacola(sacolaId, formaPagamento);
    }
}
