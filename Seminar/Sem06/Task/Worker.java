package OOP.Seminar.Sem06.Task;

interface Worker {
	void work();
	void eat();
}

class Engineer implements Worker {
	public void work() {
		// Реализация работы инженера
	}

	public void eat() {
		// Реализация приема пищи
	}
}
