package OOP.Homework005.models;

import OOP.Homework005.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;
    private Table table;

    /**
     * Получить список всех столиков в ресторане
     *
     * @return список столиков
     */
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    Collection<Reservation> reservations = new ArrayList<>();


    public int reservationTable(Date reservationDate, int tableNo, String name) {

        for (Table table : loadTables()) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name);
                reservations.add(reservation);
                System.out.println(reservations);
                return reservation.getId();
            }

        }
        throw new RuntimeException("Некорректный номер столика.");
    }

    public void changeReservationTable(int reservationNo, Date reservationDate, int tableNo, String name) {

            reservations.removeIf(reservation -> reservation.getId() == reservationNo);

            System.out.println("Бронирование столика #" + reservationNo + " успешно отменено.");


    }


}