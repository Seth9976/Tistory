package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u000F2\u00020\u0001:\u0001\u000FJ\u000F\u0010\u0005\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000E\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u0010\u0092\u0001\u00020\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerType;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "Companion", "value", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class PointerType {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006R\u001D\u0010\t\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0004\u001A\u0004\b\n\u0010\u0006R\u001D\u0010\u000B\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000B\u0010\u0004\u001A\u0004\b\f\u0010\u0006R\u001D\u0010\r\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0004\u001A\u0004\b\u000E\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerType$Companion;", "", "Landroidx/compose/ui/input/pointer/PointerType;", "Unknown", "I", "getUnknown-T8wyACA", "()I", "Touch", "getTouch-T8wyACA", "Mouse", "getMouse-T8wyACA", "Stylus", "getStylus-T8wyACA", "Eraser", "getEraser-T8wyACA", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getEraser-T8wyACA() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getMouse-T8wyACA() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getStylus-T8wyACA() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getTouch-T8wyACA() [...] // 潜在的解密器

        public final int getUnknown-T8wyACA() [...] // 潜在的解密器
    }

    @NotNull
    public static final Companion Companion;
    public final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;

    static {
        PointerType.Companion = new Companion(null);
        PointerType.b = 1;
        PointerType.c = 2;
        PointerType.d = 3;
        PointerType.e = 4;
    }

    public PointerType(int v) {
        this.a = v;
    }

    public static final int access$getEraser$cp() [...] // 潜在的解密器

    public static final int access$getMouse$cp() [...] // 潜在的解密器

    public static final int access$getStylus$cp() [...] // 潜在的解密器

    public static final int access$getTouch$cp() [...] // 潜在的解密器

    public static final int access$getUnknown$cp() [...] // Inlined contents

    public static final PointerType box-impl(int v) {
        return new PointerType(v);
    }

    @Override
    public boolean equals(Object object0) {
        return PointerType.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof PointerType ? v == ((PointerType)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return PointerType.hashCode-impl(this.a);
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    @Override
    @NotNull
    public String toString() {
        return PointerType.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(int v) {
        switch(v) {
            case 1: {
                return "Touch";
            }
            case 2: {
                return "Mouse";
            }
            case 3: {
                return "Stylus";
            }
            case 4: {
                return "Eraser";
            }
            default: {
                return "Unknown";
            }
        }
    }

    public final int unbox-impl() {
        return this.a;
    }
}

