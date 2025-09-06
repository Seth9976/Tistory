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
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function2 {
    public final long A;
    public final long B;
    public final long C;
    public final Function2 D;
    public final Function2 w;
    public final Function2 x;
    public final Function2 y;
    public final long z;

    public e(Function2 function20, Function2 function21, Function2 function22, long v, long v1, long v2, long v3, Function2 function23) {
        this.w = function20;
        this.x = function21;
        this.y = function22;
        this.z = v;
        this.A = v1;
        this.B = v2;
        this.C = v3;
        this.D = function23;
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
            ComposerKt.traceEventStart(-2126308228, v, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:300)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding(modifier$Companion0, AlertDialogKt.e);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Companion0.getStart(), composer0, 0);
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
        ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
        composer0.startReplaceGroup(0x8D4344E5);
        Function2 function21 = this.w;
        if(function21 != null) {
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(this.z)), ComposableLambdaKt.rememberComposableLambda(0x37B5BEE5, true, new b(columnScopeInstance0, function21), composer0, 54), composer0, ProvidedValue.$stable | 0x30);
        }
        composer0.endReplaceGroup();
        composer0.startReplaceGroup(0x8D436B39);
        Function2 function22 = this.x;
        if(function22 != null) {
            TextStyle textStyle0 = TypographyKt.getValue(DialogTokens.INSTANCE.getHeadlineFont(), composer0, 6);
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x19E52984, true, new c(columnScopeInstance0, function21, function22), composer0, 54);
            ProvideContentColorTextStyleKt.ProvideContentColorTextStyle-3J-VO9M(this.A, textStyle0, composableLambda0, composer0, 0x180);
        }
        composer0.endReplaceGroup();
        composer0.startReplaceGroup(0x8D43CD11);
        Function2 function23 = this.y;
        if(function23 != null) {
            TextStyle textStyle1 = TypographyKt.getValue(DialogTokens.INSTANCE.getSupportingTextFont(), composer0, 6);
            ComposableLambda composableLambda1 = ComposableLambdaKt.rememberComposableLambda(0xD0812105, true, new d(columnScopeInstance0, function23), composer0, 54);
            ProvideContentColorTextStyleKt.ProvideContentColorTextStyle-3J-VO9M(this.B, textStyle1, composableLambda1, composer0, 0x180);
        }
        composer0.endReplaceGroup();
        Modifier modifier2 = columnScopeInstance0.align(modifier$Companion0, alignment$Companion0.getEnd());
        MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
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
        Function2 function24 = a.r(composeUiNode$Companion0, composer0, measurePolicy1, composer0, compositionLocalMap1);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            a.t(v2, composer0, v2, function24);
        }
        Updater.set-impl(composer0, modifier3, composeUiNode$Companion0.getSetModifier());
        TextStyle textStyle2 = TypographyKt.getValue(DialogTokens.INSTANCE.getActionLabelTextFont(), composer0, 6);
        ProvideContentColorTextStyleKt.ProvideContentColorTextStyle-3J-VO9M(this.C, textStyle2, this.D, composer0, 0);
        composer0.endNode();
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

