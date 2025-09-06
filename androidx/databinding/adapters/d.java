package androidx.databinding.adapters;

import android.widget.SearchView.OnSuggestionListener;

public final class d implements SearchView.OnSuggestionListener {
    public final OnSuggestionSelect a;
    public final OnSuggestionClick b;

    public d(OnSuggestionSelect searchViewBindingAdapter$OnSuggestionSelect0, OnSuggestionClick searchViewBindingAdapter$OnSuggestionClick0) {
        this.a = searchViewBindingAdapter$OnSuggestionSelect0;
        this.b = searchViewBindingAdapter$OnSuggestionClick0;
    }

    @Override  // android.widget.SearchView$OnSuggestionListener
    public final boolean onSuggestionClick(int v) {
        return this.b == null ? false : this.b.onSuggestionClick(v);
    }

    @Override  // android.widget.SearchView$OnSuggestionListener
    public final boolean onSuggestionSelect(int v) {
        return this.a == null ? false : this.a.onSuggestionSelect(v);
    }
}

