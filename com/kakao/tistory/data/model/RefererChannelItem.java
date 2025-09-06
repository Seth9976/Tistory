package com.kakao.tistory.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;
import zd.c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001E\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\bJ\t\u0010\u001B\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001C\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001D\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001E\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001F\u001A\u00020\u0003H\u00C6\u0003J;\u0010 \u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u0003H\u00C6\u0001J\u0013\u0010!\u001A\u00020\"2\b\u0010#\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\u0018\u0010$\u001A\u00020\u00032\u0006\u0010%\u001A\u00020\u00032\u0006\u0010&\u001A\u00020\u0003H\u0002J\t\u0010\'\u001A\u00020\u0003H\u00D6\u0001J\t\u0010(\u001A\u00020)H\u00D6\u0001R\u0014\u0010\t\u001A\u00020\u00038BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0005\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0011\u0010\r\u001A\u00020\u00038F\u00A2\u0006\u0006\u001A\u0004\b\u000E\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000BR\u0011\u0010\u0010\u001A\u00020\u00038F\u00A2\u0006\u0006\u001A\u0004\b\u0011\u0010\u000BR\u0014\u0010\u0012\u001A\u00020\u00038BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u000BR\u0011\u0010\u0016\u001A\u00020\u00038F\u00A2\u0006\u0006\u001A\u0004\b\u0017\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u000BR\u0011\u0010\u0019\u001A\u00020\u00038F\u00A2\u0006\u0006\u001A\u0004\b\u001A\u0010\u000B\u00A8\u0006*"}, d2 = {"Lcom/kakao/tistory/data/model/RefererChannelItem;", "", "searchEngine", "", "social", "etc", "pc", "mobile", "(IIIII)V", "deviceTypeSum", "getDeviceTypeSum", "()I", "getEtc", "etcPercent", "getEtcPercent", "getMobile", "mobilePercent", "getMobilePercent", "pageViewSum", "getPageViewSum", "getPc", "getSearchEngine", "searchEnginePercent", "getSearchEnginePercent", "getSocial", "socialPercent", "getSocialPercent", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "getRoundPercentage", "count", "sum", "hashCode", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RefererChannelItem {
    private final int etc;
    private final int mobile;
    private final int pc;
    private final int searchEngine;
    private final int social;

    public RefererChannelItem() {
        this(0, 0, 0, 0, 0, 0x1F, null);
    }

    public RefererChannelItem(int v, int v1, int v2, int v3, int v4) {
        this.searchEngine = v;
        this.social = v1;
        this.etc = v2;
        this.pc = v3;
        this.mobile = v4;
    }

    public RefererChannelItem(int v, int v1, int v2, int v3, int v4, int v5, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v5 & 1) == 0 ? v : 0), ((v5 & 2) == 0 ? v1 : 0), ((v5 & 4) == 0 ? v2 : 0), ((v5 & 8) == 0 ? v3 : 0), ((v5 & 16) == 0 ? v4 : 0));
    }

    public final int component1() {
        return this.searchEngine;
    }

    public final int component2() {
        return this.social;
    }

    public final int component3() {
        return this.etc;
    }

    public final int component4() {
        return this.pc;
    }

    public final int component5() {
        return this.mobile;
    }

    @NotNull
    public final RefererChannelItem copy(int v, int v1, int v2, int v3, int v4) {
        return new RefererChannelItem(v, v1, v2, v3, v4);
    }

    public static RefererChannelItem copy$default(RefererChannelItem refererChannelItem0, int v, int v1, int v2, int v3, int v4, int v5, Object object0) {
        if((v5 & 1) != 0) {
            v = refererChannelItem0.searchEngine;
        }
        if((v5 & 2) != 0) {
            v1 = refererChannelItem0.social;
        }
        if((v5 & 4) != 0) {
            v2 = refererChannelItem0.etc;
        }
        if((v5 & 8) != 0) {
            v3 = refererChannelItem0.pc;
        }
        if((v5 & 16) != 0) {
            v4 = refererChannelItem0.mobile;
        }
        return refererChannelItem0.copy(v, v1, v2, v3, v4);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RefererChannelItem)) {
            return false;
        }
        if(this.searchEngine != ((RefererChannelItem)object0).searchEngine) {
            return false;
        }
        if(this.social != ((RefererChannelItem)object0).social) {
            return false;
        }
        if(this.etc != ((RefererChannelItem)object0).etc) {
            return false;
        }
        return this.pc == ((RefererChannelItem)object0).pc ? this.mobile == ((RefererChannelItem)object0).mobile : false;
    }

    private final int getDeviceTypeSum() {
        return this.pc + this.mobile;
    }

    public final int getEtc() {
        return this.etc;
    }

    public final int getEtcPercent() {
        return this.getRoundPercentage(this.etc, this.getPageViewSum());
    }

    public final int getMobile() {
        return this.mobile;
    }

    public final int getMobilePercent() {
        return this.getRoundPercentage(this.mobile, this.getDeviceTypeSum());
    }

    private final int getPageViewSum() {
        return this.searchEngine + this.social + this.etc;
    }

    public final int getPc() {
        return this.pc;
    }

    private final int getRoundPercentage(int v, int v1) {
        return v != 0 || v1 != 0 ? c.roundToInt(((double)v) * 100.0 / ((double)v1)) : 0;
    }

    public final int getSearchEngine() {
        return this.searchEngine;
    }

    public final int getSearchEnginePercent() {
        return this.getRoundPercentage(this.searchEngine, this.getPageViewSum());
    }

    public final int getSocial() {
        return this.social;
    }

    public final int getSocialPercent() {
        return this.getRoundPercentage(this.social, this.getPageViewSum());
    }

    @Override
    public int hashCode() {
        return this.mobile + a.c(this.pc, a.c(this.etc, a.c(this.social, this.searchEngine * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = q.u("RefererChannelItem(searchEngine=", this.searchEngine, ", social=", this.social, ", etc=");
        a.A(stringBuilder0, this.etc, ", pc=", this.pc, ", mobile=");
        return wb.a.c(this.mobile, ")", stringBuilder0);
    }
}

