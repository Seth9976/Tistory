package o1;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class l extends Lambda implements Function0 {
    public final ObjectRef w;
    public final FocusTargetNode x;

    public l(ObjectRef ref$ObjectRef0, FocusTargetNode focusTargetNode0) {
        this.w = ref$ObjectRef0;
        this.x = focusTargetNode0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.element = this.x.fetchFocusProperties$ui_release();
        return Unit.INSTANCE;
    }
}

