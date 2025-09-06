package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class zi extends Lambda implements Function3 {
    public final SearchBarColors w;
    public final Function3 x;

    public zi(SearchBarColors searchBarColors0, Function3 function30) {
        this.w = searchBarColors0;
        this.x = function30;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        AnimatedVisibilityScope animatedVisibilityScope0 = (AnimatedVisibilityScope)object0;
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1743690306, v, -1, "androidx.compose.material3.DockedSearchBar.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:309)");
        }
        float f = Dp.constructor-impl(((Configuration)composer0.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp);
        boolean z = composer0.changed(f);
        Dp dp0 = composer0.rememberedValue();
        if(z || dp0 == Composer.Companion.getEmpty()) {
            dp0 = Dp.box-impl(f * 0.666667f);
            composer0.updateRememberedValue(dp0);
        }
        float f1 = dp0.unbox-impl();
        boolean z1 = composer0.changed(f1);
        Dp dp1 = composer0.rememberedValue();
        if(z1 || dp1 == Composer.Companion.getEmpty()) {
            dp1 = Dp.box-impl(((Dp)c.coerceAtMost(Dp.box-impl(SearchBar_androidKt.getDockedExpandedTableMinHeight()), Dp.box-impl(f1))).unbox-impl());
            composer0.updateRememberedValue(dp1);
        }
        Modifier modifier0 = SizeKt.heightIn-VpY3zN4(Modifier.Companion, dp1.unbox-impl(), f1);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer0, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
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
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        DividerKt.HorizontalDivider-9IZ8Weo(null, 0.0f, this.w.getDividerColor-0d7_KjU(), composer0, 0, 3);
        this.x.invoke(ColumnScopeInstance.INSTANCE, composer0, 6);
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

