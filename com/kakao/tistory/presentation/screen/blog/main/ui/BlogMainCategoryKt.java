package com.kakao.tistory.presentation.screen.blog.main.ui;

import a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainCategory;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainCategoryItem;
import com.kakao.tistory.presentation.theme.TTextStyle;
import d;
import e;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A\u0019\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001A\u0017\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0002\u001A\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001A)\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r*\u00020\b2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH\u0007¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategory;", "category", "", "blogMainCategory", "(Landroidx/compose/foundation/lazy/LazyListScope;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategory;)V", "BlogMainCategory", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainCategory;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/lazy/LazyListState;", "", "index", "", "height", "Landroidx/compose/runtime/State;", "", "isCategorySticky", "(Landroidx/compose/foundation/lazy/LazyListState;IFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogMainCategory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogMainCategory.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainCategoryKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,97:1\n85#2:98\n81#2,7:99\n88#2:134\n92#2:181\n78#3,6:106\n85#3,4:121\n89#3,2:131\n78#3,6:143\n85#3,4:158\n89#3,2:168\n93#3:176\n93#3:180\n368#4,9:112\n377#4:133\n368#4,9:149\n377#4:170\n378#4,2:174\n378#4,2:178\n4032#5,6:125\n4032#5,6:162\n148#6:135\n148#6:172\n148#6:173\n98#7:136\n95#7,6:137\n101#7:171\n105#7:177\n1223#8,6:182\n*S KotlinDebug\n*F\n+ 1 BlogMainCategory.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainCategoryKt\n*L\n51#1:98\n51#1:99,7\n51#1:134\n51#1:181\n51#1:106,6\n51#1:121,4\n51#1:131,2\n52#1:143,6\n52#1:158,4\n52#1:168,2\n52#1:176\n51#1:180\n51#1:112,9\n51#1:133\n52#1:149,9\n52#1:170\n52#1:174,2\n51#1:178,2\n51#1:125,6\n52#1:162,6\n56#1:135\n62#1:172\n67#1:173\n52#1:136\n52#1:137,6\n52#1:171\n52#1:177\n81#1:182,6\n*E\n"})
public final class BlogMainCategoryKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogMainCategory(@NotNull BlogMainCategory blogMainCategory0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(blogMainCategory0, "category");
        Composer composer1 = composer0.startRestartGroup(0x56F60C4E);
        int v1 = (v & 14) == 0 ? (composer1.changed(blogMainCategory0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x56F60C4E, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainCategory (BlogMainCategory.kt:49)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Arrangement arrangement0 = Arrangement.INSTANCE;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            Modifier modifier1 = PaddingKt.padding-VpY3zN4(ClickableKt.clickable-XHw0xAI$default(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), false, null, null, blogMainCategory0.getOnClickShowCategoryList(), 7, null), 20.0f, 10.0f);
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function21);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ic_navi_cat, composer1, 0), StringResources_androidKt.stringResource(string.content_desc_blog_category, composer1, 0), SizeKt.size-3ABfNKs(modifier$Companion0, 24.0f), 0L, composer1, 392, 8);
            TextKt.Text--4IGK_g(blogMainCategory0.getCurrent().getName(), PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 6.0f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, TTextStyle.INSTANCE.getSubTitle(), composer1, 0x30, 0x180C30, 0xD7FC);
            if(e.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(blogMainCategory0, v));
        }
    }

    public static final void access$BlogMainCategoryPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x98946B21);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x98946B21, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainCategoryPreview (BlogMainCategory.kt:34)");
            }
            BlogMainCategoryKt.BlogMainCategory(new BlogMainCategory(null, new BlogMainCategoryItem(0, "카테고리", 0L, t.a, CollectionsKt__CollectionsKt.emptyList()), null, 5, null), composer1, 0);
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

    public static final void blogMainCategory(@NotNull LazyListScope lazyListScope0, @NotNull BlogMainCategory blogMainCategory0) {
        Intrinsics.checkNotNullParameter(lazyListScope0, "<this>");
        Intrinsics.checkNotNullParameter(blogMainCategory0, "category");
        lazyListScope0.item(Reflection.getOrCreateKotlinClass(BlogMainCategoryItem.class).getSimpleName(), Reflection.getOrCreateKotlinClass(BlogMainCategoryItem.class).getSimpleName(), ComposableLambdaKt.composableLambdaInstance(2023244409, true, new v(blogMainCategory0)));
    }

    @Composable
    @NotNull
    public static final State isCategorySticky(@NotNull LazyListState lazyListState0, int v, float f, @Nullable Composer composer0, int v1) {
        Intrinsics.checkNotNullParameter(lazyListState0, "<this>");
        composer0.startReplaceGroup(0x69C20DE8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x69C20DE8, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.isCategorySticky (BlogMainCategory.kt:80)");
        }
        composer0.startReplaceGroup(0xC4E2D2CD);
        boolean z = (v1 & 0x70 ^ 0x30) > 0x20 && composer0.changed(v) || (v1 & 0x30) == 0x20;
        State state0 = composer0.rememberedValue();
        if(z || state0 == Composer.Companion.getEmpty()) {
            state0 = SnapshotStateKt.derivedStateOf(new w(lazyListState0, v, f));
            composer0.updateRememberedValue(state0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return state0;
    }
}

