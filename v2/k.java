package v2;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1;
import androidx.compose.ui.window.PopupLayout;
import androidx.room.a;
import ea.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public final PopupLayout w;
    public final State x;

    public k(PopupLayout popupLayout0, State state0) {
        this.w = popupLayout0;
        this.x = state0;
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
            ComposerKt.traceEventStart(0x4DA88F2F, v, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:321)");
        }
        Modifier modifier0 = SemanticsModifierKt.semantics$default(Modifier.Companion, false, b.z, 1, null);
        PopupLayout popupLayout0 = this.w;
        boolean z = ((Composer)object0).changedInstance(popupLayout0);
        i i0 = ((Composer)object0).rememberedValue();
        if(z || i0 == Composer.Companion.getEmpty()) {
            i0 = new i(popupLayout0, 1);
            ((Composer)object0).updateRememberedValue(i0);
        }
        Modifier modifier1 = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(modifier0, i0), (popupLayout0.getCanCalculatePosition() ? 1.0f : 0.0f));
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(606497925, true, new c(this.x, 5), ((Composer)object0), 54);
        AndroidPopup_androidKt.SimpleStack.1 androidPopup_androidKt$SimpleStack$10 = AndroidPopup_androidKt.SimpleStack.1.INSTANCE;
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object0).getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(((Composer)object0), modifier1);
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
        Updater.set-impl(composer0, androidPopup_androidKt$SimpleStack$10, composeUiNode$Companion0.getSetMeasurePolicy());
        Updater.set-impl(composer0, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
        Function2 function20 = composeUiNode$Companion0.getSetCompositeKeyHash();
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function20);
        }
        composableLambda0.invoke(((Composer)object0), r0.a.l(composeUiNode$Companion0, composer0, modifier2, 6));
        ((Composer)object0).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

