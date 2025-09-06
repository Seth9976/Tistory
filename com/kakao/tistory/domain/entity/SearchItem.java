package com.kakao.tistory.domain.entity;

import androidx.annotation.StringRes;
import com.kakao.tistory.domain.entity.viewtype.SearchViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000F\b\u0004\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000B\f\r\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/tistory/domain/entity/SearchItem;", "", "viewType", "Lcom/kakao/tistory/domain/entity/viewtype/SearchViewType;", "(Lcom/kakao/tistory/domain/entity/viewtype/SearchViewType;)V", "getViewType", "()Lcom/kakao/tistory/domain/entity/viewtype/SearchViewType;", "Bottom", "Empty", "Keyword", "Top", "Lcom/kakao/tistory/domain/entity/SearchItem$Bottom;", "Lcom/kakao/tistory/domain/entity/SearchItem$Empty;", "Lcom/kakao/tistory/domain/entity/SearchItem$Keyword;", "Lcom/kakao/tistory/domain/entity/SearchItem$Top;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class SearchItem {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\n\b\u0003\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000F\u001A\u00020\u0006HÆ\u0003J0\u0010\u0010\u001A\u00020\u00002\n\b\u0003\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001A\u00020\u00062\b\u0010\u0013\u001A\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001R\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u000BR\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/domain/entity/SearchItem$Bottom;", "Lcom/kakao/tistory/domain/entity/SearchItem;", "switchTitle", "", "clearTitle", "isRecentKeyword", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "getClearTitle", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "getSwitchTitle", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/kakao/tistory/domain/entity/SearchItem$Bottom;", "equals", "other", "", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Bottom extends SearchItem {
        @Nullable
        private final Integer clearTitle;
        private final boolean isRecentKeyword;
        @Nullable
        private final Integer switchTitle;

        public Bottom() {
            this(null, null, false, 7, null);
        }

        public Bottom(@StringRes @Nullable Integer integer0, @StringRes @Nullable Integer integer1, boolean z) {
            super(SearchViewType.BOTTOM, null);
            this.switchTitle = integer0;
            this.clearTitle = integer1;
            this.isRecentKeyword = z;
        }

        public Bottom(Integer integer0, Integer integer1, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                integer0 = null;
            }
            if((v & 2) != 0) {
                integer1 = null;
            }
            if((v & 4) != 0) {
                z = false;
            }
            this(integer0, integer1, z);
        }

        @Nullable
        public final Integer component1() {
            return this.switchTitle;
        }

        @Nullable
        public final Integer component2() {
            return this.clearTitle;
        }

        public final boolean component3() {
            return this.isRecentKeyword;
        }

        @NotNull
        public final Bottom copy(@StringRes @Nullable Integer integer0, @StringRes @Nullable Integer integer1, boolean z) {
            return new Bottom(integer0, integer1, z);
        }

        public static Bottom copy$default(Bottom searchItem$Bottom0, Integer integer0, Integer integer1, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                integer0 = searchItem$Bottom0.switchTitle;
            }
            if((v & 2) != 0) {
                integer1 = searchItem$Bottom0.clearTitle;
            }
            if((v & 4) != 0) {
                z = searchItem$Bottom0.isRecentKeyword;
            }
            return searchItem$Bottom0.copy(integer0, integer1, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Bottom)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.switchTitle, ((Bottom)object0).switchTitle)) {
                return false;
            }
            return Intrinsics.areEqual(this.clearTitle, ((Bottom)object0).clearTitle) ? this.isRecentKeyword == ((Bottom)object0).isRecentKeyword : false;
        }

        @Nullable
        public final Integer getClearTitle() {
            return this.clearTitle;
        }

        @Nullable
        public final Integer getSwitchTitle() {
            return this.switchTitle;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.switchTitle == null ? 0 : this.switchTitle.hashCode();
            Integer integer0 = this.clearTitle;
            if(integer0 != null) {
                v = integer0.hashCode();
            }
            return Boolean.hashCode(this.isRecentKeyword) + (v1 * 0x1F + v) * 0x1F;
        }

        public final boolean isRecentKeyword() {
            return this.isRecentKeyword;
        }

        @Override
        @NotNull
        public String toString() {
            return "Bottom(switchTitle=" + this.switchTitle + ", clearTitle=" + this.clearTitle + ", isRecentKeyword=" + this.isRecentKeyword + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001A\u0010\t\u001A\u00020\u00002\n\b\u0003\u0010\u0002\u001A\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u000EHÖ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/domain/entity/SearchItem$Empty;", "Lcom/kakao/tistory/domain/entity/SearchItem;", "emptyTitle", "", "(Ljava/lang/Integer;)V", "getEmptyTitle", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/kakao/tistory/domain/entity/SearchItem$Empty;", "equals", "", "other", "", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Empty extends SearchItem {
        @Nullable
        private final Integer emptyTitle;

        public Empty() {
            this(null, 1, null);
        }

        public Empty(@StringRes @Nullable Integer integer0) {
            super(SearchViewType.EMPTY, null);
            this.emptyTitle = integer0;
        }

        public Empty(Integer integer0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                integer0 = null;
            }
            this(integer0);
        }

        @Nullable
        public final Integer component1() {
            return this.emptyTitle;
        }

        @NotNull
        public final Empty copy(@StringRes @Nullable Integer integer0) {
            return new Empty(integer0);
        }

        public static Empty copy$default(Empty searchItem$Empty0, Integer integer0, int v, Object object0) {
            if((v & 1) != 0) {
                integer0 = searchItem$Empty0.emptyTitle;
            }
            return searchItem$Empty0.copy(integer0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Empty ? Intrinsics.areEqual(this.emptyTitle, ((Empty)object0).emptyTitle) : false;
        }

        @Nullable
        public final Integer getEmptyTitle() {
            return this.emptyTitle;
        }

        @Override
        public int hashCode() {
            return this.emptyTitle == null ? 0 : this.emptyTitle.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "Empty(emptyTitle=" + this.emptyTitle + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000B\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001A\u00020\u00052\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/domain/entity/SearchItem$Keyword;", "Lcom/kakao/tistory/domain/entity/SearchItem;", "keywordItem", "Lcom/kakao/tistory/domain/entity/SearchKeywordItem;", "isRecentKeyword", "", "(Lcom/kakao/tistory/domain/entity/SearchKeywordItem;Z)V", "()Z", "getKeywordItem", "()Lcom/kakao/tistory/domain/entity/SearchKeywordItem;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Keyword extends SearchItem {
        private final boolean isRecentKeyword;
        @NotNull
        private final SearchKeywordItem keywordItem;

        public Keyword(@NotNull SearchKeywordItem searchKeywordItem0, boolean z) {
            Intrinsics.checkNotNullParameter(searchKeywordItem0, "keywordItem");
            super(SearchViewType.KEYWORD, null);
            this.keywordItem = searchKeywordItem0;
            this.isRecentKeyword = z;
        }

        public Keyword(SearchKeywordItem searchKeywordItem0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                z = false;
            }
            this(searchKeywordItem0, z);
        }

        @NotNull
        public final SearchKeywordItem component1() {
            return this.keywordItem;
        }

        public final boolean component2() {
            return this.isRecentKeyword;
        }

        @NotNull
        public final Keyword copy(@NotNull SearchKeywordItem searchKeywordItem0, boolean z) {
            Intrinsics.checkNotNullParameter(searchKeywordItem0, "keywordItem");
            return new Keyword(searchKeywordItem0, z);
        }

        public static Keyword copy$default(Keyword searchItem$Keyword0, SearchKeywordItem searchKeywordItem0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                searchKeywordItem0 = searchItem$Keyword0.keywordItem;
            }
            if((v & 2) != 0) {
                z = searchItem$Keyword0.isRecentKeyword;
            }
            return searchItem$Keyword0.copy(searchKeywordItem0, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Keyword)) {
                return false;
            }
            return Intrinsics.areEqual(this.keywordItem, ((Keyword)object0).keywordItem) ? this.isRecentKeyword == ((Keyword)object0).isRecentKeyword : false;
        }

        @NotNull
        public final SearchKeywordItem getKeywordItem() {
            return this.keywordItem;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.isRecentKeyword) + this.keywordItem.hashCode() * 0x1F;
        }

        public final boolean isRecentKeyword() {
            return this.isRecentKeyword;
        }

        @Override
        @NotNull
        public String toString() {
            return "Keyword(keywordItem=" + this.keywordItem + ", isRecentKeyword=" + this.isRecentKeyword + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001A\u0010\t\u001A\u00020\u00002\n\b\u0003\u0010\u0002\u001A\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u000EHÖ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/domain/entity/SearchItem$Top;", "Lcom/kakao/tistory/domain/entity/SearchItem;", "title", "", "(Ljava/lang/Integer;)V", "getTitle", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/kakao/tistory/domain/entity/SearchItem$Top;", "equals", "", "other", "", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Top extends SearchItem {
        @Nullable
        private final Integer title;

        public Top() {
            this(null, 1, null);
        }

        public Top(@StringRes @Nullable Integer integer0) {
            super(SearchViewType.TOP, null);
            this.title = integer0;
        }

        public Top(Integer integer0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                integer0 = null;
            }
            this(integer0);
        }

        @Nullable
        public final Integer component1() {
            return this.title;
        }

        @NotNull
        public final Top copy(@StringRes @Nullable Integer integer0) {
            return new Top(integer0);
        }

        public static Top copy$default(Top searchItem$Top0, Integer integer0, int v, Object object0) {
            if((v & 1) != 0) {
                integer0 = searchItem$Top0.title;
            }
            return searchItem$Top0.copy(integer0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Top ? Intrinsics.areEqual(this.title, ((Top)object0).title) : false;
        }

        @Nullable
        public final Integer getTitle() {
            return this.title;
        }

        @Override
        public int hashCode() {
            return this.title == null ? 0 : this.title.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "Top(title=" + this.title + ")";
        }
    }

    @NotNull
    private final SearchViewType viewType;

    private SearchItem(SearchViewType searchViewType0) {
        this.viewType = searchViewType0;
    }

    public SearchItem(SearchViewType searchViewType0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(searchViewType0);
    }

    @NotNull
    public final SearchViewType getViewType() {
        return this.viewType;
    }
}

