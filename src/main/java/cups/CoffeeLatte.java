package cups;

import cups.CoffeeCup;
import products.ProductsVO;

public class CoffeeLatte extends CoffeeCup {
    public CoffeeLatte() {
        super.setName("Latte");
        super.setIsReady(false);
        super.setMaxVolume(250.0f);
        super.setProducts(new ProductsVO(
                        20,
                        240,
                        20,
                        0,
                        0
                )
        );
        super.setPreparationDuration(4000);
    }
}
