package com.kakao.tistory.presentation.screen.blog.main.ui;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import c;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.design.ui.list.EntryListKt;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainTopEntry;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainTopEntryItem;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.widget.common.ListItemDividerKt;
import d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u001B\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainTopEntry;", "topEntryList", "", "blogMainTopEntryList", "(Landroidx/compose/foundation/lazy/LazyListScope;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainTopEntry;)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogMainTopEntryList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogMainTopEntryList.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainTopEntryListKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n85#2:139\n81#2,7:140\n88#2:175\n92#2:181\n85#2:230\n82#2,6:231\n88#2:265\n92#2:273\n78#3,6:147\n85#3,4:162\n89#3,2:172\n93#3:180\n78#3,6:190\n85#3,4:205\n89#3,2:215\n93#3:224\n78#3,6:237\n85#3,4:252\n89#3,2:262\n93#3:272\n368#4,9:153\n377#4:174\n378#4,2:178\n368#4,9:196\n377#4:217\n378#4,2:222\n368#4,9:243\n377#4:264\n378#4,2:270\n4032#5,6:166\n4032#5,6:209\n4032#5,6:256\n148#6:176\n148#6:177\n148#6:219\n148#6:220\n148#6:221\n148#6:226\n148#6:227\n148#6:228\n148#6:229\n148#6:268\n98#7:182\n94#7,7:183\n101#7:218\n105#7:225\n1864#8,2:266\n1866#8:269\n*S KotlinDebug\n*F\n+ 1 BlogMainTopEntryList.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainTopEntryListKt\n*L\n56#1:139\n56#1:140,7\n56#1:175\n56#1:181\n113#1:230\n113#1:231,6\n113#1:265\n113#1:273\n56#1:147,6\n56#1:162,4\n56#1:172,2\n56#1:180\n70#1:190,6\n70#1:205,4\n70#1:215,2\n70#1:224\n113#1:237,6\n113#1:252,4\n113#1:262,2\n113#1:272\n56#1:153,9\n56#1:174\n56#1:178,2\n70#1:196,9\n70#1:217\n70#1:222,2\n113#1:243,9\n113#1:264\n113#1:270,2\n56#1:166,6\n70#1:209,6\n113#1:256,6\n59#1:176\n63#1:177\n73#1:219\n84#1:220\n85#1:221\n97#1:226\n116#1:227\n119#1:228\n120#1:229\n125#1:268\n70#1:182\n70#1:183,7\n70#1:218\n70#1:225\n124#1:266,2\n124#1:269\n*E\n"})
public final class BlogMainTopEntryListKt {
    public static final void a(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(407069517);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(407069517, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.Title (BlogMainTopEntryList.kt:92)");
            }
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_top_post, composer1, 0), PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 0.0f, 10.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSubTitle(), composer1, 0x30, 0x180000, 0xFFFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v3(v));
        }
    }

    public static final void a(Modifier modifier0, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x547CAB21);
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
        if((v2 & 11) != 2 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier1 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x547CAB21, v2, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.MoreButton (BlogMainTopEntryList.kt:101)");
            }
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_see_all, composer1, 0), modifier2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize13Weight400(), composer1, v2 << 3 & 0x70 | 0x180, 0x180000, 0xFFF8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u3(modifier1, v, v1));
        }
    }

    public static final void a(BlogMainTopEntry blogMainTopEntry0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xB32359AF);
        int v1 = (v & 14) == 0 ? (composer1.changed(blogMainTopEntry0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB32359AF, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainTopEntryList (BlogMainTopEntryList.kt:54)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
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
            BlogMainTopEntryListKt.a(blogMainTopEntry0.getShowMore(), blogMainTopEntry0.getOnClickMore(), composer1, 0);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 2.0f), composer1, 6);
            BlogMainTopEntryListKt.a(blogMainTopEntry0.getVisibleList(), composer1, 8);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 30.0f), composer1, 6);
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
            scopeUpdateScope0.updateScope(new s3(blogMainTopEntry0, v));
        }
    }

    public static final void a(List list0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xCBF709A0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCBF709A0, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.TopEntryCard (BlogMainTopEntryList.kt:111)");
        }
        Modifier modifier0 = ModifierKt.shape-8ww4TTg$default(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 20.0f, 0.0f, 2, null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(12.0f), 0L, null, 10.0f, 4, null);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
        r0.a.z(composeUiNode$Companion0, composer1, modifier1, composer1, 1034785107);
        int v2 = 0;
        for(Object object0: list0) {
            if(v2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            composer1.startReplaceGroup(1034786082);
            if(v2 != 0) {
                ListItemDividerKt.ListItemDivider-rAjV9yQ(false, 0.0f, composer1, 0x30, 1);
            }
            composer1.endReplaceGroup();
            Function0 function01 = ((BlogMainTopEntryItem)object0).getOnClickEntry();
            String s = ((BlogMainTopEntryItem)object0).getTitle();
            EntryListKt.EntryListCompactItem(function01, null, StringUtils.INSTANCE.asAnnotationString(s), ((BlogMainTopEntryItem)object0).getThumbnail(), ((BlogMainTopEntryItem)object0).getLikeCount(), ((BlogMainTopEntryItem)object0).getCommentCount(), ((BlogMainTopEntryItem)object0).getCount(), composer1, 0, 2);
            ++v2;
        }
        if(m.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w3(list0, v));
        }
    }

    public static final void a(boolean z, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1851076177);
        int v1 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1851076177, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.Head (BlogMainTopEntryList.kt:68)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            c.a(20.0f, modifier$Companion0, composer1, 6);
            BlogMainTopEntryListKt.a(composer1, 0);
            SpacerKt.Spacer(RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
            composer1.startReplaceGroup(-1856601737);
            if(z) {
                BlogMainTopEntryListKt.a(ModifierKt.horizontalRoundedClickable-6PoWaU8(modifier$Companion0, function00, null, 20.0f, 5.0f, composer1, v1 & 0x70 | 0x6C06, 2), composer1, 0, 0);
            }
            if(m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t3(z, function00, v));
        }
    }

    public static final void access$TopEntryListPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1360801314);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1360801314, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.TopEntryListPreview (BlogMainTopEntryList.kt:26)");
            }
            x3 x30 = x3.a;
            ArrayList arrayList0 = new ArrayList(4);
            for(int v1 = 0; v1 < 4; ++v1) {
                arrayList0.add(new BlogMainTopEntryItem(0L, "title", (v1 == 0 ? ThumbnailUiStateKt.toThumbnailItem("") : null), null, "permalink", 0, 0, 0, 8, null));
            }
            BlogMainTopEntryListKt.a(new BlogMainTopEntry(x30, arrayList0), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y3(v));
        }
    }

    public static final void blogMainTopEntryList(@NotNull LazyListScope lazyListScope0, @Nullable BlogMainTopEntry blogMainTopEntry0) {
        Intrinsics.checkNotNullParameter(lazyListScope0, "<this>");
        if(blogMainTopEntry0 == null) {
            return;
        }
        lazyListScope0.item(Reflection.getOrCreateKotlinClass(BlogMainTopEntry.class).getSimpleName(), Reflection.getOrCreateKotlinClass(BlogMainTopEntry.class).getSimpleName(), ComposableLambdaKt.composableLambdaInstance(1773024474, true, new z3(blogMainTopEntry0)));
    }
}

