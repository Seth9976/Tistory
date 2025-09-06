package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.interaction.DragInteraction.Start;
import androidx.compose.foundation.interaction.DragInteraction.Stop;
import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import androidx.compose.foundation.interaction.HoverInteraction.Exit;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.foundation.interaction.PressInteraction.Release;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class tb extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final TooltipState q;

    public tb(TooltipState tooltipState0, Continuation continuation0) {
        this.q = tooltipState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new tb(this.q, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((tb)this.create(((Interaction)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        boolean z = true;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Interaction interaction0 = (Interaction)this.p;
                TooltipState tooltipState0 = this.q;
                if(((interaction0 instanceof Press ? true : interaction0 instanceof Start) ? true : interaction0 instanceof Enter)) {
                    this.o = 1;
                    if(tooltipState0.show(MutatePriority.UserInput, this) == object1) {
                        return object1;
                    }
                }
                else {
                    if(!(interaction0 instanceof Release ? true : interaction0 instanceof Stop)) {
                        z = interaction0 instanceof Exit;
                    }
                    if(z) {
                        tooltipState0.dismiss();
                    }
                }
                return Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

