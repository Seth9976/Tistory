package z;

import androidx.compose.foundation.gestures.TransformableKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.Channel;

public final class r3 extends ContinuationImpl {
    public Object A;
    public int B;
    public AwaitPointerEventScope o;
    public Channel p;
    public Function1 q;
    public PointerEvent r;
    public boolean s;
    public float t;
    public float u;
    public float v;
    public long w;
    public int x;
    public int y;
    public int z;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.A = object0;
        this.B |= 0x80000000;
        return TransformableKt.access$detectZoom(null, false, null, null, this);
    }
}

