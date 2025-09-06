package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class pa extends Lambda implements Function3 {
    public final Function2 w;

    public pa(Function2 function20) {
        this.w = function20;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        AnimatedVisibilityScope animatedVisibilityScope0 = (AnimatedVisibilityScope)object0;
        int v = ((Number)object2).intValue();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA81404C, v, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:394)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SemanticsModifierKt.clearAndSetSemantics(modifier$Companion0, a5.M);
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), ((Composer)object1), 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object1), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object1).getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(((Composer)object1), modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(((Composer)object1).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object1).startReusableNode();
        if(((Composer)object1).getInserting()) {
            ((Composer)object1).createNode(function00);
        }
        else {
            ((Composer)object1).useNode();
        }
        Composer composer0 = Updater.constructor-impl(((Composer)object1));
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, FloatingActionButtonKt.b), ((Composer)object1), 6);
        if(r0.a.B(this.w, ((Composer)object1), 0)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

