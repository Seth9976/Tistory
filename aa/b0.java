package aa;

import android.graphics.Matrix;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function0 {
    public final MutableState A;
    public final DecorationControllerInterface w;
    public final long x;
    public final Rect y;
    public final Matrix z;

    public b0(DecorationControllerInterface decorationControllerInterface0, long v, Rect rect0, Matrix matrix0, MutableState mutableState0) {
        this.w = decorationControllerInterface0;
        this.x = v;
        this.y = rect0;
        this.z = matrix0;
        this.A = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long v = DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$1(this.A);
        return Boolean.valueOf(this.w.isInDisplayRect-v05aCt0(this.x, this.y, this.z, v));
    }
}

