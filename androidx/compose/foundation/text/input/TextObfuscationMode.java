package androidx.compose.foundation.text.input;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001A\u0010\u0010\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000E\u0010\u000FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/text/input/TextObfuscationMode;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "a", "I", "getValue", "()I", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class TextObfuscationMode {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000B"}, d2 = {"Landroidx/compose/foundation/text/input/TextObfuscationMode$Companion;", "", "Landroidx/compose/foundation/text/input/TextObfuscationMode;", "Visible", "I", "getVisible-vTwcZD0", "()I", "RevealLastTyped", "getRevealLastTyped-vTwcZD0", "Hidden", "getHidden-vTwcZD0", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getHidden-vTwcZD0() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getRevealLastTyped-vTwcZD0() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getVisible-vTwcZD0() {
            return 0;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int a;
    public static final int b;
    public static final int c;
    public static final int d;

    static {
        TextObfuscationMode.Companion = new Companion(null);
        TextObfuscationMode.b = 0;
        TextObfuscationMode.c = 1;
        TextObfuscationMode.d = 2;
    }

    public TextObfuscationMode(int v) {
        this.a = v;
    }

    public static final int access$getHidden$cp() [...] // 潜在的解密器

    public static final int access$getRevealLastTyped$cp() [...] // 潜在的解密器

    public static final int access$getVisible$cp() [...] // 潜在的解密器

    public static final TextObfuscationMode box-impl(int v) {
        return new TextObfuscationMode(v);
    }

    public static int constructor-impl(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return TextObfuscationMode.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof TextObfuscationMode ? v == ((TextObfuscationMode)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    public final int getValue() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return TextObfuscationMode.hashCode-impl(this.a);
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    @Override
    public String toString() {
        return TextObfuscationMode.toString-impl(this.a);
    }

    public static String toString-impl(int v) {
        return "TextObfuscationMode(value=" + v + ')';
    }

    public final int unbox-impl() {
        return this.a;
    }
}

