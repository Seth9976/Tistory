package androidx.constraintlayout.compose;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function1 {
    public final int w;
    public final u x;

    public t(u u0, int v) {
        this.w = v;
        this.x = u0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((Unit)object0), "$noName_0");
            this.x.d = true;
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(((Function0)object0), "it");
        if(Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            ((Function0)object0).invoke();
            return Unit.INSTANCE;
        }
        u u0 = this.x;
        Handler handler0 = u0.b;
        if(handler0 == null) {
            handler0 = new Handler(Looper.getMainLooper());
            u0.b = handler0;
        }
        handler0.post(new m(((Function0)object0), 1));
        return Unit.INSTANCE;
    }
}

