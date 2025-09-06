package com.kakao.tistory.presentation.screen.blog.main.ui;

import a;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import b;
import c;
import com.kakao.tistory.domain.blog.entity.ChallengeStatus;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainChallenge.Participant;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainChallenge.ParticipationStatus;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainChallenge.Preview;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainChallenge;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainChallengeList;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.common.CommonImageKt;
import com.kakao.tistory.presentation.widget.common.VerticalDividerKt;
import d;
import e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u001B\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallengeList;", "challengeList", "", "blogMainChallengeList", "(Landroidx/compose/foundation/lazy/LazyListScope;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainChallengeList;)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogMainChallenge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogMainChallenge.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainChallengeKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,405:1\n71#2:406\n67#2,7:407\n74#2:442\n78#2:446\n71#2:706\n69#2,5:707\n74#2:740\n71#2:744\n69#2,5:745\n74#2:778\n78#2:784\n78#2:789\n78#3,6:414\n85#3,4:429\n89#3,2:439\n93#3:445\n78#3,6:455\n85#3,4:470\n89#3,2:480\n93#3:488\n78#3,6:499\n85#3,4:514\n89#3,2:524\n93#3:531\n78#3,6:541\n85#3,4:556\n89#3,2:566\n78#3,6:578\n85#3,4:593\n89#3,2:603\n93#3:610\n78#3,6:621\n85#3,4:636\n89#3,2:646\n93#3:653\n93#3:657\n78#3,6:669\n85#3,4:684\n89#3,2:694\n93#3:702\n78#3,6:712\n85#3,4:727\n89#3,2:737\n78#3,6:750\n85#3,4:765\n89#3,2:775\n93#3:783\n93#3:788\n78#3,6:800\n85#3,4:815\n89#3,2:825\n93#3:834\n368#4,9:420\n377#4:441\n378#4,2:443\n368#4,9:461\n377#4:482\n378#4,2:486\n368#4,9:505\n377#4:526\n378#4,2:529\n368#4,9:547\n377#4:568\n368#4,9:584\n377#4:605\n378#4,2:608\n368#4,9:627\n377#4:648\n378#4,2:651\n378#4,2:655\n368#4,9:675\n377#4:696\n378#4,2:700\n368#4,9:718\n377#4:739\n368#4,9:756\n377#4:777\n378#4,2:781\n378#4,2:786\n368#4,9:806\n377#4:827\n378#4,2:832\n4032#5,6:433\n4032#5,6:474\n4032#5,6:518\n4032#5,6:560\n4032#5,6:597\n4032#5,6:640\n4032#5,6:688\n4032#5,6:731\n4032#5,6:769\n4032#5,6:819\n85#6:447\n81#6,7:448\n88#6:483\n92#6:489\n85#6:492\n82#6,6:493\n88#6:527\n92#6:532\n85#6:535\n83#6,5:536\n88#6:569\n92#6:658\n85#6:662\n82#6,6:663\n88#6:697\n92#6:703\n148#7:484\n148#7:485\n148#7:490\n148#7:491\n148#7:528\n148#7:533\n148#7:534\n148#7:607\n148#7:612\n148#7:650\n148#7:659\n148#7:660\n148#7:661\n148#7:698\n148#7:699\n148#7:704\n148#7:705\n148#7:779\n148#7:780\n148#7:790\n148#7:791\n148#7:792\n148#7:829\n148#7:830\n148#7:831\n98#8:570\n94#8,7:571\n101#8:606\n105#8:611\n98#8:613\n94#8,7:614\n101#8:649\n105#8:654\n98#8:793\n95#8,6:794\n101#8:828\n105#8:835\n1549#9:741\n1620#9,2:742\n1622#9:785\n*S KotlinDebug\n*F\n+ 1 BlogMainChallenge.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainChallengeKt\n*L\n64#1:406\n64#1:407,7\n64#1:442\n64#1:446\n333#1:706\n333#1:707,5\n333#1:740\n355#1:744\n355#1:745,5\n355#1:778\n355#1:784\n333#1:789\n64#1:414,6\n64#1:429,4\n64#1:439,2\n64#1:445\n90#1:455,6\n90#1:470,4\n90#1:480,2\n90#1:488\n172#1:499,6\n172#1:514,4\n172#1:524,2\n172#1:531\n210#1:541,6\n210#1:556,4\n210#1:566,2\n214#1:578,6\n214#1:593,4\n214#1:603,2\n214#1:610\n233#1:621,6\n233#1:636,4\n233#1:646,2\n233#1:653\n210#1:657\n289#1:669,6\n289#1:684,4\n289#1:694,2\n289#1:702\n333#1:712,6\n333#1:727,4\n333#1:737,2\n355#1:750,6\n355#1:765,4\n355#1:775,2\n355#1:783\n333#1:788\n374#1:800,6\n374#1:815,4\n374#1:825,2\n374#1:834\n64#1:420,9\n64#1:441\n64#1:443,2\n90#1:461,9\n90#1:482\n90#1:486,2\n172#1:505,9\n172#1:526\n172#1:529,2\n210#1:547,9\n210#1:568\n214#1:584,9\n214#1:605\n214#1:608,2\n233#1:627,9\n233#1:648\n233#1:651,2\n210#1:655,2\n289#1:675,9\n289#1:696\n289#1:700,2\n333#1:718,9\n333#1:739\n355#1:756,9\n355#1:777\n355#1:781,2\n333#1:786,2\n374#1:806,9\n374#1:827\n374#1:832,2\n64#1:433,6\n90#1:474,6\n172#1:518,6\n210#1:560,6\n214#1:597,6\n233#1:640,6\n289#1:688,6\n333#1:731,6\n355#1:769,6\n374#1:819,6\n90#1:447\n90#1:448,7\n90#1:483\n90#1:489\n172#1:492\n172#1:493,6\n172#1:527\n172#1:532\n210#1:535\n210#1:536,5\n210#1:569\n210#1:658\n289#1:662\n289#1:663,6\n289#1:697\n289#1:703\n93#1:484\n97#1:485\n112#1:490\n175#1:491\n186#1:528\n211#1:533\n212#1:534\n228#1:607\n235#1:612\n247#1:650\n276#1:659\n277#1:660\n290#1:661\n303#1:698\n311#1:699\n336#1:704\n337#1:705\n363#1:779\n364#1:780\n376#1:790\n378#1:791\n380#1:792\n388#1:829\n389#1:830\n392#1:831\n214#1:570\n214#1:571,7\n214#1:606\n214#1:611\n233#1:613\n233#1:614,7\n233#1:649\n233#1:654\n374#1:793\n374#1:794,6\n374#1:828\n374#1:835\n349#1:741\n349#1:742,2\n349#1:785\n*E\n"})
public final class BlogMainChallengeKt {
    public static final void a(int v, int v1, List list0, Composer composer0, int v2) {
        float f2;
        Composer composer1 = composer0.startRestartGroup(-1958991707);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1958991707, v2, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.ParticipationBar (BlogMainChallenge.kt:330)");
        }
        float f = (float)v1;
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = ModifierKt.shape-8ww4TTg$default(SizeKt.height-3ABfNKs(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 0.0f, 11.0f, 1, null), 10.0f), RoundedCornerShapeKt.RoundedCornerShape(100), 0L, null, 0.0f, 12, null);
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenterStart(), false);
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
        BoxKt.Box(ModifierKt.shape-8ww4TTg$default(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth(modifier$Companion0, ((float)v) / f), 0.0f, 1, null), RoundedCornerShapeKt.RoundedCornerShape(100), 0L, null, 0.0f, 12, null), composer1, 0);
        composer1.startReplaceGroup(-1556630245);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            float f1 = (float)((Number)object0).intValue();
            long v4 = Color.copy-wmQWz5c$default(0L, (((float)v) >= f1 ? 0.6f : 0.2f), 0.0f, 0.0f, 0.0f, 14, null);
            Companion modifier$Companion1 = Modifier.Companion;
            Modifier modifier2 = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth(modifier$Companion1, f1 / f), 0.0f, 1, null);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenterEnd(), false);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion1 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion1.getConstructor();
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
            Function2 function21 = a.a(composeUiNode$Companion1, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting()) {
                f2 = f;
                d.a(v5, composer1, v5, function21);
            }
            else {
                f2 = f;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                    d.a(v5, composer1, v5, function21);
                }
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion1.getSetModifier());
            BoxKt.Box(ModifierKt.shape-8ww4TTg$default(SizeKt.size-3ABfNKs(PaddingKt.padding-VpY3zN4$default(modifier$Companion1, 3.0f, 0.0f, 2, null), 4.0f), RoundedCornerShapeKt.getCircleShape(), v4, null, 0.0f, 12, null), composer1, 0);
            composer1.endNode();
            arrayList0.add(Unit.INSTANCE);
            f = f2;
        }
        if(m.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k0(v, v1, list0, v2));
        }
    }

    public static final void a(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x823EDF03);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x823EDF03, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.Title (BlogMainChallenge.kt:102)");
            }
            String s = StringResources_androidKt.stringResource(string.label_blog_challenge, composer1, 0);
            TextStyle textStyle0 = new TextStyle(0L, 0x141800000L, FontWeight.Companion.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null);
            TextKt.Text--4IGK_g(s, PaddingKt.padding-VpY3zN4(Modifier.Companion, 20.0f, 10.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, 0x180, 0, 0xFFF8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m0(v));
        }
    }

    public static final void a(ParticipationStatus blogMainChallenge$ParticipationStatus0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xF7A97E97);
        int v1 = (v & 14) == 0 ? (composer1.changed(blogMainChallenge$ParticipationStatus0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF7A97E97, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.ChallengeStatus (BlogMainChallenge.kt:265)");
            }
            String s = StringResources_androidKt.stringResource(blogMainChallenge$ParticipationStatus0.getLabelRes(), composer1, 0);
            TextStyle textStyle0 = new TextStyle(0L, 0x141400000L, FontWeight.Companion.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null);
            RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape(100);
            TextKt.Text--4IGK_g(s, PaddingKt.padding-VpY3zN4(BorderKt.border-xT4_qwU(Modifier.Companion, 1.0f, blogMainChallenge$ParticipationStatus0.getBorderColor-0d7_KjU(), roundedCornerShape0), 8.0f, 5.0f), blogMainChallenge$ParticipationStatus0.getTextColor-0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, 0, 0, 0xFFF8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i0(blogMainChallenge$ParticipationStatus0, v));
        }
    }

    public static final void a(BlogMainChallenge blogMainChallenge0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x8ADAEE9F);
        int v1 = (v & 14) == 0 ? (composer1.changed(blogMainChallenge0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8ADAEE9F, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainChallenge (BlogMainChallenge.kt:88)");
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
            BlogMainChallengeKt.a(composer1, 0);
            b.a(2.0f, modifier$Companion0, composer1, 6);
            BlogMainChallengeKt.b(blogMainChallenge0, composer1, v1 & 14);
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
            scopeUpdateScope0.updateScope(new y(blogMainChallenge0, v));
        }
    }

    public static final void a(String s, int v, int v1, List list0, String s1, Composer composer0, int v2) {
        Composer composer1 = composer0.startRestartGroup(-1800527018);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1800527018, v2, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.ParticipationInfo (BlogMainChallenge.kt:287)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 22.0f, 0.0f, 0.0f, 13, null);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
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
        TextKt.Text-IbK3jfQ(StringUtils.INSTANCE.toAnnotatedStringFromHtmlText(s1, composer1, v2 >> 12 & 14 | 0x40), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(0L, 0x141B00000L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141E00000L, null, null, null, 0, 0, null, 0xFDFFD9, null), composer1, 0x180, 0, 0x1FFFA);
        b.a(8.0f, modifier$Companion0, composer1, 6);
        BlogMainChallengeKt.a(v, v1, list0, composer1, v2 >> 3 & 0x70 | (v2 >> 3 & 14 | 0x200));
        b.a(11.0f, modifier$Companion0, composer1, 6);
        TextKt.Text-IbK3jfQ(StringUtils.INSTANCE.toAnnotatedStringFromHtmlText(s, composer1, v2 & 14 | 0x40), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(0L, 0x141500000L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141A00000L, null, null, null, 0, 0, null, 0xFDFFD9, null), composer1, 0x180, 0, 0x1FFFA);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l0(s, v, v1, list0, s1, v2));
        }
    }

    public static final void a(String s, ParticipationStatus blogMainChallenge$ParticipationStatus0, String s1, String s2, int v, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x1F1001A5);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(blogMainChallenge$ParticipationStatus0) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changed(s1) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v2 |= (composer1.changed(s2) ? 0x800 : 0x400);
        }
        if((0xE000 & v1) == 0) {
            v2 |= (composer1.changed(v) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1F1001A5, v2, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.ChallengeTitle (BlogMainChallenge.kt:208)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 20.0f, 0.0f, 17.0f, 5, null);
            Arrangement arrangement0 = Arrangement.INSTANCE;
            HorizontalOrVertical arrangement$HorizontalOrVertical0 = arrangement0.spacedBy-0680j_4(6.0f);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement$HorizontalOrVertical0, alignment$Companion0.getStart(), composer1, 6);
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
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function21);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            androidx.compose.ui.text.font.FontWeight.Companion fontWeight$Companion0 = FontWeight.Companion;
            TextStyle textStyle0 = new TextStyle(0L, 0x141800000L, fontWeight$Companion0.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null);
            TextKt.Text--4IGK_g(s, RowScopeInstance.INSTANCE.weight(modifier$Companion0, 1.0f, false), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, v2 & 14 | 0x180, 0, 0xFFF8);
            c.a(4.0f, modifier$Companion0, composer1, 6);
            BlogMainChallengeKt.a(blogMainChallenge$ParticipationStatus0, composer1, v2 >> 3 & 14);
            composer1.endNode();
            MeasurePolicy measurePolicy2 = RowKt.rowMeasurePolicy(arrangement0.spacedBy-0680j_4(6.0f), alignment$Companion0.getCenterVertically(), composer1, 54);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
            Function2 function22 = a.a(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                d.a(v5, composer1, v5, function22);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            TextKt.Text--4IGK_g((s1 + " - " + s2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141500000L, fontWeight$Companion0.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null), composer1, 0x180, 0, 0xFFFA);
            VerticalDividerKt.VerticalDivider-aM-cp0Q(SizeKt.height-3ABfNKs(modifier$Companion0, 10.0f), 0L, 1.0f, composer1, 438, 0);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_blog_challenge_percent, new Object[]{v}, composer1, 0x40), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141500000L, fontWeight$Companion0.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null), composer1, 0x180, 0, 0xFFFA);
            if(e.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j0(s, blogMainChallenge$ParticipationStatus0, s1, s2, v, v1));
        }
    }

    public static final void a(Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x81E09EB);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x81E09EB, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.Auth (BlogMainChallenge.kt:372)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-VpY3zN4(ClickableKt.clickable-XHw0xAI$default(ModifierKt.shape-8ww4TTg$default(SizeKt.fillMaxWidth$default(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 20.0f, 0.0f, 0.0f, 13, null), 0.0f, 1, null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(4.0f), 0L, null, 0.0f, 12, null), false, null, null, function00, 7, null), 12.0f, 13.0f);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ico_tip, composer1, 0), null, SizeKt.width-3ABfNKs(SizeKt.height-3ABfNKs(modifier$Companion0, 16.0f), 17.0f), 0L, composer1, 0xDB8, 0);
            c.a(6.0f, modifier$Companion0, composer1, 6);
            String s = StringResources_androidKt.stringResource(string.label_blog_challenge_auth, composer1, 0);
            String s1 = StringResources_androidKt.stringResource(string.label_blog_challenge_auth_point, composer1, 0);
            TextKt.Text-IbK3jfQ(StringUtils.INSTANCE.toAnnotatedStringWithUnderline(s, s1, composer1, 0x200), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(0L, 0x141400000L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null), composer1, 0x180, 0, 0x1FFFA);
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
            scopeUpdateScope0.updateScope(new x(function00, v));
        }
    }

    public static final void access$BlogMainChallengeParticipantPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1235066402);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1235066402, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainChallengeParticipantPreview (BlogMainChallenge.kt:62)");
            }
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
            List list0 = CollectionsKt__CollectionsKt.listOf(new Integer[]{4, 9, 15, 21});
            BlogMainChallengeKt.a(new Participant(ChallengeStatus.OPEN, "작심삼주 오블완 챌린지", ParticipationStatus.PARTICIPATED, "2024.11.07", "2024.11.27", 5, "<b>빅맥쿠폰</b>까지 3일 남았습니다.", 12, 21, list0, "<b>21</b>일 목표중\n<b>12</b>일 참여중입니다.", false, z.a, a0.a), composer1, 0);
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
            scopeUpdateScope0.updateScope(new b0(v));
        }
    }

    public static final void access$BlogMainChallengePreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xFB998DBF);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xFB998DBF, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainChallengePreview (BlogMainChallenge.kt:49)");
            }
            BlogMainChallengeKt.a(new Preview(ChallengeStatus.OPEN, "https://tistory1.daumcdn.net/tistory/1/admin/entry/2672/1d179497da38414e8da0ddd1b443211a", c0.a), composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d0(v));
        }
    }

    public static final void access$ChallengeCardParticipant(Participant blogMainChallenge$Participant0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xA2A8E47E);
        int v1 = (v & 14) == 0 ? (composer1.changed(blogMainChallenge$Participant0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA2A8E47E, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.ChallengeCardParticipant (BlogMainChallenge.kt:170)");
            }
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(ClickableKt.clickable-XHw0xAI$default(Modifier.Companion, false, null, null, blogMainChallenge$Participant0.getOnClickChallenge(), 7, null), 20.0f, 0.0f, 20.0f, 20.0f, 2, null);
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
            BlogMainChallengeKt.a(blogMainChallenge$Participant0.getTitle(), blogMainChallenge$Participant0.getParticipationStatus(), blogMainChallenge$Participant0.getStartDate(), blogMainChallenge$Participant0.getEndDate(), blogMainChallenge$Participant0.getPercentage(), composer1, 0);
            DividerKt.HorizontalDivider-9IZ8Weo(null, 1.0f, 0L, composer1, 0x1B0, 1);
            BlogMainChallengeKt.a(blogMainChallenge$Participant0.getMessage(), blogMainChallenge$Participant0.getCurrent(), blogMainChallenge$Participant0.getTotal(), blogMainChallenge$Participant0.getPrizeInfo(), blogMainChallenge$Participant0.getDescription(), composer1, 0x1000);
            composer1.startReplaceGroup(0xC7F81F10);
            if(!blogMainChallenge$Participant0.isAgeAuthed()) {
                BlogMainChallengeKt.a(blogMainChallenge$Participant0.getOnClickAuth(), composer1, 0);
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
            scopeUpdateScope0.updateScope(new g0(blogMainChallenge$Participant0, v));
        }
    }

    public static final void access$ChallengeCardPreview(Preview blogMainChallenge$Preview0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x6D8A95A8);
        int v1 = (v & 14) == 0 ? (composer1.changed(blogMainChallenge$Preview0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6D8A95A8, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.ChallengeCardPreview (BlogMainChallenge.kt:157)");
            }
            CommonImageKt.CommonImage(blogMainChallenge$Preview0.getImage(), null, ClickableKt.clickable-XHw0xAI$default(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 1.0f, false, 2, null), false, null, null, blogMainChallenge$Preview0.getOnClickChallenge(), 7, null), null, null, ContentScale.Companion.getFillWidth(), composer1, 0x30030, 24);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h0(blogMainChallenge$Preview0, v));
        }
    }

    public static final void b(BlogMainChallenge blogMainChallenge0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x1CD47C8A);
        int v1 = (v & 14) == 0 ? (composer1.changed(blogMainChallenge0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1CD47C8A, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.ChallengeCard (BlogMainChallenge.kt:116)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(0x7BABF3E0, true, new e0(blogMainChallenge0), composer1, 54), composer1, 0xC06, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f0(blogMainChallenge0, v));
        }
    }

    public static final void blogMainChallengeList(@NotNull LazyListScope lazyListScope0, @Nullable BlogMainChallengeList blogMainChallengeList0) {
        Intrinsics.checkNotNullParameter(lazyListScope0, "<this>");
        if(blogMainChallengeList0 != null) {
            List list0 = blogMainChallengeList0.getList();
            if(list0 != null) {
                BlogMainChallenge blogMainChallenge0 = (BlogMainChallenge)CollectionsKt___CollectionsKt.firstOrNull(list0);
                if(blogMainChallenge0 != null) {
                    Logger.INSTANCE.log("ayla blogMainChallengeList challenge: " + blogMainChallenge0);
                    LazyListScope.item$default(lazyListScope0, null, null, ComposableLambdaKt.composableLambdaInstance(0x2639B013, true, new n0(blogMainChallenge0)), 3, null);
                }
            }
        }
    }
}

