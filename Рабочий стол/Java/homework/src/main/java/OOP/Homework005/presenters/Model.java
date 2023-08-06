package OOP.Homework005.presenters;

import OOP.Homework005.models.Reservation;
import OOP.Homework005.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    /**
     * Получить список всех столиков
     * @return
     */
    Collection<Table> loadTables();


    /**
     * Забронировать столик
     * @param reservationDate дата
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер брони
     */
    int reservationTable(Date reservationDate, int tableNo, String name);


    void changeReservationTable(int reservationNo, Date reservationDate, int tableNo, String name);

}
