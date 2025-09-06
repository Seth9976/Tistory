package com.kakao.tistory.presentation.view.login;

import a;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.TextUnitKt;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.theme.TypeKt;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c1 extends Lambda implements Function3 {
    public final String a;
    public final int b;
    public final State c;
    public final Integer d;
    public final boolean e;
    public final Function0 f;

    public c1(String s, int v, State state0, Integer integer0, boolean z, Function0 function00) {
        this.a = s;
        this.b = v;
        this.c = state0;
        this.d = integer0;
        this.e = z;
        this.f = function00;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Function0 function03;
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((Function2)object0), "innerTextField");
        if((v & 14) == 0) {
            v |= (composer0.changedInstance(((Function2)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x281778A1, v, -1, "com.kakao.tistory.presentation.view.login.TistroyLoginActivity.TistoryLoginTextField.<anonymous> (TistroyLoginActivity.kt:469)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.height-3ABfNKs(modifier$Companion0, 60.0f);
        String s = this.a;
        int v1 = this.b;
        State state0 = this.c;
        Integer integer0 = this.d;
        boolean z = this.e;
        Function0 function00 = this.f;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            d.a(v2, composer0, v2, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
        Arrangement arrangement0 = Arrangement.INSTANCE;
        MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer0, 0);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(composer0, modifier$Companion0);
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
        Function2 function21 = a.a(composeUiNode$Companion0, composer0, measurePolicy1, composer0, compositionLocalMap1);
        if(composer0.getInserting()) {
            function03 = function00;
            d.a(v3, composer0, v3, function21);
        }
        else {
            function03 = function00;
            if(!Intrinsics.areEqual(composer0.rememberedValue(), v3)) {
                d.a(v3, composer0, v3, function21);
            }
        }
        Updater.set-impl(composer0, modifier2, composeUiNode$Companion0.getSetModifier());
        State state1 = AnimateAsStateKt.animateFloatAsState((TistroyLoginActivity.access$TistoryLoginTextField$lambda$33(state0) || s.length() != 0 ? 0.0f : 1.0f), AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, "", null, composer0, 0xC30, 20);
        String s1 = StringResources_androidKt.stringResource(v1, composer0, 0);
        Modifier modifier3 = OffsetKt.offset-VpY3zN4(modifier$Companion0, 0.0f, DpKt.lerp-Md-fbLM(8.0f, 18.0f, ((Number)state1.getValue()).floatValue()));
        long v4 = ColorResources_androidKt.colorResource((TistroyLoginActivity.access$TistoryLoginTextField$lambda$33(state0) ? color.gray1 : color.gray2), composer0, 0);
        FontWeight fontWeight0 = FontWeight.Companion.getNormal();
        TextKt.Text--4IGK_g(s1, modifier3, v4, TextUnitKt.lerp-C3pnCVY(0x141500000L, 0x141880000L, ((Number)state1.getValue()).floatValue()), null, fontWeight0, TypeKt.getTFont(), 0L, null, null, 0L, 0, false, 0, 0, null, null, composer0, 0x1B0000, 0, 0x1FF90);
        Modifier modifier4 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 10.0f, 0.0f, 0.0f, 13, null);
        MeasurePolicy measurePolicy2 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer0, 0x30);
        int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap2 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier5 = ComposedModifierKt.materializeModifier(composer0, modifier4);
        Function0 function04 = composeUiNode$Companion0.getConstructor();
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function04);
        }
        else {
            composer0.useNode();
        }
        Function2 function22 = a.a(composeUiNode$Companion0, composer0, measurePolicy2, composer0, compositionLocalMap2);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v5)) {
            d.a(v5, composer0, v5, function22);
        }
        Updater.set-impl(composer0, modifier5, composeUiNode$Companion0.getSetModifier());
        Modifier modifier6 = RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null);
        MeasurePolicy measurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap3 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier7 = ComposedModifierKt.materializeModifier(composer0, modifier6);
        Function0 function05 = composeUiNode$Companion0.getConstructor();
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function05);
        }
        else {
            composer0.useNode();
        }
        Function2 function23 = a.a(composeUiNode$Companion0, composer0, measurePolicy3, composer0, compositionLocalMap3);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v6)) {
            d.a(v6, composer0, v6, function23);
        }
        Updater.set-impl(composer0, modifier7, composeUiNode$Companion0.getSetModifier());
        ((Function2)object0).invoke(composer0, ((int)(v & 14)));
        composer0.endNode();
        composer0.startReplaceGroup(0x4D433EF);
        if(integer0 != null && (s.length() > 0 || z)) {
            IconButtonKt.IconButton(function03, SizeKt.size-3ABfNKs(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 8.0f, 0.0f, 0.0f, 0.0f, 14, null), 24.0f), false, null, ComposableLambdaKt.rememberComposableLambda(0xB469E92A, true, new b1(integer0), composer0, 54), composer0, 0x6030, 12);
        }
        composer0.endReplaceGroup();
        composer0.endNode();
        composer0.endNode();
        long v7 = ColorResources_androidKt.colorResource((TistroyLoginActivity.access$TistoryLoginTextField$lambda$33(state0) ? color.gray1 : color.gray3), composer0, 0);
        DividerKt.Divider-oMI9zvI(boxScopeInstance0.align(modifier$Companion0, alignment$Companion0.getBottomStart()), v7, 1.0f, 0.0f, composer0, 0x180, 8);
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

