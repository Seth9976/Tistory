package androidx.compose.ui.text.font;

import a5.b;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.Intrinsics;

public final class f implements Setting {
    public final String a;
    public final int b;

    public f(String s, int v) {
        this.a = s;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((f)object0).a) ? this.b == ((f)object0).b : false;
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
        return this.a.hashCode() * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("FontVariation.Setting(axisName=\'");
        stringBuilder0.append(this.a);
        stringBuilder0.append("\', value=");
        return b.p(stringBuilder0, this.b, ')');
    }

    @Override  // androidx.compose.ui.text.font.FontVariation$Setting
    public final float toVariationValue(Density density0) {
        return (float)this.b;
    }
}

