package ma;

import android.graphics.Matrix;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function1 {
    public final Matrix w;

    public j(Matrix matrix0) {
        this.w = matrix0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
        ((Matrix)object0).postConcat(this.w);
        return Unit.INSTANCE;
    }
}

