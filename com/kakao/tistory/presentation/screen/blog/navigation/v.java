package com.kakao.tistory.presentation.screen.blog.navigation;

import com.kakao.tistory.presentation.ActivityNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class v extends FunctionReferenceImpl implements Function1 {
    public v(ActivityNavigator activityNavigator0) {
        super(1, activityNavigator0, ActivityNavigator.class, "navigateToStoryCreator", "navigateToStoryCreator(Ljava/lang/String;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "p0");
        ((ActivityNavigator)this.receiver).navigateToStoryCreator(((String)object0));
        return Unit.INSTANCE;
    }
}

