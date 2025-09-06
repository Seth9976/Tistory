package f2;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

public final class h extends AdaptedFunctionReference implements Function1 {
    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((MutableVector)this.receiver).add(((i)object0));
        return Unit.INSTANCE;
    }
}

