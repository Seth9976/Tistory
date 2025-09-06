package com.kakao.sdk.auth;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.util.AESCipher;
import com.kakao.sdk.common.util.Cipher;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.common.util.PersistentKVStore.DefaultImpls;
import com.kakao.sdk.common.util.PersistentKVStore;
import com.kakao.sdk.common.util.SdkLog;
import com.kakao.sdk.common.util.SharedPrefsWrapper;
import java.util.Date;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sb.a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000E\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001A\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001A"}, d2 = {"Lcom/kakao/sdk/auth/TokenManager;", "Lcom/kakao/sdk/auth/TokenManageable;", "Lcom/kakao/sdk/common/util/PersistentKVStore;", "appCache", "Lcom/kakao/sdk/common/util/Cipher;", "encryptor", "<init>", "(Lcom/kakao/sdk/common/util/PersistentKVStore;Lcom/kakao/sdk/common/util/Cipher;)V", "Lcom/kakao/sdk/auth/model/OAuthToken;", "getToken", "()Lcom/kakao/sdk/auth/model/OAuthToken;", "token", "", "setToken", "(Lcom/kakao/sdk/auth/model/OAuthToken;)V", "clear", "()V", "b", "Lcom/kakao/sdk/common/util/PersistentKVStore;", "getAppCache", "()Lcom/kakao/sdk/common/util/PersistentKVStore;", "c", "Lcom/kakao/sdk/common/util/Cipher;", "getEncryptor", "()Lcom/kakao/sdk/common/util/Cipher;", "Companion", "auth_release"}, k = 1, mv = {1, 4, 0})
public final class TokenManager implements TokenManageable {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R!\u0010\t\u001A\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000B\u001A\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\fR\u0014\u0010\r\u001A\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000E\u001A\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000E\u0010\fR\u0014\u0010\u000F\u001A\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000F\u0010\fR\u0014\u0010\u0010\u001A\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001A\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001A\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/kakao/sdk/auth/TokenManager$Companion;", "", "Lcom/kakao/sdk/auth/TokenManager;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/kakao/sdk/auth/TokenManager;", "instance$annotations", "()V", "instance", "", "atExpiresAtKey", "Ljava/lang/String;", "atKey", "rtExpiresAtKey", "rtKey", "secureModeKey", "tokenKey", "versionKey", "auth_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public static final KProperty[] a;

        static {
            Companion.a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/TokenManager;"))};
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final TokenManager getInstance() {
            Lazy lazy0 = TokenManager.d;
            KProperty kProperty0 = Companion.a[0];
            return (TokenManager)lazy0.getValue();
        }

        @JvmStatic
        public static void instance$annotations() {
        }
    }

    public static final Companion Companion = null;
    public OAuthToken a;
    @NotNull
    public static final String atExpiresAtKey = "com.kakao.token.OAuthToken.ExpiresAt";
    @NotNull
    public static final String atKey = "com.kakao.token.AccessToken";
    public final PersistentKVStore b;
    public final Cipher c;
    public static final Lazy d = null;
    @NotNull
    public static final String rtExpiresAtKey = "com.kakao.token.RefreshToken.ExpiresAt";
    @NotNull
    public static final String rtKey = "com.kakao.token.RefreshToken";
    @NotNull
    public static final String secureModeKey = "com.kakao.token.KakaoSecureMode";
    @NotNull
    public static final String tokenKey = "com.kakao.sdk.oauth_token";
    @NotNull
    public static final String versionKey = "com.kakao.sdk.version";

    static {
        TokenManager.Companion = new Companion(null);
        TokenManager.d = c.lazy(a.G);
    }

    public TokenManager() {
        this(null, null, 3, null);
    }

    public TokenManager(@NotNull PersistentKVStore persistentKVStore0, @NotNull Cipher cipher0) {
        Intrinsics.checkParameterIsNotNull(persistentKVStore0, "appCache");
        OAuthToken oAuthToken1;
        Long long1;
        Long long0;
        String s7;
        String s6;
        String s4;
        String s3;
        String s1;
        Intrinsics.checkParameterIsNotNull(cipher0, "encryptor");
        super();
        this.b = persistentKVStore0;
        this.c = cipher0;
        if(DefaultImpls.getString$default(persistentKVStore0, "com.kakao.sdk.version", null, 2, null) == null) {
            com.kakao.sdk.common.util.SdkLog.Companion sdkLog$Companion0 = SdkLog.Companion;
            sdkLog$Companion0.i("=== Migrate from old version token");
            persistentKVStore0.putString("com.kakao.sdk.version", "2.0.5").commit();
            String s = persistentKVStore0.getString("com.kakao.token.KakaoSecureMode", null);
            Class class0 = JsonObject.class;
            if(s == null) {
                s1 = "false";
            }
            else {
                JsonElement jsonElement0 = ((JsonObject)KakaoJson.INSTANCE.fromJson(s, class0)).get("value");
                Intrinsics.checkExpressionValueIsNotNull(jsonElement0, "KakaoJson.fromJson<JsonO…ect::class.java)[\"value\"]");
                s1 = jsonElement0.getAsString();
                if(s1 == null) {
                    s1 = "false";
                }
            }
            sdkLog$Companion0.i("secureMode: " + s1);
            try {
                String s2 = persistentKVStore0.getString("com.kakao.token.AccessToken", null);
                if(s2 == null) {
                    s3 = null;
                }
                else {
                    JsonElement jsonElement1 = ((JsonObject)KakaoJson.INSTANCE.fromJson(s2, class0)).get("value");
                    Intrinsics.checkExpressionValueIsNotNull(jsonElement1, "KakaoJson.fromJson<JsonO…               )[\"value\"]");
                    s3 = jsonElement1.getAsString();
                    if(s3 != null && Intrinsics.areEqual(s1, "true")) {
                        s3 = cipher0.decrypt(s3);
                    }
                }
                s4 = s3;
            }
            catch(Exception exception0) {
                SdkLog.Companion.e(exception0);
                s4 = null;
            }
            SdkLog.Companion.i("accessToken: " + s4);
            try {
                String s5 = persistentKVStore0.getString("com.kakao.token.RefreshToken", null);
                if(s5 == null) {
                    s6 = null;
                }
                else {
                    JsonElement jsonElement2 = ((JsonObject)KakaoJson.INSTANCE.fromJson(s5, class0)).get("value");
                    Intrinsics.checkExpressionValueIsNotNull(jsonElement2, "KakaoJson.fromJson<JsonO…               )[\"value\"]");
                    s6 = jsonElement2.getAsString();
                    if(s6 != null && Intrinsics.areEqual(s1, "true")) {
                        s6 = cipher0.decrypt(s6);
                    }
                }
                s7 = s6;
            }
            catch(Exception exception1) {
                SdkLog.Companion.e(exception1);
                s7 = null;
            }
            SdkLog.Companion.i("refreshToken: " + s7);
            try {
                String s8 = persistentKVStore0.getString("com.kakao.token.OAuthToken.ExpiresAt", null);
                if(s8 == null) {
                    goto label_60;
                }
                else {
                    JsonElement jsonElement3 = ((JsonObject)KakaoJson.INSTANCE.fromJson(s8, class0)).get("value");
                    Intrinsics.checkExpressionValueIsNotNull(jsonElement3, "KakaoJson.fromJson<JsonO…ect::class.java)[\"value\"]");
                    long0 = jsonElement3.getAsLong();
                }
            }
            catch(Exception exception2) {
                SdkLog.Companion.e(exception2);
                long0 = null;
            }
            goto label_61;
        label_60:
            long0 = null;
        label_61:
            long v = long0 == null ? 0L : ((long)long0);
            try {
                String s9 = persistentKVStore0.getString("com.kakao.token.RefreshToken.ExpiresAt", null);
                if(s9 == null) {
                    goto label_72;
                }
                else {
                    JsonElement jsonElement4 = ((JsonObject)KakaoJson.INSTANCE.fromJson(s9, class0)).get("value");
                    Intrinsics.checkExpressionValueIsNotNull(jsonElement4, "KakaoJson.fromJson<JsonO…ect::class.java)[\"value\"]");
                    long1 = jsonElement4.getAsLong();
                }
            }
            catch(Exception exception3) {
                SdkLog.Companion.e(exception3);
                long1 = null;
            }
            goto label_73;
        label_72:
            long1 = null;
        label_73:
            long v1 = long1 == null ? 0x7FFFFFFFFFFFFFFFL : ((long)long1);
            if(s4 != null && s7 != null) {
                OAuthToken oAuthToken0 = new OAuthToken(s4, new Date(v), s7, new Date(v1), null, 16, null);
                persistentKVStore0.putString("com.kakao.sdk.oauth_token", cipher0.encrypt(KakaoJson.INSTANCE.toJson(oAuthToken0))).remove("com.kakao.token.KakaoSecureMode").remove("com.kakao.token.AccessToken").remove("com.kakao.token.RefreshToken").remove("com.kakao.token.OAuthToken.ExpiresAt").remove("com.kakao.token.RefreshToken.ExpiresAt").commit();
            }
        }
        String s10 = DefaultImpls.getString$default(this.b, "com.kakao.sdk.oauth_token", null, 2, null);
        if(s10 == null) {
            oAuthToken1 = null;
        }
        else {
            try {
                String s11 = this.c.decrypt(s10);
                oAuthToken1 = (OAuthToken)KakaoJson.INSTANCE.fromJson(s11, OAuthToken.class);
            }
            catch(Throwable throwable0) {
                SdkLog.Companion.e(throwable0);
                oAuthToken1 = null;
            }
        }
        this.a = oAuthToken1;
    }

    public TokenManager(PersistentKVStore persistentKVStore0, Cipher cipher0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            persistentKVStore0 = new SharedPrefsWrapper(KakaoSdk.INSTANCE.getApplicationContextInfo().getSharedPreferences());
        }
        if((v & 2) != 0) {
            cipher0 = new AESCipher(null, 1, null);
        }
        this(persistentKVStore0, cipher0);
    }

    @Override  // com.kakao.sdk.auth.TokenManageable
    public void clear() {
        this.a = null;
        this.b.remove("com.kakao.sdk.oauth_token").commit();
    }

    @NotNull
    public final PersistentKVStore getAppCache() {
        return this.b;
    }

    @NotNull
    public final Cipher getEncryptor() {
        return this.c;
    }

    @NotNull
    public static final TokenManager getInstance() {
        return TokenManager.Companion.getInstance();
    }

    @Override  // com.kakao.sdk.auth.TokenManageable
    @Nullable
    public OAuthToken getToken() {
        return this.a;
    }

    @Override  // com.kakao.sdk.auth.TokenManageable
    public void setToken(@NotNull OAuthToken oAuthToken0) {
        Intrinsics.checkParameterIsNotNull(oAuthToken0, "token");
        OAuthToken oAuthToken1 = new OAuthToken(oAuthToken0.getAccessToken(), oAuthToken0.getAccessTokenExpiresAt(), oAuthToken0.getRefreshToken(), oAuthToken0.getRefreshTokenExpiresAt(), oAuthToken0.getScopes());
        try {
            String s = KakaoJson.INSTANCE.toJson(oAuthToken1);
            String s1 = this.c.encrypt(s);
            this.b.putString("com.kakao.sdk.oauth_token", s1).commit();
        }
        catch(Throwable throwable0) {
            SdkLog.Companion.e(throwable0);
        }
        this.a = oAuthToken1;
    }
}

