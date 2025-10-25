package dev.ia;

import io.quarkiverse.langchain4j.RegisterAiService;

// essa anotação instrui o Quarkus a gerar uma implementação desta interface que se conecta ao LLM configurado
@RegisterAiService
public interface TravelAgentAssistent {
    /* o metodo chat recebe recebe a mensagem do user e retorna a resposta do LLM
    * @param userMessage A mensagem do user
    * @return A resposta gerada pelo modelo de linguagem
     */
    String chat(String userMessage);
}
