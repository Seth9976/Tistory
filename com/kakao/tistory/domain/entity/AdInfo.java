package com.kakao.tistory.domain.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00052\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u001A\u0010\u0002\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001A\u0010\u0004\u001A\u00020\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0004\u0010\u000B\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/domain/entity/AdInfo;", "", "id", "", "isLimitAdTrackingEnabled", "", "(Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "()Z", "setLimitAdTrackingEnabled", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AdInfo {
    @NotNull
    private String id;
    private boolean isLimitAdTrackingEnabled;

    public AdInfo(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "id");
        super();
        this.id = s;
        this.isLimitAdTrackingEnabled = z;
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    public final boolean component2() {
        return this.isLimitAdTrackingEnabled;
    }

    @NotNull
    public final AdInfo copy(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "id");
        return new AdInfo(s, z);
    }

    public static AdInfo copy$default(AdInfo adInfo0, String s, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = adInfo0.id;
        }
        if((v & 2) != 0) {
            z = adInfo0.isLimitAdTrackingEnabled;
        }
        return adInfo0.copy(s, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AdInfo)) {
            return false;
        }
        return Intrinsics.areEqual(this.id, ((AdInfo)object0).id) ? this.isLimitAdTrackingEnabled == ((AdInfo)object0).isLimitAdTrackingEnabled : false;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.isLimitAdTrackingEnabled) + this.id.hashCode() * 0x1F;
    }

    public final boolean isLimitAdTrackingEnabled() {
        return this.isLimitAdTrackingEnabled;
    }

    public final void setId(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.id = s;
    }

    public final void setLimitAdTrackingEnabled(boolean z) {
        this.isLimitAdTrackingEnabled = z;
    }

    @Override
    @NotNull
    public String toString() {
        return "AdInfo(id=" + this.id + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ")";
    }
}

