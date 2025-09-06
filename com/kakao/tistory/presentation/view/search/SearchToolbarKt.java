package com.kakao.tistory.presentation.view.search;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import c;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.dimen;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u008F\u0001\u0010\u0010\u001A\u00020\u00072\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00070\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0016²\u0006\f\u0010\u0012\u001A\u00020\u00008\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u0014\u001A\u00020\u00138\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u0015\u001A\u00020\u00048\n@\nX\u008A\u008E\u0002"}, d2 = {"", "isBlogSearch", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "", "searchKeyword", "Lkotlin/Function1;", "", "onKeywordChange", "Lkotlin/Function0;", "onClickBack", "onClickInputField", "onClickSearch", "onSearchFromKeyboard", "onClickClear", "onClickSearchAll", "SearchToolbar", "(ZLandroidx/compose/ui/focus/FocusRequester;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "textFieldPressed", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValueState", "lastTextValue", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSearchToolbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchToolbar.kt\ncom/kakao/tistory/presentation/view/search/SearchToolbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,264:1\n148#2:265\n148#2:308\n148#2:309\n148#2:310\n148#2:311\n148#2:322\n148#2:353\n148#2:354\n148#2:355\n148#2:356\n148#2:357\n158#2:358\n98#3:266\n95#3,6:267\n101#3:301\n105#3:321\n78#4,6:273\n85#4,4:288\n89#4,2:298\n93#4:320\n78#4,6:365\n85#4,4:380\n89#4,2:390\n93#4:396\n368#5,9:279\n377#5:300\n378#5,2:318\n368#5,9:371\n377#5:392\n378#5,2:394\n4032#6,6:292\n4032#6,6:384\n1223#7,6:302\n1223#7,6:312\n1223#7,6:323\n1223#7,6:329\n1223#7,6:335\n1223#7,6:341\n1223#7,6:347\n71#8:359\n69#8,5:360\n74#8:393\n78#8:397\n81#9:398\n81#9:399\n107#9,2:400\n81#9:402\n107#9,2:403\n*S KotlinDebug\n*F\n+ 1 SearchToolbar.kt\ncom/kakao/tistory/presentation/view/search/SearchToolbarKt\n*L\n59#1:265\n67#1:308\n71#1:309\n73#1:310\n89#1:311\n101#1:322\n207#1:353\n221#1:354\n236#1:355\n240#1:356\n241#1:357\n247#1:358\n55#1:266\n55#1:267,6\n55#1:301\n55#1:321\n55#1:273,6\n55#1:288,4\n55#1:298,2\n55#1:320\n238#1:365,6\n238#1:380,4\n238#1:390,2\n238#1:396\n55#1:279,9\n55#1:300\n55#1:318,2\n238#1:371,9\n238#1:392\n238#1:394,2\n55#1:292,6\n238#1:384,6\n62#1:302,6\n92#1:312,6\n122#1:323,6\n134#1:329,6\n142#1:335,6\n164#1:341,6\n147#1:347,6\n238#1:359\n238#1:360,5\n238#1:393\n238#1:397\n63#1:398\n122#1:399\n122#1:400,2\n142#1:402\n142#1:403,2\n*E\n"})
public final class SearchToolbarKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SearchToolbar(boolean z, @NotNull FocusRequester focusRequester0, @NotNull String s, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull Function0 function03, @NotNull Function0 function04, @NotNull Function0 function05, @Nullable Composer composer0, int v) {
        String s1;
        Intrinsics.checkNotNullParameter(focusRequester0, "focusRequester");
        Intrinsics.checkNotNullParameter(s, "searchKeyword");
        Intrinsics.checkNotNullParameter(function10, "onKeywordChange");
        Intrinsics.checkNotNullParameter(function00, "onClickBack");
        Intrinsics.checkNotNullParameter(function01, "onClickInputField");
        Intrinsics.checkNotNullParameter(function02, "onClickSearch");
        Intrinsics.checkNotNullParameter(function03, "onSearchFromKeyboard");
        Intrinsics.checkNotNullParameter(function04, "onClickClear");
        Intrinsics.checkNotNullParameter(function05, "onClickSearchAll");
        Composer composer1 = composer0.startRestartGroup(701908819);
        int v1 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(focusRequester0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(s) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x4000 : 0x2000);
        }
        if((v & 0x70000) == 0) {
            v1 |= (composer1.changedInstance(function01) ? 0x20000 : 0x10000);
        }
        if((v & 0x380000) == 0) {
            v1 |= (composer1.changedInstance(function02) ? 0x100000 : 0x80000);
        }
        if((v & 0x1C00000) == 0) {
            v1 |= (composer1.changedInstance(function03) ? 0x800000 : 0x400000);
        }
        if((v & 0xE000000) == 0) {
            v1 |= (composer1.changedInstance(function04) ? 0x4000000 : 0x2000000);
        }
        if((v & 0x70000000) == 0) {
            v1 |= (composer1.changedInstance(function05) ? 0x20000000 : 0x10000000);
        }
        if((v1 & 0x5B6DB6DB) != 306783378 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(701908819, v1, -1, "com.kakao.tistory.presentation.view.search.SearchToolbar (SearchToolbar.kt:53)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(BackgroundKt.background-bw27NRU$default(SizeKt.height-3ABfNKs(modifier$Companion0, PrimitiveResources_androidKt.dimensionResource(dimen.common_toolbar_height, composer1, 0)), MaterialTheme.INSTANCE.getColors(composer1, MaterialTheme.$stable).getBackground-0d7_KjU(), null, 2, null), 20.0f, 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            composer1.startReplaceGroup(0x680D384E);
            MutableInteractionSource mutableInteractionSource0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(mutableInteractionSource0 == composer$Companion0.getEmpty()) {
                mutableInteractionSource0 = InteractionSourceKt.MutableInteractionSource();
                composer1.updateRememberedValue(mutableInteractionSource0);
            }
            composer1.endReplaceGroup();
            State state0 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource0, composer1, 6);
            SearchToolbarKt.a(function00, composer1, v1 >> 12 & 14);
            c.a(6.0f, modifier$Companion0, composer1, 6);
            Modifier modifier2 = FocusRequesterModifierKt.focusRequester(RowScope.weight$default(rowScopeInstance0, PaddingKt.padding-qDBjuR0$default(BackgroundKt.background-bw27NRU(SizeKt.height-3ABfNKs(modifier$Companion0, 40.0f), ColorResources_androidKt.colorResource(color.color_f4f4f4, composer1, 0), RoundedCornerShapeKt.getCircleShape()), 17.0f, 0.0f, 6.0f, 0.0f, 10, null), 1.0f, false, 2, null), focusRequester0);
            if(z) {
                composer1.startReplaceGroup(0x680D8920);
                s1 = StringResources_androidKt.stringResource(string.label_search_blog_edit_hint, composer1, 0);
            }
            else {
                composer1.startReplaceGroup(0x680D927B);
                s1 = StringResources_androidKt.stringResource(string.label_search_edit_hint, composer1, 0);
            }
            composer1.endReplaceGroup();
            SearchToolbarKt.a(modifier2, mutableInteractionSource0, s, function10, s1, function02, function03, function04, composer1, v1 >> 3 & 0x1C00000 | (v1 & 0x380 | 0x30 | v1 & 0x1C00 | v1 >> 3 & 0x70000 | 0x380000 & v1 >> 3), 0);
            boolean z1 = true;
            if(z) {
                composer1.startReplaceGroup(-1717026190);
                SearchToolbarKt.a(s.length() > 0, function05, composer1, v1 >> 24 & 0x70);
            }
            else {
                composer1.startReplaceGroup(-1716917690);
                SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 20.0f), composer1, 6);
            }
            composer1.endReplaceGroup();
            Boolean boolean0 = (Boolean)state0.getValue();
            boolean0.getClass();
            composer1.startReplaceGroup(0x680DC948);
            boolean z2 = composer1.changed(state0);
            if((v1 & 0x70000) != 0x20000) {
                z1 = false;
            }
            w2 w20 = composer1.rememberedValue();
            if(z1 || z2 || w20 == composer$Companion0.getEmpty()) {
                w20 = new w2(function01, state0, null);
                composer1.updateRememberedValue(w20);
            }
            composer1.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolean0, w20, composer1, 0x40);
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
            scopeUpdateScope0.updateScope(new x2(z, focusRequester0, s, function10, function00, function01, function02, function03, function04, function05, v));
        }
    }

    public static final void a(Modifier modifier0, MutableInteractionSource mutableInteractionSource0, String s, Function1 function10, String s1, Function0 function00, Function0 function01, Function0 function02, Composer composer0, int v, int v1) {
        int v3;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xCF556D0E);
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
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(s) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(s1) ? 0x4000 : 0x2000);
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
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.changedInstance(function01) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((0x1C00000 & v) == 0) {
            v2 |= (composer1.changedInstance(function02) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v2) != 4793490 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier1 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCF556D0E, v2, -1, "com.kakao.tistory.presentation.view.search.SearchTextField (SearchToolbar.kt:120)");
            }
            composer1.startReplaceGroup(849590547);
            MutableState mutableState0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                v3 = v2;
                mutableState0 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(s, 0L, null, 6, null), null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            else {
                v3 = v2;
            }
            composer1.endReplaceGroup();
            TextFieldValue textFieldValue0 = Intrinsics.areEqual(s, ((TextFieldValue)mutableState0.getValue()).getText()) ? ((TextFieldValue)mutableState0.getValue()) : new TextFieldValue(s, TextRangeKt.TextRange(s.length()), null, null);
            composer1.startReplaceGroup(849601211);
            boolean z = composer1.changed(textFieldValue0);
            r2 r20 = composer1.rememberedValue();
            if(z || r20 == composer$Companion0.getEmpty()) {
                r20 = new r2(textFieldValue0, mutableState0);
                composer1.updateRememberedValue(r20);
            }
            composer1.endReplaceGroup();
            EffectsKt.SideEffect(r20, composer1, 0);
            composer1.startReplaceGroup(849609091);
            MutableState mutableState1 = composer1.rememberedValue();
            if((v3 & 0x380) == 0x100 || mutableState1 == composer$Companion0.getEmpty()) {
                mutableState1 = SnapshotStateKt.mutableStateOf$default(s, null, 2, null);
                composer1.updateRememberedValue(mutableState1);
            }
            composer1.endReplaceGroup();
            SolidColor solidColor0 = new SolidColor(ColorResources_androidKt.colorResource(color.gray1, composer1, 0), null);
            TextStyle textStyle0 = TextStyle.copy-p1EtxEg$default(TypeKt.getH8(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 0xF7FFFF, null);
            KeyboardOptions keyboardOptions0 = new KeyboardOptions(0, null, 0, 3, null, null, null, 0x77, null);
            composer1.startReplaceGroup(0x32A475D4);
            s2 s20 = composer1.rememberedValue();
            if((v3 & 0x380000) == 0x100000 || s20 == composer$Companion0.getEmpty()) {
                s20 = new s2(function01);
                composer1.updateRememberedValue(s20);
            }
            composer1.endReplaceGroup();
            KeyboardActions keyboardActions0 = new KeyboardActions(null, null, null, null, s20, null, 0x2F, null);
            composer1.startReplaceGroup(0x32A4154F);
            boolean z1 = composer1.changed(mutableState1);
            t2 t20 = composer1.rememberedValue();
            if((v3 & 0x1C00) == 0x800 || z1 || t20 == composer$Companion0.getEmpty()) {
                t20 = new t2(function10, mutableState0, mutableState1);
                composer1.updateRememberedValue(t20);
            }
            composer1.endReplaceGroup();
            BasicTextFieldKt.BasicTextField(textFieldValue0, t20, modifier2, false, false, textStyle0, keyboardOptions0, keyboardActions0, true, 0, 0, null, null, mutableInteractionSource0, solidColor0, ComposableLambdaKt.rememberComposableLambda(0x2F328E18, true, new u2(s, function02, function00, s1), composer1, 54), composer1, v3 << 6 & 0x380 | 0x6180000, v3 << 6 & 0x1C00 | 0x30000, 7704);
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
            scopeUpdateScope0.updateScope(new v2(modifier1, mutableInteractionSource0, s, function10, s1, function00, function01, function02, v, v1));
        }
    }

    public static final void a(Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x66D8A183);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x66D8A183, v1, -1, "com.kakao.tistory.presentation.view.search.BackButton (SearchToolbar.kt:98)");
            }
            IconButtonKt.IconButton(function00, SizeKt.size-3ABfNKs(Modifier.Companion, 24.0f), false, null, ComposableSingletons.SearchToolbarKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, v1 & 14 | 0x6030, 12);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m2(function00, v));
        }
    }

    public static final void a(boolean z, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-2070378315);
        int v1 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2070378315, v1, -1, "com.kakao.tistory.presentation.view.search.SearchAllButton (SearchToolbar.kt:234)");
            }
            RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(20.0f);
            Modifier modifier0 = ClickableKt.clickable-XHw0xAI$default(AlphaKt.alpha(ClipKt.clip(BorderKt.border-xT4_qwU(BackgroundKt.background-bw27NRU(SizeKt.size-VpY3zN4(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 10.0f, 0.0f, 15.0f, 0.0f, 10, null), 75.0f, 40.0f), ColorResources_androidKt.colorResource(color.white, composer1, 0), roundedCornerShape0), 0.5f, ColorResources_androidKt.colorResource(color.gray8, composer1, 0), roundedCornerShape0), roundedCornerShape0), (z ? 1.0f : 0.3f)), z, null, null, function00, 6, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
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
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_search_all, composer1, 0), null, ColorResources_androidKt.colorResource(color.gray1, composer1, 0), 0x141500000L, null, FontWeight.Companion.getNormal(), TypeKt.getTFont(), 0L, null, null, 0L, 0, false, false, 0, 0, null, null, composer1, 0x1B0C00, 0, 0x3FF92);
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
            scopeUpdateScope0.updateScope(new p2(z, function00, v));
        }
    }

    public static final void access$ClearButton(Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x90F630CD);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x90F630CD, v1, -1, "com.kakao.tistory.presentation.view.search.ClearButton (SearchToolbar.kt:205)");
            }
            IconButtonKt.IconButton(function00, SizeKt.size-3ABfNKs(Modifier.Companion, 32.0f), false, null, ComposableSingletons.SearchToolbarKt.INSTANCE.getLambda-2$presentation_prodRelease(), composer1, v1 & 14 | 0x6030, 12);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n2(function00, v));
        }
    }

    public static final void access$HintText(String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1800566493);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1800566493, v1, -1, "com.kakao.tistory.presentation.view.search.HintText (SearchToolbar.kt:191)");
            }
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(color.gray7, composer1, 0), 0x141700000L, null, FontWeight.Companion.getNormal(), TypeKt.getTFont(), 0L, null, null, 0L, 0, false, false, 1, 0, null, null, composer1, v1 & 14 | 0x1B0C30, 0x6C00, 0x39F90);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o2(s, v));
        }
    }

    public static final void access$SearchIcon(boolean z, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(107762215);
        int v1 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(107762215, v1, -1, "com.kakao.tistory.presentation.view.search.SearchIcon (SearchToolbar.kt:217)");
            }
            IconButtonKt.IconButton(function00, AlphaKt.alpha(SizeKt.size-3ABfNKs(Modifier.Companion, 32.0f), (z ? 1.0f : 0.3f)), z, null, ComposableSingletons.SearchToolbarKt.INSTANCE.getLambda-3$presentation_prodRelease(), composer1, v1 >> 3 & 14 | 0x6000 | v1 << 6 & 0x380, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q2(z, function00, v));
        }
    }

    public static final void access$SearchTextField$lambda$10(MutableState mutableState0, String s) {
        mutableState0.setValue(s);
    }

    public static final TextFieldValue access$SearchTextField$lambda$5(MutableState mutableState0) {
        return (TextFieldValue)mutableState0.getValue();
    }

    public static final void access$SearchTextField$lambda$6(MutableState mutableState0, TextFieldValue textFieldValue0) {
        mutableState0.setValue(textFieldValue0);
    }

    public static final String access$SearchTextField$lambda$9(MutableState mutableState0) {
        return (String)mutableState0.getValue();
    }

    public static final boolean access$SearchToolbar$lambda$3$lambda$1(State state0) {
        return ((Boolean)state0.getValue()).booleanValue();
    }
}

