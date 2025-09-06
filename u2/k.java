package u2;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidView_androidKt.updateViewHolderParams.5.WhenMappings;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public static final k A;
    public static final k B;
    public static final k C;
    public static final k D;
    public static final k E;
    public static final k F;
    public static final k G;
    public final int w;
    public static final k x;
    public static final k y;
    public static final k z;

    static {
        k.x = new k(2, 0);
        k.y = new k(2, 1);
        k.z = new k(2, 2);
        k.A = new k(2, 3);
        k.B = new k(2, 4);
        k.C = new k(2, 5);
        k.D = new k(2, 6);
        k.E = new k(2, 7);
        k.F = new k(2, 8);
        k.G = new k(2, 9);
    }

    public k(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                AndroidView_androidKt.access$requireViewFactoryHolder(((LayoutNode)object0)).setResetBlock(((Function1)object1));
                return Unit.INSTANCE;
            }
            case 1: {
                AndroidView_androidKt.access$requireViewFactoryHolder(((LayoutNode)object0)).setUpdateBlock(((Function1)object1));
                return Unit.INSTANCE;
            }
            case 2: {
                AndroidView_androidKt.access$requireViewFactoryHolder(((LayoutNode)object0)).setReleaseBlock(((Function1)object1));
                return Unit.INSTANCE;
            }
            case 3: {
                AndroidView_androidKt.access$requireViewFactoryHolder(((LayoutNode)object0)).setUpdateBlock(((Function1)object1));
                return Unit.INSTANCE;
            }
            case 4: {
                AndroidView_androidKt.access$requireViewFactoryHolder(((LayoutNode)object0)).setReleaseBlock(((Function1)object1));
                return Unit.INSTANCE;
            }
            case 5: {
                AndroidView_androidKt.access$requireViewFactoryHolder(((LayoutNode)object0)).setModifier(((Modifier)object1));
                return Unit.INSTANCE;
            }
            case 6: {
                AndroidView_androidKt.access$requireViewFactoryHolder(((LayoutNode)object0)).setDensity(((Density)object1));
                return Unit.INSTANCE;
            }
            case 7: {
                AndroidView_androidKt.access$requireViewFactoryHolder(((LayoutNode)object0)).setLifecycleOwner(((LifecycleOwner)object1));
                return Unit.INSTANCE;
            }
            case 8: {
                AndroidView_androidKt.access$requireViewFactoryHolder(((LayoutNode)object0)).setSavedStateRegistryOwner(((SavedStateRegistryOwner)object1));
                return Unit.INSTANCE;
            }
            default: {
                ViewFactoryHolder viewFactoryHolder0 = AndroidView_androidKt.access$requireViewFactoryHolder(((LayoutNode)object0));
                int v = AndroidView_androidKt.updateViewHolderParams.5.WhenMappings.$EnumSwitchMapping$0[((LayoutDirection)object1).ordinal()];
                int v1 = 1;
                if(v == 1) {
                    v1 = 0;
                }
                else if(v != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                viewFactoryHolder0.setLayoutDirection(v1);
                return Unit.INSTANCE;
            }
        }
    }
}

