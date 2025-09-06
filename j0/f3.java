package j0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.room.a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class f3 extends Lambda implements Function3 {
    public final Function1 w;
    public final MutableInteractionSource x;

    public f3(Function1 function10, MutableInteractionSource mutableInteractionSource0) {
        this.w = function10;
        this.x = mutableInteractionSource0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Modifier modifier0 = (Modifier)object0;
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(0xF9DFB8D5);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF9DFB8D5, v, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
        }
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = ((Composer)object1).rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, ((Composer)object1)), ((Composer)object1));
        }
        CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
        MutableState mutableState0 = ((Composer)object1).rememberedValue();
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            ((Composer)object1).updateRememberedValue(mutableState0);
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(this.w, ((Composer)object1), 0);
        MutableInteractionSource mutableInteractionSource0 = this.x;
        boolean z = ((Composer)object1).changed(mutableInteractionSource0);
        a3 a30 = ((Composer)object1).rememberedValue();
        if(z || a30 == composer$Companion0.getEmpty()) {
            a30 = new a3(mutableState0, mutableInteractionSource0);
            ((Composer)object1).updateRememberedValue(a30);
        }
        EffectsKt.DisposableEffect(mutableInteractionSource0, a30, ((Composer)object1), 0);
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        boolean z1 = ((Composer)object1).changedInstance(coroutineScope0);
        boolean z2 = ((Composer)object1).changed(mutableInteractionSource0);
        boolean z3 = ((Composer)object1).changed(state0);
        e3 e30 = ((Composer)object1).rememberedValue();
        if((z1 | z2 | z3) != 0 || e30 == composer$Companion0.getEmpty()) {
            e3 e31 = new e3(coroutineScope0, mutableState0, this.x, state0, null);
            ((Composer)object1).updateRememberedValue(e31);
            e30 = e31;
        }
        Modifier modifier1 = SuspendingPointerInputFilterKt.pointerInput(modifier$Companion0, mutableInteractionSource0, e30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier1;
    }
}

