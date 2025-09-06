package com.kakao.tistory.presentation.screen.blog.main.contract;

import androidx.compose.runtime.Immutable;
import com.kakao.tistory.presentation.main.contract.a;
import com.kakao.tistory.presentation.main.contract.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000FJD\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001A\u001A\u00020\u00072\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\rR\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000FR\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0011R\u001D\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010 \u001A\u0004\b&\u0010\u000F¨\u0006\'"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainNotice;", "", "", "title", "Lkotlin/Function0;", "", "onClick", "", "showMore", "onClickMore", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlin/jvm/functions/Function0;", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainNotice;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "Lkotlin/jvm/functions/Function0;", "getOnClick", "c", "Z", "getShowMore", "d", "getOnClickMore", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogMainNotice {
    public static final int $stable;
    public final String a;
    public final Function0 b;
    public final boolean c;
    public final Function0 d;

    public BlogMainNotice(@NotNull String s, @NotNull Function0 function00, boolean z, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Intrinsics.checkNotNullParameter(function01, "onClickMore");
        super();
        this.a = s;
        this.b = function00;
        this.c = z;
        this.d = function01;
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final Function0 component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    @NotNull
    public final Function0 component4() {
        return this.d;
    }

    @NotNull
    public final BlogMainNotice copy(@NotNull String s, @NotNull Function0 function00, boolean z, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Intrinsics.checkNotNullParameter(function01, "onClickMore");
        return new BlogMainNotice(s, function00, z, function01);
    }

    public static BlogMainNotice copy$default(BlogMainNotice blogMainNotice0, String s, Function0 function00, boolean z, Function0 function01, int v, Object object0) {
        if((v & 1) != 0) {
            s = blogMainNotice0.a;
        }
        if((v & 2) != 0) {
            function00 = blogMainNotice0.b;
        }
        if((v & 4) != 0) {
            z = blogMainNotice0.c;
        }
        if((v & 8) != 0) {
            function01 = blogMainNotice0.d;
        }
        return blogMainNotice0.copy(s, function00, z, function01);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlogMainNotice)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((BlogMainNotice)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((BlogMainNotice)object0).b)) {
            return false;
        }
        return this.c == ((BlogMainNotice)object0).c ? Intrinsics.areEqual(this.d, ((BlogMainNotice)object0).d) : false;
    }

    @NotNull
    public final Function0 getOnClick() {
        return this.b;
    }

    @NotNull
    public final Function0 getOnClickMore() {
        return this.d;
    }

    public final boolean getShowMore() {
        return this.c;
    }

    @NotNull
    public final String getTitle() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.d.hashCode() + c.a(this.c, a.a(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        return "BlogMainNotice(title=" + this.a + ", onClick=" + this.b + ", showMore=" + this.c + ", onClickMore=" + this.d + ")";
    }
}

