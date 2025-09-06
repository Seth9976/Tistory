package t2;

import androidx.compose.ui.unit.Density;

public final class a implements Density {
    public final float a;
    public final float b;

    public a(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        return Float.compare(this.a, ((a)object0).a) == 0 ? Float.compare(this.b, ((a)object0).b) == 0 : false;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.a;
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return Float.hashCode(this.b) + Float.hashCode(this.a) * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DensityImpl(density=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", fontScale=");
        return r0.a.n(stringBuilder0, this.b, ')');
    }
}

