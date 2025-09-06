package p0;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.material.BackdropScaffoldKt;
import androidx.compose.material.BackdropScaffoldState;
import androidx.compose.material.BackdropValue;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
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

public final class u0 extends Lambda implements Function2 {
    public final boolean w;
    public final BackdropScaffoldState x;
    public final Function2 y;
    public final Function2 z;

    public u0(boolean z, BackdropScaffoldState backdropScaffoldState0, Function2 function20, Function2 function21) {
        this.w = z;
        this.x = backdropScaffoldState0;
        this.y = function20;
        this.z = function21;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x67FF344B, v, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:281)");
        }
        Function2 function20 = this.z;
        Function2 function21 = this.y;
        if(this.w) {
            composer0.startReplaceableGroup(-1017265285);
            composer0.startReplaceableGroup(0xE32F0E82);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer0, 0);
            composer0.startReplaceableGroup(-1323940314);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
            CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.modifierMaterializerOf(Modifier.Companion);
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
            Function2 function22 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
                a.t(v1, composer0, v1, function22);
            }
            r0.a.w(0, function30, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
            function21.invoke(composer0, 0);
            function20.invoke(composer0, 0);
            composer0.endReplaceableGroup();
            composer0.endNode();
            composer0.endReplaceableGroup();
            composer0.endReplaceableGroup();
        }
        else {
            composer0.startReplaceableGroup(-1017265173);
            BackdropScaffoldKt.access$BackLayerTransition(((BackdropValue)this.x.getTargetValue()), function21, function20, composer0, 0);
        }
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

