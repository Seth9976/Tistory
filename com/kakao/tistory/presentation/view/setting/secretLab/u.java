package com.kakao.tistory.presentation.view.setting.secretLab;

import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import com.kakao.tistory.presentation.viewmodel.SecretLabViewModel.SecretLabEvent.CloseApp;
import com.kakao.tistory.presentation.viewmodel.SecretLabViewModel.SecretLabEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

public final class u implements FlowCollector {
    public final SecretLabActivity a;

    public u(SecretLabActivity secretLabActivity0) {
        this.a = secretLabActivity0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        if(Intrinsics.areEqual(((SecretLabEvent)object0), CloseApp.INSTANCE)) {
            String s = this.a.getString(string.secret_lab_server_host_reload_app);
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            t t0 = new t(this.a);
            TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, s, null, false, null, t0, null, 92, null);
        }
        return Unit.INSTANCE;
    }
}

