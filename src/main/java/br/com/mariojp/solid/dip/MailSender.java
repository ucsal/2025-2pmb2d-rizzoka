package br.com.mariojp.solid.dip;

public interface MailSender {
	public void send(String to, String subject, String body); 
}
