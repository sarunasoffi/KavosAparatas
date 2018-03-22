import interfaces.ICoffeeMachine;
import interfaces.IProductsContainer;
import products.ProductsVO;

import java.util.ArrayList;
import java.util.List;

public class MachineService {
    public List<ICoffeeMachine> createMachines(int n) {
        List<ICoffeeMachine> result = new ArrayList<ICoffeeMachine>();
        for (int i = 0; i < n; i++) {
            result.add(this.createMachine());
        }
        return result;
    }

    public ICoffeeMachine createMachine() {
        ICoffeeMachine result = new CoffeeMachine();
        return result;
    }

    public void washMashines(List<ICoffeeMachine> list) {
        for (int i = 0; i < list.size(); i++) {
            washMashine(list.get(i));
        }
    }

    public void washMashine(ICoffeeMachine value) {
        value.cleanMachine();
    }

    public void dumpMachineProducts(List<ICoffeeMachine> list) {
        ProductsVO dumpResult = new ProductsVO(0, 0, 0, 0, 0);

        for (int i = 0; i < list.size(); i++) {
            IProductsContainer currentMachine = ((IProductsContainer)list.get(i));
            dumpResult.setBeans(dumpResult.getBeans() + currentMachine.getProducts().getBeans());
            dumpResult.setWater(dumpResult.getWater() + currentMachine.getProducts().getWater());
            dumpResult.setSugar(dumpResult.getSugar() + currentMachine.getProducts().getSugar());

            currentMachine.getProducts().setBeans(0);
            currentMachine.getProducts().setWater(0);
            currentMachine.getProducts().setSugar(0);
        }

        System.out.println("Išvalėm šiuos produktus: " + dumpResult.getSugar() + " cukraus, " + dumpResult.getBeans() + " pupeliu, " + dumpResult.getWater() + " vandens.");
    }

    public void assignSingleProduct(List<ICoffeeMachine> list, ProductsVO product) {
        for (int i = 0; i < list.size(); i++) {
            ((CoffeeMachine)list.get(i)).setProducts(product);
        }
    }

    public void assignMultipleProducts(List<ICoffeeMachine> list, List<ProductsVO> products) {

        for (int i = 0; i < list.size(); i++) {
            ProductsVO skirtingasProduktas = new ProductsVO(50, 50, 50, 50, 50);
            products.add(skirtingasProduktas);
            ((CoffeeMachine)list.get(i)).setProducts(skirtingasProduktas);
        }
    }
}
