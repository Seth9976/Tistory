package com.kakao.tistory.presentation.screen.blog.common.contract;

import androidx.compose.runtime.Immutable;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Visibility;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.main.contract.c;
import com.kakao.tistory.presentation.screen.blog.main.contract.RestrictType;
import com.kakao.tistory.presentation.view.common.Identifiable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001E\n\u0002\u0010\u0000\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u008F\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001A\u00020\u0004\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\t\u0012\b\u0010\r\u001A\u0004\u0018\u00010\f\u0012\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E\u0012\u0010\b\u0002\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u000E\u0012\u0006\u0010\u0013\u001A\u00020\u0012\u0012\b\u0010\u0014\u001A\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001A\u00020\t\u0012\u0006\u0010\u0016\u001A\u00020\u0004\u0012\u0006\u0010\u0018\u001A\u00020\u0017\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0012\u0010\u001F\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u001EJ\u0010\u0010\"\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b$\u0010#J\u0012\u0010%\u001A\u0004\u0018\u00010\fH\u00C6\u0003\u00A2\u0006\u0004\b%\u0010&J\u0016\u0010\'\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000EH\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010(J\u0018\u0010)\u001A\n\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u000EH\u00C6\u0003\u00A2\u0006\u0004\b)\u0010(J\u0010\u0010*\u001A\u00020\u0012H\u00C6\u0003\u00A2\u0006\u0004\b*\u0010+J\u0012\u0010,\u001A\u0004\u0018\u00010\u0012H\u00C6\u0003\u00A2\u0006\u0004\b,\u0010-J\u0010\u0010.\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b.\u0010#J\u0010\u0010/\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b/\u0010\u001EJ\u0010\u00100\u001A\u00020\u0017H\u00C6\u0003\u00A2\u0006\u0004\b0\u00101J\u00B0\u0001\u00102\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001A\u00020\u00042\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\t2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E2\u0010\b\u0002\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u000E2\b\b\u0002\u0010\u0013\u001A\u00020\u00122\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001A\u00020\t2\b\b\u0002\u0010\u0016\u001A\u00020\u00042\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u00C6\u0001\u00A2\u0006\u0004\b2\u00103J\u0010\u00104\u001A\u00020\tH\u00D6\u0001\u00A2\u0006\u0004\b4\u0010#J\u0010\u00105\u001A\u00020\u0012H\u00D6\u0001\u00A2\u0006\u0004\b5\u0010+J\u001A\u00108\u001A\u00020\u00042\b\u00107\u001A\u0004\u0018\u000106H\u00D6\u0003\u00A2\u0006\u0004\b8\u00109R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b>\u0010?\u001A\u0004\b\u0005\u0010\u001ER\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b@\u0010A\u001A\u0004\bB\u0010 R\u0017\u0010\b\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bC\u0010?\u001A\u0004\b\b\u0010\u001ER\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010#R\u0017\u0010\u000B\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\bG\u0010E\u001A\u0004\bH\u0010#R\u0019\u0010\r\u001A\u0004\u0018\u00010\f8\u0006\u00A2\u0006\f\n\u0004\bI\u0010J\u001A\u0004\bK\u0010&R\u001D\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E8\u0006\u00A2\u0006\f\n\u0004\bL\u0010M\u001A\u0004\bN\u0010(R\u001F\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u000E8\u0006\u00A2\u0006\f\n\u0004\bO\u0010M\u001A\u0004\bP\u0010(R\u0017\u0010\u0013\u001A\u00020\u00128\u0006\u00A2\u0006\f\n\u0004\bQ\u0010R\u001A\u0004\bS\u0010+R\u0019\u0010\u0014\u001A\u0004\u0018\u00010\u00128\u0006\u00A2\u0006\f\n\u0004\bT\u0010U\u001A\u0004\bV\u0010-R\u0017\u0010\u0015\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\bW\u0010E\u001A\u0004\bX\u0010#R\u0017\u0010\u0016\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bY\u0010?\u001A\u0004\bZ\u0010\u001ER\u0017\u0010\u0018\u001A\u00020\u00178\u0006\u00A2\u0006\f\n\u0004\b[\u0010\\\u001A\u0004\b]\u00101\u00A8\u0006^"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEntry;", "Lcom/kakao/tistory/presentation/view/common/Identifiable;", "", "id", "", "isMyBlog", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/RestrictType;", "restrictType", "isChallenge", "", "title", "summary", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "thumbnail", "Lkotlin/Function0;", "", "onClickEntry", "onLongClickEntry", "", "likeCount", "commentCount", "publishedDate", "scheduled", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Visibility;", "visibility", "<init>", "(JZLcom/kakao/tistory/presentation/screen/blog/main/contract/RestrictType;ZLjava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Integer;Ljava/lang/String;ZLcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Visibility;)V", "component1", "()J", "component2", "()Z", "component3", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/RestrictType;", "component4", "component5", "()Ljava/lang/String;", "component6", "component7", "()Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "component8", "()Lkotlin/jvm/functions/Function0;", "component9", "component10", "()I", "component11", "()Ljava/lang/Integer;", "component12", "component13", "component14", "()Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Visibility;", "copy", "(JZLcom/kakao/tistory/presentation/screen/blog/main/contract/RestrictType;ZLjava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Integer;Ljava/lang/String;ZLcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Visibility;)Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEntry;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getId", "()Ljava/lang/Long;", "b", "Z", "c", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/RestrictType;", "getRestrictType", "d", "e", "Ljava/lang/String;", "getTitle", "f", "getSummary", "g", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getThumbnail", "h", "Lkotlin/jvm/functions/Function0;", "getOnClickEntry", "i", "getOnLongClickEntry", "j", "I", "getLikeCount", "k", "Ljava/lang/Integer;", "getCommentCount", "l", "getPublishedDate", "m", "getScheduled", "n", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Visibility;", "getVisibility", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogEntry implements Identifiable {
    public static final int $stable;
    public final long a;
    public final boolean b;
    public final RestrictType c;
    public final boolean d;
    public final String e;
    public final String f;
    public final ThumbnailUiState g;
    public final Function0 h;
    public final Function0 i;
    public final int j;
    public final Integer k;
    public final String l;
    public final boolean m;
    public final Visibility n;

    public BlogEntry(long v, boolean z, @Nullable RestrictType restrictType0, boolean z1, @NotNull String s, @NotNull String s1, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, @Nullable Function0 function01, int v1, @Nullable Integer integer0, @NotNull String s2, boolean z2, @NotNull Visibility entryListUiState$Visibility0) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(s1, "summary");
        Intrinsics.checkNotNullParameter(function00, "onClickEntry");
        Intrinsics.checkNotNullParameter(s2, "publishedDate");
        Intrinsics.checkNotNullParameter(entryListUiState$Visibility0, "visibility");
        super();
        this.a = v;
        this.b = z;
        this.c = restrictType0;
        this.d = z1;
        this.e = s;
        this.f = s1;
        this.g = thumbnailUiState0;
        this.h = function00;
        this.i = function01;
        this.j = v1;
        this.k = integer0;
        this.l = s2;
        this.m = z2;
        this.n = entryListUiState$Visibility0;
    }

    public BlogEntry(long v, boolean z, RestrictType restrictType0, boolean z1, String s, String s1, ThumbnailUiState thumbnailUiState0, Function0 function00, Function0 function01, int v1, Integer integer0, String s2, boolean z2, Visibility entryListUiState$Visibility0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        Function0 function02 = (v2 & 0x80) == 0 ? function00 : b.a;
        this(v, z, restrictType0, z1, s, s1, thumbnailUiState0, function02, ((v2 & 0x100) == 0 ? function01 : null), v1, integer0, s2, z2, entryListUiState$Visibility0);
    }

    public final long component1() {
        return this.a;
    }

    public final int component10() {
        return this.j;
    }

    @Nullable
    public final Integer component11() {
        return this.k;
    }

    @NotNull
    public final String component12() {
        return this.l;
    }

    public final boolean component13() {
        return this.m;
    }

    @NotNull
    public final Visibility component14() {
        return this.n;
    }

    public final boolean component2() {
        return this.b;
    }

    @Nullable
    public final RestrictType component3() {
        return this.c;
    }

    public final boolean component4() {
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
    public final Function0 component8() {
        return this.h;
    }

    @Nullable
    public final Function0 component9() {
        return this.i;
    }

    @NotNull
    public final BlogEntry copy(long v, boolean z, @Nullable RestrictType restrictType0, boolean z1, @NotNull String s, @NotNull String s1, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, @Nullable Function0 function01, int v1, @Nullable Integer integer0, @NotNull String s2, boolean z2, @NotNull Visibility entryListUiState$Visibility0) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(s1, "summary");
        Intrinsics.checkNotNullParameter(function00, "onClickEntry");
        Intrinsics.checkNotNullParameter(s2, "publishedDate");
        Intrinsics.checkNotNullParameter(entryListUiState$Visibility0, "visibility");
        return new BlogEntry(v, z, restrictType0, z1, s, s1, thumbnailUiState0, function00, function01, v1, integer0, s2, z2, entryListUiState$Visibility0);
    }

    public static BlogEntry copy$default(BlogEntry blogEntry0, long v, boolean z, RestrictType restrictType0, boolean z1, String s, String s1, ThumbnailUiState thumbnailUiState0, Function0 function00, Function0 function01, int v1, Integer integer0, String s2, boolean z2, Visibility entryListUiState$Visibility0, int v2, Object object0) {
        long v3 = (v2 & 1) == 0 ? v : blogEntry0.a;
        boolean z3 = (v2 & 2) == 0 ? z : blogEntry0.b;
        RestrictType restrictType1 = (v2 & 4) == 0 ? restrictType0 : blogEntry0.c;
        boolean z4 = (v2 & 8) == 0 ? z1 : blogEntry0.d;
        String s3 = (v2 & 16) == 0 ? s : blogEntry0.e;
        String s4 = (v2 & 0x20) == 0 ? s1 : blogEntry0.f;
        ThumbnailUiState thumbnailUiState1 = (v2 & 0x40) == 0 ? thumbnailUiState0 : blogEntry0.g;
        Function0 function02 = (v2 & 0x80) == 0 ? function00 : blogEntry0.h;
        Function0 function03 = (v2 & 0x100) == 0 ? function01 : blogEntry0.i;
        int v4 = (v2 & 0x200) == 0 ? v1 : blogEntry0.j;
        Integer integer1 = (v2 & 0x400) == 0 ? integer0 : blogEntry0.k;
        String s5 = (v2 & 0x800) == 0 ? s2 : blogEntry0.l;
        boolean z5 = (v2 & 0x1000) == 0 ? z2 : blogEntry0.m;
        return (v2 & 0x2000) == 0 ? blogEntry0.copy(v3, z3, restrictType1, z4, s3, s4, thumbnailUiState1, function02, function03, v4, integer1, s5, z5, entryListUiState$Visibility0) : blogEntry0.copy(v3, z3, restrictType1, z4, s3, s4, thumbnailUiState1, function02, function03, v4, integer1, s5, z5, blogEntry0.n);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlogEntry)) {
            return false;
        }
        if(this.a != ((BlogEntry)object0).a) {
            return false;
        }
        if(this.b != ((BlogEntry)object0).b) {
            return false;
        }
        if(this.c != ((BlogEntry)object0).c) {
            return false;
        }
        if(this.d != ((BlogEntry)object0).d) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((BlogEntry)object0).e)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((BlogEntry)object0).f)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((BlogEntry)object0).g)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.h, ((BlogEntry)object0).h)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.i, ((BlogEntry)object0).i)) {
            return false;
        }
        if(this.j != ((BlogEntry)object0).j) {
            return false;
        }
        if(!Intrinsics.areEqual(this.k, ((BlogEntry)object0).k)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.l, ((BlogEntry)object0).l)) {
            return false;
        }
        return this.m == ((BlogEntry)object0).m ? this.n == ((BlogEntry)object0).n : false;
    }

    @Nullable
    public final Integer getCommentCount() {
        return this.k;
    }

    @NotNull
    public Long getId() {
        return this.a;
    }

    @Override  // com.kakao.tistory.presentation.view.common.Identifiable
    public Object getId() {
        return this.getId();
    }

    public final int getLikeCount() {
        return this.j;
    }

    @NotNull
    public final Function0 getOnClickEntry() {
        return this.h;
    }

    @Nullable
    public final Function0 getOnLongClickEntry() {
        return this.i;
    }

    @NotNull
    public final String getPublishedDate() {
        return this.l;
    }

    @Nullable
    public final RestrictType getRestrictType() {
        return this.c;
    }

    public final boolean getScheduled() {
        return this.m;
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

    @NotNull
    public final Visibility getVisibility() {
        return this.n;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = a.a(this.j, (com.kakao.tistory.presentation.main.contract.a.a(this.h, (com.kakao.tistory.presentation.common.graph.a.a(this.f, com.kakao.tistory.presentation.common.graph.a.a(this.e, c.a(this.d, (c.a(this.b, Long.hashCode(this.a) * 0x1F, 0x1F) + (this.c == null ? 0 : this.c.hashCode())) * 0x1F, 0x1F), 0x1F), 0x1F) + (this.g == null ? 0 : this.g.hashCode())) * 0x1F, 0x1F) + (this.i == null ? 0 : this.i.hashCode())) * 0x1F, 0x1F);
        Integer integer0 = this.k;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return this.n.hashCode() + c.a(this.m, com.kakao.tistory.presentation.common.graph.a.a(this.l, (v1 + v) * 0x1F, 0x1F), 0x1F);
    }

    public final boolean isChallenge() {
        return this.d;
    }

    public final boolean isMyBlog() {
        return this.b;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BlogEntry(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", isMyBlog=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", restrictType=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", isChallenge=");
        stringBuilder0.append(this.d);
        androidx.room.a.w(stringBuilder0, ", title=", this.e, ", summary=", this.f);
        stringBuilder0.append(", thumbnail=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", onClickEntry=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", onLongClickEntry=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", likeCount=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", commentCount=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", publishedDate=");
        stringBuilder0.append(this.l);
        stringBuilder0.append(", scheduled=");
        stringBuilder0.append(this.m);
        stringBuilder0.append(", visibility=");
        stringBuilder0.append(this.n);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

