package p0;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.material3.ni;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j0 extends Lambda implements Function3 {
    public final Function2 w;
    public final Function2 x;
    public final Function3 y;

    public j0(Function2 function20, Function2 function21, Function3 function30) {
        this.w = function20;
        this.x = function21;
        this.y = function30;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        if((v & 14) == 0) {
            v |= (composer0.changed(((RowScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6E3FF187, v, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:103)");
        }
        Function2 function20 = this.w;
        if(function20 == null) {
            composer0.startReplaceableGroup(0xE16F1B86);
            SpacerKt.Spacer(AppBarKt.c, composer0, 6);
        }
        else {
            composer0.startReplaceableGroup(0xE16F1BC1);
            composer0.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer0, 0x30);
            composer0.startReplaceableGroup(-1323940314);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
            CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.modifierMaterializerOf(AppBarKt.d);
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
                a.t(v1, composer0, v1, function21);
            }
            function30.invoke(SkippableUpdater.box-impl(composer0), composer0, 0);
            composer0.startReplaceableGroup(2058660585);
            CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(ContentAlpha.INSTANCE.getHigh(composer0, 6)), function20, composer0, ProvidedValue.$stable);
            composer0.endReplaceableGroup();
            composer0.endNode();
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
        }
        composer0.endReplaceableGroup();
        Modifier modifier0 = RowScope.weight$default(((RowScope)object0), SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), 1.0f, false, 2, null);
        composer0.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer0, 0x30);
        composer0.startReplaceableGroup(-1323940314);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
        Companion composeUiNode$Companion1 = ComposeUiNode.Companion;
        Function0 function01 = composeUiNode$Companion1.getConstructor();
        Function3 function31 = LayoutKt.modifierMaterializerOf(modifier0);
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function01);
        }
        else {
            composer0.useNode();
        }
        Function2 function22 = a.r(composeUiNode$Companion1, composer0, measurePolicy1, composer0, compositionLocalMap1);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            a.t(v2, composer0, v2, function22);
        }
        r0.a.w(0, function31, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer0, 6).getH6(), ComposableLambdaKt.composableLambda(composer0, -1654084516, true, new ni(this.x, 10)), composer0, 0x30);
        composer0.endReplaceableGroup();
        composer0.endNode();
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(ContentAlpha.INSTANCE.getMedium(composer0, 6)), ComposableLambdaKt.composableLambda(composer0, 0x7EF17647, true, new i0(this.y)), composer0, ProvidedValue.$stable | 0x30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

