package com.kakao.tistory.domain.entity.entry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000F\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001A\u00020\rHÖ\u0001J\t\u0010\u000E\u001A\u00020\u000FHÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/LikeState;", "", "likeCount", "", "(J)V", "getLikeCount", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class LikeState {
    private final long likeCount;

    public LikeState() {
        this(0L, 1, null);
    }

    public LikeState(long v) {
        this.likeCount = v;
    }

    public LikeState(long v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0L;
        }
        this(v);
    }

    public final long component1() {
        return this.likeCount;
    }

    @NotNull
    public final LikeState copy(long v) {
        return new LikeState(v);
    }

    public static LikeState copy$default(LikeState likeState0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = likeState0.likeCount;
        }
        return likeState0.copy(v);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof LikeState ? this.likeCount == ((LikeState)object0).likeCount : false;
    }

    public final long getLikeCount() {
        return this.likeCount;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(this.likeCount);
    }

    @Override
    @NotNull
    public String toString() {
        return "LikeState(likeCount=" + this.likeCount + ")";
    }
}

