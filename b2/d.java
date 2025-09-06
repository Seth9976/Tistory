package b2;

import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.OwnerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d D;
    public static final d E;
    public static final d F;
    public static final d G;
    public static final d H;
    public static final d I;
    public static final d J;
    public final int w;
    public static final d x;
    public static final d y;
    public static final d z;

    static {
        d.x = new d(1, 0);
        d.y = new d(1, 1);
        d.z = new d(1, 2);
        d.A = new d(1, 3);
        d.B = new d(1, 4);
        d.C = new d(1, 5);
        d.D = new d(1, 6);
        d.E = new d(1, 7);
        d.F = new d(1, 8);
        d.G = new d(1, 9);
        d.H = new d(1, 10);
        d.I = new d(1, 11);
        d.J = new d(1, 12);
    }

    public d(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                ((BackwardsCompatNode)object0).onDrawCacheReadsChanged$ui_release();
                return Unit.INSTANCE;
            }
            case 1: {
                ((BackwardsCompatNode)object0).updateModifierLocalConsumer();
                return Unit.INSTANCE;
            }
            case 2: {
                if(((q)object0).isValidOwnerScope()) {
                    ((q)object0).b.d(((q)object0));
                }
                return Unit.INSTANCE;
            }
            case 3: {
                OwnedLayer ownedLayer0 = ((NodeCoordinator)object0).getLayer();
                if(ownedLayer0 != null) {
                    ownedLayer0.invalidate();
                }
                return Unit.INSTANCE;
            }
            case 4: {
                if(((ObserverNodeOwnerScope)object0).isValidOwnerScope()) {
                    ((ObserverNodeOwnerScope)object0).getObserverNode$ui_release().onObservedReadsChanged();
                }
                return Unit.INSTANCE;
            }
            case 5: {
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                return Boolean.valueOf(!((OwnerScope)object0).isValidOwnerScope());
            }
            case 6: {
                if(((LayoutNode)object0).isValidOwnerScope()) {
                    LayoutNode.requestRelayout$ui_release$default(((LayoutNode)object0), false, 1, null);
                }
                return Unit.INSTANCE;
            }
            case 7: {
                if(((LayoutNode)object0).isValidOwnerScope()) {
                    LayoutNode.requestRelayout$ui_release$default(((LayoutNode)object0), false, 1, null);
                }
                return Unit.INSTANCE;
            }
            case 8: {
                if(((LayoutNode)object0).isValidOwnerScope()) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(((LayoutNode)object0), false, 1, null);
                }
                return Unit.INSTANCE;
            }
            case 9: {
                if(((LayoutNode)object0).isValidOwnerScope()) {
                    LayoutNode.requestLookaheadRelayout$ui_release$default(((LayoutNode)object0), false, 1, null);
                }
                return Unit.INSTANCE;
            }
            case 10: {
                if(((LayoutNode)object0).isValidOwnerScope()) {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(((LayoutNode)object0), false, false, false, 7, null);
                }
                return Unit.INSTANCE;
            }
            case 11: {
                if(((LayoutNode)object0).isValidOwnerScope()) {
                    LayoutNode.requestRemeasure$ui_release$default(((LayoutNode)object0), false, false, false, 7, null);
                }
                return Unit.INSTANCE;
            }
            default: {
                if(((LayoutNode)object0).isValidOwnerScope()) {
                    ((LayoutNode)object0).invalidateSemantics$ui_release();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

