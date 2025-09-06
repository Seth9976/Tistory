package z;

import androidx.compose.foundation.gestures.ScrollConfig;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import java.util.List;

public final class u implements ScrollConfig {
    public static final u a;

    static {
        u.a = new u();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.foundation.gestures.ScrollConfig
    public final long calculateMouseWheelScroll-8xgXZGE(Density density0, PointerEvent pointerEvent0, long v) {
        List list0 = pointerEvent0.getChanges();
        Offset offset0 = Offset.box-impl(0L);
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            offset0 = Offset.box-impl(Offset.plus-MK-Hz9U(offset0.unbox-impl(), ((PointerInputChange)list0.get(v2)).getScrollDelta-F1C5BW0()));
        }
        return Offset.times-tuRUvjQ(offset0.unbox-impl(), -density0.toPx-0680j_4(64.0f));
    }
}

