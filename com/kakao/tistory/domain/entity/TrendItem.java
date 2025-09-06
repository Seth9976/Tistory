package com.kakao.tistory.domain.entity;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\u0002\u0010\tJ\t\u0010\u001D\u001A\u00020\u0003H\u00C6\u0003J\u0010\u0010\u001E\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0002\u0010\u000BJ\u0010\u0010\u001F\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0002\u0010\u000BJ\u0010\u0010 \u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0002\u0010\u000BJ\u0010\u0010!\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0002\u0010\u000BJH\u0010\"\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0005H\u00C6\u0001\u00A2\u0006\u0002\u0010#J\u0013\u0010$\u001A\u00020\u000F2\b\u0010%\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010&\u001A\u00020\'H\u00D6\u0001J\t\u0010(\u001A\u00020\u0003H\u00D6\u0001R\u001A\u0010\u0007\u001A\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00A2\u0006\n\n\u0002\u0010\f\u001A\u0004\b\n\u0010\u000BR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\n\n\u0002\u0010\f\u001A\u0004\b\r\u0010\u000BR\u001A\u0010\u000E\u001A\u00020\u000FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001A\u0010\u0014\u001A\u00020\u000FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\n\n\u0002\u0010\f\u001A\u0004\b\u0016\u0010\u000BR\u001A\u0010\u0017\u001A\u00020\u000FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u0015\u0010\b\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\n\n\u0002\u0010\f\u001A\u0004\b\u001A\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u001C\u00A8\u0006)"}, d2 = {"Lcom/kakao/tistory/domain/entity/TrendItem;", "", "timestamp", "", "searchEngine", "", "etc", "count", "sns", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getCount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEtc", "growUpAnimEnable", "", "getGrowUpAnimEnable", "()Z", "setGrowUpAnimEnable", "(Z)V", "isSelectedItem", "setSelectedItem", "getSearchEngine", "selectAnimEnable", "getSelectAnimEnable", "setSelectAnimEnable", "getSns", "getTimestamp", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/kakao/tistory/domain/entity/TrendItem;", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TrendItem {
    @SerializedName(alternate = {"pv"}, value = "count")
    @Nullable
    private final Long count;
    @Nullable
    private final Long etc;
    private boolean growUpAnimEnable;
    private boolean isSelectedItem;
    @Nullable
    private final Long searchEngine;
    private boolean selectAnimEnable;
    @Nullable
    private final Long sns;
    @NotNull
    private final String timestamp;

    public TrendItem() {
        this(null, null, null, null, null, 0x1F, null);
    }

    public TrendItem(@NotNull String s, @Nullable Long long0, @Nullable Long long1, @Nullable Long long2, @Nullable Long long3) {
        Intrinsics.checkNotNullParameter(s, "timestamp");
        super();
        this.timestamp = s;
        this.searchEngine = long0;
        this.etc = long1;
        this.count = long2;
        this.sns = long3;
        this.growUpAnimEnable = true;
        this.selectAnimEnable = true;
    }

    public TrendItem(String s, Long long0, Long long1, Long long2, Long long3, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            s = "";
        }
        if((v & 2) != 0) {
            long0 = 0L;
        }
        if((v & 4) != 0) {
            long1 = 0L;
        }
        if((v & 8) != 0) {
            long2 = 0L;
        }
        if((v & 16) != 0) {
            long3 = 0L;
        }
        this(s, long0, long1, long2, long3);
    }

    @NotNull
    public final String component1() {
        return this.timestamp;
    }

    @Nullable
    public final Long component2() {
        return this.searchEngine;
    }

    @Nullable
    public final Long component3() {
        return this.etc;
    }

    @Nullable
    public final Long component4() {
        return this.count;
    }

    @Nullable
    public final Long component5() {
        return this.sns;
    }

    @NotNull
    public final TrendItem copy(@NotNull String s, @Nullable Long long0, @Nullable Long long1, @Nullable Long long2, @Nullable Long long3) {
        Intrinsics.checkNotNullParameter(s, "timestamp");
        return new TrendItem(s, long0, long1, long2, long3);
    }

    public static TrendItem copy$default(TrendItem trendItem0, String s, Long long0, Long long1, Long long2, Long long3, int v, Object object0) {
        if((v & 1) != 0) {
            s = trendItem0.timestamp;
        }
        if((v & 2) != 0) {
            long0 = trendItem0.searchEngine;
        }
        if((v & 4) != 0) {
            long1 = trendItem0.etc;
        }
        if((v & 8) != 0) {
            long2 = trendItem0.count;
        }
        if((v & 16) != 0) {
            long3 = trendItem0.sns;
        }
        return trendItem0.copy(s, long0, long1, long2, long3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TrendItem)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.timestamp, ((TrendItem)object0).timestamp)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.searchEngine, ((TrendItem)object0).searchEngine)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.etc, ((TrendItem)object0).etc)) {
            return false;
        }
        return Intrinsics.areEqual(this.count, ((TrendItem)object0).count) ? Intrinsics.areEqual(this.sns, ((TrendItem)object0).sns) : false;
    }

    @Nullable
    public final Long getCount() {
        return this.count;
    }

    @Nullable
    public final Long getEtc() {
        return this.etc;
    }

    public final boolean getGrowUpAnimEnable() {
        return this.growUpAnimEnable;
    }

    @Nullable
    public final Long getSearchEngine() {
        return this.searchEngine;
    }

    public final boolean getSelectAnimEnable() {
        return this.selectAnimEnable;
    }

    @Nullable
    public final Long getSns() {
        return this.sns;
    }

    @NotNull
    public final String getTimestamp() [...] // 潜在的解密器

    @Override
    public int hashCode() {
        int v = this.timestamp.hashCode();
        int v1 = 0;
        int v2 = this.searchEngine == null ? 0 : this.searchEngine.hashCode();
        int v3 = this.etc == null ? 0 : this.etc.hashCode();
        int v4 = this.count == null ? 0 : this.count.hashCode();
        Long long0 = this.sns;
        if(long0 != null) {
            v1 = long0.hashCode();
        }
        return (((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1;
    }

    public final boolean isSelectedItem() {
        return this.isSelectedItem;
    }

    public final void setGrowUpAnimEnable(boolean z) {
        this.growUpAnimEnable = z;
    }

    public final void setSelectAnimEnable(boolean z) {
        this.selectAnimEnable = z;
    }

    public final void setSelectedItem(boolean z) {
        this.isSelectedItem = z;
    }

    @Override
    @NotNull
    public String toString() {
        return "TrendItem(timestamp=" + this.timestamp + ", searchEngine=" + this.searchEngine + ", etc=" + this.etc + ", count=" + this.count + ", sns=" + this.sns + ")";
    }
}

