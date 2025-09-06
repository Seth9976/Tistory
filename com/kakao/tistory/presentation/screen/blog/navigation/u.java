package com.kakao.tistory.presentation.screen.blog.navigation;

import com.kakao.tistory.presentation.ActivityNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class u extends FunctionReferenceImpl implements Function2 {
    public u(ActivityNavigator activityNavigator0) {
        super(2, activityNavigator0, ActivityNavigator.class, "navigateToTextShare", "navigateToTextShare(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((String)object0), "p0");
        Intrinsics.checkNotNullParameter(((String)object1), "p1");
        ((ActivityNavigator)this.receiver).navigateToTextShare(((String)object0), ((String)object1));
        return Unit.INSTANCE;
    }
}

