package OOP.Homework005;

import OOP.Homework005.models.TableModel;
import OOP.Homework005.presenters.BookingPresenter;
import OOP.Homework005.presenters.Model;
import OOP.Homework005.presenters.View;
import OOP.Homework005.views.BookingView;

import java.util.Date;

public class program {
    public static void main(String[] args) {
        View view = new BookingView();
        Model model = new TableModel();

        BookingPresenter bookingPresenter = new BookingPresenter(view, model);
        bookingPresenter.showTables();

        view.reservationTable(new Date(), 3, "Станислав");
        view.reservationTable(new Date(), 1, "Ярослав");
        view.reservationTable(new Date(), 4, "Владислав");




       view.changeReservationTable(1001, new Date(), 2, "Станислав");



    }


}
