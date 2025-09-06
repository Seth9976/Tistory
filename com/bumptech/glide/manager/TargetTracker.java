package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class TargetTracker implements LifecycleListener {
    public final Set a;

    public TargetTracker() {
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }

    public void clear() {
        this.a.clear();
    }

    @NonNull
    public List getAll() {
        return Util.getSnapshot(this.a);
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
        for(Object object0: Util.getSnapshot(this.a)) {
            ((Target)object0).onDestroy();
        }
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
        for(Object object0: Util.getSnapshot(this.a)) {
            ((Target)object0).onStart();
        }
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
        for(Object object0: Util.getSnapshot(this.a)) {
            ((Target)object0).onStop();
        }
    }

    public void track(@NonNull Target target0) {
        this.a.add(target0);
    }

    public void untrack(@NonNull Target target0) {
        this.a.remove(target0);
    }
}

