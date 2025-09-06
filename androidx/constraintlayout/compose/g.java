package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public final int w;
    public final ConstrainScope x;
    public final float y;

    public g(float f, ConstrainScope constrainScope0) {
        this.w = 2;
        this.y = f;
        this.x = constrainScope0;
        super(1);
    }

    public g(ConstrainScope constrainScope0, float f, int v) {
        this.w = v;
        this.x = constrainScope0;
        this.y = f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((ConstraintReference)object0), "$this$addTransform");
                if(!Intrinsics.areEqual(this.x.getVisibility(), Visibility.Companion.getInvisible())) {
                    ((ConstraintReference)object0).alpha(this.y);
                }
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                ((State)object0).constraints(this.x.getId$compose_release()).setHorizontalChainWeight(this.y);
                return Unit.INSTANCE;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                LayoutDirection layoutDirection0 = ((State)object0).getLayoutDirection();
                ((State)object0).constraints(this.x.getId$compose_release()).horizontalBias((layoutDirection0 == LayoutDirection.Rtl ? 1.0f - this.y : this.y));
                return Unit.INSTANCE;
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                ((State)object0).constraints(this.x.getId$compose_release()).verticalBias(this.y);
                return Unit.INSTANCE;
            }
            default: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                ((State)object0).constraints(this.x.getId$compose_release()).setVerticalChainWeight(this.y);
                return Unit.INSTANCE;
            }
        }
    }
}

