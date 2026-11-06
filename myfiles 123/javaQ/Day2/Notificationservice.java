
// The "Notification Service ......

public class Notificationservice  {

interface MessageService {
void sendMessage(String msg, String recipient);
}

static class EmailService implements MessageService{
@Override
 public void sendMessage(String msg,String recipient){
			System.out.println("Email Sent to " + recipient + " with Message" + msg);

}
}
static class SMSService implements MessageService{
@Override
 public void sendMessage (String msg , String recipient){
System.out.println("SMSService sent to " + recipient + " with Message" + msg) ;
}
}

static class WhatsAppService implements MessageService {

@Override 
 public void sendMessage (String msg , String recipient) {
System.out.println("WhatsAppService sent to " + recipient + "with Message " + msg);
}
}


static class UserProcessor {
private MessageService messageService;
public UserProcessor(MessageService messageService) {
	this.messageService = messageService;
}

public void notifyUser(String msg, String recipient) {
	messageService.sendMessage(msg, recipient);
}
}


public static void main (String [] args ) {



MessageService emailService = new EmailService();
 UserProcessor userProcessor1 = new UserProcessor(emailService);
 userProcessor1.notifyUser("hi all ", "nn@gmai..com");
		
		
MessageService smsservice = new SMSService ();
UserProcessor userProcessor2 = new UserProcessor( smsservice);
userProcessor2.notifyUser("Hello hi all " , "gg@gmailicom" );
		
		
MessageService whatsappservice = new WhatsAppService ();
UserProcessor userProcessor3 = new UserProcessor(whatsappservice);
userProcessor3.notifyUser(" hey hi Hello " , "ng@Gmail.com");
		
}
}

	