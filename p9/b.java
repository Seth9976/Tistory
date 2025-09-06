package p9;

import com.kakao.kandinsky.base.ConsumeKDEventKt.ConsumeEvent.2.2.WhenMappings;
import com.kakao.kandinsky.base.contract.KDEvent.Go;
import com.kakao.kandinsky.base.contract.KDEvent.UpdateConfirm;
import com.kakao.kandinsky.base.contract.KDEvent;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class b extends SuspendLambda implements Function2 {
    public Object o;
    public final Function0 p;
    public final Function1 q;

    public b(Function1 function10, Function0 function00, Continuation continuation0) {
        this.p = function00;
        this.q = function10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new b(this.q, this.p, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b)this.create(((KDEvent)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        KDEvent kDEvent0 = (KDEvent)this.o;
        if(kDEvent0 instanceof Go) {
            if(ConsumeKDEventKt.ConsumeEvent.2.2.WhenMappings.$EnumSwitchMapping$0[((Go)kDEvent0).getDestination().ordinal()] == 1) {
                this.p.invoke();
                return Unit.INSTANCE;
            }
        }
        else if(kDEvent0 instanceof UpdateConfirm) {
            KDPhoto kDPhoto0 = ((UpdateConfirm)kDEvent0).getPhoto();
            this.q.invoke(kDPhoto0);
        }
        return Unit.INSTANCE;
    }
}

