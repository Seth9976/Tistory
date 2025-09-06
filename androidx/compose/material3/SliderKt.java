package androidx.compose.material3;

import androidx.annotation.IntRange;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.material3.internal.DragGestureDetectorCopyKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R.string;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.room.a;
import ce.e;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000`\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000E\u001A\u007F\u0010\u0013\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0003\u0010\f\u001A\u00020\u000B2\u0010\b\u0002\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u0012\u001A\u00020\u0011H\u0007\u00A2\u0006\u0004\b\u0013\u0010\u0014\u001A\u00B5\u0001\u0010\u0013\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u0010\b\u0002\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u0012\u001A\u00020\u00112\b\b\u0003\u0010\f\u001A\u00020\u000B2\u0019\b\u0002\u0010\u0017\u001A\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002\u00A2\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001A\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002\u00A2\u0006\u0002\b\u00162\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00000\tH\u0007\u00A2\u0006\u0004\b\u0013\u0010\u0019\u001Au\u0010\u0013\u001A\u00020\u00032\u0006\u0010\u001A\u001A\u00020\u00152\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u0012\u001A\u00020\u00112\u0019\b\u0002\u0010\u0017\u001A\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002\u00A2\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001A\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002\u00A2\u0006\u0002\b\u0016H\u0007\u00A2\u0006\u0004\b\u0013\u0010\u001B\u001A\u0081\u0001\u0010\u001C\u001A\u00020\u00032\f\u0010\u0001\u001A\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0003\u0010\f\u001A\u00020\u000B2\u0010\b\u0002\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001A\u00020\u000FH\u0007\u00A2\u0006\u0004\b\u001C\u0010\u001D\u001A\u00E6\u0001\u0010\u001C\u001A\u00020\u00032\f\u0010\u0001\u001A\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00000\t2\u0010\b\u0002\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u001E\u001A\u00020\u00112\b\b\u0002\u0010\u001F\u001A\u00020\u00112\u0019\b\u0002\u0010!\u001A\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002\u00A2\u0006\u0002\b\u00162\u0019\b\u0002\u0010\"\u001A\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002\u00A2\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001A\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002\u00A2\u0006\u0002\b\u00162\b\b\u0003\u0010\f\u001A\u00020\u000BH\u0007\u00A2\u0006\u0004\b\u001C\u0010#\u001A\u009A\u0001\u0010\u001C\u001A\u00020\u00032\u0006\u0010\u001A\u001A\u00020 2\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u001E\u001A\u00020\u00112\b\b\u0002\u0010\u001F\u001A\u00020\u00112\u0019\b\u0002\u0010!\u001A\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002\u00A2\u0006\u0002\b\u00162\u0019\b\u0002\u0010\"\u001A\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002\u00A2\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001A\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002\u00A2\u0006\u0002\b\u0016H\u0007\u00A2\u0006\u0004\b\u001C\u0010$\u001A\u001F\u0010(\u001A\u00020\'2\u0006\u0010%\u001A\u00020\u00002\u0006\u0010&\u001A\u00020\u0000H\u0001\u00A2\u0006\u0004\b(\u0010)\u001A\u001D\u0010(\u001A\u00020\'2\f\u0010*\u001A\b\u0012\u0004\u0012\u00020\u00000\tH\u0001\u00A2\u0006\u0004\b(\u0010+\"\u001A\u00101\u001A\u00020,8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u00100\"\u001A\u00104\u001A\u00020,8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b2\u0010.\u001A\u0004\b3\u00100\"\u001E\u00109\u001A\u00020\u0007*\u00020\'8@X\u0081\u0004\u00A2\u0006\f\u0012\u0004\b7\u00108\u001A\u0004\b5\u00106\u00A8\u0006:"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lkotlin/ranges/ClosedFloatingPointRange;", "valueRange", "", "steps", "Lkotlin/Function0;", "onValueChangeFinished", "Landroidx/compose/material3/SliderColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Slider", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/SliderState;", "Landroidx/compose/runtime/Composable;", "thumb", "track", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;ILkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/Composer;III)V", "state", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "RangeSlider", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/runtime/Composer;II)V", "startInteractionSource", "endInteractionSource", "Landroidx/compose/material3/RangeSliderState;", "startThumb", "endThumb", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "start", "endInclusive", "Landroidx/compose/material3/SliderRange;", "SliderRange", "(FF)J", "range", "(Lkotlin/ranges/ClosedFloatingPointRange;)J", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getTrackHeight", "()F", "TrackHeight", "b", "getThumbWidth", "ThumbWidth", "isSpecified-If1S1O4", "(J)Z", "isSpecified-If1S1O4$annotations", "(J)V", "isSpecified", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 10 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 11 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2263:1\n1223#2,6:2264\n1223#2,6:2270\n1223#2,6:2276\n1223#2,6:2282\n1223#2,6:2289\n1223#2,6:2295\n1223#2,6:2301\n1223#2,6:2307\n1223#2,6:2313\n1223#2,6:2319\n1223#2,6:2325\n1223#2,6:2331\n1223#2,6:2338\n1223#2,6:2344\n1223#2,6:2378\n1223#2,6:2470\n1223#2,6:2504\n1223#2,6:2510\n1223#2,6:2556\n1223#2,6:2562\n1#3:2288\n77#4:2337\n77#4:2467\n78#5,6:2350\n85#5,4:2365\n89#5,2:2375\n78#5,6:2391\n85#5,4:2406\n89#5,2:2416\n93#5:2422\n78#5,6:2431\n85#5,4:2446\n89#5,2:2456\n93#5:2462\n93#5:2466\n78#5,6:2476\n85#5,4:2491\n89#5,2:2501\n78#5,6:2523\n85#5,4:2538\n89#5,2:2548\n93#5:2554\n78#5,6:2575\n85#5,4:2590\n89#5,2:2600\n93#5:2606\n78#5,6:2615\n85#5,4:2630\n89#5,2:2640\n93#5:2646\n93#5:2650\n368#6,9:2356\n377#6:2377\n368#6,9:2397\n377#6:2418\n378#6,2:2420\n368#6,9:2437\n377#6:2458\n378#6,2:2460\n378#6,2:2464\n368#6,9:2482\n377#6:2503\n368#6,9:2529\n377#6:2550\n378#6,2:2552\n368#6,9:2581\n377#6:2602\n378#6,2:2604\n368#6,9:2621\n377#6:2642\n378#6,2:2644\n378#6,2:2648\n4032#7,6:2369\n4032#7,6:2410\n4032#7,6:2450\n4032#7,6:2495\n4032#7,6:2542\n4032#7,6:2594\n4032#7,6:2634\n71#8:2384\n68#8,6:2385\n74#8:2419\n78#8:2423\n71#8:2424\n68#8,6:2425\n74#8:2459\n78#8:2463\n71#8:2516\n68#8,6:2517\n74#8:2551\n78#8:2555\n71#8:2568\n68#8,6:2569\n74#8:2603\n78#8:2607\n71#8:2608\n68#8,6:2609\n74#8:2643\n78#8:2647\n57#9:2468\n60#9:2469\n16867#10,14:2651\n63#11,3:2665\n63#11,3:2668\n148#12:2671\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt\n*L\n169#1:2264,6\n258#1:2270,6\n273#1:2276,6\n341#1:2282,6\n411#1:2289,6\n412#1:2295,6\n513#1:2301,6\n514#1:2307,6\n539#1:2313,6\n550#1:2319,6\n618#1:2325,6\n619#1:2331,6\n674#1:2338,6\n699#1:2344,6\n683#1:2378,6\n785#1:2470,6\n756#1:2504,6\n758#1:2510,6\n769#1:2556,6\n771#1:2562,6\n666#1:2337\n737#1:2467\n679#1:2350,6\n679#1:2365,4\n679#1:2375,2\n681#1:2391,6\n681#1:2406,4\n681#1:2416,2\n681#1:2422\n689#1:2431,6\n689#1:2446,4\n689#1:2456,2\n689#1:2462\n679#1:2466\n750#1:2476,6\n750#1:2491,4\n750#1:2501,2\n752#1:2523,6\n752#1:2538,4\n752#1:2548,2\n752#1:2554\n765#1:2575,6\n765#1:2590,4\n765#1:2600,2\n765#1:2606\n778#1:2615,6\n778#1:2630,4\n778#1:2640,2\n778#1:2646\n750#1:2650\n679#1:2356,9\n679#1:2377\n681#1:2397,9\n681#1:2418\n681#1:2420,2\n689#1:2437,9\n689#1:2458\n689#1:2460,2\n679#1:2464,2\n750#1:2482,9\n750#1:2503\n752#1:2529,9\n752#1:2550\n752#1:2552,2\n765#1:2581,9\n765#1:2602\n765#1:2604,2\n778#1:2621,9\n778#1:2642\n778#1:2644,2\n750#1:2648,2\n679#1:2369,6\n681#1:2410,6\n689#1:2450,6\n750#1:2495,6\n752#1:2542,6\n765#1:2594,6\n778#1:2634,6\n681#1:2384\n681#1:2385,6\n681#1:2419\n681#1:2423\n689#1:2424\n689#1:2425,6\n689#1:2459\n689#1:2463\n752#1:2516\n752#1:2517,6\n752#1:2551\n752#1:2555\n765#1:2568\n765#1:2569,6\n765#1:2603\n765#1:2607\n778#1:2608\n778#1:2609,6\n778#1:2643\n778#1:2647\n747#1:2468\n748#1:2469\n1413#1:2651,14\n2238#1:2665,3\n2256#1:2668,3\n1869#1:2671\n*E\n"})
public final class SliderKt {
    public static final float a;
    public static final float b;
    public static final long c;
    public static final float d;
    public static final float e;

    static {
        SliderKt.a = 0.0f;
        SliderKt.b = 0.0f;
        SliderKt.c = DpKt.DpSize-YgX7TsA(0.0f, 0.0f);
        SliderKt.d = 0.0f;
        SliderKt.e = 2.0f;
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void RangeSlider(@NotNull RangeSliderState rangeSliderState0, @Nullable Modifier modifier0, boolean z, @Nullable SliderColors sliderColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable MutableInteractionSource mutableInteractionSource1, @Nullable Function3 function30, @Nullable Function3 function31, @Nullable Function3 function32, @Nullable Composer composer0, int v, int v1) {
        Function3 function38;
        MutableInteractionSource mutableInteractionSource5;
        MutableInteractionSource mutableInteractionSource4;
        SliderColors sliderColors2;
        int v3;
        Function3 function37;
        Function3 function36;
        boolean z2;
        Modifier modifier2;
        Function3 function35;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource2;
        SliderColors sliderColors1;
        Function3 function34;
        Function3 function33;
        boolean z1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(511405654);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(rangeSliderState0) ? 4 : 2) | v : v;
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
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v2 |= ((v1 & 8) != 0 || !composer1.changed(sliderColors0) ? 0x400 : 0x800);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource1) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changedInstance(function31) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changedInstance(function32) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x2492493) == 0x2492492 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z1 = z;
            function33 = function30;
            function34 = function32;
            sliderColors1 = sliderColors0;
            mutableInteractionSource2 = mutableInteractionSource0;
            mutableInteractionSource3 = mutableInteractionSource1;
            function35 = function31;
        }
        else {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                z2 = (v1 & 4) == 0 ? z : true;
                if((v1 & 8) == 0) {
                    sliderColors2 = sliderColors0;
                }
                else {
                    sliderColors2 = SliderDefaults.INSTANCE.colors(composer1, 6);
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) == 0) {
                    mutableInteractionSource4 = mutableInteractionSource0;
                }
                else {
                    MutableInteractionSource mutableInteractionSource6 = composer1.rememberedValue();
                    if(mutableInteractionSource6 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource6 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource6);
                    }
                    mutableInteractionSource4 = mutableInteractionSource6;
                }
                if((v1 & 0x20) == 0) {
                    mutableInteractionSource5 = mutableInteractionSource1;
                }
                else {
                    MutableInteractionSource mutableInteractionSource7 = composer1.rememberedValue();
                    if(mutableInteractionSource7 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource7 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource7);
                    }
                    mutableInteractionSource5 = mutableInteractionSource7;
                }
                Function3 function39 = (v1 & 0x40) == 0 ? function30 : ComposableLambdaKt.rememberComposableLambda(0x704EB24B, true, new uk(mutableInteractionSource4, sliderColors2, z2, 0), composer1, 54);
                Function3 function310 = (v1 & 0x80) == 0 ? function31 : ComposableLambdaKt.rememberComposableLambda(1016457138, true, new uk(mutableInteractionSource5, sliderColors2, z2, 1), composer1, 54);
                if((v1 & 0x100) == 0) {
                    function37 = function310;
                    v3 = v2;
                    function36 = function39;
                    function38 = function32;
                }
                else {
                    v3 = v2;
                    function38 = ComposableLambdaKt.rememberComposableLambda(0x9F98CFE2, true, new vk(0, sliderColors2, z2), composer1, 54);
                    function37 = function310;
                    function36 = function39;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                modifier2 = modifier0;
                z2 = z;
                function36 = function30;
                function37 = function31;
                v3 = v2;
                sliderColors2 = sliderColors0;
                mutableInteractionSource4 = mutableInteractionSource0;
                mutableInteractionSource5 = mutableInteractionSource1;
                function38 = function32;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(511405654, v3, -1, "androidx.compose.material3.RangeSlider (Slider.kt:640)");
            }
            if(rangeSliderState0.getSteps() < 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            SliderKt.a(modifier2, rangeSliderState0, z2, mutableInteractionSource4, mutableInteractionSource5, function36, function37, function38, composer1, v3 & 0x380 | (v3 >> 3 & 14 | v3 << 3 & 0x70) | v3 >> 3 & 0x1C00 | 0xE000 & v3 >> 3 | 0x70000 & v3 >> 3 | 0x380000 & v3 >> 3 | v3 >> 3 & 0x1C00000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource2 = mutableInteractionSource4;
            function35 = function37;
            modifier1 = modifier2;
            sliderColors1 = sliderColors2;
            function33 = function36;
            function34 = function38;
            z1 = z2;
            mutableInteractionSource3 = mutableInteractionSource5;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y(rangeSliderState0, modifier1, z1, sliderColors1, mutableInteractionSource2, mutableInteractionSource3, function33, function35, function34, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void RangeSlider(@NotNull ClosedFloatingPointRange closedFloatingPointRange0, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z, @Nullable ClosedFloatingPointRange closedFloatingPointRange1, @IntRange(from = 0L) int v, @Nullable Function0 function00, @Nullable SliderColors sliderColors0, @Nullable Composer composer0, int v1, int v2) {
        SliderColors sliderColors1;
        Function0 function02;
        int v6;
        ClosedFloatingPointRange closedFloatingPointRange3;
        boolean z2;
        Modifier modifier2;
        SliderColors sliderColors2;
        Function0 function01;
        int v5;
        int v4;
        ClosedFloatingPointRange closedFloatingPointRange2;
        boolean z1;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-743091416);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changed(closedFloatingPointRange0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v1 & 0x180) == 0) {
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
        else if((v1 & 0xC00) == 0) {
            z1 = z;
            v3 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v1 & 0x6000) == 0) {
            if((v2 & 16) == 0) {
                closedFloatingPointRange2 = closedFloatingPointRange1;
                v4 = composer1.changed(closedFloatingPointRange2) ? 0x4000 : 0x2000;
            }
            else {
                closedFloatingPointRange2 = closedFloatingPointRange1;
                v4 = 0x2000;
            }
            v3 |= v4;
        }
        else {
            closedFloatingPointRange2 = closedFloatingPointRange1;
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
            v5 = v;
        }
        else if((0x30000 & v1) == 0) {
            v5 = v;
            v3 |= (composer1.changed(v5) ? 0x20000 : 0x10000);
        }
        else {
            v5 = v;
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
            function01 = function00;
        }
        else if((0x180000 & v1) == 0) {
            function01 = function00;
            v3 |= (composer1.changedInstance(function01) ? 0x100000 : 0x80000);
        }
        else {
            function01 = function00;
        }
        if((v1 & 0xC00000) == 0) {
            v3 |= ((v2 & 0x80) != 0 || !composer1.changed(sliderColors0) ? 0x400000 : 0x800000);
        }
        if((v3 & 0x492493) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v2 & 4) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v2 & 8) != 0) {
                    z1 = true;
                }
                if((v2 & 16) != 0) {
                    v3 &= 0xFFFF1FFF;
                    closedFloatingPointRange2 = e.rangeTo(0.0f, 1.0f);
                }
                if((v2 & 0x20) != 0) {
                    v5 = 0;
                }
                if((v2 & 0x40) != 0) {
                    function01 = null;
                }
                if((v2 & 0x80) == 0) {
                    sliderColors2 = sliderColors0;
                }
                else {
                    v3 &= 0xFE3FFFFF;
                    sliderColors2 = SliderDefaults.INSTANCE.colors(composer1, 6);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 16) != 0) {
                    v3 &= 0xFFFF1FFF;
                }
                if((v2 & 0x80) != 0) {
                    v3 &= 0xFE3FFFFF;
                }
                sliderColors2 = sliderColors0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-743091416, v3, -1, "androidx.compose.material3.RangeSlider (Slider.kt:409)");
            }
            MutableInteractionSource mutableInteractionSource0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableInteractionSource0 == composer$Companion0.getEmpty()) {
                mutableInteractionSource0 = InteractionSourceKt.MutableInteractionSource();
                composer1.updateRememberedValue(mutableInteractionSource0);
            }
            MutableInteractionSource mutableInteractionSource1 = composer1.rememberedValue();
            if(mutableInteractionSource1 == composer$Companion0.getEmpty()) {
                mutableInteractionSource1 = InteractionSourceKt.MutableInteractionSource();
                composer1.updateRememberedValue(mutableInteractionSource1);
            }
            SliderKt.RangeSlider(closedFloatingPointRange0, function10, modifier1, z1, closedFloatingPointRange2, function01, null, mutableInteractionSource0, mutableInteractionSource1, ComposableLambdaKt.rememberComposableLambda(0xCFA03A4B, true, new uk(mutableInteractionSource0, sliderColors2, z1, 2), composer1, 54), ComposableLambdaKt.rememberComposableLambda(-1832060001, true, new uk(mutableInteractionSource1, sliderColors2, z1, 3), composer1, 54), ComposableLambdaKt.rememberComposableLambda(377064480, true, new vk(1, sliderColors2, z1), composer1, 54), v5, composer1, v3 & 14 | 0x36C00000 | v3 & 0x70 | v3 & 0x380 | v3 & 0x1C00 | 0xE000 & v3 | v3 >> 3 & 0x70000, v3 >> 9 & 0x380 | 54, 0x40);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z1;
            sliderColors1 = sliderColors2;
            function02 = function01;
            closedFloatingPointRange3 = closedFloatingPointRange2;
            v6 = v5;
            modifier2 = modifier1;
        }
        else {
            composer1.skipToGroupEnd();
            modifier2 = modifier1;
            z2 = z1;
            closedFloatingPointRange3 = closedFloatingPointRange2;
            v6 = v5;
            function02 = function01;
            sliderColors1 = sliderColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new wk(closedFloatingPointRange0, function10, modifier2, z2, closedFloatingPointRange3, v6, function02, sliderColors1, v1, v2, 0));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void RangeSlider(@NotNull ClosedFloatingPointRange closedFloatingPointRange0, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z, @Nullable ClosedFloatingPointRange closedFloatingPointRange1, @Nullable Function0 function00, @Nullable SliderColors sliderColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable MutableInteractionSource mutableInteractionSource1, @Nullable Function3 function30, @Nullable Function3 function31, @Nullable Function3 function32, @IntRange(from = 0L) int v, @Nullable Composer composer0, int v1, int v2, int v3) {
        int v7;
        Function3 function35;
        Function3 function34;
        Function3 function33;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource2;
        SliderColors sliderColors1;
        Function0 function01;
        ClosedFloatingPointRange closedFloatingPointRange2;
        boolean z1;
        Modifier modifier1;
        SliderColors sliderColors3;
        int v8;
        Function3 function37;
        Function3 function36;
        MutableInteractionSource mutableInteractionSource5;
        MutableInteractionSource mutableInteractionSource4;
        SliderColors sliderColors2;
        Function0 function02;
        ClosedFloatingPointRange closedFloatingPointRange3;
        boolean z2;
        Modifier modifier2;
        Function3 function38;
        int v9;
        MutableInteractionSource mutableInteractionSource9;
        MutableInteractionSource mutableInteractionSource7;
        Function0 function04;
        ClosedFloatingPointRange closedFloatingPointRange4;
        Modifier modifier4;
        int v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(-1048796133);
        if((v3 & 1) == 0) {
            v4 = (v1 & 6) == 0 ? (composer1.changed(closedFloatingPointRange0) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v4 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v4 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v4 |= ((v3 & 16) != 0 || !composer1.changed(closedFloatingPointRange1) ? 0x2000 : 0x4000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v1 & 0x30000) == 0) {
            v4 |= (composer1.changedInstance(function00) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x180000) == 0) {
            v4 |= ((v3 & 0x40) != 0 || !composer1.changed(sliderColors0) ? 0x80000 : 0x100000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v1 & 0xC00000) == 0) {
            v4 |= (composer1.changed(mutableInteractionSource0) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v1 & 0x6000000) == 0) {
            v4 |= (composer1.changed(mutableInteractionSource1) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((v1 & 0x30000000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) == 0) {
            v5 = (v2 & 6) == 0 ? v2 | (composer1.changedInstance(function31) ? 4 : 2) : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v3 & 0x800) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v5 |= (composer1.changedInstance(function32) ? 0x20 : 16);
        }
        int v6 = v5;
        if((v3 & 0x1000) != 0) {
            v6 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v6 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v4 & 306783379) != 306783378 || (v6 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
                z2 = (v3 & 8) == 0 ? z : true;
                if((v3 & 16) == 0) {
                    modifier4 = modifier3;
                    closedFloatingPointRange4 = closedFloatingPointRange1;
                }
                else {
                    modifier4 = modifier3;
                    closedFloatingPointRange4 = e.rangeTo(0.0f, 1.0f);
                    v4 &= 0xFFFF1FFF;
                }
                Function0 function03 = (v3 & 0x20) == 0 ? function00 : null;
                if((v3 & 0x40) == 0) {
                    function04 = function03;
                    sliderColors2 = sliderColors0;
                }
                else {
                    function04 = function03;
                    sliderColors2 = SliderDefaults.INSTANCE.colors(composer1, 6);
                    v4 &= 0xFFC7FFFF;
                }
                if((v3 & 0x80) == 0) {
                    mutableInteractionSource7 = mutableInteractionSource0;
                }
                else {
                    MutableInteractionSource mutableInteractionSource6 = composer1.rememberedValue();
                    if(mutableInteractionSource6 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource6 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource6);
                    }
                    mutableInteractionSource7 = mutableInteractionSource6;
                }
                if((v3 & 0x100) == 0) {
                    mutableInteractionSource9 = mutableInteractionSource1;
                }
                else {
                    MutableInteractionSource mutableInteractionSource8 = composer1.rememberedValue();
                    if(mutableInteractionSource8 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource8 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource8);
                    }
                    mutableInteractionSource9 = mutableInteractionSource8;
                }
                if((v3 & 0x200) == 0) {
                    v9 = v4;
                    mutableInteractionSource4 = mutableInteractionSource7;
                    function38 = function30;
                }
                else {
                    v9 = v4;
                    mutableInteractionSource4 = mutableInteractionSource7;
                    function38 = ComposableLambdaKt.rememberComposableLambda(-1963073082, true, new uk(mutableInteractionSource7, sliderColors2, z2, 4), composer1, 54);
                }
                Function3 function39 = (v3 & 0x400) == 0 ? function31 : ComposableLambdaKt.rememberComposableLambda(1908709951, true, new uk(mutableInteractionSource9, sliderColors2, z2, 5), composer1, 54);
                Function3 function310 = (v3 & 0x800) == 0 ? function32 : ComposableLambdaKt.rememberComposableLambda(0xE66B080F, true, new vk(2, sliderColors2, z2), composer1, 54);
                v4 = v9;
                if((v3 & 0x1000) == 0) {
                    v8 = v;
                    function36 = function38;
                    function37 = function39;
                    function35 = function310;
                }
                else {
                    function36 = function38;
                    function37 = function39;
                    function35 = function310;
                    v8 = 0;
                }
                closedFloatingPointRange3 = closedFloatingPointRange4;
                function02 = function04;
                mutableInteractionSource5 = mutableInteractionSource9;
                modifier2 = modifier4;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x40) != 0) {
                    v4 &= 0xFFC7FFFF;
                }
                modifier2 = modifier0;
                z2 = z;
                closedFloatingPointRange3 = closedFloatingPointRange1;
                function02 = function00;
                sliderColors2 = sliderColors0;
                mutableInteractionSource4 = mutableInteractionSource0;
                mutableInteractionSource5 = mutableInteractionSource1;
                function36 = function30;
                function37 = function31;
                function35 = function32;
                v8 = v;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                sliderColors3 = sliderColors2;
                ComposerKt.traceEventStart(-1048796133, v4, v6, "androidx.compose.material3.RangeSlider (Slider.kt:536)");
            }
            else {
                sliderColors3 = sliderColors2;
            }
            int v10 = ((0xE000 & v4 ^ 0x6000) <= 0x4000 || !composer1.changed(closedFloatingPointRange3)) && (v4 & 0x6000) != 0x4000 ? 0 : 1;
            RangeSliderState rangeSliderState0 = composer1.rememberedValue();
            if((((v6 & 0x380) == 0x100 ? 1 : 0) | v10) != 0 || rangeSliderState0 == Composer.Companion.getEmpty()) {
                rangeSliderState0 = new RangeSliderState(((Number)closedFloatingPointRange0.getStart()).floatValue(), ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue(), v8, function02, closedFloatingPointRange3);
                composer1.updateRememberedValue(rangeSliderState0);
            }
            rangeSliderState0.setOnValueChangeFinished(function02);
            ti ti0 = composer1.rememberedValue();
            if((v4 & 0x70) == 0x20 || ti0 == Composer.Companion.getEmpty()) {
                ti0 = new ti(function10, 1);
                composer1.updateRememberedValue(ti0);
            }
            rangeSliderState0.setOnValueChange$material3_release(ti0);
            rangeSliderState0.setActiveRangeStart(((Number)closedFloatingPointRange0.getStart()).floatValue());
            rangeSliderState0.setActiveRangeEnd(((Number)closedFloatingPointRange0.getEndInclusive()).floatValue());
            SliderKt.RangeSlider(rangeSliderState0, modifier2, z2, null, mutableInteractionSource4, mutableInteractionSource5, function36, function37, function35, composer1, v4 >> 9 & 0x380000 | (v4 >> 3 & 0x3F0 | 0xE000 & v4 >> 9 | 0x70000 & v4 >> 9) | 0x1C00000 & v6 << 21 | v6 << 21 & 0xE000000, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function01 = function02;
            z1 = z2;
            mutableInteractionSource2 = mutableInteractionSource4;
            v7 = v8;
            sliderColors1 = sliderColors3;
            function34 = function37;
            function33 = function36;
            mutableInteractionSource3 = mutableInteractionSource5;
            closedFloatingPointRange2 = closedFloatingPointRange3;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z1 = z;
            closedFloatingPointRange2 = closedFloatingPointRange1;
            function01 = function00;
            sliderColors1 = sliderColors0;
            mutableInteractionSource2 = mutableInteractionSource0;
            mutableInteractionSource3 = mutableInteractionSource1;
            function33 = function30;
            function34 = function31;
            function35 = function32;
            v7 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new tk(closedFloatingPointRange0, function10, modifier1, z1, closedFloatingPointRange2, function01, sliderColors1, mutableInteractionSource2, mutableInteractionSource3, function33, function34, function35, v7, v1, v2, v3));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void Slider(float f, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z, @Nullable Function0 function00, @Nullable SliderColors sliderColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @IntRange(from = 0L) int v, @Nullable Function3 function30, @Nullable Function3 function31, @Nullable ClosedFloatingPointRange closedFloatingPointRange0, @Nullable Composer composer0, int v1, int v2, int v3) {
        MutableInteractionSource mutableInteractionSource1;
        SliderColors sliderColors1;
        Function0 function01;
        ClosedFloatingPointRange closedFloatingPointRange1;
        Function3 function33;
        Function3 function32;
        int v6;
        boolean z1;
        Modifier modifier1;
        SliderColors sliderColors3;
        Function3 function35;
        int v10;
        int v9;
        SliderColors sliderColors2;
        Function0 function02;
        ClosedFloatingPointRange closedFloatingPointRange2;
        Function3 function34;
        int v8;
        boolean z2;
        Function3 function36;
        int v12;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x46FFD149);
        if((v3 & 1) == 0) {
            v4 = (v1 & 6) == 0 ? (composer1.changed(f) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v4 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v4 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            v4 |= (composer1.changedInstance(function00) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v1) == 0) {
            v4 |= ((v3 & 0x20) != 0 || !composer1.changed(sliderColors0) ? 0x10000 : 0x20000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x180000) == 0) {
            v4 |= (composer1.changed(mutableInteractionSource0) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v1 & 0xC00000) == 0) {
            v4 |= (composer1.changed(v) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v1 & 0x6000000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((v1 & 0x30000000) == 0) {
            v4 |= (composer1.changedInstance(function31) ? 0x20000000 : 0x10000000);
        }
        int v5 = (v2 & 6) == 0 ? v2 | ((v3 & 0x400) != 0 || !composer1.changed(closedFloatingPointRange0) ? 2 : 4) : v2;
        if((v4 & 306783379) != 306783378 || (v5 & 3) != 2 || !composer1.getSkipping()) {
            composer1.startDefaults();
            int v7 = 0;
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
                z2 = (v3 & 8) == 0 ? z : true;
                function02 = (v3 & 16) == 0 ? function00 : null;
                if((v3 & 0x20) == 0) {
                    sliderColors2 = sliderColors0;
                }
                else {
                    sliderColors2 = SliderDefaults.INSTANCE.colors(composer1, 6);
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x40) == 0) {
                    mutableInteractionSource1 = mutableInteractionSource0;
                }
                else {
                    MutableInteractionSource mutableInteractionSource2 = composer1.rememberedValue();
                    if(mutableInteractionSource2 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource2 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource2);
                    }
                    mutableInteractionSource1 = mutableInteractionSource2;
                }
                int v11 = (v3 & 0x80) == 0 ? v : 0;
                if((v3 & 0x100) == 0) {
                    v12 = v11;
                    function36 = function30;
                }
                else {
                    v12 = v11;
                    function36 = ComposableLambdaKt.rememberComposableLambda(0x97509619, true, new uk(mutableInteractionSource1, sliderColors2, z2, 8), composer1, 54);
                }
                function34 = (v3 & 0x200) == 0 ? function31 : ComposableLambdaKt.rememberComposableLambda(2083675534, true, new vk(5, sliderColors2, z2), composer1, 54);
                if((v3 & 0x400) == 0) {
                    closedFloatingPointRange2 = closedFloatingPointRange0;
                }
                else {
                    closedFloatingPointRange2 = e.rangeTo(0.0f, 1.0f);
                    v5 &= -15;
                }
                v10 = v4;
                v9 = v5;
                function35 = function36;
                v8 = v12;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x400) != 0) {
                    v5 &= -15;
                }
                modifier1 = modifier0;
                z2 = z;
                v8 = v;
                function34 = function31;
                closedFloatingPointRange2 = closedFloatingPointRange0;
                function02 = function00;
                sliderColors2 = sliderColors0;
                v9 = v5;
                mutableInteractionSource1 = mutableInteractionSource0;
                v10 = v4;
                function35 = function30;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                sliderColors3 = sliderColors2;
                ComposerKt.traceEventStart(0x46FFD149, v10, v9, "androidx.compose.material3.Slider (Slider.kt:270)");
            }
            else {
                sliderColors3 = sliderColors2;
            }
            if((v9 & 14 ^ 6) > 4 && composer1.changed(closedFloatingPointRange2) || (v9 & 6) == 4) {
                v7 = 1;
            }
            SliderState sliderState0 = composer1.rememberedValue();
            if((((0x1C00000 & v10) == 0x800000 ? 1 : 0) | v7) != 0 || sliderState0 == Composer.Companion.getEmpty()) {
                sliderState0 = new SliderState(f, v8, function02, closedFloatingPointRange2);
                composer1.updateRememberedValue(sliderState0);
            }
            sliderState0.setOnValueChangeFinished(function02);
            sliderState0.setOnValueChange$material3_release(function10);
            sliderState0.setValue(f);
            SliderKt.Slider(sliderState0, modifier1, z2, null, mutableInteractionSource1, function35, function34, composer1, v10 >> 3 & 0x3F0 | v10 >> 6 & 0xE000 | 0x70000 & v10 >> 9 | v10 >> 9 & 0x380000, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function33 = function34;
            closedFloatingPointRange1 = closedFloatingPointRange2;
            function01 = function02;
            sliderColors1 = sliderColors3;
            function32 = function35;
            z1 = z2;
            v6 = v8;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z1 = z;
            v6 = v;
            function32 = function30;
            function33 = function31;
            closedFloatingPointRange1 = closedFloatingPointRange0;
            function01 = function00;
            sliderColors1 = sliderColors0;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new bl(f, function10, modifier1, z1, function01, sliderColors1, mutableInteractionSource1, v6, function32, function33, closedFloatingPointRange1, v1, v2, v3));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Slider(float f, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z, @Nullable ClosedFloatingPointRange closedFloatingPointRange0, @IntRange(from = 0L) int v, @Nullable Function0 function00, @Nullable SliderColors sliderColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v1, int v2) {
        MutableInteractionSource mutableInteractionSource1;
        SliderColors sliderColors1;
        Function0 function02;
        int v6;
        ClosedFloatingPointRange closedFloatingPointRange2;
        boolean z2;
        Modifier modifier2;
        SliderColors sliderColors2;
        Function0 function03;
        int v8;
        int v7;
        MutableInteractionSource mutableInteractionSource2;
        SliderColors sliderColors3;
        Function0 function01;
        int v5;
        int v4;
        ClosedFloatingPointRange closedFloatingPointRange1;
        boolean z1;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-202044027);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changed(f) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v1 & 0x180) == 0) {
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
        else if((v1 & 0xC00) == 0) {
            z1 = z;
            v3 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v1 & 0x6000) == 0) {
            if((v2 & 16) == 0) {
                closedFloatingPointRange1 = closedFloatingPointRange0;
                v4 = composer1.changed(closedFloatingPointRange1) ? 0x4000 : 0x2000;
            }
            else {
                closedFloatingPointRange1 = closedFloatingPointRange0;
                v4 = 0x2000;
            }
            v3 |= v4;
        }
        else {
            closedFloatingPointRange1 = closedFloatingPointRange0;
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
            v5 = v;
        }
        else if((0x30000 & v1) == 0) {
            v5 = v;
            v3 |= (composer1.changed(v5) ? 0x20000 : 0x10000);
        }
        else {
            v5 = v;
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
            function01 = function00;
        }
        else if((0x180000 & v1) == 0) {
            function01 = function00;
            v3 |= (composer1.changedInstance(function01) ? 0x100000 : 0x80000);
        }
        else {
            function01 = function00;
        }
        if((v1 & 0xC00000) == 0) {
            v3 |= ((v2 & 0x80) != 0 || !composer1.changed(sliderColors0) ? 0x400000 : 0x800000);
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x6000000;
        }
        else if((v1 & 0x6000000) == 0) {
            v3 |= (composer1.changed(mutableInteractionSource0) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v2 & 4) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v2 & 8) != 0) {
                    z1 = true;
                }
                if((v2 & 16) != 0) {
                    v3 &= 0xFFFF1FFF;
                    closedFloatingPointRange1 = e.rangeTo(0.0f, 1.0f);
                }
                if((v2 & 0x20) != 0) {
                    v5 = 0;
                }
                if((v2 & 0x40) != 0) {
                    function01 = null;
                }
                if((v2 & 0x80) == 0) {
                    sliderColors3 = sliderColors0;
                }
                else {
                    sliderColors3 = SliderDefaults.INSTANCE.colors(composer1, 6);
                    v3 &= 0xFE3FFFFF;
                }
                if((v2 & 0x100) == 0) {
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
                v7 = v3;
                v8 = v5;
                sliderColors2 = sliderColors3;
                function03 = function01;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 16) != 0) {
                    v3 &= 0xFFFF1FFF;
                }
                if((v2 & 0x80) != 0) {
                    v3 &= 0xFE3FFFFF;
                }
                mutableInteractionSource2 = mutableInteractionSource0;
                v7 = v3;
                v8 = v5;
                function03 = function01;
                sliderColors2 = sliderColors0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-202044027, v7, -1, "androidx.compose.material3.Slider (Slider.kt:169)");
            }
            SliderKt.Slider(f, function10, modifier1, z1, function03, sliderColors2, mutableInteractionSource2, v8, ComposableLambdaKt.rememberComposableLambda(308249025, true, new uk(mutableInteractionSource2, sliderColors2, z1, 7), composer1, 54), ComposableLambdaKt.rememberComposableLambda(-1843234110, true, new vk(4, sliderColors2, z1), composer1, 54), closedFloatingPointRange1, composer1, v7 & 14 | 0x36000000 | v7 & 0x70 | v7 & 0x380 | v7 & 0x1C00 | 0xE000 & v7 >> 6 | 0x70000 & v7 >> 6 | v7 >> 6 & 0x380000 | v7 << 6 & 0x1C00000, v7 >> 12 & 14, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function02 = function03;
            z2 = z1;
            sliderColors1 = sliderColors2;
            modifier2 = modifier1;
            v6 = v8;
            mutableInteractionSource1 = mutableInteractionSource2;
            closedFloatingPointRange2 = closedFloatingPointRange1;
        }
        else {
            composer1.skipToGroupEnd();
            modifier2 = modifier1;
            z2 = z1;
            closedFloatingPointRange2 = closedFloatingPointRange1;
            v6 = v5;
            function02 = function01;
            sliderColors1 = sliderColors0;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new al(f, function10, modifier2, z2, closedFloatingPointRange2, v6, function02, sliderColors1, mutableInteractionSource1, v1, v2));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void Slider(@NotNull SliderState sliderState0, @Nullable Modifier modifier0, boolean z, @Nullable SliderColors sliderColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Function3 function30, @Nullable Function3 function31, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier2;
        int v4;
        Function3 function36;
        MutableInteractionSource mutableInteractionSource4;
        SliderColors sliderColors3;
        Function3 function35;
        Function3 function34;
        Function3 function33;
        MutableInteractionSource mutableInteractionSource2;
        SliderColors sliderColors2;
        boolean z2;
        Modifier modifier1;
        Function3 function32;
        MutableInteractionSource mutableInteractionSource1;
        int v3;
        SliderColors sliderColors1;
        boolean z1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xB2484F2E);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(sliderState0) ? 4 : 2) | v : v;
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
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            z1 = z;
        }
        else if((v & 0x180) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        else {
            z1 = z;
        }
        if((v & 0xC00) == 0) {
            if((v1 & 8) == 0) {
                sliderColors1 = sliderColors0;
                v3 = composer1.changed(sliderColors1) ? 0x800 : 0x400;
            }
            else {
                sliderColors1 = sliderColors0;
                v3 = 0x400;
            }
            v2 |= v3;
        }
        else {
            sliderColors1 = sliderColors0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        else if((v & 0x6000) == 0) {
            mutableInteractionSource1 = mutableInteractionSource0;
            v2 |= (composer1.changed(mutableInteractionSource1) ? 0x4000 : 0x2000);
        }
        else {
            mutableInteractionSource1 = mutableInteractionSource0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            function32 = function30;
        }
        else if((0x30000 & v) == 0) {
            function32 = function30;
            v2 |= (composer1.changedInstance(function32) ? 0x20000 : 0x10000);
        }
        else {
            function32 = function30;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((0x180000 & v) == 0) {
            v2 |= (composer1.changedInstance(function31) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x92493) == 0x92492 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z1;
            sliderColors2 = sliderColors1;
            mutableInteractionSource2 = mutableInteractionSource1;
            function33 = function32;
            function34 = function31;
        }
        else {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 4) != 0) {
                    z1 = true;
                }
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                    sliderColors1 = SliderDefaults.INSTANCE.colors(composer1, 6);
                }
                if((v1 & 16) != 0) {
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    mutableInteractionSource1 = mutableInteractionSource3;
                }
                if((v1 & 0x20) != 0) {
                    function32 = ComposableLambdaKt.rememberComposableLambda(0x55032C5E, true, new uk(mutableInteractionSource1, sliderColors1, z1, 6), composer1, 54);
                }
                if((v1 & 0x40) == 0) {
                    v4 = v2;
                label_97:
                    sliderColors3 = sliderColors1;
                    mutableInteractionSource4 = mutableInteractionSource1;
                    function36 = function32;
                    function35 = function31;
                }
                else {
                    function35 = ComposableLambdaKt.rememberComposableLambda(0x2264E809, true, new vk(3, sliderColors1, z1), composer1, 54);
                    v4 = v2;
                    sliderColors3 = sliderColors1;
                    mutableInteractionSource4 = mutableInteractionSource1;
                    function36 = function32;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                v4 = v2;
                modifier2 = modifier0;
                goto label_97;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB2484F2E, v4, -1, "androidx.compose.material3.Slider (Slider.kt:351)");
            }
            if(sliderState0.getSteps() < 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            SliderKt.b(modifier2, sliderState0, z1, mutableInteractionSource4, function36, function35, composer1, v4 & 0x380 | (v4 >> 3 & 14 | v4 << 3 & 0x70) | v4 >> 3 & 0x1C00 | 0xE000 & v4 >> 3 | v4 >> 3 & 0x70000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function33 = function36;
            sliderColors2 = sliderColors3;
            modifier1 = modifier2;
            mutableInteractionSource2 = mutableInteractionSource4;
            z2 = z1;
            function34 = function35;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t5(sliderState0, modifier1, z2, sliderColors2, mutableInteractionSource2, function33, function34, v, v1));
        }
    }

    @Stable
    public static final long SliderRange(float f, float f1) {
        if((!Float.isNaN(f) || !Float.isNaN(f1)) && ((double)f) > ((double)f1) + 0.0001) {
            throw new IllegalArgumentException(("start(" + f + ") must be <= endInclusive(" + f1 + ')').toString());
        }
        return ((long)Float.floatToRawIntBits(f1)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f)) << 0x20;
    }

    @Stable
    public static final long SliderRange(@NotNull ClosedFloatingPointRange closedFloatingPointRange0) {
        float f = ((Number)closedFloatingPointRange0.getStart()).floatValue();
        float f1 = ((Number)closedFloatingPointRange0.getEndInclusive()).floatValue();
        if((!Float.isNaN(f) || !Float.isNaN(f1)) && ((double)f) > ((double)f1) + 0.0001) {
            throw new IllegalArgumentException(("ClosedFloatingPointRange<Float>.start(" + f + ") must be <= ClosedFloatingPoint.endInclusive(" + f1 + ')').toString());
        }
        return ((long)Float.floatToRawIntBits(f)) << 0x20 | ((long)Float.floatToRawIntBits(f1)) & 0xFFFFFFFFL;
    }

    public static final void a(Modifier modifier0, RangeSliderState rangeSliderState0, boolean z, MutableInteractionSource mutableInteractionSource0, MutableInteractionSource mutableInteractionSource1, Function3 function30, Function3 function31, Function3 function32, Composer composer0, int v) {
        Modifier modifier1;
        Composer composer1 = composer0.startRestartGroup(0xABDAC693);
        int v1 = (v & 6) == 0 ? v | (composer1.changed(modifier0) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(rangeSliderState0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changed(mutableInteractionSource0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (composer1.changed(mutableInteractionSource1) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (composer1.changedInstance(function31) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (composer1.changedInstance(function32) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x492493) != 4793490 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xABDAC693, v1, -1, "androidx.compose.material3.RangeSliderImpl (Slider.kt:735)");
            }
            rangeSliderState0.setRtl$material3_release(composer1.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            if(z) {
                ol ol0 = new ol(rangeSliderState0, mutableInteractionSource0, mutableInteractionSource1, null);
                modifier1 = SuspendingPointerInputFilterKt.pointerInput(modifier$Companion0, new Object[]{mutableInteractionSource0, mutableInteractionSource1, rangeSliderState0}, ol0);
            }
            else {
                modifier1 = modifier$Companion0;
            }
            String s = Strings_androidKt.getString-2EP1pXo(string.range_start, composer1, 0);
            String s1 = Strings_androidKt.getString-2EP1pXo(string.range_end, composer1, 0);
            Modifier modifier2 = SizeKt.requiredSizeIn-qDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier0), SliderKt.b, 0.0f, 0.0f, 0.0f, 12, null).then(modifier1);
            boolean z1 = composer1.changedInstance(rangeSliderState0);
            yk yk0 = composer1.rememberedValue();
            if(z1 || yk0 == Composer.Companion.getEmpty()) {
                yk0 = new yk(rangeSliderState0, 0);
                composer1.updateRememberedValue(yk0);
            }
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, yk0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            Modifier modifier4 = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(modifier$Companion0, fi.b), null, false, 3, null);
            boolean z2 = composer1.changedInstance(rangeSliderState0);
            hi hi0 = composer1.rememberedValue();
            if(z2 || hi0 == Composer.Companion.getEmpty()) {
                hi0 = new hi(rangeSliderState0, 1);
                composer1.updateRememberedValue(hi0);
            }
            Modifier modifier5 = OnRemeasuredModifierKt.onSizeChanged(modifier4, hi0);
            ClosedFloatingPointRange closedFloatingPointRange0 = e.rangeTo(((Number)rangeSliderState0.getValueRange().getStart()).floatValue(), rangeSliderState0.getActiveRangeEnd());
            Modifier modifier6 = ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier5, false, new jl(z, closedFloatingPointRange0, rangeSliderState0, 1), 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), rangeSliderState0.getActiveRangeStart(), closedFloatingPointRange0, rangeSliderState0.getStartSteps$material3_release());
            boolean z3 = composer1.changed(s);
            m m0 = composer1.rememberedValue();
            if(z3 || m0 == Composer.Companion.getEmpty()) {
                m0 = new m(s, 5);
                composer1.updateRememberedValue(m0);
            }
            Modifier modifier7 = FocusableKt.focusable(SemanticsModifierKt.semantics(modifier6, true, m0), z, mutableInteractionSource0);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier8 = ComposedModifierKt.materializeModifier(composer1, modifier7);
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function21);
            }
            Updater.set-impl(composer1, modifier8, composeUiNode$Companion0.getSetModifier());
            int v4 = v1 >> 3 & 14;
            function30.invoke(rangeSliderState0, composer1, ((int)(v1 >> 12 & 0x70 | v4)));
            composer1.endNode();
            Modifier modifier9 = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(modifier$Companion0, fi.a), null, false, 3, null);
            boolean z4 = composer1.changedInstance(rangeSliderState0);
            hi hi1 = composer1.rememberedValue();
            if(z4 || hi1 == Composer.Companion.getEmpty()) {
                hi1 = new hi(rangeSliderState0, 2);
                composer1.updateRememberedValue(hi1);
            }
            Modifier modifier10 = OnRemeasuredModifierKt.onSizeChanged(modifier9, hi1);
            ClosedFloatingPointRange closedFloatingPointRange1 = e.rangeTo(rangeSliderState0.getActiveRangeStart(), ((Number)rangeSliderState0.getValueRange().getEndInclusive()).floatValue());
            Modifier modifier11 = ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier10, false, new jl(z, closedFloatingPointRange1, rangeSliderState0, 0), 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), rangeSliderState0.getActiveRangeEnd(), closedFloatingPointRange1, rangeSliderState0.getEndSteps$material3_release());
            boolean z5 = composer1.changed(s1);
            m m1 = composer1.rememberedValue();
            if(z5 || m1 == Composer.Companion.getEmpty()) {
                m1 = new m(s1, 6);
                composer1.updateRememberedValue(m1);
            }
            Modifier modifier12 = FocusableKt.focusable(SemanticsModifierKt.semantics(modifier11, true, m1), z, mutableInteractionSource1);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier13 = ComposedModifierKt.materializeModifier(composer1, modifier12);
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
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                a.t(v5, composer1, v5, function22);
            }
            Updater.set-impl(composer1, modifier13, composeUiNode$Companion0.getSetModifier());
            function31.invoke(rangeSliderState0, composer1, ((int)(v1 >> 15 & 0x70 | v4)));
            composer1.endNode();
            Modifier modifier14 = LayoutIdKt.layoutId(modifier$Companion0, fi.c);
            MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier15 = ComposedModifierKt.materializeModifier(composer1, modifier14);
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
            Function2 function23 = a.r(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap3);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                a.t(v6, composer1, v6, function23);
            }
            Updater.set-impl(composer1, modifier15, composeUiNode$Companion0.getSetModifier());
            function32.invoke(rangeSliderState0, composer1, ((int)(v4 | v1 >> 18 & 0x70)));
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
            scopeUpdateScope0.updateScope(new zk(modifier0, rangeSliderState0, z, mutableInteractionSource0, mutableInteractionSource1, function30, function31, function32, v));
        }
    }

    public static final Object access$awaitSlop-8vUncbI(AwaitPointerEventScope awaitPointerEventScope0, long v, int v1, Continuation continuation0) {
        gl gl0;
        if(continuation0 instanceof gl) {
            gl0 = (gl)continuation0;
            int v2 = gl0.q;
            if((v2 & 0x80000000) == 0) {
                gl0 = new gl(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                gl0.q = v2 ^ 0x80000000;
            }
        }
        else {
            gl0 = new gl(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = gl0.p;
        Pair pair0 = qd.a.getCOROUTINE_SUSPENDED();
        switch(gl0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FloatRef ref$FloatRef0 = new FloatRef();
                hl hl0 = new hl(ref$FloatRef0);
                gl0.o = ref$FloatRef0;
                gl0.q = 1;
                Object object1 = DragGestureDetectorCopyKt.awaitHorizontalPointerSlopOrCancellation-gDDlDlE(awaitPointerEventScope0, v, v1, hl0, gl0);
                if(object1 != pair0) {
                    return ((PointerInputChange)object1) == null ? null : TuplesKt.to(((PointerInputChange)object1), Boxing.boxFloat(ref$FloatRef0.element));
                }
                return pair0;
            }
            case 1: {
                FloatRef ref$FloatRef1 = gl0.o;
                ResultKt.throwOnFailure(object0);
                return ((PointerInputChange)object0) == null ? null : TuplesKt.to(((PointerInputChange)object0), Boxing.boxFloat(ref$FloatRef1.element));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static final float access$calcFraction(float f, float f1, float f2) {
        float f3 = f1 - f;
        return f3 == 0.0f ? c.coerceIn(0.0f, 0.0f, 1.0f) : c.coerceIn((f2 - f) / f3, 0.0f, 1.0f);
    }

    public static final long access$getThumbSize$p() [...] // 潜在的解密器

    public static final float access$getThumbTrackGapSize$p() [...] // 潜在的解密器

    public static final float access$getTrackInsideCornerSize$p() [...] // 潜在的解密器

    public static final float access$scale(float f, float f1, float f2, float f3, float f4) {
        float f5 = f1 - f;
        return f5 == 0.0f ? MathHelpersKt.lerp(f3, f4, c.coerceIn(0.0f, 0.0f, 1.0f)) : MathHelpersKt.lerp(f3, f4, c.coerceIn((f2 - f) / f5, 0.0f, 1.0f));
    }

    public static final long access$scale-ziovWd0(float f, float f1, long v, float f2, float f3) {
        float f4 = f1 - f;
        int v1 = Float.compare(f4, 0.0f);
        float f5 = MathHelpersKt.lerp(f2, f3, c.coerceIn((v1 == 0 ? 0.0f : (SliderRange.getStart-impl(v) - f) / f4), 0.0f, 1.0f));
        return v1 == 0 ? SliderKt.SliderRange(f5, MathHelpersKt.lerp(f2, f3, c.coerceIn(0.0f, 0.0f, 1.0f))) : SliderKt.SliderRange(f5, MathHelpersKt.lerp(f2, f3, c.coerceIn((SliderRange.getEndInclusive-impl(v) - f) / f4, 0.0f, 1.0f)));
    }

    public static final float access$snapValueToTick(float f, float[] arr_f, float f1, float f2) {
        Float float0;
        if(arr_f.length == 0) {
            throw new NullPointerException();
        }
        float f3 = arr_f[0];
        int v = ArraysKt___ArraysKt.getLastIndex(arr_f);
        if(v == 0) {
            float0 = f3;
            return float0 == null ? f : MathHelpersKt.lerp(f1, f2, float0.floatValue());
        }
        float f4 = Math.abs(f3 * f2 + (1.0f - f3) * f1 - f);
        IntIterator intIterator0 = r0.a.t(1, v);
        while(intIterator0.hasNext()) {
            float f5 = arr_f[intIterator0.nextInt()];
            float f6 = Math.abs(f5 * f2 + (1.0f - f5) * f1 - f);
            if(Float.compare(f4, f6) > 0) {
                f3 = f5;
                f4 = f6;
            }
        }
        float0 = f3;
        return float0 == null ? f : MathHelpersKt.lerp(f1, f2, float0.floatValue());
    }

    public static final float[] access$stepsToTickFractions(int v) {
        if(v == 0) {
            return new float[0];
        }
        float[] arr_f = new float[v + 2];
        for(int v1 = 0; v1 < v + 2; ++v1) {
            arr_f[v1] = ((float)v1) / ((float)(v + 1));
        }
        return arr_f;
    }

    public static final void b(Modifier modifier0, SliderState sliderState0, boolean z, MutableInteractionSource mutableInteractionSource0, Function3 function30, Function3 function31, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1390990089);
        int v1 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(sliderState0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changed(mutableInteractionSource0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (composer1.changedInstance(function30) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (composer1.changedInstance(function31) ? 0x20000 : 0x10000);
        }
        if((74899 & v1) != 74898 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1390990089, v1, -1, "androidx.compose.material3.SliderImpl (Slider.kt:664)");
            }
            sliderState0.setRtl$material3_release(composer1.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier1 = z ? SuspendingPointerInputFilterKt.pointerInput(modifier$Companion0, sliderState0, mutableInteractionSource0, new ql(sliderState0, null)) : modifier$Companion0;
            Orientation orientation0 = Orientation.Horizontal;
            boolean z1 = sliderState0.isRtl$material3_release();
            boolean z2 = sliderState0.isDragging$material3_release();
            boolean z3 = composer1.changedInstance(sliderState0);
            fl fl0 = composer1.rememberedValue();
            if(z3 || fl0 == Composer.Companion.getEmpty()) {
                fl0 = new fl(sliderState0, null);
                composer1.updateRememberedValue(fl0);
            }
            Modifier modifier2 = DraggableKt.draggable$default(modifier$Companion0, sliderState0, orientation0, z, mutableInteractionSource0, z2, null, fl0, z1, 0x20, null);
            Modifier modifier3 = FocusableKt.focusable(ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(SizeKt.requiredSizeIn-qDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier0), SliderKt.b, 0.0f, 0.0f, 0.0f, 12, null), false, new pl(z, sliderState0, 0), 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), sliderState0.getValue(), e.rangeTo(((Number)sliderState0.getValueRange().getStart()).floatValue(), ((Number)sliderState0.getValueRange().getEndInclusive()).floatValue()), sliderState0.getSteps()), z, mutableInteractionSource0).then(modifier1).then(modifier2);
            boolean z4 = composer1.changedInstance(sliderState0);
            yk yk0 = composer1.rememberedValue();
            if(z4 || yk0 == Composer.Companion.getEmpty()) {
                yk0 = new yk(sliderState0, 1);
                composer1.updateRememberedValue(yk0);
            }
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
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, yk0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            Modifier modifier5 = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(modifier$Companion0, lk.a), null, false, 3, null);
            boolean z5 = composer1.changedInstance(sliderState0);
            cl cl0 = composer1.rememberedValue();
            if(z5 || cl0 == Composer.Companion.getEmpty()) {
                cl0 = new cl(sliderState0, 0);
                composer1.updateRememberedValue(cl0);
            }
            Modifier modifier6 = OnRemeasuredModifierKt.onSizeChanged(modifier5, cl0);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier7 = ComposedModifierKt.materializeModifier(composer1, modifier6);
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function21);
            }
            Updater.set-impl(composer1, modifier7, composeUiNode$Companion0.getSetModifier());
            int v4 = v1 >> 3 & 14;
            function30.invoke(sliderState0, composer1, ((int)(v1 >> 9 & 0x70 | v4)));
            composer1.endNode();
            Modifier modifier8 = LayoutIdKt.layoutId(modifier$Companion0, lk.b);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier9 = ComposedModifierKt.materializeModifier(composer1, modifier8);
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
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                a.t(v5, composer1, v5, function22);
            }
            Updater.set-impl(composer1, modifier9, composeUiNode$Companion0.getSetModifier());
            function31.invoke(sliderState0, composer1, ((int)(v4 | v1 >> 12 & 0x70)));
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
            scopeUpdateScope0.updateScope(new el(modifier0, sliderState0, z, mutableInteractionSource0, function30, function31, v));
        }
    }

    public static final float getThumbWidth() {
        return SliderKt.b;
    }

    public static final float getTrackHeight() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static final boolean isSpecified-If1S1O4(long v) {
        return v != 0L;
    }

    @Stable
    public static void isSpecified-If1S1O4$annotations(long v) {
    }
}

