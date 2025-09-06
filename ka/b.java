package ka;

import com.kakao.kandinsky.mosaic.MosaicAndBlurBitmapLoader;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class b extends ContinuationImpl {
    public MosaicAndBlurBitmapLoader o;
    public int p;
    public Object q;
    public final MosaicAndBlurBitmapLoader r;
    public int s;

    public b(MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0, Continuation continuation0) {
        this.r = mosaicAndBlurBitmapLoader0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.loadBitmapExcludeSelected(0, this);
    }
}

