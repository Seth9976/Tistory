package com.kakao.sdk.common;

import android.content.Context;
import com.kakao.sdk.common.model.ServerHosts;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J3\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\bH\u0007¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/sdk/common/RxKakaoSdk;", "", "Landroid/content/Context;", "context", "", "appKey", "", "loggingEnabled", "Lcom/kakao/sdk/common/model/ServerHosts;", "hosts", "", "init", "(Landroid/content/Context;Ljava/lang/String;ZLcom/kakao/sdk/common/model/ServerHosts;)V", "common-rx_release"}, k = 1, mv = {1, 4, 0})
public final class RxKakaoSdk {
    public static final RxKakaoSdk INSTANCE;

    static {
        RxKakaoSdk.INSTANCE = new RxKakaoSdk();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @JvmOverloads
    @JvmStatic
    public static final void init(@NotNull Context context0, @NotNull String s) {
        RxKakaoSdk.init$default(context0, s, false, null, 12, null);
    }

    @JvmOverloads
    @JvmStatic
    public static final void init(@NotNull Context context0, @NotNull String s, boolean z) {
        RxKakaoSdk.init$default(context0, s, z, null, 8, null);
    }

    @JvmOverloads
    @JvmStatic
    public static final void init(@NotNull Context context0, @NotNull String s, boolean z, @NotNull ServerHosts serverHosts0) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Intrinsics.checkParameterIsNotNull(s, "appKey");
        Intrinsics.checkParameterIsNotNull(serverHosts0, "hosts");
        KakaoSdk.INSTANCE.init(context0, s, z, serverHosts0, Type.RX_KOTLIN);
    }

    public static void init$default(Context context0, String s, boolean z, ServerHosts serverHosts0, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        if((v & 8) != 0) {
            serverHosts0 = new ServerHosts();
        }
        RxKakaoSdk.init(context0, s, z, serverHosts0);
    }
}

