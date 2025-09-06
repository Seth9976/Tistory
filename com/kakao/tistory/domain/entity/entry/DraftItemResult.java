package com.kakao.tistory.domain.entity.entry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/DraftItemResult;", "", "draft", "Lcom/kakao/tistory/domain/entity/entry/DraftItem;", "totalCount", "", "(Lcom/kakao/tistory/domain/entity/entry/DraftItem;J)V", "getDraft", "()Lcom/kakao/tistory/domain/entity/entry/DraftItem;", "getTotalCount", "()J", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DraftItemResult {
    @NotNull
    private final DraftItem draft;
    private final long totalCount;

    public DraftItemResult(@NotNull DraftItem draftItem0, long v) {
        Intrinsics.checkNotNullParameter(draftItem0, "draft");
        super();
        this.draft = draftItem0;
        this.totalCount = v;
    }

    public DraftItemResult(DraftItem draftItem0, long v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            v = 0L;
        }
        this(draftItem0, v);
    }

    @NotNull
    public final DraftItem getDraft() {
        return this.draft;
    }

    public final long getTotalCount() {
        return this.totalCount;
    }
}

