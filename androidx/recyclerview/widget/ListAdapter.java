package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public abstract class ListAdapter extends Adapter {
    public final AsyncListDiffer g;

    public ListAdapter(@NonNull AsyncDifferConfig asyncDifferConfig0) {
        t0 t00 = new t0(this);
        AsyncListDiffer asyncListDiffer0 = new AsyncListDiffer(new AdapterListUpdateCallback(this), asyncDifferConfig0);
        this.g = asyncListDiffer0;
        asyncListDiffer0.addListListener(t00);
    }

    public ListAdapter(@NonNull ItemCallback diffUtil$ItemCallback0) {
        t0 t00 = new t0(this);
        AsyncListDiffer asyncListDiffer0 = new AsyncListDiffer(new AdapterListUpdateCallback(this), new Builder(diffUtil$ItemCallback0).build());
        this.g = asyncListDiffer0;
        asyncListDiffer0.addListListener(t00);
    }

    @NonNull
    public List getCurrentList() {
        return this.g.getCurrentList();
    }

    public Object getItem(int v) {
        return this.g.getCurrentList().get(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.g.getCurrentList().size();
    }

    public void onCurrentListChanged(@NonNull List list0, @NonNull List list1) {
    }

    public void submitList(@Nullable List list0) {
        this.g.submitList(list0);
    }

    public void submitList(@Nullable List list0, @Nullable Runnable runnable0) {
        this.g.submitList(list0, runnable0);
    }
}

