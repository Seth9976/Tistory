package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.view.menu.f;
import androidx.compose.foundation.layout.e4;
import java.util.concurrent.atomic.AtomicBoolean;

public final class y extends f {
    public View c;
    public WindowInsetsController d;

    @Override  // androidx.appcompat.view.menu.f
    public final void e() {
        WindowInsetsController windowInsetsController0 = this.d;
        View view0 = this.c;
        if(windowInsetsController0 == null) {
            windowInsetsController0 = view0 == null ? null : view0.getWindowInsetsController();
        }
        if(windowInsetsController0 != null) {
            AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
            x x0 = new x(atomicBoolean0);
            windowInsetsController0.addOnControllableInsetsChangedListener(x0);
            if(!atomicBoolean0.get() && view0 != null) {
                ((InputMethodManager)view0.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view0.getWindowToken(), 0);
            }
            windowInsetsController0.removeOnControllableInsetsChangedListener(x0);
            windowInsetsController0.hide(e4.b());
            return;
        }
        super.e();
    }

    @Override  // androidx.appcompat.view.menu.f
    public final void f() {
        View view0 = this.c;
        if(view0 != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager)view0.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController0 = this.d;
        if(windowInsetsController0 == null) {
            windowInsetsController0 = view0 == null ? null : view0.getWindowInsetsController();
        }
        if(windowInsetsController0 != null) {
            windowInsetsController0.show(e4.b());
        }
        super.f();
    }
}

