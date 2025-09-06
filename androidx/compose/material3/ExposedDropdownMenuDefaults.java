package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.icons.Icons.Filled;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.tokens.FilledAutocompleteTokens;
import androidx.compose.material3.tokens.OutlinedAutocompleteTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.window.PopupProperties;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001D\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00C7\u0002\u0018\u00002\u00020\u0001J!\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0098\u0003\u00105\u001A\u0002022\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\t2\b\b\u0002\u0010\u000E\u001A\u00020\t2\b\b\u0002\u0010\u000F\u001A\u00020\t2\b\b\u0002\u0010\u0010\u001A\u00020\t2\b\b\u0002\u0010\u0011\u001A\u00020\t2\b\b\u0002\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0013\u001A\u00020\t2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0016\u001A\u00020\t2\b\b\u0002\u0010\u0017\u001A\u00020\t2\b\b\u0002\u0010\u0018\u001A\u00020\t2\b\b\u0002\u0010\u0019\u001A\u00020\t2\b\b\u0002\u0010\u001A\u001A\u00020\t2\b\b\u0002\u0010\u001B\u001A\u00020\t2\b\b\u0002\u0010\u001C\u001A\u00020\t2\b\b\u0002\u0010\u001D\u001A\u00020\t2\b\b\u0002\u0010\u001E\u001A\u00020\t2\b\b\u0002\u0010\u001F\u001A\u00020\t2\b\b\u0002\u0010 \u001A\u00020\t2\b\b\u0002\u0010!\u001A\u00020\t2\b\b\u0002\u0010\"\u001A\u00020\t2\b\b\u0002\u0010#\u001A\u00020\t2\b\b\u0002\u0010$\u001A\u00020\t2\b\b\u0002\u0010%\u001A\u00020\t2\b\b\u0002\u0010&\u001A\u00020\t2\b\b\u0002\u0010\'\u001A\u00020\t2\b\b\u0002\u0010(\u001A\u00020\t2\b\b\u0002\u0010)\u001A\u00020\t2\b\b\u0002\u0010*\u001A\u00020\t2\b\b\u0002\u0010+\u001A\u00020\t2\b\b\u0002\u0010,\u001A\u00020\t2\b\b\u0002\u0010-\u001A\u00020\t2\b\b\u0002\u0010.\u001A\u00020\t2\b\b\u0002\u0010/\u001A\u00020\t2\b\b\u0002\u00100\u001A\u00020\t2\b\b\u0002\u00101\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b3\u00104J\u0098\u0003\u0010;\u001A\u0002022\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\t2\b\b\u0002\u0010\u000E\u001A\u00020\t2\b\b\u0002\u0010\u000F\u001A\u00020\t2\b\b\u0002\u0010\u0010\u001A\u00020\t2\b\b\u0002\u0010\u0011\u001A\u00020\t2\b\b\u0002\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0013\u001A\u00020\t2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u00106\u001A\u00020\t2\b\b\u0002\u00107\u001A\u00020\t2\b\b\u0002\u00108\u001A\u00020\t2\b\b\u0002\u00109\u001A\u00020\t2\b\b\u0002\u0010\u001A\u001A\u00020\t2\b\b\u0002\u0010\u001B\u001A\u00020\t2\b\b\u0002\u0010\u001C\u001A\u00020\t2\b\b\u0002\u0010\u001D\u001A\u00020\t2\b\b\u0002\u0010\u001E\u001A\u00020\t2\b\b\u0002\u0010\u001F\u001A\u00020\t2\b\b\u0002\u0010 \u001A\u00020\t2\b\b\u0002\u0010!\u001A\u00020\t2\b\b\u0002\u0010\"\u001A\u00020\t2\b\b\u0002\u0010#\u001A\u00020\t2\b\b\u0002\u0010$\u001A\u00020\t2\b\b\u0002\u0010%\u001A\u00020\t2\b\b\u0002\u0010&\u001A\u00020\t2\b\b\u0002\u0010\'\u001A\u00020\t2\b\b\u0002\u0010(\u001A\u00020\t2\b\b\u0002\u0010)\u001A\u00020\t2\b\b\u0002\u0010*\u001A\u00020\t2\b\b\u0002\u0010+\u001A\u00020\t2\b\b\u0002\u0010,\u001A\u00020\t2\b\b\u0002\u0010-\u001A\u00020\t2\b\b\u0002\u0010.\u001A\u00020\t2\b\b\u0002\u0010/\u001A\u00020\t2\b\b\u0002\u00100\u001A\u00020\t2\b\b\u0002\u00101\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b:\u00104J\u001A\u0010A\u001A\u00020>2\u0006\u0010=\u001A\u00020<H\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b?\u0010@J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0007\u0010BJ\u0084\u0003\u00105\u001A\u0002022\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\t2\b\b\u0002\u0010C\u001A\u00020\t2\b\b\u0002\u0010\u0011\u001A\u00020\t2\b\b\u0002\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0013\u001A\u00020\t2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0016\u001A\u00020\t2\b\b\u0002\u0010\u0017\u001A\u00020\t2\b\b\u0002\u0010\u0018\u001A\u00020\t2\b\b\u0002\u0010\u0019\u001A\u00020\t2\b\b\u0002\u0010\u001A\u001A\u00020\t2\b\b\u0002\u0010\u001B\u001A\u00020\t2\b\b\u0002\u0010\u001C\u001A\u00020\t2\b\b\u0002\u0010\u001D\u001A\u00020\t2\b\b\u0002\u0010\u001E\u001A\u00020\t2\b\b\u0002\u0010\u001F\u001A\u00020\t2\b\b\u0002\u0010 \u001A\u00020\t2\b\b\u0002\u0010!\u001A\u00020\t2\b\b\u0002\u0010\"\u001A\u00020\t2\b\b\u0002\u0010#\u001A\u00020\t2\b\b\u0002\u0010$\u001A\u00020\t2\b\b\u0002\u0010%\u001A\u00020\t2\b\b\u0002\u0010&\u001A\u00020\t2\b\b\u0002\u0010\'\u001A\u00020\t2\b\b\u0002\u0010(\u001A\u00020\t2\b\b\u0002\u0010)\u001A\u00020\t2\b\b\u0002\u0010*\u001A\u00020\t2\b\b\u0002\u0010+\u001A\u00020\t2\b\b\u0002\u0010,\u001A\u00020\t2\b\b\u0002\u0010-\u001A\u00020\t2\b\b\u0002\u0010.\u001A\u00020\t2\b\b\u0002\u0010/\u001A\u00020\t2\b\b\u0002\u00100\u001A\u00020\t2\b\b\u0002\u00101\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bD\u0010EJ\u0084\u0003\u0010;\u001A\u0002022\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\t2\b\b\u0002\u0010C\u001A\u00020\t2\b\b\u0002\u0010\u0011\u001A\u00020\t2\b\b\u0002\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0013\u001A\u00020\t2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u00106\u001A\u00020\t2\b\b\u0002\u00107\u001A\u00020\t2\b\b\u0002\u00108\u001A\u00020\t2\b\b\u0002\u00109\u001A\u00020\t2\b\b\u0002\u0010\u001A\u001A\u00020\t2\b\b\u0002\u0010\u001B\u001A\u00020\t2\b\b\u0002\u0010\u001C\u001A\u00020\t2\b\b\u0002\u0010\u001D\u001A\u00020\t2\b\b\u0002\u0010\u001E\u001A\u00020\t2\b\b\u0002\u0010\u001F\u001A\u00020\t2\b\b\u0002\u0010 \u001A\u00020\t2\b\b\u0002\u0010!\u001A\u00020\t2\b\b\u0002\u0010\"\u001A\u00020\t2\b\b\u0002\u0010#\u001A\u00020\t2\b\b\u0002\u0010$\u001A\u00020\t2\b\b\u0002\u0010%\u001A\u00020\t2\b\b\u0002\u0010&\u001A\u00020\t2\b\b\u0002\u0010\'\u001A\u00020\t2\b\b\u0002\u0010(\u001A\u00020\t2\b\b\u0002\u0010)\u001A\u00020\t2\b\b\u0002\u0010*\u001A\u00020\t2\b\b\u0002\u0010+\u001A\u00020\t2\b\b\u0002\u0010,\u001A\u00020\t2\b\b\u0002\u0010-\u001A\u00020\t2\b\b\u0002\u0010.\u001A\u00020\t2\b\b\u0002\u0010/\u001A\u00020\t2\b\b\u0002\u00100\u001A\u00020\t2\b\b\u0002\u00101\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bF\u0010EJ\u0082\u0002\u00105\u001A\u0002022\b\b\u0002\u0010G\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\t2\b\b\u0002\u0010C\u001A\u00020\t2\b\b\u0002\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0013\u001A\u00020\t2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0016\u001A\u00020\t2\b\b\u0002\u0010\u0017\u001A\u00020\t2\b\b\u0002\u0010\u0018\u001A\u00020\t2\b\b\u0002\u0010\u0019\u001A\u00020\t2\b\b\u0002\u0010\u001A\u001A\u00020\t2\b\b\u0002\u0010\u001B\u001A\u00020\t2\b\b\u0002\u0010\u001C\u001A\u00020\t2\b\b\u0002\u0010\u001D\u001A\u00020\t2\b\b\u0002\u0010\u001E\u001A\u00020\t2\b\b\u0002\u0010\u001F\u001A\u00020\t2\b\b\u0002\u0010 \u001A\u00020\t2\b\b\u0002\u0010!\u001A\u00020\t2\b\b\u0002\u0010\"\u001A\u00020\t2\b\b\u0002\u0010#\u001A\u00020\t2\b\b\u0002\u0010$\u001A\u00020\t2\b\b\u0002\u0010%\u001A\u00020\t2\b\b\u0002\u0010H\u001A\u00020\t2\b\b\u0002\u0010(\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bI\u0010JJ\u0082\u0002\u0010;\u001A\u0002022\b\b\u0002\u0010G\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\t2\b\b\u0002\u0010C\u001A\u00020\t2\b\b\u0002\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0013\u001A\u00020\t2\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u00106\u001A\u00020\t2\b\b\u0002\u00107\u001A\u00020\t2\b\b\u0002\u00108\u001A\u00020\t2\b\b\u0002\u00109\u001A\u00020\t2\b\b\u0002\u0010\u001A\u001A\u00020\t2\b\b\u0002\u0010\u001B\u001A\u00020\t2\b\b\u0002\u0010\u001C\u001A\u00020\t2\b\b\u0002\u0010\u001D\u001A\u00020\t2\b\b\u0002\u0010\u001E\u001A\u00020\t2\b\b\u0002\u0010\u001F\u001A\u00020\t2\b\b\u0002\u0010 \u001A\u00020\t2\b\b\u0002\u0010!\u001A\u00020\t2\b\b\u0002\u0010\"\u001A\u00020\t2\b\b\u0002\u0010#\u001A\u00020\t2\b\b\u0002\u0010$\u001A\u00020\t2\b\b\u0002\u0010%\u001A\u00020\t2\b\b\u0002\u0010H\u001A\u00020\t2\b\b\u0002\u0010(\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bK\u0010JR\u0017\u0010Q\u001A\u00020L8\u0006\u00A2\u0006\f\n\u0004\bM\u0010N\u001A\u0004\bO\u0010P\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006S\u00B2\u0006\f\u0010R\u001A\u00020\u00028\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuDefaults;", "", "", "expanded", "Landroidx/compose/ui/Modifier;", "modifier", "", "TrailingIcon", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "Landroidx/compose/material3/TextFieldColors;", "textFieldColors-FD9MK7s", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIII)Landroidx/compose/material3/TextFieldColors;", "textFieldColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "outlinedTextFieldColors-FD9MK7s", "outlinedTextFieldColors", "Landroidx/compose/material3/MenuAnchorType;", "anchorType", "Landroidx/compose/ui/window/PopupProperties;", "popupProperties-pR6Bxps$material3_release", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/window/PopupProperties;", "popupProperties", "(ZLandroidx/compose/runtime/Composer;I)V", "containerColor", "textFieldColors-tN0la-I", "(JJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIII)Landroidx/compose/material3/TextFieldColors;", "outlinedTextFieldColors-tN0la-I", "textColor", "placeholderColor", "textFieldColors-St-qZLY", "(JJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material3/TextFieldColors;", "outlinedTextFieldColors-St-qZLY", "Landroidx/compose/foundation/layout/PaddingValues;", "a", "Landroidx/compose/foundation/layout/PaddingValues;", "getItemContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ItemContentPadding", "a11yServicesEnabled", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1490:1\n77#2:1491\n77#2:1492\n77#2:1493\n77#2:1494\n77#2:1495\n77#2:1496\n81#3:1497\n148#4:1498\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuDefaults\n*L\n587#1:1491\n748#1:1492\n903#1:1493\n1015#1:1494\n1126#1:1495\n1225#1:1496\n862#1:1497\n853#1:1498\n*E\n"})
public final class ExposedDropdownMenuDefaults {
    public static final int $stable;
    @NotNull
    public static final ExposedDropdownMenuDefaults INSTANCE;
    public static final PaddingValues a;

    static {
        ExposedDropdownMenuDefaults.INSTANCE = new ExposedDropdownMenuDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        ExposedDropdownMenuDefaults.a = PaddingKt.PaddingValues-YgX7TsA(16.0f, 0.0f);
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public final void TrailingIcon(boolean z, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-473088613);
        int v1 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(this) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-473088613, v1, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.android.kt:886)");
            }
            this.TrailingIcon(z, Modifier.Companion, composer1, v1 & 14 | 0x30 | v1 << 3 & 0x380, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p9(v, z, 0, this));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void TrailingIcon(boolean z, @Nullable Modifier modifier0, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x898F4F58);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v2 & 19) != 18 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x898F4F58, v2, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.android.kt:519)");
            }
            IconKt.Icon-ww6aTOc(ArrowDropDownKt.getArrowDropDown(Filled.INSTANCE), null, RotateKt.rotate(modifier0, (z ? 180.0f : 0.0f)), 0L, composer1, 0x30, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o9(this, z, modifier0, v, v1, 0));
        }
    }

    @NotNull
    public final PaddingValues getItemContentPadding() {
        return ExposedDropdownMenuDefaults.a;
    }

    @Composable
    @NotNull
    public final TextFieldColors outlinedTextFieldColors-FD9MK7s(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, @Nullable TextSelectionColors textSelectionColors0, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, long v29, long v30, long v31, long v32, long v33, long v34, long v35, long v36, long v37, @Nullable Composer composer0, int v38, int v39, int v40, int v41, int v42, int v43) {
        long v44 = (v42 & 1) == 0 ? v : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer0, 6);
        long v45 = (v42 & 2) == 0 ? v1 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer0, 6);
        long v46 = (v42 & 4) == 0 ? v2 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v47 = (v42 & 8) == 0 ? v3 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer0, 6);
        long v48 = (v42 & 0x100) == 0 ? v8 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer0, 6);
        long v49 = (v42 & 0x200) == 0 ? v9 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer0, 6);
        TextSelectionColors textSelectionColors1 = (v42 & 0x400) == 0 ? textSelectionColors0 : ((TextSelectionColors)composer0.consume(TextSelectionColorsKt.getLocalTextSelectionColors()));
        long v50 = (v42 & 0x800) == 0 ? v10 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer0, 6);
        long v51 = (v42 & 0x1000) == 0 ? v11 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer0, 6);
        long v52 = (v42 & 0x2000) == 0 ? v12 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v53 = (v42 & 0x4000) == 0 ? v13 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer0, 6);
        long v54 = (0x8000 & v42) == 0 ? v14 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer0, 6);
        long v55 = (0x10000 & v42) == 0 ? v15 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer0, 6);
        long v56 = (0x20000 & v42) == 0 ? v16 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v57 = (0x40000 & v42) == 0 ? v17 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer0, 6);
        long v58 = (0x80000 & v42) == 0 ? v18 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer0, 6);
        long v59 = (0x100000 & v42) == 0 ? v19 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer0, 6);
        long v60 = (0x200000 & v42) == 0 ? v20 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v61 = (0x400000 & v42) == 0 ? v21 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer0, 6);
        long v62 = (0x800000 & v42) == 0 ? v22 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer0, 6);
        long v63 = (0x1000000 & v42) == 0 ? v23 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer0, 6);
        long v64 = (0x2000000 & v42) == 0 ? v24 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v65 = (0x4000000 & v42) == 0 ? v25 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer0, 6);
        long v66 = (0x8000000 & v42) == 0 ? v26 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v67 = (0x10000000 & v42) == 0 ? v27 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v68 = (0x20000000 & v42) == 0 ? v28 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v69 = (v42 & 0x40000000) == 0 ? v29 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v70 = (v43 & 1) == 0 ? v30 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v71 = (v43 & 2) == 0 ? v31 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v72 = (v43 & 4) == 0 ? v32 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v73 = (v43 & 8) == 0 ? v33 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v74 = (v43 & 16) == 0 ? v34 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v75 = (v43 & 0x20) == 0 ? v35 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v76 = (v43 & 0x40) == 0 ? v36 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v77 = (v43 & 0x80) == 0 ? v37 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA2968033, v38, v39, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:805)");
        }
        TextFieldColors textFieldColors0 = OutlinedTextFieldDefaults.INSTANCE.colors-0hiis_0(v44, v45, v46, v47, ((v42 & 16) == 0 ? v4 : 0L), ((v42 & 0x20) == 0 ? v5 : 0L), ((v42 & 0x40) == 0 ? v6 : 0L), ((v42 & 0x80) == 0 ? v7 : 0L), v48, v49, textSelectionColors1, v50, v51, v52, v53, v54, v55, v56, v57, v58, v59, v60, v61, v62, v63, v64, v65, v66, v67, v68, v69, 0L, 0L, 0L, 0L, v70, v71, v72, v73, v74, v75, v76, v77, composer0, v38 & 0x7FFFFFFE, v39 & 0x7FFFFFFE, v40 & 0x7FFFFFFE, v41 & 14 | 0x70000 & v41 << 12 | 0x380000 & v41 << 12 | 0x1C00000 & v41 << 12 | 0xE000000 & v41 << 12 | v41 << 12 & 0x70000000, v41 >> 18 & 14 | 0xC00 | v41 >> 18 & 0x70 | v41 >> 18 & 0x380, 0, 15);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColors0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public final TextFieldColors outlinedTextFieldColors-St-qZLY(long v, long v1, long v2, long v3, long v4, TextSelectionColors textSelectionColors0, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, Composer composer0, int v23, int v24, int v25, int v26) {
        long v27 = (v26 & 1) == 0 ? v : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer0, 6);
        long v28 = (v26 & 2) == 0 ? v1 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v29 = (v26 & 4) == 0 ? v2 : 0L;
        long v30 = (v26 & 8) == 0 ? v3 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer0, 6);
        long v31 = (v26 & 16) == 0 ? v4 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer0, 6);
        TextSelectionColors textSelectionColors1 = (v26 & 0x20) == 0 ? textSelectionColors0 : ((TextSelectionColors)composer0.consume(TextSelectionColorsKt.getLocalTextSelectionColors()));
        long v32 = (v26 & 0x40) == 0 ? v5 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer0, 6);
        long v33 = (v26 & 0x80) == 0 ? v6 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer0, 6);
        long v34 = (v26 & 0x100) == 0 ? v7 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v35 = (v26 & 0x200) == 0 ? v8 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer0, 6);
        long v36 = (v26 & 0x400) == 0 ? v9 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer0, 6);
        long v37 = (v26 & 0x800) == 0 ? v10 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer0, 6);
        long v38 = (v26 & 0x1000) == 0 ? v11 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v39 = (v26 & 0x2000) == 0 ? v12 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer0, 6);
        long v40 = (v26 & 0x4000) == 0 ? v13 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer0, 6);
        long v41 = (0x8000 & v26) == 0 ? v14 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer0, 6);
        long v42 = (0x10000 & v26) == 0 ? v15 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v43 = (0x20000 & v26) == 0 ? v16 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer0, 6);
        long v44 = (0x40000 & v26) == 0 ? v17 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer0, 6);
        long v45 = (0x80000 & v26) == 0 ? v18 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer0, 6);
        long v46 = (0x100000 & v26) == 0 ? v19 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v47 = (0x200000 & v26) == 0 ? v20 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer0, 6);
        long v48 = (0x400000 & v26) == 0 ? v21 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v49 = (v26 & 0x800000) == 0 ? v22 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCE25CDAC, v23, v24, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:1265)");
        }
        TextFieldColors textFieldColors0 = this.outlinedTextFieldColors-FD9MK7s(v27, v27, v28, v27, v29, v29, v29, v29, v30, v31, textSelectionColors1, v32, v33, v34, v35, v36, v37, v38, v39, v40, v41, v42, v43, v44, v45, v46, v47, v48, v48, v49, v48, ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6), ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6), Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6), ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6), ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6), Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6), composer0, v23 & 14 | v23 << 3 & 0x70 | v23 << 3 & 0x380 | v23 << 9 & 0x1C00 | v23 << 6 & 0xE000 | v23 << 9 & 0x70000 | v23 << 12 & 0x380000 | v23 << 15 & 0x1C00000 | v23 << 15 & 0xE000000 | v23 << 15 & 0x70000000, v23 >> 15 & 0xFFFE | v24 << 15 & 0x70000 | v24 << 15 & 0x380000 | v24 << 15 & 0x1C00000 | v24 << 15 & 0xE000000 | v24 << 15 & 0x70000000, v24 >> 15 & 0xFFFE | v25 << 15 & 0x70000 | v25 << 15 & 0x380000 | v25 << 15 & 0x1C00000 | v25 << 18 & 0xE000000 | v25 << 18 & 0x70000000, v25 >> 6 & 14 | v25 << 15 & 0x70000000, 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColors0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public final TextFieldColors outlinedTextFieldColors-tN0la-I(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, TextSelectionColors textSelectionColors0, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, long v29, long v30, long v31, long v32, long v33, long v34, long v35, Composer composer0, int v36, int v37, int v38, int v39, int v40, int v41) {
        long v42 = (v40 & 1) == 0 ? v : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer0, 6);
        long v43 = (v40 & 2) == 0 ? v1 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer0, 6);
        long v44 = (v40 & 4) == 0 ? v2 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v45 = (v40 & 8) == 0 ? v3 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer0, 6);
        long v46 = (v40 & 16) == 0 ? v4 : 0L;
        long v47 = (v40 & 0x40) == 0 ? v6 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer0, 6);
        long v48 = (v40 & 0x80) == 0 ? v7 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer0, 6);
        TextSelectionColors textSelectionColors1 = (v40 & 0x100) == 0 ? textSelectionColors0 : ((TextSelectionColors)composer0.consume(TextSelectionColorsKt.getLocalTextSelectionColors()));
        long v49 = (v40 & 0x200) == 0 ? v8 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer0, 6);
        long v50 = (v40 & 0x400) == 0 ? v9 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer0, 6);
        long v51 = (v40 & 0x800) == 0 ? v10 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v52 = (v40 & 0x1000) == 0 ? v11 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer0, 6);
        long v53 = (v40 & 0x2000) == 0 ? v12 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer0, 6);
        long v54 = (v40 & 0x4000) == 0 ? v13 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer0, 6);
        long v55 = (0x8000 & v40) == 0 ? v14 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v56 = (0x10000 & v40) == 0 ? v15 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer0, 6);
        long v57 = (0x20000 & v40) == 0 ? v16 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer0, 6);
        long v58 = (0x40000 & v40) == 0 ? v17 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer0, 6);
        long v59 = (0x80000 & v40) == 0 ? v18 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v60 = (0x100000 & v40) == 0 ? v19 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer0, 6);
        long v61 = (0x200000 & v40) == 0 ? v20 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer0, 6);
        long v62 = (0x400000 & v40) == 0 ? v21 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer0, 6);
        long v63 = (0x800000 & v40) == 0 ? v22 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v64 = (0x1000000 & v40) == 0 ? v23 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer0, 6);
        long v65 = (0x2000000 & v40) == 0 ? v24 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v66 = (0x4000000 & v40) == 0 ? v25 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v67 = (0x8000000 & v40) == 0 ? v26 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v68 = (0x10000000 & v40) == 0 ? v27 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v69 = (0x20000000 & v40) == 0 ? v28 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v70 = (v40 & 0x40000000) == 0 ? v29 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v71 = (v41 & 1) == 0 ? v30 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v72 = (v41 & 2) == 0 ? v31 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v73 = (v41 & 4) == 0 ? v32 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v74 = (v41 & 8) == 0 ? v33 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v75 = (v41 & 16) == 0 ? v34 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v76 = (v41 & 0x20) == 0 ? v35 : ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE8DDA0E1, v36, v37, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:1072)");
        }
        TextFieldColors textFieldColors0 = this.outlinedTextFieldColors-FD9MK7s(v42, v43, v44, v45, v46, v46, v46, ((v40 & 0x20) == 0 ? v5 : 0L), v47, v48, textSelectionColors1, v49, v50, v51, v52, v53, v54, v55, v56, v57, v58, v59, v60, v61, v62, v63, v64, v65, v66, v67, v68, v69, v70, v71, v72, v73, v74, v75, v76, composer0, 0xFFFE & v36 | v36 << 3 & 0x70000 | v36 << 6 & 0x380000 | v36 << 6 & 0x1C00000 | v36 << 6 & 0xE000000 | v36 << 6 & 0x70000000, v36 >> 24 & 0x7E | v37 << 6 & 0x380 | v37 << 6 & 0x1C00 | v37 << 6 & 0xE000 | v37 << 6 & 0x70000 | v37 << 6 & 0x380000 | v37 << 6 & 0x1C00000 | v37 << 6 & 0xE000000 | v37 << 6 & 0x70000000, v37 >> 24 & 0x7E | v38 << 6 & 0x380 | v38 << 6 & 0x1C00 | v38 << 6 & 0xE000 | v38 << 6 & 0x70000 | v38 << 6 & 0x380000 | v38 << 6 & 0x1C00000 | v38 << 6 & 0xE000000 | v38 << 6 & 0x70000000, v38 >> 24 & 0x7E | v39 << 6 & 0x380 | v39 << 6 & 0x1C00 | v39 << 6 & 0xE000 | v39 << 6 & 0x70000 | v39 << 6 & 0x380000 | v39 << 6 & 0x1C00000 | v39 << 6 & 0xE000000 | v39 << 6 & 0x70000000, 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColors0;
    }

    @Composable
    @NotNull
    public final PopupProperties popupProperties-pR6Bxps$material3_release(@NotNull String s, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9939E3CA, v, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.popupProperties (ExposedDropdownMenu.android.kt:860)");
        }
        State state0 = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(false, false, composer0, 0, 3);
        int v1 = ((Boolean)state0.getValue()).booleanValue() ? 0x60000 : 0x60020;
        if(MenuAnchorType.equals-impl0(s, "PrimaryEditable") || MenuAnchorType.equals-impl0(s, "SecondaryEditable") && !((Boolean)state0.getValue()).booleanValue()) {
            v1 |= 8;
        }
        PopupProperties popupProperties0 = new PopupProperties(v1, false, false, false, false, false, 62, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return popupProperties0;
    }

    @Composable
    @NotNull
    public final TextFieldColors textFieldColors-FD9MK7s(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, @Nullable TextSelectionColors textSelectionColors0, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, long v29, long v30, long v31, long v32, long v33, long v34, long v35, long v36, long v37, @Nullable Composer composer0, int v38, int v39, int v40, int v41, int v42, int v43) {
        long v44 = (v42 & 1) == 0 ? v : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer0, 6);
        long v45 = (v42 & 2) == 0 ? v1 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer0, 6);
        long v46 = (v42 & 4) == 0 ? v2 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v47 = (v42 & 8) == 0 ? v3 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer0, 6);
        long v48 = (v42 & 16) == 0 ? v4 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer0, 6);
        long v49 = (v42 & 0x20) == 0 ? v5 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer0, 6);
        long v50 = (v42 & 0x40) == 0 ? v6 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer0, 6);
        long v51 = (v42 & 0x80) == 0 ? v7 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer0, 6);
        long v52 = (v42 & 0x100) == 0 ? v8 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer0, 6);
        long v53 = (v42 & 0x200) == 0 ? v9 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer0, 6);
        TextSelectionColors textSelectionColors1 = (v42 & 0x400) == 0 ? textSelectionColors0 : ((TextSelectionColors)composer0.consume(TextSelectionColorsKt.getLocalTextSelectionColors()));
        long v54 = (v42 & 0x800) == 0 ? v10 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer0, 6);
        long v55 = (v42 & 0x1000) == 0 ? v11 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer0, 6);
        long v56 = (v42 & 0x2000) == 0 ? v12 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v57 = (v42 & 0x4000) == 0 ? v13 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer0, 6);
        long v58 = (0x8000 & v42) == 0 ? v14 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer0, 6);
        long v59 = (0x10000 & v42) == 0 ? v15 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer0, 6);
        long v60 = (0x20000 & v42) == 0 ? v16 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v61 = (0x40000 & v42) == 0 ? v17 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer0, 6);
        long v62 = (0x80000 & v42) == 0 ? v18 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer0, 6);
        long v63 = (0x100000 & v42) == 0 ? v19 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer0, 6);
        long v64 = (0x200000 & v42) == 0 ? v20 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v65 = (0x400000 & v42) == 0 ? v21 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer0, 6);
        long v66 = (0x800000 & v42) == 0 ? v22 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer0, 6);
        long v67 = (0x1000000 & v42) == 0 ? v23 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer0, 6);
        long v68 = (0x2000000 & v42) == 0 ? v24 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer0, 6);
        long v69 = (0x4000000 & v42) == 0 ? v25 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer0, 6);
        long v70 = (0x8000000 & v42) == 0 ? v26 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v71 = (0x10000000 & v42) == 0 ? v27 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v72 = (0x20000000 & v42) == 0 ? v28 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v73 = (v42 & 0x40000000) == 0 ? v29 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v74 = (v43 & 1) == 0 ? v30 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v75 = (v43 & 2) == 0 ? v31 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v76 = (v43 & 4) == 0 ? v32 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v77 = (v43 & 8) == 0 ? v33 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v78 = (v43 & 16) == 0 ? v34 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v79 = (v43 & 0x20) == 0 ? v35 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v80 = (v43 & 0x40) == 0 ? v36 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v81 = (v43 & 0x80) == 0 ? v37 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2DCC38B1, v38, v39, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:642)");
        }
        TextFieldColors textFieldColors0 = TextFieldDefaults.INSTANCE.colors-0hiis_0(v44, v45, v46, v47, v48, v49, v50, v51, v52, v53, textSelectionColors1, v54, v55, v56, v57, v58, v59, v60, v61, v62, v63, v64, v65, v66, v67, v68, v69, v70, v71, v72, v73, 0L, 0L, 0L, 0L, v74, v75, v76, v77, v78, v79, v80, v81, composer0, v38 & 0x7FFFFFFE, v39 & 0x7FFFFFFE, v40 & 0x7FFFFFFE, v41 & 14 | 0x70000 & v41 << 12 | 0x380000 & v41 << 12 | 0x1C00000 & v41 << 12 | 0xE000000 & v41 << 12 | v41 << 12 & 0x70000000, v41 >> 18 & 14 | 0xC00 | v41 >> 18 & 0x70 | v41 >> 18 & 0x380, 0, 15);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColors0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public final TextFieldColors textFieldColors-St-qZLY(long v, long v1, long v2, long v3, long v4, TextSelectionColors textSelectionColors0, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, Composer composer0, int v23, int v24, int v25, int v26) {
        long v27 = (v26 & 1) == 0 ? v : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer0, 6);
        long v28 = (v26 & 2) == 0 ? v1 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v29 = (v26 & 4) == 0 ? v2 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer0, 6);
        long v30 = (v26 & 8) == 0 ? v3 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer0, 6);
        long v31 = (v26 & 16) == 0 ? v4 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer0, 6);
        TextSelectionColors textSelectionColors1 = (v26 & 0x20) == 0 ? textSelectionColors0 : ((TextSelectionColors)composer0.consume(TextSelectionColorsKt.getLocalTextSelectionColors()));
        long v32 = (v26 & 0x40) == 0 ? v5 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer0, 6);
        long v33 = (v26 & 0x80) == 0 ? v6 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer0, 6);
        long v34 = (v26 & 0x100) == 0 ? v7 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v35 = (v26 & 0x200) == 0 ? v8 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer0, 6);
        long v36 = (v26 & 0x400) == 0 ? v9 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer0, 6);
        long v37 = (v26 & 0x800) == 0 ? v10 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer0, 6);
        long v38 = (v26 & 0x1000) == 0 ? v11 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v39 = (v26 & 0x2000) == 0 ? v12 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer0, 6);
        long v40 = (v26 & 0x4000) == 0 ? v13 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer0, 6);
        long v41 = (0x8000 & v26) == 0 ? v14 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer0, 6);
        long v42 = (0x10000 & v26) == 0 ? v15 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v43 = (0x20000 & v26) == 0 ? v16 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer0, 6);
        long v44 = (0x40000 & v26) == 0 ? v17 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer0, 6);
        long v45 = (0x80000 & v26) == 0 ? v18 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer0, 6);
        long v46 = (0x100000 & v26) == 0 ? v19 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer0, 6);
        long v47 = (0x200000 & v26) == 0 ? v20 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer0, 6);
        long v48 = (0x400000 & v26) == 0 ? v21 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v49 = (v26 & 0x800000) == 0 ? v22 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xAFE917AA, v23, v24, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:1165)");
        }
        TextFieldColors textFieldColors0 = this.textFieldColors-FD9MK7s(v27, v27, v28, v27, v29, v29, v29, v29, v30, v31, textSelectionColors1, v32, v33, v34, v35, v36, v37, v38, v39, v40, v41, v42, v43, v44, v45, v46, v47, v48, v48, v49, v48, ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6), ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6), Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6), ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6), ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6), Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6), composer0, v23 & 14 | v23 << 3 & 0x70 | v23 << 3 & 0x380 | v23 << 9 & 0x1C00 | v23 << 6 & 0xE000 | v23 << 9 & 0x70000 | v23 << 12 & 0x380000 | v23 << 15 & 0x1C00000 | v23 << 15 & 0xE000000 | v23 << 15 & 0x70000000, v23 >> 15 & 0xFFFE | v24 << 15 & 0x70000 | v24 << 15 & 0x380000 | v24 << 15 & 0x1C00000 | v24 << 15 & 0xE000000 | v24 << 15 & 0x70000000, v24 >> 15 & 0xFFFE | v25 << 15 & 0x70000 | v25 << 15 & 0x380000 | v25 << 15 & 0x1C00000 | v25 << 18 & 0xE000000 | v25 << 18 & 0x70000000, v25 >> 6 & 14 | v25 << 15 & 0x70000000, 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColors0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public final TextFieldColors textFieldColors-tN0la-I(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, TextSelectionColors textSelectionColors0, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, long v29, long v30, long v31, long v32, long v33, long v34, long v35, Composer composer0, int v36, int v37, int v38, int v39, int v40, int v41) {
        long v42 = (v40 & 1) == 0 ? v : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer0, 6);
        long v43 = (v40 & 2) == 0 ? v1 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer0, 6);
        long v44 = (v40 & 4) == 0 ? v2 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v45 = (v40 & 8) == 0 ? v3 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer0, 6);
        long v46 = (v40 & 16) == 0 ? v4 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer0, 6);
        long v47 = (v40 & 0x20) == 0 ? v5 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer0, 6);
        long v48 = (v40 & 0x40) == 0 ? v6 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer0, 6);
        long v49 = (v40 & 0x80) == 0 ? v7 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer0, 6);
        TextSelectionColors textSelectionColors1 = (v40 & 0x100) == 0 ? textSelectionColors0 : ((TextSelectionColors)composer0.consume(TextSelectionColorsKt.getLocalTextSelectionColors()));
        long v50 = (v40 & 0x200) == 0 ? v8 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer0, 6);
        long v51 = (v40 & 0x400) == 0 ? v9 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer0, 6);
        long v52 = (v40 & 0x800) == 0 ? v10 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v53 = (v40 & 0x1000) == 0 ? v11 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer0, 6);
        long v54 = (v40 & 0x2000) == 0 ? v12 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer0, 6);
        long v55 = (v40 & 0x4000) == 0 ? v13 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer0, 6);
        long v56 = (0x8000 & v40) == 0 ? v14 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v57 = (0x10000 & v40) == 0 ? v15 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer0, 6);
        long v58 = (0x20000 & v40) == 0 ? v16 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer0, 6);
        long v59 = (0x40000 & v40) == 0 ? v17 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer0, 6);
        long v60 = (0x80000 & v40) == 0 ? v18 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v61 = (0x100000 & v40) == 0 ? v19 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer0, 6);
        long v62 = (0x200000 & v40) == 0 ? v20 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer0, 6);
        long v63 = (0x400000 & v40) == 0 ? v21 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer0, 6);
        long v64 = (0x800000 & v40) == 0 ? v22 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer0, 6);
        long v65 = (0x1000000 & v40) == 0 ? v23 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer0, 6);
        long v66 = (0x2000000 & v40) == 0 ? v24 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v67 = (0x4000000 & v40) == 0 ? v25 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v68 = (0x8000000 & v40) == 0 ? v26 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v69 = (0x10000000 & v40) == 0 ? v27 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v70 = (0x20000000 & v40) == 0 ? v28 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v71 = (v40 & 0x40000000) == 0 ? v29 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v72 = (v41 & 1) == 0 ? v30 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v73 = (v41 & 2) == 0 ? v31 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v74 = (v41 & 4) == 0 ? v32 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v75 = (v41 & 8) == 0 ? v33 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        long v76 = (v41 & 16) == 0 ? v34 : Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledSupportingTextColor(), composer0, 6), 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        long v77 = (v41 & 0x20) == 0 ? v35 : ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611690079, v36, v37, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:958)");
        }
        TextFieldColors textFieldColors0 = this.textFieldColors-FD9MK7s(v42, v43, v44, v45, v46, v46, v46, v47, v48, v49, textSelectionColors1, v50, v51, v52, v53, v54, v55, v56, v57, v58, v59, v60, v61, v62, v63, v64, v65, v66, v67, v68, v69, v70, v71, v72, v73, v74, v75, v76, v77, composer0, 0xFFFE & v36 | v36 << 3 & 0x70000 | v36 << 6 & 0x380000 | v36 << 6 & 0x1C00000 | v36 << 6 & 0xE000000 | v36 << 6 & 0x70000000, v36 >> 24 & 0x7E | v37 << 6 & 0x380 | v37 << 6 & 0x1C00 | v37 << 6 & 0xE000 | v37 << 6 & 0x70000 | v37 << 6 & 0x380000 | v37 << 6 & 0x1C00000 | v37 << 6 & 0xE000000 | v37 << 6 & 0x70000000, v37 >> 24 & 0x7E | v38 << 6 & 0x380 | v38 << 6 & 0x1C00 | v38 << 6 & 0xE000 | v38 << 6 & 0x70000 | v38 << 6 & 0x380000 | v38 << 6 & 0x1C00000 | v38 << 6 & 0xE000000 | v38 << 6 & 0x70000000, v38 >> 24 & 0x7E | v39 << 6 & 0x380 | v39 << 6 & 0x1C00 | v39 << 6 & 0xE000 | v39 << 6 & 0x70000 | v39 << 6 & 0x380000 | v39 << 6 & 0x1C00000 | v39 << 6 & 0xE000000 | v39 << 6 & 0x70000000, 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColors0;
    }
}

