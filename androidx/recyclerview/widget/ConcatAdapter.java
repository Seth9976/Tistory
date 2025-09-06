package androidx.recyclerview.widget;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import kotlin.text.q;

public final class ConcatAdapter extends Adapter {
    public static final class Config {
        public static final class Builder {
            public boolean a;
            public StableIdMode b;

            public Builder() {
                this.a = Config.DEFAULT.isolateViewTypes;
                this.b = Config.DEFAULT.stableIdMode;
            }

            @NonNull
            public Config build() {
                return new Config(this.a, this.b);
            }

            @NonNull
            public Builder setIsolateViewTypes(boolean z) {
                this.a = z;
                return this;
            }

            @NonNull
            public Builder setStableIdMode(@NonNull StableIdMode concatAdapter$Config$StableIdMode0) {
                this.b = concatAdapter$Config$StableIdMode0;
                return this;
            }
        }

        public static enum StableIdMode {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS;

        }

        @NonNull
        public static final Config DEFAULT;
        public final boolean isolateViewTypes;
        @NonNull
        public final StableIdMode stableIdMode;

        static {
            Config.DEFAULT = new Config(true, StableIdMode.NO_STABLE_IDS);
        }

        public Config(boolean z, StableIdMode concatAdapter$Config$StableIdMode0) {
            this.isolateViewTypes = z;
            this.stableIdMode = concatAdapter$Config$StableIdMode0;
        }
    }

    public final l g;

    public ConcatAdapter(@NonNull Config concatAdapter$Config0, @NonNull List list0) {
        this.g = new l(this, concatAdapter$Config0);
        for(Object object0: list0) {
            this.addAdapter(((Adapter)object0));
        }
        super.setHasStableIds(this.g.g != StableIdMode.NO_STABLE_IDS);
    }

    @SafeVarargs
    public ConcatAdapter(@NonNull Config concatAdapter$Config0, @NonNull Adapter[] arr_recyclerView$Adapter) {
        this(concatAdapter$Config0, Arrays.asList(arr_recyclerView$Adapter));
    }

    public ConcatAdapter(@NonNull List list0) {
        this(Config.DEFAULT, list0);
    }

    @SafeVarargs
    public ConcatAdapter(@NonNull Adapter[] arr_recyclerView$Adapter) {
        this(Config.DEFAULT, arr_recyclerView$Adapter);
    }

    public final void a(StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy0) {
        super.setStateRestorationPolicy(recyclerView$Adapter$StateRestorationPolicy0);
    }

    public boolean addAdapter(int v, @NonNull Adapter recyclerView$Adapter0) {
        return this.g.a(v, recyclerView$Adapter0);
    }

    public boolean addAdapter(@NonNull Adapter recyclerView$Adapter0) {
        return this.g.a(this.g.e.size(), recyclerView$Adapter0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int findRelativeAdapterPositionIn(@NonNull Adapter recyclerView$Adapter0, @NonNull ViewHolder recyclerView$ViewHolder0, int v) {
        l l0 = this.g;
        a1 a10 = (a1)l0.d.get(recyclerView$ViewHolder0);
        if(a10 == null) {
            return -1;
        }
        int v1 = v - l0.c(a10);
        Adapter recyclerView$Adapter1 = a10.c;
        int v2 = recyclerView$Adapter1.getItemCount();
        if(v1 >= 0 && v1 < v2) {
            return recyclerView$Adapter1.findRelativeAdapterPositionIn(recyclerView$Adapter0, recyclerView$ViewHolder0, v1);
        }
        StringBuilder stringBuilder0 = q.u("Detected inconsistent adapter updates. The local position of the view holder maps to ", v1, " which is out of bounds for the adapter with size ", v2, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        stringBuilder0.append(recyclerView$ViewHolder0);
        stringBuilder0.append("adapter:");
        stringBuilder0.append(recyclerView$Adapter0);
        throw new IllegalStateException(stringBuilder0.toString());
    }

    @NonNull
    public List getAdapters() {
        ArrayList arrayList0 = this.g.e;
        if(arrayList0.isEmpty()) {
            return Collections.unmodifiableList(Collections.emptyList());
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        for(Object object0: arrayList0) {
            arrayList1.add(((a1)object0).c);
        }
        return Collections.unmodifiableList(arrayList1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        int v = 0;
        for(Object object0: this.g.e) {
            v += ((a1)object0).e;
        }
        return v;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public long getItemId(int v) {
        k k0 = this.g.d(v);
        a1 a10 = (a1)k0.c;
        long v1 = a10.b.localToGlobal(a10.c.getItemId(k0.a));
        k0.b = false;
        k0.c = null;
        k0.a = -1;
        this.g.f = k0;
        return v1;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        k k0 = this.g.d(v);
        a1 a10 = (a1)k0.c;
        int v1 = a10.a.localToGlobal(a10.c.getItemViewType(k0.a));
        k0.b = false;
        k0.c = null;
        k0.a = -1;
        this.g.f = k0;
        return v1;
    }

    @NonNull
    public Pair getWrappedAdapterAndPosition(int v) {
        k k0 = this.g.d(v);
        Pair pair0 = new Pair(((a1)k0.c).c, k0.a);
        k0.b = false;
        k0.c = null;
        k0.a = -1;
        this.g.f = k0;
        return pair0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView0) {
        l l0 = this.g;
        ArrayList arrayList0 = l0.c;
        for(Object object0: arrayList0) {
            if(((WeakReference)object0).get() == recyclerView0) {
                return;
            }
            if(false) {
                break;
            }
        }
        arrayList0.add(new WeakReference(recyclerView0));
        for(Object object1: l0.e) {
            ((a1)object1).c.onAttachedToRecyclerView(recyclerView0);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@NonNull ViewHolder recyclerView$ViewHolder0, int v) {
        k k0 = this.g.d(v);
        this.g.d.put(recyclerView$ViewHolder0, ((a1)k0.c));
        ((a1)k0.c).c.bindViewHolder(recyclerView$ViewHolder0, k0.a);
        k0.b = false;
        k0.c = null;
        k0.a = -1;
        this.g.f = k0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup0, int v) {
        a1 a10 = this.g.b.getWrapperForGlobalType(v);
        int v1 = a10.a.globalToLocal(v);
        return a10.c.onCreateViewHolder(viewGroup0, v1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView0) {
        l l0 = this.g;
        ArrayList arrayList0 = l0.c;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            WeakReference weakReference0 = (WeakReference)arrayList0.get(v);
            if(weakReference0.get() == null) {
                arrayList0.remove(v);
            }
            else if(weakReference0.get() == recyclerView0) {
                arrayList0.remove(v);
                break;
            }
        }
        for(Object object0: l0.e) {
            ((a1)object0).c.onDetachedFromRecyclerView(recyclerView0);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public boolean onFailedToRecycleView(@NonNull ViewHolder recyclerView$ViewHolder0) {
        l l0 = this.g;
        IdentityHashMap identityHashMap0 = l0.d;
        a1 a10 = (a1)identityHashMap0.get(recyclerView$ViewHolder0);
        if(a10 == null) {
            throw new IllegalStateException("Cannot find wrapper for " + recyclerView$ViewHolder0 + ", seems like it is not bound by this adapter: " + l0);
        }
        identityHashMap0.remove(recyclerView$ViewHolder0);
        return a10.c.onFailedToRecycleView(recyclerView$ViewHolder0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewAttachedToWindow(@NonNull ViewHolder recyclerView$ViewHolder0) {
        this.g.e(recyclerView$ViewHolder0).c.onViewAttachedToWindow(recyclerView$ViewHolder0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewDetachedFromWindow(@NonNull ViewHolder recyclerView$ViewHolder0) {
        this.g.e(recyclerView$ViewHolder0).c.onViewDetachedFromWindow(recyclerView$ViewHolder0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewRecycled(@NonNull ViewHolder recyclerView$ViewHolder0) {
        l l0 = this.g;
        IdentityHashMap identityHashMap0 = l0.d;
        a1 a10 = (a1)identityHashMap0.get(recyclerView$ViewHolder0);
        if(a10 == null) {
            throw new IllegalStateException("Cannot find wrapper for " + recyclerView$ViewHolder0 + ", seems like it is not bound by this adapter: " + l0);
        }
        a10.c.onViewRecycled(recyclerView$ViewHolder0);
        identityHashMap0.remove(recyclerView$ViewHolder0);
    }

    public boolean removeAdapter(@NonNull Adapter recyclerView$Adapter0) {
        l l0 = this.g;
        int v = l0.f(recyclerView$Adapter0);
        if(v == -1) {
            return false;
        }
        a1 a10 = (a1)l0.e.get(v);
        int v1 = l0.c(a10);
        l0.e.remove(v);
        l0.a.notifyItemRangeRemoved(v1, a10.e);
        for(Object object0: l0.c) {
            RecyclerView recyclerView0 = (RecyclerView)((WeakReference)object0).get();
            if(recyclerView0 != null) {
                recyclerView$Adapter0.onDetachedFromRecyclerView(recyclerView0);
            }
        }
        a10.c.unregisterAdapterDataObserver(a10.f);
        a10.a.dispose();
        l0.b();
        return true;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void setStateRestorationPolicy(@NonNull StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy0) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }
}

