package z1;

import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function2 {
    public final int w;
    public final SubcomposeLayoutState x;

    public q(SubcomposeLayoutState subcomposeLayoutState0, int v) {
        this.w = v;
        this.x = subcomposeLayoutState0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                LayoutNode layoutNode0 = (LayoutNode)object0;
                SubcomposeLayoutState.access$getState(this.x).setCompositionContext(((CompositionContext)object1));
                return Unit.INSTANCE;
            }
            case 1: {
                ((LayoutNode)object0).setMeasurePolicy(SubcomposeLayoutState.access$getState(this.x).createMeasurePolicy(((Function2)object1)));
                return Unit.INSTANCE;
            }
            default: {
                SubcomposeLayoutState subcomposeLayoutState0 = (SubcomposeLayoutState)object1;
                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0 = ((LayoutNode)object0).getSubcompositionsState$ui_release();
                SubcomposeLayoutState subcomposeLayoutState1 = this.x;
                if(layoutNodeSubcompositionsState0 == null) {
                    layoutNodeSubcompositionsState0 = new LayoutNodeSubcompositionsState(((LayoutNode)object0), subcomposeLayoutState1.a);
                    ((LayoutNode)object0).setSubcompositionsState$ui_release(layoutNodeSubcompositionsState0);
                }
                subcomposeLayoutState1.b = layoutNodeSubcompositionsState0;
                SubcomposeLayoutState.access$getState(subcomposeLayoutState1).makeSureStateIsConsistent();
                SubcomposeLayoutState.access$getState(subcomposeLayoutState1).setSlotReusePolicy(subcomposeLayoutState1.a);
                return Unit.INSTANCE;
            }
        }
    }
}

