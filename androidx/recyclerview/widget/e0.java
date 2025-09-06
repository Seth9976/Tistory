package androidx.recyclerview.widget;

import androidx.constraintlayout.core.c;
import androidx.core.os.TraceCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public final class e0 implements Runnable {
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;
    public static final ThreadLocal e;
    public static final c f;

    static {
        e0.e = new ThreadLocal();
        e0.f = new c(3);
    }

    public final void a(RecyclerView recyclerView0, int v, int v1) {
        if(recyclerView0.isAttachedToWindow()) {
            if(RecyclerView.sDebugAssertionsEnabled && !this.a.contains(recyclerView0)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if(this.b == 0L) {
                this.b = 2390871944300L;
                recyclerView0.post(this);
            }
        }
        recyclerView0.mPrefetchRegistry.a = v;
        recyclerView0.mPrefetchRegistry.b = v1;
    }

    public final void b(long v) {
        d0 d00;
        ArrayList arrayList0 = this.a;
        int v1 = arrayList0.size();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            RecyclerView recyclerView0 = (RecyclerView)arrayList0.get(v2);
            if(recyclerView0.getWindowVisibility() == 0) {
                recyclerView0.mPrefetchRegistry.a(recyclerView0, false);
                v3 += recyclerView0.mPrefetchRegistry.d;
            }
        }
        ArrayList arrayList1 = this.d;
        arrayList1.ensureCapacity(v3);
        int v5 = 0;
        for(int v4 = 0; v4 < v1; ++v4) {
            RecyclerView recyclerView1 = (RecyclerView)arrayList0.get(v4);
            if(recyclerView1.getWindowVisibility() == 0) {
                c0 c00 = recyclerView1.mPrefetchRegistry;
                int v6 = Math.abs(c00.b) + Math.abs(c00.a);
                for(int v7 = 0; v7 < c00.d * 2; v7 += 2) {
                    if(v5 >= arrayList1.size()) {
                        d00 = new d0();  // 初始化器: Ljava/lang/Object;-><init>()V
                        arrayList1.add(d00);
                    }
                    else {
                        d00 = (d0)arrayList1.get(v5);
                    }
                    int[] arr_v = c00.c;
                    int v8 = arr_v[v7 + 1];
                    d00.a = v8 <= v6;
                    d00.b = v6;
                    d00.c = v8;
                    d00.d = recyclerView1;
                    d00.e = arr_v[v7];
                    ++v5;
                }
            }
        }
        Collections.sort(arrayList1, e0.f);
        for(int v9 = 0; v9 < arrayList1.size(); ++v9) {
            d0 d01 = (d0)arrayList1.get(v9);
            RecyclerView recyclerView2 = d01.d;
            if(recyclerView2 == null) {
                break;
            }
            ViewHolder recyclerView$ViewHolder0 = e0.c(recyclerView2, d01.e, (d01.a ? 0x7FFFFFFFFFFFFFFFL : v));
            if(recyclerView$ViewHolder0 != null && recyclerView$ViewHolder0.mNestedRecyclerView != null && recyclerView$ViewHolder0.isBound() && !recyclerView$ViewHolder0.isInvalid()) {
                RecyclerView recyclerView3 = (RecyclerView)recyclerView$ViewHolder0.mNestedRecyclerView.get();
                if(recyclerView3 != null) {
                    if(recyclerView3.mDataSetHasChangedAfterLayout && recyclerView3.mChildHelper.a.a.getChildCount() != 0) {
                        recyclerView3.removeAndRecycleViews();
                    }
                    c0 c01 = recyclerView3.mPrefetchRegistry;
                    c01.a(recyclerView3, true);
                    if(c01.d != 0) {
                        try {
                            TraceCompat.beginSection("RV Nested Prefetch");
                            recyclerView3.mState.e = 1;
                            recyclerView3.mState.f = recyclerView3.mAdapter.getItemCount();
                            recyclerView3.mState.h = false;
                            recyclerView3.mState.i = false;
                            recyclerView3.mState.j = false;
                            for(int v11 = 0; v11 < c01.d * 2; v11 += 2) {
                                e0.c(recyclerView3, c01.c[v11], v);
                            }
                        }
                        finally {
                            TraceCompat.endSection();
                        }
                    }
                }
            }
            d01.a = false;
            d01.b = 0;
            d01.c = 0;
            d01.d = null;
            d01.e = 0;
        }
    }

    public static ViewHolder c(RecyclerView recyclerView0, int v, long v1) {
        int v2 = recyclerView0.mChildHelper.a.a.getChildCount();
        for(int v3 = 0; v3 < v2; ++v3) {
            ViewHolder recyclerView$ViewHolder0 = RecyclerView.getChildViewHolderInt(recyclerView0.mChildHelper.a.a.getChildAt(v3));
            if(recyclerView$ViewHolder0.mPosition == v && !recyclerView$ViewHolder0.isInvalid()) {
                return null;
            }
        }
        try {
            Recycler recyclerView$Recycler0 = recyclerView0.mRecycler;
            recyclerView0.onEnterLayoutOrScroll();
            ViewHolder recyclerView$ViewHolder1 = recyclerView$Recycler0.k(v, v1);
            if(recyclerView$ViewHolder1 != null) {
                if(!recyclerView$ViewHolder1.isBound() || recyclerView$ViewHolder1.isInvalid()) {
                    recyclerView$Recycler0.a(recyclerView$ViewHolder1, false);
                }
                else {
                    recyclerView$Recycler0.recycleView(recyclerView$ViewHolder1.itemView);
                }
            }
            return recyclerView$ViewHolder1;
        }
        finally {
            recyclerView0.onExitLayoutOrScroll(false);
        }
    }

    @Override
    public final void run() {
        try {
            TraceCompat.beginSection("RV Prefetch");
            ArrayList arrayList0 = this.a;
            if(!arrayList0.isEmpty()) {
                int v = arrayList0.size();
                long v2 = 0L;
                for(int v1 = 0; v1 < v; ++v1) {
                    RecyclerView recyclerView0 = (RecyclerView)arrayList0.get(v1);
                    if(recyclerView0.getWindowVisibility() == 0) {
                        v2 = Math.max(recyclerView0.getDrawingTime(), v2);
                    }
                }
                if(v2 != 0L) {
                    this.b(TimeUnit.MILLISECONDS.toNanos(v2) + this.c);
                    goto label_19;
                }
            }
            goto label_22;
        }
        catch(Throwable throwable0) {
        }
        this.b = 0L;
        TraceCompat.endSection();
        throw throwable0;
    label_19:
        this.b = 0L;
        TraceCompat.endSection();
        return;
    label_22:
        this.b = 0L;
        TraceCompat.endSection();
    }
}

