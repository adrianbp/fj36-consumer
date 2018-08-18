package com.adriano.deusnocomando.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@Document(collection = "alunos")
public class Aluno {


    @Id
    private String id;
    private String nome;
    private String matricula;
    private Integer idade;
    private String  apelido;



}
