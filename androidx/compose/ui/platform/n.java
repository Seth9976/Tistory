package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class n extends Lambda implements Function1 {
    public final int w;
    public final AndroidComposeView x;

    public n(AndroidComposeView androidComposeView0, int v) {
        this.w = v;
        this.x = androidComposeView0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            return new AndroidPlatformTextInputSession(this.x, this.x.getTextInputService(), ((CoroutineScope)object0));
        }
        AndroidComposeView androidComposeView0 = this.x;
        Handler handler0 = androidComposeView0.getHandler();
        if((handler0 == null ? null : handler0.getLooper()) == Looper.myLooper()) {
            ((Function0)object0).invoke();
            return Unit.INSTANCE;
        }
        Handler handler1 = androidComposeView0.getHandler();
        if(handler1 != null) {
            handler1.post(new m(((Function0)object0), 0));
        }
        return Unit.INSTANCE;
    }
}

