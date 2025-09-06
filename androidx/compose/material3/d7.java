package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d7 extends Lambda implements Function0 {
    public final int w;
    public final Function1 x;
    public final int y;

    public d7(int v, int v1, Function1 function10) {
        this.w = v1;
        this.x = function10;
        this.y = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                this.x.invoke(this.y);
                return Unit.INSTANCE;
            }
            case 1: {
                this.x.invoke(this.y);
                return Unit.INSTANCE;
            }
            default: {
                this.x.invoke(this.y);
                return Unit.INSTANCE;
            }
        }
    }
}

