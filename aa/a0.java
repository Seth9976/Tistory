package aa;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function0 {
    public final MutableState w;

    public a0(MutableState mutableState0) {
        this.w = mutableState0;
        super(0);
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(!Offset.equals-impl0(DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$1(this.w), 0L));
    }
}

