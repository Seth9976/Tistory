package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000B\u0010\u0006J\u001A\u0010\u0011\u001A\u00020\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000F\u0010\u0010\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "", "", "Landroidx/compose/ui/input/pointer/NativePointerKeyboardModifiers;", "packedValue", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class PointerKeyboardModifiers {
    public final int a;

    public PointerKeyboardModifiers(int v) {
        this.a = v;
    }

    public static final PointerKeyboardModifiers box-impl(int v) {
        return new PointerKeyboardModifiers(v);
    }

    public static int constructor-impl(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return PointerKeyboardModifiers.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof PointerKeyboardModifiers ? v == ((PointerKeyboardModifiers)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return PointerKeyboardModifiers.hashCode-impl(this.a);
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    @Override
    public String toString() {
        return PointerKeyboardModifiers.toString-impl(this.a);
    }

    public static String toString-impl(int v) {
        return "PointerKeyboardModifiers(packedValue=" + v + ')';
    }

    public final int unbox-impl() {
        return this.a;
    }
}

