package com.kakao.sdk.common.model;

import com.google.gson.annotations.SerializedName;
import com.kakao.sdk.common.json.UnknownValue;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/sdk/common/model/AuthErrorCause;", "", "InvalidRequest", "InvalidClient", "InvalidScope", "InvalidGrant", "Misconfigured", "Unauthorized", "AccessDenied", "ServerError", "Unknown", "common_release"}, k = 1, mv = {1, 4, 0})
public enum AuthErrorCause {
    @SerializedName("invalid_request")
    InvalidRequest,
    @SerializedName("invalid_client")
    InvalidClient,
    @SerializedName("invalid_scope")
    InvalidScope,
    @SerializedName("invalid_grant")
    InvalidGrant,
    @SerializedName("misconfigured")
    Misconfigured,
    @SerializedName("unauthorized")
    Unauthorized,
    @SerializedName("access_denied")
    AccessDenied,
    @SerializedName("server_error")
    ServerError,
    @UnknownValue
    Unknown;

}

