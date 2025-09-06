package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.Dimension;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final int w;
    public final ConstrainScope x;

    public h(ConstrainScope constrainScope0, int v) {
        this.w = v;
        this.x = constrainScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                ((State)object0).constraints(this.x.getId$compose_release()).clear();
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                ((State)object0).constraints(this.x.getId$compose_release()).clearHorizontal();
                return Unit.INSTANCE;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                ((State)object0).constraints(this.x.getId$compose_release()).clearVertical();
                return Unit.INSTANCE;
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                Dimension dimension0 = ((DimensionDescription)androidx.constraintlayout.compose.Dimension.Companion.getWrapContent()).toSolverDimension$compose_release(((State)object0));
                ((State)object0).constraints(this.x.getId$compose_release()).width(dimension0).height(dimension0);
                return Unit.INSTANCE;
            }
            default: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                ((State)object0).constraints(this.x.getId$compose_release()).alpha(NaNf).scaleX(NaNf).scaleY(NaNf).rotationX(NaNf).rotationY(NaNf).rotationZ(NaNf).translationX(NaNf).translationY(NaNf).translationZ(NaNf).pivotX(NaNf).pivotY(NaNf);
                return Unit.INSTANCE;
            }
        }
    }
}

