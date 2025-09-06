package com.kakao.tistory.presentation.widget.common;

import a;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v2 extends Lambda implements Function2 {
    public final Modifier a;
    public final Shape b;
    public final CheckedButtonColors c;
    public final boolean d;
    public final BorderStroke e;
    public final MutableInteractionSource f;
    public final MutableState g;
    public final Function1 h;
    public final PaddingValues i;
    public final Function2 j;

    public v2(Modifier modifier0, Shape shape0, CheckedButtonColors roundButtonDefaults$CheckedButtonColors0, boolean z, BorderStroke borderStroke0, MutableInteractionSource mutableInteractionSource0, MutableState mutableState0, Function1 function10, PaddingValues paddingValues0, Function2 function20) {
        this.a = modifier0;
        this.b = shape0;
        this.c = roundButtonDefaults$CheckedButtonColors0;
        this.d = z;
        this.e = borderStroke0;
        this.f = mutableInteractionSource0;
        this.g = mutableState0;
        this.h = function10;
        this.i = paddingValues0;
        this.j = function20;
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
            ComposerKt.traceEventStart(-1540870463, v, -1, "com.kakao.tistory.presentation.widget.common.RoundToggleButton.<anonymous> (RoundButton.kt:116)");
        }
        Modifier modifier0 = SemanticsModifierKt.semantics$default(this.a, false, t2.a, 1, null);
        Shape shape0 = this.b;
        long v1 = this.c.containerColor-vNxB06k(this.d);
        BorderStroke borderStroke0 = this.e;
        Brush brush0 = (Brush)this.c.borderBrush(this.d, composer0, 0).getValue();
        if(brush0 == null) {
            brush0 = this.e.getBrush();
        }
        Modifier modifier1 = ModifierKt.shape-8ww4TTg$default(modifier0, shape0, v1, BorderStroke.copy-D5KLDUw$default(borderStroke0, 0.0f, brush0, 1, null), 0.0f, 8, null);
        boolean z = this.d;
        MutableInteractionSource mutableInteractionSource0 = this.f;
        IndicationNodeFactory indicationNodeFactory0 = RippleKt.ripple-H2RKhps(true, NaNf, 0L);
        boolean z1 = RoundButtonKt.access$RoundToggleButton$lambda$2(this.g);
        composer0.startReplaceGroup(0x629F62);
        boolean z2 = composer0.changed(this.g);
        boolean z3 = composer0.changed(this.h);
        Function1 function10 = this.h;
        MutableState mutableState0 = this.g;
        u2 u20 = composer0.rememberedValue();
        if(z2 || z3 || u20 == Composer.Companion.getEmpty()) {
            u20 = new u2(function10, mutableState0);
            composer0.updateRememberedValue(u20);
        }
        composer0.endReplaceGroup();
        Modifier modifier2 = PaddingKt.padding(ToggleableKt.toggleable-O2vRcR0$default(modifier1, z, mutableInteractionSource0, indicationNodeFactory0, z1, null, u20, 16, null), this.i);
        Function2 function20 = this.j;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterVertically(), composer0, 54);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer0, modifier2);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        Function2 function21 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            d.a(v2, composer0, v2, function21);
        }
        if(r0.a.B(function20, composer0, r0.a.l(composeUiNode$Companion0, composer0, modifier3, 0))) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

