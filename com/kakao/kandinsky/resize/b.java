package com.kakao.kandinsky.resize;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.room.a;
import com.kakao.kandinsky.designsystem.common.KDButtonColors;
import com.kakao.kandinsky.designsystem.common.KDButtonDefaults;
import com.kakao.kandinsky.designsystem.common.KDButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function3 {
    public final TextStyle A;
    public final Function0 w;
    public final boolean x;
    public final TextFieldValue y;
    public final long z;

    public b(Function0 function00, boolean z, TextFieldValue textFieldValue0, long v, TextStyle textStyle0) {
        this.w = function00;
        this.x = z;
        this.y = textFieldValue0;
        this.z = v;
        this.A = textStyle0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v3;
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
            ComposerKt.traceEventStart(0x8B44273A, v, -1, "com.kakao.kandinsky.resize.CustomSizeInputField.<anonymous>.<anonymous> (ReSizeScreen.kt:501)");
        }
        Companion alignment$Companion0 = Alignment.Companion;
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), alignment$Companion0.getCenterVertically(), composer0, 0x30);
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
        Modifier modifier1 = RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null);
        MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenterStart(), false);
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
        Updater.set-impl(composer0, modifier2, composeUiNode$Companion0.getSetModifier());
        BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
        composer0.startReplaceGroup(0x4466EECD);
        if(this.y.getText().length() == 0) {
            Modifier modifier3 = boxScopeInstance0.align(modifier$Companion0, alignment$Companion0.getCenterStart());
            v3 = v;
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.resize_custom_input_hint, composer0, 0), modifier3, Color.copy-wmQWz5c$default(this.z, 0.43f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, this.A, composer0, 0, 0, 0xFFF8);
        }
        else {
            v3 = v;
        }
        composer0.endReplaceGroup();
        a5.b.y(composer0, v3 & 14, ((Function2)object0));
        long v4 = MaterialTheme.INSTANCE.getColorScheme(composer0, MaterialTheme.$stable).getPrimary-0d7_KjU();
        long v5 = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer0, MaterialTheme.$stable).getSecondary-0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
        KDButtonColors kDButtonColors0 = KDButtonDefaults.INSTANCE.buttonColors-zf8z9n0(0.0f, 0L, v4, 0L, v5, composer0, KDButtonDefaults.$stable << 15, 11);
        KDButtonKt.KDIconButton(this.w, null, this.x, kDButtonColors0, null, ComposableSingletons.ReSizeScreenKt.INSTANCE.getLambda-6$resize_release(), composer0, 0x30000, 18);
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

