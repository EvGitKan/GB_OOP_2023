package task5.presenters;

import task5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);
    int offReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);

}
