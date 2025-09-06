package com.kakao.tistory.domain.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00032\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000B¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/domain/entity/Etiquette;", "", "enable", "", "start", "", "finish", "(ZLjava/lang/String;Ljava/lang/String;)V", "getEnable", "()Z", "getFinish", "()Ljava/lang/String;", "getStart", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Etiquette {
    private final boolean enable;
    @Nullable
    private final String finish;
    @Nullable
    private final String start;

    public Etiquette() {
        this(false, null, null, 7, null);
    }

    public Etiquette(boolean z, @Nullable String s, @Nullable String s1) {
        this.enable = z;
        this.start = s;
        this.finish = s1;
    }

    public Etiquette(boolean z, String s, String s1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        this(z, s, s1);
    }

    public final boolean component1() {
        return this.enable;
    }

    @Nullable
    public final String component2() {
        return this.start;
    }

    @Nullable
    public final String component3() {
        return this.finish;
    }

    @NotNull
    public final Etiquette copy(boolean z, @Nullable String s, @Nullable String s1) {
        return new Etiquette(z, s, s1);
    }

    public static Etiquette copy$default(Etiquette etiquette0, boolean z, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            z = etiquette0.enable;
        }
        if((v & 2) != 0) {
            s = etiquette0.start;
        }
        if((v & 4) != 0) {
            s1 = etiquette0.finish;
        }
        return etiquette0.copy(z, s, s1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Etiquette)) {
            return false;
        }
        if(this.enable != ((Etiquette)object0).enable) {
            return false;
        }
        return Intrinsics.areEqual(this.start, ((Etiquette)object0).start) ? Intrinsics.areEqual(this.finish, ((Etiquette)object0).finish) : false;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final String getFinish() {
        return this.finish;
    }

    @Nullable
    public final String getStart() {
        return this.start;
    }

    @Override
    public int hashCode() {
        int v = Boolean.hashCode(this.enable);
        int v1 = 0;
        int v2 = this.start == null ? 0 : this.start.hashCode();
        String s = this.finish;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Etiquette(enable=");
        stringBuilder0.append(this.enable);
        stringBuilder0.append(", start=");
        stringBuilder0.append(this.start);
        stringBuilder0.append(", finish=");
        return a.o(stringBuilder0, this.finish, ")");
    }
}

