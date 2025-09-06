package androidx.compose.ui.platform;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class o1 extends Lambda implements Function0 {
    public final AbstractComposeView w;
    public final androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindow.installFor.listener.1 x;

    public o1(AbstractComposeView abstractComposeView0, androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindow.installFor.listener.1 viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$10) {
        this.w = abstractComposeView0;
        this.x = viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.removeOnAttachStateChangeListener(this.x);
        return Unit.INSTANCE;
    }
}

