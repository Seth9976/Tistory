package com.kakao.tistory.presentation.screen.blog.main.ui;

import a;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
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
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.tooling.preview.Preview;
import c;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainNotice;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.widget.common.ListItemDividerKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001A\u001B\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001A\u000F\u0010\u0006\u001A\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001A\u0017\u0010\b\u001A\u00020\u00032\u0006\u0010\u0002\u001A\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainNotice;", "noticeUiState", "", "blogNotice", "(Landroidx/compose/foundation/lazy/LazyListScope;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainNotice;)V", "BlogNoticePreview", "(Landroidx/compose/runtime/Composer;I)V", "BlogNotice", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainNotice;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogMainNotice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogMainNotice.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainNoticeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,119:1\n148#2:120\n148#2:157\n148#2:158\n148#2:159\n148#2:160\n148#2:161\n148#2:166\n148#2:167\n148#2:168\n98#3:121\n95#3,6:122\n101#3:156\n105#3:165\n78#4,6:128\n85#4,4:143\n89#4,2:153\n93#4:164\n368#5,9:134\n377#5:155\n378#5,2:162\n4032#6,6:147\n*S KotlinDebug\n*F\n+ 1 BlogMainNotice.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainNoticeKt\n*L\n50#1:120\n53#1:157\n57#1:158\n69#1:159\n70#1:160\n75#1:161\n90#1:166\n94#1:167\n106#1:168\n46#1:121\n46#1:122,6\n46#1:156\n46#1:165\n46#1:128,6\n46#1:143,4\n46#1:153,2\n46#1:164\n46#1:134,9\n46#1:155\n46#1:162,2\n46#1:147,6\n*E\n"})
public final class BlogMainNoticeKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogNotice(@NotNull BlogMainNotice blogMainNotice0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(blogMainNotice0, "noticeUiState");
        Composer composer1 = composer0.startRestartGroup(-1559003365);
        int v1 = (v & 14) == 0 ? (composer1.changed(blogMainNotice0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1559003365, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogNotice (BlogMainNotice.kt:44)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(ClickableKt.clickable-XHw0xAI$default(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), false, null, null, blogMainNotice0.getOnClick(), 7, null), 0.0f, 2.0f, 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            c.a(20.0f, modifier$Companion0, composer1, 6);
            BlogMainNoticeKt.a(composer1, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 10.0f), composer1, 6);
            BlogMainNoticeKt.a(blogMainNotice0.getTitle(), RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
            composer1.startReplaceGroup(0xAEF62D89);
            if(blogMainNotice0.getShowMore()) {
                BlogMainNoticeKt.a(ModifierKt.horizontalRoundedClickable-6PoWaU8(modifier$Companion0, blogMainNotice0.getOnClickMore(), null, 10.0f, 10.0f, composer1, 0x6C06, 2), composer1, 0);
            }
            composer1.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 10.0f), composer1, 6);
            composer1.endNode();
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
            scopeUpdateScope0.updateScope(new o1(blogMainNotice0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview(showBackground = true)
    public static final void BlogNoticePreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xFB7BFF66);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xFB7BFF66, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogNoticePreview (BlogMainNotice.kt:32)");
            }
            BlogMainNoticeKt.BlogNotice(new BlogMainNotice("공지사항입니다.https:// sigmchi 6.dev.ti st o ry.com/m /332", p1.a, true, q1.a), composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r1(v));
        }
    }

    public static final void a(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x518647BA);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x518647BA, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.NoticeTag (BlogMainNotice.kt:81)");
            }
            String s = StringResources_androidKt.stringResource(string.label_blog_notice, composer1, 0);
            RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape(100);
            TextKt.Text--4IGK_g(s, PaddingKt.padding-VpY3zN4(BorderKt.border-xT4_qwU(Modifier.Companion, 1.0f, 0L, roundedCornerShape0), 8.0f, 2.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, TTextStyle.INSTANCE.getSize11Weight500(), composer1, 0x180, 0x180C00, 0xDFF8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t1(v));
        }
    }

    public static final void a(Modifier modifier0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-165433020);
        int v1 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-165433020, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.MoreButton (BlogMainNotice.kt:110)");
            }
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_see_all, composer1, 0), modifier0, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, TTextStyle.INSTANCE.getSize13Weight400(), composer1, v1 << 3 & 0x70 | 0x180, 0x180C00, 0xDFF8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s1(modifier0, v));
        }
    }

    public static final void a(String s, Modifier modifier0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x63D926D2);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x63D926D2, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.NoticeTitle (BlogMainNotice.kt:98)");
            }
            TextKt.Text--4IGK_g(s, PaddingKt.padding-VpY3zN4$default(modifier0, 0.0f, 10.0f, 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, TTextStyle.INSTANCE.getSize13Weight400(), composer1, v1 & 14 | 0x180, 0x180C30, 0xD7F8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u1(s, modifier0, v));
        }
    }

    public static final void blogNotice(@NotNull LazyListScope lazyListScope0, @Nullable BlogMainNotice blogMainNotice0) {
        Intrinsics.checkNotNullParameter(lazyListScope0, "<this>");
        if(blogMainNotice0 != null) {
            lazyListScope0.item(Reflection.getOrCreateKotlinClass(BlogMainNotice.class).getSimpleName(), Reflection.getOrCreateKotlinClass(BlogMainNotice.class).getSimpleName(), ComposableLambdaKt.composableLambdaInstance(891060804, true, new v1(blogMainNotice0)));
        }
    }
}

