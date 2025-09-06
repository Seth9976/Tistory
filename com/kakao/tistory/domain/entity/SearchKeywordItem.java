package com.kakao.tistory.domain.entity;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u001F\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/domain/entity/SearchKeywordItem;", "", "keyword", "", "date", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;)V", "getDate", "()Ljava/util/Date;", "getKeyword", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SearchKeywordItem {
    @Nullable
    private final Date date;
    @NotNull
    private final String keyword;

    public SearchKeywordItem(@NotNull String s, @Nullable Date date0) {
        Intrinsics.checkNotNullParameter(s, "keyword");
        super();
        this.keyword = s;
        this.date = date0;
    }

    @NotNull
    public final String component1() {
        return this.keyword;
    }

    @Nullable
    public final Date component2() {
        return this.date;
    }

    @NotNull
    public final SearchKeywordItem copy(@NotNull String s, @Nullable Date date0) {
        Intrinsics.checkNotNullParameter(s, "keyword");
        return new SearchKeywordItem(s, date0);
    }

    public static SearchKeywordItem copy$default(SearchKeywordItem searchKeywordItem0, String s, Date date0, int v, Object object0) {
        if((v & 1) != 0) {
            s = searchKeywordItem0.keyword;
        }
        if((v & 2) != 0) {
            date0 = searchKeywordItem0.date;
        }
        return searchKeywordItem0.copy(s, date0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SearchKeywordItem)) {
            return false;
        }
        return Intrinsics.areEqual(this.keyword, ((SearchKeywordItem)object0).keyword) ? Intrinsics.areEqual(this.date, ((SearchKeywordItem)object0).date) : false;
    }

    @Nullable
    public final Date getDate() {
        return this.date;
    }

    @NotNull
    public final String getKeyword() {
        return this.keyword;
    }

    @Override
    public int hashCode() {
        int v = this.keyword.hashCode();
        return this.date == null ? v * 0x1F : v * 0x1F + this.date.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "SearchKeywordItem(keyword=" + this.keyword + ", date=" + this.date + ")";
    }
}

