package androidx.compose.ui.node;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function0 {
    public final MeasurePassDelegate w;

    public u(MeasurePassDelegate layoutNodeLayoutDelegate$MeasurePassDelegate0) {
        this.w = layoutNodeLayoutDelegate$MeasurePassDelegate0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MeasurePassDelegate.access$clearPlaceOrder(this.w);
        this.w.forEachChildAlignmentLinesOwner(s.w);
        this.w.getInnerCoordinator().getMeasureResult$ui_release().placeChildren();
        MeasurePassDelegate.access$checkChildrenPlaceOrderForUpdates(this.w);
        this.w.forEachChildAlignmentLinesOwner(t.w);
        return Unit.INSTANCE;
    }
}

