package ka;

import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.mosaic.MosaicAndBlurBitmapLoader;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class a extends ContinuationImpl {
    public MosaicAndBlurBitmapLoader o;
    public List p;
    public Blur q;
    public MosaicAndBlurBitmapLoader r;
    public Object s;
    public final MosaicAndBlurBitmapLoader t;
    public int u;

    public a(MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0, Continuation continuation0) {
        this.t = mosaicAndBlurBitmapLoader0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.u |= 0x80000000;
        return this.t.a(null, null, this);
    }
}

