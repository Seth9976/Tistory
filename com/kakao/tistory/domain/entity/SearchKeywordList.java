package com.kakao.tistory.domain.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0004HÆ\u0003J\'\u0010\r\u001A\u00020\u00002\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0004HÖ\u0001R\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0019\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/domain/entity/SearchKeywordList;", "", "suggestions", "", "", "query", "(Ljava/util/List;Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "getSuggestions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SearchKeywordList {
    @Nullable
    private final String query;
    @Nullable
    private final List suggestions;

    public SearchKeywordList() {
        this(null, null, 3, null);
    }

    public SearchKeywordList(@Nullable List list0, @Nullable String s) {
        this.suggestions = list0;
        this.query = s;
    }

    public SearchKeywordList(List list0, String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            list0 = null;
        }
        if((v & 2) != 0) {
            s = null;
        }
        this(list0, s);
    }

    @Nullable
    public final List component1() {
        return this.suggestions;
    }

    @Nullable
    public final String component2() {
        return this.query;
    }

    @NotNull
    public final SearchKeywordList copy(@Nullable List list0, @Nullable String s) {
        return new SearchKeywordList(list0, s);
    }

    public static SearchKeywordList copy$default(SearchKeywordList searchKeywordList0, List list0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = searchKeywordList0.suggestions;
        }
        if((v & 2) != 0) {
            s = searchKeywordList0.query;
        }
        return searchKeywordList0.copy(list0, s);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SearchKeywordList)) {
            return false;
        }
        return Intrinsics.areEqual(this.suggestions, ((SearchKeywordList)object0).suggestions) ? Intrinsics.areEqual(this.query, ((SearchKeywordList)object0).query) : false;
    }

    @Nullable
    public final String getQuery() {
        return this.query;
    }

    @Nullable
    public final List getSuggestions() {
        return this.suggestions;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.suggestions == null ? 0 : this.suggestions.hashCode();
        String s = this.query;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        return "SearchKeywordList(suggestions=" + this.suggestions + ", query=" + this.query + ")";
    }
}

