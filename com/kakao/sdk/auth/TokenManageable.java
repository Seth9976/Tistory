package com.kakao.sdk.auth;

import com.kakao.sdk.auth.model.OAuthToken;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&J\n\u0010\u0004\u001A\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/kakao/sdk/auth/TokenManageable;", "", "clear", "", "getToken", "Lcom/kakao/sdk/auth/model/OAuthToken;", "setToken", "token", "auth_release"}, k = 1, mv = {1, 1, 15})
public interface TokenManageable {
    void clear();

    @Nullable
    OAuthToken getToken();

    void setToken(@NotNull OAuthToken arg1);
}

