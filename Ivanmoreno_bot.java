
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Ivanmoreno_bot extends TelegramLongPollingBot {


    public void onUpdateReceived(Update update) {

          System.out.println(update.getMessage().getText());
          System.out.println(update.getMessage().getFrom().getFirstName() );

        String command = update.getMessage().getText();
        SendMessage message= new SendMessage();
        if (command.equals("/minombre")) {
            System.out.println(update.getMessage().getFrom().getFirstName());
            message.setText(update.getMessage().getFrom().getFirstName());
        }
        if (command.equals("/miapellido")) {
            System.out.println(update.getMessage().getFrom().getLastName());
            message.setText(update.getMessage().getFrom().getLastName());
        }
        if(command.equals("/minombrecompleto")){
            System.out.println(update.getMessage().getFrom().getFirstName()+" "+(update.getMessage().getFrom().getLastName()));
            message.setText(update.getMessage().getFrom().getFirstName()+" "+(update.getMessage().getFrom().getLastName()));
        }
        message.setChatId(update.getMessage().getChatId());

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    public String getBotUsername() {
        return "ivanmoreno_bot";
    }



    public String getBotToken() {
        return"1184722418:AAH5Ss2fWupwq77Pl3x-L19fv23y-XRqFpo";
    }
}