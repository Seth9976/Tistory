package androidx.compose.ui.text.font;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.Intrinsics;

public final class g implements Setting {
    public final long a;

    public g(long v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g)) {
            return false;
        }
        ((g)object0).getClass();
        return Intrinsics.areEqual("opsz", "opsz") ? TextUnit.equals-impl0(this.a, ((g)object0).a) : false;
    }

    @Override  // androidx.compose.ui.text.font.FontVariation$Setting
    public final String getAxisName() {
        return "opsz";
    }

    @Override  // androidx.compose.ui.text.font.FontVariation$Setting
    public final boolean getNeedsDensity() {
        return true;
    }

    @Override
    public final int hashCode() {
        return TextUnit.hashCode-impl(this.a) + 0x650D8F8;
    }

    @Override
    public final String toString() {
        return "FontVariation.Setting(axisName=\'opsz\', value=" + TextUnit.toString-impl(this.a) + ')';
    }

    @Override  // androidx.compose.ui.text.font.FontVariation$Setting
    public final float toVariationValue(Density density0) {
        if(density0 == null) {
            throw new IllegalArgumentException("density must not be null");
        }
        return density0.getFontScale() * TextUnit.getValue-impl(this.a);
    }
}

