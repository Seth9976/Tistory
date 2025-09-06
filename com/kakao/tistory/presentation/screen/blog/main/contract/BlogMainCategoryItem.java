package com.kakao.tistory.presentation.screen.blog.main.contract;

import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Immutable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0013\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00010BA\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00000\u000B\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u001C\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00000\u000BH\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u0014\b\u0002\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b2\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00000\u000BH\u00C6\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b\u001B\u0010\u0012J\u0010\u0010\u001C\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u001C\u0010\u0010J\u001A\u0010\u001F\u001A\u00020\u001E2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b\u001F\u0010 R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010\u0010R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\u0012R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010\u0014R#\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b8\u0006\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010\u0016R\u001D\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00000\u000B8\u0006\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\u0018\u00A8\u00061"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem;", "", "", "id", "", "name", "", "count", "Lkotlin/Function1;", "", "onClick", "", "subCategoryList", "<init>", "(ILjava/lang/String;JLkotlin/jvm/functions/Function1;Ljava/util/List;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()J", "component4", "()Lkotlin/jvm/functions/Function1;", "component5", "()Ljava/util/List;", "copy", "(ILjava/lang/String;JLkotlin/jvm/functions/Function1;Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getId", "b", "Ljava/lang/String;", "getName", "c", "J", "getCount", "d", "Lkotlin/jvm/functions/Function1;", "getOnClick", "e", "Ljava/util/List;", "getSubCategoryList", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogMainCategoryItem {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem$Companion;", "", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem;", "Default", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem;", "getDefault", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final BlogMainCategoryItem getDefault() {
            return BlogMainCategoryItem.f;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final int a;
    public final String b;
    public final long c;
    public final Function1 d;
    public final List e;
    public static final BlogMainCategoryItem f;

    static {
        BlogMainCategoryItem.Companion = new Companion(null);
        BlogMainCategoryItem.f = new BlogMainCategoryItem(-3, "", 0L, b.a, CollectionsKt__CollectionsKt.emptyList());
    }

    public BlogMainCategoryItem(int v, @NotNull String s, long v1, @NotNull Function1 function10, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(function10, "onClick");
        Intrinsics.checkNotNullParameter(list0, "subCategoryList");
        super();
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = function10;
        this.e = list0;
    }

    public final int component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    public final long component3() {
        return this.c;
    }

    @NotNull
    public final Function1 component4() {
        return this.d;
    }

    @NotNull
    public final List component5() {
        return this.e;
    }

    @NotNull
    public final BlogMainCategoryItem copy(int v, @NotNull String s, long v1, @NotNull Function1 function10, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(function10, "onClick");
        Intrinsics.checkNotNullParameter(list0, "subCategoryList");
        return new BlogMainCategoryItem(v, s, v1, function10, list0);
    }

    public static BlogMainCategoryItem copy$default(BlogMainCategoryItem blogMainCategoryItem0, int v, String s, long v1, Function1 function10, List list0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = blogMainCategoryItem0.a;
        }
        if((v2 & 2) != 0) {
            s = blogMainCategoryItem0.b;
        }
        if((v2 & 4) != 0) {
            v1 = blogMainCategoryItem0.c;
        }
        if((v2 & 8) != 0) {
            function10 = blogMainCategoryItem0.d;
        }
        if((v2 & 16) != 0) {
            list0 = blogMainCategoryItem0.e;
        }
        return blogMainCategoryItem0.copy(v, s, v1, function10, list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlogMainCategoryItem)) {
            return false;
        }
        if(this.a != ((BlogMainCategoryItem)object0).a) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((BlogMainCategoryItem)object0).b)) {
            return false;
        }
        if(this.c != ((BlogMainCategoryItem)object0).c) {
            return false;
        }
        return Intrinsics.areEqual(this.d, ((BlogMainCategoryItem)object0).d) ? Intrinsics.areEqual(this.e, ((BlogMainCategoryItem)object0).e) : false;
    }

    public final long getCount() {
        return this.c;
    }

    public final int getId() {
        return this.a;
    }

    @NotNull
    public final String getName() {
        return this.b;
    }

    @NotNull
    public final Function1 getOnClick() {
        return this.d;
    }

    @NotNull
    public final List getSubCategoryList() {
        return this.e;
    }

    @Override
    public int hashCode() {
        return this.e.hashCode() + com.kakao.tistory.presentation.main.contract.b.a(this.d, a.k(this.c, com.kakao.tistory.presentation.common.graph.a.a(this.b, this.a * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        return "BlogMainCategoryItem(id=" + this.a + ", name=" + this.b + ", count=" + this.c + ", onClick=" + this.d + ", subCategoryList=" + this.e + ")";
    }
}

