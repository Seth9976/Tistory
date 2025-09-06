package androidx.compose.ui.platform;

import androidx.customview.poolingcontainer.PoolingContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class q1 extends Lambda implements Function0 {
    public final AbstractComposeView w;
    public final androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.installFor.listener.1 x;
    public final p1 y;

    public q1(AbstractComposeView abstractComposeView0, androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.installFor.listener.1 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$10, p1 p10) {
        this.w = abstractComposeView0;
        this.x = viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$10;
        this.y = p10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.removeOnAttachStateChangeListener(this.x);
        PoolingContainer.removePoolingContainerListener(this.w, this.y);
        return Unit.INSTANCE;
    }
}

