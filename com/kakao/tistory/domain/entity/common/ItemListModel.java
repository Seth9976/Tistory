package com.kakao.tistory.domain.entity.common;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001C\u0010\u0004\u001A\u0004\u0018\u00010\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0019\u0010\n\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000B¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0015\u0010\u000E\u001A\u0004\u0018\u00010\u000F¢\u0006\n\n\u0002\u0010\u0012\u001A\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0013\u001A\u0004\u0018\u00010\u000F¢\u0006\n\n\u0002\u0010\u0012\u001A\u0004\b\u0014\u0010\u0011R\u0015\u0010\u0015\u001A\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010\u0019\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/domain/entity/common/ItemListModel;", "T", "", "()V", "exception", "", "getException", "()Ljava/lang/String;", "setException", "(Ljava/lang/String;)V", "items", "", "getItems", "()Ljava/util/List;", "nextPage", "", "getNextPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "prevPage", "getPrevPage", "totalCount", "", "getTotalCount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class ItemListModel {
    @Nullable
    private String exception;
    @Nullable
    private final List items;
    @Nullable
    private final Integer nextPage;
    @Nullable
    private final Integer prevPage;
    @Nullable
    private final Long totalCount;

    @Nullable
    public final String getException() {
        return this.exception;
    }

    @Nullable
    public final List getItems() {
        return this.items;
    }

    @Nullable
    public final Integer getNextPage() {
        return this.nextPage;
    }

    @Nullable
    public final Integer getPrevPage() {
        return this.prevPage;
    }

    @Nullable
    public final Long getTotalCount() {
        return this.totalCount;
    }

    public final void setException(@Nullable String s) {
        this.exception = s;
    }
}

