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
    public NotaAlugel rent(Movie movie) {
        NotaAlugel notaAlugel = new NotaAlugel();
        notaAlugel.setPreco(movie.getAluguel());
        notaAlugel.setDataEntrega(LocalDate.now().plusDays(1));
        movie.setEstoque(movie.getEstoque()-1);
        return notaAlugel;
    }
}
