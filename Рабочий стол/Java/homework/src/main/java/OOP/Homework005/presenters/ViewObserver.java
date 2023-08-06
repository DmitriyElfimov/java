package OOP.Homework005.presenters;

import java.util.Date;

public interface ViewObserver {
    void onReservationTable(Date reservationDate, int tableNo, String name);

    void onChangeReservationTable (int reservationNo, Date reservationDate, int tableNo, String name);



}
