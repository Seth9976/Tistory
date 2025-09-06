package o6;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function4 {
    public final a w;
    public final Function4 x;
    public final r y;
    public final int z;

    public j(a a0, Function4 function40, r r0, int v) {
        this.w = a0;
        this.x = function40;
        this.y = r0;
        this.z = v;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        Composer composer0 = (Composer)object2;
        int v1 = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((LazyItemScope)object0), "$this$items");
        int v2 = (v1 & 14) == 0 ? (composer0.changed(((LazyItemScope)object0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer0.changed(v) ? 0x20 : 16);
        }
        if((v2 & 731) == 0x92 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x709D49CD, v2, -1, "com.google.accompanist.pager.Pager.<anonymous>.<anonymous>.<anonymous> (Pager.kt:438)");
        }
        Modifier modifier0 = SizeKt.wrapContentSize$default(LazyItemScope.fillParentMaxHeight$default(((LazyItemScope)object0), NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, this.w, null, 2, null), 0.0f, 1, null), null, false, 3, null);
        composer0.startReplaceableGroup(0x2BB5B5D7);
        MeasurePolicy measurePolicy0 = r0.a.i(Alignment.Companion, false, composer0, 0, -1323940314);
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection0 = (LayoutDirection)composer0.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer0.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        r0.a.w(0, function30, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
        this.x.invoke(this.y, v, composer0, ((int)(v2 & 0x70 | this.z & 0x380)));
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

