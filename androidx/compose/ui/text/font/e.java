package androidx.compose.ui.text.font;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.Intrinsics;
import r0.a;

public final class e implements Setting {
    public final String a;
    public final float b;

    public e(String s, float f) {
        this.a = s;
        this.b = f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((e)object0).a) ? this.b == ((e)object0).b : false;
    }

    @Override  // androidx.compose.ui.text.font.FontVariation$Setting
    public final String getAxisName() {
        return this.a;
    }

    @Override  // androidx.compose.ui.text.font.FontVariation$Setting
    public final boolean getNeedsDensity() {
        return false;
    }

    @Override
    public final int hashCode() {
        return Float.hashCode(this.b) + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("FontVariation.Setting(axisName=\'");
        stringBuilder0.append(this.a);
        stringBuilder0.append("\', value=");
        return a.n(stringBuilder0, this.b, ')');
    }

    @Override  // androidx.compose.ui.text.font.FontVariation$Setting
    public final float toVariationValue(Density density0) {
        return this.b;
    }
}

