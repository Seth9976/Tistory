package com.kakao.tistory.domain.entity.common;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000F\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001A\u00020\rHÖ\u0001J\t\u0010\u000E\u001A\u00020\u000FHÖ\u0001R\u0016\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/domain/entity/common/Count;", "", "count", "", "(J)V", "getCount", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Count {
    @SerializedName(alternate = {"followingCount", "followerCount", "newCount", "totalCount"}, value = "count")
    private final long count;

    public Count() {
        this(0L, 1, null);
    }

    public Count(long v) {
        this.count = v;
    }

    public Count(long v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0L;
        }
        this(v);
    }

    public final long component1() {
        return this.count;
    }

    @NotNull
    public final Count copy(long v) {
        return new Count(v);
    }

    public static Count copy$default(Count count0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = count0.count;
        }
        return count0.copy(v);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof Count ? this.count == ((Count)object0).count : false;
    }

    public final long getCount() {
        return this.count;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(this.count);
    }

    @Override
    @NotNull
    public String toString() {
        return "Count(count=" + this.count + ")";
    }
}

