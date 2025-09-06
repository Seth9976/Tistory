package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\r\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u001A\u0019\u001BB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\n\u001A\u00020\t2\b\u0010\b\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u001D\u0010\u0005\u001A\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u000E\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle;", "", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "alignment", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "trim", "<init>", "(FILkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "getAlignment-PIaL0Z0", "()F", "b", "I", "getTrim-EVpEnUU", "Companion", "Alignment", "Trim", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LineHeightStyle {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0012\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "", "", "topRatio", "constructor-impl", "(F)F", "", "toString-impl", "(F)Ljava/lang/String;", "toString", "", "hashCode-impl", "(F)I", "hashCode", "other", "", "equals-impl", "(FLjava/lang/Object;)Z", "equals", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @JvmInline
    public static final class Alignment {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006R\u001D\u0010\u000B\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;", "", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "Top", "F", "getTop-PIaL0Z0", "()F", "Center", "getCenter-PIaL0Z0", "Proportional", "getProportional-PIaL0Z0", "Bottom", "getBottom-PIaL0Z0", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            // 去混淆评级： 低(20)
            public final float getBottom-PIaL0Z0() {
                return 1.0f;
            }

            // 去混淆评级： 低(20)
            public final float getCenter-PIaL0Z0() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final float getProportional-PIaL0Z0() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final float getTop-PIaL0Z0() {
                return 0.0f;
            }
        }

        @NotNull
        public static final Companion Companion;
        public final float a;
        public static final float b;
        public static final float c;
        public static final float d;
        public static final float e;

        static {
            Alignment.Companion = new Companion(null);
            Alignment.b = 0.0f;
            Alignment.c = 0.5f;
            Alignment.d = -1.0f;
            Alignment.e = 1.0f;
        }

        public Alignment(float f) {
            this.a = f;
        }

        public static final float access$getBottom$cp() [...] // 潜在的解密器

        public static final float access$getCenter$cp() [...] // 潜在的解密器

        public static final float access$getProportional$cp() [...] // 潜在的解密器

        public static final float access$getTop$cp() [...] // 潜在的解密器

        public static final Alignment box-impl(float f) {
            return new Alignment(f);
        }

        public static float constructor-impl(float f) [...] // Inlined contents

        @Override
        public boolean equals(Object object0) {
            return Alignment.equals-impl(this.a, object0);
        }

        public static boolean equals-impl(float f, Object object0) {
            return object0 instanceof Alignment ? Float.compare(f, ((Alignment)object0).unbox-impl()) == 0 : false;
        }

        public static final boolean equals-impl0(float f, float f1) {
            return Float.compare(f, f1) == 0;
        }

        @Override
        public int hashCode() {
            return Alignment.hashCode-impl(this.a);
        }

        public static int hashCode-impl(float f) {
            return Float.hashCode(f);
        }

        @Override
        @NotNull
        public String toString() {
            return Alignment.toString-impl(this.a);
        }

        @NotNull
        public static String toString-impl(float f) {
            if(f == Alignment.b) {
                return "LineHeightStyle.Alignment.Top";
            }
            if(f == 0.5f) {
                return "LineHeightStyle.Alignment.Center";
            }
            if(f == Alignment.d) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            return f == Alignment.e ? "LineHeightStyle.Alignment.Bottom" : "LineHeightStyle.Alignment(topPercentage = " + f + ')';
        }

        public final float unbox-impl() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Companion;", "", "Landroidx/compose/ui/text/style/LineHeightStyle;", "Default", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getDefault", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class androidx.compose.ui.text.style.LineHeightStyle.Companion {
        public androidx.compose.ui.text.style.LineHeightStyle.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final LineHeightStyle getDefault() {
            return LineHeightStyle.c;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u000F\u0010\u0005\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\t\u001A\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\u000B\u001A\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\u000F\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u0013\u001A\u00020\u00062\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u0088\u0001\u0015\u0092\u0001\u00020\f¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "isTrimFirstLineTop-impl$ui_text_release", "(I)Z", "isTrimFirstLineTop", "isTrimLastLineBottom-impl$ui_text_release", "isTrimLastLineBottom", "", "hashCode-impl", "(I)I", "hashCode", "other", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "value", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @JvmInline
    public static final class Trim {
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006R\u001D\u0010\u000B\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u0014\u0010\u000E\u001A\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000E\u0010\u0004R\u0014\u0010\u000F\u001A\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000F\u0010\u0004\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;", "", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "FirstLineTop", "I", "getFirstLineTop-EVpEnUU", "()I", "LastLineBottom", "getLastLineBottom-EVpEnUU", "Both", "getBoth-EVpEnUU", "None", "getNone-EVpEnUU", "", "FlagTrimBottom", "FlagTrimTop", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.compose.ui.text.style.LineHeightStyle.Trim.Companion {
            public androidx.compose.ui.text.style.LineHeightStyle.Trim.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            // 去混淆评级： 低(20)
            public final int getBoth-EVpEnUU() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int getFirstLineTop-EVpEnUU() {
                return 1;
            }

            // 去混淆评级： 低(20)
            public final int getLastLineBottom-EVpEnUU() {
                return 16;
            }

            public final int getNone-EVpEnUU() [...] // 潜在的解密器
        }

        @NotNull
        public static final androidx.compose.ui.text.style.LineHeightStyle.Trim.Companion Companion;
        public final int a;
        public static final int b;
        public static final int c;
        public static final int d;

        static {
            Trim.Companion = new androidx.compose.ui.text.style.LineHeightStyle.Trim.Companion(null);
            Trim.b = 1;
            Trim.c = 16;
            Trim.d = 17;
        }

        public Trim(int v) {
            this.a = v;
        }

        public static final int access$getBoth$cp() [...] // 潜在的解密器

        public static final int access$getFirstLineTop$cp() [...] // 潜在的解密器

        public static final int access$getLastLineBottom$cp() [...] // 潜在的解密器

        public static final int access$getNone$cp() [...] // Inlined contents

        public static final Trim box-impl(int v) {
            return new Trim(v);
        }

        @Override
        public boolean equals(Object object0) {
            return Trim.equals-impl(this.a, object0);
        }

        public static boolean equals-impl(int v, Object object0) {
            return object0 instanceof Trim ? v == ((Trim)object0).unbox-impl() : false;
        }

        public static final boolean equals-impl0(int v, int v1) {
            return v == v1;
        }

        @Override
        public int hashCode() {
            return Trim.hashCode-impl(this.a);
        }

        public static int hashCode-impl(int v) {
            return v;
        }

        public static final boolean isTrimFirstLineTop-impl$ui_text_release(int v) {
            return (v & 1) > 0;
        }

        public static final boolean isTrimLastLineBottom-impl$ui_text_release(int v) {
            return (v & 16) > 0;
        }

        @Override
        @NotNull
        public String toString() {
            return Trim.toString-impl(this.a);
        }

        @NotNull
        public static String toString-impl(int v) {
            if(v == Trim.b) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if(v == Trim.c) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            switch(v) {
                case 0: {
                    return "LineHeightStyle.Trim.None";
                }
                case 17: {
                    return "LineHeightStyle.Trim.Both";
                }
                default: {
                    return "Invalid";
                }
            }
        }

        public final int unbox-impl() {
            return this.a;
        }
    }

    public static final int $stable;
    @NotNull
    public static final androidx.compose.ui.text.style.LineHeightStyle.Companion Companion;
    public final float a;
    public final int b;
    public static final LineHeightStyle c;

    static {
        LineHeightStyle.Companion = new androidx.compose.ui.text.style.LineHeightStyle.Companion(null);
        LineHeightStyle.c = new LineHeightStyle(-1.0f, 17, null);
    }

    public LineHeightStyle(float f, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = f;
        this.b = v;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LineHeightStyle)) {
            return false;
        }
        return Alignment.equals-impl0(this.a, ((LineHeightStyle)object0).a) ? Trim.equals-impl0(this.b, ((LineHeightStyle)object0).b) : false;
    }

    public final float getAlignment-PIaL0Z0() {
        return this.a;
    }

    public final int getTrim-EVpEnUU() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Trim.hashCode-impl(this.b) + Alignment.hashCode-impl(this.a) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "LineHeightStyle(alignment=" + Alignment.toString-impl(this.a) + ", trim=" + Trim.toString-impl(this.b) + ')';
    }
}

