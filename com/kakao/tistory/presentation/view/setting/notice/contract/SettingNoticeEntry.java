package com.kakao.tistory.presentation.view.setting.notice.contract;

import androidx.compose.runtime.Immutable;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Visibility;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.main.contract.c;
import com.kakao.tistory.presentation.screen.blog.main.contract.RestrictType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b<\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\r\u001A\u00020\u000B\u0012\u0006\u0010\u000E\u001A\u00020\u0006\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u0012\u000E\b\u0002\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00140\u0013\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001A\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001DJ\u0012\u0010\u001F\u001A\u0004\u0018\u00010\tH\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010\u001DJ\u0010\u0010%\u001A\u00020\u000FH\u00C6\u0003\u00A2\u0006\u0004\b%\u0010&J\u0010\u0010\'\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010(J\u0016\u0010)\u001A\b\u0012\u0004\u0012\u00020\u00140\u0013H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010*J\u0088\u0001\u0010+\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\u00062\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u0012\u001A\u00020\u00112\u000E\b\u0002\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00140\u0013H\u00C6\u0001\u00A2\u0006\u0004\b+\u0010,J\u0010\u0010-\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\b-\u0010\u001DJ\u0010\u0010.\u001A\u00020\u000BH\u00D6\u0001\u00A2\u0006\u0004\b.\u0010\"J\u001A\u00100\u001A\u00020\u000F2\b\u0010/\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u0010\u0019R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010\u001BR\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010\u001DR\u0017\u0010\b\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b;\u00109\u001A\u0004\b<\u0010\u001DR\u0019\u0010\n\u001A\u0004\u0018\u00010\t8\u0006\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010 R\u0017\u0010\f\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\b@\u0010A\u001A\u0004\bB\u0010\"R\u0017\u0010\r\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\bC\u0010A\u001A\u0004\bD\u0010\"R\u0017\u0010\u000E\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bE\u00109\u001A\u0004\bF\u0010\u001DR\u0017\u0010\u0010\u001A\u00020\u000F8\u0006\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010&R\u0017\u0010\u0012\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010(R\u001D\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006\u00A2\u0006\f\n\u0004\bM\u0010N\u001A\u0004\bO\u0010*\u00A8\u0006P"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeEntry;", "", "", "id", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/RestrictType;", "restrictType", "", "title", "summary", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "thumbnail", "", "likeCount", "commentCount", "publishedDate", "", "scheduled", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Visibility;", "visibility", "Lkotlin/Function0;", "", "onClickEntry", "<init>", "(JLcom/kakao/tistory/presentation/screen/blog/main/contract/RestrictType;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;IILjava/lang/String;ZLcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Visibility;Lkotlin/jvm/functions/Function0;)V", "component1", "()J", "component2", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/RestrictType;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "component6", "()I", "component7", "component8", "component9", "()Z", "component10", "()Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Visibility;", "component11", "()Lkotlin/jvm/functions/Function0;", "copy", "(JLcom/kakao/tistory/presentation/screen/blog/main/contract/RestrictType;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;IILjava/lang/String;ZLcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Visibility;Lkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/view/setting/notice/contract/SettingNoticeEntry;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getId", "b", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/RestrictType;", "getRestrictType", "c", "Ljava/lang/String;", "getTitle", "d", "getSummary", "e", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getThumbnail", "f", "I", "getLikeCount", "g", "getCommentCount", "h", "getPublishedDate", "i", "Z", "getScheduled", "j", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Visibility;", "getVisibility", "k", "Lkotlin/jvm/functions/Function0;", "getOnClickEntry", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SettingNoticeEntry {
    public static final int $stable;
    public final long a;
    public final RestrictType b;
    public final String c;
    public final String d;
    public final ThumbnailUiState e;
    public final int f;
    public final int g;
    public final String h;
    public final boolean i;
    public final Visibility j;
    public final Function0 k;

    public SettingNoticeEntry(long v, @Nullable RestrictType restrictType0, @NotNull String s, @NotNull String s1, @Nullable ThumbnailUiState thumbnailUiState0, int v1, int v2, @NotNull String s2, boolean z, @NotNull Visibility entryListUiState$Visibility0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(s1, "summary");
        Intrinsics.checkNotNullParameter(s2, "publishedDate");
        Intrinsics.checkNotNullParameter(entryListUiState$Visibility0, "visibility");
        Intrinsics.checkNotNullParameter(function00, "onClickEntry");
        super();
        this.a = v;
        this.b = restrictType0;
        this.c = s;
        this.d = s1;
        this.e = thumbnailUiState0;
        this.f = v1;
        this.g = v2;
        this.h = s2;
        this.i = z;
        this.j = entryListUiState$Visibility0;
        this.k = function00;
    }

    public SettingNoticeEntry(long v, RestrictType restrictType0, String s, String s1, ThumbnailUiState thumbnailUiState0, int v1, int v2, String s2, boolean z, Visibility entryListUiState$Visibility0, Function0 function00, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        Function0 function01 = (v3 & 0x400) == 0 ? function00 : a.a;
        this(v, restrictType0, s, s1, thumbnailUiState0, v1, v2, s2, z, entryListUiState$Visibility0, function01);
    }

    public final long component1() {
        return this.a;
    }

    @NotNull
    public final Visibility component10() {
        return this.j;
    }

    @NotNull
    public final Function0 component11() {
        return this.k;
    }

    @Nullable
    public final RestrictType component2() {
        return this.b;
    }

    @NotNull
    public final String component3() {
        return this.c;
    }

    @NotNull
    public final String component4() {
        return this.d;
    }

    @Nullable
    public final ThumbnailUiState component5() {
        return this.e;
    }

    public final int component6() {
        return this.f;
    }

    public final int component7() {
        return this.g;
    }

    @NotNull
    public final String component8() {
        return this.h;
    }

    public final boolean component9() {
        return this.i;
    }

    @NotNull
    public final SettingNoticeEntry copy(long v, @Nullable RestrictType restrictType0, @NotNull String s, @NotNull String s1, @Nullable ThumbnailUiState thumbnailUiState0, int v1, int v2, @NotNull String s2, boolean z, @NotNull Visibility entryListUiState$Visibility0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(s1, "summary");
        Intrinsics.checkNotNullParameter(s2, "publishedDate");
        Intrinsics.checkNotNullParameter(entryListUiState$Visibility0, "visibility");
        Intrinsics.checkNotNullParameter(function00, "onClickEntry");
        return new SettingNoticeEntry(v, restrictType0, s, s1, thumbnailUiState0, v1, v2, s2, z, entryListUiState$Visibility0, function00);
    }

    public static SettingNoticeEntry copy$default(SettingNoticeEntry settingNoticeEntry0, long v, RestrictType restrictType0, String s, String s1, ThumbnailUiState thumbnailUiState0, int v1, int v2, String s2, boolean z, Visibility entryListUiState$Visibility0, Function0 function00, int v3, Object object0) {
        long v4 = (v3 & 1) == 0 ? v : settingNoticeEntry0.a;
        RestrictType restrictType1 = (v3 & 2) == 0 ? restrictType0 : settingNoticeEntry0.b;
        String s3 = (v3 & 4) == 0 ? s : settingNoticeEntry0.c;
        String s4 = (v3 & 8) == 0 ? s1 : settingNoticeEntry0.d;
        ThumbnailUiState thumbnailUiState1 = (v3 & 16) == 0 ? thumbnailUiState0 : settingNoticeEntry0.e;
        int v5 = (v3 & 0x20) == 0 ? v1 : settingNoticeEntry0.f;
        int v6 = (v3 & 0x40) == 0 ? v2 : settingNoticeEntry0.g;
        String s5 = (v3 & 0x80) == 0 ? s2 : settingNoticeEntry0.h;
        boolean z1 = (v3 & 0x100) == 0 ? z : settingNoticeEntry0.i;
        Visibility entryListUiState$Visibility1 = (v3 & 0x200) == 0 ? entryListUiState$Visibility0 : settingNoticeEntry0.j;
        return (v3 & 0x400) == 0 ? settingNoticeEntry0.copy(v4, restrictType1, s3, s4, thumbnailUiState1, v5, v6, s5, z1, entryListUiState$Visibility1, function00) : settingNoticeEntry0.copy(v4, restrictType1, s3, s4, thumbnailUiState1, v5, v6, s5, z1, entryListUiState$Visibility1, settingNoticeEntry0.k);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SettingNoticeEntry)) {
            return false;
        }
        if(this.a != ((SettingNoticeEntry)object0).a) {
            return false;
        }
        if(this.b != ((SettingNoticeEntry)object0).b) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((SettingNoticeEntry)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((SettingNoticeEntry)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((SettingNoticeEntry)object0).e)) {
            return false;
        }
        if(this.f != ((SettingNoticeEntry)object0).f) {
            return false;
        }
        if(this.g != ((SettingNoticeEntry)object0).g) {
            return false;
        }
        if(!Intrinsics.areEqual(this.h, ((SettingNoticeEntry)object0).h)) {
            return false;
        }
        if(this.i != ((SettingNoticeEntry)object0).i) {
            return false;
        }
        return this.j == ((SettingNoticeEntry)object0).j ? Intrinsics.areEqual(this.k, ((SettingNoticeEntry)object0).k) : false;
    }

    public final int getCommentCount() {
        return this.g;
    }

    public final long getId() {
        return this.a;
    }

    public final int getLikeCount() {
        return this.f;
    }

    @NotNull
    public final Function0 getOnClickEntry() {
        return this.k;
    }

    @NotNull
    public final String getPublishedDate() {
        return this.h;
    }

    @Nullable
    public final RestrictType getRestrictType() {
        return this.b;
    }

    public final boolean getScheduled() {
        return this.i;
    }

    @NotNull
    public final String getSummary() {
        return this.d;
    }

    @Nullable
    public final ThumbnailUiState getThumbnail() {
        return this.e;
    }

    @NotNull
    public final String getTitle() {
        return this.c;
    }

    @NotNull
    public final Visibility getVisibility() {
        return this.j;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = com.kakao.tistory.presentation.common.graph.a.a(this.d, com.kakao.tistory.presentation.common.graph.a.a(this.c, (Long.hashCode(this.a) * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F, 0x1F), 0x1F);
        ThumbnailUiState thumbnailUiState0 = this.e;
        if(thumbnailUiState0 != null) {
            v = thumbnailUiState0.hashCode();
        }
        return this.k.hashCode() + (this.j.hashCode() + c.a(this.i, com.kakao.tistory.presentation.common.graph.a.a(this.h, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.g, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.f, (v1 + v) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F)) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SettingNoticeEntry(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", restrictType=");
        stringBuilder0.append(this.b);
        androidx.room.a.w(stringBuilder0, ", title=", this.c, ", summary=", this.d);
        stringBuilder0.append(", thumbnail=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", likeCount=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", commentCount=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", publishedDate=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", scheduled=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", visibility=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", onClickEntry=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

