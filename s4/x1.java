package s4;

import androidx.paging.SeparatorsKt;
import androidx.paging.TransformablePage;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;

public final class x1 extends ContinuationImpl {
    public TransformablePage o;
    public Function3 p;
    public ArrayList q;
    public ArrayList r;
    public Object s;
    public int t;
    public int u;
    public Object v;
    public int w;

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.v = object0;
        this.w |= 0x80000000;
        return SeparatorsKt.insertInternalSeparators(null, null, this);
    }
}

