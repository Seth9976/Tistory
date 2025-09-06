package w0;

import androidx.compose.material3.TooltipState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class d0 extends Lambda implements Function0 {
    public final int w;
    public final CoroutineScope x;
    public final TooltipState y;

    public d0(TooltipState tooltipState0, CoroutineScope coroutineScope0) {
        this.w = 0;
        this.y = tooltipState0;
        this.x = coroutineScope0;
        super(0);
    }

    public d0(CoroutineScope coroutineScope0, TooltipState tooltipState0) {
        this.w = 1;
        this.x = coroutineScope0;
        this.y = tooltipState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            g0 g00 = new g0(this.y, null);
            BuildersKt.launch$default(this.x, null, null, g00, 3, null);
            return true;
        }
        TooltipState tooltipState0 = this.y;
        if(tooltipState0.isVisible()) {
            c0 c00 = new c0(tooltipState0, null);
            BuildersKt.launch$default(this.x, null, null, c00, 3, null);
        }
        return Unit.INSTANCE;
    }
}

