package androidx.recyclerview.widget;

import androidx.core.view.ViewCompat;

public final class r1 extends AdapterDataObserver {
    public final RecyclerView a;

    public r1(RecyclerView recyclerView0) {
        this.a = recyclerView0;
        super();
    }

    public final void a() {
        RecyclerView recyclerView0 = this.a;
        if(RecyclerView.POST_UPDATES_ON_ANIMATION && recyclerView0.mHasFixedSize && recyclerView0.mIsAttached) {
            ViewCompat.postOnAnimation(recyclerView0, recyclerView0.mUpdateChildViewsRunnable);
            return;
        }
        recyclerView0.mAdapterUpdateDuringMeasure = true;
        recyclerView0.requestLayout();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onChanged() {
        RecyclerView recyclerView0 = this.a;
        recyclerView0.assertNotInLayoutOrScroll(null);
        recyclerView0.mState.g = true;
        recyclerView0.processDataSetCompletelyChanged(true);
        if(!recyclerView0.mAdapterHelper.g()) {
            recyclerView0.requestLayout();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeChanged(int v, int v1, Object object0) {
        this.a.assertNotInLayoutOrScroll(null);
        b b0 = this.a.mAdapterHelper;
        if(v1 < 1) {
            b0.getClass();
            return;
        }
        a a0 = b0.obtainUpdateOp(4, v, v1, object0);
        b0.b.add(a0);
        b0.f |= 4;
        if(b0.b.size() == 1) {
            this.a();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeInserted(int v, int v1) {
        this.a.assertNotInLayoutOrScroll(null);
        b b0 = this.a.mAdapterHelper;
        if(v1 < 1) {
            b0.getClass();
            return;
        }
        a a0 = b0.obtainUpdateOp(1, v, v1, null);
        b0.b.add(a0);
        b0.f |= 1;
        if(b0.b.size() == 1) {
            this.a();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeMoved(int v, int v1, int v2) {
        this.a.assertNotInLayoutOrScroll(null);
        b b0 = this.a.mAdapterHelper;
        b0.getClass();
        if(v != v1) {
            if(v2 != 1) {
                throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
            }
            a a0 = b0.obtainUpdateOp(8, v, v1, null);
            b0.b.add(a0);
            b0.f |= 8;
            if(b0.b.size() == 1) {
                this.a();
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onItemRangeRemoved(int v, int v1) {
        this.a.assertNotInLayoutOrScroll(null);
        b b0 = this.a.mAdapterHelper;
        if(v1 < 1) {
            b0.getClass();
            return;
        }
        a a0 = b0.obtainUpdateOp(2, v, v1, null);
        b0.b.add(a0);
        b0.f |= 2;
        if(b0.b.size() == 1) {
            this.a();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public final void onStateRestorationPolicyChanged() {
        RecyclerView recyclerView0 = this.a;
        if(recyclerView0.mPendingSavedState == null) {
            return;
        }
        if(recyclerView0.mAdapter != null && recyclerView0.mAdapter.canRestoreState()) {
            recyclerView0.requestLayout();
        }
    }
}

