package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001A\u0010\u0010\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000E\u0010\u000F\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class TextDirection {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006R\u001D\u0010\u000B\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u001D\u0010\r\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0004\u001A\u0004\b\u000E\u0010\u0006R\u001D\u0010\u000F\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000F\u0010\u0004\u001A\u0004\b\u0010\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection$Companion;", "", "Landroidx/compose/ui/text/style/TextDirection;", "Ltr", "I", "getLtr-s_7X-co", "()I", "Rtl", "getRtl-s_7X-co", "Content", "getContent-s_7X-co", "ContentOrLtr", "getContentOrLtr-s_7X-co", "ContentOrRtl", "getContentOrRtl-s_7X-co", "Unspecified", "getUnspecified-s_7X-co", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getContent-s_7X-co() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getContentOrLtr-s_7X-co() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getContentOrRtl-s_7X-co() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getLtr-s_7X-co() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getRtl-s_7X-co() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getUnspecified-s_7X-co() [...] // 潜在的解密器
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

    static {
        TextDirection.Companion = new Companion(null);
        TextDirection.b = 1;
        TextDirection.c = 2;
        TextDirection.d = 3;
        TextDirection.e = 4;
        TextDirection.f = 5;
        TextDirection.g = 0x80000000;
    }

    public TextDirection(int v) {
        this.a = v;
    }

    public static final int access$getContent$cp() [...] // 潜在的解密器

    public static final int access$getContentOrLtr$cp() [...] // 潜在的解密器

    public static final int access$getContentOrRtl$cp() [...] // 潜在的解密器

    public static final int access$getLtr$cp() [...] // 潜在的解密器

    public static final int access$getRtl$cp() [...] // 潜在的解密器

    public static final int access$getUnspecified$cp() [...] // 潜在的解密器

    public static final TextDirection box-impl(int v) {
        return new TextDirection(v);
    }

    public static int constructor-impl(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return TextDirection.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof TextDirection ? v == ((TextDirection)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return TextDirection.hashCode-impl(this.a);
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    @Override
    @NotNull
    public String toString() {
        return TextDirection.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(int v) {
        if(TextDirection.equals-impl0(v, TextDirection.b)) {
            return "Ltr";
        }
        if(TextDirection.equals-impl0(v, TextDirection.c)) {
            return "Rtl";
        }
        if(TextDirection.equals-impl0(v, TextDirection.d)) {
            return "Content";
        }
        if(TextDirection.equals-impl0(v, TextDirection.e)) {
            return "ContentOrLtr";
        }
        if(TextDirection.equals-impl0(v, TextDirection.f)) {
            return "ContentOrRtl";
        }
        return TextDirection.equals-impl0(v, 0x80000000) ? "Unspecified" : "Invalid";
    }

    public final int unbox-impl() {
        return this.a;
    }
}

