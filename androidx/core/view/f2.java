package androidx.core.view;

import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController.OnControllableInsetsChangedListener;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import androidx.collection.SimpleArrayMap;

public final class f2 extends g2 {
    public final WindowInsetsControllerCompat a;
    public final WindowInsetsController b;
    public final SoftwareKeyboardControllerCompat c;
    public final SimpleArrayMap d;
    public Window e;

    public f2(WindowInsetsController windowInsetsController0, WindowInsetsControllerCompat windowInsetsControllerCompat0, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat0) {
        this.d = new SimpleArrayMap();
        this.b = windowInsetsController0;
        this.a = windowInsetsControllerCompat0;
        this.c = softwareKeyboardControllerCompat0;
    }

    @Override  // androidx.core.view.g2
    public final void a(OnControllableInsetsChangedListener windowInsetsControllerCompat$OnControllableInsetsChangedListener0) {
        SimpleArrayMap simpleArrayMap0 = this.d;
        if(simpleArrayMap0.containsKey(windowInsetsControllerCompat$OnControllableInsetsChangedListener0)) {
            return;
        }
        d2 d20 = new d2(this, windowInsetsControllerCompat$OnControllableInsetsChangedListener0);
        simpleArrayMap0.put(windowInsetsControllerCompat$OnControllableInsetsChangedListener0, d20);
        m1.o(this.b, d20);
    }

    @Override  // androidx.core.view.g2
    public final void b(int v, long v1, Interpolator interpolator0, CancellationSignal cancellationSignal0, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat0) {
        e2 e20 = new e2(windowInsetsAnimationControlListenerCompat0);
        m1.n(this.b, v, v1, interpolator0, cancellationSignal0, e20);
    }

    @Override  // androidx.core.view.g2
    public final int c() {
        return this.b.getSystemBarsBehavior();
    }

    @Override  // androidx.core.view.g2
    public final void d(int v) {
        if((v & 8) != 0) {
            this.c.hide();
        }
        this.b.hide(v & -9);
    }

    @Override  // androidx.core.view.g2
    public final boolean e() {
        m1.A(this.b);
        return (m1.d(this.b) & 16) != 0;
    }

    @Override  // androidx.core.view.g2
    public final boolean f() {
        m1.A(this.b);
        return (m1.d(this.b) & 8) != 0;
    }

    @Override  // androidx.core.view.g2
    public final void g(OnControllableInsetsChangedListener windowInsetsControllerCompat$OnControllableInsetsChangedListener0) {
        WindowInsetsController.OnControllableInsetsChangedListener windowInsetsController$OnControllableInsetsChangedListener0 = m1.g(this.d.remove(windowInsetsControllerCompat$OnControllableInsetsChangedListener0));
        if(windowInsetsController$OnControllableInsetsChangedListener0 != null) {
            this.b.removeOnControllableInsetsChangedListener(windowInsetsController$OnControllableInsetsChangedListener0);
        }
    }

    @Override  // androidx.core.view.g2
    public final void h(boolean z) {
        Window window0 = this.e;
        if(z) {
            if(window0 != null) {
                View view0 = window0.getDecorView();
                view0.setSystemUiVisibility(view0.getSystemUiVisibility() | 16);
            }
            m1.v(this.b);
            return;
        }
        if(window0 != null) {
            View view1 = window0.getDecorView();
            view1.setSystemUiVisibility(view1.getSystemUiVisibility() & -17);
        }
        m1.y(this.b);
    }

    @Override  // androidx.core.view.g2
    public final void i(boolean z) {
        Window window0 = this.e;
        if(z) {
            if(window0 != null) {
                View view0 = window0.getDecorView();
                view0.setSystemUiVisibility(view0.getSystemUiVisibility() | 0x2000);
            }
            c2.u(this.b);
            return;
        }
        if(window0 != null) {
            View view1 = window0.getDecorView();
            view1.setSystemUiVisibility(view1.getSystemUiVisibility() & 0xFFFFDFFF);
        }
        m1.l(this.b);
    }

    @Override  // androidx.core.view.g2
    public final void j(int v) {
        m1.m(this.b, v);
    }

    @Override  // androidx.core.view.g2
    public final void k(int v) {
        if((v & 8) != 0) {
            this.c.show();
        }
        this.b.show(v & -9);
    }
}

