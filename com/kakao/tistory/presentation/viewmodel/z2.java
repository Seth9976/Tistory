package com.kakao.tistory.presentation.viewmodel;

import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import java.util.Date;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class z2 extends SuspendLambda implements Function2 {
    public MigrationViewModel a;
    public int b;
    public final MigrationViewModel c;

    public z2(MigrationViewModel migrationViewModel0, Continuation continuation0) {
        this.c = migrationViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new z2(this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new z2(this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object2;
        String s1;
        MigrationViewModel migrationViewModel0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Unit unit0 = null;
        switch(this.b) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                OAuthToken oAuthToken0 = this.c.p;
                if(oAuthToken0 != null) {
                    migrationViewModel0 = this.c;
                    migrationViewModel0.isShowProgress().postValue(Boxing.boxBoolean(true));
                    Date date0 = oAuthToken0.getRefreshTokenExpiresAt();
                    if(date0 != null) {
                        List list0 = oAuthToken0.getScopes();
                        if(list0 == null) {
                            s1 = null;
                        }
                        else {
                            String s = CollectionsKt___CollectionsKt.joinToString$default(list0, " ", null, null, 0, null, null, 62, null);
                            s1 = s == null ? null : StringsKt__StringsKt.trim(s).toString();
                        }
                        long v = oAuthToken0.getAccessTokenExpiresAt().getTime();
                        long v1 = date0.getTime();
                        this.a = migrationViewModel0;
                        this.b = 1;
                        object2 = migrationViewModel0.g.postTransfer(oAuthToken0.getAccessToken(), v, oAuthToken0.getRefreshToken(), v1, s1, this);
                        if(object2 == object1) {
                            return object1;
                        }
                        goto label_31;
                    }
                }
                break;
            }
            case 1: {
                MigrationViewModel migrationViewModel1 = this.a;
                ResultKt.throwOnFailure(object0);
                migrationViewModel0 = migrationViewModel1;
                object2 = object0;
            label_31:
                if(((Result)object2) instanceof Success) {
                    migrationViewModel0.isShowProgress().postValue(Boxing.boxBoolean(false));
                    y2 y20 = new y2(migrationViewModel0, ((Success)(((Result)object2))));
                    this.a = null;
                    this.b = 2;
                    if(MigrationViewModel.access$login(migrationViewModel0, y20, this) == object1) {
                        return object1;
                    }
                }
                else if(((Result)object2) instanceof Fail) {
                    migrationViewModel0.isShowProgress().postValue(Boxing.boxBoolean(false));
                    migrationViewModel0.showErrorDialog(((Fail)(((Result)object2))).getErrorModel());
                }
                unit0 = Unit.INSTANCE;
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                unit0 = Unit.INSTANCE;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(unit0 == null) {
            this.c.onClickGoHome();
        }
        return Unit.INSTANCE;
    }
}

