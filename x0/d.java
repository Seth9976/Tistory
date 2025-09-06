package x0;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.material3.pulltorefresh.PullToRefreshDefaults;
import androidx.compose.material3.pulltorefresh.PullToRefreshState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function3 {
    public final PullToRefreshState w;
    public final boolean x;

    public d(PullToRefreshState pullToRefreshState0, boolean z) {
        this.w = pullToRefreshState0;
        this.x = z;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        if((v & 6) == 0) {
            v |= (((Composer)object1).changed(((BoxScope)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x76905819, v, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox.<anonymous> (PullToRefresh.kt:127)");
        }
        Modifier modifier0 = ((BoxScope)object0).align(Modifier.Companion, Alignment.Companion.getTopCenter());
        PullToRefreshDefaults.INSTANCE.Indicator-2poqoh4(this.w, this.x, modifier0, 0L, 0L, 0.0f, ((Composer)object1), 0x180000, 56);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

