package o1;

import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.TwoDimensionalFocusSearchKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function1 {
    public final FocusTargetNode w;
    public final Rect x;
    public final int y;
    public final Function1 z;

    public p(FocusTargetNode focusTargetNode0, Rect rect0, int v, Function1 function10) {
        this.w = focusTargetNode0;
        this.x = rect0;
        this.y = v;
        this.z = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        boolean z = TwoDimensionalFocusSearchKt.h(this.w, this.x, this.y, this.z);
        Boolean boolean0 = Boolean.valueOf(z);
        return !z && ((BeyondBoundsScope)object0).getHasMoreContent() ? null : boolean0;
    }
}

