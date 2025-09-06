package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.tooling.preview.Preview;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.design.ui.list.EntryListKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Category;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.CategoryGroup;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotContainerKt;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotEntryListItemKt;
import com.kakao.tistory.presentation.widget.common.ListItemDividerKt;
import d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001A\u000F\u0010\u0003\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0002\u001A\u0017\u0010\u0006\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "CategoryPreview", "(Landroidx/compose/runtime/Composer;I)V", "CategoryLoadingPreview", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Category;", "uiState", "Category", "(Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Category;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCategory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Category.kt\ncom/kakao/tistory/presentation/screen/home/ui/slot/CategoryKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,171:1\n148#2:172\n148#2:188\n148#2:189\n488#3:173\n487#3,4:174\n491#3,2:181\n495#3:187\n1223#4,3:178\n1226#4,3:184\n487#5:183\n85#6:190\n82#6,6:191\n88#6:225\n92#6:232\n78#7,6:197\n85#7,4:212\n89#7,2:222\n93#7:231\n368#8,9:203\n377#8:224\n378#8,2:229\n4032#9,6:216\n1864#10,3:226\n77#11:233\n*S KotlinDebug\n*F\n+ 1 Category.kt\ncom/kakao/tistory/presentation/screen/home/ui/slot/CategoryKt\n*L\n83#1:172\n106#1:188\n107#1:189\n102#1:173\n102#1:174,4\n102#1:181,2\n102#1:187\n102#1:178,3\n102#1:184,3\n102#1:183\n135#1:190\n135#1:191,6\n135#1:225\n135#1:232\n135#1:197,6\n135#1:212,4\n135#1:222,2\n135#1:231\n135#1:203,9\n135#1:224\n135#1:229,2\n135#1:216,6\n138#1:226,3\n153#1:233\n*E\n"})
public final class CategoryKt {
    public static final Category a;

    static {
        ArrayList arrayList0 = new ArrayList(21);
        for(int v1 = 0; v1 < 21; ++v1) {
            StringBuilder stringBuilder0 = q.u("title ", v1, " title ", v1, " title ");
            a.A(stringBuilder0, v1, " title ", v1, " title ");
            a.A(stringBuilder0, v1, " title ", v1, " title ");
            a.A(stringBuilder0, v1, " title ", v1, " title ");
            stringBuilder0.append(v1);
            stringBuilder0.append(" title ");
            stringBuilder0.append(v1);
            stringBuilder0.append(" ");
            ThumbnailUiState thumbnailUiState0 = ThumbnailUiStateKt.toThumbnailItem("1");
            ThumbnailUiState thumbnailUiState1 = ThumbnailUiStateKt.toThumbnailItem("1");
            arrayList0.add(new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Category("", stringBuilder0.toString(), thumbnailUiState0, v.a, "title " + v1, "summary " + v1, thumbnailUiState1, w.a, v1, v1, "32분 전"));
        }
        ArrayList arrayList1 = new ArrayList(8);
        for(int v = 0; v < 8; ++v) {
            arrayList1.add(new CategoryGroup(String.valueOf(v), "label " + v, drawable.ic_slot_category1, drawable.ic_slot_category1_selected, x.a));
        }
        CategoryKt.a = new Category(null, null, "title", "1", false, arrayList0, "1", arrayList1, null, 275, null);
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Category(@NotNull Category homeSlotUiState$Category0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(homeSlotUiState$Category0, "uiState");
        Composer composer1 = composer0.startRestartGroup(0xFAC3F23D);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFAC3F23D, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Category (Category.kt:72)");
        }
        SlotContainerKt.SlotContainer(ComposableLambdaKt.rememberComposableLambda(-2021839547, true, new l(homeSlotUiState$Category0), composer1, 54), homeSlotUiState$Category0.isLoading(), PaddingKt.PaddingValues-0680j_4(0.0f), ComposableLambdaKt.rememberComposableLambda(23931032, true, new m(homeSlotUiState$Category0), composer1, 54), composer1, 0xD86, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n(homeSlotUiState$Category0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview(heightDp = 1600, showBackground = true, widthDp = 375)
    public static final void CategoryLoadingPreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xFF572FA7);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xFF572FA7, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.CategoryLoadingPreview (Category.kt:65)");
            }
            CategoryKt.Category(Category.copy$default(CategoryKt.a, null, null, null, null, true, null, null, null, null, 0x1EF, null), composer1, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t(v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview(heightDp = 1600, showBackground = true, widthDp = 375)
    public static final void CategoryPreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xF30D516B);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF30D516B, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.CategoryPreview (Category.kt:57)");
            }
            CategoryKt.Category(CategoryKt.a, composer1, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u(v));
        }
    }

    public static final void a(com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Category homeSlotUiStateContent$Category0, boolean z, Composer composer0, int v, int v1) {
        boolean z1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x3526EB6);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(homeSlotUiStateContent$Category0) ? 4 : 2) | v : v;
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
            boolean z2 = (v1 & 2) == 0 ? z : false;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x3526EB6, v2, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.EntryListITemBigThumbnail (Category.kt:151)");
            }
            boolean z3 = ((Boolean)composer1.consume(SlotContainerKt.getLocalLoadingState())).booleanValue();
            ListItemDividerKt.ListItemDivider-rAjV9yQ(z2, 0.0f, composer1, v2 >> 3 & 14, 2);
            z1 = z2;
            EntryListKt.EntryListItemWithLargeImage(homeSlotUiStateContent$Category0.getOnClickEntry(), !z3, null, homeSlotUiStateContent$Category0.getBlogImage(), homeSlotUiStateContent$Category0.getBlogTitle(), homeSlotUiStateContent$Category0.getOnClickBlog(), StringUtils.INSTANCE.asAnnotationString(homeSlotUiStateContent$Category0.getTitle()), StringUtils.INSTANCE.asAnnotationString(homeSlotUiStateContent$Category0.getSummary()), homeSlotUiStateContent$Category0.getThumbnail(), homeSlotUiStateContent$Category0.getLikeCount(), homeSlotUiStateContent$Category0.getCommentCount(), homeSlotUiStateContent$Category0.getPublishedDate(), composer1, 0, 0, 4);
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
            scopeUpdateScope0.updateScope(new z(homeSlotUiStateContent$Category0, z1, v, v1));
        }
    }

    public static final void access$CategoryList(String s, List list0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-710560932);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-710560932, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.CategoryList (Category.kt:99)");
        }
        LazyListState lazyListState0 = LazyListStateKt.rememberLazyListState(0, 0, composer1, 0, 3);
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
        if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = androidx.room.a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
        }
        PaddingValues paddingValues0 = PaddingKt.PaddingValues-YgX7TsA$default(20.0f, 0.0f, 2, null);
        HorizontalOrVertical arrangement$HorizontalOrVertical0 = Arrangement.INSTANCE.spacedBy-0680j_4(7.0f);
        LazyDslKt.LazyRow(SemanticsModifierKt.semantics$default(Modifier.Companion, false, o.a, 1, null), lazyListState0, paddingValues0, false, arrangement$HorizontalOrVertical0, null, null, false, new p(list0, s), composer1, 0x6180, 0xE8);
        EffectsKt.LaunchedEffect(s, list0, new r(compositionScopedCoroutineScopeCanceller0.getCoroutineScope(), list0, lazyListState0, s, null), composer1, v & 14 | 0x240);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(s, list0, v));
        }
    }

    public static final void access$EntryList(List list0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-920725837);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-920725837, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.EntryList (Category.kt:133)");
        }
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        a.z(composeUiNode$Companion0, composer1, modifier0, composer1, -2007385203);
        int v2 = 0;
        for(Object object0: list0) {
            if(v2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            boolean z = true;
            if(v2 < 2) {
                composer1.startReplaceGroup(0xB8DD7BE6);
                if(v2 == 0) {
                    z = false;
                }
                CategoryKt.a(((com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Category)object0), z, composer1, 0, 0);
            }
            else {
                composer1.startReplaceGroup(0xB8DF03A3);
                SlotEntryListItemKt.SlotEntryListItemWithBlogThumbnail(((com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Category)object0), true, composer1, 0x30, 0);
            }
            composer1.endReplaceGroup();
            ++v2;
        }
        if(com.kakao.tistory.presentation.design.ui.list.m.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y(list0, v));
        }
    }
}

