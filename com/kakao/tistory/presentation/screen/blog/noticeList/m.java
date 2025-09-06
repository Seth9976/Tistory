package com.kakao.tistory.presentation.screen.blog.noticeList;

import androidx.compose.runtime.State;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.DialogType.Delete;
import com.kakao.tistory.presentation.screen.blog.noticeList.contract.DialogType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function0 {
    public final DialogType a;
    public final State b;

    public m(DialogType dialogType0, State state0) {
        this.a = dialogType0;
        this.b = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogNoticeListScreenKt.access$BlogNoticeScreen$lambda$1(this.b).getOnDismissDialog().invoke();
        BlogNoticeListScreenKt.access$BlogNoticeScreen$lambda$1(this.b).getDeleteNotice().invoke(((Delete)this.a).getBlogName(), ((Delete)this.a).getId());
        return Unit.INSTANCE;
    }
}

