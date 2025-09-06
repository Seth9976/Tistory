package k0;

import androidx.compose.foundation.text.handwriting.StylusHandwritingNodeWithNegativePadding;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import md.c;

public final class b extends DelegatingNode implements PointerInputModifierNode {
    public Function0 p;
    public final Lazy q;
    public final StylusHandwritingNodeWithNegativePadding r;

    public b(Function0 function00) {
        this.p = function00;
        a a0 = new a(this, 0);
        this.q = c.lazy(LazyThreadSafetyMode.NONE, a0);
        this.r = (StylusHandwritingNodeWithNegativePadding)this.delegate(new StylusHandwritingNodeWithNegativePadding(new a(this, 1)));
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        this.r.onCancelPointerInput();
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public final void onPointerEvent-H0pRuoY(PointerEvent pointerEvent0, PointerEventPass pointerEventPass0, long v) {
        this.r.onPointerEvent-H0pRuoY(pointerEvent0, pointerEventPass0, v);
    }
}

