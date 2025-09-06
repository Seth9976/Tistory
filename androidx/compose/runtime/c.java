package androidx.compose.runtime;

import kotlinx.coroutines.flow.Flow;

public final class c implements RecomposerInfo {
    public final Recomposer a;

    public c(Recomposer recomposer0) {
        this.a = recomposer0;
    }

    @Override  // androidx.compose.runtime.RecomposerInfo
    public final long getChangeCount() {
        return this.a.getChangeCount();
    }

    @Override  // androidx.compose.runtime.RecomposerInfo
    public final boolean getHasPendingWork() {
        return this.a.getHasPendingWork();
    }

    @Override  // androidx.compose.runtime.RecomposerInfo
    public final Flow getState() {
        return this.a.getCurrentState();
    }
}

