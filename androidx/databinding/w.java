package androidx.databinding;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class w extends WeakReference {
    public final ObservableReference a;
    public final int b;
    public Object c;

    public w(ViewDataBinding viewDataBinding0, int v, ObservableReference observableReference0, ReferenceQueue referenceQueue0) {
        super(viewDataBinding0, referenceQueue0);
        this.b = v;
        this.a = observableReference0;
    }

    public final ViewDataBinding a() {
        ViewDataBinding viewDataBinding0 = (ViewDataBinding)this.get();
        if(viewDataBinding0 == null) {
            this.b();
        }
        return viewDataBinding0;
    }

    public final boolean b() {
        boolean z;
        Object object0 = this.c;
        if(object0 == null) {
            z = false;
        }
        else {
            this.a.removeListener(object0);
            z = true;
        }
        this.c = null;
        return z;
    }
}

