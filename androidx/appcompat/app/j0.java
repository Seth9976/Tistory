package androidx.appcompat.app;

import android.view.KeyEvent;
import androidx.core.view.KeyEventDispatcher.Component;

public final class j0 implements Component {
    public final AppCompatDialog a;

    public j0(AppCompatDialog appCompatDialog0) {
        this.a = appCompatDialog0;
    }

    @Override  // androidx.core.view.KeyEventDispatcher$Component
    public final boolean superDispatchKeyEvent(KeyEvent keyEvent0) {
        return this.a.c(keyEvent0);
    }
}

