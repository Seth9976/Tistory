package na;

import androidx.compose.runtime.MutableState;
import com.kakao.kandinsky.preview.PinchZoomImageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function0 {
    public final MutableState w;
    public final MutableState x;

    public j(MutableState mutableState0, MutableState mutableState1) {
        this.w = mutableState0;
        this.x = mutableState1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PinchZoomImageKt.access$PinchZoomImage$lambda$4(this.w, 1.0f);
        PinchZoomImageKt.access$PinchZoomImage$lambda$8(this.x, 0L);
        return Unit.INSTANCE;
    }
}

