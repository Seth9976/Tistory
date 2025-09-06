package com.kakao.tistory.presentation.view.leave;

import androidx.compose.runtime.State;
import com.kakao.tistory.presentation.viewmodel.LeaveViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public final LeaveActivity a;
    public final State b;

    public f(LeaveActivity leaveActivity0, State state0) {
        this.a = leaveActivity0;
        this.b = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LeaveViewModel leaveViewModel0 = LeaveActivity.access$getLeaveViewModel(this.a);
        Boolean boolean0 = LeaveActivity.access$LeaveConfirmButton$lambda$2(this.b);
        leaveViewModel0.onClickLeaveConfirm((boolean0 == null ? false : boolean0.booleanValue()));
        return Unit.INSTANCE;
    }
}

