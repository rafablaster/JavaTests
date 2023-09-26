package br.edu.unifalmg.domain;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Chore {
    private String description;
    private Boolean isCompleted;
    private LocalDate deadLine;
}
