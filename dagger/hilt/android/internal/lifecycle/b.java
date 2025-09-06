package dagger.hilt.android.internal.lifecycle;

import java.io.Closeable;

public final class b implements Closeable {
    public final RetainedLifecycleImpl a;

    public b(RetainedLifecycleImpl retainedLifecycleImpl0) {
        this.a = retainedLifecycleImpl0;
    }

    @Override
    public final void close() {
        this.a.dispatchOnCleared();
    }
}

