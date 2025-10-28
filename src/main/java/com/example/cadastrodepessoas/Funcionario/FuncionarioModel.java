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
    @Column(name = "funcionario_id")
    private long id;
    @Column(name = "funcionario_nome")
    private String nome;
    @Column(name = "funcionario_cargo")
    private String cargo;
    @Column(name = "funcionario_dataNascimento")
    private LocalDate dataNascimento;
    @Column(name = "funcionario_idade")
    private int idade;
    @Column(name = "funcionario_cpf", unique = true)
    private String cpf;
    @Column(name = "funcionario_telefone", unique = true)
    private String telefone;

    @ManyToMany(mappedBy = "tarefa")
    @JoinColumn(name = "tarefa_id")
    private List<TarefaModel> tarefa;


}
