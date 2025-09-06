package com.kakao.tistory.domain.entity.common;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\r\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001A\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001A\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0015\u0010\f\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000F\u001A\u0004\b\r\u0010\u000ER\u0013\u0010\u0010\u001A\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000BR\u0015\u0010\u0012\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000F\u001A\u0004\b\u0013\u0010\u000ER\u0013\u0010\u0014\u001A\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u000B¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/domain/entity/common/EntryItemListModel;", "T", "Lcom/kakao/tistory/domain/entity/common/ItemListModel;", "()V", "category", "", "getCategory", "()I", "categoryName", "", "getCategoryName", "()Ljava/lang/String;", "count", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "from", "getFrom", "pivot", "getPivot", "to", "getTo", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EntryItemListModel extends ItemListModel {
    private final int category;
    @Nullable
    private final String categoryName;
    @Nullable
    private final Integer count;
    @Nullable
    private final String from;
    @Nullable
    private final Integer pivot;
    @Nullable
    private final String to;

    public EntryItemListModel() {
        this.category = -3;
    }

    public final int getCategory() {
        return this.category;
    }

    @Nullable
    public final String getCategoryName() {
        return this.categoryName;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final String getFrom() {
        return this.from;
    }

    @Nullable
    public final Integer getPivot() {
        return this.pivot;
    }

    @Nullable
    public final String getTo() {
        return this.to;
    }
}

