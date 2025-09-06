package s0;

import androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.SimpleStack.1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.room.a;
import ea.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final g w;
    public final State x;

    public f(g g0, State state0) {
        this.w = g0;
        this.x = state0;
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
            ComposerKt.traceEventStart(580081703, v, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup.<anonymous>.<anonymous>.<anonymous> (ExposedDropdownMenuPopup.android.kt:101)");
        }
        Modifier modifier0 = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(SemanticsModifierKt.semantics$default(Modifier.Companion, false, e.w, 1, null), new b(this.w, 1)), (((Boolean)this.w.M.getValue()).booleanValue() ? 1.0f : 0.0f));
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambda(((Composer)object0), 1347607057, true, new c(this.x, 3));
        ((Composer)object0).startReplaceableGroup(0xBF46B38F);
        ExposedDropdownMenuPopup_androidKt.SimpleStack.1 exposedDropdownMenuPopup_androidKt$SimpleStack$10 = ExposedDropdownMenuPopup_androidKt.SimpleStack.1.INSTANCE;
        ((Composer)object0).startReplaceableGroup(-1323940314);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object0).getCurrentCompositionLocalMap();
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        Function3 function30 = LayoutKt.modifierMaterializerOf(modifier0);
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
        Updater.set-impl(composer0, exposedDropdownMenuPopup_androidKt$SimpleStack$10, composeUiNode$Companion0.getSetMeasurePolicy());
        Updater.set-impl(composer0, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
        Function2 function20 = composeUiNode$Companion0.getSetCompositeKeyHash();
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function20);
        }
        r0.a.w(0, function30, SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(((Composer)object0))), ((Composer)object0), 2058660585);
        composableLambda0.invoke(((Composer)object0), 6);
        ((Composer)object0).endReplaceableGroup();
        ((Composer)object0).endNode();
        ((Composer)object0).endReplaceableGroup();
        ((Composer)object0).endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

