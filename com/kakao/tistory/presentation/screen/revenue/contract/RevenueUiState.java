package com.kakao.tistory.presentation.screen.revenue.contract;

import a5.b;
import androidx.compose.runtime.Immutable;
import com.kakao.tistory.presentation.common.graph.a;
import com.kakao.tistory.presentation.screen.item.Vendor;
import com.kakao.tistory.presentation.screen.revenue.item.GraphDetailInfoUiState;
import com.kakao.tistory.presentation.screen.revenue.item.RevenueSummaryUiState;
import com.kakao.tistory.presentation.screen.revenue.item.RevenueSupportUiState;
import com.kakao.tistory.presentation.screen.revenue.ui.GraphPeriodType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bW\b\u0087\b\u0018\u00002\u00020\u0001B\u00CF\u0002\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u0012\b\b\u0002\u0010\u000E\u001A\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u000F\u0012\u001A\b\u0002\u0010\u0015\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00120\u0011\u0012\b\b\u0002\u0010\u0017\u001A\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001A\u00020\u0018\u0012\b\b\u0002\u0010\u001B\u001A\u00020\u001A\u0012#\u0010\"\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u001D\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u001C\u0012!\u0010#\u001A\u001D\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020!0\u001C\u0012\u0012\u0010$\u001A\u000E\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020!0\u001C\u0012!\u0010&\u001A\u001D\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020!0\u001C\u00123\u0010)\u001A/\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020!0\'\u00A2\u0006\u0004\b*\u0010+J\u0010\u0010,\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b,\u0010-J\u0012\u0010.\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010/J\u0010\u00100\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b0\u00101J\u0016\u00102\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0003\u00A2\u0006\u0004\b2\u00103J\u0012\u00104\u001A\u0004\u0018\u00010\tH\u00C6\u0003\u00A2\u0006\u0004\b4\u00105J\u0010\u00106\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b6\u00107J\u0010\u00108\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b8\u00101J\u0010\u00109\u001A\u00020\u000FH\u00C6\u0003\u00A2\u0006\u0004\b9\u0010:J\"\u0010;\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00120\u0011H\u00C6\u0003\u00A2\u0006\u0004\b;\u0010<J\u0010\u0010=\u001A\u00020\u0016H\u00C6\u0003\u00A2\u0006\u0004\b=\u0010>J\u0010\u0010?\u001A\u00020\u0018H\u00C6\u0003\u00A2\u0006\u0004\b?\u0010@J\u0010\u0010A\u001A\u00020\u001AH\u00C6\u0003\u00A2\u0006\u0004\bA\u0010BJ-\u0010C\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u001D\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u001CH\u00C6\u0003\u00A2\u0006\u0004\bC\u0010DJ+\u0010E\u001A\u001D\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020!0\u001CH\u00C6\u0003\u00A2\u0006\u0004\bE\u0010DJ\u001C\u0010F\u001A\u000E\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020!0\u001CH\u00C6\u0003\u00A2\u0006\u0004\bF\u0010DJ+\u0010G\u001A\u001D\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020!0\u001CH\u00C6\u0003\u00A2\u0006\u0004\bG\u0010DJ=\u0010H\u001A/\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020!0\'H\u00C6\u0003\u00A2\u0006\u0004\bH\u0010IJ\u00E2\u0002\u0010J\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\u00062\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\u001A\b\u0002\u0010\u0015\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00120\u00112\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u001B\u001A\u00020\u001A2%\b\u0002\u0010\"\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u001D\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u001C2#\b\u0002\u0010#\u001A\u001D\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020!0\u001C2\u0014\b\u0002\u0010$\u001A\u000E\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020!0\u001C2#\b\u0002\u0010&\u001A\u001D\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020!0\u001C25\b\u0002\u0010)\u001A/\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020!0\'H\u00C6\u0001\u00A2\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\bL\u00101J\u0010\u0010M\u001A\u00020\fH\u00D6\u0001\u00A2\u0006\u0004\bM\u00107J\u001A\u0010O\u001A\u00020\u00022\b\u0010N\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\bO\u0010PR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bQ\u0010R\u001A\u0004\b\u0003\u0010-R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\bS\u0010T\u001A\u0004\bU\u0010/R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bV\u0010W\u001A\u0004\bX\u00101R\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0006\u00A2\u0006\f\n\u0004\bY\u0010Z\u001A\u0004\b[\u00103R\u0019\u0010\u000B\u001A\u0004\u0018\u00010\t8\u0006\u00A2\u0006\f\n\u0004\b\\\u0010]\u001A\u0004\b^\u00105R\u0017\u0010\r\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\b_\u0010`\u001A\u0004\ba\u00107R\u0017\u0010\u000E\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bb\u0010W\u001A\u0004\bc\u00101R\u0017\u0010\u0010\u001A\u00020\u000F8\u0006\u00A2\u0006\f\n\u0004\bd\u0010e\u001A\u0004\bf\u0010:R)\u0010\u0015\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00120\u00118\u0006\u00A2\u0006\f\n\u0004\bg\u0010h\u001A\u0004\bi\u0010<R\u0017\u0010\u0017\u001A\u00020\u00168\u0006\u00A2\u0006\f\n\u0004\bj\u0010k\u001A\u0004\bl\u0010>R\u0017\u0010\u0019\u001A\u00020\u00188\u0006\u00A2\u0006\f\n\u0004\bm\u0010n\u001A\u0004\bo\u0010@R\u0017\u0010\u001B\u001A\u00020\u001A8\u0006\u00A2\u0006\f\n\u0004\bp\u0010q\u001A\u0004\br\u0010BR4\u0010\"\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u001D\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u001C8\u0006\u00A2\u0006\f\n\u0004\bs\u0010t\u001A\u0004\bu\u0010DR2\u0010#\u001A\u001D\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020!0\u001C8\u0006\u00A2\u0006\f\n\u0004\bv\u0010t\u001A\u0004\bw\u0010DR#\u0010$\u001A\u000E\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020!0\u001C8\u0006\u00A2\u0006\f\n\u0004\bx\u0010t\u001A\u0004\by\u0010DR2\u0010&\u001A\u001D\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020!0\u001C8\u0006\u00A2\u0006\f\n\u0004\bz\u0010t\u001A\u0004\b{\u0010DRD\u0010)\u001A/\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020!0\'8\u0006\u00A2\u0006\f\n\u0004\b|\u0010}\u001A\u0004\b~\u0010I\u00A8\u0006\u007F"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueUiState;", "", "", "isLoading", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueFailState;", "failState", "", "blogName", "", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "vendorList", "selectedVendor", "", "selectedGraphPosition", "lastUpdateTime", "Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSummaryUiState;", "revenueSummary", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/kakao/tistory/presentation/common/graph/BarGraphItem;", "Lcom/kakao/tistory/presentation/common/graph/TweenBarGraphValue;", "revenueTrendGraph", "Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;", "revenueGraphDetailInfo", "Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSupportUiState;", "revenueSupport", "Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;", "granularity", "Lkotlin/Function1;", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "Lkotlin/ParameterName;", "name", "blogInfo", "", "changeBlogInfo", "refresh", "onClickGraphPeriodType", "vendor", "onClickVendor", "Lkotlin/Function4;", "Lcom/kakao/tistory/presentation/common/graph/GraphPeriod;", "onClickGraphItem", "<init>", "(ZLcom/kakao/tistory/presentation/screen/revenue/contract/RevenueFailState;Ljava/lang/String;Ljava/util/List;Lcom/kakao/tistory/presentation/screen/item/Vendor;ILjava/lang/String;Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSummaryUiState;Lkotlinx/coroutines/flow/Flow;Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSupportUiState;Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "component1", "()Z", "component2", "()Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueFailState;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "component5", "()Lcom/kakao/tistory/presentation/screen/item/Vendor;", "component6", "()I", "component7", "component8", "()Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSummaryUiState;", "component9", "()Lkotlinx/coroutines/flow/Flow;", "component10", "()Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;", "component11", "()Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSupportUiState;", "component12", "()Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;", "component13", "()Lkotlin/jvm/functions/Function1;", "component14", "component15", "component16", "component17", "()Lkotlin/jvm/functions/Function4;", "copy", "(ZLcom/kakao/tistory/presentation/screen/revenue/contract/RevenueFailState;Ljava/lang/String;Ljava/util/List;Lcom/kakao/tistory/presentation/screen/item/Vendor;ILjava/lang/String;Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSummaryUiState;Lkotlinx/coroutines/flow/Flow;Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSupportUiState;Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueUiState;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueFailState;", "getFailState", "c", "Ljava/lang/String;", "getBlogName", "d", "Ljava/util/List;", "getVendorList", "e", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "getSelectedVendor", "f", "I", "getSelectedGraphPosition", "g", "getLastUpdateTime", "h", "Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSummaryUiState;", "getRevenueSummary", "i", "Lkotlinx/coroutines/flow/Flow;", "getRevenueTrendGraph", "j", "Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;", "getRevenueGraphDetailInfo", "k", "Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSupportUiState;", "getRevenueSupport", "l", "Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;", "getGranularity", "m", "Lkotlin/jvm/functions/Function1;", "getChangeBlogInfo", "n", "getRefresh", "o", "getOnClickGraphPeriodType", "p", "getOnClickVendor", "q", "Lkotlin/jvm/functions/Function4;", "getOnClickGraphItem", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RevenueUiState {
    public static final int $stable;
    public final boolean a;
    public final RevenueFailState b;
    public final String c;
    public final List d;
    public final Vendor e;
    public final int f;
    public final String g;
    public final RevenueSummaryUiState h;
    public final Flow i;
    public final GraphDetailInfoUiState j;
    public final RevenueSupportUiState k;
    public final GraphPeriodType l;
    public final Function1 m;
    public final Function1 n;
    public final Function1 o;
    public final Function1 p;
    public final Function4 q;

    public RevenueUiState(boolean z, @Nullable RevenueFailState revenueFailState0, @NotNull String s, @NotNull List list0, @Nullable Vendor vendor0, int v, @NotNull String s1, @NotNull RevenueSummaryUiState revenueSummaryUiState0, @NotNull Flow flow0, @NotNull GraphDetailInfoUiState graphDetailInfoUiState0, @NotNull RevenueSupportUiState revenueSupportUiState0, @NotNull GraphPeriodType graphPeriodType0, @NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function1 function12, @NotNull Function1 function13, @NotNull Function4 function40) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(list0, "vendorList");
        Intrinsics.checkNotNullParameter(s1, "lastUpdateTime");
        Intrinsics.checkNotNullParameter(revenueSummaryUiState0, "revenueSummary");
        Intrinsics.checkNotNullParameter(flow0, "revenueTrendGraph");
        Intrinsics.checkNotNullParameter(graphDetailInfoUiState0, "revenueGraphDetailInfo");
        Intrinsics.checkNotNullParameter(revenueSupportUiState0, "revenueSupport");
        Intrinsics.checkNotNullParameter(graphPeriodType0, "granularity");
        Intrinsics.checkNotNullParameter(function10, "changeBlogInfo");
        Intrinsics.checkNotNullParameter(function11, "refresh");
        Intrinsics.checkNotNullParameter(function12, "onClickGraphPeriodType");
        Intrinsics.checkNotNullParameter(function13, "onClickVendor");
        Intrinsics.checkNotNullParameter(function40, "onClickGraphItem");
        super();
        this.a = z;
        this.b = revenueFailState0;
        this.c = s;
        this.d = list0;
        this.e = vendor0;
        this.f = v;
        this.g = s1;
        this.h = revenueSummaryUiState0;
        this.i = flow0;
        this.j = graphDetailInfoUiState0;
        this.k = revenueSupportUiState0;
        this.l = graphPeriodType0;
        this.m = function10;
        this.n = function11;
        this.o = function12;
        this.p = function13;
        this.q = function40;
    }

    public RevenueUiState(boolean z, RevenueFailState revenueFailState0, String s, List list0, Vendor vendor0, int v, String s1, RevenueSummaryUiState revenueSummaryUiState0, Flow flow0, GraphDetailInfoUiState graphDetailInfoUiState0, RevenueSupportUiState revenueSupportUiState0, GraphPeriodType graphPeriodType0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function4 function40, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v1 & 1) == 0 ? z : true), ((v1 & 2) == 0 ? revenueFailState0 : null), ((v1 & 4) == 0 ? s : "notice"), ((v1 & 8) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()), ((v1 & 16) == 0 ? vendor0 : null), ((v1 & 0x20) == 0 ? v : 0), ((v1 & 0x40) == 0 ? s1 : ""), ((v1 & 0x80) == 0 ? revenueSummaryUiState0 : new RevenueSummaryUiState(null, null, null, null, null, null, null, 0x7F, null)), ((v1 & 0x100) == 0 ? flow0 : FlowKt.emptyFlow()), ((v1 & 0x200) == 0 ? graphDetailInfoUiState0 : new GraphDetailInfoUiState(null, null, 3, null)), ((v1 & 0x400) == 0 ? revenueSupportUiState0 : new RevenueSupportUiState(null, null, 3, null)), ((v1 & 0x800) == 0 ? graphPeriodType0 : GraphPeriodType.DAY), function10, function11, function12, function13, function40);
    }

    public final boolean component1() {
        return this.a;
    }

    @NotNull
    public final GraphDetailInfoUiState component10() {
        return this.j;
    }

    @NotNull
    public final RevenueSupportUiState component11() {
        return this.k;
    }

    @NotNull
    public final GraphPeriodType component12() {
        return this.l;
    }

    @NotNull
    public final Function1 component13() {
        return this.m;
    }

    @NotNull
    public final Function1 component14() {
        return this.n;
    }

    @NotNull
    public final Function1 component15() {
        return this.o;
    }

    @NotNull
    public final Function1 component16() {
        return this.p;
    }

    @NotNull
    public final Function4 component17() {
        return this.q;
    }

    @Nullable
    public final RevenueFailState component2() {
        return this.b;
    }

    @NotNull
    public final String component3() {
        return this.c;
    }

    @NotNull
    public final List component4() {
        return this.d;
    }

    @Nullable
    public final Vendor component5() {
        return this.e;
    }

    public final int component6() {
        return this.f;
    }

    @NotNull
    public final String component7() {
        return this.g;
    }

    @NotNull
    public final RevenueSummaryUiState component8() {
        return this.h;
    }

    @NotNull
    public final Flow component9() {
        return this.i;
    }

    @NotNull
    public final RevenueUiState copy(boolean z, @Nullable RevenueFailState revenueFailState0, @NotNull String s, @NotNull List list0, @Nullable Vendor vendor0, int v, @NotNull String s1, @NotNull RevenueSummaryUiState revenueSummaryUiState0, @NotNull Flow flow0, @NotNull GraphDetailInfoUiState graphDetailInfoUiState0, @NotNull RevenueSupportUiState revenueSupportUiState0, @NotNull GraphPeriodType graphPeriodType0, @NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function1 function12, @NotNull Function1 function13, @NotNull Function4 function40) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(list0, "vendorList");
        Intrinsics.checkNotNullParameter(s1, "lastUpdateTime");
        Intrinsics.checkNotNullParameter(revenueSummaryUiState0, "revenueSummary");
        Intrinsics.checkNotNullParameter(flow0, "revenueTrendGraph");
        Intrinsics.checkNotNullParameter(graphDetailInfoUiState0, "revenueGraphDetailInfo");
        Intrinsics.checkNotNullParameter(revenueSupportUiState0, "revenueSupport");
        Intrinsics.checkNotNullParameter(graphPeriodType0, "granularity");
        Intrinsics.checkNotNullParameter(function10, "changeBlogInfo");
        Intrinsics.checkNotNullParameter(function11, "refresh");
        Intrinsics.checkNotNullParameter(function12, "onClickGraphPeriodType");
        Intrinsics.checkNotNullParameter(function13, "onClickVendor");
        Intrinsics.checkNotNullParameter(function40, "onClickGraphItem");
        return new RevenueUiState(z, revenueFailState0, s, list0, vendor0, v, s1, revenueSummaryUiState0, flow0, graphDetailInfoUiState0, revenueSupportUiState0, graphPeriodType0, function10, function11, function12, function13, function40);
    }

    public static RevenueUiState copy$default(RevenueUiState revenueUiState0, boolean z, RevenueFailState revenueFailState0, String s, List list0, Vendor vendor0, int v, String s1, RevenueSummaryUiState revenueSummaryUiState0, Flow flow0, GraphDetailInfoUiState graphDetailInfoUiState0, RevenueSupportUiState revenueSupportUiState0, GraphPeriodType graphPeriodType0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function4 function40, int v1, Object object0) {
        boolean z1 = (v1 & 1) == 0 ? z : revenueUiState0.a;
        RevenueFailState revenueFailState1 = (v1 & 2) == 0 ? revenueFailState0 : revenueUiState0.b;
        String s2 = (v1 & 4) == 0 ? s : revenueUiState0.c;
        List list1 = (v1 & 8) == 0 ? list0 : revenueUiState0.d;
        Vendor vendor1 = (v1 & 16) == 0 ? vendor0 : revenueUiState0.e;
        int v2 = (v1 & 0x20) == 0 ? v : revenueUiState0.f;
        String s3 = (v1 & 0x40) == 0 ? s1 : revenueUiState0.g;
        RevenueSummaryUiState revenueSummaryUiState1 = (v1 & 0x80) == 0 ? revenueSummaryUiState0 : revenueUiState0.h;
        Flow flow1 = (v1 & 0x100) == 0 ? flow0 : revenueUiState0.i;
        GraphDetailInfoUiState graphDetailInfoUiState1 = (v1 & 0x200) == 0 ? graphDetailInfoUiState0 : revenueUiState0.j;
        RevenueSupportUiState revenueSupportUiState1 = (v1 & 0x400) == 0 ? revenueSupportUiState0 : revenueUiState0.k;
        GraphPeriodType graphPeriodType1 = (v1 & 0x800) == 0 ? graphPeriodType0 : revenueUiState0.l;
        Function1 function14 = (v1 & 0x1000) == 0 ? function10 : revenueUiState0.m;
        Function1 function15 = (v1 & 0x2000) == 0 ? function11 : revenueUiState0.n;
        Function1 function16 = (v1 & 0x4000) == 0 ? function12 : revenueUiState0.o;
        Function1 function17 = (v1 & 0x8000) == 0 ? function13 : revenueUiState0.p;
        return (v1 & 0x10000) == 0 ? revenueUiState0.copy(z1, revenueFailState1, s2, list1, vendor1, v2, s3, revenueSummaryUiState1, flow1, graphDetailInfoUiState1, revenueSupportUiState1, graphPeriodType1, function14, function15, function16, function17, function40) : revenueUiState0.copy(z1, revenueFailState1, s2, list1, vendor1, v2, s3, revenueSummaryUiState1, flow1, graphDetailInfoUiState1, revenueSupportUiState1, graphPeriodType1, function14, function15, function16, function17, revenueUiState0.q);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RevenueUiState)) {
            return false;
        }
        if(this.a != ((RevenueUiState)object0).a) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((RevenueUiState)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((RevenueUiState)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((RevenueUiState)object0).d)) {
            return false;
        }
        if(this.e != ((RevenueUiState)object0).e) {
            return false;
        }
        if(this.f != ((RevenueUiState)object0).f) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((RevenueUiState)object0).g)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.h, ((RevenueUiState)object0).h)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.i, ((RevenueUiState)object0).i)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.j, ((RevenueUiState)object0).j)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.k, ((RevenueUiState)object0).k)) {
            return false;
        }
        if(this.l != ((RevenueUiState)object0).l) {
            return false;
        }
        if(!Intrinsics.areEqual(this.m, ((RevenueUiState)object0).m)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.n, ((RevenueUiState)object0).n)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.o, ((RevenueUiState)object0).o)) {
            return false;
        }
        return Intrinsics.areEqual(this.p, ((RevenueUiState)object0).p) ? Intrinsics.areEqual(this.q, ((RevenueUiState)object0).q) : false;
    }

    @NotNull
    public final String getBlogName() {
        return this.c;
    }

    @NotNull
    public final Function1 getChangeBlogInfo() {
        return this.m;
    }

    @Nullable
    public final RevenueFailState getFailState() {
        return this.b;
    }

    @NotNull
    public final GraphPeriodType getGranularity() {
        return this.l;
    }

    @NotNull
    public final String getLastUpdateTime() {
        return this.g;
    }

    @NotNull
    public final Function4 getOnClickGraphItem() {
        return this.q;
    }

    @NotNull
    public final Function1 getOnClickGraphPeriodType() {
        return this.o;
    }

    @NotNull
    public final Function1 getOnClickVendor() {
        return this.p;
    }

    @NotNull
    public final Function1 getRefresh() {
        return this.n;
    }

    @NotNull
    public final GraphDetailInfoUiState getRevenueGraphDetailInfo() {
        return this.j;
    }

    @NotNull
    public final RevenueSummaryUiState getRevenueSummary() {
        return this.h;
    }

    @NotNull
    public final RevenueSupportUiState getRevenueSupport() {
        return this.k;
    }

    @NotNull
    public final Flow getRevenueTrendGraph() {
        return this.i;
    }

    public final int getSelectedGraphPosition() {
        return this.f;
    }

    @Nullable
    public final Vendor getSelectedVendor() {
        return this.e;
    }

    @NotNull
    public final List getVendorList() {
        return this.d;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = b.c(this.d, a.a(this.c, (Boolean.hashCode(this.a) * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F, 0x1F), 0x1F);
        Vendor vendor0 = this.e;
        if(vendor0 != null) {
            v = vendor0.hashCode();
        }
        return this.q.hashCode() + com.kakao.tistory.presentation.main.contract.b.a(this.p, com.kakao.tistory.presentation.main.contract.b.a(this.o, com.kakao.tistory.presentation.main.contract.b.a(this.n, com.kakao.tistory.presentation.main.contract.b.a(this.m, (this.l.hashCode() + (this.k.hashCode() + (this.j.hashCode() + (this.i.hashCode() + (this.h.hashCode() + a.a(this.g, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.f, (v1 + v) * 0x1F, 0x1F), 0x1F)) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
    }

    public final boolean isLoading() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        return "RevenueUiState(isLoading=" + this.a + ", failState=" + this.b + ", blogName=" + this.c + ", vendorList=" + this.d + ", selectedVendor=" + this.e + ", selectedGraphPosition=" + this.f + ", lastUpdateTime=" + this.g + ", revenueSummary=" + this.h + ", revenueTrendGraph=" + this.i + ", revenueGraphDetailInfo=" + this.j + ", revenueSupport=" + this.k + ", granularity=" + this.l + ", changeBlogInfo=" + this.m + ", refresh=" + this.n + ", onClickGraphPeriodType=" + this.o + ", onClickVendor=" + this.p + ", onClickGraphItem=" + this.q + ")";
    }
}

