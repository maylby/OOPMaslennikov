package OOP.Seminar.Sem07.Chat07;

import lesson7.MessageDecorator;
import lesson7.TextMessage;

public class Main {
	public static void main(String[] args) {

		TextMessage tm = new TextMessage(); 

		tm.setMessage("Hello world"); // Метод sendMess() не определен для типа TextMessage.
		MessageDecorator ms = new MessageDecorator(tm);

		tm.sendMess(); // Метод sendMess() не определен для типа TextMessage.
		ms.sendMess(); // Метод sendMess() не определен для типа TextMessage.
	}
}