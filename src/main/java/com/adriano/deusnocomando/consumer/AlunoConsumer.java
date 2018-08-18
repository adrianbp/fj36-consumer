package com.adriano.deusnocomando.consumer;

import com.adriano.deusnocomando.domain.Aluno;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AlunoConsumer {

    @RabbitListener(queues = "fila-aluno")
    public void leitoMensagens(Aluno aluno){

       log.info("lendo msg()", aluno);

    }
}
