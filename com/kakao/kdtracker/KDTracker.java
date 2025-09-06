package com.kakao.kdtracker;

import android.content.Context;
import android.webkit.URLUtil;
import androidx.compose.material3.g1;
import com.kakao.editortracker.KeditorTracker;
import gb.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001J5\u0010\n\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0004¢\u0006\u0004\b\n\u0010\u000BJ\u001D\u0010\u000F\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0011\u001A\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0017\u001A\u00020\t2\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/kakao/kdtracker/KDTracker;", "", "", "isDebugMode", "", "serviceKey", "serviceDomain", "serviceVersionName", "versionName", "", "registerApplicationInfo", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "serviceReferrer", "register", "(Landroid/content/Context;Ljava/lang/String;)V", "unRegister", "()V", "layer1", "layer2", "layer3", "command", "clickEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "kdtracker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class KDTracker {
    @NotNull
    public static final KDTracker INSTANCE = null;
    public static KeditorTracker a = null;
    public static boolean b = false;
    public static String c = "";
    public static String d = "";
    public static String e = "";
    public static String f = "";

    static {
        KDTracker.INSTANCE = new KDTracker();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    // 去混淆评级： 低(20)
    public static final String access$getVersionName$p() [...] // 潜在的解密器

    public static final boolean access$isDebugMode$p() [...] // 潜在的解密器

    public final void clickEvent(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3) {
        KeditorTracker keditorTracker0 = KDTracker.a;
        if(keditorTracker0 != null) {
            keditorTracker0.click(new g1(3, s, s1, s2, s3));
        }
    }

    public static void clickEvent$default(KDTracker kDTracker0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            s2 = null;
        }
        if((v & 8) != 0) {
            s3 = null;
        }
        kDTracker0.clickEvent(s, s1, s2, s3);
    }

    public final void register(@NotNull Context context0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(s, "serviceReferrer");
        if(!URLUtil.isValidUrl(s)) {
            s = "";
        }
        KDTracker.a = new KeditorTracker(context0, "", "", s, "", a.w);
    }

    public final void registerApplicationInfo(boolean z, @NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
        Intrinsics.checkNotNullParameter(s, "serviceKey");
        Intrinsics.checkNotNullParameter(s1, "serviceDomain");
        Intrinsics.checkNotNullParameter(s2, "serviceVersionName");
        Intrinsics.checkNotNullParameter(s3, "versionName");
        KDTracker.b = z;
        KDTracker.c = s;
        KDTracker.d = s1;
        KDTracker.e = s2;
        KDTracker.f = s3;
    }

    public final void unRegister() {
        KDTracker.a = null;
    }
}

