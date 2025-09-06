package com.kakao.tistory.presentation.viewmodel;

import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.user.UserApiClient;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class u2 extends SuspendLambda implements Function2 {
    public int a;
    public final MigrationViewModel b;
    public final OAuthToken c;

    public u2(MigrationViewModel migrationViewModel0, OAuthToken oAuthToken0, Continuation continuation0) {
        this.b = migrationViewModel0;
        this.c = oAuthToken0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new u2(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new u2(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.g.postTransferCheck(this.c.getAccessToken(), this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        MigrationViewModel migrationViewModel0 = this.b;
        OAuthToken oAuthToken0 = this.c;
        if(((Result)object0) instanceof Success) {
            migrationViewModel0.isShowProgress().postValue(Boxing.boxBoolean(false));
            migrationViewModel0.p = oAuthToken0;
            UserApiClient.me$default(UserApiClient.Companion.getInstance(), false, new t2(migrationViewModel0), 1, null);
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            migrationViewModel0.isShowProgress().postValue(Boxing.boxBoolean(false));
            if(Intrinsics.areEqual("EXCEPTION_UNKNOWN_STATUS", "KAKAO_USER_ALREADY_REGISTERED")) {
                MigrationViewModel.access$moveState(migrationViewModel0, MigrationState.USED_ACCOUNT);
                return Unit.INSTANCE;
            }
            migrationViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
        }
        return Unit.INSTANCE;
    }
}

