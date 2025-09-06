package androidx.databinding;

import androidx.annotation.NonNull;
import androidx.core.util.Pools.SynchronizedPool;

public class ListChangeRegistry extends CallbackRegistry {
    public static final SynchronizedPool f;
    public static final c g;

    static {
        ListChangeRegistry.f = new SynchronizedPool(10);
        ListChangeRegistry.g = new c();  // 初始化器: Landroidx/databinding/CallbackRegistry$NotifierCallback;-><init>()V
    }

    public ListChangeRegistry() {
        super(ListChangeRegistry.g);
    }

    public static d f(int v, int v1, int v2) {
        d d0 = (d)ListChangeRegistry.f.acquire();
        if(d0 == null) {
            d0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        d0.a = v;
        d0.c = v1;
        d0.b = v2;
        return d0;
    }

    public void notifyCallbacks(@NonNull ObservableList observableList0, int v, d d0) {
        synchronized(this) {
            super.notifyCallbacks(observableList0, v, d0);
            if(d0 != null) {
                ListChangeRegistry.f.release(d0);
            }
        }
    }

    @Override  // androidx.databinding.CallbackRegistry
    public void notifyCallbacks(@NonNull Object object0, int v, Object object1) {
        this.notifyCallbacks(((ObservableList)object0), v, ((d)object1));
    }

    public void notifyChanged(@NonNull ObservableList observableList0) {
        this.notifyCallbacks(observableList0, 0, null);
    }

    public void notifyChanged(@NonNull ObservableList observableList0, int v, int v1) {
        this.notifyCallbacks(observableList0, 1, ListChangeRegistry.f(v, 0, v1));
    }

    public void notifyInserted(@NonNull ObservableList observableList0, int v, int v1) {
        this.notifyCallbacks(observableList0, 2, ListChangeRegistry.f(v, 0, v1));
    }

    public void notifyMoved(@NonNull ObservableList observableList0, int v, int v1, int v2) {
        this.notifyCallbacks(observableList0, 3, ListChangeRegistry.f(v, v1, v2));
    }

    public void notifyRemoved(@NonNull ObservableList observableList0, int v, int v1) {
        this.notifyCallbacks(observableList0, 4, ListChangeRegistry.f(v, 0, v1));
    }
}

