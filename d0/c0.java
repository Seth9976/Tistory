package d0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class c0 extends Node implements SemanticsModifierNode {
    public Function0 n;
    public LazyLayoutSemanticState o;
    public Orientation p;
    public boolean q;
    public boolean r;
    public ScrollAxisRange s;
    public final a0 t;
    public a0 u;

    public c0(Function0 function00, LazyLayoutSemanticState lazyLayoutSemanticState0, Orientation orientation0, boolean z, boolean z1) {
        this.n = function00;
        this.o = lazyLayoutSemanticState0;
        this.p = orientation0;
        this.q = z;
        this.r = z1;
        this.t = new a0(this, 0);
        this.b();
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver0, true);
        SemanticsPropertiesKt.indexForKey(semanticsPropertyReceiver0, this.t);
        if(this.p == Orientation.Vertical) {
            ScrollAxisRange scrollAxisRange0 = this.s;
            if(scrollAxisRange0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scrollAxisRange");
                scrollAxisRange0 = null;
            }
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver0, scrollAxisRange0);
        }
        else {
            ScrollAxisRange scrollAxisRange1 = this.s;
            if(scrollAxisRange1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scrollAxisRange");
                scrollAxisRange1 = null;
            }
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver0, scrollAxisRange1);
        }
        a0 a00 = this.u;
        if(a00 != null) {
            SemanticsPropertiesKt.scrollToIndex$default(semanticsPropertyReceiver0, null, a00, 1, null);
        }
        SemanticsPropertiesKt.getScrollViewportLength$default(semanticsPropertyReceiver0, null, new z(this, 0), 1, null);
        SemanticsPropertiesKt.setCollectionInfo(semanticsPropertyReceiver0, this.o.collectionInfo());
    }

    public final void b() {
        this.s = new ScrollAxisRange(new z(this, 1), new z(this, 2), this.r);
        this.u = this.q ? new a0(this, 1) : null;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }
}

