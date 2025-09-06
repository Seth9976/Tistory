package androidx.compose.ui.platform;

import a2.b;
import androidx.compose.runtime.collection.MutableVector;
import java.lang.ref.WeakReference;

public final class c1 {
    public final PlatformTextInputMethodRequest a;
    public final b b;
    public final Object c;
    public final MutableVector d;
    public boolean e;

    public c1(PlatformTextInputMethodRequest platformTextInputMethodRequest0, b b0) {
        this.a = platformTextInputMethodRequest0;
        this.b = b0;
        this.c = new Object();
        this.d = new MutableVector(new WeakReference[16], 0);
    }
}

