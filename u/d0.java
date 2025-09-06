package u;

import androidx.compose.foundation.BasicTooltipState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class d0 extends Lambda implements Function0 {
    public final int w;
    public final CoroutineScope x;
    public final BasicTooltipState y;

    public d0(BasicTooltipState basicTooltipState0, CoroutineScope coroutineScope0) {
        this.w = 0;
        this.y = basicTooltipState0;
        this.x = coroutineScope0;
        super(0);
    }

    public d0(CoroutineScope coroutineScope0, BasicTooltipState basicTooltipState0) {
        this.w = 1;
        this.x = coroutineScope0;
        this.y = basicTooltipState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            g0 g00 = new g0(this.y, null);
            BuildersKt.launch$default(this.x, null, null, g00, 3, null);
            return true;
        }
        BasicTooltipState basicTooltipState0 = this.y;
        if(basicTooltipState0.isVisible()) {
            c0 c00 = new c0(basicTooltipState0, null);
            BuildersKt.launch$default(this.x, null, null, c00, 3, null);
        }
        return Unit.INSTANCE;
    }
}

