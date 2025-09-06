package f;

import android.graphics.Bitmap;
import android.graphics.Paint;
import com.kakao.kandinsky.core.kdphoto.Signature;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class g extends ContinuationImpl {
    public l a;
    public Bitmap b;
    public Signature c;
    public Paint d;
    public long e;
    public long f;
    public Object g;
    public final l h;
    public int i;

    public g(l l0, Continuation continuation0) {
        this.h = l0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.g = object0;
        this.i |= 0x80000000;
        return this.h.a(null, null, this);
    }
}

