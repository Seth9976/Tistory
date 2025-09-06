package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.repository.EntryRepository;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class u1 extends FunctionReferenceImpl implements SuspendFunction, Function3 {
    public u1(EntryRepository entryRepository0) {
        super(3, entryRepository0, EntryRepository.class, "deleteLikeIt", "deleteLikeIt(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        return ((EntryRepository)this.receiver).deleteLikeIt(((String)object0), ((Number)object1).longValue(), ((Continuation)object2));
    }
}

