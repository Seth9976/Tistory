package dagger.hilt.android.internal.lifecycle;

import androidx.annotation.NonNull;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.ThreadUtil;
import dagger.hilt.android.lifecycle.RetainedLifecycle.OnClearedListener;
import java.util.HashSet;

public final class RetainedLifecycleImpl implements ActivityRetainedLifecycle, ViewModelLifecycle {
    public final HashSet a;
    public boolean b;

    public RetainedLifecycleImpl() {
        this.a = new HashSet();
        this.b = false;
    }

    @Override  // dagger.hilt.android.lifecycle.RetainedLifecycle
    public void addOnClearedListener(@NonNull OnClearedListener retainedLifecycle$OnClearedListener0) {
        ThreadUtil.ensureMainThread();
        if(this.b) {
            throw new IllegalStateException("There was a race between the call to add/remove an OnClearedListener and onCleared(). This can happen when posting to the Main thread from a background thread, which is not supported.");
        }
        this.a.add(retainedLifecycle$OnClearedListener0);
    }

    public void dispatchOnCleared() {
        ThreadUtil.ensureMainThread();
        this.b = true;
        for(Object object0: this.a) {
            ((OnClearedListener)object0).onCleared();
        }
    }

    @Override  // dagger.hilt.android.lifecycle.RetainedLifecycle
    public void removeOnClearedListener(@NonNull OnClearedListener retainedLifecycle$OnClearedListener0) {
        ThreadUtil.ensureMainThread();
        if(this.b) {
            throw new IllegalStateException("There was a race between the call to add/remove an OnClearedListener and onCleared(). This can happen when posting to the Main thread from a background thread, which is not supported.");
        }
        this.a.remove(retainedLifecycle$OnClearedListener0);
    }
}

