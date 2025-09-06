package androidx.compose.ui.text.font;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001A\u0010\u0010\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000E\u0010\u000FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/font/FontStyle;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "a", "I", "getValue", "()I", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class FontStyle {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R#\u0010\u0006\u001A\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000B\u001A\u0004\b\b\u0010\tR#\u0010\f\u001A\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u0012\u0004\b\u000E\u0010\u000B\u001A\u0004\b\r\u0010\t\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/text/font/FontStyle$Companion;", "", "", "Landroidx/compose/ui/text/font/FontStyle;", "values", "()Ljava/util/List;", "Normal", "I", "getNormal-_-LCdwA", "()I", "getNormal-_-LCdwA$annotations", "()V", "Italic", "getItalic-_-LCdwA", "getItalic-_-LCdwA$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getItalic-_-LCdwA() [...] // 潜在的解密器

        public static void getItalic-_-LCdwA$annotations() {
        }

        // 去混淆评级： 低(20)
        public final int getNormal-_-LCdwA() [...] // 潜在的解密器

        public static void getNormal-_-LCdwA$annotations() {
        }

        // 去混淆评级： 低(40)
        @NotNull
        public final List values() {
            return CollectionsKt__CollectionsKt.listOf(new FontStyle[]{FontStyle.box-impl(0), FontStyle.box-impl(1)});
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int a;
    public static final int b;
    public static final int c;

    static {
        FontStyle.Companion = new Companion(null);
        FontStyle.b = 0;
        FontStyle.c = 1;
    }

    public FontStyle(int v) {
        this.a = v;
    }

    public static final int access$getItalic$cp() [...] // 潜在的解密器

    public static final int access$getNormal$cp() [...] // 潜在的解密器

    public static final FontStyle box-impl(int v) {
        return new FontStyle(v);
    }

    @Deprecated(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @ReplaceWith(expression = "FontStyle.", imports = {}))
    public static int constructor-impl(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return FontStyle.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof FontStyle ? v == ((FontStyle)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    public final int getValue() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return FontStyle.hashCode-impl(this.a);
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    @Override
    @NotNull
    public String toString() {
        return FontStyle.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(int v) {
        if(FontStyle.equals-impl0(v, 0)) {
            return "Normal";
        }
        return FontStyle.equals-impl0(v, 1) ? "Italic" : "Invalid";
    }

    public final int unbox-impl() {
        return this.a;
    }
}

