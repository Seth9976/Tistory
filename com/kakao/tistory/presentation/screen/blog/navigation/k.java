package com.kakao.tistory.presentation.screen.blog.navigation;

import com.kakao.tistory.presentation.ActivityNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class k extends FunctionReferenceImpl implements Function1 {
    public k(ActivityNavigator activityNavigator0) {
        super(1, activityNavigator0, ActivityNavigator.class, "navigateToBlog", "navigateToBlog(Ljava/lang/String;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "p0");
        ((ActivityNavigator)this.receiver).navigateToBlog(((String)object0));
        return Unit.INSTANCE;
    }
}

