package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class m implements Runnable {
    public final int a;
    public final Function0 b;

    public m(Function0 function00, int v) {
        this.a = v;
        this.b = function00;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                this.b.invoke();
                return;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(this.b, "$tmp0");
                this.b.invoke();
                return;
            }
            case 2: {
                this.b.invoke();
                return;
            }
            case 3: {
                this.b.invoke();
                return;
            }
            default: {
                this.b.invoke();
            }
        }
    }
}

