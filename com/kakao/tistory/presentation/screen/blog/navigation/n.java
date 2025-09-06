package com.kakao.tistory.presentation.screen.blog.navigation;

import com.kakao.tistory.presentation.ActivityNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class n extends FunctionReferenceImpl implements Function3 {
    public n(ActivityNavigator activityNavigator0) {
        super(3, activityNavigator0, ActivityNavigator.class, "navigateToEntryStatistics", "navigateToEntryStatistics(Ljava/lang/String;JLjava/lang/String;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Intrinsics.checkNotNullParameter(((String)object0), "p0");
        Intrinsics.checkNotNullParameter(((String)object2), "p2");
        ((ActivityNavigator)this.receiver).navigateToEntryStatistics(((String)object0), ((Number)object1).longValue(), ((String)object2));
        return Unit.INSTANCE;
    }
}

