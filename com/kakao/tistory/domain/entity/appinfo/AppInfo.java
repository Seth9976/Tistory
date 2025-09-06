package com.kakao.tistory.domain.entity.appinfo;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001B\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000B\u0010\u000B\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/domain/entity/appinfo/AppInfo;", "", "platform", "Lcom/kakao/tistory/domain/entity/appinfo/Platform;", "extra", "Lcom/kakao/tistory/domain/entity/appinfo/Extra;", "(Lcom/kakao/tistory/domain/entity/appinfo/Platform;Lcom/kakao/tistory/domain/entity/appinfo/Extra;)V", "getExtra", "()Lcom/kakao/tistory/domain/entity/appinfo/Extra;", "getPlatform", "()Lcom/kakao/tistory/domain/entity/appinfo/Platform;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AppInfo {
    @Nullable
    private final Extra extra;
    @Nullable
    private final Platform platform;

    public AppInfo(@Nullable Platform platform0, @Nullable Extra extra0) {
        this.platform = platform0;
        this.extra = extra0;
    }

    public AppInfo(Platform platform0, Extra extra0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            extra0 = null;
        }
        this(platform0, extra0);
    }

    @Nullable
    public final Platform component1() {
        return this.platform;
    }

    @Nullable
    public final Extra component2() {
        return this.extra;
    }

    @NotNull
    public final AppInfo copy(@Nullable Platform platform0, @Nullable Extra extra0) {
        return new AppInfo(platform0, extra0);
    }

    public static AppInfo copy$default(AppInfo appInfo0, Platform platform0, Extra extra0, int v, Object object0) {
        if((v & 1) != 0) {
            platform0 = appInfo0.platform;
        }
        if((v & 2) != 0) {
            extra0 = appInfo0.extra;
        }
        return appInfo0.copy(platform0, extra0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AppInfo)) {
            return false;
        }
        return Intrinsics.areEqual(this.platform, ((AppInfo)object0).platform) ? Intrinsics.areEqual(this.extra, ((AppInfo)object0).extra) : false;
    }

    @Nullable
    public final Extra getExtra() {
        return this.extra;
    }

    @Nullable
    public final Platform getPlatform() {
        return this.platform;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.platform == null ? 0 : this.platform.hashCode();
        Extra extra0 = this.extra;
        if(extra0 != null) {
            v = extra0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        return "AppInfo(platform=" + this.platform + ", extra=" + this.extra + ")";
    }
}

