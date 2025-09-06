package ca;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g1 extends Lambda implements Function2 {
    public final MutableInteractionSource A;
    public final boolean B;
    public final Function0 C;
    public final PaddingValues D;
    public final Function3 E;
    public final Modifier w;
    public final BorderStroke x;
    public final Shape y;
    public final long z;

    public g1(Modifier modifier0, BorderStroke borderStroke0, Shape shape0, long v, MutableInteractionSource mutableInteractionSource0, boolean z, Function0 function00, PaddingValues paddingValues0, Function3 function30) {
        this.w = modifier0;
        this.x = borderStroke0;
        this.y = shape0;
        this.z = v;
        this.A = mutableInteractionSource0;
        this.B = z;
        this.C = function00;
        this.D = paddingValues0;
        this.E = function30;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1270533419, v, -1, "com.kakao.kandinsky.designsystem.common.KDButton.<anonymous>.<anonymous> (KDButton.kt:37)");
        }
        Modifier modifier0 = SizeKt.defaultMinSize-VpY3zN4(this.w, 40.0f, 40.0f);
        Shape shape0 = this.y;
        BorderStroke borderStroke0 = this.x;
        Modifier modifier1 = borderStroke0 == null ? Modifier.Companion : BorderKt.border(Modifier.Companion, borderStroke0, shape0);
        Modifier modifier2 = ClipKt.clip(BackgroundKt.background-bw27NRU(modifier0.then(modifier1), this.z, shape0), shape0);
        IndicationNodeFactory indicationNodeFactory0 = RippleKt.ripple-H2RKhps$default(false, 0.0f, 0L, 7, null);
        Modifier modifier3 = PaddingKt.padding(ClickableKt.clickable-O2vRcR0$default(modifier2, this.A, indicationNodeFactory0, this.B, null, null, this.C, 24, null), this.D);
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object0).getCurrentCompositionLocalMap();
        Modifier modifier4 = ComposedModifierKt.materializeModifier(((Composer)object0), modifier3);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(((Composer)object0).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object0).startReusableNode();
        if(((Composer)object0).getInserting()) {
            ((Composer)object0).createNode(function00);
        }
        else {
            ((Composer)object0).useNode();
        }
        Composer composer0 = Updater.constructor-impl(((Composer)object0));
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier4, composeUiNode$Companion0.getSetModifier());
        this.E.invoke(BoxScopeInstance.INSTANCE, ((Composer)object0), 6);
        ((Composer)object0).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

