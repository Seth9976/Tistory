package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import kotlin.jvm.internal.Intrinsics;

public final class a implements Density {
    public final float a;
    public final float b;
    public final FontScaleConverter c;

    public a(float f, float f1, FontScaleConverter fontScaleConverter0) {
        this.a = f;
        this.b = f1;
        this.c = fontScaleConverter0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        if(Float.compare(this.a, ((a)object0).a) != 0) {
            return false;
        }
        return Float.compare(this.b, ((a)object0).b) == 0 ? Intrinsics.areEqual(this.c, ((a)object0).c) : false;
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
        return this.c.hashCode() + r0.a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F);
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public final float toDp-GaN1DYA(long v) {
        if(!TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(v), 0x100000000L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        return Dp.constructor-impl(this.c.convertSpToDp(TextUnit.getValue-impl(v)));
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public final long toSp-0xMU5do(float f) {
        return TextUnitKt.getSp(this.c.convertDpToSp(f));
    }

    @Override
    public final String toString() {
        return "DensityWithConverter(density=" + this.a + ", fontScale=" + this.b + ", converter=" + this.c + ')';
    }
}

