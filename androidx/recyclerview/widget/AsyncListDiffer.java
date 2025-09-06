package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public class AsyncListDiffer {
    public interface ListListener {
        void onCurrentListChanged(@NonNull List arg1, @NonNull List arg2);
    }

    public final ListUpdateCallback a;
    public final AsyncDifferConfig b;
    public final Executor c;
    public final CopyOnWriteArrayList d;
    public List e;
    public List f;
    public int g;
    public static final f h;

    static {
        AsyncListDiffer.h = new f();
    }

    public AsyncListDiffer(@NonNull ListUpdateCallback listUpdateCallback0, @NonNull AsyncDifferConfig asyncDifferConfig0) {
        this.d = new CopyOnWriteArrayList();
        this.f = Collections.emptyList();
        this.a = listUpdateCallback0;
        this.b = asyncDifferConfig0;
        if(asyncDifferConfig0.getMainThreadExecutor() != null) {
            this.c = asyncDifferConfig0.getMainThreadExecutor();
            return;
        }
        this.c = AsyncListDiffer.h;
    }

    public AsyncListDiffer(@NonNull Adapter recyclerView$Adapter0, @NonNull ItemCallback diffUtil$ItemCallback0) {
        this(new AdapterListUpdateCallback(recyclerView$Adapter0), new Builder(diffUtil$ItemCallback0).build());
    }

    public final void a(List list0, Runnable runnable0) {
        for(Object object0: this.d) {
            ((ListListener)object0).onCurrentListChanged(list0, this.f);
        }
        if(runnable0 != null) {
            runnable0.run();
        }
    }

    public void addListListener(@NonNull ListListener asyncListDiffer$ListListener0) {
        this.d.add(asyncListDiffer$ListListener0);
    }

    @NonNull
    public List getCurrentList() {
        return this.f;
    }

    public void removeListListener(@NonNull ListListener asyncListDiffer$ListListener0) {
        this.d.remove(asyncListDiffer$ListListener0);
    }

    public void submitList(@Nullable List list0) {
        this.submitList(list0, null);
    }

    public void submitList(@Nullable List list0, @Nullable Runnable runnable0) {
        int v = this.g + 1;
        this.g = v;
        List list1 = this.e;
        if(list0 == list1) {
            if(runnable0 != null) {
                runnable0.run();
            }
            return;
        }
        List list2 = this.f;
        ListUpdateCallback listUpdateCallback0 = this.a;
        if(list0 == null) {
            this.e = null;
            this.f = Collections.emptyList();
            listUpdateCallback0.onRemoved(0, list1.size());
            this.a(list2, runnable0);
            return;
        }
        if(list1 == null) {
            this.e = list0;
            this.f = Collections.unmodifiableList(list0);
            listUpdateCallback0.onInserted(0, list0.size());
            this.a(list2, runnable0);
            return;
        }
        e e0 = new e(this, list1, list0, v, runnable0);
        this.b.getBackgroundThreadExecutor().execute(e0);
    }
}

