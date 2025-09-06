package androidx.dynamicanimation.animation;

public final class FloatValueHolder {
    public float a;

    public FloatValueHolder() {
        this.a = 0.0f;
    }

    public FloatValueHolder(float f) {
        this.a = 0.0f;
        this.setValue(f);
    }

    public float getValue() {
        return this.a;
    }

    public void setValue(float f) {
        this.a = f;
    }
}

