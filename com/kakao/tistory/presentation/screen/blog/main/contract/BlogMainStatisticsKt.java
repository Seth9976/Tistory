package com.kakao.tistory.presentation.screen.blog.main.contract;

import androidx.room.a;
import com.kakao.tistory.domain.blog.entity.RefererKeyword;
import com.kakao.tistory.domain.blog.entity.RefererLog;
import com.kakao.tistory.domain.blog.entity.Trend;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.revenue.entity.RevenueCurrent;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.NumberExtensionKt;
import com.kakao.tistory.presentation.common.graph.BarGraphItem;
import com.kakao.tistory.presentation.common.graph.TweenBarGraphValue;
import com.kakao.tistory.presentation.common.utils.DateUtils;
import com.kakao.tistory.presentation.screen.item.Vendor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.c;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A1\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\b\u0010\t\u001A1\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\u0006*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00010\u00002\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\f\u0010\t\u001A1\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\u0006*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00010\u00002\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u000F\u0010\t\u001A3\u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0006*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00010\u00002\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/domain/entity/common/Result;", "", "Lcom/kakao/tistory/domain/blog/entity/Trend;", "Lkotlin/Function0;", "", "onClick", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$Trend;", "toStatisticsTrendState", "(Lcom/kakao/tistory/domain/entity/common/Result;Lkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsState;", "Lcom/kakao/tistory/domain/blog/entity/RefererLog;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererLog;", "toStatisticsRefererLogState", "Lcom/kakao/tistory/domain/blog/entity/RefererKeyword;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererKeyword;", "toStatisticsRefererKeywordState", "Lcom/kakao/tistory/domain/revenue/entity/RevenueCurrent;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$Revenue;", "toStatisticsRevenueState", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogMainStatistics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogMainStatistics.kt\ncom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainStatisticsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1054#2:222\n1549#2:223\n1620#2,3:224\n1549#2:227\n1620#2,3:228\n1603#2,9:231\n1855#2:240\n1856#2:242\n1612#2:243\n1603#2,9:244\n1855#2:253\n1856#2:255\n1612#2:256\n1#3:241\n1#3:254\n*S KotlinDebug\n*F\n+ 1 BlogMainStatistics.kt\ncom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainStatisticsKt\n*L\n114#1:222\n114#1:223\n114#1:224,3\n138#1:227\n138#1:228,3\n166#1:231,9\n166#1:240\n166#1:242\n166#1:243\n195#1:244,9\n195#1:253\n195#1:255\n195#1:256\n166#1:241\n195#1:254\n*E\n"})
public final class BlogMainStatisticsKt {
    @NotNull
    public static final StatisticsState toStatisticsRefererKeywordState(@NotNull Result result0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(result0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "onClick");
        if(result0 instanceof Success) {
            List list0 = (List)((Success)result0).getData();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                RefererKeyword refererKeyword0 = (RefererKeyword)object0;
                Data statisticsItem$RefererKeyword$Data0 = p.isBlank("") || refererKeyword0.getCount() <= 0L ? null : new Data("", ((int)refererKeyword0.getCount()));
                if(statisticsItem$RefererKeyword$Data0 != null) {
                    arrayList0.add(statisticsItem$RefererKeyword$Data0);
                }
            }
            return arrayList0.isEmpty() ? new Error(null, string.label_blog_statistics_referer_keyword_empty, 1, null) : new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsState.Success(new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword(function00, arrayList0));
        }
        if(!(result0 instanceof Fail)) {
            throw new NoWhenBranchMatchedException();
        }
        return new Error(((Fail)result0).getErrorModel().getTitle(), null, 2, null);
    }

    @NotNull
    public static final StatisticsState toStatisticsRefererLogState(@NotNull Result result0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(result0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "onClick");
        if(result0 instanceof Success) {
            List list0 = (List)((Success)result0).getData();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object0: list0) {
                arrayList0.add(new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog.Data(((RefererLog)object0).getServiceIcon(), ((RefererLog)object0).getKeyword(), ((RefererLog)object0).getRefUrl(), ((RefererLog)object0).getTimestamp()));
            }
            return arrayList0.isEmpty() ? new Error(null, string.label_blog_statistics_referer_log_empty, 1, null) : new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsState.Success(new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog(function00, arrayList0));
        }
        if(!(result0 instanceof Fail)) {
            throw new NoWhenBranchMatchedException();
        }
        return new Error(((Fail)result0).getErrorModel().getTitle(), null, 2, null);
    }

    @Nullable
    public static final StatisticsState toStatisticsRevenueState(@NotNull Result result0, @NotNull Function0 function00) {
        com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data statisticsItem$Revenue$Data0;
        String s;
        Intrinsics.checkNotNullParameter(result0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "onClick");
        if(result0 instanceof Success) {
            List list0 = (List)((Success)result0).getData();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                RevenueCurrent revenueCurrent0 = (RevenueCurrent)object0;
                Vendor vendor0 = Vendor.Companion.valueOfName(revenueCurrent0.getVendor());
                if(vendor0 == null) {
                    statisticsItem$Revenue$Data0 = null;
                }
                else {
                    if(revenueCurrent0.isConnected()) {
                        Double double0 = revenueCurrent0.getEarnings();
                        s = a.z(revenueCurrent0.getCurrency(), NumberExtensionKt.numberFormatOfCurrency(((double)(double0 == null ? 0.0 : ((double)double0))), revenueCurrent0.getCurrency()));
                    }
                    else {
                        s = "-";
                    }
                    statisticsItem$Revenue$Data0 = new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data(vendor0, s);
                }
                if(statisticsItem$Revenue$Data0 != null) {
                    arrayList0.add(statisticsItem$Revenue$Data0);
                }
            }
            return arrayList0.isEmpty() ? null : new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsState.Success(new Revenue(function00, arrayList0));
        }
        if(!(result0 instanceof Fail)) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    @NotNull
    public static final StatisticsState toStatisticsTrendState(@NotNull Result result0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(result0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "onClick");
        if(result0 instanceof Success) {
            List list0 = CollectionsKt___CollectionsKt.sortedWith(((List)((Success)result0).getData()), new Comparator() {
                @Override
                public final int compare(Object object0, Object object1) {
                    return c.compareValues(((Trend)object1).getTimestamp(), ((Trend)object0).getTimestamp());
                }
            });
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object0: list0) {
                String s = ((Trend)object0).getTimestamp();
                arrayList0.add(new BarGraphItem(DateUtils.INSTANCE.getRelativeDay(s), "", null, new TweenBarGraphValue(((Trend)object0).getPv(), ((Trend)object0).getUv()), 4, null));
            }
            return new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsState.Success(new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Trend(function00, arrayList0));
        }
        if(!(result0 instanceof Fail)) {
            throw new NoWhenBranchMatchedException();
        }
        return new Error(((Fail)result0).getErrorModel().getTitle(), null, 2, null);
    }
}

