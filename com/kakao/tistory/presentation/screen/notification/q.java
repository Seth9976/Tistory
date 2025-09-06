package com.kakao.tistory.presentation.screen.notification;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import com.kakao.tistory.domain.entity.SortItem.NotificationSortItem;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarSortKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function3 {
    public final State a;
    public final NotificationViewModel b;

    public q(State state0, NotificationViewModel notificationViewModel0) {
        this.a = state0;
        this.b = notificationViewModel0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$TistoryCollapsingTopAppBar");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x22E4082F, v, -1, "com.kakao.tistory.presentation.screen.notification.NotificationScreen.<anonymous>.<anonymous>.<anonymous> (NotificationScreen.kt:107)");
        }
        NotificationSortItem sortItem$NotificationSortItem0 = NotificationScreenKt.access$NotificationScreen$lambda$8(this.a);
        if(sortItem$NotificationSortItem0 != null) {
            TistoryTopAppBarSortKt.SortSelectButton(sortItem$NotificationSortItem0.getTitle(), new p(this.b), ((Composer)object1), 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

