package com.kakao.tistory.presentation.screen.revenue.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.presentation.common.graph.GraphPeriod;
import com.kakao.tistory.presentation.screen.item.Vendor;
import com.kakao.tistory.presentation.screen.revenue.item.GraphDetailInfoUiState;
import com.kakao.tistory.presentation.screen.revenue.item.RevenueInfoUiState;
import com.kakao.tistory.presentation.screen.revenue.item.RevenueSupportUiState;
import com.kakao.tistory.presentation.screen.revenue.ui.GraphPeriodType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000B\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\u0082\u0001\u000B\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent;", "", "ChangeBlogInfo", "ChangedGraphPeriodType", "ChangedVendor", "LoadRevenue", "LoadRevenueFailed", "LoadVendorList", "LoadedGraphDetailInfo", "LoadedRevenue", "LoadedRevenueSupport", "LoadedVendorList", "SelectedGraphItem", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$ChangeBlogInfo;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$ChangedGraphPeriodType;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$ChangedVendor;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadRevenue;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadRevenueFailed;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadVendorList;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadedGraphDetailInfo;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadedRevenue;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadedRevenueSupport;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadedVendorList;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$SelectedGraphItem;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface RevenueIntent {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$ChangeBlogInfo;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent;", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "blog", "<init>", "(Lcom/kakao/tistory/domain/blog/entity/BlogInfo;)V", "component1", "()Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "copy", "(Lcom/kakao/tistory/domain/blog/entity/BlogInfo;)Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$ChangeBlogInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "getBlog", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeBlogInfo implements RevenueIntent {
        public static final int $stable = 8;
        public final BlogInfo a;

        public ChangeBlogInfo(@Nullable BlogInfo blogInfo0) {
            this.a = blogInfo0;
        }

        @Nullable
        public final BlogInfo component1() {
            return this.a;
        }

        @NotNull
        public final ChangeBlogInfo copy(@Nullable BlogInfo blogInfo0) {
            return new ChangeBlogInfo(blogInfo0);
        }

        public static ChangeBlogInfo copy$default(ChangeBlogInfo revenueIntent$ChangeBlogInfo0, BlogInfo blogInfo0, int v, Object object0) {
            if((v & 1) != 0) {
                blogInfo0 = revenueIntent$ChangeBlogInfo0.a;
            }
            return revenueIntent$ChangeBlogInfo0.copy(blogInfo0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeBlogInfo ? Intrinsics.areEqual(this.a, ((ChangeBlogInfo)object0).a) : false;
        }

        @Nullable
        public final BlogInfo getBlog() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeBlogInfo(blog=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$ChangedGraphPeriodType;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent;", "Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;", "type", "<init>", "(Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;", "copy", "(Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;)Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$ChangedGraphPeriodType;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;", "getType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangedGraphPeriodType implements RevenueIntent {
        public static final int $stable;
        public final GraphPeriodType a;

        public ChangedGraphPeriodType(@NotNull GraphPeriodType graphPeriodType0) {
            Intrinsics.checkNotNullParameter(graphPeriodType0, "type");
            super();
            this.a = graphPeriodType0;
        }

        @NotNull
        public final GraphPeriodType component1() {
            return this.a;
        }

        @NotNull
        public final ChangedGraphPeriodType copy(@NotNull GraphPeriodType graphPeriodType0) {
            Intrinsics.checkNotNullParameter(graphPeriodType0, "type");
            return new ChangedGraphPeriodType(graphPeriodType0);
        }

        public static ChangedGraphPeriodType copy$default(ChangedGraphPeriodType revenueIntent$ChangedGraphPeriodType0, GraphPeriodType graphPeriodType0, int v, Object object0) {
            if((v & 1) != 0) {
                graphPeriodType0 = revenueIntent$ChangedGraphPeriodType0.a;
            }
            return revenueIntent$ChangedGraphPeriodType0.copy(graphPeriodType0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangedGraphPeriodType ? this.a == ((ChangedGraphPeriodType)object0).a : false;
        }

        @NotNull
        public final GraphPeriodType getType() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangedGraphPeriodType(type=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$ChangedVendor;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent;", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "vendor", "<init>", "(Lcom/kakao/tistory/presentation/screen/item/Vendor;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/item/Vendor;", "copy", "(Lcom/kakao/tistory/presentation/screen/item/Vendor;)Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$ChangedVendor;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "getVendor", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangedVendor implements RevenueIntent {
        public static final int $stable;
        public final Vendor a;

        public ChangedVendor(@NotNull Vendor vendor0) {
            Intrinsics.checkNotNullParameter(vendor0, "vendor");
            super();
            this.a = vendor0;
        }

        @NotNull
        public final Vendor component1() {
            return this.a;
        }

        @NotNull
        public final ChangedVendor copy(@NotNull Vendor vendor0) {
            Intrinsics.checkNotNullParameter(vendor0, "vendor");
            return new ChangedVendor(vendor0);
        }

        public static ChangedVendor copy$default(ChangedVendor revenueIntent$ChangedVendor0, Vendor vendor0, int v, Object object0) {
            if((v & 1) != 0) {
                vendor0 = revenueIntent$ChangedVendor0.a;
            }
            return revenueIntent$ChangedVendor0.copy(vendor0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangedVendor ? this.a == ((ChangedVendor)object0).a : false;
        }

        @NotNull
        public final Vendor getVendor() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangedVendor(vendor=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u000B¨\u0006\u001F"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadRevenue;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent;", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "selectedVendor", "Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;", "periodType", "<init>", "(Lcom/kakao/tistory/presentation/screen/item/Vendor;Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/item/Vendor;", "component2", "()Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;", "copy", "(Lcom/kakao/tistory/presentation/screen/item/Vendor;Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;)Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadRevenue;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "getSelectedVendor", "b", "Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;", "getPeriodType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class LoadRevenue implements RevenueIntent {
        public static final int $stable;
        public final Vendor a;
        public final GraphPeriodType b;

        public LoadRevenue(@NotNull Vendor vendor0, @NotNull GraphPeriodType graphPeriodType0) {
            Intrinsics.checkNotNullParameter(vendor0, "selectedVendor");
            Intrinsics.checkNotNullParameter(graphPeriodType0, "periodType");
            super();
            this.a = vendor0;
            this.b = graphPeriodType0;
        }

        @NotNull
        public final Vendor component1() {
            return this.a;
        }

        @NotNull
        public final GraphPeriodType component2() {
            return this.b;
        }

        @NotNull
        public final LoadRevenue copy(@NotNull Vendor vendor0, @NotNull GraphPeriodType graphPeriodType0) {
            Intrinsics.checkNotNullParameter(vendor0, "selectedVendor");
            Intrinsics.checkNotNullParameter(graphPeriodType0, "periodType");
            return new LoadRevenue(vendor0, graphPeriodType0);
        }

        public static LoadRevenue copy$default(LoadRevenue revenueIntent$LoadRevenue0, Vendor vendor0, GraphPeriodType graphPeriodType0, int v, Object object0) {
            if((v & 1) != 0) {
                vendor0 = revenueIntent$LoadRevenue0.a;
            }
            if((v & 2) != 0) {
                graphPeriodType0 = revenueIntent$LoadRevenue0.b;
            }
            return revenueIntent$LoadRevenue0.copy(vendor0, graphPeriodType0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof LoadRevenue)) {
                return false;
            }
            return this.a == ((LoadRevenue)object0).a ? this.b == ((LoadRevenue)object0).b : false;
        }

        @NotNull
        public final GraphPeriodType getPeriodType() {
            return this.b;
        }

        @NotNull
        public final Vendor getSelectedVendor() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "LoadRevenue(selectedVendor=" + this.a + ", periodType=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadRevenueFailed;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueFailState;", "revenueFailState", "<init>", "(Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueFailState;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueFailState;", "copy", "(Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueFailState;)Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadRevenueFailed;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueFailState;", "getRevenueFailState", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class LoadRevenueFailed implements RevenueIntent {
        public static final int $stable = 8;
        public final RevenueFailState a;

        public LoadRevenueFailed(@NotNull RevenueFailState revenueFailState0) {
            Intrinsics.checkNotNullParameter(revenueFailState0, "revenueFailState");
            super();
            this.a = revenueFailState0;
        }

        @NotNull
        public final RevenueFailState component1() {
            return this.a;
        }

        @NotNull
        public final LoadRevenueFailed copy(@NotNull RevenueFailState revenueFailState0) {
            Intrinsics.checkNotNullParameter(revenueFailState0, "revenueFailState");
            return new LoadRevenueFailed(revenueFailState0);
        }

        public static LoadRevenueFailed copy$default(LoadRevenueFailed revenueIntent$LoadRevenueFailed0, RevenueFailState revenueFailState0, int v, Object object0) {
            if((v & 1) != 0) {
                revenueFailState0 = revenueIntent$LoadRevenueFailed0.a;
            }
            return revenueIntent$LoadRevenueFailed0.copy(revenueFailState0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof LoadRevenueFailed ? Intrinsics.areEqual(this.a, ((LoadRevenueFailed)object0).a) : false;
        }

        @NotNull
        public final RevenueFailState getRevenueFailState() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "LoadRevenueFailed(revenueFailState=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadVendorList;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent;", "", "blogName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadVendorList;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class LoadVendorList implements RevenueIntent {
        public static final int $stable;
        public final String a;

        public LoadVendorList(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            super();
            this.a = s;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final LoadVendorList copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            return new LoadVendorList(s);
        }

        public static LoadVendorList copy$default(LoadVendorList revenueIntent$LoadVendorList0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = revenueIntent$LoadVendorList0.a;
            }
            return revenueIntent$LoadVendorList0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof LoadVendorList ? Intrinsics.areEqual(this.a, ((LoadVendorList)object0).a) : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "LoadVendorList(blogName=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadedGraphDetailInfo;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent;", "Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;", "revenueGraphDetailInfo", "<init>", "(Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;", "copy", "(Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;)Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadedGraphDetailInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;", "getRevenueGraphDetailInfo", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class LoadedGraphDetailInfo implements RevenueIntent {
        public static final int $stable;
        public final GraphDetailInfoUiState a;

        public LoadedGraphDetailInfo(@NotNull GraphDetailInfoUiState graphDetailInfoUiState0) {
            Intrinsics.checkNotNullParameter(graphDetailInfoUiState0, "revenueGraphDetailInfo");
            super();
            this.a = graphDetailInfoUiState0;
        }

        @NotNull
        public final GraphDetailInfoUiState component1() {
            return this.a;
        }

        @NotNull
        public final LoadedGraphDetailInfo copy(@NotNull GraphDetailInfoUiState graphDetailInfoUiState0) {
            Intrinsics.checkNotNullParameter(graphDetailInfoUiState0, "revenueGraphDetailInfo");
            return new LoadedGraphDetailInfo(graphDetailInfoUiState0);
        }

        public static LoadedGraphDetailInfo copy$default(LoadedGraphDetailInfo revenueIntent$LoadedGraphDetailInfo0, GraphDetailInfoUiState graphDetailInfoUiState0, int v, Object object0) {
            if((v & 1) != 0) {
                graphDetailInfoUiState0 = revenueIntent$LoadedGraphDetailInfo0.a;
            }
            return revenueIntent$LoadedGraphDetailInfo0.copy(graphDetailInfoUiState0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof LoadedGraphDetailInfo ? Intrinsics.areEqual(this.a, ((LoadedGraphDetailInfo)object0).a) : false;
        }

        @NotNull
        public final GraphDetailInfoUiState getRevenueGraphDetailInfo() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "LoadedGraphDetailInfo(revenueGraphDetailInfo=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ.\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001A\u0010\u001B\u001A\u00020\u001A2\b\u0010\u0019\u001A\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\rR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u000F¨\u0006&"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadedRevenue;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent;", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "selectedVendor", "Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;", "periodType", "Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueInfoUiState;", "revenueInfo", "<init>", "(Lcom/kakao/tistory/presentation/screen/item/Vendor;Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueInfoUiState;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/item/Vendor;", "component2", "()Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;", "component3", "()Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueInfoUiState;", "copy", "(Lcom/kakao/tistory/presentation/screen/item/Vendor;Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueInfoUiState;)Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadedRevenue;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "getSelectedVendor", "b", "Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;", "getPeriodType", "c", "Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueInfoUiState;", "getRevenueInfo", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class LoadedRevenue implements RevenueIntent {
        public static final int $stable = 8;
        public final Vendor a;
        public final GraphPeriodType b;
        public final RevenueInfoUiState c;

        public LoadedRevenue(@NotNull Vendor vendor0, @NotNull GraphPeriodType graphPeriodType0, @NotNull RevenueInfoUiState revenueInfoUiState0) {
            Intrinsics.checkNotNullParameter(vendor0, "selectedVendor");
            Intrinsics.checkNotNullParameter(graphPeriodType0, "periodType");
            Intrinsics.checkNotNullParameter(revenueInfoUiState0, "revenueInfo");
            super();
            this.a = vendor0;
            this.b = graphPeriodType0;
            this.c = revenueInfoUiState0;
        }

        @NotNull
        public final Vendor component1() {
            return this.a;
        }

        @NotNull
        public final GraphPeriodType component2() {
            return this.b;
        }

        @NotNull
        public final RevenueInfoUiState component3() {
            return this.c;
        }

        @NotNull
        public final LoadedRevenue copy(@NotNull Vendor vendor0, @NotNull GraphPeriodType graphPeriodType0, @NotNull RevenueInfoUiState revenueInfoUiState0) {
            Intrinsics.checkNotNullParameter(vendor0, "selectedVendor");
            Intrinsics.checkNotNullParameter(graphPeriodType0, "periodType");
            Intrinsics.checkNotNullParameter(revenueInfoUiState0, "revenueInfo");
            return new LoadedRevenue(vendor0, graphPeriodType0, revenueInfoUiState0);
        }

        public static LoadedRevenue copy$default(LoadedRevenue revenueIntent$LoadedRevenue0, Vendor vendor0, GraphPeriodType graphPeriodType0, RevenueInfoUiState revenueInfoUiState0, int v, Object object0) {
            if((v & 1) != 0) {
                vendor0 = revenueIntent$LoadedRevenue0.a;
            }
            if((v & 2) != 0) {
                graphPeriodType0 = revenueIntent$LoadedRevenue0.b;
            }
            if((v & 4) != 0) {
                revenueInfoUiState0 = revenueIntent$LoadedRevenue0.c;
            }
            return revenueIntent$LoadedRevenue0.copy(vendor0, graphPeriodType0, revenueInfoUiState0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof LoadedRevenue)) {
                return false;
            }
            if(this.a != ((LoadedRevenue)object0).a) {
                return false;
            }
            return this.b == ((LoadedRevenue)object0).b ? Intrinsics.areEqual(this.c, ((LoadedRevenue)object0).c) : false;
        }

        @NotNull
        public final GraphPeriodType getPeriodType() {
            return this.b;
        }

        @NotNull
        public final RevenueInfoUiState getRevenueInfo() {
            return this.c;
        }

        @NotNull
        public final Vendor getSelectedVendor() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "LoadedRevenue(selectedVendor=" + this.a + ", periodType=" + this.b + ", revenueInfo=" + this.c + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u000B¨\u0006\u001F"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadedRevenueSupport;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent;", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "selectedVendor", "Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSupportUiState;", "revenueSupport", "<init>", "(Lcom/kakao/tistory/presentation/screen/item/Vendor;Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSupportUiState;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/item/Vendor;", "component2", "()Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSupportUiState;", "copy", "(Lcom/kakao/tistory/presentation/screen/item/Vendor;Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSupportUiState;)Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadedRevenueSupport;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "getSelectedVendor", "b", "Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSupportUiState;", "getRevenueSupport", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class LoadedRevenueSupport implements RevenueIntent {
        public static final int $stable;
        public final Vendor a;
        public final RevenueSupportUiState b;

        public LoadedRevenueSupport(@NotNull Vendor vendor0, @NotNull RevenueSupportUiState revenueSupportUiState0) {
            Intrinsics.checkNotNullParameter(vendor0, "selectedVendor");
            Intrinsics.checkNotNullParameter(revenueSupportUiState0, "revenueSupport");
            super();
            this.a = vendor0;
            this.b = revenueSupportUiState0;
        }

        @NotNull
        public final Vendor component1() {
            return this.a;
        }

        @NotNull
        public final RevenueSupportUiState component2() {
            return this.b;
        }

        @NotNull
        public final LoadedRevenueSupport copy(@NotNull Vendor vendor0, @NotNull RevenueSupportUiState revenueSupportUiState0) {
            Intrinsics.checkNotNullParameter(vendor0, "selectedVendor");
            Intrinsics.checkNotNullParameter(revenueSupportUiState0, "revenueSupport");
            return new LoadedRevenueSupport(vendor0, revenueSupportUiState0);
        }

        public static LoadedRevenueSupport copy$default(LoadedRevenueSupport revenueIntent$LoadedRevenueSupport0, Vendor vendor0, RevenueSupportUiState revenueSupportUiState0, int v, Object object0) {
            if((v & 1) != 0) {
                vendor0 = revenueIntent$LoadedRevenueSupport0.a;
            }
            if((v & 2) != 0) {
                revenueSupportUiState0 = revenueIntent$LoadedRevenueSupport0.b;
            }
            return revenueIntent$LoadedRevenueSupport0.copy(vendor0, revenueSupportUiState0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof LoadedRevenueSupport)) {
                return false;
            }
            return this.a == ((LoadedRevenueSupport)object0).a ? Intrinsics.areEqual(this.b, ((LoadedRevenueSupport)object0).b) : false;
        }

        @NotNull
        public final RevenueSupportUiState getRevenueSupport() {
            return this.b;
        }

        @NotNull
        public final Vendor getSelectedVendor() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "LoadedRevenueSupport(selectedVendor=" + this.a + ", revenueSupport=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadedVendorList;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent;", "", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "vendorList", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$LoadedVendorList;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getVendorList", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class LoadedVendorList implements RevenueIntent {
        public static final int $stable = 8;
        public final List a;

        public LoadedVendorList(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "vendorList");
            super();
            this.a = list0;
        }

        @NotNull
        public final List component1() {
            return this.a;
        }

        @NotNull
        public final LoadedVendorList copy(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "vendorList");
            return new LoadedVendorList(list0);
        }

        public static LoadedVendorList copy$default(LoadedVendorList revenueIntent$LoadedVendorList0, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                list0 = revenueIntent$LoadedVendorList0.a;
            }
            return revenueIntent$LoadedVendorList0.copy(list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof LoadedVendorList ? Intrinsics.areEqual(this.a, ((LoadedVendorList)object0).a) : false;
        }

        @NotNull
        public final List getVendorList() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "LoadedVendorList(vendorList=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000BJ\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u000B¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$SelectedGraphItem;", "Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent;", "Lcom/kakao/tistory/presentation/common/graph/GraphPeriod;", "graphPeriod", "", "selectedGraphPosition", "<init>", "(Lcom/kakao/tistory/presentation/common/graph/GraphPeriod;I)V", "component1", "()Lcom/kakao/tistory/presentation/common/graph/GraphPeriod;", "component2", "()I", "copy", "(Lcom/kakao/tistory/presentation/common/graph/GraphPeriod;I)Lcom/kakao/tistory/presentation/screen/revenue/contract/RevenueIntent$SelectedGraphItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/common/graph/GraphPeriod;", "getGraphPeriod", "b", "I", "getSelectedGraphPosition", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SelectedGraphItem implements RevenueIntent {
        public static final int $stable;
        public final GraphPeriod a;
        public final int b;

        public SelectedGraphItem(@NotNull GraphPeriod graphPeriod0, int v) {
            Intrinsics.checkNotNullParameter(graphPeriod0, "graphPeriod");
            super();
            this.a = graphPeriod0;
            this.b = v;
        }

        @NotNull
        public final GraphPeriod component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        @NotNull
        public final SelectedGraphItem copy(@NotNull GraphPeriod graphPeriod0, int v) {
            Intrinsics.checkNotNullParameter(graphPeriod0, "graphPeriod");
            return new SelectedGraphItem(graphPeriod0, v);
        }

        public static SelectedGraphItem copy$default(SelectedGraphItem revenueIntent$SelectedGraphItem0, GraphPeriod graphPeriod0, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                graphPeriod0 = revenueIntent$SelectedGraphItem0.a;
            }
            if((v1 & 2) != 0) {
                v = revenueIntent$SelectedGraphItem0.b;
            }
            return revenueIntent$SelectedGraphItem0.copy(graphPeriod0, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof SelectedGraphItem)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((SelectedGraphItem)object0).a) ? this.b == ((SelectedGraphItem)object0).b : false;
        }

        @NotNull
        public final GraphPeriod getGraphPeriod() {
            return this.a;
        }

        public final int getSelectedGraphPosition() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.b + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "SelectedGraphItem(graphPeriod=" + this.a + ", selectedGraphPosition=" + this.b + ")";
        }
    }

}

