package androidx.databinding;

import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.ReferenceQueue;

public final class q extends OnPropertyChangedCallback implements ObservableReference {
    public final w a;

    public q(ViewDataBinding viewDataBinding0, int v, ReferenceQueue referenceQueue0) {
        this.a = new w(viewDataBinding0, v, this, referenceQueue0);
    }

    @Override  // androidx.databinding.ObservableReference
    public final void addListener(Object object0) {
        ((Observable)object0).addOnPropertyChangedCallback(this);
    }

    @Override  // androidx.databinding.ObservableReference
    public final w getListener() {
        return this.a;
    }

    @Override  // androidx.databinding.Observable$OnPropertyChangedCallback
    public final void onPropertyChanged(Observable observable0, int v) {
        w w0 = this.a;
        ViewDataBinding viewDataBinding0 = w0.a();
        if(viewDataBinding0 == null) {
            return;
        }
        if(((Observable)w0.c) != observable0) {
            return;
        }
        viewDataBinding0.handleFieldChange(w0.b, observable0, v);
    }

    @Override  // androidx.databinding.ObservableReference
    public final void removeListener(Object object0) {
        ((Observable)object0).removeOnPropertyChangedCallback(this);
    }

    @Override  // androidx.databinding.ObservableReference
    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner0) {
    }
}

