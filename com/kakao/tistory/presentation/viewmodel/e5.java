package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.domain.entity.common.RecommendedBlogNameInfo;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.view.signup.contract.SignUpIntent.ChangeBlogName;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class e5 extends SuspendLambda implements Function2 {
    public int a;
    public final SignUpViewModel b;

    public e5(SignUpViewModel signUpViewModel0, Continuation continuation0) {
        this.b = signUpViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new e5(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new e5(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.k.invoke(this);
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
            signUpViewModel0.sendIntent(new ChangeBlogName(new TextFieldValue(((RecommendedBlogNameInfo)((Success)(((Result)object0))).getData()).getName(), 0L, null, 6, null), ((RecommendedBlogNameInfo)((Success)(((Result)object0))).getData()).getBy()));
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            signUpViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
        }
        return Unit.INSTANCE;
    }
}

