package com.kakao.tistory.presentation.widget.common;

import a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconButtonKt;
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
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.common.extension.StringExtensionKt;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.design.ui.thumbnail.BlogThumbnailKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.widget.HighlightTextKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001AI\u0010\b\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/domain/entity/Blog;", "blog", "", "showFollowButton", "Lkotlin/Function1;", "", "onClickFollow", "onClickFollowing", "BlogFollowing", "(Lcom/kakao/tistory/domain/entity/Blog;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogFollowing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogFollowing.kt\ncom/kakao/tistory/presentation/widget/common/BlogFollowingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,89:1\n148#2:90\n148#2:91\n148#2:128\n148#2:129\n148#2:166\n148#2:171\n98#3:92\n95#3,6:93\n101#3:127\n105#3:175\n78#4,6:99\n85#4,4:114\n89#4,2:124\n78#4,6:137\n85#4,4:152\n89#4,2:162\n93#4:169\n93#4:174\n368#5,9:105\n377#5:126\n368#5,9:143\n377#5:164\n378#5,2:167\n378#5,2:172\n4032#6,6:118\n4032#6,6:156\n85#7:130\n82#7,6:131\n88#7:165\n92#7:170\n*S KotlinDebug\n*F\n+ 1 BlogFollowing.kt\ncom/kakao/tistory/presentation/widget/common/BlogFollowingKt\n*L\n31#1:90\n34#1:91\n39#1:128\n44#1:129\n48#1:166\n57#1:171\n29#1:92\n29#1:93,6\n29#1:127\n29#1:175\n29#1:99,6\n29#1:114,4\n29#1:124,2\n42#1:137,6\n42#1:152,4\n42#1:162,2\n42#1:169\n29#1:174\n29#1:105,9\n29#1:126\n42#1:143,9\n42#1:164\n42#1:167,2\n29#1:172,2\n29#1:118,6\n42#1:156,6\n42#1:130\n42#1:131,6\n42#1:165\n42#1:170\n*E\n"})
public final class BlogFollowingKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogFollowing(@NotNull Blog blog0, boolean z, @NotNull Function1 function10, @NotNull Function1 function11, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(blog0, "blog");
        Intrinsics.checkNotNullParameter(function10, "onClickFollow");
        Intrinsics.checkNotNullParameter(function11, "onClickFollowing");
        Composer composer1 = composer0.startRestartGroup(-1005372653);
        boolean z1 = (v1 & 2) == 0 ? z : true;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1005372653, v, -1, "com.kakao.tistory.presentation.widget.common.BlogFollowing (BlogFollowing.kt:27)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.clickable-XHw0xAI$default(SizeKt.height-3ABfNKs(modifier$Companion0, 80.0f), false, null, null, new e(function11, blog0), 7, null), 0.0f, 1, null), 20.0f, 0.0f, 10.0f, 0.0f, 10, null);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        Arrangement arrangement0 = Arrangement.INSTANCE;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
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
        String s = blog0.getLogoImageUrl();
        BlogThumbnailKt.BlogThumbnail-EUb7tLY((s == null ? null : ThumbnailUiStateKt.toBlogThumbnailItem(s)), 48.0f, null, false, null, composer1, 0x30, 28);
        Modifier modifier2 = RowScope.weight$default(RowScopeInstance.INSTANCE, PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 15.0f, 0.0f, 2, null), 1.0f, false, 2, null);
        MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
        String s1 = blog0.getTitle();
        String s2 = "";
        if(s1 == null) {
            s1 = "";
        }
        BlogFollowingKt.b(s1, composer1, 0);
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 5.0f), composer1, 6);
        String s3 = blog0.getDescription();
        if(s3 != null) {
            s2 = s3;
        }
        BlogFollowingKt.a(s2, composer1, 0);
        composer1.endNode();
        composer1.startReplaceGroup(0xCD144F76);
        if(z1) {
            int v4 = blog0.isSubscriber() ? drawable.ic_list_following : drawable.ic_list_follow;
            Modifier modifier4 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 7.0f, 0.0f, 0.0f, 0.0f, 14, null);
            IconButtonKt.IconButton(new f(function10, blog0), modifier4, false, null, null, ComposableLambdaKt.rememberComposableLambda(0x4327CE37, true, new g(v4), composer1, 54), composer1, 0x30030, 28);
        }
        if(m.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(blog0, z1, function10, function11, v, v1));
        }
    }

    public static final void a(String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x5BAEF341);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5BAEF341, v1, -1, "com.kakao.tistory.presentation.widget.common.BlogDescription (BlogFollowing.kt:80)");
            }
            HighlightTextKt.HighlightText-fLXpl1I(StringExtensionKt.newLineToSpace(s), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, TTextStyle.INSTANCE.getSize12Weight300(), null, composer1, 0, 0x6C30, 0x97FE);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new com.kakao.tistory.presentation.widget.common.d(s, v));
        }
    }

    public static final void b(String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1078580069);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1078580069, v1, -1, "com.kakao.tistory.presentation.widget.common.BlogTitle (BlogFollowing.kt:70)");
            }
            HighlightTextKt.HighlightText-fLXpl1I(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, TTextStyle.INSTANCE.getSize14Weight400(), null, composer1, v1 & 14, 0x6C30, 0x97FE);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i(s, v));
        }
    }
}

