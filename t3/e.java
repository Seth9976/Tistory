package t3;

import androidx.databinding.ObservableList.OnListChangedCallback;
import androidx.databinding.ObservableList;

public final class e extends OnListChangedCallback {
    public final f a;

    public e(f f0) {
        this.a = f0;
        super();
    }

    @Override  // androidx.databinding.ObservableList$OnListChangedCallback
    public final void onChanged(ObservableList observableList0) {
        this.a.notifyDataSetChanged();
    }

    @Override  // androidx.databinding.ObservableList$OnListChangedCallback
    public final void onItemRangeChanged(ObservableList observableList0, int v, int v1) {
        this.a.notifyDataSetChanged();
    }

    @Override  // androidx.databinding.ObservableList$OnListChangedCallback
    public final void onItemRangeInserted(ObservableList observableList0, int v, int v1) {
        this.a.notifyDataSetChanged();
    }

    @Override  // androidx.databinding.ObservableList$OnListChangedCallback
    public final void onItemRangeMoved(ObservableList observableList0, int v, int v1, int v2) {
        this.a.notifyDataSetChanged();
    }

    @Override  // androidx.databinding.ObservableList$OnListChangedCallback
    public final void onItemRangeRemoved(ObservableList observableList0, int v, int v1) {
        this.a.notifyDataSetChanged();
    }
}

