package med.voll.api.pacienteEntity;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
//	Page<Paciente> findAllByAtivoTrue(Pageable paginacao);
}