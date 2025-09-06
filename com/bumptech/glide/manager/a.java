package com.bumptech.glide.manager;

import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class a implements Lifecycle {
    public final Set a;
    public boolean b;
    public boolean c;

    public a() {
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }

    public final void a() {
        this.c = true;
        for(Object object0: Util.getSnapshot(this.a)) {
            ((LifecycleListener)object0).onDestroy();
        }
    }

    @Override  // com.bumptech.glide.manager.Lifecycle
    public final void addListener(LifecycleListener lifecycleListener0) {
        this.a.add(lifecycleListener0);
        if(this.c) {
            lifecycleListener0.onDestroy();
            return;
        }
        if(this.b) {
            lifecycleListener0.onStart();
            return;
        }
        lifecycleListener0.onStop();
    }

    @Override  // com.bumptech.glide.manager.Lifecycle
    public final void removeListener(LifecycleListener lifecycleListener0) {
        this.a.remove(lifecycleListener0);
    }
}

