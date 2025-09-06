package com.kakao.tistory.presentation.screen.blogswitch.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.User;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchIntent;", "", "GoSetting", "SwitchBlog", "UpdateCurrentBlog", "UpdateUser", "Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchIntent$GoSetting;", "Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchIntent$SwitchBlog;", "Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchIntent$UpdateCurrentBlog;", "Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchIntent$UpdateUser;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface BlogSwitchIntent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchIntent$GoSetting;", "Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchIntent;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoSetting implements BlogSwitchIntent {
        public static final int $stable;
        @NotNull
        public static final GoSetting INSTANCE;

        static {
            GoSetting.INSTANCE = new GoSetting();
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u000B¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchIntent$SwitchBlog;", "Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchIntent;", "", "position", "Lcom/kakao/tistory/domain/entity/Blog;", "blog", "<init>", "(ILcom/kakao/tistory/domain/entity/Blog;)V", "component1", "()I", "component2", "()Lcom/kakao/tistory/domain/entity/Blog;", "copy", "(ILcom/kakao/tistory/domain/entity/Blog;)Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchIntent$SwitchBlog;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getPosition", "b", "Lcom/kakao/tistory/domain/entity/Blog;", "getBlog", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SwitchBlog implements BlogSwitchIntent {
        public static final int $stable = 8;
        public final int a;
        public final Blog b;

        public SwitchBlog(int v, @NotNull Blog blog0) {
            Intrinsics.checkNotNullParameter(blog0, "blog");
            super();
            this.a = v;
            this.b = blog0;
        }

        public final int component1() {
            return this.a;
        }

        @NotNull
        public final Blog component2() {
            return this.b;
        }

        @NotNull
        public final SwitchBlog copy(int v, @NotNull Blog blog0) {
            Intrinsics.checkNotNullParameter(blog0, "blog");
            return new SwitchBlog(v, blog0);
        }

        public static SwitchBlog copy$default(SwitchBlog blogSwitchIntent$SwitchBlog0, int v, Blog blog0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = blogSwitchIntent$SwitchBlog0.a;
            }
            if((v1 & 2) != 0) {
                blog0 = blogSwitchIntent$SwitchBlog0.b;
            }
            return blogSwitchIntent$SwitchBlog0.copy(v, blog0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof SwitchBlog)) {
                return false;
            }
            return this.a == ((SwitchBlog)object0).a ? Intrinsics.areEqual(this.b, ((SwitchBlog)object0).b) : false;
        }

        @NotNull
        public final Blog getBlog() {
            return this.b;
        }

        public final int getPosition() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + this.a * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "SwitchBlog(position=" + this.a + ", blog=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchIntent$UpdateCurrentBlog;", "Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchIntent;", "Lcom/kakao/tistory/domain/entity/Blog;", "blog", "<init>", "(Lcom/kakao/tistory/domain/entity/Blog;)V", "component1", "()Lcom/kakao/tistory/domain/entity/Blog;", "copy", "(Lcom/kakao/tistory/domain/entity/Blog;)Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchIntent$UpdateCurrentBlog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/entity/Blog;", "getBlog", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateCurrentBlog implements BlogSwitchIntent {
        public static final int $stable = 8;
        public final Blog a;

        public UpdateCurrentBlog(@Nullable Blog blog0) {
            this.a = blog0;
        }

        @Nullable
        public final Blog component1() {
            return this.a;
        }

        @NotNull
        public final UpdateCurrentBlog copy(@Nullable Blog blog0) {
            return new UpdateCurrentBlog(blog0);
        }

        public static UpdateCurrentBlog copy$default(UpdateCurrentBlog blogSwitchIntent$UpdateCurrentBlog0, Blog blog0, int v, Object object0) {
            if((v & 1) != 0) {
                blog0 = blogSwitchIntent$UpdateCurrentBlog0.a;
            }
            return blogSwitchIntent$UpdateCurrentBlog0.copy(blog0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateCurrentBlog ? Intrinsics.areEqual(this.a, ((UpdateCurrentBlog)object0).a) : false;
        }

        @Nullable
        public final Blog getBlog() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateCurrentBlog(blog=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchIntent$UpdateUser;", "Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchIntent;", "Lcom/kakao/tistory/domain/entity/User;", "user", "<init>", "(Lcom/kakao/tistory/domain/entity/User;)V", "component1", "()Lcom/kakao/tistory/domain/entity/User;", "copy", "(Lcom/kakao/tistory/domain/entity/User;)Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchIntent$UpdateUser;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/entity/User;", "getUser", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateUser implements BlogSwitchIntent {
        public static final int $stable = 8;
        public final User a;

        public UpdateUser(@Nullable User user0) {
            this.a = user0;
        }

        @Nullable
        public final User component1() {
            return this.a;
        }

        @NotNull
        public final UpdateUser copy(@Nullable User user0) {
            return new UpdateUser(user0);
        }

        public static UpdateUser copy$default(UpdateUser blogSwitchIntent$UpdateUser0, User user0, int v, Object object0) {
            if((v & 1) != 0) {
                user0 = blogSwitchIntent$UpdateUser0.a;
            }
            return blogSwitchIntent$UpdateUser0.copy(user0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateUser ? Intrinsics.areEqual(this.a, ((UpdateUser)object0).a) : false;
        }

        @Nullable
        public final User getUser() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateUser(user=" + this.a + ")";
        }
    }

}

