package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

public final class AdapterListUpdateCallback implements ListUpdateCallback {
    public final Adapter a;

    public AdapterListUpdateCallback(@NonNull Adapter recyclerView$Adapter0) {
        this.a = recyclerView$Adapter0;
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int v, int v1, Object object0) {
        this.a.notifyItemRangeChanged(v, v1, object0);
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int v, int v1) {
        this.a.notifyItemRangeInserted(v, v1);
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int v, int v1) {
        this.a.notifyItemMoved(v, v1);
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int v, int v1) {
        this.a.notifyItemRangeRemoved(v, v1);
    }
}

