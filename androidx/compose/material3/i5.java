package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i5 extends Lambda implements Function2 {
    public final Function3 w;
    public final Function2 x;
    public final Function2 y;

    public i5(Function2 function20, Function2 function21, Function3 function30) {
        this.w = function30;
        this.x = function20;
        this.y = function21;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1706202235, v, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous> (DatePickerDialog.android.kt:90)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), alignment$Companion0.getStart(), composer0, 6);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier0 = ComposedModifierKt.materializeModifier(composer0, modifier$Companion0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        Updater.set-impl(composer0, modifier0, composeUiNode$Companion0.getSetModifier());
        ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
        Modifier modifier1 = columnScopeInstance0.weight(modifier$Companion0, 1.0f, false);
        MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(composer0, modifier1);
        Function0 function01 = composeUiNode$Companion0.getConstructor();
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
        Function2 function21 = a.r(composeUiNode$Companion0, composer0, measurePolicy1, composer0, compositionLocalMap1);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            a.t(v2, composer0, v2, function21);
        }
        Integer integer0 = r0.a.l(composeUiNode$Companion0, composer0, modifier2, 6);
        this.w.invoke(columnScopeInstance0, composer0, integer0);
        composer0.endNode();
        Modifier modifier3 = PaddingKt.padding(columnScopeInstance0.align(modifier$Companion0, alignment$Companion0.getEnd()), DatePickerDialog_androidKt.a);
        MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap2 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier4 = ComposedModifierKt.materializeModifier(composer0, modifier3);
        Function0 function02 = composeUiNode$Companion0.getConstructor();
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
        Function2 function22 = a.r(composeUiNode$Companion0, composer0, measurePolicy2, composer0, compositionLocalMap2);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v3)) {
            a.t(v3, composer0, v3, function22);
        }
        Updater.set-impl(composer0, modifier4, composeUiNode$Companion0.getSetModifier());
        ProvideContentColorTextStyleKt.ProvideContentColorTextStyle-3J-VO9M(ColorSchemeKt.getValue(DialogTokens.INSTANCE.getActionLabelTextColor(), composer0, 6), TypographyKt.getValue(DialogTokens.INSTANCE.getActionLabelTextFont(), composer0, 6), ComposableLambdaKt.rememberComposableLambda(0x264973CA, true, new j(this.x, this.y, 3), composer0, 54), composer0, 0x180);
        composer0.endNode();
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

