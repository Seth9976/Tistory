package com.kakao.tistory.domain.entity.common;

import com.kakao.tistory.domain.blog.entity.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001A\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0004HÆ\u0003J\u0010\u0010\u0017\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0018\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0019\u001A\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\fJF\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u001BJ\u0013\u0010\u001C\u001A\u00020\u00042\b\u0010\u001D\u001A\u0004\u0018\u00010\u001EHÖ\u0003J\t\u0010\u001F\u001A\u00020 HÖ\u0001J\t\u0010!\u001A\u00020\"HÖ\u0001R\u0015\u0010\t\u001A\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0005\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000FR\u0015\u0010\b\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001A\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001A\u0004\b\u0014\u0010\u0012¨\u0006#"}, d2 = {"Lcom/kakao/tistory/domain/entity/common/CommentItemListModel;", "Lcom/kakao/tistory/domain/entity/common/ItemListModel;", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "hasPrev", "", "hasNext", "oldestCommentId", "", "newestCommentId", "existBaseComment", "(ZZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getExistBaseComment", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasNext", "()Z", "getHasPrev", "getNewestCommentId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOldestCommentId", "component1", "component2", "component3", "component4", "component5", "copy", "(ZZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/kakao/tistory/domain/entity/common/CommentItemListModel;", "equals", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CommentItemListModel extends ItemListModel {
    @Nullable
    private final Boolean existBaseComment;
    private final boolean hasNext;
    private final boolean hasPrev;
    @Nullable
    private final Long newestCommentId;
    @Nullable
    private final Long oldestCommentId;

    public CommentItemListModel() {
        this(false, false, null, null, null, 0x1F, null);
    }

    public CommentItemListModel(boolean z, boolean z1, @Nullable Long long0, @Nullable Long long1, @Nullable Boolean boolean0) {
        this.hasPrev = z;
        this.hasNext = z1;
        this.oldestCommentId = long0;
        this.newestCommentId = long1;
        this.existBaseComment = boolean0;
    }

    public CommentItemListModel(boolean z, boolean z1, Long long0, Long long1, Boolean boolean0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 16) != 0) {
            boolean0 = Boolean.FALSE;
        }
        this(((v & 1) == 0 ? z : false), ((v & 2) == 0 ? z1 : false), ((v & 4) == 0 ? long0 : null), ((v & 8) == 0 ? long1 : null), boolean0);
    }

    public final boolean component1() {
        return this.hasPrev;
    }

    public final boolean component2() {
        return this.hasNext;
    }

    @Nullable
    public final Long component3() {
        return this.oldestCommentId;
    }

    @Nullable
    public final Long component4() {
        return this.newestCommentId;
    }

    @Nullable
    public final Boolean component5() {
        return this.existBaseComment;
    }

    @NotNull
    public final CommentItemListModel copy(boolean z, boolean z1, @Nullable Long long0, @Nullable Long long1, @Nullable Boolean boolean0) {
        return new CommentItemListModel(z, z1, long0, long1, boolean0);
    }

    public static CommentItemListModel copy$default(CommentItemListModel commentItemListModel0, boolean z, boolean z1, Long long0, Long long1, Boolean boolean0, int v, Object object0) {
        if((v & 1) != 0) {
            z = commentItemListModel0.hasPrev;
        }
        if((v & 2) != 0) {
            z1 = commentItemListModel0.hasNext;
        }
        if((v & 4) != 0) {
            long0 = commentItemListModel0.oldestCommentId;
        }
        if((v & 8) != 0) {
            long1 = commentItemListModel0.newestCommentId;
        }
        if((v & 16) != 0) {
            boolean0 = commentItemListModel0.existBaseComment;
        }
        return commentItemListModel0.copy(z, z1, long0, long1, boolean0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CommentItemListModel)) {
            return false;
        }
        if(this.hasPrev != ((CommentItemListModel)object0).hasPrev) {
            return false;
        }
        if(this.hasNext != ((CommentItemListModel)object0).hasNext) {
            return false;
        }
        if(!Intrinsics.areEqual(this.oldestCommentId, ((CommentItemListModel)object0).oldestCommentId)) {
            return false;
        }
        return Intrinsics.areEqual(this.newestCommentId, ((CommentItemListModel)object0).newestCommentId) ? Intrinsics.areEqual(this.existBaseComment, ((CommentItemListModel)object0).existBaseComment) : false;
    }

    @Nullable
    public final Boolean getExistBaseComment() {
        return this.existBaseComment;
    }

    public final boolean getHasNext() {
        return this.hasNext;
    }

    public final boolean getHasPrev() {
        return this.hasPrev;
    }

    @Nullable
    public final Long getNewestCommentId() {
        return this.newestCommentId;
    }

    @Nullable
    public final Long getOldestCommentId() {
        return this.oldestCommentId;
    }

    @Override
    public int hashCode() {
        int v = c.a(this.hasNext, Boolean.hashCode(this.hasPrev) * 0x1F, 0x1F);
        int v1 = 0;
        int v2 = this.oldestCommentId == null ? 0 : this.oldestCommentId.hashCode();
        int v3 = this.newestCommentId == null ? 0 : this.newestCommentId.hashCode();
        Boolean boolean0 = this.existBaseComment;
        if(boolean0 != null) {
            v1 = boolean0.hashCode();
        }
        return ((v + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override
    @NotNull
    public String toString() {
        return "CommentItemListModel(hasPrev=" + this.hasPrev + ", hasNext=" + this.hasNext + ", oldestCommentId=" + this.oldestCommentId + ", newestCommentId=" + this.newestCommentId + ", existBaseComment=" + this.existBaseComment + ")";
    }
}

