package com.kakao.tistory.presentation.screen.home.ui.common;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.design.ui.list.EntryListKt;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Entry;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.EntryInfo;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.widget.common.ListItemDividerKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001AY\u0010\u0000\u001A\u00020\u0001\"\u0010\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001A\u0002H\u00022&\u0010\u0007\u001A\"\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\r2\b\b\u0002\u0010\u000E\u001A\u00020\tH\u0007¢\u0006\u0002\u0010\u000F\u001A1\u0010\u0010\u001A\u00020\u0001\"\u0010\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001A\u0002H\u00022\b\b\u0002\u0010\u000E\u001A\u00020\tH\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"SlotEntryListItemWithBlog", "", "T", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Entry;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Blog;", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$EntryInfo;", "content", "blogTitle", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "clickable", "Landroidx/compose/runtime/Composable;", "showTopDivider", "(Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Entry;Lkotlin/jvm/functions/Function3;ZLandroidx/compose/runtime/Composer;II)V", "SlotEntryListItemWithBlogThumbnail", "(Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Entry;ZLandroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotEntryListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotEntryListItem.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotEntryListItemKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,59:1\n77#2:60\n85#3:61\n81#3,7:62\n88#3:97\n92#3:102\n78#4,6:69\n85#4,4:84\n89#4,2:94\n93#4:101\n368#5,9:75\n377#5:96\n378#5,2:99\n4032#6,6:88\n148#7:98\n*S KotlinDebug\n*F\n+ 1 SlotEntryListItem.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotEntryListItemKt\n*L\n19#1:60\n22#1:61\n22#1:62,7\n22#1:97\n22#1:102\n22#1:69,6\n22#1:84,4\n22#1:94,2\n22#1:101\n22#1:75,9\n22#1:96\n22#1:99,2\n22#1:88,6\n30#1:98\n*E\n"})
public final class SlotEntryListItemKt {
    @Composable
    public static final void SlotEntryListItemWithBlog(@NotNull Entry entryListUiState$Entry0, @NotNull Function3 function30, boolean z, @Nullable Composer composer0, int v, int v1) {
        boolean z1;
        int v2;
        Intrinsics.checkNotNullParameter(entryListUiState$Entry0, "content");
        Intrinsics.checkNotNullParameter(function30, "blogTitle");
        Composer composer1 = composer0.startRestartGroup(0x8B81E675);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(entryListUiState$Entry0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            z1 = (v1 & 4) == 0 ? z : false;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8B81E675, v2, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotEntryListItemWithBlog (SlotEntryListItem.kt:17)");
            }
            boolean z2 = ((Boolean)composer1.consume(SlotContainerKt.getLocalLoadingState())).booleanValue();
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            r0.a.z(composeUiNode$Companion0, composer1, modifier0, composer1, 300586469);
            if(z1) {
                ListItemDividerKt.ListItemDivider-rAjV9yQ(false, 0.0f, composer1, 0, 3);
            }
            composer1.endReplaceGroup();
            Function0 function01 = entryListUiState$Entry0.getOnClickEntry();
            PaddingValues paddingValues0 = PaddingKt.PaddingValues-a9UjIt4(20.0f, 16.0f, 20.0f, 22.0f);
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xA79B9F9F, true, new z(function30, !z2), composer1, 54);
            String s = entryListUiState$Entry0.getTitle();
            AnnotatedString annotatedString0 = StringUtils.INSTANCE.asAnnotationString(s);
            ThumbnailUiState thumbnailUiState0 = entryListUiState$Entry0.getThumbnail();
            int v4 = ((EntryInfo)entryListUiState$Entry0).getLikeCount();
            Integer integer0 = ((EntryInfo)entryListUiState$Entry0).getCommentCount();
            String s1 = ((EntryInfo)entryListUiState$Entry0).getPublishedDate();
            if(s1 == null) {
                s1 = "";
            }
            EntryListKt.EntryListItem(function01, null, !z2, paddingValues0, composableLambda0, annotatedString0, null, thumbnailUiState0, v4, integer0, s1, false, null, composer1, 0x186000, 0, 0x1802);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a0(entryListUiState$Entry0, function30, z1, v, v1));
        }
    }

    @Composable
    public static final void SlotEntryListItemWithBlogThumbnail(@NotNull Entry entryListUiState$Entry0, boolean z, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Intrinsics.checkNotNullParameter(entryListUiState$Entry0, "content");
        Composer composer1 = composer0.startRestartGroup(0x47987056);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(entryListUiState$Entry0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                z = false;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x47987056, v2, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotEntryListItemWithBlogThumbnail (SlotEntryListItem.kt:45)");
            }
            SlotEntryListItemKt.SlotEntryListItemWithBlog(entryListUiState$Entry0, ComposableLambdaKt.rememberComposableLambda(-209484957, true, new b0(entryListUiState$Entry0), composer1, 54), z, composer1, v2 & 8 | 0x30 | v2 & 14 | v2 << 3 & 0x380, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c0(entryListUiState$Entry0, z, v, v1));
        }
    }
}

