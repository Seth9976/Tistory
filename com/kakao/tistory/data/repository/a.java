package com.kakao.tistory.data.repository;

import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.kakao.tistory.domain.entity.AdInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

public final class a extends SuspendLambda implements Function2 {
    public final ADIDRepositoryImpl a;

    public a(ADIDRepositoryImpl aDIDRepositoryImpl0, Continuation continuation0) {
        this.a = aDIDRepositoryImpl0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a(this.a, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new a(this.a, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Info advertisingIdClient$Info0 = ADIDRepositoryImpl.access$getAdInfo(this.a);
        if(advertisingIdClient$Info0 != null) {
            ADIDRepositoryImpl aDIDRepositoryImpl0 = this.a;
            String s = advertisingIdClient$Info0.getId();
            if(s != null) {
                Intrinsics.checkNotNull(s);
                aDIDRepositoryImpl0.setAdInfo(new AdInfo(s, advertisingIdClient$Info0.isLimitAdTrackingEnabled()));
            }
        }
        return Unit.INSTANCE;
    }
}

