package sa;

import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.signature.contract.SignatureIntent.DeleteHistory;
import com.kakao.kandinsky.signature.contract.SignatureIntent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class u extends SuspendLambda implements Function2 {
    public final SignatureVieModel o;
    public final SignatureIntent p;

    public u(SignatureVieModel signatureVieModel0, SignatureIntent signatureIntent0, Continuation continuation0) {
        this.o = signatureVieModel0;
        this.p = signatureIntent0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new u(this.o, this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((u)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        int v = ((DeleteHistory)this.p).getId();
        this.o.L0.delete(v);
        return Unit.INSTANCE;
    }
}

