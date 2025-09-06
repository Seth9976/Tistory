package x0;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import w1.a;

public final class b extends Lambda implements Function3 {
    public final long w;
    public final PullToRefreshState x;

    public b(long v, PullToRefreshState pullToRefreshState0) {
        this.w = v;
        this.x = pullToRefreshState0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        boolean z = ((Boolean)object0).booleanValue();
        int v = ((Number)object2).intValue();
        if((v & 6) == 0) {
            v |= (((Composer)object1).changed(z) ? 4 : 2);
        }
        if((v & 19) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA008A6B, v, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous>.<anonymous> (PullToRefresh.kt:455)");
        }
        if(z) {
            ((Composer)object1).startReplaceGroup(0x2261D09B);
            ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(SizeKt.size-3ABfNKs(Modifier.Companion, 16.0f), this.w, 0.0f, 0L, 0, ((Composer)object1), 390, 24);
        }
        else {
            ((Composer)object1).startReplaceGroup(577079337);
            PullToRefreshState pullToRefreshState0 = this.x;
            boolean z1 = ((Composer)object1).changed(pullToRefreshState0);
            a a0 = ((Composer)object1).rememberedValue();
            if(z1 || a0 == Composer.Companion.getEmpty()) {
                a0 = new a(pullToRefreshState0, 3);
                ((Composer)object1).updateRememberedValue(a0);
            }
            PullToRefreshKt.access$CircularArrowProgressIndicator-RPmYEkk(a0, this.w, ((Composer)object1), 0);
        }
        ((Composer)object1).endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

