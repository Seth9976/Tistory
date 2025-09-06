package com.kakao.tistory.presentation.screen.blog.main.ui;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.SemanticKt;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainCategoryItem;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeBottomSheetKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001A3\u0010\u0007\u001A\u00020\u00052\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001A\u00020\u00012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem;", "categoryList", "selectedCategory", "Lkotlin/Function0;", "", "onDismiss", "BlogMainCategoryBottomSheet", "(Ljava/util/List;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategoryItem;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogMainCategoryBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogMainCategoryBottomSheet.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainCategoryBottomSheetKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,259:1\n148#2:260\n148#2:299\n148#2:310\n148#2:311\n158#2:348\n148#2:359\n148#2:396\n148#2:397\n148#2:398\n158#2:399\n85#3:261\n82#3,6:262\n88#3:296\n92#3:303\n78#4,6:268\n85#4,4:283\n89#4,2:293\n93#4:302\n78#4,6:319\n85#4,4:334\n89#4,2:344\n93#4:351\n78#4,6:367\n85#4,4:382\n89#4,2:392\n93#4:402\n368#5,9:274\n377#5:295\n378#5,2:300\n368#5,9:325\n377#5:346\n378#5,2:349\n368#5,9:373\n377#5:394\n378#5,2:400\n4032#6,6:287\n4032#6,6:338\n4032#6,6:386\n1855#7,2:297\n1223#8,6:304\n1223#8,6:353\n98#9:312\n95#9,6:313\n101#9:347\n105#9:352\n98#9:360\n95#9,6:361\n101#9:395\n105#9:403\n*S KotlinDebug\n*F\n+ 1 BlogMainCategoryBottomSheet.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainCategoryBottomSheetKt\n*L\n113#1:260\n136#1:299\n164#1:310\n165#1:311\n174#1:348\n201#1:359\n208#1:396\n209#1:397\n214#1:398\n222#1:399\n124#1:261\n124#1:262,6\n124#1:296\n124#1:303\n124#1:268,6\n124#1:283,4\n124#1:293,2\n124#1:302\n154#1:319,6\n154#1:334,4\n154#1:344,2\n154#1:351\n194#1:367,6\n194#1:382,4\n194#1:392,2\n194#1:402\n124#1:274,9\n124#1:295\n124#1:300,2\n154#1:325,9\n154#1:346\n154#1:349,2\n194#1:373,9\n194#1:394\n194#1:400,2\n124#1:287,6\n154#1:338,6\n194#1:386,6\n131#1:297,2\n159#1:304,6\n197#1:353,6\n154#1:312\n154#1:313,6\n154#1:347\n154#1:352\n194#1:360\n194#1:361,6\n194#1:395\n194#1:403\n*E\n"})
public final class BlogMainCategoryBottomSheetKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogMainCategoryBottomSheet(@NotNull List list0, @NotNull BlogMainCategoryItem blogMainCategoryItem0, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(list0, "categoryList");
        Intrinsics.checkNotNullParameter(blogMainCategoryItem0, "selectedCategory");
        Intrinsics.checkNotNullParameter(function00, "onDismiss");
        Composer composer1 = composer0.startRestartGroup(0x666870DD);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x666870DD, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainCategoryBottomSheet (BlogMainCategoryBottomSheet.kt:72)");
        }
        if(list0.isEmpty()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new b(list0, blogMainCategoryItem0, function00, v));
            }
            return;
        }
        TistoryComposeBottomSheetKt.TistoryComposeBottomSheet(false, function00, ComposableLambdaKt.rememberComposableLambda(0xBCF91922, true, new d(list0, blogMainCategoryItem0, function00), composer1, 54), composer1, v >> 3 & 0x70 | 0x180, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new e(list0, blogMainCategoryItem0, function00, v));
        }
    }

    public static final void a(long v, long v1, TextStyle textStyle0, Composer composer0, int v2) {
        Composer composer1 = composer0.startRestartGroup(0xF880F9A4);
        int v3 = (v2 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v2 : v2;
        if((v2 & 0x70) == 0) {
            v3 |= (composer1.changed(v1) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            v3 |= (composer1.changed(textStyle0) ? 0x100 : 0x80);
        }
        if((v3 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF880F9A4, v3, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.Count (BlogMainCategoryBottomSheet.kt:248)");
            }
            String s = StringUtils.INSTANCE.getNumberFormat(v);
            String[] arr_s = {StringResources_androidKt.stringResource(string.content_desc_entry, composer1, 0), StringResources_androidKt.stringResource(string.content_desc_count, new Object[]{v}, composer1, 0x40)};
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, SemanticKt.contentDescription(Modifier.Companion, arr_s, composer1, 6), 0L, v1, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, textStyle0, composer1, v3 << 6 & 0x1C00, v3 << 15 & 0x1C00000, 0x1FFF4);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l(v, v1, textStyle0, v2));
        }
    }

    public static final void a(RowScope rowScope0, String s, long v, TextStyle textStyle0, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x3D14C1F);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(rowScope0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v2 |= (composer1.changed(textStyle0) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x3D14C1F, v2, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.Name (BlogMainCategoryBottomSheet.kt:232)");
            }
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, SemanticKt.contentDescription(RowScope.weight$default(rowScope0, Modifier.Companion, 1.0f, false, 2, null), new String[]{StringResources_androidKt.stringResource(string.content_desc_blog_category_title, composer1, 0), s}, composer1, 0), 0L, v, null, null, null, 0L, null, null, 0L, 2, false, false, 1, 0, null, textStyle0, composer1, v2 >> 3 & 14 | v2 << 3 & 0x1C00, v2 << 12 & 0x1C00000 | 0x6030, 0x1B7F4);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m(rowScope0, s, v, textStyle0, v1));
        }
    }

    public static final void a(Composer composer0, int v) {
        List list0;
        Composer composer1 = composer0.startRestartGroup(0x8031BB5F);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8031BB5F, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainCategoryBottomSheetPreview (BlogMainCategoryBottomSheet.kt:33)");
            }
            ArrayList arrayList0 = new ArrayList(10);
            for(int v1 = 0; v1 < 10; ++v1) {
                if(v1 % 3 == 0) {
                    list0 = new ArrayList(3);
                    for(int v2 = 0; v2 < 3; ++v2) {
                        ((ArrayList)list0).add(new BlogMainCategoryItem((v1 + 1) * 100 + v2, "서브카테고리 " + v2, ((long)v2) * 10L, f.a, CollectionsKt__CollectionsKt.emptyList()));
                    }
                }
                else {
                    list0 = CollectionsKt__CollectionsKt.emptyList();
                }
                arrayList0.add(new BlogMainCategoryItem(v1, "카테고리 " + v1, ((long)v1) * 10L, g.a, list0));
            }
            BlogMainCategoryBottomSheetKt.BlogMainCategoryBottomSheet(arrayList0, new BlogMainCategoryItem(100, "카테고리1", 10L, h.a, CollectionsKt__CollectionsKt.emptyList()), i.a, composer1, 392);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j(v));
        }
    }

    public static final void a(BlogMainCategoryItem blogMainCategoryItem0, int v, Function0 function00, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xDC071A7F);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(blogMainCategoryItem0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xDC071A7F, v2, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.ParentCategory (BlogMainCategoryBottomSheet.kt:146)");
            }
            boolean z = blogMainCategoryItem0.getId() == v;
            TextStyle textStyle0 = new TextStyle(0L, 0L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFDA, null);
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
            composer1.startReplaceGroup(0xF5DAB27);
            n n0 = composer1.rememberedValue();
            if((((v2 & 14) == 4 ? 1 : 0) | ((v2 & 0x380) == 0x100 ? 1 : 0)) != 0 || n0 == Composer.Companion.getEmpty()) {
                n0 = new n(blogMainCategoryItem0, function00);
                composer1.updateRememberedValue(n0);
            }
            composer1.endReplaceGroup();
            Modifier modifier1 = PaddingKt.padding-qDBjuR0$default(PaddingKt.padding-VpY3zN4$default(SelectableKt.selectable-XHw0xAI$default(modifier0, z, false, null, n0, 6, null), 20.0f, 0.0f, 2, null), 0.0f, 20.0f, 0.0f, 13.0f, 5, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getBottom(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            BlogMainCategoryBottomSheetKt.a(RowScopeInstance.INSTANCE, blogMainCategoryItem0.getName(), 0x141800000L, textStyle0, composer1, 390);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 14.5f), composer1, 6);
            BlogMainCategoryBottomSheetKt.a(blogMainCategoryItem0.getCount(), 0x141700000L, textStyle0, composer1, 0x30);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o(blogMainCategoryItem0, v, function00, v1));
        }
    }

    public static final void access$Category(BlogMainCategoryItem blogMainCategoryItem0, int v, Function0 function00, boolean z, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x14B76265);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(blogMainCategoryItem0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v2 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x14B76265, v2, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.Category (BlogMainCategoryBottomSheet.kt:122)");
            }
            Modifier modifier0 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            BlogMainCategoryBottomSheetKt.a(blogMainCategoryItem0, v, function00, composer1, v2 & 0x3FE);
            composer1.startReplaceGroup(0x3C1C3500);
            for(Object object0: blogMainCategoryItem0.getSubCategoryList()) {
                BlogMainCategoryBottomSheetKt.b(((BlogMainCategoryItem)object0), v, function00, composer1, v2 & 0x3F0);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(1008485159);
            if(z) {
                DividerKt.HorizontalDivider-9IZ8Weo(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 8.0f, 0.0f, 0.0f, 13, null), 1.0f, 0L, composer1, 438, 0);
            }
            if(com.kakao.tistory.presentation.design.ui.list.m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(blogMainCategoryItem0, v, function00, z, v1));
        }
    }

    public static final void access$Title(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x819FF5B0);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x819FF5B0, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.Title (BlogMainCategoryBottomSheet.kt:100)");
            }
            String s = StringResources_androidKt.stringResource(string.label_blog_category, composer1, 0);
            TextStyle textStyle0 = new TextStyle(0L, 0x141F00000L, FontWeight.Companion.getMedium(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD8, null);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, PaddingKt.padding-3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.background-bw27NRU$default(Modifier.Companion, 0L, null, 2, null), 0.0f, 1, null), 20.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, textStyle0, composer1, 0x30, 0, 0x1FFFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r(v));
        }
    }

    public static final void b(BlogMainCategoryItem blogMainCategoryItem0, int v, Function0 function00, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(1177706053);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(blogMainCategoryItem0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1177706053, v2, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.SubCategory (BlogMainCategoryBottomSheet.kt:184)");
            }
            boolean z = blogMainCategoryItem0.getId() != v;
            TextStyle textStyle0 = new TextStyle(0L, 0L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFDA, null);
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
            composer1.startReplaceGroup(0xCFE65AF7);
            p p0 = composer1.rememberedValue();
            if((((v2 & 0x380) == 0x100 ? 1 : 0) | ((v2 & 14) == 4 ? 1 : 0)) != 0 || p0 == Composer.Companion.getEmpty()) {
                p0 = new p(blogMainCategoryItem0, function00);
                composer1.updateRememberedValue(p0);
            }
            composer1.endReplaceGroup();
            Modifier modifier1 = PaddingKt.padding-VpY3zN4(ClickableKt.clickable-XHw0xAI$default(modifier0, false, null, null, p0, 7, null), 20.0f, 12.0f);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), alignment$Companion0.getBottom(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            Painter painter0 = PainterResources_androidKt.painterResource(drawable.ic_list_2_depth_bullet, composer1, 0);
            Modifier modifier3 = SizeKt.size-3ABfNKs(PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 4.0f, 0.0f, 2, null), 8.0f);
            IconKt.Icon-ww6aTOc(painter0, null, RowScopeInstance.INSTANCE.align(modifier3, alignment$Companion0.getCenterVertically()), 0L, composer1, 56, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 4.0f), composer1, 6);
            BlogMainCategoryBottomSheetKt.a(RowScopeInstance.INSTANCE, blogMainCategoryItem0.getName(), 0x141600000L, textStyle0, composer1, 390);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 14.5f), composer1, 6);
            BlogMainCategoryBottomSheetKt.a(blogMainCategoryItem0.getCount(), 0x141500000L, textStyle0, composer1, 0x30);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q(blogMainCategoryItem0, v, function00, v1));
        }
    }
}

