package ca;

import androidx.compose.runtime.MutableIntState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function2 {
    public final int w;
    public final MutableIntState x;

    public p(MutableIntState mutableIntState0, int v) {
        this.w = v;
        this.x = mutableIntState0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Boolean)object0).booleanValue();
            this.x.setIntValue(((Number)object1).intValue());
            return Unit.INSTANCE;
        }
        ((Boolean)object0).booleanValue();
        this.x.setIntValue(((Number)object1).intValue());
        return Unit.INSTANCE;
    }
}

