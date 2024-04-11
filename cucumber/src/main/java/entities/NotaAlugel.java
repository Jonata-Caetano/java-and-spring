package entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class NotaAlugel {

    private int preco;
    private LocalDate dataEntrega;
    private int pontuacao;
}
