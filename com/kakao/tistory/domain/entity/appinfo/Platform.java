package com.kakao.tistory.domain.entity.appinfo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000F\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000B\u0010\u0007\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001A\u00020\rHÖ\u0001J\t\u0010\u000E\u001A\u00020\u000FHÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/domain/entity/appinfo/Platform;", "", "android", "Lcom/kakao/tistory/domain/entity/appinfo/Android;", "(Lcom/kakao/tistory/domain/entity/appinfo/Android;)V", "getAndroid", "()Lcom/kakao/tistory/domain/entity/appinfo/Android;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Platform {
    @Nullable
    private final Android android;

    public Platform(@Nullable Android android0) {
        this.android = android0;
    }

    @Nullable
    public final Android component1() {
        return this.android;
    }

    @NotNull
    public final Platform copy(@Nullable Android android0) {
        return new Platform(android0);
    }

    public static Platform copy$default(Platform platform0, Android android0, int v, Object object0) {
        if((v & 1) != 0) {
            android0 = platform0.android;
        }
        return platform0.copy(android0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof Platform ? Intrinsics.areEqual(this.android, ((Platform)object0).android) : false;
    }

    @Nullable
    public final Android getAndroid() {
        return this.android;
    }

    @Override
    public int hashCode() {
        return this.android == null ? 0 : this.android.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "Platform(android=" + this.android + ")";
    }
}

