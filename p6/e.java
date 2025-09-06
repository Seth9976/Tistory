package p6;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.accompanist.swiperefresh.CircularProgressPainter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import r0.a;

public final class e extends Lambda implements Function3 {
    public final h w;
    public final long x;
    public final int y;
    public final CircularProgressPainter z;

    public e(h h0, long v, int v1, CircularProgressPainter circularProgressPainter0) {
        this.w = h0;
        this.x = v;
        this.y = v1;
        this.z = circularProgressPainter0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        boolean z = ((Boolean)object0).booleanValue();
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        if((((v & 14) == 0 ? (composer0.changed(z) ? 4 : 2) | v : v) & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(210015881, v, -1, "com.google.accompanist.swiperefresh.SwipeRefreshIndicator.<anonymous>.<anonymous> (SwipeRefreshIndicator.kt:212)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null);
        composer0.startReplaceableGroup(0x2BB5B5D7);
        MeasurePolicy measurePolicy0 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getCenter(), false, composer0, 6);
        composer0.startReplaceableGroup(-1323940314);
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection0 = (LayoutDirection)composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer0.consume(CompositionLocalsKt.getLocalViewConfiguration());
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        Function3 function30 = LayoutKt.materializerOf(modifier0);
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        composer0.disableReusing();
        Updater.set-impl(composer0, measurePolicy0, composeUiNode$Companion0.getSetMeasurePolicy());
        Updater.set-impl(composer0, density0, composeUiNode$Companion0.getSetDensity());
        Updater.set-impl(composer0, layoutDirection0, composeUiNode$Companion0.getSetLayoutDirection());
        Updater.set-impl(composer0, viewConfiguration0, composeUiNode$Companion0.getSetViewConfiguration());
        composer0.enableReusing();
        a.w(0, function30, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
        if(z) {
            composer0.startReplaceableGroup(0xA4F8E00A);
            ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(SizeKt.size-3ABfNKs(modifier$Companion0, (this.w.b + this.w.c) * 2.0f), this.x, this.w.c, 0L, 0, composer0, this.y >> 18 & 0x70, 24);
        }
        else {
            composer0.startReplaceableGroup(0xA4F8E15C);
            ImageKt.Image(this.z, "Refreshing", null, null, null, 0.0f, null, composer0, 56, 0x7C);
        }
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        composer0.endNode();
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

