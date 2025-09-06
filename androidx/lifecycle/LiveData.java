package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.a;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap.IteratorWithAdditions;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.Map.Entry;

public abstract class LiveData {
    public final Object d;
    public final SafeIterableMap e;
    public int f;
    public boolean g;
    public volatile Object h;
    public volatile Object i;
    public int j;
    public boolean k;
    public boolean l;
    public final a m;
    public static final Object n;

    static {
        LiveData.n = new Object();
    }

    public LiveData() {
        this.d = new Object();
        this.e = new SafeIterableMap();
        this.f = 0;
        this.i = LiveData.n;
        this.m = new a(this, 4);
        this.h = LiveData.n;
        this.j = -1;
    }

    public LiveData(Object object0) {
        this.d = new Object();
        this.e = new SafeIterableMap();
        this.f = 0;
        this.i = LiveData.n;
        this.m = new a(this, 4);
        this.h = object0;
        this.j = 0;
    }

    public static void a(String s) {
        if(!ArchTaskExecutor.getInstance().isMainThread()) {
            throw new IllegalStateException("Cannot invoke " + s + " on a background thread");
        }
    }

    public final void b(c0 c00) {
        if(!c00.b) {
            return;
        }
        if(!c00.d()) {
            c00.a(false);
            return;
        }
        int v = this.j;
        if(c00.c >= v) {
            return;
        }
        c00.c = v;
        c00.a.onChanged(this.h);
    }

    public final void c(c0 c00) {
        if(this.k) {
            this.l = true;
            return;
        }
        this.k = true;
        do {
            this.l = false;
            if(c00 == null) {
                IteratorWithAdditions safeIterableMap$IteratorWithAdditions0 = this.e.iteratorWithAdditions();
                while(safeIterableMap$IteratorWithAdditions0.hasNext()) {
                    Object object0 = safeIterableMap$IteratorWithAdditions0.next();
                    this.b(((c0)((Map.Entry)object0).getValue()));
                    if(this.l) {
                        break;
                    }
                }
            }
            else {
                this.b(c00);
                c00 = null;
            }
        }
        while(this.l);
        this.k = false;
    }

    @Nullable
    public Object getValue() {
        return this.h == LiveData.n ? null : this.h;
    }

    public boolean hasActiveObservers() {
        return this.f > 0;
    }

    public boolean hasObservers() {
        return this.e.size() > 0;
    }

    public boolean isInitialized() {
        return this.h != LiveData.n;
    }

    @MainThread
    public void observe(@NonNull LifecycleOwner lifecycleOwner0, @NonNull Observer observer0) {
        LiveData.a("observe");
        if(lifecycleOwner0.getLifecycle().getCurrentState() == State.DESTROYED) {
            return;
        }
        b0 b00 = new b0(this, lifecycleOwner0, observer0);
        c0 c00 = (c0)this.e.putIfAbsent(observer0, b00);
        if(c00 != null && !c00.c(lifecycleOwner0)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if(c00 != null) {
            return;
        }
        lifecycleOwner0.getLifecycle().addObserver(b00);
    }

    @MainThread
    public void observeForever(@NonNull Observer observer0) {
        LiveData.a("observeForever");
        a0 a00 = new a0(this, observer0);  // 初始化器: Landroidx/lifecycle/c0;-><init>(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/Observer;)V
        c0 c00 = (c0)this.e.putIfAbsent(observer0, a00);
        if(c00 instanceof b0) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if(c00 != null) {
            return;
        }
        a00.a(true);
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(Object object0) {
        synchronized(this.d) {
            boolean z = this.i == LiveData.n;
            this.i = object0;
        }
        if(!z) {
            return;
        }
        ArchTaskExecutor.getInstance().postToMainThread(this.m);
    }

    @MainThread
    public void removeObserver(@NonNull Observer observer0) {
        LiveData.a("removeObserver");
        c0 c00 = (c0)this.e.remove(observer0);
        if(c00 == null) {
            return;
        }
        c00.b();
        c00.a(false);
    }

    @MainThread
    public void removeObservers(@NonNull LifecycleOwner lifecycleOwner0) {
        LiveData.a("removeObservers");
        for(Object object0: this.e) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((c0)map$Entry0.getValue()).c(lifecycleOwner0)) {
                this.removeObserver(((Observer)map$Entry0.getKey()));
            }
        }
    }

    @MainThread
    public void setValue(Object object0) {
        LiveData.a("setValue");
        ++this.j;
        this.h = object0;
        this.c(null);
    }
}

