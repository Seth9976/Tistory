package com.kakao.tistory.presentation.screen.revenue.item;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.common.graph.a;
import javax.annotation.concurrent.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\b\b\u0001\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000E\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ0\u0010\u0010\u001A\u00020\u00002\b\b\u0003\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000BJ\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\rR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\u000F¨\u0006!"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/item/VariationEarningUiState;", "", "", "title", "", "value", "", "variation", "<init>", "(ILjava/lang/String;Ljava/lang/Double;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Double;", "copy", "(ILjava/lang/String;Ljava/lang/Double;)Lcom/kakao/tistory/presentation/screen/revenue/item/VariationEarningUiState;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getTitle", "b", "Ljava/lang/String;", "getValue", "c", "Ljava/lang/Double;", "getVariation", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class VariationEarningUiState {
    public static final int $stable;
    public final int a;
    public final String b;
    public final Double c;

    public VariationEarningUiState(@StringRes int v, @NotNull String s, @Nullable Double double0) {
        Intrinsics.checkNotNullParameter(s, "value");
        super();
        this.a = v;
        this.b = s;
        this.c = double0;
    }

    public VariationEarningUiState(int v, String s, Double double0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            s = "";
        }
        if((v1 & 4) != 0) {
            double0 = null;
        }
        this(v, s, double0);
    }

    public final int component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @Nullable
    public final Double component3() {
        return this.c;
    }

    @NotNull
    public final VariationEarningUiState copy(@StringRes int v, @NotNull String s, @Nullable Double double0) {
        Intrinsics.checkNotNullParameter(s, "value");
        return new VariationEarningUiState(v, s, double0);
    }

    public static VariationEarningUiState copy$default(VariationEarningUiState variationEarningUiState0, int v, String s, Double double0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = variationEarningUiState0.a;
        }
        if((v1 & 2) != 0) {
            s = variationEarningUiState0.b;
        }
        if((v1 & 4) != 0) {
            double0 = variationEarningUiState0.c;
        }
        return variationEarningUiState0.copy(v, s, double0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof VariationEarningUiState)) {
            return false;
        }
        if(this.a != ((VariationEarningUiState)object0).a) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((VariationEarningUiState)object0).b) ? Intrinsics.areEqual(this.c, ((VariationEarningUiState)object0).c) : false;
    }

    public final int getTitle() {
        return this.a;
    }

    @NotNull
    public final String getValue() {
        return this.b;
    }

    @Nullable
    public final Double getVariation() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = a.a(this.b, this.a * 0x1F, 0x1F);
        return this.c == null ? v : v + this.c.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "VariationEarningUiState(title=" + this.a + ", value=" + this.b + ", variation=" + this.c + ")";
    }
}

