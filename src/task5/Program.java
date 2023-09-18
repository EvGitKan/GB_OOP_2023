package task5;

import task5.models.TableModel;
import task5.presenters.BookingPresenter;
import task5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter presenter = new BookingPresenter(model, view);

        presenter.updateTablesUI();

        view.reservationTable(new Date(), 3, "Станислав");
        view.reservationTable(new Date(), 4, "Станислав");

        view.changeReservationTable(101, new Date(), 3, "Станислав");
        view.changeReservationTable(102, new Date(), 1, "Станислав");
        view.changeReservationTable(102, new Date(), 4, "Станислав");
    }

}
