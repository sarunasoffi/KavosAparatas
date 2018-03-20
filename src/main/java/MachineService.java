import java.util.ArrayList;

public class MachineService {
    public ArrayList<CoffeMachine> createMachines(int n) {
        ArrayList<CoffeMachine> result = new ArrayList<CoffeMachine>();
        for (int i = 0; i < n; i++) {
            result.add(this.createMachine());
        }
        return result;
    }

    public CoffeMachine createMachine() {
        CoffeMachine result = new CoffeMachine();
        return result;
    }

    public void washMashines(ArrayList<CoffeMachine> list) {
        for (int i = 0; i < list.size(); i++) {
            washMashine(list.get(i));
        }
    }

    public void washMashine(CoffeMachine value) {
        value.cleanMaschine();
    }

    public void dumpMachineProducts(ArrayList<CoffeMachine> list) {
        ProductsVO dumpResult = new ProductsVO(0,0,0);

        for (int i = 0; i < list.size(); i++) {
            CoffeMachine currentMachine = list.get(i);
            dumpResult.setBeans(dumpResult.getBeans()+currentMachine.getProducts().getBeans());
            dumpResult.setWater(dumpResult.getWater()+currentMachine.getProducts().getWater());
            dumpResult.setSugar(dumpResult.getSugar()+currentMachine.getProducts().getSugar());

            currentMachine.getProducts().setBeans(0);
            currentMachine.getProducts().setWater(0);
            currentMachine.getProducts().setSugar(0);
        }

        System.out.println("Išvalėm šiuos produktus: "+dumpResult.getSugar() +" cukraus, "+ dumpResult.getBeans()+" pupeliu, "+dumpResult.getWater() +" vandens.");
    }

    public void assignSingleProduct(ArrayList<CoffeMachine> list, ProductsVO product) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setProducts(product);
        }
    }

    public void assignMultipleProducts(ArrayList<CoffeMachine> list, ArrayList<ProductsVO> products) {

        for (int i = 0; i < list.size(); i++) {
            ProductsVO skirtingasProduktas = new ProductsVO(50,50,50);
            products.add(skirtingasProduktas);
            list.get(i).setProducts(skirtingasProduktas);
        }
    }
}
