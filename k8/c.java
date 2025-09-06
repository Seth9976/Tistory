package k8;

import androidx.appcompat.app.w0;
import com.google.android.play.core.appupdate.AppUpdateManager;
import j0.t1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import qd.a;

public final class c extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final AppUpdateManager q;

    public c(AppUpdateManager appUpdateManager0, Continuation continuation0) {
        this.q = appUpdateManager0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new c(this.q, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((ProducerScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ProducerScope producerScope0 = (ProducerScope)this.p;
                f f0 = new f(new b(producerScope0, this.q), new fg.c(producerScope0, 16));
                this.q.getAppUpdateInfo().addOnSuccessListener(new w0(producerScope0, this.q, f0)).addOnFailureListener(new androidx.appcompat.view.menu.f(producerScope0, 23));
                t1 t10 = new t1(7, this.q, f0);
                this.o = 1;
                return ProduceKt.awaitClose(producerScope0, t10, this) == object1 ? object1 : Unit.INSTANCE;
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

