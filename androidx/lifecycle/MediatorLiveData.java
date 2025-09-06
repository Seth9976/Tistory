package androidx.lifecycle;

import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.Map.Entry;

public class MediatorLiveData extends MutableLiveData {
    public final SafeIterableMap o;

    public MediatorLiveData() {
        this.o = new SafeIterableMap();
    }

    public MediatorLiveData(Object object0) {
        super(object0);
        this.o = new SafeIterableMap();
    }

    @MainThread
    public void addSource(@NonNull LiveData liveData0, @NonNull Observer observer0) {
        if(liveData0 == null) {
            throw new NullPointerException("source cannot be null");
        }
        f0 f00 = new f0(liveData0, observer0);
        f0 f01 = (f0)this.o.putIfAbsent(liveData0, f00);
        if(f01 != null && f01.b != observer0) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if(f01 != null) {
            return;
        }
        if(this.hasActiveObservers()) {
            liveData0.observeForever(f00);
        }
    }

    @Override  // androidx.lifecycle.LiveData
    @CallSuper
    public void onActive() {
        for(Object object0: this.o) {
            f0 f00 = (f0)((Map.Entry)object0).getValue();
            f00.a.observeForever(f00);
        }
    }

    @Override  // androidx.lifecycle.LiveData
    @CallSuper
    public void onInactive() {
        for(Object object0: this.o) {
            f0 f00 = (f0)((Map.Entry)object0).getValue();
            f00.a.removeObserver(f00);
        }
    }

    @MainThread
    public void removeSource(@NonNull LiveData liveData0) {
        f0 f00 = (f0)this.o.remove(liveData0);
        if(f00 != null) {
            f00.a.removeObserver(f00);
        }
    }
}

