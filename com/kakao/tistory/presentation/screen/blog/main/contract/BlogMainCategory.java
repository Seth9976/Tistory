package com.kakao.tistory.presentation.screen.blog.main.contract;

import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0003\u0012\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0016\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J:\u0010\u0011\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00032\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001B\u001A\u00020\u001A2\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u000ER\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0010¨\u0006&"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategory;", "", "", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem;", "list", "current", "Lkotlin/Function0;", "", "onClickShowCategoryList", "<init>", "(Ljava/util/List;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem;Lkotlin/jvm/functions/Function0;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem;", "component3", "()Lkotlin/jvm/functions/Function0;", "copy", "(Ljava/util/List;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem;Lkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategory;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getList", "b", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem;", "getCurrent", "c", "Lkotlin/jvm/functions/Function0;", "getOnClickShowCategoryList", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogMainCategory {
    public static final int $stable;
    public final List a;
    public final BlogMainCategoryItem b;
    public final Function0 c;

    public BlogMainCategory() {
        this(null, null, null, 7, null);
    }

    public BlogMainCategory(@NotNull List list0, @NotNull BlogMainCategoryItem blogMainCategoryItem0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(list0, "list");
        Intrinsics.checkNotNullParameter(blogMainCategoryItem0, "current");
        Intrinsics.checkNotNullParameter(function00, "onClickShowCategoryList");
        super();
        this.a = list0;
        this.b = blogMainCategoryItem0;
        this.c = function00;
    }

    public BlogMainCategory(List list0, BlogMainCategoryItem blogMainCategoryItem0, Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 2) != 0) {
            blogMainCategoryItem0 = BlogMainCategoryItem.Companion.getDefault();
        }
        if((v & 4) != 0) {
            function00 = a.a;
        }
        this(list0, blogMainCategoryItem0, function00);
    }

    @NotNull
    public final List component1() {
        return this.a;
    }

    @NotNull
    public final BlogMainCategoryItem component2() {
        return this.b;
    }

    @NotNull
    public final Function0 component3() {
        return this.c;
    }

    @NotNull
    public final BlogMainCategory copy(@NotNull List list0, @NotNull BlogMainCategoryItem blogMainCategoryItem0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(list0, "list");
        Intrinsics.checkNotNullParameter(blogMainCategoryItem0, "current");
        Intrinsics.checkNotNullParameter(function00, "onClickShowCategoryList");
        return new BlogMainCategory(list0, blogMainCategoryItem0, function00);
    }

    public static BlogMainCategory copy$default(BlogMainCategory blogMainCategory0, List list0, BlogMainCategoryItem blogMainCategoryItem0, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = blogMainCategory0.a;
        }
        if((v & 2) != 0) {
            blogMainCategoryItem0 = blogMainCategory0.b;
        }
        if((v & 4) != 0) {
            function00 = blogMainCategory0.c;
        }
        return blogMainCategory0.copy(list0, blogMainCategoryItem0, function00);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlogMainCategory)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((BlogMainCategory)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((BlogMainCategory)object0).b) ? Intrinsics.areEqual(this.c, ((BlogMainCategory)object0).c) : false;
    }

    @NotNull
    public final BlogMainCategoryItem getCurrent() {
        return this.b;
    }

    @NotNull
    public final List getList() {
        return this.a;
    }

    @NotNull
    public final Function0 getOnClickShowCategoryList() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BlogMainCategory(list=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", current=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", onClickShowCategoryList=");
        return q.q(stringBuilder0, this.c, ")");
    }
}

