package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.Event;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class b4 extends SuspendLambda implements Function2 {
    public boolean a;
    public SearchResultViewModel b;
    public Blog c;
    public int d;
    public final String e;
    public final boolean f;
    public final SearchResultViewModel g;
    public final Blog h;

    public b4(String s, boolean z, SearchResultViewModel searchResultViewModel0, Blog blog0, Continuation continuation0) {
        this.e = s;
        this.f = z;
        this.g = searchResultViewModel0;
        this.h = blog0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new b4(this.e, this.f, this.g, this.h, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b4)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Blog blog1;
        SearchResultViewModel searchResultViewModel1;
        boolean z1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = this.e;
                if(s != null) {
                    boolean z = this.f;
                    SearchResultViewModel searchResultViewModel0 = this.g;
                    Blog blog0 = this.h;
                    z3 z30 = z ? new z3(searchResultViewModel0.h) : new a4(searchResultViewModel0.h);
                    this.b = searchResultViewModel0;
                    this.c = blog0;
                    this.a = z;
                    this.d = 1;
                    object0 = z30.invoke(s, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    z1 = z;
                    searchResultViewModel1 = searchResultViewModel0;
                    blog1 = blog0;
                    goto label_28;
                }
                break;
            }
            case 1: {
                z1 = this.a;
                blog1 = this.c;
                searchResultViewModel1 = this.b;
                ResultKt.throwOnFailure(object0);
            label_28:
                if(((Result)object0) instanceof Success) {
                    searchResultViewModel1.getUpdatedBlog().setValue(new Pair(blog1.getId(), Boxing.boxBoolean(!z1)));
                    searchResultViewModel1.o.postValue(new Event(Boxing.boxInt((z1 ? string.blog_unfollow_toast : string.blog_follow_toast))));
                    return Unit.INSTANCE;
                }
                if(((Result)object0) instanceof Fail) {
                    searchResultViewModel1.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

