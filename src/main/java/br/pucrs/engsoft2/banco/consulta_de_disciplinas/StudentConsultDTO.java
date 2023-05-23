package br.pucrs.engsoft2.banco.consulta_de_disciplinas;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class StudentConsultDTO {
    String name;
    long registrationNumber;
}
