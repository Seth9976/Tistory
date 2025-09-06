package com.kakao.tistory.domain.entity.appinfo;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u001F\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/domain/entity/appinfo/Extra;", "", "imageMaxSize", "", "step1", "Lcom/kakao/tistory/domain/entity/appinfo/Step1;", "(JLcom/kakao/tistory/domain/entity/appinfo/Step1;)V", "getImageMaxSize", "()J", "getStep1", "()Lcom/kakao/tistory/domain/entity/appinfo/Step1;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Extra {
    @SerializedName("image_max_size")
    private final long imageMaxSize;
    @Nullable
    private final Step1 step1;

    public Extra(long v, @Nullable Step1 step10) {
        this.imageMaxSize = v;
        this.step1 = step10;
    }

    public Extra(long v, Step1 step10, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            step10 = null;
        }
        this(v, step10);
    }

    public final long component1() {
        return this.imageMaxSize;
    }

    @Nullable
    public final Step1 component2() {
        return this.step1;
    }

    @NotNull
    public final Extra copy(long v, @Nullable Step1 step10) {
        return new Extra(v, step10);
    }

    public static Extra copy$default(Extra extra0, long v, Step1 step10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = extra0.imageMaxSize;
        }
        if((v1 & 2) != 0) {
            step10 = extra0.step1;
        }
        return extra0.copy(v, step10);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Extra)) {
            return false;
        }
        return this.imageMaxSize == ((Extra)object0).imageMaxSize ? Intrinsics.areEqual(this.step1, ((Extra)object0).step1) : false;
    }

    public final long getImageMaxSize() {
        return this.imageMaxSize;
    }

    @Nullable
    public final Step1 getStep1() {
        return this.step1;
    }

    @Override
    public int hashCode() {
        int v = Long.hashCode(this.imageMaxSize);
        return this.step1 == null ? v * 0x1F : v * 0x1F + this.step1.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "Extra(imageMaxSize=" + this.imageMaxSize + ", step1=" + this.step1 + ")";
    }
}

