package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.common.graph.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u0012\u0010\f\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000E\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\rJ\u0012\u0010\u000F\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000F\u0010\rJ\u0010\u0010\u0010\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0014\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0018\u001A\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001B\u001A\u00020\b2\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\rR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001E\u001A\u0004\b!\u0010\rR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001E\u001A\u0004\b#\u0010\rR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\u0011R\u0017\u0010\t\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b\t\u0010\u0013¨\u0006)"}, d2 = {"Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "", "", "commentId", "parentId", "mentionId", "", "text", "", "isSecret", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/Long;", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "()Z", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Z)Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "getCommentId", "b", "getParentId", "c", "getMentionId", "d", "Ljava/lang/String;", "getText", "e", "Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CommentCompletion {
    public static final int $stable;
    public final Long a;
    public final Long b;
    public final Long c;
    public final String d;
    public final boolean e;

    public CommentCompletion(@Nullable Long long0, @Nullable Long long1, @Nullable Long long2, @NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "text");
        super();
        this.a = long0;
        this.b = long1;
        this.c = long2;
        this.d = s;
        this.e = z;
    }

    public CommentCompletion(Long long0, Long long1, Long long2, String s, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 16) != 0) {
            z = false;
        }
        this(((v & 1) == 0 ? long0 : null), ((v & 2) == 0 ? long1 : null), ((v & 4) == 0 ? long2 : null), s, z);
    }

    @Nullable
    public final Long component1() {
        return this.a;
    }

    @Nullable
    public final Long component2() {
        return this.b;
    }

    @Nullable
    public final Long component3() {
        return this.c;
    }

    @NotNull
    public final String component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    @NotNull
    public final CommentCompletion copy(@Nullable Long long0, @Nullable Long long1, @Nullable Long long2, @NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "text");
        return new CommentCompletion(long0, long1, long2, s, z);
    }

    public static CommentCompletion copy$default(CommentCompletion commentCompletion0, Long long0, Long long1, Long long2, String s, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            long0 = commentCompletion0.a;
        }
        if((v & 2) != 0) {
            long1 = commentCompletion0.b;
        }
        if((v & 4) != 0) {
            long2 = commentCompletion0.c;
        }
        if((v & 8) != 0) {
            s = commentCompletion0.d;
        }
        if((v & 16) != 0) {
            z = commentCompletion0.e;
        }
        return commentCompletion0.copy(long0, long1, long2, s, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CommentCompletion)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((CommentCompletion)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((CommentCompletion)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((CommentCompletion)object0).c)) {
            return false;
        }
        return Intrinsics.areEqual(this.d, ((CommentCompletion)object0).d) ? this.e == ((CommentCompletion)object0).e : false;
    }

    @Nullable
    public final Long getCommentId() {
        return this.a;
    }

    @Nullable
    public final Long getMentionId() {
        return this.c;
    }

    @Nullable
    public final Long getParentId() {
        return this.b;
    }

    @NotNull
    public final String getText() {
        return this.d;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        Long long0 = this.c;
        if(long0 != null) {
            v = long0.hashCode();
        }
        return Boolean.hashCode(this.e) + a.a(this.d, ((v1 * 0x1F + v2) * 0x1F + v) * 0x1F, 0x1F);
    }

    public final boolean isSecret() {
        return this.e;
    }

    @Override
    @NotNull
    public String toString() {
        return "CommentCompletion(commentId=" + this.a + ", parentId=" + this.b + ", mentionId=" + this.c + ", text=" + this.d + ", isSecret=" + this.e + ")";
    }
}

