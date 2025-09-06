package com.kakao.tistory.presentation.screen.blog.main.contract;

import a5.b;
import androidx.compose.runtime.Immutable;
import com.kakao.tistory.presentation.common.graph.BarGraphItem;
import com.kakao.tistory.presentation.common.graph.TweenBarGraphValue;
import com.kakao.tistory.presentation.screen.item.Vendor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u000B\f\r\u000ER\u001A\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u001A\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\n\u0082\u0001\u0004\u000F\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem;", "", "list", "", "getList", "()Ljava/util/List;", "onClick", "Lkotlin/Function0;", "", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "RefererKeyword", "RefererLog", "Revenue", "Trend", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererKeyword;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererLog;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$Revenue;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$Trend;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface StatisticsItem {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @NotNull
        public static List getList(@NotNull StatisticsItem statisticsItem0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }

        @NotNull
        public static Function0 getOnClick(@NotNull StatisticsItem statisticsItem0) {
            return s0.a;
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B#\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0016\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000E\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR \u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u000BR \u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\r¨\u0006\""}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererKeyword;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem;", "Lkotlin/Function0;", "", "onClick", "", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererKeyword$Data;", "list", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/util/List;)V", "component1", "()Lkotlin/jvm/functions/Function0;", "component2", "()Ljava/util/List;", "copy", "(Lkotlin/jvm/functions/Function0;Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererKeyword;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/jvm/functions/Function0;", "getOnClick", "b", "Ljava/util/List;", "getList", "Data", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RefererKeyword implements StatisticsItem {
        @Immutable
        @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000E\u0010\tJ\u0010\u0010\u000F\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u000BJ\u001A\u0010\u0012\u001A\u00020\u00112\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u000B¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererKeyword$Data;", "", "", "keyword", "", "count", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererKeyword$Data;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getKeyword", "b", "I", "getCount", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Data {
            public static final int $stable;
            public final String a;
            public final int b;

            public Data(@NotNull String s, int v) {
                Intrinsics.checkNotNullParameter(s, "keyword");
                super();
                this.a = s;
                this.b = v;
            }

            @NotNull
            public final String component1() {
                return this.a;
            }

            public final int component2() {
                return this.b;
            }

            @NotNull
            public final Data copy(@NotNull String s, int v) {
                Intrinsics.checkNotNullParameter(s, "keyword");
                return new Data(s, v);
            }

            public static Data copy$default(Data statisticsItem$RefererKeyword$Data0, String s, int v, int v1, Object object0) {
                if((v1 & 1) != 0) {
                    s = statisticsItem$RefererKeyword$Data0.a;
                }
                if((v1 & 2) != 0) {
                    v = statisticsItem$RefererKeyword$Data0.b;
                }
                return statisticsItem$RefererKeyword$Data0.copy(s, v);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                if(!(object0 instanceof Data)) {
                    return false;
                }
                return Intrinsics.areEqual(this.a, ((Data)object0).a) ? this.b == ((Data)object0).b : false;
            }

            public final int getCount() {
                return this.b;
            }

            @NotNull
            public final String getKeyword() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return this.b + this.a.hashCode() * 0x1F;
            }

            @Override
            @NotNull
            public String toString() {
                return "Data(keyword=" + this.a + ", count=" + this.b + ")";
            }
        }

        public static final int $stable;
        public final Function0 a;
        public final List b;

        public RefererKeyword(@NotNull Function0 function00, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(function00, "onClick");
            Intrinsics.checkNotNullParameter(list0, "list");
            super();
            this.a = function00;
            this.b = list0;
        }

        @NotNull
        public final Function0 component1() {
            return this.a;
        }

        @NotNull
        public final List component2() {
            return this.b;
        }

        @NotNull
        public final RefererKeyword copy(@NotNull Function0 function00, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(function00, "onClick");
            Intrinsics.checkNotNullParameter(list0, "list");
            return new RefererKeyword(function00, list0);
        }

        public static RefererKeyword copy$default(RefererKeyword statisticsItem$RefererKeyword0, Function0 function00, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                function00 = statisticsItem$RefererKeyword0.a;
            }
            if((v & 2) != 0) {
                list0 = statisticsItem$RefererKeyword0.b;
            }
            return statisticsItem$RefererKeyword0.copy(function00, list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RefererKeyword)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((RefererKeyword)object0).a) ? Intrinsics.areEqual(this.b, ((RefererKeyword)object0).b) : false;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem
        @NotNull
        public List getList() {
            return this.b;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem
        @NotNull
        public Function0 getOnClick() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "RefererKeyword(onClick=" + this.a + ", list=" + this.b + ")";
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B#\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0016\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000E\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR \u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u000BR \u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\r¨\u0006\""}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererLog;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem;", "Lkotlin/Function0;", "", "onClick", "", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererLog$Data;", "list", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/util/List;)V", "component1", "()Lkotlin/jvm/functions/Function0;", "component2", "()Ljava/util/List;", "copy", "(Lkotlin/jvm/functions/Function0;Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererLog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/jvm/functions/Function0;", "getOnClick", "b", "Ljava/util/List;", "getList", "Data", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RefererLog implements StatisticsItem {
        @Immutable
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000B\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\nJ\u0012\u0010\f\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000E\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\nR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u0019\u001A\u0004\b\u001C\u0010\nR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u0019\u001A\u0004\b\u001E\u0010\nR\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010\u0019\u001A\u0004\b \u0010\n¨\u0006!"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererLog$Data;", "", "", "serviceIcon", "keyword", "refUrl", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererLog$Data;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getServiceIcon", "b", "getKeyword", "c", "getRefUrl", "d", "getTimestamp", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog.Data {
            public static final int $stable;
            public final String a;
            public final String b;
            public final String c;
            public final String d;

            public com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog.Data() {
                this(null, null, null, null, 15, null);
            }

            public com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog.Data(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3) {
                this.a = s;
                this.b = s1;
                this.c = s2;
                this.d = s3;
            }

            public com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog.Data(String s, String s1, String s2, String s3, int v, DefaultConstructorMarker defaultConstructorMarker0) {
                if((v & 1) != 0) {
                    s = null;
                }
                if((v & 2) != 0) {
                    s1 = null;
                }
                if((v & 4) != 0) {
                    s2 = null;
                }
                if((v & 8) != 0) {
                    s3 = null;
                }
                this(s, s1, s2, s3);
            }

            @Nullable
            public final String component1() {
                return this.a;
            }

            @Nullable
            public final String component2() {
                return this.b;
            }

            @Nullable
            public final String component3() {
                return this.c;
            }

            @Nullable
            public final String component4() {
                return this.d;
            }

            @NotNull
            public final com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog.Data copy(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3) {
                return new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog.Data(s, s1, s2, s3);
            }

            public static com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog.Data copy$default(com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog.Data statisticsItem$RefererLog$Data0, String s, String s1, String s2, String s3, int v, Object object0) {
                if((v & 1) != 0) {
                    s = statisticsItem$RefererLog$Data0.a;
                }
                if((v & 2) != 0) {
                    s1 = statisticsItem$RefererLog$Data0.b;
                }
                if((v & 4) != 0) {
                    s2 = statisticsItem$RefererLog$Data0.c;
                }
                if((v & 8) != 0) {
                    s3 = statisticsItem$RefererLog$Data0.d;
                }
                return statisticsItem$RefererLog$Data0.copy(s, s1, s2, s3);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                if(!(object0 instanceof com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog.Data)) {
                    return false;
                }
                if(!Intrinsics.areEqual(this.a, ((com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog.Data)object0).a)) {
                    return false;
                }
                if(!Intrinsics.areEqual(this.b, ((com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog.Data)object0).b)) {
                    return false;
                }
                return Intrinsics.areEqual(this.c, ((com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog.Data)object0).c) ? Intrinsics.areEqual(this.d, ((com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog.Data)object0).d) : false;
            }

            @Nullable
            public final String getKeyword() {
                return this.b;
            }

            @Nullable
            public final String getRefUrl() {
                return this.c;
            }

            @Nullable
            public final String getServiceIcon() {
                return this.a;
            }

            @Nullable
            public final String getTimestamp() {
                return this.d;
            }

            @Override
            public int hashCode() {
                int v = 0;
                int v1 = this.a == null ? 0 : this.a.hashCode();
                int v2 = this.b == null ? 0 : this.b.hashCode();
                int v3 = this.c == null ? 0 : this.c.hashCode();
                String s = this.d;
                if(s != null) {
                    v = s.hashCode();
                }
                return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
            }

            @Override
            @NotNull
            public String toString() {
                return b.r(b.w("Data(serviceIcon=", this.a, ", keyword=", this.b, ", refUrl="), this.c, ", timestamp=", this.d, ")");
            }
        }

        public static final int $stable;
        public final Function0 a;
        public final List b;

        public RefererLog(@NotNull Function0 function00, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(function00, "onClick");
            Intrinsics.checkNotNullParameter(list0, "list");
            super();
            this.a = function00;
            this.b = list0;
        }

        @NotNull
        public final Function0 component1() {
            return this.a;
        }

        @NotNull
        public final List component2() {
            return this.b;
        }

        @NotNull
        public final RefererLog copy(@NotNull Function0 function00, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(function00, "onClick");
            Intrinsics.checkNotNullParameter(list0, "list");
            return new RefererLog(function00, list0);
        }

        public static RefererLog copy$default(RefererLog statisticsItem$RefererLog0, Function0 function00, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                function00 = statisticsItem$RefererLog0.a;
            }
            if((v & 2) != 0) {
                list0 = statisticsItem$RefererLog0.b;
            }
            return statisticsItem$RefererLog0.copy(function00, list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RefererLog)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((RefererLog)object0).a) ? Intrinsics.areEqual(this.b, ((RefererLog)object0).b) : false;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem
        @NotNull
        public List getList() {
            return this.b;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem
        @NotNull
        public Function0 getOnClick() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "RefererLog(onClick=" + this.a + ", list=" + this.b + ")";
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B#\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0016\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000E\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR \u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u000BR \u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\r¨\u0006\""}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$Revenue;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem;", "Lkotlin/Function0;", "", "onClick", "", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$Revenue$Data;", "list", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/util/List;)V", "component1", "()Lkotlin/jvm/functions/Function0;", "component2", "()Ljava/util/List;", "copy", "(Lkotlin/jvm/functions/Function0;Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$Revenue;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/jvm/functions/Function0;", "getOnClick", "b", "Ljava/util/List;", "getList", "Data", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Revenue implements StatisticsItem {
        @Immutable
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000BJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u000B¨\u0006\u001C"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$Revenue$Data;", "", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "vendor", "", "earning", "<init>", "(Lcom/kakao/tistory/presentation/screen/item/Vendor;Ljava/lang/String;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/item/Vendor;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/kakao/tistory/presentation/screen/item/Vendor;Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$Revenue$Data;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "getVendor", "b", "Ljava/lang/String;", "getEarning", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data {
            public static final int $stable;
            public final Vendor a;
            public final String b;

            public com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data(@NotNull Vendor vendor0, @NotNull String s) {
                Intrinsics.checkNotNullParameter(vendor0, "vendor");
                Intrinsics.checkNotNullParameter(s, "earning");
                super();
                this.a = vendor0;
                this.b = s;
            }

            @NotNull
            public final Vendor component1() {
                return this.a;
            }

            @NotNull
            public final String component2() {
                return this.b;
            }

            @NotNull
            public final com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data copy(@NotNull Vendor vendor0, @NotNull String s) {
                Intrinsics.checkNotNullParameter(vendor0, "vendor");
                Intrinsics.checkNotNullParameter(s, "earning");
                return new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data(vendor0, s);
            }

            public static com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data copy$default(com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data statisticsItem$Revenue$Data0, Vendor vendor0, String s, int v, Object object0) {
                if((v & 1) != 0) {
                    vendor0 = statisticsItem$Revenue$Data0.a;
                }
                if((v & 2) != 0) {
                    s = statisticsItem$Revenue$Data0.b;
                }
                return statisticsItem$Revenue$Data0.copy(vendor0, s);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                if(!(object0 instanceof com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data)) {
                    return false;
                }
                return this.a == ((com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data)object0).a ? Intrinsics.areEqual(this.b, ((com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data)object0).b) : false;
            }

            @NotNull
            public final String getEarning() {
                return this.b;
            }

            @NotNull
            public final Vendor getVendor() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return this.b.hashCode() + this.a.hashCode() * 0x1F;
            }

            @Override
            @NotNull
            public String toString() {
                return "Data(vendor=" + this.a + ", earning=" + this.b + ")";
            }
        }

        public static final int $stable;
        public final Function0 a;
        public final List b;

        public Revenue(@NotNull Function0 function00, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(function00, "onClick");
            Intrinsics.checkNotNullParameter(list0, "list");
            super();
            this.a = function00;
            this.b = list0;
        }

        @NotNull
        public final Function0 component1() {
            return this.a;
        }

        @NotNull
        public final List component2() {
            return this.b;
        }

        @NotNull
        public final Revenue copy(@NotNull Function0 function00, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(function00, "onClick");
            Intrinsics.checkNotNullParameter(list0, "list");
            return new Revenue(function00, list0);
        }

        public static Revenue copy$default(Revenue statisticsItem$Revenue0, Function0 function00, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                function00 = statisticsItem$Revenue0.a;
            }
            if((v & 2) != 0) {
                list0 = statisticsItem$Revenue0.b;
            }
            return statisticsItem$Revenue0.copy(function00, list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Revenue)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((Revenue)object0).a) ? Intrinsics.areEqual(this.b, ((Revenue)object0).b) : false;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem
        @NotNull
        public List getList() {
            return this.b;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem
        @NotNull
        public Function0 getOnClick() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "Revenue(onClick=" + this.a + ", list=" + this.b + ")";
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000F\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u001C\u0010\r\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ6\u0010\u000F\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR \u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\fR&\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000ER\u0017\u0010\'\u001A\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R\u0017\u0010*\u001A\u00020\"8\u0006¢\u0006\f\n\u0004\b(\u0010$\u001A\u0004\b)\u0010&R\u0017\u0010-\u001A\u00020\"8\u0006¢\u0006\f\n\u0004\b+\u0010$\u001A\u0004\b,\u0010&R\u0017\u00100\u001A\u00020\"8\u0006¢\u0006\f\n\u0004\b.\u0010$\u001A\u0004\b/\u0010&¨\u00061"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$Trend;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem;", "Lkotlin/Function0;", "", "onClick", "", "Lcom/kakao/tistory/presentation/common/graph/BarGraphItem;", "Lcom/kakao/tistory/presentation/common/graph/TweenBarGraphValue;", "list", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/util/List;)V", "component1", "()Lkotlin/jvm/functions/Function0;", "component2", "()Ljava/util/List;", "copy", "(Lkotlin/jvm/functions/Function0;Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$Trend;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/jvm/functions/Function0;", "getOnClick", "b", "Ljava/util/List;", "getList", "", "c", "F", "getPv", "()F", "pv", "d", "getUv", "uv", "e", "getPvIncrease", "pvIncrease", "f", "getUvIncrease", "uvIncrease", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Trend implements StatisticsItem {
        public static final int $stable;
        public final Function0 a;
        public final List b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public Trend(@NotNull Function0 function00, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(function00, "onClick");
            float f3;
            float f2;
            float f1;
            Intrinsics.checkNotNullParameter(list0, "list");
            super();
            this.a = function00;
            this.b = list0;
            BarGraphItem barGraphItem0 = (BarGraphItem)CollectionsKt___CollectionsKt.firstOrNull(this.getList());
            float f = 0.0f;
            if(barGraphItem0 == null) {
                f1 = 0.0f;
            }
            else {
                TweenBarGraphValue tweenBarGraphValue0 = (TweenBarGraphValue)barGraphItem0.getValue();
                f1 = tweenBarGraphValue0 == null ? 0.0f : tweenBarGraphValue0.getFirstBarValue();
            }
            this.c = f1;
            BarGraphItem barGraphItem1 = (BarGraphItem)CollectionsKt___CollectionsKt.firstOrNull(this.getList());
            if(barGraphItem1 == null) {
                f2 = 0.0f;
            }
            else {
                TweenBarGraphValue tweenBarGraphValue1 = (TweenBarGraphValue)barGraphItem1.getValue();
                f2 = tweenBarGraphValue1 == null ? 0.0f : tweenBarGraphValue1.getSecondBarValue();
            }
            this.d = f2;
            BarGraphItem barGraphItem2 = (BarGraphItem)CollectionsKt___CollectionsKt.getOrNull(this.getList(), 1);
            if(barGraphItem2 == null) {
                f3 = 0.0f;
            }
            else {
                TweenBarGraphValue tweenBarGraphValue2 = (TweenBarGraphValue)barGraphItem2.getValue();
                f3 = tweenBarGraphValue2 == null ? 0.0f : tweenBarGraphValue2.getFirstBarValue();
            }
            this.e = f1 - f3;
            BarGraphItem barGraphItem3 = (BarGraphItem)CollectionsKt___CollectionsKt.getOrNull(this.getList(), 1);
            if(barGraphItem3 != null) {
                TweenBarGraphValue tweenBarGraphValue3 = (TweenBarGraphValue)barGraphItem3.getValue();
                if(tweenBarGraphValue3 != null) {
                    f = tweenBarGraphValue3.getSecondBarValue();
                }
            }
            this.f = f2 - f;
        }

        @NotNull
        public final Function0 component1() {
            return this.a;
        }

        @NotNull
        public final List component2() {
            return this.b;
        }

        @NotNull
        public final Trend copy(@NotNull Function0 function00, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(function00, "onClick");
            Intrinsics.checkNotNullParameter(list0, "list");
            return new Trend(function00, list0);
        }

        public static Trend copy$default(Trend statisticsItem$Trend0, Function0 function00, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                function00 = statisticsItem$Trend0.a;
            }
            if((v & 2) != 0) {
                list0 = statisticsItem$Trend0.b;
            }
            return statisticsItem$Trend0.copy(function00, list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Trend)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((Trend)object0).a) ? Intrinsics.areEqual(this.b, ((Trend)object0).b) : false;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem
        @NotNull
        public List getList() {
            return this.b;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem
        @NotNull
        public Function0 getOnClick() {
            return this.a;
        }

        public final float getPv() {
            return this.c;
        }

        public final float getPvIncrease() {
            return this.e;
        }

        public final float getUv() {
            return this.d;
        }

        public final float getUvIncrease() {
            return this.f;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "Trend(onClick=" + this.a + ", list=" + this.b + ")";
        }
    }

    @NotNull
    List getList();

    @NotNull
    Function0 getOnClick();
}

