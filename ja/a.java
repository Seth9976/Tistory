package ja;

import com.kakao.kandinsky.launcher.Kandinsky;
import com.kakao.kandinsky.launcher.KandinskyOutputItem;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class a extends ContinuationImpl {
    public KandinskyOutputItem o;
    public KandinskyOutputItem p;
    public Object q;
    public final Kandinsky r;
    public int s;

    public a(Kandinsky kandinsky0, Continuation continuation0) {
        this.r = kandinsky0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.generateBitmap(null, this);
    }
}

