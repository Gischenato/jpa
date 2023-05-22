package br.pucrs.engsoft2.banco.consulta_de_turma;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegisterStudentDTO {
    public long student_id;
    public long discipline_id;
}
