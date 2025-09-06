package com.kakao.tistory.presentation.screen.revenue.item;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.annotation.concurrent.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000E\u0010\tJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u000B¨\u0006\u001C"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;", "", "", "lastUpdateTime", "Lcom/kakao/tistory/presentation/screen/revenue/item/DetailInfo;", "revenueInfo", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/screen/revenue/item/DetailInfo;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/presentation/screen/revenue/item/DetailInfo;", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/screen/revenue/item/DetailInfo;)Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getLastUpdateTime", "b", "Lcom/kakao/tistory/presentation/screen/revenue/item/DetailInfo;", "getRevenueInfo", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GraphDetailInfoUiState {
    public static final int $stable;
    public final String a;
    public final DetailInfo b;

    public GraphDetailInfoUiState() {
        this(null, null, 3, null);
    }

    public GraphDetailInfoUiState(@NotNull String s, @NotNull DetailInfo detailInfo0) {
        Intrinsics.checkNotNullParameter(s, "lastUpdateTime");
        Intrinsics.checkNotNullParameter(detailInfo0, "revenueInfo");
        super();
        this.a = s;
        this.b = detailInfo0;
    }

    public GraphDetailInfoUiState(String s, DetailInfo detailInfo0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v & 1) == 0 ? s : ""), ((v & 2) == 0 ? detailInfo0 : new DetailInfo(null, null, null, null, null, null, null, null, null, null, null, 0x7FF, null)));
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final DetailInfo component2() {
        return this.b;
    }

    @NotNull
    public final GraphDetailInfoUiState copy(@NotNull String s, @NotNull DetailInfo detailInfo0) {
        Intrinsics.checkNotNullParameter(s, "lastUpdateTime");
        Intrinsics.checkNotNullParameter(detailInfo0, "revenueInfo");
        return new GraphDetailInfoUiState(s, detailInfo0);
    }

    public static GraphDetailInfoUiState copy$default(GraphDetailInfoUiState graphDetailInfoUiState0, String s, DetailInfo detailInfo0, int v, Object object0) {
        if((v & 1) != 0) {
            s = graphDetailInfoUiState0.a;
        }
        if((v & 2) != 0) {
            detailInfo0 = graphDetailInfoUiState0.b;
        }
        return graphDetailInfoUiState0.copy(s, detailInfo0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof GraphDetailInfoUiState)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((GraphDetailInfoUiState)object0).a) ? Intrinsics.areEqual(this.b, ((GraphDetailInfoUiState)object0).b) : false;
    }

    @NotNull
    public final String getLastUpdateTime() {
        return this.a;
    }

    @NotNull
    public final DetailInfo getRevenueInfo() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "GraphDetailInfoUiState(lastUpdateTime=" + this.a + ", revenueInfo=" + this.b + ")";
    }
}

