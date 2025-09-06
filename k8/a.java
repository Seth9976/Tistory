package k8;

import com.google.android.play.core.ktx.AppUpdateManagerKtxKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class a extends ContinuationImpl {
    public Object o;
    public int p;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.p |= 0x80000000;
        return AppUpdateManagerKtxKt.requestAppUpdateInfo(null, this);
    }
}

