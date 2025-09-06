package androidx.databinding.adapters;

import android.widget.SearchView.OnQueryTextListener;

public final class c implements SearchView.OnQueryTextListener {
    public final OnQueryTextSubmit a;
    public final OnQueryTextChange b;

    public c(OnQueryTextSubmit searchViewBindingAdapter$OnQueryTextSubmit0, OnQueryTextChange searchViewBindingAdapter$OnQueryTextChange0) {
        this.a = searchViewBindingAdapter$OnQueryTextSubmit0;
        this.b = searchViewBindingAdapter$OnQueryTextChange0;
    }

    @Override  // android.widget.SearchView$OnQueryTextListener
    public final boolean onQueryTextChange(String s) {
        return this.b == null ? false : this.b.onQueryTextChange(s);
    }

    @Override  // android.widget.SearchView$OnQueryTextListener
    public final boolean onQueryTextSubmit(String s) {
        return this.a == null ? false : this.a.onQueryTextSubmit(s);
    }
}

