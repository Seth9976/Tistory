package com.kakao.tistory.presentation.common.graph;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000E\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00028\u0000¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000E\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00028\u0000HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001B\u001A\u00020\u001A2\b\u0010\u0019\u001A\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\rR\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001E\u001A\u0004\b!\u0010\rR\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0010R\u0017\u0010\t\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0012¨\u0006("}, d2 = {"Lcom/kakao/tistory/presentation/common/graph/BarGraphItem;", "Lcom/kakao/tistory/presentation/common/graph/BarGraphValue;", "T", "", "", "label", "subLabel", "Lcom/kakao/tistory/presentation/common/graph/GraphPeriod;", "graphPeriod", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/common/graph/GraphPeriod;Lcom/kakao/tistory/presentation/common/graph/BarGraphValue;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/kakao/tistory/presentation/common/graph/GraphPeriod;", "component4", "()Lcom/kakao/tistory/presentation/common/graph/BarGraphValue;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/common/graph/GraphPeriod;Lcom/kakao/tistory/presentation/common/graph/BarGraphValue;)Lcom/kakao/tistory/presentation/common/graph/BarGraphItem;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getLabel", "b", "getSubLabel", "c", "Lcom/kakao/tistory/presentation/common/graph/GraphPeriod;", "getGraphPeriod", "d", "Lcom/kakao/tistory/presentation/common/graph/BarGraphValue;", "getValue", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BarGraphItem {
    public static final int $stable;
    public final String a;
    public final String b;
    public final GraphPeriod c;
    public final BarGraphValue d;

    public BarGraphItem(@NotNull String s, @NotNull String s1, @NotNull GraphPeriod graphPeriod0, @NotNull BarGraphValue barGraphValue0) {
        Intrinsics.checkNotNullParameter(s, "label");
        Intrinsics.checkNotNullParameter(s1, "subLabel");
        Intrinsics.checkNotNullParameter(graphPeriod0, "graphPeriod");
        Intrinsics.checkNotNullParameter(barGraphValue0, "value");
        super();
        this.a = s;
        this.b = s1;
        this.c = graphPeriod0;
        this.d = barGraphValue0;
    }

    public BarGraphItem(String s, String s1, GraphPeriod graphPeriod0, BarGraphValue barGraphValue0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            graphPeriod0 = new GraphPeriod(null, null, 3, null);
        }
        this(s, s1, graphPeriod0, barGraphValue0);
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
    public final GraphPeriod component3() {
        return this.c;
    }

    @NotNull
    public final BarGraphValue component4() {
        return this.d;
    }

    @NotNull
    public final BarGraphItem copy(@NotNull String s, @NotNull String s1, @NotNull GraphPeriod graphPeriod0, @NotNull BarGraphValue barGraphValue0) {
        Intrinsics.checkNotNullParameter(s, "label");
        Intrinsics.checkNotNullParameter(s1, "subLabel");
        Intrinsics.checkNotNullParameter(graphPeriod0, "graphPeriod");
        Intrinsics.checkNotNullParameter(barGraphValue0, "value");
        return new BarGraphItem(s, s1, graphPeriod0, barGraphValue0);
    }

    public static BarGraphItem copy$default(BarGraphItem barGraphItem0, String s, String s1, GraphPeriod graphPeriod0, BarGraphValue barGraphValue0, int v, Object object0) {
        if((v & 1) != 0) {
            s = barGraphItem0.a;
        }
        if((v & 2) != 0) {
            s1 = barGraphItem0.b;
        }
        if((v & 4) != 0) {
            graphPeriod0 = barGraphItem0.c;
        }
        if((v & 8) != 0) {
            barGraphValue0 = barGraphItem0.d;
        }
        return barGraphItem0.copy(s, s1, graphPeriod0, barGraphValue0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BarGraphItem)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((BarGraphItem)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((BarGraphItem)object0).b)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((BarGraphItem)object0).c) ? Intrinsics.areEqual(this.d, ((BarGraphItem)object0).d) : false;
    }

    @NotNull
    public final GraphPeriod getGraphPeriod() {
        return this.c;
    }

    @NotNull
    public final String getLabel() {
        return this.a;
    }

    @NotNull
    public final String getSubLabel() {
        return this.b;
    }

    @NotNull
    public final BarGraphValue getValue() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + a.a(this.b, this.a.hashCode() * 0x1F, 0x1F)) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = b.w("BarGraphItem(label=", this.a, ", subLabel=", this.b, ", graphPeriod=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", value=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

