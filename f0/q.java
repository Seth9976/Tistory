package f0;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.SheetState;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class q extends Lambda implements Function1 {
    public final int w;
    public final boolean x;
    public final Object y;
    public final Object z;

    public q(SheetState sheetState0, Function1 function10, boolean z) {
        this.w = 1;
        this.y = sheetState0;
        this.z = function10;
        this.x = z;
        super(1);
    }

    public q(boolean z, PagerState pagerState0, CoroutineScope coroutineScope0) {
        this.w = 0;
        this.x = z;
        this.y = pagerState0;
        this.z = coroutineScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Throwable throwable0 = (Throwable)object0;
            if(!((SheetState)this.y).isVisible()) {
                ((Function1)this.z).invoke(Boolean.valueOf(this.x));
            }
            return Unit.INSTANCE;
        }
        CoroutineScope coroutineScope0 = (CoroutineScope)this.z;
        PagerState pagerState0 = (PagerState)this.y;
        if(this.x) {
            SemanticsPropertiesKt.pageUp$default(((SemanticsPropertyReceiver)object0), null, new p(pagerState0, coroutineScope0, 0), 1, null);
            SemanticsPropertiesKt.pageDown$default(((SemanticsPropertyReceiver)object0), null, new p(pagerState0, coroutineScope0, 1), 1, null);
            return Unit.INSTANCE;
        }
        SemanticsPropertiesKt.pageLeft$default(((SemanticsPropertyReceiver)object0), null, new p(pagerState0, coroutineScope0, 2), 1, null);
        SemanticsPropertiesKt.pageRight$default(((SemanticsPropertyReceiver)object0), null, new p(pagerState0, coroutineScope0, 3), 1, null);
        return Unit.INSTANCE;
    }
}

