package com.kakao.tistory.presentation.widget.common;

import a;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TabRowDefaults;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.TextUnitKt;
import b;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.p;

public final class d0 extends Lambda implements Function3 {
    public final TextFieldValue a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final State e;
    public final Integer f;
    public final Integer g;
    public final boolean h;
    public final Function0 i;
    public final String j;
    public final int k;

    public d0(TextFieldValue textFieldValue0, String s, boolean z, boolean z1, State state0, Integer integer0, Integer integer1, boolean z2, Function0 function00, String s1, int v) {
        this.a = textFieldValue0;
        this.b = s;
        this.c = z;
        this.d = z1;
        this.e = state0;
        this.f = integer0;
        this.g = integer1;
        this.h = z2;
        this.i = function00;
        this.j = s1;
        this.k = v;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v9;
        Companion modifier$Companion1;
        String s2;
        int v6;
        TextFieldValue textFieldValue1;
        boolean z4;
        boolean z3;
        int v3;
        Function0 function02;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((Function2)object0), "innerTextField");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changedInstance(((Function2)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611045064, v, -1, "com.kakao.tistory.presentation.widget.common.CommonTextField.<anonymous>.<anonymous> (CommonTextField.kt:84)");
        }
        TextFieldValue textFieldValue0 = this.a;
        String s = this.b;
        boolean z = this.c;
        boolean z1 = this.d;
        State state0 = this.e;
        Integer integer0 = this.g;
        boolean z2 = this.h;
        Function0 function00 = this.i;
        Arrangement arrangement0 = Arrangement.INSTANCE;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        int v1 = this.k;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), ((Composer)object1), 0);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object1), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object1).getCurrentCompositionLocalMap();
        String s1 = this.j;
        Modifier modifier0 = ComposedModifierKt.materializeModifier(((Composer)object1), Modifier.Companion);
        Integer integer1 = this.f;
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Companion modifier$Companion0 = Modifier.Companion;
        Function0 function01 = composeUiNode$Companion0.getConstructor();
        if(((Composer)object1).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object1).startReusableNode();
        if(((Composer)object1).getInserting()) {
            ((Composer)object1).createNode(function01);
        }
        else {
            ((Composer)object1).useNode();
        }
        Composer composer0 = Updater.constructor-impl(((Composer)object1));
        Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting()) {
            function02 = function00;
            d.a(v2, composer0, v2, function20);
        }
        else {
            function02 = function00;
            if(!Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
                d.a(v2, composer0, v2, function20);
            }
        }
        Updater.set-impl(composer0, modifier0, composeUiNode$Companion0.getSetModifier());
        State state1 = AnimateAsStateKt.animateFloatAsState((CommonTextFieldKt.access$CommonTextField$lambda$1(state0) || textFieldValue0.getText().length() != 0 ? 0.0f : 1.0f), AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, "", null, ((Composer)object1), 0xC30, 20);
        ((Composer)object1).startReplaceGroup(0xB5703979);
        if(s == null) {
            v6 = v;
            s2 = s1;
            z3 = z1;
            z4 = z;
            textFieldValue1 = textFieldValue0;
            modifier$Companion1 = modifier$Companion0;
        }
        else {
            Modifier modifier1 = OffsetKt.offset-VpY3zN4(SizeKt.height-3ABfNKs(modifier$Companion0, 34.0f), 0.0f, DpKt.lerp-Md-fbLM(0.0f, 24.0f, ((Number)state1.getValue()).floatValue()));
            if(z) {
                v3 = color.point1;
            }
            else {
                v3 = CommonTextFieldKt.access$CommonTextField$lambda$1(state0) ? color.gray1 : color.gray2;
            }
            long v4 = ColorResources_androidKt.colorResource(v3, ((Composer)object1), 0);
            z3 = z1;
            FontWeight fontWeight0 = FontWeight.Companion.getNormal();
            long v5 = TextUnitKt.lerp-C3pnCVY(0x141400000L, 0x141600000L, ((Number)state1.getValue()).floatValue());
            TextUnitKt.checkArithmetic--R2X_6o(5303949066L);
            z4 = z;
            textFieldValue1 = textFieldValue0;
            v6 = v;
            s2 = s1;
            modifier$Companion1 = modifier$Companion0;
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, modifier1, v4, v5, null, fontWeight0, TypeKt.getTFont(), 0x1BC23D70AL, null, null, 0L, 0, false, false, 0, 0, null, null, ((Composer)object1), 0x1B0000, 0, 0x3FF10);
        }
        ((Composer)object1).endReplaceGroup();
        Composer composer1 = (Composer)object1;
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
        int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion1);
        Function0 function03 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function03);
        }
        else {
            composer1.useNode();
        }
        Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
            d.a(v7, composer1, v7, function21);
        }
        Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
        RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
        Modifier modifier3 = RowScope.weight$default(rowScopeInstance0, modifier$Companion1, 1.0f, false, 2, null);
        MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v8 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
        Function0 function04 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function04);
        }
        else {
            composer1.useNode();
        }
        Function2 function22 = a.a(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v8)) {
            d.a(v8, composer1, v8, function22);
        }
        Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
        ((Function2)object0).invoke(composer1, ((int)(v6 & 14)));
        composer1.endNode();
        composer1.startReplaceGroup(0xE9D0F32C);
        if(integer1 != null) {
            CommonTextFieldKt.access$EndIcon(((int)integer1), integer0, z2, function02, composer1, 0, 0);
        }
        composer1.endReplaceGroup();
        composer1.endNode();
        b.a(11.0f, modifier$Companion1, composer1, 6);
        TabRowDefaults tabRowDefaults0 = TabRowDefaults.INSTANCE;
        if(z3) {
            v9 = color.gray1;
        }
        else if(z4) {
            v9 = color.point1;
        }
        else {
            v9 = CommonTextFieldKt.access$CommonTextField$lambda$1(state0) ? color.gray1 : color.gray3;
        }
        tabRowDefaults0.Divider-9IZ8Weo(null, 1.0f, ColorResources_androidKt.colorResource(v9, composer1, 0), composer1, TabRowDefaults.$stable << 9 | 0x30, 1);
        b.a(5.0f, modifier$Companion1, composer1, 6);
        Modifier modifier5 = SizeKt.defaultMinSize-VpY3zN4$default(modifier$Companion1, 0.0f, 20.0f, 1, null);
        MeasurePolicy measurePolicy3 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
        int v10 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier6 = ComposedModifierKt.materializeModifier(composer1, modifier5);
        Function0 function05 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function05);
        }
        else {
            composer1.useNode();
        }
        Function2 function23 = a.a(composeUiNode$Companion0, composer1, measurePolicy3, composer1, compositionLocalMap3);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v10)) {
            d.a(v10, composer1, v10, function23);
        }
        Updater.set-impl(composer1, modifier6, composeUiNode$Companion0.getSetModifier());
        if(s2 == null || p.isBlank(s2)) {
            composer1.startReplaceGroup(1348381005);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance0, modifier$Companion1, 1.0f, false, 2, null), composer1, 0);
        }
        else {
            composer1.startReplaceGroup(0x5060423C);
            CommonTextFieldKt.access$StatusMessage(RowScope.weight$default(rowScopeInstance0, modifier$Companion1, 1.0f, false, 2, null), s2, z4, composer1, 0, 0);
        }
        composer1.endReplaceGroup();
        CommonTextFieldKt.a(rowScopeInstance0.align(modifier$Companion1, alignment$Companion0.getTop()), textFieldValue1.getText().length(), v1, composer1, 0, 0);
        if(e.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

