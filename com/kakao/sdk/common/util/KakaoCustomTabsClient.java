package com.kakao.sdk.common.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent.Builder;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\n\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/sdk/common/util/KakaoCustomTabsClient;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "Landroid/content/ServiceConnection;", "openWithDefault", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/ServiceConnection;", "", "open", "(Landroid/content/Context;Landroid/net/Uri;)V", "common_release"}, k = 1, mv = {1, 4, 0})
public final class KakaoCustomTabsClient {
    public static final KakaoCustomTabsClient INSTANCE;
    public static final String[] a;

    static {
        KakaoCustomTabsClient.INSTANCE = new KakaoCustomTabsClient();  // 初始化器: Ljava/lang/Object;-><init>()V
        KakaoCustomTabsClient.a = new String[]{"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    }

    public final void open(@NotNull Context context0, @NotNull Uri uri0) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Intrinsics.checkParameterIsNotNull(uri0, "uri");
        new Builder().enableUrlBarHiding().setShowTitle(true).build().launchUrl(context0, uri0);
    }

    @Nullable
    public final ServiceConnection openWithDefault(@NotNull Context context0, @NotNull Uri uri0) throws UnsupportedOperationException {
        String s4;
        String s = null;
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Intrinsics.checkParameterIsNotNull(uri0, "uri");
        Intent intent0 = new Intent("android.intent.action.VIEW", uri0);
        ResolveInfo resolveInfo0 = context0.getPackageManager().resolveActivity(intent0, 0x10000);
        Intent intent1 = new Intent().setAction("android.support.customtabs.action.CustomTabsService");
        Intrinsics.checkExpressionValueIsNotNull(intent1, "Intent().setAction(Custo…N_CUSTOM_TABS_CONNECTION)");
        List list0 = context0.getPackageManager().queryIntentServices(intent1, 0);
        Intrinsics.checkExpressionValueIsNotNull(list0, "context.packageManager.q…ervices(serviceIntent, 0)");
        String s1 = null;
        for(Object object0: list0) {
            ResolveInfo resolveInfo1 = (ResolveInfo)object0;
            if(s1 == null) {
                String s2 = resolveInfo1.serviceInfo.packageName;
                Intrinsics.checkExpressionValueIsNotNull(s2, "info.serviceInfo.packageName");
                if(ArraysKt___ArraysKt.contains(KakaoCustomTabsClient.a, s2)) {
                    s1 = resolveInfo1.serviceInfo.packageName;
                }
            }
            String s3 = resolveInfo1.serviceInfo.packageName;
            if(resolveInfo0 == null) {
                s4 = null;
            }
            else {
                ActivityInfo activityInfo0 = resolveInfo0.activityInfo;
                if(activityInfo0 != null) {
                    s4 = activityInfo0.packageName;
                }
            }
            if(Intrinsics.areEqual(s3, s4)) {
                if(resolveInfo0 == null) {
                    break;
                }
                ActivityInfo activityInfo1 = resolveInfo0.activityInfo;
                if(activityInfo1 == null) {
                    break;
                }
                s = activityInfo1.packageName;
                break;
            }
        }
        if(s == null && s1 != null) {
            s = s1;
        }
        if(s == null) {
            throw new UnsupportedOperationException();
        }
        SdkLog.Companion.d("Choosing " + s + " as custom tabs browser");
        com.kakao.sdk.common.util.KakaoCustomTabsClient.openWithDefault.connection.1 kakaoCustomTabsClient$openWithDefault$connection$10 = new CustomTabsServiceConnection() {
            @Override  // androidx.browser.customtabs.CustomTabsServiceConnection
            public void onCustomTabsServiceConnected(@Nullable ComponentName componentName0, @Nullable CustomTabsClient customTabsClient0) {
                CustomTabsIntent customTabsIntent0 = new Builder().enableUrlBarHiding().setShowTitle(true).build();
                Intrinsics.checkExpressionValueIsNotNull(customTabsIntent0.intent, "customTabsIntent.intent");
                customTabsIntent0.intent.setData(s);
                customTabsIntent0.intent.setPackage(this.b);
                uri0.startActivity(customTabsIntent0.intent);
            }

            @Override  // android.content.ServiceConnection
            public void onServiceDisconnected(@Nullable ComponentName componentName0) {
                SdkLog.Companion.d("onServiceDisconnected: " + componentName0);
            }
        };
        return CustomTabsClient.bindCustomTabsService(context0, s, kakaoCustomTabsClient$openWithDefault$connection$10) ? kakaoCustomTabsClient$openWithDefault$connection$10 : null;
    }
}

