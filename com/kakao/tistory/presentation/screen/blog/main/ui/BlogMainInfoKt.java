package com.kakao.tistory.presentation.screen.blog.main.ui;

import a;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.Preview;
import b;
import c;
import com.kakao.tistory.domain.blog.entity.BlogRoleType;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.CommonCompositionLocalKt;
import com.kakao.tistory.presentation.common.SemanticKt;
import com.kakao.tistory.presentation.common.TistoryWindowInsetsKt;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo.My;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo.Others;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo.StoryCreator;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.widget.common.RoundButtonKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0004\u001A\u001B\u0010\u0002\u001A\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0002\u0010\u0004\u001A\u000F\u0010\u0005\u001A\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001A\u0017\u0010\b\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000E²\u0006\u000E\u0010\u000B\u001A\u00020\n8\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\f\u001A\u00020\n8\n@\nX\u008A\u008E\u0002²\u0006\f\u0010\r\u001A\u00020\n8\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo;", "blogMainInfo", "", "(Landroidx/compose/foundation/lazy/LazyListScope;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo;)V", "PreviewBlogMainInfo", "(Landroidx/compose/runtime/Composer;I)V", "blogInfo", "BlogMainInfo", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo;Landroidx/compose/runtime/Composer;I)V", "", "fold", "hasVisualOverFlow", "showMore", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogMainInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogMainInfo.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainInfoKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 11 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,473:1\n85#2:474\n81#2,7:475\n88#2:510\n92#2:514\n85#2:521\n82#2,6:522\n88#2:556\n92#2:565\n85#2:736\n82#2,6:737\n88#2:771\n92#2:781\n78#3,6:482\n85#3,4:497\n89#3,2:507\n93#3:513\n78#3,6:528\n85#3,4:543\n89#3,2:553\n93#3:564\n78#3,6:570\n85#3,4:585\n89#3,2:595\n93#3:603\n78#3,6:618\n85#3,4:633\n89#3,2:643\n93#3:652\n78#3,6:663\n85#3,4:678\n89#3,2:688\n93#3:695\n78#3,6:743\n85#3,4:758\n89#3,2:768\n93#3:780\n78#3,6:797\n85#3,4:812\n89#3,2:822\n93#3:828\n368#4,9:488\n377#4:509\n378#4,2:511\n368#4,9:534\n377#4:555\n378#4,2:562\n368#4,9:576\n377#4:597\n378#4,2:601\n368#4,9:624\n377#4:645\n378#4,2:650\n368#4,9:669\n377#4:690\n378#4,2:693\n368#4,9:749\n377#4:770\n378#4,2:778\n368#4,9:803\n377#4:824\n378#4,2:826\n4032#5,6:501\n4032#5,6:547\n4032#5,6:589\n4032#5,6:637\n4032#5,6:682\n4032#5,6:762\n4032#5,6:816\n1223#6,6:515\n1223#6,6:697\n1223#6,6:703\n1223#6,6:709\n1223#6,6:716\n1223#6,6:724\n1223#6,6:730\n1223#6,6:772\n1223#6,6:830\n148#7:557\n148#7:558\n148#7:559\n148#7:560\n148#7:561\n148#7:566\n148#7:599\n148#7:600\n148#7:605\n148#7:606\n148#7:607\n148#7:608\n148#7:609\n148#7:647\n148#7:649\n148#7:654\n148#7:655\n148#7:692\n148#7:722\n148#7:723\n148#7:789\n148#7:790\n148#7:836\n98#8,3:567\n101#8:598\n105#8:604\n98#8:611\n95#8,6:612\n101#8:646\n105#8:653\n98#8:656\n95#8,6:657\n101#8:691\n105#8:696\n98#8:791\n96#8,5:792\n101#8:825\n105#8:829\n56#9:610\n56#9:648\n77#10:715\n1240#11:782\n1039#11,6:783\n81#12:837\n107#12,2:838\n81#12:840\n107#12,2:841\n81#12:843\n*S KotlinDebug\n*F\n+ 1 BlogMainInfo.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainInfoKt\n*L\n62#1:474\n62#1:475,7\n62#1:510\n62#1:514\n108#1:521\n108#1:522,6\n108#1:556\n108#1:565\n324#1:736\n324#1:737,6\n324#1:771\n324#1:781\n62#1:482,6\n62#1:497,4\n62#1:507,2\n62#1:513\n108#1:528,6\n108#1:543,4\n108#1:553,2\n108#1:564\n177#1:570,6\n177#1:585,4\n177#1:595,2\n177#1:603\n231#1:618,6\n231#1:633,4\n231#1:643,2\n231#1:652\n271#1:663,6\n271#1:678,4\n271#1:688,2\n271#1:695\n324#1:743,6\n324#1:758,4\n324#1:768,2\n324#1:780\n378#1:797,6\n378#1:812,4\n378#1:822,2\n378#1:828\n62#1:488,9\n62#1:509\n62#1:511,2\n108#1:534,9\n108#1:555\n108#1:562,2\n177#1:576,9\n177#1:597\n177#1:601,2\n231#1:624,9\n231#1:645\n231#1:650,2\n271#1:669,9\n271#1:690\n271#1:693,2\n324#1:749,9\n324#1:770\n324#1:778,2\n378#1:803,9\n378#1:824\n378#1:826,2\n62#1:501,6\n108#1:547,6\n177#1:589,6\n231#1:637,6\n271#1:682,6\n324#1:762,6\n378#1:816,6\n110#1:515,6\n308#1:697,6\n309#1:703,6\n311#1:709,6\n318#1:716,6\n331#1:724,6\n338#1:730,6\n345#1:772,6\n408#1:830,6\n123#1:557\n128#1:558\n135#1:559\n139#1:560\n153#1:561\n180#1:566\n186#1:599\n201#1:600\n214#1:605\n215#1:606\n228#1:607\n229#1:608\n232#1:609\n246#1:647\n247#1:649\n268#1:654\n269#1:655\n296#1:692\n326#1:722\n327#1:723\n380#1:789\n381#1:790\n451#1:836\n177#1:567,3\n177#1:598\n177#1:604\n231#1:611\n231#1:612,6\n231#1:646\n231#1:653\n271#1:656\n271#1:657,6\n271#1:691\n271#1:696\n378#1:791\n378#1:792,5\n378#1:825\n378#1:829\n232#1:610\n246#1:648\n317#1:715\n358#1:782\n361#1:783,6\n308#1:837\n308#1:838,2\n309#1:840\n309#1:841,2\n311#1:843\n*E\n"})
public final class BlogMainInfoKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogMainInfo(@NotNull BlogMainInfo blogMainInfo0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(blogMainInfo0, "blogInfo");
        Composer composer1 = composer0.startRestartGroup(0xB701599E);
        int v1 = (v & 14) == 0 ? (composer1.changed(blogMainInfo0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB701599E, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainInfo (BlogMainInfo.kt:106)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            composer1.startReplaceGroup(0xD84DC960);
            r0 r00 = composer1.rememberedValue();
            if((v1 & 14) == 4 || r00 == Composer.Companion.getEmpty()) {
                r00 = new r0(blogMainInfo0);
                composer1.updateRememberedValue(r00);
            }
            composer1.endReplaceGroup();
            Modifier modifier0 = DrawModifierKt.drawWithCache(modifier$Companion0, r00);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
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
            SpacerKt.Spacer(TistoryWindowInsetsKt.topInsetsHeight-3ABfNKs(modifier$Companion0, 56.0f), composer1, 0);
            composer1.startReplaceGroup(0x2A72BB78);
            StoryCreator blogMainInfo$StoryCreator0 = blogMainInfo0.getStoryCreator();
            composer1.startReplaceGroup(0x2A72BCF0);
            if(blogMainInfo$StoryCreator0 != null) {
                BlogMainInfoKt.b(blogMainInfo$StoryCreator0.getLabel(), ModifierKt.horizontalRoundedClickable-6PoWaU8(modifier$Companion0, blogMainInfo$StoryCreator0.getOnClick(), null, 20.0f, 5.0f, composer1, 0x6C06, 2), composer1, 0, 0);
            }
            composer1.endReplaceGroup();
            BlogMainInfoKt.a(blogMainInfo0.getTitle(), null, composer1, 0, 2);
            b.a(4.0f, modifier$Companion0, composer1, 6);
            if(blogMainInfo0 instanceof My) {
                composer1.startReplaceGroup(0x582F2ED6);
                BlogMainInfoKt.a(blogMainInfo0.getFollowerCount(), ((My)blogMainInfo0).getOnClickFollower(), ((My)blogMainInfo0).getFollowingCount(), ((My)blogMainInfo0).getOnClickFollowing(), blogMainInfo0.getRole(), composer1, 0, 0);
            }
            else if(blogMainInfo0 instanceof Others) {
                composer1.startReplaceGroup(0x582F3E4A);
                BlogMainInfoKt.a(blogMainInfo0.getFollowerCount(), null, null, null, blogMainInfo0.getRole(), composer1, 0, 14);
            }
            else {
                composer1.startReplaceGroup(0xADB94FDE);
            }
            composer1.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 14.0f), composer1, 6);
            BlogMainInfoKt.a(blogMainInfo0.getDescription(), composer1, 0);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 18.0f), composer1, 6);
            BlogMainInfoKt.a(ComposableLambdaKt.rememberComposableLambda(253309607, true, new s0(blogMainInfo0), composer1, 54), (blogMainInfo0.getShowGuestBook() ? blogMainInfo0.getOnClickGuestBook() : null), blogMainInfo0.getOnClickShare(), composer1, 6, 0);
            composer1.endReplaceGroup();
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
            scopeUpdateScope0.updateScope(new t0(blogMainInfo0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview
    public static final void PreviewBlogMainInfo(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x211D4EB3);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x211D4EB3, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.PreviewBlogMainInfo (BlogMainInfo.kt:60)");
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
            StoryCreator blogMainInfo$StoryCreator0 = new StoryCreator("자기계발 분야  크리에이터", j1.a);
            Color color0 = Color.box-impl(0xFF86CEB800000000L);
            Color color1 = Color.box-impl(0xFFD1863500000000L);
            BlogMainInfoKt.BlogMainInfo(new My("", BlogRoleType.WRITER, blogMainInfo$StoryCreator0, "일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십", "일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십", null, 10000, null, 500000000, null, null, true, null, null, color0, color1, null, null, null, 0x716A0, null), composer1, 0);
            Color color2 = Color.box-impl(0xFFE6DAD100000000L);
            Color color3 = Color.box-impl(0xFF04687300000000L);
            BlogMainInfoKt.BlogMainInfo(new Others("", BlogRoleType.GUEST, null, "일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십", "일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십", null, false, 10000, false, null, false, null, null, false, null, false, null, null, color2, color3, null, null, null, 0x715A20, null), composer1, 6);
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
            scopeUpdateScope0.updateScope(new k1(v));
        }
    }

    public static final void a(int v, int v1, Function0 function00, float f, float f1, Composer composer0, int v2, int v3) {
        float f3;
        Function0 function01;
        float f7;
        float f6;
        Modifier modifier0;
        float f2;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x26D7FED2);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(v1) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            f2 = f;
        }
        else if((v2 & 0x1C00) == 0) {
            f2 = f;
            v4 |= (composer1.changed(f2) ? 0x800 : 0x400);
        }
        else {
            f2 = f;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            v4 |= (composer1.changed(f1) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v4) != 9362 || !composer1.getSkipping()) {
            Function0 function02 = (v3 & 4) == 0 ? function00 : null;
            float f4 = (v3 & 8) == 0 ? f2 : 0.0f;
            float f5 = (v3 & 16) == 0 ? f1 : 0.0f;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x26D7FED2, v4, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.FollowCount (BlogMainInfo.kt:269)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            composer1.startReplaceGroup(0xD090238C);
            if(function02 == null) {
                modifier0 = SemanticsModifierKt.semantics(PaddingKt.padding-VpY3zN4(modifier$Companion0, f4, f5), true, f1.a);
                f6 = f5;
                f7 = f4;
            }
            else {
                f6 = f5;
                f7 = f4;
                modifier0 = ModifierKt.horizontalRoundedClickable-6PoWaU8(modifier$Companion0, function02, null, f4, f5, composer1, v4 >> 3 & 0x70 | 6 | v4 & 0x1C00 | v4 & 0xE000, 2);
            }
            composer1.endReplaceGroup();
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                d.a(v5, composer1, v5, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(v, composer1, v4 & 14), null, Color.copy-wmQWz5c$default(0L, 0.8f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize12Weight400(), composer1, 0x180, 0x180000, 0xFFFA);
            c.a(3.0f, modifier$Companion0, composer1, 6);
            TextKt.Text--4IGK_g(StringUtils.INSTANCE.getNumberFormat(v1), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize12Weight600(), composer1, 0x180, 0x180000, 0xFFFA);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function01 = function02;
            f3 = f6;
            f2 = f7;
        }
        else {
            composer1.skipToGroupEnd();
            function01 = function00;
            f3 = f1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g1(v, v1, function01, f2, f3, v2, v3));
        }
    }

    public static final void a(int v, Function0 function00, Integer integer0, Function0 function01, BlogRoleType blogRoleType0, Composer composer0, int v1, int v2) {
        Function0 function03;
        Integer integer1;
        Function0 function02;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x5B1A9EC9);
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
            v3 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changed(integer0) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changedInstance(function01) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((0xE000 & v1) == 0) {
            v3 |= (composer1.changed(blogRoleType0) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v3) != 9362 || !composer1.getSkipping()) {
            Function0 function04 = (v2 & 2) == 0 ? function00 : null;
            Integer integer2 = (v2 & 4) == 0 ? integer0 : null;
            Function0 function05 = (v2 & 8) == 0 ? function01 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5B1A9EC9, v3, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.FollowInfo (BlogMainInfo.kt:226)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 17.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function06 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function06);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            BlogMainInfoKt.a(string.label_feed_follower, v, function04, 3.0f, 5.0f, composer1, v3 << 3 & 0x70 | 0x6C00 | v3 << 3 & 0x380, 0);
            composer1.startReplaceGroup(675793480);
            if(integer2 != null && blogRoleType0.isMyOwnBlog()) {
                BoxKt.Box(ModifierKt.shape-8ww4TTg$default(SizeKt.size-3ABfNKs(PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 3.0f, 0.0f, 2, null), 2.0f), RoundedCornerShapeKt.getCircleShape(), Color.copy-wmQWz5c$default(0L, 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 0.0f, 12, null), composer1, 0);
                BlogMainInfoKt.a(string.label_feed_following, ((int)integer2), function05, 3.0f, 5.0f, composer1, v3 >> 3 & 0x70 | 0x6C00 | v3 >> 3 & 0x380, 0);
            }
            if(m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
            integer1 = integer2;
            function03 = function05;
            function02 = function04;
        }
        else {
            composer1.skipToGroupEnd();
            function02 = function00;
            integer1 = integer0;
            function03 = function01;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h1(v, function02, integer1, function03, blogRoleType0, v1, v2));
        }
    }

    public static final void a(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xD9A1AFA9);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD9A1AFA9, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.DescriptionReadMore (BlogMainInfo.kt:356)");
            }
            composer1.startReplaceGroup(0x1029C8EB);
            Builder annotatedString$Builder0 = new Builder(0, 1, null);
            annotatedString$Builder0.append(StringResources_androidKt.stringResource(string.label_blog_read_more_append, composer1, 0));
            composer1.startReplaceGroup(0x1029D5BB);
            int v1 = annotatedString$Builder0.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFB, null));
            try {
                annotatedString$Builder0.append(StringResources_androidKt.stringResource(string.label_blog_read_more, composer1, 0));
            }
            finally {
                annotatedString$Builder0.pop(v1);
            }
            composer1.endReplaceGroup();
            AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
            composer1.endReplaceGroup();
            TextKt.Text-IbK3jfQ(annotatedString0, null, Color.copy-wmQWz5c$default(0L, 0.8f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TTextStyle.INSTANCE.getSize14Weight400(), composer1, 0x180, 0xC00000, 0x1FFFA);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c1(v));
        }
    }

    public static final void a(String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-2028808275);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2028808275, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.Description (BlogMainInfo.kt:306)");
            }
            composer1.startReplaceGroup(-2061840275);
            boolean z = true;
            MutableState mutableState0 = composer1.rememberedValue();
            if((v1 & 14) == 4 || mutableState0 == Composer.Companion.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            MutableState mutableState1 = com.kakao.tistory.presentation.common.graph.b.a(composer1, 0x851AD9E1);
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(mutableState1 == composer$Companion0.getEmpty()) {
                mutableState1 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer1.updateRememberedValue(mutableState1);
            }
            State state0 = com.kakao.tistory.presentation.common.graph.b.a(composer1, -2061836008);
            if(state0 == composer$Companion0.getEmpty()) {
                state0 = SnapshotStateKt.derivedStateOf(new b1(mutableState0, mutableState1));
                composer1.updateRememberedValue(state0);
            }
            composer1.endReplaceGroup();
            Boolean boolean0 = (Boolean)composer1.consume(CommonCompositionLocalKt.getLocalRefreshingState());
            boolean z1 = boolean0.booleanValue();
            composer1.startReplaceGroup(-2061830520);
            boolean z2 = composer1.changed(z1);
            boolean z3 = composer1.changed(mutableState0);
            w0 w00 = composer1.rememberedValue();
            if(z2 || z3 || w00 == composer$Companion0.getEmpty()) {
                w00 = new w0(z1, mutableState0, null);
                composer1.updateRememberedValue(w00);
            }
            composer1.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolean0, w00, composer1, 0x40);
            Modifier modifier0 = Modifier.Companion;
            Modifier modifier1 = AnimationModifierKt.animateContentSize$default(PaddingKt.padding-qDBjuR0$default(PaddingKt.padding-VpY3zN4$default(modifier0, 20.0f, 0.0f, 2, null), 0.0f, 0.0f, 44.0f, 0.0f, 11, null), null, null, 3, null);
            composer1.startReplaceGroup(-2061821985);
            if(((Boolean)state0.getValue()).booleanValue()) {
                String s1 = StringResources_androidKt.stringResource(string.content_desc_blog_desc_more, composer1, 0);
                composer1.startReplaceGroup(0x851B1F21);
                boolean z4 = composer1.changed(mutableState0);
                x0 x00 = composer1.rememberedValue();
                if(z4 || x00 == composer$Companion0.getEmpty()) {
                    x00 = new x0(mutableState0);
                    composer1.updateRememberedValue(x00);
                }
                composer1.endReplaceGroup();
                modifier0 = ClickableKt.clickable-XHw0xAI$default(modifier0, false, s1, null, x00, 5, null);
            }
            composer1.endReplaceGroup();
            Modifier modifier2 = modifier1.then(modifier0);
            composer1.startReplaceGroup(-2061810461);
            if((v1 & 14) != 4) {
                z = false;
            }
            y0 y00 = composer1.rememberedValue();
            if(z || y00 == composer$Companion0.getEmpty()) {
                y00 = new y0(s);
                composer1.updateRememberedValue(y00);
            }
            composer1.endReplaceGroup();
            Modifier modifier3 = SemanticsModifierKt.clearAndSetSemantics(modifier2, y00);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            TextStyle textStyle0 = TTextStyle.INSTANCE.getSize14Weight400();
            long v3 = Color.copy-wmQWz5c$default(0L, 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
            int v4 = ((Boolean)mutableState0.getValue()).booleanValue() ? 2 : 0x7FFFFFFF;
            composer1.startReplaceGroup(1420620486);
            z0 z00 = composer1.rememberedValue();
            if(z00 == composer$Companion0.getEmpty()) {
                z00 = new z0(mutableState1);
                composer1.updateRememberedValue(z00);
            }
            composer1.endReplaceGroup();
            TextKt.Text--4IGK_g(s, null, v3, 0L, null, null, null, 0L, null, null, 0L, 0, false, v4, 0, z00, textStyle0, composer1, v1 & 14 | 0x180, 0x1B0000, 0x5FFA);
            composer1.startReplaceGroup(0x54ACFE39);
            if(((Boolean)state0.getValue()).booleanValue()) {
                BlogMainInfoKt.a(composer1, 0);
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
            scopeUpdateScope0.updateScope(new a1(s, v));
        }
    }

    public static final void a(String s, Modifier modifier0, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-1458700602);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x70) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier1 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1458700602, v2, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogTitle (BlogMainInfo.kt:207)");
            }
            TextKt.Text--4IGK_g(s, SemanticKt.contentDescription(PaddingKt.padding-qDBjuR0$default(PaddingKt.padding-VpY3zN4$default(modifier2, 20.0f, 0.0f, 2, null), 0.0f, 0.0f, 44.0f, 0.0f, 11, null), new String[]{StringResources_androidKt.stringResource(string.content_desc_blog, composer1, 0), s}, composer1, 0), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize30Weight600(), composer1, v2 & 14 | 0x180, 0x180000, 0xFFF8);
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
            scopeUpdateScope0.updateScope(new v0(s, modifier1, v, v1));
        }
    }

    public static final void a(Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x5CB16243);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5CB16243, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.GuestbookButton (BlogMainInfo.kt:415)");
            }
            BlogMainInfoKt.a(false, string.label_blog_guestbook, function00, null, composer1, v1 << 6 & 0x380 | 6, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i1(function00, v));
        }
    }

    public static final void a(Function3 function30, Function0 function00, Function0 function01, Composer composer0, int v, int v1) {
        Function0 function02;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x633F1360);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function30) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            function02 = function00;
        }
        else if((v & 0x70) == 0) {
            function02 = function00;
            v2 |= (composer1.changedInstance(function02) ? 0x20 : 16);
        }
        else {
            function02 = function00;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function01) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                function02 = null;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x633F1360, v2, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.Actions (BlogMainInfo.kt:376)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 20.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(8.0f), Alignment.Companion.getTop(), composer1, 6);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            function30.invoke(rowScopeInstance0, composer1, ((int)(v2 << 3 & 0x70 | 6)));
            composer1.startReplaceGroup(0xA28225CE);
            if(function02 != null) {
                BlogMainInfoKt.a(function02, composer1, 0);
            }
            composer1.endReplaceGroup();
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
            BlogMainInfoKt.b(function01, composer1, v2 >> 6 & 14);
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
            scopeUpdateScope0.updateScope(new q0(function30, function02, function01, v, v1));
        }
    }

    public static final void a(boolean z, int v, Function0 function00, String s, Composer composer0, int v1, int v2) {
        String s1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xEBDCFFA0);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(v) ? 0x20 : 16);
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
            v3 |= (composer1.changed(s) ? 0x800 : 0x400);
        }
        if((v3 & 5851) != 1170 || !composer1.getSkipping()) {
            String s2 = (v2 & 8) == 0 ? s : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEBDCFFA0, v3, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.ActionButton (BlogMainInfo.kt:429)");
            }
            RoundButtonKt.RoundButton(function00, s2, (z ? com.kakao.tistory.presentation.screen.blog.main.ui.a.b : com.kakao.tistory.presentation.screen.blog.main.ui.a.a), null, null, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(0xCCFDD17C, true, new o0(v), composer1, 54), composer1, v3 >> 6 & 14 | 0x30000000 | v3 >> 6 & 0x70, 504);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            s1 = s2;
        }
        else {
            composer1.skipToGroupEnd();
            s1 = s;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p0(z, v, function00, s1, v1, v2));
        }
    }

    public static final void access$BlogSettingButton(Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x26805CD6);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x26805CD6, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogSettingButton (BlogMainInfo.kt:394)");
            }
            BlogMainInfoKt.a(true, string.label_blog_setting, function00, null, composer1, v1 << 6 & 0x380 | 6, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u0(function00, v));
        }
    }

    public static final boolean access$Description$lambda$10(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$Description$lambda$11(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final boolean access$Description$lambda$13(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$Description$lambda$14(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final void access$FollowButton(boolean z, Function1 function10, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x27120FA);
        int v1 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x27120FA, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.FollowButton (BlogMainInfo.kt:403)");
            }
            int v2 = z ? string.label_blog_following : string.label_blog_do_follow;
            composer1.startReplaceGroup(0x150E5392);
            d1 d10 = composer1.rememberedValue();
            if((((v1 & 0x70) == 0x20 ? 1 : 0) | ((v1 & 14) == 4 ? 1 : 0)) != 0 || d10 == Composer.Companion.getEmpty()) {
                d10 = new d1(function10, z);
                composer1.updateRememberedValue(d10);
            }
            composer1.endReplaceGroup();
            BlogMainInfoKt.a(!z, v2, d10, StringResources_androidKt.stringResource((z ? string.content_desc_blog_unfollow_click : string.content_desc_blog_follow_click), composer1, 0), composer1, 0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e1(z, function10, v));
        }
    }

    public static final BlogMainInfoKt.creatorBackgroundBrush.1 access$creatorBackgroundBrush--OWjLjI(long v, long v1) {
        return new BlogMainInfoKt.creatorBackgroundBrush.1(v, v1);
    }

    public static final void b(String s, Modifier modifier0, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xE2F43429);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x70) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier1 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE2F43429, v2, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.StoryCreator (BlogMainInfo.kt:175)");
            }
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(4.0f), Alignment.Companion.getCenterVertically(), composer1, 54);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ic_story, composer1, 0), null, SizeKt.size-3ABfNKs(Modifier.Companion, 14.0f), 0L, composer1, 0xDB8, 0);
            long v4 = Color.copy-wmQWz5c$default(0L, 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
            TextKt.Text--4IGK_g(s, RowScopeInstance.INSTANCE.weight(Modifier.Companion, 1.0f, false), v4, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, TTextStyle.INSTANCE.getSize12Weight400(), composer1, v2 & 14 | 0x180, 0x180C30, 0xD7F8);
            Painter painter0 = PainterResources_androidKt.painterResource(drawable.ic_left_arrow, composer1, 0);
            long v5 = Color.copy-wmQWz5c$default(0L, 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
            IconKt.Icon-ww6aTOc(painter0, null, SizeKt.size-VpY3zN4(Modifier.Companion, 5.0f, 11.0f), v5, composer1, 0xDB8, 0);
            composer1.endNode();
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
            scopeUpdateScope0.updateScope(new m1(s, modifier1, v, v1));
        }
    }

    public static final void b(Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xF05CE1E5);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF05CE1E5, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.ShareButton (BlogMainInfo.kt:446)");
            }
            Modifier modifier0 = SizeKt.size-3ABfNKs(Modifier.Companion, 32.0f);
            RoundButtonKt.RoundButton(function00, null, com.kakao.tistory.presentation.screen.blog.main.ui.a.a, modifier0, null, null, false, null, null, ComposableSingletons.BlogMainInfoKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, v1 & 14 | 0x30000D80, 0x1F2);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l1(function00, v));
        }
    }

    public static final void blogMainInfo(@NotNull LazyListScope lazyListScope0, @Nullable BlogMainInfo blogMainInfo0) {
        Intrinsics.checkNotNullParameter(lazyListScope0, "<this>");
        if(blogMainInfo0 != null) {
            LazyListScope.item$default(lazyListScope0, null, null, ComposableLambdaKt.composableLambdaInstance(0x9F122631, true, new n1(blogMainInfo0)), 3, null);
        }
    }
}

