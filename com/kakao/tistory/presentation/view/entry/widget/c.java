package com.kakao.tistory.presentation.view.entry.widget;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.domain.entity.entry.ChallengeResult;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.common.CommonImageKt;
import com.kakao.tistory.presentation.widget.common.RoundButtonDefaults.ButtonColors;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final ChallengeResult a;
    public final Function0 b;
    public final Function0 c;

    public c(ChallengeResult challengeResult0, Function0 function00, Function0 function01) {
        this.a = challengeResult0;
        this.b = function00;
        this.c = function01;
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
            ComposerKt.traceEventStart(0x6D5793B4, v, -1, "com.kakao.tistory.presentation.view.entry.widget.ChallengeSuccessDialog.<anonymous> (ChallengeSuccessDialog.kt:59)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(ModifierKt.shape-8ww4TTg$default(SizeKt.defaultMinSize-VpY3zN4$default(SizeKt.width-3ABfNKs(modifier$Companion0, 280.0f), 0.0f, 136.5f, 1, null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(12.0f), 0L, null, 0.0f, 12, null), 0.0f, 40.0f, 1, null);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        ChallengeResult challengeResult0 = this.a;
        Function0 function00 = this.b;
        Function0 function01 = this.c;
        Arrangement arrangement0 = Arrangement.INSTANCE;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getCenterHorizontally(), composer0, 0x30);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            d.a(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        CommonImageKt.CommonImage(challengeResult0.getImageURL(), null, SizeKt.size-VpY3zN4(modifier$Companion0, 280.0f, 220.0f), null, null, null, composer0, 0x1B0, 56);
        Modifier modifier2 = PaddingKt.padding-3ABfNKs(modifier$Companion0, 20.0f);
        MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getCenterHorizontally(), composer0, 0x30);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer0, modifier2);
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
        Function2 function21 = a.a(composeUiNode$Companion0, composer0, measurePolicy1, composer0, compositionLocalMap1);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            d.a(v2, composer0, v2, function21);
        }
        Updater.set-impl(composer0, modifier3, composeUiNode$Companion0.getSetModifier());
        TextKt.Text--4IGK_g(challengeResult0.getTitle(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141900000L, FontWeight.Companion.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 3, 0, 0x141C00000L, null, null, null, 0, 0, null, 0xFD7FD8, null), composer0, 0, 0, 0xFFFE);
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 9.0f), composer0, 6);
        TextKt.Text--4IGK_g(challengeResult0.getDescription(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141600000L, FontWeight.Companion.getLight(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 3, 0, 0x141A80000L, null, null, null, 0, 0, null, 0xFD7FD8, null), composer0, 0, 0, 0xFFFE);
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 32.0f), composer0, 6);
        ChallengeSuccessDialogKt.access$Button(function00, new ButtonColors(0L, 0L, 0L, 0L, 0L, 0L, 56, null), StringResources_androidKt.stringResource(string.label_dialog_entry_challgne_success_link_button, composer0, 0), composer0, 0);
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 10.0f), composer0, 6);
        ChallengeSuccessDialogKt.access$Button(function01, new ButtonColors(0L, 0L, 0L, 0L, 0L, 0L, 56, null), StringResources_androidKt.stringResource(string.label_dialog_close, composer0, 0), composer0, 0);
        composer0.endNode();
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

