package com.kakao.tistory.presentation.common.push;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.messaging.RemoteMessage.Notification;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.Gson;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.domain.entity.push.PushMessage;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.utils.CrashlyticsUtils;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Calendar;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003R\"\u0010\u000F\u001A\u00020\u000E8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001A\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"Lcom/kakao/tistory/presentation/common/push/PushMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "", "token", "", "onNewToken", "(Ljava/lang/String;)V", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "onMessageReceived", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "onDestroy", "Lcom/kakao/tistory/presentation/common/push/PushMessageBuilder;", "pushMessageBuilder", "Lcom/kakao/tistory/presentation/common/push/PushMessageBuilder;", "getPushMessageBuilder", "()Lcom/kakao/tistory/presentation/common/push/PushMessageBuilder;", "setPushMessageBuilder", "(Lcom/kakao/tistory/presentation/common/push/PushMessageBuilder;)V", "Lcom/kakao/tistory/data/preference/DeviceInfoPreference;", "deviceInfoPreference", "Lcom/kakao/tistory/data/preference/DeviceInfoPreference;", "getDeviceInfoPreference", "()Lcom/kakao/tistory/data/preference/DeviceInfoPreference;", "setDeviceInfoPreference", "(Lcom/kakao/tistory/data/preference/DeviceInfoPreference;)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPushMessagingService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushMessagingService.kt\ncom/kakao/tistory/presentation/common/push/PushMessagingService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
public final class PushMessagingService extends Hilt_PushMessagingService {
    public static final int $stable = 8;
    public final CompletableJob d;
    @Inject
    public DeviceInfoPreference deviceInfoPreference;
    @Inject
    public PushMessageBuilder pushMessageBuilder;

    public PushMessagingService() {
        this.d = JobKt.Job$default(null, 1, null);
    }

    public final boolean a() {
        Logger logger0 = Logger.INSTANCE;
        logger0.log("checkPushEnabled() : pushEnabled=" + this.getDeviceInfoPreference().getPushEnabled() + ", pushEtiquetteEnabled=" + this.getDeviceInfoPreference().getPushEtiquetteEnabled());
        if(!this.getDeviceInfoPreference().getPushEnabled()) {
            return false;
        }
        if(this.getDeviceInfoPreference().getPushEtiquetteEnabled()) {
            return false;
        }
        String s = this.getDeviceInfoPreference().getPushEtiquetteStartTime();
        int v = s == null ? 0 : Integer.parseInt(s);
        String s1 = this.getDeviceInfoPreference().getPushEtiquetteFinishTime();
        int v1 = s1 == null ? 0 : Integer.parseInt(s1);
        logger0.log("checkPushEnabled() : etiquetteStartTime=" + v + ", etiquetteFinishTime=" + v1);
        if(v == 0 && v1 == 0) {
            return true;
        }
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTimeInMillis(System.currentTimeMillis());
        int v2 = calendar0.get(11) * 100 + calendar0.get(12);
        StringBuilder stringBuilder0 = q.u("checkPushEnabled() : currentTime=", v2, ", etiquetteStartTime=", v, ", etiquetteFinishTime=");
        stringBuilder0.append(v1);
        logger0.log(stringBuilder0.toString());
        return v > v1 ? (v > v2 || v2 >= 23) && (v2 < 0 || v2 >= v1) : v > v2 || v2 >= v1;
    }

    @NotNull
    public final DeviceInfoPreference getDeviceInfoPreference() {
        DeviceInfoPreference deviceInfoPreference0 = this.deviceInfoPreference;
        if(deviceInfoPreference0 != null) {
            return deviceInfoPreference0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceInfoPreference");
        return null;
    }

    @NotNull
    public final PushMessageBuilder getPushMessageBuilder() {
        PushMessageBuilder pushMessageBuilder0 = this.pushMessageBuilder;
        if(pushMessageBuilder0 != null) {
            return pushMessageBuilder0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pushMessageBuilder");
        return null;
    }

    @Override  // com.google.firebase.messaging.EnhancedIntentService
    public void onDestroy() {
        DefaultImpls.cancel$default(this.d, null, 1, null);
        super.onDestroy();
    }

    @Override  // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NotNull RemoteMessage remoteMessage0) {
        Intrinsics.checkNotNullParameter(remoteMessage0, "remoteMessage");
        Logger logger0 = Logger.INSTANCE;
        Notification remoteMessage$Notification0 = remoteMessage0.getNotification();
        Notification remoteMessage$Notification1 = remoteMessage0.getNotification();
        Notification remoteMessage$Notification2 = remoteMessage0.getNotification();
        StringBuilder stringBuilder0 = b.w("onMessageReceived() : notification=", (remoteMessage$Notification0 == null ? null : remoteMessage$Notification0.getTitle()), ", ", (remoteMessage$Notification1 == null ? null : remoteMessage$Notification1.getBody()), ", ");
        stringBuilder0.append((remoteMessage$Notification2 == null ? null : remoteMessage$Notification2.getSound()));
        logger0.log(stringBuilder0.toString());
        logger0.log("onMessageReceived() : data=" + remoteMessage0.getData());
        if(this.a()) {
            logger0.log("onMessageReceived() : PushEnable=true");
            Map map0 = remoteMessage0.getData();
            Intrinsics.checkNotNull(map0);
            if(map0.isEmpty()) {
                map0 = null;
            }
            if(map0 == null) {
                logger0.log("onMessageReceived() : RemoteMessage empty");
                CrashlyticsUtils.INSTANCE.logMessage("onMessageReceived() : RemoteMessage empty");
                return;
            }
            PushMessage pushMessage0 = (PushMessage)new Gson().fromJson(new JSONObject(map0).toString(), PushMessage.class);
            Notification remoteMessage$Notification3 = remoteMessage0.getNotification();
            pushMessage0.setTitle((remoteMessage$Notification3 == null ? null : remoteMessage$Notification3.getTitle()));
            Notification remoteMessage$Notification4 = remoteMessage0.getNotification();
            pushMessage0.setBody((remoteMessage$Notification4 == null ? null : remoteMessage$Notification4.getBody()));
            Notification remoteMessage$Notification5 = remoteMessage0.getNotification();
            pushMessage0.setSound((remoteMessage$Notification5 == null ? null : remoteMessage$Notification5.getSound()));
            if(BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(this.d), null, null, new c(this, pushMessage0, null), 3, null) == null) {
                logger0.log("onMessageReceived() : RemoteMessage empty");
                CrashlyticsUtils.INSTANCE.logMessage("onMessageReceived() : RemoteMessage empty");
            }
        }
        else {
            logger0.log("onMessageReceived() : PushEnable=false");
        }
    }

    @Override  // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "token");
        super.onNewToken(s);
        Logger.INSTANCE.log("onNewToken() : " + s);
        this.getDeviceInfoPreference().setFcmToken(s);
    }

    public final void setDeviceInfoPreference(@NotNull DeviceInfoPreference deviceInfoPreference0) {
        Intrinsics.checkNotNullParameter(deviceInfoPreference0, "<set-?>");
        this.deviceInfoPreference = deviceInfoPreference0;
    }

    public final void setPushMessageBuilder(@NotNull PushMessageBuilder pushMessageBuilder0) {
        Intrinsics.checkNotNullParameter(pushMessageBuilder0, "<set-?>");
        this.pushMessageBuilder = pushMessageBuilder0;
    }
}

