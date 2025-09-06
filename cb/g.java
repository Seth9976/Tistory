package cb;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class g extends Lambda implements Function2 {
    public final int w;
    public final Function0 x;

    public g(Function0 function00, int v) {
        this.w = v;
        this.x = function00;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).floatValue();
            Intrinsics.checkNotNullParameter(((CoroutineScope)object0), "$this$ColorPanel");
            this.x.invoke();
            return Unit.INSTANCE;
        }
        ((Number)object1).floatValue();
        Intrinsics.checkNotNullParameter(((CoroutineScope)object0), "$this$ColorPanel");
        this.x.invoke();
        return Unit.INSTANCE;
    }
}

