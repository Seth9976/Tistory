package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087@\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001(B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001B\u0010\t\u001A\u00020\u00002\u0006\u0010\u0006\u001A\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001B\u0010\u000B\u001A\u00020\u00002\u0006\u0010\u0006\u001A\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ\u0016\u0010\r\u001A\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0005J\u001E\u0010\u000F\u001A\u00020\u00002\u0006\u0010\u0006\u001A\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\bJ\u001E\u0010\u000F\u001A\u00020\u00002\u0006\u0010\u0006\u001A\u00020\u0010H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u0011J\u001B\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\bJ\u001E\u0010\u0014\u001A\u00020\u00002\u0006\u0010\u0006\u001A\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\bJ\u001E\u0010\u0014\u001A\u00020\u00002\u0006\u0010\u0006\u001A\u00020\u0010H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u001B\u0010\u0017\u001A\u00020\u00102\u0006\u0010\u0006\u001A\u00020\u0000H\u0097\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u001B\u001A\u00020\u0018H\u0017¢\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001E\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001C\u0010\u001DJ\u001A\u0010#\u001A\u00020 2\b\u0010\u0006\u001A\u0004\u0018\u00010\u001FHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "", "", "value", "constructor-impl", "(F)F", "other", "plus-5rwHm24", "(FF)F", "plus", "minus-5rwHm24", "minus", "unaryMinus-D9Ej5fM", "unaryMinus", "div-u2uoSUM", "div", "", "(FI)F", "div-0680j_4", "times-u2uoSUM", "times", "compareTo-0680j_4", "(FF)I", "compareTo", "", "toString-impl", "(F)Ljava/lang/String;", "toString", "hashCode-impl", "(F)I", "hashCode", "", "", "equals-impl", "(FLjava/lang/Object;)Z", "equals", "a", "F", "getValue", "()F", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,576:1\n131#2:577\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n95#1:577\n*E\n"})
public final class Dp implements Comparable {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001R&\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006R&\u0010\t\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000B\u0010\b\u001A\u0004\b\n\u0010\u0006R&\u0010\f\u001A\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000E\u0010\b\u001A\u0004\b\r\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/unit/Dp$Companion;", "", "Landroidx/compose/ui/unit/Dp;", "Hairline", "F", "getHairline-D9Ej5fM", "()F", "getHairline-D9Ej5fM$annotations", "()V", "Infinity", "getInfinity-D9Ej5fM", "getInfinity-D9Ej5fM$annotations", "Unspecified", "getUnspecified-D9Ej5fM", "getUnspecified-D9Ej5fM$annotations", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final float getHairline-D9Ej5fM() [...] // 潜在的解密器

        @Stable
        public static void getHairline-D9Ej5fM$annotations() {
        }

        // 去混淆评级： 低(20)
        public final float getInfinity-D9Ej5fM() [...] // 潜在的解密器

        @Stable
        public static void getInfinity-D9Ej5fM$annotations() {
        }

        // 去混淆评级： 低(20)
        public final float getUnspecified-D9Ej5fM() [...] // 潜在的解密器

        @Stable
        public static void getUnspecified-D9Ej5fM$annotations() {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final float a;
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        Dp.Companion = new Companion(null);
        Dp.b = 0.0f;
        Dp.c = Infinityf;
        Dp.d = NaNf;
    }

    public Dp(float f) {
        this.a = f;
    }

    public static final float access$getHairline$cp() [...] // 潜在的解密器

    public static final float access$getInfinity$cp() [...] // 潜在的解密器

    public static final float access$getUnspecified$cp() [...] // 潜在的解密器

    public static final Dp box-impl(float f) {
        return new Dp(f);
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo-0680j_4(((Dp)object0).unbox-impl());
    }

    @Stable
    public static int compareTo-0680j_4(float f, float f1) {
        return Float.compare(f, f1);
    }

    @Stable
    public int compareTo-0680j_4(float f) {
        return Dp.compareTo-0680j_4(this.a, f);
    }

    public static float constructor-impl(float f) [...] // Inlined contents

    @Stable
    public static final float div-0680j_4(float f, float f1) {
        return f / f1;
    }

    @Stable
    public static final float div-u2uoSUM(float f, float f1) {
        return Dp.constructor-impl(f / f1);
    }

    @Stable
    public static final float div-u2uoSUM(float f, int v) {
        return Dp.constructor-impl(f / ((float)v));
    }

    @Override
    public boolean equals(Object object0) {
        return Dp.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(float f, Object object0) {
        return object0 instanceof Dp ? Float.compare(f, ((Dp)object0).unbox-impl()) == 0 : false;
    }

    public static final boolean equals-impl0(float f, float f1) {
        return Float.compare(f, f1) == 0;
    }

    public final float getValue() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Dp.hashCode-impl(this.a);
    }

    public static int hashCode-impl(float f) {
        return Float.hashCode(f);
    }

    @Stable
    public static final float minus-5rwHm24(float f, float f1) {
        return f - f1;
    }

    @Stable
    public static final float plus-5rwHm24(float f, float f1) {
        return f + f1;
    }

    @Stable
    public static final float times-u2uoSUM(float f, float f1) {
        return f * f1;
    }

    @Stable
    public static final float times-u2uoSUM(float f, int v) {
        return f * ((float)v);
    }

    @Override
    @Stable
    @NotNull
    public String toString() {
        return Dp.toString-impl(this.a);
    }

    // 去混淆评级： 低(20)
    @Stable
    @NotNull
    public static String toString-impl(float f) {
        return Float.isNaN(f) ? "Dp.Unspecified" : f + ".dp";
    }

    @Stable
    public static final float unaryMinus-D9Ej5fM(float f) {
        return -f;
    }

    public final float unbox-impl() {
        return this.a;
    }
}

