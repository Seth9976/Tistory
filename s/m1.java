package s;

import androidx.compose.animation.SharedTransitionScopeImpl;
import androidx.compose.material3.e0;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.room.a;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class m1 extends Lambda implements Function3 {
    public final Function4 w;

    public m1(Function4 function40) {
        this.w = function40;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCC80E542, v, -1, "androidx.compose.animation.SharedTransitionScope.<anonymous> (SharedTransitionScope.kt:140)");
        }
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = ((Composer)object1).rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, ((Composer)object1)), ((Composer)object1));
        }
        CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
        SharedTransitionScopeImpl sharedTransitionScopeImpl0 = ((Composer)object1).rememberedValue();
        if(sharedTransitionScopeImpl0 == composer$Companion0.getEmpty()) {
            sharedTransitionScopeImpl0 = new SharedTransitionScopeImpl(((LookaheadScope)object0), coroutineScope0);
            ((Composer)object1).updateRememberedValue(sharedTransitionScopeImpl0);
        }
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        e0 e00 = ((Composer)object1).rememberedValue();
        if(e00 == composer$Companion0.getEmpty()) {
            e00 = new e0(sharedTransitionScopeImpl0, 12);
            ((Composer)object1).updateRememberedValue(e00);
        }
        Modifier modifier0 = LayoutModifierKt.layout(modifier$Companion0, e00);
        j1 j10 = ((Composer)object1).rememberedValue();
        if(j10 == composer$Companion0.getEmpty()) {
            j10 = new j1(sharedTransitionScopeImpl0, 1);
            ((Composer)object1).updateRememberedValue(j10);
        }
        Modifier modifier1 = DrawModifierKt.drawWithContent(modifier0, j10);
        this.w.invoke(sharedTransitionScopeImpl0, modifier1, ((Composer)object1), 6);
        Unit unit0 = Unit.INSTANCE;
        j1 j11 = ((Composer)object1).rememberedValue();
        if(j11 == composer$Companion0.getEmpty()) {
            j11 = new j1(sharedTransitionScopeImpl0, 2);
            ((Composer)object1).updateRememberedValue(j11);
        }
        EffectsKt.DisposableEffect(unit0, j11, ((Composer)object1), 54);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return unit0;
    }
}

