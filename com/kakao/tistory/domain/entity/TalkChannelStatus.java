package com.kakao.tistory.domain.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001A\u00020\rHÖ\u0001J\t\u0010\u000E\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u000F"}, d2 = {"Lcom/kakao/tistory/domain/entity/TalkChannelStatus;", "", "relation", "", "(Ljava/lang/String;)V", "getRelation", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TalkChannelStatus {
    @NotNull
    private final String relation;

    public TalkChannelStatus(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "relation");
        super();
        this.relation = s;
    }

    @NotNull
    public final String component1() {
        return this.relation;
    }

    @NotNull
    public final TalkChannelStatus copy(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "relation");
        return new TalkChannelStatus(s);
    }

    public static TalkChannelStatus copy$default(TalkChannelStatus talkChannelStatus0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = talkChannelStatus0.relation;
        }
        return talkChannelStatus0.copy(s);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof TalkChannelStatus ? Intrinsics.areEqual(this.relation, ((TalkChannelStatus)object0).relation) : false;
    }

    @NotNull
    public final String getRelation() {
        return this.relation;
    }

    @Override
    public int hashCode() {
        return this.relation.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "TalkChannelStatus(relation=" + this.relation + ")";
    }
}

