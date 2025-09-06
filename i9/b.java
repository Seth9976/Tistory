package i9;

import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.kakao.android.base.model.AdInfo;
import com.kakao.android.base.utils.ADIDUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

public final class b extends SuspendLambda implements Function2 {
    public final Function1 o;

    public b(Function1 function10, Continuation continuation0) {
        this.o = function10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new b(this.o, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Unit unit0;
        ResultKt.throwOnFailure(object0);
        Info advertisingIdClient$Info0 = ADIDUtils.access$getAdInfo(ADIDUtils.INSTANCE);
        Function1 function10 = this.o;
        if(advertisingIdClient$Info0 == null) {
            unit0 = null;
        }
        else {
            String s = advertisingIdClient$Info0.getId();
            Intrinsics.checkNotNullExpressionValue(s, "getId(...)");
            function10.invoke(new AdInfo(s, advertisingIdClient$Info0.isLimitAdTrackingEnabled()));
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            function10.invoke(null);
        }
        return Unit.INSTANCE;
    }
}

