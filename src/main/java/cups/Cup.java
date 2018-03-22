package cups;

import interfaces.ICup;

public class Cup implements ICup {
    private float _maxVolume;

    @Override
    public float getMaxVolume() {
        return _maxVolume;
    }

    @Override
    public void setMaxVolume(float value) {
        this._maxVolume = value;
    }

    @Override
    public void showCupInfo() {
        System.out.println(
                "Puodelio talpa yra: " + _maxVolume
        );
    }
}
