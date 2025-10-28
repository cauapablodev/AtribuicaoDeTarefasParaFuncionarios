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
    @Column(name = "tarefa_id")
    private long id;
    @Column(name = "tarefa_nome")
    private String nome;
    @Column(name = "tarefa_cargo")
    private String cargo;
    @Column(name = "tarefa_dataEntrega")
    private LocalDate dataEntrega;
    @Column(name = "tarefa_descricao")
    private String descricao;

    @ManyToMany(mappedBy = "tarefas")
    private List<FuncionarioModel> funcionario;


}
