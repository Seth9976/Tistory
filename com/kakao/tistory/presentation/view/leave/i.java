package com.kakao.tistory.presentation.view.leave;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.viewmodel.LeaveViewModel.LeaveDialogEvent.LeaveConfirm;
import com.kakao.tistory.presentation.viewmodel.LeaveViewModel.LeaveDialogEvent;
import com.kakao.tistory.presentation.widget.dialog.DialogFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function4 {
    public final LeaveActivity a;

    public i(LeaveActivity leaveActivity0) {
        this.a = leaveActivity0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((DialogFactory)object0), "$this$DialogHandler");
        Intrinsics.checkNotNullParameter(((LeaveDialogEvent)object1), "event");
        int v1 = (v & 14) == 0 ? (((Composer)object2).changed(((DialogFactory)object0)) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (((Composer)object2).changed(((LeaveDialogEvent)object1)) ? 0x20 : 16);
        }
        if((v1 & 731) == 0x92 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1787489570, v1, -1, "com.kakao.tistory.presentation.view.leave.LeaveActivity.LeaveDialogHandler.<anonymous> (LeaveActivity.kt:221)");
        }
        if(((LeaveDialogEvent)object1) instanceof LeaveConfirm) {
            ((DialogFactory)object0).ShowOkCancel(StringResources_androidKt.stringResource(string.label_leave_dialog_title, ((Composer)object2), 0), StringResources_androidKt.stringResource(string.label_leave_dialog_message, ((Composer)object2), 0), string.label_dialog_cancel, string.label_dialog_leave, true, new h(((DialogFactory)object0), this.a), null, ((Composer)object2), v1 << 21 & 0x1C00000 | 0x6000, 0x40);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

