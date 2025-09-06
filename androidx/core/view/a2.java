package androidx.core.view;

import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.animation.Interpolator;

public abstract class a2 extends g2 {
    public final Window a;
    public final SoftwareKeyboardControllerCompat b;

    public a2(Window window0, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat0) {
        this.a = window0;
        this.b = softwareKeyboardControllerCompat0;
    }

    @Override  // androidx.core.view.g2
    public final void a(OnControllableInsetsChangedListener windowInsetsControllerCompat$OnControllableInsetsChangedListener0) {
    }

    @Override  // androidx.core.view.g2
    public final void b(int v, long v1, Interpolator interpolator0, CancellationSignal cancellationSignal0, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat0) {
    }

    @Override  // androidx.core.view.g2
    public final int c() {
        return 0;
    }

    @Override  // androidx.core.view.g2
    public final void d(int v) {
        for(int v1 = 1; v1 <= 0x100; v1 <<= 1) {
            if((v & v1) != 0) {
                switch(v1) {
                    case 1: {
                        this.l(4);
                        break;
                    }
                    case 2: {
                        this.l(2);
                        break;
                    }
                    case 8: {
                        this.b.hide();
                    }
                }
            }
        }
    }

    @Override  // androidx.core.view.g2
    public final void g(OnControllableInsetsChangedListener windowInsetsControllerCompat$OnControllableInsetsChangedListener0) {
    }

    @Override  // androidx.core.view.g2
    public final void j(int v) {
        switch(v) {
            case 0: {
                this.m(0x1800);
                return;
            }
            case 1: {
                this.m(0x1000);
                this.l(0x800);
                return;
            }
            case 2: {
                this.m(0x800);
                this.l(0x1000);
            }
        }
    }

    @Override  // androidx.core.view.g2
    public final void k(int v) {
        for(int v1 = 1; v1 <= 0x100; v1 <<= 1) {
            if((v & v1) != 0) {
                switch(v1) {
                    case 1: {
                        this.m(4);
                        this.a.clearFlags(0x400);
                        break;
                    }
                    case 2: {
                        this.m(2);
                        break;
                    }
                    case 8: {
                        this.b.show();
                    }
                }
            }
        }
    }

    public final void l(int v) {
        View view0 = this.a.getDecorView();
        view0.setSystemUiVisibility(v | view0.getSystemUiVisibility());
    }

    public final void m(int v) {
        View view0 = this.a.getDecorView();
        view0.setSystemUiVisibility(~v & view0.getSystemUiVisibility());
    }
}

