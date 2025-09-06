package androidx.compose.ui.node;

import androidx.compose.ui.graphics.TransformOrigin;
import b2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function1 {
    public static final y w;

    static {
        y.w = new y(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((NodeCoordinator)object0).isValidOwnerScope()) {
            j j0 = ((NodeCoordinator)object0).D;
            if(j0 == null) {
                ((NodeCoordinator)object0).n(true);
                return Unit.INSTANCE;
            }
            j j1 = NodeCoordinator.M;
            j1.getClass();
            j1.a = j0.a;
            j1.b = j0.b;
            j1.c = j0.c;
            j1.d = j0.d;
            j1.e = j0.e;
            j1.f = j0.f;
            j1.g = j0.g;
            j1.h = j0.h;
            j1.i = j0.i;
            ((NodeCoordinator)object0).n(true);
            j j2 = NodeCoordinator.M;
            if(j2.a != j0.a || j2.b != j0.b || j2.c != j0.c || j2.d != j0.d || j2.e != j0.e || j2.f != j0.f || j2.g != j0.g || j2.h != j0.h || !TransformOrigin.equals-impl0(j2.i, j0.i)) {
                LayoutNode layoutNode0 = ((NodeCoordinator)object0).getLayoutNode();
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate0 = layoutNode0.getLayoutDelegate$ui_release();
                if(layoutNodeLayoutDelegate0.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if(layoutNodeLayoutDelegate0.getCoordinatesAccessedDuringModifierPlacement() || layoutNodeLayoutDelegate0.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNode.requestRelayout$ui_release$default(layoutNode0, false, 1, null);
                    }
                    layoutNodeLayoutDelegate0.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                }
                Owner owner0 = layoutNode0.getOwner$ui_release();
                if(owner0 != null) {
                    owner0.requestOnPositionedCallback(layoutNode0);
                }
            }
        }
        return Unit.INSTANCE;
    }
}

