package OOP.Lesson.Les05.Ex003.Client;

import OOP.Lesson.Les05.Ex003.Core.Models.Model;
import OOP.Lesson.Les05.Ex003.Core.Presenters.Presenter;
import OOP.Lesson.Les05.Ex003.Core.Views.View;
import OOP.Lesson.Les05.Ex003.Mathematics.CalculateArea.CalculateArea;
import OOP.Lesson.Les05.Ex003.Mathematics.Exceptions.UnacceptableValueException;

public class App {
    Presenter p;
    View ui;
    Model model;

    public App() {
        ui = new ConsoleView();
        model = new Model(CalculateArea.getInstance(), "Без имени.jpg");
        p = new Presenter(ui, model);
    }

    public void start() throws UnacceptableValueException {
        StringBuilder sb = new StringBuilder()
                .append("\n ==== \n")
                .append("1 - append shape\n")
                .append("2 - show shape\n")
                .append("3 - show all area\n")
                .append("0 - exit\n");


        while (true) {
            ui.set(sb.toString());
            switch (ui.get()) {
                case "1":
                    p.append();
                    break;
                case "2":
                    p.show();
                    break;
                case "3":
                    p.showArea();
                    break;
                case "0":
                    return;
            }
        }
    }
}
