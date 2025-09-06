package com.kakao.tistory.presentation.common.push;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat.Builder;
import androidx.core.content.ContextCompat;
import com.kakao.tistory.domain.entity.push.PushMessage;
import com.kakao.tistory.domain.repository.NotificationRepository;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.glide.GlideLoaderKt;
import com.kakao.tistory.presentation.common.glide.GlideRequestOptions;
import com.kakao.tistory.presentation.common.redirect.RedirectUtils.Type;
import com.kakao.tistory.presentation.common.redirect.RedirectUtils;
import com.kakao.tistory.presentation.view.SplashActivity;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0086@¢\u0006\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/presentation/common/push/PushMessageBuilder;", "", "Lcom/kakao/tistory/domain/repository/NotificationRepository;", "notificationRepository", "Landroid/content/Context;", "context", "<init>", "(Lcom/kakao/tistory/domain/repository/NotificationRepository;Landroid/content/Context;)V", "Lcom/kakao/tistory/domain/entity/push/PushMessage;", "pushMessage", "", "sendNotification", "(Lcom/kakao/tistory/domain/entity/push/PushMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPushMessageBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushMessageBuilder.kt\ncom/kakao/tistory/presentation/common/push/PushMessageBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
public final class PushMessageBuilder {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/common/push/PushMessageBuilder$Companion;", "", "", "EXTRA_READ_NOTIFICATION_ID", "Ljava/lang/String;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Type.values().length];
            try {
                arr_v[Type.NOTIFICATION.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.BLOGTOP.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.ENTRY.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.COMMENT.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.FOLLOWER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String EXTRA_READ_NOTIFICATION_ID = "EXTRA_READ_NOTIFICATION_ID";
    public final NotificationRepository a;
    public final Context b;

    static {
        PushMessageBuilder.Companion = new Companion(null);
        PushMessageBuilder.$stable = 8;
    }

    public PushMessageBuilder(@NotNull NotificationRepository notificationRepository0, @NotNull Context context0) {
        Intrinsics.checkNotNullParameter(notificationRepository0, "notificationRepository");
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        this.a = notificationRepository0;
        this.b = context0;
    }

    public static final NotificationManager access$getNotificationManager(PushMessageBuilder pushMessageBuilder0) {
        Object object0 = pushMessageBuilder0.b.getSystemService("notification");
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager)object0;
    }

    @Nullable
    public final Object sendNotification(@NotNull PushMessage pushMessage0, @NotNull Continuation continuation0) {
        int v = UUID.randomUUID().hashCode();
        String s = pushMessage0.getLink();
        if(s == null) {
            s = "";
        }
        if(p.isBlank(s)) {
            s = "tistoryapp://notification";
        }
        Unit unit0 = null;
        String s1 = Intrinsics.areEqual(pushMessage0.getGroupType(), "entry") ? "35" : null;
        if(s1 == null) {
            switch(WhenMappings.$EnumSwitchMapping$0[RedirectUtils.createRedirectData$default(RedirectUtils.INSTANCE, s, false, 2, null).getType().ordinal()]) {
                case 1: {
                    s1 = "4";
                    break;
                }
                case 2: {
                    s1 = "3";
                    break;
                }
                case 3: 
                case 4: {
                    s1 = "1";
                    break;
                }
                case 5: {
                    s1 = "2";
                    break;
                }
                default: {
                    s1 = "1";
                }
            }
        }
        Logger.INSTANCE.log("sendPush() : notificationId=" + v + ", url=" + s + " channelId=" + s1);
        Builder notificationCompat$Builder0 = new Builder(this.b, s1);
        Intent intent0 = new Intent(this.b, SplashActivity.class);
        intent0.setData(Uri.parse(s));
        intent0.putExtra("EXTRA_READ_NOTIFICATION_ID", pushMessage0.getId());
        PendingIntent pendingIntent0 = PendingIntent.getActivity(this.b, v, intent0, 0x44000000);
        Intrinsics.checkNotNullExpressionValue(pendingIntent0, "getActivity(...)");
        notificationCompat$Builder0.setAutoCancel(true);
        notificationCompat$Builder0.setSmallIcon(drawable.ic_stat_notify);
        notificationCompat$Builder0.setContentTitle(pushMessage0.getTitle());
        notificationCompat$Builder0.setContentText(pushMessage0.getBody());
        notificationCompat$Builder0.setContentIntent(pendingIntent0);
        notificationCompat$Builder0.setColor(ContextCompat.getColor(this.b, color.black));
        String s2 = pushMessage0.getLargeIcon();
        if(s2 != null) {
            if(p.isBlank(s2)) {
                s2 = null;
            }
            if(s2 != null) {
                a a0 = new a(notificationCompat$Builder0, this, v);
                b b0 = new b(this, v, notificationCompat$Builder0);
                GlideLoaderKt.loadBitmap(this.b, s2, GlideRequestOptions.INSTANCE.getUSER_PROFILE_NO_BORDER(), a0, b0);
                unit0 = Unit.INSTANCE;
            }
        }
        if(unit0 == null) {
            Object object0 = this.b.getSystemService("notification");
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager)object0).notify(v, notificationCompat$Builder0.build());
        }
        Object object1 = this.a.getNotificationNewCount(continuation0);
        return object1 == qd.a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }
}

