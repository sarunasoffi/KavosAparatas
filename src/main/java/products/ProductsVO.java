package products;

public class ProductsVO {
    private float _sugar;
    private float _water;
    private float _beans;
    private float _milk;
    private float _chocolate;

    public ProductsVO(float sugar, float water, float beans, float milk, float chocolate) {
        this._sugar = sugar;
        this._water = water;
        this._beans = beans;
        this._milk = milk;
        this._chocolate = chocolate;
    }

    public float getSugar() {
        return _sugar;
    }

    public void setSugar(float value) {
        this._sugar = value;
    }

    public float getWater() {
        return _water;
    }

    public void setWater(float value) {
        this._water = value;
    }

    public float getBeans() {
        return _beans;
    }

    public void setBeans(float value) {
        this._beans = value;
    }


    public float getMilk() {
        return _milk;
    }

    public void setMilk(float value) {
        this._milk = value;
    }

    public float getChocolate() {
        return _chocolate;
    }

    public void setChocolate(float value) {
        this._chocolate = value;
    }
}
