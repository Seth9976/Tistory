package androidx.compose.material3;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.q;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.g;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.c;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A8\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\t\u0010\n\u001A+\u0010\f\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\f\u0010\r\u001A-\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u0012\u001A\u00020\u0011H\u0007\u00A2\u0006\u0004\b\u0013\u0010\u0014\u001A\'\u0010\u0015\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000E2\u0006\u0010\u0012\u001A\u00020\u0011H\u0007\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001A3\u0010\u0019\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00172\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0018\u001A\u00020\u0011H\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001A\u001A3\u0010\u001B\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00172\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0018\u001A\u00020\u0011H\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001A\u001A\'\u0010\u001C\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00172\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0018\u001A\u00020\u0011H\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001D\u001A*\u0010$\u001A\u00020!2\u0006\u0010\u001F\u001A\u00020\u001E2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010 \u001A\u00020\u000EH\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010#\"\u0018\u0010\'\u001A\u00020\u000E*\u00020\u00008@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b%\u0010&\"\u0018\u0010+\u001A\u00020(*\u00020\u00178@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00064\u00B2\u0006\f\u0010,\u001A\u00020\u00118\nX\u008A\u0084\u0002\u00B2\u0006\u000E\u0010.\u001A\u00020-8\n@\nX\u008A\u008E\u0002\u00B2\u0006\u000E\u0010/\u001A\u00020-8\n@\nX\u008A\u008E\u0002\u00B2\u0006\u000E\u00101\u001A\u0002008\n@\nX\u008A\u008E\u0002\u00B2\u0006\u000E\u00103\u001A\u0002028\n@\nX\u008A\u008E\u0002"}, d2 = {"Landroidx/compose/material3/TimePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/TimePickerColors;", "colors", "Landroidx/compose/material3/TimePickerLayoutType;", "layoutType", "", "TimePicker-mT9BvqQ", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ILandroidx/compose/runtime/Composer;II)V", "TimePicker", "TimeInput", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "", "initialHour", "initialMinute", "", "is24Hour", "rememberTimePickerState", "(IIZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TimePickerState;", "TimePickerState", "(IIZ)Landroidx/compose/material3/TimePickerState;", "Landroidx/compose/material3/AnalogTimePickerState;", "autoSwitchToMinute", "VerticalTimePicker", "(Landroidx/compose/material3/AnalogTimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V", "HorizontalTimePicker", "ClockFace", "(Landroidx/compose/material3/AnalogTimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material3/TimePickerSelectionMode;", "selection", "number", "", "numberContentDescription-dSwYdS4", "(IZILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "numberContentDescription", "getHourForDisplay", "(Landroidx/compose/material3/TimePickerState;)I", "hourForDisplay", "Landroidx/compose/ui/unit/DpOffset;", "getSelectorPos", "(Landroidx/compose/material3/AnalogTimePickerState;)J", "selectorPos", "a11yServicesEnabled", "Landroidx/compose/ui/text/input/TextFieldValue;", "hourValue", "minuteValue", "Landroidx/compose/ui/geometry/Offset;", "center", "Landroidx/compose/ui/unit/IntOffset;", "parentCenter", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 15 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 16 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 17 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 18 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,2008:1\n1223#2,6:2009\n1223#2,6:2015\n1223#2,6:2110\n1223#2,6:2116\n1223#2,6:2364\n1223#2,6:2370\n1223#2,6:2377\n1223#2,6:2411\n1223#2,6:2417\n1223#2,6:2426\n1223#2,6:2475\n1223#2,6:2481\n1223#2,6:2489\n1223#2,6:2495\n1223#2,3:2506\n1226#2,3:2512\n1223#2,6:2516\n1223#2,6:2522\n1223#2,6:2563\n1223#2,6:2573\n1223#2,6:2579\n1223#2,6:2659\n1223#2,6:2676\n1223#2,6:2682\n71#3:2021\n56#3:2022\n50#3:2023\n83#3:2024\n71#3:2025\n50#3:2026\n83#3:2027\n71#3:2028\n50#3:2029\n85#4:2030\n82#4,6:2031\n88#4:2065\n92#4:2069\n85#4:2202\n81#4,7:2203\n88#4:2238\n92#4:2282\n85#4:2585\n82#4,6:2586\n88#4:2620\n92#4:2675\n78#5,6:2037\n85#5,4:2052\n89#5,2:2062\n93#5:2068\n78#5,6:2077\n85#5,4:2092\n89#5,2:2102\n93#5:2108\n78#5,6:2129\n85#5,4:2144\n89#5,2:2154\n78#5,6:2165\n85#5,4:2180\n89#5,2:2190\n93#5:2196\n93#5:2200\n78#5,6:2210\n85#5,4:2225\n89#5,2:2235\n78#5,6:2246\n85#5,4:2261\n89#5,2:2271\n93#5:2277\n93#5:2281\n78#5,6:2291\n85#5,4:2306\n89#5,2:2316\n78#5,6:2327\n85#5,4:2342\n89#5,2:2352\n93#5:2358\n93#5:2362\n78#5,6:2383\n85#5,4:2398\n89#5,2:2408\n93#5:2425\n78#5,6:2440\n85#5,4:2455\n89#5,2:2465\n93#5:2471\n78#5,6:2534\n85#5,4:2549\n89#5,2:2559\n93#5:2571\n78#5,6:2592\n85#5,4:2607\n89#5,2:2617\n78#5,6:2630\n85#5,4:2645\n89#5,2:2655\n93#5:2668\n93#5:2674\n78#5,6:2688\n85#5,4:2703\n89#5,2:2713\n93#5:2718\n368#6,9:2043\n377#6:2064\n378#6,2:2066\n368#6,9:2083\n377#6:2104\n378#6,2:2106\n368#6,9:2135\n377#6:2156\n368#6,9:2171\n377#6:2192\n378#6,2:2194\n378#6,2:2198\n368#6,9:2216\n377#6:2237\n368#6,9:2252\n377#6:2273\n378#6,2:2275\n378#6,2:2279\n368#6,9:2297\n377#6:2318\n368#6,9:2333\n377#6:2354\n378#6,2:2356\n378#6,2:2360\n368#6,9:2389\n377#6:2410\n378#6,2:2423\n368#6,9:2446\n377#6:2467\n378#6,2:2469\n368#6,9:2540\n377#6:2561\n378#6,2:2569\n368#6,9:2598\n377#6:2619\n368#6,9:2636\n377#6:2657\n378#6,2:2666\n378#6,2:2672\n368#6,9:2694\n377#6,3:2715\n4032#7,6:2056\n4032#7,6:2096\n4032#7,6:2148\n4032#7,6:2184\n4032#7,6:2229\n4032#7,6:2265\n4032#7,6:2310\n4032#7,6:2346\n4032#7,6:2402\n4032#7,6:2459\n4032#7,6:2553\n4032#7,6:2611\n4032#7,6:2649\n4032#7,6:2707\n98#8:2070\n95#8,6:2071\n101#8:2105\n105#8:2109\n98#8:2122\n95#8,6:2123\n101#8:2157\n105#8:2201\n98#8:2283\n94#8,7:2284\n101#8:2319\n105#8:2363\n71#9:2158\n68#9,6:2159\n74#9:2193\n78#9:2197\n71#9:2239\n68#9,6:2240\n74#9:2274\n78#9:2278\n71#9:2320\n68#9,6:2321\n74#9:2355\n78#9:2359\n71#9:2434\n69#9,5:2435\n74#9:2468\n78#9:2472\n71#9:2528\n69#9,5:2529\n74#9:2562\n78#9:2572\n71#9:2623\n68#9,6:2624\n74#9:2658\n78#9:2669\n201#10:2376\n207#10:2473\n204#10:2474\n228#10:2621\n225#10:2622\n219#10:2670\n222#10:2671\n213#10:2719\n216#10:2720\n210#10:2721\n148#11:2432\n148#11:2736\n148#11:2737\n148#11:2738\n148#11:2739\n148#11:2740\n148#11:2741\n148#11:2742\n148#11:2743\n148#11:2744\n148#11:2751\n77#12:2433\n77#12:2487\n77#12:2665\n1#13:2488\n488#14:2501\n487#14,4:2502\n491#14,2:2509\n495#14:2515\n487#15:2511\n135#16:2722\n81#17:2723\n81#17:2724\n107#17,2:2725\n81#17:2727\n107#17,2:2728\n81#17:2730\n107#17,2:2731\n81#17:2733\n107#17,2:2734\n253#18,6:2745\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n*L\n223#1:2009,6\n576#1:2015,6\n966#1:2110,6\n970#1:2116,6\n1161#1:2364,6\n1207#1:2370,6\n1264#1:2377,6\n1275#1:2411,6\n1289#1:2417,6\n1311#1:2426,6\n1364#1:2475,6\n1368#1:2481,6\n1642#1:2489,6\n1643#1:2495,6\n1644#1:2506,3\n1644#1:2512,3\n1666#1:2516,6\n1671#1:2522,6\n1689#1:2563,6\n1763#1:2573,6\n1764#1:2579,6\n1804#1:2659,6\n1858#1:2676,6\n1872#1:2682,6\n907#1:2021\n914#1:2022\n916#1:2023\n917#1:2024\n917#1:2025\n917#1:2026\n918#1:2027\n918#1:2028\n918#1:2029\n931#1:2030\n931#1:2031,6\n931#1:2065\n931#1:2069\n1088#1:2202\n1088#1:2203,7\n1088#1:2238\n1088#1:2282\n1772#1:2585\n1772#1:2586,6\n1772#1:2620\n1772#1:2675\n931#1:2037,6\n931#1:2052,4\n931#1:2062,2\n931#1:2068\n949#1:2077,6\n949#1:2092,4\n949#1:2102,2\n949#1:2108\n973#1:2129,6\n973#1:2144,4\n973#1:2154,2\n1074#1:2165,6\n1074#1:2180,4\n1074#1:2190,2\n1074#1:2196\n973#1:2200\n1088#1:2210,6\n1088#1:2225,4\n1088#1:2235,2\n1091#1:2246,6\n1091#1:2261,4\n1091#1:2271,2\n1091#1:2277\n1088#1:2281\n1108#1:2291,6\n1108#1:2306,4\n1108#1:2316,2\n1111#1:2327,6\n1111#1:2342,4\n1111#1:2352,2\n1111#1:2358\n1108#1:2362\n1261#1:2383,6\n1261#1:2398,4\n1261#1:2408,2\n1261#1:2425\n1336#1:2440,6\n1336#1:2455,4\n1336#1:2465,2\n1336#1:2471\n1660#1:2534,6\n1660#1:2549,4\n1660#1:2559,2\n1660#1:2571\n1772#1:2592,6\n1772#1:2607,4\n1772#1:2617,2\n1797#1:2630,6\n1797#1:2645,4\n1797#1:2655,2\n1797#1:2668\n1772#1:2674\n1872#1:2688,6\n1872#1:2703,4\n1872#1:2713,2\n1872#1:2718\n931#1:2043,9\n931#1:2064\n931#1:2066,2\n949#1:2083,9\n949#1:2104\n949#1:2106,2\n973#1:2135,9\n973#1:2156\n1074#1:2171,9\n1074#1:2192\n1074#1:2194,2\n973#1:2198,2\n1088#1:2216,9\n1088#1:2237\n1091#1:2252,9\n1091#1:2273\n1091#1:2275,2\n1088#1:2279,2\n1108#1:2297,9\n1108#1:2318\n1111#1:2333,9\n1111#1:2354\n1111#1:2356,2\n1108#1:2360,2\n1261#1:2389,9\n1261#1:2410\n1261#1:2423,2\n1336#1:2446,9\n1336#1:2467\n1336#1:2469,2\n1660#1:2540,9\n1660#1:2561\n1660#1:2569,2\n1772#1:2598,9\n1772#1:2619\n1797#1:2636,9\n1797#1:2657\n1797#1:2666,2\n1772#1:2672,2\n1872#1:2694,9\n1872#1:2715,3\n931#1:2056,6\n949#1:2096,6\n973#1:2148,6\n1074#1:2184,6\n1088#1:2229,6\n1091#1:2265,6\n1108#1:2310,6\n1111#1:2346,6\n1261#1:2402,6\n1336#1:2459,6\n1660#1:2553,6\n1772#1:2611,6\n1797#1:2649,6\n1872#1:2707,6\n949#1:2070\n949#1:2071,6\n949#1:2105\n949#1:2109\n973#1:2122\n973#1:2123,6\n973#1:2157\n973#1:2201\n1108#1:2283\n1108#1:2284,7\n1108#1:2319\n1108#1:2363\n1074#1:2158\n1074#1:2159,6\n1074#1:2193\n1074#1:2197\n1091#1:2239\n1091#1:2240,6\n1091#1:2274\n1091#1:2278\n1111#1:2320\n1111#1:2321,6\n1111#1:2355\n1111#1:2359\n1336#1:2434\n1336#1:2435,5\n1336#1:2468\n1336#1:2472\n1660#1:2528\n1660#1:2529,5\n1660#1:2562\n1660#1:2572\n1797#1:2623\n1797#1:2624,6\n1797#1:2658\n1797#1:2669\n1260#1:2376\n1354#1:2473\n1356#1:2474\n1791#1:2621\n1793#1:2622\n1848#1:2670\n1850#1:2671\n1918#1:2719\n1920#1:2720\n1922#1:2721\n1312#1:2432\n1954#1:2736\n1955#1:2737\n1956#1:2738\n1957#1:2739\n1958#1:2740\n1960#1:2741\n1961#1:2742\n1962#1:2743\n1963#1:2744\n1968#1:2751\n1327#1:2433\n1641#1:2487\n1808#1:2665\n1644#1:2501\n1644#1:2502,4\n1644#1:2509,2\n1644#1:2515\n1644#1:2511\n1979#1:2722\n222#1:2723\n966#1:2724\n966#1:2725,2\n970#1:2727\n970#1:2728,2\n1642#1:2730\n1642#1:2731,2\n1643#1:2733\n1643#1:2734,2\n1967#1:2745,6\n*E\n"})
public final class TimePickerKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float i;
    public static final IntList j;
    public static final IntList k;
    public static final MutableIntList l;
    public static final float m;

    static {
        TimePickerKt.a = 101.0f;
        TimePickerKt.b = 69.0f;
        TimePickerKt.c = 36.0f;
        TimePickerKt.d = 24.0f;
        TimePickerKt.e = 24.0f;
        TimePickerKt.f = 7.0f;
        TimePickerKt.g = 24.0f;
        TimePickerKt.h = 74.0f;
        TimePickerKt.i = 48.0f;
        TimePickerKt.j = IntListKt.intListOf(new int[]{0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55});
        IntList intList0 = IntListKt.intListOf(new int[]{12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        TimePickerKt.k = intList0;
        MutableIntList mutableIntList0 = new MutableIntList(intList0.getSize());
        int[] arr_v = intList0.content;
        int v1 = intList0._size;
        for(int v = 0; v < v1; ++v) {
            mutableIntList0.add(arr_v[v] % 12 + 12);
        }
        TimePickerKt.l = mutableIntList0;
        TimePickerKt.m = 12.0f;
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void ClockFace(@NotNull AnalogTimePickerState analogTimePickerState0, @NotNull TimePickerColors timePickerColors0, boolean z, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1170157036);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(analogTimePickerState0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(timePickerColors0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1170157036, v1, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1512)");
            }
            Modifier modifier0 = DrawModifierKt.drawWithContent(SizeKt.size-3ABfNKs(BackgroundKt.background-bw27NRU(Modifier.Companion, timePickerColors0.getClockDialColor-0d7_KjU(), RoundedCornerShapeKt.getCircleShape()).then(new ClockDialModifier(analogTimePickerState0, z, analogTimePickerState0.getSelection-yecRtBI(), null)), 0.0f), new sq(analogTimePickerState0, timePickerColors0));
            CrossfadeKt.Crossfade(analogTimePickerState0.getClockFaceValues(), modifier0, AnimationSpecKt.tween$default(200, 0, null, 6, null), null, ComposableLambdaKt.rememberComposableLambda(-1022006568, true, new rp(timePickerColors0, analogTimePickerState0, z), composer1, 54), composer1, 0x6180, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(analogTimePickerState0, timePickerColors0, z, v, 3));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void HorizontalTimePicker(@NotNull AnalogTimePickerState analogTimePickerState0, @Nullable Modifier modifier0, @Nullable TimePickerColors timePickerColors0, boolean z, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v3;
        TimePickerColors timePickerColors1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x555F4751);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(analogTimePickerState0) ? 4 : 2) | v : v;
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
        if((v & 0x180) == 0) {
            if((v1 & 4) == 0) {
                timePickerColors1 = timePickerColors0;
                v3 = composer1.changed(timePickerColors1) ? 0x100 : 0x80;
            }
            else {
                timePickerColors1 = timePickerColors0;
                v3 = 0x80;
            }
            v2 |= v3;
        }
        else {
            timePickerColors1 = timePickerColors0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 4) != 0) {
                    v2 &= -897;
                    timePickerColors1 = TimePickerDefaults.INSTANCE.colors(composer1, 6);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                modifier1 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x555F4751, v2, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:947)");
            }
            Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(modifier1, 0.0f, 0.0f, 0.0f, TimePickerKt.d, 7, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function20);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            int v5 = v2 & 14 | v2 >> 3 & 0x70;
            TimePickerKt.b(analogTimePickerState0, timePickerColors1, composer1, v5);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, TimePickerKt.c), composer1, 6);
            TimePickerKt.ClockFace(analogTimePickerState0, timePickerColors1, z, composer1, v5 | v2 >> 3 & 0x380);
            composer1.endNode();
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
            scopeUpdateScope0.updateScope(new yp(analogTimePickerState0, modifier1, timePickerColors1, z, v, v1, 0));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TimeInput(@NotNull TimePickerState timePickerState0, @Nullable Modifier modifier0, @Nullable TimePickerColors timePickerColors0, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(-760850373);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (((v & 8) == 0 ? composer1.changed(timePickerState0) : composer1.changedInstance(timePickerState0)) ? 4 : 2) | v : v;
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
        if((v & 0x180) == 0) {
            v2 |= ((v1 & 4) != 0 || !composer1.changed(timePickerColors0) ? 0x80 : 0x100);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 2) != 0) {
                    modifier0 = Modifier.Companion;
                }
                if((v1 & 4) != 0) {
                    timePickerColors0 = TimePickerDefaults.INSTANCE.colors(composer1, 6);
                    v2 &= -897;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-760850373, v2, -1, "androidx.compose.material3.TimeInput (TimePicker.kt:260)");
            }
            TimePickerKt.e(modifier0, timePickerColors0, timePickerState0, composer1, v2 >> 3 & 0x7E | v2 << 6 & 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(timePickerState0, modifier0, timePickerColors0, v, v1, 3));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TimePicker-mT9BvqQ(@NotNull TimePickerState timePickerState0, @Nullable Modifier modifier0, @Nullable TimePickerColors timePickerColors0, int v, @Nullable Composer composer0, int v1, int v2) {
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xDB16704C);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (((v1 & 8) == 0 ? composer1.changed(timePickerState0) : composer1.changedInstance(timePickerState0)) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v3 |= ((v2 & 4) != 0 || !composer1.changed(timePickerColors0) ? 0x80 : 0x100);
        }
        if((v1 & 0xC00) == 0) {
            v3 |= ((v2 & 8) != 0 || !composer1.changed(v) ? 0x400 : 0x800);
        }
        if((v3 & 0x493) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v2 & 2) != 0) {
                    modifier0 = Modifier.Companion;
                }
                if((v2 & 4) != 0) {
                    timePickerColors0 = TimePickerDefaults.INSTANCE.colors(composer1, 6);
                    v3 &= -897;
                }
                if((v2 & 8) != 0) {
                    v = TimePickerDefaults.INSTANCE.layoutType-sDNSZnc(composer1, 6);
                    v3 &= 0xFFFFE3FF;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 4) != 0) {
                    v3 &= -897;
                }
                if((v2 & 8) != 0) {
                    v3 &= 0xFFFFE3FF;
                }
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xDB16704C, v3, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:220)");
            }
            boolean z = false;
            State state0 = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(false, false, composer1, 0, 3);
            if((v3 & 14) == 4 || (v3 & 8) != 0 && composer1.changed(timePickerState0)) {
                z = true;
            }
            AnalogTimePickerState analogTimePickerState0 = composer1.rememberedValue();
            if(z || analogTimePickerState0 == Composer.Companion.getEmpty()) {
                analogTimePickerState0 = new AnalogTimePickerState(timePickerState0);
                composer1.updateRememberedValue(analogTimePickerState0);
            }
            if(TimePickerLayoutType.equals-impl0(v, 1)) {
                composer1.startReplaceGroup(0xEBE63222);
                TimePickerKt.VerticalTimePicker(analogTimePickerState0, modifier0, timePickerColors0, !((Boolean)state0.getValue()).booleanValue(), composer1, v3 & 0x3F0, 0);
            }
            else {
                composer1.startReplaceGroup(-337036960);
                TimePickerKt.HorizontalTimePicker(analogTimePickerState0, modifier0, timePickerColors0, !((Boolean)state0.getValue()).booleanValue(), composer1, v3 & 0x3F0, 0);
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new hq(timePickerState0, modifier0, timePickerColors0, v, v1, v2));
        }
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final TimePickerState TimePickerState(int v, int v1, boolean z) {
        return new vq(v, v1, z);
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void VerticalTimePicker(@NotNull AnalogTimePickerState analogTimePickerState0, @Nullable Modifier modifier0, @Nullable TimePickerColors timePickerColors0, boolean z, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x4A7B40BF);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(analogTimePickerState0) ? 4 : 2) | v : v;
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
        if((v & 0x180) == 0) {
            v2 |= ((v1 & 4) != 0 || !composer1.changed(timePickerColors0) ? 0x80 : 0x100);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 2) != 0) {
                    modifier0 = Modifier.Companion;
                }
                if((v1 & 4) != 0) {
                    timePickerColors0 = TimePickerDefaults.INSTANCE.colors(composer1, 6);
                    v2 &= -897;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4A7B40BF, v2, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:929)");
            }
            Modifier modifier1 = SemanticsModifierKt.semantics$default(modifier0, false, jq.y, 1, null);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            int v4 = v2 & 14 | v2 >> 3 & 0x70;
            TimePickerKt.h(analogTimePickerState0, timePickerColors0, composer1, v4);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, TimePickerKt.c), composer1, 6);
            TimePickerKt.ClockFace(analogTimePickerState0, timePickerColors0, z, composer1, v4 | v2 >> 3 & 0x380);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, TimePickerKt.d), composer1, 6);
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
            scopeUpdateScope0.updateScope(new yp(analogTimePickerState0, modifier0, timePickerColors0, z, v, v1, 1));
        }
    }

    public static final void a(TimePickerState timePickerState0, TimePickerColors timePickerColors0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xC84BBA8B);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? composer1.changed(timePickerState0) : composer1.changedInstance(timePickerState0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(timePickerColors0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC84BBA8B, v1, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:1126)");
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TypographyKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorLabelTextFont(), composer1, 6)), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(0xE3839F4B, true, new mp(timePickerState0, timePickerColors0), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new np(timePickerState0, timePickerColors0, v, 0));
        }
    }

    public static final void access$CircularLayout-uFdPcIQ(Modifier modifier0, float f, Function2 function20, Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x5C474950);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5C474950, v2, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1870)");
            }
            kp kp0 = composer1.rememberedValue();
            if((v2 & 0x70) == 0x20 || kp0 == Composer.Companion.getEmpty()) {
                kp0 = new kp(f);
                composer1.updateRememberedValue(kp0);
            }
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, kp0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function21);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(((v2 >> 6 & 14 | v2 << 3 & 0x70) << 6 & 0x380 | 6) >> 6 & 14)));
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
            scopeUpdateScope0.updateScope(new lp(modifier0, f, function20, v, v1));
        }
    }

    public static final void access$ClockText(Modifier modifier0, AnalogTimePickerState analogTimePickerState0, int v, boolean z, Composer composer0, int v1) {
        Alignment alignment1;
        String s2;
        Modifier modifier3;
        MutableState mutableState3;
        MutableState mutableState2;
        Composer composer1 = composer0.startRestartGroup(-206784607);
        int v2 = (v1 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer1.changedInstance(analogTimePickerState0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-206784607, v2, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1638)");
            }
            TextStyle textStyle0 = TypographyKt.getValue(TimePickerTokens.INSTANCE.getClockDialLabelTextFont(), composer1, 6);
            float f = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(TimePickerKt.h);
            MutableState mutableState0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(Offset.box-impl(0L), null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            MutableState mutableState1 = composer1.rememberedValue();
            if(mutableState1 == composer$Companion0.getEmpty()) {
                mutableState1 = SnapshotStateKt.mutableStateOf$default(IntOffset.box-impl(0L), null, 2, null);
                composer1.updateRememberedValue(mutableState1);
            }
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            String s = TimePickerKt.numberContentDescription-dSwYdS4(analogTimePickerState0.getSelection-yecRtBI(), analogTimePickerState0.is24hour(), v, composer1, v2 & 0x380);
            String s1 = CalendarLocale_jvmKt.toLocalString$default(v, 0, 0, false, 7, null);
            boolean z1 = TimePickerSelectionMode.equals-impl0(analogTimePickerState0.getSelection-yecRtBI(), 1) ? Intrinsics.areEqual(CalendarLocale_jvmKt.toLocalString$default(analogTimePickerState0.getMinute(), 0, 0, false, 7, null), s1) : Intrinsics.areEqual(CalendarLocale_jvmKt.toLocalString$default(analogTimePickerState0.getHour(), 0, 0, false, 7, null), s1);
            Alignment alignment0 = Alignment.Companion.getCenter();
            Modifier modifier1 = SizeKt.size-3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier0), TimePickerKt.i);
            sp sp0 = composer1.rememberedValue();
            if(sp0 == composer$Companion0.getEmpty()) {
                mutableState2 = mutableState1;
                mutableState3 = mutableState0;
                sp0 = new sp(mutableState2, mutableState3);
                composer1.updateRememberedValue(sp0);
            }
            else {
                mutableState2 = mutableState1;
                mutableState3 = mutableState0;
            }
            Modifier modifier2 = FocusableKt.focusable$default(OnGloballyPositionedModifierKt.onGloballyPositioned(modifier1, sp0), false, null, 3, null);
            boolean z2 = composer1.changedInstance(coroutineScope0);
            boolean z3 = composer1.changedInstance(analogTimePickerState0);
            boolean z4 = composer1.changed(f);
            boolean z5 = composer1.changed(z1);
            vp vp0 = composer1.rememberedValue();
            if((z2 | z3 | z4 | ((v2 & 0x1C00) == 0x800 ? 1 : 0) | z5) != 0 || vp0 == composer$Companion0.getEmpty()) {
                modifier3 = modifier2;
                alignment1 = alignment0;
                s2 = s1;
                vp vp1 = new vp(z1, coroutineScope0, analogTimePickerState0, f, z, mutableState3, mutableState2);
                composer1.updateRememberedValue(vp1);
                vp0 = vp1;
            }
            else {
                modifier3 = modifier2;
                s2 = s1;
                alignment1 = alignment0;
            }
            Modifier modifier4 = SemanticsModifierKt.semantics(modifier3, true, vp0);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment1, false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
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
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            boolean z6 = composer1.changed(s);
            m m0 = composer1.rememberedValue();
            if(z6 || m0 == composer$Companion0.getEmpty()) {
                m0 = new m(s, 7);
                composer1.updateRememberedValue(m0);
            }
            TextKt.Text--4IGK_g(s2, SemanticsModifierKt.clearAndSetSemantics(modifier$Companion0, m0), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, 0, 0, 0xFFFC);
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
            scopeUpdateScope0.updateScope(new o9(modifier0, analogTimePickerState0, v, z, v1));
        }
    }

    public static final long access$ClockText$lambda$29(MutableState mutableState0) {
        return ((Offset)mutableState0.getValue()).unbox-impl();
    }

    public static final void access$ClockText$lambda$30(MutableState mutableState0, long v) {
        mutableState0.setValue(Offset.box-impl(v));
    }

    public static final long access$ClockText$lambda$32(MutableState mutableState0) {
        return ((IntOffset)mutableState0.getValue()).unbox-impl();
    }

    public static final void access$ClockText$lambda$33(MutableState mutableState0, long v) {
        mutableState0.setValue(IntOffset.box-impl(v));
    }

    public static final void access$DisplaySeparator(Modifier modifier0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(2100674302);
        int v1 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100674302, v1, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1324)");
            }
            TextStyle textStyle0 = TextStyle.copy-p1EtxEg$default(((TextStyle)composer1.consume(TextKt.getLocalTextStyle())), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 3, 0, 0L, null, null, new LineHeightStyle(0.5f, 17, null), 0, 0, null, 0xEF7FFF, null);
            Modifier modifier1 = SemanticsModifierKt.clearAndSetSemantics(modifier0, a5.a0);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            TextKt.Text--4IGK_g(":", null, ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSeparatorColor(), composer1, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, 6, 0, 0xFFFA);
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
            scopeUpdateScope0.updateScope(new q(modifier0, v, 1));
        }
    }

    public static final void access$HorizontalPeriodToggle(Modifier modifier0, TimePickerState timePickerState0, TimePickerColors timePickerColors0, Composer composer0, int v) {
        TimePickerKt.c(modifier0, timePickerColors0, timePickerState0, composer0, v);
    }

    public static final void access$TimeInputImpl$lambda$10(MutableState mutableState0, TextFieldValue textFieldValue0) {
        mutableState0.setValue(textFieldValue0);
    }

    public static final TextFieldValue access$TimeInputImpl$lambda$6(MutableState mutableState0) {
        return (TextFieldValue)mutableState0.getValue();
    }

    public static final void access$TimeInputImpl$lambda$7(MutableState mutableState0, TextFieldValue textFieldValue0) {
        mutableState0.setValue(textFieldValue0);
    }

    public static final TextFieldValue access$TimeInputImpl$lambda$9(MutableState mutableState0) {
        return (TextFieldValue)mutableState0.getValue();
    }

    public static final void access$TimePickerTextField-1vLObsk(Modifier modifier0, TextFieldValue textFieldValue0, Function1 function10, TimePickerState timePickerState0, int v, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, TimePickerColors timePickerColors0, Composer composer0, int v1, int v2) {
        KeyboardActions keyboardActions1;
        KeyboardOptions keyboardOptions1;
        FocusRequester focusRequester2;
        int v9;
        boolean z1;
        TextFieldColors textFieldColors1;
        FocusRequester focusRequester1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x4D6FCE7E);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? v1 | (composer1.changed(modifier0) ? 4 : 2) : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((2 & v2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changed(textFieldValue0) ? 0x20 : 16);
        }
        int v4 = v3;
        if((4 & v2) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v4 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v4 |= (((v1 & 0x1000) == 0 ? composer1.changed(timePickerState0) : composer1.changedInstance(timePickerState0)) ? 0x800 : 0x400);
        }
        if((16 & v2) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            v4 |= (composer1.changed(v) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((0x30000 & v1) == 0) {
            v4 |= (composer1.changed(keyboardOptions0) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x180000) == 0) {
            v4 |= (composer1.changed(keyboardActions0) ? 0x100000 : 0x80000);
        }
        if((0x80 & v2) != 0) {
            v4 |= 0xC00000;
        }
        else if((v1 & 0xC00000) == 0) {
            v4 |= (composer1.changed(timePickerColors0) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v4) != 4793490 || !composer1.getSkipping()) {
            keyboardOptions1 = (v2 & 0x20) == 0 ? keyboardOptions0 : KeyboardOptions.Companion.getDefault();
            KeyboardActions keyboardActions2 = (v2 & 0x40) == 0 ? keyboardActions0 : KeyboardActions.Companion.getDefault();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4D6FCE7E, v4, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1761)");
            }
            MutableInteractionSource mutableInteractionSource0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(mutableInteractionSource0 == composer$Companion0.getEmpty()) {
                mutableInteractionSource0 = InteractionSourceKt.MutableInteractionSource();
                composer1.updateRememberedValue(mutableInteractionSource0);
            }
            FocusRequester focusRequester0 = composer1.rememberedValue();
            if(focusRequester0 == composer$Companion0.getEmpty()) {
                focusRequester0 = new FocusRequester();
                composer1.updateRememberedValue(focusRequester0);
            }
            long v5 = timePickerColors0.timeSelectorContainerColor-vNxB06k$material3_release(true);
            long v6 = timePickerColors0.timeSelectorContainerColor-vNxB06k$material3_release(true);
            long v7 = timePickerColors0.timeSelectorContentColor-vNxB06k$material3_release(true);
            TextFieldColors textFieldColors0 = OutlinedTextFieldDefaults.INSTANCE.colors-0hiis_0(v7, 0L, 0L, 0L, v5, v6, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer1, 0, 0, 0, 0, 0xC00, 0x7FFFFFCE, 0xFFF);
            boolean z = TimePickerSelectionMode.equals-impl0(v, timePickerState0.getSelection-yecRtBI());
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v8 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting()) {
                focusRequester1 = focusRequester0;
                a.t(v8, composer1, v8, function20);
            }
            else {
                focusRequester1 = focusRequester0;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v8)) {
                    a.t(v8, composer1, v8, function20);
                }
            }
            r0.a.z(composeUiNode$Companion0, composer1, modifier1, composer1, 2011386807);
            if(z) {
                textFieldColors1 = textFieldColors0;
                z1 = true;
                v9 = v4;
                focusRequester2 = focusRequester1;
            }
            else {
                textFieldColors1 = textFieldColors0;
                z1 = false;
                v9 = v4;
                focusRequester2 = focusRequester1;
                TimePickerKt.f(SizeKt.size-VpY3zN4(Modifier.Companion, 0.0f, 0.0f), (TimePickerSelectionMode.equals-impl0(v, 0) ? TimePickerKt.getHourForDisplay(timePickerState0) : timePickerState0.getMinute()), timePickerState0, v, timePickerColors0, composer1, v4 >> 3 & 0x1C00 | (v4 >> 3 & 0x380 | 6) | v4 >> 9 & 0xE000);
            }
            composer1.endReplaceGroup();
            String s = Strings_androidKt.getString-2EP1pXo((TimePickerSelectionMode.equals-impl0(v, 1) ? string.m3c_time_picker_minute_text_field : string.m3c_time_picker_hour_text_field), composer1, 0);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier2 = modifier$Companion0.then(new qr(z1, InspectableValueKt.getNoInspectorInfo()));
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v10 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v10)) {
                a.t(v10, composer1, v10, function21);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            Modifier modifier4 = FocusRequesterModifierKt.focusRequester(modifier$Companion0, focusRequester2);
            TimeInputTokens timeInputTokens0 = TimeInputTokens.INSTANCE;
            Modifier modifier5 = SizeKt.size-VpY3zN4(modifier4, 0.0f, 0.0f);
            boolean z2 = composer1.changed(s);
            m m0 = composer1.rememberedValue();
            if(z2 || m0 == composer$Companion0.getEmpty()) {
                m0 = new m(s, 9);
                composer1.updateRememberedValue(m0);
            }
            Modifier modifier6 = SemanticsModifierKt.semantics$default(modifier5, false, m0, 1, null);
            Object object0 = composer1.consume(TextKt.getLocalTextStyle());
            Pair[] arr_pair = {TuplesKt.to(0.0f, Color.box-impl(0L)), TuplesKt.to(0.1f, Color.box-impl(0L)), TuplesKt.to(0.1f, Color.box-impl(MaterialTheme.INSTANCE.getColorScheme(composer1, 6).getPrimary-0d7_KjU())), TuplesKt.to(0.9f, Color.box-impl(MaterialTheme.INSTANCE.getColorScheme(composer1, 6).getPrimary-0d7_KjU())), TuplesKt.to(0.9f, Color.box-impl(0L)), TuplesKt.to(1.0f, Color.box-impl(0L))};
            BasicTextFieldKt.BasicTextField(textFieldValue0, function10, modifier6, true, false, ((TextStyle)object0), keyboardOptions1, keyboardActions2, true, 0, 0, null, null, mutableInteractionSource0, androidx.compose.ui.graphics.Brush.Companion.verticalGradient-8A-3gB4$default(Brush.Companion, arr_pair, 0.0f, 0.0f, 0, 14, null), ComposableLambdaKt.rememberComposableLambda(825138052, true, new iq(textFieldValue0, mutableInteractionSource0, textFieldColors1), composer1, 54), composer1, v9 >> 3 & 0x70 | (v9 >> 3 & 14 | 0x6000C00) | 0x380000 & v9 << 3 | v9 << 3 & 0x1C00000, 0x30C00, 0x1E10);
            composer1.endNode();
            int v11 = 1;
            Modifier modifier7 = SemanticsModifierKt.clearAndSetSemantics(OffsetKt.offset-VpY3zN4$default(modifier$Companion0, 0.0f, TimePickerKt.f, 1, null), jq.x);
            TextKt.Text--4IGK_g(Strings_androidKt.getString-2EP1pXo((TimePickerSelectionMode.equals-impl0(v, 0) ? string.m3c_time_picker_hour : string.m3c_time_picker_minute), composer1, 0), modifier7, ColorSchemeKt.getValue(timeInputTokens0.getTimeFieldSupportingTextColor(), composer1, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypographyKt.getValue(timeInputTokens0.getTimeFieldSupportingTextFont(), composer1, 6), composer1, 0, 0, 0xFFF8);
            composer1.endNode();
            TimePickerSelectionMode timePickerSelectionMode0 = TimePickerSelectionMode.box-impl(timePickerState0.getSelection-yecRtBI());
            int v12 = (v9 & 0x1C00) == 0x800 || (v9 & 0x1000) != 0 && composer1.changedInstance(timePickerState0) ? 1 : 0;
            if((v9 & 0xE000) != 0x4000) {
                v11 = 0;
            }
            kq kq0 = composer1.rememberedValue();
            if((v11 | v12) != 0 || kq0 == composer$Companion0.getEmpty()) {
                kq0 = new kq(timePickerState0, v, focusRequester2, null);
                composer1.updateRememberedValue(kq0);
            }
            EffectsKt.LaunchedEffect(timePickerSelectionMode0, kq0, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            keyboardActions1 = keyboardActions2;
        }
        else {
            composer1.skipToGroupEnd();
            keyboardOptions1 = keyboardOptions0;
            keyboardActions1 = keyboardActions0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new lq(modifier0, textFieldValue0, function10, timePickerState0, v, keyboardOptions1, keyboardActions1, timePickerColors0, v1, v2));
        }
    }

    public static final void access$VerticalPeriodToggle(Modifier modifier0, TimePickerState timePickerState0, TimePickerColors timePickerColors0, Composer composer0, int v) {
        TimePickerKt.i(modifier0, timePickerColors0, timePickerState0, composer0, v);
    }

    public static final float access$atan(float f, float f1) {
        float f2 = ((float)Math.atan2(f, f1)) - 1.570796f;
        return f2 < 0.0f ? f2 + 6.283185f : f2;
    }

    public static final float access$getDisplaySeparatorWidth$p() [...] // 潜在的解密器

    public static final IntList access$getHours$p() {
        return TimePickerKt.k;
    }

    public static final float access$getInnerCircleRadius$p() [...] // 潜在的解密器

    public static final float access$getMaxDistance$p() [...] // 潜在的解密器

    public static final IntList access$getMinutes$p() {
        return TimePickerKt.j;
    }

    public static final float access$getOuterCircleSizeRadius$p() [...] // 潜在的解密器

    public static final void access$moveSelector-d3b8Pxo(TimePickerState timePickerState0, float f, float f1, float f2, long v) {
        TimePickerKt.j(timePickerState0, f, f1, f2, v);
    }

    public static final Object access$onTap-rOwcSBo(AnalogTimePickerState analogTimePickerState0, float f, float f1, float f2, boolean z, long v, Continuation continuation0) {
        AnalogTimePickerState analogTimePickerState1;
        boolean z1;
        float f5;
        float f4;
        tq tq0;
        if(continuation0 instanceof tq) {
            tq0 = (tq)continuation0;
            int v1 = tq0.r;
            if((v1 & 0x80000000) == 0) {
                tq0 = new tq(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                tq0.r = v1 ^ 0x80000000;
            }
        }
        else {
            tq0 = new tq(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = tq0.q;
        Unit unit0 = qd.a.getCOROUTINE_SUSPENDED();
        switch(tq0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                float f3 = ((float)Math.atan2(f1 - ((float)IntOffset.getY-impl(v)), f - ((float)IntOffset.getX-impl(v)))) - 1.570796f;
                f3 = f3 < 0.0f ? f3 + 6.283185f : ((float)Math.atan2(f1 - ((float)IntOffset.getY-impl(v)), f - ((float)IntOffset.getX-impl(v)))) - 1.570796f;
                if(TimePickerSelectionMode.equals-impl0(analogTimePickerState0.getSelection-yecRtBI(), 1)) {
                    f4 = 0.10472f;
                    f5 = ((float)Math.rint(f3 / 0.10472f / 5.0f)) * 5.0f;
                }
                else {
                    f4 = 0.523599f;
                    f5 = (float)Math.rint(f3 / 0.523599f);
                }
                TimePickerKt.j(analogTimePickerState0, f, f1, f2, v);
                tq0.o = analogTimePickerState0;
                z1 = z;
                tq0.p = z1;
                tq0.r = 1;
                if(analogTimePickerState0.rotateTo(f5 * f4, true, tq0) == unit0) {
                    return unit0;
                }
                analogTimePickerState1 = analogTimePickerState0;
                goto label_34;
            }
            case 1: {
                boolean z2 = tq0.p;
                analogTimePickerState1 = tq0.o;
                ResultKt.throwOnFailure(object0);
                z1 = z2;
            label_34:
                if(TimePickerSelectionMode.equals-impl0(analogTimePickerState1.getSelection-yecRtBI(), 0) && z1) {
                    tq0.o = analogTimePickerState1;
                    tq0.p = true;
                    tq0.r = 2;
                    if(DelayKt.delay(100L, tq0) != unit0) {
                        z1 = true;
                        break;
                    }
                    return unit0;
                }
                break;
            }
            case 2: {
                boolean z3 = tq0.p;
                analogTimePickerState1 = tq0.o;
                ResultKt.throwOnFailure(object0);
                z1 = z3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(z1) {
            analogTimePickerState1.setSelection-6_8s6DQ(1);
        }
        return Unit.INSTANCE;
    }

    public static final void access$timeInputOnChange-z7XvuPQ(int v, TimePickerState timePickerState0, TextFieldValue textFieldValue0, TextFieldValue textFieldValue1, int v1, Function1 function10) {
        if(Intrinsics.areEqual(textFieldValue0.getText(), textFieldValue1.getText())) {
            function10.invoke(textFieldValue0);
            return;
        }
        if(textFieldValue0.getText().length() == 0) {
            if(TimePickerSelectionMode.equals-impl0(v, 0)) {
                timePickerState0.setHour(0);
            }
            else {
                timePickerState0.setMinute(0);
            }
            function10.invoke(TextFieldValue.copy-3r_uNRQ$default(textFieldValue0, "", 0L, null, 6, null));
            return;
        }
        try {
            int v2 = textFieldValue0.getText().length() != 3 || TextRange.getStart-impl(textFieldValue0.getSelection-d9O1mEE()) != 1 ? Integer.parseInt(textFieldValue0.getText()) : c.digitToInt(textFieldValue0.getText().charAt(0));
            if(v2 <= v1) {
                if(TimePickerSelectionMode.equals-impl0(v, 0)) {
                    timePickerState0.setHour(v2);
                    if(v2 > 1 && !timePickerState0.is24hour()) {
                        timePickerState0.setSelection-6_8s6DQ(1);
                    }
                }
                else {
                    timePickerState0.setMinute(v2);
                }
                if(textFieldValue0.getText().length() > 2) {
                    textFieldValue0 = TextFieldValue.copy-3r_uNRQ$default(textFieldValue0, String.valueOf(textFieldValue0.getText().charAt(0)), 0L, null, 6, null);
                }
                function10.invoke(textFieldValue0);
            }
        }
        catch(NumberFormatException | IllegalArgumentException unused_ex) {
        }
    }

    public static final void b(TimePickerState timePickerState0, TimePickerColors timePickerColors0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x2D089E69);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? composer1.changed(timePickerState0) : composer1.changedInstance(timePickerState0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(timePickerColors0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2D089E69, v1, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:1086)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), alignment$Companion0.getStart(), composer1, 6);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            TimePickerKt.a(timePickerState0, timePickerColors0, composer1, v1 & 0x7E);
            composer1.startReplaceGroup(0x36D091DC);
            if(!timePickerState0.is24hour()) {
                Modifier modifier1 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, TimePickerKt.m, 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
                int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
                Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                    a.t(v3, composer1, v3, function21);
                }
                Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
                TimePickerKt.c(SizeKt.size-VpY3zN4(modifier$Companion0, 0.0f, 0.0f), timePickerColors0, timePickerState0, composer1, v1 << 3 & 0x380 | (v1 << 3 & 0x70 | 6));
                composer1.endNode();
            }
            if(a.x(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new np(timePickerState0, timePickerColors0, v, 1));
        }
    }

    public static final void c(Modifier modifier0, TimePickerColors timePickerColors0, TimePickerState timePickerState0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x4B2CA0B7);
        int v1 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? composer1.changed(timePickerState0) : composer1.changedInstance(timePickerState0)) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changed(timePickerColors0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4B2CA0B7, v1, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1159)");
            }
            s3 s30 = composer1.rememberedValue();
            if(s30 == Composer.Companion.getEmpty()) {
                s30 = s3.c;
                composer1.updateRememberedValue(s30);
            }
            Shape shape0 = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composer1, 6);
            Intrinsics.checkNotNull(shape0, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            TimePickerKt.d(modifier0, timePickerState0, timePickerColors0, s30, ShapesKt.start(((CornerBasedShape)shape0)), ShapesKt.end(((CornerBasedShape)shape0)), composer1, v1 & 14 | 0xC00 | v1 & 0x70 | v1 & 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new wp(modifier0, timePickerState0, timePickerColors0, v, 0));
        }
    }

    public static final void d(Modifier modifier0, TimePickerState timePickerState0, TimePickerColors timePickerColors0, MeasurePolicy measurePolicy0, Shape shape0, Shape shape1, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1374241901);
        int v1 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? composer1.changed(timePickerState0) : composer1.changedInstance(timePickerState0)) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changed(timePickerColors0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changed(measurePolicy0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (composer1.changed(shape0) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (composer1.changed(shape1) ? 0x20000 : 0x10000);
        }
        if((74899 & v1) != 74898 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374241901, v1, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1254)");
            }
            BorderStroke borderStroke0 = BorderStrokeKt.BorderStroke-cXLIe8U(0.0f, timePickerColors0.getPeriodSelectorBorderColor-0d7_KjU());
            Shape shape2 = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composer1, 6);
            Intrinsics.checkNotNull(shape2, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            String s = Strings_androidKt.getString-2EP1pXo(string.m3c_time_picker_period_toggle_description, composer1, 0);
            boolean z = composer1.changed(s);
            m m0 = composer1.rememberedValue();
            if(z || m0 == Composer.Companion.getEmpty()) {
                m0 = new m(s, 8);
                composer1.updateRememberedValue(m0);
            }
            Modifier modifier1 = BorderKt.border(SelectableGroupKt.selectableGroup(SemanticsModifierKt.semantics$default(modifier0, false, m0, 1, null)), borderStroke0, ((CornerBasedShape)shape2));
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            boolean z1 = timePickerState0.isAfternoon();
            boolean z2 = (v1 & 0x70) == 0x20 || (v1 & 0x40) != 0 && composer1.changedInstance(timePickerState0);
            zp zp0 = composer1.rememberedValue();
            if(z2 || zp0 == Composer.Companion.getEmpty()) {
                zp0 = new zp(timePickerState0, 0);
                composer1.updateRememberedValue(zp0);
            }
            ComposableSingletons.TimePickerKt composableSingletons$TimePickerKt0 = ComposableSingletons.TimePickerKt.INSTANCE;
            int v3 = v1 << 3 & 0x1C00;
            TimePickerKt.g(!z1, shape0, zp0, timePickerColors0, composableSingletons$TimePickerKt0.getLambda-1$material3_release(), composer1, v1 >> 9 & 0x70 | 0x6000 | v3);
            boolean z3 = false;
            SpacerKt.Spacer(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(LayoutIdKt.layoutId(Modifier.Companion, "Spacer"), 2.0f), 0.0f, 1, null), timePickerColors0.getPeriodSelectorBorderColor-0d7_KjU(), null, 2, null), composer1, 0);
            boolean z4 = timePickerState0.isAfternoon();
            if((v1 & 0x70) == 0x20 || (v1 & 0x40) != 0 && composer1.changedInstance(timePickerState0)) {
                z3 = true;
            }
            zp zp1 = composer1.rememberedValue();
            if(z3 || zp1 == Composer.Companion.getEmpty()) {
                zp1 = new zp(timePickerState0, 1);
                composer1.updateRememberedValue(zp1);
            }
            TimePickerKt.g(z4, shape1, zp1, timePickerColors0, composableSingletons$TimePickerKt0.getLambda-2$material3_release(), composer1, v1 >> 12 & 0x70 | 0x6000 | v3);
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
            scopeUpdateScope0.updateScope(new ki(modifier0, timePickerState0, timePickerColors0, measurePolicy0, shape0, shape1, v, 2));
        }
    }

    public static final void e(Modifier modifier0, TimePickerColors timePickerColors0, TimePickerState timePickerState0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xE3A608FB);
        int v1 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(timePickerColors0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (((v & 0x200) == 0 ? composer1.changed(timePickerState0) : composer1.changedInstance(timePickerState0)) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE3A608FB, v1, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:963)");
            }
            androidx.compose.ui.text.input.TextFieldValue.Companion textFieldValue$Companion0 = TextFieldValue.Companion;
            Saver saver0 = textFieldValue$Companion0.getSaver();
            boolean z = (v1 & 0x380) == 0x100 || (v1 & 0x200) != 0 && composer1.changedInstance(timePickerState0);
            zp zp0 = composer1.rememberedValue();
            if(z || zp0 == Composer.Companion.getEmpty()) {
                zp0 = new zp(timePickerState0, 2);
                composer1.updateRememberedValue(zp0);
            }
            MutableState mutableState0 = RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, zp0, composer1, 0, 4);
            Saver saver1 = textFieldValue$Companion0.getSaver();
            boolean z1 = (v1 & 0x380) == 0x100 || (v1 & 0x200) != 0 && composer1.changedInstance(timePickerState0);
            zp zp1 = composer1.rememberedValue();
            if(z1 || zp1 == Composer.Companion.getEmpty()) {
                zp1 = new zp(timePickerState0, 3);
                composer1.updateRememberedValue(zp1);
            }
            MutableState mutableState1 = RememberSaveableKt.rememberSaveable(new Object[0], saver1, null, zp1, composer1, 0, 4);
            Modifier modifier1 = PaddingKt.padding-qDBjuR0$default(modifier0, 0.0f, 0.0f, 0.0f, TimePickerKt.g, 7, null);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), alignment$Companion0.getTop(), composer1, 0x30);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TextStyle.copy-p1EtxEg$default(TypographyKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldLabelTextFont(), composer1, 6), timePickerColors0.timeSelectorContentColor-vNxB06k$material3_release(true), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 3, 0, 0L, null, null, null, 0, 0, null, 0xFF7FFE, null)), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(1306700887, true, new gq(mutableState0, timePickerState0, timePickerColors0, mutableState1), composer1, 54), composer1, 0x30 | ProvidedValue.$stable);
            composer1.startReplaceGroup(0x1E7C012A);
            if(!timePickerState0.is24hour()) {
                androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
                Modifier modifier3 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, TimePickerKt.m, 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
                int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
                Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                    a.t(v3, composer1, v3, function21);
                }
                Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
                TimePickerKt.i(SizeKt.size-VpY3zN4(modifier$Companion0, 0.0f, 0.0f), timePickerColors0, timePickerState0, composer1, v1 >> 3 & 0x70 | 6 | v1 << 3 & 0x380);
                composer1.endNode();
            }
            if(a.x(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new wp(modifier0, timePickerColors0, timePickerState0, v));
        }
    }

    public static final void f(Modifier modifier0, int v, TimePickerState timePickerState0, int v1, TimePickerColors timePickerColors0, Composer composer0, int v2) {
        Composer composer1 = composer0.startRestartGroup(0xBB920EAF);
        int v3 = (v2 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v3 |= (((v2 & 0x200) == 0 ? composer1.changed(timePickerState0) : composer1.changedInstance(timePickerState0)) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v3 |= (composer1.changed(v1) ? 0x800 : 0x400);
        }
        if((v2 & 0x6000) == 0) {
            v3 |= (composer1.changed(timePickerColors0) ? 0x4000 : 0x2000);
        }
        if((v3 & 9363) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xBB920EAF, v3, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1348)");
            }
            boolean z = TimePickerSelectionMode.equals-impl0(timePickerState0.getSelection-yecRtBI(), v1);
            String s = Strings_androidKt.getString-2EP1pXo((TimePickerSelectionMode.equals-impl0(v1, 0) ? string.m3c_time_picker_hour_selection : string.m3c_time_picker_minute_selection), composer1, 0);
            long v4 = timePickerColors0.timeSelectorContainerColor-vNxB06k$material3_release(z);
            long v5 = timePickerColors0.timeSelectorContentColor-vNxB06k$material3_release(z);
            boolean z1 = composer1.changed(s);
            mq mq0 = composer1.rememberedValue();
            if(z1 || mq0 == Composer.Companion.getEmpty()) {
                mq0 = new mq(s);
                composer1.updateRememberedValue(mq0);
            }
            Modifier modifier1 = SemanticsModifierKt.semantics(modifier0, true, mq0);
            Shape shape0 = ShapesKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorContainerShape(), composer1, 6);
            int v6 = (v3 & 0x380) == 0x100 || (v3 & 0x200) != 0 && composer1.changedInstance(timePickerState0) ? 1 : 0;
            nq nq0 = composer1.rememberedValue();
            if((((v3 & 0x1C00) == 0x800 ? 1 : 0) | v6) != 0 || nq0 == Composer.Companion.getEmpty()) {
                nq0 = new nq(v1, timePickerState0, 0);
                composer1.updateRememberedValue(nq0);
            }
            SurfaceKt.Surface-d85dljk(z, nq0, modifier1, false, shape0, v4, 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.rememberComposableLambda(0xA7F27559, true, new oq(v1, timePickerState0, v, v5), composer1, 54), composer1, 0, 0x30, 0x7C8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new hq(modifier0, v, timePickerState0, v1, timePickerColors0, v2));
        }
    }

    public static final void g(boolean z, Shape shape0, Function0 function00, TimePickerColors timePickerColors0, Function3 function30, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1937408098);
        int v1 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(shape0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changed(timePickerColors0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (composer1.changedInstance(function30) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937408098, v1, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1304)");
            }
            long v2 = timePickerColors0.periodSelectorContentColor-vNxB06k$material3_release(z);
            long v3 = timePickerColors0.periodSelectorContainerColor-vNxB06k$material3_release(z);
            Modifier modifier0 = SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(Modifier.Companion, (z ? 0.0f : 1.0f)), 0.0f, 1, null);
            pq pq0 = composer1.rememberedValue();
            if((v1 & 14) == 4 || pq0 == Composer.Companion.getEmpty()) {
                pq0 = new pq(z);
                composer1.updateRememberedValue(pq0);
            }
            Modifier modifier1 = SemanticsModifierKt.semantics$default(modifier0, false, pq0, 1, null);
            PaddingValues paddingValues0 = PaddingKt.PaddingValues-0680j_4(0.0f);
            ButtonKt.TextButton(function00, modifier1, false, shape0, ButtonDefaults.INSTANCE.textButtonColors-ro_MJ88(v3, v2, 0L, 0L, composer1, 0x6000, 12), null, null, paddingValues0, null, function30, composer1, v1 >> 6 & 14 | 0xC00000 | v1 << 6 & 0x1C00 | v1 << 15 & 0x70000000, 356);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new qq(z, shape0, function00, timePickerColors0, function30, v));
        }
    }

    public static final int getHourForDisplay(@NotNull TimePickerState timePickerState0) {
        if(timePickerState0.is24hour()) {
            return timePickerState0.getHour() % 24;
        }
        if(timePickerState0.getHour() % 12 == 0) {
            return 12;
        }
        return timePickerState0.isAfternoon() ? timePickerState0.getHour() - 12 : timePickerState0.getHour();
    }

    // 去混淆评级： 中等(55)
    public static final long getSelectorPos(@NotNull AnalogTimePickerState analogTimePickerState0) {
        float f = (!analogTimePickerState0.is24hour() || !analogTimePickerState0.isAfternoon() || !TimePickerSelectionMode.equals-impl0(analogTimePickerState0.getSelection-yecRtBI(), 0) ? TimePickerKt.a : TimePickerKt.b) - 0.0f + 0.0f;
        return DpKt.DpOffset-YgX7TsA(Dp.constructor-impl(Dp.constructor-impl(((float)Math.cos(analogTimePickerState0.getCurrentAngle())) * f) + 0.0f), Dp.constructor-impl(Dp.constructor-impl(f * ((float)Math.sin(analogTimePickerState0.getCurrentAngle()))) + 0.0f));
    }

    public static final void h(TimePickerState timePickerState0, TimePickerColors timePickerColors0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(2054675515);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? composer1.changed(timePickerState0) : composer1.changedInstance(timePickerState0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(timePickerColors0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054675515, v1, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:1106)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), alignment$Companion0.getTop(), composer1, 6);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            TimePickerKt.a(timePickerState0, timePickerColors0, composer1, v1 & 0x7E);
            composer1.startReplaceGroup(-709485014);
            if(!timePickerState0.is24hour()) {
                Modifier modifier1 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, TimePickerKt.m, 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
                int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
                Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                    a.t(v3, composer1, v3, function21);
                }
                Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
                TimePickerKt.i(SizeKt.size-VpY3zN4(modifier$Companion0, 0.0f, 0.0f), timePickerColors0, timePickerState0, composer1, v1 << 3 & 0x380 | (v1 << 3 & 0x70 | 6));
                composer1.endNode();
            }
            if(a.x(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new np(timePickerState0, timePickerColors0, v, 2));
        }
    }

    public static final void i(Modifier modifier0, TimePickerColors timePickerColors0, TimePickerState timePickerState0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x8ED0CF25);
        int v1 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? composer1.changed(timePickerState0) : composer1.changedInstance(timePickerState0)) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changed(timePickerColors0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8ED0CF25, v1, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1205)");
            }
            s3 s30 = composer1.rememberedValue();
            if(s30 == Composer.Companion.getEmpty()) {
                s30 = s3.d;
                composer1.updateRememberedValue(s30);
            }
            Shape shape0 = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composer1, 6);
            Intrinsics.checkNotNull(shape0, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            TimePickerKt.d(modifier0, timePickerState0, timePickerColors0, s30, ShapesKt.top(((CornerBasedShape)shape0)), ShapesKt.bottom(((CornerBasedShape)shape0)), composer1, v1 & 14 | 0xC00 | v1 & 0x70 | v1 & 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new wp(modifier0, timePickerState0, timePickerColors0, v, 2));
        }
    }

    public static final void j(TimePickerState timePickerState0, float f, float f1, float f2, long v) {
        if(TimePickerSelectionMode.equals-impl0(timePickerState0.getSelection-yecRtBI(), 0) && timePickerState0.is24hour()) {
            timePickerState0.setAfternoon(((float)Math.hypot(((float)IntOffset.getX-impl(v)) - f, ((float)IntOffset.getY-impl(v)) - f1)) < f2);
        }
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final String numberContentDescription-dSwYdS4(int v, boolean z, int v1, @Nullable Composer composer0, int v2) {
        int v3;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB93D3B4, v2, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1914)");
        }
        if(TimePickerSelectionMode.equals-impl0(v, 1)) {
            v3 = string.m3c_time_picker_minute_suffix;
        }
        else {
            v3 = z ? string.m3c_time_picker_hour_24h_suffix : string.m3c_time_picker_hour_suffix;
        }
        String s = Strings_androidKt.getString-qBjtwXw(v3, new Object[]{v1}, composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return s;
    }

    @ExperimentalMaterial3Api
    @Composable
    @NotNull
    public static final TimePickerState rememberTimePickerState(int v, int v1, boolean z, @Nullable Composer composer0, int v2, int v3) {
        int v4 = 0;
        int v5 = (v3 & 1) == 0 ? v : 0;
        int v6 = (v3 & 2) == 0 ? v1 : 0;
        boolean z1 = (v3 & 4) == 0 ? z : TimeFormat_androidKt.is24HourFormat(composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x49C6094D, v2, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:573)");
        }
        Saver saver0 = vq.f.Saver();
        int v7 = ((v2 & 14 ^ 6) <= 4 || !composer0.changed(v5)) && (v2 & 6) != 4 ? 0 : 1;
        int v8 = ((v2 & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(v6)) && (v2 & 0x30) != 0x20 ? 0 : 1;
        if((v2 & 0x380 ^ 0x180) > 0x100 && composer0.changed(z1) || (v2 & 0x180) == 0x100) {
            v4 = 1;
        }
        uq uq0 = composer0.rememberedValue();
        if((v7 | v8 | v4) != 0 || uq0 == Composer.Companion.getEmpty()) {
            uq0 = new uq(v5, v6, z1);
            composer0.updateRememberedValue(uq0);
        }
        TimePickerState timePickerState0 = (vq)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, uq0, composer0, 0, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return timePickerState0;
    }
}

