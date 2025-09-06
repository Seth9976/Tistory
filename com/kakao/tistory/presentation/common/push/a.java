package com.kakao.tistory.presentation.common.push;

import android.app.Notification;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat.Builder;
import com.kakao.tistory.presentation.common.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final Builder a;
    public final PushMessageBuilder b;
    public final int c;

    public a(Builder notificationCompat$Builder0, PushMessageBuilder pushMessageBuilder0, int v) {
        this.a = notificationCompat$Builder0;
        this.b = pushMessageBuilder0;
        this.c = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Bitmap)object0), "it");
        Logger.INSTANCE.log("sendNotification() largeIcon : load success");
        this.a.setLargeIcon(((Bitmap)object0));
        NotificationManager notificationManager0 = PushMessageBuilder.access$getNotificationManager(this.b);
        Notification notification0 = this.a.build();
        notificationManager0.notify(this.c, notification0);
        return Unit.INSTANCE;
    }
}

