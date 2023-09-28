package Exception_task3;


import Exception_task3.Presenter.Presenter;
import Exception_task3.View.ConsoleView;
import Exception_task3.View.View;

public class Homework3 {
    public static void main(String[] args) {
        Presenter<View> prog = new Presenter<View>(new ConsoleView());
        prog.start();
    }
}
