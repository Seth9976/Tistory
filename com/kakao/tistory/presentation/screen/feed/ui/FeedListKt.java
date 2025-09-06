package com.kakao.tistory.presentation.screen.feed.ui;

import a;
import android.util.LongSparseArray;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.design.ui.list.EntryListKt;
import com.kakao.tistory.presentation.screen.feed.FeedViewModel;
import com.kakao.tistory.presentation.screen.feed.contract.FeedEntry;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.widget.common.ListItemDividerKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001A-\u0010\b\u001A\u00020\u00072\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u0010²\u0006\u0014\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\n8\nX\u008A\u0084\u0002²\u0006\u0014\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u000F\u001A\u0004\u0018\u00010\r8\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/paging/compose/LazyPagingItems;", "Lcom/kakao/tistory/presentation/screen/feed/contract/FeedEntry;", "feed", "Lcom/kakao/tistory/presentation/screen/feed/FeedViewModel;", "feedViewModel", "", "showEmpty", "", "FeedList", "(Landroidx/paging/compose/LazyPagingItems;Lcom/kakao/tistory/presentation/screen/feed/FeedViewModel;ZLandroidx/compose/runtime/Composer;I)V", "Landroid/util/LongSparseArray;", "Lcom/kakao/tistory/domain/entity/entry/LikeState;", "updatedLikeStates", "", "updatedCommentCounts", "followingCount", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFeedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedList.kt\ncom/kakao/tistory/presentation/screen/feed/ui/FeedListKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,90:1\n148#2:91\n71#3:92\n68#3,6:93\n74#3:127\n78#3:131\n78#4,6:99\n85#4,4:114\n89#4,2:124\n93#4:130\n368#5,9:105\n377#5:126\n378#5,2:128\n4032#6,6:118\n1223#7,6:132\n81#8:138\n81#8:139\n81#8:140\n*S KotlinDebug\n*F\n+ 1 FeedList.kt\ncom/kakao/tistory/presentation/screen/feed/ui/FeedListKt\n*L\n56#1:91\n56#1:92\n56#1:93,6\n56#1:127\n56#1:131\n56#1:99,6\n56#1:114,4\n56#1:124,2\n56#1:130\n56#1:105,9\n56#1:126\n56#1:128,2\n56#1:118,6\n71#1:132,6\n28#1:138\n29#1:139\n54#1:140\n*E\n"})
public final class FeedListKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void FeedList(@NotNull LazyPagingItems lazyPagingItems0, @NotNull FeedViewModel feedViewModel0, boolean z, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(lazyPagingItems0, "feed");
        Intrinsics.checkNotNullParameter(feedViewModel0, "feedViewModel");
        Composer composer1 = composer0.startRestartGroup(1280240868);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1280240868, v, -1, "com.kakao.tistory.presentation.screen.feed.ui.FeedList (FeedList.kt:26)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(feedViewModel0.getUpdatedLikeStates(), composer1, 8);
        State state1 = LiveDataAdapterKt.observeAsState(feedViewModel0.getUpdatedCommentCounts(), composer1, 8);
        LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, null, false, null, null, null, false, new g(lazyPagingItems0, z, feedViewModel0, state0, state1), composer1, 6, 0xFE);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(lazyPagingItems0, feedViewModel0, z, v));
        }
    }

    public static final void access$EmptyItem(FeedViewModel feedViewModel0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1681631012);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1681631012, v, -1, "com.kakao.tistory.presentation.screen.feed.ui.EmptyItem (FeedList.kt:52)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(feedViewModel0.getFollowingCount(), composer1, 8);
        Modifier modifier0 = PaddingKt.padding-VpY3zN4(Modifier.Companion, 20.0f, 12.0f);
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function00);
        }
        else {
            composer1.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        Long long0 = (Long)state0.getValue();
        TextKt.Text--4IGK_g(StringResources_androidKt.stringResource((long0 == null || ((long)long0) != 0L ? string.label_feed_empty_latest_90_entry : string.label_feed_empty_follower), composer1, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize13Weight400(), composer1, 0x180, 0x180000, 0xFFFA);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new com.kakao.tistory.presentation.screen.feed.ui.a(feedViewModel0, v));
        }
    }

    public static final void access$FeedItem(int v, FeedEntry feedEntry0, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xD52D67DA);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(feedEntry0) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD52D67DA, v2, -1, "com.kakao.tistory.presentation.screen.feed.ui.FeedItem (FeedList.kt:68)");
            }
            composer1.startReplaceGroup(472660905);
            b b0 = composer1.rememberedValue();
            if((((v2 & 0x70) == 0x20 ? 1 : 0) | ((v2 & 14) == 4 ? 1 : 0)) != 0 || b0 == Composer.Companion.getEmpty()) {
                b0 = new b(feedEntry0, v);
                composer1.updateRememberedValue(b0);
            }
            composer1.endReplaceGroup();
            EntryListKt.EntryListItem(b0, null, false, null, ComposableLambdaKt.rememberComposableLambda(0x8BDAF4A6, true, new c(feedEntry0), composer1, 54), new AnnotatedString(feedEntry0.getTitle(), null, null, 6, null), new AnnotatedString(feedEntry0.getSummary(), null, null, 6, null), feedEntry0.getThumbnail(), feedEntry0.getLikeCount(), feedEntry0.getCommentCount(), feedEntry0.getPublishedDate(), false, null, composer1, 0x6000, 0, 0x180E);
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
            scopeUpdateScope0.updateScope(new com.kakao.tistory.presentation.screen.feed.ui.d(v, feedEntry0, v1));
        }
    }

    public static final LongSparseArray access$FeedList$lambda$0(State state0) {
        return (LongSparseArray)state0.getValue();
    }

    public static final LongSparseArray access$FeedList$lambda$1(State state0) {
        return (LongSparseArray)state0.getValue();
    }
}

