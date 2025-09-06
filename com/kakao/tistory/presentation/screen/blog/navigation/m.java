package com.kakao.tistory.presentation.screen.blog.navigation;

import com.kakao.tistory.presentation.ActivityNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class m extends FunctionReferenceImpl implements Function2 {
    public m(ActivityNavigator activityNavigator0) {
        super(2, activityNavigator0, ActivityNavigator.class, "navigateToEntryEditor", "navigateToEntryEditor(Ljava/lang/String;J)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((String)object0), "p0");
        ((ActivityNavigator)this.receiver).navigateToEntryEditor(((String)object0), ((Number)object1).longValue());
        return Unit.INSTANCE;
    }
}

