package br.pucrs.engsoft2.banco.consulta_de_disciplinas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FindStudentInClassDTO {
    private String classCode;
    private String turma;
}
