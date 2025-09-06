package com.kakao.tistory.presentation.screen.blog.navigation;

import com.kakao.tistory.presentation.ActivityNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class w extends FunctionReferenceImpl implements Function2 {
    public w(ActivityNavigator activityNavigator0) {
        super(2, activityNavigator0, ActivityNavigator.class, "navigateToTopEntryList", "navigateToTopEntryList(Ljava/lang/String;Z)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((String)object0), "p0");
        ((ActivityNavigator)this.receiver).navigateToTopEntryList(((String)object0), ((Boolean)object1).booleanValue());
        return Unit.INSTANCE;
    }
}

