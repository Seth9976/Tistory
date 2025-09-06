package com.kakao.tistory.presentation.widget.entry;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.common.ThumbnailType;
import com.kakao.tistory.presentation.common.coil.ImageModifiers;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001AY\u0010\f\u001A\u00020\n2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00042\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "item", "", "showLikeAndComment", "isMine", "showDivider", "showBlogInfo", "Lkotlin/Function0;", "", "onClickBlog", "EntryItem", "(Landroidx/compose/ui/Modifier;Lcom/kakao/tistory/domain/entity/entry/EntryItem;ZZZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntryItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntryItem.kt\ncom/kakao/tistory/presentation/widget/entry/EntryItemKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,147:1\n71#2:148\n68#2,6:149\n74#2:183\n78#2:188\n78#3,6:155\n85#3,4:170\n89#3,2:180\n93#3:187\n78#3,6:200\n85#3,4:215\n89#3,2:225\n78#3,6:237\n85#3,4:252\n89#3,2:262\n93#3:268\n93#3:274\n368#4,9:161\n377#4:182\n378#4,2:185\n368#4,9:206\n377#4:227\n368#4,9:243\n377#4:264\n378#4,2:266\n378#4,2:272\n4032#5,6:174\n4032#5,6:219\n4032#5,6:256\n158#6:184\n148#6:189\n148#6:190\n148#6:191\n148#6:192\n148#6:229\n148#6:270\n148#6:271\n98#7:193\n95#7,6:194\n101#7:228\n105#7:275\n85#8:230\n82#8,6:231\n88#8:265\n92#8:269\n*S KotlinDebug\n*F\n+ 1 EntryItem.kt\ncom/kakao/tistory/presentation/widget/entry/EntryItemKt\n*L\n71#1:148\n71#1:149,6\n71#1:183\n71#1:188\n71#1:155,6\n71#1:170,4\n71#1:180,2\n71#1:187\n105#1:200,6\n105#1:215,4\n105#1:225,2\n114#1:237,6\n114#1:252,4\n114#1:262,2\n114#1:268\n105#1:274\n71#1:161,9\n71#1:182\n71#1:185,2\n105#1:206,9\n105#1:227\n114#1:243,9\n114#1:264\n114#1:266,2\n105#1:272,2\n71#1:174,6\n105#1:219,6\n114#1:256,6\n81#1:184\n108#1:189\n109#1:190\n110#1:191\n111#1:192\n118#1:229\n140#1:270\n141#1:271\n105#1:193\n105#1:194,6\n105#1:228\n105#1:275\n114#1:230\n114#1:231,6\n114#1:265\n114#1:269\n*E\n"})
public final class EntryItemKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void EntryItem(@Nullable Modifier modifier0, @NotNull EntryItem entryItem0, boolean z, boolean z1, boolean z2, boolean z3, @Nullable Function0 function00, @Nullable Composer composer0, int v, int v1) {
        boolean z9;
        boolean z8;
        Function0 function02;
        boolean z7;
        boolean z6;
        Modifier modifier1;
        Function0 function01;
        boolean z5;
        boolean z4;
        int v2;
        Intrinsics.checkNotNullParameter(entryItem0, "item");
        Composer composer1 = composer0.startRestartGroup(0x5A8E914A);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(entryItem0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            z4 = z2;
        }
        else if((v & 0xE000) == 0) {
            z4 = z2;
            v2 |= (composer1.changed(z4) ? 0x4000 : 0x2000);
        }
        else {
            z4 = z2;
        }
        if((v1 & 0x20) == 0) {
            z5 = z3;
            if((v & 0x70000) == 0) {
                v2 |= (composer1.changed(z5) ? 0x20000 : 0x10000);
            }
        }
        else {
            v2 |= 0x30000;
            z5 = z3;
        }
        if((v1 & 0x40) == 0) {
            function01 = function00;
            if((v & 0x380000) == 0) {
                v2 |= (composer1.changedInstance(function01) ? 0x100000 : 0x80000);
            }
        }
        else {
            v2 |= 0x180000;
            function01 = function00;
        }
        if((v2 & 0x2DB6DB) != 0x92492 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            boolean z10 = (v1 & 4) == 0 ? z : true;
            boolean z11 = (v1 & 8) == 0 ? z1 : true;
            if((v1 & 16) != 0) {
                z4 = true;
            }
            if((v1 & 0x20) != 0) {
                z5 = false;
            }
            if((v1 & 0x40) != 0) {
                function01 = c.a;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5A8E914A, v2, -1, "com.kakao.tistory.presentation.widget.entry.EntryItem (EntryItem.kt:67)");
            }
            composer1.startMovableGroup(-1924208418, composer1.joinKey(entryItem0.getLikeCount(), entryItem0.getCommentCount()));
            if(z4) {
                composer1.startReplaceGroup(0x1C8F0B0B);
                Modifier modifier3 = BackgroundKt.background-bw27NRU$default(modifier2, ColorResources_androidKt.colorResource(color.white, composer1, 0), null, 2, null);
                Companion alignment$Companion0 = Alignment.Companion;
                MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
                int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
                androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
                Function0 function03 = composeUiNode$Companion0.getConstructor();
                if(composer1.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer1.startReusableNode();
                if(composer1.getInserting()) {
                    composer1.createNode(function03);
                }
                else {
                    composer1.useNode();
                }
                Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                    d.a(v3, composer1, v3, function20);
                }
                Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
                EntryItemKt.a(null, entryItem0, z10, z11, z5, function01, composer1, v2 & 0x1FF0 | 0xE000 & v2 >> 3 | v2 >> 3 & 0x70000, 1);
                DividerKt.Divider-oMI9zvI(BoxScopeInstance.INSTANCE.align(Modifier.Companion, alignment$Companion0.getBottomCenter()), ColorResources_androidKt.colorResource(color.gray4, composer1, 0), 0.5f, 0.0f, composer1, 0x180, 8);
                composer1.endNode();
            }
            else {
                composer1.startReplaceGroup(479713340);
                EntryItemKt.a(BackgroundKt.background-bw27NRU$default(modifier2, ColorResources_androidKt.colorResource(color.white, composer1, 0), null, 2, null), entryItem0, z10, z11, false, null, composer1, v2 & 0x1FF0, 0x30);
            }
            composer1.endReplaceGroup();
            composer1.endMovableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function02 = function01;
            z8 = z4;
            z9 = z5;
            modifier1 = modifier2;
            z6 = z10;
            z7 = z11;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z6 = z;
            z7 = z1;
            function02 = function01;
            z8 = z4;
            z9 = z5;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new com.kakao.tistory.presentation.widget.entry.d(modifier1, entryItem0, z6, z7, z8, z9, function02, v, v1));
        }
    }

    public static final void a(Modifier modifier0, EntryItem entryItem0, boolean z, boolean z1, boolean z2, Function0 function00, Composer composer0, int v, int v1) {
        boolean z3;
        Function0 function01;
        Modifier modifier2;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-1769503962);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            modifier1 = modifier0;
        }
        else if((v & 14) == 0) {
            modifier1 = modifier0;
            v2 = (composer1.changed(modifier1) ? 4 : 2) | v;
        }
        else {
            modifier1 = modifier0;
            v2 = v;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(entryItem0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(z2) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier1 = Modifier.Companion;
            }
            boolean z4 = (v1 & 16) == 0 ? z2 : false;
            function01 = (v1 & 0x20) == 0 ? function00 : e.a;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1769503962, v2, -1, "com.kakao.tistory.presentation.widget.entry.EntryItem (EntryItem.kt:103)");
            }
            Modifier modifier3 = PaddingKt.padding-qDBjuR0(modifier1, 20.0f, (z1 ? 23.0f : 20.0f), 20.0f, (z1 ? 24.0f : 21.0f));
            Arrangement arrangement0 = Arrangement.INSTANCE;
            Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function02 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function02);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier5 = PaddingKt.padding-qDBjuR0$default(SizeKt.wrapContentHeight$default(RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), null, false, 3, null), 0.0f, 0.0f, 15.0f, 0.0f, 11, null);
            MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier6 = ComposedModifierKt.materializeModifier(composer1, modifier5);
            Function0 function03 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function03);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function21);
            }
            Updater.set-impl(composer1, modifier6, composeUiNode$Companion0.getSetModifier());
            String s = entryItem0.getTitle();
            if(s == null) {
                s = "";
            }
            EntryTitleKt.EntryTitle(s, entryItem0.isRestrict(), entryItem0.getRestrictType(), composer1, 0);
            EntrySummaryKt.EntrySummary((entryItem0.getSummary() == null ? "" : entryItem0.getSummary()), entryItem0.getRestrictType(), z1, composer1, v2 >> 3 & 0x380);
            EntryStatusKt.EntryStatus(entryItem0, z, z1, composer1, v2 >> 3 & 0x3FE);
            composer1.startReplaceGroup(0xA8E8392);
            if(z4) {
                String s1 = entryItem0.getBlogTitle();
                EntryBlogInfoKt.EntryBlogInfo(ClickableKt.clickable-XHw0xAI$default(modifier$Companion0, false, null, null, function01, 7, null), (s1 == null ? "" : s1), entryItem0.getBlog(), composer1, 0x200, 0);
            }
            composer1.endReplaceGroup();
            composer1.endNode();
            EntryThumbnailImageViewKt.EntryThumbnailImageView(SizeKt.size-3ABfNKs(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 3.0f, 0.0f, 0.0f, 13, null), (z1 ? 48.0f : 88.0f)).then(ImageModifiers.INSTANCE.getDEFAULT(composer1, 6)), entryItem0, ThumbnailType.LARGE, composer1, v2 & 0x70 | 0x180, 0);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier1;
            z3 = z4;
        }
        else {
            composer1.skipToGroupEnd();
            modifier2 = modifier1;
            function01 = function00;
            z3 = z2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(modifier2, entryItem0, z, z1, z3, function01, v, v1));
        }
    }

    public static final void access$EntryItemPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x6CAE15B0);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6CAE15B0, v, -1, "com.kakao.tistory.presentation.widget.entry.EntryItemPreview (EntryItem.kt:24)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.EntryItemKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(v));
        }
    }
}

