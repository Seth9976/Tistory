package aa;

import android.graphics.Matrix;
import androidx.compose.runtime.MutableState;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import com.kakao.kandinsky.decoration.DecorationRectKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function0 {
    public final long w;
    public final Matrix x;
    public final MutableState y;
    public final MutableState z;

    public z(long v, Matrix matrix0, MutableState mutableState0, MutableState mutableState1) {
        this.w = v;
        this.x = matrix0;
        this.y = mutableState0;
        this.z = mutableState1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long v = DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$1(this.y);
        long v1 = DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$4(this.z);
        return DecorationRectKt.calculateDecorationRect-XBZSM3c(this.w, this.x, v, v1);
    }
}

