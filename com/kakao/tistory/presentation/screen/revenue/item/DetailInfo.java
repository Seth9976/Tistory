package com.kakao.tistory.presentation.screen.revenue.item;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.common.graph.a;
import javax.annotation.concurrent.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u001C\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u001A\b\u0087\b\u0018\u00002\u00020\u0001B\u007F\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0002\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0011J\u0012\u0010\u0017\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0011J\u0012\u0010\u0018\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0011J\u0012\u0010\u0019\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0011J\u0012\u0010\u001A\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0011J\u0012\u0010\u001B\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0011J\u0088\u0001\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00022\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u001E\u0010\u0011J\u0010\u0010 \u001A\u00020\u001FH\u00D6\u0001\u00A2\u0006\u0004\b \u0010!J\u001A\u0010$\u001A\u00020#2\b\u0010\"\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u0011R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b)\u0010\'\u001A\u0004\b*\u0010\u0011R\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b+\u0010\'\u001A\u0004\b,\u0010\u0011R\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b-\u0010\'\u001A\u0004\b.\u0010\u0011R\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b/\u0010\'\u001A\u0004\b0\u0010\u0011R\u0017\u0010\b\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b1\u0010\'\u001A\u0004\b2\u0010\u0011R\u0019\u0010\t\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b3\u0010\'\u001A\u0004\b4\u0010\u0011R\u0019\u0010\n\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b5\u0010\'\u001A\u0004\b6\u0010\u0011R\u0019\u0010\u000B\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b7\u0010\'\u001A\u0004\b8\u0010\u0011R\u0019\u0010\f\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b9\u0010\'\u001A\u0004\b:\u0010\u0011R\u0019\u0010\r\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b;\u0010\'\u001A\u0004\b<\u0010\u0011\u00A8\u0006="}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/item/DetailInfo;", "", "", "earnings", "currency", "impression", "clicks", "startDate", "endDate", "rpm", "pageRpm", "pageCtr", "eCpm", "vCpm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/revenue/item/DetailInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getEarnings", "b", "getCurrency", "c", "getImpression", "d", "getClicks", "e", "getStartDate", "f", "getEndDate", "g", "getRpm", "h", "getPageRpm", "i", "getPageCtr", "j", "getECpm", "k", "getVCpm", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DetailInfo {
    public static final int $stable;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public DetailInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, 0x7FF, null);
    }

    public DetailInfo(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull String s4, @NotNull String s5, @Nullable String s6, @Nullable String s7, @Nullable String s8, @Nullable String s9, @Nullable String s10) {
        Intrinsics.checkNotNullParameter(s, "earnings");
        Intrinsics.checkNotNullParameter(s1, "currency");
        Intrinsics.checkNotNullParameter(s2, "impression");
        Intrinsics.checkNotNullParameter(s3, "clicks");
        Intrinsics.checkNotNullParameter(s4, "startDate");
        Intrinsics.checkNotNullParameter(s5, "endDate");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
        this.g = s6;
        this.h = s7;
        this.i = s8;
        this.j = s9;
        this.k = s10;
    }

    public DetailInfo(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v & 1) == 0 ? s : ""), ((v & 2) == 0 ? s1 : ""), ((v & 4) == 0 ? s2 : ""), ((v & 8) == 0 ? s3 : ""), ((v & 16) == 0 ? s4 : ""), ((v & 0x20) == 0 ? s5 : ""), ((v & 0x40) == 0 ? s6 : null), ((v & 0x80) == 0 ? s7 : null), ((v & 0x100) == 0 ? s8 : null), ((v & 0x200) == 0 ? s9 : null), ((v & 0x400) == 0 ? s10 : null));
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @Nullable
    public final String component10() {
        return this.j;
    }

    @Nullable
    public final String component11() {
        return this.k;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final String component3() {
        return this.c;
    }

    @NotNull
    public final String component4() {
        return this.d;
    }

    @NotNull
    public final String component5() {
        return this.e;
    }

    @NotNull
    public final String component6() {
        return this.f;
    }

    @Nullable
    public final String component7() {
        return this.g;
    }

    @Nullable
    public final String component8() {
        return this.h;
    }

    @Nullable
    public final String component9() {
        return this.i;
    }

    @NotNull
    public final DetailInfo copy(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull String s4, @NotNull String s5, @Nullable String s6, @Nullable String s7, @Nullable String s8, @Nullable String s9, @Nullable String s10) {
        Intrinsics.checkNotNullParameter(s, "earnings");
        Intrinsics.checkNotNullParameter(s1, "currency");
        Intrinsics.checkNotNullParameter(s2, "impression");
        Intrinsics.checkNotNullParameter(s3, "clicks");
        Intrinsics.checkNotNullParameter(s4, "startDate");
        Intrinsics.checkNotNullParameter(s5, "endDate");
        return new DetailInfo(s, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
    }

    public static DetailInfo copy$default(DetailInfo detailInfo0, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, int v, Object object0) {
        String s11 = (v & 1) == 0 ? s : detailInfo0.a;
        String s12 = (v & 2) == 0 ? s1 : detailInfo0.b;
        String s13 = (v & 4) == 0 ? s2 : detailInfo0.c;
        String s14 = (v & 8) == 0 ? s3 : detailInfo0.d;
        String s15 = (v & 16) == 0 ? s4 : detailInfo0.e;
        String s16 = (v & 0x20) == 0 ? s5 : detailInfo0.f;
        String s17 = (v & 0x40) == 0 ? s6 : detailInfo0.g;
        String s18 = (v & 0x80) == 0 ? s7 : detailInfo0.h;
        String s19 = (v & 0x100) == 0 ? s8 : detailInfo0.i;
        String s20 = (v & 0x200) == 0 ? s9 : detailInfo0.j;
        return (v & 0x400) == 0 ? detailInfo0.copy(s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s10) : detailInfo0.copy(s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, detailInfo0.k);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DetailInfo)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((DetailInfo)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((DetailInfo)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((DetailInfo)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((DetailInfo)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((DetailInfo)object0).e)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((DetailInfo)object0).f)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((DetailInfo)object0).g)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.h, ((DetailInfo)object0).h)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.i, ((DetailInfo)object0).i)) {
            return false;
        }
        return Intrinsics.areEqual(this.j, ((DetailInfo)object0).j) ? Intrinsics.areEqual(this.k, ((DetailInfo)object0).k) : false;
    }

    @NotNull
    public final String getClicks() [...] // 潜在的解密器

    @NotNull
    public final String getCurrency() {
        return this.b;
    }

    @Nullable
    public final String getECpm() {
        return this.j;
    }

    @NotNull
    public final String getEarnings() [...] // 潜在的解密器

    @NotNull
    public final String getEndDate() [...] // 潜在的解密器

    @NotNull
    public final String getImpression() [...] // 潜在的解密器

    @Nullable
    public final String getPageCtr() {
        return this.i;
    }

    @Nullable
    public final String getPageRpm() {
        return this.h;
    }

    @Nullable
    public final String getRpm() {
        return this.g;
    }

    @NotNull
    public final String getStartDate() [...] // 潜在的解密器

    @Nullable
    public final String getVCpm() {
        return this.k;
    }

    @Override
    public int hashCode() {
        int v = a.a(this.f, a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
        int v1 = 0;
        int v2 = this.g == null ? 0 : this.g.hashCode();
        int v3 = this.h == null ? 0 : this.h.hashCode();
        int v4 = this.i == null ? 0 : this.i.hashCode();
        int v5 = this.j == null ? 0 : this.j.hashCode();
        String s = this.k;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((((v + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v1;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = b.w("DetailInfo(earnings=", this.a, ", currency=", this.b, ", impression=");
        androidx.room.a.w(stringBuilder0, this.c, ", clicks=", this.d, ", startDate=");
        androidx.room.a.w(stringBuilder0, this.e, ", endDate=", this.f, ", rpm=");
        androidx.room.a.w(stringBuilder0, this.g, ", pageRpm=", this.h, ", pageCtr=");
        androidx.room.a.w(stringBuilder0, this.i, ", eCpm=", this.j, ", vCpm=");
        return r0.a.o(stringBuilder0, this.k, ")");
    }
}

