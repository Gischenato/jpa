package br.pucrs.engsoft2.banco.matricula;

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
