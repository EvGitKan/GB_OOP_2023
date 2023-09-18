package task5.models;

import task5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    /**
     * Получить список столиков
     */
    public Collection<Table> loadTables(){

        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер резерва
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table t : tables){
            if (t.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                t.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    /**
     * TODO: Добавить реализацию в рамках выполнения домашней работы
     * @param oldReservation
     * @param reservationDate
     * @param tableNo
     * @param name
     * @return
     */
    public int offReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        for (Table t : tables){
            if (t.getNo() == tableNo){
                for (Reservation r : t.getReservations()){
                    if (r.getId() == oldReservation) {
                        t.getReservations().remove(r);
                        return r.getId();
                    }
                }
            }
        }
        return -1;
    }


}
