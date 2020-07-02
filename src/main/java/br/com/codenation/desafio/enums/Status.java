package br.com.codenation.desafio.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public enum Status {

    ARQUIVADO("Arquivado"),
    ATIVO("Ativo"),
    EXCLUIDO("Excluído");

    private String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
