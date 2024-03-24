package org.example.springai;

import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.ai.openai.api.OpenAiApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringaiGeneralApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringaiGeneralApplication.class, args);
    }

    @Autowired
    private ChatClient chatClient;

    public void run(String... args) throws Exception {

        String string = chatClient.call("Hello, world!");
        System.out.println(string);
    }

}
