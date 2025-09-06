package com.kakao.tistory.presentation.view.leave;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function0 {
    public final LeaveCompleteActivity a;

    public s(LeaveCompleteActivity leaveCompleteActivity0) {
        this.a = leaveCompleteActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LeaveCompleteActivity.access$getLeaveViewModel(this.a).onClickLeaveComplete();
        return Unit.INSTANCE;
    }
}

