package Exception.Homework002;

import java.util.ArrayList;
import java.util.List;

public class PaidProduct extends Product{
    public static List<PaidProduct> paidProducts = new ArrayList<>();
    public void addPaidProducts (PaidProduct paidProduct){
        paidProducts.add(paidProduct);
    }



    public PaidProduct(int productId, String name, int quantity, double price) {

super(productId,name,quantity,price);
    }


    public static PaidProduct getPaidProduct(int productId) throws ProductNotFoundException{
        for(int i = 0; i< paidProducts.size(); i++){
            if(paidProducts.get(i).getProductId() == productId);
            return paidProducts.get(i);
        }
        throw new ProductNotFoundException("Товар не найден");
    }
}
