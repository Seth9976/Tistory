package aa;

import android.graphics.Matrix;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function0 {
    public final Matrix A;
    public final MutableState B;
    public final DecorationControllerInterface w;
    public final long x;
    public final State y;
    public final State z;

    public p(DecorationControllerInterface decorationControllerInterface0, long v, State state0, State state1, Matrix matrix0, MutableState mutableState0) {
        this.w = decorationControllerInterface0;
        this.x = v;
        this.y = state0;
        this.z = state1;
        this.A = matrix0;
        this.B = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object object0 = DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$12(this.y);
        float f = DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$11(this.z).getScale();
        long v = Size.times-7Ah8Wj8(this.x, f);
        Matrix matrix0 = MatrixExtensionKt.buildMatrix$default(null, new o(0, this.A, this.z), 1, null);
        this.w.onScaleAndRotate-12SF9DM(object0, v, matrix0);
        DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$5(this.B, 0L);
        return Unit.INSTANCE;
    }
}

