package com.kakao.tistory.presentation.screen.blog.main.contract;

import androidx.compose.runtime.Immutable;
import com.kakao.tistory.presentation.common.graph.a;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000B\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000B\u001A\u00020\u0004\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000E\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\f\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0015J\u0010\u0010\u001B\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001CJ\u0010\u0010\u001E\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001CJh\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000B\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\fH\u00C6\u0001\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b!\u0010\u0015J\u0010\u0010\"\u001A\u00020\fH\u00D6\u0001\u00A2\u0006\u0004\b\"\u0010\u001CJ\u001A\u0010%\u001A\u00020$2\b\u0010#\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010\u0013R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010\u0015R\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\u0017R\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u0019R\u0017\u0010\u000B\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b3\u0010+\u001A\u0004\b4\u0010\u0015R\u0017\u0010\r\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010\u001CR\u0017\u0010\u000E\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\b8\u00106\u001A\u0004\b9\u0010\u001CR\u0017\u0010\u000F\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\b:\u00106\u001A\u0004\b;\u0010\u001C\u00A8\u0006<"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainTopEntryItem;", "", "", "id", "", "title", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "thumbnail", "Lkotlin/Function0;", "", "onClickEntry", "permalink", "", "likeCount", "commentCount", "count", "<init>", "(JLjava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;III)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "component4", "()Lkotlin/jvm/functions/Function0;", "component5", "component6", "()I", "component7", "component8", "copy", "(JLjava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;III)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainTopEntryItem;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getId", "b", "Ljava/lang/String;", "getTitle", "c", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getThumbnail", "d", "Lkotlin/jvm/functions/Function0;", "getOnClickEntry", "e", "getPermalink", "f", "I", "getLikeCount", "g", "getCommentCount", "h", "getCount", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogMainTopEntryItem {
    public static final int $stable;
    public final long a;
    public final String b;
    public final ThumbnailUiState c;
    public final Function0 d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;

    public BlogMainTopEntryItem(long v, @NotNull String s, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, @NotNull String s1, int v1, int v2, int v3) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(function00, "onClickEntry");
        Intrinsics.checkNotNullParameter(s1, "permalink");
        super();
        this.a = v;
        this.b = s;
        this.c = thumbnailUiState0;
        this.d = function00;
        this.e = s1;
        this.f = v1;
        this.g = v2;
        this.h = v3;
    }

    public BlogMainTopEntryItem(long v, String s, ThumbnailUiState thumbnailUiState0, Function0 function00, String s1, int v1, int v2, int v3, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        Function0 function01 = (v4 & 8) == 0 ? function00 : p0.a;
        this(v, s, thumbnailUiState0, function01, s1, v1, v2, v3);
    }

    public final long component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @Nullable
    public final ThumbnailUiState component3() {
        return this.c;
    }

    @NotNull
    public final Function0 component4() {
        return this.d;
    }

    @NotNull
    public final String component5() {
        return this.e;
    }

    public final int component6() {
        return this.f;
    }

    public final int component7() {
        return this.g;
    }

    public final int component8() {
        return this.h;
    }

    @NotNull
    public final BlogMainTopEntryItem copy(long v, @NotNull String s, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, @NotNull String s1, int v1, int v2, int v3) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(function00, "onClickEntry");
        Intrinsics.checkNotNullParameter(s1, "permalink");
        return new BlogMainTopEntryItem(v, s, thumbnailUiState0, function00, s1, v1, v2, v3);
    }

    public static BlogMainTopEntryItem copy$default(BlogMainTopEntryItem blogMainTopEntryItem0, long v, String s, ThumbnailUiState thumbnailUiState0, Function0 function00, String s1, int v1, int v2, int v3, int v4, Object object0) {
        long v5 = (v4 & 1) == 0 ? v : blogMainTopEntryItem0.a;
        String s2 = (v4 & 2) == 0 ? s : blogMainTopEntryItem0.b;
        ThumbnailUiState thumbnailUiState1 = (v4 & 4) == 0 ? thumbnailUiState0 : blogMainTopEntryItem0.c;
        Function0 function01 = (v4 & 8) == 0 ? function00 : blogMainTopEntryItem0.d;
        String s3 = (v4 & 16) == 0 ? s1 : blogMainTopEntryItem0.e;
        int v6 = (v4 & 0x20) == 0 ? v1 : blogMainTopEntryItem0.f;
        int v7 = (v4 & 0x40) == 0 ? v2 : blogMainTopEntryItem0.g;
        return (v4 & 0x80) == 0 ? blogMainTopEntryItem0.copy(v5, s2, thumbnailUiState1, function01, s3, v6, v7, v3) : blogMainTopEntryItem0.copy(v5, s2, thumbnailUiState1, function01, s3, v6, v7, blogMainTopEntryItem0.h);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlogMainTopEntryItem)) {
            return false;
        }
        if(this.a != ((BlogMainTopEntryItem)object0).a) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((BlogMainTopEntryItem)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((BlogMainTopEntryItem)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((BlogMainTopEntryItem)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((BlogMainTopEntryItem)object0).e)) {
            return false;
        }
        if(this.f != ((BlogMainTopEntryItem)object0).f) {
            return false;
        }
        return this.g == ((BlogMainTopEntryItem)object0).g ? this.h == ((BlogMainTopEntryItem)object0).h : false;
    }

    public final int getCommentCount() {
        return this.g;
    }

    public final int getCount() {
        return this.h;
    }

    public final long getId() {
        return this.a;
    }

    public final int getLikeCount() {
        return this.f;
    }

    @NotNull
    public final Function0 getOnClickEntry() {
        return this.d;
    }

    @NotNull
    public final String getPermalink() {
        return this.e;
    }

    @Nullable
    public final ThumbnailUiState getThumbnail() {
        return this.c;
    }

    @NotNull
    public final String getTitle() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = a.a(this.b, Long.hashCode(this.a) * 0x1F, 0x1F);
        return this.c == null ? this.h + com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.g, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.f, a.a(this.e, com.kakao.tistory.presentation.main.contract.a.a(this.d, v * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F) : this.h + com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.g, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.f, a.a(this.e, com.kakao.tistory.presentation.main.contract.a.a(this.d, (v + this.c.hashCode()) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        return "BlogMainTopEntryItem(id=" + this.a + ", title=" + this.b + ", thumbnail=" + this.c + ", onClickEntry=" + this.d + ", permalink=" + this.e + ", likeCount=" + this.f + ", commentCount=" + this.g + ", count=" + this.h + ")";
    }
}

