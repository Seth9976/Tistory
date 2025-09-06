package com.kakao.tistory.domain.common;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\f\u0010\u0000\u001A\u00020\u0001*\u0004\u0018\u00010\u0001¨\u0006\u0002"}, d2 = {"orEmpty", "Lcom/kakao/tistory/domain/common/Thumbnail;", "domain_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ThumbnailKt {
    @NotNull
    public static final Thumbnail orEmpty(@Nullable Thumbnail thumbnail0) {
        return Thumbnail.Companion.getEmpty();
    }
}

