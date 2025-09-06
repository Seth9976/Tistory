package com.kakao.tistory.presentation.view.leave;

import androidx.compose.runtime.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function0 {
    public final State a;
    public final LeaveActivity b;

    public d(State state0, LeaveActivity leaveActivity0) {
        this.a = state0;
        this.b = leaveActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Boolean boolean0 = LeaveActivity.access$LeaveAgreeBox$lambda$4(this.a);
        if(boolean0 != null) {
            LeaveActivity.access$getLeaveViewModel(this.b).onClickDataRemoveAgree(!boolean0.booleanValue());
        }
        return Unit.INSTANCE;
    }
}

