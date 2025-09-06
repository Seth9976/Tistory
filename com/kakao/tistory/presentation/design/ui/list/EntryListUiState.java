package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.runtime.Immutable;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState;", "", "Blog", "Entry", "EntryInfo", "Visibility", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface EntryListUiState {
    @Immutable
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001A\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0018\u0010\n\u001A\b\u0012\u0004\u0012\u00020\f0\u000BX¦\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Blog;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState;", "blogImage", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getBlogImage", "()Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "blogTitle", "", "getBlogTitle", "()Ljava/lang/String;", "onClickBlog", "Lkotlin/Function0;", "", "getOnClickBlog", "()Lkotlin/jvm/functions/Function0;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface Blog extends EntryListUiState {
        @Nullable
        ThumbnailUiState getBlogImage();

        @NotNull
        String getBlogTitle();

        @NotNull
        Function0 getOnClickBlog();
    }

    @Immutable
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u001C\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001A\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\fR\u0014\u0010\r\u001A\u0004\u0018\u00010\u000EX¦\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0012\u0010\u0011\u001A\u00020\nX¦\u0004¢\u0006\u0006\u001A\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Entry;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState;", "onClickEntry", "Lkotlin/Function0;", "", "getOnClickEntry", "()Lkotlin/jvm/functions/Function0;", "onLongClickEntry", "getOnLongClickEntry", "summary", "", "getSummary", "()Ljava/lang/String;", "thumbnail", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getThumbnail", "()Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "title", "getTitle", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface Entry extends EntryListUiState {
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
        public static final class DefaultImpls {
            @Nullable
            public static Function0 getOnLongClickEntry(@NotNull Entry entryListUiState$Entry0) [...] // Inlined contents

            @Nullable
            public static String getSummary(@NotNull Entry entryListUiState$Entry0) [...] // Inlined contents
        }

        @NotNull
        Function0 getOnClickEntry();

        @Nullable
        Function0 getOnLongClickEntry();

        @Nullable
        String getSummary();

        @Nullable
        ThumbnailUiState getThumbnail();

        @NotNull
        String getTitle();
    }

    @Immutable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001A\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u0005R\u0016\u0010\u000B\u001A\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000ER\u0014\u0010\u000F\u001A\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001A\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$EntryInfo;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState;", "commentCount", "", "getCommentCount", "()I", "count", "getCount", "()Ljava/lang/Integer;", "likeCount", "getLikeCount", "publishedDate", "", "getPublishedDate", "()Ljava/lang/String;", "scheduled", "", "getScheduled", "()Z", "visibility", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Visibility;", "getVisibility", "()Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Visibility;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface EntryInfo extends EntryListUiState {
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.presentation.design.ui.list.EntryListUiState.EntryInfo.DefaultImpls {
            @Nullable
            public static Integer getCount(@NotNull EntryInfo entryListUiState$EntryInfo0) [...] // Inlined contents

            @Nullable
            public static String getPublishedDate(@NotNull EntryInfo entryListUiState$EntryInfo0) [...] // Inlined contents

            public static boolean getScheduled(@NotNull EntryInfo entryListUiState$EntryInfo0) [...] // Inlined contents

            @NotNull
            public static Visibility getVisibility(@NotNull EntryInfo entryListUiState$EntryInfo0) {
                return Visibility.NORMAL;
            }
        }

        int getCommentCount();

        @Nullable
        Integer getCount();

        int getLikeCount();

        @Nullable
        String getPublishedDate();

        boolean getScheduled();

        @NotNull
        Visibility getVisibility();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006j\u0002\b\u000Bj\u0002\b\fj\u0002\b\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Visibility;", "", "", "a", "Ljava/lang/Integer;", "getIconRes", "()Ljava/lang/Integer;", "iconRes", "b", "getContentDesc", "contentDesc", "NORMAL", "PRIVATE", "PROTECTED", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum Visibility {
        NORMAL(null, null),
        PRIVATE(drawable.ico_list_private, string.content_desc_private),
        PROTECTED(drawable.ico_list_protected, string.content_desc_protected);

        public final Integer a;
        public final Integer b;
        public static final Visibility[] c;
        public static final EnumEntries d;

        static {
            Visibility.c = arr_entryListUiState$Visibility;
            Intrinsics.checkNotNullParameter(arr_entryListUiState$Visibility, "entries");
            Visibility.d = new a(arr_entryListUiState$Visibility);
        }

        public Visibility(Integer integer0, Integer integer1) {
            this.a = integer0;
            this.b = integer1;
        }

        @Nullable
        public final Integer getContentDesc() {
            return this.b;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return Visibility.d;
        }

        @Nullable
        public final Integer getIconRes() {
            return this.a;
        }
    }

}

