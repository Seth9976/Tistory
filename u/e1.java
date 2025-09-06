package u;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e1 extends Lambda implements Function0 {
    public final int w;
    public final f1 x;

    public e1(f1 f10, int v) {
        this.w = v;
        this.x = f10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            Function0 function00 = this.x.s;
            if(function00 != null) {
                function00.invoke();
            }
            return true;
        }
        this.x.q.invoke();
        return true;
    }
}

