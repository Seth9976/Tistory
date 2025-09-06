package com.kakao.kandinsky.textedit;

import aa.q;
import aa.r;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.bc;
import androidx.compose.material3.el;
import androidx.compose.material3.fc;
import androidx.compose.material3.g1;
import androidx.compose.material3.t5;
import androidx.compose.material3.td;
import androidx.compose.material3.ui;
import androidx.compose.material3.yc;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import cb.a;
import cb.b;
import cb.c;
import cb.d;
import cb.e;
import cb.f;
import cb.g;
import cb.h;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.designsystem.common.FunctionStateKt;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import com.kakao.kandinsky.designsystem.theme.OrientationKt;
import com.kakao.kandinsky.textedit.contract.InputState;
import com.kakao.kandinsky.textedit.ui.ColorPanelKt;
import com.kakao.kandinsky.textedit.ui.EditState;
import com.kakao.kandinsky.textedit.ui.EditTabBarKt;
import com.kakao.kandinsky.textedit.ui.TextInputKt;
import com.kakao.kandinsky.textedit.ui.TextStyleAndFontPanelKt;
import com.kakao.kdtracker.KDTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001AQ\u0010\f\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001A\u00020\u00052\u0014\u0010\t\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\b0\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001Al\u0010\u0015\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000E\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00020\u000F2\'\u0010\t\u001A#\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u000F¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\b0\u00112\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\b0\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001B²\u0006\u000E\u0010\u0017\u001A\u00020\u000F8\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u0019\u001A\u00020\u00188\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u001A\u001A\u00020\u00058\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u0014\u001A\u00020\u000F8\n@\nX\u008A\u008E\u0002"}, d2 = {"", "feature", "", "Lcom/kakao/kandinsky/textedit/contract/FontData;", "fontList", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "input", "Lkotlin/Function1;", "", "onChange", "Lkotlin/Function0;", "onClose", "TextDecorationEditor", "(Ljava/lang/String;Ljava/util/List;Lcom/kakao/kandinsky/core/kdphoto/TextData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "inputTextData", "", "inputWaterMark", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "waterMark", "TextSignatureEditor", "(Ljava/lang/String;Ljava/util/List;Lcom/kakao/kandinsky/core/kdphoto/TextData;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "showKeyboard", "Lcom/kakao/kandinsky/textedit/ui/EditState;", "editState", "textData", "textedit_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextEditor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextEditor.kt\ncom/kakao/kandinsky/textedit/TextEditorKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,324:1\n1223#2,6:325\n1223#2,6:331\n1223#2,6:337\n1223#2,6:344\n1223#2,6:350\n1223#2,6:356\n1223#2,6:362\n1223#2,6:369\n1223#2,6:411\n1223#2,6:417\n1223#2,6:458\n1223#2,6:464\n1223#2,6:470\n1223#2,6:476\n1223#2,6:522\n1223#2,6:528\n1223#2,6:571\n1223#2,6:577\n1223#2,6:583\n1223#2,6:589\n1223#2,6:595\n1223#2,6:601\n1223#2,6:607\n1223#2,6:613\n1223#2,6:619\n1223#2,6:625\n1223#2,6:631\n1223#2,6:637\n77#3:343\n77#3:368\n85#4:375\n82#4,6:376\n88#4:410\n85#4:486\n82#4,6:487\n88#4:521\n92#4:650\n92#4:654\n78#5,6:382\n85#5,4:397\n89#5,2:407\n78#5,6:429\n85#5,4:444\n89#5,2:454\n93#5:484\n78#5,6:493\n85#5,4:508\n89#5,2:518\n78#5,6:542\n85#5,4:557\n89#5,2:567\n93#5:645\n93#5:649\n93#5:653\n368#6,9:388\n377#6:409\n368#6,9:435\n377#6:456\n378#6,2:482\n368#6,9:499\n377#6:520\n368#6,9:548\n377#6:569\n378#6,2:643\n378#6,2:647\n378#6,2:651\n4032#7,6:401\n4032#7,6:448\n4032#7,6:512\n4032#7,6:561\n71#8:423\n69#8,5:424\n74#8:457\n78#8:485\n71#8:534\n67#8,7:535\n74#8:570\n78#8:646\n81#9:655\n107#9,2:656\n81#9:658\n107#9,2:659\n81#9:661\n107#9,2:662\n81#9:664\n107#9,2:665\n*S KotlinDebug\n*F\n+ 1 TextEditor.kt\ncom/kakao/kandinsky/textedit/TextEditorKt\n*L\n100#1:325,6\n101#1:331,6\n105#1:337,6\n108#1:344,6\n112#1:350,6\n113#1:356,6\n115#1:362,6\n120#1:369,6\n140#1:411,6\n142#1:417,6\n151#1:458,6\n152#1:464,6\n153#1:470,6\n156#1:476,6\n182#1:522,6\n190#1:528,6\n202#1:571,6\n206#1:577,6\n210#1:583,6\n214#1:589,6\n230#1:595,6\n231#1:601,6\n232#1:607,6\n238#1:613,6\n244#1:619,6\n245#1:625,6\n246#1:631,6\n252#1:637,6\n106#1:343\n119#1:368\n130#1:375\n130#1:376,6\n130#1:410\n162#1:486\n162#1:487,6\n162#1:521\n162#1:650\n130#1:654\n130#1:382,6\n130#1:397,4\n130#1:407,2\n135#1:429,6\n135#1:444,4\n135#1:454,2\n135#1:484\n162#1:493,6\n162#1:508,4\n162#1:518,2\n198#1:542,6\n198#1:557,4\n198#1:567,2\n198#1:645\n162#1:649\n130#1:653\n130#1:388,9\n130#1:409\n135#1:435,9\n135#1:456\n135#1:482,2\n162#1:499,9\n162#1:520\n198#1:548,9\n198#1:569\n198#1:643,2\n162#1:647,2\n130#1:651,2\n130#1:401,6\n135#1:448,6\n162#1:512,6\n198#1:561,6\n135#1:423\n135#1:424,5\n135#1:457\n135#1:485\n198#1:534\n198#1:535,7\n198#1:570\n198#1:646\n100#1:655\n100#1:656,2\n101#1:658\n101#1:659,2\n112#1:661\n112#1:662,2\n113#1:664\n113#1:665,2\n*E\n"})
public final class TextEditorKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[EditState.values().length];
            try {
                arr_v[EditState.FONT.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EditState.TEXT_COLOR.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EditState.BACKGROUND_COLOR.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EditState.KEYBOARD.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TextDecorationEditor(@NotNull String s, @NotNull List list0, @NotNull TextData textData0, @NotNull Function1 function10, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(s, "feature");
        Intrinsics.checkNotNullParameter(list0, "fontList");
        Intrinsics.checkNotNullParameter(textData0, "input");
        Intrinsics.checkNotNullParameter(function10, "onChange");
        Intrinsics.checkNotNullParameter(function00, "onClose");
        Composer composer1 = composer0.startRestartGroup(108505048);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(108505048, v, -1, "com.kakao.kandinsky.textedit.TextDecorationEditor (TextEditor.kt:40)");
        }
        CompositionLocalKt.CompositionLocalProvider(OrientationKt.getLocalOrientation().provides(Orientation.Portrait), ComposableLambdaKt.rememberComposableLambda(0x8F654B18, true, new bc(s, list0, textData0, function10, function00, 1), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new fc(s, list0, textData0, function10, function00, v, 2));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TextSignatureEditor(@NotNull String s, @NotNull List list0, @NotNull TextData textData0, boolean z, @NotNull Function2 function20, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(s, "feature");
        Intrinsics.checkNotNullParameter(list0, "fontList");
        Intrinsics.checkNotNullParameter(textData0, "inputTextData");
        Intrinsics.checkNotNullParameter(function20, "onChange");
        Intrinsics.checkNotNullParameter(function00, "onClose");
        Composer composer1 = composer0.startRestartGroup(-2041343091);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2041343091, v, -1, "com.kakao.kandinsky.textedit.TextSignatureEditor (TextEditor.kt:62)");
        }
        CompositionLocalKt.CompositionLocalProvider(OrientationKt.getLocalOrientation().provides(Orientation.Portrait), ComposableLambdaKt.rememberComposableLambda(0xE0A3C84D, true, new yc(s, list0, textData0, z, function20, function00), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new el(s, list0, textData0, z, function20, function00, v));
        }
    }

    public static final void a(String s, String s1, String s2) {
        Triple triple0 = Intrinsics.areEqual(s, "text-tab") ? new Triple(s1, s2, null) : new Triple("text-tab", s1, s2);
        KDTracker.INSTANCE.clickEvent(s, ((String)triple0.getFirst()), ((String)triple0.getSecond()), ((String)triple0.getThird()));
    }

    public static final void access$TextEditor(String s, List list0, Pair pair0, boolean z, h h0, Function2 function20, Function0 function00, Composer composer0, int v, int v1) {
        InputState inputState3;
        boolean z12;
        int v11;
        TextStyle textStyle1;
        Companion modifier$Companion1;
        int v6;
        Composer composer1 = composer0.startRestartGroup(-1084700417);
        boolean z1 = (v1 & 8) == 0 ? z : true;
        h h1 = (v1 & 16) == 0 ? h0 : new h(0L, false, 0x3F, 0.0f);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1084700417, v, -1, "com.kakao.kandinsky.textedit.TextEditor (TextEditor.kt:98)");
        }
        composer1.startReplaceGroup(0x91D4F2AA);
        MutableState mutableState0 = composer1.rememberedValue();
        androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x91D4F2E1);
        MutableState mutableState1 = composer1.rememberedValue();
        if(mutableState1 == composer$Companion0.getEmpty()) {
            mutableState1 = SnapshotStateKt.mutableStateOf$default(EditState.FONT, null, 2, null);
            composer1.updateRememberedValue(mutableState1);
        }
        composer1.endReplaceGroup();
        EditState editState0 = ((Boolean)mutableState0.getValue()).booleanValue() ? EditState.KEYBOARD : ((EditState)mutableState1.getValue());
        composer1.startReplaceGroup(0x91D4F377);
        FocusRequester focusRequester0 = composer1.rememberedValue();
        if(focusRequester0 == composer$Companion0.getEmpty()) {
            focusRequester0 = new FocusRequester();
            composer1.updateRememberedValue(focusRequester0);
        }
        composer1.endReplaceGroup();
        Object object0 = composer1.consume(CompositionLocalsKt.getLocalFocusManager());
        Unit unit0 = Unit.INSTANCE;
        composer1.startReplaceGroup(0x91D4F3E7);
        a a0 = composer1.rememberedValue();
        if(a0 == composer$Companion0.getEmpty()) {
            a0 = new a(focusRequester0, null);
            composer1.updateRememberedValue(a0);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit0, a0, composer1, 70);
        composer1.startReplaceGroup(0x91D4F42A);
        int v2 = v & 0x380 ^ 0x180;
        boolean z2 = v2 > 0x100 && composer1.changed(pair0) || (v & 0x180) == 0x100;
        MutableState mutableState2 = composer1.rememberedValue();
        if(z2 || mutableState2 == composer$Companion0.getEmpty()) {
            mutableState2 = SnapshotStateKt.mutableStateOf$default(pair0.getFirst(), null, 2, null);
            composer1.updateRememberedValue(mutableState2);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x91D4F46F);
        boolean z3 = v2 > 0x100 && composer1.changed(pair0) || (v & 0x180) == 0x100;
        MutableState mutableState3 = composer1.rememberedValue();
        if(z3 || mutableState3 == composer$Companion0.getEmpty()) {
            mutableState3 = SnapshotStateKt.mutableStateOf$default(pair0.getSecond(), null, 2, null);
            composer1.updateRememberedValue(mutableState3);
        }
        composer1.endReplaceGroup();
        TextData textData0 = (TextData)mutableState2.getValue();
        Boolean boolean0 = (Boolean)mutableState3.getValue();
        boolean0.getClass();
        composer1.startReplaceGroup(0x91D4F4D7);
        boolean z4 = (0x70000 & v ^ 0x30000) > 0x20000 && composer1.changed(function20) || (v & 0x30000) == 0x20000;
        boolean z5 = composer1.changed(mutableState2);
        boolean z6 = composer1.changed(mutableState3);
        b b0 = composer1.rememberedValue();
        if((z4 | z5 | z6) != 0 || b0 == composer$Companion0.getEmpty()) {
            b0 = new b(function20, mutableState2, mutableState3, null);
            composer1.updateRememberedValue(b0);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(textData0, boolean0, b0, composer1, 0x200);
        Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
        Float float0 = ((TextData)mutableState2.getValue()).getFontSize();
        composer1.startReplaceGroup(0x91D4F564);
        boolean z7 = composer1.changed(density0);
        boolean z8 = composer1.changed(mutableState2);
        int v3 = ((v & 0xE000 ^ 0x6000) <= 0x4000 || !composer1.changed(h1)) && (v & 0x6000) != 0x4000 ? 0 : 1;
        c c0 = composer1.rememberedValue();
        if((v3 | (z7 | z8)) != 0 || c0 == composer$Companion0.getEmpty()) {
            c0 = new c(density0, h1, mutableState2, null);
            composer1.updateRememberedValue(c0);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(density0, h1, float0, c0, composer1, v >> 9 & 0x70 | 0x1000);
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null);
        int v4 = MaterialTheme.$stable;
        Modifier modifier1 = BackgroundKt.background-bw27NRU$default(modifier0, MaterialTheme.INSTANCE.getColorScheme(composer1, v4).getScrim-0d7_KjU(), null, 2, null);
        Arrangement arrangement0 = Arrangement.INSTANCE;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
        int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        MaterialTheme materialTheme0 = MaterialTheme.INSTANCE;
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
        Function2 function21 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting()) {
            v6 = v4;
            androidx.room.a.t(v5, composer1, v5, function21);
        }
        else {
            v6 = v4;
            if(!Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                androidx.room.a.t(v5, composer1, v5, function21);
            }
        }
        Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
        Modifier modifier3 = SizeKt.fillMaxWidth$default(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), 0.0f, 1, null);
        composer1.startReplaceGroup(0x1C0FAA31);
        MutableInteractionSource mutableInteractionSource0 = composer1.rememberedValue();
        if(mutableInteractionSource0 == composer$Companion0.getEmpty()) {
            mutableInteractionSource0 = InteractionSourceKt.MutableInteractionSource();
            composer1.updateRememberedValue(mutableInteractionSource0);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x1C0FAA93);
        ui ui0 = composer1.rememberedValue();
        if(ui0 == composer$Companion0.getEmpty()) {
            ui0 = new ui(focusRequester0, 1);
            composer1.updateRememberedValue(ui0);
        }
        composer1.endReplaceGroup();
        Modifier modifier4 = ClickableKt.clickable-O2vRcR0$default(modifier3, mutableInteractionSource0, null, false, null, null, ui0, 28, null);
        MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenter(), false);
        int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
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
        Function2 function22 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
            androidx.room.a.t(v7, composer1, v7, function22);
        }
        Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
        String s1 = ((TextData)mutableState2.getValue()).getText();
        TextData textData1 = (TextData)mutableState2.getValue();
        boolean z9 = ((Boolean)mutableState3.getValue()).booleanValue();
        composer1.startReplaceGroup(0xB6F64D70);
        if(ComposerKt.isTraceInProgress()) {
            modifier$Companion1 = modifier$Companion0;
            ComposerKt.traceEventStart(0xB6F64D70, 0, -1, "com.kakao.kandinsky.textedit.getTextStyle (TextEditor.kt:264)");
        }
        else {
            modifier$Companion1 = modifier$Companion0;
        }
        if(z9) {
            composer1.startReplaceGroup(-80737300);
            TextStyle textStyle0 = textData1.getTextStyle(composer1, 0);
            FontWeight fontWeight0 = FontWeight.Companion.getNormal();
            TextDecoration textDecoration0 = TextDecoration.Companion.getNone();
            textStyle1 = TextStyle.copy-p1EtxEg$default(textStyle0, 0xFF99999900000000L, 0L, fontWeight0, FontStyle.box-impl(0), null, null, null, 0L, null, null, null, 0L, textDecoration0, null, null, 3, 0, 0L, null, null, null, 0, 0, null, 0xFF6FD2, null);
        }
        else {
            composer1.startReplaceGroup(0xFB300CEB);
            textStyle1 = textData1.getTextStyle(composer1, 0);
        }
        composer1.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer1.endReplaceGroup();
        long v8 = ((Boolean)mutableState3.getValue()).booleanValue() ? 0L : ((TextData)mutableState2.getValue()).getBackgroundWithAlpha-0d7_KjU();
        long v9 = ((TextData)mutableState2.getValue()).getPadding-NH-jbRc();
        composer1.startReplaceGroup(0x3A367564);
        boolean z10 = composer1.changed(mutableState2);
        q q0 = composer1.rememberedValue();
        if(z10 || q0 == composer$Companion0.getEmpty()) {
            q0 = new q(mutableState2, 9);
            composer1.updateRememberedValue(q0);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x3A3675AC);
        boolean z11 = composer1.changed(mutableState2);
        q q1 = composer1.rememberedValue();
        if(z11 || q1 == composer$Companion0.getEmpty()) {
            q1 = new q(mutableState2, 10);
            composer1.updateRememberedValue(q1);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x3A3675FD);
        int v10 = 0x380000 & v ^ 0x180000;
        if(v10 > 0x100000 && composer1.changed(function00)) {
            v11 = v10;
            z12 = true;
        }
        else {
            v11 = v10;
            z12 = (v & 0x180000) == 0x100000;
        }
        a4.c c1 = composer1.rememberedValue();
        if(z12 || c1 == composer$Companion0.getEmpty()) {
            c1 = new a4.c(function00, 6);
            composer1.updateRememberedValue(c1);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x3A367677);
        q q2 = composer1.rememberedValue();
        if(q2 == composer$Companion0.getEmpty()) {
            q2 = new q(mutableState0, 11);
            composer1.updateRememberedValue(q2);
        }
        composer1.endReplaceGroup();
        TextInputKt.TextInput-ca1Bfew(s1, textStyle1, v8, v9, z1, q0, q1, c1, focusRequester0, ((FocusManager)object0), q2, composer1, v << 3 & 0xE000 | 0x46000000, 6);
        composer1.endNode();
        Modifier modifier6 = BackgroundKt.background-bw27NRU$default(ClickableKt.clickable-XHw0xAI$default(modifier$Companion1, false, null, null, d.w, 6, null), materialTheme0.getColorScheme(composer1, v6).getBackground-0d7_KjU(), null, 2, null);
        MeasurePolicy measurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
        int v12 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier7 = ComposedModifierKt.materializeModifier(composer1, modifier6);
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
        Function2 function23 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v12)) {
            androidx.room.a.t(v12, composer1, v12, function23);
        }
        Updater.set-impl(composer1, modifier7, composeUiNode$Companion0.getSetModifier());
        boolean z13 = h1.f;
        boolean z14 = ((Boolean)mutableState3.getValue()).booleanValue();
        Function0 function04 = FunctionStateKt.skippableLambda(new td(s, ((FocusManager)object0), 5, focusRequester0), composer1, 0);
        Function1 function10 = FunctionStateKt.skippableLambda(new g1(1, s, ((FocusManager)object0), mutableState3, mutableState1), composer1, 0);
        composer1.startReplaceGroup(0x3A367A6B);
        boolean z15 = composer1.changed(mutableState3);
        int v13 = v & 14 ^ 6;
        boolean z16 = v13 > 4 && composer1.changed(s) || (v & 6) == 4;
        r r0 = composer1.rememberedValue();
        if(z15 || z16 || r0 == composer$Companion0.getEmpty()) {
            r0 = new r(s, focusRequester0, 4, mutableState3);
            composer1.updateRememberedValue(r0);
        }
        composer1.endReplaceGroup();
        Function1 function11 = FunctionStateKt.skippableLambda(r0, composer1, 0);
        composer1.startReplaceGroup(976649069);
        boolean z17 = composer1.changed(mutableState2);
        boolean z18 = v13 > 4 && composer1.changed(s) || (v & 6) == 4;
        int v14 = (v11 <= 0x100000 || !composer1.changed(function00)) && (v & 0x180000) != 0x100000 ? 0 : 1;
        td td0 = composer1.rememberedValue();
        if((z17 | z18 | v14) != 0 || td0 == composer$Companion0.getEmpty()) {
            td0 = new td(s, function00, mutableState2);
            composer1.updateRememberedValue(td0);
        }
        composer1.endReplaceGroup();
        EditTabBarKt.EditTabBar(editState0, z13, z14, function04, function10, function11, FunctionStateKt.skippableLambda(td0, composer1, 0), composer1, 0);
        MeasurePolicy measurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v15 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier8 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion1);
        Function0 function05 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function05);
        }
        else {
            composer1.useNode();
        }
        Function2 function24 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy3, composer1, compositionLocalMap3);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v15)) {
            androidx.room.a.t(v15, composer1, v15, function24);
        }
        Updater.set-impl(composer1, modifier8, composeUiNode$Companion0.getSetModifier());
        switch(WhenMappings.$EnumSwitchMapping$0[editState0.ordinal()]) {
            case 1: {
                boolean z19 = false;
                composer1.startReplaceGroup(-295986080);
                Boolean boolean1 = Boolean.valueOf(((TextData)mutableState2.getValue()).getBold());
                composer1.startReplaceGroup(0xEE5B9CB4);
                boolean z20 = v13 > 4 && composer1.changed(s) || (v & 6) == 4;
                boolean z21 = composer1.changed(mutableState2);
                e e0 = composer1.rememberedValue();
                if(z20 || z21 || e0 == composer$Companion0.getEmpty()) {
                    e0 = new e(s, mutableState2, 0);
                    composer1.updateRememberedValue(e0);
                }
                composer1.endReplaceGroup();
                InputState inputState0 = new InputState(boolean1, e0);
                Boolean boolean2 = Boolean.valueOf(((TextData)mutableState2.getValue()).getItalic());
                composer1.startReplaceGroup(0xEE5B9DAE);
                boolean z22 = v13 > 4 && composer1.changed(s) || (v & 6) == 4;
                boolean z23 = composer1.changed(mutableState2);
                e e1 = composer1.rememberedValue();
                if(z22 || z23 || e1 == composer$Companion0.getEmpty()) {
                    e1 = new e(s, mutableState2, 1);
                    composer1.updateRememberedValue(e1);
                }
                composer1.endReplaceGroup();
                InputState inputState1 = new InputState(boolean2, e1);
                Boolean boolean3 = Boolean.valueOf(((TextData)mutableState2.getValue()).getUnderLine());
                composer1.startReplaceGroup(0xEE5B9EB2);
                boolean z24 = v13 > 4 && composer1.changed(s) || (v & 6) == 4;
                boolean z25 = composer1.changed(mutableState2);
                e e2 = composer1.rememberedValue();
                if(z24 || z25 || e2 == composer$Companion0.getEmpty()) {
                    e2 = new e(s, mutableState2, 2);
                    composer1.updateRememberedValue(e2);
                }
                composer1.endReplaceGroup();
                InputState inputState2 = new InputState(boolean3, e2);
                composer1.startReplaceGroup(0xEE5B9F99);
                if(z1) {
                    inputState3 = null;
                }
                else {
                    TextAlign textAlign0 = TextAlign.box-impl(((TextData)mutableState2.getValue()).getAlign-e0LSkKk());
                    composer1.startReplaceGroup(0xEE5B9FCE);
                    if(v13 > 4 && composer1.changed(s) || (v & 6) == 4) {
                        z19 = true;
                    }
                    boolean z26 = composer1.changed(mutableState2);
                    e e3 = composer1.rememberedValue();
                    if(z26 || z19 || e3 == composer$Companion0.getEmpty()) {
                        e3 = new e(s, mutableState2, 3);
                        composer1.updateRememberedValue(e3);
                    }
                    composer1.endReplaceGroup();
                    inputState3 = new InputState(textAlign0, e3);
                }
                composer1.endReplaceGroup();
                TextStyleAndFontPanelKt.TextStyleAndFontPanel(inputState0, inputState1, inputState2, inputState3, new InputState(((TextData)mutableState2.getValue()).getFont(), new r(list0, s, 5, mutableState2)), list0, composer1, 0x40000, 0);
                composer1.endReplaceGroup();
                break;
            }
            case 2: {
                boolean z27 = false;
                composer1.startReplaceGroup(0xEE5B8106);
                Float float1 = ((TextData)mutableState2.getValue()).getAlpha();
                composer1.startReplaceGroup(-295984305);
                boolean z28 = composer1.changed(mutableState2);
                q q3 = composer1.rememberedValue();
                if(z28 || q3 == composer$Companion0.getEmpty()) {
                    q3 = new q(mutableState2, 14);
                    composer1.updateRememberedValue(q3);
                }
                composer1.endReplaceGroup();
                InputState inputState4 = new InputState(float1, q3);
                Color color0 = Color.box-impl(((TextData)mutableState2.getValue()).getColor-0d7_KjU());
                composer1.startReplaceGroup(0xEE5BA3B0);
                boolean z29 = composer1.changed(mutableState2);
                q q4 = composer1.rememberedValue();
                if(z29 || q4 == composer$Companion0.getEmpty()) {
                    q4 = new q(mutableState2, 15);
                    composer1.updateRememberedValue(q4);
                }
                composer1.endReplaceGroup();
                InputState inputState5 = new InputState(color0, q4);
                composer1.startReplaceGroup(0xEE5BA3F3);
                if(v13 > 4 && composer1.changed(s) || (v & 6) == 4) {
                    z27 = true;
                }
                f f0 = composer1.rememberedValue();
                if(z27 || f0 == composer$Companion0.getEmpty()) {
                    f0 = new f(s, 1);
                    composer1.updateRememberedValue(f0);
                }
                composer1.endReplaceGroup();
                Triple triple0 = new Triple(inputState4, inputState5, f0);
                Object object1 = triple0.component1();
                Object object2 = triple0.component2();
                Function0 function06 = (Function0)triple0.component3();
                composer1.startReplaceGroup(-295983830);
                boolean z30 = composer1.changed(function06);
                g g0 = composer1.rememberedValue();
                if(z30 || g0 == composer$Companion0.getEmpty()) {
                    g0 = new g(function06, 1);
                    composer1.updateRememberedValue(g0);
                }
                composer1.endReplaceGroup();
                ColorPanelKt.ColorPanel(((InputState)object1), ((InputState)object2), h1.a, g0, composer1, 0);
                composer1.endReplaceGroup();
                break;
            }
            case 3: {
                boolean z31 = false;
                composer1.startReplaceGroup(0xEE5B8106);
                Float float2 = ((TextData)mutableState2.getValue()).getBackgroundAlpha();
                composer1.startReplaceGroup(0xEE5BA632);
                boolean z32 = composer1.changed(mutableState2);
                q q5 = composer1.rememberedValue();
                if(z32 || q5 == composer$Companion0.getEmpty()) {
                    q5 = new q(mutableState2, 12);
                    composer1.updateRememberedValue(q5);
                }
                composer1.endReplaceGroup();
                InputState inputState6 = new InputState(float2, q5);
                Color color1 = Color.box-impl(((TextData)mutableState2.getValue()).getBackground-0d7_KjU());
                composer1.startReplaceGroup(0xEE5BA6A2);
                boolean z33 = composer1.changed(mutableState2);
                q q6 = composer1.rememberedValue();
                if(z33 || q6 == composer$Companion0.getEmpty()) {
                    q6 = new q(mutableState2, 13);
                    composer1.updateRememberedValue(q6);
                }
                composer1.endReplaceGroup();
                InputState inputState7 = new InputState(color1, q6);
                composer1.startReplaceGroup(0xEE5BA6EB);
                if(v13 > 4 && composer1.changed(s) || (v & 6) == 4) {
                    z31 = true;
                }
                f f1 = composer1.rememberedValue();
                if(z31 || f1 == composer$Companion0.getEmpty()) {
                    f1 = new f(s, 0);
                    composer1.updateRememberedValue(f1);
                }
                composer1.endReplaceGroup();
                Triple triple1 = new Triple(inputState6, inputState7, f1);
                Object object3 = triple1.component1();
                Object object4 = triple1.component2();
                Function0 function07 = (Function0)triple1.component3();
                composer1.startReplaceGroup(-295983058);
                boolean z34 = composer1.changed(function07);
                g g1 = composer1.rememberedValue();
                if(z34 || g1 == composer$Companion0.getEmpty()) {
                    g1 = new g(function07, 0);
                    composer1.updateRememberedValue(g1);
                }
                composer1.endReplaceGroup();
                ColorPanelKt.ColorPanel(((InputState)object3), ((InputState)object4), h1.b, g1, composer1, 0);
                composer1.endReplaceGroup();
                break;
            }
            default: {
                composer1.startReplaceGroup(0xEE5BA88F);
                SpacerKt.Spacer(WindowInsetsPadding_androidKt.imePadding(modifier$Companion1), composer1, 0);
                composer1.endReplaceGroup();
            }
        }
        composer1.endNode();
        composer1.endNode();
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t5(s, list0, pair0, z1, h1, function20, function00, v, v1));
        }
    }

    public static final void access$TextEditor$lambda$10(MutableState mutableState0, TextData textData0) {
        mutableState0.setValue(textData0);
    }

    public static final boolean access$TextEditor$lambda$12(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$TextEditor$lambda$13(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final void access$TextEditor$lambda$2(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final void access$TextEditor$lambda$5(MutableState mutableState0, EditState editState0) {
        mutableState0.setValue(editState0);
    }

    public static final TextData access$TextEditor$lambda$9(MutableState mutableState0) {
        return (TextData)mutableState0.getValue();
    }

    public static final void access$confirmTrackerClickEvent(String s) {
        Pair pair0 = Intrinsics.areEqual(s, "text-tab") ? TuplesKt.to(null, "inserttextapply") : TuplesKt.to("text-tab", "insertsignapply");
        KDTracker.clickEvent$default(KDTracker.INSTANCE, s, ((String)pair0.getFirst()), ((String)pair0.getSecond()), null, 8, null);
    }

    public static final void access$stateTrackerClickEvent(String s, EditState editState0) {
        String s1;
        switch(WhenMappings.$EnumSwitchMapping$0[editState0.ordinal()]) {
            case 1: {
                s1 = "fontstyle";
                break;
            }
            case 2: {
                s1 = "fontcolor";
                break;
            }
            case 3: {
                s1 = "backgroundcolor";
                break;
            }
            case 4: {
                s1 = Intrinsics.areEqual(s, "text-tab") ? "inputtext" : "addtext";
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        TextEditorKt.a(s, s1, null);
    }

    public static final void access$trackerClickEvent(String s, String s1, String s2) {
        TextEditorKt.a(s, s1, s2);
    }

    public static final void access$watermarkClickEvent(String s) {
        TextEditorKt.a(s, "watermark", null);
    }
}

