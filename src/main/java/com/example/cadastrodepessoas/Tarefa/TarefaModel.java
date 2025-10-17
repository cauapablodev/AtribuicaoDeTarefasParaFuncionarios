package com.example.cadastrodepessoas.Tarefa;

import com.example.cadastrodepessoas.Funcionario.FuncionarioModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_tarefa")
public class TarefaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cargo;
    private LocalDate dataEntrega;
    private String descricao;

    @ManyToMany(mappedBy = "tarefas")
    private List<FuncionarioModel> funcionario;


}
