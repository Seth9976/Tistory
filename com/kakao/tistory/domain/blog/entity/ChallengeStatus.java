package com.kakao.tistory.domain.blog.entity;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/ChallengeStatus;", "", "PRE", "OPEN", "END", "UNKNOWN", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum ChallengeStatus {
    PRE,
    OPEN,
    END,
    UNKNOWN;

    public static final ChallengeStatus[] a;
    public static final EnumEntries b;

    static {
        ChallengeStatus.a = arr_challengeStatus;
        Intrinsics.checkNotNullParameter(arr_challengeStatus, "entries");
        ChallengeStatus.b = new a(arr_challengeStatus);
    }

    @NotNull
    public static EnumEntries getEntries() {
        return ChallengeStatus.b;
    }
}

