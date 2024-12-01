package br.com.loginauth.domain.entities;

import br.com.loginauth.domain.enums.EvaluationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentCpf;
    private Long disciplineId;
    private Double evaluation;
    private EvaluationType evaluationType;
    private LocalDateTime evaluationDate;
}
