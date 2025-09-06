package com.kakao.tistory.presentation.screen.home.ui.slot;

import a;
import androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Creator;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotGrid;
import d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function3 {
    public final List a;

    public b0(List list0) {
        this.a = list0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxWithConstraintsScope)object0), "$this$BoxWithConstraints");
        if((v & 14) == 0) {
            v |= (composer0.changed(((BoxWithConstraintsScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(841408198, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.ComposableSingletons$CreatorKt.lambda-1.<anonymous>.<anonymous> (Creator.kt:108)");
        }
        float f = ((BoxWithConstraintsScope)object0).getMaxWidth-D9Ej5fM();
        if(SlotGrid.INSTANCE.isSlotGridExpanded-0680j_4(f)) {
            composer0.startReplaceGroup(1568917101);
            Modifier modifier0 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            HorizontalOrVertical arrangement$HorizontalOrVertical0 = Arrangement.INSTANCE.spacedBy-0680j_4(12.0f);
            List list0 = this.a;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement$HorizontalOrVertical0, Alignment.Companion.getTop(), composer0, 6);
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
                d.a(v1, composer0, v1, function20);
            }
            Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            composer0.startReplaceGroup(0x60C01E98);
            for(Object object3: list0) {
                Modifier modifier2 = RowScope.weight$default(rowScopeInstance0, Modifier.Companion, 1.0f, false, 2, null);
                MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer0, 0);
                int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
                CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
                Modifier modifier3 = ComposedModifierKt.materializeModifier(composer0, modifier2);
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
                Function2 function21 = a.a(composeUiNode$Companion1, composer0, measurePolicy1, composer0, compositionLocalMap1);
                if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
                    d.a(v2, composer0, v2, function21);
                }
                Updater.set-impl(composer0, modifier3, composeUiNode$Companion1.getSetModifier());
                CreatorKt.access$CreatorContent(((Creator)object3), composer0, 0);
                composer0.endNode();
            }
        }
        else {
            composer0.startReplaceGroup(0x5D8B55A0);
            Modifier modifier4 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            List list1 = this.a;
            MeasurePolicy measurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer0, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
            CompositionLocalMap compositionLocalMap2 = composer0.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer0, modifier4);
            Companion composeUiNode$Companion2 = ComposeUiNode.Companion;
            Function0 function02 = composeUiNode$Companion2.getConstructor();
            if(composer0.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer0.startReusableNode();
            if(composer0.getInserting()) {
                composer0.createNode(function02);
            }
            else {
                composer0.useNode();
            }
            Function2 function22 = a.a(composeUiNode$Companion2, composer0, measurePolicy2, composer0, compositionLocalMap2);
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v3)) {
                d.a(v3, composer0, v3, function22);
            }
            r0.a.z(composeUiNode$Companion2, composer0, modifier5, composer0, 0x60C04D09);
            for(Object object4: list1) {
                CreatorKt.access$CreatorContent(((Creator)object4), composer0, 0);
            }
        }
        composer0.endReplaceGroup();
        composer0.endNode();
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

