package com.kakao.tistory.presentation.view.leave;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function1 {
    public final LeaveCompleteActivity a;

    public v(LeaveCompleteActivity leaveCompleteActivity0) {
        this.a = leaveCompleteActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        NavigatorExtensionKt.goToSplash(this.a);
        return Unit.INSTANCE;
    }
}

