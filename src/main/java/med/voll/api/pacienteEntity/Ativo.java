package med.voll.api.pacienteEntity;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record Ativo(@NotNull Long id, String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
}
