package com.kakao.tistory.presentation.viewmodel;

import com.kakao.android.base.BaseKt;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.entity.common.MemberErrorModel;
import com.kakao.tistory.domain.entity.common.RecommendedBlogNameList;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.signup.contract.SignUpIntent.ChangeBlogNameValidation;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class c5 extends SuspendLambda implements Function2 {
    public int a;
    public final SignUpViewModel b;
    public final String c;
    public final String d;

    public c5(SignUpViewModel signUpViewModel0, String s, String s1, Continuation continuation0) {
        this.b = signUpViewModel0;
        this.c = s;
        this.d = s1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c5(this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c5)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.l.invoke(this.c, this.d, this);
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
        SignUpViewModel signUpViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            String s = BaseKt.getAppContext().getString(string.label_sign_up_verified_email);
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            signUpViewModel0.sendIntent(new ChangeBlogNameValidation(true, false, s, null, 8, null));
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            List list0 = CollectionsKt__CollectionsKt.emptyList();
            ErrorModel errorModel0 = ((Fail)(((Result)object0))).getErrorModel();
            MemberErrorModel memberErrorModel0 = errorModel0 instanceof MemberErrorModel ? ((MemberErrorModel)errorModel0) : null;
            if(memberErrorModel0 != null) {
                RecommendedBlogNameList recommendedBlogNameList0 = memberErrorModel0.getData();
                if(recommendedBlogNameList0 == null) {
                    list0 = CollectionsKt__CollectionsKt.emptyList();
                }
                else {
                    list0 = recommendedBlogNameList0.getBlogNameInfoList();
                    if(list0 == null) {
                        list0 = CollectionsKt__CollectionsKt.emptyList();
                    }
                }
            }
            signUpViewModel0.sendIntent(new ChangeBlogNameValidation(false, true, ((Fail)(((Result)object0))).getErrorModel().getMessage(), list0));
        }
        return Unit.INSTANCE;
    }
}

