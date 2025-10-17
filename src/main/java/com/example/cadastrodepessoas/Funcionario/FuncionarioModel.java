package com.example.cadastrodepessoas.Funcionario;

import com.example.cadastrodepessoas.Tarefa.TarefaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cadastro")
public class FuncionarioModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cargo;
    private LocalDate dataNascimento;
    private int idade;
    private String cpf;
    private String telefone;

    @ManyToMany(mappedBy = "tarefa")
    @JoinColumn(name = "tarefa_id")
    private List<TarefaModel> tarefa;


}
