package com.kakao.tistory.presentation.screen.blogswitch.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.domain.entity.Blog;
import java.util.List;
import javax.annotation.concurrent.Immutable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Immutable
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u009F\u0001\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012#\b\u0002\u0010\u000E\u001A\u001D\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b\u0012\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\r0\u000F\u0012)\b\u0002\u0010\u0014\u001A#\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0011\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0016\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001BJ+\u0010\u001D\u001A\u001D\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bH\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0016\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\r0\u000FH\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J1\u0010!\u001A#\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0011H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u00A8\u0001\u0010#\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00022\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00020\u00052\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00020\u00052#\b\u0002\u0010\u000E\u001A\u001D\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b2\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\r0\u000F2)\b\u0002\u0010\u0014\u001A#\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0011H\u00C6\u0001\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010&\u001A\u00020%H\u00D6\u0001\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\u0012H\u00D6\u0001\u00A2\u0006\u0004\b(\u0010)J\u001A\u0010,\u001A\u00020+2\b\u0010*\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u0010\u0018R\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b1\u0010/\u001A\u0004\b2\u0010\u0018R\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u0010\u001BR\u001D\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b6\u00104\u001A\u0004\b7\u0010\u001BR2\u0010\u000E\u001A\u001D\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b8\u0006\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010\u001ER\u001D\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\r0\u000F8\u0006\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010 R8\u0010\u0014\u001A#\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00118\u0006\u00A2\u0006\f\n\u0004\b>\u0010?\u001A\u0004\b@\u0010\"\u00A8\u0006A"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchState;", "", "Lcom/kakao/tistory/domain/entity/Blog;", "defaultBlog", "currentBlog", "", "ownerBlogList", "joinedBlogList", "Lkotlin/Function1;", "Lcom/kakao/tistory/presentation/screen/blogswitch/navigation/BlogSwitchType;", "Lkotlin/ParameterName;", "name", "type", "", "updateScreenInfo", "Lkotlin/Function0;", "onClickSetting", "Lkotlin/Function2;", "", "position", "onClickBlog", "<init>", "(Lcom/kakao/tistory/domain/entity/Blog;Lcom/kakao/tistory/domain/entity/Blog;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "component1", "()Lcom/kakao/tistory/domain/entity/Blog;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Lkotlin/jvm/functions/Function1;", "component6", "()Lkotlin/jvm/functions/Function0;", "component7", "()Lkotlin/jvm/functions/Function2;", "copy", "(Lcom/kakao/tistory/domain/entity/Blog;Lcom/kakao/tistory/domain/entity/Blog;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchState;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/entity/Blog;", "getDefaultBlog", "b", "getCurrentBlog", "c", "Ljava/util/List;", "getOwnerBlogList", "d", "getJoinedBlogList", "e", "Lkotlin/jvm/functions/Function1;", "getUpdateScreenInfo", "f", "Lkotlin/jvm/functions/Function0;", "getOnClickSetting", "g", "Lkotlin/jvm/functions/Function2;", "getOnClickBlog", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogSwitchState {
    public static final int $stable = 8;
    public final Blog a;
    public final Blog b;
    public final List c;
    public final List d;
    public final Function1 e;
    public final Function0 f;
    public final Function2 g;

    public BlogSwitchState() {
        this(null, null, null, null, null, null, null, 0x7F, null);
    }

    public BlogSwitchState(@Nullable Blog blog0, @Nullable Blog blog1, @NotNull List list0, @NotNull List list1, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(list0, "ownerBlogList");
        Intrinsics.checkNotNullParameter(list1, "joinedBlogList");
        Intrinsics.checkNotNullParameter(function10, "updateScreenInfo");
        Intrinsics.checkNotNullParameter(function00, "onClickSetting");
        Intrinsics.checkNotNullParameter(function20, "onClickBlog");
        super();
        this.a = blog0;
        this.b = blog1;
        this.c = list0;
        this.d = list1;
        this.e = function10;
        this.f = function00;
        this.g = function20;
    }

    public BlogSwitchState(Blog blog0, Blog blog1, List list0, List list1, Function1 function10, Function0 function00, Function2 function20, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 8) != 0) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 16) != 0) {
            function10 = a.a;
        }
        if((v & 0x20) != 0) {
            function00 = b.a;
        }
        if((v & 0x40) != 0) {
            function20 = c.a;
        }
        this(((v & 1) == 0 ? blog0 : null), ((v & 2) == 0 ? blog1 : null), list0, list1, function10, function00, function20);
    }

    @Nullable
    public final Blog component1() {
        return this.a;
    }

    @Nullable
    public final Blog component2() {
        return this.b;
    }

    @NotNull
    public final List component3() {
        return this.c;
    }

    @NotNull
    public final List component4() {
        return this.d;
    }

    @NotNull
    public final Function1 component5() {
        return this.e;
    }

    @NotNull
    public final Function0 component6() {
        return this.f;
    }

    @NotNull
    public final Function2 component7() {
        return this.g;
    }

    @NotNull
    public final BlogSwitchState copy(@Nullable Blog blog0, @Nullable Blog blog1, @NotNull List list0, @NotNull List list1, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(list0, "ownerBlogList");
        Intrinsics.checkNotNullParameter(list1, "joinedBlogList");
        Intrinsics.checkNotNullParameter(function10, "updateScreenInfo");
        Intrinsics.checkNotNullParameter(function00, "onClickSetting");
        Intrinsics.checkNotNullParameter(function20, "onClickBlog");
        return new BlogSwitchState(blog0, blog1, list0, list1, function10, function00, function20);
    }

    public static BlogSwitchState copy$default(BlogSwitchState blogSwitchState0, Blog blog0, Blog blog1, List list0, List list1, Function1 function10, Function0 function00, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            blog0 = blogSwitchState0.a;
        }
        if((v & 2) != 0) {
            blog1 = blogSwitchState0.b;
        }
        if((v & 4) != 0) {
            list0 = blogSwitchState0.c;
        }
        if((v & 8) != 0) {
            list1 = blogSwitchState0.d;
        }
        if((v & 16) != 0) {
            function10 = blogSwitchState0.e;
        }
        if((v & 0x20) != 0) {
            function00 = blogSwitchState0.f;
        }
        if((v & 0x40) != 0) {
            function20 = blogSwitchState0.g;
        }
        return blogSwitchState0.copy(blog0, blog1, list0, list1, function10, function00, function20);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlogSwitchState)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((BlogSwitchState)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((BlogSwitchState)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((BlogSwitchState)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((BlogSwitchState)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((BlogSwitchState)object0).e)) {
            return false;
        }
        return Intrinsics.areEqual(this.f, ((BlogSwitchState)object0).f) ? Intrinsics.areEqual(this.g, ((BlogSwitchState)object0).g) : false;
    }

    @Nullable
    public final Blog getCurrentBlog() {
        return this.b;
    }

    @Nullable
    public final Blog getDefaultBlog() {
        return this.a;
    }

    @NotNull
    public final List getJoinedBlogList() {
        return this.d;
    }

    @NotNull
    public final Function2 getOnClickBlog() {
        return this.g;
    }

    @NotNull
    public final Function0 getOnClickSetting() {
        return this.f;
    }

    @NotNull
    public final List getOwnerBlogList() {
        return this.c;
    }

    @NotNull
    public final Function1 getUpdateScreenInfo() {
        return this.e;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Blog blog0 = this.b;
        if(blog0 != null) {
            v = blog0.hashCode();
        }
        return this.g.hashCode() + com.kakao.tistory.presentation.main.contract.a.a(this.f, com.kakao.tistory.presentation.main.contract.b.a(this.e, a5.b.c(this.d, a5.b.c(this.c, (v1 * 0x1F + v) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        return "BlogSwitchState(defaultBlog=" + this.a + ", currentBlog=" + this.b + ", ownerBlogList=" + this.c + ", joinedBlogList=" + this.d + ", updateScreenInfo=" + this.e + ", onClickSetting=" + this.f + ", onClickBlog=" + this.g + ")";
    }
}

