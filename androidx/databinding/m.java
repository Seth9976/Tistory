package androidx.databinding;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class m implements ObservableReference, Observer {
    public final w a;
    public WeakReference b;

    public m(ViewDataBinding viewDataBinding0, int v, ReferenceQueue referenceQueue0) {
        this.b = null;
        this.a = new w(viewDataBinding0, v, this, referenceQueue0);
    }

    @Override  // androidx.databinding.ObservableReference
    public final void addListener(Object object0) {
        LifecycleOwner lifecycleOwner0 = this.b == null ? null : ((LifecycleOwner)this.b.get());
        if(lifecycleOwner0 != null) {
            ((LiveData)object0).observe(lifecycleOwner0, this);
        }
    }

    @Override  // androidx.databinding.ObservableReference
    public final w getListener() {
        return this.a;
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        w w0 = this.a;
        ViewDataBinding viewDataBinding0 = w0.a();
        if(viewDataBinding0 != null) {
            viewDataBinding0.handleFieldChange(w0.b, w0.c, 0);
        }
    }

    @Override  // androidx.databinding.ObservableReference
    public final void removeListener(Object object0) {
        ((LiveData)object0).removeObserver(this);
    }

    @Override  // androidx.databinding.ObservableReference
    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner0) {
        LifecycleOwner lifecycleOwner1 = this.b == null ? null : ((LifecycleOwner)this.b.get());
        LiveData liveData0 = (LiveData)this.a.c;
        if(liveData0 != null) {
            if(lifecycleOwner1 != null) {
                liveData0.removeObserver(this);
            }
            if(lifecycleOwner0 != null) {
                liveData0.observe(lifecycleOwner0, this);
            }
        }
        if(lifecycleOwner0 != null) {
            this.b = new WeakReference(lifecycleOwner0);
        }
    }
}

