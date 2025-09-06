package com.kakao.kandinsky.textedit.ui;

import aa.d;
import aa.g;
import aa.m;
import aa.q;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.y;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.e0;
import androidx.compose.material3.pi;
import androidx.compose.material3.sf;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import androidx.room.a;
import ca.h;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.designsystem.common.FunctionStateKt;
import com.kakao.kandinsky.designsystem.common.KDButtonColors;
import com.kakao.kandinsky.designsystem.common.KDButtonDefaults;
import com.kakao.kandinsky.designsystem.common.KDButtonKt;
import com.kakao.kandinsky.textedit.R.drawable;
import com.kakao.kandinsky.textedit.contract.FontData;
import com.kakao.kandinsky.textedit.contract.InputState;
import eb.f;
import eb.o;
import eb.r;
import eb.s;
import eb.t;
import eb.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001Ai\u0010\r\u001A\u00020\f2\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u000E\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00002\u000E\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00002\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u0001¢\u0006\u0004\b\r\u0010\u000E\u001A)\u0010\u0010\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\t\"\u0004\b\u0000\u0010\u000F*\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014²\u0006\u000E\u0010\u0013\u001A\u00020\u00128\n@\nX\u008A\u008E\u0002"}, d2 = {"Lcom/kakao/kandinsky/textedit/contract/InputState;", "", "bold", "italic", "underLine", "Landroidx/compose/ui/text/style/TextAlign;", "align", "", "font", "", "Lcom/kakao/kandinsky/textedit/contract/FontData;", "fontList", "", "TextStyleAndFontPanel", "(Lcom/kakao/kandinsky/textedit/contract/InputState;Lcom/kakao/kandinsky/textedit/contract/InputState;Lcom/kakao/kandinsky/textedit/contract/InputState;Lcom/kakao/kandinsky/textedit/contract/InputState;Lcom/kakao/kandinsky/textedit/contract/InputState;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "T", "subListPerRow", "(Ljava/util/List;)Ljava/util/List;", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "textData", "textedit_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextStyleAndFontPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextStyleAndFontPanel.kt\ncom/kakao/kandinsky/textedit/ui/TextStyleAndFontPanelKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,270:1\n1223#2,6:271\n1223#2,6:277\n1223#2,6:283\n1223#2,6:289\n1223#2,6:295\n1223#2,6:301\n1223#2,6:307\n1223#2,6:474\n1223#2,6:494\n148#3:313\n148#3:354\n148#3:355\n148#3:356\n148#3:397\n148#3:492\n148#3:493\n148#3:500\n148#3:501\n85#4:314\n82#4,6:315\n88#4:349\n92#4:353\n85#4:398\n81#4,7:399\n88#4:434\n92#4:489\n78#5,6:321\n85#5,4:336\n89#5,2:346\n93#5:352\n78#5,6:364\n85#5,4:379\n89#5,2:389\n93#5:395\n78#5,6:406\n85#5,4:421\n89#5,2:431\n78#5,6:444\n85#5,4:459\n89#5,2:469\n93#5:483\n93#5:488\n368#6,9:327\n377#6:348\n378#6,2:350\n368#6,9:370\n377#6:391\n378#6,2:393\n368#6,9:412\n377#6:433\n368#6,9:450\n377#6:471\n378#6,2:481\n378#6,2:486\n4032#7,6:340\n4032#7,6:383\n4032#7,6:425\n4032#7,6:463\n98#8:357\n95#8,6:358\n101#8:392\n105#8:396\n98#8:436\n94#8,7:437\n101#8:472\n105#8:484\n1855#9:435\n1855#9:473\n1856#9:480\n1856#9:485\n1855#9,2:490\n81#10:502\n107#10,2:503\n*S KotlinDebug\n*F\n+ 1 TextStyleAndFontPanel.kt\ncom/kakao/kandinsky/textedit/ui/TextStyleAndFontPanelKt\n*L\n38#1:271,6\n39#1:277,6\n44#1:283,6\n47#1:289,6\n50#1:295,6\n53#1:301,6\n56#1:307,6\n151#1:474,6\n225#1:494,6\n72#1:313\n91#1:354\n92#1:355\n93#1:356\n140#1:397\n186#1:492\n187#1:493\n261#1:500\n262#1:501\n72#1:314\n72#1:315,6\n72#1:349\n72#1:353\n143#1:398\n143#1:399,7\n143#1:434\n143#1:489\n72#1:321,6\n72#1:336,4\n72#1:346,2\n72#1:352\n89#1:364,6\n89#1:379,4\n89#1:389,2\n89#1:395\n143#1:406,6\n143#1:421,4\n143#1:431,2\n145#1:444,6\n145#1:459,4\n145#1:469,2\n145#1:483\n143#1:488\n72#1:327,9\n72#1:348\n72#1:350,2\n89#1:370,9\n89#1:391\n89#1:393,2\n143#1:412,9\n143#1:433\n145#1:450,9\n145#1:471\n145#1:481,2\n143#1:486,2\n72#1:340,6\n89#1:383,6\n143#1:425,6\n145#1:463,6\n89#1:357\n89#1:358,6\n89#1:392\n89#1:396\n145#1:436\n145#1:437,7\n145#1:472\n145#1:484\n144#1:435\n146#1:473\n146#1:480\n144#1:485\n175#1:490,2\n38#1:502\n38#1:503,2\n*E\n"})
public final class TextStyleAndFontPanelKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TextStyleAndFontPanel(@NotNull InputState inputState0, @NotNull InputState inputState1, @NotNull InputState inputState2, @Nullable InputState inputState3, @NotNull InputState inputState4, @Nullable List list0, @Nullable Composer composer0, int v, int v1) {
        List list1;
        int v2;
        Intrinsics.checkNotNullParameter(inputState0, "bold");
        Intrinsics.checkNotNullParameter(inputState1, "italic");
        Intrinsics.checkNotNullParameter(inputState2, "underLine");
        Intrinsics.checkNotNullParameter(inputState4, "font");
        Composer composer1 = composer0.startRestartGroup(0x9FE611FA);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(inputState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(inputState1) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(inputState2) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(inputState3) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(inputState4) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x10000;
        }
        if((v1 & 0x20) != 0x20 || (0x5B6DB & v2) != 74898 || !composer1.getSkipping()) {
            list1 = (v1 & 0x20) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9FE611FA, v2, -1, "com.kakao.kandinsky.textedit.ui.TextStyleAndFontPanel (TextStyleAndFontPanel.kt:70)");
            }
            Modifier modifier0 = PaddingKt.padding-3ABfNKs(Modifier.Companion, 20.0f);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            TextStyleAndFontPanelKt.d(inputState0, inputState1, inputState2, inputState3, composer1, v2 & 0x1FFE);
            List list2 = TextStyleAndFontPanelKt.subListPerRow(list1);
            composer1.startReplaceGroup(0xEAF85274);
            if(!list2.isEmpty()) {
                TextStyleAndFontPanelKt.b(list2, inputState4, composer1, v2 >> 9 & 0x70 | 8);
            }
            if(a.x(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            list1 = list0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new pi(inputState0, inputState1, inputState2, inputState3, inputState4, list1, v, v1, 2));
        }
    }

    public static final void a(Modifier modifier0, TextAlign textAlign0, Function1 function10, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xC4F2A13A);
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
            v2 |= (composer1.changed(textAlign0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC4F2A13A, v2, -1, "com.kakao.kandinsky.textedit.ui.AlignButton (TextStyleAndFontPanel.kt:215)");
            }
            long v3 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU();
            long v4 = Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
            KDButtonColors kDButtonColors0 = KDButtonDefaults.INSTANCE.buttonColors-zf8z9n0(0.0f, 0L, v3, 0L, v4, composer1, KDButtonDefaults.$stable << 15, 11);
            composer1.startReplaceGroup(0x6A215F18);
            r r0 = composer1.rememberedValue();
            if((((v2 & 0x380) == 0x100 ? 1 : 0) | ((v2 & 0x70) == 0x20 ? 1 : 0)) != 0 || r0 == Composer.Companion.getEmpty()) {
                r0 = new r(textAlign0, function10);
                composer1.updateRememberedValue(r0);
            }
            composer1.endReplaceGroup();
            KDButtonKt.KDIconButton(r0, modifier1, textAlign0 != null, kDButtonColors0, null, ComposableLambdaKt.rememberComposableLambda(0x5F81BFB0, true, new s(textAlign0), composer1, 54), composer1, v2 << 3 & 0x70 | 0x30000, 16);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(modifier1, textAlign0, function10, v, v1, 9));
        }
    }

    public static final void access$AlignButton-aezQfng(Modifier modifier0, TextAlign textAlign0, Function1 function10, Composer composer0, int v, int v1) {
        TextStyleAndFontPanelKt.a(modifier0, textAlign0, function10, composer0, v, v1);
    }

    public static final void access$FontPanel(List list0, InputState inputState0, Composer composer0, int v) {
        TextStyleAndFontPanelKt.b(list0, inputState0, composer0, v);
    }

    public static final void access$StylePanel(InputState inputState0, InputState inputState1, InputState inputState2, InputState inputState3, Composer composer0, int v) {
        TextStyleAndFontPanelKt.d(inputState0, inputState1, inputState2, inputState3, composer0, v);
    }

    public static final void access$TextStyleAndFontPanelPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x5097035);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5097035, v, -1, "com.kakao.kandinsky.textedit.ui.TextStyleAndFontPanelPreview (TextStyleAndFontPanel.kt:27)");
            }
            List list0 = CollectionsKt__CollectionsKt.listOf(new FontData[]{new FontData("111", null), new FontData("나눔고딕", null, 2, null), new FontData("본고딕R", null, 2, null), new FontData("본명조", null, 2, null), new FontData("카카오산스", null, 2, null), new FontData("본고딕L", null, 2, null)});
            composer1.startReplaceGroup(0x9C8BCA0F);
            MutableState mutableState0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(new TextData("", 0L, 0.0f, 0L, 0.0f, 0L, 0L, false, false, false, 0, null, 0.0f, 0.0f, 0x3FFE, null), null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x9C8BCA60);
            q q0 = composer1.rememberedValue();
            if(q0 == composer$Companion0.getEmpty()) {
                q0 = new q(mutableState0, 16);
                composer1.updateRememberedValue(q0);
            }
            composer1.endReplaceGroup();
            Boolean boolean0 = Boolean.valueOf(((TextData)mutableState0.getValue()).getBold());
            composer1.startReplaceGroup(-1668560179);
            o o0 = composer1.rememberedValue();
            if(o0 == composer$Companion0.getEmpty()) {
                o0 = new o(q0, mutableState0, 2);
                composer1.updateRememberedValue(o0);
            }
            composer1.endReplaceGroup();
            InputState inputState0 = new InputState(boolean0, o0);
            Boolean boolean1 = Boolean.valueOf(((TextData)mutableState0.getValue()).getItalic());
            composer1.startReplaceGroup(-1668560074);
            o o1 = composer1.rememberedValue();
            if(o1 == composer$Companion0.getEmpty()) {
                o1 = new o(q0, mutableState0, 3);
                composer1.updateRememberedValue(o1);
            }
            composer1.endReplaceGroup();
            InputState inputState1 = new InputState(boolean1, o1);
            Boolean boolean2 = Boolean.valueOf(((TextData)mutableState0.getValue()).getUnderLine());
            composer1.startReplaceGroup(0x9C8BCBA7);
            o o2 = composer1.rememberedValue();
            if(o2 == composer$Companion0.getEmpty()) {
                o2 = new o(q0, mutableState0, 4);
                composer1.updateRememberedValue(o2);
            }
            composer1.endReplaceGroup();
            InputState inputState2 = new InputState(boolean2, o2);
            TextAlign textAlign0 = TextAlign.box-impl(((TextData)mutableState0.getValue()).getAlign-e0LSkKk());
            composer1.startReplaceGroup(0x9C8BCC13);
            o o3 = composer1.rememberedValue();
            if(o3 == composer$Companion0.getEmpty()) {
                o3 = new o(q0, mutableState0, 5);
                composer1.updateRememberedValue(o3);
            }
            composer1.endReplaceGroup();
            InputState inputState3 = new InputState(textAlign0, o3);
            Integer integer0 = ((TextData)mutableState0.getValue()).getFont();
            composer1.startReplaceGroup(0x9C8BCC79);
            o o4 = composer1.rememberedValue();
            if(o4 == composer$Companion0.getEmpty()) {
                o4 = new o(q0, mutableState0, 6);
                composer1.updateRememberedValue(o4);
            }
            composer1.endReplaceGroup();
            TextStyleAndFontPanelKt.TextStyleAndFontPanel(inputState0, inputState1, inputState2, inputState3, new InputState(integer0, o4), list0, composer1, 0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(v, 5));
        }
    }

    public static final TextData access$TextStyleAndFontPanelPreview$lambda$1(MutableState mutableState0) {
        return (TextData)mutableState0.getValue();
    }

    public static final void access$TextStyleAndFontPanelPreview$lambda$2(MutableState mutableState0, TextData textData0) {
        mutableState0.setValue(textData0);
    }

    public static final void access$VerticalDivider(Composer composer0, int v) {
        TextStyleAndFontPanelKt.f(composer0, v);
    }

    public static final void b(List list0, InputState inputState0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x99AB57B5);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x99AB57B5, v, -1, "com.kakao.kandinsky.textedit.ui.FontPanel (TextStyleAndFontPanel.kt:138)");
        }
        SpacerKt.Spacer(SizeKt.size-3ABfNKs(Modifier.Companion, 9.0f), composer1, 6);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(9.0f), Alignment.Companion.getStart(), composer1, 6);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            a.t(v1, composer1, v1, function20);
        }
        r0.a.z(composeUiNode$Companion0, composer1, modifier0, composer1, -935000128);
        for(Object object0: list0) {
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(9.0f), Alignment.Companion.getTop(), composer1, 6);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
            Companion composeUiNode$Companion1 = ComposeUiNode.Companion;
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
            Function2 function21 = a.r(composeUiNode$Companion1, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function21);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion1.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            composer1.startReplaceGroup(820933706);
            for(Object object1: ((List)object0)) {
                FontData fontData0 = (FontData)object1;
                Modifier modifier2 = RowScope.weight$default(rowScopeInstance0, Modifier.Companion, 1.0f, false, 2, null);
                boolean z = Intrinsics.areEqual(fontData0.getResource(), inputState0.getValue());
                boolean z1 = true;
                composer1.startReplaceGroup(0xF01EC0AC);
                if(((v & 0x70 ^ 0x30) <= 0x20 || !composer1.changed(inputState0)) && (v & 0x30) != 0x20) {
                    z1 = false;
                }
                boolean z2 = composer1.changed(fontData0);
                m m0 = composer1.rememberedValue();
                if(z1 || z2 || m0 == Composer.Companion.getEmpty()) {
                    m0 = new m(17, inputState0, fontData0);
                    composer1.updateRememberedValue(m0);
                }
                composer1.endReplaceGroup();
                TextStyleAndFontPanelKt.c(modifier2, fontData0, !z, FunctionStateKt.skippableLambda(m0, composer1, 0), composer1, 0, 0);
            }
            composer1.endReplaceGroup();
            composer1.endNode();
        }
        if(a.x(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(list0, inputState0, v, 9));
        }
    }

    public static final void c(Modifier modifier0, FontData fontData0, boolean z, Function0 function00, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(2001655000);
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
            v2 |= (composer1.changed(fontData0) ? 0x20 : 16);
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
            v2 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2001655000, v2, -1, "com.kakao.kandinsky.textedit.ui.FontToggleButton (TextStyleAndFontPanel.kt:249)");
            }
            long v3 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU();
            long v4 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU();
            long v5 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU();
            long v6 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getPrimary-0d7_KjU();
            KDButtonColors kDButtonColors0 = KDButtonDefaults.INSTANCE.buttonColors-zf8z9n0(0.0f, v3, v5, v4, v6, composer1, KDButtonDefaults.$stable << 15, 1);
            composer1.startReplaceGroup(1790494326);
            BorderStroke borderStroke0 = z ? null : BorderStrokeKt.BorderStroke-cXLIe8U(1.0f, MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getPrimary-0d7_KjU());
            composer1.endReplaceGroup();
            KDButtonKt.KDButton(function00, modifier1, z, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(8.0f), kDButtonColors0, borderStroke0, null, null, ComposableLambdaKt.rememberComposableLambda(0xD488894F, true, new e0(fontData0, 5), composer1, 54), composer1, v2 >> 9 & 14 | 0x6000000 | v2 << 3 & 0x70 | v2 & 0x380, 0xC0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y(modifier1, fontData0, z, function00, v, v1, 3));
        }
    }

    public static final void d(InputState inputState0, InputState inputState1, InputState inputState2, InputState inputState3, Composer composer0, int v) {
        Function1 function10;
        Composer composer1 = composer0.startRestartGroup(0xCAA1EEE4);
        int v1 = (v & 14) == 0 ? (composer1.changed(inputState0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(inputState1) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(inputState2) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changed(inputState3) ? 0x800 : 0x400);
        }
        if((v1 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCAA1EEE4, v1, -1, "com.kakao.kandinsky.textedit.ui.StylePanel (TextStyleAndFontPanel.kt:87)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-3ABfNKs(BackgroundKt.background-bw27NRU(SizeKt.height-3ABfNKs(modifier$Companion0, 50.0f), MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getSecondaryContainer-0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(8.0f)), 4.0f);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            Modifier modifier2 = SizeKt.fillMaxHeight$default(RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), 0.0f, 1, null);
            TextStyleAndFontPanelKt.e(modifier2, ((Boolean)inputState0.getValue()).booleanValue(), inputState0.getOnChange(), drawable.style_bold, composer1, 0, 0);
            TextStyleAndFontPanelKt.f(composer1, 0);
            TextStyleAndFontPanelKt.e(modifier2, ((Boolean)inputState1.getValue()).booleanValue(), inputState1.getOnChange(), drawable.style_italic, composer1, 0, 0);
            TextStyleAndFontPanelKt.f(composer1, 0);
            TextStyleAndFontPanelKt.e(modifier2, ((Boolean)inputState2.getValue()).booleanValue(), inputState2.getOnChange(), drawable.style_underline, composer1, 0, 0);
            TextStyleAndFontPanelKt.f(composer1, 0);
            TextAlign textAlign0 = inputState3 == null ? null : ((TextAlign)inputState3.getValue());
            if(inputState3 == null) {
                function10 = f.z;
            }
            else {
                function10 = inputState3.getOnChange();
                if(function10 == null) {
                    function10 = f.z;
                }
            }
            TextStyleAndFontPanelKt.a(modifier2, textAlign0, function10, composer1, 0, 0);
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
            scopeUpdateScope0.updateScope(new g(v, 3, inputState0, inputState1, inputState2, inputState3));
        }
    }

    public static final void e(Modifier modifier0, boolean z, Function1 function10, int v, Composer composer0, int v1, int v2) {
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x396BBC47);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changed(v) ? 0x800 : 0x400);
        }
        if((v3 & 5851) != 1170 || !composer1.getSkipping()) {
            modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x396BBC47, v3, -1, "com.kakao.kandinsky.textedit.ui.StyleToggleButton (TextStyleAndFontPanel.kt:197)");
            }
            long v4 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU();
            KDButtonKt.KDIconToggleButton(z, function10, modifier1, false, KDButtonDefaults.INSTANCE.toggleButtonColors-dPtIKUs(0.0f, 0L, v4, 0L, 0L, 0L, 0L, composer1, KDButtonDefaults.$stable << 21, 0x7B), null, ComposableLambdaKt.rememberComposableLambda(0x84A1F272, true, new t(v), composer1, 54), composer1, v3 >> 3 & 0x70 | (v3 >> 3 & 14 | 0x180000) | v3 << 6 & 0x380, 40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u(modifier1, z, function10, v, v1, v2));
        }
    }

    public static final void f(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xEF17EFF6);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEF17EFF6, v, -1, "com.kakao.kandinsky.textedit.ui.VerticalDivider (TextStyleAndFontPanel.kt:182)");
            }
            SpacerKt.Spacer(BackgroundKt.background-bw27NRU$default(SizeKt.size-VpY3zN4(PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 2.0f, 0.0f, 2, null), 1.0f, 25.0f), MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getOutline-0d7_KjU(), null, 2, null), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(v, 6));
        }
    }

    @NotNull
    public static final List subListPerRow(@NotNull List list0) {
        List list1;
        Intrinsics.checkNotNullParameter(list0, "<this>");
        switch(list0.size()) {
            case 2: {
                list1 = k.listOf(2);
                break;
            }
            case 3: {
                list1 = k.listOf(3);
                break;
            }
            case 4: {
                list1 = CollectionsKt__CollectionsKt.listOf(new Integer[]{2, 2});
                break;
            }
            case 5: {
                list1 = CollectionsKt__CollectionsKt.listOf(new Integer[]{3, 2});
                break;
            }
            case 6: {
                list1 = CollectionsKt__CollectionsKt.listOf(new Integer[]{3, 3});
                break;
            }
            case 7: {
                list1 = CollectionsKt__CollectionsKt.listOf(new Integer[]{3, 2, 2});
                break;
            }
            case 8: {
                list1 = CollectionsKt__CollectionsKt.listOf(new Integer[]{3, 3, 2});
                break;
            }
            case 9: {
                list1 = CollectionsKt__CollectionsKt.listOf(new Integer[]{3, 3, 3});
                break;
            }
            default: {
                list1 = CollectionsKt__CollectionsKt.emptyList();
            }
        }
        List list2 = new ArrayList();
        int v = 0;
        for(Object object0: list1) {
            int v1 = ((Number)object0).intValue() + v;
            list2.add(list0.subList(v, v1));
            v = v1;
        }
        return list2;
    }
}

