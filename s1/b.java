package s1;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class b extends ContinuationImpl {
    public Object o;
    public final GraphicsLayer p;
    public int q;

    public b(GraphicsLayer graphicsLayer0, Continuation continuation0) {
        this.p = graphicsLayer0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.o = object0;
        this.q |= 0x80000000;
        return this.p.toImageBitmap(this);
    }
}

