package com.example.telegrambotvac;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class VacanciesBot extends TelegramLongPollingBot {

    public VacanciesBot() {
        super("6186582783:AAE55TPEy57jbgbfkCia133IrYIZ9dlNsik");
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println("Event");
    }

    @Override
    public String getBotUsername() {
        return "Open positions java";
    }
}
