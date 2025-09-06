package androidx.databinding.adapters;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;

public final class h implements ViewGroup.OnHierarchyChangeListener {
    public final OnChildViewAdded a;
    public final OnChildViewRemoved b;

    public h(OnChildViewAdded viewGroupBindingAdapter$OnChildViewAdded0, OnChildViewRemoved viewGroupBindingAdapter$OnChildViewRemoved0) {
        this.a = viewGroupBindingAdapter$OnChildViewAdded0;
        this.b = viewGroupBindingAdapter$OnChildViewRemoved0;
    }

    @Override  // android.view.ViewGroup$OnHierarchyChangeListener
    public final void onChildViewAdded(View view0, View view1) {
        OnChildViewAdded viewGroupBindingAdapter$OnChildViewAdded0 = this.a;
        if(viewGroupBindingAdapter$OnChildViewAdded0 != null) {
            viewGroupBindingAdapter$OnChildViewAdded0.onChildViewAdded(view0, view1);
        }
    }

    @Override  // android.view.ViewGroup$OnHierarchyChangeListener
    public final void onChildViewRemoved(View view0, View view1) {
        OnChildViewRemoved viewGroupBindingAdapter$OnChildViewRemoved0 = this.b;
        if(viewGroupBindingAdapter$OnChildViewRemoved0 != null) {
            viewGroupBindingAdapter$OnChildViewRemoved0.onChildViewRemoved(view0, view1);
        }
    }
}

