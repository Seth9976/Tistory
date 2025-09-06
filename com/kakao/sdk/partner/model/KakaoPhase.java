package com.kakao.sdk.partner.model;

import com.google.gson.annotations.SerializedName;
import com.kakao.sdk.common.util.KakaoJson;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/sdk/partner/model/KakaoPhase;", "", "", "phaseName", "Ljava/lang/String;", "getPhaseName", "()Ljava/lang/String;", "Companion", "DEV", "SANDBOX", "CBT", "PRODUCTION", "partner-common_release"}, k = 1, mv = {1, 4, 0})
public enum KakaoPhase {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/sdk/partner/model/KakaoPhase$Companion;", "", "", "value", "Lcom/kakao/sdk/partner/model/KakaoPhase;", "fromName", "(Ljava/lang/String;)Lcom/kakao/sdk/partner/model/KakaoPhase;", "partner-common_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KakaoPhase fromName(@NotNull String s) {
            Intrinsics.checkParameterIsNotNull(s, "value");
            return (KakaoPhase)KakaoJson.INSTANCE.fromJson(s, KakaoPhase.class);
        }
    }

    @SerializedName("dev")
    DEV("dev"),
    @SerializedName("sandbox")
    SANDBOX("sandbox"),
    @SerializedName("cbt")
    CBT("cbt"),
    @SerializedName("production")
    PRODUCTION("production");

    public static final Companion Companion;
    @NotNull
    private final String phaseName;

    static {
        KakaoPhase.Companion = new Companion(null);
    }

    public KakaoPhase(String s1) {
        this.phaseName = s1;
    }

    @NotNull
    public final String getPhaseName() {
        return this.phaseName;
    }
}

