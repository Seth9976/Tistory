package androidx.compose.ui.input.key;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000E\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0013\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001B\u0010\u0004\u001A\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "nativeKeyEvent", "constructor-impl", "(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;", "", "toString-impl", "(Landroid/view/KeyEvent;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroid/view/KeyEvent;)I", "hashCode", "other", "", "equals-impl", "(Landroid/view/KeyEvent;Ljava/lang/Object;)Z", "equals", "a", "Landroid/view/KeyEvent;", "getNativeKeyEvent", "()Landroid/view/KeyEvent;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class KeyEvent {
    public final android.view.KeyEvent a;

    public KeyEvent(android.view.KeyEvent keyEvent0) {
        this.a = keyEvent0;
    }

    public static final KeyEvent box-impl(android.view.KeyEvent keyEvent0) {
        return new KeyEvent(keyEvent0);
    }

    @NotNull
    public static android.view.KeyEvent constructor-impl(@NotNull android.view.KeyEvent keyEvent0) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return KeyEvent.equals-impl(this.a, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(android.view.KeyEvent keyEvent0, Object object0) {
        return object0 instanceof KeyEvent ? Intrinsics.areEqual(keyEvent0, ((KeyEvent)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(android.view.KeyEvent keyEvent0, android.view.KeyEvent keyEvent1) {
        return Intrinsics.areEqual(keyEvent0, keyEvent1);
    }

    @NotNull
    public final android.view.KeyEvent getNativeKeyEvent() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return KeyEvent.hashCode-impl(this.a);
    }

    public static int hashCode-impl(android.view.KeyEvent keyEvent0) {
        return keyEvent0.hashCode();
    }

    @Override
    public String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }

    public static String toString-impl(android.view.KeyEvent keyEvent0) [...] // Inlined contents

    public final android.view.KeyEvent unbox-impl() {
        return this.a;
    }
}

