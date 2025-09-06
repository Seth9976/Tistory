package androidx.fragment.app;

import android.os.Bundle;
import androidx.core.os.CancellationSignal.OnCancelListener;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class j0 implements OnCancelListener, FragmentResultListener {
    public final Object a;

    public j0(Object object0) {
        this.a = object0;
        super();
    }

    @Override  // androidx.core.os.CancellationSignal$OnCancelListener
    public void onCancel() {
        Intrinsics.checkNotNullParameter(((Operation)this.a), "this$0");
        ((Operation)this.a).cancel();
    }

    @Override  // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String s, Bundle bundle0) {
        Intrinsics.checkNotNullParameter(((Function2)this.a), "$tmp0");
        Intrinsics.checkNotNullParameter(s, "p0");
        Intrinsics.checkNotNullParameter(bundle0, "p1");
        ((Function2)this.a).invoke(s, bundle0);
    }
}

