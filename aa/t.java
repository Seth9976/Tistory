package aa;

import androidx.compose.runtime.MutableState;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function1 {
    public final MutableState w;

    public t(MutableState mutableState0) {
        this.w = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$2(this.w, 0L);
        return Unit.INSTANCE;
    }
}

