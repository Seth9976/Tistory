package com.kakao.tistory.domain.entity.entry;

import a5.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/OpenGraphVideoInfo;", "", "scale_width", "", "scale_height", "(JJ)V", "getScale_height", "()J", "getScale_width", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class OpenGraphVideoInfo {
    private final long scale_height;
    private final long scale_width;

    public OpenGraphVideoInfo(long v, long v1) {
        this.scale_width = v;
        this.scale_height = v1;
    }

    public final long component1() {
        return this.scale_width;
    }

    public final long component2() {
        return this.scale_height;
    }

    @NotNull
    public final OpenGraphVideoInfo copy(long v, long v1) {
        return new OpenGraphVideoInfo(v, v1);
    }

    public static OpenGraphVideoInfo copy$default(OpenGraphVideoInfo openGraphVideoInfo0, long v, long v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = openGraphVideoInfo0.scale_width;
        }
        if((v2 & 2) != 0) {
            v1 = openGraphVideoInfo0.scale_height;
        }
        return openGraphVideoInfo0.copy(v, v1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OpenGraphVideoInfo)) {
            return false;
        }
        return this.scale_width == ((OpenGraphVideoInfo)object0).scale_width ? this.scale_height == ((OpenGraphVideoInfo)object0).scale_height : false;
    }

    public final long getScale_height() {
        return this.scale_height;
    }

    public final long getScale_width() {
        return this.scale_width;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(this.scale_height) + Long.hashCode(this.scale_width) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("OpenGraphVideoInfo(scale_width=");
        stringBuilder0.append(this.scale_width);
        stringBuilder0.append(", scale_height=");
        return b.g(this.scale_height, ")", stringBuilder0);
    }
}

