package com.kakao.tistory.presentation.screen.blog.main.ui;

import a;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import c;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererKeyword;", "item", "", "BlogMainStatisticsRefererKeyword", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererKeyword;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogMainStatisticsRefererKeyword.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogMainStatisticsRefererKeyword.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainStatisticsRefererKeywordKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,104:1\n148#2:105\n148#2:106\n148#2:107\n158#2:108\n148#2:109\n148#2:146\n98#3:110\n95#3,6:111\n101#3:145\n105#3:150\n78#4,6:117\n85#4,4:132\n89#4,2:142\n93#4:149\n368#5,9:123\n377#5:144\n378#5,2:147\n4032#6,6:136\n*S KotlinDebug\n*F\n+ 1 BlogMainStatisticsRefererKeyword.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainStatisticsRefererKeywordKt\n*L\n49#1:105\n50#1:106\n51#1:107\n74#1:108\n76#1:109\n90#1:146\n70#1:110\n70#1:111,6\n70#1:145\n70#1:150\n70#1:117,6\n70#1:132,4\n70#1:142,2\n70#1:149\n70#1:123,9\n70#1:144\n70#1:147,2\n70#1:136,6\n*E\n"})
public final class BlogMainStatisticsRefererKeywordKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogMainStatisticsRefererKeyword(@NotNull RefererKeyword statisticsItem$RefererKeyword0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(statisticsItem$RefererKeyword0, "item");
        Composer composer1 = composer0.startRestartGroup(1664801387);
        int v1 = (v & 14) == 0 ? (composer1.changed(statisticsItem$RefererKeyword0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1664801387, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainStatisticsRefererKeyword (BlogMainStatisticsRefererKeyword.kt:44)");
            }
            FlowLayoutKt.FlowRow(PaddingKt.padding-VpY3zN4(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), 20.0f, 7.0f), Arrangement.INSTANCE.spacedBy-0680j_4(6.0f), Arrangement.INSTANCE.spacedBy-0680j_4(5.0f), 0, 3, null, ComposableLambdaKt.rememberComposableLambda(0xCDC7EFE6, true, new d3(statisticsItem$RefererKeyword0), composer1, 54), composer1, 0x1861B6, 40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e3(statisticsItem$RefererKeyword0, v));
        }
    }

    public static final void access$Keyword(String s, int v, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xFA0AECE6);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xFA0AECE6, v2, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.Keyword (BlogMainStatisticsRefererKeyword.kt:68)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-VpY3zN4(ModifierKt.shape-8ww4TTg$default(modifier$Companion0, RoundedCornerShapeKt.RoundedCornerShape(100), 0L, BorderStrokeKt.BorderStroke-cXLIe8U(0.5f, 0L), 0.0f, 10, null), 15.0f, 10.0f);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            TextKt.Text--4IGK_g(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, new TextStyle(0L, 0x141600000L, FontWeight.Companion.getLight(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null), composer1, v2 & 14 | 0x180, 0x180C30, 0xD7FA);
            c.a(10.0f, modifier$Companion0, composer1, 6);
            TextKt.Text--4IGK_g(StringUtils.getEllipsisNumber$default(StringUtils.INSTANCE, v, 0, 2, null), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, new TextStyle(0L, 0x141500000L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null), composer1, 0x180, 0x180C30, 0xD7FA);
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
            scopeUpdateScope0.updateScope(new f3(s, v, v1));
        }
    }

    public static final void access$PreviewBlogMainStatisticsRefererKeyword(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x898B0ED3);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x898B0ED3, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.PreviewBlogMainStatisticsRefererKeyword (BlogMainStatisticsRefererKeyword.kt:24)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.BlogMainStatisticsRefererKeywordKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g3(v));
        }
    }
}

