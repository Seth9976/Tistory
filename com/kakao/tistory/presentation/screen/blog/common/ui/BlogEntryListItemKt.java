package com.kakao.tistory.presentation.screen.blog.common.ui;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.design.ui.list.EntryListKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogEntry;
import com.kakao.tistory.presentation.widget.common.ListItemDividerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0015\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001A\u0011\u0010\u0005\u001A\u00020\u0006*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0007\u001A\u0013\u0010\b\u001A\u0004\u0018\u00010\t*\u00020\u0003H\u0007¢\u0006\u0002\u0010\n\u001A\u0011\u0010\u000B\u001A\u00020\u0006*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\f"}, d2 = {"BlogEntryListItem", "", "entry", "Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEntry;", "(Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEntry;Landroidx/compose/runtime/Composer;I)V", "getSummary", "Landroidx/compose/ui/text/AnnotatedString;", "(Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEntry;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "getThumbnail", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "(Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEntry;Landroidx/compose/runtime/Composer;I)Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "getTitle", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogEntryListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogEntryListItem.kt\ncom/kakao/tistory/presentation/screen/blog/common/ui/BlogEntryListItemKt\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,75:1\n1240#2:76\n1039#2,6:77\n1039#2,6:83\n1039#2,6:89\n1240#2:95\n*S KotlinDebug\n*F\n+ 1 BlogEntryListItem.kt\ncom/kakao/tistory/presentation/screen/blog/common/ui/BlogEntryListItemKt\n*L\n33#1:76\n38#1:77,6\n43#1:83,6\n55#1:89,6\n65#1:95\n*E\n"})
public final class BlogEntryListItemKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogEntryListItem(@NotNull BlogEntry blogEntry0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(blogEntry0, "entry");
        Composer composer1 = composer0.startRestartGroup(0xF523CF55);
        int v1 = (v & 14) == 0 ? (composer1.changed(blogEntry0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF523CF55, v1, -1, "com.kakao.tistory.presentation.screen.blog.common.ui.BlogEntryListItem (BlogEntryListItem.kt:15)");
            }
            EntryListKt.EntryListItem(blogEntry0.getOnClickEntry(), blogEntry0.getOnLongClickEntry(), false, null, null, BlogEntryListItemKt.getTitle(blogEntry0, composer1, v1 & 14), BlogEntryListItemKt.getSummary(blogEntry0, composer1, v1 & 14), BlogEntryListItemKt.getThumbnail(blogEntry0, composer1, v1 & 14), blogEntry0.getLikeCount(), blogEntry0.getCommentCount(), blogEntry0.getPublishedDate(), blogEntry0.getScheduled(), blogEntry0.getVisibility(), composer1, 0, 0, 28);
            ListItemDividerKt.ListItemDivider-rAjV9yQ(false, 0.0f, composer1, 0, 3);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(blogEntry0, v));
        }
    }

    @Composable
    @NotNull
    public static final AnnotatedString getSummary(@NotNull BlogEntry blogEntry0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(blogEntry0, "<this>");
        composer0.startReplaceGroup(139023675);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(139023675, v, -1, "com.kakao.tistory.presentation.screen.blog.common.ui.getSummary (BlogEntryListItem.kt:64)");
        }
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        composer0.startReplaceGroup(0xFB7DED13);
        if(blogEntry0.getRestrictType() == null || blogEntry0.isMyBlog()) {
            annotatedString$Builder0.append(blogEntry0.getSummary());
        }
        else {
            annotatedString$Builder0.append(StringResources_androidKt.stringResource(blogEntry0.getRestrictType().getEntryMessageStringId(), composer0, 0));
        }
        composer0.endReplaceGroup();
        AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return annotatedString0;
    }

    @Composable
    @Nullable
    public static final ThumbnailUiState getThumbnail(@NotNull BlogEntry blogEntry0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(blogEntry0, "<this>");
        composer0.startReplaceGroup(0x3AAB7153);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3AAB7153, v, -1, "com.kakao.tistory.presentation.screen.blog.common.ui.getThumbnail (BlogEntryListItem.kt:73)");
        }
        ThumbnailUiState thumbnailUiState0 = blogEntry0.getRestrictType() == null || blogEntry0.isMyBlog() ? blogEntry0.getThumbnail() : null;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return thumbnailUiState0;
    }

    @Composable
    @NotNull
    public static final AnnotatedString getTitle(@NotNull BlogEntry blogEntry0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(blogEntry0, "<this>");
        composer0.startReplaceGroup(-660298643);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-660298643, v, -1, "com.kakao.tistory.presentation.screen.blog.common.ui.getTitle (BlogEntryListItem.kt:32)");
        }
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        SpanStyle spanStyle0 = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFE, null);
        if(blogEntry0.isMyBlog()) {
            composer0.startReplaceGroup(0xDF094D3B);
            composer0.startReplaceGroup(-294934604);
            if(blogEntry0.getRestrictType() != null) {
                int v1 = annotatedString$Builder0.pushStyle(spanStyle0);
                try {
                    annotatedString$Builder0.append(StringResources_androidKt.stringResource(blogEntry0.getRestrictType().getTitlePrefixStringRes(), composer0, 0));
                }
                finally {
                    annotatedString$Builder0.pop(v1);
                }
            }
            composer0.endReplaceGroup();
            if(blogEntry0.isChallenge()) {
                int v3 = annotatedString$Builder0.pushStyle(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFE, null));
                try {
                    annotatedString$Builder0.append(StringResources_androidKt.stringResource(string.label_entry_challenge, composer0, 0));
                }
                finally {
                    annotatedString$Builder0.pop(v3);
                }
            }
            if(blogEntry0.getRestrictType() != null || blogEntry0.isChallenge()) {
                annotatedString$Builder0.append(" ");
            }
            annotatedString$Builder0.append(blogEntry0.getTitle());
        }
        else {
            composer0.startReplaceGroup(0xDF1066BA);
            if(blogEntry0.getRestrictType() == null) {
                annotatedString$Builder0.append(blogEntry0.getTitle());
            }
            else {
                int v5 = annotatedString$Builder0.pushStyle(spanStyle0);
                try {
                    annotatedString$Builder0.append(StringResources_androidKt.stringResource(blogEntry0.getRestrictType().getTitleStringId(), composer0, 0));
                }
                finally {
                    annotatedString$Builder0.pop(v5);
                }
            }
        }
        composer0.endReplaceGroup();
        AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return annotatedString0;
    }
}

