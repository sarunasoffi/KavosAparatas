public class ProductsVO {
    private float _sugar;
    private float _water;
    private float _beans;

    public ProductsVO(float sugar, float water, float beans) {
        this._sugar = sugar;
        this._water = water;
        this._beans = beans;
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
}
