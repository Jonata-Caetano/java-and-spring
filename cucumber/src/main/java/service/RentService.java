package service;

import entities.Movie;
import entities.NotaAlugel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class RentService {
    public NotaAlugel rent(Movie movie, String tipoAluguel) {
        if (movie.getEstoque() == 0) throw new RuntimeException("Filme sem estoque");
        NotaAlugel notaAlugel = new NotaAlugel();
        if ("extendido".equals(tipoAluguel)) {
            notaAlugel.setPreco(movie.getAluguel() * 2);
            notaAlugel.setDataEntrega(LocalDate.now().plusDays(3));
            notaAlugel.setPontuacao(2);

        } else {
            notaAlugel.setPreco(movie.getAluguel());
            notaAlugel.setDataEntrega(LocalDate.now().plusDays(1));
            notaAlugel.setPontuacao(1);
        }
        movie.setEstoque(movie.getEstoque() - 1);
        return notaAlugel;
    }
}
