package ka;

import android.graphics.Bitmap;
import com.kakao.kandinsky.mosaic.MosaicAndBlurBitmapLoader;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class c extends ContinuationImpl {
    public MosaicAndBlurBitmapLoader o;
    public Bitmap p;
    public MosaicAndBlurBitmapLoader q;
    public Object r;
    public final MosaicAndBlurBitmapLoader s;
    public int t;

    public c(MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0, Continuation continuation0) {
        this.s = mosaicAndBlurBitmapLoader0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.loadFullBitmap(this);
    }
}

