package com.kakao.tistory.presentation.common.eventbus;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000E\u0010\tJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\u00042\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u000B¨\u0006\u001C"}, d2 = {"Lcom/kakao/tistory/presentation/common/eventbus/BlogFollowEvent;", "Lcom/kakao/tistory/presentation/common/eventbus/TistoryEventBus;", "", "blogName", "", "following", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/kakao/tistory/presentation/common/eventbus/BlogFollowEvent;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "Z", "getFollowing", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogFollowEvent implements TistoryEventBus {
    public static final int $stable;
    public final String a;
    public final boolean b;

    public BlogFollowEvent(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        super();
        this.a = s;
        this.b = z;
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    @NotNull
    public final BlogFollowEvent copy(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        return new BlogFollowEvent(s, z);
    }

    public static BlogFollowEvent copy$default(BlogFollowEvent blogFollowEvent0, String s, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = blogFollowEvent0.a;
        }
        if((v & 2) != 0) {
            z = blogFollowEvent0.b;
        }
        return blogFollowEvent0.copy(s, z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlogFollowEvent)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((BlogFollowEvent)object0).a) ? this.b == ((BlogFollowEvent)object0).b : false;
    }

    @NotNull
    public final String getBlogName() {
        return this.a;
    }

    public final boolean getFollowing() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.b) + this.a.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "BlogFollowEvent(blogName=" + this.a + ", following=" + this.b + ")";
    }
}

