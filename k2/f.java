package k2;

import androidx.compose.runtime.State;

public final class f implements State {
    public final boolean a;

    public f(boolean z) {
        this.a = z;
    }

    @Override  // androidx.compose.runtime.State
    public final Object getValue() {
        return Boolean.valueOf(this.a);
    }
}

