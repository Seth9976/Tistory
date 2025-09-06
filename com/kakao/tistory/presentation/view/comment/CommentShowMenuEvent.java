package com.kakao.tistory.presentation.view.comment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ&\u0010\f\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u000B¨\u0006\u001E"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/CommentShowMenuEvent;", "", "", "reloadId", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "commentItem", "<init>", "(Ljava/lang/Long;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;)V", "component1", "()Ljava/lang/Long;", "component2", "()Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "copy", "(Ljava/lang/Long;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;)Lcom/kakao/tistory/presentation/view/comment/CommentShowMenuEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "getReloadId", "b", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "getCommentItem", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CommentShowMenuEvent {
    public static final int $stable = 8;
    public final Long a;
    public final CommentItem b;

    public CommentShowMenuEvent(@Nullable Long long0, @NotNull CommentItem commentItemType$CommentItem0) {
        Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "commentItem");
        super();
        this.a = long0;
        this.b = commentItemType$CommentItem0;
    }

    public CommentShowMenuEvent(Long long0, CommentItem commentItemType$CommentItem0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            long0 = null;
        }
        this(long0, commentItemType$CommentItem0);
    }

    @Nullable
    public final Long component1() {
        return this.a;
    }

    @NotNull
    public final CommentItem component2() {
        return this.b;
    }

    @NotNull
    public final CommentShowMenuEvent copy(@Nullable Long long0, @NotNull CommentItem commentItemType$CommentItem0) {
        Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "commentItem");
        return new CommentShowMenuEvent(long0, commentItemType$CommentItem0);
    }

    public static CommentShowMenuEvent copy$default(CommentShowMenuEvent commentShowMenuEvent0, Long long0, CommentItem commentItemType$CommentItem0, int v, Object object0) {
        if((v & 1) != 0) {
            long0 = commentShowMenuEvent0.a;
        }
        if((v & 2) != 0) {
            commentItemType$CommentItem0 = commentShowMenuEvent0.b;
        }
        return commentShowMenuEvent0.copy(long0, commentItemType$CommentItem0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CommentShowMenuEvent)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((CommentShowMenuEvent)object0).a) ? Intrinsics.areEqual(this.b, ((CommentShowMenuEvent)object0).b) : false;
    }

    @NotNull
    public final CommentItem getCommentItem() {
        return this.b;
    }

    @Nullable
    public final Long getReloadId() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a == null ? this.b.hashCode() : this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "CommentShowMenuEvent(reloadId=" + this.a + ", commentItem=" + this.b + ")";
    }
}

