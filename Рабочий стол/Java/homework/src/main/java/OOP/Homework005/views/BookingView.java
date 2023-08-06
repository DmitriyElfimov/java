package OOP.Homework005.views;

import OOP.Homework005.models.Reservation;
import OOP.Homework005.models.Table;
import OOP.Homework005.presenters.View;
import OOP.Homework005.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    public void showTables(Collection<Table> tables){
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    public void showReservationTableResult(int reservationId){
        System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationId);
    }


    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    public void reservationTable(Date reservationDate, int tableNo, String name){
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    /**
     * TODO: Необходимо разработать самостоятельно в рамках домашней работы.
     * Удаление старого резерва столика. Бронирование столика на новое время.
     * @param reservationNo
     * @param reservationDate
     * @param tableNo
     * @param name
     */
    public void changeReservationTable(int reservationNo, Date reservationDate, int tableNo, String name){
        observer.onChangeReservationTable(reservationNo, reservationDate, tableNo, name);
        observer.onReservationTable(reservationDate,tableNo,name);
    }

}