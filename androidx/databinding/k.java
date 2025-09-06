package androidx.databinding;

public final class k implements Runnable {
    public final ViewDataBinding a;

    public k(ViewDataBinding viewDataBinding0) {
        this.a = viewDataBinding0;
    }

    @Override
    public final void run() {
        synchronized(this) {
            this.a.mPendingRebind = false;
        }
        ViewDataBinding.access$300();
        if(!this.a.mRoot.isAttachedToWindow()) {
            this.a.mRoot.removeOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
            this.a.mRoot.addOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
            return;
        }
        this.a.executePendingBindings();
    }
}

