package com.kakao.keditor.plugin.pluginspec.poll;

import a5.b;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.plugin.KeditorItemType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@KeditorItemType(type = "pollFooterItem")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0002\u0010\bJ\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0006HÆ\u0003J5\u0010\u0013\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0007\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u001A"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/poll/PollFooterItem;", "Lcom/kakao/keditor/KeditorItem;", "startDate", "", "endDate", "pickCount", "", "pickCountMax", "(Ljava/lang/String;Ljava/lang/String;II)V", "getEndDate", "()Ljava/lang/String;", "getPickCount", "()I", "getPickCountMax", "getStartDate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PollFooterItem extends KeditorItem {
    @Nullable
    private final String endDate;
    private final int pickCount;
    private final int pickCountMax;
    @Nullable
    private final String startDate;

    public PollFooterItem(@Nullable String s, @Nullable String s1, int v, int v1) {
        this.startDate = s;
        this.endDate = s1;
        this.pickCount = v;
        this.pickCountMax = v1;
    }

    @Nullable
    public final String component1() {
        return this.startDate;
    }

    @Nullable
    public final String component2() {
        return this.endDate;
    }

    public final int component3() {
        return this.pickCount;
    }

    public final int component4() {
        return this.pickCountMax;
    }

    @NotNull
    public final PollFooterItem copy(@Nullable String s, @Nullable String s1, int v, int v1) {
        return new PollFooterItem(s, s1, v, v1);
    }

    public static PollFooterItem copy$default(PollFooterItem pollFooterItem0, String s, String s1, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = pollFooterItem0.startDate;
        }
        if((v2 & 2) != 0) {
            s1 = pollFooterItem0.endDate;
        }
        if((v2 & 4) != 0) {
            v = pollFooterItem0.pickCount;
        }
        if((v2 & 8) != 0) {
            v1 = pollFooterItem0.pickCountMax;
        }
        return pollFooterItem0.copy(s, s1, v, v1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PollFooterItem)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.startDate, ((PollFooterItem)object0).startDate)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.endDate, ((PollFooterItem)object0).endDate)) {
            return false;
        }
        return this.pickCount == ((PollFooterItem)object0).pickCount ? this.pickCountMax == ((PollFooterItem)object0).pickCountMax : false;
    }

    @Nullable
    public final String getEndDate() {
        return this.endDate;
    }

    public final int getPickCount() {
        return this.pickCount;
    }

    public final int getPickCountMax() {
        return this.pickCountMax;
    }

    @Nullable
    public final String getStartDate() {
        return this.startDate;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.startDate == null ? 0 : this.startDate.hashCode();
        String s = this.endDate;
        if(s != null) {
            v = s.hashCode();
        }
        return this.pickCountMax + a.c(this.pickCount, (v1 * 0x1F + v) * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = b.w("PollFooterItem(startDate=", this.startDate, ", endDate=", this.endDate, ", pickCount=");
        stringBuilder0.append(this.pickCount);
        stringBuilder0.append(", pickCountMax=");
        stringBuilder0.append(this.pickCountMax);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

