package a0;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

public final class a implements MutableInteractionSource {
    public final MutableSharedFlow a;

    public a() {
        this.a = SharedFlowKt.MutableSharedFlow$default(0, 16, BufferOverflow.DROP_OLDEST, 1, null);
    }

    @Override  // androidx.compose.foundation.interaction.MutableInteractionSource
    public final Object emit(Interaction interaction0, Continuation continuation0) {
        Object object0 = this.a.emit(interaction0, continuation0);
        return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // androidx.compose.foundation.interaction.InteractionSource
    public final Flow getInteractions() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.interaction.MutableInteractionSource
    public final boolean tryEmit(Interaction interaction0) {
        return this.a.tryEmit(interaction0);
    }
}

