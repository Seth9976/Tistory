package androidx.activity;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class z implements OnBackInvokedCallback {
    public final int a;
    public final Function0 b;

    public z(Function0 function00, int v) {
        this.a = v;
        this.b = function00;
        super();
    }

    @Override  // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        if(this.a != 0) {
            Function0 function00 = this.b;
            if(function00 != null) {
                function00.invoke();
            }
            return;
        }
        Intrinsics.checkNotNullParameter(this.b, "$onBackInvoked");
        this.b.invoke();
    }
}

