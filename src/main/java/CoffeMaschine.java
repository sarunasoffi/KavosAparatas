
public class CoffeMaschine {

    public static final int MAX_USES = 5;
    private float _sugar;
    private float _beans;
    private float _water;
    private int _uses;


    public CoffeMaschine() {
    }


    public CoffeMaschine(float sugar, float beans, float water) {
        _sugar = sugar;
        _beans = beans;
        _water = water;
    }


    public float getSugar() {
        return _sugar;
    }


    public float getWater() {
        return _water;
    }


    public float getBeans() {
        return _beans;
    }


    public void setSugar(float value) {
        _sugar = value;
    }


    public void setWater(float value) {
        _water = value;
    }


    public void setBeans(float value) {
        _beans = value;
    }

    public void addProducts(float beans, float water, float sugar) {
        _water += water;
        _sugar += sugar;
        _beans += beans;
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
        if (_beans > 0) {
            System.out.println("+ Pupelės");
        } else {
            System.out.println("- Pupelės");
        }

        if (_sugar > 0) {
            System.out.println("+ Cukrus");
        } else {
            System.out.println("- Cukrus");
        }

        if (_water > 0) {
            System.out.println("+ Vanduo");
        } else {
            System.out.println("- Vanduo");
        }
    }


    public void showProducts() {
        System.out.println("Pupelės: " + _beans);
        System.out.println("Cukrus: " + _sugar);
        System.out.println("Vanduo: " + _water);
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
            _water -= needsWater;
            _sugar -= needsSugar;
            _beans -= needsBeans;
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
            _water -= needsWater;
            _sugar -= needsSugar;
            _beans -= needsBeans;
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
            _water -= needsWater;
            _sugar -= needsSugar;
            _beans -= needsBeans;
            _uses++;
            System.out.println("Padariau Esspresso");
        }
    }


    private boolean checkProducts(float sugar, float water, float beans) {
        boolean result = false;
        if (beans > _beans) {
            result = true;
            System.out.println("Trūksta pupelių");
        }
        if (water > _water) {
            result = true;
            System.out.println("Trūksta vandens");
        }
        if (sugar > _sugar) {
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


}
