package bb;

import android.graphics.Matrix;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final int w;
    public final Matrix x;

    public b(Matrix matrix0, int v) {
        this.w = v;
        this.x = matrix0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
                ((Matrix)object0).postConcat(this.x);
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
                ((Matrix)object0).postConcat(this.x);
                return Unit.INSTANCE;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
                ((Matrix)object0).postConcat(this.x);
                return Unit.INSTANCE;
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
                ((Matrix)object0).postConcat(this.x);
                return Unit.INSTANCE;
            }
            default: {
                Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
                ((Matrix)object0).postConcat(this.x);
                return Unit.INSTANCE;
            }
        }
    }
}

