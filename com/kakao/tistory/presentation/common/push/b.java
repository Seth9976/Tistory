package com.kakao.tistory.presentation.common.push;

import android.app.Notification;
import android.app.NotificationManager;
import androidx.core.app.NotificationCompat.Builder;
import com.kakao.tistory.presentation.common.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final PushMessageBuilder a;
    public final int b;
    public final Builder c;

    public b(PushMessageBuilder pushMessageBuilder0, int v, Builder notificationCompat$Builder0) {
        this.a = pushMessageBuilder0;
        this.b = v;
        this.c = notificationCompat$Builder0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Logger.INSTANCE.log("sendNotification() largeIcon : load fail");
        NotificationManager notificationManager0 = PushMessageBuilder.access$getNotificationManager(this.a);
        Notification notification0 = this.c.build();
        notificationManager0.notify(this.b, notification0);
        return Unit.INSTANCE;
    }
}

