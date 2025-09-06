package o6;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function1 {
    public final r A;
    public final int B;
    public final int w;
    public final Function1 x;
    public final a y;
    public final Function4 z;

    public m(int v, Function1 function10, a a0, Function4 function40, r r0, int v1) {
        this.w = v;
        this.x = function10;
        this.y = a0;
        this.z = function40;
        this.A = r0;
        this.B = v1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyRow");
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(-70560628, true, new l(this.y, this.z, this.A, this.B));
        LazyListScope.items$default(((LazyListScope)object0), this.w, this.x, null, composableLambda0, 4, null);
        return Unit.INSTANCE;
    }
}

