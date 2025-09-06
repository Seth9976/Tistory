package com.kakao.tistory.presentation.screen.revenue.item;

import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms;
import androidx.room.a;
import com.kakao.tistory.domain.revenue.entity.GraphDetailInfo;
import com.kakao.tistory.domain.revenue.entity.RevenueGraph;
import com.kakao.tistory.domain.revenue.entity.RevenueGraphDetailInfo;
import com.kakao.tistory.domain.revenue.entity.RevenueSummary;
import com.kakao.tistory.domain.revenue.entity.RevenueSupport;
import com.kakao.tistory.domain.revenue.usecase.RevenueInfo;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.NumberExtensionKt;
import com.kakao.tistory.presentation.common.graph.BarGraphItem;
import com.kakao.tistory.presentation.common.graph.GraphPeriod;
import com.kakao.tistory.presentation.common.graph.TweenBarGraphValue;
import com.kakao.tistory.presentation.common.utils.DateUtils;
import com.kakao.tistory.presentation.screen.revenue.ui.GraphPeriodType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0011\u0010\u0002\u001A\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u0019\u0010\u0002\u001A\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0002\u0010\b\u001A\u0011\u0010\u0002\u001A\u00020\n*\u00020\t¢\u0006\u0004\b\u0002\u0010\u000B\u001A\u001F\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u000E0\r*\u00020\f2\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u000F\u001A\u0011\u0010\u0002\u001A\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/RevenueSupport;", "Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSupportUiState;", "toUiState", "(Lcom/kakao/tistory/domain/revenue/entity/RevenueSupport;)Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSupportUiState;", "Lcom/kakao/tistory/domain/revenue/usecase/RevenueInfo;", "Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;", "periodType", "Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueInfoUiState;", "(Lcom/kakao/tistory/domain/revenue/usecase/RevenueInfo;Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;)Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueInfoUiState;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo;", "Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;", "(Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo;)Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraph;", "Lcom/kakao/tistory/presentation/common/graph/BarGraphItem;", "Lcom/kakao/tistory/presentation/common/graph/TweenBarGraphValue;", "(Lcom/kakao/tistory/domain/revenue/entity/RevenueGraph;Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;)Lcom/kakao/tistory/presentation/common/graph/BarGraphItem;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueSummary;", "Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSummaryUiState;", "(Lcom/kakao/tistory/domain/revenue/entity/RevenueSummary;)Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSummaryUiState;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRevenueMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RevenueMapper.kt\ncom/kakao/tistory/presentation/screen/revenue/item/RevenueMapperKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n53#2:134\n55#2:138\n50#3:135\n55#3:137\n107#4:136\n1#5:139\n*S KotlinDebug\n*F\n+ 1 RevenueMapper.kt\ncom/kakao/tistory/presentation/screen/revenue/item/RevenueMapperKt\n*L\n47#1:134\n47#1:138\n47#1:135\n47#1:137\n47#1:136\n*E\n"})
public final class RevenueMapperKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[GraphPeriodType.values().length];
            try {
                arr_v[GraphPeriodType.DAY.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[GraphPeriodType.WEEK.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[GraphPeriodType.MONTH.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    // 去混淆评级： 低(24)
    @NotNull
    public static final BarGraphItem toUiState(@NotNull RevenueGraph revenueGraph0, @NotNull GraphPeriodType graphPeriodType0) {
        Pair pair0;
        Intrinsics.checkNotNullParameter(revenueGraph0, "<this>");
        Intrinsics.checkNotNullParameter(graphPeriodType0, "periodType");
        switch(WhenMappings.$EnumSwitchMapping$0[graphPeriodType0.ordinal()]) {
            case 1: {
                pair0 = new Pair(String.valueOf(DateUtils.INSTANCE.dayOfMonth("")), DateUtils.INSTANCE.dayOfWeek(""));
                return new BarGraphItem(((String)pair0.component1()), ((String)pair0.component2()), new GraphPeriod("", ""), new TweenBarGraphValue(((float)revenueGraph0.getEarnings()), ((float)revenueGraph0.getImpression())));
            }
            case 2: {
                pair0 = new Pair(String.valueOf(DateUtils.INSTANCE.dayOfMonth("")), DateUtils.INSTANCE.getMonthOrEmpty(""));
                return new BarGraphItem(((String)pair0.component1()), ((String)pair0.component2()), new GraphPeriod("", ""), new TweenBarGraphValue(((float)revenueGraph0.getEarnings()), ((float)revenueGraph0.getImpression())));
            }
            case 3: {
                pair0 = new Pair(DateUtils.INSTANCE.getMonth(""), DateUtils.INSTANCE.getYearOrEmpty(""));
                return new BarGraphItem(((String)pair0.component1()), ((String)pair0.component2()), new GraphPeriod("", ""), new TweenBarGraphValue(((float)revenueGraph0.getEarnings()), ((float)revenueGraph0.getImpression())));
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public static final GraphDetailInfoUiState toUiState(@NotNull RevenueGraphDetailInfo revenueGraphDetailInfo0) {
        Intrinsics.checkNotNullParameter(revenueGraphDetailInfo0, "<this>");
        GraphDetailInfo graphDetailInfo0 = revenueGraphDetailInfo0.getGraphDetailInfo();
        String s = a.z("", NumberExtensionKt.numberFormatOfCurrency(graphDetailInfo0.getEarnings(), ""));
        String s1 = NumberExtensionKt.numberFormat(graphDetailInfo0.getImpression());
        String s2 = NumberExtensionKt.numberFormat(graphDetailInfo0.getClicks());
        Float float0 = graphDetailInfo0.getRpm();
        String s3 = float0 == null ? null : a.z("", NumberExtensionKt.numberFormatOfCurrency(float0.floatValue(), ""));
        Float float1 = graphDetailInfo0.getPageRpm();
        String s4 = float1 == null ? null : a.z("", NumberExtensionKt.numberFormatOfCurrency(float1.floatValue(), ""));
        Float float2 = graphDetailInfo0.getPageCtr();
        String s5 = float2 == null ? null : NumberExtensionKt.numberFormatWithDecimal(float2);
        Float float3 = graphDetailInfo0.getECpm();
        String s6 = float3 == null ? null : a.z("", NumberExtensionKt.numberFormatOfCurrency(float3.floatValue(), ""));
        Float float4 = graphDetailInfo0.getVCpm();
        return float4 == null ? new GraphDetailInfoUiState("", new DetailInfo(s, "", s1, s2, "", "", s3, s4, s5, s6, null)) : new GraphDetailInfoUiState("", new DetailInfo(s, "", s1, s2, "", "", s3, s4, s5, s6, a.z("", NumberExtensionKt.numberFormatOfCurrency(float4.floatValue(), ""))));
    }

    @NotNull
    public static final RevenueInfoUiState toUiState(@NotNull RevenueInfo revenueInfo0, @NotNull GraphPeriodType graphPeriodType0) {
        Intrinsics.checkNotNullParameter(revenueInfo0, "<this>");
        Intrinsics.checkNotNullParameter(graphPeriodType0, "periodType");
        return new RevenueInfoUiState(RevenueMapperKt.toUiState(revenueInfo0.getRevenueSummary()), new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.tistory.presentation.screen.revenue.item.RevenueMapperKt.toUiState..inlined.map.1.2 revenueMapperKt$toUiState$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.tistory.presentation.screen.revenue.item.RevenueMapperKt.toUiState..inlined.map.1.2.1 revenueMapperKt$toUiState$$inlined$map$1$2$10;
                        if(continuation0 instanceof com.kakao.tistory.presentation.screen.revenue.item.RevenueMapperKt.toUiState..inlined.map.1.2.1) {
                            revenueMapperKt$toUiState$$inlined$map$1$2$10 = (com.kakao.tistory.presentation.screen.revenue.item.RevenueMapperKt.toUiState..inlined.map.1.2.1)continuation0;
                            int v = revenueMapperKt$toUiState$$inlined$map$1$2$10.b;
                            if((v & 0x80000000) == 0) {
                                revenueMapperKt$toUiState$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object a;
                                    public int b;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.a = object0;
                                        this.b |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                revenueMapperKt$toUiState$$inlined$map$1$2$10.b = v ^ 0x80000000;
                            }
                        }
                        else {
                            revenueMapperKt$toUiState$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                public Object a;
                                public int b;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.a = object0;
                                    this.b |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = revenueMapperKt$toUiState$$inlined$map$1$2$10.a;
                        Object object2 = qd.a.getCOROUTINE_SUSPENDED();
                        switch(revenueMapperKt$toUiState$$inlined$map$1$2$10.b) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                PagingData pagingData0 = PagingDataTransforms.map(((PagingData)object0), new com.kakao.tistory.presentation.screen.revenue.item.a(this.b, null));
                                revenueMapperKt$toUiState$$inlined$map$1$2$10.b = 1;
                                return this.b.emit(pagingData0, revenueMapperKt$toUiState$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
                            }
                            case 1: {
                                ResultKt.throwOnFailure(object1);
                                return Unit.INSTANCE;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = revenueInfo0.getRevenueTrendGraph().getFlow().collect(revenueMapperKt$toUiState$$inlined$map$1$20, continuation0);
                return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }, RevenueMapperKt.toUiState(revenueInfo0.getRevenueGraphDetailInfo()));
    }

    // 去混淆评级： 中等(80)
    @NotNull
    public static final RevenueSummaryUiState toUiState(@NotNull RevenueSummary revenueSummary0) {
        Intrinsics.checkNotNullParameter(revenueSummary0, "<this>");
        return new RevenueSummaryUiState(DateUtils.INSTANCE.getDateTimeFormatFromISO8601("", "M. d. HH:mm"), "", "", new VariationEarningUiState(string.revenue_summary_earning, NumberExtensionKt.numberFormatOfCurrency(revenueSummary0.getTotalEarnings(), ""), null, 4, null), new VariationEarningUiState(string.revenue_summary_recent_day, NumberExtensionKt.numberFormatOfCurrency(revenueSummary0.getDay().getValue(), ""), revenueSummary0.getDay().getVariation()), new VariationEarningUiState(string.revenue_summary_recent_week, NumberExtensionKt.numberFormatOfCurrency(revenueSummary0.getWeek().getValue(), ""), revenueSummary0.getWeek().getVariation()), new VariationEarningUiState(string.revenue_summary_recent_month, NumberExtensionKt.numberFormatOfCurrency(revenueSummary0.getMonth().getValue(), ""), revenueSummary0.getMonth().getVariation()));
    }

    // 去混淆评级： 低(20)
    @NotNull
    public static final RevenueSupportUiState toUiState(@NotNull RevenueSupport revenueSupport0) {
        Intrinsics.checkNotNullParameter(revenueSupport0, "<this>");
        return new RevenueSupportUiState(DateUtils.INSTANCE.getDateTimeFormatFromISO8601("", "M. d. HH:mm"), new RevenueSupportItem(revenueSupport0.getSupportInfo().getEarnings(), revenueSupport0.getSupportInfo().getSupporterCount(), revenueSupport0.getSupportInfo().getSupportCount()));
    }
}

