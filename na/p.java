package na;

import android.graphics.Matrix;
import com.kakao.kandinsky.preview.AnimationMatrix;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function1 {
    public final int w;
    public final AnimationMatrix x;

    public p(AnimationMatrix animationMatrix0, int v) {
        this.w = v;
        this.x = animationMatrix0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
            ((Matrix)object0).postConcat(MatrixExtensionKt.invert(this.x.getTo()));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
        ((Matrix)object0).postConcat(MatrixExtensionKt.invert(this.x.getFrom()));
        return Unit.INSTANCE;
    }
}

