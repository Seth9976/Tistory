package androidx.recyclerview.widget;

public final class i1 implements ViewInfoStore.ProcessCallback {
    public final RecyclerView a;

    public i1(RecyclerView recyclerView0) {
        this.a = recyclerView0;
    }

    @Override  // androidx.recyclerview.widget.ViewInfoStore$ProcessCallback
    public final void processAppeared(ViewHolder recyclerView$ViewHolder0, ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0, ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1) {
        this.a.animateAppearance(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0, recyclerView$ItemAnimator$ItemHolderInfo1);
    }

    @Override  // androidx.recyclerview.widget.ViewInfoStore$ProcessCallback
    public final void processDisappeared(ViewHolder recyclerView$ViewHolder0, ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0, ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1) {
        this.a.mRecycler.l(recyclerView$ViewHolder0);
        this.a.animateDisappearance(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0, recyclerView$ItemAnimator$ItemHolderInfo1);
    }

    @Override  // androidx.recyclerview.widget.ViewInfoStore$ProcessCallback
    public final void processPersistent(ViewHolder recyclerView$ViewHolder0, ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0, ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo1) {
        recyclerView$ViewHolder0.setIsRecyclable(false);
        RecyclerView recyclerView0 = this.a;
        if(recyclerView0.mDataSetHasChangedAfterLayout) {
            if(recyclerView0.mItemAnimator.animateChange(recyclerView$ViewHolder0, recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0, recyclerView$ItemAnimator$ItemHolderInfo1)) {
                recyclerView0.postAnimationRunner();
            }
        }
        else if(recyclerView0.mItemAnimator.animatePersistence(recyclerView$ViewHolder0, recyclerView$ItemAnimator$ItemHolderInfo0, recyclerView$ItemAnimator$ItemHolderInfo1)) {
            recyclerView0.postAnimationRunner();
        }
    }

    @Override  // androidx.recyclerview.widget.ViewInfoStore$ProcessCallback
    public final void unused(ViewHolder recyclerView$ViewHolder0) {
        this.a.mLayout.removeAndRecycleView(recyclerView$ViewHolder0.itemView, this.a.mRecycler);
    }
}

