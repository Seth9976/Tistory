package com.kakao.tistory.presentation.widget.dialog;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import c;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.TypeKt;
import d;
import e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k1 extends Lambda implements Function2 {
    public final Function0 a;
    public final AnnotatedString b;
    public final Function0 c;
    public final Function0 d;
    public final MutableState e;

    public k1(Function0 function00, AnnotatedString annotatedString0, Function0 function01, Function0 function02, MutableState mutableState0) {
        this.a = function00;
        this.b = annotatedString0;
        this.c = function01;
        this.d = function02;
        this.e = mutableState0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        MutableState mutableState1;
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x252059A0, v, -1, "com.kakao.tistory.presentation.widget.dialog.WelcomeDialog.<anonymous> (WelcomeDialog.kt:126)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(BackgroundKt.background-bw27NRU(SizeKt.width-3ABfNKs(PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 20.0f, 0.0f, 2, null), 353.0f), ColorResources_androidKt.colorResource(color.white, ((Composer)object0), 0), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(8.0f)), 0.0f, 4.0f, 0.0f, 56.0f, 5, null);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        Function0 function00 = this.a;
        AnnotatedString annotatedString0 = this.b;
        Function0 function01 = this.c;
        Function0 function02 = this.d;
        MutableState mutableState0 = this.e;
        Arrangement arrangement0 = Arrangement.INSTANCE;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getEnd(), ((Composer)object0), 0x30);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object0).getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(((Composer)object0), modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function03 = composeUiNode$Companion0.getConstructor();
        if(((Composer)object0).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object0).startReusableNode();
        if(((Composer)object0).getInserting()) {
            ((Composer)object0).createNode(function03);
        }
        else {
            ((Composer)object0).useNode();
        }
        Composer composer0 = Updater.constructor-impl(((Composer)object0));
        Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            d.a(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        IconButtonKt.IconButton(function00, PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 20.0f, 0.0f, 20.0f, 5.0f, 2, null), false, null, null, ComposableSingletons.WelcomeDialogKt.INSTANCE.getLambda-1$presentation_prodRelease(), ((Composer)object0), 0x30030, 28);
        TextStyle textStyle0 = new TextStyle(ColorResources_androidKt.colorResource(color.gray1, ((Composer)object0), 0), 0x141900000L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 3, 0, 0x141D80000L, null, null, null, 0, 0, null, 0xFD7FD8, null);
        TextKt.Text-IbK3jfQ(annotatedString0, PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 40.0f, 0.0f, 40.0f, 25.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, textStyle0, ((Composer)object0), 0x30, 0, 0x1FFFC);
        Modifier modifier2 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
        Composer composer1 = (Composer)object0;
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getCenter(), alignment$Companion0.getTop(), composer1, 6);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
        Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function21);
        }
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
        String s = StringResources_androidKt.stringResource(string.label_sign_up_complete_use_tip, composer1, 0);
        composer1.startReplaceGroup(0x823F5F4C);
        boolean z = composer1.changed(function00);
        boolean z1 = composer1.changed(function01);
        i1 i10 = composer1.rememberedValue();
        if(z || z1 || i10 == Composer.Companion.getEmpty()) {
            mutableState1 = mutableState0;
            i10 = new i1(function00, function01, mutableState1);
            composer1.updateRememberedValue(i10);
        }
        else {
            mutableState1 = mutableState0;
        }
        composer1.endReplaceGroup();
        WelcomeDialogKt.access$ColorInvertButton(s, false, i10, composer1, 0, 2);
        c.a(12.5f, modifier$Companion0, composer1, 6);
        String s1 = StringResources_androidKt.stringResource(string.label_sign_up_complete_go_to_my_blog, composer1, 0);
        composer1.startReplaceGroup(0x823FD014);
        boolean z2 = composer1.changed(function00);
        boolean z3 = composer1.changed(function02);
        j1 j10 = composer1.rememberedValue();
        if(z2 || z3 || j10 == Composer.Companion.getEmpty()) {
            j10 = new j1(function00, function02, mutableState1);
            composer1.updateRememberedValue(j10);
        }
        composer1.endReplaceGroup();
        WelcomeDialogKt.access$ColorInvertButton(s1, true, j10, composer1, 0x30, 0);
        if(e.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

