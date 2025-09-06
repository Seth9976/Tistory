package androidx.compose.material3;

import androidx.appcompat.app.w0;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class ol extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final RangeSliderState q;
    public final MutableInteractionSource r;
    public final MutableInteractionSource s;

    public ol(RangeSliderState rangeSliderState0, MutableInteractionSource mutableInteractionSource0, MutableInteractionSource mutableInteractionSource1, Continuation continuation0) {
        this.q = rangeSliderState0;
        this.r = mutableInteractionSource0;
        this.s = mutableInteractionSource1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new ol(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((ol)this.create(((PointerInputScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PointerInputScope pointerInputScope0 = (PointerInputScope)this.p;
                w0 w00 = new w0(this.q, this.r, this.s);
                nl nl0 = new nl(pointerInputScope0, this.q, w00, null);
                this.o = 1;
                return CoroutineScopeKt.coroutineScope(nl0, this) == object1 ? object1 : Unit.INSTANCE;
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

