import org.omg.CORBA.BAD_POLICY;

public class CoffeMachine {

    public static final int MAX_USES = 5;
    private ProductsVO _products;
    private int _uses;


    public CoffeMachine() {
    }


    public CoffeMachine(ProductsVO value) {
       this._products=value;
    }




    public void addProducts(ProductsVO value) {
       this._products.setBeans(this._products.getBeans()+value.getBeans());
       this._products.setWater(this._products.getWater()+value.getWater());
       this._products.setSugar(this._products.getSugar()+value.getSugar());
    }


    public void makeCoffe(String type) {
        switch (type.toLowerCase()) {
            case "latte":
                makeLatte();
                break;
            case "espresso":
                makeEspresso();
                break;
            case "black":
                makeBlack();
                break;
        }
    }


    public void cleanMaschine() {
        _uses = 0;
    }


    public void showIsReady() {
        if (_uses >= MAX_USES) {
            System.out.println("Neišvalyta");
        } else {
            System.out.println("Išvalyta");
        }
        System.out.println("Produktų būsenos:");
        if (_products.getBeans() > 0) {
            System.out.println("+ Pupelės");
        } else {
            System.out.println("- Pupelės");
        }

        if (_products.getSugar() > 0) {
            System.out.println("+ Cukrus");
        } else {
            System.out.println("- Cukrus");
        }

        if (_products.getWater() > 0) {
            System.out.println("+ Vanduo");
        } else {
            System.out.println("- Vanduo");
        }
    }


    public void showProducts() {
        System.out.println("Pupelės: " + _products.getBeans());
        System.out.println("Cukrus: " + _products.getSugar());
        System.out.println("Vanduo: " + _products.getWater());
    }


    public void showStatus() {
        showProducts();
        System.out.println("Iki plovimo liko: " + (MAX_USES - _uses));
    }


    /**
     */
    private void makeLatte() {
        float needsBeans = 10;
        float needsWater = 150;
        float needsSugar = 5;

        if (!checkProducts(needsSugar, needsWater, needsBeans) && checkWashing()) {
            _products.setWater(_products.getWater()-  needsWater);
            _products.setSugar(_products.getSugar()-needsSugar);
            _products.setBeans(_products.getBeans()-needsBeans);
            _uses++;
            System.out.println("Padariau Latte");
        }

    }


    /**
     */
    private void makeBlack() {
        float needsBeans = 20;
        float needsWater = 200;
        float needsSugar = 10;

        if (!checkProducts(needsSugar, needsWater, needsBeans) && checkWashing()) {
            _products.setWater(_products.getWater()-  needsWater);
            _products.setSugar(_products.getSugar()-needsSugar);
            _products.setBeans(_products.getBeans()-needsBeans);
            _uses++;
            System.out.println("Padariau Juodą kavą");
        }
    }


    /**
     */
    private void makeEspresso() {
        float needsBeans = 30;
        float needsWater = 100;
        float needsSugar = 5;

        if (!checkProducts(needsSugar, needsWater, needsBeans) && checkWashing()) {
            _products.setWater(_products.getWater()-  needsWater);
            _products.setSugar(_products.getSugar()-needsSugar);
            _products.setBeans(_products.getBeans()-needsBeans);
            _uses++;
            System.out.println("Padariau Esspresso");
        }
    }


    private boolean checkProducts(float sugar, float water, float beans) {
        boolean result = false;
        if (beans > _products.getBeans()) {
            result = true;
            System.out.println("Trūksta pupelių");
        }
        if (water > _products.getWater()) {
            result = true;
            System.out.println("Trūksta vandens");
        }
        if (sugar > _products.getSugar()) {
            result = true;
            System.out.println("Trūksta cukraus");
        }
        return result;
    }

    private boolean checkWashing() {
        boolean result = true;
        if (_uses >= MAX_USES) {
            result = false;
            System.out.println("Reikia plauti aparatą!!!");
        }
        return result;
    }


    public ProductsVO getProducts() {
        return _products;
    }

    public void setProducts(ProductsVO _products) {
        this._products = _products;
    }
}
