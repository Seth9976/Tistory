package com.kakao.tistory.presentation.view.setting.secretLab;

import androidx.navigation.NavHostController;
import com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class l extends SuspendLambda implements Function2 {
    public final SecretLabActivity a;
    public final String b;
    public final NavHostController c;

    public l(SecretLabActivity secretLabActivity0, String s, NavHostController navHostController0, Continuation continuation0) {
        this.a = secretLabActivity0;
        this.b = s;
        this.c = navHostController0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new l(this.a, this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((l)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        k k0 = new k(this.b, this.a, this.c);
        TistoryToolbarActivity.updateAppBarHomeAsUpEnabled$default(this.a, false, k0, 1, null);
        return Unit.INSTANCE;
    }
}

