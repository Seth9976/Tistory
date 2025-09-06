package m0;

import androidx.compose.foundation.text.input.internal.EditingBuffer;
import androidx.compose.foundation.text.input.internal.StatelessInputConnection;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function1 {
    public final int w;
    public final StatelessInputConnection x;

    public e0(StatelessInputConnection statelessInputConnection0, int v) {
        this.w = v;
        this.x = statelessInputConnection0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            ((EditingBuffer)object0).setSelection(0, StatelessInputConnection.access$getText(this.x).length());
            return Unit.INSTANCE;
        }
        MutableVector mutableVector0 = this.x.c;
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                ((Function1)arr_object[v1]).invoke(((EditingBuffer)object0));
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return Unit.INSTANCE;
    }
}

