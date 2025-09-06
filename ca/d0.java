package ca;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt.CommonFeatureBottomBar.4.WhenMappings;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function3 {
    public final Orientation w;
    public final Function2 x;

    public d0(Orientation orientation0, Function2 function20) {
        this.w = orientation0;
        this.x = function20;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxScope)object0), "$this$FeatureBottomBar");
        if((v & 81) == 16 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDD1A7473, v, -1, "com.kakao.kandinsky.designsystem.common.CommonFeatureBottomBar.<anonymous> (FeatureBottomBar.kt:37)");
        }
        Function2 function20 = this.x;
        switch(FeatureBottomBarKt.CommonFeatureBottomBar.4.WhenMappings.$EnumSwitchMapping$0[this.w.ordinal()]) {
            case 1: {
                composer0.startReplaceGroup(0x5D2A7202);
                MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer0, 0);
                int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
                CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
                Modifier modifier0 = ComposedModifierKt.materializeModifier(composer0, Modifier.Companion);
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
                Function2 function21 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
                if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
                    a.t(v1, composer0, v1, function21);
                }
                function20.invoke(composer0, r0.a.l(composeUiNode$Companion0, composer0, modifier0, 0));
                composer0.endNode();
                composer0.endReplaceGroup();
                break;
            }
            case 2: {
                composer0.startReplaceGroup(1563062851);
                MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(12.0f), Alignment.Companion.getStart(), composer0, 6);
                int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
                CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
                Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, Modifier.Companion);
                Companion composeUiNode$Companion1 = ComposeUiNode.Companion;
                Function0 function01 = composeUiNode$Companion1.getConstructor();
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
                function20.invoke(composer0, r0.a.l(composeUiNode$Companion1, composer0, modifier1, 0));
                composer0.endNode();
                composer0.endReplaceGroup();
                break;
            }
            default: {
                composer0.startReplaceGroup(1563062942);
                composer0.endReplaceGroup();
            }
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

