package com.kakao.sdk.common.model;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.JsonObject;
import com.kakao.sdk.common.KakaoSdk.Type;
import com.kakao.sdk.common.util.Utility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u001D\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\b¢\u0006\u0002\u0010\tR\u0014\u0010\u0005\u001A\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000BR\u0014\u0010\f\u001A\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000BR\u0011\u0010\u000E\u001A\u00020\u00048F¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0011\u001A\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001A\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u000BR\u000E\u0010\u0017\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0018\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0019\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u001A\u001A\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u001B\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u001C\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u001D\u001A\u00020\u001EX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u001F\u001A\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001A\u00020\u001E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\"\u0010#R\u0011\u0010$\u001A\u00020 8F¢\u0006\u0006\u001A\u0004\b%\u0010&R\u0014\u0010\'\u001A\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b(\u0010\u000B¨\u0006)"}, d2 = {"Lcom/kakao/sdk/common/model/ApplicationContextInfo;", "Lcom/kakao/sdk/common/model/ApplicationInfo;", "Lcom/kakao/sdk/common/model/ContextInfo;", "context", "Landroid/content/Context;", "appKey", "", "sdkType", "Lcom/kakao/sdk/common/KakaoSdk$Type;", "(Landroid/content/Context;Ljava/lang/String;Lcom/kakao/sdk/common/KakaoSdk$Type;)V", "getAppKey", "()Ljava/lang/String;", "appVer", "getAppVer", "applicationContext", "getApplicationContext", "()Landroid/content/Context;", "extras", "Lcom/google/gson/JsonObject;", "getExtras", "()Lcom/google/gson/JsonObject;", "kaHeader", "getKaHeader", "mAppVer", "mApplicationContext", "mClientId", "mExtras", "mKaHeader", "mKeyHash", "mSalt", "", "mSharedPreferences", "Landroid/content/SharedPreferences;", "salt", "getSalt", "()[B", "sharedPreferences", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "signingKeyHash", "getSigningKeyHash", "common_release"}, k = 1, mv = {1, 1, 15})
public final class ApplicationContextInfo implements ApplicationInfo, ContextInfo {
    private final String mAppVer;
    private final Context mApplicationContext;
    private final String mClientId;
    private final JsonObject mExtras;
    private final String mKaHeader;
    private final String mKeyHash;
    private final byte[] mSalt;
    private final SharedPreferences mSharedPreferences;

    public ApplicationContextInfo(@NotNull Context context0, @NotNull String s, @NotNull Type kakaoSdk$Type0) {
        Intrinsics.checkParameterIsNotNull(context0, "context");
        Intrinsics.checkParameterIsNotNull(s, "appKey");
        Intrinsics.checkParameterIsNotNull(kakaoSdk$Type0, "sdkType");
        super();
        this.mClientId = s;
        this.mKaHeader = Utility.INSTANCE.getKAHeader(context0, kakaoSdk$Type0);
        this.mKeyHash = Utility.INSTANCE.getKeyHash(context0);
        this.mExtras = Utility.INSTANCE.getExtras(context0, kakaoSdk$Type0);
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences(s, 0);
        Intrinsics.checkExpressionValueIsNotNull(sharedPreferences0, "context.getSharedPrefere…ey, Context.MODE_PRIVATE)");
        this.mSharedPreferences = sharedPreferences0;
        String s1 = context0.getPackageManager().getPackageInfo("net.daum.android.tistoryapp", 0).versionName;
        Intrinsics.checkExpressionValueIsNotNull(s1, "context.packageManager.g…ckageName, 0).versionName");
        this.mAppVer = s1;
        this.mSalt = Utility.INSTANCE.androidId(context0);
        Context context1 = context0.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(context1, "context.applicationContext");
        this.mApplicationContext = context1;
    }

    @Override  // com.kakao.sdk.common.model.ApplicationInfo
    @NotNull
    public String getAppKey() {
        return this.mClientId;
    }

    @Override  // com.kakao.sdk.common.model.ContextInfo
    @NotNull
    public String getAppVer() {
        return this.mAppVer;
    }

    @NotNull
    public final Context getApplicationContext() {
        return this.mApplicationContext;
    }

    @Override  // com.kakao.sdk.common.model.ContextInfo
    @NotNull
    public JsonObject getExtras() {
        return this.mExtras;
    }

    @Override  // com.kakao.sdk.common.model.ContextInfo
    @NotNull
    public String getKaHeader() {
        return this.mKaHeader;
    }

    @Override  // com.kakao.sdk.common.model.ContextInfo
    @NotNull
    public byte[] getSalt() {
        return this.mSalt;
    }

    @NotNull
    public final SharedPreferences getSharedPreferences() {
        return this.mSharedPreferences;
    }

    @Override  // com.kakao.sdk.common.model.ContextInfo
    @NotNull
    public String getSigningKeyHash() {
        return this.mKeyHash;
    }
}

