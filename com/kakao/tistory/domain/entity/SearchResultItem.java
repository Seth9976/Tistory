package com.kakao.tistory.domain.entity;

import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.domain.entity.viewtype.SearchResultViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000F\b\u0004\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000B\f\r\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/tistory/domain/entity/SearchResultItem;", "", "viewType", "Lcom/kakao/tistory/domain/entity/viewtype/SearchResultViewType;", "(Lcom/kakao/tistory/domain/entity/viewtype/SearchResultViewType;)V", "getViewType", "()Lcom/kakao/tistory/domain/entity/viewtype/SearchResultViewType;", "BlogItem", "Empty", "Post", "Top", "Lcom/kakao/tistory/domain/entity/SearchResultItem$BlogItem;", "Lcom/kakao/tistory/domain/entity/SearchResultItem$Empty;", "Lcom/kakao/tistory/domain/entity/SearchResultItem$Post;", "Lcom/kakao/tistory/domain/entity/SearchResultItem$Top;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class SearchResultItem {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000B\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/domain/entity/SearchResultItem$BlogItem;", "Lcom/kakao/tistory/domain/entity/SearchResultItem;", "blogItem", "Lcom/kakao/tistory/domain/entity/Blog;", "(Lcom/kakao/tistory/domain/entity/Blog;)V", "getBlogItem", "()Lcom/kakao/tistory/domain/entity/Blog;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class BlogItem extends SearchResultItem {
        @Nullable
        private final Blog blogItem;

        public BlogItem() {
            this(null, 1, null);
        }

        public BlogItem(@Nullable Blog blog0) {
            super(SearchResultViewType.BLOG, null);
            this.blogItem = blog0;
        }

        public BlogItem(Blog blog0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                blog0 = null;
            }
            this(blog0);
        }

        @Nullable
        public final Blog component1() {
            return this.blogItem;
        }

        @NotNull
        public final BlogItem copy(@Nullable Blog blog0) {
            return new BlogItem(blog0);
        }

        public static BlogItem copy$default(BlogItem searchResultItem$BlogItem0, Blog blog0, int v, Object object0) {
            if((v & 1) != 0) {
                blog0 = searchResultItem$BlogItem0.blogItem;
            }
            return searchResultItem$BlogItem0.copy(blog0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof BlogItem ? Intrinsics.areEqual(this.blogItem, ((BlogItem)object0).blogItem) : false;
        }

        @Nullable
        public final Blog getBlogItem() {
            return this.blogItem;
        }

        @Override
        public int hashCode() {
            return this.blogItem == null ? 0 : this.blogItem.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "BlogItem(blogItem=" + this.blogItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/tistory/domain/entity/SearchResultItem$Empty;", "Lcom/kakao/tistory/domain/entity/SearchResultItem;", "()V", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Empty extends SearchResultItem {
        public Empty() {
            super(SearchResultViewType.EMPTY, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000B\u0010\b\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001A\u00020\u000B2\b\u0010\f\u001A\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000E\u001A\u00020\u000FHÖ\u0001J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001R\u001C\u0010\u0002\u001A\u0004\u0018\u00010\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/domain/entity/SearchResultItem$Post;", "Lcom/kakao/tistory/domain/entity/SearchResultItem;", "entryItem", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "(Lcom/kakao/tistory/domain/entity/entry/EntryItem;)V", "getEntryItem", "()Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "setEntryItem", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Post extends SearchResultItem {
        @Nullable
        private EntryItem entryItem;

        public Post() {
            this(null, 1, null);
        }

        public Post(@Nullable EntryItem entryItem0) {
            super(SearchResultViewType.POST, null);
            this.entryItem = entryItem0;
        }

        public Post(EntryItem entryItem0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                entryItem0 = null;
            }
            this(entryItem0);
        }

        @Nullable
        public final EntryItem component1() {
            return this.entryItem;
        }

        @NotNull
        public final Post copy(@Nullable EntryItem entryItem0) {
            return new Post(entryItem0);
        }

        public static Post copy$default(Post searchResultItem$Post0, EntryItem entryItem0, int v, Object object0) {
            if((v & 1) != 0) {
                entryItem0 = searchResultItem$Post0.entryItem;
            }
            return searchResultItem$Post0.copy(entryItem0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Post ? Intrinsics.areEqual(this.entryItem, ((Post)object0).entryItem) : false;
        }

        @Nullable
        public final EntryItem getEntryItem() {
            return this.entryItem;
        }

        @Override
        public int hashCode() {
            return this.entryItem == null ? 0 : this.entryItem.hashCode();
        }

        public final void setEntryItem(@Nullable EntryItem entryItem0) {
            this.entryItem = entryItem0;
        }

        @Override
        @NotNull
        public String toString() {
            return "Post(entryItem=" + this.entryItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0007HÆ\u0003J)\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00072\b\u0010\u0013\u001A\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/domain/entity/SearchResultItem$Top;", "Lcom/kakao/tistory/domain/entity/SearchResultItem;", "totalCount", "", "blogName", "", "isShowSortSelector", "", "(JLjava/lang/String;Z)V", "getBlogName", "()Ljava/lang/String;", "()Z", "getTotalCount", "()J", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Top extends SearchResultItem {
        @Nullable
        private final String blogName;
        private final boolean isShowSortSelector;
        private final long totalCount;

        public Top() {
            this(0L, null, false, 7, null);
        }

        public Top(long v, @Nullable String s, boolean z) {
            super(SearchResultViewType.TOP, null);
            this.totalCount = v;
            this.blogName = s;
            this.isShowSortSelector = z;
        }

        public Top(long v, String s, boolean z, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = 0L;
            }
            if((v1 & 2) != 0) {
                s = null;
            }
            if((v1 & 4) != 0) {
                z = false;
            }
            this(v, s, z);
        }

        public final long component1() {
            return this.totalCount;
        }

        @Nullable
        public final String component2() {
            return this.blogName;
        }

        public final boolean component3() {
            return this.isShowSortSelector;
        }

        @NotNull
        public final Top copy(long v, @Nullable String s, boolean z) {
            return new Top(v, s, z);
        }

        public static Top copy$default(Top searchResultItem$Top0, long v, String s, boolean z, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = searchResultItem$Top0.totalCount;
            }
            if((v1 & 2) != 0) {
                s = searchResultItem$Top0.blogName;
            }
            if((v1 & 4) != 0) {
                z = searchResultItem$Top0.isShowSortSelector;
            }
            return searchResultItem$Top0.copy(v, s, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Top)) {
                return false;
            }
            if(this.totalCount != ((Top)object0).totalCount) {
                return false;
            }
            return Intrinsics.areEqual(this.blogName, ((Top)object0).blogName) ? this.isShowSortSelector == ((Top)object0).isShowSortSelector : false;
        }

        @Nullable
        public final String getBlogName() {
            return this.blogName;
        }

        public final long getTotalCount() {
            return this.totalCount;
        }

        @Override
        public int hashCode() {
            int v = Long.hashCode(this.totalCount);
            return this.blogName == null ? Boolean.hashCode(this.isShowSortSelector) + v * 961 : Boolean.hashCode(this.isShowSortSelector) + (v * 0x1F + this.blogName.hashCode()) * 0x1F;
        }

        public final boolean isShowSortSelector() {
            return this.isShowSortSelector;
        }

        @Override
        @NotNull
        public String toString() {
            return "Top(totalCount=" + this.totalCount + ", blogName=" + this.blogName + ", isShowSortSelector=" + this.isShowSortSelector + ")";
        }
    }

    @NotNull
    private final SearchResultViewType viewType;

    private SearchResultItem(SearchResultViewType searchResultViewType0) {
        this.viewType = searchResultViewType0;
    }

    public SearchResultItem(SearchResultViewType searchResultViewType0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(searchResultViewType0);
    }

    @NotNull
    public final SearchResultViewType getViewType() {
        return this.viewType;
    }
}

