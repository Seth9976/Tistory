package com.kakao.tistory.presentation.common.push;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes.Builder;
import android.media.RingtoneManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.CrashlyticsUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000B2\u00020\u0001:\u0003\f\r\u000BB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001A\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/presentation/common/push/PushChannelBuilder;", "", "Landroid/content/Context;", "context", "Lcom/kakao/tistory/data/preference/DeviceInfoPreference;", "deviceInfoPreference", "<init>", "(Landroid/content/Context;Lcom/kakao/tistory/data/preference/DeviceInfoPreference;)V", "", "initialize", "()V", "Companion", "Channel", "ChannelGroup", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PushChannelBuilder {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0017\u0010\u0013\u001A\u00020\u000E8\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001A\u0004\b\u0015\u0010\fj\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001A¨\u0006\u001B"}, d2 = {"Lcom/kakao/tistory/presentation/common/push/PushChannelBuilder$Channel;", "", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "", "b", "I", "getTitleStringResourceId", "()I", "titleStringResourceId", "Lcom/kakao/tistory/presentation/common/push/PushChannelBuilder$ChannelGroup;", "c", "Lcom/kakao/tistory/presentation/common/push/PushChannelBuilder$ChannelGroup;", "getChannelGroup", "()Lcom/kakao/tistory/presentation/common/push/PushChannelBuilder$ChannelGroup;", "channelGroup", "importance", "getImportance", "COMMENT", "SUBSCRIBE", "INVITATION", "NEW_ENTRY", "NOTICE", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum Channel {
        COMMENT("1", string.label_push_channel_comment, ChannelGroup.DEFAULT),
        SUBSCRIBE("2", string.label_push_channel_subscribe, ChannelGroup.DEFAULT),
        INVITATION("3", string.label_push_channel_invitation, ChannelGroup.DEFAULT),
        NEW_ENTRY("35", string.label_push_channel_new_entry, ChannelGroup.DEFAULT),
        NOTICE("4", string.label_push_channel_notice, ChannelGroup.DEFAULT);

        public final String a;
        public final int b;
        public final ChannelGroup c;
        public static final Channel[] d;
        public static final EnumEntries e;

        static {
            Channel.d = arr_pushChannelBuilder$Channel;
            Intrinsics.checkNotNullParameter(arr_pushChannelBuilder$Channel, "entries");
            Channel.e = new a(arr_pushChannelBuilder$Channel);
        }

        public Channel(String s1, int v1, ChannelGroup pushChannelBuilder$ChannelGroup0) {
            this.a = s1;
            this.b = v1;
            this.c = pushChannelBuilder$ChannelGroup0;
        }

        @NotNull
        public final ChannelGroup getChannelGroup() {
            return this.c;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return Channel.e;
        }

        @NotNull
        public final String getId() {
            return this.a;
        }

        public final int getImportance() [...] // 潜在的解密器

        public final int getTitleStringResourceId() {
            return this.b;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fj\u0002\b\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/presentation/common/push/PushChannelBuilder$ChannelGroup;", "", "", "a", "I", "getTitleStringResourceId", "()I", "titleStringResourceId", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "DEFAULT", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChannelGroup extends Enum {
        public static final enum ChannelGroup DEFAULT;
        public final int a;
        public static final ChannelGroup[] b;
        public static final EnumEntries c;

        static {
            ChannelGroup.DEFAULT = new ChannelGroup(string.label_push_channel_group_default);
            ChannelGroup[] arr_pushChannelBuilder$ChannelGroup = {ChannelGroup.DEFAULT};
            ChannelGroup.b = arr_pushChannelBuilder$ChannelGroup;
            Intrinsics.checkNotNullParameter(arr_pushChannelBuilder$ChannelGroup, "entries");
            ChannelGroup.c = new a(arr_pushChannelBuilder$ChannelGroup);
        }

        public ChannelGroup(int v) {
            super("DEFAULT", 0);
            this.a = v;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return ChannelGroup.c;
        }

        @NotNull
        public final String getId() [...] // 潜在的解密器

        public final int getTitleStringResourceId() {
            return this.a;
        }

        public static ChannelGroup valueOf(String s) {
            return (ChannelGroup)Enum.valueOf(ChannelGroup.class, s);
        }

        public static ChannelGroup[] values() {
            return (ChannelGroup[])ChannelGroup.b.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/common/push/PushChannelBuilder$Companion;", "", "", "PUSH_CHANNEL_VERSION", "I", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final Context a;
    public final DeviceInfoPreference b;

    static {
        PushChannelBuilder.Companion = new Companion(null);
        PushChannelBuilder.$stable = 8;
    }

    @Inject
    public PushChannelBuilder(@NotNull Context context0, @NotNull DeviceInfoPreference deviceInfoPreference0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(deviceInfoPreference0, "deviceInfoPreference");
        super();
        this.a = context0;
        this.b = deviceInfoPreference0;
    }

    public final void initialize() {
        if(this.b.getPushChannelVersion() < 3) {
            Object object0 = this.a.getSystemService("notification");
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.app.NotificationManager");
            for(Object object1: ((NotificationManager)object0).getNotificationChannels()) {
                NotificationChannel notificationChannel0 = (NotificationChannel)object1;
                try {
                    Object object2 = this.a.getSystemService("notification");
                    Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type android.app.NotificationManager");
                    ((NotificationManager)object2).deleteNotificationChannel(notificationChannel0.getId());
                }
                catch(Exception exception0) {
                    CrashlyticsUtils.INSTANCE.logException(exception0);
                }
            }
            for(Object object3: ChannelGroup.getEntries()) {
                Object object4 = this.a.getSystemService("notification");
                Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type android.app.NotificationManager");
                int v = ((ChannelGroup)object3).getTitleStringResourceId();
                ((NotificationManager)object4).createNotificationChannelGroup(new NotificationChannelGroup("1", this.a.getString(v)));
            }
            for(Object object5: Channel.getEntries()) {
                Object object6 = this.a.getSystemService("notification");
                Intrinsics.checkNotNull(object6, "null cannot be cast to non-null type android.app.NotificationManager");
                String s = ((Channel)object5).getId();
                int v1 = ((Channel)object5).getTitleStringResourceId();
                NotificationChannel notificationChannel1 = new NotificationChannel(s, this.a.getString(v1), 3);
                notificationChannel1.setGroup("1");
                notificationChannel1.setLockscreenVisibility(1);
                notificationChannel1.setLightColor(ContextCompat.getColor(this.a, color.point1));
                notificationChannel1.enableLights(this.b.getPushEnabled());
                notificationChannel1.setVibrationPattern(new long[]{100L, 1000L, 0L, 0L});
                notificationChannel1.enableVibration(this.b.getPushEnabled());
                if(this.b.getPushEnabled()) {
                    notificationChannel1.setSound(RingtoneManager.getDefaultUri(2), new AudioAttributes.Builder().setContentType(0).setUsage(5).build());
                }
                ((NotificationManager)object6).createNotificationChannel(notificationChannel1);
            }
            this.b.setPushChannelVersion(3);
        }
    }
}

