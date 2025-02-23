package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

    MyBotService myBotService=new MyBotService();

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String text = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();



            if (text.equals("/start")){
                try {
                    execute(myBotService.start(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Map")){
                try {
                    execute(myBotService.region(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Sergeli tumani")){
                try {
                    execute(myBotService.parkingname(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Pullik avtoturargoh")){
                try {
                    execute(myBotService.parkingmap(chatId));
                    execute(myBotService.parkingmessage(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Orqaga")){
                try {
                    execute(myBotService.start(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("CarWash")){
                try {
                    execute(myBotService.carwashtext(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Avtomoyka")){
                try {
                    execute(myBotService.carwashtextmanzilavtomoyka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Robot yuvadigan")){
                try {
                    execute(myBotService.carwashtextmanzilrobot(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Toshkent shaxar , Chilonzor tumani, Arnasoy ko‘chasi")){
                try {
                    execute(myBotService.carwashLocationAvtomoyka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Toshkent shahri, Chilonzor tumani,\n Katta-Qozirobod mahalla fuqarolar yig‘ini")){
                try {
                    execute(myBotService.carwashLocationrobot(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    @Override
    public String getBotUsername() {
        return "@shokh_teest_bot";
    }

    @Override
    public String getBotToken() {
        return "7741780078:AAGADfRvONsqBlhWhTtOV_7jEnwRC_p1YqA";
    }
}
