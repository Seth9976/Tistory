package f;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.kakao.kandinsky.core.kdphoto.Decoration.Absolute;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h extends ContinuationImpl {
    public l a;
    public Bitmap b;
    public Canvas c;
    public Iterator d;
    public Absolute e;
    public int f;
    public Object g;
    public final l h;
    public int i;

    public h(l l0, Continuation continuation0) {
        this.h = l0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.g = object0;
        this.i |= 0x80000000;
        return this.h.a(0, 0, null, this);
    }
}

