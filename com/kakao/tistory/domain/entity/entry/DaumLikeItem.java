package com.kakao.tistory.domain.entity.entry;

import com.kakao.tistory.domain.blog.entity.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0012\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0007HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001A\u00020\u00072\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001A\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0013\u0010\b\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000F¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/DaumLikeItem;", "", "id", "", "label", "", "active", "", "related", "(ILjava/lang/String;ZLjava/lang/String;)V", "getActive", "()Z", "getId", "()I", "getLabel", "()Ljava/lang/String;", "getRelated", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DaumLikeItem {
    private final boolean active;
    private final int id;
    @Nullable
    private final String label;
    @Nullable
    private final String related;

    public DaumLikeItem(int v, @Nullable String s, boolean z, @Nullable String s1) {
        this.id = v;
        this.label = s;
        this.active = z;
        this.related = s1;
    }

    public DaumLikeItem(int v, String s, boolean z, String s1, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            z = false;
        }
        if((v1 & 8) != 0) {
            s1 = null;
        }
        this(v, s, z, s1);
    }

    public final int component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.label;
    }

    public final boolean component3() {
        return this.active;
    }

    @Nullable
    public final String component4() {
        return this.related;
    }

    @NotNull
    public final DaumLikeItem copy(int v, @Nullable String s, boolean z, @Nullable String s1) {
        return new DaumLikeItem(v, s, z, s1);
    }

    public static DaumLikeItem copy$default(DaumLikeItem daumLikeItem0, int v, String s, boolean z, String s1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = daumLikeItem0.id;
        }
        if((v1 & 2) != 0) {
            s = daumLikeItem0.label;
        }
        if((v1 & 4) != 0) {
            z = daumLikeItem0.active;
        }
        if((v1 & 8) != 0) {
            s1 = daumLikeItem0.related;
        }
        return daumLikeItem0.copy(v, s, z, s1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DaumLikeItem)) {
            return false;
        }
        if(this.id != ((DaumLikeItem)object0).id) {
            return false;
        }
        if(!Intrinsics.areEqual(this.label, ((DaumLikeItem)object0).label)) {
            return false;
        }
        return this.active == ((DaumLikeItem)object0).active ? Intrinsics.areEqual(this.related, ((DaumLikeItem)object0).related) : false;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getRelated() {
        return this.related;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = c.a(this.active, (this.id * 0x1F + (this.label == null ? 0 : this.label.hashCode())) * 0x1F, 0x1F);
        String s = this.related;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 + v;
    }

    @Override
    @NotNull
    public String toString() {
        return "DaumLikeItem(id=" + this.id + ", label=" + this.label + ", active=" + this.active + ", related=" + this.related + ")";
    }
}

