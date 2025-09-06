package androidx.recyclerview.widget;

public final class g1 implements Runnable {
    public final RecyclerView a;

    public g1(RecyclerView recyclerView0) {
        this.a = recyclerView0;
    }

    @Override
    public final void run() {
        RecyclerView recyclerView0 = this.a;
        ItemAnimator recyclerView$ItemAnimator0 = recyclerView0.mItemAnimator;
        if(recyclerView$ItemAnimator0 != null) {
            recyclerView$ItemAnimator0.runPendingAnimations();
        }
        recyclerView0.mPostedAnimatorRunner = false;
    }
}

