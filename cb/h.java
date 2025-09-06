package cb;

import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import r0.a;

public final class h {
    public final float a;
    public final float b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;

    public h(long v, boolean z, int v1, float f) {
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        if((v1 & 16) != 0) {
            v = DpKt.DpSize-YgX7TsA(8.0f, 4.0f);
        }
        if((v1 & 0x20) != 0) {
            z = false;
        }
        super();
        this.a = 100.0f;
        this.b = f;
        this.c = 0x141F00000L;
        this.d = 0x1421C0000L;
        this.e = v;
        this.f = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h)) {
            return false;
        }
        if(Float.compare(this.a, ((h)object0).a) != 0) {
            return false;
        }
        if(Float.compare(this.b, ((h)object0).b) != 0) {
            return false;
        }
        if(!TextUnit.equals-impl0(this.c, ((h)object0).c)) {
            return false;
        }
        if(!TextUnit.equals-impl0(this.d, ((h)object0).d)) {
            return false;
        }
        return DpSize.equals-impl0(this.e, ((h)object0).e) ? this.f == ((h)object0).f : false;
    }

    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.f) + (DpSize.hashCode-impl(this.e) + (TextUnit.hashCode-impl(this.d) + (TextUnit.hashCode-impl(this.c) + a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F)) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        String s = TextUnit.toString-impl(this.c);
        String s1 = TextUnit.toString-impl(this.d);
        String s2 = DpSize.toString-impl(this.e);
        StringBuilder stringBuilder0 = new StringBuilder("TextEditorOption(textAlpha=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", backgroundAlpha=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", fontSize=");
        stringBuilder0.append(s);
        stringBuilder0.append(", lineHeight=");
        androidx.room.a.w(stringBuilder0, s1, ", padding=", s2, ", enableWaterMark=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

