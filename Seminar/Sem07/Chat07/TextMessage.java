package OOP.Seminar.Sem07.Chat07;

public class TextMessage implements Message {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public void sendMess() {
		System.out.println(message);
	}

}
