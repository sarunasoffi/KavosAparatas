package interfaces;

import products.ProductsVO;

public interface IProductsContainer {

    ProductsVO getProducts();
    void setProducts(ProductsVO value);
    void showProducts();


}
