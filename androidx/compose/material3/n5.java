package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n5 extends Lambda implements Function2 {
    public final TextStyle A;
    public final Function2 w;
    public final Function2 x;
    public final Function2 y;
    public final DatePickerColors z;

    public n5(Function2 function20, Function2 function21, Function2 function22, DatePickerColors datePickerColors0, TextStyle textStyle0) {
        this.w = function20;
        this.x = function21;
        this.y = function22;
        this.z = datePickerColors0;
        this.A = textStyle0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Horizontal arrangement$Horizontal0;
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-229007058, v, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous> (DatePicker.kt:1320)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
        Arrangement arrangement0 = Arrangement.INSTANCE;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer0, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
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
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        Function2 function21 = this.w;
        Function2 function22 = this.x;
        if(function21 == null || function22 == null) {
            arrangement$Horizontal0 = function21 == null ? arrangement0.getEnd() : arrangement0.getStart();
        }
        else {
            arrangement$Horizontal0 = arrangement0.getSpaceBetween();
        }
        Modifier modifier2 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement$Horizontal0, alignment$Companion0.getCenterVertically(), composer0, 0x30);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer0, modifier2);
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
        Function2 function23 = a.r(composeUiNode$Companion0, composer0, measurePolicy1, composer0, compositionLocalMap1);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            a.t(v2, composer0, v2, function23);
        }
        Updater.set-impl(composer0, modifier3, composeUiNode$Companion0.getSetModifier());
        RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
        composer0.startReplaceGroup(0xB3448F38);
        if(function21 != null) {
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xC6A89108, true, new m5(rowScopeInstance0, function21), composer0, 54);
            TextKt.ProvideTextStyle(this.A, composableLambda0, composer0, 0x30);
        }
        composer0.endReplaceGroup();
        composer0.startReplaceGroup(0xB344AEC4);
        if(function22 != null) {
            function22.invoke(composer0, 0);
        }
        composer0.endReplaceGroup();
        composer0.endNode();
        composer0.startReplaceGroup(1995129302);
        if(this.y != null || function21 != null || function22 != null) {
            DividerKt.HorizontalDivider-9IZ8Weo(null, 0.0f, this.z.getDividerColor-0d7_KjU(), composer0, 0, 3);
        }
        if(a.x(composer0)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

