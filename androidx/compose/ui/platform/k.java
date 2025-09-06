package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function1 {
    public final int w;
    public final FocusDirection x;

    public k(FocusDirection focusDirection0, int v) {
        this.w = v;
        this.x = focusDirection0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Boolean boolean0 = FocusTransactionsKt.requestFocus-Mxy_nc0(((FocusTargetNode)object0), this.x.unbox-impl());
            return boolean0 == null ? true : Boolean.valueOf(boolean0.booleanValue());
        }
        Boolean boolean1 = FocusTransactionsKt.requestFocus-Mxy_nc0(((FocusTargetNode)object0), this.x.unbox-impl());
        return boolean1 == null ? true : Boolean.valueOf(boolean1.booleanValue());
    }
}

