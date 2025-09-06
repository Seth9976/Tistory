package com.kakao.tistory.presentation.screen.blog.main.ui;

import a;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.res.PainterResources_androidKt;
import b;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TColor;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o4 extends Lambda implements Function2 {
    public final Function0 a;

    public o4(Function0 function00) {
        this.a = function00;
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
            ComposerKt.traceEventStart(509359782, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.EditGuideDialog.<anonymous> (EditGuideDialog.kt:41)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-3ABfNKs(ModifierKt.shape-8ww4TTg$default(modifier$Companion0, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(12.0f), TColor.INSTANCE.getWhite-0d7_KjU(), null, 0.0f, 12, null), 40.0f);
        Function0 function00 = this.a;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
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
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            d.a(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        ImageKt.Image(PainterResources_androidKt.painterResource(drawable.img_blog_guide, composer0, 0), null, SizeKt.size-VpY3zN4(BoxScopeInstance.INSTANCE.align(modifier$Companion0, alignment$Companion0.getTopCenter()), 136.0f, 176.0f), null, null, 0.0f, null, composer0, 56, 120);
        Modifier modifier2 = BoxScopeInstance.INSTANCE.align(modifier$Companion0, alignment$Companion0.getTopCenter());
        MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Companion0.getCenterHorizontally(), composer0, 0x30);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer0, modifier2);
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
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            d.a(v2, composer0, v2, function21);
        }
        Updater.set-impl(composer0, modifier3, composeUiNode$Companion0.getSetModifier());
        b.a(164.0f, modifier$Companion0, composer0, 6);
        EditGuideDialogKt.access$Title(composer0, 0);
        b.a(6.0f, modifier$Companion0, composer0, 6);
        EditGuideDialogKt.access$Message(composer0, 0);
        b.a(30.0f, modifier$Companion0, composer0, 6);
        EditGuideDialogKt.access$ConfirmButton(function00, composer0, 0);
        composer0.endNode();
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

