package com.kakao.tistory.presentation.screen.blog.main.contract;

import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0010\b\u0002\u0010\n\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0016\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0016\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00050\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u000EJ\u0016\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00070\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u000EJ\u0018\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u000EJR\u0010\u0012\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00022\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00022\u0010\b\u0002\u0010\n\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0014H\u00D6\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0017H\u00D6\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001C\u001A\u00020\u001B2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DR\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\u000ER\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006\u00A2\u0006\f\n\u0004\b!\u0010\u001F\u001A\u0004\b\"\u0010\u000ER\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006\u00A2\u0006\f\n\u0004\b#\u0010\u001F\u001A\u0004\b$\u0010\u000ER\u001F\u0010\n\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b%\u0010\u001F\u001A\u0004\b&\u0010\u000ER\u001D\u0010-\u001A\b\u0012\u0004\u0012\u00020(0\'8\u0006\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,\u00A8\u0006."}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainStatistics;", "", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$Trend;", "trend", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererLog;", "refererLog", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererKeyword;", "refererKeyword", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$Revenue;", "revenue", "<init>", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState;Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState;Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState;Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState;", "component2", "component3", "component4", "copy", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState;Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState;Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState;Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainStatistics;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState;", "getTrend", "b", "getRefererLog", "c", "getRefererKeyword", "d", "getRevenue", "", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsType;", "e", "Ljava/util/List;", "getTypeList", "()Ljava/util/List;", "typeList", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogMainStatistics {
    public static final int $stable;
    public final StatisticsState a;
    public final StatisticsState b;
    public final StatisticsState c;
    public final StatisticsState d;
    public final List e;

    public BlogMainStatistics() {
        this(null, null, null, null, 15, null);
    }

    public BlogMainStatistics(@NotNull StatisticsState statisticsState0, @NotNull StatisticsState statisticsState1, @NotNull StatisticsState statisticsState2, @Nullable StatisticsState statisticsState3) {
        Intrinsics.checkNotNullParameter(statisticsState0, "trend");
        Intrinsics.checkNotNullParameter(statisticsState1, "refererLog");
        Intrinsics.checkNotNullParameter(statisticsState2, "refererKeyword");
        super();
        this.a = statisticsState0;
        this.b = statisticsState1;
        this.c = statisticsState2;
        this.d = statisticsState3;
        this.e = CollectionsKt__CollectionsKt.listOfNotNull(new StatisticsType[]{StatisticsType.TREND, StatisticsType.REFERER_LOG, StatisticsType.REFERER_KEYWORD, (statisticsState3 == null ? null : StatisticsType.REVENUE)});
    }

    public BlogMainStatistics(StatisticsState statisticsState0, StatisticsState statisticsState1, StatisticsState statisticsState2, StatisticsState statisticsState3, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            statisticsState0 = Loading.INSTANCE;
        }
        if((v & 2) != 0) {
            statisticsState1 = Loading.INSTANCE;
        }
        if((v & 4) != 0) {
            statisticsState2 = Loading.INSTANCE;
        }
        if((v & 8) != 0) {
            statisticsState3 = null;
        }
        this(statisticsState0, statisticsState1, statisticsState2, statisticsState3);
    }

    @NotNull
    public final StatisticsState component1() {
        return this.a;
    }

    @NotNull
    public final StatisticsState component2() {
        return this.b;
    }

    @NotNull
    public final StatisticsState component3() {
        return this.c;
    }

    @Nullable
    public final StatisticsState component4() {
        return this.d;
    }

    @NotNull
    public final BlogMainStatistics copy(@NotNull StatisticsState statisticsState0, @NotNull StatisticsState statisticsState1, @NotNull StatisticsState statisticsState2, @Nullable StatisticsState statisticsState3) {
        Intrinsics.checkNotNullParameter(statisticsState0, "trend");
        Intrinsics.checkNotNullParameter(statisticsState1, "refererLog");
        Intrinsics.checkNotNullParameter(statisticsState2, "refererKeyword");
        return new BlogMainStatistics(statisticsState0, statisticsState1, statisticsState2, statisticsState3);
    }

    public static BlogMainStatistics copy$default(BlogMainStatistics blogMainStatistics0, StatisticsState statisticsState0, StatisticsState statisticsState1, StatisticsState statisticsState2, StatisticsState statisticsState3, int v, Object object0) {
        if((v & 1) != 0) {
            statisticsState0 = blogMainStatistics0.a;
        }
        if((v & 2) != 0) {
            statisticsState1 = blogMainStatistics0.b;
        }
        if((v & 4) != 0) {
            statisticsState2 = blogMainStatistics0.c;
        }
        if((v & 8) != 0) {
            statisticsState3 = blogMainStatistics0.d;
        }
        return blogMainStatistics0.copy(statisticsState0, statisticsState1, statisticsState2, statisticsState3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlogMainStatistics)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((BlogMainStatistics)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((BlogMainStatistics)object0).b)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((BlogMainStatistics)object0).c) ? Intrinsics.areEqual(this.d, ((BlogMainStatistics)object0).d) : false;
    }

    @NotNull
    public final StatisticsState getRefererKeyword() {
        return this.c;
    }

    @NotNull
    public final StatisticsState getRefererLog() {
        return this.b;
    }

    @Nullable
    public final StatisticsState getRevenue() {
        return this.d;
    }

    @NotNull
    public final StatisticsState getTrend() {
        return this.a;
    }

    @NotNull
    public final List getTypeList() {
        return this.e;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        int v2 = this.c.hashCode();
        return this.d == null ? (v2 + (v1 + v * 0x1F) * 0x1F) * 0x1F : (v2 + (v1 + v * 0x1F) * 0x1F) * 0x1F + this.d.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "BlogMainStatistics(trend=" + this.a + ", refererLog=" + this.b + ", refererKeyword=" + this.c + ", revenue=" + this.d + ")";
    }
}

