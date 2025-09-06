package eg;

import com.google.android.gms.tasks.CancellationTokenSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final int w;
    public final CancellationTokenSource x;

    public b(CancellationTokenSource cancellationTokenSource0, int v) {
        this.w = v;
        this.x = cancellationTokenSource0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Throwable throwable0 = (Throwable)object0;
            this.x.cancel();
            return Unit.INSTANCE;
        }
        Throwable throwable1 = (Throwable)object0;
        this.x.cancel();
        return Unit.INSTANCE;
    }
}

