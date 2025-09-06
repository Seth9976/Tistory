package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u00AA\u0001\u0010\u0015\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0007\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001A\u00A8\u0001\u0010\u0015\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001A\u00020\u0013H\u0007\u00A2\u0006\u0004\b\u0015\u0010\u0018\u001A\u00AA\u0001\u0010\u0019\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0007\u00A2\u0006\u0004\b\u0019\u0010\u0016\u001A\u00A8\u0001\u0010\u0019\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001A\u00020\u0013H\u0007\u00A2\u0006\u0004\b\u0019\u0010\u0018\u001A\u00B2\u0001\u0010\u001D\u001A\u00020\u00012\u0006\u0010\u001A\u001A\u00020\u00072\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\u001B2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u001C2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0007\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001A\u00B2\u0001\u0010\u001F\u001A\u00020\u00012\u0006\u0010\u001A\u001A\u00020\u00072\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\u001B2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u001C2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0007\u00A2\u0006\u0004\b\u001F\u0010\u001E\u001A\u00C9\u0001\u0010!\u001A\u00020\u00012\u0006\u0010\u001A\u001A\u00020\u00072\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\u0015\b\u0002\u0010 \u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\u0015\b\u0002\u0010\n\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\u001B2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u001C2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0007\u00A2\u0006\u0004\b!\u0010\"\u001A\u0093\u0001\u0010$\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u0015\b\u0002\u0010#\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0007\u00A2\u0006\u0004\b$\u0010%\u001A\u0091\u0001\u0010$\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u0015\b\u0002\u0010#\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001A\u00020\u0013H\u0007\u00A2\u0006\u0004\b$\u0010&\u001A\u0093\u0001\u0010\'\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u0015\b\u0002\u0010#\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0007\u00A2\u0006\u0004\b\'\u0010%\u001A\u0091\u0001\u0010\'\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u0015\b\u0002\u0010#\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0014\u001A\u00020\u0013H\u0007\u00A2\u0006\u0004\b\'\u0010&\"\u0018\u0010+\u001A\u00020\r*\u00020(8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b)\u0010*\u00A8\u0006,"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/runtime/Composable;", "label", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "leadingIcon", "trailingIcon", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/ChipColors;", "colors", "Landroidx/compose/material3/ChipElevation;", "elevation", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "AssistChip", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/material3/ChipBorder;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "ElevatedAssistChip", "selected", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/SelectableChipElevation;", "FilterChip", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "ElevatedFilterChip", "avatar", "InputChip", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "icon", "SuggestionChip", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "ElevatedSuggestionChip", "Landroidx/compose/material3/ColorScheme;", "getDefaultSuggestionChipColors", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "defaultSuggestionChipColors", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2787:1\n1223#2,6:2788\n1223#2,6:2794\n1223#2,6:2800\n1223#2,6:2806\n1223#2,6:2812\n1223#2,6:2819\n148#3:2818\n148#3:2825\n148#3:2827\n148#3:2828\n148#3:2829\n1#4:2826\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt\n*L\n218#1:2788,6\n380#1:2794,6\n829#1:2800,6\n985#1:2806,6\n1966#1:2812,6\n2012#1:2819,6\n1973#1:2818\n2021#1:2825\n2767#1:2827\n2768#1:2828\n2773#1:2829\n*E\n"})
public final class ChipKt {
    public static final float a;
    public static final PaddingValues b;
    public static final PaddingValues c;
    public static final PaddingValues d;

    static {
        ChipKt.a = 8.0f;
        ChipKt.b = PaddingKt.PaddingValues-YgX7TsA$default(8.0f, 0.0f, 2, null);
        ChipKt.c = PaddingKt.PaddingValues-YgX7TsA$default(8.0f, 0.0f, 2, null);
        ChipKt.d = PaddingKt.PaddingValues-YgX7TsA$default(8.0f, 0.0f, 2, null);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void AssistChip(@NotNull Function0 function00, @NotNull Function2 function20, @Nullable Modifier modifier0, boolean z, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Shape shape0, @Nullable ChipColors chipColors0, @Nullable ChipElevation chipElevation0, @Nullable BorderStroke borderStroke0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v, int v1, int v2) {
        Shape shape1;
        Function2 function24;
        boolean z2;
        Modifier modifier2;
        ChipColors chipColors2;
        MutableInteractionSource mutableInteractionSource1;
        BorderStroke borderStroke1;
        ChipElevation chipElevation1;
        Function2 function23;
        int v11;
        Function2 function26;
        int v8;
        int v7;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        ChipElevation chipElevation2;
        Shape shape2;
        Function2 function25;
        int v10;
        BorderStroke borderStroke3;
        ChipElevation chipElevation3;
        int v9;
        Shape shape3;
        int v6;
        int v5;
        int v4;
        ChipColors chipColors1;
        boolean z1;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(313450168);
        if((v2 & 1) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x180) == 0) {
            modifier1 = modifier0;
            v3 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
            z1 = z;
        }
        else if((v & 0xC00) == 0) {
            z1 = z;
            v3 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x20000 : 0x10000);
        }
        if((v & 0x180000) == 0) {
            v3 |= ((v2 & 0x40) != 0 || !composer1.changed(shape0) ? 0x80000 : 0x100000);
        }
        if((v & 0xC00000) == 0) {
            if((v2 & 0x80) == 0) {
                chipColors1 = chipColors0;
                v4 = composer1.changed(chipColors1) ? 0x800000 : 0x400000;
            }
            else {
                chipColors1 = chipColors0;
                v4 = 0x400000;
            }
            v3 |= v4;
        }
        else {
            chipColors1 = chipColors0;
        }
        if((v & 0x6000000) == 0) {
            v3 |= ((v2 & 0x100) != 0 || !composer1.changed(chipElevation0) ? 0x2000000 : 0x4000000);
        }
        if((v & 0x30000000) == 0) {
            v3 |= ((v2 & 0x200) != 0 || !composer1.changed(borderStroke0) ? 0x10000000 : 0x20000000);
        }
        if((v2 & 0x400) != 0) {
            v5 = v2 & 0x400;
            v6 = v1 | 6;
        }
        else if((v1 & 6) == 0) {
            v5 = v2 & 0x400;
            v6 = v1 | (composer1.changed(mutableInteractionSource0) ? 4 : 2);
        }
        else {
            v5 = v2 & 0x400;
            v6 = v1;
        }
        if((v3 & 306783379) != 306783378 || (v6 & 3) != 2 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 4) == 0 ? modifier1 : Modifier.Companion;
                boolean z3 = (v2 & 8) == 0 ? z1 : true;
                if((v2 & 0x40) == 0) {
                    shape3 = shape0;
                }
                else {
                    v3 &= 0xFFC7FFFF;
                    shape3 = AssistChipDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v2 & 0x80) != 0) {
                    chipColors1 = AssistChipDefaults.INSTANCE.assistChipColors(composer1, 6);
                    v3 &= 0xFE3FFFFF;
                }
                if((v2 & 0x100) == 0) {
                    v7 = v6;
                    v9 = v3;
                    chipElevation3 = chipElevation0;
                }
                else {
                    v7 = v6;
                    v9 = v3 & 0xF1FFFFFF;
                    chipElevation3 = AssistChipDefaults.INSTANCE.assistChipElevation-aqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x180000, 0x3F);
                }
                if((v2 & 0x200) == 0) {
                    borderStroke3 = borderStroke0;
                    v10 = v9;
                }
                else {
                    borderStroke3 = AssistChipDefaults.INSTANCE.assistChipBorder-h1eT-Ww(z3, 0L, 0L, 0.0f, composer1, v9 >> 9 & 14 | 0x6000, 14);
                    v10 = v9 & 0x8FFFFFFF;
                }
                if(v5 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                    modifier1 = modifier3;
                    borderStroke2 = borderStroke3;
                    v8 = v10;
                    shape2 = shape3;
                    z1 = z3;
                }
                else {
                    modifier1 = modifier3;
                    borderStroke2 = borderStroke3;
                    v8 = v10;
                    shape2 = shape3;
                    z1 = z3;
                    mutableInteractionSource2 = null;
                }
                function25 = (v2 & 16) == 0 ? function21 : null;
                function26 = (v2 & 0x20) == 0 ? function22 : null;
                chipElevation2 = chipElevation3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x40) != 0) {
                    v3 &= 0xFFC7FFFF;
                }
                if((v2 & 0x80) != 0) {
                    v3 &= 0xFE3FFFFF;
                }
                if((v2 & 0x100) != 0) {
                    v3 &= 0xF1FFFFFF;
                }
                if((v2 & 0x200) != 0) {
                    v3 &= 0x8FFFFFFF;
                }
                function25 = function21;
                shape2 = shape0;
                chipElevation2 = chipElevation0;
                borderStroke2 = borderStroke0;
                mutableInteractionSource2 = mutableInteractionSource0;
                v7 = v6;
                v8 = v3;
                function26 = function22;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                v11 = v7;
                ComposerKt.traceEventStart(313450168, v8, v11, "androidx.compose.material3.AssistChip (Chip.kt:132)");
            }
            else {
                v11 = v7;
            }
            ChipKt.a(modifier1, function00, z1, function20, TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), composer1, 6), chipColors1.labelColor-vNxB06k$material3_release(z1), function25, function26, shape2, chipColors1, chipElevation2, borderStroke2, 0.0f, ChipKt.b, mutableInteractionSource2, composer1, v8 >> 6 & 14 | v8 << 3 & 0x70 | v8 >> 3 & 0x380 | v8 << 6 & 0x1C00 | 0x380000 & v8 << 6 | 0x1C00000 & v8 << 6 | 0xE000000 & v8 << 6 | v8 << 6 & 0x70000000, v8 >> 24 & 0x70 | (v8 >> 24 & 14 | 0xD80) | v11 << 12 & 0xE000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            chipElevation1 = chipElevation2;
            borderStroke1 = borderStroke2;
            z2 = z1;
            mutableInteractionSource1 = mutableInteractionSource2;
            function23 = function26;
            shape1 = shape2;
            chipColors2 = chipColors1;
            modifier2 = modifier1;
            function24 = function25;
        }
        else {
            composer1.skipToGroupEnd();
            function23 = function22;
            chipElevation1 = chipElevation0;
            borderStroke1 = borderStroke0;
            mutableInteractionSource1 = mutableInteractionSource0;
            chipColors2 = chipColors1;
            modifier2 = modifier1;
            z2 = z1;
            function24 = function21;
            shape1 = shape0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m3(function00, function20, modifier2, z2, function24, function23, shape1, chipColors2, chipElevation1, borderStroke1, mutableInteractionSource1, v, v1, v2, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with AssistChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "AssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource", imports = {}))
    public static final void AssistChip(Function0 function00, Function2 function20, Modifier modifier0, boolean z, Function2 function21, Function2 function22, Shape shape0, ChipColors chipColors0, ChipElevation chipElevation0, ChipBorder chipBorder0, MutableInteractionSource mutableInteractionSource0, Composer composer0, int v, int v1, int v2) {
        Shape shape1;
        Function2 function24;
        boolean z2;
        Modifier modifier2;
        ChipColors chipColors2;
        MutableInteractionSource mutableInteractionSource1;
        ChipBorder chipBorder1;
        ChipElevation chipElevation1;
        Function2 function23;
        int v11;
        Function2 function26;
        int v8;
        int v7;
        MutableInteractionSource mutableInteractionSource2;
        ChipBorder chipBorder2;
        ChipElevation chipElevation2;
        Shape shape2;
        Function2 function25;
        int v10;
        ChipBorder chipBorder3;
        Shape shape3;
        int v6;
        int v5;
        int v4;
        ChipColors chipColors1;
        boolean z1;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-1932300596);
        if((v2 & 1) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x180) == 0) {
            modifier1 = modifier0;
            v3 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
            z1 = z;
        }
        else if((v & 0xC00) == 0) {
            z1 = z;
            v3 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x20000 : 0x10000);
        }
        if((v & 0x180000) == 0) {
            v3 |= ((v2 & 0x40) != 0 || !composer1.changed(shape0) ? 0x80000 : 0x100000);
        }
        if((v & 0xC00000) == 0) {
            if((v2 & 0x80) == 0) {
                chipColors1 = chipColors0;
                v4 = composer1.changed(chipColors1) ? 0x800000 : 0x400000;
            }
            else {
                chipColors1 = chipColors0;
                v4 = 0x400000;
            }
            v3 |= v4;
        }
        else {
            chipColors1 = chipColors0;
        }
        if((v & 0x6000000) == 0) {
            v3 |= ((v2 & 0x100) != 0 || !composer1.changed(chipElevation0) ? 0x2000000 : 0x4000000);
        }
        if((v & 0x30000000) == 0) {
            v3 |= ((v2 & 0x200) != 0 || !composer1.changed(chipBorder0) ? 0x10000000 : 0x20000000);
        }
        if((v2 & 0x400) != 0) {
            v5 = v2 & 0x400;
            v6 = v1 | 6;
        }
        else if((v1 & 6) == 0) {
            v5 = v2 & 0x400;
            v6 = v1 | (composer1.changed(mutableInteractionSource0) ? 4 : 2);
        }
        else {
            v5 = v2 & 0x400;
            v6 = v1;
        }
        if((v3 & 306783379) != 306783378 || (v6 & 3) != 2 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 4) == 0 ? modifier1 : Modifier.Companion;
                if((v2 & 0x40) == 0) {
                    shape3 = shape0;
                }
                else {
                    v3 &= 0xFFC7FFFF;
                    shape3 = AssistChipDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v2 & 0x80) != 0) {
                    chipColors1 = AssistChipDefaults.INSTANCE.assistChipColors(composer1, 6);
                    v3 &= 0xFE3FFFFF;
                }
                int v9 = v3;
                if((v2 & 0x100) == 0) {
                    v8 = v6;
                    chipElevation2 = chipElevation0;
                }
                else {
                    v8 = v6;
                    v9 &= 0xF1FFFFFF;
                    chipElevation2 = AssistChipDefaults.INSTANCE.assistChipElevation-aqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x180000, 0x3F);
                }
                if((v2 & 0x200) == 0) {
                    chipBorder3 = chipBorder0;
                    v10 = v9;
                }
                else {
                    chipBorder3 = AssistChipDefaults.INSTANCE.assistChipBorder-d_3_b6Q(0L, 0L, 0.0f, composer1, 0xC00, 7);
                    v10 = v9 & 0x8FFFFFFF;
                }
                if(v5 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                    modifier1 = modifier3;
                    chipBorder2 = chipBorder3;
                    v7 = v10;
                }
                else {
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    modifier1 = modifier3;
                    chipBorder2 = chipBorder3;
                    v7 = v10;
                    mutableInteractionSource2 = mutableInteractionSource3;
                }
                shape2 = shape3;
                z1 = (v2 & 8) == 0 ? z1 : true;
                function25 = (v2 & 16) == 0 ? function21 : null;
                function26 = (v2 & 0x20) == 0 ? function22 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x40) != 0) {
                    v3 &= 0xFFC7FFFF;
                }
                if((v2 & 0x80) != 0) {
                    v3 &= 0xFE3FFFFF;
                }
                if((v2 & 0x100) != 0) {
                    v3 &= 0xF1FFFFFF;
                }
                if((v2 & 0x200) != 0) {
                    v3 &= 0x8FFFFFFF;
                }
                function25 = function21;
                shape2 = shape0;
                chipElevation2 = chipElevation0;
                chipBorder2 = chipBorder0;
                mutableInteractionSource2 = mutableInteractionSource0;
                v7 = v3;
                v8 = v6;
                function26 = function22;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                v11 = v8;
                ComposerKt.traceEventStart(-1932300596, v7, v11, "androidx.compose.material3.AssistChip (Chip.kt:219)");
            }
            else {
                v11 = v8;
            }
            TextStyle textStyle0 = TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), composer1, 6);
            long v12 = chipColors1.labelColor-vNxB06k$material3_release(z1);
            composer1.startReplaceGroup(0xFEEF28D);
            State state0 = chipBorder2 == null ? null : chipBorder2.borderStroke$material3_release(z1, composer1, v7 >> 9 & 14 | v7 >> 24 & 0x70);
            composer1.endReplaceGroup();
            ChipKt.a(modifier1, function00, z1, function20, textStyle0, v12, function25, function26, shape2, chipColors1, chipElevation2, (state0 == null ? null : ((BorderStroke)state0.getValue())), 0.0f, ChipKt.b, mutableInteractionSource2, composer1, v7 << 6 & 0x1C00 | (v7 >> 6 & 14 | v7 << 3 & 0x70 | v7 >> 3 & 0x380) | 0x380000 & v7 << 6 | 0x1C00000 & v7 << 6 | 0xE000000 & v7 << 6 | 0x70000000 & v7 << 6, v7 >> 24 & 14 | 0xD80 | v11 << 12 & 0xE000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            chipColors2 = chipColors1;
            modifier2 = modifier1;
            mutableInteractionSource1 = mutableInteractionSource2;
            z2 = z1;
            chipElevation1 = chipElevation2;
            chipBorder1 = chipBorder2;
            function24 = function25;
            function23 = function26;
            shape1 = shape2;
        }
        else {
            composer1.skipToGroupEnd();
            function23 = function22;
            chipElevation1 = chipElevation0;
            chipBorder1 = chipBorder0;
            mutableInteractionSource1 = mutableInteractionSource0;
            chipColors2 = chipColors1;
            modifier2 = modifier1;
            z2 = z1;
            function24 = function21;
            shape1 = shape0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n3(function00, function20, modifier2, z2, function24, function23, shape1, chipColors2, chipElevation1, chipBorder1, mutableInteractionSource1, v, v1, v2, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void ElevatedAssistChip(@NotNull Function0 function00, @NotNull Function2 function20, @Nullable Modifier modifier0, boolean z, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Shape shape0, @Nullable ChipColors chipColors0, @Nullable ChipElevation chipElevation0, @Nullable BorderStroke borderStroke0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v, int v1, int v2) {
        Shape shape1;
        Function2 function24;
        boolean z2;
        Modifier modifier2;
        ChipColors chipColors2;
        MutableInteractionSource mutableInteractionSource1;
        BorderStroke borderStroke1;
        ChipElevation chipElevation1;
        Function2 function23;
        int v11;
        Function2 function26;
        int v9;
        int v8;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        ChipElevation chipElevation2;
        Shape shape2;
        Function2 function25;
        int v10;
        ChipElevation chipElevation3;
        Shape shape3;
        int v7;
        int v6;
        int v5;
        int v4;
        ChipColors chipColors1;
        boolean z1;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x5F0E902E);
        if((v2 & 1) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x180) == 0) {
            modifier1 = modifier0;
            v3 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
            z1 = z;
        }
        else if((v & 0xC00) == 0) {
            z1 = z;
            v3 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x20000 : 0x10000);
        }
        if((v & 0x180000) == 0) {
            v3 |= ((v2 & 0x40) != 0 || !composer1.changed(shape0) ? 0x80000 : 0x100000);
        }
        if((v & 0xC00000) == 0) {
            if((v2 & 0x80) == 0) {
                chipColors1 = chipColors0;
                v4 = composer1.changed(chipColors1) ? 0x800000 : 0x400000;
            }
            else {
                chipColors1 = chipColors0;
                v4 = 0x400000;
            }
            v3 |= v4;
        }
        else {
            chipColors1 = chipColors0;
        }
        if((v & 0x6000000) == 0) {
            v3 |= ((v2 & 0x100) != 0 || !composer1.changed(chipElevation0) ? 0x2000000 : 0x4000000);
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
            v5 = v2 & 0x200;
        }
        else if((v & 0x30000000) == 0) {
            v5 = v2 & 0x200;
            v3 |= (composer1.changed(borderStroke0) ? 0x20000000 : 0x10000000);
        }
        else {
            v5 = v2 & 0x200;
        }
        if((v2 & 0x400) != 0) {
            v6 = v2 & 0x400;
            v7 = v1 | 6;
        }
        else if((v1 & 6) == 0) {
            v6 = v2 & 0x400;
            v7 = v1 | (composer1.changed(mutableInteractionSource0) ? 4 : 2);
        }
        else {
            v6 = v2 & 0x400;
            v7 = v1;
        }
        if((v3 & 306783379) != 306783378 || (v7 & 3) != 2 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 4) == 0 ? modifier1 : Modifier.Companion;
                boolean z3 = (v2 & 8) == 0 ? z1 : true;
                if((v2 & 0x40) == 0) {
                    shape3 = shape0;
                }
                else {
                    v3 &= 0xFFC7FFFF;
                    shape3 = AssistChipDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v2 & 0x80) != 0) {
                    chipColors1 = AssistChipDefaults.INSTANCE.elevatedAssistChipColors(composer1, 6);
                    v3 &= 0xFE3FFFFF;
                }
                if((v2 & 0x100) == 0) {
                    v8 = v7;
                    chipElevation3 = chipElevation0;
                    v10 = v3;
                }
                else {
                    v8 = v7;
                    chipElevation3 = AssistChipDefaults.INSTANCE.elevatedAssistChipElevation-aqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x180000, 0x3F);
                    v10 = v3 & 0xF1FFFFFF;
                }
                BorderStroke borderStroke3 = v5 == 0 ? borderStroke0 : null;
                if(v6 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                    modifier1 = modifier3;
                    chipElevation2 = chipElevation3;
                    v9 = v10;
                    borderStroke2 = borderStroke3;
                    shape2 = shape3;
                    z1 = z3;
                }
                else {
                    modifier1 = modifier3;
                    chipElevation2 = chipElevation3;
                    v9 = v10;
                    borderStroke2 = borderStroke3;
                    shape2 = shape3;
                    z1 = z3;
                    mutableInteractionSource2 = null;
                }
                function25 = (v2 & 16) == 0 ? function21 : null;
                function26 = (v2 & 0x20) == 0 ? function22 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x40) != 0) {
                    v3 &= 0xFFC7FFFF;
                }
                if((v2 & 0x80) != 0) {
                    v3 &= 0xFE3FFFFF;
                }
                if((v2 & 0x100) != 0) {
                    v3 &= 0xF1FFFFFF;
                }
                function25 = function21;
                shape2 = shape0;
                chipElevation2 = chipElevation0;
                borderStroke2 = borderStroke0;
                mutableInteractionSource2 = mutableInteractionSource0;
                v8 = v7;
                v9 = v3;
                function26 = function22;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                v11 = v8;
                ComposerKt.traceEventStart(0x5F0E902E, v9, v11, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:295)");
            }
            else {
                v11 = v8;
            }
            ChipKt.a(modifier1, function00, z1, function20, TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), composer1, 6), chipColors1.labelColor-vNxB06k$material3_release(z1), function25, function26, shape2, chipColors1, chipElevation2, borderStroke2, 0.0f, ChipKt.b, mutableInteractionSource2, composer1, v9 >> 6 & 14 | v9 << 3 & 0x70 | v9 >> 3 & 0x380 | v9 << 6 & 0x1C00 | 0x380000 & v9 << 6 | 0x1C00000 & v9 << 6 | 0xE000000 & v9 << 6 | v9 << 6 & 0x70000000, v9 >> 24 & 0x70 | (v9 >> 24 & 14 | 0xD80) | v11 << 12 & 0xE000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            chipElevation1 = chipElevation2;
            borderStroke1 = borderStroke2;
            z2 = z1;
            mutableInteractionSource1 = mutableInteractionSource2;
            function23 = function26;
            shape1 = shape2;
            chipColors2 = chipColors1;
            modifier2 = modifier1;
            function24 = function25;
        }
        else {
            composer1.skipToGroupEnd();
            function23 = function22;
            chipElevation1 = chipElevation0;
            borderStroke1 = borderStroke0;
            mutableInteractionSource1 = mutableInteractionSource0;
            chipColors2 = chipColors1;
            modifier2 = modifier1;
            z2 = z1;
            function24 = function21;
            shape1 = shape0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m3(function00, function20, modifier2, z2, function24, function23, shape1, chipColors2, chipElevation1, borderStroke1, mutableInteractionSource1, v, v1, v2, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with ElevatedAssistChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "ElevatedAssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource", imports = {}))
    public static final void ElevatedAssistChip(Function0 function00, Function2 function20, Modifier modifier0, boolean z, Function2 function21, Function2 function22, Shape shape0, ChipColors chipColors0, ChipElevation chipElevation0, ChipBorder chipBorder0, MutableInteractionSource mutableInteractionSource0, Composer composer0, int v, int v1, int v2) {
        Shape shape1;
        Function2 function24;
        boolean z2;
        Modifier modifier2;
        ChipColors chipColors2;
        MutableInteractionSource mutableInteractionSource1;
        ChipBorder chipBorder1;
        ChipElevation chipElevation1;
        Function2 function23;
        int v11;
        Function2 function26;
        int v9;
        int v8;
        MutableInteractionSource mutableInteractionSource2;
        ChipBorder chipBorder2;
        ChipElevation chipElevation2;
        Shape shape2;
        Function2 function25;
        int v10;
        ChipElevation chipElevation3;
        Shape shape3;
        int v7;
        int v6;
        int v5;
        int v4;
        ChipColors chipColors1;
        boolean z1;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x4D3D05C2);
        if((v2 & 1) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x180) == 0) {
            modifier1 = modifier0;
            v3 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
            z1 = z;
        }
        else if((v & 0xC00) == 0) {
            z1 = z;
            v3 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x20000 : 0x10000);
        }
        if((v & 0x180000) == 0) {
            v3 |= ((v2 & 0x40) != 0 || !composer1.changed(shape0) ? 0x80000 : 0x100000);
        }
        if((v & 0xC00000) == 0) {
            if((v2 & 0x80) == 0) {
                chipColors1 = chipColors0;
                v4 = composer1.changed(chipColors1) ? 0x800000 : 0x400000;
            }
            else {
                chipColors1 = chipColors0;
                v4 = 0x400000;
            }
            v3 |= v4;
        }
        else {
            chipColors1 = chipColors0;
        }
        if((v & 0x6000000) == 0) {
            v3 |= ((v2 & 0x100) != 0 || !composer1.changed(chipElevation0) ? 0x2000000 : 0x4000000);
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
            v5 = v2 & 0x200;
        }
        else if((v & 0x30000000) == 0) {
            v5 = v2 & 0x200;
            v3 |= (composer1.changed(chipBorder0) ? 0x20000000 : 0x10000000);
        }
        else {
            v5 = v2 & 0x200;
        }
        if((v2 & 0x400) != 0) {
            v6 = v2 & 0x400;
            v7 = v1 | 6;
        }
        else if((v1 & 6) == 0) {
            v6 = v2 & 0x400;
            v7 = v1 | (composer1.changed(mutableInteractionSource0) ? 4 : 2);
        }
        else {
            v6 = v2 & 0x400;
            v7 = v1;
        }
        if((v3 & 306783379) != 306783378 || (v7 & 3) != 2 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 4) == 0 ? modifier1 : Modifier.Companion;
                boolean z3 = (v2 & 8) == 0 ? z1 : true;
                Function2 function27 = (v2 & 16) == 0 ? function21 : null;
                if((v2 & 0x40) == 0) {
                    shape3 = shape0;
                }
                else {
                    v3 &= 0xFFC7FFFF;
                    shape3 = AssistChipDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v2 & 0x80) != 0) {
                    chipColors1 = AssistChipDefaults.INSTANCE.elevatedAssistChipColors(composer1, 6);
                    v3 &= 0xFE3FFFFF;
                }
                if((v2 & 0x100) == 0) {
                    v8 = v7;
                    chipElevation3 = chipElevation0;
                    v10 = v3;
                }
                else {
                    v8 = v7;
                    chipElevation3 = AssistChipDefaults.INSTANCE.elevatedAssistChipElevation-aqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x180000, 0x3F);
                    v10 = v3 & 0xF1FFFFFF;
                }
                ChipBorder chipBorder3 = v5 == 0 ? chipBorder0 : null;
                if(v6 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                    modifier1 = modifier3;
                    chipElevation2 = chipElevation3;
                    v9 = v10;
                    chipBorder2 = chipBorder3;
                    shape2 = shape3;
                    z1 = z3;
                    function25 = function27;
                }
                else {
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    modifier1 = modifier3;
                    v9 = v10;
                    chipBorder2 = chipBorder3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    shape2 = shape3;
                    z1 = z3;
                    function25 = function27;
                    chipElevation2 = chipElevation3;
                }
                function26 = (v2 & 0x20) == 0 ? function22 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x40) != 0) {
                    v3 &= 0xFFC7FFFF;
                }
                if((v2 & 0x80) != 0) {
                    v3 &= 0xFE3FFFFF;
                }
                if((v2 & 0x100) != 0) {
                    v3 &= 0xF1FFFFFF;
                }
                function25 = function21;
                shape2 = shape0;
                chipElevation2 = chipElevation0;
                chipBorder2 = chipBorder0;
                mutableInteractionSource2 = mutableInteractionSource0;
                v8 = v7;
                v9 = v3;
                function26 = function22;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                v11 = v8;
                ComposerKt.traceEventStart(0x4D3D05C2, v9, v11, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:381)");
            }
            else {
                v11 = v8;
            }
            TextStyle textStyle0 = TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), composer1, 6);
            long v12 = chipColors1.labelColor-vNxB06k$material3_release(z1);
            composer1.startReplaceGroup(1552007127);
            State state0 = chipBorder2 == null ? null : chipBorder2.borderStroke$material3_release(z1, composer1, v9 >> 9 & 14 | v9 >> 24 & 0x70);
            composer1.endReplaceGroup();
            ChipKt.a(modifier1, function00, z1, function20, textStyle0, v12, function25, function26, shape2, chipColors1, chipElevation2, (state0 == null ? null : ((BorderStroke)state0.getValue())), 0.0f, ChipKt.b, mutableInteractionSource2, composer1, v9 << 6 & 0x1C00 | (v9 >> 6 & 14 | v9 << 3 & 0x70 | v9 >> 3 & 0x380) | 0x380000 & v9 << 6 | 0x1C00000 & v9 << 6 | 0xE000000 & v9 << 6 | 0x70000000 & v9 << 6, v9 >> 24 & 14 | 0xD80 | v11 << 12 & 0xE000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            chipBorder1 = chipBorder2;
            function23 = function26;
            chipElevation1 = chipElevation2;
            z2 = z1;
            mutableInteractionSource1 = mutableInteractionSource2;
            shape1 = shape2;
            chipColors2 = chipColors1;
            modifier2 = modifier1;
            function24 = function25;
        }
        else {
            composer1.skipToGroupEnd();
            function23 = function22;
            chipElevation1 = chipElevation0;
            chipBorder1 = chipBorder0;
            mutableInteractionSource1 = mutableInteractionSource0;
            chipColors2 = chipColors1;
            modifier2 = modifier1;
            z2 = z1;
            function24 = function21;
            shape1 = shape0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n3(function00, function20, modifier2, z2, function24, function23, shape1, chipColors2, chipElevation1, chipBorder1, mutableInteractionSource1, v, v1, v2, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void ElevatedFilterChip(boolean z, @NotNull Function0 function00, @NotNull Function2 function20, @Nullable Modifier modifier0, boolean z1, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Shape shape0, @Nullable SelectableChipColors selectableChipColors0, @Nullable SelectableChipElevation selectableChipElevation0, @Nullable BorderStroke borderStroke0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v, int v1, int v2) {
        Function2 function25;
        SelectableChipColors selectableChipColors2;
        Function2 function24;
        boolean z3;
        Modifier modifier2;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource1;
        BorderStroke borderStroke1;
        SelectableChipElevation selectableChipElevation1;
        Function2 function26;
        int v10;
        int v9;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        SelectableChipElevation selectableChipElevation2;
        int v12;
        SelectableChipElevation selectableChipElevation3;
        Modifier modifier4;
        SelectableChipColors selectableChipColors3;
        int v11;
        Shape shape3;
        int v8;
        int v7;
        int v6;
        int v5;
        SelectableChipColors selectableChipColors1;
        int v4;
        Shape shape1;
        Function2 function23;
        boolean z2;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xF9A4B0A3);
        if((v2 & 1) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
            modifier1 = modifier0;
        }
        else if((v & 0xC00) == 0) {
            modifier1 = modifier0;
            v3 |= (composer1.changed(modifier1) ? 0x800 : 0x400);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
            z2 = z1;
        }
        else if((v & 0x6000) == 0) {
            z2 = z1;
            v3 |= (composer1.changed(z2) ? 0x4000 : 0x2000);
        }
        else {
            z2 = z1;
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) == 0) {
            function23 = function22;
            if((v & 0x180000) == 0) {
                v3 |= (composer1.changedInstance(function23) ? 0x100000 : 0x80000);
            }
        }
        else {
            v3 |= 0x180000;
            function23 = function22;
        }
        if((v & 0xC00000) == 0) {
            if((v2 & 0x80) == 0) {
                shape1 = shape0;
                v4 = composer1.changed(shape1) ? 0x800000 : 0x400000;
            }
            else {
                shape1 = shape0;
                v4 = 0x400000;
            }
            v3 |= v4;
        }
        else {
            shape1 = shape0;
        }
        if((v & 0x6000000) == 0) {
            if((v2 & 0x100) == 0) {
                selectableChipColors1 = selectableChipColors0;
                v5 = composer1.changed(selectableChipColors1) ? 0x4000000 : 0x2000000;
            }
            else {
                selectableChipColors1 = selectableChipColors0;
                v5 = 0x2000000;
            }
            v3 |= v5;
        }
        else {
            selectableChipColors1 = selectableChipColors0;
        }
        if((v & 0x30000000) == 0) {
            v3 |= ((v2 & 0x200) != 0 || !composer1.changed(selectableChipElevation0) ? 0x10000000 : 0x20000000);
        }
        if((v2 & 0x400) != 0) {
            v6 = v1 | 6;
            v7 = v2 & 0x400;
        }
        else if((v1 & 6) == 0) {
            v7 = v2 & 0x400;
            v6 = v1 | (composer1.changed(borderStroke0) ? 4 : 2);
        }
        else {
            v7 = v2 & 0x400;
            v6 = v1;
        }
        if((v2 & 0x800) != 0) {
            v6 |= 0x30;
            v8 = v2 & 0x800;
        }
        else if((v1 & 0x30) == 0) {
            v8 = v2 & 0x800;
            v6 |= (composer1.changed(mutableInteractionSource0) ? 0x20 : 16);
        }
        else {
            v8 = v2 & 0x800;
        }
        if((v3 & 306783379) != 306783378 || (v6 & 19) != 18 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 8) == 0 ? modifier1 : Modifier.Companion;
                boolean z4 = (v2 & 16) == 0 ? z2 : true;
                Function2 function27 = (v2 & 0x40) == 0 ? function23 : null;
                if((v2 & 0x80) == 0) {
                    shape3 = shape1;
                }
                else {
                    v3 &= 0xFE3FFFFF;
                    shape3 = FilterChipDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v2 & 0x100) == 0) {
                    v11 = v3;
                    selectableChipColors3 = selectableChipColors1;
                }
                else {
                    v11 = v3 & 0xF1FFFFFF;
                    selectableChipColors3 = FilterChipDefaults.INSTANCE.elevatedFilterChipColors(composer1, 6);
                }
                if((v2 & 0x200) == 0) {
                    modifier4 = modifier3;
                    v9 = v6;
                    selectableChipElevation3 = selectableChipElevation0;
                    v12 = v11;
                }
                else {
                    modifier4 = modifier3;
                    v9 = v6;
                    selectableChipElevation3 = FilterChipDefaults.INSTANCE.elevatedFilterChipElevation-aqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x180000, 0x3F);
                    v12 = v11 & 0x8FFFFFFF;
                }
                BorderStroke borderStroke3 = v7 == 0 ? borderStroke0 : null;
                modifier1 = modifier4;
                if(v8 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                    v10 = v12;
                    borderStroke2 = borderStroke3;
                    function23 = function27;
                    shape1 = shape3;
                    z2 = z4;
                }
                else {
                    v10 = v12;
                    borderStroke2 = borderStroke3;
                    function23 = function27;
                    shape1 = shape3;
                    z2 = z4;
                    mutableInteractionSource2 = null;
                }
                selectableChipColors1 = selectableChipColors3;
                selectableChipElevation2 = selectableChipElevation3;
                function26 = (v2 & 0x20) == 0 ? function21 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x80) != 0) {
                    v3 &= 0xFE3FFFFF;
                }
                if((v2 & 0x100) != 0) {
                    v3 &= 0xF1FFFFFF;
                }
                if((v2 & 0x200) != 0) {
                    v3 &= 0x8FFFFFFF;
                }
                selectableChipElevation2 = selectableChipElevation0;
                borderStroke2 = borderStroke0;
                mutableInteractionSource2 = mutableInteractionSource0;
                v9 = v6;
                v10 = v3;
                function26 = function21;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF9A4B0A3, v10, v9, "androidx.compose.material3.ElevatedFilterChip (Chip.kt:552)");
            }
            ChipKt.b(z, modifier1, function00, z2, function20, TypographyKt.getValue(FilterChipTokens.INSTANCE.getLabelTextFont(), composer1, 6), function26, null, function23, shape1, selectableChipColors1, selectableChipElevation2, borderStroke2, 0.0f, ChipKt.c, mutableInteractionSource2, composer1, v10 & 14 | 0xC00000 | v10 >> 6 & 0x70 | v10 << 3 & 0x380 | v10 >> 3 & 0x1C00 | v10 << 6 & 0xE000 | v10 << 3 & 0x380000 | 0xE000000 & v10 << 6 | 0x70000000 & v10 << 6, v10 >> 24 & 0x70 | (v10 >> 24 & 14 | 0x6C00) | v9 << 6 & 0x380 | v9 << 12 & 0x70000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            selectableChipElevation1 = selectableChipElevation2;
            borderStroke1 = borderStroke2;
            modifier2 = modifier1;
            mutableInteractionSource1 = mutableInteractionSource2;
            function24 = function23;
            shape2 = shape1;
            z3 = z2;
            selectableChipColors2 = selectableChipColors1;
            function25 = function26;
        }
        else {
            composer1.skipToGroupEnd();
            selectableChipElevation1 = selectableChipElevation0;
            borderStroke1 = borderStroke0;
            mutableInteractionSource1 = mutableInteractionSource0;
            shape2 = shape1;
            modifier2 = modifier1;
            z3 = z2;
            function24 = function23;
            selectableChipColors2 = selectableChipColors1;
            function25 = function21;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v3(z, function00, function20, modifier2, z3, function25, function24, shape2, selectableChipColors2, selectableChipElevation1, borderStroke1, mutableInteractionSource1, v, v1, v2, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void ElevatedSuggestionChip(@NotNull Function0 function00, @NotNull Function2 function20, @Nullable Modifier modifier0, boolean z, @Nullable Function2 function21, @Nullable Shape shape0, @Nullable ChipColors chipColors0, @Nullable ChipElevation chipElevation0, @Nullable BorderStroke borderStroke0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v, int v1) {
        BorderStroke borderStroke1;
        ChipElevation chipElevation1;
        MutableInteractionSource mutableInteractionSource1;
        Shape shape2;
        boolean z1;
        Modifier modifier1;
        boolean z2;
        int v6;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        ChipElevation chipElevation2;
        Modifier modifier2;
        ChipElevation chipElevation3;
        ChipColors chipColors2;
        int v7;
        Shape shape3;
        int v5;
        int v4;
        ChipColors chipColors1;
        int v3;
        Shape shape1;
        Function2 function22;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xCF3191E7);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            function22 = function21;
        }
        else if((v & 0x6000) == 0) {
            function22 = function21;
            v2 |= (composer1.changedInstance(function22) ? 0x4000 : 0x2000);
        }
        else {
            function22 = function21;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                shape1 = shape0;
                v3 = composer1.changed(shape1) ? 0x20000 : 0x10000;
            }
            else {
                shape1 = shape0;
                v3 = 0x10000;
            }
            v2 |= v3;
        }
        else {
            shape1 = shape0;
        }
        if((0x180000 & v) == 0) {
            if((v1 & 0x40) == 0) {
                chipColors1 = chipColors0;
                v4 = composer1.changed(chipColors1) ? 0x100000 : 0x80000;
            }
            else {
                chipColors1 = chipColors0;
                v4 = 0x80000;
            }
            v2 |= v4;
        }
        else {
            chipColors1 = chipColors0;
        }
        if((v & 0xC00000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.changed(chipElevation0) ? 0x400000 : 0x800000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changed(borderStroke0) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
            v5 = v1 & 0x200;
        }
        else if((v & 0x30000000) == 0) {
            v5 = v1 & 0x200;
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x20000000 : 0x10000000);
        }
        else {
            v5 = v1 & 0x200;
        }
        if((v2 & 306783379) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
                boolean z3 = (v1 & 8) == 0 ? z : true;
                if((v1 & 0x20) == 0) {
                    shape3 = shape1;
                }
                else {
                    v2 &= 0xFFF8FFFF;
                    shape3 = SuggestionChipDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v1 & 0x40) == 0) {
                    v7 = v2;
                    chipColors2 = chipColors1;
                }
                else {
                    v7 = v2 & 0xFFC7FFFF;
                    chipColors2 = SuggestionChipDefaults.INSTANCE.elevatedSuggestionChipColors(composer1, 6);
                }
                if((v1 & 0x80) == 0) {
                    chipElevation3 = chipElevation0;
                }
                else {
                    chipElevation3 = SuggestionChipDefaults.INSTANCE.elevatedSuggestionChipElevation-aqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x180000, 0x3F);
                    v7 &= 0xFE3FFFFF;
                }
                BorderStroke borderStroke3 = (v1 & 0x100) == 0 ? borderStroke0 : null;
                if(v5 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                    borderStroke2 = borderStroke3;
                    chipElevation2 = chipElevation3;
                    shape1 = shape3;
                    modifier2 = modifier3;
                    z2 = z3;
                }
                else {
                    borderStroke2 = borderStroke3;
                    chipElevation2 = chipElevation3;
                    shape1 = shape3;
                    modifier2 = modifier3;
                    z2 = z3;
                    mutableInteractionSource2 = null;
                }
                function22 = (v1 & 16) == 0 ? function22 : null;
                chipColors1 = chipColors2;
                v6 = v7;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                modifier2 = modifier0;
                chipElevation2 = chipElevation0;
                borderStroke2 = borderStroke0;
                mutableInteractionSource2 = mutableInteractionSource0;
                v6 = v2;
                z2 = z;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCF3191E7, v6, -1, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:903)");
            }
            ChipKt.a(modifier2, function00, z2, function20, TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), composer1, 6), chipColors1.labelColor-vNxB06k$material3_release(z2), function22, null, shape1, chipColors1, chipElevation2, borderStroke2, 0.0f, ChipKt.d, mutableInteractionSource2, composer1, v6 >> 6 & 14 | 0xC00000 | v6 << 3 & 0x70 | v6 >> 3 & 0x380 | v6 << 6 & 0x1C00 | v6 << 6 & 0x380000 | 0xE000000 & v6 << 9 | v6 << 9 & 0x70000000, v6 >> 21 & 0x70 | (v6 >> 21 & 14 | 0xD80) | v6 >> 15 & 0xE000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            borderStroke1 = borderStroke2;
            mutableInteractionSource1 = mutableInteractionSource2;
            shape2 = shape1;
            modifier1 = modifier2;
            z1 = z2;
            chipElevation1 = chipElevation2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z1 = z;
            shape2 = shape1;
            mutableInteractionSource1 = mutableInteractionSource0;
            chipElevation1 = chipElevation0;
            borderStroke1 = borderStroke0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w3(function00, function20, modifier1, z1, function22, shape2, chipColors1, chipElevation1, borderStroke1, mutableInteractionSource1, v, v1, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with ElevatedSuggestionChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "ElevatedSuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource", imports = {}))
    public static final void ElevatedSuggestionChip(Function0 function00, Function2 function20, Modifier modifier0, boolean z, Function2 function21, Shape shape0, ChipColors chipColors0, ChipElevation chipElevation0, ChipBorder chipBorder0, MutableInteractionSource mutableInteractionSource0, Composer composer0, int v, int v1) {
        ChipBorder chipBorder1;
        ChipElevation chipElevation1;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        boolean z1;
        Modifier modifier1;
        boolean z2;
        int v6;
        ChipBorder chipBorder2;
        ChipElevation chipElevation2;
        Modifier modifier2;
        ChipElevation chipElevation3;
        ChipColors chipColors2;
        int v7;
        Shape shape3;
        MutableInteractionSource mutableInteractionSource1;
        int v5;
        int v4;
        ChipColors chipColors1;
        int v3;
        Shape shape1;
        Function2 function22;
        int v2;
        Composer composer1 = composer0.startRestartGroup(1668751803);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            function22 = function21;
        }
        else if((v & 0x6000) == 0) {
            function22 = function21;
            v2 |= (composer1.changedInstance(function22) ? 0x4000 : 0x2000);
        }
        else {
            function22 = function21;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                shape1 = shape0;
                v3 = composer1.changed(shape1) ? 0x20000 : 0x10000;
            }
            else {
                shape1 = shape0;
                v3 = 0x10000;
            }
            v2 |= v3;
        }
        else {
            shape1 = shape0;
        }
        if((0x180000 & v) == 0) {
            if((v1 & 0x40) == 0) {
                chipColors1 = chipColors0;
                v4 = composer1.changed(chipColors1) ? 0x100000 : 0x80000;
            }
            else {
                chipColors1 = chipColors0;
                v4 = 0x80000;
            }
            v2 |= v4;
        }
        else {
            chipColors1 = chipColors0;
        }
        if((v & 0xC00000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.changed(chipElevation0) ? 0x400000 : 0x800000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changed(chipBorder0) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
            v5 = v1 & 0x200;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        else if((v & 0x30000000) == 0) {
            v5 = v1 & 0x200;
            mutableInteractionSource1 = mutableInteractionSource0;
            v2 |= (composer1.changed(mutableInteractionSource1) ? 0x20000000 : 0x10000000);
        }
        else {
            v5 = v1 & 0x200;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        if((v2 & 306783379) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
                boolean z3 = (v1 & 8) == 0 ? z : true;
                Function2 function23 = (v1 & 16) == 0 ? function22 : null;
                if((v1 & 0x20) == 0) {
                    shape3 = shape1;
                }
                else {
                    v2 &= 0xFFF8FFFF;
                    shape3 = SuggestionChipDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v1 & 0x40) == 0) {
                    v7 = v2;
                    chipColors2 = chipColors1;
                }
                else {
                    v7 = v2 & 0xFFC7FFFF;
                    chipColors2 = SuggestionChipDefaults.INSTANCE.elevatedSuggestionChipColors(composer1, 6);
                }
                if((v1 & 0x80) == 0) {
                    chipElevation3 = chipElevation0;
                }
                else {
                    chipElevation3 = SuggestionChipDefaults.INSTANCE.elevatedSuggestionChipElevation-aqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x180000, 0x3F);
                    v7 &= 0xFE3FFFFF;
                }
                ChipBorder chipBorder3 = (v1 & 0x100) == 0 ? chipBorder0 : null;
                if(v5 == 0) {
                    mutableInteractionSource1 = mutableInteractionSource0;
                    chipBorder2 = chipBorder3;
                    chipElevation2 = chipElevation3;
                    chipColors1 = chipColors2;
                    shape1 = shape3;
                    modifier2 = modifier3;
                    z2 = z3;
                    function22 = function23;
                    v6 = v7;
                }
                else {
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    chipBorder2 = chipBorder3;
                    mutableInteractionSource1 = mutableInteractionSource3;
                    chipColors1 = chipColors2;
                    shape1 = shape3;
                    modifier2 = modifier3;
                    function22 = function23;
                    v6 = v7;
                    chipElevation2 = chipElevation3;
                    z2 = z3;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                modifier2 = modifier0;
                chipElevation2 = chipElevation0;
                chipBorder2 = chipBorder0;
                v6 = v2;
                z2 = z;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1668751803, v6, -1, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:986)");
            }
            TextStyle textStyle0 = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), composer1, 6);
            long v8 = chipColors1.labelColor-vNxB06k$material3_release(z2);
            composer1.startReplaceGroup(0x7E784A92);
            State state0 = chipBorder2 == null ? null : chipBorder2.borderStroke$material3_release(z2, composer1, v6 >> 9 & 14 | v6 >> 21 & 0x70);
            composer1.endReplaceGroup();
            ChipKt.a(modifier2, function00, z2, function20, textStyle0, v8, function22, null, shape1, chipColors1, chipElevation2, (state0 == null ? null : ((BorderStroke)state0.getValue())), 0.0f, ChipKt.d, mutableInteractionSource1, composer1, v6 >> 6 & 14 | 0xC00000 | v6 << 3 & 0x70 | v6 >> 3 & 0x380 | v6 << 6 & 0x1C00 | v6 << 6 & 0x380000 | 0xE000000 & v6 << 9 | v6 << 9 & 0x70000000, v6 >> 21 & 14 | 0xD80 | v6 >> 15 & 0xE000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z1 = z2;
            shape2 = shape1;
            mutableInteractionSource2 = mutableInteractionSource1;
            chipElevation1 = chipElevation2;
            chipBorder1 = chipBorder2;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z1 = z;
            shape2 = shape1;
            mutableInteractionSource2 = mutableInteractionSource1;
            chipElevation1 = chipElevation0;
            chipBorder1 = chipBorder0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x3(function00, function20, modifier1, z1, function22, shape2, chipColors1, chipElevation1, chipBorder1, mutableInteractionSource2, v, v1, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void FilterChip(boolean z, @NotNull Function0 function00, @NotNull Function2 function20, @Nullable Modifier modifier0, boolean z1, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Shape shape0, @Nullable SelectableChipColors selectableChipColors0, @Nullable SelectableChipElevation selectableChipElevation0, @Nullable BorderStroke borderStroke0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v, int v1, int v2) {
        Function2 function25;
        SelectableChipColors selectableChipColors2;
        Function2 function24;
        SelectableChipElevation selectableChipElevation1;
        MutableInteractionSource mutableInteractionSource2;
        boolean z3;
        Modifier modifier1;
        Shape shape2;
        BorderStroke borderStroke1;
        SelectableChipElevation selectableChipElevation2;
        int v10;
        Modifier modifier2;
        int v9;
        BorderStroke borderStroke2;
        Function2 function26;
        BorderStroke borderStroke3;
        int v13;
        int v12;
        SelectableChipColors selectableChipColors3;
        int v11;
        Shape shape3;
        MutableInteractionSource mutableInteractionSource1;
        int v8;
        int v7;
        int v5;
        SelectableChipColors selectableChipColors1;
        int v4;
        Shape shape1;
        Function2 function23;
        boolean z2;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x99F52C2D);
        if((v2 & 1) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
            z2 = z1;
        }
        else if((v & 0x6000) == 0) {
            z2 = z1;
            v3 |= (composer1.changed(z2) ? 0x4000 : 0x2000);
        }
        else {
            z2 = z1;
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) == 0) {
            function23 = function22;
            if((v & 0x180000) == 0) {
                v3 |= (composer1.changedInstance(function23) ? 0x100000 : 0x80000);
            }
        }
        else {
            v3 |= 0x180000;
            function23 = function22;
        }
        if((v & 0xC00000) == 0) {
            if((v2 & 0x80) == 0) {
                shape1 = shape0;
                v4 = composer1.changed(shape1) ? 0x800000 : 0x400000;
            }
            else {
                shape1 = shape0;
                v4 = 0x400000;
            }
            v3 |= v4;
        }
        else {
            shape1 = shape0;
        }
        if((v & 0x6000000) == 0) {
            if((v2 & 0x100) == 0) {
                selectableChipColors1 = selectableChipColors0;
                v5 = composer1.changed(selectableChipColors1) ? 0x4000000 : 0x2000000;
            }
            else {
                selectableChipColors1 = selectableChipColors0;
                v5 = 0x2000000;
            }
            v3 |= v5;
        }
        else {
            selectableChipColors1 = selectableChipColors0;
        }
        if((v & 0x30000000) == 0) {
            v3 |= ((v2 & 0x200) != 0 || !composer1.changed(selectableChipElevation0) ? 0x10000000 : 0x20000000);
        }
        int v6 = (v1 & 6) == 0 ? v1 | ((v2 & 0x400) != 0 || !composer1.changed(borderStroke0) ? 2 : 4) : v1;
        if((v2 & 0x800) == 0) {
            if((v1 & 0x30) == 0) {
                v7 = v2 & 0x800;
                mutableInteractionSource1 = mutableInteractionSource0;
                v6 |= (composer1.changed(mutableInteractionSource1) ? 0x20 : 16);
            }
            else {
                v7 = v2 & 0x800;
                mutableInteractionSource1 = mutableInteractionSource0;
            }
            v8 = v6;
        }
        else {
            v7 = v2 & 0x800;
            v8 = v6 | 0x30;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        if((v3 & 306783379) != 306783378 || (v8 & 19) != 18 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v2 & 8) == 0 ? modifier0 : Modifier.Companion;
                boolean z4 = (v2 & 16) == 0 ? z2 : true;
                function26 = (v2 & 0x20) == 0 ? function21 : null;
                if((v2 & 0x80) == 0) {
                    shape3 = shape1;
                }
                else {
                    v3 &= 0xFE3FFFFF;
                    shape3 = FilterChipDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v2 & 0x100) == 0) {
                    v11 = v3;
                    selectableChipColors3 = selectableChipColors1;
                }
                else {
                    v11 = v3 & 0xF1FFFFFF;
                    selectableChipColors3 = FilterChipDefaults.INSTANCE.filterChipColors(composer1, 6);
                }
                if((v2 & 0x200) == 0) {
                    v12 = v7;
                    selectableChipElevation2 = selectableChipElevation0;
                    v13 = v11;
                }
                else {
                    v12 = v7;
                    selectableChipElevation2 = FilterChipDefaults.INSTANCE.filterChipElevation-aqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x180000, 0x3F);
                    v13 = v11 & 0x8FFFFFFF;
                }
                if((v2 & 0x400) == 0) {
                    borderStroke3 = borderStroke0;
                }
                else {
                    borderStroke3 = FilterChipDefaults.INSTANCE.filterChipBorder-_7El2pE(z4, z, 0L, 0L, 0L, 0L, 0.0f, 0.0f, composer1, v13 >> 12 & 14 | 0x6000000 | v13 << 3 & 0x70, 0xFC);
                    v8 &= -15;
                }
                if(v12 == 0) {
                    mutableInteractionSource1 = mutableInteractionSource0;
                    v9 = v13;
                    borderStroke2 = borderStroke3;
                    v10 = v8;
                    z2 = z4;
                }
                else {
                    v9 = v13;
                    borderStroke2 = borderStroke3;
                    v10 = v8;
                    z2 = z4;
                    mutableInteractionSource1 = null;
                }
                function23 = (v2 & 0x40) == 0 ? function23 : null;
                shape1 = shape3;
                selectableChipColors1 = selectableChipColors3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x80) != 0) {
                    v3 &= 0xFE3FFFFF;
                }
                if((v2 & 0x100) != 0) {
                    v3 &= 0xF1FFFFFF;
                }
                if((v2 & 0x200) != 0) {
                    v3 &= 0x8FFFFFFF;
                }
                if((v2 & 0x400) != 0) {
                    v8 &= -15;
                }
                function26 = function21;
                borderStroke2 = borderStroke0;
                v9 = v3;
                modifier2 = modifier0;
                v10 = v8;
                selectableChipElevation2 = selectableChipElevation0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x99F52C2D, v9, v10, "androidx.compose.material3.FilterChip (Chip.kt:468)");
            }
            ChipKt.b(z, modifier2, function00, z2, function20, TypographyKt.getValue(FilterChipTokens.INSTANCE.getLabelTextFont(), composer1, 6), function26, null, function23, shape1, selectableChipColors1, selectableChipElevation2, borderStroke2, 0.0f, ChipKt.c, mutableInteractionSource1, composer1, v9 & 14 | 0xC00000 | v9 >> 6 & 0x70 | v9 << 3 & 0x380 | v9 >> 3 & 0x1C00 | v9 << 6 & 0xE000 | v9 << 3 & 0x380000 | 0xE000000 & v9 << 6 | 0x70000000 & v9 << 6, v9 >> 24 & 0x70 | (v9 >> 24 & 14 | 0x6C00) | v10 << 6 & 0x380 | v10 << 12 & 0x70000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            borderStroke1 = borderStroke2;
            function24 = function23;
            shape2 = shape1;
            z3 = z2;
            mutableInteractionSource2 = mutableInteractionSource1;
            selectableChipElevation1 = selectableChipElevation2;
            selectableChipColors2 = selectableChipColors1;
            function25 = function26;
        }
        else {
            composer1.skipToGroupEnd();
            borderStroke1 = borderStroke0;
            shape2 = shape1;
            modifier1 = modifier0;
            z3 = z2;
            mutableInteractionSource2 = mutableInteractionSource1;
            selectableChipElevation1 = selectableChipElevation0;
            function24 = function23;
            selectableChipColors2 = selectableChipColors1;
            function25 = function21;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v3(z, function00, function20, modifier1, z3, function25, function24, shape2, selectableChipColors2, selectableChipElevation1, borderStroke1, mutableInteractionSource2, v, v1, v2, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void InputChip(boolean z, @NotNull Function0 function00, @NotNull Function2 function20, @Nullable Modifier modifier0, boolean z1, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, @Nullable Shape shape0, @Nullable SelectableChipColors selectableChipColors0, @Nullable SelectableChipElevation selectableChipElevation0, @Nullable BorderStroke borderStroke0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v, int v1, int v2) {
        boolean z2;
        Function2 function29;
        SelectableChipElevation selectableChipElevation1;
        Function2 function28;
        Function2 function27;
        MutableInteractionSource mutableInteractionSource1;
        BorderStroke borderStroke1;
        SelectableChipColors selectableChipColors1;
        Shape shape1;
        Modifier modifier1;
        SelectableChipElevation selectableChipElevation2;
        Function2 function210;
        int v7;
        int v6;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        SelectableChipColors selectableChipColors2;
        Shape shape2;
        boolean z3;
        Modifier modifier2;
        int v9;
        Function2 function211;
        int v8;
        Function2 function26;
        Function2 function25;
        Function2 function24;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x62E13C03);
        if((v2 & 1) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v3 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) == 0) {
            function24 = function21;
            if((v & 0x30000) == 0) {
                v3 |= (composer1.changedInstance(function24) ? 0x20000 : 0x10000);
            }
        }
        else {
            v3 |= 0x30000;
            function24 = function21;
        }
        if((v2 & 0x40) == 0) {
            function25 = function22;
            if((v & 0x180000) == 0) {
                v3 |= (composer1.changedInstance(function25) ? 0x100000 : 0x80000);
            }
        }
        else {
            v3 |= 0x180000;
            function25 = function22;
        }
        if((v2 & 0x80) == 0) {
            function26 = function23;
            if((v & 0xC00000) == 0) {
                v3 |= (composer1.changedInstance(function26) ? 0x800000 : 0x400000);
            }
        }
        else {
            v3 |= 0xC00000;
            function26 = function23;
        }
        if((v & 0x6000000) == 0) {
            v3 |= ((v2 & 0x100) != 0 || !composer1.changed(shape0) ? 0x2000000 : 0x4000000);
        }
        if((v & 0x30000000) == 0) {
            v3 |= ((v2 & 0x200) != 0 || !composer1.changed(selectableChipColors0) ? 0x10000000 : 0x20000000);
        }
        int v4 = (v1 & 6) == 0 ? v1 | ((v2 & 0x400) != 0 || !composer1.changed(selectableChipElevation0) ? 2 : 4) : v1;
        if((v1 & 0x30) == 0) {
            v4 |= ((v2 & 0x800) != 0 || !composer1.changed(borderStroke0) ? 16 : 0x20);
        }
        int v5 = v4;
        if((v2 & 0x1000) != 0) {
            v5 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v5 |= (composer1.changed(mutableInteractionSource0) ? 0x100 : 0x80);
        }
        if((v3 & 306783379) != 306783378 || (v5 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v2 & 8) == 0 ? modifier0 : Modifier.Companion;
                z3 = (v2 & 16) == 0 ? z1 : true;
                if((v2 & 0x80) != 0) {
                    function26 = null;
                }
                if((v2 & 0x100) == 0) {
                    shape2 = shape0;
                }
                else {
                    v3 &= 0xF1FFFFFF;
                    shape2 = InputChipDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v2 & 0x200) == 0) {
                    selectableChipColors2 = selectableChipColors0;
                    v8 = v3;
                }
                else {
                    v8 = v3 & 0x8FFFFFFF;
                    selectableChipColors2 = InputChipDefaults.INSTANCE.inputChipColors(composer1, 6);
                }
                if((v2 & 0x400) == 0) {
                    function211 = function26;
                    v9 = v2 & 0x1000;
                    selectableChipElevation2 = selectableChipElevation0;
                }
                else {
                    function211 = function26;
                    v9 = v2 & 0x1000;
                    selectableChipElevation2 = InputChipDefaults.INSTANCE.inputChipElevation-aqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x180000, 0x3F);
                    v5 &= -15;
                }
                if((v2 & 0x800) == 0) {
                    borderStroke2 = borderStroke0;
                }
                else {
                    borderStroke2 = InputChipDefaults.INSTANCE.inputChipBorder-_7El2pE(z3, z, 0L, 0L, 0L, 0L, 0.0f, 0.0f, composer1, v8 >> 12 & 14 | 0x6000000 | v8 << 3 & 0x70, 0xFC);
                    v5 &= 0xFFFFFF8F;
                }
                if(v9 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                    v6 = v5;
                }
                else {
                    v6 = v5;
                    mutableInteractionSource2 = null;
                }
                function24 = (v2 & 0x20) == 0 ? function24 : null;
                function25 = (v2 & 0x40) == 0 ? function25 : null;
                v7 = v8;
                function210 = function211;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x100) != 0) {
                    v3 &= 0xF1FFFFFF;
                }
                if((v2 & 0x200) != 0) {
                    v3 &= 0x8FFFFFFF;
                }
                if((v2 & 0x400) != 0) {
                    v5 &= -15;
                }
                if((v2 & 0x800) != 0) {
                    v5 &= 0xFFFFFF8F;
                }
                modifier2 = modifier0;
                z3 = z1;
                shape2 = shape0;
                selectableChipColors2 = selectableChipColors0;
                borderStroke2 = borderStroke0;
                mutableInteractionSource2 = mutableInteractionSource0;
                v6 = v5;
                v7 = v3;
                function210 = function26;
                selectableChipElevation2 = selectableChipElevation0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x62E13C03, v7, v6, "androidx.compose.material3.InputChip (Chip.kt:643)");
            }
            composer1.startReplaceGroup(0x18E8F774);
            ComposableLambda composableLambda0 = function25 == null ? null : ComposableLambdaKt.rememberComposableLambda(1154227507, true, new z3((z3 ? 1.0f : 0.38f), ShapesKt.getValue(InputChipTokens.INSTANCE.getAvatarShape(), composer1, 6), function25), composer1, 54);
            composer1.endReplaceGroup();
            ChipKt.b(z, modifier2, function00, z3, function20, TypographyKt.getValue(InputChipTokens.INSTANCE.getLabelTextFont(), composer1, 6), function24, composableLambda0, function210, shape2, selectableChipColors2, selectableChipElevation2, borderStroke2, 0.0f, PaddingKt.PaddingValues-a9UjIt4$default((composableLambda0 != null || function24 == null ? 4.0f : 8.0f), 0.0f, (function210 == null ? 4.0f : 8.0f), 0.0f, 10, null), mutableInteractionSource2, composer1, v7 & 14 | v7 >> 6 & 0x70 | v7 << 3 & 0x380 | v7 >> 3 & 0x1C00 | v7 << 6 & 0xE000 | 0x380000 & v7 << 3 | 0xE000000 & v7 << 3 | v7 << 3 & 0x70000000, v7 >> 27 & 14 | 0xC00 | v6 << 3 & 0x70 | v6 << 3 & 0x380 | v6 << 9 & 0x70000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function28 = function210;
            selectableChipElevation1 = selectableChipElevation2;
            borderStroke1 = borderStroke2;
            mutableInteractionSource1 = mutableInteractionSource2;
            function27 = function25;
            modifier1 = modifier2;
            shape1 = shape2;
            selectableChipColors1 = selectableChipColors2;
            function29 = function24;
            z2 = z3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            shape1 = shape0;
            selectableChipColors1 = selectableChipColors0;
            borderStroke1 = borderStroke0;
            mutableInteractionSource1 = mutableInteractionSource0;
            function27 = function25;
            function28 = function26;
            selectableChipElevation1 = selectableChipElevation0;
            function29 = function24;
            z2 = z1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a4(z, function00, function20, modifier1, z2, function29, function27, function28, shape1, selectableChipColors1, selectableChipElevation1, borderStroke1, mutableInteractionSource1, v, v1, v2));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SuggestionChip(@NotNull Function0 function00, @NotNull Function2 function20, @Nullable Modifier modifier0, boolean z, @Nullable Function2 function21, @Nullable Shape shape0, @Nullable ChipColors chipColors0, @Nullable ChipElevation chipElevation0, @Nullable BorderStroke borderStroke0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v, int v1) {
        BorderStroke borderStroke1;
        ChipElevation chipElevation1;
        ChipColors chipColors2;
        Shape shape2;
        Function2 function23;
        boolean z2;
        Modifier modifier1;
        int v6;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        ChipElevation chipElevation2;
        BorderStroke borderStroke3;
        ChipElevation chipElevation3;
        ChipColors chipColors3;
        int v7;
        Shape shape3;
        MutableInteractionSource mutableInteractionSource1;
        int v5;
        int v4;
        ChipColors chipColors1;
        int v3;
        Shape shape1;
        Function2 function22;
        boolean z1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x9AAA0FF1);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z1 = z;
        }
        else if((v & 0xC00) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            function22 = function21;
        }
        else if((v & 0x6000) == 0) {
            function22 = function21;
            v2 |= (composer1.changedInstance(function22) ? 0x4000 : 0x2000);
        }
        else {
            function22 = function21;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                shape1 = shape0;
                v3 = composer1.changed(shape1) ? 0x20000 : 0x10000;
            }
            else {
                shape1 = shape0;
                v3 = 0x10000;
            }
            v2 |= v3;
        }
        else {
            shape1 = shape0;
        }
        if((0x180000 & v) == 0) {
            if((v1 & 0x40) == 0) {
                chipColors1 = chipColors0;
                v4 = composer1.changed(chipColors1) ? 0x100000 : 0x80000;
            }
            else {
                chipColors1 = chipColors0;
                v4 = 0x80000;
            }
            v2 |= v4;
        }
        else {
            chipColors1 = chipColors0;
        }
        if((v & 0xC00000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.changed(chipElevation0) ? 0x400000 : 0x800000);
        }
        if((v & 0x6000000) == 0) {
            v2 |= ((v1 & 0x100) != 0 || !composer1.changed(borderStroke0) ? 0x2000000 : 0x4000000);
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
            v5 = v1 & 0x200;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        else if((v & 0x30000000) == 0) {
            v5 = v1 & 0x200;
            mutableInteractionSource1 = mutableInteractionSource0;
            v2 |= (composer1.changed(mutableInteractionSource1) ? 0x20000000 : 0x10000000);
        }
        else {
            v5 = v1 & 0x200;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        if((v2 & 306783379) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier2 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
                boolean z3 = (v1 & 8) == 0 ? z1 : true;
                if((v1 & 0x20) == 0) {
                    shape3 = shape1;
                }
                else {
                    v2 &= 0xFFF8FFFF;
                    shape3 = SuggestionChipDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v1 & 0x40) == 0) {
                    v7 = v2;
                    chipColors3 = chipColors1;
                }
                else {
                    v7 = v2 & 0xFFC7FFFF;
                    chipColors3 = SuggestionChipDefaults.INSTANCE.suggestionChipColors(composer1, 6);
                }
                if((v1 & 0x80) == 0) {
                    modifier0 = modifier2;
                    chipElevation3 = chipElevation0;
                }
                else {
                    modifier0 = modifier2;
                    v7 &= 0xFE3FFFFF;
                    chipElevation3 = SuggestionChipDefaults.INSTANCE.suggestionChipElevation-aqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x180000, 0x3F);
                }
                if((v1 & 0x100) == 0) {
                    borderStroke3 = borderStroke0;
                }
                else {
                    borderStroke3 = SuggestionChipDefaults.INSTANCE.suggestionChipBorder-h1eT-Ww(z3, 0L, 0L, 0.0f, composer1, v7 >> 9 & 14 | 0x6000, 14);
                    v7 &= 0xF1FFFFFF;
                }
                if(v5 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                    borderStroke2 = borderStroke3;
                    chipElevation2 = chipElevation3;
                    shape1 = shape3;
                    z1 = z3;
                }
                else {
                    borderStroke2 = borderStroke3;
                    chipElevation2 = chipElevation3;
                    shape1 = shape3;
                    z1 = z3;
                    mutableInteractionSource2 = null;
                }
                function22 = (v1 & 16) == 0 ? function22 : null;
                chipColors1 = chipColors3;
                v6 = v7;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                if((v1 & 0x100) != 0) {
                    v2 &= 0xF1FFFFFF;
                }
                chipElevation2 = chipElevation0;
                borderStroke2 = borderStroke0;
                mutableInteractionSource2 = mutableInteractionSource0;
                v6 = v2;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9AAA0FF1, v6, -1, "androidx.compose.material3.SuggestionChip (Chip.kt:746)");
            }
            ChipKt.a(modifier0, function00, z1, function20, TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), composer1, 6), chipColors1.labelColor-vNxB06k$material3_release(z1), function22, null, shape1, chipColors1, chipElevation2, borderStroke2, 0.0f, ChipKt.d, mutableInteractionSource2, composer1, v6 >> 6 & 14 | 0xC00000 | v6 << 3 & 0x70 | v6 >> 3 & 0x380 | v6 << 6 & 0x1C00 | v6 << 6 & 0x380000 | 0xE000000 & v6 << 9 | v6 << 9 & 0x70000000, v6 >> 21 & 0x70 | (v6 >> 21 & 14 | 0xD80) | v6 >> 15 & 0xE000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource1 = mutableInteractionSource2;
            z2 = z1;
            function23 = function22;
            shape2 = shape1;
            chipColors2 = chipColors1;
            chipElevation1 = chipElevation2;
            borderStroke1 = borderStroke2;
            modifier1 = modifier0;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z1;
            function23 = function22;
            shape2 = shape1;
            chipColors2 = chipColors1;
            chipElevation1 = chipElevation0;
            borderStroke1 = borderStroke0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w3(function00, function20, modifier1, z2, function23, shape2, chipColors2, chipElevation1, borderStroke1, mutableInteractionSource1, v, v1, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with SuggestionChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "SuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource", imports = {}))
    public static final void SuggestionChip(Function0 function00, Function2 function20, Modifier modifier0, boolean z, Function2 function21, Shape shape0, ChipColors chipColors0, ChipElevation chipElevation0, ChipBorder chipBorder0, MutableInteractionSource mutableInteractionSource0, Composer composer0, int v, int v1) {
        ChipBorder chipBorder1;
        ChipElevation chipElevation1;
        MutableInteractionSource mutableInteractionSource1;
        Shape shape2;
        Modifier modifier1;
        ChipBorder chipBorder2;
        ChipElevation chipElevation2;
        MutableInteractionSource mutableInteractionSource2;
        int v6;
        Modifier modifier2;
        ChipColors chipColors2;
        int v7;
        Shape shape3;
        int v5;
        int v4;
        ChipColors chipColors1;
        int v3;
        Shape shape1;
        Function2 function22;
        boolean z1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(170629701);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z1 = z;
        }
        else if((v & 0xC00) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            function22 = function21;
        }
        else if((v & 0x6000) == 0) {
            function22 = function21;
            v2 |= (composer1.changedInstance(function22) ? 0x4000 : 0x2000);
        }
        else {
            function22 = function21;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                shape1 = shape0;
                v3 = composer1.changed(shape1) ? 0x20000 : 0x10000;
            }
            else {
                shape1 = shape0;
                v3 = 0x10000;
            }
            v2 |= v3;
        }
        else {
            shape1 = shape0;
        }
        if((0x180000 & v) == 0) {
            if((v1 & 0x40) == 0) {
                chipColors1 = chipColors0;
                v4 = composer1.changed(chipColors1) ? 0x100000 : 0x80000;
            }
            else {
                chipColors1 = chipColors0;
                v4 = 0x80000;
            }
            v2 |= v4;
        }
        else {
            chipColors1 = chipColors0;
        }
        if((v & 0xC00000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.changed(chipElevation0) ? 0x400000 : 0x800000);
        }
        if((v & 0x6000000) == 0) {
            v2 |= ((v1 & 0x100) != 0 || !composer1.changed(chipBorder0) ? 0x2000000 : 0x4000000);
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
            v5 = v1 & 0x200;
        }
        else if((v & 0x30000000) == 0) {
            v5 = v1 & 0x200;
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x20000000 : 0x10000000);
        }
        else {
            v5 = v1 & 0x200;
        }
        if((v2 & 306783379) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 0x20) == 0) {
                    shape3 = shape1;
                }
                else {
                    v2 &= 0xFFF8FFFF;
                    shape3 = SuggestionChipDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v1 & 0x40) == 0) {
                    v7 = v2;
                    chipColors2 = chipColors1;
                }
                else {
                    v7 = v2 & 0xFFC7FFFF;
                    chipColors2 = SuggestionChipDefaults.INSTANCE.suggestionChipColors(composer1, 6);
                }
                if((v1 & 0x80) == 0) {
                    chipElevation2 = chipElevation0;
                }
                else {
                    v7 &= 0xFE3FFFFF;
                    chipElevation2 = SuggestionChipDefaults.INSTANCE.suggestionChipElevation-aqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, 0x180000, 0x3F);
                }
                if((v1 & 0x100) == 0) {
                    chipBorder2 = chipBorder0;
                }
                else {
                    chipBorder2 = SuggestionChipDefaults.INSTANCE.suggestionChipBorder-d_3_b6Q(0L, 0L, 0.0f, composer1, 0xC00, 7);
                    v7 &= 0xF1FFFFFF;
                }
                if(v5 == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                }
                else {
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    mutableInteractionSource2 = mutableInteractionSource3;
                }
                chipColors1 = chipColors2;
                shape1 = shape3;
                z1 = (v1 & 8) == 0 ? z1 : true;
                function22 = (v1 & 16) == 0 ? function22 : null;
                v6 = v7;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                if((v1 & 0x100) != 0) {
                    v2 &= 0xF1FFFFFF;
                }
                modifier2 = modifier0;
                v6 = v2;
                mutableInteractionSource2 = mutableInteractionSource0;
                chipElevation2 = chipElevation0;
                chipBorder2 = chipBorder0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(170629701, v6, -1, "androidx.compose.material3.SuggestionChip (Chip.kt:830)");
            }
            TextStyle textStyle0 = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), composer1, 6);
            long v8 = chipColors1.labelColor-vNxB06k$material3_release(z1);
            composer1.startReplaceGroup(1248043208);
            State state0 = chipBorder2 == null ? null : chipBorder2.borderStroke$material3_release(z1, composer1, v6 >> 9 & 14 | v6 >> 21 & 0x70);
            composer1.endReplaceGroup();
            ChipKt.a(modifier2, function00, z1, function20, textStyle0, v8, function22, null, shape1, chipColors1, chipElevation2, (state0 == null ? null : ((BorderStroke)state0.getValue())), 0.0f, ChipKt.d, mutableInteractionSource2, composer1, v6 >> 6 & 14 | 0xC00000 | v6 << 3 & 0x70 | v6 >> 3 & 0x380 | v6 << 6 & 0x1C00 | v6 << 6 & 0x380000 | 0xE000000 & v6 << 9 | v6 << 9 & 0x70000000, v6 >> 21 & 14 | 0xD80 | v6 >> 15 & 0xE000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            mutableInteractionSource1 = mutableInteractionSource2;
            shape2 = shape1;
            chipElevation1 = chipElevation2;
            chipBorder1 = chipBorder2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            shape2 = shape1;
            mutableInteractionSource1 = mutableInteractionSource0;
            chipElevation1 = chipElevation0;
            chipBorder1 = chipBorder0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x3(function00, function20, modifier1, z1, function22, shape2, chipColors1, chipElevation1, chipBorder1, mutableInteractionSource1, v, v1, 1));
        }
    }

    public static final void a(Modifier modifier0, Function0 function00, boolean z, Function2 function20, TextStyle textStyle0, long v, Function2 function21, Function2 function22, Shape shape0, ChipColors chipColors0, ChipElevation chipElevation0, BorderStroke borderStroke0, float f, PaddingValues paddingValues0, MutableInteractionSource mutableInteractionSource0, Composer composer0, int v1, int v2) {
        MutableInteractionSource mutableInteractionSource2;
        int v10;
        Composer composer1 = composer0.startRestartGroup(1400504719);
        int v3 = 4;
        int v4 = (v1 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        int v5 = 16;
        if((v1 & 0x30) == 0) {
            v4 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        int v6 = 0x80;
        if((v1 & 0x180) == 0) {
            v4 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        int v7 = 0x400;
        if((v1 & 0xC00) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        int v8 = 0x2000;
        if((v1 & 0x6000) == 0) {
            v4 |= (composer1.changed(textStyle0) ? 0x4000 : 0x2000);
        }
        int v9 = (v1 & 0x30000) == 0 ? v4 | (composer1.changed(v) ? 0x20000 : 0x10000) : v4;
        if((v1 & 0x180000) == 0) {
            v9 |= (composer1.changedInstance(function21) ? 0x100000 : 0x80000);
        }
        if((v1 & 0xC00000) == 0) {
            v9 |= (composer1.changedInstance(function22) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x6000000) == 0) {
            v9 |= (composer1.changed(shape0) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x30000000) == 0) {
            v9 |= (composer1.changed(chipColors0) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 6) == 0) {
            if(!composer1.changed(chipElevation0)) {
                v3 = 2;
            }
            v10 = v3 | v2;
        }
        else {
            v10 = v2;
        }
        if((v2 & 0x30) == 0) {
            if(composer1.changed(borderStroke0)) {
                v5 = 0x20;
            }
            v10 |= v5;
        }
        if((v2 & 0x180) == 0) {
            if(composer1.changed(f)) {
                v6 = 0x100;
            }
            v10 |= v6;
        }
        if((v2 & 0xC00) == 0) {
            if(composer1.changed(paddingValues0)) {
                v7 = 0x800;
            }
            v10 |= v7;
        }
        if((v2 & 0x6000) == 0) {
            if(composer1.changed(mutableInteractionSource0)) {
                v8 = 0x4000;
            }
            v10 |= v8;
        }
        if((306783379 & v9) != 306783378 || (v10 & 9363) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1400504719, v9, v10, "androidx.compose.material3.Chip (Chip.kt:1963)");
            }
            composer1.startReplaceGroup(0x765A148B);
            if(mutableInteractionSource0 == null) {
                MutableInteractionSource mutableInteractionSource1 = composer1.rememberedValue();
                if(mutableInteractionSource1 == Composer.Companion.getEmpty()) {
                    mutableInteractionSource1 = InteractionSourceKt.MutableInteractionSource();
                    composer1.updateRememberedValue(mutableInteractionSource1);
                }
                mutableInteractionSource2 = mutableInteractionSource1;
            }
            else {
                mutableInteractionSource2 = mutableInteractionSource0;
            }
            composer1.endReplaceGroup();
            State state0 = null;
            Modifier modifier1 = SemanticsModifierKt.semantics$default(modifier0, false, o3.w, 1, null);
            long v11 = chipColors0.containerColor-vNxB06k$material3_release(z);
            composer1.startReplaceGroup(1985624506);
            if(chipElevation0 != null) {
                state0 = chipElevation0.shadowElevation$material3_release(z, mutableInteractionSource2, composer1, v9 >> 6 & 14 | v10 << 6 & 0x380);
            }
            composer1.endReplaceGroup();
            SurfaceKt.Surface-o_FOJdg(function00, modifier1, z, shape0, v11, 0L, 0.0f, (state0 == null ? 0.0f : ((Dp)state0.getValue()).unbox-impl()), borderStroke0, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(0x89A09D64, true, new p3(function20, textStyle0, v, function21, function22, chipColors0, z, f, paddingValues0), composer1, 54), composer1, v9 >> 15 & 0x1C00 | (v9 >> 3 & 14 | v9 & 0x380) | v10 << 21 & 0xE000000, 6, 0x60);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q3(modifier0, function00, z, function20, textStyle0, v, function21, function22, shape0, chipColors0, chipElevation0, borderStroke0, f, paddingValues0, mutableInteractionSource0, v1, v2));
        }
    }

    public static final void access$ChipContent-fe0OD_I(Function2 function20, TextStyle textStyle0, long v, Function2 function21, Function2 function22, Function2 function23, long v1, long v2, float f, PaddingValues paddingValues0, Composer composer0, int v3) {
        Composer composer1 = composer0.startRestartGroup(0xD15639EC);
        int v4 = (v3 & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v3 : v3;
        if((v3 & 0x30) == 0) {
            v4 |= (composer1.changed(textStyle0) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
            v4 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v3 & 0xC00) == 0) {
            v4 |= (composer1.changedInstance(function21) ? 0x800 : 0x400);
        }
        if((v3 & 0x6000) == 0) {
            v4 |= (composer1.changedInstance(function22) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v3) == 0) {
            v4 |= (composer1.changedInstance(function23) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v3) == 0) {
            v4 |= (composer1.changed(v1) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v3) == 0) {
            v4 |= (composer1.changed(v2) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v3) == 0) {
            v4 |= (composer1.changed(f) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x30000000) == 0) {
            v4 |= (composer1.changed(paddingValues0) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 306783379) != 306783378 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD15639EC, v4, -1, "androidx.compose.material3.ChipContent (Chip.kt:2051)");
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.box-impl(v)), TextKt.getLocalTextStyle().provides(textStyle0)}, ComposableLambdaKt.rememberComposableLambda(0x683C8EAC, true, new t3(f, paddingValues0, function22, function21, function23, v1, function20, v2), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u3(function20, textStyle0, v, function21, function22, function23, v1, v2, f, paddingValues0, v3));
        }
    }

    public static final float access$getHorizontalElementsPadding$p() [...] // 潜在的解密器

    public static final void b(boolean z, Modifier modifier0, Function0 function00, boolean z1, Function2 function20, TextStyle textStyle0, Function2 function21, Function2 function22, Function2 function23, Shape shape0, SelectableChipColors selectableChipColors0, SelectableChipElevation selectableChipElevation0, BorderStroke borderStroke0, float f, PaddingValues paddingValues0, MutableInteractionSource mutableInteractionSource0, Composer composer0, int v, int v1) {
        MutableInteractionSource mutableInteractionSource2;
        int v9;
        Composer composer1 = composer0.startRestartGroup(402951308);
        int v2 = 4;
        int v3 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        int v4 = 16;
        if((v & 0x30) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        int v5 = 0x80;
        if((v & 0x180) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        int v6 = 0x400;
        if((v & 0xC00) == 0) {
            v3 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        int v7 = 0x2000;
        if((v & 0x6000) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x4000 : 0x2000);
        }
        int v8 = 0x10000;
        if((v & 0x30000) == 0) {
            v3 |= (composer1.changed(textStyle0) ? 0x20000 : 0x10000);
        }
        if((v & 0x180000) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x100000 : 0x80000);
        }
        if((v & 0xC00000) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x800000 : 0x400000);
        }
        if((v & 0x6000000) == 0) {
            v3 |= (composer1.changedInstance(function23) ? 0x4000000 : 0x2000000);
        }
        if((v & 0x30000000) == 0) {
            v3 |= (composer1.changed(shape0) ? 0x20000000 : 0x10000000);
        }
        if((v1 & 6) == 0) {
            if(!composer1.changed(selectableChipColors0)) {
                v2 = 2;
            }
            v9 = v2 | v1;
        }
        else {
            v9 = v1;
        }
        if((v1 & 0x30) == 0) {
            if(composer1.changed(selectableChipElevation0)) {
                v4 = 0x20;
            }
            v9 |= v4;
        }
        if((v1 & 0x180) == 0) {
            if(composer1.changed(borderStroke0)) {
                v5 = 0x100;
            }
            v9 |= v5;
        }
        if((v1 & 0xC00) == 0) {
            if(composer1.changed(f)) {
                v6 = 0x800;
            }
            v9 |= v6;
        }
        if((v1 & 0x6000) == 0) {
            if(composer1.changed(paddingValues0)) {
                v7 = 0x4000;
            }
            v9 |= v7;
        }
        if((v1 & 0x30000) == 0) {
            if(composer1.changed(mutableInteractionSource0)) {
                v8 = 0x20000;
            }
            v9 |= v8;
        }
        if((v3 & 306783379) != 306783378 || (74899 & v9) != 74898 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402951308, v3, v9, "androidx.compose.material3.SelectableChip (Chip.kt:2009)");
            }
            composer1.startReplaceGroup(2072749057);
            if(mutableInteractionSource0 == null) {
                MutableInteractionSource mutableInteractionSource1 = composer1.rememberedValue();
                if(mutableInteractionSource1 == Composer.Companion.getEmpty()) {
                    mutableInteractionSource1 = InteractionSourceKt.MutableInteractionSource();
                    composer1.updateRememberedValue(mutableInteractionSource1);
                }
                mutableInteractionSource2 = mutableInteractionSource1;
            }
            else {
                mutableInteractionSource2 = mutableInteractionSource0;
            }
            composer1.endReplaceGroup();
            State state0 = null;
            Modifier modifier1 = SemanticsModifierKt.semantics$default(modifier0, false, b4.w, 1, null);
            long v10 = selectableChipColors0.containerColor-WaAFU9c$material3_release(z1, z);
            composer1.startReplaceGroup(0x7B8BD810);
            if(selectableChipElevation0 != null) {
                state0 = selectableChipElevation0.shadowElevation$material3_release(z1, mutableInteractionSource2, composer1, v3 >> 9 & 14 | v9 << 3 & 0x380);
            }
            composer1.endReplaceGroup();
            SurfaceKt.Surface-d85dljk(z, function00, modifier1, z1, shape0, v10, 0L, 0.0f, (state0 == null ? 0.0f : ((Dp)state0.getValue()).unbox-impl()), borderStroke0, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(0xDD924C22, true, new c4(selectableChipColors0, z1, z, function20, textStyle0, function21, function22, function23, f, paddingValues0), composer1, 54), composer1, v3 & 14 | v3 >> 3 & 0x70 | v3 & 0x1C00 | v3 >> 15 & 0xE000 | v9 << 21 & 0x70000000, 0x30, 0xC0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d4(z, modifier0, function00, z1, function20, textStyle0, function21, function22, function23, shape0, selectableChipColors0, selectableChipElevation0, borderStroke0, f, paddingValues0, mutableInteractionSource0, v, v1));
        }
    }

    // 去混淆评级： 低(24)
    @NotNull
    public static final ChipColors getDefaultSuggestionChipColors(@NotNull ColorScheme colorScheme0) {
        ChipColors chipColors0 = colorScheme0.getDefaultSuggestionChipColorsCached$material3_release();
        if(chipColors0 == null) {
            chipColors0 = new ChipColors(0L, ColorSchemeKt.fromToken(colorScheme0, SuggestionChipTokens.INSTANCE.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme0, SuggestionChipTokens.INSTANCE.getLeadingIconColor()), 0L, 0L, Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, SuggestionChipTokens.INSTANCE.getDisabledLeadingIconColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null);
            colorScheme0.setDefaultSuggestionChipColorsCached$material3_release(chipColors0);
        }
        return chipColors0;
    }
}

