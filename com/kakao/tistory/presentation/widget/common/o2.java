package com.kakao.tistory.presentation.widget.common;

import a;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.RippleKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.kakao.tistory.presentation.theme.ModifierKt;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o2 extends Lambda implements Function2 {
    public final Modifier a;
    public final Shape b;
    public final ButtonColors c;
    public final boolean d;
    public final BorderStroke e;
    public final MutableInteractionSource f;
    public final String g;
    public final MutableState h;
    public final Function0 i;
    public final PaddingValues j;
    public final Function3 k;

    public o2(Modifier modifier0, Shape shape0, ButtonColors roundButtonDefaults$ButtonColors0, boolean z, BorderStroke borderStroke0, MutableInteractionSource mutableInteractionSource0, String s, MutableState mutableState0, Function0 function00, PaddingValues paddingValues0, Function3 function30) {
        this.a = modifier0;
        this.b = shape0;
        this.c = roundButtonDefaults$ButtonColors0;
        this.d = z;
        this.e = borderStroke0;
        this.f = mutableInteractionSource0;
        this.g = s;
        this.h = mutableState0;
        this.i = function00;
        this.j = paddingValues0;
        this.k = function30;
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
            ComposerKt.traceEventStart(0xCA1C739, v, -1, "com.kakao.tistory.presentation.widget.common.RoundButton.<anonymous> (RoundButton.kt:57)");
        }
        Modifier modifier0 = SemanticsModifierKt.semantics$default(this.a, false, m2.a, 1, null);
        Shape shape0 = this.b;
        long v1 = this.c.containerColor-vNxB06k(this.d);
        BorderStroke borderStroke0 = this.e;
        Brush brush0 = (Brush)this.c.borderBrush(this.d, composer0, 0).getValue();
        if(brush0 == null) {
            brush0 = this.e.getBrush();
        }
        Modifier modifier1 = ModifierKt.shape-8ww4TTg$default(modifier0, shape0, v1, BorderStroke.copy-D5KLDUw$default(borderStroke0, 0.0f, brush0, 1, null), 0.0f, 8, null);
        MutableInteractionSource mutableInteractionSource0 = this.f;
        IndicationNodeFactory indicationNodeFactory0 = RippleKt.ripple-H2RKhps(true, NaNf, 0L);
        boolean z = RoundButtonKt.access$RoundButton$lambda$0(this.h) && this.d;
        String s = this.g;
        composer0.startReplaceGroup(-426001076);
        boolean z1 = composer0.changed(this.h);
        boolean z2 = composer0.changed(this.i);
        Function0 function00 = this.i;
        MutableState mutableState0 = this.h;
        n2 n20 = composer0.rememberedValue();
        if(z1 || z2 || n20 == Composer.Companion.getEmpty()) {
            n20 = new n2(function00, mutableState0);
            composer0.updateRememberedValue(n20);
        }
        composer0.endReplaceGroup();
        Modifier modifier2 = PaddingKt.padding(ClickableKt.clickable-O2vRcR0$default(modifier1, mutableInteractionSource0, indicationNodeFactory0, z, s, null, n20, 16, null), this.j);
        Function3 function30 = this.k;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterVertically(), composer0, 54);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer0, modifier2);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        Updater.set-impl(composer0, modifier3, composeUiNode$Companion0.getSetModifier());
        function30.invoke(RowScopeInstance.INSTANCE, composer0, 6);
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

