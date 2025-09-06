package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u000F2\u00020\u0001:\u0001\u000FJ\u000F\u0010\u0005\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000E\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u0010\u0092\u0001\u00020\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventType;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "value", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class PointerEventType {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006R\u001D\u0010\u000B\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u001D\u0010\r\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0004\u001A\u0004\b\u000E\u0010\u0006R\u001D\u0010\u000F\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000F\u0010\u0004\u001A\u0004\b\u0010\u0010\u0006R\u001D\u0010\u0011\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001A\u0004\b\u0012\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventType$Companion;", "", "Landroidx/compose/ui/input/pointer/PointerEventType;", "Unknown", "I", "getUnknown-7fucELk", "()I", "Press", "getPress-7fucELk", "Release", "getRelease-7fucELk", "Move", "getMove-7fucELk", "Enter", "getEnter-7fucELk", "Exit", "getExit-7fucELk", "Scroll", "getScroll-7fucELk", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getEnter-7fucELk() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getExit-7fucELk() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getMove-7fucELk() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getPress-7fucELk() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getRelease-7fucELk() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getScroll-7fucELk() [...] // 潜在的解密器

        public final int getUnknown-7fucELk() [...] // 潜在的解密器
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
        PointerEventType.Companion = new Companion(null);
        PointerEventType.b = 1;
        PointerEventType.c = 2;
        PointerEventType.d = 3;
        PointerEventType.e = 4;
        PointerEventType.f = 5;
        PointerEventType.g = 6;
    }

    public PointerEventType(int v) {
        this.a = v;
    }

    public static final int access$getEnter$cp() [...] // 潜在的解密器

    public static final int access$getExit$cp() [...] // 潜在的解密器

    public static final int access$getMove$cp() [...] // 潜在的解密器

    public static final int access$getPress$cp() [...] // 潜在的解密器

    public static final int access$getRelease$cp() [...] // 潜在的解密器

    public static final int access$getScroll$cp() [...] // 潜在的解密器

    public static final int access$getUnknown$cp() [...] // Inlined contents

    public static final PointerEventType box-impl(int v) {
        return new PointerEventType(v);
    }

    @Override
    public boolean equals(Object object0) {
        return PointerEventType.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof PointerEventType ? v == ((PointerEventType)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return PointerEventType.hashCode-impl(this.a);
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    @Override
    @NotNull
    public String toString() {
        return PointerEventType.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(int v) {
        if(PointerEventType.equals-impl0(v, PointerEventType.b)) {
            return "Press";
        }
        if(PointerEventType.equals-impl0(v, PointerEventType.c)) {
            return "Release";
        }
        if(PointerEventType.equals-impl0(v, PointerEventType.d)) {
            return "Move";
        }
        if(PointerEventType.equals-impl0(v, PointerEventType.e)) {
            return "Enter";
        }
        if(PointerEventType.equals-impl0(v, 5)) {
            return "Exit";
        }
        return PointerEventType.equals-impl0(v, PointerEventType.g) ? "Scroll" : "Unknown";
    }

    public final int unbox-impl() {
        return this.a;
    }
}

