package p9;

import com.kakao.kandinsky.base.KDFeatureViewModel;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class d extends SuspendLambda implements Function2 {
    public Object o;
    public final KDFeatureViewModel p;

    public d(KDFeatureViewModel kDFeatureViewModel0, Continuation continuation0) {
        this.p = kDFeatureViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new d(this.p, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d)this.create(((KDPhoto)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        return Boxing.boxBoolean(!Intrinsics.areEqual(((KDPhoto)this.o), this.p.K0));
    }
}

