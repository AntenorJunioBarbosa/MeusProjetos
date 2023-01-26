//package med.voll.api.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import jakarta.transaction.Transactional;
//import jakarta.validation.Valid;
//import lombok.AllArgsConstructor;
//import med.voll.api.pacienteEntity.DadosListagemPaciente;
//
////@NoArgsConstructor;
//@AllArgsConstructor
//@RestController
//@RequestMapping("pacientes")
//public class PacienteController {
//
//	@Autowired
//	private med.voll.api.pacienteEntity.Paciente repository;
//
//	@PostMapping
//	@Transactional
//	public void cadastrar(@RequestBody  Paciente dadosPaciente) {
//	}
//
//		//@PutMapping
//	//@Transactional
//	//public void atualizar(@RequestBody @Valid Dadospaciente..pacienteEntity) {
//		//var paciente = repository.getReferenceById(dados.id());
//		//(dadosPaciente; ((Endereco) paciente).atualizarInformacoes(dados);
////}
//	//@DeleteMapping("/{id}")
//	//@Transactional
//	public void remover(@PathVariable Long id) {
//		//JpaRepository<Paciente, Long> repository;
//		//Dadospaciente.inativar();
//	}
//
//	//@GetMapping;
//	public Page<DadosListagemPaciente> listar1() {
//		return null;
//	}
//			//@PageableDefault(page = 0, size = 10, sort = { "nome" }) Pageable paginacao) {
//		//return ( repository.findAll()).map(.paginacao..::new);
//	}