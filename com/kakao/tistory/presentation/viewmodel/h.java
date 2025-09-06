package com.kakao.tistory.presentation.viewmodel;

import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

public final class h extends AdaptedFunctionReference implements SuspendFunction, Function3 {
    public static final h a;

    static {
        h.a = new h();
    }

    public h() {
        super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        return BlogFollowViewModel.access$blogFollowers$lambda$1(((String)object0), ((String)object1), ((Continuation)object2));
    }
}

