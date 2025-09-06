package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function2 {
    public static final a0 A;
    public final int w;
    public static final a0 x;
    public static final a0 y;
    public static final a0 z;

    static {
        a0.x = new a0(2, 0);
        a0.y = new a0(2, 1);
        a0.z = new a0(2, 2);
        a0.A = new a0(2, 3);
    }

    public a0(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                return Float.compare(((Number)((SemanticsNode)object0).getUnmergedConfig$ui_release().getOrElse(SemanticsProperties.INSTANCE.getTraversalIndex(), y.y)).floatValue(), ((Number)((SemanticsNode)object1).getUnmergedConfig$ui_release().getOrElse(SemanticsProperties.INSTANCE.getTraversalIndex(), y.z)).floatValue());
            }
            case 1: {
                int v = ((Number)object1).intValue();
                if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1759434350, v, -1, "androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt.lambda-1.<anonymous> (Wrapper.android.kt:120)");
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                ((DeviceRenderNode)object0).getMatrix(((Matrix)object1));
                return Unit.INSTANCE;
            }
            default: {
                ((Matrix)object1).set(((View)object0).getMatrix());
                return Unit.INSTANCE;
            }
        }
    }
}

