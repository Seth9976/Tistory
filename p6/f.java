package p6;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.accompanist.swiperefresh.CircularProgressPainter;
import com.google.accompanist.swiperefresh.Slingshot;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class f extends Lambda implements Function2 {
    public final boolean A;
    public final float B;
    public final Slingshot C;
    public final int D;
    public final h w;
    public final boolean x;
    public final SwipeRefreshState y;
    public final long z;

    public f(h h0, boolean z, SwipeRefreshState swipeRefreshState0, long v, boolean z1, float f, Slingshot slingshot0, int v1) {
        this.w = h0;
        this.x = z;
        this.y = swipeRefreshState0;
        this.z = v;
        this.A = z1;
        this.B = f;
        this.C = slingshot0;
        this.D = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x71720669, v, -1, "com.google.accompanist.swiperefresh.SwipeRefreshIndicator.<anonymous> (SwipeRefreshIndicator.kt:187)");
        }
        ((Composer)object0).startReplaceableGroup(0xE2A708A4);
        CircularProgressPainter circularProgressPainter0 = ((Composer)object0).rememberedValue();
        if(circularProgressPainter0 == Composer.Companion.getEmpty()) {
            circularProgressPainter0 = new CircularProgressPainter();
            ((Composer)object0).updateRememberedValue(circularProgressPainter0);
        }
        ((Composer)object0).endReplaceableGroup();
        circularProgressPainter0.setArcRadius-0680j_4(this.w.b);
        circularProgressPainter0.setStrokeWidth-0680j_4(this.w.c);
        circularProgressPainter0.setArrowWidth-0680j_4(this.w.d);
        circularProgressPainter0.setArrowHeight-0680j_4(this.w.e);
        circularProgressPainter0.setArrowEnabled(this.x && !this.y.isRefreshing());
        circularProgressPainter0.setColor-8_81llA(this.z);
        circularProgressPainter0.setAlpha((this.A ? c.coerceIn(this.y.getIndicatorOffset() / this.B, 0.0f, 1.0f) : 1.0f));
        circularProgressPainter0.setStartTrim(this.C.getStartTrim());
        circularProgressPainter0.setEndTrim(this.C.getEndTrim());
        circularProgressPainter0.setRotation(this.C.getRotation());
        circularProgressPainter0.setArrowScale(this.C.getArrowScale());
        CrossfadeKt.Crossfade(Boolean.valueOf(this.y.isRefreshing()), null, AnimationSpecKt.tween$default(100, 0, null, 6, null), ComposableLambdaKt.composableLambda(((Composer)object0), 210015881, true, new e(this.w, this.z, this.D, circularProgressPainter0)), ((Composer)object0), 0xD80, 2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

