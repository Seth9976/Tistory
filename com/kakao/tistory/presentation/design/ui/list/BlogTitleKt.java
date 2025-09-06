package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.SemanticKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.screen.home.ui.common.PlaceHolderKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001AO\u0010\r\u001A\u00020\t2\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001A\u00020\u000BH\u0007¢\u0006\u0004\b\r\u0010\u000E\u001A9\u0010\u0011\u001A\u00020\t2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0003\u001A\u00020\u00022\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001A\u00020\u000BH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001A+\u0010\u0016\u001A\u00020\t2\u0006\u0010\u0013\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0015\u001A\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "thumbnail", "", "blogTitle", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "Lkotlin/Function0;", "", "onClick", "", "clickable", "BlogTitleWithThumbnail", "(Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "", "index", "BlogTitleWithIndex", "(ILjava/lang/String;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "title", "Landroidx/compose/ui/Modifier;", "modifier", "BlogTitle", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogTitle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogTitle.kt\ncom/kakao/tistory/presentation/design/ui/list/BlogTitleKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,156:1\n85#2:157\n81#2,7:158\n88#2:193\n92#2:197\n78#3,6:165\n85#3,4:180\n89#3,2:190\n93#3:196\n78#3,6:207\n85#3,4:222\n89#3,2:232\n93#3:238\n368#4,9:171\n377#4:192\n378#4,2:194\n368#4,9:213\n377#4:234\n378#4,2:236\n4032#5,6:184\n4032#5,6:226\n148#6:198\n148#6:199\n148#6:240\n98#7:200\n95#7,6:201\n101#7:235\n105#7:239\n*S KotlinDebug\n*F\n+ 1 BlogTitle.kt\ncom/kakao/tistory/presentation/design/ui/list/BlogTitleKt\n*L\n30#1:157\n30#1:158,7\n30#1:193\n30#1:197\n30#1:165,6\n30#1:180,4\n30#1:190,2\n30#1:196\n116#1:207,6\n116#1:222,4\n116#1:232,2\n116#1:238\n30#1:171,9\n30#1:192\n30#1:194,2\n116#1:213,9\n116#1:234\n116#1:236,2\n30#1:184,6\n116#1:226,6\n50#1:198\n99#1:199\n144#1:240\n116#1:200\n116#1:201,6\n116#1:235\n116#1:239\n*E\n"})
public final class BlogTitleKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogTitle(@NotNull String s, @Nullable TextStyle textStyle0, @Nullable Modifier modifier0, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        TextStyle textStyle1;
        int v2;
        Intrinsics.checkNotNullParameter(s, "title");
        Composer composer1 = composer0.startRestartGroup(0xA005425C);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(textStyle0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            TextStyle textStyle2 = (v1 & 2) == 0 ? textStyle0 : BlogTitleStyle.INSTANCE.getDefault();
            Modifier modifier2 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA005425C, v2, -1, "com.kakao.tistory.presentation.design.ui.list.BlogTitle (BlogTitle.kt:136)");
            }
            TextKt.Text--4IGK_g(s, SemanticKt.contentDescription(PlaceHolderKt.placeholder-942rkJo(modifier2, textStyle2, 75.0f, 0, composer1, v2 >> 6 & 14 | 0x180 | v2 & 0x70, 4), new String[]{StringResources_androidKt.stringResource(string.content_desc_blog, composer1, 0), s}, composer1, 0), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, textStyle2, composer1, v2 & 14, v2 << 15 & 0x380000 | 0xC30, 0xD7FC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle1 = textStyle2;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            textStyle1 = textStyle0;
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(s, textStyle1, modifier1, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogTitleWithIndex(int v, @NotNull String s, @Nullable Function0 function00, boolean z, @Nullable Composer composer0, int v1, int v2) {
        boolean z1;
        Function0 function01;
        int v3;
        Intrinsics.checkNotNullParameter(s, "blogTitle");
        Composer composer1 = composer0.startRestartGroup(0xE5F739C);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v3 & 5851) != 1170 || !composer1.getSkipping()) {
            Function0 function02 = (v2 & 4) == 0 ? function00 : e.a;
            boolean z2 = (v2 & 8) == 0 ? z : true;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE5F739C, v3, -1, "com.kakao.tistory.presentation.design.ui.list.BlogTitleWithIndex (BlogTitle.kt:77)");
            }
            BlogTitleKt.a(ComposableLambdaKt.rememberComposableLambda(0x49E23839, true, new f(v), composer1, 54), s, null, PaddingKt.PaddingValues-a9UjIt4$default(0.0f, 0.0f, 0.0f, 6.0f, 7, null), Alignment.Companion.getBottom(), function02, z2, composer1, v3 & 0x70 | 0x6C06 | 0x70000 & v3 << 9 | v3 << 9 & 0x380000, 4);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function01 = function02;
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            function01 = function00;
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(v, s, function01, z1, v1, v2));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogTitleWithThumbnail(@Nullable ThumbnailUiState thumbnailUiState0, @NotNull String s, @Nullable TextStyle textStyle0, @Nullable PaddingValues paddingValues0, @Nullable Function0 function00, boolean z, @Nullable Composer composer0, int v, int v1) {
        boolean z1;
        Function0 function01;
        PaddingValues paddingValues1;
        TextStyle textStyle1;
        int v2;
        Intrinsics.checkNotNullParameter(s, "blogTitle");
        Composer composer1 = composer0.startRestartGroup(1035602829);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(thumbnailUiState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(textStyle0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.changed(z) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.getSkipping()) {
            TextStyle textStyle2 = (v1 & 4) == 0 ? textStyle0 : BlogTitleStyle.INSTANCE.getDefault();
            PaddingValues paddingValues2 = (v1 & 8) == 0 ? paddingValues0 : PaddingKt.PaddingValues-YgX7TsA$default(0.0f, 6.0f, 1, null);
            Function0 function02 = (v1 & 16) == 0 ? function00 : i.a;
            boolean z2 = (v1 & 0x20) == 0 ? z : true;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1035602829, v2, -1, "com.kakao.tistory.presentation.design.ui.list.BlogTitleWithThumbnail (BlogTitle.kt:52)");
            }
            BlogTitleKt.a(ComposableLambdaKt.rememberComposableLambda(0x62355B90, true, new j(thumbnailUiState0), composer1, 54), s, textStyle2, paddingValues2, null, function02, z2, composer1, 6 | v2 & 0x70 | v2 & 0x380 | v2 & 0x1C00 | 0x70000 & v2 << 3 | v2 << 3 & 0x380000, 16);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle1 = textStyle2;
            paddingValues1 = paddingValues2;
            function01 = function02;
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            textStyle1 = textStyle0;
            paddingValues1 = paddingValues0;
            function01 = function00;
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(thumbnailUiState0, s, textStyle1, paddingValues1, function01, z1, v, v1));
        }
    }

    public static final void a(Function2 function20, String s, TextStyle textStyle0, PaddingValues paddingValues0, Vertical alignment$Vertical0, Function0 function00, boolean z, Composer composer0, int v, int v1) {
        Vertical alignment$Vertical1;
        TextStyle textStyle1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(2115541080);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(textStyle0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(alignment$Vertical0) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((0x380000 & v) == 0) {
            v2 |= (composer1.changed(z) ? 0x100000 : 0x80000);
        }
        if((0x2DB6DB & v2) != 0x92492 || !composer1.getSkipping()) {
            TextStyle textStyle2 = (v1 & 4) == 0 ? textStyle0 : BlogTitleStyle.INSTANCE.getDefault();
            alignment$Vertical1 = (v1 & 16) == 0 ? alignment$Vertical0 : Alignment.Companion.getCenterVertically();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2115541080, v2, -1, "com.kakao.tistory.presentation.design.ui.list.BlogTitleWithPrefix (BlogTitle.kt:114)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding(ClickableKt.clickable-XHw0xAI$default(modifier$Companion0, z, StringResources_androidKt.stringResource(string.content_desc_blog_move, composer1, 0), null, function00, 4, null), paddingValues0);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), alignment$Vertical1, composer1, (v2 >> 6 & 0x380) >> 3 & 0x70);
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
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function21);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(v2 & 14)));
            BlogTitleKt.BlogTitle(s, textStyle2, RowScopeInstance.INSTANCE.weight(modifier$Companion0, 1.0f, false), composer1, v2 >> 3 & 0x7E, 0);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle1 = textStyle2;
        }
        else {
            composer1.skipToGroupEnd();
            textStyle1 = textStyle0;
            alignment$Vertical1 = alignment$Vertical0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(function20, s, textStyle1, paddingValues0, alignment$Vertical1, function00, z, v, v1));
        }
    }

    public static final void access$BlogTitlePreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xDB00340E);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xDB00340E, v, -1, "com.kakao.tistory.presentation.design.ui.list.BlogTitlePreview (BlogTitle.kt:28)");
            }
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
                d.a(v1, composer1, v1, function20);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            BlogTitleKt.BlogTitleWithThumbnail(ThumbnailUiStateKt.toBlogThumbnailItem(""), "블로그 제목", null, null, b.a, false, composer1, 0x6030, 44);
            BlogTitleKt.BlogTitleWithIndex(0x499602D2, "블로그 제목", c.a, false, composer1, 438, 8);
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
            scopeUpdateScope0.updateScope(new com.kakao.tistory.presentation.design.ui.list.d(v));
        }
    }
}

