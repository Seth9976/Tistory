package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.repository.OldBlogRepository;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class z3 extends FunctionReferenceImpl implements SuspendFunction, Function2 {
    public z3(OldBlogRepository oldBlogRepository0) {
        super(2, oldBlogRepository0, OldBlogRepository.class, "deleteFollowBlog", "deleteFollowBlog(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((OldBlogRepository)this.receiver).deleteFollowBlog(((String)object0), ((Continuation)object1));
    }
}

