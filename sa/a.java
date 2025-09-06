package sa;

import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.signature.SignatureScreenKt.ConsumeEvent.2.2.WhenMappings;
import com.kakao.kandinsky.signature.contract.SignatureEvent.Go;
import com.kakao.kandinsky.signature.contract.SignatureEvent.ShowHistory;
import com.kakao.kandinsky.signature.contract.SignatureEvent.ShowImageSelector;
import com.kakao.kandinsky.signature.contract.SignatureEvent.UpdateConfirm;
import com.kakao.kandinsky.signature.contract.SignatureEvent.UpdateMultipleConfirm;
import com.kakao.kandinsky.signature.contract.SignatureEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

public final class a extends SuspendLambda implements Function2 {
    public Object o;
    public final Function0 p;
    public final Function0 q;
    public final Function1 r;
    public final Function1 s;
    public final Function1 t;

    public a(Function0 function00, Function0 function01, Function1 function10, Function1 function11, Function1 function12, Continuation continuation0) {
        this.p = function00;
        this.q = function01;
        this.r = function10;
        this.s = function11;
        this.t = function12;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new a(this.p, this.q, this.r, this.s, this.t, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a)this.create(((SignatureEvent)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        SignatureEvent signatureEvent0 = (SignatureEvent)this.o;
        Function0 function00 = this.p;
        if(!(signatureEvent0 instanceof Go)) {
            if(Intrinsics.areEqual(signatureEvent0, ShowImageSelector.INSTANCE)) {
                this.q.invoke();
                return Unit.INSTANCE;
            }
            if(signatureEvent0 instanceof ShowHistory) {
                Flow flow0 = ((ShowHistory)signatureEvent0).getHistories();
                this.r.invoke(flow0);
                return Unit.INSTANCE;
            }
            if(signatureEvent0 instanceof UpdateConfirm) {
                KDPhoto kDPhoto0 = ((UpdateConfirm)signatureEvent0).getPhoto();
                this.s.invoke(kDPhoto0);
                function00.invoke();
                return Unit.INSTANCE;
            }
            if(signatureEvent0 instanceof UpdateMultipleConfirm) {
                KDPhoto kDPhoto1 = ((UpdateMultipleConfirm)signatureEvent0).getPhoto();
                this.t.invoke(kDPhoto1);
            }
        }
        else if(SignatureScreenKt.ConsumeEvent.2.2.WhenMappings.$EnumSwitchMapping$0[((Go)signatureEvent0).getDestination().ordinal()] == 1) {
            function00.invoke();
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}

