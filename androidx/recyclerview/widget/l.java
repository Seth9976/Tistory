package androidx.recyclerview.widget;

import android.util.Log;
import androidx.core.util.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;

public final class l implements NestedAdapterWrapper.Callback {
    public final ConcatAdapter a;
    public final ViewTypeStorage b;
    public final ArrayList c;
    public final IdentityHashMap d;
    public final ArrayList e;
    public k f;
    public final StableIdMode g;
    public final StableIdStorage h;

    public l(ConcatAdapter concatAdapter0, Config concatAdapter$Config0) {
        this.c = new ArrayList();
        this.d = new IdentityHashMap();
        this.e = new ArrayList();
        this.f = new k();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.a = concatAdapter0;
        this.b = concatAdapter$Config0.isolateViewTypes ? new IsolatedViewTypeStorage() : new SharedIdRangeViewTypeStorage();
        StableIdMode concatAdapter$Config$StableIdMode0 = concatAdapter$Config0.stableIdMode;
        this.g = concatAdapter$Config$StableIdMode0;
        if(concatAdapter$Config$StableIdMode0 == StableIdMode.NO_STABLE_IDS) {
            this.h = new NoStableIdStorage();
            return;
        }
        if(concatAdapter$Config$StableIdMode0 == StableIdMode.ISOLATED_STABLE_IDS) {
            this.h = new IsolatedStableIdStorage();
            return;
        }
        if(concatAdapter$Config$StableIdMode0 != StableIdMode.SHARED_STABLE_IDS) {
            throw new IllegalArgumentException("unknown stable id mode");
        }
        this.h = new SharedPoolStableIdStorage();
    }

    public final boolean a(int v, Adapter recyclerView$Adapter0) {
        ArrayList arrayList0 = this.e;
        if(v < 0 || v > arrayList0.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList0.size() + ". Given:" + v);
        }
        if(this.g != StableIdMode.NO_STABLE_IDS) {
            Preconditions.checkArgument(recyclerView$Adapter0.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        }
        else if(recyclerView$Adapter0.hasStableIds()) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        int v1 = this.f(recyclerView$Adapter0);
        if((v1 == -1 ? null : ((a1)arrayList0.get(v1))) != null) {
            return false;
        }
        StableIdLookup stableIdStorage$StableIdLookup0 = this.h.createStableIdLookup();
        a1 a10 = new a1(recyclerView$Adapter0, this, this.b, stableIdStorage$StableIdLookup0);
        arrayList0.add(v, a10);
        for(Object object0: this.c) {
            RecyclerView recyclerView0 = (RecyclerView)((WeakReference)object0).get();
            if(recyclerView0 != null) {
                recyclerView$Adapter0.onAttachedToRecyclerView(recyclerView0);
            }
        }
        if(a10.e > 0) {
            int v2 = this.c(a10);
            this.a.notifyItemRangeInserted(v2, a10.e);
        }
        this.b();
        return true;
    }

    public final void b() {
        StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy2;
        for(Object object0: this.e) {
            StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy0 = ((a1)object0).c.getStateRestorationPolicy();
            StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy1 = StateRestorationPolicy.PREVENT;
            if(recyclerView$Adapter$StateRestorationPolicy0 != recyclerView$Adapter$StateRestorationPolicy1 && (recyclerView$Adapter$StateRestorationPolicy0 != StateRestorationPolicy.PREVENT_WHEN_EMPTY || ((a1)object0).e != 0)) {
                continue;
            }
            recyclerView$Adapter$StateRestorationPolicy2 = recyclerView$Adapter$StateRestorationPolicy1;
            goto label_9;
        }
        recyclerView$Adapter$StateRestorationPolicy2 = StateRestorationPolicy.ALLOW;
    label_9:
        ConcatAdapter concatAdapter0 = this.a;
        if(recyclerView$Adapter$StateRestorationPolicy2 != concatAdapter0.getStateRestorationPolicy()) {
            concatAdapter0.a(recyclerView$Adapter$StateRestorationPolicy2);
        }
    }

    public final int c(a1 a10) {
        int v = 0;
        for(Object object0: this.e) {
            if(((a1)object0) == a10) {
                break;
            }
            v += ((a1)object0).e;
        }
        return v;
    }

    public final k d(int v) {
        k k0 = this.f;
        if(k0.b) {
            k0 = new k();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        else {
            k0.b = true;
        }
        int v1 = v;
        for(Object object0: this.e) {
            a1 a10 = (a1)object0;
            int v2 = a10.e;
            if(v2 > v1) {
                k0.c = a10;
                k0.a = v1;
                break;
            }
            v1 -= v2;
        }
        if(((a1)k0.c) == null) {
            throw new IllegalArgumentException("Cannot find wrapper for " + v);
        }
        return k0;
    }

    public final a1 e(ViewHolder recyclerView$ViewHolder0) {
        a1 a10 = (a1)this.d.get(recyclerView$ViewHolder0);
        if(a10 == null) {
            throw new IllegalStateException("Cannot find wrapper for " + recyclerView$ViewHolder0 + ", seems like it is not bound by this adapter: " + this);
        }
        return a10;
    }

    public final int f(Adapter recyclerView$Adapter0) {
        ArrayList arrayList0 = this.e;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((a1)arrayList0.get(v1)).c == recyclerView$Adapter0) {
                return v1;
            }
        }
        return -1;
    }

    @Override  // androidx.recyclerview.widget.NestedAdapterWrapper$Callback
    public final void onChanged(a1 a10) {
        this.a.notifyDataSetChanged();
        this.b();
    }

    @Override  // androidx.recyclerview.widget.NestedAdapterWrapper$Callback
    public final void onItemRangeChanged(a1 a10, int v, int v1) {
        int v2 = this.c(a10);
        this.a.notifyItemRangeChanged(v + v2, v1);
    }

    @Override  // androidx.recyclerview.widget.NestedAdapterWrapper$Callback
    public final void onItemRangeChanged(a1 a10, int v, int v1, Object object0) {
        int v2 = this.c(a10);
        this.a.notifyItemRangeChanged(v + v2, v1, object0);
    }

    @Override  // androidx.recyclerview.widget.NestedAdapterWrapper$Callback
    public final void onItemRangeInserted(a1 a10, int v, int v1) {
        int v2 = this.c(a10);
        this.a.notifyItemRangeInserted(v + v2, v1);
    }

    @Override  // androidx.recyclerview.widget.NestedAdapterWrapper$Callback
    public final void onItemRangeMoved(a1 a10, int v, int v1) {
        int v2 = this.c(a10);
        this.a.notifyItemMoved(v + v2, v1 + v2);
    }

    @Override  // androidx.recyclerview.widget.NestedAdapterWrapper$Callback
    public final void onItemRangeRemoved(a1 a10, int v, int v1) {
        int v2 = this.c(a10);
        this.a.notifyItemRangeRemoved(v + v2, v1);
    }

    @Override  // androidx.recyclerview.widget.NestedAdapterWrapper$Callback
    public final void onStateRestorationPolicyChanged(a1 a10) {
        this.b();
    }
}

