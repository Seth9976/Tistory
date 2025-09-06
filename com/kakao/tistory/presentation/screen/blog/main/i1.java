package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.CopyPassword;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.ShowErrorDialog;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class i1 extends SuspendLambda implements Function2 {
    public int a;
    public final BlogMainViewModel b;
    public final String c;
    public final long d;
    public final EntryVisibilityType e;

    public i1(BlogMainViewModel blogMainViewModel0, String s, long v, EntryVisibilityType entryVisibilityType0, Continuation continuation0) {
        this.b = blogMainViewModel0;
        this.c = s;
        this.d = v;
        this.e = entryVisibilityType0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new i1(this.b, this.c, this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.t.putEntryVisibility(this.c, this.d, this.e.getValue(), this);
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
        EntryVisibilityType entryVisibilityType0 = this.e;
        BlogMainViewModel blogMainViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            if(entryVisibilityType0 == EntryVisibilityType.PROTECTED) {
                String s = ((EntryItem)((Success)(((Result)object0))).getData()).getPassword();
                if(s != null) {
                    blogMainViewModel0.sendEvent(new CopyPassword(s));
                    return Unit.INSTANCE;
                }
            }
        }
        else if(((Result)object0) instanceof Fail) {
            blogMainViewModel0.sendIntent(new ShowErrorDialog(((Fail)(((Result)object0))).getErrorModel()));
        }
        return Unit.INSTANCE;
    }
}

