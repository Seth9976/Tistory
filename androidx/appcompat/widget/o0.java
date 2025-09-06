package androidx.appcompat.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

public final class o0 implements ListAdapter, SpinnerAdapter {
    public SpinnerAdapter a;
    public ListAdapter b;

    @Override  // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return this.b == null ? true : this.b.areAllItemsEnabled();
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.a == null ? 0 : this.a.getCount();
    }

    @Override  // android.widget.SpinnerAdapter
    public final View getDropDownView(int v, View view0, ViewGroup viewGroup0) {
        return this.a == null ? null : this.a.getDropDownView(v, view0, viewGroup0);
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.a == null ? null : this.a.getItem(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return this.a == null ? -1L : this.a.getItemId(v);
    }

    @Override  // android.widget.Adapter
    public final int getItemViewType(int v) {
        return 0;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        return this.getDropDownView(v, view0, viewGroup0);
    }

    @Override  // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override  // android.widget.Adapter
    public final boolean hasStableIds() {
        return this.a != null && this.a.hasStableIds();
    }

    @Override  // android.widget.Adapter
    public final boolean isEmpty() {
        return this.getCount() == 0;
    }

    @Override  // android.widget.ListAdapter
    public final boolean isEnabled(int v) {
        return this.b == null ? true : this.b.isEnabled(v);
    }

    @Override  // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver0) {
        SpinnerAdapter spinnerAdapter0 = this.a;
        if(spinnerAdapter0 != null) {
            spinnerAdapter0.registerDataSetObserver(dataSetObserver0);
        }
    }

    @Override  // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver0) {
        SpinnerAdapter spinnerAdapter0 = this.a;
        if(spinnerAdapter0 != null) {
            spinnerAdapter0.unregisterDataSetObserver(dataSetObserver0);
        }
    }
}

