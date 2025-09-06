package u;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class g1 extends Lambda implements Function1 {
    public final int w;
    public final h1 x;

    public g1(h1 h10, int v) {
        this.w = v;
        this.x = h10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Function0 function00 = this.x.I;
                if(function00 != null) {
                    function00.invoke();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                Function0 function01 = this.x.H;
                if(function01 != null) {
                    function01.invoke();
                }
                return Unit.INSTANCE;
            }
            default: {
                h1 h10 = this.x;
                if(h10.getEnabled()) {
                    h10.getOnClick().invoke();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

