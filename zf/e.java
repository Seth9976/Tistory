package zf;

import android.view.ViewTreeObserver;
import coil.size.ViewSizeResolver;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;

public final class e extends Lambda implements Function1 {
    public final int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public e(Object object0, Object object1, int v, Object object2) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        this.z = object2;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Throwable throwable0 = (Throwable)object0;
            ((ViewSizeResolver)this.x).b(((ViewTreeObserver)this.y), ((coil.size.ViewSizeResolver.size.3.preDrawListener.1)this.z));
            return Unit.INSTANCE;
        }
        Throwable throwable1 = (Throwable)object0;
        OnUndeliveredElementKt.callUndeliveredElement(((Function1)this.x), this.y, ((CoroutineContext)this.z));
        return Unit.INSTANCE;
    }
}

