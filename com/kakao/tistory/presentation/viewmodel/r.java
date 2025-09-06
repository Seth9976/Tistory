package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.common.Logger;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class r extends SuspendLambda implements Function2 {
    public int a;
    public final DaumCategoryViewModel b;

    public r(DaumCategoryViewModel daumCategoryViewModel0, Continuation continuation0) {
        this.b = daumCategoryViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new r(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new r(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.g.daumLikeCategories(this);
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
        DaumCategoryViewModel daumCategoryViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            Logger.INSTANCE.log("daum like category " + ((Success)(((Result)object0))).getData());
            Object object2 = ((Success)(((Result)object0))).getData();
            if(((List)object2).isEmpty()) {
                object2 = null;
            }
            if(((List)object2) != null) {
                daumCategoryViewModel0.a(CollectionsKt___CollectionsKt.toMutableList(((List)object2)));
                return Unit.INSTANCE;
            }
        }
        else if(((Result)object0) instanceof Fail) {
            daumCategoryViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
        }
        return Unit.INSTANCE;
    }
}

