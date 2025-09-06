package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u001B\u0010\u0005\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001A\u0010\t\u001A\u00020\u00062\u0006\u0010\u0002\u001A\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\r\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u0011\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0015\u001A\u00020\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u0088\u0001\u0017\u0092\u0001\u00020\u000E\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides;", "", "sides", "plus-gK_yJZ4", "(II)I", "plus", "", "hasAny-bkgdKaI$foundation_layout_release", "(II)Z", "hasAny", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", "hashCode", "other", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "value", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class WindowInsetsSides {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001B\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001A\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R \u0010\t\u001A\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006R \u0010\u000B\u001A\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u001D\u0010\r\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0004\u001A\u0004\b\u000E\u0010\u0006R\u001D\u0010\u000F\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000F\u0010\u0004\u001A\u0004\b\u0010\u0010\u0006R\u001D\u0010\u0011\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001A\u0004\b\u0012\u0010\u0006R\u001D\u0010\u0013\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001A\u0004\b\u0014\u0010\u0006R\u001D\u0010\u0015\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001A\u0004\b\u0016\u0010\u0006R\u001D\u0010\u0017\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001A\u0004\b\u0018\u0010\u0006R\u001D\u0010\u0019\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001A\u0004\b\u001A\u0010\u0006R\u001D\u0010\u001B\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001B\u0010\u0004\u001A\u0004\b\u001C\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001D"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides$Companion;", "", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "AllowLeftInLtr", "I", "getAllowLeftInLtr-JoeWqyM$foundation_layout_release", "()I", "AllowRightInLtr", "getAllowRightInLtr-JoeWqyM$foundation_layout_release", "AllowLeftInRtl", "getAllowLeftInRtl-JoeWqyM$foundation_layout_release", "AllowRightInRtl", "getAllowRightInRtl-JoeWqyM$foundation_layout_release", "Start", "getStart-JoeWqyM", "End", "getEnd-JoeWqyM", "Top", "getTop-JoeWqyM", "Bottom", "getBottom-JoeWqyM", "Left", "getLeft-JoeWqyM", "Right", "getRight-JoeWqyM", "Horizontal", "getHorizontal-JoeWqyM", "Vertical", "getVertical-JoeWqyM", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getAllowLeftInLtr-JoeWqyM$foundation_layout_release() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getAllowLeftInRtl-JoeWqyM$foundation_layout_release() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getAllowRightInLtr-JoeWqyM$foundation_layout_release() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getAllowRightInRtl-JoeWqyM$foundation_layout_release() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getBottom-JoeWqyM() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getEnd-JoeWqyM() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getHorizontal-JoeWqyM() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getLeft-JoeWqyM() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getRight-JoeWqyM() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getStart-JoeWqyM() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getTop-JoeWqyM() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getVertical-JoeWqyM() [...] // 潜在的解密器
    }

    @NotNull
    public static final Companion Companion;
    public final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;

    static {
        WindowInsetsSides.Companion = new Companion(null);
        WindowInsetsSides.b = 8;
        WindowInsetsSides.c = 4;
        WindowInsetsSides.d = 2;
        WindowInsetsSides.e = 1;
        WindowInsetsSides.f = 9;
        WindowInsetsSides.g = 6;
        WindowInsetsSides.h = 16;
        WindowInsetsSides.i = 0x20;
        WindowInsetsSides.j = 10;
        WindowInsetsSides.k = 5;
        WindowInsetsSides.l = 15;
        WindowInsetsSides.m = 0x30;
    }

    public WindowInsetsSides(int v) {
        this.a = v;
    }

    public static final void a(StringBuilder stringBuilder0, String s) {
        if(stringBuilder0.length() > 0) {
            stringBuilder0.append('+');
        }
        stringBuilder0.append(s);
    }

    public static final int access$getAllowLeftInLtr$cp() [...] // 潜在的解密器

    public static final int access$getAllowLeftInRtl$cp() [...] // 潜在的解密器

    public static final int access$getAllowRightInLtr$cp() [...] // 潜在的解密器

    public static final int access$getAllowRightInRtl$cp() [...] // 潜在的解密器

    public static final int access$getBottom$cp() [...] // 潜在的解密器

    public static final int access$getEnd$cp() [...] // 潜在的解密器

    public static final int access$getHorizontal$cp() [...] // 潜在的解密器

    public static final int access$getLeft$cp() [...] // 潜在的解密器

    public static final int access$getRight$cp() [...] // 潜在的解密器

    public static final int access$getStart$cp() [...] // 潜在的解密器

    public static final int access$getTop$cp() [...] // 潜在的解密器

    public static final int access$getVertical$cp() [...] // 潜在的解密器

    public static final WindowInsetsSides box-impl(int v) {
        return new WindowInsetsSides(v);
    }

    @Override
    public boolean equals(Object object0) {
        return WindowInsetsSides.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof WindowInsetsSides ? v == ((WindowInsetsSides)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    public static final boolean hasAny-bkgdKaI$foundation_layout_release(int v, int v1) {
        return (v & v1) != 0;
    }

    @Override
    public int hashCode() {
        return WindowInsetsSides.hashCode-impl(this.a);
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    public static final int plus-gK_yJZ4(int v, int v1) [...] // 潜在的解密器

    @Override
    @NotNull
    public String toString() {
        return WindowInsetsSides.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(int v) {
        StringBuilder stringBuilder0 = new StringBuilder("WindowInsetsSides(");
        StringBuilder stringBuilder1 = new StringBuilder();
        if((v & WindowInsetsSides.f) == WindowInsetsSides.f) {
            WindowInsetsSides.a(stringBuilder1, "Start");
        }
        if((v & WindowInsetsSides.j) == WindowInsetsSides.j) {
            WindowInsetsSides.a(stringBuilder1, "Left");
        }
        if((v & WindowInsetsSides.h) == WindowInsetsSides.h) {
            WindowInsetsSides.a(stringBuilder1, "Top");
        }
        if((v & WindowInsetsSides.g) == WindowInsetsSides.g) {
            WindowInsetsSides.a(stringBuilder1, "End");
        }
        if((v & WindowInsetsSides.k) == WindowInsetsSides.k) {
            WindowInsetsSides.a(stringBuilder1, "Right");
        }
        if((v & WindowInsetsSides.i) == WindowInsetsSides.i) {
            WindowInsetsSides.a(stringBuilder1, "Bottom");
        }
        String s = stringBuilder1.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        stringBuilder0.append(s);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }

    public final int unbox-impl() {
        return this.a;
    }
}

