package com.kakao.tistory.presentation.screen.blog.setting;

import com.kakao.tistory.domain.entity.common.CheckModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.screen.blog.setting.contract.BlogSettingIntent.ChangeNicknameValidation;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class z extends SuspendLambda implements Function2 {
    public int a;
    public final BlogSettingViewModel b;
    public final String c;

    public z(BlogSettingViewModel blogSettingViewModel0, String s, Continuation continuation0) {
        this.b = blogSettingViewModel0;
        this.c = s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new z(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new z(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.h.invoke(this.c, this);
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
        BlogSettingViewModel blogSettingViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            if(((CheckModel)((Success)(((Result)object0))).getData()).getEnable()) {
                blogSettingViewModel0.sendIntent(new ChangeNicknameValidation(true, null, 2, null));
                return Unit.INSTANCE;
            }
            blogSettingViewModel0.sendIntent(new ChangeNicknameValidation(false, ((CheckModel)((Success)(((Result)object0))).getData()).getMessage()));
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            blogSettingViewModel0.sendIntent(new ChangeNicknameValidation(false, ((Fail)(((Result)object0))).getErrorModel().getMessage()));
        }
        return Unit.INSTANCE;
    }
}

