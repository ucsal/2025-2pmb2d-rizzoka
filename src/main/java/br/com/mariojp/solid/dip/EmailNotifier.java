package br.com.mariojp.solid.dip;

public class EmailNotifier {
	private final MailSender mailsender;
	
	public EmailNotifier() {
		if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
			this.mailsender = new AnotherClient();
		} else {
			this.mailsender = new SmtpClient();
		}
	}
	
	public void welcome(User user) {
		mailsender.send(user.email(), "Bem-vindo", "Olá " + user.name());
	}

}
