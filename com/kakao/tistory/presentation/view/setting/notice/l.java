package com.kakao.tistory.presentation.view.setting.notice;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.domain.ErrorModelThrowable;
import com.kakao.tistory.presentation.view.common.PagingItemListKt;
import com.kakao.tistory.presentation.widget.common.CommonExceptionViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function3 {
    public final LazyPagingItems a;
    public final SettingNoticeListActivity b;
    public final Function0 c;

    public l(LazyPagingItems lazyPagingItems0, SettingNoticeListActivity settingNoticeListActivity0, Function0 function00) {
        this.a = lazyPagingItems0;
        this.b = settingNoticeListActivity0;
        this.c = function00;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxScope)object0), "$this$PullToRefreshBox");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF21662BE, v, -1, "com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListActivity.SettingNoticeScreen.<anonymous> (SettingNoticeListActivity.kt:93)");
        }
        ErrorModelThrowable errorModelThrowable0 = this.a == null ? null : PagingItemListKt.getRefreshError(this.a);
        if(errorModelThrowable0 == null) {
            ((Composer)object1).startReplaceGroup(0x1E0EDFD7);
            SettingNoticeListActivity.access$SettingNoticeContent(this.b, this.a, this.c, ((Composer)object1), LazyPagingItems.$stable);
        }
        else {
            ((Composer)object1).startReplaceGroup(0x1E103933);
            k k0 = new k(this.a);
            CommonExceptionViewKt.CommonExceptionViewWithBackAppBar(errorModelThrowable0.getErrorModel(), this.c, k0, ((Composer)object1), 8, 0);
        }
        ((Composer)object1).endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

