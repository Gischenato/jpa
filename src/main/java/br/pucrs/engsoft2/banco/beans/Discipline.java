package br.pucrs.engsoft2.banco.beans;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Discipline {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String code;

    @Column(nullable = false)
    String description;
    
    @Column(nullable = false)
    String classCode;

    // @ManyToMany
    // @JoinTable(name = "student_discipline")
    // @JoinColumns({
    //     @JoinColumn(name = "student_registration_number", referencedColumnName = "registrationNumber"),
    //     @JoinColumn(name = "discipline_code", referencedColumnName = "code")
    // })
    // List<Student> students;
}