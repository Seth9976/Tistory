package com.kakao.tistory.presentation.screen.notification;

import android.content.Context;
import com.kakao.tistory.domain.entity.NotificationItem;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.common.redirect.RedirectData;
import com.kakao.tistory.presentation.common.redirect.RedirectUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.p;

public final class d extends Lambda implements Function1 {
    public final Context a;

    public d(Context context0) {
        this.a = context0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((NotificationItem)object0), "data");
        String s = ((NotificationItem)object0).getLink();
        if(s != null) {
            if(p.isBlank(s)) {
                s = null;
            }
            if(s != null) {
                RedirectData redirectData0 = RedirectUtils.createRedirectData$default(RedirectUtils.INSTANCE, s, false, 2, null);
                NavigatorExtensionKt.goToRedirect(this.a, redirectData0);
            }
        }
        return Unit.INSTANCE;
    }
}

