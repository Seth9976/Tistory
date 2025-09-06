package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State.Helper;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class e extends BaseVerticalAnchorable {
    public final int c;
    public final Object d;

    public e(Object object0, int v, ArrayList arrayList0) {
        this.c = 1;
        Intrinsics.checkNotNullParameter(object0, "id");
        Intrinsics.checkNotNullParameter(arrayList0, "tasks");
        super(arrayList0, v);
        this.d = object0;
    }

    public e(ArrayList arrayList0, Object object0, int v) {
        this.c = 0;
        Intrinsics.checkNotNullParameter(arrayList0, "tasks");
        Intrinsics.checkNotNullParameter(object0, "id");
        super(arrayList0, v);
        this.d = object0;
    }

    @Override  // androidx.constraintlayout.compose.BaseVerticalAnchorable
    public final ConstraintReference getConstraintReference(State state0) {
        if(this.c != 0) {
            Intrinsics.checkNotNullParameter(state0, "state");
            ConstraintReference constraintReference0 = state0.constraints(this.d);
            Intrinsics.checkNotNullExpressionValue(constraintReference0, "state.constraints(id)");
            return constraintReference0;
        }
        Intrinsics.checkNotNullParameter(state0, "state");
        ConstraintReference constraintReference1 = state0.helper(this.d, Helper.HORIZONTAL_CHAIN);
        Intrinsics.checkNotNullExpressionValue(constraintReference1, "state.helper(id, androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_CHAIN)");
        return constraintReference1;
    }
}

