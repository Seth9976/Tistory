package o5;

import android.graphics.Bitmap;
import coil.EventListener;
import coil.RealImageLoader;
import coil.request.ImageRequest;
import coil.request.RequestDelegate;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class e extends ContinuationImpl {
    public RealImageLoader o;
    public RequestDelegate p;
    public ImageRequest q;
    public EventListener r;
    public Bitmap s;
    public Object t;
    public final RealImageLoader u;
    public int v;

    public e(RealImageLoader realImageLoader0, Continuation continuation0) {
        this.u = realImageLoader0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.t = object0;
        this.v |= 0x80000000;
        return RealImageLoader.access$executeMain(this.u, null, 0, this);
    }
}

