package com.kakao.tistory.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001A\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/data/model/RefererEtcItem;", "", "count", "", "refUrl", "", "(JLjava/lang/String;)V", "getCount", "()J", "getRefUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RefererEtcItem {
    private final long count;
    @SerializedName("ref")
    @NotNull
    private final String refUrl;

    public RefererEtcItem() {
        this(0L, null, 3, null);
    }

    public RefererEtcItem(long v, @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "refUrl");
        super();
        this.count = v;
        this.refUrl = s;
    }

    public RefererEtcItem(long v, String s, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0L;
        }
        if((v1 & 2) != 0) {
            s = "";
        }
        this(v, s);
    }

    public final long component1() {
        return this.count;
    }

    @NotNull
    public final String component2() {
        return this.refUrl;
    }

    @NotNull
    public final RefererEtcItem copy(long v, @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "refUrl");
        return new RefererEtcItem(v, s);
    }

    public static RefererEtcItem copy$default(RefererEtcItem refererEtcItem0, long v, String s, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = refererEtcItem0.count;
        }
        if((v1 & 2) != 0) {
            s = refererEtcItem0.refUrl;
        }
        return refererEtcItem0.copy(v, s);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RefererEtcItem)) {
            return false;
        }
        return this.count == ((RefererEtcItem)object0).count ? Intrinsics.areEqual(this.refUrl, ((RefererEtcItem)object0).refUrl) : false;
    }

    public final long getCount() {
        return this.count;
    }

    @NotNull
    public final String getRefUrl() [...] // 潜在的解密器

    @Override
    public int hashCode() {
        return this.refUrl.hashCode() + Long.hashCode(this.count) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "RefererEtcItem(count=" + this.count + ", refUrl=" + this.refUrl + ")";
    }
}

