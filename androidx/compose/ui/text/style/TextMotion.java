package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\f\b\u0007\u0018\u0000 \u001B2\u00020\u0001:\u0002\u001B\u001CB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\f\u001A\u00020\u00042\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0010R\u001A\u0010\u0005\u001A\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion;", "", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "linearity", "", "subpixelTextPositioning", "<init>", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-JdDtMQo$ui_text_release", "(IZ)Landroidx/compose/ui/text/style/TextMotion;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getLinearity-4e0Vf04$ui_text_release", "b", "Z", "getSubpixelTextPositioning$ui_text_release", "()Z", "Companion", "Linearity", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextMotion {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Companion;", "", "Landroidx/compose/ui/text/style/TextMotion;", "Static", "Landroidx/compose/ui/text/style/TextMotion;", "getStatic", "()Landroidx/compose/ui/text/style/TextMotion;", "Animated", "getAnimated", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final TextMotion getAnimated() {
            return TextMotion.d;
        }

        @NotNull
        public final TextMotion getStatic() {
            return TextMotion.c;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0081@\u0018\u0000 \u000F2\u00020\u0001:\u0001\u000FJ\u000F\u0010\u0005\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000E\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u0010\u0092\u0001\u00020\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "value", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @JvmInline
    public static final class Linearity {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity$Companion;", "", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "Linear", "I", "getLinear-4e0Vf04", "()I", "FontHinting", "getFontHinting-4e0Vf04", "None", "getNone-4e0Vf04", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.compose.ui.text.style.TextMotion.Linearity.Companion {
            public androidx.compose.ui.text.style.TextMotion.Linearity.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            // 去混淆评级： 低(20)
            public final int getFontHinting-4e0Vf04() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getLinear-4e0Vf04() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getNone-4e0Vf04() [...] // 潜在的解密器
        }

        @NotNull
        public static final androidx.compose.ui.text.style.TextMotion.Linearity.Companion Companion;
        public final int a;
        public static final int b;
        public static final int c;
        public static final int d;

        static {
            Linearity.Companion = new androidx.compose.ui.text.style.TextMotion.Linearity.Companion(null);
            Linearity.b = 1;
            Linearity.c = 2;
            Linearity.d = 3;
        }

        public Linearity(int v) {
            this.a = v;
        }

        public static final int access$getFontHinting$cp() [...] // 潜在的解密器

        public static final int access$getLinear$cp() [...] // 潜在的解密器

        public static final int access$getNone$cp() [...] // 潜在的解密器

        public static final Linearity box-impl(int v) {
            return new Linearity(v);
        }

        @Override
        public boolean equals(Object object0) {
            return Linearity.equals-impl(this.a, object0);
        }

        public static boolean equals-impl(int v, Object object0) {
            return object0 instanceof Linearity ? v == ((Linearity)object0).unbox-impl() : false;
        }

        public static final boolean equals-impl0(int v, int v1) {
            return v == v1;
        }

        @Override
        public int hashCode() {
            return Linearity.hashCode-impl(this.a);
        }

        public static int hashCode-impl(int v) {
            return v;
        }

        @Override
        @NotNull
        public String toString() {
            return Linearity.toString-impl(this.a);
        }

        @NotNull
        public static String toString-impl(int v) {
            if(Linearity.equals-impl0(v, Linearity.b)) {
                return "Linearity.Linear";
            }
            if(Linearity.equals-impl0(v, Linearity.c)) {
                return "Linearity.FontHinting";
            }
            return Linearity.equals-impl0(v, Linearity.d) ? "Linearity.None" : "Invalid";
        }

        public final int unbox-impl() {
            return this.a;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final int a;
    public final boolean b;
    public static final TextMotion c;
    public static final TextMotion d;

    static {
        TextMotion.Companion = new Companion(null);
        TextMotion.c = new TextMotion(2, false, null);
        TextMotion.d = new TextMotion(1, true, null);
    }

    public TextMotion(int v, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = z;
    }

    @NotNull
    public final TextMotion copy-JdDtMQo$ui_text_release(int v, boolean z) {
        return new TextMotion(v, z, null);
    }

    public static TextMotion copy-JdDtMQo$ui_text_release$default(TextMotion textMotion0, int v, boolean z, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = textMotion0.a;
        }
        if((v1 & 2) != 0) {
            z = textMotion0.b;
        }
        return textMotion0.copy-JdDtMQo$ui_text_release(v, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextMotion)) {
            return false;
        }
        return Linearity.equals-impl0(this.a, ((TextMotion)object0).a) ? this.b == ((TextMotion)object0).b : false;
    }

    public final int getLinearity-4e0Vf04$ui_text_release() {
        return this.a;
    }

    public final boolean getSubpixelTextPositioning$ui_text_release() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.b) + Linearity.hashCode-impl(this.a) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        if(Intrinsics.areEqual(this, TextMotion.c)) {
            return "TextMotion.Static";
        }
        return Intrinsics.areEqual(this, TextMotion.d) ? "TextMotion.Animated" : "Invalid";
    }
}

