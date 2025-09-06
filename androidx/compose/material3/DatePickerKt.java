package androidx.compose.material3;

import a2.b;
import aa.d;
import aa.o;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.y;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.selection.g1;
import androidx.compose.foundation.text.selection.z;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.room.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00AC\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u001Am\u0010\u000F\u001A\u00020\u00072\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00A2\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001A\u000F\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00A2\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\rH\u0007\u00A2\u0006\u0004\b\u000F\u0010\u0010\u001AH\u0010\u001C\u001A\u00020\u00002\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u0018H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001B\u001AT\u0010\"\u001A\u00020\u00002\n\u0010\u001F\u001A\u00060\u001Dj\u0002`\u001E2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u0018H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010!\u001A\u0084\u0001\u0010+\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u0013\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00A2\u0006\u0002\b\b2\u0013\u0010\n\u001A\u000F\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00A2\u0006\u0002\b\b2\u0013\u0010#\u001A\u000F\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00A2\u0006\u0002\b\b2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010%\u001A\u00020$2\u0006\u0010\'\u001A\u00020&2\u0011\u0010(\u001A\r\u0012\u0004\u0012\u00020\u00070\u0006\u00A2\u0006\u0002\b\bH\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b)\u0010*\u001A6\u00101\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010,\u001A\u00020\u00162\u0012\u0010.\u001A\u000E\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070-H\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b/\u00100\u001AZ\u00108\u001A\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u0013\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00A2\u0006\u0002\b\b2\u0006\u00103\u001A\u0002022\u0006\u00104\u001A\u0002022\u0006\u00105\u001A\u00020&2\u0011\u0010(\u001A\r\u0012\u0004\u0012\u00020\u00070\u0006\u00A2\u0006\u0002\b\bH\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b6\u00107\u001AK\u0010A\u001A\u00020\u00072\u0006\u0010:\u001A\u0002092!\u0010>\u001A\u001D\u0012\u0013\u0012\u00110\u0011\u00A2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010@\u001A\u00020?2\u0006\u0010\u0015\u001A\u00020\u0014H\u0080@\u00A2\u0006\u0004\bA\u0010B\u001A\u001F\u0010C\u001A\u00020\u00072\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010@\u001A\u00020?H\u0001\u00A2\u0006\u0004\bC\u0010D\u001Ax\u0010N\u001A\u00020\u00072\u0006\u0010F\u001A\u00020E2!\u0010H\u001A\u001D\u0012\u0013\u0012\u00110\u0011\u00A2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(G\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010I\u001A\u00020\u00112\b\u0010J\u001A\u0004\u0018\u00010\u00112\b\u0010K\u001A\u0004\u0018\u00010\u00112\b\u0010M\u001A\u0004\u0018\u00010L2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u000E\u001A\u00020\rH\u0001\u00A2\u0006\u0004\bN\u0010O\u001A\u0017\u0010Q\u001A\u00020P2\u0006\u0010\u0015\u001A\u00020\u0014H\u0000\u00A2\u0006\u0004\bQ\u0010R\"\u001A\u0010W\u001A\u00020&8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bS\u0010T\u001A\u0004\bU\u0010V\"\u001A\u0010Z\u001A\u00020&8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bX\u0010T\u001A\u0004\bY\u0010V\"\u001A\u0010]\u001A\u00020&8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b[\u0010T\u001A\u0004\b\\\u0010V\"\u001A\u0010c\u001A\u00020^8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b_\u0010`\u001A\u0004\ba\u0010b\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006e\u00B2\u0006\u000E\u0010d\u001A\u00020\u000B8\n@\nX\u008A\u008E\u0002"}, d2 = {"Landroidx/compose/material3/DatePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "title", "headline", "", "showModeToggle", "Landroidx/compose/material3/DatePickerColors;", "colors", "DatePicker", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/DisplayMode;", "initialDisplayMode", "Landroidx/compose/material3/SelectableDates;", "selectableDates", "rememberDatePickerState-EU0dCGE", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DatePickerState;", "rememberDatePickerState", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "DatePickerState-sHin3Bw", "(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DatePickerState;", "DatePickerState", "modeToggleButton", "Landroidx/compose/ui/text/TextStyle;", "headlineTextStyle", "Landroidx/compose/ui/unit/Dp;", "headerMinHeight", "content", "DateEntryContainer-au3_HiA", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DateEntryContainer", "displayMode", "Lkotlin/Function1;", "onDisplayModeChange", "DisplayModeToggleButton-tER2X8s", "(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DisplayModeToggleButton", "Landroidx/compose/ui/graphics/Color;", "titleContentColor", "headlineContentColor", "minHeight", "DatePickerHeader-pc5RIQQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DatePickerHeader", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Lkotlin/ParameterName;", "name", "monthInMillis", "onDisplayedMonthChange", "Landroidx/compose/material3/internal/CalendarModel;", "calendarModel", "updateDisplayedMonth", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WeekDays", "(Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/internal/CalendarModel;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material3/internal/CalendarMonth;", "month", "dateInMillis", "onDateSelectionChange", "todayMillis", "startDateMillis", "endDateMillis", "Landroidx/compose/material3/SelectedRangeInfo;", "rangeSelectionInfo", "Month", "(Landroidx/compose/material3/internal/CalendarMonth;Lkotlin/jvm/functions/Function1;JLjava/lang/Long;Ljava/lang/Long;Landroidx/compose/material3/SelectedRangeInfo;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "", "numberOfMonthsInRange", "(Lkotlin/ranges/IntRange;)I", "a", "F", "getRecommendedSizeForAccessibility", "()F", "RecommendedSizeForAccessibility", "b", "getMonthYearHeight", "MonthYearHeight", "c", "getDatePickerHorizontalPadding", "DatePickerHorizontalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "d", "Landroidx/compose/foundation/layout/PaddingValues;", "getDatePickerModeTogglePadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerModeTogglePadding", "yearPickerVisible", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 11 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 12 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 13 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 14 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 15 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 16 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 17 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2252:1\n1223#2,6:2253\n1223#2,6:2259\n1223#2,6:2265\n1223#2,6:2311\n1223#2,6:2317\n1223#2,6:2326\n1223#2,3:2337\n1226#2,3:2343\n1223#2,6:2384\n1223#2,6:2390\n1223#2,6:2396\n1223#2,6:2526\n1223#2,6:2532\n1223#2,6:2574\n1223#2,6:2624\n1223#2,6:2698\n1223#2,6:2704\n1223#2,6:2710\n1223#2,6:2728\n1223#2,6:2734\n1223#2,6:2740\n85#3:2271\n82#3,6:2272\n88#3:2306\n92#3:2310\n85#3:2347\n81#3,7:2348\n88#3:2383\n85#3:2439\n82#3,6:2440\n88#3:2474\n92#3:2478\n92#3:2486\n85#3:2487\n83#3,5:2488\n88#3:2521\n92#3:2525\n85#3:2631\n83#3,5:2632\n88#3:2665\n92#3:2723\n78#4,6:2278\n85#4,4:2293\n89#4,2:2303\n93#4:2309\n78#4,6:2355\n85#4,4:2370\n89#4,2:2380\n78#4,6:2410\n85#4,4:2425\n89#4,2:2435\n78#4,6:2446\n85#4,4:2461\n89#4,2:2471\n93#4:2477\n93#4:2481\n93#4:2485\n78#4,6:2493\n85#4,4:2508\n89#4,2:2518\n93#4:2524\n78#4,6:2541\n85#4,4:2556\n89#4,2:2566\n78#4,6:2586\n85#4,4:2601\n89#4,2:2611\n93#4:2617\n93#4:2622\n78#4,6:2637\n85#4,4:2652\n89#4,2:2662\n78#4,6:2669\n85#4,4:2684\n89#4,2:2694\n93#4:2718\n93#4:2722\n78#4,6:2749\n85#4,4:2764\n89#4,2:2774\n93#4:2780\n368#5,9:2284\n377#5:2305\n378#5,2:2307\n368#5,9:2361\n377#5:2382\n368#5,9:2416\n377#5:2437\n368#5,9:2452\n377#5:2473\n378#5,2:2475\n378#5,2:2479\n378#5,2:2483\n368#5,9:2499\n377#5:2520\n378#5,2:2522\n368#5,9:2547\n377#5:2568\n368#5,9:2592\n377#5:2613\n378#5,2:2615\n378#5,2:2620\n368#5,9:2643\n377#5:2664\n368#5,9:2675\n377#5:2696\n378#5,2:2716\n378#5,2:2720\n368#5,9:2755\n377#5:2776\n378#5,2:2778\n4032#6,6:2297\n4032#6,6:2374\n4032#6,6:2429\n4032#6,6:2465\n4032#6,6:2512\n4032#6,6:2560\n4032#6,6:2605\n4032#6,6:2656\n4032#6,6:2688\n4032#6,6:2768\n77#7:2323\n77#7:2782\n1#8:2324\n148#9:2325\n148#9:2786\n148#9:2787\n148#9:2788\n148#9:2789\n148#9:2790\n148#9:2791\n148#9:2792\n488#10:2332\n487#10,4:2333\n491#10,2:2340\n495#10:2346\n487#11:2342\n71#12:2402\n67#12,7:2403\n74#12:2438\n78#12:2482\n71#12:2580\n69#12,5:2581\n74#12:2614\n78#12:2618\n98#13,3:2538\n101#13:2569\n105#13:2623\n98#13,3:2666\n101#13:2697\n105#13:2719\n98#13,3:2746\n101#13:2777\n105#13:2781\n33#14,4:2570\n38#14:2619\n86#15:2630\n156#16:2724\n159#16:2725\n168#16:2726\n114#16:2727\n81#17:2783\n107#17,2:2784\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n*L\n172#1:2253,6\n191#1:2259,6\n367#1:2265,6\n1358#1:2311,6\n1365#1:2317,6\n1402#1:2326,6\n1490#1:2337,3\n1490#1:2343,3\n1504#1:2384,6\n1516#1:2390,6\n1528#1:2396,6\n1640#1:2526,6\n1677#1:2532,6\n1731#1:2574,6\n1766#1:2624,6\n1811#1:2698,6\n1839#1:2704,6\n1845#1:2710,6\n1932#1:2728,6\n2080#1:2734,6\n2098#1:2740,6\n1304#1:2271\n1304#1:2272,6\n1304#1:2306\n1304#1:2310\n1493#1:2347\n1493#1:2348,7\n1493#1:2383\n1533#1:2439\n1533#1:2440,6\n1533#1:2474\n1533#1:2478\n1493#1:2486\n1610#1:2487\n1610#1:2488,5\n1610#1:2521\n1610#1:2525\n1776#1:2631\n1776#1:2632,5\n1776#1:2665\n1776#1:2723\n1304#1:2278,6\n1304#1:2293,4\n1304#1:2303,2\n1304#1:2309\n1493#1:2355,6\n1493#1:2370,4\n1493#1:2380,2\n1532#1:2410,6\n1532#1:2425,4\n1532#1:2435,2\n1533#1:2446,6\n1533#1:2461,4\n1533#1:2471,2\n1533#1:2477\n1532#1:2481\n1493#1:2485\n1610#1:2493,6\n1610#1:2508,4\n1610#1:2518,2\n1610#1:2524\n1722#1:2541,6\n1722#1:2556,4\n1722#1:2566,2\n1729#1:2586,6\n1729#1:2601,4\n1729#1:2611,2\n1729#1:2617\n1722#1:2622\n1776#1:2637,6\n1776#1:2652,4\n1776#1:2662,2\n1783#1:2669,6\n1783#1:2684,4\n1783#1:2694,2\n1783#1:2718\n1776#1:2722\n2132#1:2749,6\n2132#1:2764,4\n2132#1:2774,2\n2132#1:2780\n1304#1:2284,9\n1304#1:2305\n1304#1:2307,2\n1493#1:2361,9\n1493#1:2382\n1532#1:2416,9\n1532#1:2437\n1533#1:2452,9\n1533#1:2473\n1533#1:2475,2\n1532#1:2479,2\n1493#1:2483,2\n1610#1:2499,9\n1610#1:2520\n1610#1:2522,2\n1722#1:2547,9\n1722#1:2568\n1729#1:2592,9\n1729#1:2613\n1729#1:2615,2\n1722#1:2620,2\n1776#1:2643,9\n1776#1:2664\n1783#1:2675,9\n1783#1:2696\n1783#1:2716,2\n1776#1:2720,2\n2132#1:2755,9\n2132#1:2776\n2132#1:2778,2\n1304#1:2297,6\n1493#1:2374,6\n1532#1:2429,6\n1533#1:2465,6\n1610#1:2512,6\n1722#1:2560,6\n1729#1:2605,6\n1776#1:2656,6\n1783#1:2688,6\n2132#1:2768,6\n1394#1:2323\n2193#1:2782\n1394#1:2325\n2240#1:2786\n2241#1:2787\n2242#1:2788\n2243#1:2789\n2245#1:2790\n2246#1:2791\n2248#1:2792\n1490#1:2332\n1490#1:2333,4\n1490#1:2340,2\n1490#1:2346\n1490#1:2342\n1532#1:2402\n1532#1:2403,7\n1532#1:2438\n1532#1:2482\n1729#1:2580\n1729#1:2581,5\n1729#1:2614\n1729#1:2618\n1722#1:2538,3\n1722#1:2569\n1722#1:2623\n1783#1:2666,3\n1783#1:2697\n1783#1:2719\n2132#1:2746,3\n2132#1:2777\n2132#1:2781\n1728#1:2570,4\n1728#1:2619\n1778#1:2630\n1895#1:2724\n1897#1:2725\n1899#1:2726\n1904#1:2727\n1491#1:2783\n1491#1:2784,2\n*E\n"})
public final class DatePickerKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final PaddingValues d;
    public static final PaddingValues e;
    public static final PaddingValues f;
    public static final float g;

    static {
        DatePickerKt.a = 48.0f;
        DatePickerKt.b = 56.0f;
        DatePickerKt.c = 12.0f;
        DatePickerKt.d = PaddingKt.PaddingValues-a9UjIt4$default(0.0f, 0.0f, 12.0f, 12.0f, 3, null);
        DatePickerKt.e = PaddingKt.PaddingValues-a9UjIt4$default(24.0f, 16.0f, 12.0f, 0.0f, 8, null);
        DatePickerKt.f = PaddingKt.PaddingValues-a9UjIt4$default(24.0f, 0.0f, 12.0f, 12.0f, 2, null);
        DatePickerKt.g = 16.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DateEntryContainer-au3_HiA(@NotNull Modifier modifier0, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable Function2 function22, @NotNull DatePickerColors datePickerColors0, @NotNull TextStyle textStyle0, float f, @NotNull Function2 function23, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x59D86E5F);
        int v1 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(function21) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changedInstance(function22) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (composer1.changed(datePickerColors0) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (composer1.changed(textStyle0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (composer1.changed(f) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (composer1.changedInstance(function23) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v1) != 4793490 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x59D86E5F, v1, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1302)");
            }
            Modifier modifier1 = BackgroundKt.background-bw27NRU$default(SemanticsModifierKt.semantics$default(SizeKt.sizeIn-qDBjuR0$default(modifier0, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), false, a5.y, 1, null), datePickerColors0.getContainerColor-0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
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
            Function2 function24 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function24);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(-229007058, true, new n5(function21, function22, function20, datePickerColors0, textStyle0), composer1, 54);
            DatePickerKt.DatePickerHeader-pc5RIQQ(Modifier.Companion, function20, datePickerColors0.getTitleContentColor-0d7_KjU(), datePickerColors0.getHeadlineContentColor-0d7_KjU(), f, composableLambda0, composer1, v1 & 0x70 | 0x30006 | 0xE000 & v1 >> 6);
            function23.invoke(composer1, ((int)(v1 >> 21 & 14)));
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
            scopeUpdateScope0.updateScope(new o5(modifier0, function20, function21, function22, datePickerColors0, textStyle0, f, function23, v));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DatePicker(@NotNull DatePickerState datePickerState0, @Nullable Modifier modifier0, @Nullable DatePickerFormatter datePickerFormatter0, @Nullable Function2 function20, @Nullable Function2 function21, boolean z, @Nullable DatePickerColors datePickerColors0, @Nullable Composer composer0, int v, int v1) {
        DatePickerColors datePickerColors1;
        boolean z2;
        Function2 function24;
        Modifier modifier2;
        DatePickerFormatter datePickerFormatter1;
        boolean z3;
        Function2 function25;
        boolean z1;
        Function2 function23;
        Function2 function22;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(809701813);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(datePickerState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x30) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v & 0x180) == 0) {
            v2 |= ((v1 & 4) != 0 || !((v & 0x200) == 0 ? composer1.changed(datePickerFormatter0) : composer1.changedInstance(datePickerFormatter0)) ? 0x80 : 0x100);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function22 = function20;
        }
        else if((v & 0xC00) == 0) {
            function22 = function20;
            v2 |= (composer1.changedInstance(function22) ? 0x800 : 0x400);
        }
        else {
            function22 = function20;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            function23 = function21;
        }
        else if((v & 0x6000) == 0) {
            function23 = function21;
            v2 |= (composer1.changedInstance(function23) ? 0x4000 : 0x2000);
        }
        else {
            function23 = function21;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            z1 = z;
        }
        else if((0x30000 & v) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x20000 : 0x10000);
        }
        else {
            z1 = z;
        }
        if((0x180000 & v) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(datePickerColors0) ? 0x80000 : 0x100000);
        }
        if((0x92493 & v2) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v1 & 4) != 0) {
                    DatePickerFormatter datePickerFormatter2 = composer1.rememberedValue();
                    if(datePickerFormatter2 == Composer.Companion.getEmpty()) {
                        datePickerFormatter2 = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                        composer1.updateRememberedValue(datePickerFormatter2);
                    }
                    datePickerFormatter0 = datePickerFormatter2;
                    v2 &= -897;
                }
                if((v1 & 8) != 0) {
                    function22 = ComposableLambdaKt.rememberComposableLambda(0xA64B8BC1, true, new p5(datePickerState0), composer1, 54);
                }
                if((v1 & 16) != 0) {
                    function23 = ComposableLambdaKt.rememberComposableLambda(-1780043561, true, new q5(datePickerState0, datePickerFormatter0), composer1, 54);
                }
                if((v1 & 0x20) != 0) {
                    z1 = true;
                }
                if((v1 & 0x40) == 0) {
                label_82:
                    function25 = function22;
                    z3 = z1;
                    datePickerColors1 = datePickerColors0;
                }
                else {
                    v2 &= 0xFFC7FFFF;
                    datePickerColors1 = DatePickerDefaults.INSTANCE.colors(composer1, 6);
                    function25 = function22;
                    z3 = z1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                goto label_82;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(809701813, v2, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:188)");
            }
            Locale locale0 = CalendarLocale_androidKt.defaultLocale(composer1, 0);
            boolean z4 = composer1.changed(locale0);
            CalendarModel calendarModel0 = composer1.rememberedValue();
            if(z4 || calendarModel0 == Composer.Companion.getEmpty()) {
                calendarModel0 = CalendarModel_androidKt.createCalendarModel(locale0);
                composer1.updateRememberedValue(calendarModel0);
            }
            composer1.startReplaceGroup(0xF3BF580);
            ComposableLambda composableLambda0 = z3 ? ComposableLambdaKt.rememberComposableLambda(0x76266147, true, new s5(datePickerState0), composer1, 54) : null;
            composer1.endReplaceGroup();
            DatePickerKt.DateEntryContainer-au3_HiA(modifier1, function25, function23, composableLambda0, datePickerColors1, TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getHeaderHeadlineFont(), composer1, 6), 0.0f, ComposableLambdaKt.rememberComposableLambda(-1840727866, true, new z(1, datePickerState0, calendarModel0, datePickerFormatter0, datePickerColors1), composer1, 54), composer1, v2 >> 3 & 14 | 0xD80000 | v2 >> 6 & 0x70 | v2 >> 6 & 0x380 | v2 >> 6 & 0xE000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function22 = function25;
            modifier2 = modifier1;
            z2 = z3;
            function24 = function23;
            datePickerFormatter1 = datePickerFormatter0;
        }
        else {
            composer1.skipToGroupEnd();
            datePickerFormatter1 = datePickerFormatter0;
            modifier2 = modifier1;
            function24 = function23;
            z2 = z1;
            datePickerColors1 = datePickerColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t5(datePickerState0, modifier2, datePickerFormatter1, function22, function24, z2, datePickerColors1, v, v1, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DatePickerHeader-pc5RIQQ(@NotNull Modifier modifier0, @Nullable Function2 function20, long v, long v1, float f, @NotNull Function2 function21, @Nullable Composer composer0, int v2) {
        Composer composer1 = composer0.startRestartGroup(-996037719);
        int v3 = (v2 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v3 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v3 |= (composer1.changed(v1) ? 0x800 : 0x400);
        }
        if((v2 & 0x6000) == 0) {
            v3 |= (composer1.changed(f) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v2) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x20000 : 0x10000);
        }
        if((74899 & v3) != 74898 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-996037719, v3, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1601)");
            }
            Modifier modifier1 = function20 == null ? Modifier.Companion : SizeKt.defaultMinSize-VpY3zN4$default(Modifier.Companion, 0.0f, f, 1, null);
            Modifier modifier2 = SizeKt.fillMaxWidth$default(modifier0, 0.0f, 1, null).then(modifier1);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getStart(), composer1, 6);
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
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function22);
            }
            r0.a.z(composeUiNode$Companion0, composer1, modifier3, composer1, 0x236C4736);
            if(function20 != null) {
                ProvideContentColorTextStyleKt.ProvideContentColorTextStyle-3J-VO9M(v, TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getHeaderSupportingTextFont(), composer1, 6), ComposableLambdaKt.rememberComposableLambda(0x73691CE2, true, new c6(function20), composer1, 54), composer1, v3 >> 6 & 14 | 0x180);
            }
            composer1.endReplaceGroup();
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(v1)), function21, composer1, ProvidedValue.$stable | v3 >> 12 & 0x70);
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
            scopeUpdateScope0.updateScope(new d6(modifier0, function20, v, v1, f, function21, v2));
        }
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final DatePickerState DatePickerState-sHin3Bw(@NotNull Locale locale0, @Nullable Long long0, @Nullable Long long1, @NotNull IntRange intRange0, int v, @NotNull SelectableDates selectableDates0) {
        return new q7(locale0, long0, long1, intRange0, v, selectableDates0);
    }

    public static DatePickerState DatePickerState-sHin3Bw$default(Locale locale0, Long long0, Long long1, IntRange intRange0, int v, SelectableDates selectableDates0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            long0 = null;
        }
        if((v1 & 8) != 0) {
            intRange0 = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if((v1 & 16) != 0) {
            v = 0;
        }
        if((v1 & 0x20) != 0) {
            selectableDates0 = DatePickerDefaults.INSTANCE.getAllDates();
        }
        return DatePickerKt.DatePickerState-sHin3Bw(locale0, long0, ((v1 & 4) == 0 ? long1 : long0), intRange0, v, selectableDates0);
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void DisplayModeToggleButton-tER2X8s(@NotNull Modifier modifier0, int v, @NotNull Function1 function10, @Nullable Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x53146763);
        int v2 = (v1 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x53146763, v2, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1355)");
            }
            boolean z = false;
            if(DisplayMode.equals-impl0(v, 0)) {
                composer1.startReplaceGroup(-411460444);
                if((v2 & 0x380) == 0x100) {
                    z = true;
                }
                h6 h60 = composer1.rememberedValue();
                if(z || h60 == Composer.Companion.getEmpty()) {
                    h60 = new h6(function10);
                    composer1.updateRememberedValue(h60);
                }
                IconButtonKt.IconButton(h60, modifier0, false, null, null, ComposableSingletons.DatePickerKt.INSTANCE.getLambda-1$material3_release(), composer1, v2 << 3 & 0x70 | 0x30000, 28);
            }
            else {
                composer1.startReplaceGroup(0xE77DEA3B);
                if((v2 & 0x380) == 0x100) {
                    z = true;
                }
                i6 i60 = composer1.rememberedValue();
                if(z || i60 == Composer.Companion.getEmpty()) {
                    i60 = new i6(function10);
                    composer1.updateRememberedValue(i60);
                }
                IconButtonKt.IconButton(i60, modifier0, false, null, null, ComposableSingletons.DatePickerKt.INSTANCE.getLambda-2$material3_release(), composer1, v2 << 3 & 0x70 | 0x30000, 28);
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
            scopeUpdateScope0.updateScope(new j6(modifier0, v, function10, v1, 0));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Month(@NotNull CalendarMonth calendarMonth0, @NotNull Function1 function10, long v, @Nullable Long long0, @Nullable Long long1, @Nullable SelectedRangeInfo selectedRangeInfo0, @NotNull DatePickerFormatter datePickerFormatter0, @NotNull SelectableDates selectableDates0, @NotNull DatePickerColors datePickerColors0, @Nullable Composer composer0, int v1) {
        Composer composer2;
        float f1;
        Locale locale1;
        int v11;
        Composer composer3;
        int v10;
        Boolean boolean0;
        boolean z4;
        MutableState mutableState0;
        int v8;
        Modifier modifier0;
        Composer composer1 = composer0.startRestartGroup(0x8DFBE7AB);
        int v2 = (v1 & 6) == 0 ? v1 | (composer1.changed(calendarMonth0) ? 4 : 2) : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (composer1.changed(long0) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v2 |= (composer1.changed(long1) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v1) == 0) {
            v2 |= (composer1.changed(selectedRangeInfo0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v1) == 0) {
            v2 |= (((0x200000 & v1) == 0 ? composer1.changed(datePickerFormatter0) : composer1.changedInstance(datePickerFormatter0)) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v1) == 0) {
            v2 |= (composer1.changed(selectableDates0) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v1) == 0) {
            v2 |= (composer1.changed(datePickerColors0) ? 0x4000000 : 0x2000000);
        }
        int v3 = v2;
        if((v3 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8DFBE7AB, v3, -1, "androidx.compose.material3.Month (DatePicker.kt:1762)");
            }
            composer1.startReplaceGroup(0x6C907543);
            if(selectedRangeInfo0 == null) {
                modifier0 = Modifier.Companion;
            }
            else {
                androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
                o o0 = composer1.rememberedValue();
                if((((v3 & 0xE000000) == 0x4000000 ? 1 : 0) | ((v3 & 0x70000) == 0x20000 ? 1 : 0)) != 0 || o0 == Composer.Companion.getEmpty()) {
                    o0 = new o(5, selectedRangeInfo0, datePickerColors0);
                    composer1.updateRememberedValue(o0);
                }
                modifier0 = DrawModifierKt.drawWithContent(modifier$Companion0, o0);
            }
            composer1.endReplaceGroup();
            Locale locale0 = CalendarLocale_androidKt.defaultLocale(composer1, 0);
            Modifier modifier1 = SizeKt.requiredHeight-3ABfNKs(Modifier.Companion, 6.0f * DatePickerKt.a).then(modifier0);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.Companion.getStart(), composer1, 6);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
            float f = DatePickerKt.a;
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
            r0.a.z(composeUiNode$Companion0, composer1, modifier2, composer1, 0xD9681CF3);
            int v5 = 0;
            for(int v6 = 0; v6 < 6; v6 = v8 + 1) {
                Modifier modifier3 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.Companion.getCenterVertically(), composer1, 54);
                int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
                if(composer1.getInserting()) {
                    v8 = v6;
                    a.t(v7, composer1, v7, function21);
                }
                else {
                    v8 = v6;
                    if(!Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                        a.t(v7, composer1, v7, function21);
                    }
                }
                r0.a.z(composeUiNode$Companion1, composer1, modifier4, composer1, 0xFABAC608);
                int v9 = 0;
                while(v9 < 7) {
                    if(v5 >= calendarMonth0.getDaysFromStartOfWeekToFirstOfMonth() && v5 < calendarMonth0.getNumberOfDays() + calendarMonth0.getDaysFromStartOfWeekToFirstOfMonth()) {
                        composer1.startReplaceGroup(0x5CA856B0);
                        int v12 = v5 - calendarMonth0.getDaysFromStartOfWeekToFirstOfMonth();
                        long v13 = ((long)v12) * 86400000L + calendarMonth0.getStartUtcTimeMillis();
                        boolean z = v13 == v;
                        boolean z1 = long0 != null && v13 == ((long)long0);
                        boolean z2 = long1 != null && v13 == ((long)long1);
                        composer1.startReplaceGroup(0xFABB4F24);
                        if(selectedRangeInfo0 == null) {
                            z4 = false;
                        }
                        else {
                            boolean z3 = composer1.changed(v13);
                            Object object0 = composer1.rememberedValue();
                            if((v3 & 0x70000) == 0x20000 || z3 || object0 == Composer.Companion.getEmpty()) {
                                mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(v13 >= (long0 == null ? 0x7FFFFFFFFFFFFFFFL : ((long)long0)) && v13 <= (long1 == null ? 0x8000000000000000L : ((long)long1))), null, 2, null);
                                composer1.updateRememberedValue(mutableState0);
                            }
                            else {
                                mutableState0 = object0;
                            }
                            z4 = ((Boolean)mutableState0.getValue()).booleanValue();
                        }
                        composer1.endReplaceGroup();
                        if(ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(502032503, 0, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1889)");
                        }
                        StringBuilder stringBuilder0 = new StringBuilder();
                        composer1.startReplaceGroup(0xD963FE8B);
                        if(selectedRangeInfo0 != null) {
                            if(z1) {
                                composer1.startReplaceGroup(0xD9640A5C);
                                stringBuilder0.append(Strings_androidKt.getString-2EP1pXo(string.m3c_date_range_picker_start_headline, composer1, 0));
                            }
                            else if(z2) {
                                composer1.startReplaceGroup(0xD96419FA);
                                stringBuilder0.append(Strings_androidKt.getString-2EP1pXo(string.m3c_date_range_picker_end_headline, composer1, 0));
                            }
                            else if(z4) {
                                composer1.startReplaceGroup(0xD9642959);
                                stringBuilder0.append(Strings_androidKt.getString-2EP1pXo(string.m3c_date_range_picker_day_in_range, composer1, 0));
                            }
                            else {
                                composer1.startReplaceGroup(0x53220D86);
                            }
                            composer1.endReplaceGroup();
                        }
                        composer1.endReplaceGroup();
                        composer1.startReplaceGroup(0xD9643417);
                        if(z) {
                            if(stringBuilder0.length() > 0) {
                                stringBuilder0.append(", ");
                            }
                            stringBuilder0.append(Strings_androidKt.getString-2EP1pXo(string.m3c_date_picker_today_description, composer1, 0));
                        }
                        composer1.endReplaceGroup();
                        String s = stringBuilder0.length() == 0 ? null : stringBuilder0.toString();
                        if(ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        String s1 = datePickerFormatter0.formatDate(v13, locale0, true);
                        if(s1 == null) {
                            s1 = "";
                        }
                        androidx.compose.ui.Modifier.Companion modifier$Companion1 = Modifier.Companion;
                        boolean z5 = composer1.changed(v13);
                        p6 p60 = composer1.rememberedValue();
                        if((v3 & 0x70) == 0x20 || z5 || p60 == Composer.Companion.getEmpty()) {
                            v10 = v9;
                            p60 = new p6(0, v13, function10);
                            composer1.updateRememberedValue(p60);
                        }
                        else {
                            v10 = v9;
                        }
                        boolean z6 = composer1.changed(v13);
                        Object object1 = composer1.rememberedValue();
                        if(z6 || object1 == Composer.Companion.getEmpty()) {
                            boolean0 = Boolean.TRUE;
                            composer1.updateRememberedValue(Boolean.TRUE);
                        }
                        else {
                            boolean0 = object1;
                        }
                        f1 = f;
                        composer3 = composer1;
                        v11 = v3;
                        locale1 = locale0;
                        DatePickerKt.a(modifier$Companion1, z1 || z2, p60, z1, boolean0.booleanValue(), z, z4, (s == null ? s1 : s + ", " + s1), datePickerColors0, ComposableLambdaKt.rememberComposableLambda(0x83160E21, true, new q6(v12), composer1, 54), composer3, 0x30000006 | v3 & 0xE000000);
                    }
                    else {
                        v10 = v9;
                        composer3 = composer1;
                        v11 = v3;
                        locale1 = locale0;
                        f1 = f;
                        composer3.startReplaceGroup(1554022070);
                        SpacerKt.Spacer(SizeKt.requiredSize-VpY3zN4(Modifier.Companion, f1, f1), composer3, 6);
                    }
                    composer3.endReplaceGroup();
                    ++v5;
                    v9 = v10 + 1;
                    f = f1;
                    composer1 = composer3;
                    locale0 = locale1;
                    v3 = v11;
                }
                composer1.endReplaceGroup();
                composer1.endNode();
            }
            composer2 = composer1;
            if(a.x(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            composer2 = composer1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer2.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b6(calendarMonth0, function10, v, long0, long1, selectedRangeInfo0, datePickerFormatter0, selectableDates0, datePickerColors0, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void WeekDays(@NotNull DatePickerColors datePickerColors0, @NotNull CalendarModel calendarModel0, @Nullable Composer composer0, int v) {
        int v10;
        Composer composer1 = composer0.startRestartGroup(0x91C365D1);
        int v1 = (v & 6) == 0 ? (composer1.changed(datePickerColors0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(calendarModel0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x91C365D1, v1, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1708)");
            }
            int v2 = calendarModel0.getFirstDayOfWeek();
            List list0 = calendarModel0.getWeekdayNames();
            ArrayList arrayList0 = new ArrayList();
            int v3 = list0.size();
            for(int v4 = v2 - 1; v4 < v3; ++v4) {
                arrayList0.add(list0.get(v4));
            }
            for(int v5 = 0; v5 < v2 - 1; ++v5) {
                arrayList0.add(list0.get(v5));
            }
            TextStyle textStyle0 = TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextFont(), composer1, 6);
            float f = DatePickerKt.a;
            Modifier modifier0 = SizeKt.fillMaxWidth$default(SizeKt.defaultMinSize-VpY3zN4$default(Modifier.Companion, 0.0f, f, 1, null), 0.0f, 1, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.Companion.getCenterVertically(), composer1, 54);
            int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                a.t(v6, composer1, v6, function20);
            }
            r0.a.z(composeUiNode$Companion0, composer1, modifier1, composer1, 396170355);
            int v7 = arrayList0.size();
            int v8 = 0;
            while(v8 < v7) {
                Pair pair0 = (Pair)arrayList0.get(v8);
                androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
                boolean z = composer1.changed(pair0);
                g1 g10 = composer1.rememberedValue();
                if(z || g10 == Composer.Companion.getEmpty()) {
                    g10 = new g1(pair0, 5);
                    composer1.updateRememberedValue(g10);
                }
                Modifier modifier2 = SizeKt.size-VpY3zN4(SemanticsModifierKt.clearAndSetSemantics(modifier$Companion0, g10), f, f);
                MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                int v9 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
                if(composer1.getInserting()) {
                    v10 = v7;
                    a.t(v9, composer1, v9, function21);
                }
                else {
                    v10 = v7;
                    if(!Intrinsics.areEqual(composer1.rememberedValue(), v9)) {
                        a.t(v9, composer1, v9, function21);
                    }
                }
                Updater.set-impl(composer1, modifier3, composeUiNode$Companion1.getSetModifier());
                TextKt.Text--4IGK_g(((String)pair0.getSecond()), SizeKt.wrapContentSize$default(modifier$Companion0, null, false, 3, null), datePickerColors0.getWeekdayContentColor-0d7_KjU(), 0L, null, null, null, 0L, null, TextAlign.box-impl(3), 0L, 0, false, 0, 0, null, textStyle0, composer1, 0x30, 0, 0xFDF8);
                composer1.endNode();
                ++v8;
                v7 = v10;
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
            scopeUpdateScope0.updateScope(new d(datePickerColors0, calendarModel0, v, 2));
        }
    }

    public static final void a(Modifier modifier0, boolean z, Function0 function00, boolean z1, boolean z2, boolean z3, boolean z4, String s, DatePickerColors datePickerColors0, Function2 function20, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xAA7B06FB);
        int v1 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (composer1.changed(z2) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (composer1.changed(z3) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (composer1.changed(z4) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (composer1.changed(s) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v) == 0) {
            v1 |= (composer1.changed(datePickerColors0) ? 0x4000000 : 0x2000000);
        }
        if((0x30000000 & v) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x20000000 : 0x10000000);
        }
        if((306783379 & v1) != 306783378 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAA7B06FB, v1, -1, "androidx.compose.material3.Day (DatePicker.kt:1921)");
            }
            e6 e60 = composer1.rememberedValue();
            if((0x1C00000 & v1) == 0x800000 || e60 == Composer.Companion.getEmpty()) {
                e60 = new e6(s);
                composer1.updateRememberedValue(e60);
            }
            SurfaceKt.Surface-d85dljk(z, function00, SemanticsModifierKt.semantics(modifier0, true, e60), z2, ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getDateContainerShape(), composer1, 6), ((Color)datePickerColors0.dayContainerColor$material3_release(z, z2, z1, composer1, v1 >> 15 & 0x1C00 | (v1 >> 3 & 14 | v1 >> 9 & 0x70 | v1 >> 3 & 0x380)).getValue()).unbox-impl(), ((Color)datePickerColors0.dayContentColor$material3_release(z3, z, z4, z2, composer1, v1 >> 15 & 14 | v1 & 0x70 | v1 >> 12 & 0x380 | v1 >> 3 & 0x1C00 | v1 >> 12 & 0xE000).getValue()).unbox-impl(), 0.0f, 0.0f, (!z3 || z ? null : BorderStrokeKt.BorderStroke-cXLIe8U(0.0f, datePickerColors0.getTodayDateBorderColor-0d7_KjU())), null, ComposableLambdaKt.rememberComposableLambda(-2031780827, true, new f6(function20), composer1, 54), composer1, v1 >> 3 & 7294, 0x30, 0x580);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g6(modifier0, z, function00, z1, z2, z3, z4, s, datePickerColors0, function20, v));
        }
    }

    public static final void access$DatePickerContent(Long long0, long v, Function1 function10, Function1 function11, CalendarModel calendarModel0, IntRange intRange0, DatePickerFormatter datePickerFormatter0, SelectableDates selectableDates0, DatePickerColors datePickerColors0, Composer composer0, int v1) {
        androidx.compose.ui.Modifier.Companion modifier$Companion1;
        Composer composer1 = composer0.startRestartGroup(-434467002);
        int v2 = (v1 & 6) == 0 ? (composer1.changed(long0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function11) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v2 |= (composer1.changedInstance(calendarModel0) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v1) == 0) {
            v2 |= (composer1.changedInstance(intRange0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v1) == 0) {
            v2 |= (((0x200000 & v1) == 0 ? composer1.changed(datePickerFormatter0) : composer1.changedInstance(datePickerFormatter0)) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v1) == 0) {
            v2 |= (composer1.changed(selectableDates0) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v1) == 0) {
            v2 |= (composer1.changed(datePickerColors0) ? 0x4000000 : 0x2000000);
        }
        if((0x2492493 & v2) != 0x2492492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-434467002, v2, -1, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1485)");
            }
            CalendarMonth calendarMonth0 = calendarModel0.getMonth(v);
            LazyListState lazyListState0 = LazyListStateKt.rememberLazyListState(calendarMonth0.indexIn(intRange0), 0, composer1, 0, 2);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            Object object0 = RememberSaveableKt.rememberSaveable(new Object[0], null, null, m4.A, composer1, 0xC00, 6);
            Locale locale0 = CalendarLocale_androidKt.defaultLocale(composer1, 0);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Arrangement arrangement0 = Arrangement.INSTANCE;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            float f = DatePickerKt.c;
            Modifier modifier1 = PaddingKt.padding-VpY3zN4$default(modifier$Companion0, f, 0.0f, 2, null);
            boolean z = lazyListState0.getCanScrollForward();
            boolean z1 = lazyListState0.getCanScrollBackward();
            boolean z2 = ((Boolean)((MutableState)object0).getValue()).booleanValue();
            String s = datePickerFormatter0.formatMonthYear(v, locale0);
            if(s == null) {
                s = "-";
            }
            boolean z3 = composer1.changedInstance(coroutineScope0);
            boolean z4 = composer1.changed(lazyListState0);
            v5 v50 = composer1.rememberedValue();
            if(z3 || z4) {
                modifier$Companion1 = modifier$Companion0;
                v50 = new v5(coroutineScope0, lazyListState0, 0);
                composer1.updateRememberedValue(v50);
            }
            else {
                modifier$Companion1 = modifier$Companion0;
                if(v50 == composer$Companion0.getEmpty()) {
                    v50 = new v5(coroutineScope0, lazyListState0, 0);
                    composer1.updateRememberedValue(v50);
                }
            }
            boolean z5 = composer1.changedInstance(coroutineScope0);
            boolean z6 = composer1.changed(lazyListState0);
            v5 v51 = composer1.rememberedValue();
            if(z5 || z6 || v51 == composer$Companion0.getEmpty()) {
                v51 = new v5(coroutineScope0, lazyListState0, 1);
                composer1.updateRememberedValue(v51);
            }
            boolean z7 = composer1.changed(((MutableState)object0));
            x5 x50 = composer1.rememberedValue();
            if(z7 || x50 == composer$Companion0.getEmpty()) {
                x50 = new x5(((MutableState)object0), 0);
                composer1.updateRememberedValue(x50);
            }
            DatePickerKt.c(modifier1, z, z1, z2, s, v50, v51, x50, datePickerColors0, composer1, v2 & 0xE000000 | 6);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion1);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function21);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            Modifier modifier3 = PaddingKt.padding-VpY3zN4$default(modifier$Companion1, f, 0.0f, 2, null);
            MeasurePolicy measurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                a.t(v5, composer1, v5, function22);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            DatePickerKt.WeekDays(datePickerColors0, calendarModel0, composer1, v2 >> 24 & 14 | v2 >> 9 & 0x70);
            DatePickerKt.b(lazyListState0, long0, function10, function11, calendarModel0, intRange0, datePickerFormatter0, selectableDates0, datePickerColors0, composer1, v2 << 3 & 0x70 | v2 & 0x380 | v2 & 0x1C00 | 0xE000 & v2 | 0x70000 & v2 | 0x380000 & v2 | 0x1C00000 & v2 | v2 & 0xE000000);
            composer1.endNode();
            AnimatedVisibilityKt.AnimatedVisibility(((Boolean)((MutableState)object0).getValue()).booleanValue(), ClipKt.clipToBounds(modifier$Companion1), EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.6f, 1, null)), EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), null, ComposableLambdaKt.rememberComposableLambda(1193716082, true, new a6(v, ((MutableState)object0), coroutineScope0, lazyListState0, intRange0, calendarMonth0, selectableDates0, calendarModel0, datePickerColors0), composer1, 54), composer1, 0x30DB0, 16);
            composer1.endNode();
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
            scopeUpdateScope0.updateScope(new b6(long0, v, function10, function11, calendarModel0, intRange0, datePickerFormatter0, selectableDates0, datePickerColors0, v1));
        }
    }

    public static final boolean access$DatePickerContent$lambda$8(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$DatePickerContent$lambda$9(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final void access$SwitchableDateEntryContent-d7iavvg(Long long0, long v, int v1, Function1 function10, Function1 function11, CalendarModel calendarModel0, IntRange intRange0, DatePickerFormatter datePickerFormatter0, SelectableDates selectableDates0, DatePickerColors datePickerColors0, Composer composer0, int v2) {
        Composer composer1 = composer0.startRestartGroup(0xCAA198EB);
        int v3 = (v2 & 6) == 0 ? (composer1.changed(long0) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v3 |= (composer1.changed(v1) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v3 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v2 & 0x6000) == 0) {
            v3 |= (composer1.changedInstance(function11) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v2) == 0) {
            v3 |= (composer1.changedInstance(calendarModel0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v2) == 0) {
            v3 |= (composer1.changedInstance(intRange0) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v2) == 0) {
            v3 |= (((0x1000000 & v2) == 0 ? composer1.changed(datePickerFormatter0) : composer1.changedInstance(datePickerFormatter0)) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v2) == 0) {
            v3 |= (composer1.changed(selectableDates0) ? 0x4000000 : 0x2000000);
        }
        if((0x30000000 & v2) == 0) {
            v3 |= (composer1.changed(datePickerColors0) ? 0x20000000 : 0x10000000);
        }
        if((306783379 & v3) != 306783378 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCAA198EB, v3, -1, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1390)");
            }
            int v4 = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).roundToPx-0680j_4(48.0f);
            DisplayMode displayMode0 = DisplayMode.box-impl(v1);
            Modifier modifier0 = SemanticsModifierKt.semantics$default(Modifier.Companion, false, a5.B, 1, null);
            boolean z = composer1.changed(-v4);
            w6 w60 = composer1.rememberedValue();
            if(z || w60 == Composer.Companion.getEmpty()) {
                w60 = new w6(-v4);
                composer1.updateRememberedValue(w60);
            }
            AnimatedContentKt.AnimatedContent(displayMode0, modifier0, w60, null, "DatePickerDisplayModeAnimation", null, ComposableLambdaKt.rememberComposableLambda(0xE49854CB, true, new x6(long0, v, function10, function11, calendarModel0, intRange0, datePickerFormatter0, selectableDates0, datePickerColors0), composer1, 54), composer1, v3 >> 6 & 14 | 0x186000, 40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y6(long0, v, v1, function10, function11, calendarModel0, intRange0, datePickerFormatter0, selectableDates0, datePickerColors0, v2));
        }
    }

    public static final void access$Year(Modifier modifier0, boolean z, boolean z1, Function0 function00, boolean z2, String s, DatePickerColors datePickerColors0, Function2 function20, Composer composer0, int v) {
        BorderStroke borderStroke0;
        Composer composer1 = composer0.startRestartGroup(0xE37F0F0);
        int v1 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (composer1.changed(z2) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (composer1.changed(s) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (composer1.changed(datePickerColors0) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v1) != 4793490 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE37F0F0, v1, -1, "androidx.compose.material3.Year (DatePicker.kt:2077)");
            }
            Object object0 = composer1.rememberedValue();
            if((((v1 & 0x380) == 0x100 ? 1 : 0) | ((v1 & 0x70) == 0x20 ? 1 : 0)) != 0 || object0 == Composer.Companion.getEmpty()) {
                borderStroke0 = !z1 || z ? null : BorderStrokeKt.BorderStroke-cXLIe8U(0.0f, datePickerColors0.getTodayDateBorderColor-0d7_KjU());
                composer1.updateRememberedValue(borderStroke0);
            }
            else {
                borderStroke0 = object0;
            }
            z6 z60 = composer1.rememberedValue();
            if((0x70000 & v1) == 0x20000 || z60 == Composer.Companion.getEmpty()) {
                z60 = new z6(s);
                composer1.updateRememberedValue(z60);
            }
            int v2 = v1 >> 3 & 14;
            SurfaceKt.Surface-d85dljk(z, function00, SemanticsModifierKt.semantics(modifier0, true, z60), z2, ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getSelectionYearStateLayerShape(), composer1, 6), ((Color)datePickerColors0.yearContainerColor$material3_release(z, z2, composer1, v2 | v1 >> 9 & 0x70 | v1 >> 12 & 0x380).getValue()).unbox-impl(), ((Color)datePickerColors0.yearContentColor$material3_release(z1, z, z2, composer1, v1 >> 6 & 14 | v1 & 0x70 | v1 >> 6 & 0x380 | v1 >> 9 & 0x1C00).getValue()).unbox-impl(), 0.0f, 0.0f, borderStroke0, null, ComposableLambdaKt.rememberComposableLambda(0xA23B0D06, true, new a7(function20), composer1, 54), composer1, v2 | v1 >> 6 & 0x70 | v1 >> 3 & 0x1C00, 0x30, 0x580);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b7(modifier0, z, z1, function00, z2, s, datePickerColors0, function20, v));
        }
    }

    public static final void access$YearPicker(Modifier modifier0, long v, Function1 function10, SelectableDates selectableDates0, CalendarModel calendarModel0, IntRange intRange0, DatePickerColors datePickerColors0, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xB34B779C);
        int v2 = (v1 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (composer1.changed(selectableDates0) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v2 |= (composer1.changedInstance(calendarModel0) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v1) == 0) {
            v2 |= (composer1.changedInstance(intRange0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v1) == 0) {
            v2 |= (composer1.changed(datePickerColors0) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v2) != 0x92492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB34B779C, v2, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:1983)");
            }
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getSelectionYearLabelTextFont(), composer1, 6), ComposableLambdaKt.rememberComposableLambda(1301915789, true, new h7(calendarModel0, v, intRange0, datePickerColors0, modifier0, function10, selectableDates0), composer1, 54), composer1, 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i7(modifier0, v, function10, selectableDates0, calendarModel0, intRange0, datePickerColors0, v1));
        }
    }

    public static final void access$YearPickerMenuButton(Function0 function00, boolean z, Modifier modifier0, Function2 function20, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(409654418);
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
            v2 |= (composer1.changed(z) ? 0x20 : 16);
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
            v2 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            modifier1 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(409654418, v2, -1, "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:2187)");
            }
            long v3 = ((Color)composer1.consume(ContentColorKt.getLocalContentColor())).unbox-impl();
            ButtonKt.TextButton(function00, modifier1, false, RoundedCornerShapeKt.getCircleShape(), ButtonDefaults.INSTANCE.textButtonColors-ro_MJ88(0L, v3, 0L, 0L, composer1, 0x6000, 13), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(0x71309FB5, true, new j7(z, function20), composer1, 54), composer1, v2 & 14 | 0x301B0000 | v2 >> 3 & 0x70, 388);
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
            scopeUpdateScope0.updateScope(new y(function00, z, modifier1, function20, v, v1));
        }
    }

    public static final List access$customScrollActions(LazyGridState lazyGridState0, CoroutineScope coroutineScope0, String s, String s1) {
        l7 l70 = new l7(lazyGridState0, coroutineScope0, 1);
        l7 l71 = new l7(lazyGridState0, coroutineScope0, 0);
        return CollectionsKt__CollectionsKt.listOf(new CustomAccessibilityAction[]{new CustomAccessibilityAction(s, l70), new CustomAccessibilityAction(s1, l71)});
    }

    public static final float access$getYearsVerticalPadding$p() [...] // 潜在的解密器

    public static final void b(LazyListState lazyListState0, Long long0, Function1 function10, Function1 function11, CalendarModel calendarModel0, IntRange intRange0, DatePickerFormatter datePickerFormatter0, SelectableDates selectableDates0, DatePickerColors datePickerColors0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x891A68CB);
        int v1 = (v & 6) == 0 ? (composer1.changed(lazyListState0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(long0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changedInstance(function11) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (composer1.changedInstance(calendarModel0) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (composer1.changedInstance(intRange0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (((0x200000 & v) == 0 ? composer1.changed(datePickerFormatter0) : composer1.changedInstance(datePickerFormatter0)) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (composer1.changed(selectableDates0) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v) == 0) {
            v1 |= (composer1.changed(datePickerColors0) ? 0x4000000 : 0x2000000);
        }
        if((0x2492493 & v1) != 0x2492492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x891A68CB, v1, -1, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1636)");
            }
            CalendarDate calendarDate0 = calendarModel0.getToday();
            boolean z = composer1.changed(intRange0);
            CalendarMonth calendarMonth0 = composer1.rememberedValue();
            int v2 = 1;
            if(z || calendarMonth0 == Composer.Companion.getEmpty()) {
                calendarMonth0 = calendarModel0.getMonth(intRange0.getFirst(), 1);
                composer1.updateRememberedValue(calendarMonth0);
            }
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getDateLabelTextFont(), composer1, 6), ComposableLambdaKt.rememberComposableLambda(1504086906, true, new m6(lazyListState0, intRange0, calendarModel0, calendarMonth0, function10, calendarDate0, long0, datePickerFormatter0, selectableDates0, datePickerColors0), composer1, 54), composer1, 0x30);
            if((v1 & 0x1C00) != 0x800) {
                v2 = 0;
            }
            boolean z1 = composer1.changedInstance(calendarModel0);
            boolean z2 = composer1.changedInstance(intRange0);
            n6 n60 = composer1.rememberedValue();
            if((((v1 & 14) == 4 ? 1 : 0) | v2 | z1 | z2) != 0 || n60 == Composer.Companion.getEmpty()) {
                n6 n61 = new n6(lazyListState0, function11, calendarModel0, intRange0, null);
                composer1.updateRememberedValue(n61);
                n60 = n61;
            }
            EffectsKt.LaunchedEffect(lazyListState0, n60, composer1, v1 & 14);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o6(lazyListState0, long0, function10, function11, calendarModel0, intRange0, datePickerFormatter0, selectableDates0, datePickerColors0, v, 0));
        }
    }

    public static final void c(Modifier modifier0, boolean z, boolean z1, boolean z2, String s, Function0 function00, Function0 function01, Function0 function02, DatePickerColors datePickerColors0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xD1DEC6D6);
        int v1 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changed(z2) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (composer1.changed(s) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (composer1.changedInstance(function01) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (composer1.changedInstance(function02) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v) == 0) {
            v1 |= (composer1.changed(datePickerColors0) ? 0x4000000 : 0x2000000);
        }
        if((0x2492493 & v1) != 0x2492492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD1DEC6D6, v1, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:2130)");
            }
            Modifier modifier1 = SizeKt.requiredHeight-3ABfNKs(SizeKt.fillMaxWidth$default(modifier0, 0.0f, 1, null), DatePickerKt.b);
            Horizontal arrangement$Horizontal0 = z2 ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getSpaceBetween();
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement$Horizontal0, Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(datePickerColors0.getNavigationContentColor-0d7_KjU())), ComposableLambdaKt.rememberComposableLambda(-962805198, true, new t6(function02, z2, s, function01, z1, function00, z), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
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
            scopeUpdateScope0.updateScope(new u6(modifier0, z, z1, z2, s, function00, function01, function02, datePickerColors0, v));
        }
    }

    public static final float getDatePickerHorizontalPadding() [...] // 潜在的解密器

    @NotNull
    public static final PaddingValues getDatePickerModeTogglePadding() {
        return DatePickerKt.d;
    }

    public static final float getMonthYearHeight() {
        return DatePickerKt.b;
    }

    public static final float getRecommendedSizeForAccessibility() [...] // 潜在的解密器

    public static final int numberOfMonthsInRange(@NotNull IntRange intRange0) {
        return (intRange0.getLast() - intRange0.getFirst() + 1) * 12;
    }

    @ExperimentalMaterial3Api
    @Composable
    @NotNull
    public static final DatePickerState rememberDatePickerState-EU0dCGE(@Nullable Long long0, @Nullable Long long1, @Nullable IntRange intRange0, int v, @Nullable SelectableDates selectableDates0, @Nullable Composer composer0, int v1, int v2) {
        Long long2 = (v2 & 1) == 0 ? long0 : null;
        Long long3 = (v2 & 2) == 0 ? long1 : long2;
        IntRange intRange1 = (v2 & 4) == 0 ? intRange0 : DatePickerDefaults.INSTANCE.getYearRange();
        int v3 = (v2 & 8) == 0 ? v : 0;
        SelectableDates selectableDates1 = (v2 & 16) == 0 ? selectableDates0 : DatePickerDefaults.INSTANCE.getAllDates();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2065763010, v1, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:364)");
        }
        int v4 = 0;
        Locale locale0 = CalendarLocale_androidKt.defaultLocale(composer0, 0);
        Saver saver0 = q7.g.Saver(selectableDates1, locale0);
        int v5 = ((v1 & 14 ^ 6) <= 4 || !composer0.changed(long2)) && (v1 & 6) != 4 ? 0 : 1;
        int v6 = ((v1 & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(long3)) && (v1 & 0x30) != 0x20 ? 0 : 1;
        boolean z = composer0.changedInstance(intRange1);
        int v7 = ((v1 & 0x1C00 ^ 0xC00) <= 0x800 || !composer0.changed(v3)) && (v1 & 0xC00) != 0x800 ? 0 : 1;
        if((0xE000 & v1 ^ 0x6000) > 0x4000 && composer0.changed(selectableDates1) || (v1 & 0x6000) == 0x4000) {
            v4 = 1;
        }
        boolean z1 = composer0.changedInstance(locale0);
        n7 n70 = composer0.rememberedValue();
        if((v5 | v6 | z | v7 | v4 | z1) != 0 || n70 == Composer.Companion.getEmpty()) {
            n70 = new n7(locale0, long2, long3, intRange1, v3, selectableDates1);
            composer0.updateRememberedValue(n70);
        }
        DatePickerState datePickerState0 = (q7)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, n70, composer0, 0, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return datePickerState0;
    }

    @Nullable
    public static final Object updateDisplayedMonth(@NotNull LazyListState lazyListState0, @NotNull Function1 function10, @NotNull CalendarModel calendarModel0, @NotNull IntRange intRange0, @NotNull Continuation continuation0) {
        Object object0 = SnapshotStateKt.snapshotFlow(new b(lazyListState0, 7)).collect(new o7(0, lazyListState0, function10, calendarModel0, intRange0), continuation0);
        return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

