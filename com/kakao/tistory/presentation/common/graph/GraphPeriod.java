package com.kakao.tistory.presentation.common.graph;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0012\u001A\u00020\u00112\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\bR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001A\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/common/graph/GraphPeriod;", "", "", "startDate", "endDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/presentation/common/graph/GraphPeriod;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStartDate", "b", "getEndDate", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GraphPeriod {
    public static final int $stable;
    public final String a;
    public final String b;

    public GraphPeriod() {
        this(null, null, 3, null);
    }

    public GraphPeriod(@Nullable String s, @Nullable String s1) {
        this.a = s;
        this.b = s1;
    }

    public GraphPeriod(String s, String s1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        this(s, s1);
    }

    @Nullable
    public final String component1() {
        return this.a;
    }

    @Nullable
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final GraphPeriod copy(@Nullable String s, @Nullable String s1) {
        return new GraphPeriod(s, s1);
    }

    public static GraphPeriod copy$default(GraphPeriod graphPeriod0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = graphPeriod0.a;
        }
        if((v & 2) != 0) {
            s1 = graphPeriod0.b;
        }
        return graphPeriod0.copy(s, s1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof GraphPeriod)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((GraphPeriod)object0).a) ? Intrinsics.areEqual(this.b, ((GraphPeriod)object0).b) : false;
    }

    @Nullable
    public final String getEndDate() {
        return this.b;
    }

    @Nullable
    public final String getStartDate() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        String s = this.b;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        return "GraphPeriod(startDate=" + this.a + ", endDate=" + this.b + ")";
    }
}

