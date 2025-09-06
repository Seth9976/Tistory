package j;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;

public final class h extends Lambda implements Function0 {
    public final BooleanRef w;
    public final Function0 x;

    public h(BooleanRef ref$BooleanRef0, Function0 function00) {
        this.w = ref$BooleanRef0;
        this.x = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.element = ((Boolean)this.x.invoke()).booleanValue();
        return Unit.INSTANCE;
    }
}

