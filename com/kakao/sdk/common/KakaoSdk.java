package com.kakao.sdk.common;

import android.content.Context;
import com.kakao.sdk.common.model.ApplicationContextInfo;
import com.kakao.sdk.common.model.ServerHosts;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\'J3\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\bH\u0007¢\u0006\u0004\b\u000B\u0010\fJ;\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\rH\u0007¢\u0006\u0004\b\u000B\u0010\u000FR\"\u0010\u0011\u001A\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\t\u001A\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR\"\u0010\u0007\u001A\u00020\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!R\"\u0010\u000E\u001A\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000E\u0010\"\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/kakao/sdk/common/KakaoSdk;", "", "Landroid/content/Context;", "context", "", "appKey", "", "loggingEnabled", "Lcom/kakao/sdk/common/model/ServerHosts;", "hosts", "", "init", "(Landroid/content/Context;Ljava/lang/String;ZLcom/kakao/sdk/common/model/ServerHosts;)V", "Lcom/kakao/sdk/common/KakaoSdk$Type;", "type", "(Landroid/content/Context;Ljava/lang/String;ZLcom/kakao/sdk/common/model/ServerHosts;Lcom/kakao/sdk/common/KakaoSdk$Type;)V", "Lcom/kakao/sdk/common/model/ApplicationContextInfo;", "applicationContextInfo", "Lcom/kakao/sdk/common/model/ApplicationContextInfo;", "getApplicationContextInfo", "()Lcom/kakao/sdk/common/model/ApplicationContextInfo;", "setApplicationContextInfo", "(Lcom/kakao/sdk/common/model/ApplicationContextInfo;)V", "Lcom/kakao/sdk/common/model/ServerHosts;", "getHosts", "()Lcom/kakao/sdk/common/model/ServerHosts;", "setHosts", "(Lcom/kakao/sdk/common/model/ServerHosts;)V", "a", "Z", "getLoggingEnabled", "()Z", "setLoggingEnabled", "(Z)V", "Lcom/kakao/sdk/common/KakaoSdk$Type;", "getType", "()Lcom/kakao/sdk/common/KakaoSdk$Type;", "setType", "(Lcom/kakao/sdk/common/KakaoSdk$Type;)V", "Type", "common_release"}, k = 1, mv = {1, 4, 0})
public final class KakaoSdk {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/kakao/sdk/common/KakaoSdk$Type;", "", "KOTLIN", "RX_KOTLIN", "common_release"}, k = 1, mv = {1, 4, 0})
    public static enum Type {
        KOTLIN,
        RX_KOTLIN;

    }

    public static final KakaoSdk INSTANCE;
    public static boolean a;
    @NotNull
    public static ApplicationContextInfo applicationContextInfo;
    @NotNull
    public static ServerHosts hosts;
    @NotNull
    public static Type type;

    static {
        KakaoSdk.INSTANCE = new KakaoSdk();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final ApplicationContextInfo getApplicationContextInfo() {
        ApplicationContextInfo applicationContextInfo0 = KakaoSdk.applicationContextInfo;
        if(applicationContextInfo0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContextInfo");
        }
        return applicationContextInfo0;
    }

    @NotNull
    public final ServerHosts getHosts() {
        ServerHosts serverHosts0 = KakaoSdk.hosts;
        if(serverHosts0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hosts");
        }
        return serverHosts0;
    }

    public final boolean getLoggingEnabled() [...] // 潜在的解密器

    @NotNull
    public final Type getType() {
        Type kakaoSdk$Type0 = KakaoSdk.type;
        if(kakaoSdk$Type0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
        }
        return kakaoSdk$Type0;
    }

    @JvmOverloads
    @JvmStatic
    public static final void init(@NotNull Context context0, @NotNull String s) {
        KakaoSdk.init$default(context0, s, false, null, 12, null);
    }

    @JvmOverloads
    @JvmStatic
    public static final void init(@NotNull Context context0, @NotNull String s, boolean z) {
        KakaoSdk.init$default(context0, s, z, null, 8, null);
    }

    @JvmOverloads
    @JvmStatic
    public static final void init(@NotNull Context context0, @NotNull String s, boolean z, @NotNull ServerHosts serverHosts0) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Intrinsics.checkParameterIsNotNull(s, "appKey");
        Intrinsics.checkParameterIsNotNull(serverHosts0, "hosts");
        KakaoSdk.INSTANCE.init(context0, s, z, serverHosts0, Type.KOTLIN);
    }

    @JvmOverloads
    public final void init(@NotNull Context context0, @NotNull String s, @NotNull Type kakaoSdk$Type0) {
        KakaoSdk.init$default(this, context0, s, false, null, kakaoSdk$Type0, 12, null);
    }

    @JvmOverloads
    public final void init(@NotNull Context context0, @NotNull String s, boolean z, @NotNull Type kakaoSdk$Type0) {
        KakaoSdk.init$default(this, context0, s, z, null, kakaoSdk$Type0, 8, null);
    }

    @JvmOverloads
    public final void init(@NotNull Context context0, @NotNull String s, boolean z, @NotNull ServerHosts serverHosts0, @NotNull Type kakaoSdk$Type0) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Intrinsics.checkParameterIsNotNull(s, "appKey");
        Intrinsics.checkParameterIsNotNull(serverHosts0, "hosts");
        Intrinsics.checkParameterIsNotNull(kakaoSdk$Type0, "type");
        KakaoSdk.hosts = serverHosts0;
        KakaoSdk.a = z;
        KakaoSdk.type = kakaoSdk$Type0;
        KakaoSdk.applicationContextInfo = new ApplicationContextInfo(context0, s, kakaoSdk$Type0);
    }

    public static void init$default(Context context0, String s, boolean z, ServerHosts serverHosts0, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        if((v & 8) != 0) {
            serverHosts0 = new ServerHosts();
        }
        KakaoSdk.init(context0, s, z, serverHosts0);
    }

    public static void init$default(KakaoSdk kakaoSdk0, Context context0, String s, boolean z, ServerHosts serverHosts0, Type kakaoSdk$Type0, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        if((v & 8) != 0) {
            serverHosts0 = new ServerHosts();
        }
        kakaoSdk0.init(context0, s, z, serverHosts0, kakaoSdk$Type0);
    }

    public final void setApplicationContextInfo(@NotNull ApplicationContextInfo applicationContextInfo0) {
        Intrinsics.checkParameterIsNotNull(applicationContextInfo0, "<set-?>");
        KakaoSdk.applicationContextInfo = applicationContextInfo0;
    }

    public final void setHosts(@NotNull ServerHosts serverHosts0) {
        Intrinsics.checkParameterIsNotNull(serverHosts0, "<set-?>");
        KakaoSdk.hosts = serverHosts0;
    }

    public final void setLoggingEnabled(boolean z) {
        KakaoSdk.a = z;
    }

    public final void setType(@NotNull Type kakaoSdk$Type0) {
        Intrinsics.checkParameterIsNotNull(kakaoSdk$Type0, "<set-?>");
        KakaoSdk.type = kakaoSdk$Type0;
    }
}

