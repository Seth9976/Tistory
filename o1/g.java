package o1;

import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class g extends Lambda implements Function1 {
    public final ObjectRef w;
    public final int x;

    public g(int v, ObjectRef ref$ObjectRef0) {
        this.w = ref$ObjectRef0;
        this.x = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Boolean boolean0 = FocusTransactionsKt.requestFocus-Mxy_nc0(((FocusTargetNode)object0), this.x);
        this.w.element = boolean0;
        return boolean0 == null ? false : Boolean.valueOf(boolean0.booleanValue());
    }
}

