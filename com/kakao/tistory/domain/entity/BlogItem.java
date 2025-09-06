package com.kakao.tistory.domain.entity;

import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.domain.entity.viewtype.BlogViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000BB\u000F\b\u0004\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000E\u000F\u0010¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/domain/entity/BlogItem;", "", "type", "Lcom/kakao/tistory/domain/entity/viewtype/BlogViewType;", "(Lcom/kakao/tistory/domain/entity/viewtype/BlogViewType;)V", "getType", "()Lcom/kakao/tistory/domain/entity/viewtype/BlogViewType;", "Category", "Empty", "Notice", "Post", "Top", "Lcom/kakao/tistory/domain/entity/BlogItem$Category;", "Lcom/kakao/tistory/domain/entity/BlogItem$Empty;", "Lcom/kakao/tistory/domain/entity/BlogItem$Notice;", "Lcom/kakao/tistory/domain/entity/BlogItem$Post;", "Lcom/kakao/tistory/domain/entity/BlogItem$Top;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class BlogItem {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/domain/entity/BlogItem$Category;", "Lcom/kakao/tistory/domain/entity/BlogItem;", "categoryItem", "Lcom/kakao/tistory/domain/entity/CategoryItem;", "(Lcom/kakao/tistory/domain/entity/CategoryItem;)V", "getCategoryItem", "()Lcom/kakao/tistory/domain/entity/CategoryItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Category extends BlogItem {
        @NotNull
        private final CategoryItem categoryItem;

        public Category(@NotNull CategoryItem categoryItem0) {
            Intrinsics.checkNotNullParameter(categoryItem0, "categoryItem");
            super(BlogViewType.CATEGORY, null);
            this.categoryItem = categoryItem0;
        }

        @NotNull
        public final CategoryItem component1() {
            return this.categoryItem;
        }

        @NotNull
        public final Category copy(@NotNull CategoryItem categoryItem0) {
            Intrinsics.checkNotNullParameter(categoryItem0, "categoryItem");
            return new Category(categoryItem0);
        }

        public static Category copy$default(Category blogItem$Category0, CategoryItem categoryItem0, int v, Object object0) {
            if((v & 1) != 0) {
                categoryItem0 = blogItem$Category0.categoryItem;
            }
            return blogItem$Category0.copy(categoryItem0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Category ? Intrinsics.areEqual(this.categoryItem, ((Category)object0).categoryItem) : false;
        }

        @NotNull
        public final CategoryItem getCategoryItem() {
            return this.categoryItem;
        }

        @Override
        public int hashCode() {
            return this.categoryItem.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "Category(categoryItem=" + this.categoryItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/tistory/domain/entity/BlogItem$Empty;", "Lcom/kakao/tistory/domain/entity/BlogItem;", "()V", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Empty extends BlogItem {
        @NotNull
        public static final Empty INSTANCE;

        static {
            Empty.INSTANCE = new Empty();
        }

        private Empty() {
            super(BlogViewType.EMPTY, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001B\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000B\u0010\u000B\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0005HÆ\u0003J\u001F\u0010\r\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u00052\b\u0010\u000F\u001A\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/domain/entity/BlogItem$Notice;", "Lcom/kakao/tistory/domain/entity/BlogItem;", "noticeItem", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "hasMoreItems", "", "(Lcom/kakao/tistory/domain/entity/entry/EntryItem;Z)V", "getHasMoreItems", "()Z", "getNoticeItem", "()Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Notice extends BlogItem {
        private final boolean hasMoreItems;
        @Nullable
        private final EntryItem noticeItem;

        public Notice() {
            this(null, false, 3, null);
        }

        public Notice(@Nullable EntryItem entryItem0, boolean z) {
            super(BlogViewType.NOTICE, null);
            this.noticeItem = entryItem0;
            this.hasMoreItems = z;
        }

        public Notice(EntryItem entryItem0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                entryItem0 = null;
            }
            if((v & 2) != 0) {
                z = false;
            }
            this(entryItem0, z);
        }

        @Nullable
        public final EntryItem component1() {
            return this.noticeItem;
        }

        public final boolean component2() {
            return this.hasMoreItems;
        }

        @NotNull
        public final Notice copy(@Nullable EntryItem entryItem0, boolean z) {
            return new Notice(entryItem0, z);
        }

        public static Notice copy$default(Notice blogItem$Notice0, EntryItem entryItem0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                entryItem0 = blogItem$Notice0.noticeItem;
            }
            if((v & 2) != 0) {
                z = blogItem$Notice0.hasMoreItems;
            }
            return blogItem$Notice0.copy(entryItem0, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Notice)) {
                return false;
            }
            return Intrinsics.areEqual(this.noticeItem, ((Notice)object0).noticeItem) ? this.hasMoreItems == ((Notice)object0).hasMoreItems : false;
        }

        public final boolean getHasMoreItems() {
            return this.hasMoreItems;
        }

        @Nullable
        public final EntryItem getNoticeItem() {
            return this.noticeItem;
        }

        @Override
        public int hashCode() {
            return this.noticeItem == null ? Boolean.hashCode(this.hasMoreItems) : Boolean.hashCode(this.hasMoreItems) + this.noticeItem.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "Notice(noticeItem=" + this.noticeItem + ", hasMoreItems=" + this.hasMoreItems + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000B\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/domain/entity/BlogItem$Post;", "Lcom/kakao/tistory/domain/entity/BlogItem;", "entryItem", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "(Lcom/kakao/tistory/domain/entity/entry/EntryItem;)V", "getEntryItem", "()Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Post extends BlogItem {
        @Nullable
        private final EntryItem entryItem;

        public Post() {
            this(null, 1, null);
        }

        public Post(@Nullable EntryItem entryItem0) {
            super(BlogViewType.ENTRY, null);
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

        public static Post copy$default(Post blogItem$Post0, EntryItem entryItem0, int v, Object object0) {
            if((v & 1) != 0) {
                entryItem0 = blogItem$Post0.entryItem;
            }
            return blogItem$Post0.copy(entryItem0);
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

        @Override
        @NotNull
        public String toString() {
            return "Post(entryItem=" + this.entryItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000B\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/domain/entity/BlogItem$Top;", "Lcom/kakao/tistory/domain/entity/BlogItem;", "blog", "Lcom/kakao/tistory/domain/entity/Blog;", "(Lcom/kakao/tistory/domain/entity/Blog;)V", "getBlog", "()Lcom/kakao/tistory/domain/entity/Blog;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Top extends BlogItem {
        @Nullable
        private final Blog blog;

        public Top() {
            this(null, 1, null);
        }

        public Top(@Nullable Blog blog0) {
            super(BlogViewType.TOP, null);
            this.blog = blog0;
        }

        public Top(Blog blog0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                blog0 = null;
            }
            this(blog0);
        }

        @Nullable
        public final Blog component1() {
            return this.blog;
        }

        @NotNull
        public final Top copy(@Nullable Blog blog0) {
            return new Top(blog0);
        }

        public static Top copy$default(Top blogItem$Top0, Blog blog0, int v, Object object0) {
            if((v & 1) != 0) {
                blog0 = blogItem$Top0.blog;
            }
            return blogItem$Top0.copy(blog0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Top ? Intrinsics.areEqual(this.blog, ((Top)object0).blog) : false;
        }

        @Nullable
        public final Blog getBlog() {
            return this.blog;
        }

        @Override
        public int hashCode() {
            return this.blog == null ? 0 : this.blog.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "Top(blog=" + this.blog + ")";
        }
    }

    @NotNull
    private final BlogViewType type;

    private BlogItem(BlogViewType blogViewType0) {
        this.type = blogViewType0;
    }

    public BlogItem(BlogViewType blogViewType0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(blogViewType0);
    }

    @NotNull
    public final BlogViewType getType() {
        return this.type;
    }
}

