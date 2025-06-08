package br.com.alura.codechella;

import reactor.core.publisher.Flux;

import java.time.LocalDate;

public record EventoDto(Long id,
                        TipoEvento tipo,
                        String nome,
                        LocalDate data,
                        String descricao) {
    public static EventoDto toDto(Evento evento) {
        return new EventoDto(evento.getId(), evento.getTipo(), evento.getNOME(), evento.getData(), evento.getDescricao());
    }

    public Evento toEntity() {
        Evento evento = new Evento();
        evento.setId(this.id);
        evento.setTipo(this.tipo);
        evento.setNOME(this.nome());
        evento.setData(this.data());
        evento.setDescricao(this.descricao());
        return evento;
    }
}
