package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\n\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001A\u0010\u0010\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0013\u001A\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001A\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/FontSynthesis;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "isWeightOn-impl$ui_text_release", "(I)Z", "isWeightOn", "isStyleOn-impl$ui_text_release", "isStyleOn", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class FontSynthesis {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006R\u001D\u0010\u000B\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/font/FontSynthesis$Companion;", "", "Landroidx/compose/ui/text/font/FontSynthesis;", "None", "I", "getNone-GVVA2EU", "()I", "All", "getAll-GVVA2EU", "Weight", "getWeight-GVVA2EU", "Style", "getStyle-GVVA2EU", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getAll-GVVA2EU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getNone-GVVA2EU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getStyle-GVVA2EU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getWeight-GVVA2EU() [...] // 潜在的解密器
    }

    @NotNull
    public static final Companion Companion;
    public final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;

    static {
        FontSynthesis.Companion = new Companion(null);
        FontSynthesis.b = 0;
        FontSynthesis.c = 1;
        FontSynthesis.d = 2;
        FontSynthesis.e = 3;
    }

    public FontSynthesis(int v) {
        this.a = v;
    }

    public static final int access$getAll$cp() [...] // 潜在的解密器

    public static final int access$getNone$cp() [...] // 潜在的解密器

    public static final int access$getStyle$cp() [...] // 潜在的解密器

    public static final int access$getWeight$cp() [...] // 潜在的解密器

    public static final FontSynthesis box-impl(int v) {
        return new FontSynthesis(v);
    }

    public static int constructor-impl(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return FontSynthesis.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof FontSynthesis ? v == ((FontSynthesis)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return FontSynthesis.hashCode-impl(this.a);
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    // 去混淆评级： 低(20)
    public static final boolean isStyleOn-impl$ui_text_release(int v) {
        return FontSynthesis.equals-impl0(v, 1) || FontSynthesis.equals-impl0(v, FontSynthesis.e);
    }

    // 去混淆评级： 低(20)
    public static final boolean isWeightOn-impl$ui_text_release(int v) {
        return FontSynthesis.equals-impl0(v, 1) || FontSynthesis.equals-impl0(v, FontSynthesis.d);
    }

    @Override
    @NotNull
    public String toString() {
        return FontSynthesis.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(int v) {
        if(FontSynthesis.equals-impl0(v, 0)) {
            return "None";
        }
        if(FontSynthesis.equals-impl0(v, 1)) {
            return "All";
        }
        if(FontSynthesis.equals-impl0(v, FontSynthesis.d)) {
            return "Weight";
        }
        return FontSynthesis.equals-impl0(v, FontSynthesis.e) ? "Style" : "Invalid";
    }

    public final int unbox-impl() {
        return this.a;
    }
}

