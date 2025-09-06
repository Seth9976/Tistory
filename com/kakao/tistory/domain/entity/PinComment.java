package com.kakao.tistory.domain.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/domain/entity/PinComment;", "", "pinnedUserName", "", "comment", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "(Ljava/lang/String;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;)V", "getComment", "()Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "getPinnedUserName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PinComment {
    @NotNull
    private final CommentItem comment;
    @NotNull
    private final String pinnedUserName;

    public PinComment(@NotNull String s, @NotNull CommentItem commentItemType$CommentItem0) {
        Intrinsics.checkNotNullParameter(s, "pinnedUserName");
        Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "comment");
        super();
        this.pinnedUserName = s;
        this.comment = commentItemType$CommentItem0;
    }

    public PinComment(String s, CommentItem commentItemType$CommentItem0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            s = "";
        }
        this(s, commentItemType$CommentItem0);
    }

    @NotNull
    public final String component1() {
        return this.pinnedUserName;
    }

    @NotNull
    public final CommentItem component2() {
        return this.comment;
    }

    @NotNull
    public final PinComment copy(@NotNull String s, @NotNull CommentItem commentItemType$CommentItem0) {
        Intrinsics.checkNotNullParameter(s, "pinnedUserName");
        Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "comment");
        return new PinComment(s, commentItemType$CommentItem0);
    }

    public static PinComment copy$default(PinComment pinComment0, String s, CommentItem commentItemType$CommentItem0, int v, Object object0) {
        if((v & 1) != 0) {
            s = pinComment0.pinnedUserName;
        }
        if((v & 2) != 0) {
            commentItemType$CommentItem0 = pinComment0.comment;
        }
        return pinComment0.copy(s, commentItemType$CommentItem0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PinComment)) {
            return false;
        }
        return Intrinsics.areEqual(this.pinnedUserName, ((PinComment)object0).pinnedUserName) ? Intrinsics.areEqual(this.comment, ((PinComment)object0).comment) : false;
    }

    @NotNull
    public final CommentItem getComment() {
        return this.comment;
    }

    @NotNull
    public final String getPinnedUserName() {
        return this.pinnedUserName;
    }

    @Override
    public int hashCode() {
        return this.comment.hashCode() + this.pinnedUserName.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "PinComment(pinnedUserName=" + this.pinnedUserName + ", comment=" + this.comment + ")";
    }
}

