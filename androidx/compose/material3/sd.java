package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class sd extends Lambda implements Function1 {
    public final int w;
    public final SheetState x;
    public final Function0 y;

    public sd(SheetState sheetState0, Function0 function00, int v) {
        this.w = v;
        this.x = sheetState0;
        this.y = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Throwable throwable1 = (Throwable)object0;
                if(!this.x.isVisible()) {
                    this.y.invoke();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                Throwable throwable2 = (Throwable)object0;
                if(!this.x.isVisible()) {
                    this.y.invoke();
                }
                return Unit.INSTANCE;
            }
            default: {
                Throwable throwable0 = (Throwable)object0;
                if(!this.x.isVisible()) {
                    this.y.invoke();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

