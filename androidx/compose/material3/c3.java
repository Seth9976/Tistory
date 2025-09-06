package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c3 extends Lambda implements Function0 {
    public final int w;
    public final Function1 x;
    public final boolean y;

    public c3(int v, boolean z, Function1 function10) {
        this.w = v;
        this.x = function10;
        this.y = z;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                this.x.invoke(Boolean.valueOf(!this.y));
                return Unit.INSTANCE;
            }
            case 1: {
                this.x.invoke(Boolean.valueOf(!this.y));
                return Unit.INSTANCE;
            }
            case 2: {
                this.x.invoke(Boolean.valueOf(!this.y));
                return Unit.INSTANCE;
            }
            case 3: {
                this.x.invoke(Boolean.valueOf(!this.y));
                return Unit.INSTANCE;
            }
            case 4: {
                this.x.invoke(Boolean.valueOf(!this.y));
                return Unit.INSTANCE;
            }
            default: {
                this.x.invoke(Boolean.valueOf(this.y));
                return Unit.INSTANCE;
            }
        }
    }
}

