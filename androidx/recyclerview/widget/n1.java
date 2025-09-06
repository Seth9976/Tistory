package androidx.recyclerview.widget;

public final class n1 implements ItemAnimatorListener {
    public final RecyclerView a;

    public n1(RecyclerView recyclerView0) {
        this.a = recyclerView0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemAnimator$ItemAnimatorListener
    public final void onAnimationFinished(ViewHolder recyclerView$ViewHolder0) {
        recyclerView$ViewHolder0.setIsRecyclable(true);
        if(recyclerView$ViewHolder0.mShadowedHolder != null && recyclerView$ViewHolder0.mShadowingHolder == null) {
            recyclerView$ViewHolder0.mShadowedHolder = null;
        }
        recyclerView$ViewHolder0.mShadowingHolder = null;
        if(!recyclerView$ViewHolder0.shouldBeKeptAsChild()) {
            RecyclerView recyclerView0 = this.a;
            if(!recyclerView0.removeAnimatingView(recyclerView$ViewHolder0.itemView) && recyclerView$ViewHolder0.isTmpDetached()) {
                recyclerView0.removeDetachedView(recyclerView$ViewHolder0.itemView, false);
            }
        }
    }
}

