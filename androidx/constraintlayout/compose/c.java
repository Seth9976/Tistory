package androidx.constraintlayout.compose;

import a7.b;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final Object A;
    public final int w;
    public final float x;
    public final float y;
    public final Object z;

    public c(float f, float f1, Object object0, int v, Object object1) {
        this.w = v;
        this.z = object0;
        this.A = object1;
        this.x = f;
        this.y = f1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                ConstraintReference constraintReference1 = ((BaseHorizontalAnchorable)this.z).getConstraintReference(((State)object0));
                Function2[] arr_function2 = AnchorFunctions.INSTANCE.getHorizontalAnchorFunctions()[((BaseHorizontalAnchorable)this.z).b];
                ((ConstraintReference)arr_function2[((HorizontalAnchor)this.A).getIndex$compose_release()].invoke(constraintReference1, ((HorizontalAnchor)this.A).getId$compose_release())).margin(Dp.box-impl(this.x)).marginGone(Dp.box-impl(this.y));
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                LayoutDirection layoutDirection0 = ((State)object0).getLayoutDirection();
                int v = ((BaseVerticalAnchorable)this.z).b;
                int v1 = AnchorFunctions.INSTANCE.verticalAnchorIndexToFunctionIndex(v, layoutDirection0);
                int v2 = ((VerticalAnchor)this.A).getIndex$compose_release();
                int v3 = AnchorFunctions.INSTANCE.verticalAnchorIndexToFunctionIndex(v2, layoutDirection0);
                ConstraintReference constraintReference2 = ((BaseVerticalAnchorable)this.z).getConstraintReference(((State)object0));
                ((ConstraintReference)AnchorFunctions.INSTANCE.getVerticalAnchorFunctions()[v1][v3].invoke(constraintReference2, ((VerticalAnchor)this.A).getId$compose_release(), ((State)object0).getLayoutDirection())).margin(Dp.box-impl(this.x)).marginGone(Dp.box-impl(this.y));
                return Unit.INSTANCE;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                ConstraintReference constraintReference3 = ((State)object0).constraints(((ConstrainScope)this.z).getId$compose_release());
                float f = (float)((State)object0).convertDimension(Dp.box-impl(this.y));
                constraintReference3.circularConstraint(((ConstrainedLayoutReference)this.A).getId(), this.x, f);
                return Unit.INSTANCE;
            }
            default: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                BaselineAnchor constraintLayoutBaseScope$BaselineAnchor0 = (BaselineAnchor)this.A;
                b b0 = (b)this.z;
                if(((State)object0) != null) {
                    ((State)object0).baselineNeededFor$compose_release(b0.b);
                    ((State)object0).baselineNeededFor$compose_release(constraintLayoutBaseScope$BaselineAnchor0.getId$compose_release());
                }
                ConstraintReference constraintReference0 = ((State)object0).constraints(b0.b);
                Intrinsics.checkNotNullExpressionValue(constraintReference0, "this");
                ((ConstraintReference)AnchorFunctions.INSTANCE.getBaselineAnchorFunction().invoke(constraintReference0, constraintLayoutBaseScope$BaselineAnchor0.getId$compose_release())).margin(Dp.box-impl(this.x)).marginGone(Dp.box-impl(this.y));
                return Unit.INSTANCE;
            }
        }
    }
}

