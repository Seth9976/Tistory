package androidx.compose.material3;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class kq extends SuspendLambda implements Function2 {
    public final TimePickerState o;
    public final int p;
    public final FocusRequester q;

    public kq(TimePickerState timePickerState0, int v, FocusRequester focusRequester0, Continuation continuation0) {
        this.o = timePickerState0;
        this.p = v;
        this.q = focusRequester0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new kq(this.o, this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((kq)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(TimePickerSelectionMode.equals-impl0(this.o.getSelection-yecRtBI(), this.p)) {
            this.q.requestFocus();
        }
        return Unit.INSTANCE;
    }
}

