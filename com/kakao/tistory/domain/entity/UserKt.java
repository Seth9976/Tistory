package com.kakao.tistory.domain.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001A\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001A\u0004\b\u0000\u0010\u0003\"\u0017\u0010\u0004\u001A\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"isKakaoAccount", "", "Lcom/kakao/tistory/domain/entity/User;", "(Lcom/kakao/tistory/domain/entity/User;)Z", "isTistoryAccount", "domain_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class UserKt {
    // 去混淆评级： 低(40)
    public static final boolean isKakaoAccount(@Nullable User user0) {
        return user0 == null ? Intrinsics.areEqual(null, "kakao") : Intrinsics.areEqual(user0.getAccountType(), "kakao");
    }

    // 去混淆评级： 低(40)
    public static final boolean isTistoryAccount(@Nullable User user0) {
        return user0 == null ? Intrinsics.areEqual(null, "general") : Intrinsics.areEqual(user0.getAccountType(), "general");
    }
}

