package aa;

import android.graphics.Matrix;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import com.kakao.kandinsky.designsystem.util.OffsetExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function0 {
    public final DecorationControllerInterface w;
    public final Matrix x;
    public final State y;
    public final MutableState z;

    public v(DecorationControllerInterface decorationControllerInterface0, Matrix matrix0, State state0, MutableState mutableState0) {
        this.w = decorationControllerInterface0;
        this.x = matrix0;
        this.y = state0;
        this.z = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object object0 = DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$12(this.y);
        long v = DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$1(this.z);
        long v1 = OffsetExtensionKt.mapVector-Uv8p0NA(this.x, v);
        this.w.onDrag-Uv8p0NA(object0, v1);
        DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$2(this.z, 0L);
        return Unit.INSTANCE;
    }
}

