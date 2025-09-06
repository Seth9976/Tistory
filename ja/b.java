package ja;

import com.kakao.kandinsky.launcher.Kandinsky;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class b extends ContinuationImpl {
    public Map o;
    public Iterator p;
    public Map q;
    public Object r;
    public Object s;
    public final Kandinsky t;
    public int u;

    public b(Kandinsky kandinsky0, Continuation continuation0) {
        this.t = kandinsky0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.u |= 0x80000000;
        return this.t.generateBitmap(null, this);
    }
}

