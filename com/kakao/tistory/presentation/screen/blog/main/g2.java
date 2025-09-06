package com.kakao.tistory.presentation.screen.blog.main;

import androidx.paging.Pager;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainCategoryItem;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.UpdateEntryList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class g2 extends SuspendLambda implements Function2 {
    public int a;
    public final BlogMainViewModel b;
    public final String c;
    public final BlogMainCategoryItem d;

    public g2(BlogMainViewModel blogMainViewModel0, String s, BlogMainCategoryItem blogMainCategoryItem0, Continuation continuation0) {
        this.b = blogMainViewModel0;
        this.c = s;
        this.d = blogMainCategoryItem0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new g2(this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g2)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.i.invoke(this.c, (this.d == null ? null : Boxing.boxInt(this.d.getId())), this);
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
        UpdateEntryList blogMainIntent$UpdateEntryList0 = new UpdateEntryList(((Pager)object0));
        this.b.sendIntent(blogMainIntent$UpdateEntryList0);
        return Unit.INSTANCE;
    }
}

