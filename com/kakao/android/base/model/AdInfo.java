package com.kakao.android.base.model;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000F\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000E\u0010\tJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0013\u001A\u00020\u00042\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u0005\u0010\u000B\"\u0004\b\u001C\u0010\u001D¨\u0006\u001E"}, d2 = {"Lcom/kakao/android/base/model/AdInfo;", "", "", "id", "", "isLimitAdTrackingEnabled", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/kakao/android/base/model/AdInfo;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "b", "Z", "setLimitAdTrackingEnabled", "(Z)V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AdInfo {
    public String a;
    public boolean b;

    public AdInfo(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "id");
        super();
        this.a = s;
        this.b = z;
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    @NotNull
    public final AdInfo copy(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "id");
        return new AdInfo(s, z);
    }

    public static AdInfo copy$default(AdInfo adInfo0, String s, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = adInfo0.a;
        }
        if((v & 2) != 0) {
            z = adInfo0.b;
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
        return Intrinsics.areEqual(this.a, ((AdInfo)object0).a) ? this.b == ((AdInfo)object0).b : false;
    }

    @NotNull
    public final String getId() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.b) + this.a.hashCode() * 0x1F;
    }

    public final boolean isLimitAdTrackingEnabled() {
        return this.b;
    }

    public final void setId(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.a = s;
    }

    public final void setLimitAdTrackingEnabled(boolean z) {
        this.b = z;
    }

    @Override
    @NotNull
    public String toString() {
        return "AdInfo(id=" + this.a + ", isLimitAdTrackingEnabled=" + this.b + ")";
    }
}

