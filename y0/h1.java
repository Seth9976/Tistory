package y0;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h1 extends Lambda implements Function1 {
    public final MutableScatterSet w;

    public h1(MutableScatterSet mutableScatterSet0) {
        this.w = mutableScatterSet0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(object0 instanceof StateObjectImpl) {
            ((StateObjectImpl)object0).recordReadIn-h_f27i8$runtime_release(4);
        }
        this.w.add(object0);
        return Unit.INSTANCE;
    }
}

