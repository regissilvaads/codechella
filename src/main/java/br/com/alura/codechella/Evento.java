package br.com.alura.codechella;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Getter
@Setter
@Table("eventos")
public class Evento {
    @Id
    private Long id;

    private TipoEvento tipo;

    private String NOME;
    private LocalDate data;
    private String descricao;
}
