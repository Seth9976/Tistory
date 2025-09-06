package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
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

public final class hr extends Lambda implements Function2 {
    public final Function2 w;
    public final Function2 x;
    public final RichTooltipColors y;
    public final Function2 z;

    public hr(Function2 function20, Function2 function21, RichTooltipColors richTooltipColors0, Function2 function22) {
        this.w = function20;
        this.x = function21;
        this.y = richTooltipColors0;
        this.z = function22;
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
            ComposerKt.traceEventStart(317290958, v, -1, "androidx.compose.material3.RichTooltip.<anonymous> (Tooltip.android.kt:179)");
        }
        TextStyle textStyle0 = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getActionLabelTextFont(), composer0, 6);
        TextStyle textStyle1 = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getSubheadFont(), composer0, 6);
        TextStyle textStyle2 = TypographyKt.getValue(RichTooltipTokens.INSTANCE.getSupportingTextFont(), composer0, 6);
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 16.0f, 0.0f, 2, null);
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
        r0.a.z(composeUiNode$Companion0, composer0, modifier1, composer0, 955016030);
        Function2 function21 = this.w;
        RichTooltipColors richTooltipColors0 = this.y;
        if(function21 != null) {
            Modifier modifier2 = AlignmentLineKt.paddingFromBaseline-VpY3zN4$default(modifier$Companion0, 28.0f, 0.0f, 2, null);
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
            Function2 function22 = a.r(composeUiNode$Companion0, composer0, measurePolicy1, composer0, compositionLocalMap1);
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
                a.t(v2, composer0, v2, function22);
            }
            Updater.set-impl(composer0, modifier3, composeUiNode$Companion0.getSetModifier());
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.box-impl(richTooltipColors0.getTitleContentColor-0d7_KjU())), TextKt.getLocalTextStyle().provides(textStyle1)}, function21, composer0, ProvidedValue.$stable);
            composer0.endNode();
        }
        composer0.endReplaceGroup();
        boolean z = true;
        Function2 function23 = this.x;
        if(function23 == null) {
            z = false;
        }
        Modifier modifier4 = TooltipKt.textVerticalPadding(modifier$Companion0, function21 != null, z);
        MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap2 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier5 = ComposedModifierKt.materializeModifier(composer0, modifier4);
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
        Function2 function24 = a.r(composeUiNode$Companion0, composer0, measurePolicy2, composer0, compositionLocalMap2);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v3)) {
            a.t(v3, composer0, v3, function24);
        }
        Updater.set-impl(composer0, modifier5, composeUiNode$Companion0.getSetModifier());
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.box-impl(richTooltipColors0.getContentColor-0d7_KjU())), TextKt.getLocalTextStyle().provides(textStyle2)}, this.z, composer0, ProvidedValue.$stable);
        composer0.endNode();
        composer0.startReplaceGroup(0x38ECBF82);
        if(function23 != null) {
            Modifier modifier6 = PaddingKt.padding-qDBjuR0$default(SizeKt.requiredHeightIn-VpY3zN4$default(modifier$Companion0, 36.0f, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, 8.0f, 7, null);
            MeasurePolicy measurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
            CompositionLocalMap compositionLocalMap3 = composer0.getCurrentCompositionLocalMap();
            Modifier modifier7 = ComposedModifierKt.materializeModifier(composer0, modifier6);
            Function0 function03 = composeUiNode$Companion0.getConstructor();
            if(composer0.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer0.startReusableNode();
            if(composer0.getInserting()) {
                composer0.createNode(function03);
            }
            else {
                composer0.useNode();
            }
            Function2 function25 = a.r(composeUiNode$Companion0, composer0, measurePolicy3, composer0, compositionLocalMap3);
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v4)) {
                a.t(v4, composer0, v4, function25);
            }
            Updater.set-impl(composer0, modifier7, composeUiNode$Companion0.getSetModifier());
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.box-impl(richTooltipColors0.getActionContentColor-0d7_KjU())), TextKt.getLocalTextStyle().provides(textStyle0)}, function23, composer0, 8);
            composer0.endNode();
        }
        if(a.x(composer0)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

