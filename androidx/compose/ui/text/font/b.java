package androidx.compose.ui.text.font;

import kotlin.jvm.internal.Intrinsics;

public final class b extends AndroidFont {
    public final String d;
    public final FontWeight e;
    public final int f;

    public b(String s, FontWeight fontWeight0, int v, Settings fontVariation$Settings0) {
        super(1, h.a, fontVariation$Settings0, null);
        this.d = s;
        this.e = fontWeight0;
        this.f = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b)) {
            return false;
        }
        if(!DeviceFontFamilyName.equals-impl0(this.d, ((b)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((b)object0).e)) {
            return false;
        }
        return FontStyle.equals-impl0(this.f, ((b)object0).f) ? Intrinsics.areEqual(this.getVariationSettings(), ((b)object0).getVariationSettings()) : false;
    }

    @Override  // androidx.compose.ui.text.font.Font
    public final int getStyle-_-LCdwA() {
        return this.f;
    }

    @Override  // androidx.compose.ui.text.font.Font
    public final FontWeight getWeight() {
        return this.e;
    }

    @Override
    public final int hashCode() {
        return this.getVariationSettings().hashCode() + (FontStyle.hashCode-impl(this.f) + (this.e.hashCode() + DeviceFontFamilyName.hashCode-impl(this.d) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "Font(familyName=\"" + DeviceFontFamilyName.toString-impl(this.d) + "\", weight=" + this.e + ", style=" + FontStyle.toString-impl(this.f) + ')';
    }
}

