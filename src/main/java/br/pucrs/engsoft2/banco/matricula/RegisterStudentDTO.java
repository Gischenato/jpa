package br.pucrs.engsoft2.banco.matricula;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegisterStudentDTO {
    public long student_matricula;
    public String discipline_code;
    public String turma;
}
