package y0;

import androidx.compose.runtime.ReusableRememberObserver;

public final class e implements ReusableRememberObserver {
    public final f a;

    public e(f f0) {
        this.a = f0;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        this.a.a();
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        this.a.a();
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
    }
}

