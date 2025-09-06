package com.kakao.tistory.presentation.view.comment;

import androidx.compose.runtime.MutableState;
import androidx.paging.LoadState.Error;
import androidx.paging.LoadState.Loading;
import androidx.paging.LoadState.NotLoading;
import androidx.paging.LoadState;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.ErrorModelThrowable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class z0 extends SuspendLambda implements Function2 {
    public int a;
    public final LoadState b;
    public final CommentFragment c;
    public final Function1 d;
    public final Function0 e;
    public final MutableState f;

    public z0(LoadState loadState0, CommentFragment commentFragment0, Function1 function10, Function0 function00, MutableState mutableState0, Continuation continuation0) {
        this.b = loadState0;
        this.c = commentFragment0;
        this.d = function10;
        this.e = function00;
        this.f = mutableState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new z0(this.b, this.c, this.d, this.e, this.f, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((z0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                LoadState loadState0 = this.b;
                if(!(loadState0 instanceof NotLoading)) {
                    goto label_11;
                }
                this.c.hideExceptionView();
                if(CommentFragment.access$ListStateHandler$lambda$17(this.f)) {
                    this.a = 1;
                    if(this.d.invoke(this) == object1) {
                        return object1;
                    label_11:
                        if(Intrinsics.areEqual(loadState0, Loading.INSTANCE)) {
                            this.c.hideExceptionView();
                            CommentFragment.access$ListStateHandler$lambda$18(this.f, true);
                            this.e.invoke();
                            return Unit.INSTANCE;
                        }
                        if(loadState0 instanceof Error) {
                            Throwable throwable0 = ((Error)this.b).getError();
                            Unit unit0 = null;
                            ErrorModelThrowable errorModelThrowable0 = throwable0 instanceof ErrorModelThrowable ? ((ErrorModelThrowable)throwable0) : null;
                            if(errorModelThrowable0 != null) {
                                ErrorModel errorModel0 = errorModelThrowable0.getErrorModel();
                                if(errorModel0 != null) {
                                    this.c.showExceptionView(errorModel0);
                                    unit0 = Unit.INSTANCE;
                                }
                            }
                            if(unit0 == null) {
                                this.c.hideExceptionView();
                            }
                        }
                        return Unit.INSTANCE;
                    }
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
        CommentFragment.access$ListStateHandler$lambda$18(this.f, false);
        return Unit.INSTANCE;
    }
}

