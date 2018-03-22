package interfaces;

import cups.CoffeeCup;
import products.ProductsVO;

public interface ICoffeMachine {

    void addProducts(ProductsVO value);
    void makeCoffe(String value);
    void cleanMachine();
    void showIsReady();
    void showStatus();
}
