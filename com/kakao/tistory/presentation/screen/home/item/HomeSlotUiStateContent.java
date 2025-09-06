package com.kakao.tistory.presentation.screen.home.item;

import a5.b;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.graph.a;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Blog;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Entry;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.EntryInfo.DefaultImpls;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.EntryInfo;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Visibility;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.main.contract.c;
import java.util.List;
import javax.annotation.concurrent.Immutable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0010\bg\u0018\u00002\u00020\u0001:\r\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent;", "", "key", "", "getKey", "()Ljava/lang/String;", "Best", "Category", "Creator", "CreatorEntry", "Focus", "Followable", "Subscription", "SubscriptionEntry", "Tip", "Today", "TodayEntry", "TodayEvent", "TodayNotification", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface HomeSlotUiStateContent {
    @StabilityInferred(parameters = 1)
    @Immutable
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001C\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u001D\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004Bo\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000F\u001A\u00020\u0005\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\n\u0012\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0012\u001A\u00020\u0007\u0012\u0006\u0010\u0013\u001A\u00020\u0007\u0012\u0006\u0010\u0014\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0018J\u0012\u0010\u001C\u001A\u0004\u0018\u00010\nH\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0016\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\r0\fH\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u0018J\u0012\u0010!\u001A\u0004\u0018\u00010\nH\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u001DJ\u0016\u0010\"\u001A\b\u0012\u0004\u0012\u00020\r0\fH\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010\u001FJ\u0010\u0010#\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010\u001AJ\u0010\u0010$\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010\u001AJ\u0010\u0010%\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010\u0018J\u008E\u0001\u0010&\u001A\u00020\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00052\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\u000E\b\u0002\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000F\u001A\u00020\u00052\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\n2\u000E\b\u0002\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0012\u001A\u00020\u00072\b\b\u0002\u0010\u0013\u001A\u00020\u00072\b\b\u0002\u0010\u0014\u001A\u00020\u0005H\u00C6\u0001\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\u0005H\u00D6\u0001\u00A2\u0006\u0004\b(\u0010\u0018J\u0010\u0010)\u001A\u00020\u0007H\u00D6\u0001\u00A2\u0006\u0004\b)\u0010\u001AJ\u001A\u0010-\u001A\u00020,2\b\u0010+\u001A\u0004\u0018\u00010*H\u00D6\u0003\u00A2\u0006\u0004\b-\u0010.R\u001A\u0010\u0006\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u0018R\u0017\u0010\b\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u0010\u001AR\u001A\u0010\t\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b5\u00100\u001A\u0004\b6\u0010\u0018R\u001C\u0010\u000B\u001A\u0004\u0018\u00010\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010\u001DR \u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010\u001FR\u001A\u0010\u000F\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b=\u00100\u001A\u0004\b>\u0010\u0018R\u001C\u0010\u0010\u001A\u0004\u0018\u00010\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b?\u00108\u001A\u0004\b@\u0010\u001DR \u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bA\u0010;\u001A\u0004\bB\u0010\u001FR\u001A\u0010\u0012\u001A\u00020\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bC\u00103\u001A\u0004\bD\u0010\u001AR\u001A\u0010\u0013\u001A\u00020\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bE\u00103\u001A\u0004\bF\u0010\u001AR\u001A\u0010\u0014\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bG\u00100\u001A\u0004\bH\u0010\u0018\u00A8\u0006I"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Best;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Blog;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Entry;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$EntryInfo;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent;", "", "key", "", "rank", "blogTitle", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "blogImage", "Lkotlin/Function0;", "", "onClickBlog", "title", "thumbnail", "onClickEntry", "likeCount", "commentCount", "publishedDate", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;IILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "component5", "()Lkotlin/jvm/functions/Function0;", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;ILjava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;IILjava/lang/String;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Best;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getKey", "b", "I", "getRank", "c", "getBlogTitle", "d", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getBlogImage", "e", "Lkotlin/jvm/functions/Function0;", "getOnClickBlog", "f", "getTitle", "g", "getThumbnail", "h", "getOnClickEntry", "i", "getLikeCount", "j", "getCommentCount", "k", "getPublishedDate", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Best implements Blog, Entry, EntryInfo, HomeSlotUiStateContent {
        public static final int $stable;
        public final String a;
        public final int b;
        public final String c;
        public final ThumbnailUiState d;
        public final Function0 e;
        public final String f;
        public final ThumbnailUiState g;
        public final Function0 h;
        public final int i;
        public final int j;
        public final String k;

        public Best(@NotNull String s, int v, @NotNull String s1, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, @NotNull String s2, @Nullable ThumbnailUiState thumbnailUiState1, @NotNull Function0 function01, int v1, int v2, @NotNull String s3) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(function00, "onClickBlog");
            Intrinsics.checkNotNullParameter(s2, "title");
            Intrinsics.checkNotNullParameter(function01, "onClickEntry");
            Intrinsics.checkNotNullParameter(s3, "publishedDate");
            super();
            this.a = s;
            this.b = v;
            this.c = s1;
            this.d = thumbnailUiState0;
            this.e = function00;
            this.f = s2;
            this.g = thumbnailUiState1;
            this.h = function01;
            this.i = v1;
            this.j = v2;
            this.k = s3;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        public final int component10() {
            return this.j;
        }

        @NotNull
        public final String component11() {
            return this.k;
        }

        public final int component2() {
            return this.b;
        }

        @NotNull
        public final String component3() {
            return this.c;
        }

        @Nullable
        public final ThumbnailUiState component4() {
            return this.d;
        }

        @NotNull
        public final Function0 component5() {
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

        public final int component9() {
            return this.i;
        }

        @NotNull
        public final Best copy(@NotNull String s, int v, @NotNull String s1, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, @NotNull String s2, @Nullable ThumbnailUiState thumbnailUiState1, @NotNull Function0 function01, int v1, int v2, @NotNull String s3) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(function00, "onClickBlog");
            Intrinsics.checkNotNullParameter(s2, "title");
            Intrinsics.checkNotNullParameter(function01, "onClickEntry");
            Intrinsics.checkNotNullParameter(s3, "publishedDate");
            return new Best(s, v, s1, thumbnailUiState0, function00, s2, thumbnailUiState1, function01, v1, v2, s3);
        }

        public static Best copy$default(Best homeSlotUiStateContent$Best0, String s, int v, String s1, ThumbnailUiState thumbnailUiState0, Function0 function00, String s2, ThumbnailUiState thumbnailUiState1, Function0 function01, int v1, int v2, String s3, int v3, Object object0) {
            String s4 = (v3 & 1) == 0 ? s : homeSlotUiStateContent$Best0.a;
            int v4 = (v3 & 2) == 0 ? v : homeSlotUiStateContent$Best0.b;
            String s5 = (v3 & 4) == 0 ? s1 : homeSlotUiStateContent$Best0.c;
            ThumbnailUiState thumbnailUiState2 = (v3 & 8) == 0 ? thumbnailUiState0 : homeSlotUiStateContent$Best0.d;
            Function0 function02 = (v3 & 16) == 0 ? function00 : homeSlotUiStateContent$Best0.e;
            String s6 = (v3 & 0x20) == 0 ? s2 : homeSlotUiStateContent$Best0.f;
            ThumbnailUiState thumbnailUiState3 = (v3 & 0x40) == 0 ? thumbnailUiState1 : homeSlotUiStateContent$Best0.g;
            Function0 function03 = (v3 & 0x80) == 0 ? function01 : homeSlotUiStateContent$Best0.h;
            int v5 = (v3 & 0x100) == 0 ? v1 : homeSlotUiStateContent$Best0.i;
            int v6 = (v3 & 0x200) == 0 ? v2 : homeSlotUiStateContent$Best0.j;
            return (v3 & 0x400) == 0 ? homeSlotUiStateContent$Best0.copy(s4, v4, s5, thumbnailUiState2, function02, s6, thumbnailUiState3, function03, v5, v6, s3) : homeSlotUiStateContent$Best0.copy(s4, v4, s5, thumbnailUiState2, function02, s6, thumbnailUiState3, function03, v5, v6, homeSlotUiStateContent$Best0.k);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Best)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Best)object0).a)) {
                return false;
            }
            if(this.b != ((Best)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Best)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((Best)object0).d)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, ((Best)object0).e)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.f, ((Best)object0).f)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.g, ((Best)object0).g)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.h, ((Best)object0).h)) {
                return false;
            }
            if(this.i != ((Best)object0).i) {
                return false;
            }
            return this.j == ((Best)object0).j ? Intrinsics.areEqual(this.k, ((Best)object0).k) : false;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @Nullable
        public ThumbnailUiState getBlogImage() {
            return this.d;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @NotNull
        public String getBlogTitle() {
            return this.c;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        public int getCommentCount() {
            return this.j;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        @Nullable
        public Integer getCount() {
            return null;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent
        @NotNull
        public String getKey() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        public int getLikeCount() {
            return this.i;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @NotNull
        public Function0 getOnClickBlog() {
            return this.e;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public Function0 getOnClickEntry() {
            return this.h;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @Nullable
        public Function0 getOnLongClickEntry() {
            return null;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        @NotNull
        public String getPublishedDate() {
            return this.k;
        }

        public final int getRank() {
            return this.b;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        public boolean getScheduled() {
            return false;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @Nullable
        public String getSummary() {
            return null;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @Nullable
        public ThumbnailUiState getThumbnail() {
            return this.g;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public String getTitle() {
            return this.f;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        @NotNull
        public Visibility getVisibility() {
            return DefaultImpls.getVisibility(this);
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = a.a(this.f, com.kakao.tistory.presentation.main.contract.a.a(this.e, (a.a(this.c, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F) + (this.d == null ? 0 : this.d.hashCode())) * 0x1F, 0x1F), 0x1F);
            ThumbnailUiState thumbnailUiState0 = this.g;
            if(thumbnailUiState0 != null) {
                v = thumbnailUiState0.hashCode();
            }
            return this.k.hashCode() + com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.j, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.i, com.kakao.tistory.presentation.main.contract.a.a(this.h, (v1 + v) * 0x1F, 0x1F), 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Best(key=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", rank=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", blogTitle=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", blogImage=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", onClickBlog=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", title=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", thumbnail=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", onClickEntry=");
            stringBuilder0.append(this.h);
            stringBuilder0.append(", likeCount=");
            r0.a.A(stringBuilder0, this.i, ", commentCount=", this.j, ", publishedDate=");
            return r0.a.o(stringBuilder0, this.k, ")");
        }
    }

    @StabilityInferred(parameters = 1)
    @Immutable
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u001D\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004Bm\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u0012\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u0006\u0010\r\u001A\u00020\u0005\u0012\u0006\u0010\u000E\u001A\u00020\u0005\u0012\u0006\u0010\u000F\u001A\u00020\b\u0012\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u0012\u0006\u0010\u0013\u001A\u00020\u0011\u0012\u0006\u0010\u0014\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001A\u001A\u0004\u0018\u00010\bH\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0016\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u0018J\u0010\u0010\u001F\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u0018J\u0010\u0010 \u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001BJ\u0016\u0010!\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u001DJ\u0010\u0010\"\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010#J\u0010\u0010%\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010\u0018J\u008C\u0001\u0010&\u001A\u00020\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\b\b\u0002\u0010\r\u001A\u00020\u00052\b\b\u0002\u0010\u000E\u001A\u00020\u00052\b\b\u0002\u0010\u000F\u001A\u00020\b2\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\b\b\u0002\u0010\u0012\u001A\u00020\u00112\b\b\u0002\u0010\u0013\u001A\u00020\u00112\b\b\u0002\u0010\u0014\u001A\u00020\u0005H\u00C6\u0001\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\u0005H\u00D6\u0001\u00A2\u0006\u0004\b(\u0010\u0018J\u0010\u0010)\u001A\u00020\u0011H\u00D6\u0001\u00A2\u0006\u0004\b)\u0010#J\u001A\u0010-\u001A\u00020,2\b\u0010+\u001A\u0004\u0018\u00010*H\u00D6\u0003\u00A2\u0006\u0004\b-\u0010.R\u001A\u0010\u0006\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u0018R\u001A\u0010\u0007\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b2\u00100\u001A\u0004\b3\u0010\u0018R\u001C\u0010\t\u001A\u0004\u0018\u00010\b8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u0010\u001BR \u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010\u001DR\u001A\u0010\r\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b:\u00100\u001A\u0004\b;\u0010\u0018R\u001A\u0010\u000E\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b<\u00100\u001A\u0004\b=\u0010\u0018R\u001A\u0010\u000F\u001A\u00020\b8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b>\u00105\u001A\u0004\b?\u0010\u001BR \u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b@\u00108\u001A\u0004\bA\u0010\u001DR\u001A\u0010\u0012\u001A\u00020\u00118\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010#R\u001A\u0010\u0013\u001A\u00020\u00118\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bE\u0010C\u001A\u0004\bF\u0010#R\u001A\u0010\u0014\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bG\u00100\u001A\u0004\bH\u0010\u0018\u00A8\u0006I"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Category;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Blog;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Entry;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$EntryInfo;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent;", "", "key", "blogTitle", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "blogImage", "Lkotlin/Function0;", "", "onClickBlog", "title", "summary", "thumbnail", "onClickEntry", "", "likeCount", "commentCount", "publishedDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;IILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "component4", "()Lkotlin/jvm/functions/Function0;", "component5", "component6", "component7", "component8", "component9", "()I", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;IILjava/lang/String;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Category;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getKey", "b", "getBlogTitle", "c", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getBlogImage", "d", "Lkotlin/jvm/functions/Function0;", "getOnClickBlog", "e", "getTitle", "f", "getSummary", "g", "getThumbnail", "h", "getOnClickEntry", "i", "I", "getLikeCount", "j", "getCommentCount", "k", "getPublishedDate", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Category implements Blog, Entry, EntryInfo, HomeSlotUiStateContent {
        public static final int $stable;
        public final String a;
        public final String b;
        public final ThumbnailUiState c;
        public final Function0 d;
        public final String e;
        public final String f;
        public final ThumbnailUiState g;
        public final Function0 h;
        public final int i;
        public final int j;
        public final String k;

        public Category(@NotNull String s, @NotNull String s1, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, @NotNull String s2, @NotNull String s3, @NotNull ThumbnailUiState thumbnailUiState1, @NotNull Function0 function01, int v, int v1, @NotNull String s4) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(function00, "onClickBlog");
            Intrinsics.checkNotNullParameter(s2, "title");
            Intrinsics.checkNotNullParameter(s3, "summary");
            Intrinsics.checkNotNullParameter(thumbnailUiState1, "thumbnail");
            Intrinsics.checkNotNullParameter(function01, "onClickEntry");
            Intrinsics.checkNotNullParameter(s4, "publishedDate");
            super();
            this.a = s;
            this.b = s1;
            this.c = thumbnailUiState0;
            this.d = function00;
            this.e = s2;
            this.f = s3;
            this.g = thumbnailUiState1;
            this.h = function01;
            this.i = v;
            this.j = v1;
            this.k = s4;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        public final int component10() {
            return this.j;
        }

        @NotNull
        public final String component11() {
            return this.k;
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

        @NotNull
        public final String component6() {
            return this.f;
        }

        @NotNull
        public final ThumbnailUiState component7() {
            return this.g;
        }

        @NotNull
        public final Function0 component8() {
            return this.h;
        }

        public final int component9() {
            return this.i;
        }

        @NotNull
        public final Category copy(@NotNull String s, @NotNull String s1, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, @NotNull String s2, @NotNull String s3, @NotNull ThumbnailUiState thumbnailUiState1, @NotNull Function0 function01, int v, int v1, @NotNull String s4) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(function00, "onClickBlog");
            Intrinsics.checkNotNullParameter(s2, "title");
            Intrinsics.checkNotNullParameter(s3, "summary");
            Intrinsics.checkNotNullParameter(thumbnailUiState1, "thumbnail");
            Intrinsics.checkNotNullParameter(function01, "onClickEntry");
            Intrinsics.checkNotNullParameter(s4, "publishedDate");
            return new Category(s, s1, thumbnailUiState0, function00, s2, s3, thumbnailUiState1, function01, v, v1, s4);
        }

        public static Category copy$default(Category homeSlotUiStateContent$Category0, String s, String s1, ThumbnailUiState thumbnailUiState0, Function0 function00, String s2, String s3, ThumbnailUiState thumbnailUiState1, Function0 function01, int v, int v1, String s4, int v2, Object object0) {
            String s5 = (v2 & 1) == 0 ? s : homeSlotUiStateContent$Category0.a;
            String s6 = (v2 & 2) == 0 ? s1 : homeSlotUiStateContent$Category0.b;
            ThumbnailUiState thumbnailUiState2 = (v2 & 4) == 0 ? thumbnailUiState0 : homeSlotUiStateContent$Category0.c;
            Function0 function02 = (v2 & 8) == 0 ? function00 : homeSlotUiStateContent$Category0.d;
            String s7 = (v2 & 16) == 0 ? s2 : homeSlotUiStateContent$Category0.e;
            String s8 = (v2 & 0x20) == 0 ? s3 : homeSlotUiStateContent$Category0.f;
            ThumbnailUiState thumbnailUiState3 = (v2 & 0x40) == 0 ? thumbnailUiState1 : homeSlotUiStateContent$Category0.g;
            Function0 function03 = (v2 & 0x80) == 0 ? function01 : homeSlotUiStateContent$Category0.h;
            int v3 = (v2 & 0x100) == 0 ? v : homeSlotUiStateContent$Category0.i;
            int v4 = (v2 & 0x200) == 0 ? v1 : homeSlotUiStateContent$Category0.j;
            return (v2 & 0x400) == 0 ? homeSlotUiStateContent$Category0.copy(s5, s6, thumbnailUiState2, function02, s7, s8, thumbnailUiState3, function03, v3, v4, s4) : homeSlotUiStateContent$Category0.copy(s5, s6, thumbnailUiState2, function02, s7, s8, thumbnailUiState3, function03, v3, v4, homeSlotUiStateContent$Category0.k);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Category)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Category)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((Category)object0).b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Category)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((Category)object0).d)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, ((Category)object0).e)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.f, ((Category)object0).f)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.g, ((Category)object0).g)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.h, ((Category)object0).h)) {
                return false;
            }
            if(this.i != ((Category)object0).i) {
                return false;
            }
            return this.j == ((Category)object0).j ? Intrinsics.areEqual(this.k, ((Category)object0).k) : false;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @Nullable
        public ThumbnailUiState getBlogImage() {
            return this.c;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @NotNull
        public String getBlogTitle() {
            return this.b;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        public int getCommentCount() {
            return this.j;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        @Nullable
        public Integer getCount() {
            return null;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent
        @NotNull
        public String getKey() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        public int getLikeCount() {
            return this.i;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @NotNull
        public Function0 getOnClickBlog() {
            return this.d;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public Function0 getOnClickEntry() {
            return this.h;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @Nullable
        public Function0 getOnLongClickEntry() {
            return null;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        @NotNull
        public String getPublishedDate() {
            return this.k;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        public boolean getScheduled() {
            return false;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public String getSummary() {
            return this.f;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public ThumbnailUiState getThumbnail() {
            return this.g;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public String getTitle() {
            return this.e;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        @NotNull
        public Visibility getVisibility() {
            return DefaultImpls.getVisibility(this);
        }

        @Override
        public int hashCode() {
            int v = a.a(this.b, this.a.hashCode() * 0x1F, 0x1F);
            return this.c == null ? this.k.hashCode() + com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.j, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.i, com.kakao.tistory.presentation.main.contract.a.a(this.h, (this.g.hashCode() + a.a(this.f, a.a(this.e, com.kakao.tistory.presentation.main.contract.a.a(this.d, v * 0x1F, 0x1F), 0x1F), 0x1F)) * 0x1F, 0x1F), 0x1F), 0x1F) : this.k.hashCode() + com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.j, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.i, com.kakao.tistory.presentation.main.contract.a.a(this.h, (this.g.hashCode() + a.a(this.f, a.a(this.e, com.kakao.tistory.presentation.main.contract.a.a(this.d, (v + this.c.hashCode()) * 0x1F, 0x1F), 0x1F), 0x1F)) * 0x1F, 0x1F), 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = b.w("Category(key=", this.a, ", blogTitle=", this.b, ", blogImage=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", onClickBlog=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", title=");
            androidx.room.a.w(stringBuilder0, this.e, ", summary=", this.f, ", thumbnail=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", onClickEntry=");
            stringBuilder0.append(this.h);
            stringBuilder0.append(", likeCount=");
            r0.a.A(stringBuilder0, this.i, ", commentCount=", this.j, ", publishedDate=");
            return r0.a.o(stringBuilder0, this.k, ")");
        }
    }

    @StabilityInferred(parameters = 1)
    @Immutable
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001B\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u0000 P2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001PB\u007F\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u0012\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0011\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u0012\u0012\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\u0000H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\u0000H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001AJ\u0010\u0010\u001C\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001DJ\u0012\u0010\u001F\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J\u0016\u0010!\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010\u001DJ\u0010\u0010$\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b$\u0010%J\u0016\u0010&\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\"J\u0016\u0010\'\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010\"J\u0010\u0010(\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b(\u0010\u001DJ\u0010\u0010)\u001A\u00020\u0012H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010*J\u0016\u0010+\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014H\u00C6\u0003\u00A2\u0006\u0004\b+\u0010,J\u0098\u0001\u0010-\u001A\u00020\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00072\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\f\u001A\u00020\u00042\b\b\u0002\u0010\u000E\u001A\u00020\r2\u000E\b\u0002\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0011\u001A\u00020\u00042\b\b\u0002\u0010\u0013\u001A\u00020\u00122\u000E\b\u0002\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014H\u00C6\u0001\u00A2\u0006\u0004\b-\u0010.J\u0010\u0010/\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b/\u0010\u001DJ\u0010\u00100\u001A\u00020\u0012H\u00D6\u0001\u00A2\u0006\u0004\b0\u0010*J\u001A\u00103\u001A\u00020\r2\b\u00102\u001A\u0004\u0018\u000101H\u00D6\u0003\u00A2\u0006\u0004\b3\u00104R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010\u001DR\u001A\u0010\u0006\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b8\u00106\u001A\u0004\b9\u0010\u001DR\u001C\u0010\b\u001A\u0004\u0018\u00010\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010 R \u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010\"R\u0017\u0010\f\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b@\u00106\u001A\u0004\bA\u0010\u001DR\u001A\u0010\u000E\u001A\u00020\r8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\b\u000E\u0010%R \u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bD\u0010>\u001A\u0004\bE\u0010\"R \u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bF\u0010>\u001A\u0004\bG\u0010\"R\u001A\u0010\u0011\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bH\u00106\u001A\u0004\bI\u0010\u001DR\u0017\u0010\u0013\u001A\u00020\u00128\u0006\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010*R\u001D\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006\u00A2\u0006\f\n\u0004\bM\u0010N\u001A\u0004\bO\u0010,\u00A8\u0006Q"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Creator;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Blog;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Followable;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent;", "", "key", "blogTitle", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "blogImage", "Lkotlin/Function0;", "", "onClickBlog", "storyCreatorLabel", "", "isFollowing", "onClickFollow", "onClickUnFollow", "blogName", "", "followerCount", "", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$CreatorEntry;", "entryList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/util/List;)V", "follow", "()Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Creator;", "unFollow", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "component4", "()Lkotlin/jvm/functions/Function0;", "component5", "component6", "()Z", "component7", "component8", "component9", "component10", "()I", "component11", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/util/List;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Creator;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getKey", "b", "getBlogTitle", "c", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getBlogImage", "d", "Lkotlin/jvm/functions/Function0;", "getOnClickBlog", "e", "getStoryCreatorLabel", "f", "Z", "g", "getOnClickFollow", "h", "getOnClickUnFollow", "i", "getBlogName", "j", "I", "getFollowerCount", "k", "Ljava/util/List;", "getEntryList", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHomeSlotUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSlotUiState.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Creator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
    public static final class Creator implements Blog, Followable, HomeSlotUiStateContent {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Creator$Companion;", "", "", "CONTENT_PER_PAGE", "I", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }
        }

        public static final int $stable = 0;
        public static final int CONTENT_PER_PAGE = 2;
        @NotNull
        public static final Companion Companion;
        public final String a;
        public final String b;
        public final ThumbnailUiState c;
        public final Function0 d;
        public final String e;
        public final boolean f;
        public final Function0 g;
        public final Function0 h;
        public final String i;
        public final int j;
        public final List k;

        static {
            Creator.Companion = new Companion(null);
        }

        public Creator(@NotNull String s, @NotNull String s1, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, @NotNull String s2, boolean z, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull String s3, int v, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(function00, "onClickBlog");
            Intrinsics.checkNotNullParameter(s2, "storyCreatorLabel");
            Intrinsics.checkNotNullParameter(function01, "onClickFollow");
            Intrinsics.checkNotNullParameter(function02, "onClickUnFollow");
            Intrinsics.checkNotNullParameter(s3, "blogName");
            Intrinsics.checkNotNullParameter(list0, "entryList");
            super();
            this.a = s;
            this.b = s1;
            this.c = thumbnailUiState0;
            this.d = function00;
            this.e = s2;
            this.f = z;
            this.g = function01;
            this.h = function02;
            this.i = s3;
            this.j = v;
            this.k = list0;
            if(list0.size() < 2) {
                throw new IllegalArgumentException(("Creator entry list should be more than 2 but " + list0.size()).toString());
            }
        }

        public Creator(String s, String s1, ThumbnailUiState thumbnailUiState0, Function0 function00, String s2, boolean z, Function0 function01, Function0 function02, String s3, int v, List list0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            this(s, s1, ((v1 & 4) == 0 ? thumbnailUiState0 : null), function00, s2, ((v1 & 0x20) == 0 ? z : false), function01, function02, s3, ((v1 & 0x200) == 0 ? v : 0), list0);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        public final int component10() {
            return this.j;
        }

        @NotNull
        public final List component11() {
            return this.k;
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

        public final boolean component6() {
            return this.f;
        }

        @NotNull
        public final Function0 component7() {
            return this.g;
        }

        @NotNull
        public final Function0 component8() {
            return this.h;
        }

        @NotNull
        public final String component9() {
            return this.i;
        }

        @NotNull
        public final Creator copy(@NotNull String s, @NotNull String s1, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, @NotNull String s2, boolean z, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull String s3, int v, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(function00, "onClickBlog");
            Intrinsics.checkNotNullParameter(s2, "storyCreatorLabel");
            Intrinsics.checkNotNullParameter(function01, "onClickFollow");
            Intrinsics.checkNotNullParameter(function02, "onClickUnFollow");
            Intrinsics.checkNotNullParameter(s3, "blogName");
            Intrinsics.checkNotNullParameter(list0, "entryList");
            return new Creator(s, s1, thumbnailUiState0, function00, s2, z, function01, function02, s3, v, list0);
        }

        public static Creator copy$default(Creator homeSlotUiStateContent$Creator0, String s, String s1, ThumbnailUiState thumbnailUiState0, Function0 function00, String s2, boolean z, Function0 function01, Function0 function02, String s3, int v, List list0, int v1, Object object0) {
            String s4 = (v1 & 1) == 0 ? s : homeSlotUiStateContent$Creator0.a;
            String s5 = (v1 & 2) == 0 ? s1 : homeSlotUiStateContent$Creator0.b;
            ThumbnailUiState thumbnailUiState1 = (v1 & 4) == 0 ? thumbnailUiState0 : homeSlotUiStateContent$Creator0.c;
            Function0 function03 = (v1 & 8) == 0 ? function00 : homeSlotUiStateContent$Creator0.d;
            String s6 = (v1 & 16) == 0 ? s2 : homeSlotUiStateContent$Creator0.e;
            boolean z1 = (v1 & 0x20) == 0 ? z : homeSlotUiStateContent$Creator0.f;
            Function0 function04 = (v1 & 0x40) == 0 ? function01 : homeSlotUiStateContent$Creator0.g;
            Function0 function05 = (v1 & 0x80) == 0 ? function02 : homeSlotUiStateContent$Creator0.h;
            String s7 = (v1 & 0x100) == 0 ? s3 : homeSlotUiStateContent$Creator0.i;
            int v2 = (v1 & 0x200) == 0 ? v : homeSlotUiStateContent$Creator0.j;
            return (v1 & 0x400) == 0 ? homeSlotUiStateContent$Creator0.copy(s4, s5, thumbnailUiState1, function03, s6, z1, function04, function05, s7, v2, list0) : homeSlotUiStateContent$Creator0.copy(s4, s5, thumbnailUiState1, function03, s6, z1, function04, function05, s7, v2, homeSlotUiStateContent$Creator0.k);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Creator)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Creator)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((Creator)object0).b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Creator)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((Creator)object0).d)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, ((Creator)object0).e)) {
                return false;
            }
            if(this.f != ((Creator)object0).f) {
                return false;
            }
            if(!Intrinsics.areEqual(this.g, ((Creator)object0).g)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.h, ((Creator)object0).h)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.i, ((Creator)object0).i)) {
                return false;
            }
            return this.j == ((Creator)object0).j ? Intrinsics.areEqual(this.k, ((Creator)object0).k) : false;
        }

        @NotNull
        public Creator follow() {
            return Creator.copy$default(this, null, null, null, null, null, true, null, null, null, 0, null, 0x7DF, null);
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Followable
        public HomeSlotUiStateContent follow() {
            return this.follow();
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @Nullable
        public ThumbnailUiState getBlogImage() {
            return this.c;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Followable
        @NotNull
        public String getBlogName() {
            return this.i;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @NotNull
        public String getBlogTitle() {
            return this.b;
        }

        @NotNull
        public final List getEntryList() {
            return this.k;
        }

        public final int getFollowerCount() {
            return this.j;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent
        @NotNull
        public String getKey() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @NotNull
        public Function0 getOnClickBlog() {
            return this.d;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Followable
        @NotNull
        public Function0 getOnClickFollow() {
            return this.g;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Followable
        @NotNull
        public Function0 getOnClickUnFollow() {
            return this.h;
        }

        @NotNull
        public final String getStoryCreatorLabel() {
            return this.e;
        }

        @Override
        public int hashCode() {
            int v = a.a(this.b, this.a.hashCode() * 0x1F, 0x1F);
            return this.c == null ? this.k.hashCode() + com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.j, a.a(this.i, com.kakao.tistory.presentation.main.contract.a.a(this.h, com.kakao.tistory.presentation.main.contract.a.a(this.g, c.a(this.f, a.a(this.e, com.kakao.tistory.presentation.main.contract.a.a(this.d, v * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F) : this.k.hashCode() + com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.j, a.a(this.i, com.kakao.tistory.presentation.main.contract.a.a(this.h, com.kakao.tistory.presentation.main.contract.a.a(this.g, c.a(this.f, a.a(this.e, com.kakao.tistory.presentation.main.contract.a.a(this.d, (v + this.c.hashCode()) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Followable
        public boolean isFollowing() {
            return this.f;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = b.w("Creator(key=", this.a, ", blogTitle=", this.b, ", blogImage=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", onClickBlog=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", storyCreatorLabel=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", isFollowing=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", onClickFollow=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", onClickUnFollow=");
            stringBuilder0.append(this.h);
            stringBuilder0.append(", blogName=");
            stringBuilder0.append(this.i);
            stringBuilder0.append(", followerCount=");
            stringBuilder0.append(this.j);
            stringBuilder0.append(", entryList=");
            return wb.a.e(stringBuilder0, this.k, ")");
        }

        @NotNull
        public Creator unFollow() {
            return Creator.copy$default(this, null, null, null, null, null, false, null, null, null, 0, null, 0x7DF, null);
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Followable
        public HomeSlotUiStateContent unFollow() {
            return this.unFollow();
        }
    }

    @StabilityInferred(parameters = 1)
    @Immutable
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000F\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000EJ\u0010\u0010\u0019\u001A\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010\u001D\u001A\u00020\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010\u001BHÖ\u0003¢\u0006\u0004\b\u001D\u0010\u001ER\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000ER\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0010R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\u0007\u0010\u0012R \u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010\u0014¨\u0006*"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$CreatorEntry;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Entry;", "", "title", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "thumbnail", "", "isNew", "Lkotlin/Function0;", "", "onClickEntry", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;ZLkotlin/jvm/functions/Function0;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "component3", "()Z", "component4", "()Lkotlin/jvm/functions/Function0;", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;ZLkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$CreatorEntry;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getThumbnail", "c", "Z", "d", "Lkotlin/jvm/functions/Function0;", "getOnClickEntry", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHomeSlotUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSlotUiState.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$CreatorEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
    public static final class CreatorEntry implements Entry {
        public static final int $stable;
        public final String a;
        public final ThumbnailUiState b;
        public final boolean c;
        public final Function0 d;

        public CreatorEntry(@NotNull String s, @NotNull ThumbnailUiState thumbnailUiState0, boolean z, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(s, "title");
            Intrinsics.checkNotNullParameter(thumbnailUiState0, "thumbnail");
            Intrinsics.checkNotNullParameter(function00, "onClickEntry");
            super();
            this.a = s;
            this.b = thumbnailUiState0;
            this.c = z;
            this.d = function00;
            if(!this.getThumbnail().isNotBlank()) {
                throw new IllegalArgumentException("Creator entry thumbnail should not be blank");
            }
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final ThumbnailUiState component2() {
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
        public final CreatorEntry copy(@NotNull String s, @NotNull ThumbnailUiState thumbnailUiState0, boolean z, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(s, "title");
            Intrinsics.checkNotNullParameter(thumbnailUiState0, "thumbnail");
            Intrinsics.checkNotNullParameter(function00, "onClickEntry");
            return new CreatorEntry(s, thumbnailUiState0, z, function00);
        }

        public static CreatorEntry copy$default(CreatorEntry homeSlotUiStateContent$CreatorEntry0, String s, ThumbnailUiState thumbnailUiState0, boolean z, Function0 function00, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeSlotUiStateContent$CreatorEntry0.a;
            }
            if((v & 2) != 0) {
                thumbnailUiState0 = homeSlotUiStateContent$CreatorEntry0.b;
            }
            if((v & 4) != 0) {
                z = homeSlotUiStateContent$CreatorEntry0.c;
            }
            if((v & 8) != 0) {
                function00 = homeSlotUiStateContent$CreatorEntry0.d;
            }
            return homeSlotUiStateContent$CreatorEntry0.copy(s, thumbnailUiState0, z, function00);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CreatorEntry)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((CreatorEntry)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((CreatorEntry)object0).b)) {
                return false;
            }
            return this.c == ((CreatorEntry)object0).c ? Intrinsics.areEqual(this.d, ((CreatorEntry)object0).d) : false;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public Function0 getOnClickEntry() {
            return this.d;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @Nullable
        public Function0 getOnLongClickEntry() {
            return null;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @Nullable
        public String getSummary() {
            return null;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public ThumbnailUiState getThumbnail() {
            return this.b;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public String getTitle() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.d.hashCode() + c.a(this.c, (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F);
        }

        public final boolean isNew() {
            return this.c;
        }

        @Override
        @NotNull
        public String toString() {
            return "CreatorEntry(title=" + this.a + ", thumbnail=" + this.b + ", isNew=" + this.c + ", onClickEntry=" + this.d + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Immutable
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u001B\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004Bg\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u0012\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u0006\u0010\r\u001A\u00020\u0005\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\b\u0012\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u0012\u0006\u0010\u0012\u001A\u00020\u0010\u0012\u0006\u0010\u0013\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001A\u0004\u0018\u00010\bH\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0016\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u0017J\u0012\u0010\u001E\u001A\u0004\u0018\u00010\bH\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001AJ\u0016\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u001CJ\u0010\u0010 \u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\b \u0010!J\u0010\u0010\"\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010\u0017J\u0084\u0001\u0010$\u001A\u00020\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\b\b\u0002\u0010\r\u001A\u00020\u00052\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\b2\u000E\b\u0002\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0012\u001A\u00020\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u0005H\u00C6\u0001\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\u0005H\u00D6\u0001\u00A2\u0006\u0004\b&\u0010\u0017J\u0010\u0010\'\u001A\u00020\u0010H\u00D6\u0001\u00A2\u0006\u0004\b\'\u0010!J\u001A\u0010+\u001A\u00020*2\b\u0010)\u001A\u0004\u0018\u00010(H\u00D6\u0003\u00A2\u0006\u0004\b+\u0010,R\u001A\u0010\u0006\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\u0017R\u001A\u0010\u0007\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b0\u0010.\u001A\u0004\b1\u0010\u0017R\u001C\u0010\t\u001A\u0004\u0018\u00010\b8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u0010\u001AR \u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010\u001CR\u001A\u0010\r\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b8\u0010.\u001A\u0004\b9\u0010\u0017R\u001C\u0010\u000E\u001A\u0004\u0018\u00010\b8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b:\u00103\u001A\u0004\b;\u0010\u001AR \u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b<\u00106\u001A\u0004\b=\u0010\u001CR\u001A\u0010\u0011\u001A\u00020\u00108\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b>\u0010?\u001A\u0004\b@\u0010!R\u001A\u0010\u0012\u001A\u00020\u00108\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bA\u0010?\u001A\u0004\bB\u0010!R\u001A\u0010\u0013\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bC\u0010.\u001A\u0004\bD\u0010\u0017\u00A8\u0006E"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Focus;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Blog;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Entry;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$EntryInfo;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent;", "", "key", "blogTitle", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "blogImage", "Lkotlin/Function0;", "", "onClickBlog", "title", "thumbnail", "onClickEntry", "", "likeCount", "commentCount", "publishedDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;IILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "component4", "()Lkotlin/jvm/functions/Function0;", "component5", "component6", "component7", "component8", "()I", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;IILjava/lang/String;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Focus;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getKey", "b", "getBlogTitle", "c", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getBlogImage", "d", "Lkotlin/jvm/functions/Function0;", "getOnClickBlog", "e", "getTitle", "f", "getThumbnail", "g", "getOnClickEntry", "h", "I", "getLikeCount", "i", "getCommentCount", "j", "getPublishedDate", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Focus implements Blog, Entry, EntryInfo, HomeSlotUiStateContent {
        public static final int $stable;
        public final String a;
        public final String b;
        public final ThumbnailUiState c;
        public final Function0 d;
        public final String e;
        public final ThumbnailUiState f;
        public final Function0 g;
        public final int h;
        public final int i;
        public final String j;

        public Focus(@NotNull String s, @NotNull String s1, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, @NotNull String s2, @Nullable ThumbnailUiState thumbnailUiState1, @NotNull Function0 function01, int v, int v1, @NotNull String s3) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(function00, "onClickBlog");
            Intrinsics.checkNotNullParameter(s2, "title");
            Intrinsics.checkNotNullParameter(function01, "onClickEntry");
            Intrinsics.checkNotNullParameter(s3, "publishedDate");
            super();
            this.a = s;
            this.b = s1;
            this.c = thumbnailUiState0;
            this.d = function00;
            this.e = s2;
            this.f = thumbnailUiState1;
            this.g = function01;
            this.h = v;
            this.i = v1;
            this.j = s3;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final String component10() {
            return this.j;
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

        @Nullable
        public final ThumbnailUiState component6() {
            return this.f;
        }

        @NotNull
        public final Function0 component7() {
            return this.g;
        }

        public final int component8() {
            return this.h;
        }

        public final int component9() {
            return this.i;
        }

        @NotNull
        public final Focus copy(@NotNull String s, @NotNull String s1, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, @NotNull String s2, @Nullable ThumbnailUiState thumbnailUiState1, @NotNull Function0 function01, int v, int v1, @NotNull String s3) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(function00, "onClickBlog");
            Intrinsics.checkNotNullParameter(s2, "title");
            Intrinsics.checkNotNullParameter(function01, "onClickEntry");
            Intrinsics.checkNotNullParameter(s3, "publishedDate");
            return new Focus(s, s1, thumbnailUiState0, function00, s2, thumbnailUiState1, function01, v, v1, s3);
        }

        public static Focus copy$default(Focus homeSlotUiStateContent$Focus0, String s, String s1, ThumbnailUiState thumbnailUiState0, Function0 function00, String s2, ThumbnailUiState thumbnailUiState1, Function0 function01, int v, int v1, String s3, int v2, Object object0) {
            String s4 = (v2 & 1) == 0 ? s : homeSlotUiStateContent$Focus0.a;
            String s5 = (v2 & 2) == 0 ? s1 : homeSlotUiStateContent$Focus0.b;
            ThumbnailUiState thumbnailUiState2 = (v2 & 4) == 0 ? thumbnailUiState0 : homeSlotUiStateContent$Focus0.c;
            Function0 function02 = (v2 & 8) == 0 ? function00 : homeSlotUiStateContent$Focus0.d;
            String s6 = (v2 & 16) == 0 ? s2 : homeSlotUiStateContent$Focus0.e;
            ThumbnailUiState thumbnailUiState3 = (v2 & 0x20) == 0 ? thumbnailUiState1 : homeSlotUiStateContent$Focus0.f;
            Function0 function03 = (v2 & 0x40) == 0 ? function01 : homeSlotUiStateContent$Focus0.g;
            int v3 = (v2 & 0x80) == 0 ? v : homeSlotUiStateContent$Focus0.h;
            int v4 = (v2 & 0x100) == 0 ? v1 : homeSlotUiStateContent$Focus0.i;
            return (v2 & 0x200) == 0 ? homeSlotUiStateContent$Focus0.copy(s4, s5, thumbnailUiState2, function02, s6, thumbnailUiState3, function03, v3, v4, s3) : homeSlotUiStateContent$Focus0.copy(s4, s5, thumbnailUiState2, function02, s6, thumbnailUiState3, function03, v3, v4, homeSlotUiStateContent$Focus0.j);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Focus)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Focus)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((Focus)object0).b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Focus)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((Focus)object0).d)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, ((Focus)object0).e)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.f, ((Focus)object0).f)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.g, ((Focus)object0).g)) {
                return false;
            }
            if(this.h != ((Focus)object0).h) {
                return false;
            }
            return this.i == ((Focus)object0).i ? Intrinsics.areEqual(this.j, ((Focus)object0).j) : false;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @Nullable
        public ThumbnailUiState getBlogImage() {
            return this.c;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @NotNull
        public String getBlogTitle() {
            return this.b;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        public int getCommentCount() {
            return this.i;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        @Nullable
        public Integer getCount() {
            return null;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent
        @NotNull
        public String getKey() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        public int getLikeCount() {
            return this.h;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @NotNull
        public Function0 getOnClickBlog() {
            return this.d;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public Function0 getOnClickEntry() {
            return this.g;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @Nullable
        public Function0 getOnLongClickEntry() {
            return null;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        @NotNull
        public String getPublishedDate() {
            return this.j;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        public boolean getScheduled() {
            return false;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @Nullable
        public String getSummary() {
            return null;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @Nullable
        public ThumbnailUiState getThumbnail() {
            return this.f;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public String getTitle() {
            return this.e;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$EntryInfo
        @NotNull
        public Visibility getVisibility() {
            return DefaultImpls.getVisibility(this);
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = a.a(this.e, com.kakao.tistory.presentation.main.contract.a.a(this.d, (a.a(this.b, this.a.hashCode() * 0x1F, 0x1F) + (this.c == null ? 0 : this.c.hashCode())) * 0x1F, 0x1F), 0x1F);
            ThumbnailUiState thumbnailUiState0 = this.f;
            if(thumbnailUiState0 != null) {
                v = thumbnailUiState0.hashCode();
            }
            return this.j.hashCode() + com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.i, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.h, com.kakao.tistory.presentation.main.contract.a.a(this.g, (v1 + v) * 0x1F, 0x1F), 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = b.w("Focus(key=", this.a, ", blogTitle=", this.b, ", blogImage=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", onClickBlog=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", title=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", thumbnail=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", onClickEntry=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", likeCount=");
            stringBuilder0.append(this.h);
            stringBuilder0.append(", commentCount=");
            stringBuilder0.append(this.i);
            stringBuilder0.append(", publishedDate=");
            stringBuilder0.append(this.j);
            stringBuilder0.append(")");
            return stringBuilder0.toString();
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0010\u001A\u00020\u0011H&J\b\u0010\u0012\u001A\u00020\u0011H&R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\bR\u0018\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u000B0\nX¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\rR\u0018\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u000B0\nX¦\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Followable;", "", "blogName", "", "getBlogName", "()Ljava/lang/String;", "isFollowing", "", "()Z", "onClickFollow", "Lkotlin/Function0;", "", "getOnClickFollow", "()Lkotlin/jvm/functions/Function0;", "onClickUnFollow", "getOnClickUnFollow", "follow", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent;", "unFollow", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface Followable {
        @NotNull
        HomeSlotUiStateContent follow();

        @NotNull
        String getBlogName();

        @NotNull
        Function0 getOnClickFollow();

        @NotNull
        Function0 getOnClickUnFollow();

        boolean isFollowing();

        @NotNull
        HomeSlotUiStateContent unFollow();
    }

    @StabilityInferred(parameters = 1)
    @Immutable
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001D\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u008D\u0001\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001A\u00020\u0004\u0012\b\u0010\r\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u0010\u001A\u00020\u000E\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0011\u0012\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0015\u001A\u00020\u0004\u0012\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00170\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\u0000H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001D\u001A\u00020\u0000H\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001CJ\u0010\u0010\u001E\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001FJ\u0012\u0010!\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0003\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010\u001FJ\u0012\u0010&\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\u001FJ\u0010\u0010\'\u001A\u00020\u000EH\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010(J\u0010\u0010)\u001A\u00020\u000EH\u00C6\u0003\u00A2\u0006\u0004\b)\u0010(J\u0010\u0010*\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\b*\u0010+J\u0016\u0010,\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0003\u00A2\u0006\u0004\b,\u0010$J\u0016\u0010-\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0003\u00A2\u0006\u0004\b-\u0010$J\u0010\u0010.\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010\u001FJ\u0016\u0010/\u001A\b\u0012\u0004\u0012\u00020\u00170\u0016H\u00C6\u0003\u00A2\u0006\u0004\b/\u00100J\u00AE\u0001\u00101\u001A\u00020\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00072\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\f\u001A\u00020\u00042\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u0012\u001A\u00020\u00112\u000E\b\u0002\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u000E\b\u0002\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0015\u001A\u00020\u00042\u000E\b\u0002\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00170\u0016H\u00C6\u0001\u00A2\u0006\u0004\b1\u00102J\u0010\u00103\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b3\u0010\u001FJ\u0010\u00104\u001A\u00020\u000EH\u00D6\u0001\u00A2\u0006\u0004\b4\u0010(J\u001A\u00107\u001A\u00020\u00112\b\u00106\u001A\u0004\u0018\u000105H\u00D6\u0003\u00A2\u0006\u0004\b7\u00108R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010\u001FR\u001A\u0010\u0006\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b<\u0010:\u001A\u0004\b=\u0010\u001FR\u001C\u0010\b\u001A\u0004\u0018\u00010\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b>\u0010?\u001A\u0004\b@\u0010\"R \u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bA\u0010B\u001A\u0004\bC\u0010$R\u0017\u0010\f\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bD\u0010:\u001A\u0004\bE\u0010\u001FR\u0019\u0010\r\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\bF\u0010:\u001A\u0004\bG\u0010\u001FR\u0017\u0010\u000F\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010(R\u0017\u0010\u0010\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\bK\u0010I\u001A\u0004\bL\u0010(R\u001A\u0010\u0012\u001A\u00020\u00118\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bM\u0010N\u001A\u0004\b\u0012\u0010+R \u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bO\u0010B\u001A\u0004\bP\u0010$R \u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bQ\u0010B\u001A\u0004\bR\u0010$R\u001A\u0010\u0015\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bS\u0010:\u001A\u0004\bT\u0010\u001FR\u001D\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006\u00A2\u0006\f\n\u0004\bU\u0010V\u001A\u0004\bW\u00100\u00A8\u0006X"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Subscription;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Blog;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Followable;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent;", "", "key", "blogTitle", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "blogImage", "Lkotlin/Function0;", "", "onClickBlog", "blogDescription", "storyCreatorLabel", "", "followerCount", "followerIncreaseCount", "", "isFollowing", "onClickFollow", "onClickUnFollow", "blogName", "", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$SubscriptionEntry;", "entryList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;IIZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/util/List;)V", "follow", "()Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Subscription;", "unFollow", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "component4", "()Lkotlin/jvm/functions/Function0;", "component5", "component6", "component7", "()I", "component8", "component9", "()Z", "component10", "component11", "component12", "component13", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;IIZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Subscription;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getKey", "b", "getBlogTitle", "c", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getBlogImage", "d", "Lkotlin/jvm/functions/Function0;", "getOnClickBlog", "e", "getBlogDescription", "f", "getStoryCreatorLabel", "g", "I", "getFollowerCount", "h", "getFollowerIncreaseCount", "i", "Z", "j", "getOnClickFollow", "k", "getOnClickUnFollow", "l", "getBlogName", "m", "Ljava/util/List;", "getEntryList", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHomeSlotUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSlotUiState.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Subscription\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
    public static final class Subscription implements Blog, Followable, HomeSlotUiStateContent {
        public static final int $stable;
        public final String a;
        public final String b;
        public final ThumbnailUiState c;
        public final Function0 d;
        public final String e;
        public final String f;
        public final int g;
        public final int h;
        public final boolean i;
        public final Function0 j;
        public final Function0 k;
        public final String l;
        public final List m;

        public Subscription(@NotNull String s, @NotNull String s1, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, @NotNull String s2, @Nullable String s3, int v, int v1, boolean z, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull String s4, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(function00, "onClickBlog");
            Intrinsics.checkNotNullParameter(s2, "blogDescription");
            Intrinsics.checkNotNullParameter(function01, "onClickFollow");
            Intrinsics.checkNotNullParameter(function02, "onClickUnFollow");
            Intrinsics.checkNotNullParameter(s4, "blogName");
            Intrinsics.checkNotNullParameter(list0, "entryList");
            super();
            this.a = s;
            this.b = s1;
            this.c = thumbnailUiState0;
            this.d = function00;
            this.e = s2;
            this.f = s3;
            this.g = v;
            this.h = v1;
            this.i = z;
            this.j = function01;
            this.k = function02;
            this.l = s4;
            this.m = list0;
            if(list0.size() < 2) {
                throw new IllegalArgumentException(("Subscription entry list should be more than 2 but " + list0.size()).toString());
            }
        }

        public Subscription(String s, String s1, ThumbnailUiState thumbnailUiState0, Function0 function00, String s2, String s3, int v, int v1, boolean z, Function0 function01, Function0 function02, String s4, List list0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
            this(s, s1, thumbnailUiState0, function00, s2, s3, v, v1, ((v2 & 0x100) == 0 ? z : false), function01, function02, s4, list0);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Function0 component10() {
            return this.j;
        }

        @NotNull
        public final Function0 component11() {
            return this.k;
        }

        @NotNull
        public final String component12() {
            return this.l;
        }

        @NotNull
        public final List component13() {
            return this.m;
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

        @Nullable
        public final String component6() {
            return this.f;
        }

        public final int component7() {
            return this.g;
        }

        public final int component8() {
            return this.h;
        }

        public final boolean component9() {
            return this.i;
        }

        @NotNull
        public final Subscription copy(@NotNull String s, @NotNull String s1, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, @NotNull String s2, @Nullable String s3, int v, int v1, boolean z, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull String s4, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(function00, "onClickBlog");
            Intrinsics.checkNotNullParameter(s2, "blogDescription");
            Intrinsics.checkNotNullParameter(function01, "onClickFollow");
            Intrinsics.checkNotNullParameter(function02, "onClickUnFollow");
            Intrinsics.checkNotNullParameter(s4, "blogName");
            Intrinsics.checkNotNullParameter(list0, "entryList");
            return new Subscription(s, s1, thumbnailUiState0, function00, s2, s3, v, v1, z, function01, function02, s4, list0);
        }

        public static Subscription copy$default(Subscription homeSlotUiStateContent$Subscription0, String s, String s1, ThumbnailUiState thumbnailUiState0, Function0 function00, String s2, String s3, int v, int v1, boolean z, Function0 function01, Function0 function02, String s4, List list0, int v2, Object object0) {
            String s5 = (v2 & 1) == 0 ? s : homeSlotUiStateContent$Subscription0.a;
            String s6 = (v2 & 2) == 0 ? s1 : homeSlotUiStateContent$Subscription0.b;
            ThumbnailUiState thumbnailUiState1 = (v2 & 4) == 0 ? thumbnailUiState0 : homeSlotUiStateContent$Subscription0.c;
            Function0 function03 = (v2 & 8) == 0 ? function00 : homeSlotUiStateContent$Subscription0.d;
            String s7 = (v2 & 16) == 0 ? s2 : homeSlotUiStateContent$Subscription0.e;
            String s8 = (v2 & 0x20) == 0 ? s3 : homeSlotUiStateContent$Subscription0.f;
            int v3 = (v2 & 0x40) == 0 ? v : homeSlotUiStateContent$Subscription0.g;
            int v4 = (v2 & 0x80) == 0 ? v1 : homeSlotUiStateContent$Subscription0.h;
            boolean z1 = (v2 & 0x100) == 0 ? z : homeSlotUiStateContent$Subscription0.i;
            Function0 function04 = (v2 & 0x200) == 0 ? function01 : homeSlotUiStateContent$Subscription0.j;
            Function0 function05 = (v2 & 0x400) == 0 ? function02 : homeSlotUiStateContent$Subscription0.k;
            String s9 = (v2 & 0x800) == 0 ? s4 : homeSlotUiStateContent$Subscription0.l;
            return (v2 & 0x1000) == 0 ? homeSlotUiStateContent$Subscription0.copy(s5, s6, thumbnailUiState1, function03, s7, s8, v3, v4, z1, function04, function05, s9, list0) : homeSlotUiStateContent$Subscription0.copy(s5, s6, thumbnailUiState1, function03, s7, s8, v3, v4, z1, function04, function05, s9, homeSlotUiStateContent$Subscription0.m);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Subscription)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Subscription)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((Subscription)object0).b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Subscription)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((Subscription)object0).d)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, ((Subscription)object0).e)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.f, ((Subscription)object0).f)) {
                return false;
            }
            if(this.g != ((Subscription)object0).g) {
                return false;
            }
            if(this.h != ((Subscription)object0).h) {
                return false;
            }
            if(this.i != ((Subscription)object0).i) {
                return false;
            }
            if(!Intrinsics.areEqual(this.j, ((Subscription)object0).j)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.k, ((Subscription)object0).k)) {
                return false;
            }
            return Intrinsics.areEqual(this.l, ((Subscription)object0).l) ? Intrinsics.areEqual(this.m, ((Subscription)object0).m) : false;
        }

        @NotNull
        public Subscription follow() {
            return Subscription.copy$default(this, null, null, null, null, null, null, 0, 0, true, null, null, null, null, 0x1EFF, null);
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Followable
        public HomeSlotUiStateContent follow() {
            return this.follow();
        }

        @NotNull
        public final String getBlogDescription() {
            return this.e;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @Nullable
        public ThumbnailUiState getBlogImage() {
            return this.c;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Followable
        @NotNull
        public String getBlogName() {
            return this.l;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @NotNull
        public String getBlogTitle() {
            return this.b;
        }

        @NotNull
        public final List getEntryList() {
            return this.m;
        }

        public final int getFollowerCount() {
            return this.g;
        }

        public final int getFollowerIncreaseCount() {
            return this.h;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent
        @NotNull
        public String getKey() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @NotNull
        public Function0 getOnClickBlog() {
            return this.d;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Followable
        @NotNull
        public Function0 getOnClickFollow() {
            return this.j;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Followable
        @NotNull
        public Function0 getOnClickUnFollow() {
            return this.k;
        }

        @Nullable
        public final String getStoryCreatorLabel() {
            return this.f;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = a.a(this.e, com.kakao.tistory.presentation.main.contract.a.a(this.d, (a.a(this.b, this.a.hashCode() * 0x1F, 0x1F) + (this.c == null ? 0 : this.c.hashCode())) * 0x1F, 0x1F), 0x1F);
            String s = this.f;
            if(s != null) {
                v = s.hashCode();
            }
            return this.m.hashCode() + a.a(this.l, com.kakao.tistory.presentation.main.contract.a.a(this.k, com.kakao.tistory.presentation.main.contract.a.a(this.j, c.a(this.i, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.h, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.g, (v1 + v) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Followable
        public boolean isFollowing() {
            return this.i;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = b.w("Subscription(key=", this.a, ", blogTitle=", this.b, ", blogImage=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", onClickBlog=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", blogDescription=");
            androidx.room.a.w(stringBuilder0, this.e, ", storyCreatorLabel=", this.f, ", followerCount=");
            r0.a.A(stringBuilder0, this.g, ", followerIncreaseCount=", this.h, ", isFollowing=");
            stringBuilder0.append(this.i);
            stringBuilder0.append(", onClickFollow=");
            stringBuilder0.append(this.j);
            stringBuilder0.append(", onClickUnFollow=");
            stringBuilder0.append(this.k);
            stringBuilder0.append(", blogName=");
            stringBuilder0.append(this.l);
            stringBuilder0.append(", entryList=");
            return wb.a.e(stringBuilder0, this.m, ")");
        }

        @NotNull
        public Subscription unFollow() {
            return Subscription.copy$default(this, null, null, null, null, null, null, 0, 0, false, null, null, null, null, 0x1EFF, null);
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Followable
        public HomeSlotUiStateContent unFollow() {
            return this.unFollow();
        }
    }

    @StabilityInferred(parameters = 1)
    @Immutable
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000E\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000F\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0015\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000EJ\u0010\u0010\u0019\u001A\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010\u001D\u001A\u00020\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010\u001BHÖ\u0003¢\u0006\u0004\b\u001D\u0010\u001ER\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000ER\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0010R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\u0007\u0010\u0012R \u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010\u0014¨\u0006*"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$SubscriptionEntry;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Entry;", "", "title", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "thumbnail", "", "isNew", "Lkotlin/Function0;", "", "onClickEntry", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;ZLkotlin/jvm/functions/Function0;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "component3", "()Z", "component4", "()Lkotlin/jvm/functions/Function0;", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;ZLkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$SubscriptionEntry;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getThumbnail", "c", "Z", "d", "Lkotlin/jvm/functions/Function0;", "getOnClickEntry", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHomeSlotUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSlotUiState.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$SubscriptionEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
    public static final class SubscriptionEntry implements Entry {
        public static final int $stable;
        public final String a;
        public final ThumbnailUiState b;
        public final boolean c;
        public final Function0 d;

        public SubscriptionEntry(@NotNull String s, @NotNull ThumbnailUiState thumbnailUiState0, boolean z, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(s, "title");
            Intrinsics.checkNotNullParameter(thumbnailUiState0, "thumbnail");
            Intrinsics.checkNotNullParameter(function00, "onClickEntry");
            super();
            this.a = s;
            this.b = thumbnailUiState0;
            this.c = z;
            this.d = function00;
            if(!this.getThumbnail().isNotBlank()) {
                throw new IllegalArgumentException("Subscription entry thumbnail should not be blank");
            }
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final ThumbnailUiState component2() {
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
        public final SubscriptionEntry copy(@NotNull String s, @NotNull ThumbnailUiState thumbnailUiState0, boolean z, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(s, "title");
            Intrinsics.checkNotNullParameter(thumbnailUiState0, "thumbnail");
            Intrinsics.checkNotNullParameter(function00, "onClickEntry");
            return new SubscriptionEntry(s, thumbnailUiState0, z, function00);
        }

        public static SubscriptionEntry copy$default(SubscriptionEntry homeSlotUiStateContent$SubscriptionEntry0, String s, ThumbnailUiState thumbnailUiState0, boolean z, Function0 function00, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeSlotUiStateContent$SubscriptionEntry0.a;
            }
            if((v & 2) != 0) {
                thumbnailUiState0 = homeSlotUiStateContent$SubscriptionEntry0.b;
            }
            if((v & 4) != 0) {
                z = homeSlotUiStateContent$SubscriptionEntry0.c;
            }
            if((v & 8) != 0) {
                function00 = homeSlotUiStateContent$SubscriptionEntry0.d;
            }
            return homeSlotUiStateContent$SubscriptionEntry0.copy(s, thumbnailUiState0, z, function00);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof SubscriptionEntry)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((SubscriptionEntry)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((SubscriptionEntry)object0).b)) {
                return false;
            }
            return this.c == ((SubscriptionEntry)object0).c ? Intrinsics.areEqual(this.d, ((SubscriptionEntry)object0).d) : false;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public Function0 getOnClickEntry() {
            return this.d;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @Nullable
        public Function0 getOnLongClickEntry() {
            return null;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @Nullable
        public String getSummary() {
            return null;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public ThumbnailUiState getThumbnail() {
            return this.b;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public String getTitle() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.d.hashCode() + c.a(this.c, (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F);
        }

        public final boolean isNew() {
            return this.c;
        }

        @Override
        @NotNull
        public String toString() {
            return "SubscriptionEntry(title=" + this.a + ", thumbnail=" + this.b + ", isNew=" + this.c + ", onClickEntry=" + this.d + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Immutable
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BO\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001A\u00020\u0004\u0012\u0006\u0010\r\u001A\u00020\u0007\u0012\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\n0\t\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0015J\u0016\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0017Jd\u0010\u001B\u001A\u00020\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00072\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\f\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\u00072\u000E\b\u0002\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b\u001D\u0010\u0012J\u0010\u0010\u001F\u001A\u00020\u001EH\u00D6\u0001\u00A2\u0006\u0004\b\u001F\u0010 J\u001A\u0010$\u001A\u00020#2\b\u0010\"\u001A\u0004\u0018\u00010!H\u00D6\u0003\u00A2\u0006\u0004\b$\u0010%R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u0012R\u001A\u0010\u0006\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b)\u0010\'\u001A\u0004\b*\u0010\u0012R\u001C\u0010\b\u001A\u0004\u0018\u00010\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010\u0015R \u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u0010\u0017R\u001A\u0010\f\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b1\u0010\'\u001A\u0004\b2\u0010\u0012R\u001A\u0010\r\u001A\u00020\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b3\u0010,\u001A\u0004\b4\u0010\u0015R \u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b5\u0010/\u001A\u0004\b6\u0010\u0017\u00A8\u00067"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Tip;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Blog;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Entry;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent;", "", "key", "blogTitle", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "blogImage", "Lkotlin/Function0;", "", "onClickBlog", "title", "thumbnail", "onClickEntry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "component4", "()Lkotlin/jvm/functions/Function0;", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Tip;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getKey", "b", "getBlogTitle", "c", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getBlogImage", "d", "Lkotlin/jvm/functions/Function0;", "getOnClickBlog", "e", "getTitle", "f", "getThumbnail", "g", "getOnClickEntry", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Tip implements Blog, Entry, HomeSlotUiStateContent {
        public static final int $stable;
        public final String a;
        public final String b;
        public final ThumbnailUiState c;
        public final Function0 d;
        public final String e;
        public final ThumbnailUiState f;
        public final Function0 g;

        public Tip(@NotNull String s, @NotNull String s1, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, @NotNull String s2, @NotNull ThumbnailUiState thumbnailUiState1, @NotNull Function0 function01) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(function00, "onClickBlog");
            Intrinsics.checkNotNullParameter(s2, "title");
            Intrinsics.checkNotNullParameter(thumbnailUiState1, "thumbnail");
            Intrinsics.checkNotNullParameter(function01, "onClickEntry");
            super();
            this.a = s;
            this.b = s1;
            this.c = thumbnailUiState0;
            this.d = function00;
            this.e = s2;
            this.f = thumbnailUiState1;
            this.g = function01;
        }

        public Tip(String s, String s1, ThumbnailUiState thumbnailUiState0, Function0 function00, String s2, ThumbnailUiState thumbnailUiState1, Function0 function01, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            this(s, s1, ((v & 4) == 0 ? thumbnailUiState0 : null), function00, s2, thumbnailUiState1, function01);
        }

        @NotNull
        public final String component1() {
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

        @NotNull
        public final ThumbnailUiState component6() {
            return this.f;
        }

        @NotNull
        public final Function0 component7() {
            return this.g;
        }

        @NotNull
        public final Tip copy(@NotNull String s, @NotNull String s1, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function0 function00, @NotNull String s2, @NotNull ThumbnailUiState thumbnailUiState1, @NotNull Function0 function01) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(function00, "onClickBlog");
            Intrinsics.checkNotNullParameter(s2, "title");
            Intrinsics.checkNotNullParameter(thumbnailUiState1, "thumbnail");
            Intrinsics.checkNotNullParameter(function01, "onClickEntry");
            return new Tip(s, s1, thumbnailUiState0, function00, s2, thumbnailUiState1, function01);
        }

        public static Tip copy$default(Tip homeSlotUiStateContent$Tip0, String s, String s1, ThumbnailUiState thumbnailUiState0, Function0 function00, String s2, ThumbnailUiState thumbnailUiState1, Function0 function01, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeSlotUiStateContent$Tip0.a;
            }
            if((v & 2) != 0) {
                s1 = homeSlotUiStateContent$Tip0.b;
            }
            if((v & 4) != 0) {
                thumbnailUiState0 = homeSlotUiStateContent$Tip0.c;
            }
            if((v & 8) != 0) {
                function00 = homeSlotUiStateContent$Tip0.d;
            }
            if((v & 16) != 0) {
                s2 = homeSlotUiStateContent$Tip0.e;
            }
            if((v & 0x20) != 0) {
                thumbnailUiState1 = homeSlotUiStateContent$Tip0.f;
            }
            if((v & 0x40) != 0) {
                function01 = homeSlotUiStateContent$Tip0.g;
            }
            return homeSlotUiStateContent$Tip0.copy(s, s1, thumbnailUiState0, function00, s2, thumbnailUiState1, function01);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Tip)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Tip)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((Tip)object0).b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Tip)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((Tip)object0).d)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, ((Tip)object0).e)) {
                return false;
            }
            return Intrinsics.areEqual(this.f, ((Tip)object0).f) ? Intrinsics.areEqual(this.g, ((Tip)object0).g) : false;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @Nullable
        public ThumbnailUiState getBlogImage() {
            return this.c;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @NotNull
        public String getBlogTitle() {
            return this.b;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent
        @NotNull
        public String getKey() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @NotNull
        public Function0 getOnClickBlog() {
            return this.d;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public Function0 getOnClickEntry() {
            return this.g;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @Nullable
        public Function0 getOnLongClickEntry() {
            return null;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @Nullable
        public String getSummary() {
            return null;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public ThumbnailUiState getThumbnail() {
            return this.f;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Entry
        @NotNull
        public String getTitle() {
            return this.e;
        }

        @Override
        public int hashCode() {
            int v = a.a(this.b, this.a.hashCode() * 0x1F, 0x1F);
            return this.c == null ? this.g.hashCode() + (this.f.hashCode() + a.a(this.e, com.kakao.tistory.presentation.main.contract.a.a(this.d, v * 0x1F, 0x1F), 0x1F)) * 0x1F : this.g.hashCode() + (this.f.hashCode() + a.a(this.e, com.kakao.tistory.presentation.main.contract.a.a(this.d, (v + this.c.hashCode()) * 0x1F, 0x1F), 0x1F)) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = b.w("Tip(key=", this.a, ", blogTitle=", this.b, ", blogImage=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", onClickBlog=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", title=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", thumbnail=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", onClickEntry=");
            return q.q(stringBuilder0, this.g, ")");
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001A\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001A\u00020\tX¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\nR\u0018\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\r0\fX¦\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000FR\u0016\u0010\u0010\u001A\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001A\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0005R\u0014\u0010\u0014\u001A\u00020\u00158gX¦\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Today;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent;", "boxTitle", "", "getBoxTitle", "()Ljava/lang/String;", "image", "getImage", "isLight", "", "()Z", "onClick", "Lkotlin/Function0;", "", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "subTitle", "getSubTitle", "title", "getTitle", "typeLabel", "", "getTypeLabel", "()I", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface Today extends HomeSlotUiStateContent {
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Today.DefaultImpls {
            @Nullable
            public static String getSubTitle(@NotNull Today homeSlotUiStateContent$Today0) [...] // Inlined contents
        }

        @Nullable
        String getBoxTitle();

        @NotNull
        String getImage();

        @NotNull
        Function0 getOnClick();

        @Nullable
        String getSubTitle();

        @Nullable
        String getTitle();

        @StringRes
        int getTypeLabel();

        boolean isLight();
    }

    @StabilityInferred(parameters = 1)
    @Immutable
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0083\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u0012\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u0012\u0006\u0010\u0011\u001A\u00020\u0003\u0012\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0015\u001A\u00020\u0014\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u0019J\u0012\u0010\u001D\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u0019J\u0010\u0010\u001E\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u0019J\u0010\u0010\u001F\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J\u0016\u0010!\u001A\b\u0012\u0004\u0012\u00020\r0\fH\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001A\u0004\u0018\u00010\u000FH\u00C6\u0003\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010\u0019J\u0016\u0010&\u001A\b\u0012\u0004\u0012\u00020\r0\fH\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\"J\u0012\u0010\'\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010\u0019J\u0010\u0010(\u001A\u00020\u0014H\u00C6\u0003\u00A2\u0006\u0004\b(\u0010)J\u009A\u0001\u0010*\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001A\u00020\u00032\b\b\u0002\u0010\u000B\u001A\u00020\n2\u000E\b\u0002\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\b\b\u0002\u0010\u0011\u001A\u00020\u00032\u000E\b\u0002\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001A\u00020\u0014H\u00C6\u0001\u00A2\u0006\u0004\b*\u0010+J\u0010\u0010,\u001A\u00020\u0003H\u00D6\u0001\u00A2\u0006\u0004\b,\u0010\u0019J\u0010\u0010-\u001A\u00020\u0005H\u00D6\u0001\u00A2\u0006\u0004\b-\u0010\u001BJ\u001A\u00100\u001A\u00020\n2\b\u0010/\u001A\u0004\u0018\u00010.H\u00D6\u0003\u00A2\u0006\u0004\b0\u00101R\u001A\u0010\u0004\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u0010\u0019R\u001A\u0010\u0006\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010\u001BR\u001A\u0010\u0007\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b8\u00103\u001A\u0004\b9\u0010\u0019R\u001C\u0010\b\u001A\u0004\u0018\u00010\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b:\u00103\u001A\u0004\b;\u0010\u0019R\u001A\u0010\t\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b<\u00103\u001A\u0004\b=\u0010\u0019R\u001A\u0010\u000B\u001A\u00020\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b>\u0010?\u001A\u0004\b\u000B\u0010 R \u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b@\u0010A\u001A\u0004\bB\u0010\"R\u001C\u0010\u0010\u001A\u0004\u0018\u00010\u000F8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bC\u0010D\u001A\u0004\bE\u0010$R\u001A\u0010\u0011\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bF\u00103\u001A\u0004\bG\u0010\u0019R \u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bH\u0010A\u001A\u0004\bI\u0010\"R\u0019\u0010\u0013\u001A\u0004\u0018\u00010\u00038\u0006\u00A2\u0006\f\n\u0004\bJ\u00103\u001A\u0004\bK\u0010\u0019R\u0017\u0010\u0015\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bL\u0010M\u001A\u0004\bN\u0010)\u00A8\u0006O"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$TodayEntry;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Today;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Blog;", "", "key", "", "typeLabel", "image", "boxTitle", "title", "", "isLight", "Lkotlin/Function0;", "", "onClick", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "blogImage", "blogTitle", "onClickBlog", "categoryLabel", "", "categoryId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "()Z", "component7", "()Lkotlin/jvm/functions/Function0;", "component8", "()Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "component9", "component10", "component11", "component12", "()J", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;J)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$TodayEntry;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getKey", "b", "I", "getTypeLabel", "c", "getImage", "d", "getBoxTitle", "e", "getTitle", "f", "Z", "g", "Lkotlin/jvm/functions/Function0;", "getOnClick", "h", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getBlogImage", "i", "getBlogTitle", "j", "getOnClickBlog", "k", "getCategoryLabel", "l", "J", "getCategoryId", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHomeSlotUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSlotUiState.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$TodayEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
    public static final class TodayEntry implements Blog, Today {
        public static final int $stable;
        public final String a;
        public final int b;
        public final String c;
        public final String d;
        public final String e;
        public final boolean f;
        public final Function0 g;
        public final ThumbnailUiState h;
        public final String i;
        public final Function0 j;
        public final String k;
        public final long l;

        public TodayEntry(@NotNull String s, int v, @NotNull String s1, @Nullable String s2, @NotNull String s3, boolean z, @NotNull Function0 function00, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull String s4, @NotNull Function0 function01, @Nullable String s5, long v1) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "image");
            Intrinsics.checkNotNullParameter(s3, "title");
            Intrinsics.checkNotNullParameter(function00, "onClick");
            Intrinsics.checkNotNullParameter(s4, "blogTitle");
            Intrinsics.checkNotNullParameter(function01, "onClickBlog");
            super();
            this.a = s;
            this.b = v;
            this.c = s1;
            this.d = s2;
            this.e = s3;
            this.f = z;
            this.g = function00;
            this.h = thumbnailUiState0;
            this.i = s4;
            this.j = function01;
            this.k = s5;
            this.l = v1;
            if(p.isBlank(this.getImage())) {
                throw new IllegalArgumentException("Today entry image should not be blank");
            }
        }

        public TodayEntry(String s, int v, String s1, String s2, String s3, boolean z, Function0 function00, ThumbnailUiState thumbnailUiState0, String s4, Function0 function01, String s5, long v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
            this(s, ((v2 & 2) == 0 ? v : string.label_home_slot_cover_type_entry), s1, ((v2 & 8) == 0 ? s2 : null), s3, ((v2 & 0x20) == 0 ? z : false), function00, thumbnailUiState0, s4, function01, ((v2 & 0x400) == 0 ? s5 : null), ((v2 & 0x800) == 0 ? v1 : 0L));
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Function0 component10() {
            return this.j;
        }

        @Nullable
        public final String component11() {
            return this.k;
        }

        public final long component12() {
            return this.l;
        }

        public final int component2() {
            return this.b;
        }

        @NotNull
        public final String component3() {
            return this.c;
        }

        @Nullable
        public final String component4() {
            return this.d;
        }

        @NotNull
        public final String component5() {
            return this.e;
        }

        public final boolean component6() {
            return this.f;
        }

        @NotNull
        public final Function0 component7() {
            return this.g;
        }

        @Nullable
        public final ThumbnailUiState component8() {
            return this.h;
        }

        @NotNull
        public final String component9() {
            return this.i;
        }

        @NotNull
        public final TodayEntry copy(@NotNull String s, int v, @NotNull String s1, @Nullable String s2, @NotNull String s3, boolean z, @NotNull Function0 function00, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull String s4, @NotNull Function0 function01, @Nullable String s5, long v1) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "image");
            Intrinsics.checkNotNullParameter(s3, "title");
            Intrinsics.checkNotNullParameter(function00, "onClick");
            Intrinsics.checkNotNullParameter(s4, "blogTitle");
            Intrinsics.checkNotNullParameter(function01, "onClickBlog");
            return new TodayEntry(s, v, s1, s2, s3, z, function00, thumbnailUiState0, s4, function01, s5, v1);
        }

        public static TodayEntry copy$default(TodayEntry homeSlotUiStateContent$TodayEntry0, String s, int v, String s1, String s2, String s3, boolean z, Function0 function00, ThumbnailUiState thumbnailUiState0, String s4, Function0 function01, String s5, long v1, int v2, Object object0) {
            String s6 = (v2 & 1) == 0 ? s : homeSlotUiStateContent$TodayEntry0.a;
            int v3 = (v2 & 2) == 0 ? v : homeSlotUiStateContent$TodayEntry0.b;
            String s7 = (v2 & 4) == 0 ? s1 : homeSlotUiStateContent$TodayEntry0.c;
            String s8 = (v2 & 8) == 0 ? s2 : homeSlotUiStateContent$TodayEntry0.d;
            String s9 = (v2 & 16) == 0 ? s3 : homeSlotUiStateContent$TodayEntry0.e;
            boolean z1 = (v2 & 0x20) == 0 ? z : homeSlotUiStateContent$TodayEntry0.f;
            Function0 function02 = (v2 & 0x40) == 0 ? function00 : homeSlotUiStateContent$TodayEntry0.g;
            ThumbnailUiState thumbnailUiState1 = (v2 & 0x80) == 0 ? thumbnailUiState0 : homeSlotUiStateContent$TodayEntry0.h;
            String s10 = (v2 & 0x100) == 0 ? s4 : homeSlotUiStateContent$TodayEntry0.i;
            Function0 function03 = (v2 & 0x200) == 0 ? function01 : homeSlotUiStateContent$TodayEntry0.j;
            String s11 = (v2 & 0x400) == 0 ? s5 : homeSlotUiStateContent$TodayEntry0.k;
            return (v2 & 0x800) == 0 ? homeSlotUiStateContent$TodayEntry0.copy(s6, v3, s7, s8, s9, z1, function02, thumbnailUiState1, s10, function03, s11, v1) : homeSlotUiStateContent$TodayEntry0.copy(s6, v3, s7, s8, s9, z1, function02, thumbnailUiState1, s10, function03, s11, homeSlotUiStateContent$TodayEntry0.l);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof TodayEntry)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((TodayEntry)object0).a)) {
                return false;
            }
            if(this.b != ((TodayEntry)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((TodayEntry)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((TodayEntry)object0).d)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, ((TodayEntry)object0).e)) {
                return false;
            }
            if(this.f != ((TodayEntry)object0).f) {
                return false;
            }
            if(!Intrinsics.areEqual(this.g, ((TodayEntry)object0).g)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.h, ((TodayEntry)object0).h)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.i, ((TodayEntry)object0).i)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.j, ((TodayEntry)object0).j)) {
                return false;
            }
            return Intrinsics.areEqual(this.k, ((TodayEntry)object0).k) ? this.l == ((TodayEntry)object0).l : false;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @Nullable
        public ThumbnailUiState getBlogImage() {
            return this.h;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @NotNull
        public String getBlogTitle() {
            return this.i;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        @Nullable
        public String getBoxTitle() {
            return this.d;
        }

        public final long getCategoryId() {
            return this.l;
        }

        @Nullable
        public final String getCategoryLabel() {
            return this.k;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        @NotNull
        public String getImage() {
            return this.c;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent
        @NotNull
        public String getKey() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        @NotNull
        public Function0 getOnClick() {
            return this.g;
        }

        @Override  // com.kakao.tistory.presentation.design.ui.list.EntryListUiState$Blog
        @NotNull
        public Function0 getOnClickBlog() {
            return this.j;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        @Nullable
        public String getSubTitle() {
            return null;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        @NotNull
        public String getTitle() {
            return this.e;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        public int getTypeLabel() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = com.kakao.tistory.presentation.main.contract.a.a(this.j, a.a(this.i, (com.kakao.tistory.presentation.main.contract.a.a(this.g, c.a(this.f, a.a(this.e, (a.a(this.c, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F) + (this.d == null ? 0 : this.d.hashCode())) * 0x1F, 0x1F), 0x1F), 0x1F) + (this.h == null ? 0 : this.h.hashCode())) * 0x1F, 0x1F), 0x1F);
            String s = this.k;
            if(s != null) {
                v = s.hashCode();
            }
            return Long.hashCode(this.l) + (v1 + v) * 0x1F;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        public boolean isLight() {
            return this.f;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("TodayEntry(key=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", typeLabel=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", image=");
            androidx.room.a.w(stringBuilder0, this.c, ", boxTitle=", this.d, ", title=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", isLight=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", onClick=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", blogImage=");
            stringBuilder0.append(this.h);
            stringBuilder0.append(", blogTitle=");
            stringBuilder0.append(this.i);
            stringBuilder0.append(", onClickBlog=");
            stringBuilder0.append(this.j);
            stringBuilder0.append(", categoryLabel=");
            stringBuilder0.append(this.k);
            stringBuilder0.append(", categoryId=");
            stringBuilder0.append(this.l);
            stringBuilder0.append(")");
            return stringBuilder0.toString();
        }
    }

    @StabilityInferred(parameters = 1)
    @Immutable
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0012J\u0016\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0012\u0010\u001B\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0012J\u0012\u0010\u001C\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u0012Jl\u0010\u001D\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00022\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001A\u00020\u000B2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u001F\u0010\u0012J\u0010\u0010 \u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b \u0010\u0014J\u001A\u0010#\u001A\u00020\u000B2\b\u0010\"\u001A\u0004\u0018\u00010!H\u00D6\u0003\u00A2\u0006\u0004\b#\u0010$R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0012R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010\u0014R\u001A\u0010\u0006\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b+\u0010&\u001A\u0004\b,\u0010\u0012R\u001C\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b-\u0010&\u001A\u0004\b.\u0010\u0012R \u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u0018R\u001A\u0010\f\u001A\u00020\u000B8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b\f\u0010\u001AR\u001C\u0010\r\u001A\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b4\u0010&\u001A\u0004\b5\u0010\u0012R\u001C\u0010\u000E\u001A\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b6\u0010&\u001A\u0004\b7\u0010\u0012\u00A8\u00068"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$TodayEvent;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Today;", "", "key", "", "typeLabel", "image", "boxTitle", "Lkotlin/Function0;", "", "onClick", "", "isLight", "title", "subTitle", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "()Lkotlin/jvm/functions/Function0;", "component6", "()Z", "component7", "component8", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$TodayEvent;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getKey", "b", "I", "getTypeLabel", "c", "getImage", "d", "getBoxTitle", "e", "Lkotlin/jvm/functions/Function0;", "getOnClick", "f", "Z", "g", "getTitle", "h", "getSubTitle", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHomeSlotUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSlotUiState.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$TodayEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
    public static final class TodayEvent implements Today {
        public static final int $stable;
        public final String a;
        public final int b;
        public final String c;
        public final String d;
        public final Function0 e;
        public final boolean f;
        public final String g;
        public final String h;

        public TodayEvent(@NotNull String s, int v, @NotNull String s1, @Nullable String s2, @NotNull Function0 function00, boolean z, @Nullable String s3, @Nullable String s4) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "image");
            Intrinsics.checkNotNullParameter(function00, "onClick");
            super();
            this.a = s;
            this.b = v;
            this.c = s1;
            this.d = s2;
            this.e = function00;
            this.f = z;
            this.g = s3;
            this.h = s4;
            if(p.isBlank(this.getImage())) {
                throw new IllegalArgumentException("Today event image should not be blank");
            }
        }

        public TodayEvent(String s, int v, String s1, String s2, Function0 function00, boolean z, String s3, String s4, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            this(s, ((v1 & 2) == 0 ? v : string.label_home_slot_cover_type_event), s1, ((v1 & 8) == 0 ? s2 : null), function00, z, ((v1 & 0x40) == 0 ? s3 : null), ((v1 & 0x80) == 0 ? s4 : null));
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        @NotNull
        public final String component3() {
            return this.c;
        }

        @Nullable
        public final String component4() {
            return this.d;
        }

        @NotNull
        public final Function0 component5() {
            return this.e;
        }

        public final boolean component6() {
            return this.f;
        }

        @Nullable
        public final String component7() {
            return this.g;
        }

        @Nullable
        public final String component8() {
            return this.h;
        }

        @NotNull
        public final TodayEvent copy(@NotNull String s, int v, @NotNull String s1, @Nullable String s2, @NotNull Function0 function00, boolean z, @Nullable String s3, @Nullable String s4) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "image");
            Intrinsics.checkNotNullParameter(function00, "onClick");
            return new TodayEvent(s, v, s1, s2, function00, z, s3, s4);
        }

        public static TodayEvent copy$default(TodayEvent homeSlotUiStateContent$TodayEvent0, String s, int v, String s1, String s2, Function0 function00, boolean z, String s3, String s4, int v1, Object object0) {
            String s5 = (v1 & 1) == 0 ? s : homeSlotUiStateContent$TodayEvent0.a;
            int v2 = (v1 & 2) == 0 ? v : homeSlotUiStateContent$TodayEvent0.b;
            String s6 = (v1 & 4) == 0 ? s1 : homeSlotUiStateContent$TodayEvent0.c;
            String s7 = (v1 & 8) == 0 ? s2 : homeSlotUiStateContent$TodayEvent0.d;
            Function0 function01 = (v1 & 16) == 0 ? function00 : homeSlotUiStateContent$TodayEvent0.e;
            boolean z1 = (v1 & 0x20) == 0 ? z : homeSlotUiStateContent$TodayEvent0.f;
            String s8 = (v1 & 0x40) == 0 ? s3 : homeSlotUiStateContent$TodayEvent0.g;
            return (v1 & 0x80) == 0 ? homeSlotUiStateContent$TodayEvent0.copy(s5, v2, s6, s7, function01, z1, s8, s4) : homeSlotUiStateContent$TodayEvent0.copy(s5, v2, s6, s7, function01, z1, s8, homeSlotUiStateContent$TodayEvent0.h);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof TodayEvent)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((TodayEvent)object0).a)) {
                return false;
            }
            if(this.b != ((TodayEvent)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((TodayEvent)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((TodayEvent)object0).d)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, ((TodayEvent)object0).e)) {
                return false;
            }
            if(this.f != ((TodayEvent)object0).f) {
                return false;
            }
            return Intrinsics.areEqual(this.g, ((TodayEvent)object0).g) ? Intrinsics.areEqual(this.h, ((TodayEvent)object0).h) : false;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        @Nullable
        public String getBoxTitle() {
            return this.d;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        @NotNull
        public String getImage() {
            return this.c;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent
        @NotNull
        public String getKey() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        @NotNull
        public Function0 getOnClick() {
            return this.e;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        @Nullable
        public String getSubTitle() {
            return this.h;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        @Nullable
        public String getTitle() {
            return this.g;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        public int getTypeLabel() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = c.a(this.f, com.kakao.tistory.presentation.main.contract.a.a(this.e, (a.a(this.c, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F) + (this.d == null ? 0 : this.d.hashCode())) * 0x1F, 0x1F), 0x1F);
            int v2 = this.g == null ? 0 : this.g.hashCode();
            String s = this.h;
            if(s != null) {
                v = s.hashCode();
            }
            return (v1 + v2) * 0x1F + v;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        public boolean isLight() {
            return this.f;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("TodayEvent(key=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", typeLabel=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", image=");
            androidx.room.a.w(stringBuilder0, this.c, ", boxTitle=", this.d, ", onClick=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", isLight=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", title=");
            return b.r(stringBuilder0, this.g, ", subTitle=", this.h, ")");
        }
    }

    @StabilityInferred(parameters = 1)
    @Immutable
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0012J\u0016\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0012\u0010\u001B\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0012J\u0012\u0010\u001C\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u0012Jl\u0010\u001D\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00022\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001A\u00020\u000B2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u001F\u0010\u0012J\u0010\u0010 \u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b \u0010\u0014J\u001A\u0010#\u001A\u00020\u000B2\b\u0010\"\u001A\u0004\u0018\u00010!H\u00D6\u0003\u00A2\u0006\u0004\b#\u0010$R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0012R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010\u0014R\u001A\u0010\u0006\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b+\u0010&\u001A\u0004\b,\u0010\u0012R\u001C\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b-\u0010&\u001A\u0004\b.\u0010\u0012R \u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u0018R\u001A\u0010\f\u001A\u00020\u000B8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b\f\u0010\u001AR\u001C\u0010\r\u001A\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b4\u0010&\u001A\u0004\b5\u0010\u0012R\u001C\u0010\u000E\u001A\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b6\u0010&\u001A\u0004\b7\u0010\u0012\u00A8\u00068"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$TodayNotification;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Today;", "", "key", "", "typeLabel", "image", "boxTitle", "Lkotlin/Function0;", "", "onClick", "", "isLight", "title", "subTitle", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "()Lkotlin/jvm/functions/Function0;", "component6", "()Z", "component7", "component8", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$TodayNotification;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getKey", "b", "I", "getTypeLabel", "c", "getImage", "d", "getBoxTitle", "e", "Lkotlin/jvm/functions/Function0;", "getOnClick", "f", "Z", "g", "getTitle", "h", "getSubTitle", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHomeSlotUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeSlotUiState.kt\ncom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$TodayNotification\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
    public static final class TodayNotification implements Today {
        public static final int $stable;
        public final String a;
        public final int b;
        public final String c;
        public final String d;
        public final Function0 e;
        public final boolean f;
        public final String g;
        public final String h;

        public TodayNotification(@NotNull String s, int v, @NotNull String s1, @Nullable String s2, @NotNull Function0 function00, boolean z, @Nullable String s3, @Nullable String s4) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "image");
            Intrinsics.checkNotNullParameter(function00, "onClick");
            super();
            this.a = s;
            this.b = v;
            this.c = s1;
            this.d = s2;
            this.e = function00;
            this.f = z;
            this.g = s3;
            this.h = s4;
            if(p.isBlank(this.getImage())) {
                throw new IllegalArgumentException("Today notification image should not be blank");
            }
        }

        public TodayNotification(String s, int v, String s1, String s2, Function0 function00, boolean z, String s3, String s4, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            this(s, ((v1 & 2) == 0 ? v : string.label_home_slot_cover_type_notification), s1, ((v1 & 8) == 0 ? s2 : null), function00, z, ((v1 & 0x40) == 0 ? s3 : null), ((v1 & 0x80) == 0 ? s4 : null));
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        @NotNull
        public final String component3() {
            return this.c;
        }

        @Nullable
        public final String component4() {
            return this.d;
        }

        @NotNull
        public final Function0 component5() {
            return this.e;
        }

        public final boolean component6() {
            return this.f;
        }

        @Nullable
        public final String component7() {
            return this.g;
        }

        @Nullable
        public final String component8() {
            return this.h;
        }

        @NotNull
        public final TodayNotification copy(@NotNull String s, int v, @NotNull String s1, @Nullable String s2, @NotNull Function0 function00, boolean z, @Nullable String s3, @Nullable String s4) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s1, "image");
            Intrinsics.checkNotNullParameter(function00, "onClick");
            return new TodayNotification(s, v, s1, s2, function00, z, s3, s4);
        }

        public static TodayNotification copy$default(TodayNotification homeSlotUiStateContent$TodayNotification0, String s, int v, String s1, String s2, Function0 function00, boolean z, String s3, String s4, int v1, Object object0) {
            String s5 = (v1 & 1) == 0 ? s : homeSlotUiStateContent$TodayNotification0.a;
            int v2 = (v1 & 2) == 0 ? v : homeSlotUiStateContent$TodayNotification0.b;
            String s6 = (v1 & 4) == 0 ? s1 : homeSlotUiStateContent$TodayNotification0.c;
            String s7 = (v1 & 8) == 0 ? s2 : homeSlotUiStateContent$TodayNotification0.d;
            Function0 function01 = (v1 & 16) == 0 ? function00 : homeSlotUiStateContent$TodayNotification0.e;
            boolean z1 = (v1 & 0x20) == 0 ? z : homeSlotUiStateContent$TodayNotification0.f;
            String s8 = (v1 & 0x40) == 0 ? s3 : homeSlotUiStateContent$TodayNotification0.g;
            return (v1 & 0x80) == 0 ? homeSlotUiStateContent$TodayNotification0.copy(s5, v2, s6, s7, function01, z1, s8, s4) : homeSlotUiStateContent$TodayNotification0.copy(s5, v2, s6, s7, function01, z1, s8, homeSlotUiStateContent$TodayNotification0.h);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof TodayNotification)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((TodayNotification)object0).a)) {
                return false;
            }
            if(this.b != ((TodayNotification)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((TodayNotification)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((TodayNotification)object0).d)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, ((TodayNotification)object0).e)) {
                return false;
            }
            if(this.f != ((TodayNotification)object0).f) {
                return false;
            }
            return Intrinsics.areEqual(this.g, ((TodayNotification)object0).g) ? Intrinsics.areEqual(this.h, ((TodayNotification)object0).h) : false;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        @Nullable
        public String getBoxTitle() {
            return this.d;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        @NotNull
        public String getImage() {
            return this.c;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent
        @NotNull
        public String getKey() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        @NotNull
        public Function0 getOnClick() {
            return this.e;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        @Nullable
        public String getSubTitle() {
            return this.h;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        @Nullable
        public String getTitle() {
            return this.g;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        public int getTypeLabel() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = c.a(this.f, com.kakao.tistory.presentation.main.contract.a.a(this.e, (a.a(this.c, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F) + (this.d == null ? 0 : this.d.hashCode())) * 0x1F, 0x1F), 0x1F);
            int v2 = this.g == null ? 0 : this.g.hashCode();
            String s = this.h;
            if(s != null) {
                v = s.hashCode();
            }
            return (v1 + v2) * 0x1F + v;
        }

        @Override  // com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent$Today
        public boolean isLight() {
            return this.f;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("TodayNotification(key=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", typeLabel=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", image=");
            androidx.room.a.w(stringBuilder0, this.c, ", boxTitle=", this.d, ", onClick=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", isLight=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", title=");
            return b.r(stringBuilder0, this.g, ", subTitle=", this.h, ")");
        }
    }

    @NotNull
    String getKey();
}

