package com.kakao.tistory.data.preference;

import android.content.Context;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0013\u0018\u0000 02\u00020\u0001:\u00010B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001A\u0010\u000E\u001A\u00020\t8\u0014X\u0094D¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR.\u0010\u0014\u001A\u0004\u0018\u00010\t2\b\u0010\u000F\u001A\u0004\u0018\u00010\t8F@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0010\u0010\u000B\u001A\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0013R$\u0010\u0017\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\t8F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0013R$\u0010\u001D\u001A\u00020\u00182\u0006\u0010\u000F\u001A\u00020\u00188F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001CR$\u0010#\u001A\u00020\u001E2\u0006\u0010\u000F\u001A\u00020\u001E8F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"R$\u0010&\u001A\u00020\u001E2\u0006\u0010\u000F\u001A\u00020\u001E8F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b$\u0010 \"\u0004\b%\u0010\"R(\u0010)\u001A\u0004\u0018\u00010\t2\b\u0010\u000F\u001A\u0004\u0018\u00010\t8F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\'\u0010\r\"\u0004\b(\u0010\u0013R(\u0010,\u001A\u0004\u0018\u00010\t2\b\u0010\u000F\u001A\u0004\u0018\u00010\t8F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b*\u0010\r\"\u0004\b+\u0010\u0013R(\u0010/\u001A\u0004\u0018\u00010\t2\b\u0010\u000F\u001A\u0004\u0018\u00010\t8F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b-\u0010\r\"\u0004\b.\u0010\u0013¨\u00061"}, d2 = {"Lcom/kakao/tistory/data/preference/DeviceInfoPreference;", "Lcom/kakao/tistory/data/preference/BasePreference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "clearAll", "()V", "", "b", "Ljava/lang/String;", "getPREFERENCE_NAME", "()Ljava/lang/String;", "PREFERENCE_NAME", "value", "c", "getFcmToken", "setFcmToken", "(Ljava/lang/String;)V", "fcmToken", "getGuid", "setGuid", "guid", "", "getPushChannelVersion", "()I", "setPushChannelVersion", "(I)V", "pushChannelVersion", "", "getPushEnabled", "()Z", "setPushEnabled", "(Z)V", "pushEnabled", "getPushEtiquetteEnabled", "setPushEtiquetteEnabled", "pushEtiquetteEnabled", "getPushEtiquetteStartTime", "setPushEtiquetteStartTime", "pushEtiquetteStartTime", "getPushEtiquetteFinishTime", "setPushEtiquetteFinishTime", "pushEtiquetteFinishTime", "getDeveloperServerHost", "setDeveloperServerHost", "developerServerHost", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDeviceInfoPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoPreference.kt\ncom/kakao/tistory/data/preference/DeviceInfoPreference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"})
public final class DeviceInfoPreference extends BasePreference {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000B\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000B\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/data/preference/DeviceInfoPreference$Companion;", "", "", "PROPERTY_DEVELOPER_SERVER_HOST", "Ljava/lang/String;", "PROPERTY_FCM_TOKEN", "PROPERTY_GUID", "PROPERTY_PUSH_CHANNEL_VERSION", "PROPERTY_PUSH_ENABLED", "PROPERTY_PUSH_ETIQUETTE_ENABLED", "PROPERTY_PUSH_ETIQUETTE_END_TIME", "PROPERTY_PUSH_ETIQUETTE_START_TIME", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final String b;
    public String c;

    static {
        DeviceInfoPreference.Companion = new Companion(null);
    }

    @Inject
    public DeviceInfoPreference(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        this.b = "SETTING_PREPERENCE_DEVICE_INFO";
    }

    @Override  // com.kakao.tistory.data.preference.BasePreference
    public void clearAll() {
        this.remove("PROPERTY_GUID");
        this.remove("PROPERTY_FCM_TOKEN");
        this.remove("PROPERTY_PUSH_CHANNEL_VERSION");
        this.remove("PROPERTY_PUSH_ENABLED");
        this.remove("PROPERTY_PUSH_ETIQUETTE_ENABLED");
        this.remove("PROPERTY_PUSH_ETIQUETTE_START_TIME");
        this.remove("PROPERTY_PUSH_ETIQUETTE_END_TIME");
        this.remove("PROPERTY_DEVELOPER_SERVER_HOST");
    }

    @Nullable
    public final String getDeveloperServerHost() {
        return BasePreference.getString$default(this, "PROPERTY_DEVELOPER_SERVER_HOST", null, 2, null);
    }

    @Nullable
    public final String getFcmToken() {
        return this.c == null ? BasePreference.getString$default(this, "PROPERTY_FCM_TOKEN", null, 2, null) : this.c;
    }

    @NotNull
    public final String getGuid() {
        String s = BasePreference.getString$default(this, "PROPERTY_GUID", null, 2, null);
        if(s == null) {
            s = "dc45d265-7e22-45ed-8f20-90d6ff130596";
            Intrinsics.checkNotNullExpressionValue("dc45d265-7e22-45ed-8f20-90d6ff130596", "toString(...)");
            this.putString("PROPERTY_GUID", "dc45d265-7e22-45ed-8f20-90d6ff130596");
        }
        return s;
    }

    @Override  // com.kakao.tistory.data.preference.BasePreference
    @NotNull
    public String getPREFERENCE_NAME() {
        return this.b;
    }

    public final int getPushChannelVersion() {
        return this.getInt("PROPERTY_PUSH_CHANNEL_VERSION", 0);
    }

    public final boolean getPushEnabled() {
        return this.getBoolean("PROPERTY_PUSH_ENABLED", true);
    }

    public final boolean getPushEtiquetteEnabled() {
        return this.getBoolean("PROPERTY_PUSH_ETIQUETTE_ENABLED", false);
    }

    @Nullable
    public final String getPushEtiquetteFinishTime() {
        return this.getString("PROPERTY_PUSH_ETIQUETTE_END_TIME", null);
    }

    @Nullable
    public final String getPushEtiquetteStartTime() {
        return this.getString("PROPERTY_PUSH_ETIQUETTE_START_TIME", null);
    }

    public final void setDeveloperServerHost(@Nullable String s) {
        this.putString("PROPERTY_DEVELOPER_SERVER_HOST", s);
    }

    public final void setFcmToken(@Nullable String s) {
        this.c = s;
        this.putString("PROPERTY_FCM_TOKEN", s);
    }

    public final void setGuid(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.putString("PROPERTY_GUID", s);
    }

    public final void setPushChannelVersion(int v) {
        this.putInt("PROPERTY_PUSH_CHANNEL_VERSION", v);
    }

    public final void setPushEnabled(boolean z) {
        this.putBoolean("PROPERTY_PUSH_ENABLED", z);
    }

    public final void setPushEtiquetteEnabled(boolean z) {
        this.putBoolean("PROPERTY_PUSH_ETIQUETTE_ENABLED", z);
    }

    public final void setPushEtiquetteFinishTime(@Nullable String s) {
        this.putString("PROPERTY_PUSH_ETIQUETTE_END_TIME", s);
    }

    public final void setPushEtiquetteStartTime(@Nullable String s) {
        this.putString("PROPERTY_PUSH_ETIQUETTE_START_TIME", s);
    }
}

