package g0;

import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.material3.td;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class f extends SuspendLambda implements Function2 {
    public Object o;
    public final BringIntoViewResponderNode p;
    public final LayoutCoordinates q;
    public final Function0 r;
    public final td s;

    public f(BringIntoViewResponderNode bringIntoViewResponderNode0, LayoutCoordinates layoutCoordinates0, Function0 function00, td td0, Continuation continuation0) {
        this.p = bringIntoViewResponderNode0;
        this.q = layoutCoordinates0;
        this.r = function00;
        this.s = td0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new f(this.p, this.q, this.r, this.s, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        CoroutineScope coroutineScope0 = (CoroutineScope)this.o;
        BuildersKt.launch$default(coroutineScope0, null, null, new d(this.p, this.q, this.r, null), 3, null);
        return BuildersKt.launch$default(coroutineScope0, null, null, new e(this.p, this.s, null), 3, null);
    }
}

