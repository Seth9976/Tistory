package com.kakao.tistory.presentation.common.graph;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\tJ.\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\tR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001A\u001A\u0004\b\u001D\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001A\u001A\u0004\b\u001F\u0010\t¨\u0006 "}, d2 = {"Lcom/kakao/tistory/presentation/common/graph/StatisticsBarGraphValue;", "Lcom/kakao/tistory/presentation/common/graph/BarGraphValue;", "", "searchValue", "snsValue", "etcValue", "<init>", "(FFF)V", "component1", "()F", "component2", "component3", "copy", "(FFF)Lcom/kakao/tistory/presentation/common/graph/StatisticsBarGraphValue;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getSearchValue", "b", "getSnsValue", "c", "getEtcValue", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class StatisticsBarGraphValue implements BarGraphValue {
    public static final int $stable;
    public final float a;
    public final float b;
    public final float c;

    public StatisticsBarGraphValue() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public StatisticsBarGraphValue(float f, float f1, float f2) {
        this.a = f;
        this.b = f1;
        this.c = f2;
    }

    public StatisticsBarGraphValue(float f, float f1, float f2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        this(f, f1, f2);
    }

    public final float component1() {
        return this.a;
    }

    public final float component2() {
        return this.b;
    }

    public final float component3() {
        return this.c;
    }

    @NotNull
    public final StatisticsBarGraphValue copy(float f, float f1, float f2) {
        return new StatisticsBarGraphValue(f, f1, f2);
    }

    public static StatisticsBarGraphValue copy$default(StatisticsBarGraphValue statisticsBarGraphValue0, float f, float f1, float f2, int v, Object object0) {
        if((v & 1) != 0) {
            f = statisticsBarGraphValue0.a;
        }
        if((v & 2) != 0) {
            f1 = statisticsBarGraphValue0.b;
        }
        if((v & 4) != 0) {
            f2 = statisticsBarGraphValue0.c;
        }
        return statisticsBarGraphValue0.copy(f, f1, f2);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof StatisticsBarGraphValue)) {
            return false;
        }
        if(Float.compare(this.a, ((StatisticsBarGraphValue)object0).a) != 0) {
            return false;
        }
        return Float.compare(this.b, ((StatisticsBarGraphValue)object0).b) == 0 ? Float.compare(this.c, ((StatisticsBarGraphValue)object0).c) == 0 : false;
    }

    public final float getEtcValue() {
        return this.c;
    }

    public final float getSearchValue() {
        return this.a;
    }

    public final float getSnsValue() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.c) + a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("StatisticsBarGraphValue(searchValue=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", snsValue=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", etcValue=");
        return androidx.room.a.h(this.c, ")", stringBuilder0);
    }
}

