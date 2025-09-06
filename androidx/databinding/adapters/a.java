package androidx.databinding.adapters;

import android.widget.AbsListView.OnScrollListener;
import android.widget.AbsListView;

public final class a implements AbsListView.OnScrollListener {
    public final OnScrollStateChanged a;
    public final OnScroll b;

    public a(OnScrollStateChanged absListViewBindingAdapter$OnScrollStateChanged0, OnScroll absListViewBindingAdapter$OnScroll0) {
        this.a = absListViewBindingAdapter$OnScrollStateChanged0;
        this.b = absListViewBindingAdapter$OnScroll0;
    }

    @Override  // android.widget.AbsListView$OnScrollListener
    public final void onScroll(AbsListView absListView0, int v, int v1, int v2) {
        OnScroll absListViewBindingAdapter$OnScroll0 = this.b;
        if(absListViewBindingAdapter$OnScroll0 != null) {
            absListViewBindingAdapter$OnScroll0.onScroll(absListView0, v, v1, v2);
        }
    }

    @Override  // android.widget.AbsListView$OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView0, int v) {
        OnScrollStateChanged absListViewBindingAdapter$OnScrollStateChanged0 = this.a;
        if(absListViewBindingAdapter$OnScrollStateChanged0 != null) {
            absListViewBindingAdapter$OnScrollStateChanged0.onScrollStateChanged(absListView0, v);
        }
    }
}

