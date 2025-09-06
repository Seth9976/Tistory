package com.kakao.tistory.domain.entity.autosave;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\u0010\u0010\u0011\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000BJ.\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/domain/entity/autosave/EntryKeyEntity;", "", "blogName", "", "entryId", "", "draftSequence", "(Ljava/lang/String;JLjava/lang/Long;)V", "getBlogName", "()Ljava/lang/String;", "getDraftSequence", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEntryId", "()J", "component1", "component2", "component3", "copy", "(Ljava/lang/String;JLjava/lang/Long;)Lcom/kakao/tistory/domain/entity/autosave/EntryKeyEntity;", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EntryKeyEntity {
    @NotNull
    private final String blogName;
    @Nullable
    private final Long draftSequence;
    private final long entryId;

    public EntryKeyEntity(@NotNull String s, long v, @Nullable Long long0) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        super();
        this.blogName = s;
        this.entryId = v;
        this.draftSequence = long0;
    }

    public EntryKeyEntity(String s, long v, Long long0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            v = 0L;
        }
        this(s, v, long0);
    }

    @NotNull
    public final String component1() {
        return this.blogName;
    }

    public final long component2() {
        return this.entryId;
    }

    @Nullable
    public final Long component3() {
        return this.draftSequence;
    }

    @NotNull
    public final EntryKeyEntity copy(@NotNull String s, long v, @Nullable Long long0) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        return new EntryKeyEntity(s, v, long0);
    }

    public static EntryKeyEntity copy$default(EntryKeyEntity entryKeyEntity0, String s, long v, Long long0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = entryKeyEntity0.blogName;
        }
        if((v1 & 2) != 0) {
            v = entryKeyEntity0.entryId;
        }
        if((v1 & 4) != 0) {
            long0 = entryKeyEntity0.draftSequence;
        }
        return entryKeyEntity0.copy(s, v, long0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof EntryKeyEntity)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.blogName, ((EntryKeyEntity)object0).blogName)) {
            return false;
        }
        return this.entryId == ((EntryKeyEntity)object0).entryId ? Intrinsics.areEqual(this.draftSequence, ((EntryKeyEntity)object0).draftSequence) : false;
    }

    @NotNull
    public final String getBlogName() {
        return this.blogName;
    }

    @Nullable
    public final Long getDraftSequence() {
        return this.draftSequence;
    }

    public final long getEntryId() {
        return this.entryId;
    }

    @Override
    public int hashCode() {
        int v = a.k(this.entryId, this.blogName.hashCode() * 0x1F, 0x1F);
        return this.draftSequence == null ? v : v + this.draftSequence.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "EntryKeyEntity(blogName=" + this.blogName + ", entryId=" + this.entryId + ", draftSequence=" + this.draftSequence + ")";
    }
}

