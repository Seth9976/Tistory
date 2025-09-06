package androidx.compose.material3;

import aa.o;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.foundation.text.selection.h;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.SearchBarTokens;
import androidx.compose.material3.tokens.SearchViewTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00C7\u0002\u0018\u00002\u00020\u0001J&\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u009E\u0001\u0010\u001B\u001A\u00020\u00182\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\u00022\b\b\u0002\u0010\u0010\u001A\u00020\u00022\b\b\u0002\u0010\u0011\u001A\u00020\u00022\b\b\u0002\u0010\u0012\u001A\u00020\u00022\b\b\u0002\u0010\u0013\u001A\u00020\u00022\b\b\u0002\u0010\u0014\u001A\u00020\u00022\b\b\u0002\u0010\u0015\u001A\u00020\u00022\b\b\u0002\u0010\u0016\u001A\u00020\u00022\b\b\u0002\u0010\u0017\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u00CA\u0001\u0010/\u001A\u00020\u001F2\u0006\u0010\u001D\u001A\u00020\u001C2\u0012\u0010 \u001A\u000E\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u001F0\u001E2\u0012\u0010!\u001A\u000E\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u001F0\u001E2\u0006\u0010#\u001A\u00020\"2\u0012\u0010$\u001A\u000E\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001F0\u001E2\b\b\u0002\u0010&\u001A\u00020%2\b\b\u0002\u0010\'\u001A\u00020\"2\u0015\b\u0002\u0010*\u001A\u000F\u0012\u0004\u0012\u00020\u001F\u0018\u00010(\u00A2\u0006\u0002\b)2\u0015\b\u0002\u0010+\u001A\u000F\u0012\u0004\u0012\u00020\u001F\u0018\u00010(\u00A2\u0006\u0002\b)2\u0015\b\u0002\u0010,\u001A\u000F\u0012\u0004\u0012\u00020\u001F\u0018\u00010(\u00A2\u0006\u0002\b)2\b\b\u0002\u0010\b\u001A\u00020\u00182\n\b\u0002\u0010.\u001A\u0004\u0018\u00010-H\u0007\u00A2\u0006\u0004\b/\u00100J0\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u001B\u001A\u00020\u0018H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b1\u00102J\u008A\u0001\u0010\u001B\u001A\u00020\u00182\b\b\u0002\u00103\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\f\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\u00022\b\b\u0002\u0010\u0010\u001A\u00020\u00022\b\b\u0002\u0010\u0011\u001A\u00020\u00022\b\b\u0002\u0010\u0012\u001A\u00020\u00022\b\b\u0002\u0010\u0013\u001A\u00020\u00022\b\b\u0002\u0010\u0014\u001A\u00020\u00022\b\b\u0002\u00104\u001A\u00020\u00022\b\b\u0002\u0010\u0017\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b5\u00106R\u001D\u0010<\u001A\u0002078\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010;R\u001D\u0010?\u001A\u0002078\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b=\u00109\u001A\u0004\b>\u0010;R&\u0010D\u001A\u0002078\u0006X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b@\u00109\u0012\u0004\bB\u0010C\u001A\u0004\bA\u0010;R\u001D\u0010G\u001A\u0002078\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bE\u00109\u001A\u0004\bF\u0010;R\u0011\u0010K\u001A\u00020H8G\u00A2\u0006\u0006\u001A\u0004\bI\u0010JR\u0011\u0010M\u001A\u00020H8G\u00A2\u0006\u0006\u001A\u0004\bL\u0010JR\u0011\u0010O\u001A\u00020H8G\u00A2\u0006\u0006\u001A\u0004\bN\u0010JR\u0011\u0010S\u001A\u00020P8G\u00A2\u0006\u0006\u001A\u0004\bQ\u0010R\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006T"}, d2 = {"Landroidx/compose/material3/SearchBarDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "dividerColor", "Landroidx/compose/material3/SearchBarColors;", "colors-dgg9oW8", "(JJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;", "colors", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "cursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "Landroidx/compose/material3/TextFieldColors;", "inputFieldColors-ITpI4ow", "(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "inputFieldColors", "", "query", "Lkotlin/Function1;", "", "onQueryChange", "onSearch", "", "expanded", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "InputField", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "colors-Klgx-Pg", "(JJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;", "textColor", "placeholderColor", "inputFieldColors--u-KgnY", "(JJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getTonalElevation-D9Ej5fM", "()F", "TonalElevation", "b", "getShadowElevation-D9Ej5fM", "ShadowElevation", "c", "getElevation-D9Ej5fM", "getElevation-D9Ej5fM$annotations", "()V", "Elevation", "d", "getInputFieldHeight-D9Ej5fM", "InputFieldHeight", "Landroidx/compose/ui/graphics/Shape;", "getInputFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "inputFieldShape", "getFullScreenShape", "fullScreenShape", "getDockedShape", "dockedShape", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBarDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1243:1\n77#2:1244\n77#2:1257\n77#2:1260\n77#2:1275\n77#2:1288\n1223#3,6:1245\n1223#3,6:1251\n1223#3,6:1263\n1223#3,6:1269\n1223#3,6:1276\n1223#3,6:1282\n78#4:1258\n81#4:1259\n708#5:1261\n696#5:1262\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBarDefaults\n*L\n418#1:1244\n501#1:1257\n507#1:1260\n535#1:1275\n606#1:1288\n497#1:1245,6\n500#1:1251,6\n522#1:1263,6\n523#1:1269,6\n538#1:1276,6\n567#1:1282,6\n503#1:1258\n504#1:1259\n507#1:1261\n507#1:1262\n*E\n"})
public final class SearchBarDefaults {
    public static final int $stable;
    @NotNull
    public static final SearchBarDefaults INSTANCE;
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        SearchBarDefaults.INSTANCE = new SearchBarDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        SearchBarDefaults.a = 0.0f;
        SearchBarDefaults.b = 0.0f;
        SearchBarDefaults.c = 0.0f;
        SearchBarDefaults.d = 0.0f;
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void InputField(@NotNull String s, @NotNull Function1 function10, @NotNull Function1 function11, boolean z, @NotNull Function1 function12, @Nullable Modifier modifier0, boolean z1, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable TextFieldColors textFieldColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v, int v1, int v2) {
        Function2 function25;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource1;
        TextFieldColors textFieldColors1;
        Function2 function24;
        Function2 function23;
        boolean z2;
        MutableInteractionSource mutableInteractionSource4;
        MutableInteractionSource mutableInteractionSource2;
        TextFieldColors textFieldColors2;
        Function2 function28;
        Function2 function27;
        Function2 function26;
        boolean z3;
        Modifier modifier2;
        TextFieldColors textFieldColors3;
        int v6;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x5682199F);
        int v3 = 2;
        if((v2 & 1) == 0) {
            v4 = (v & 6) == 0 ? v | (composer1.changed(s) ? 4 : 2) : v;
        }
        else {
            v4 = v | 6;
        }
        if((v2 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v4 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        int v5 = v4;
        if((v2 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v5 |= (composer1.changedInstance(function11) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v5 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v5 |= (composer1.changedInstance(function12) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v5 |= (composer1.changed(z1) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v5 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v5 |= (composer1.changedInstance(function21) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v5 |= (composer1.changedInstance(function22) ? 0x20000000 : 0x10000000);
        }
        if((v1 & 6) == 0) {
            if((v2 & 0x400) == 0 && composer1.changed(textFieldColors0)) {
                v3 = 4;
            }
            v6 = v1 | v3;
        }
        else {
            v6 = v1;
        }
        if((v2 & 0x800) != 0) {
            v6 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v6 |= (composer1.changed(mutableInteractionSource0) ? 0x20 : 16);
        }
        if((v2 & 0x1000) != 0) {
            v6 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v6 |= (composer1.changed(this) ? 0x100 : 0x80);
        }
        if((v5 & 306783379) != 306783378 || (v6 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 0x20) == 0 ? modifier0 : Modifier.Companion;
                boolean z4 = (v2 & 0x40) == 0 ? z1 : true;
                Function2 function29 = (v2 & 0x80) == 0 ? function20 : null;
                Function2 function210 = (v2 & 0x100) == 0 ? function21 : null;
                Function2 function211 = (v2 & 0x200) == 0 ? function22 : null;
                if((0x400 & v2) == 0) {
                    textFieldColors3 = textFieldColors0;
                }
                else {
                    textFieldColors3 = this.inputFieldColors-ITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer1, 0, v6 << 6 & 0xE000, 0x3FFF);
                    v6 &= -15;
                }
                if((v2 & 0x800) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                    function27 = function210;
                    function28 = function211;
                    modifier2 = modifier3;
                    function26 = function29;
                    textFieldColors2 = textFieldColors3;
                    z3 = z4;
                }
                else {
                    function27 = function210;
                    function28 = function211;
                    modifier2 = modifier3;
                    function26 = function29;
                    textFieldColors2 = textFieldColors3;
                    z3 = z4;
                    mutableInteractionSource2 = null;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((0x400 & v2) != 0) {
                    v6 &= -15;
                }
                modifier2 = modifier0;
                z3 = z1;
                function26 = function20;
                function27 = function21;
                function28 = function22;
                textFieldColors2 = textFieldColors0;
                mutableInteractionSource2 = mutableInteractionSource0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5682199F, v5, v6, "androidx.compose.material3.SearchBarDefaults.InputField (SearchBar.android.kt:494)");
            }
            composer1.startReplaceGroup(0xECE66B20);
            if(mutableInteractionSource2 == null) {
                MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                    mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                    composer1.updateRememberedValue(mutableInteractionSource3);
                }
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            else {
                mutableInteractionSource4 = mutableInteractionSource2;
            }
            composer1.endReplaceGroup();
            boolean z5 = ((Boolean)FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer1, 0).getValue()).booleanValue();
            FocusRequester focusRequester0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(focusRequester0 == composer$Companion0.getEmpty()) {
                focusRequester0 = new FocusRequester();
                composer1.updateRememberedValue(focusRequester0);
            }
            Object object0 = composer1.consume(CompositionLocalsKt.getLocalFocusManager());
            String s1 = Strings_androidKt.getString-2EP1pXo(string.m3c_search_bar_search, composer1, 0);
            String s2 = Strings_androidKt.getString-2EP1pXo(string.m3c_suggestions_available, composer1, 0);
            long v7 = ((TextStyle)composer1.consume(TextKt.getLocalTextStyle())).getColor-0d7_KjU();
            if(v7 == 16L) {
                v7 = textFieldColors2.textColor-XeAY9LY$material3_release(z3, false, z5);
            }
            Modifier modifier4 = FocusRequesterModifierKt.focusRequester(SizeKt.sizeIn-qDBjuR0$default(modifier2, 0.0f, SearchBarDefaults.d, 0.0f, 0.0f, 8, null), focusRequester0);
            ti ti0 = composer1.rememberedValue();
            if((v5 & 0xE000) == 0x4000 || ti0 == composer$Companion0.getEmpty()) {
                ti0 = new ti(function12, 0);
                composer1.updateRememberedValue(ti0);
            }
            Modifier modifier5 = FocusChangedModifierKt.onFocusChanged(modifier4, ti0);
            boolean z6 = composer1.changed(s1);
            boolean z7 = composer1.changed(s2);
            h h0 = composer1.rememberedValue();
            if((z6 | (v5 & 0x1C00) == 0x800 | z7) != 0 || h0 == composer$Companion0.getEmpty()) {
                h0 = new h(s1, z, s2, focusRequester0, 1);
                composer1.updateRememberedValue(h0);
            }
            Modifier modifier6 = SemanticsModifierKt.semantics$default(modifier5, false, h0, 1, null);
            TextStyle textStyle0 = ((TextStyle)composer1.consume(TextKt.getLocalTextStyle())).merge(new TextStyle(v7, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null));
            SolidColor solidColor0 = new SolidColor(textFieldColors2.cursorColor-vNxB06k$material3_release(false), null);
            KeyboardOptions keyboardOptions0 = new KeyboardOptions(0, null, 0, 3, null, null, null, 0x77, null);
            o o0 = composer1.rememberedValue();
            if((((v5 & 0x380) == 0x100 ? 1 : 0) | ((v5 & 14) == 4 ? 1 : 0)) != 0 || o0 == composer$Companion0.getEmpty()) {
                o0 = new o(8, function11, s);
                composer1.updateRememberedValue(o0);
            }
            BasicTextFieldKt.BasicTextField(s, function10, modifier6, z3, false, textStyle0, keyboardOptions0, new KeyboardActions(null, null, null, null, o0, null, 0x2F, null), true, 0, 0, null, null, mutableInteractionSource4, solidColor0, ComposableLambdaKt.rememberComposableLambda(-2029278807, true, new xi(s, z3, mutableInteractionSource4, function26, function27, function28, textFieldColors2), composer1, 54), composer1, 0x6180000 | v5 & 14 | v5 & 0x70 | v5 >> 9 & 0x1C00, 0x30000, 0x1E10);
            boolean z8 = !z && z5;
            Boolean boolean0 = Boolean.valueOf(z);
            boolean z9 = composer1.changed(z8);
            boolean z10 = composer1.changedInstance(((FocusManager)object0));
            yi yi0 = composer1.rememberedValue();
            if(z9 || z10 || yi0 == composer$Companion0.getEmpty()) {
                yi0 = new yi(z8, ((FocusManager)object0), null);
                composer1.updateRememberedValue(yi0);
            }
            EffectsKt.LaunchedEffect(boolean0, yi0, composer1, v5 >> 9 & 14);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            function23 = function26;
            function24 = function27;
            function25 = function28;
            mutableInteractionSource1 = mutableInteractionSource2;
            z2 = z3;
            textFieldColors1 = textFieldColors2;
        }
        else {
            composer1.skipToGroupEnd();
            z2 = z1;
            function23 = function20;
            function24 = function21;
            textFieldColors1 = textFieldColors0;
            mutableInteractionSource1 = mutableInteractionSource0;
            modifier1 = modifier0;
            function25 = function22;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a4(this, s, function10, function11, z, function12, modifier1, z2, function23, function24, function25, textFieldColors1, mutableInteractionSource1, v, v1, v2));
        }
    }

    @Composable
    @Deprecated(message = "Search bars now take the input field as a parameter. `inputFieldColors` should be passed explicitly to the input field. This parameter will be removed in a future version of the library.", replaceWith = @ReplaceWith(expression = "colors(containerColor, dividerColor)", imports = {}))
    @NotNull
    public final SearchBarColors colors-Klgx-Pg(long v, long v1, @Nullable TextFieldColors textFieldColors0, @Nullable Composer composer0, int v2, int v3) {
        long v4 = (v3 & 1) == 0 ? v : ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer0, 6);
        long v5 = (v3 & 2) == 0 ? v1 : ColorSchemeKt.getValue(SearchViewTokens.INSTANCE.getDividerColor(), composer0, 6);
        TextFieldColors textFieldColors1 = (v3 & 4) == 0 ? textFieldColors0 : this.inputFieldColors-ITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer0, 0, v2 << 3 & 0xE000, 0x3FFF);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB782BEFC, v2, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.android.kt:590)");
        }
        SearchBarColors searchBarColors0 = new SearchBarColors(v4, v5, textFieldColors1, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return searchBarColors0;
    }

    @Composable
    @NotNull
    public final SearchBarColors colors-dgg9oW8(long v, long v1, @Nullable Composer composer0, int v2, int v3) {
        long v4 = (v3 & 1) == 0 ? v : ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer0, 6);
        long v5 = (v3 & 2) == 0 ? v1 : ColorSchemeKt.getValue(SearchViewTokens.INSTANCE.getDividerColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1507037523, v2, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.android.kt:378)");
        }
        SearchBarColors searchBarColors0 = new SearchBarColors(v4, v5, this.inputFieldColors-ITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer0, 0, v2 << 6 & 0xE000, 0x3FFF), null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return searchBarColors0;
    }

    @Composable
    @JvmName(name = "getDockedShape")
    @NotNull
    public final Shape getDockedShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1006952150, v, -1, "androidx.compose.material3.SearchBarDefaults.<get-dockedShape> (SearchBar.android.kt:357)");
        }
        Shape shape0 = ShapesKt.getValue(SearchViewTokens.INSTANCE.getDockedContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    public final float getElevation-D9Ej5fM() {
        return SearchBarDefaults.c;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to TonalElevation. Not to be confused with ShadowElevation.", replaceWith = @ReplaceWith(expression = "TonalElevation", imports = {}))
    public static void getElevation-D9Ej5fM$annotations() {
    }

    @Composable
    @JvmName(name = "getFullScreenShape")
    @NotNull
    public final Shape getFullScreenShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1665502056, v, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenShape> (SearchBar.android.kt:353)");
        }
        Shape shape0 = ShapesKt.getValue(SearchViewTokens.INSTANCE.getFullScreenContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    public final float getInputFieldHeight-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getInputFieldShape")
    @NotNull
    public final Shape getInputFieldShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xC6173AD2, v, -1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.android.kt:349)");
        }
        Shape shape0 = ShapesKt.getValue(SearchBarTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    public final float getShadowElevation-D9Ej5fM() [...] // 潜在的解密器

    public final float getTonalElevation-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getWindowInsets")
    @NotNull
    public final WindowInsets getWindowInsets(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7DE6AF4D, v, -1, "androidx.compose.material3.SearchBarDefaults.<get-windowInsets> (SearchBar.android.kt:361)");
        }
        WindowInsets windowInsets0 = WindowInsets_androidKt.getStatusBars(WindowInsets.Companion, composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public final TextFieldColors inputFieldColors--u-KgnY(long v, long v1, long v2, TextSelectionColors textSelectionColors0, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, Composer composer0, int v11, int v12, int v13) {
        long v14 = (v13 & 1) == 0 ? v : ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer0, 6);
        long v15 = (v13 & 2) == 0 ? v1 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v16 = (v13 & 4) == 0 ? v2 : ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer0, 6);
        TextSelectionColors textSelectionColors1 = (v13 & 8) == 0 ? textSelectionColors0 : ((TextSelectionColors)composer0.consume(TextSelectionColorsKt.getLocalTextSelectionColors()));
        long v17 = (v13 & 16) == 0 ? v3 : ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer0, 6);
        long v18 = (v13 & 0x20) == 0 ? v4 : ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer0, 6);
        long v19 = (v13 & 0x40) == 0 ? v5 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v20 = (v13 & 0x80) == 0 ? v6 : ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer0, 6);
        long v21 = (v13 & 0x100) == 0 ? v7 : ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer0, 6);
        long v22 = (v13 & 0x200) == 0 ? v8 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v23 = (v13 & 0x400) == 0 ? v9 : ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer0, 6);
        long v24 = (v13 & 0x800) == 0 ? v10 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x15370409, v11, v12, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:624)");
        }
        TextFieldColors textFieldColors0 = this.inputFieldColors-ITpI4ow(v14, v14, v15, v16, textSelectionColors1, v17, v18, v19, v20, v21, v22, v23, v23, v24, composer0, v11 & 14 | v11 << 3 & 0x70 | v11 << 3 & 0x380 | v11 << 3 & 0x1C00 | v11 << 3 & 0xE000 | v11 << 3 & 0x70000 | v11 << 3 & 0x380000 | v11 << 3 & 0x1C00000 | v11 << 3 & 0xE000000 | v11 << 3 & 0x70000000, v11 >> 27 & 14 | v12 << 3 & 0x70 | v12 << 6 & 0x380 | v12 << 6 & 0x1C00 | v12 << 6 & 0xE000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColors0;
    }

    @Composable
    @NotNull
    public final TextFieldColors inputFieldColors-ITpI4ow(long v, long v1, long v2, long v3, @Nullable TextSelectionColors textSelectionColors0, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, @Nullable Composer composer0, int v13, int v14, int v15) {
        long v16 = (v15 & 1) == 0 ? v : ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer0, 6);
        long v17 = (v15 & 2) == 0 ? v1 : ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer0, 6);
        long v18 = (v15 & 4) == 0 ? v2 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v19 = (v15 & 8) == 0 ? v3 : ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer0, 6);
        TextSelectionColors textSelectionColors1 = (v15 & 16) == 0 ? textSelectionColors0 : ((TextSelectionColors)composer0.consume(TextSelectionColorsKt.getLocalTextSelectionColors()));
        long v20 = (v15 & 0x20) == 0 ? v4 : ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer0, 6);
        long v21 = (v15 & 0x40) == 0 ? v5 : ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer0, 6);
        long v22 = (v15 & 0x80) == 0 ? v6 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v23 = (v15 & 0x100) == 0 ? v7 : ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer0, 6);
        long v24 = (v15 & 0x200) == 0 ? v8 : ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer0, 6);
        long v25 = (v15 & 0x400) == 0 ? v9 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v26 = (v15 & 0x800) == 0 ? v10 : ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer0, 6);
        long v27 = (v15 & 0x1000) == 0 ? v11 : ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer0, 6);
        long v28 = (v15 & 0x2000) == 0 ? v12 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDC1BF01B, v13, v14, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:437)");
        }
        TextFieldColors textFieldColors0 = TextFieldDefaults.INSTANCE.colors-0hiis_0(v16, v17, v18, 0L, 0L, 0L, 0L, 0L, v19, 0L, textSelectionColors1, 0L, 0L, 0L, 0L, v20, v21, v22, 0L, v23, v24, v25, 0L, 0L, 0L, 0L, 0L, v26, v27, v28, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer0, v13 & 0x3FE | v13 << 15 & 0xE000000, v13 >> 12 & 14 | 0x70000 & v13 | 0x380000 & v13 | v13 & 0x1C00000 | v13 << 3 & 0x70000000, v13 >> 27 & 14 | v14 << 3 & 0x70 | v14 << 18 & 0x1C00000 | v14 << 18 & 0xE000000 | v14 << 18 & 0x70000000, 0, 0xC00, 1204058872, 0xFFF);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColors0;
    }
}

