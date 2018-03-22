package cups;

import cups.CoffeeCup;
import products.ProductsVO;

public class CoffeeEspresso extends CoffeeCup {
    public CoffeeEspresso() {
        super.setName("Espresso");
        super.setIsReady(false);
        super.setMaxVolume(100);
        super.setProducts(new ProductsVO(
                        10,
                        90,
                        30, 0, 0
                )
        );
        super.setPreparationDuration(2000);
    }
}
