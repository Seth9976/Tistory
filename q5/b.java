package q5;

import coil.decode.BitmapFactoryDecoder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Semaphore;

public final class b extends ContinuationImpl {
    public Object o;
    public Semaphore p;
    public Object q;
    public final BitmapFactoryDecoder r;
    public int s;

    public b(BitmapFactoryDecoder bitmapFactoryDecoder0, Continuation continuation0) {
        this.r = bitmapFactoryDecoder0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.decode(this);
    }
}

