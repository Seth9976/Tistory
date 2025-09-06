package com.kakao.sdk.auth;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b4\b\u00C6\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000B\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u000B\u0010\u0004R\u0014\u0010\f\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000E\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u000E\u0010\u0004R\u0014\u0010\u000F\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u000F\u0010\u0004R\u0014\u0010\u0010\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001A\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001A\u0010\u0004R\u0014\u0010\u001B\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001B\u0010\u0004R\u0014\u0010\u001C\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001C\u0010\u0004R\u0014\u0010\u001D\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001D\u0010\u0004R\u0014\u0010\u001E\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001E\u0010\u0004R\u0014\u0010\u001F\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001F\u0010\u0004R\u0014\u0010 \u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010!\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b!\u0010\u0004R\u0014\u0010\"\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0014\u0010#\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b#\u0010\u0004R\u0014\u0010$\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b$\u0010\u0004R\u001A\u0010%\u001A\u00020\u00028\u0006X\u0086D\u00A2\u0006\f\n\u0004\b%\u0010\u0004\u001A\u0004\b&\u0010\'R\u001A\u0010(\u001A\u00020\u00028\u0006X\u0086D\u00A2\u0006\f\n\u0004\b(\u0010\u0004\u001A\u0004\b)\u0010\'R\u001A\u0010*\u001A\u00020\u00028\u0006X\u0086D\u00A2\u0006\f\n\u0004\b*\u0010\u0004\u001A\u0004\b+\u0010\'R\u001A\u0010,\u001A\u00020\u00028\u0006X\u0086D\u00A2\u0006\f\n\u0004\b,\u0010\u0004\u001A\u0004\b-\u0010\'R\u001A\u0010.\u001A\u00020\u00028\u0006X\u0086D\u00A2\u0006\f\n\u0004\b.\u0010\u0004\u001A\u0004\b/\u0010\'R\u001A\u00100\u001A\u00020\u00028\u0006X\u0086D\u00A2\u0006\f\n\u0004\b0\u0010\u0004\u001A\u0004\b1\u0010\'R\u001A\u00102\u001A\u00020\u00028\u0006X\u0086D\u00A2\u0006\f\n\u0004\b2\u0010\u0004\u001A\u0004\b3\u0010\'R\u001A\u00104\u001A\u00020\u00028\u0006X\u0086D\u00A2\u0006\f\n\u0004\b4\u0010\u0004\u001A\u0004\b5\u0010\'\u00A8\u00066"}, d2 = {"Lcom/kakao/sdk/auth/Constants;", "", "", "AUTHORIZE_PATH", "Ljava/lang/String;", "TOKEN_PATH", "AGT_PATH", "CLIENT_ID", "AGT", "REDIRECT_URI", "ANDROID_KEY_HASH", "CODE", "ERROR", "ERROR_DESCRIPTION", "REFRESH_TOKEN", "GRANT_TYPE", "RESPONSE_TYPE", "SCOPE", "AUTH_TYPE", "KA_HEADER", "AUTHORIZATION_CODE", "ACCESS_TOKEN", "EXPIRES_IN", "REFRESH_TOKEN_EXPIRES_IN", "TOKEN_TYPE", "SECURE_RESOURCE", "KEY_URL", "KEY_LOGIN_INTENT", "KEY_REQUEST_CODE", "KEY_REDIRECT_URI", "KEY_FULL_URI", "KEY_BUNDLE", "KEY_HEADERS", "KEY_EXCEPTION", "KEY_RESULT_RECEIVER", "CHANNEL_PUBLIC_ID", "SERVICE_TERMS", "EXTRA_APPLICATION_KEY", "getEXTRA_APPLICATION_KEY", "()Ljava/lang/String;", "EXTRA_REDIRECT_URI", "getEXTRA_REDIRECT_URI", "EXTRA_KA_HEADER", "getEXTRA_KA_HEADER", "EXTRA_EXTRAPARAMS", "getEXTRA_EXTRAPARAMS", "EXTRA_REDIRECT_URL", "getEXTRA_REDIRECT_URL", "EXTRA_ERROR_DESCRIPTION", "getEXTRA_ERROR_DESCRIPTION", "EXTRA_ERROR_TYPE", "getEXTRA_ERROR_TYPE", "NOT_SUPPORT_ERROR", "getNOT_SUPPORT_ERROR", "auth_release"}, k = 1, mv = {1, 4, 0})
public final class Constants {
    @NotNull
    public static final String ACCESS_TOKEN = "access_token";
    @NotNull
    public static final String AGT = "agt";
    @NotNull
    public static final String AGT_PATH = "api/agt";
    @NotNull
    public static final String ANDROID_KEY_HASH = "android_key_hash";
    @NotNull
    public static final String AUTHORIZATION_CODE = "authorization_code";
    @NotNull
    public static final String AUTHORIZE_PATH = "oauth/authorize";
    @NotNull
    public static final String AUTH_TYPE = "auth_type";
    @NotNull
    public static final String CHANNEL_PUBLIC_ID = "channel_public_id";
    @NotNull
    public static final String CLIENT_ID = "client_id";
    @NotNull
    public static final String CODE = "code";
    @NotNull
    public static final String ERROR = "error";
    @NotNull
    public static final String ERROR_DESCRIPTION = "error_description";
    @NotNull
    public static final String EXPIRES_IN = "expires_in";
    @NotNull
    public static final String GRANT_TYPE = "grant_type";
    public static final Constants INSTANCE = null;
    @NotNull
    public static final String KA_HEADER = "ka";
    @NotNull
    public static final String KEY_BUNDLE = "key.bundle";
    @NotNull
    public static final String KEY_EXCEPTION = "key.exception";
    @NotNull
    public static final String KEY_FULL_URI = "key.full_authorize_uri";
    @NotNull
    public static final String KEY_HEADERS = "key.extra.headers";
    @NotNull
    public static final String KEY_LOGIN_INTENT = "key.login.intent";
    @NotNull
    public static final String KEY_REDIRECT_URI = "key.redirect_uri";
    @NotNull
    public static final String KEY_REQUEST_CODE = "key.request.code";
    @NotNull
    public static final String KEY_RESULT_RECEIVER = "key.result.receiver";
    @NotNull
    public static final String KEY_URL = "key.url";
    @NotNull
    public static final String REDIRECT_URI = "redirect_uri";
    @NotNull
    public static final String REFRESH_TOKEN = "refresh_token";
    @NotNull
    public static final String REFRESH_TOKEN_EXPIRES_IN = "refresh_token_expires_in";
    @NotNull
    public static final String RESPONSE_TYPE = "response_type";
    @NotNull
    public static final String SCOPE = "scope";
    @NotNull
    public static final String SECURE_RESOURCE = "secure_resource";
    @NotNull
    public static final String SERVICE_TERMS = "service_terms";
    @NotNull
    public static final String TOKEN_PATH = "oauth/token";
    @NotNull
    public static final String TOKEN_TYPE = "token_type";

    static {
        Constants.INSTANCE = new Constants();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final String getEXTRA_APPLICATION_KEY() [...] // Inlined contents

    @NotNull
    public final String getEXTRA_ERROR_DESCRIPTION() {
        return "com.kakao.sdk.talk.error.description";
    }

    @NotNull
    public final String getEXTRA_ERROR_TYPE() {
        return "com.kakao.sdk.talk.error.type";
    }

    @NotNull
    public final String getEXTRA_EXTRAPARAMS() [...] // Inlined contents

    @NotNull
    public final String getEXTRA_KA_HEADER() [...] // Inlined contents

    @NotNull
    public final String getEXTRA_REDIRECT_URI() [...] // Inlined contents

    @NotNull
    public final String getEXTRA_REDIRECT_URL() [...] // Inlined contents

    @NotNull
    public final String getNOT_SUPPORT_ERROR() {
        return "NotSupportError";
    }
}

