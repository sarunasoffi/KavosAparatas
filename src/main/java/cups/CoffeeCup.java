package cups;

import interfaces.IProductsContainer;
import products.ProductsVO;

public class CoffeeCup extends Cup implements IProductsContainer {
    private ProductsVO _products;
    private String _name;
    private boolean _isReady;
    private int _preparationDuration;

    public boolean getIsReady() {
        return _isReady;
    }

    public void setIsReady(boolean value) {
        this._isReady = value;
    }

    public String getName() {
        return _name;
    }

    public void setName(String value) {
        this._name = value;
    }

    @Override
    public ProductsVO getProducts() {
        return _products;
    }

    @Override
    public void setProducts(ProductsVO value) {
        this._products = value;
    }

    @Override
    public void showProducts() {
        System.out.println("Pupelės: " + _products.getBeans());
        System.out.println("Cukrus: " + _products.getSugar());
        System.out.println("Vanduo: " + _products.getWater());
        System.out.println("Pienas: " + _products.getMilk());
        System.out.println("Sokoladas: " + _products.getChocolate());
    }

    @Override
    public String toString() {
        return "Name: "+getName() + ", is ready: "+ getIsReady()+ ", beans: "+_products.getBeans()+", sugar: "+_products.getSugar()+", water: "+ _products.getWater();
    }

    public int getPreparationDuration() {
        return _preparationDuration;
    }

    public void setPreparationDuration(int value) {
        this._preparationDuration = value;
    }
}
