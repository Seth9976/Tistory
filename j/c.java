package j;

import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.runtime.Composer;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final Function A;
    public final int w;
    public final boolean x;
    public final int y;
    public final int z;

    public c(boolean z, Function function0, int v, int v1, int v2) {
        this.w = v2;
        this.x = z;
        this.A = function0;
        this.y = v;
        this.z = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        if(this.w != 0) {
            PredictiveBackHandlerKt.PredictiveBackHandler(this.x, ((Function2)this.A), ((Composer)object0), this.y | 1, this.z);
            return Unit.INSTANCE;
        }
        BackHandlerKt.BackHandler(this.x, ((Function0)this.A), ((Composer)object0), this.y | 1, this.z);
        return Unit.INSTANCE;
    }
}

