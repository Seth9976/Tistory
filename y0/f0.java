package y0;

import androidx.compose.runtime.RecomposerErrorInfo;

public final class f0 implements RecomposerErrorInfo {
    public final boolean a;
    public final Exception b;

    public f0(boolean z, Exception exception0) {
        this.a = z;
        this.b = exception0;
    }

    @Override  // androidx.compose.runtime.RecomposerErrorInfo
    public final Exception getCause() {
        return this.b;
    }

    @Override  // androidx.compose.runtime.RecomposerErrorInfo
    public final boolean getRecoverable() {
        return this.a;
    }
}

