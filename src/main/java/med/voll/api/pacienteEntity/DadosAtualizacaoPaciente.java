package med.voll.api.pacienteEntity;

import jakarta.validation.Valid;

public record DadosAtualizacaoPaciente(Long id, String nome, String telefone,
		@Valid DadosAtualizacaoPaciente endereco) {

	}