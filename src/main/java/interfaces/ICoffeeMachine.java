package interfaces;

import products.ProductsVO;

public interface ICoffeeMachine {
    void addProducts(ProductsVO value);

    void makeCoffee(String value);

    void cleanMachine();

    void showIsReady();

    void showStatus();
}
