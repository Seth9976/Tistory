package androidx.databinding;

import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.ReferenceQueue;

public final class o extends OnListChangedCallback implements ObservableReference {
    public final w a;

    public o(ViewDataBinding viewDataBinding0, int v, ReferenceQueue referenceQueue0) {
        this.a = new w(viewDataBinding0, v, this, referenceQueue0);
    }

    @Override  // androidx.databinding.ObservableReference
    public final void addListener(Object object0) {
        ((ObservableList)object0).addOnListChangedCallback(this);
    }

    @Override  // androidx.databinding.ObservableReference
    public final w getListener() {
        return this.a;
    }

    @Override  // androidx.databinding.ObservableList$OnListChangedCallback
    public final void onChanged(ObservableList observableList0) {
        w w0 = this.a;
        ViewDataBinding viewDataBinding0 = w0.a();
        if(viewDataBinding0 == null) {
            return;
        }
        ObservableList observableList1 = (ObservableList)w0.c;
        if(observableList1 != observableList0) {
            return;
        }
        viewDataBinding0.handleFieldChange(w0.b, observableList1, 0);
    }

    @Override  // androidx.databinding.ObservableList$OnListChangedCallback
    public final void onItemRangeChanged(ObservableList observableList0, int v, int v1) {
        this.onChanged(observableList0);
    }

    @Override  // androidx.databinding.ObservableList$OnListChangedCallback
    public final void onItemRangeInserted(ObservableList observableList0, int v, int v1) {
        this.onChanged(observableList0);
    }

    @Override  // androidx.databinding.ObservableList$OnListChangedCallback
    public final void onItemRangeMoved(ObservableList observableList0, int v, int v1, int v2) {
        this.onChanged(observableList0);
    }

    @Override  // androidx.databinding.ObservableList$OnListChangedCallback
    public final void onItemRangeRemoved(ObservableList observableList0, int v, int v1) {
        this.onChanged(observableList0);
    }

    @Override  // androidx.databinding.ObservableReference
    public final void removeListener(Object object0) {
        ((ObservableList)object0).removeOnListChangedCallback(this);
    }

    @Override  // androidx.databinding.ObservableReference
    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner0) {
    }
}

