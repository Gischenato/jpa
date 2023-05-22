package br.pucrs.engsoft2.banco.consulta_de_disciplinas;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engsoft2.banco.beans.Discipline;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class DisciplineConsultController {
    private final DisciplineConsultService disciplineConsultService;

	@GetMapping("/discipline/all")
	public List<Discipline> getAllDisciplines() {
		return this.disciplineConsultService.findAll();
	}

}
