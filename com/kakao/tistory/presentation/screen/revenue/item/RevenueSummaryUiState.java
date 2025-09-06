package com.kakao.tistory.presentation.screen.revenue.item;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.graph.a;
import javax.annotation.concurrent.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\b\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\u0006\u0012\b\b\u0002\u0010\n\u001A\u00020\u0006\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u000EJ\u0010\u0010\u0011\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0012JV\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\u00062\b\b\u0002\u0010\n\u001A\u00020\u0006H\u00C6\u0001\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u0018\u0010\u000EJ\u0010\u0010\u001A\u001A\u00020\u0019H\u00D6\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001E\u001A\u00020\u001D2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u000ER\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b#\u0010!\u001A\u0004\b$\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b%\u0010!\u001A\u0004\b&\u0010\u000ER\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010\u0012R\u0017\u0010\b\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b*\u0010(\u001A\u0004\b+\u0010\u0012R\u0017\u0010\t\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b,\u0010(\u001A\u0004\b-\u0010\u0012R\u0017\u0010\n\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b.\u0010(\u001A\u0004\b/\u0010\u0012\u00A8\u00060"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSummaryUiState;", "", "", "lastUpdateTime", "currency", "totalEarningsCurrency", "Lcom/kakao/tistory/presentation/screen/revenue/item/VariationEarningUiState;", "totalEarnings", "day", "week", "month", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/screen/revenue/item/VariationEarningUiState;Lcom/kakao/tistory/presentation/screen/revenue/item/VariationEarningUiState;Lcom/kakao/tistory/presentation/screen/revenue/item/VariationEarningUiState;Lcom/kakao/tistory/presentation/screen/revenue/item/VariationEarningUiState;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/kakao/tistory/presentation/screen/revenue/item/VariationEarningUiState;", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/screen/revenue/item/VariationEarningUiState;Lcom/kakao/tistory/presentation/screen/revenue/item/VariationEarningUiState;Lcom/kakao/tistory/presentation/screen/revenue/item/VariationEarningUiState;Lcom/kakao/tistory/presentation/screen/revenue/item/VariationEarningUiState;)Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSummaryUiState;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getLastUpdateTime", "b", "getCurrency", "c", "getTotalEarningsCurrency", "d", "Lcom/kakao/tistory/presentation/screen/revenue/item/VariationEarningUiState;", "getTotalEarnings", "e", "getDay", "f", "getWeek", "g", "getMonth", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RevenueSummaryUiState {
    public static final int $stable;
    public final String a;
    public final String b;
    public final String c;
    public final VariationEarningUiState d;
    public final VariationEarningUiState e;
    public final VariationEarningUiState f;
    public final VariationEarningUiState g;

    public RevenueSummaryUiState() {
        this(null, null, null, null, null, null, null, 0x7F, null);
    }

    public RevenueSummaryUiState(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull VariationEarningUiState variationEarningUiState0, @NotNull VariationEarningUiState variationEarningUiState1, @NotNull VariationEarningUiState variationEarningUiState2, @NotNull VariationEarningUiState variationEarningUiState3) {
        Intrinsics.checkNotNullParameter(s, "lastUpdateTime");
        Intrinsics.checkNotNullParameter(s1, "currency");
        Intrinsics.checkNotNullParameter(s2, "totalEarningsCurrency");
        Intrinsics.checkNotNullParameter(variationEarningUiState0, "totalEarnings");
        Intrinsics.checkNotNullParameter(variationEarningUiState1, "day");
        Intrinsics.checkNotNullParameter(variationEarningUiState2, "week");
        Intrinsics.checkNotNullParameter(variationEarningUiState3, "month");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = variationEarningUiState0;
        this.e = variationEarningUiState1;
        this.f = variationEarningUiState2;
        this.g = variationEarningUiState3;
    }

    public RevenueSummaryUiState(String s, String s1, String s2, VariationEarningUiState variationEarningUiState0, VariationEarningUiState variationEarningUiState1, VariationEarningUiState variationEarningUiState2, VariationEarningUiState variationEarningUiState3, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v & 1) == 0 ? s : ""), ((v & 2) == 0 ? s1 : ""), ((v & 4) == 0 ? s2 : ""), ((v & 8) == 0 ? variationEarningUiState0 : new VariationEarningUiState(string.revenue_summary_earning, null, null, 6, null)), ((v & 16) == 0 ? variationEarningUiState1 : new VariationEarningUiState(string.revenue_summary_recent_day, null, null, 6, null)), ((v & 0x20) == 0 ? variationEarningUiState2 : new VariationEarningUiState(string.revenue_summary_recent_week, null, null, 6, null)), ((v & 0x40) == 0 ? variationEarningUiState3 : new VariationEarningUiState(string.revenue_summary_recent_month, null, null, 6, null)));
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final String component3() {
        return this.c;
    }

    @NotNull
    public final VariationEarningUiState component4() {
        return this.d;
    }

    @NotNull
    public final VariationEarningUiState component5() {
        return this.e;
    }

    @NotNull
    public final VariationEarningUiState component6() {
        return this.f;
    }

    @NotNull
    public final VariationEarningUiState component7() {
        return this.g;
    }

    @NotNull
    public final RevenueSummaryUiState copy(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull VariationEarningUiState variationEarningUiState0, @NotNull VariationEarningUiState variationEarningUiState1, @NotNull VariationEarningUiState variationEarningUiState2, @NotNull VariationEarningUiState variationEarningUiState3) {
        Intrinsics.checkNotNullParameter(s, "lastUpdateTime");
        Intrinsics.checkNotNullParameter(s1, "currency");
        Intrinsics.checkNotNullParameter(s2, "totalEarningsCurrency");
        Intrinsics.checkNotNullParameter(variationEarningUiState0, "totalEarnings");
        Intrinsics.checkNotNullParameter(variationEarningUiState1, "day");
        Intrinsics.checkNotNullParameter(variationEarningUiState2, "week");
        Intrinsics.checkNotNullParameter(variationEarningUiState3, "month");
        return new RevenueSummaryUiState(s, s1, s2, variationEarningUiState0, variationEarningUiState1, variationEarningUiState2, variationEarningUiState3);
    }

    public static RevenueSummaryUiState copy$default(RevenueSummaryUiState revenueSummaryUiState0, String s, String s1, String s2, VariationEarningUiState variationEarningUiState0, VariationEarningUiState variationEarningUiState1, VariationEarningUiState variationEarningUiState2, VariationEarningUiState variationEarningUiState3, int v, Object object0) {
        if((v & 1) != 0) {
            s = revenueSummaryUiState0.a;
        }
        if((v & 2) != 0) {
            s1 = revenueSummaryUiState0.b;
        }
        if((v & 4) != 0) {
            s2 = revenueSummaryUiState0.c;
        }
        if((v & 8) != 0) {
            variationEarningUiState0 = revenueSummaryUiState0.d;
        }
        if((v & 16) != 0) {
            variationEarningUiState1 = revenueSummaryUiState0.e;
        }
        if((v & 0x20) != 0) {
            variationEarningUiState2 = revenueSummaryUiState0.f;
        }
        if((v & 0x40) != 0) {
            variationEarningUiState3 = revenueSummaryUiState0.g;
        }
        return revenueSummaryUiState0.copy(s, s1, s2, variationEarningUiState0, variationEarningUiState1, variationEarningUiState2, variationEarningUiState3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RevenueSummaryUiState)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((RevenueSummaryUiState)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((RevenueSummaryUiState)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((RevenueSummaryUiState)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((RevenueSummaryUiState)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((RevenueSummaryUiState)object0).e)) {
            return false;
        }
        return Intrinsics.areEqual(this.f, ((RevenueSummaryUiState)object0).f) ? Intrinsics.areEqual(this.g, ((RevenueSummaryUiState)object0).g) : false;
    }

    @NotNull
    public final String getCurrency() [...] // 潜在的解密器

    @NotNull
    public final VariationEarningUiState getDay() {
        return this.e;
    }

    @NotNull
    public final String getLastUpdateTime() [...] // 潜在的解密器

    @NotNull
    public final VariationEarningUiState getMonth() {
        return this.g;
    }

    @NotNull
    public final VariationEarningUiState getTotalEarnings() {
        return this.d;
    }

    @NotNull
    public final String getTotalEarningsCurrency() [...] // 潜在的解密器

    @NotNull
    public final VariationEarningUiState getWeek() {
        return this.f;
    }

    @Override
    public int hashCode() {
        return this.g.hashCode() + (this.f.hashCode() + (this.e.hashCode() + (this.d.hashCode() + a.a(this.c, a.a(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F)) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = b.w("RevenueSummaryUiState(lastUpdateTime=", this.a, ", currency=", this.b, ", totalEarningsCurrency=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", totalEarnings=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", day=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", week=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", month=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

