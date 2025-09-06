package androidx.compose.ui.platform;

import androidx.customview.poolingcontainer.PoolingContainerListener;

public final class p1 implements PoolingContainerListener {
    public final AbstractComposeView a;

    public p1(AbstractComposeView abstractComposeView0) {
        this.a = abstractComposeView0;
    }

    @Override  // androidx.customview.poolingcontainer.PoolingContainerListener
    public final void onRelease() {
        this.a.disposeComposition();
    }
}

