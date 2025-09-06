package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.kakao.android.base.BaseKt;
import com.kakao.android.base.utils.DateUtils.DateTimeFormat;
import com.kakao.android.base.utils.DateUtils;
import com.kakao.tistory.data.model.StatisticsItem.EmptyItem;
import com.kakao.tistory.data.model.StatisticsItem.RefererKeywordItem;
import com.kakao.tistory.data.model.StatisticsItem.RefererRankItem;
import com.kakao.tistory.data.model.StatisticsItem.Title;
import com.kakao.tistory.data.model.StatisticsItem.TopEntryItem;
import com.kakao.tistory.data.model.StatisticsItem.TopPostItem;
import com.kakao.tistory.data.model.StatisticsItem.Trend;
import com.kakao.tistory.data.model.viewtype.StatisticsViewType;
import com.kakao.tistory.data.repository.OldStatisticsRepository;
import com.kakao.tistory.domain.common.Thumbnail;
import com.kakao.tistory.domain.entity.SortItem.StatisticsMetricSortItem;
import com.kakao.tistory.domain.entity.SortItem.StatisticsSortItem;
import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.domain.entity.TrendItem;
import com.kakao.tistory.domain.entity.common.ItemListModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.statistics.entity.TopEntry;
import com.kakao.tistory.domain.statistics.usecase.GetTopEntriesUseCase;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.view.statistics.StatisticsTiara;
import com.kakao.tistory.presentation.viewmodel.base.TistoryListViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.b;
import kotlin.text.p;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000\u008E\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0081\u0001\u0082\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\r\u001A\u00020\f2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u00A2\u0006\u0004\b\r\u0010\u0011J\u0013\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00130\u0012\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00130\u0012\u00A2\u0006\u0004\b\u0016\u0010\u0015J%\u0010\u0019\u001A\u00020\f2\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0013\u00A2\u0006\u0004\b\u0019\u0010\u001AJ%\u0010\u001D\u001A\u00020\f2\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u0013\u00A2\u0006\u0004\b\u001D\u0010\u001AJ\r\u0010\u001E\u001A\u00020\f\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0015\u0010!\u001A\u00020\u000F2\u0006\u0010 \u001A\u00020\u000F\u00A2\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001A\u00020\u000F2\u0006\u0010$\u001A\u00020#\u00A2\u0006\u0004\b%\u0010&J\u0017\u0010)\u001A\u0004\u0018\u00010\f2\u0006\u0010(\u001A\u00020\'\u00A2\u0006\u0004\b)\u0010*J\r\u0010+\u001A\u00020\f\u00A2\u0006\u0004\b+\u0010\u001FJ\u0015\u0010.\u001A\u00020\f2\u0006\u0010-\u001A\u00020,\u00A2\u0006\u0004\b.\u0010/J\r\u00100\u001A\u00020\f\u00A2\u0006\u0004\b0\u0010\u001FJ\u0015\u00102\u001A\u00020\f2\u0006\u00101\u001A\u00020\u000F\u00A2\u0006\u0004\b2\u0010\u0011J\r\u00103\u001A\u00020\f\u00A2\u0006\u0004\b3\u0010\u001FR\u001F\u0010\u000B\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\n048\u0006\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u00108R\u001F\u0010;\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000F048\u0006\u00A2\u0006\f\n\u0004\b9\u00106\u001A\u0004\b:\u00108R\u001D\u0010>\u001A\b\u0012\u0004\u0012\u00020\u000F048\u0006\u00A2\u0006\f\n\u0004\b<\u00106\u001A\u0004\b=\u00108R\u001D\u0010A\u001A\b\u0012\u0004\u0012\u00020\u000F048\u0006\u00A2\u0006\f\n\u0004\b?\u00106\u001A\u0004\b@\u00108R\u001F\u0010D\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000F048\u0006\u00A2\u0006\f\n\u0004\bB\u00106\u001A\u0004\bC\u00108R%\u0010H\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020E\u0018\u00010\u0012048\u0006\u00A2\u0006\f\n\u0004\bF\u00106\u001A\u0004\bG\u00108R\u001F\u0010K\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000F048\u0006\u00A2\u0006\f\n\u0004\bI\u00106\u001A\u0004\bJ\u00108R\u001F\u0010N\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000F048\u0006\u00A2\u0006\f\n\u0004\bL\u00106\u001A\u0004\bM\u00108R\u001D\u0010R\u001A\b\u0012\u0004\u0012\u00020O048\u0006\u00A2\u0006\f\n\u0004\bP\u00106\u001A\u0004\bQ\u00108R\u001D\u0010U\u001A\b\u0012\u0004\u0012\u00020O048\u0006\u00A2\u0006\f\n\u0004\bS\u00106\u001A\u0004\bT\u00108R\u001D\u0010X\u001A\b\u0012\u0004\u0012\u00020\u000F048\u0006\u00A2\u0006\f\n\u0004\bV\u00106\u001A\u0004\bW\u00108R\u001D\u0010^\u001A\b\u0012\u0004\u0012\u00020\'0Y8\u0006\u00A2\u0006\f\n\u0004\bZ\u0010[\u001A\u0004\b\\\u0010]R\u001D\u0010d\u001A\b\u0012\u0004\u0012\u00020\'0_8\u0006\u00A2\u0006\f\n\u0004\b`\u0010a\u001A\u0004\bb\u0010cR#\u0010g\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u0012048\u0006\u00A2\u0006\f\n\u0004\be\u00106\u001A\u0004\bf\u00108R#\u0010j\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u0012048\u0006\u00A2\u0006\f\n\u0004\bh\u00106\u001A\u0004\bi\u00108R\u001D\u0010p\u001A\b\u0012\u0004\u0012\u00020\u000F0k8\u0006\u00A2\u0006\f\n\u0004\bl\u0010m\u001A\u0004\bn\u0010oR\u001F\u0010s\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010O0k8\u0006\u00A2\u0006\f\n\u0004\bq\u0010m\u001A\u0004\br\u0010oR\u001F\u0010v\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010O0k8\u0006\u00A2\u0006\f\n\u0004\bt\u0010m\u001A\u0004\bu\u0010oR\u001F\u0010y\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010O0k8\u0006\u00A2\u0006\f\n\u0004\bw\u0010m\u001A\u0004\bx\u0010oR\u001D\u0010|\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0z0k8F\u00A2\u0006\u0006\u001A\u0004\b{\u0010oR\u001F\u0010~\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0z0k8F\u00A2\u0006\u0006\u001A\u0004\b}\u0010oR\u001E\u0010\u0080\u0001\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0z0k8F\u00A2\u0006\u0006\u001A\u0004\b\u007F\u0010o\u00A8\u0006\u0083\u0001"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryListViewModel;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/data/repository/OldStatisticsRepository;", "statisticsRepository", "Lcom/kakao/tistory/domain/statistics/usecase/GetTopEntriesUseCase;", "getTopEntriesUseCase", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/data/repository/OldStatisticsRepository;Lcom/kakao/tistory/domain/statistics/usecase/GetTopEntriesUseCase;)V", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "entryItem", "", "init", "(Lcom/kakao/tistory/domain/entity/entry/EntryItem;)V", "", "blogName", "(Ljava/lang/String;)V", "", "Lcom/kakao/tistory/domain/entity/SortItem;", "getMetricSortItemList", "()Ljava/util/List;", "getSortItems", "sortItem", "metricSortItem", "updateSortType", "(Lcom/kakao/tistory/domain/entity/SortItem;Lcom/kakao/tistory/domain/entity/SortItem;)V", "selectedSortItem", "selectedMetricSortItem", "getStatistics", "getTrendMore", "()V", "timestamp", "getDateTimeForBarGraph", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/kakao/tistory/domain/entity/TrendItem;", "trendItem", "getDateTimeForBarGraphSub", "(Lcom/kakao/tistory/domain/entity/TrendItem;)Ljava/lang/String;", "", "position", "onClickBarGraphItem", "(I)Lkotlin/Unit;", "onClickRefererEtc", "Lcom/kakao/tistory/data/model/StatisticsItem$TopPostItem;", "topPostItem", "onClickTopPost", "(Lcom/kakao/tistory/data/model/StatisticsItem$TopPostItem;)V", "onClickTopPostSeeAll", "keyword", "onClickRefererKeyword", "onClickRefresh", "Landroidx/lifecycle/MutableLiveData;", "p", "Landroidx/lifecycle/MutableLiveData;", "getEntryItem", "()Landroidx/lifecycle/MutableLiveData;", "q", "getDate", "date", "r", "getGranularity", "granularity", "s", "getMetric", "metric", "t", "getSelectedDate", "selectedDate", "Lcom/kakao/tistory/data/model/StatisticsItem;", "u", "getStatisticsItems", "statisticsItems", "v", "getVisitorTitle", "visitorTitle", "w", "getVisitorCount", "visitorCount", "", "x", "getIncreaseCount", "increaseCount", "y", "getTotalCount", "totalCount", "z", "getLastUpdateTime", "lastUpdateTime", "Lkotlinx/coroutines/flow/MutableStateFlow;", "A", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getSelectedGraphPosition", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "selectedGraphPosition", "Lkotlinx/coroutines/flow/SharedFlow;", "C", "Lkotlinx/coroutines/flow/SharedFlow;", "getScrollToPositionEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "scrollToPositionEvent", "D", "getTrendItems", "trendItems", "E", "getTrendMoreItems", "trendMoreItems", "Landroidx/lifecycle/LiveData;", "H", "Landroidx/lifecycle/LiveData;", "getSelectedKeyword", "()Landroidx/lifecycle/LiveData;", "selectedKeyword", "I", "getKeywordInfoDaumCount", "keywordInfoDaumCount", "J", "getKeywordInfoNaverCount", "keywordInfoNaverCount", "K", "getKeywordInfoEtcCount", "keywordInfoEtcCount", "Lcom/kakao/tistory/presentation/common/extension/Event;", "getGoToRefererEtcListActivity", "goToRefererEtcListActivity", "getGoToStatisticsActivity", "goToStatisticsActivity", "getGoToTopPostListActivity", "goToTopPostListActivity", "StatisticsMetricSortType", "StatisticsSortType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStatisticsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/StatisticsViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,739:1\n1#2:740\n15#3,5:741\n15#3,5:746\n15#3,5:751\n15#3,2:756\n17#3,3:763\n15#3,5:766\n1559#4:758\n1590#4,4:759\n*S KotlinDebug\n*F\n+ 1 StatisticsViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/StatisticsViewModel\n*L\n319#1:741,5\n330#1:746,5\n337#1:751,5\n354#1:756,2\n354#1:763,3\n394#1:766,5\n368#1:758\n368#1:759,4\n*E\n"})
public final class StatisticsViewModel extends TistoryListViewModel {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000E2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000ER\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fj\u0002\b\u000Fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel$StatisticsMetricSortType;", "", "", "a", "Ljava/lang/String;", "getMetric", "()Ljava/lang/String;", "metric", "", "b", "I", "getTitleResourceId", "()I", "titleResourceId", "Companion", "VIEW", "VISIT", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum StatisticsMetricSortType {
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003*\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel$StatisticsMetricSortType$Companion;", "", "", "Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel$StatisticsMetricSortType;", "valueOfName", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel$StatisticsMetricSortType;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nStatisticsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/StatisticsViewModel$StatisticsMetricSortType$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,739:1\n288#2,2:740\n*S KotlinDebug\n*F\n+ 1 StatisticsViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/StatisticsViewModel$StatisticsMetricSortType$Companion\n*L\n125#1:740,2\n*E\n"})
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @Nullable
            public final StatisticsMetricSortType valueOfName(@NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "<this>");
                for(Object object0: StatisticsMetricSortType.getEntries()) {
                    if(Intrinsics.areEqual(((StatisticsMetricSortType)object0).getMetric(), s)) {
                        return (StatisticsMetricSortType)object0;
                    }
                    if(false) {
                        break;
                    }
                }
                return null;
            }
        }

        VIEW("pv", string.label_statistics_sort_view),
        VISIT("uv", string.label_statistics_sort_visit);

        @NotNull
        public static final Companion Companion;
        public final String a;
        public final int b;
        public static final StatisticsMetricSortType[] c;
        public static final EnumEntries d;

        static {
            StatisticsMetricSortType.c = arr_statisticsViewModel$StatisticsMetricSortType;
            Intrinsics.checkNotNullParameter(arr_statisticsViewModel$StatisticsMetricSortType, "entries");
            StatisticsMetricSortType.d = new a(arr_statisticsViewModel$StatisticsMetricSortType);
            StatisticsMetricSortType.Companion = new Companion(null);
        }

        public StatisticsMetricSortType(String s1, int v1) {
            this.a = s1;
            this.b = v1;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return StatisticsMetricSortType.d;
        }

        @NotNull
        public final String getMetric() {
            return this.a;
        }

        public final int getTitleResourceId() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0017\u0010\u0010\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u0004\u001A\u0004\b\u000F\u0010\u0006j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel$StatisticsSortType;", "", "", "a", "Ljava/lang/String;", "getGranularity", "()Ljava/lang/String;", "granularity", "", "b", "I", "getTitleResourceId", "()I", "titleResourceId", "c", "getPeriod", "period", "Companion", "DAY", "WEEK", "MONTH", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum StatisticsSortType {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001A\u00020\u0002*\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001A\u00020\u0002*\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel$StatisticsSortType$Companion;", "", "", "capitalize", "(Ljava/lang/String;)Ljava/lang/String;", "getPeriodName", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nStatisticsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/StatisticsViewModel$StatisticsSortType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,739:1\n1#2:740\n288#3,2:741\n*S KotlinDebug\n*F\n+ 1 StatisticsViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/StatisticsViewModel$StatisticsSortType$Companion\n*L\n117#1:741,2\n*E\n"})
        public static final class com.kakao.tistory.presentation.viewmodel.StatisticsViewModel.StatisticsSortType.Companion {
            public com.kakao.tistory.presentation.viewmodel.StatisticsViewModel.StatisticsSortType.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final String capitalize(@NotNull String s) {
                String s1;
                Intrinsics.checkNotNullParameter(s, "<this>");
                if(s.length() > 0) {
                    StringBuilder stringBuilder0 = new StringBuilder();
                    int v = s.charAt(0);
                    if(Character.isLowerCase(((char)v))) {
                        Locale locale0 = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale0, "getDefault(...)");
                        s1 = b.titlecase(((char)v), locale0);
                    }
                    else {
                        s1 = String.valueOf(((char)v));
                    }
                    stringBuilder0.append(s1);
                    String s2 = s.substring(1);
                    Intrinsics.checkNotNullExpressionValue(s2, "substring(...)");
                    stringBuilder0.append(s2);
                    return stringBuilder0.toString();
                }
                return s;
            }

            @NotNull
            public final String getPeriodName(@NotNull String s) {
                String s1;
                Object object0 = null;
                Intrinsics.checkNotNullParameter(s, "<this>");
                Iterator iterator0 = StatisticsSortType.getEntries().iterator();
                while(true) {
                    s1 = null;
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object1 = iterator0.next();
                    if(Intrinsics.areEqual(((StatisticsSortType)object1).getGranularity(), s)) {
                        object0 = object1;
                        break;
                    }
                }
                if(((StatisticsSortType)object0) != null) {
                    s1 = ((StatisticsSortType)object0).getPeriod();
                }
                return s1 == null ? "" : s1;
            }
        }

        DAY("day", 0x7F1204D1, "daily"),  // string:label_statistics_day "일간"
        WEEK("week", 0x7F1204E7, "weekly"),  // string:label_statistics_week "주간"
        MONTH("month", 0x7F1204D4, "monthly");  // string:label_statistics_month "월간"

        @NotNull
        public static final com.kakao.tistory.presentation.viewmodel.StatisticsViewModel.StatisticsSortType.Companion Companion;
        public final String a;
        public final int b;
        public final String c;
        public static final StatisticsSortType[] d;
        public static final EnumEntries e;

        static {
            StatisticsSortType.d = arr_statisticsViewModel$StatisticsSortType;
            Intrinsics.checkNotNullParameter(arr_statisticsViewModel$StatisticsSortType, "entries");
            StatisticsSortType.e = new a(arr_statisticsViewModel$StatisticsSortType);
            StatisticsSortType.Companion = new com.kakao.tistory.presentation.viewmodel.StatisticsViewModel.StatisticsSortType.Companion(null);
        }

        public StatisticsSortType(String s1, int v1, String s2) {
            this.a = s1;
            this.b = v1;
            this.c = s2;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return StatisticsSortType.e;
        }

        @NotNull
        public final String getGranularity() {
            return this.a;
        }

        @NotNull
        public final String getPeriod() {
            return this.c;
        }

        public final int getTitleResourceId() {
            return this.b;
        }
    }

    public static final int $stable = 8;
    public final MutableStateFlow A;
    public final MutableSharedFlow B;
    public final SharedFlow C;
    public final MutableLiveData D;
    public final MutableLiveData E;
    public final MutableLiveData F;
    public final MutableLiveData G;
    public final LiveData H;
    public final LiveData I;
    public final LiveData J;
    public final LiveData K;
    public final AccountRepository i;
    public final OldStatisticsRepository j;
    public final GetTopEntriesUseCase k;
    public final MutableLiveData l;
    public final MutableLiveData m;
    public final MutableLiveData n;
    public final MutableLiveData o;
    public final MutableLiveData p;
    public final MutableLiveData q;
    public final MutableLiveData r;
    public final MutableLiveData s;
    public final MutableLiveData t;
    public final MutableLiveData u;
    public final MutableLiveData v;
    public final MutableLiveData w;
    public final MutableLiveData x;
    public final MutableLiveData y;
    public final MutableLiveData z;

    @Inject
    public StatisticsViewModel(@NotNull AccountRepository accountRepository0, @NotNull OldStatisticsRepository oldStatisticsRepository0, @NotNull GetTopEntriesUseCase getTopEntriesUseCase0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(oldStatisticsRepository0, "statisticsRepository");
        Intrinsics.checkNotNullParameter(getTopEntriesUseCase0, "getTopEntriesUseCase");
        super();
        this.i = accountRepository0;
        this.j = oldStatisticsRepository0;
        this.k = getTopEntriesUseCase0;
        this.l = new MutableLiveData();
        this.m = new MutableLiveData();
        this.n = new MutableLiveData();
        this.o = new MutableLiveData();
        this.p = new MutableLiveData();
        this.q = new MutableLiveData();
        this.r = new MutableLiveData();
        this.s = new MutableLiveData();
        this.t = new MutableLiveData();
        this.u = new MutableLiveData();
        this.v = new MutableLiveData();
        this.w = new MutableLiveData();
        this.x = new MutableLiveData();
        this.y = new MutableLiveData();
        this.z = new MutableLiveData();
        this.A = StateFlowKt.MutableStateFlow(0);
        MutableSharedFlow mutableSharedFlow0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.B = mutableSharedFlow0;
        this.C = FlowKt.asSharedFlow(mutableSharedFlow0);
        this.D = new MutableLiveData();
        this.E = new MutableLiveData();
        this.F = new MutableLiveData();
        MutableLiveData mutableLiveData0 = new MutableLiveData();
        this.G = mutableLiveData0;
        this.H = Transformations.map(mutableLiveData0, p6.a);
        this.I = Transformations.map(mutableLiveData0, m6.a);
        this.J = Transformations.map(mutableLiveData0, o6.a);
        this.K = Transformations.map(mutableLiveData0, n6.a);
    }

    public final TrendItem a(int v) {
        String s2;
        String s1;
        long v2;
        List list0 = (List)this.D.getValue();
        if(list0 != null) {
            if(list0.isEmpty()) {
                list0 = null;
            }
            long v1 = 0L;
            if(list0 != null) {
                if(v + 1 < list0.size()) {
                    Long long0 = ((TrendItem)list0.get(v + 1)).getCount();
                    v2 = long0 == null ? 0L : ((long)long0);
                }
                else {
                    v2 = 0L;
                }
                TrendItem trendItem0 = (TrendItem)list0.get(v);
                trendItem0.setSelectedItem(true);
                trendItem0.setSelectAnimEnable(true);
                MutableLiveData mutableLiveData0 = this.v;
                String s = (String)this.r.getValue();
                if(Intrinsics.areEqual(s, "day")) {
                    s1 = DateUtils.getDisplayDateTime$default(DateUtils.INSTANCE, "", null, null, null, true, 14, null);
                }
                else if(Intrinsics.areEqual(s, "week")) {
                    String[] arr_s = DateUtils.getDisplayWeekDateTime$default(DateUtils.INSTANCE, "", null, null, null, 14, null);
                    s1 = a5.b.m(arr_s[0], " ~ ", arr_s[1]);
                }
                else {
                    s1 = Intrinsics.areEqual(s, "month") ? DateUtils.getDisplayDateTime$default(DateUtils.INSTANCE, "", null, "M월", "yyyy년 M월", false, 18, null) : DateUtils.getDisplayDateTime$default(DateUtils.INSTANCE, "", null, null, null, false, 30, null);
                }
                mutableLiveData0.setValue(s1);
                MutableLiveData mutableLiveData1 = this.w;
                Long long1 = trendItem0.getCount();
                if(long1 == null) {
                    s2 = "-";
                }
                else {
                    s2 = StringUtils.INSTANCE.getNumberFormat(long1.longValue());
                    if(s2 == null) {
                        s2 = "-";
                    }
                }
                mutableLiveData1.setValue(s2);
                MutableLiveData mutableLiveData2 = this.x;
                Long long2 = trendItem0.getCount();
                if(long2 != null) {
                    v1 = (long)long2;
                }
                mutableLiveData2.setValue(((long)(v1 - v2)));
                return trendItem0;
            }
        }
        return null;
    }

    public final TrendItem a(TrendItem trendItem0) {
        List list0 = (List)this.D.getValue();
        if(list0 != null) {
            if(list0.isEmpty()) {
                list0 = null;
            }
            if(list0 != null) {
                int v = list0.indexOf(trendItem0);
                return v + 1 >= list0.size() ? null : ((TrendItem)list0.get(v + 1));
            }
        }
        return null;
    }

    public final Pair a(Result result0, Result result1, Result result2, Result result3, Result result4) {
        String s;
        ArrayList arrayList0 = new ArrayList();
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        ref$ObjectRef0.element = new Trend(0L, 0L, null, null, 0L, null, 0x3F, null);
        if(result0 instanceof Success) {
            ref$ObjectRef0.element = ((Success)result0).getData();
            arrayList0.add(((Success)result0).getData());
        }
        else if(result0 instanceof Fail) {
            Trend statisticsItem$Trend0 = new Trend(0L, 0L, null, null, 0L, null, 0x3F, null);
            statisticsItem$Trend0.setException(((Fail)result0).getErrorModel().getTitle());
            ref$ObjectRef0.element = statisticsItem$Trend0;
            arrayList0.add(statisticsItem$Trend0);
        }
        arrayList0.add(new Title(StatisticsViewType.REFERER_CHANNEL, null, false, 6, null));
        if(result1 instanceof Success) {
            arrayList0.add(((Success)result1).getData());
        }
        else if(result1 instanceof Fail) {
            arrayList0.add(new EmptyItem(string.label_statistics_error));
        }
        StatisticsViewType statisticsViewType0 = StatisticsViewType.REFERER_RANK;
        arrayList0.add(new Title(statisticsViewType0, null, false, 6, null));
        if(result2 instanceof Success) {
            List list0 = ((ItemListModel)((Success)result2).getData()).getItems();
            if(list0 == null || list0.isEmpty()) {
                Integer integer0 = statisticsViewType0.getEmptyResourceId();
                if(integer0 == null) {
                    s = "";
                }
                else {
                    s = BaseKt.getAppContext().getString(integer0.intValue());
                    if(s == null) {
                        s = "";
                    }
                }
                Intrinsics.checkNotNull(s);
                arrayList0.add(new EmptyItem(statisticsViewType0.getEmptyResourceId()));
            }
            else {
                int v = 0;
                for(Object object0: list0) {
                    ((RefererRankItem)object0).setLastItem(v == list0.size() - 1);
                    arrayList0.add(((RefererRankItem)object0));
                    ++v;
                }
            }
        }
        else if(result2 instanceof Fail) {
            arrayList0.add(new EmptyItem(string.label_statistics_error));
        }
        if(result4 != null) {
            if(result4 instanceof Success) {
                List list1 = (List)((Success)result4).getData();
                StatisticsViewType statisticsViewType1 = StatisticsViewType.TOP_POST;
                arrayList0.add(new Title(statisticsViewType1, null, list1.size() > 3, 2, null));
                if(list1.isEmpty()) {
                    arrayList0.add(new EmptyItem(statisticsViewType1.getEmptyResourceId()));
                }
                else {
                    List list2 = CollectionsKt___CollectionsKt.take(list1, 3);
                    ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(list2, 10));
                    int v1 = 0;
                    for(Object object1: list2) {
                        if(v1 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        Thumbnail thumbnail0 = ((TopEntry)object1).getThumbnail();
                        arrayList1.add(Boolean.valueOf(arrayList0.add(new TopEntryItem(new StatisticsTopEntryItem(v1 + 1, ((TopEntry)object1).getId(), ((TopEntry)object1).getTitle(), (thumbnail0 == null ? null : ThumbnailUiStateKt.toItem(thumbnail0)), new g6(this, ((TopEntry)object1)), ((TopEntry)object1).getLikeCount(), ((TopEntry)object1).getCommentCount(), ((TopEntry)object1).getCount(), v1 != 0)))));
                        ++v1;
                    }
                }
            }
            else if(result4 instanceof Fail) {
                Fail result$Fail0 = (Fail)result4;
                arrayList0.add(new Title(StatisticsViewType.TOP_POST, null, false, 6, null));
                arrayList0.add(new EmptyItem(string.label_statistics_error));
            }
        }
        StatisticsViewType statisticsViewType2 = StatisticsViewType.REFERER_KEYWORD;
        arrayList0.add(new Title(statisticsViewType2, null, false, 6, null));
        if(result3 instanceof Success) {
            List list3 = ((ItemListModel)((Success)result3).getData()).getItems();
            if(list3 != null && !list3.isEmpty()) {
                int v2 = 0;
                for(Object object2: list3) {
                    ((RefererKeywordItem)object2).setFirstItem(v2 == 0);
                    ((RefererKeywordItem)object2).setLastItem(v2 == list3.size() - 1);
                    arrayList0.add(((RefererKeywordItem)object2));
                    ++v2;
                }
                return new Pair(arrayList0, ref$ObjectRef0.element);
            }
            arrayList0.add(new EmptyItem(statisticsViewType2.getEmptyResourceId()));
            return new Pair(arrayList0, ref$ObjectRef0.element);
        }
        if(result3 instanceof Fail) {
            arrayList0.add(new EmptyItem(string.label_statistics_error));
        }
        return new Pair(arrayList0, ref$ObjectRef0.element);
    }

    public static final Object access$getBlogStatistics(StatisticsViewModel statisticsViewModel0, String s, String s1, String s2, String s3, Continuation continuation0) {
        Result result2;
        Result result1;
        Result result7;
        StatisticsViewModel statisticsViewModel4;
        String s6;
        String s5;
        String s4;
        StatisticsViewModel statisticsViewModel3;
        String s8;
        StatisticsViewModel statisticsViewModel6;
        Result result9;
        Result result8;
        StatisticsViewModel statisticsViewModel9;
        StatisticsViewModel statisticsViewModel8;
        String s11;
        String s10;
        String s9;
        StatisticsViewModel statisticsViewModel12;
        Object object1;
        String s17;
        String s16;
        String s15;
        String s12;
        h6 h60;
        StatisticsViewModel statisticsViewModel1 = statisticsViewModel0;
        statisticsViewModel0.getClass();
        if(continuation0 instanceof h6) {
            h60 = (h6)continuation0;
            int v = h60.k;
            if((v & 0x80000000) == 0) {
                h60 = new h6(statisticsViewModel1, continuation0);
            }
            else {
                h60.k = v ^ 0x80000000;
            }
        }
        else {
            h60 = new h6(statisticsViewModel1, continuation0);
        }
        Object object0 = h60.i;
        Pair pair0 = qd.a.getCOROUTINE_SUSPENDED();
        switch(h60.k) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                h60.a = statisticsViewModel1;
                h60.b = s;
                s17 = s1;
                h60.c = s17;
                s16 = s2;
                h60.d = s16;
                h60.e = s3;
                h60.f = statisticsViewModel1;
                h60.k = 1;
                Object object2 = statisticsViewModel1.j.getBlogTrendMore(s, s1, s2, s3, h60);
                if(object2 != pair0) {
                    s15 = s;
                    object1 = object2;
                    s12 = s3;
                    statisticsViewModel12 = statisticsViewModel1;
                label_87:
                    h60.a = statisticsViewModel1;
                    h60.b = s15;
                    h60.c = s17;
                    h60.d = s16;
                    h60.e = s12;
                    h60.f = statisticsViewModel12;
                    h60.g = (Result)object1;
                    h60.k = 2;
                    Object object3 = statisticsViewModel1.j.getBlogRefererChannels(s15, s17, s16, s12, h60);
                    if(object3 != pair0) {
                        statisticsViewModel8 = statisticsViewModel1;
                        statisticsViewModel9 = statisticsViewModel12;
                        object0 = object3;
                        s11 = s15;
                        s10 = s17;
                        s9 = s16;
                        s8 = s12;
                        result9 = (Result)object1;
                    label_105:
                        h60.a = statisticsViewModel8;
                        h60.b = s11;
                        h60.c = s10;
                        h60.d = s9;
                        h60.e = s8;
                        h60.f = statisticsViewModel9;
                        h60.g = result9;
                        h60.h = (Result)object0;
                        h60.k = 3;
                        Object object4 = statisticsViewModel8.j.getBlogRefererRanks(s11, s10, s9, s8, h60);
                        if(object4 != pair0) {
                            statisticsViewModel3 = statisticsViewModel9;
                            result8 = (Result)object0;
                            object0 = object4;
                            statisticsViewModel6 = statisticsViewModel8;
                            s6 = s11;
                            s5 = s10;
                            s4 = s9;
                        label_123:
                            h60.a = statisticsViewModel6;
                            h60.b = s6;
                            h60.c = s5;
                            h60.d = s4;
                            h60.e = statisticsViewModel3;
                            h60.f = result9;
                            h60.g = result8;
                            h60.h = (Result)object0;
                            h60.k = 4;
                            Object object5 = statisticsViewModel6.j.getBlogRefererKeywords(s6, s5, s4, s8, h60);
                            if(object5 != pair0) {
                                statisticsViewModel4 = statisticsViewModel6;
                                result2 = result8;
                                result7 = result9;
                                result1 = (Result)object0;
                                object0 = object5;
                            label_139:
                                h60.a = statisticsViewModel3;
                                h60.b = result7;
                                h60.c = result2;
                                h60.d = result1;
                                h60.e = (Result)object0;
                                h60.f = null;
                                h60.g = null;
                                h60.h = null;
                                h60.k = 5;
                                Object object6 = statisticsViewModel4.k.invoke(s6, s5, s4, h60);
                                return object6 == pair0 ? pair0 : statisticsViewModel3.a(result7, result2, result1, ((Result)object0), ((Result)object6));
                            }
                        }
                    }
                }
                break;
            }
            case 1: {
                StatisticsViewModel statisticsViewModel10 = (StatisticsViewModel)h60.f;
                s12 = (String)h60.e;
                String s13 = (String)h60.d;
                String s14 = (String)h60.c;
                s15 = (String)h60.b;
                StatisticsViewModel statisticsViewModel11 = h60.a;
                ResultKt.throwOnFailure(object0);
                s16 = s13;
                s17 = s14;
                object1 = object0;
                statisticsViewModel12 = statisticsViewModel10;
                statisticsViewModel1 = statisticsViewModel11;
                goto label_87;
            }
            case 2: {
                Result result10 = h60.g;
                StatisticsViewModel statisticsViewModel7 = (StatisticsViewModel)h60.f;
                s8 = (String)h60.e;
                s9 = (String)h60.d;
                s10 = (String)h60.c;
                s11 = (String)h60.b;
                statisticsViewModel8 = h60.a;
                ResultKt.throwOnFailure(object0);
                result9 = result10;
                statisticsViewModel9 = statisticsViewModel7;
                goto label_105;
            }
            case 3: {
                result8 = h60.h;
                result9 = h60.g;
                StatisticsViewModel statisticsViewModel5 = (StatisticsViewModel)h60.f;
                String s7 = (String)h60.e;
                s4 = (String)h60.d;
                s5 = (String)h60.c;
                s6 = (String)h60.b;
                statisticsViewModel6 = h60.a;
                ResultKt.throwOnFailure(object0);
                statisticsViewModel3 = statisticsViewModel5;
                s8 = s7;
                goto label_123;
            }
            case 4: {
                Result result4 = h60.h;
                Result result5 = h60.g;
                Result result6 = (Result)h60.f;
                statisticsViewModel3 = (StatisticsViewModel)h60.e;
                s4 = (String)h60.d;
                s5 = (String)h60.c;
                s6 = (String)h60.b;
                statisticsViewModel4 = h60.a;
                ResultKt.throwOnFailure(object0);
                result1 = result4;
                result7 = result6;
                result2 = result5;
                goto label_139;
            }
            case 5: {
                Result result0 = (Result)h60.e;
                result1 = (Result)h60.d;
                result2 = (Result)h60.c;
                Result result3 = (Result)h60.b;
                StatisticsViewModel statisticsViewModel2 = h60.a;
                ResultKt.throwOnFailure(object0);
                return statisticsViewModel2.a(result3, result2, result1, result0, ((Result)object0));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return pair0;
    }

    public static final Object access$getEntryStatistics(StatisticsViewModel statisticsViewModel0, String s, long v, String s1, String s2, Continuation continuation0) {
        String s7;
        String s6;
        StatisticsViewModel statisticsViewModel5;
        Result result5;
        StatisticsViewModel statisticsViewModel4;
        String s5;
        Result result3;
        long v2;
        StatisticsViewModel statisticsViewModel6;
        String s8;
        Result result6;
        StatisticsViewModel statisticsViewModel9;
        Object object1;
        String s13;
        String s12;
        String s11;
        i6 i60;
        StatisticsViewModel statisticsViewModel1 = statisticsViewModel0;
        statisticsViewModel0.getClass();
        if(continuation0 instanceof i6) {
            i60 = (i6)continuation0;
            int v1 = i60.k;
            if((v1 & 0x80000000) == 0) {
                i60 = new i6(statisticsViewModel1, continuation0);
            }
            else {
                i60.k = v1 ^ 0x80000000;
            }
        }
        else {
            i60 = new i6(statisticsViewModel1, continuation0);
        }
        Object object0 = i60.i;
        Pair pair0 = qd.a.getCOROUTINE_SUSPENDED();
        switch(i60.k) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                i60.a = statisticsViewModel1;
                i60.b = s;
                s13 = s1;
                i60.c = s13;
                s12 = s2;
                i60.d = s12;
                i60.e = statisticsViewModel1;
                i60.h = v;
                i60.k = 1;
                Object object2 = statisticsViewModel1.j.getEntryTrendMore(s, v, s1, s2, i60);
                if(object2 != pair0) {
                    s11 = s;
                    object1 = object2;
                    v2 = v;
                    statisticsViewModel9 = statisticsViewModel1;
                label_73:
                    i60.a = statisticsViewModel1;
                    i60.b = s11;
                    i60.c = s13;
                    i60.d = s12;
                    i60.e = statisticsViewModel9;
                    i60.f = (Result)object1;
                    i60.h = v2;
                    i60.k = 2;
                    Object object3 = statisticsViewModel1.j.getEntryRefererChannels(s11, v2, s13, s12, i60);
                    if(object3 != pair0) {
                        statisticsViewModel6 = statisticsViewModel1;
                        result6 = (Result)object1;
                        s8 = s11;
                        s7 = s13;
                        statisticsViewModel5 = statisticsViewModel9;
                        object0 = object3;
                        s6 = s12;
                    label_90:
                        i60.a = statisticsViewModel6;
                        i60.b = s8;
                        i60.c = s7;
                        i60.d = s6;
                        i60.e = statisticsViewModel5;
                        i60.f = result6;
                        i60.g = (Result)object0;
                        i60.h = v2;
                        i60.k = 3;
                        Object object4 = statisticsViewModel6.j.getEntryRefererRanks(s8, v2, s7, s6, i60);
                        if(object4 != pair0) {
                            result5 = result6;
                            result3 = (Result)object0;
                            object0 = object4;
                            statisticsViewModel4 = statisticsViewModel6;
                            s5 = s8;
                        label_106:
                            i60.a = statisticsViewModel5;
                            i60.b = result5;
                            i60.c = result3;
                            i60.d = (Result)object0;
                            i60.e = null;
                            i60.f = null;
                            i60.g = null;
                            i60.k = 4;
                            Object object5 = statisticsViewModel4.j.getEntryRefererKeywords(s5, v2, s7, s6, i60);
                            return object5 == pair0 ? pair0 : statisticsViewModel5.a(result5, result3, ((Result)object0), ((Result)object5), null);
                        }
                    }
                }
                break;
            }
            case 1: {
                v2 = i60.h;
                StatisticsViewModel statisticsViewModel7 = i60.e;
                String s9 = (String)i60.d;
                String s10 = (String)i60.c;
                s11 = (String)i60.b;
                StatisticsViewModel statisticsViewModel8 = i60.a;
                ResultKt.throwOnFailure(object0);
                s12 = s9;
                s13 = s10;
                object1 = object0;
                statisticsViewModel9 = statisticsViewModel7;
                statisticsViewModel1 = statisticsViewModel8;
                goto label_73;
            }
            case 2: {
                v2 = i60.h;
                result6 = i60.f;
                statisticsViewModel5 = i60.e;
                s6 = (String)i60.d;
                s7 = (String)i60.c;
                s8 = (String)i60.b;
                statisticsViewModel6 = i60.a;
                ResultKt.throwOnFailure(object0);
                goto label_90;
            }
            case 3: {
                v2 = i60.h;
                result3 = i60.g;
                Result result4 = i60.f;
                StatisticsViewModel statisticsViewModel3 = i60.e;
                String s3 = (String)i60.d;
                String s4 = (String)i60.c;
                s5 = (String)i60.b;
                statisticsViewModel4 = i60.a;
                ResultKt.throwOnFailure(object0);
                result5 = result4;
                statisticsViewModel5 = statisticsViewModel3;
                s6 = s3;
                s7 = s4;
                goto label_106;
            }
            case 4: {
                Result result0 = (Result)i60.d;
                Result result1 = (Result)i60.c;
                Result result2 = (Result)i60.b;
                StatisticsViewModel statisticsViewModel2 = i60.a;
                ResultKt.throwOnFailure(object0);
                return statisticsViewModel2.a(result2, result1, result0, ((Result)object0), null);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return pair0;
    }

    public static final void access$onClickTopPost(StatisticsViewModel statisticsViewModel0, long v, String s) {
        statisticsViewModel0.getClass();
        StatisticsTiara.INSTANCE.trackClickTopPost();
        Object object0 = statisticsViewModel0.o.getValue();
        if(((String)object0) != null) {
            Event event0 = new Event(new EntryItem(v, null, null, null, false, null, false, s, null, null, null, null, null, null, null, null, null, null, ((String)object0), null, 0L, 0L, false, 0L, false, 0x1FBFF7E, null));
            statisticsViewModel0.m.setValue(event0);
        }
    }

    public static final void access$updateRefererKeywordInfo(StatisticsViewModel statisticsViewModel0, String s) {
        statisticsViewModel0.getClass();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(statisticsViewModel0), null, null, new q6(statisticsViewModel0, s, null), 3, null);
    }

    public static final TrendItem access$updateTrendInfo(StatisticsViewModel statisticsViewModel0, int v, String s) {
        return statisticsViewModel0.a(v);
    }

    @NotNull
    public final MutableLiveData getDate() {
        return this.q;
    }

    @NotNull
    public final String getDateTimeForBarGraph(@NotNull String s) {
        String s2;
        Intrinsics.checkNotNullParameter(s, "timestamp");
        String s1 = (String)this.r.getValue();
        if(s1 != null) {
            if(Intrinsics.areEqual(s1, "day")) {
                s2 = DateUtils.getDisplayDayOfMonth$default(DateUtils.INSTANCE, s, null, null, "M. d", true, false, 38, null);
                return s2 == null ? "" : s2;
            }
            if(Intrinsics.areEqual(s1, "week")) {
                s2 = DateUtils.INSTANCE.getDateTimeFormatFromISO8601(s, "d");
                return s2 == null ? "" : s2;
            }
            s2 = Intrinsics.areEqual(s1, "month") ? DateUtils.INSTANCE.getDateTimeFormatFromISO8601(s, "M월") : DateUtils.getCurrentDateTime$default(DateUtils.INSTANCE, null, 1, null);
            return s2 == null ? "" : s2;
        }
        return "";
    }

    @NotNull
    public final String getDateTimeForBarGraphSub(@NotNull TrendItem trendItem0) {
        String s2;
        Intrinsics.checkNotNullParameter(trendItem0, "trendItem");
        DateUtils dateUtils0 = DateUtils.INSTANCE;
        String s = (String)this.r.getValue();
        if(s != null) {
            if(Intrinsics.areEqual(s, "day")) {
                if(DateUtils.getCompareDateTime$default(dateUtils0, "", null, null, 6, null) == 0) {
                    String s1 = BaseKt.getAppContext().getString(string.label_date_time_today);
                    Intrinsics.checkNotNull(s1);
                    return s1;
                }
                return dateUtils0.getDateTimeFormatFromISO8601("", "EEE");
            }
            if(Intrinsics.areEqual(s, "week")) {
                if(DateUtils.getCompareDateTime$default(dateUtils0, "", DateUtils.getMondayDateTimeOfWeek$default(dateUtils0, null, null, "yyyy-MM-dd\'T\'HH:mm:ssXXX", false, 11, null), null, 4, null) == 0) {
                    s2 = BaseKt.getAppContext().getString(string.label_date_time_week);
                    Intrinsics.checkNotNull(s2);
                    return s2;
                }
                if(this.a(trendItem0) != null) {
                    String s3 = dateUtils0.checkSameMonth("", "", "yyyy-MM-dd\'T\'HH:mm:ssXXX") ? "" : dateUtils0.getDateTimeFormatFromISO8601("", "M월");
                    return s3 == null ? "" : s3;
                }
                return "";
            }
            if(Intrinsics.areEqual(s, "month")) {
                if(DateUtils.getCompareDateTime$default(dateUtils0, "", DateUtils.getFirstDateTimeOfMonth$default(dateUtils0, null, null, "yyyy-MM-dd\'T\'HH:mm:ssXXX", 3, null), null, 4, null) == 0) {
                    s2 = BaseKt.getAppContext().getString(string.label_date_time_month);
                    Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
                    return s2;
                }
                if(this.a(trendItem0) != null) {
                    String s4 = dateUtils0.checkSameYear("", "", "yyyy-MM-dd\'T\'HH:mm:ssXXX") ? "" : dateUtils0.getDateTimeFormatFromISO8601("", "yyyy년");
                    return s4 == null ? "" : s4;
                }
            }
        }
        return "";
    }

    @NotNull
    public final MutableLiveData getEntryItem() {
        return this.p;
    }

    @NotNull
    public final LiveData getGoToRefererEtcListActivity() {
        return this.l;
    }

    @NotNull
    public final LiveData getGoToStatisticsActivity() {
        return this.m;
    }

    @NotNull
    public final LiveData getGoToTopPostListActivity() {
        return this.n;
    }

    @NotNull
    public final MutableLiveData getGranularity() {
        return this.r;
    }

    @NotNull
    public final MutableLiveData getIncreaseCount() {
        return this.x;
    }

    @NotNull
    public final LiveData getKeywordInfoDaumCount() {
        return this.I;
    }

    @NotNull
    public final LiveData getKeywordInfoEtcCount() {
        return this.K;
    }

    @NotNull
    public final LiveData getKeywordInfoNaverCount() {
        return this.J;
    }

    @NotNull
    public final MutableLiveData getLastUpdateTime() {
        return this.z;
    }

    @NotNull
    public final MutableLiveData getMetric() {
        return this.s;
    }

    @NotNull
    public final List getMetricSortItemList() {
        List list0 = new ArrayList();
        for(Object object0: StatisticsMetricSortType.getEntries()) {
            String s = ((StatisticsMetricSortType)object0).getMetric();
            String s1 = BaseKt.getAppContext().getString(((StatisticsMetricSortType)object0).getTitleResourceId());
            Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
            StatisticsMetricSortItem sortItem$StatisticsMetricSortItem0 = new StatisticsMetricSortItem(s, s1);
            sortItem$StatisticsMetricSortItem0.setSelected(Intrinsics.areEqual(this.s.getValue(), ((StatisticsMetricSortType)object0).getMetric()));
            ((ArrayList)list0).add(sortItem$StatisticsMetricSortItem0);
        }
        return list0;
    }

    @NotNull
    public final SharedFlow getScrollToPositionEvent() {
        return this.C;
    }

    @NotNull
    public final MutableLiveData getSelectedDate() {
        return this.t;
    }

    @NotNull
    public final MutableStateFlow getSelectedGraphPosition() {
        return this.A;
    }

    @NotNull
    public final LiveData getSelectedKeyword() {
        return this.H;
    }

    @NotNull
    public final List getSortItems() {
        List list0 = new ArrayList();
        StatisticsSortType[] arr_statisticsViewModel$StatisticsSortType = StatisticsSortType.values();
        for(int v = 0; v < arr_statisticsViewModel$StatisticsSortType.length; ++v) {
            StatisticsSortType statisticsViewModel$StatisticsSortType0 = arr_statisticsViewModel$StatisticsSortType[v];
            DateUtils dateUtils0 = DateUtils.INSTANCE;
            DateTimeFormat dateUtils$DateTimeFormat0 = DateTimeFormat.DATE_TIME_FORMAT_yyyy_M_d;
            String s = DateUtils.getDateTimeFormat$default(dateUtils0, ((String)this.q.getValue()), null, "yyyy. M. d.", 2, null);
            String s1 = statisticsViewModel$StatisticsSortType0.getGranularity();
            if(Intrinsics.areEqual(s1, "week")) {
                String[] arr_s = DateUtils.getDisplayWeekDateTime$default(dateUtils0, ((String)this.q.getValue()), "yyyy-MM-dd", dateUtils$DateTimeFormat0.getFormat(), null, 8, null);
                s = a5.b.m(arr_s[0], " ~ ", arr_s[1]);
            }
            else if(Intrinsics.areEqual(s1, "month")) {
                s = DateUtils.getFirstDateTimeOfMonth$default(dateUtils0, ((String)this.q.getValue()), null, "yyyy. M.", 2, null);
            }
            String s2 = BaseKt.getAppContext().getString(statisticsViewModel$StatisticsSortType0.getTitleResourceId());
            Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
            StatisticsSortItem sortItem$StatisticsSortItem0 = new StatisticsSortItem(statisticsViewModel$StatisticsSortType0.getGranularity(), s2, s);
            sortItem$StatisticsSortItem0.setSelected(Intrinsics.areEqual(this.r.getValue(), statisticsViewModel$StatisticsSortType0.getGranularity()));
            ((ArrayList)list0).add(sortItem$StatisticsSortItem0);
        }
        return list0;
    }

    public final void getStatistics(@Nullable SortItem sortItem0, @Nullable SortItem sortItem1) {
        String s2;
        String s1;
        String s;
        if(!(sortItem0 instanceof StatisticsSortItem)) {
            sortItem0 = null;
        }
        if(sortItem0 == null) {
        label_5:
            s = (String)this.r.getValue();
            if(s == null) {
                return;
            }
        }
        else {
            s = ((StatisticsSortItem)sortItem0).getGranularity();
            if(s == null) {
                goto label_5;
            }
        }
        if(Intrinsics.areEqual(s, "day")) {
            Object object0 = this.q.getValue();
            s1 = DateUtils.getDateTimeFormat$default(DateUtils.INSTANCE, ((String)object0), null, null, 6, null);
        }
        else if(Intrinsics.areEqual(s, "week")) {
            Object object1 = this.q.getValue();
            s1 = DateUtils.getMondayDateTimeOfWeek$default(DateUtils.INSTANCE, ((String)object1), null, null, false, 14, null);
        }
        else if(Intrinsics.areEqual(s, "month")) {
            Object object2 = this.q.getValue();
            s1 = DateUtils.getFirstDateTimeOfMonth$default(DateUtils.INSTANCE, ((String)object2), null, null, 6, null);
        }
        else {
            s1 = DateUtils.getCurrentDateTime$default(DateUtils.INSTANCE, null, 1, null);
        }
        this.t.setValue(s1);
        this.r.setValue(s);
        SortItem sortItem2 = sortItem1 instanceof StatisticsMetricSortItem ? sortItem1 : null;
        if(sortItem2 == null) {
        label_27:
            s2 = (String)this.s.getValue();
            if(s2 == null) {
                return;
            }
        }
        else {
            s2 = ((StatisticsMetricSortItem)sortItem2).getMetric();
            if(s2 == null) {
                goto label_27;
            }
        }
        Object object3 = this.o.getValue();
        if(((String)object3) == null) {
            return;
        }
        this.s.setValue(s2);
        this.isShowProgress().setValue(Boolean.TRUE);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new j6(this, ((String)object3), s1, s, s2, null), 3, null);
    }

    public static void getStatistics$default(StatisticsViewModel statisticsViewModel0, SortItem sortItem0, SortItem sortItem1, int v, Object object0) {
        if((v & 1) != 0) {
            sortItem0 = null;
        }
        if((v & 2) != 0) {
            sortItem1 = null;
        }
        statisticsViewModel0.getStatistics(sortItem0, sortItem1);
    }

    @NotNull
    public final MutableLiveData getStatisticsItems() {
        return this.u;
    }

    @NotNull
    public final MutableLiveData getTotalCount() {
        return this.y;
    }

    @NotNull
    public final MutableLiveData getTrendItems() {
        return this.D;
    }

    public final void getTrendMore() {
        String s2;
        if(this.isLoading()) {
            return;
        }
        Object object0 = this.o.getValue();
        if(((String)object0) == null) {
            return;
        }
        String s = (String)this.r.getValue();
        if(s == null) {
            s = "day";
        }
        Intrinsics.checkNotNull(s);
        String s1 = (String)this.F.getValue();
        if(s1 != null) {
            if(p.isBlank(s1)) {
                s1 = null;
            }
            if(s1 != null) {
                DateUtils dateUtils0 = DateUtils.INSTANCE;
                if(Intrinsics.areEqual(s, "day")) {
                    s2 = DateUtils.getDayAgoDateTime$default(dateUtils0, 1, s1, "yyyy-MM-dd\'T\'HH:mm:ssXXX", null, 8, null);
                }
                else if(Intrinsics.areEqual(s, "week")) {
                    s2 = DateUtils.getDayAgoDateTime$default(dateUtils0, 7, s1, "yyyy-MM-dd\'T\'HH:mm:ssXXX", null, 8, null);
                }
                else {
                    s2 = Intrinsics.areEqual(s, "month") ? DateUtils.getMonthAgoDateTime$default(dateUtils0, s1, "yyyy-MM-dd\'T\'HH:mm:ssXXX", null, 4, null) : null;
                }
                if(s2 == null) {
                    return;
                }
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new l6(this, ((String)object0), s2, s, null), 3, null);
            }
        }
    }

    @NotNull
    public final MutableLiveData getTrendMoreItems() {
        return this.E;
    }

    @NotNull
    public final MutableLiveData getVisitorCount() {
        return this.w;
    }

    @NotNull
    public final MutableLiveData getVisitorTitle() {
        return this.v;
    }

    public final void init(@NotNull EntryItem entryItem0) {
        Intrinsics.checkNotNullParameter(entryItem0, "entryItem");
        this.p.setValue(entryItem0);
        MutableLiveData mutableLiveData0 = this.o;
        String s = entryItem0.getBlogName();
        if(s == null) {
            s = (String)this.i.getOldCurrentBlogName().getValue();
        }
        mutableLiveData0.setValue(s);
        String s1 = DateUtils.getCurrentDateTime$default(DateUtils.INSTANCE, null, 1, null);
        this.q.setValue(s1);
        String s2 = DateUtils.getCurrentDateTime$default(DateUtils.INSTANCE, null, 1, null);
        this.t.setValue(s2);
    }

    public final void init(@Nullable String s) {
        MutableLiveData mutableLiveData0 = this.o;
        if(s == null) {
            s = (String)this.i.getOldCurrentBlogName().getValue();
        }
        mutableLiveData0.setValue(s);
        String s1 = DateUtils.getCurrentDateTime$default(DateUtils.INSTANCE, null, 1, null);
        this.q.setValue(s1);
        String s2 = DateUtils.getCurrentDateTime$default(DateUtils.INSTANCE, null, 1, null);
        this.t.setValue(s2);
    }

    @Nullable
    public final Unit onClickBarGraphItem(int v) {
        if(this.a(v) != null) {
            boolean z = this.p.getValue() == null;
            StatisticsTiara.INSTANCE.trackClickGraphItem(z, ((String)this.r.getValue()), ((String)this.s.getValue()));
            this.A.setValue(v);
            String s = DateUtils.INSTANCE.getDateTimeFormatFromISO8601("", "yyyy-MM-dd");
            Object object0 = this.o.getValue();
            if(((String)object0) != null) {
                RefererKeywordItem statisticsItem$RefererKeywordItem0 = new RefererKeywordItem(0L, null, null, null, null, 0x1F, null);
                this.G.setValue(statisticsItem$RefererKeywordItem0);
                this.t.setValue(s);
                String s1 = (String)this.r.getValue();
                if(s1 == null) {
                    s1 = "day";
                }
                Intrinsics.checkNotNull(s1);
                this.isShowProgress().setValue(Boolean.TRUE);
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new k6(this, ((String)object0), s, s1, null), 3, null);
            }
            return Unit.INSTANCE;
        }
        return null;
    }

    public final void onClickRefererEtc() {
        boolean z = this.p.getValue() == null;
        StatisticsTiara.INSTANCE.trackClickRefererEtc(z);
        String s = (String)this.o.getValue();
        if(s != null) {
            Event event0 = new Event(s);
            this.l.setValue(event0);
        }
    }

    public final void onClickRefererKeyword(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "keyword");
        StatisticsTiara.INSTANCE.trackClickRefererKeyword();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new q6(this, s, null), 3, null);
    }

    public final void onClickRefresh() {
        StatisticsViewModel.getStatistics$default(this, null, null, 3, null);
    }

    public final void onClickTopPost(@NotNull TopPostItem statisticsItem$TopPostItem0) {
        Intrinsics.checkNotNullParameter(statisticsItem$TopPostItem0, "topPostItem");
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, this.getSection(), this.getPage(), TistoryTiaraActionType.CLICK_TOP_ENTRY, null, null, null, null, null, 0xF8, null);
        Object object0 = this.o.getValue();
        if(((String)object0) != null) {
            Event event0 = new Event(new EntryItem(statisticsItem$TopPostItem0.getId(), null, null, null, false, null, false, statisticsItem$TopPostItem0.getTitle(), null, null, null, null, null, null, null, null, null, null, ((String)object0), null, 0L, 0L, false, 0L, false, 0x1FBFF7E, null));
            this.m.setValue(event0);
        }
    }

    public final void onClickTopPostSeeAll() {
        StatisticsTiara.INSTANCE.trackClickTopPostSeeAll();
        String s = (String)this.o.getValue();
        if(s != null) {
            Event event0 = new Event(s);
            this.n.setValue(event0);
        }
    }

    public final void updateSortType(@Nullable SortItem sortItem0, @Nullable SortItem sortItem1) {
        this.getStatistics(sortItem0, sortItem1);
    }

    public static void updateSortType$default(StatisticsViewModel statisticsViewModel0, SortItem sortItem0, SortItem sortItem1, int v, Object object0) {
        if((v & 1) != 0) {
            sortItem0 = null;
        }
        if((v & 2) != 0) {
            sortItem1 = null;
        }
        statisticsViewModel0.updateSortType(sortItem0, sortItem1);
    }
}

