package androidx.constraintlayout.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final int w;
    public final ConstrainScope x;
    public final Dimension y;

    public i(ConstrainScope constrainScope0, Dimension dimension0, int v) {
        this.w = v;
        this.x = constrainScope0;
        this.y = dimension0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((State)object0), "state");
            ((State)object0).constraints(this.x.getId$compose_release()).width(((DimensionDescription)this.y).toSolverDimension$compose_release(((State)object0)));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(((State)object0), "state");
        ((State)object0).constraints(this.x.getId$compose_release()).height(((DimensionDescription)this.y).toSolverDimension$compose_release(((State)object0)));
        return Unit.INSTANCE;
    }
}

