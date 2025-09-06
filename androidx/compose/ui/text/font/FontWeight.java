package androidx.compose.ui.text.font;

import a5.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\u0006\u001A\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u000E¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight;", "", "", "weight", "<init>", "(I)V", "other", "compareTo", "(Landroidx/compose/ui/text/font/FontWeight;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getWeight", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FontWeight implements Comparable {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006R \u0010\t\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000B\u0010\b\u001A\u0004\b\n\u0010\u0006R \u0010\f\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000E\u0010\b\u001A\u0004\b\r\u0010\u0006R \u0010\u000F\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\u000F\u0010\u0004\u0012\u0004\b\u0011\u0010\b\u001A\u0004\b\u0010\u0010\u0006R \u0010\u0012\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001A\u0004\b\u0013\u0010\u0006R \u0010\u0015\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u0012\u0004\b\u0017\u0010\b\u001A\u0004\b\u0016\u0010\u0006R \u0010\u0018\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u0012\u0004\b\u001A\u0010\b\u001A\u0004\b\u0019\u0010\u0006R \u0010\u001B\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\u001B\u0010\u0004\u0012\u0004\b\u001D\u0010\b\u001A\u0004\b\u001C\u0010\u0006R \u0010\u001E\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\u001E\u0010\u0004\u0012\u0004\b \u0010\b\u001A\u0004\b\u001F\u0010\u0006R \u0010!\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b!\u0010\u0004\u0012\u0004\b#\u0010\b\u001A\u0004\b\"\u0010\u0006R \u0010$\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b$\u0010\u0004\u0012\u0004\b&\u0010\b\u001A\u0004\b%\u0010\u0006R \u0010\'\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b\'\u0010\u0004\u0012\u0004\b)\u0010\b\u001A\u0004\b(\u0010\u0006R \u0010*\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b*\u0010\u0004\u0012\u0004\b,\u0010\b\u001A\u0004\b+\u0010\u0006R \u0010-\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b-\u0010\u0004\u0012\u0004\b/\u0010\b\u001A\u0004\b.\u0010\u0006R \u00100\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b0\u0010\u0004\u0012\u0004\b2\u0010\b\u001A\u0004\b1\u0010\u0006R \u00103\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b3\u0010\u0004\u0012\u0004\b5\u0010\b\u001A\u0004\b4\u0010\u0006R \u00106\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b6\u0010\u0004\u0012\u0004\b8\u0010\b\u001A\u0004\b7\u0010\u0006R \u00109\u001A\u00020\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b9\u0010\u0004\u0012\u0004\b;\u0010\b\u001A\u0004\b:\u0010\u0006R \u0010=\u001A\b\u0012\u0004\u0012\u00020\u00020<8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@\u00A8\u0006A"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight$Companion;", "", "Landroidx/compose/ui/text/font/FontWeight;", "W100", "Landroidx/compose/ui/text/font/FontWeight;", "getW100", "()Landroidx/compose/ui/text/font/FontWeight;", "getW100$annotations", "()V", "W200", "getW200", "getW200$annotations", "W300", "getW300", "getW300$annotations", "W400", "getW400", "getW400$annotations", "W500", "getW500", "getW500$annotations", "W600", "getW600", "getW600$annotations", "W700", "getW700", "getW700$annotations", "W800", "getW800", "getW800$annotations", "W900", "getW900", "getW900$annotations", "Thin", "getThin", "getThin$annotations", "ExtraLight", "getExtraLight", "getExtraLight$annotations", "Light", "getLight", "getLight$annotations", "Normal", "getNormal", "getNormal$annotations", "Medium", "getMedium", "getMedium$annotations", "SemiBold", "getSemiBold", "getSemiBold$annotations", "Bold", "getBold", "getBold$annotations", "ExtraBold", "getExtraBold", "getExtraBold$annotations", "Black", "getBlack", "getBlack$annotations", "", "values", "Ljava/util/List;", "getValues$ui_text_release", "()Ljava/util/List;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final FontWeight getBlack() {
            return FontWeight.s;
        }

        @Stable
        public static void getBlack$annotations() {
        }

        @NotNull
        public final FontWeight getBold() {
            return FontWeight.q;
        }

        @Stable
        public static void getBold$annotations() {
        }

        @NotNull
        public final FontWeight getExtraBold() {
            return FontWeight.r;
        }

        @Stable
        public static void getExtraBold$annotations() {
        }

        @NotNull
        public final FontWeight getExtraLight() {
            return FontWeight.l;
        }

        @Stable
        public static void getExtraLight$annotations() {
        }

        @NotNull
        public final FontWeight getLight() {
            return FontWeight.m;
        }

        @Stable
        public static void getLight$annotations() {
        }

        @NotNull
        public final FontWeight getMedium() {
            return FontWeight.o;
        }

        @Stable
        public static void getMedium$annotations() {
        }

        @NotNull
        public final FontWeight getNormal() {
            return FontWeight.n;
        }

        @Stable
        public static void getNormal$annotations() {
        }

        @NotNull
        public final FontWeight getSemiBold() {
            return FontWeight.p;
        }

        @Stable
        public static void getSemiBold$annotations() {
        }

        @NotNull
        public final FontWeight getThin() {
            return FontWeight.k;
        }

        @Stable
        public static void getThin$annotations() {
        }

        @NotNull
        public final List getValues$ui_text_release() {
            return FontWeight.t;
        }

        @NotNull
        public final FontWeight getW100() {
            return FontWeight.b;
        }

        @Stable
        public static void getW100$annotations() {
        }

        @NotNull
        public final FontWeight getW200() {
            return FontWeight.c;
        }

        @Stable
        public static void getW200$annotations() {
        }

        @NotNull
        public final FontWeight getW300() {
            return FontWeight.d;
        }

        @Stable
        public static void getW300$annotations() {
        }

        @NotNull
        public final FontWeight getW400() {
            return FontWeight.e;
        }

        @Stable
        public static void getW400$annotations() {
        }

        @NotNull
        public final FontWeight getW500() {
            return FontWeight.f;
        }

        @Stable
        public static void getW500$annotations() {
        }

        @NotNull
        public final FontWeight getW600() {
            return FontWeight.g;
        }

        @Stable
        public static void getW600$annotations() {
        }

        @NotNull
        public final FontWeight getW700() {
            return FontWeight.h;
        }

        @Stable
        public static void getW700$annotations() {
        }

        @NotNull
        public final FontWeight getW800() {
            return FontWeight.i;
        }

        @Stable
        public static void getW800$annotations() {
        }

        @NotNull
        public final FontWeight getW900() {
            return FontWeight.j;
        }

        @Stable
        public static void getW900$annotations() {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final int a;
    public static final FontWeight b;
    public static final FontWeight c;
    public static final FontWeight d;
    public static final FontWeight e;
    public static final FontWeight f;
    public static final FontWeight g;
    public static final FontWeight h;
    public static final FontWeight i;
    public static final FontWeight j;
    public static final FontWeight k;
    public static final FontWeight l;
    public static final FontWeight m;
    public static final FontWeight n;
    public static final FontWeight o;
    public static final FontWeight p;
    public static final FontWeight q;
    public static final FontWeight r;
    public static final FontWeight s;
    public static final List t;

    static {
        FontWeight.Companion = new Companion(null);
        FontWeight fontWeight0 = new FontWeight(100);
        FontWeight.b = fontWeight0;
        FontWeight fontWeight1 = new FontWeight(200);
        FontWeight.c = fontWeight1;
        FontWeight fontWeight2 = new FontWeight(300);
        FontWeight.d = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(400);
        FontWeight.e = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(500);
        FontWeight.f = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(600);
        FontWeight.g = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(700);
        FontWeight.h = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(800);
        FontWeight.i = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(900);
        FontWeight.j = fontWeight8;
        FontWeight.k = fontWeight0;
        FontWeight.l = fontWeight1;
        FontWeight.m = fontWeight2;
        FontWeight.n = fontWeight3;
        FontWeight.o = fontWeight4;
        FontWeight.p = fontWeight5;
        FontWeight.q = fontWeight6;
        FontWeight.r = fontWeight7;
        FontWeight.s = fontWeight8;
        FontWeight.t = CollectionsKt__CollectionsKt.listOf(new FontWeight[]{fontWeight0, fontWeight1, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8});
    }

    public FontWeight(int v) {
        this.a = v;
        if(1 > v || v >= 1001) {
            throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + v).toString());
        }
    }

    public int compareTo(@NotNull FontWeight fontWeight0) {
        return Intrinsics.compare(this.a, fontWeight0.a);
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo(((FontWeight)object0));
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FontWeight ? this.a == ((FontWeight)object0).a : false;
    }

    public final int getWeight() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        return b.p(new StringBuilder("FontWeight(weight="), this.a, ')');
    }
}

