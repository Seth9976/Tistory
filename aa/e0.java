package aa;

import android.graphics.Matrix;
import androidx.compose.material.DraggableAnchorsConfig;
import androidx.compose.material.DrawerValue;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class e0 extends Lambda implements Function1 {
    public final int w;
    public final float x;

    public e0(float f, int v) {
        this.w = v;
        this.x = f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((GraphicsLayerScope)object0), "$this$graphicsLayer");
                ((GraphicsLayerScope)object0).setTransformOrigin-__ExYCQ(0L);
                ((GraphicsLayerScope)object0).setScaleX(this.x);
                ((GraphicsLayerScope)object0).setScaleY(this.x);
                return Unit.INSTANCE;
            }
            case 1: {
                ((InspectorInfo)object0).setName("padding");
                ((InspectorInfo)object0).setValue(Dp.box-impl(this.x));
                return Unit.INSTANCE;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$addTransform");
                ((ConstraintReference)object0).pivotX(this.x);
                return Unit.INSTANCE;
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$addTransform");
                ((ConstraintReference)object0).pivotY(this.x);
                return Unit.INSTANCE;
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$addTransform");
                ((ConstraintReference)object0).rotationX(this.x);
                return Unit.INSTANCE;
            }
            case 5: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$addTransform");
                ((ConstraintReference)object0).rotationY(this.x);
                return Unit.INSTANCE;
            }
            case 6: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$addTransform");
                ((ConstraintReference)object0).rotationZ(this.x);
                return Unit.INSTANCE;
            }
            case 7: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$addTransform");
                ((ConstraintReference)object0).scaleX(this.x);
                return Unit.INSTANCE;
            }
            case 8: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$addTransform");
                ((ConstraintReference)object0).scaleY(this.x);
                return Unit.INSTANCE;
            }
            case 9: {
                Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
                float f = this.x / 2.0f;
                ((Matrix)object0).postTranslate(f, f);
                return Unit.INSTANCE;
            }
            case 10: {
                return Constraints.box-impl(ConstraintsKt.offset-NN6Ew-U$default(Constraints.copy-Zbe2FdA$default(((Constraints)object0).unbox-impl(), 0, 0, 0, 0, 10, null), 0, -c.roundToInt(this.x), 1, null));
            }
            case 11: {
                ((DraggableAnchorsConfig)object0).at(DrawerValue.Closed, this.x);
                ((DraggableAnchorsConfig)object0).at(DrawerValue.Open, 0.0f);
                return Unit.INSTANCE;
            }
            default: {
                ((DraggableAnchorsConfig)object0).at(Boolean.FALSE, 0.0f);
                ((DraggableAnchorsConfig)object0).at(Boolean.TRUE, this.x);
                return Unit.INSTANCE;
            }
        }
    }
}

