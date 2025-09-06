package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class qa extends Lambda implements Function2 {
    public final boolean w;
    public final Function2 x;
    public final Function2 y;

    public qa(boolean z, Function2 function20, Function2 function21) {
        this.w = z;
        this.x = function20;
        this.y = function21;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x45DD1A10, v, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:374)");
        }
        Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(SizeKt.sizeIn-qDBjuR0$default(Modifier.Companion, (this.w ? 80.0f : 0.0f), 0.0f, 0.0f, 0.0f, 14, null), (this.w ? 16.0f : 0.0f), 0.0f, (this.w ? 20.0f : 0.0f), 0.0f, 10, null);
        Vertical alignment$Vertical0 = Alignment.Companion.getCenterVertically();
        Horizontal arrangement$Horizontal0 = this.w ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getCenter();
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement$Horizontal0, alignment$Vertical0, ((Composer)object0), 0x30);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object0).getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(((Composer)object0), modifier0);
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
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        this.x.invoke(((Composer)object0), 0);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xA81404C, true, new pa(this.y), ((Composer)object0), 54);
        AnimatedVisibilityKt.AnimatedVisibility(RowScopeInstance.INSTANCE, this.w, null, FloatingActionButtonKt.f, FloatingActionButtonKt.e, null, composableLambda0, ((Composer)object0), 1600518, 18);
        ((Composer)object0).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

