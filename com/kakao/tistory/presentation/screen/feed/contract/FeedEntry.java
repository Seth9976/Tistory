package com.kakao.tistory.presentation.screen.feed.contract;

import androidx.compose.runtime.Immutable;
import com.kakao.tistory.presentation.common.graph.a;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.main.contract.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001C\n\u0002\u0010\u000B\n\u0002\b\u001F\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000B\u001A\u00020\u0006\u0012\u0006\u0010\f\u001A\u00020\u0006\u0012\b\u0010\r\u001A\u0004\u0018\u00010\u0004\u0012\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\t0\u000E\u0012\u0006\u0010\u0011\u001A\u00020\u000F\u0012\u0006\u0010\u0012\u001A\u00020\u000F\u0012\u0006\u0010\u0013\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0016\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001BJ\u0010\u0010\u001F\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u001BJ\u0012\u0010 \u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u0019J\u001C\u0010!\u001A\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\t0\u000EH\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\u000FH\u00C6\u0003\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u000FH\u00C6\u0003\u00A2\u0006\u0004\b%\u0010$J\u0010\u0010&\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\u001BJ\u0094\u0001\u0010\'\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000B\u001A\u00020\u00062\b\b\u0002\u0010\f\u001A\u00020\u00062\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\t0\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u000F2\b\b\u0002\u0010\u0012\u001A\u00020\u000F2\b\b\u0002\u0010\u0013\u001A\u00020\u0006H\u00C6\u0001\u00A2\u0006\u0004\b\'\u0010(J\u0010\u0010)\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\b)\u0010\u001BJ\u0010\u0010*\u001A\u00020\u000FH\u00D6\u0001\u00A2\u0006\u0004\b*\u0010$J\u001A\u0010-\u001A\u00020,2\b\u0010+\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u0017R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u0010\u0019R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010\u001BR\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0006\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010\u001DR\u0017\u0010\u000B\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b;\u00106\u001A\u0004\b<\u0010\u001BR\u0017\u0010\f\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b=\u00106\u001A\u0004\b>\u0010\u001BR\u0019\u0010\r\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b?\u00103\u001A\u0004\b@\u0010\u0019R#\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\t0\u000E8\u0006\u00A2\u0006\f\n\u0004\bA\u0010B\u001A\u0004\bC\u0010\"R\u0017\u0010\u0011\u001A\u00020\u000F8\u0006\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010$R\u0017\u0010\u0012\u001A\u00020\u000F8\u0006\u00A2\u0006\f\n\u0004\bG\u0010E\u001A\u0004\bH\u0010$R\u0017\u0010\u0013\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bI\u00106\u001A\u0004\bJ\u0010\u001B\u00A8\u0006K"}, d2 = {"Lcom/kakao/tistory/presentation/screen/feed/contract/FeedEntry;", "", "", "id", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "blogImage", "", "blogTitle", "Lkotlin/Function0;", "", "onClickBlog", "title", "summary", "thumbnail", "Lkotlin/Function1;", "", "onClickEntryWithIndex", "likeCount", "commentCount", "publishedDate", "<init>", "(JLcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function1;IILjava/lang/String;)V", "component1", "()J", "component2", "()Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "component3", "()Ljava/lang/String;", "component4", "()Lkotlin/jvm/functions/Function0;", "component5", "component6", "component7", "component8", "()Lkotlin/jvm/functions/Function1;", "component9", "()I", "component10", "component11", "copy", "(JLcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function1;IILjava/lang/String;)Lcom/kakao/tistory/presentation/screen/feed/contract/FeedEntry;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getId", "b", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getBlogImage", "c", "Ljava/lang/String;", "getBlogTitle", "d", "Lkotlin/jvm/functions/Function0;", "getOnClickBlog", "e", "getTitle", "f", "getSummary", "g", "getThumbnail", "h", "Lkotlin/jvm/functions/Function1;", "getOnClickEntryWithIndex", "i", "I", "getLikeCount", "j", "getCommentCount", "k", "getPublishedDate", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FeedEntry {
    public static final int $stable;
    public final long a;
    public final ThumbnailUiState b;
    public final String c;
    public final Function0 d;
    public final String e;
    public final String f;
    public final ThumbnailUiState g;
    public final Function1 h;
    public final int i;
    public final int j;
    public final String k;

    public FeedEntry(long v, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull String s, @NotNull Function0 function00, @NotNull String s1, @NotNull String s2, @Nullable ThumbnailUiState thumbnailUiState1, @NotNull Function1 function10, int v1, int v2, @NotNull String s3) {
        Intrinsics.checkNotNullParameter(s, "blogTitle");
        Intrinsics.checkNotNullParameter(function00, "onClickBlog");
        Intrinsics.checkNotNullParameter(s1, "title");
        Intrinsics.checkNotNullParameter(s2, "summary");
        Intrinsics.checkNotNullParameter(function10, "onClickEntryWithIndex");
        Intrinsics.checkNotNullParameter(s3, "publishedDate");
        super();
        this.a = v;
        this.b = thumbnailUiState0;
        this.c = s;
        this.d = function00;
        this.e = s1;
        this.f = s2;
        this.g = thumbnailUiState1;
        this.h = function10;
        this.i = v1;
        this.j = v2;
        this.k = s3;
    }

    public final long component1() {
        return this.a;
    }

    public final int component10() {
        return this.j;
    }

    @NotNull
    public final String component11() {
        return this.k;
    }

    @Nullable
    public final ThumbnailUiState component2() {
        return this.b;
    }

    @NotNull
    public final String component3() {
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

    @NotNull
    public final String component6() {
        return this.f;
    }

    @Nullable
    public final ThumbnailUiState component7() {
        return this.g;
    }

    @NotNull
    public final Function1 component8() {
        return this.h;
    }

    public final int component9() {
        return this.i;
    }

    @NotNull
    public final FeedEntry copy(long v, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull String s, @NotNull Function0 function00, @NotNull String s1, @NotNull String s2, @Nullable ThumbnailUiState thumbnailUiState1, @NotNull Function1 function10, int v1, int v2, @NotNull String s3) {
        Intrinsics.checkNotNullParameter(s, "blogTitle");
        Intrinsics.checkNotNullParameter(function00, "onClickBlog");
        Intrinsics.checkNotNullParameter(s1, "title");
        Intrinsics.checkNotNullParameter(s2, "summary");
        Intrinsics.checkNotNullParameter(function10, "onClickEntryWithIndex");
        Intrinsics.checkNotNullParameter(s3, "publishedDate");
        return new FeedEntry(v, thumbnailUiState0, s, function00, s1, s2, thumbnailUiState1, function10, v1, v2, s3);
    }

    public static FeedEntry copy$default(FeedEntry feedEntry0, long v, ThumbnailUiState thumbnailUiState0, String s, Function0 function00, String s1, String s2, ThumbnailUiState thumbnailUiState1, Function1 function10, int v1, int v2, String s3, int v3, Object object0) {
        long v4 = (v3 & 1) == 0 ? v : feedEntry0.a;
        ThumbnailUiState thumbnailUiState2 = (v3 & 2) == 0 ? thumbnailUiState0 : feedEntry0.b;
        String s4 = (v3 & 4) == 0 ? s : feedEntry0.c;
        Function0 function01 = (v3 & 8) == 0 ? function00 : feedEntry0.d;
        String s5 = (v3 & 16) == 0 ? s1 : feedEntry0.e;
        String s6 = (v3 & 0x20) == 0 ? s2 : feedEntry0.f;
        ThumbnailUiState thumbnailUiState3 = (v3 & 0x40) == 0 ? thumbnailUiState1 : feedEntry0.g;
        Function1 function11 = (v3 & 0x80) == 0 ? function10 : feedEntry0.h;
        int v5 = (v3 & 0x100) == 0 ? v1 : feedEntry0.i;
        int v6 = (v3 & 0x200) == 0 ? v2 : feedEntry0.j;
        return (v3 & 0x400) == 0 ? feedEntry0.copy(v4, thumbnailUiState2, s4, function01, s5, s6, thumbnailUiState3, function11, v5, v6, s3) : feedEntry0.copy(v4, thumbnailUiState2, s4, function01, s5, s6, thumbnailUiState3, function11, v5, v6, feedEntry0.k);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FeedEntry)) {
            return false;
        }
        if(this.a != ((FeedEntry)object0).a) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((FeedEntry)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((FeedEntry)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((FeedEntry)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((FeedEntry)object0).e)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((FeedEntry)object0).f)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((FeedEntry)object0).g)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.h, ((FeedEntry)object0).h)) {
            return false;
        }
        if(this.i != ((FeedEntry)object0).i) {
            return false;
        }
        return this.j == ((FeedEntry)object0).j ? Intrinsics.areEqual(this.k, ((FeedEntry)object0).k) : false;
    }

    @Nullable
    public final ThumbnailUiState getBlogImage() {
        return this.b;
    }

    @NotNull
    public final String getBlogTitle() {
        return this.c;
    }

    public final int getCommentCount() {
        return this.j;
    }

    public final long getId() {
        return this.a;
    }

    public final int getLikeCount() {
        return this.i;
    }

    @NotNull
    public final Function0 getOnClickBlog() {
        return this.d;
    }

    @NotNull
    public final Function1 getOnClickEntryWithIndex() {
        return this.h;
    }

    @NotNull
    public final String getPublishedDate() {
        return this.k;
    }

    @NotNull
    public final String getSummary() {
        return this.f;
    }

    @Nullable
    public final ThumbnailUiState getThumbnail() {
        return this.g;
    }

    @NotNull
    public final String getTitle() {
        return this.e;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = a.a(this.f, a.a(this.e, com.kakao.tistory.presentation.main.contract.a.a(this.d, a.a(this.c, (Long.hashCode(this.a) * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
        ThumbnailUiState thumbnailUiState0 = this.g;
        if(thumbnailUiState0 != null) {
            v = thumbnailUiState0.hashCode();
        }
        return this.k.hashCode() + com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.j, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.i, b.a(this.h, (v1 + v) * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("FeedEntry(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", blogImage=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", blogTitle=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", onClickBlog=");
        stringBuilder0.append(this.d);
        androidx.room.a.w(stringBuilder0, ", title=", this.e, ", summary=", this.f);
        stringBuilder0.append(", thumbnail=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", onClickEntryWithIndex=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", likeCount=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", commentCount=");
        stringBuilder0.append(this.j);
        return a5.b.q(stringBuilder0, ", publishedDate=", this.k, ")");
    }
}

