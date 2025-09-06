package com.kakao.tistory.presentation.screen.blog.navigation;

import com.kakao.tistory.presentation.ActivityNavigator;
import com.kakao.tistory.presentation.screen.item.GuestbookExtra;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class q extends FunctionReferenceImpl implements Function1 {
    public q(ActivityNavigator activityNavigator0) {
        super(1, activityNavigator0, ActivityNavigator.class, "navigateToGuestbook", "navigateToGuestbook(Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GuestbookExtra)object0), "p0");
        ((ActivityNavigator)this.receiver).navigateToGuestbook(((GuestbookExtra)object0));
        return Unit.INSTANCE;
    }
}

