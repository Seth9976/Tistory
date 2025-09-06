package androidx.activity.result;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class a implements ActivityResultCallback {
    public final int a;
    public final Function1 b;

    public a(Function1 function10, int v) {
        this.a = v;
        this.b = function10;
        super();
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object object0) {
        if(this.a != 0) {
            Intrinsics.checkNotNullParameter(this.b, "$callback");
            this.b.invoke(object0);
            return;
        }
        Intrinsics.checkNotNullParameter(this.b, "$callback");
        this.b.invoke(object0);
    }
}

