package androidx.databinding;

import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.ReferenceQueue;

public final class p extends OnMapChangedCallback implements ObservableReference {
    public final w a;

    public p(ViewDataBinding viewDataBinding0, int v, ReferenceQueue referenceQueue0) {
        this.a = new w(viewDataBinding0, v, this, referenceQueue0);
    }

    @Override  // androidx.databinding.ObservableReference
    public final void addListener(Object object0) {
        ((ObservableMap)object0).addOnMapChangedCallback(this);
    }

    @Override  // androidx.databinding.ObservableReference
    public final w getListener() {
        return this.a;
    }

    @Override  // androidx.databinding.ObservableMap$OnMapChangedCallback
    public final void onMapChanged(ObservableMap observableMap0, Object object0) {
        w w0 = this.a;
        ViewDataBinding viewDataBinding0 = w0.a();
        if(viewDataBinding0 != null && observableMap0 == w0.c) {
            viewDataBinding0.handleFieldChange(w0.b, observableMap0, 0);
        }
    }

    @Override  // androidx.databinding.ObservableReference
    public final void removeListener(Object object0) {
        ((ObservableMap)object0).removeOnMapChangedCallback(this);
    }

    @Override  // androidx.databinding.ObservableReference
    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner0) {
    }
}

