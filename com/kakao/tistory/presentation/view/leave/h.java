package com.kakao.tistory.presentation.view.leave;

import com.kakao.tistory.presentation.widget.dialog.DialogButton;
import com.kakao.tistory.presentation.widget.dialog.DialogFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final DialogFactory a;
    public final LeaveActivity b;

    public h(DialogFactory dialogFactory0, LeaveActivity leaveActivity0) {
        this.a = dialogFactory0;
        this.b = leaveActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DialogButton)object0), "button");
        switch(LeaveActivity.LeaveDialogHandler.1.1.WhenMappings.$EnumSwitchMapping$0[((DialogButton)object0).ordinal()]) {
            case 1: {
                this.a.getDismiss().invoke();
                return Unit.INSTANCE;
            }
            case 2: {
                this.a.getDismiss().invoke();
                LeaveActivity.access$getLeaveViewModel(this.b).onClickDialogLeave();
                return Unit.INSTANCE;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}

