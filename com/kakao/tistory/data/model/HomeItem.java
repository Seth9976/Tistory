package com.kakao.tistory.data.model;

import a5.b;
import com.kakao.tistory.data.model.viewtype.HomeViewType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\r\u000E\u000F\u0010\u0011B\u001B\b\u0004\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001C\u0010\u0004\u001A\u0004\u0018\u00010\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\f\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/data/model/HomeItem;", "", "homeViewType", "Lcom/kakao/tistory/data/model/viewtype/HomeViewType;", "exception", "", "(Lcom/kakao/tistory/data/model/viewtype/HomeViewType;Ljava/lang/String;)V", "getException", "()Ljava/lang/String;", "setException", "(Ljava/lang/String;)V", "getHomeViewType", "()Lcom/kakao/tistory/data/model/viewtype/HomeViewType;", "BlogFollower", "RecentPost", "Statistics", "TopMessage", "TopPost", "Lcom/kakao/tistory/data/model/HomeItem$BlogFollower;", "Lcom/kakao/tistory/data/model/HomeItem$RecentPost;", "Lcom/kakao/tistory/data/model/HomeItem$Statistics;", "Lcom/kakao/tistory/data/model/HomeItem$TopMessage;", "Lcom/kakao/tistory/data/model/HomeItem$TopPost;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class HomeItem {
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001B\u0010\n\u001A\u00020\u00002\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u000EHÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001R\"\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/data/model/HomeItem$BlogFollower;", "Lcom/kakao/tistory/data/model/HomeItem;", "items", "", "Lcom/kakao/tistory/domain/entity/User;", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "setItems", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class BlogFollower extends HomeItem {
        @Nullable
        private List items;

        public BlogFollower() {
            this(null, 1, null);
        }

        public BlogFollower(@Nullable List list0) {
            super(HomeViewType.BLOG_FOLLOWER, null, 2, null);
            this.items = list0;
        }

        public BlogFollower(List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                list0 = null;
            }
            this(list0);
        }

        @Nullable
        public final List component1() {
            return this.items;
        }

        @NotNull
        public final BlogFollower copy(@Nullable List list0) {
            return new BlogFollower(list0);
        }

        public static BlogFollower copy$default(BlogFollower homeItem$BlogFollower0, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                list0 = homeItem$BlogFollower0.items;
            }
            return homeItem$BlogFollower0.copy(list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof BlogFollower ? Intrinsics.areEqual(this.items, ((BlogFollower)object0).items) : false;
        }

        @Nullable
        public final List getItems() {
            return this.items;
        }

        @Override
        public int hashCode() {
            return this.items == null ? 0 : this.items.hashCode();
        }

        public final void setItems(@Nullable List list0) {
            this.items = list0;
        }

        @Override
        @NotNull
        public String toString() {
            return "BlogFollower(items=" + this.items + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001B\u0010\n\u001A\u00020\u00002\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u000EHÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001R\"\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/data/model/HomeItem$RecentPost;", "Lcom/kakao/tistory/data/model/HomeItem;", "items", "", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "setItems", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RecentPost extends HomeItem {
        @Nullable
        private List items;

        public RecentPost() {
            this(null, 1, null);
        }

        public RecentPost(@Nullable List list0) {
            super(HomeViewType.RECENT_POST, null, 2, null);
            this.items = list0;
        }

        public RecentPost(List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                list0 = null;
            }
            this(list0);
        }

        @Nullable
        public final List component1() {
            return this.items;
        }

        @NotNull
        public final RecentPost copy(@Nullable List list0) {
            return new RecentPost(list0);
        }

        public static RecentPost copy$default(RecentPost homeItem$RecentPost0, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                list0 = homeItem$RecentPost0.items;
            }
            return homeItem$RecentPost0.copy(list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RecentPost ? Intrinsics.areEqual(this.items, ((RecentPost)object0).items) : false;
        }

        @Nullable
        public final List getItems() {
            return this.items;
        }

        @Override
        public int hashCode() {
            return this.items == null ? 0 : this.items.hashCode();
        }

        public final void setItems(@Nullable List list0) {
            this.items = list0;
        }

        @Override
        @NotNull
        public String toString() {
            return "RecentPost(items=" + this.items + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u0012\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\u000F\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001A\u00020\u001AHÖ\u0001J\t\u0010\u001B\u001A\u00020\u0003HÖ\u0001R\u001A\u0010\u0004\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR\u0017\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u001A\u0010\u0002\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000F\u0010\n\"\u0004\b\u0010\u0010\f¨\u0006\u001C"}, d2 = {"Lcom/kakao/tistory/data/model/HomeItem$Statistics;", "Lcom/kakao/tistory/data/model/HomeItem;", "title", "", "defaultDomain", "items", "", "Lcom/kakao/tistory/data/model/StatisticsItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDefaultDomain", "()Ljava/lang/String;", "setDefaultDomain", "(Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getTitle", "setTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Statistics extends HomeItem {
        @NotNull
        private String defaultDomain;
        @NotNull
        private final List items;
        @NotNull
        private String title;

        public Statistics() {
            this(null, null, null, 7, null);
        }

        public Statistics(@NotNull String s, @NotNull String s1, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "title");
            Intrinsics.checkNotNullParameter(s1, "defaultDomain");
            Intrinsics.checkNotNullParameter(list0, "items");
            super(HomeViewType.STATISTICS, null, 2, null);
            this.title = s;
            this.defaultDomain = s1;
            this.items = list0;
        }

        public Statistics(String s, String s1, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = "";
            }
            if((v & 2) != 0) {
                s1 = "";
            }
            if((v & 4) != 0) {
                list0 = new ArrayList();
            }
            this(s, s1, list0);
        }

        @NotNull
        public final String component1() {
            return this.title;
        }

        @NotNull
        public final String component2() {
            return this.defaultDomain;
        }

        @NotNull
        public final List component3() {
            return this.items;
        }

        @NotNull
        public final Statistics copy(@NotNull String s, @NotNull String s1, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "title");
            Intrinsics.checkNotNullParameter(s1, "defaultDomain");
            Intrinsics.checkNotNullParameter(list0, "items");
            return new Statistics(s, s1, list0);
        }

        public static Statistics copy$default(Statistics homeItem$Statistics0, String s, String s1, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeItem$Statistics0.title;
            }
            if((v & 2) != 0) {
                s1 = homeItem$Statistics0.defaultDomain;
            }
            if((v & 4) != 0) {
                list0 = homeItem$Statistics0.items;
            }
            return homeItem$Statistics0.copy(s, s1, list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Statistics)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.title, ((Statistics)object0).title)) {
                return false;
            }
            return Intrinsics.areEqual(this.defaultDomain, ((Statistics)object0).defaultDomain) ? Intrinsics.areEqual(this.items, ((Statistics)object0).items) : false;
        }

        @NotNull
        public final String getDefaultDomain() {
            return this.defaultDomain;
        }

        @NotNull
        public final List getItems() {
            return this.items;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @Override
        public int hashCode() {
            return this.items.hashCode() + q.c(this.title.hashCode() * 0x1F, 0x1F, this.defaultDomain);
        }

        public final void setDefaultDomain(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "<set-?>");
            this.defaultDomain = s;
        }

        public final void setTitle(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "<set-?>");
            this.title = s;
        }

        @Override
        @NotNull
        public String toString() {
            return a.e(b.w("Statistics(title=", this.title, ", defaultDomain=", this.defaultDomain, ", items="), this.items, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\n\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u001F\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/data/model/HomeItem$TopMessage;", "Lcom/kakao/tistory/data/model/HomeItem;", "message", "", "link", "(Ljava/lang/String;Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class TopMessage extends HomeItem {
        @Nullable
        private final String link;
        @NotNull
        private final String message;

        public TopMessage(@NotNull String s, @Nullable String s1) {
            Intrinsics.checkNotNullParameter(s, "message");
            super(HomeViewType.TOP_MESSAGE, null, 2, null);
            this.message = s;
            this.link = s1;
        }

        public TopMessage(String s, String s1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = "지금 당신의\n티스토리";
            }
            this(s, s1);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @Nullable
        public final String component2() {
            return this.link;
        }

        @NotNull
        public final TopMessage copy(@NotNull String s, @Nullable String s1) {
            Intrinsics.checkNotNullParameter(s, "message");
            return new TopMessage(s, s1);
        }

        public static TopMessage copy$default(TopMessage homeItem$TopMessage0, String s, String s1, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeItem$TopMessage0.message;
            }
            if((v & 2) != 0) {
                s1 = homeItem$TopMessage0.link;
            }
            return homeItem$TopMessage0.copy(s, s1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof TopMessage)) {
                return false;
            }
            return Intrinsics.areEqual(this.message, ((TopMessage)object0).message) ? Intrinsics.areEqual(this.link, ((TopMessage)object0).link) : false;
        }

        @Nullable
        public final String getLink() {
            return this.link;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @Override
        public int hashCode() {
            int v = this.message.hashCode();
            return this.link == null ? v * 0x1F : v * 0x1F + this.link.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "TopMessage(message=" + this.message + ", link=" + this.link + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\r\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001B\u0010\u0013\u001A\u00020\u00002\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001J\t\u0010\u001A\u001A\u00020\u0007HÖ\u0001R\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR\u001C\u0010\f\u001A\u0004\u0018\u00010\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\t\"\u0004\b\u000E\u0010\u000BR\"\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u001B"}, d2 = {"Lcom/kakao/tistory/data/model/HomeItem$TopPost;", "Lcom/kakao/tistory/data/model/HomeItem;", "items", "", "Lcom/kakao/tistory/data/model/StatisticsItem$TopPostItem;", "(Ljava/util/List;)V", "date", "", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "granularity", "getGranularity", "setGranularity", "getItems", "()Ljava/util/List;", "setItems", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class TopPost extends HomeItem {
        @Nullable
        private String date;
        @Nullable
        private String granularity;
        @Nullable
        private List items;

        public TopPost() {
            this(null, 1, null);
        }

        public TopPost(@Nullable List list0) {
            super(HomeViewType.TOP_POST, null, 2, null);
            this.items = list0;
        }

        public TopPost(List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                list0 = null;
            }
            this(list0);
        }

        @Nullable
        public final List component1() {
            return this.items;
        }

        @NotNull
        public final TopPost copy(@Nullable List list0) {
            return new TopPost(list0);
        }

        public static TopPost copy$default(TopPost homeItem$TopPost0, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                list0 = homeItem$TopPost0.items;
            }
            return homeItem$TopPost0.copy(list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof TopPost ? Intrinsics.areEqual(this.items, ((TopPost)object0).items) : false;
        }

        @Nullable
        public final String getDate() {
            return this.date;
        }

        @Nullable
        public final String getGranularity() {
            return this.granularity;
        }

        @Nullable
        public final List getItems() {
            return this.items;
        }

        @Override
        public int hashCode() {
            return this.items == null ? 0 : this.items.hashCode();
        }

        public final void setDate(@Nullable String s) {
            this.date = s;
        }

        public final void setGranularity(@Nullable String s) {
            this.granularity = s;
        }

        public final void setItems(@Nullable List list0) {
            this.items = list0;
        }

        @Override
        @NotNull
        public String toString() {
            return "TopPost(items=" + this.items + ")";
        }
    }

    @Nullable
    private String exception;
    @NotNull
    private final HomeViewType homeViewType;

    private HomeItem(HomeViewType homeViewType0, String s) {
        this.homeViewType = homeViewType0;
        this.exception = s;
    }

    public HomeItem(HomeViewType homeViewType0, String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            s = null;
        }
        this(homeViewType0, s, null);
    }

    public HomeItem(HomeViewType homeViewType0, String s, DefaultConstructorMarker defaultConstructorMarker0) {
        this(homeViewType0, s);
    }

    @Nullable
    public final String getException() {
        return this.exception;
    }

    @NotNull
    public final HomeViewType getHomeViewType() {
        return this.homeViewType;
    }

    public final void setException(@Nullable String s) {
        this.exception = s;
    }
}

