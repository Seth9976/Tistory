package androidx.compose.material3;

import a2.b;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.text.selection.g1;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.room.a;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u001A\u0081\u0001\u0010\u0011\u001A\u00020\u00012\u0011\u0010\u0003\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0013\b\u0002\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\u001E\b\u0002\u0010\n\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0007\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001A\u008E\u0001\u0010\u0011\u001A\u00020\u00012\u0011\u0010\u0003\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0013\b\u0002\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\u001E\b\u0002\u0010\n\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\t2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001A\u0081\u0001\u0010\u0017\u001A\u00020\u00012\u0011\u0010\u0003\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0013\b\u0002\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\u001E\b\u0002\u0010\n\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0007\u00A2\u0006\u0004\b\u0017\u0010\u0012\u001A\u008E\u0001\u0010\u0017\u001A\u00020\u00012\u0011\u0010\u0003\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0013\b\u0002\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\u001E\b\u0002\u0010\n\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\t2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0016\u001A\u0081\u0001\u0010\u0019\u001A\u00020\u00012\u0011\u0010\u0003\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0013\b\u0002\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\u001E\b\u0002\u0010\n\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0007\u00A2\u0006\u0004\b\u0019\u0010\u0012\u001A\u0098\u0001\u0010\u0019\u001A\u00020\u00012\u0011\u0010\u0003\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0013\b\u0002\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\u001E\b\u0002\u0010\n\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\t2\b\b\u0002\u0010\u001A\u001A\u00020\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001C\u001A\u0081\u0001\u0010\u001D\u001A\u00020\u00012\u0011\u0010\u0003\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0013\b\u0002\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\u001E\b\u0002\u0010\n\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0007\u00A2\u0006\u0004\b\u001D\u0010\u0012\u001A\u0098\u0001\u0010\u001D\u001A\u00020\u00012\u0011\u0010\u0003\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0013\b\u0002\u0010\u0006\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\u001E\b\u0002\u0010\n\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\t2\b\b\u0002\u0010\u001A\u001A\u00020\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001C\u001A\u0083\u0001\u0010(\u001A\u00020\u00012\u001C\u0010\n\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\t2\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0015\b\u0002\u0010\u001F\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00022\b\b\u0002\u0010!\u001A\u00020 2\b\b\u0002\u0010\"\u001A\u00020 2\b\b\u0002\u0010#\u001A\u00020\u00132\b\b\u0002\u0010%\u001A\u00020$2\b\b\u0002\u0010\f\u001A\u00020\u000BH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b&\u0010\'\u001A\u008F\u0001\u0010(\u001A\u00020\u00012\u001C\u0010\n\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\t2\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0015\b\u0002\u0010\u001F\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00022\b\b\u0002\u0010!\u001A\u00020 2\b\b\u0002\u0010\"\u001A\u00020 2\b\b\u0002\u0010#\u001A\u00020\u00132\b\b\u0002\u0010%\u001A\u00020$2\b\b\u0002\u0010\f\u001A\u00020\u000B2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010)H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b*\u0010+\u001Al\u0010(\u001A\u00020\u00012\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010!\u001A\u00020 2\b\b\u0002\u0010\"\u001A\u00020 2\b\b\u0002\u0010#\u001A\u00020\u00132\b\b\u0002\u0010%\u001A\u00020$2\b\b\u0002\u0010\f\u001A\u00020\u000B2\u001C\u0010,\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b-\u0010.\u001Ax\u0010(\u001A\u00020\u00012\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010!\u001A\u00020 2\b\b\u0002\u0010\"\u001A\u00020 2\b\b\u0002\u0010#\u001A\u00020\u00132\b\b\u0002\u0010%\u001A\u00020$2\b\b\u0002\u0010\f\u001A\u00020\u000B2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010)2\u001C\u0010,\u001A\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b/\u00100\u001A-\u00106\u001A\u0002052\b\b\u0002\u00102\u001A\u0002012\b\b\u0002\u00103\u001A\u0002012\b\b\u0002\u00104\u001A\u000201H\u0007\u00A2\u0006\u0004\b6\u00107\u001A-\u00109\u001A\u0002082\b\b\u0002\u00102\u001A\u0002012\b\b\u0002\u00103\u001A\u0002012\b\b\u0002\u00104\u001A\u000201H\u0007\u00A2\u0006\u0004\b9\u0010:\u001A\'\u0010;\u001A\u0002082\u0006\u00102\u001A\u0002012\u0006\u00103\u001A\u0002012\u0006\u00104\u001A\u000201H\u0007\u00A2\u0006\u0004\b;\u0010<\"\u001A\u0010A\u001A\u00020\u00138\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@\"\u001A\u0010G\u001A\u00020B8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bC\u0010D\u001A\u0004\bE\u0010F\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006J\u00B2\u0006\f\u0010H\u001A\u0002018\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010I\u001A\u00020 8\nX\u008A\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "title", "Landroidx/compose/ui/Modifier;", "modifier", "navigationIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "actions", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/material3/TopAppBarColors;", "colors", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "scrollBehavior", "TopAppBar", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "expandedHeight", "TopAppBar-GHTll3U", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "CenterAlignedTopAppBar", "CenterAlignedTopAppBar-GHTll3U", "MediumTopAppBar", "collapsedHeight", "MediumTopAppBar-oKE7A98", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "LargeTopAppBar", "LargeTopAppBar-oKE7A98", "floatingActionButton", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "tonalElevation", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "BottomAppBar-Snr_uVM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar", "Landroidx/compose/material3/BottomAppBarScrollBehavior;", "BottomAppBar-qhFBPw4", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "content", "BottomAppBar-1oL4kX8", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar-e-3WI5M", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "Landroidx/compose/material3/TopAppBarState;", "rememberTopAppBarState", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarState;", "Landroidx/compose/material3/BottomAppBarState;", "rememberBottomAppBarState", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomAppBarState;", "BottomAppBarState", "(FFF)Landroidx/compose/material3/BottomAppBarState;", "b", "F", "getBottomAppBarVerticalPadding", "()F", "BottomAppBarVerticalPadding", "Landroidx/compose/animation/core/CubicBezierEasing;", "e", "Landroidx/compose/animation/core/CubicBezierEasing;", "getTopTitleAlphaEasing", "()Landroidx/compose/animation/core/CubicBezierEasing;", "TopTitleAlphaEasing", "colorTransitionFraction", "appBarContainerColor", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,2543:1\n1223#2,6:2544\n1223#2,6:2550\n1223#2,6:2556\n1223#2,6:2562\n1223#2,6:2568\n1223#2,6:2578\n1223#2,6:2584\n1223#2,6:2590\n1223#2,6:2596\n1223#2,6:2607\n1223#2,6:2613\n1223#2,6:2619\n1223#2,6:2625\n124#3:2574\n222#3:2575\n124#3:2602\n222#3:2603\n124#3:2604\n222#3:2605\n148#3:2784\n148#3:2786\n148#3:2788\n148#3:2790\n148#3:2792\n148#3:2793\n148#3:2794\n148#3:2795\n77#4:2576\n77#4:2606\n1#5:2577\n78#6,6:2631\n85#6,4:2646\n89#6,2:2656\n78#6,6:2666\n85#6,4:2681\n89#6,2:2691\n93#6:2697\n78#6,6:2706\n85#6,4:2721\n89#6,2:2731\n93#6:2737\n78#6,6:2746\n85#6,4:2761\n89#6,2:2771\n93#6:2777\n93#6:2781\n368#7,9:2637\n377#7:2658\n368#7,9:2672\n377#7:2693\n378#7,2:2695\n368#7,9:2712\n377#7:2733\n378#7,2:2735\n368#7,9:2752\n377#7:2773\n378#7,2:2775\n378#7,2:2779\n4032#8,6:2650\n4032#8,6:2685\n4032#8,6:2725\n4032#8,6:2765\n71#9:2659\n68#9,6:2660\n74#9:2694\n78#9:2698\n71#9:2699\n68#9,6:2700\n74#9:2734\n78#9:2738\n71#9:2739\n68#9,6:2740\n74#9:2774\n78#9:2778\n81#10:2782\n81#10:2783\n56#11:2785\n56#11:2787\n56#11:2789\n56#11:2791\n56#11:2796\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/AppBarKt\n*L\n875#1:2544,6\n876#1:2550,6\n900#1:2556,6\n1293#1:2562,6\n1612#1:2568,6\n1867#1:2578,6\n1880#1:2584,6\n1909#1:2590,6\n1910#1:2596,6\n1993#1:2607,6\n2029#1:2613,6\n2030#1:2619,6\n2164#1:2625,6\n1863#1:2574\n1863#1:2575\n1973#1:2602\n1973#1:2603\n1976#1:2604\n1976#1:2605\n1834#1:2784\n1835#1:2786\n1838#1:2788\n1839#1:2790\n2536#1:2792\n2537#1:2793\n2538#1:2794\n2542#1:2795\n1866#1:2576\n1985#1:2606\n2136#1:2631,6\n2136#1:2646,4\n2136#1:2656,2\n2138#1:2666,6\n2138#1:2681,4\n2138#1:2691,2\n2138#1:2697\n2144#1:2706,6\n2144#1:2721,4\n2144#1:2731,2\n2144#1:2737\n2156#1:2746,6\n2156#1:2761,4\n2156#1:2771,2\n2156#1:2777\n2136#1:2781\n2136#1:2637,9\n2136#1:2658\n2138#1:2672,9\n2138#1:2693\n2138#1:2695,2\n2144#1:2712,9\n2144#1:2733\n2144#1:2735,2\n2156#1:2752,9\n2156#1:2773\n2156#1:2775,2\n2136#1:2779,2\n2136#1:2650,6\n2138#1:2685,6\n2144#1:2725,6\n2156#1:2765,6\n2138#1:2659\n2138#1:2660,6\n2138#1:2694\n2138#1:2698\n2144#1:2699\n2144#1:2700,6\n2144#1:2734\n2144#1:2738\n2156#1:2739\n2156#1:2740,6\n2156#1:2774\n2156#1:2778\n1880#1:2782\n1888#1:2783\n1834#1:2785\n1835#1:2787\n1838#1:2789\n1839#1:2791\n2542#1:2796\n*E\n"})
public final class AppBarKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final CubicBezierEasing e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float i;

    static {
        float f = Dp.constructor-impl(Dp.constructor-impl(16.0f) - Dp.constructor-impl(12.0f));
        AppBarKt.a = f;
        float f1 = Dp.constructor-impl(Dp.constructor-impl(16.0f) - Dp.constructor-impl(12.0f));
        AppBarKt.b = f1;
        AppBarKt.c = Dp.constructor-impl(Dp.constructor-impl(16.0f) - f);
        AppBarKt.d = Dp.constructor-impl(Dp.constructor-impl(12.0f) - f1);
        AppBarKt.e = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);
        AppBarKt.f = Dp.constructor-impl(24.0f);
        AppBarKt.g = Dp.constructor-impl(28.0f);
        float f2 = Dp.constructor-impl(4.0f);
        AppBarKt.h = f2;
        AppBarKt.i = Dp.constructor-impl(Dp.constructor-impl(16.0f) - f2);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void BottomAppBar-1oL4kX8(@Nullable Modifier modifier0, long v, long v1, float f, @Nullable PaddingValues paddingValues0, @Nullable WindowInsets windowInsets0, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        Modifier modifier1;
        Modifier modifier2;
        float f2;
        WindowInsets windowInsets2;
        PaddingValues paddingValues2;
        int v10;
        int v9;
        WindowInsets windowInsets1;
        PaddingValues paddingValues1;
        float f1;
        int v8;
        long v7;
        int v6;
        long v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(-1391700845);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v2 & 0x30) == 0) {
            if((v3 & 2) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x20 : 16;
            }
            else {
                v5 = v;
                v6 = 16;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v2 & 0x180) == 0) {
            if((v3 & 4) == 0) {
                v7 = v1;
                v8 = composer1.changed(v7) ? 0x100 : 0x80;
            }
            else {
                v7 = v1;
                v8 = 0x80;
            }
            v4 |= v8;
        }
        else {
            v7 = v1;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            f1 = f;
        }
        else if((v2 & 0xC00) == 0) {
            f1 = f;
            v4 |= (composer1.changed(f1) ? 0x800 : 0x400);
        }
        else {
            f1 = f;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            paddingValues1 = paddingValues0;
        }
        else if((v2 & 0x6000) == 0) {
            paddingValues1 = paddingValues0;
            v4 |= (composer1.changed(paddingValues1) ? 0x4000 : 0x2000);
        }
        else {
            paddingValues1 = paddingValues0;
        }
        if((0x30000 & v2) == 0) {
            if((v3 & 0x20) == 0) {
                windowInsets1 = windowInsets0;
                v9 = composer1.changed(windowInsets1) ? 0x20000 : 0x10000;
            }
            else {
                windowInsets1 = windowInsets0;
                v9 = 0x10000;
            }
            v4 |= v9;
        }
        else {
            windowInsets1 = windowInsets0;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x92493) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 2) != 0) {
                    v5 = BottomAppBarDefaults.INSTANCE.getContainerColor(composer1, 6);
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v7 = ColorSchemeKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 3 & 14);
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    f1 = 0.0f;
                }
                if((v3 & 16) != 0) {
                    paddingValues1 = BottomAppBarDefaults.INSTANCE.getContentPadding();
                }
                if((v3 & 0x20) == 0) {
                label_102:
                    v10 = v4;
                    f2 = f1;
                    paddingValues2 = paddingValues1;
                    windowInsets2 = windowInsets1;
                }
                else {
                    v10 = v4 & 0xFFF8FFFF;
                    paddingValues2 = paddingValues1;
                    windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(composer1, 6);
                    f2 = f1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 2) != 0) {
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                goto label_102;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1391700845, v10, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
            }
            AppBarKt.BottomAppBar-e-3WI5M(modifier2, v5, v7, f2, paddingValues2, windowInsets2, null, function30, composer1, v10 & 14 | 0x180000 | v10 & 0x70 | v10 & 0x380 | v10 & 0x1C00 | 0xE000 & v10 | 0x70000 & v10 | v10 << 3 & 0x1C00000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f1 = f2;
            paddingValues1 = paddingValues2;
            windowInsets1 = windowInsets2;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c0(modifier1, v5, v7, f1, paddingValues1, windowInsets1, function30, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BottomAppBar-Snr_uVM(@NotNull Function3 function30, @Nullable Modifier modifier0, @Nullable Function2 function20, long v, long v1, float f, @Nullable PaddingValues paddingValues0, @Nullable WindowInsets windowInsets0, @Nullable Composer composer0, int v2, int v3) {
        PaddingValues paddingValues1;
        float f2;
        long v9;
        long v8;
        Function2 function22;
        Modifier modifier2;
        WindowInsets windowInsets1;
        long v11;
        int v10;
        WindowInsets windowInsets2;
        PaddingValues paddingValues2;
        float f1;
        long v7;
        int v6;
        long v5;
        Function2 function21;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x7FA857C1);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changedInstance(function30) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v2 & 0x30) == 0) {
            modifier1 = modifier0;
            v4 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
            function21 = function20;
        }
        else if((v2 & 0x180) == 0) {
            function21 = function20;
            v4 |= (composer1.changedInstance(function21) ? 0x100 : 0x80);
        }
        else {
            function21 = function20;
        }
        if((v2 & 0xC00) == 0) {
            if((v3 & 8) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x800 : 0x400;
            }
            else {
                v5 = v;
                v6 = 0x400;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v2 & 0x6000) == 0) {
            v7 = v1;
            v4 |= ((v3 & 16) != 0 || !composer1.changed(v7) ? 0x2000 : 0x4000);
        }
        else {
            v7 = v1;
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
            f1 = f;
        }
        else if((0x30000 & v2) == 0) {
            f1 = f;
            v4 |= (composer1.changed(f1) ? 0x20000 : 0x10000);
        }
        else {
            f1 = f;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v4 |= (composer1.changed(paddingValues0) ? 0x100000 : 0x80000);
        }
        if((v2 & 0xC00000) == 0) {
            v4 |= ((v3 & 0x80) != 0 || !composer1.changed(windowInsets0) ? 0x400000 : 0x800000);
        }
        if((v4 & 0x492493) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v3 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v3 & 4) != 0) {
                    function21 = null;
                }
                if((v3 & 8) != 0) {
                    v5 = BottomAppBarDefaults.INSTANCE.getContainerColor(composer1, 6);
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    v7 = ColorSchemeKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 9 & 14);
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) != 0) {
                    f1 = 0.0f;
                }
                PaddingValues paddingValues3 = (v3 & 0x40) == 0 ? paddingValues0 : BottomAppBarDefaults.INSTANCE.getContentPadding();
                if((v3 & 0x80) == 0) {
                    windowInsets2 = windowInsets0;
                    paddingValues2 = paddingValues3;
                    v10 = v4;
                    v11 = v7;
                }
                else {
                    v10 = v4 & 0xFE3FFFFF;
                    windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(composer1, 6);
                    v11 = v7;
                    paddingValues2 = paddingValues3;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x80) != 0) {
                    v4 &= 0xFE3FFFFF;
                }
                paddingValues2 = paddingValues0;
                windowInsets2 = windowInsets0;
                v10 = v4;
                v11 = v7;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x7FA857C1, v10, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:684)");
            }
            AppBarKt.BottomAppBar-qhFBPw4(function30, modifier1, function21, v5, v11, f1, paddingValues2, windowInsets2, null, composer1, v10 & 14 | 0x6000000 | v10 & 0x70 | v10 & 0x380 | v10 & 0x1C00 | 0xE000 & v10 | 0x70000 & v10 | 0x380000 & v10 | v10 & 0x1C00000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            windowInsets1 = windowInsets2;
            f2 = f1;
            paddingValues1 = paddingValues2;
            modifier2 = modifier1;
            function22 = function21;
            v8 = v5;
            v9 = v11;
        }
        else {
            composer1.skipToGroupEnd();
            windowInsets1 = windowInsets0;
            modifier2 = modifier1;
            function22 = function21;
            v8 = v5;
            v9 = v7;
            f2 = f1;
            paddingValues1 = paddingValues0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z(function30, modifier2, function22, v8, v9, f2, paddingValues1, windowInsets1, v2, v3));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void BottomAppBar-e-3WI5M(@Nullable Modifier modifier0, long v, long v1, float f, @Nullable PaddingValues paddingValues0, @Nullable WindowInsets windowInsets0, @Nullable BottomAppBarScrollBehavior bottomAppBarScrollBehavior0, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        WindowInsets windowInsets1;
        PaddingValues paddingValues2;
        float f2;
        long v10;
        long v9;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior1;
        Modifier modifier1;
        Modifier modifier3;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior2;
        PaddingValues paddingValues3;
        int v11;
        float f3;
        WindowInsets windowInsets2;
        Modifier modifier2;
        WindowInsets windowInsets3;
        PaddingValues paddingValues1;
        float f1;
        int v8;
        long v7;
        int v6;
        long v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x192DE775);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v2 & 0x30) == 0) {
            if((v3 & 2) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x20 : 16;
            }
            else {
                v5 = v;
                v6 = 16;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v2 & 0x180) == 0) {
            if((v3 & 4) == 0) {
                v7 = v1;
                v8 = composer1.changed(v7) ? 0x100 : 0x80;
            }
            else {
                v7 = v1;
                v8 = 0x80;
            }
            v4 |= v8;
        }
        else {
            v7 = v1;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            f1 = f;
        }
        else if((v2 & 0xC00) == 0) {
            f1 = f;
            v4 |= (composer1.changed(f1) ? 0x800 : 0x400);
        }
        else {
            f1 = f;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            paddingValues1 = paddingValues0;
        }
        else if((v2 & 0x6000) == 0) {
            paddingValues1 = paddingValues0;
            v4 |= (composer1.changed(paddingValues1) ? 0x4000 : 0x2000);
        }
        else {
            paddingValues1 = paddingValues0;
        }
        if((v2 & 0x30000) == 0) {
            v4 |= ((v3 & 0x20) != 0 || !composer1.changed(windowInsets0) ? 0x10000 : 0x20000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v4 |= (composer1.changed(bottomAppBarScrollBehavior0) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0xC00000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v4) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 2) != 0) {
                    v5 = BottomAppBarDefaults.INSTANCE.getContainerColor(composer1, 6);
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v7 = ColorSchemeKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 3 & 14);
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    f1 = 0.0f;
                }
                if((v3 & 16) != 0) {
                    paddingValues1 = BottomAppBarDefaults.INSTANCE.getContentPadding();
                }
                if((v3 & 0x20) == 0) {
                    windowInsets3 = windowInsets0;
                }
                else {
                    windowInsets3 = BottomAppBarDefaults.INSTANCE.getWindowInsets(composer1, 6);
                    v4 &= 0xFFF8FFFF;
                }
                windowInsets2 = windowInsets3;
                f3 = f1;
                v11 = v4;
                paddingValues3 = paddingValues1;
                bottomAppBarScrollBehavior2 = (v3 & 0x40) == 0 ? bottomAppBarScrollBehavior0 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 2) != 0) {
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                windowInsets2 = windowInsets0;
                f3 = f1;
                v11 = v4;
                paddingValues3 = paddingValues1;
                bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x192DE775, v11, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:867)");
            }
            composer1.startReplaceGroup(1393560009);
            if(bottomAppBarScrollBehavior2 == null || bottomAppBarScrollBehavior2.isPinned()) {
                modifier3 = Modifier.Companion;
            }
            else {
                Companion modifier$Companion0 = Modifier.Companion;
                Orientation orientation0 = Orientation.Vertical;
                g1 g10 = composer1.rememberedValue();
                if((v11 & 0x380000) == 0x100000 || g10 == Composer.Companion.getEmpty()) {
                    g10 = new g1(bottomAppBarScrollBehavior2, 1);
                    composer1.updateRememberedValue(g10);
                }
                DraggableState draggableState0 = DraggableKt.rememberDraggableState(g10, composer1, 0);
                p0 p00 = composer1.rememberedValue();
                if((v11 & 0x380000) == 0x100000 || p00 == Composer.Companion.getEmpty()) {
                    p00 = new p0(2, bottomAppBarScrollBehavior2, null);
                    composer1.updateRememberedValue(p00);
                }
                modifier3 = DraggableKt.draggable$default(modifier$Companion0, draggableState0, orientation0, false, null, false, null, p00, false, 0xBC, null);
            }
            composer1.endReplaceGroup();
            Shape shape0 = ShapesKt.getValue(BottomAppBarTokens.INSTANCE.getContainerShape(), composer1, 6);
            e0 e00 = composer1.rememberedValue();
            if((0x380000 & v11) == 0x100000 || e00 == Composer.Companion.getEmpty()) {
                e00 = new e0(bottomAppBarScrollBehavior2, 0);
                composer1.updateRememberedValue(e00);
            }
            modifier1 = modifier2;
            SurfaceKt.Surface-T9BRK9s(LayoutModifierKt.layout(modifier2, e00).then(modifier3), shape0, v5, v7, f3, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1243053520, true, new f0(windowInsets2, paddingValues3, function30), composer1, 54), composer1, v11 << 3 & 0x380 | 0xC00000 | v11 << 3 & 0x1C00 | v11 << 3 & 0xE000, 0x60);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            bottomAppBarScrollBehavior1 = bottomAppBarScrollBehavior2;
            f2 = f3;
            v9 = v5;
            v10 = v7;
            windowInsets1 = windowInsets2;
            paddingValues2 = paddingValues3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            bottomAppBarScrollBehavior1 = bottomAppBarScrollBehavior0;
            v9 = v5;
            v10 = v7;
            f2 = f1;
            paddingValues2 = paddingValues1;
            windowInsets1 = windowInsets0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z(modifier1, v9, v10, f2, paddingValues2, windowInsets1, bottomAppBarScrollBehavior1, function30, v2, v3));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BottomAppBar-qhFBPw4(@NotNull Function3 function30, @Nullable Modifier modifier0, @Nullable Function2 function20, long v, long v1, float f, @Nullable PaddingValues paddingValues0, @Nullable WindowInsets windowInsets0, @Nullable BottomAppBarScrollBehavior bottomAppBarScrollBehavior0, @Nullable Composer composer0, int v2, int v3) {
        WindowInsets windowInsets1;
        PaddingValues paddingValues1;
        long v9;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior1;
        Function2 function21;
        Modifier modifier1;
        PaddingValues paddingValues2;
        float f2;
        int v10;
        WindowInsets windowInsets2;
        Function2 function22;
        float f1;
        int v8;
        long v7;
        int v6;
        long v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xC1B90D01);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changedInstance(function30) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            if((v3 & 8) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x800 : 0x400;
            }
            else {
                v5 = v;
                v6 = 0x400;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v2 & 0x6000) == 0) {
            if((v3 & 16) == 0) {
                v7 = v1;
                v8 = composer1.changed(v7) ? 0x4000 : 0x2000;
            }
            else {
                v7 = v1;
                v8 = 0x2000;
            }
            v4 |= v8;
        }
        else {
            v7 = v1;
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
            f1 = f;
        }
        else if((0x30000 & v2) == 0) {
            f1 = f;
            v4 |= (composer1.changed(f1) ? 0x20000 : 0x10000);
        }
        else {
            f1 = f;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v4 |= (composer1.changed(paddingValues0) ? 0x100000 : 0x80000);
        }
        if((v2 & 0xC00000) == 0) {
            v4 |= ((v3 & 0x80) != 0 || !composer1.changed(windowInsets0) ? 0x400000 : 0x800000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v2 & 0x6000000) == 0) {
            v4 |= (composer1.changed(bottomAppBarScrollBehavior0) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
                function22 = (v3 & 4) == 0 ? function20 : null;
                if((v3 & 8) != 0) {
                    v5 = BottomAppBarDefaults.INSTANCE.getContainerColor(composer1, 6);
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    v7 = ColorSchemeKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 9 & 14);
                    v4 &= 0xFFFF1FFF;
                }
                float f3 = (v3 & 0x20) == 0 ? f1 : 0.0f;
                PaddingValues paddingValues3 = (v3 & 0x40) == 0 ? paddingValues0 : BottomAppBarDefaults.INSTANCE.getContentPadding();
                if((v3 & 0x80) == 0) {
                    windowInsets2 = windowInsets0;
                }
                else {
                    windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(composer1, 6);
                    v4 &= 0xFE3FFFFF;
                }
                if((v3 & 0x100) == 0) {
                    bottomAppBarScrollBehavior1 = bottomAppBarScrollBehavior0;
                    f2 = f3;
                }
                else {
                    f2 = f3;
                    bottomAppBarScrollBehavior1 = null;
                }
                v10 = v4;
                paddingValues2 = paddingValues3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x80) != 0) {
                    v4 &= 0xFE3FFFFF;
                }
                modifier1 = modifier0;
                function22 = function20;
                windowInsets2 = windowInsets0;
                bottomAppBarScrollBehavior1 = bottomAppBarScrollBehavior0;
                v10 = v4;
                f2 = f1;
                paddingValues2 = paddingValues0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC1B90D01, v10, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:750)");
            }
            AppBarKt.BottomAppBar-e-3WI5M(modifier1, v5, v7, f2, paddingValues2, windowInsets2, bottomAppBarScrollBehavior1, ComposableLambdaKt.rememberComposableLambda(0x5D5D49FA, true, new a0(function30, function22), composer1, 54), composer1, v10 >> 3 & 14 | 0xC00000 | v10 >> 6 & 0x70 | v10 >> 6 & 0x380 | v10 >> 6 & 0x1C00 | 0xE000 & v10 >> 6 | 0x70000 & v10 >> 6 | v10 >> 6 & 0x380000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f1 = f2;
            paddingValues1 = paddingValues2;
            windowInsets1 = windowInsets2;
            function21 = function22;
            v9 = v7;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            function21 = function20;
            bottomAppBarScrollBehavior1 = bottomAppBarScrollBehavior0;
            v9 = v7;
            paddingValues1 = paddingValues0;
            windowInsets1 = windowInsets0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(function30, modifier1, function21, v5, v9, f1, paddingValues1, windowInsets1, bottomAppBarScrollBehavior1, v2, v3));
        }
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final BottomAppBarState BottomAppBarState(float f, float f1, float f2) {
        return new n1(f, f1, f2);
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of CenterAlignedTopAppBar with expandedHeight parameter")
    public static final void CenterAlignedTopAppBar(Function2 function20, Modifier modifier0, Function2 function21, Function3 function30, WindowInsets windowInsets0, TopAppBarColors topAppBarColors0, TopAppBarScrollBehavior topAppBarScrollBehavior0, Composer composer0, int v, int v1) {
        TopAppBarScrollBehavior topAppBarScrollBehavior1;
        TopAppBarColors topAppBarColors2;
        Function3 function32;
        Function2 function23;
        Modifier modifier2;
        int v5;
        TopAppBarColors topAppBarColors3;
        WindowInsets windowInsets2;
        Function3 function33;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        int v4;
        TopAppBarColors topAppBarColors1;
        int v3;
        WindowInsets windowInsets1;
        Function3 function31;
        Function2 function22;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x807D1444);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
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
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            function22 = function21;
        }
        else if((v & 0x180) == 0) {
            function22 = function21;
            v2 |= (composer1.changedInstance(function22) ? 0x100 : 0x80);
        }
        else {
            function22 = function21;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function31 = function30;
        }
        else if((v & 0xC00) == 0) {
            function31 = function30;
            v2 |= (composer1.changedInstance(function31) ? 0x800 : 0x400);
        }
        else {
            function31 = function30;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                windowInsets1 = windowInsets0;
                v3 = composer1.changed(windowInsets1) ? 0x4000 : 0x2000;
            }
            else {
                windowInsets1 = windowInsets0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            windowInsets1 = windowInsets0;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                topAppBarColors1 = topAppBarColors0;
                v4 = composer1.changed(topAppBarColors1) ? 0x20000 : 0x10000;
            }
            else {
                topAppBarColors1 = topAppBarColors0;
                v4 = 0x10000;
            }
            v2 |= v4;
        }
        else {
            topAppBarColors1 = topAppBarColors0;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((0x180000 & v) == 0) {
            v2 |= (composer1.changed(topAppBarScrollBehavior0) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v2) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 2) == 0 ? modifier1 : Modifier.Companion;
                if((v1 & 4) != 0) {
                    function22 = ComposableSingletons.AppBarKt.INSTANCE.getLambda-5$material3_release();
                }
                if((v1 & 8) != 0) {
                    function31 = ComposableSingletons.AppBarKt.INSTANCE.getLambda-6$material3_release();
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                    windowInsets1 = TopAppBarDefaults.INSTANCE.getWindowInsets(composer1, 6);
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                    topAppBarColors1 = TopAppBarDefaults.INSTANCE.centerAlignedTopAppBarColors(composer1, 6);
                }
                if((v1 & 0x40) == 0) {
                    v5 = v2;
                label_102:
                    function33 = function31;
                    windowInsets2 = windowInsets1;
                    topAppBarColors3 = topAppBarColors1;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior0;
                }
                else {
                    v5 = v2;
                    topAppBarScrollBehavior2 = null;
                    function33 = function31;
                    windowInsets2 = windowInsets1;
                    topAppBarColors3 = topAppBarColors1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                v5 = v2;
                modifier2 = modifier1;
                goto label_102;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x807D1444, v5, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:273)");
            }
            AppBarKt.CenterAlignedTopAppBar-GHTll3U(function20, modifier2, function22, function33, 0.0f, windowInsets2, topAppBarColors3, topAppBarScrollBehavior2, composer1, v5 & 14 | 0x6000 | v5 & 0x70 | v5 & 0x380 | v5 & 0x1C00 | 0x70000 & v5 << 3 | 0x380000 & v5 << 3 | v5 << 3 & 0x1C00000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            windowInsets1 = windowInsets2;
            function32 = function33;
            function23 = function22;
            topAppBarScrollBehavior1 = topAppBarScrollBehavior2;
            topAppBarColors2 = topAppBarColors3;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            function23 = function22;
            function32 = function31;
            topAppBarColors2 = topAppBarColors1;
            topAppBarScrollBehavior1 = topAppBarScrollBehavior0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g0(function20, modifier1, function23, function32, windowInsets1, topAppBarColors2, topAppBarScrollBehavior1, v, v1, 0));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void CenterAlignedTopAppBar-GHTll3U(@NotNull Function2 function20, @Nullable Modifier modifier0, @Nullable Function2 function21, @Nullable Function3 function30, float f, @Nullable WindowInsets windowInsets0, @Nullable TopAppBarColors topAppBarColors0, @Nullable TopAppBarScrollBehavior topAppBarScrollBehavior0, @Nullable Composer composer0, int v, int v1) {
        TopAppBarColors topAppBarColors2;
        WindowInsets windowInsets2;
        float f2;
        Function3 function32;
        Function2 function23;
        TopAppBarScrollBehavior topAppBarScrollBehavior1;
        Modifier modifier1;
        int v4;
        TopAppBarColors topAppBarColors1;
        int v3;
        WindowInsets windowInsets1;
        float f1;
        Function3 function31;
        Function2 function22;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x74683B90);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
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
            function22 = function21;
        }
        else if((v & 0x180) == 0) {
            function22 = function21;
            v2 |= (composer1.changedInstance(function22) ? 0x100 : 0x80);
        }
        else {
            function22 = function21;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function31 = function30;
        }
        else if((v & 0xC00) == 0) {
            function31 = function30;
            v2 |= (composer1.changedInstance(function31) ? 0x800 : 0x400);
        }
        else {
            function31 = function30;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            f1 = f;
        }
        else if((v & 0x6000) == 0) {
            f1 = f;
            v2 |= (composer1.changed(f1) ? 0x4000 : 0x2000);
        }
        else {
            f1 = f;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                windowInsets1 = windowInsets0;
                v3 = composer1.changed(windowInsets1) ? 0x20000 : 0x10000;
            }
            else {
                windowInsets1 = windowInsets0;
                v3 = 0x10000;
            }
            v2 |= v3;
        }
        else {
            windowInsets1 = windowInsets0;
        }
        if((0x180000 & v) == 0) {
            if((v1 & 0x40) == 0) {
                topAppBarColors1 = topAppBarColors0;
                v4 = composer1.changed(topAppBarColors1) ? 0x100000 : 0x80000;
            }
            else {
                topAppBarColors1 = topAppBarColors0;
                v4 = 0x80000;
            }
            v2 |= v4;
        }
        else {
            topAppBarColors1 = topAppBarColors0;
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changed(topAppBarScrollBehavior0) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x492493) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 4) != 0) {
                    function22 = ComposableSingletons.AppBarKt.INSTANCE.getLambda-7$material3_release();
                }
                if((v1 & 8) != 0) {
                    function31 = ComposableSingletons.AppBarKt.INSTANCE.getLambda-8$material3_release();
                }
                if((v1 & 16) != 0) {
                    f1 = 0.0f;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                    windowInsets1 = TopAppBarDefaults.INSTANCE.getWindowInsets(composer1, 6);
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                    topAppBarColors1 = TopAppBarDefaults.INSTANCE.centerAlignedTopAppBarColors(composer1, 6);
                }
                topAppBarScrollBehavior1 = (v1 & 0x80) == 0 ? topAppBarScrollBehavior0 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                modifier1 = modifier0;
                topAppBarScrollBehavior1 = topAppBarScrollBehavior0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x74683B90, v2, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
            }
            AppBarKt.a(modifier1, function20, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composer1, 6), true, function22, function31, (Dp.equals-impl0(f1, NaNf) || Dp.equals-impl0(f1, Infinityf) ? 0.0f : f1), windowInsets1, topAppBarColors1, topAppBarScrollBehavior1, composer1, 0xE000 & v2 << 6 | (v2 >> 3 & 14 | 0xC00 | v2 << 3 & 0x70) | 0x70000 & v2 << 6 | 0x1C00000 & v2 << 6 | 0xE000000 & v2 << 6 | v2 << 6 & 0x70000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f2 = f1;
            function23 = function22;
            topAppBarColors2 = topAppBarColors1;
            windowInsets2 = windowInsets1;
            function32 = function31;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            topAppBarScrollBehavior1 = topAppBarScrollBehavior0;
            function23 = function22;
            function32 = function31;
            f2 = f1;
            windowInsets2 = windowInsets1;
            topAppBarColors2 = topAppBarColors1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h0(function20, modifier1, function23, function32, f2, windowInsets2, topAppBarColors2, topAppBarScrollBehavior1, v, v1, 0));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of LargeTopAppBar with collapsedHeight and expandedHeight parameters")
    public static final void LargeTopAppBar(Function2 function20, Modifier modifier0, Function2 function21, Function3 function30, WindowInsets windowInsets0, TopAppBarColors topAppBarColors0, TopAppBarScrollBehavior topAppBarScrollBehavior0, Composer composer0, int v, int v1) {
        TopAppBarScrollBehavior topAppBarScrollBehavior1;
        TopAppBarColors topAppBarColors2;
        Function3 function32;
        Function2 function23;
        Modifier modifier2;
        int v5;
        TopAppBarColors topAppBarColors3;
        WindowInsets windowInsets2;
        Function3 function33;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        int v4;
        TopAppBarColors topAppBarColors1;
        int v3;
        WindowInsets windowInsets1;
        Function3 function31;
        Function2 function22;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xE3B71530);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
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
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            function22 = function21;
        }
        else if((v & 0x180) == 0) {
            function22 = function21;
            v2 |= (composer1.changedInstance(function22) ? 0x100 : 0x80);
        }
        else {
            function22 = function21;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function31 = function30;
        }
        else if((v & 0xC00) == 0) {
            function31 = function30;
            v2 |= (composer1.changedInstance(function31) ? 0x800 : 0x400);
        }
        else {
            function31 = function30;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                windowInsets1 = windowInsets0;
                v3 = composer1.changed(windowInsets1) ? 0x4000 : 0x2000;
            }
            else {
                windowInsets1 = windowInsets0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            windowInsets1 = windowInsets0;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                topAppBarColors1 = topAppBarColors0;
                v4 = composer1.changed(topAppBarColors1) ? 0x20000 : 0x10000;
            }
            else {
                topAppBarColors1 = topAppBarColors0;
                v4 = 0x10000;
            }
            v2 |= v4;
        }
        else {
            topAppBarColors1 = topAppBarColors0;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((0x180000 & v) == 0) {
            v2 |= (composer1.changed(topAppBarScrollBehavior0) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v2) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 2) == 0 ? modifier1 : Modifier.Companion;
                if((v1 & 4) != 0) {
                    function22 = ComposableSingletons.AppBarKt.INSTANCE.getLambda-13$material3_release();
                }
                if((v1 & 8) != 0) {
                    function31 = ComposableSingletons.AppBarKt.INSTANCE.getLambda-14$material3_release();
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                    windowInsets1 = TopAppBarDefaults.INSTANCE.getWindowInsets(composer1, 6);
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                    topAppBarColors1 = TopAppBarDefaults.INSTANCE.largeTopAppBarColors(composer1, 6);
                }
                if((v1 & 0x40) == 0) {
                    v5 = v2;
                label_102:
                    function33 = function31;
                    windowInsets2 = windowInsets1;
                    topAppBarColors3 = topAppBarColors1;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior0;
                }
                else {
                    v5 = v2;
                    topAppBarScrollBehavior2 = null;
                    function33 = function31;
                    windowInsets2 = windowInsets1;
                    topAppBarColors3 = topAppBarColors1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                v5 = v2;
                modifier2 = modifier1;
                goto label_102;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE3B71530, v5, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:545)");
            }
            AppBarKt.LargeTopAppBar-oKE7A98(function20, modifier2, function22, function33, 0.0f, 0.0f, windowInsets2, topAppBarColors3, topAppBarScrollBehavior2, composer1, v5 & 14 | 0x36000 | v5 & 0x70 | v5 & 0x380 | v5 & 0x1C00 | 0x380000 & v5 << 6 | 0x1C00000 & v5 << 6 | v5 << 6 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            windowInsets1 = windowInsets2;
            function32 = function33;
            function23 = function22;
            topAppBarScrollBehavior1 = topAppBarScrollBehavior2;
            topAppBarColors2 = topAppBarColors3;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            function23 = function22;
            function32 = function31;
            topAppBarColors2 = topAppBarColors1;
            topAppBarScrollBehavior1 = topAppBarScrollBehavior0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g0(function20, modifier1, function23, function32, windowInsets1, topAppBarColors2, topAppBarScrollBehavior1, v, v1, 1));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void LargeTopAppBar-oKE7A98(@NotNull Function2 function20, @Nullable Modifier modifier0, @Nullable Function2 function21, @Nullable Function3 function30, float f, float f1, @Nullable WindowInsets windowInsets0, @Nullable TopAppBarColors topAppBarColors0, @Nullable TopAppBarScrollBehavior topAppBarScrollBehavior0, @Nullable Composer composer0, int v, int v1) {
        TopAppBarScrollBehavior topAppBarScrollBehavior1;
        WindowInsets windowInsets1;
        float f3;
        float f2;
        Function3 function31;
        Function2 function22;
        TopAppBarColors topAppBarColors1;
        Modifier modifier1;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        WindowInsets windowInsets2;
        float f5;
        float f4;
        Function3 function32;
        Function2 function23;
        int v3;
        TopAppBarColors topAppBarColors2;
        TopAppBarColors topAppBarColors3;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-630005584);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
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
            v2 |= (composer1.changedInstance(function21) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(f) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(f1) ? 0x20000 : 0x10000);
        }
        if((v & 0x180000) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(windowInsets0) ? 0x80000 : 0x100000);
        }
        if((v & 0xC00000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.changed(topAppBarColors0) ? 0x400000 : 0x800000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changed(topAppBarScrollBehavior0) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                function23 = (v1 & 4) == 0 ? function21 : ComposableSingletons.AppBarKt.INSTANCE.getLambda-15$material3_release();
                function32 = (v1 & 8) == 0 ? function30 : ComposableSingletons.AppBarKt.INSTANCE.getLambda-16$material3_release();
                f4 = (v1 & 16) == 0 ? f : 0.0f;
                f5 = (v1 & 0x20) == 0 ? f1 : 0.0f;
                if((v1 & 0x40) == 0) {
                    windowInsets2 = windowInsets0;
                }
                else {
                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composer1, 6);
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x80) == 0) {
                    topAppBarColors3 = topAppBarColors0;
                }
                else {
                    topAppBarColors3 = TopAppBarDefaults.INSTANCE.largeTopAppBarColors(composer1, 6);
                    v2 &= 0xFE3FFFFF;
                }
                if((v1 & 0x100) == 0) {
                    topAppBarColors2 = topAppBarColors3;
                    v3 = v2;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior0;
                }
                else {
                    topAppBarScrollBehavior2 = null;
                    topAppBarColors2 = topAppBarColors3;
                    v3 = v2;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                modifier1 = modifier0;
                topAppBarColors2 = topAppBarColors0;
                v3 = v2;
                function23 = function21;
                function32 = function30;
                f4 = f;
                f5 = f1;
                windowInsets2 = windowInsets0;
                topAppBarScrollBehavior2 = topAppBarScrollBehavior0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-630005584, v3, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:614)");
            }
            TextStyle textStyle0 = TypographyKt.getValue(TopAppBarLargeTokens.INSTANCE.getHeadlineFont(), composer1, 6);
            TextStyle textStyle1 = TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composer1, 6);
            AppBarKt.b(modifier1, function20, textStyle0, AppBarKt.g, function20, textStyle1, function23, function32, (Dp.equals-impl0(f4, NaNf) || Dp.equals-impl0(f4, Infinityf) ? 0.0f : f4), (Dp.equals-impl0(f5, NaNf) || Dp.equals-impl0(f5, Infinityf) ? 0.0f : f5), windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, composer1, v3 >> 3 & 14 | 0xC00 | v3 << 3 & 0x70 | 0xE000 & v3 << 12 | 0x380000 & v3 << 12 | v3 << 12 & 0x1C00000, v3 >> 18 & 0x3FE, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f2 = f4;
            windowInsets1 = windowInsets2;
            topAppBarScrollBehavior1 = topAppBarScrollBehavior2;
            function22 = function23;
            function31 = function32;
            f3 = f5;
            topAppBarColors1 = topAppBarColors2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            topAppBarColors1 = topAppBarColors0;
            function22 = function21;
            function31 = function30;
            f2 = f;
            f3 = f1;
            windowInsets1 = windowInsets0;
            topAppBarScrollBehavior1 = topAppBarScrollBehavior0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i0(function20, modifier1, function22, function31, f2, f3, windowInsets1, topAppBarColors1, topAppBarScrollBehavior1, v, v1, 0));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of MediumTopAppBar with collapsedHeight and expandedHeight parameters")
    public static final void MediumTopAppBar(Function2 function20, Modifier modifier0, Function2 function21, Function3 function30, WindowInsets windowInsets0, TopAppBarColors topAppBarColors0, TopAppBarScrollBehavior topAppBarScrollBehavior0, Composer composer0, int v, int v1) {
        TopAppBarScrollBehavior topAppBarScrollBehavior1;
        TopAppBarColors topAppBarColors2;
        Function3 function32;
        Function2 function23;
        Modifier modifier2;
        int v5;
        TopAppBarColors topAppBarColors3;
        WindowInsets windowInsets2;
        Function3 function33;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        int v4;
        TopAppBarColors topAppBarColors1;
        int v3;
        WindowInsets windowInsets1;
        Function3 function31;
        Function2 function22;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(1805417862);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
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
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            function22 = function21;
        }
        else if((v & 0x180) == 0) {
            function22 = function21;
            v2 |= (composer1.changedInstance(function22) ? 0x100 : 0x80);
        }
        else {
            function22 = function21;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function31 = function30;
        }
        else if((v & 0xC00) == 0) {
            function31 = function30;
            v2 |= (composer1.changedInstance(function31) ? 0x800 : 0x400);
        }
        else {
            function31 = function30;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                windowInsets1 = windowInsets0;
                v3 = composer1.changed(windowInsets1) ? 0x4000 : 0x2000;
            }
            else {
                windowInsets1 = windowInsets0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            windowInsets1 = windowInsets0;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                topAppBarColors1 = topAppBarColors0;
                v4 = composer1.changed(topAppBarColors1) ? 0x20000 : 0x10000;
            }
            else {
                topAppBarColors1 = topAppBarColors0;
                v4 = 0x10000;
            }
            v2 |= v4;
        }
        else {
            topAppBarColors1 = topAppBarColors0;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((0x180000 & v) == 0) {
            v2 |= (composer1.changed(topAppBarScrollBehavior0) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v2) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 2) == 0 ? modifier1 : Modifier.Companion;
                if((v1 & 4) != 0) {
                    function22 = ComposableSingletons.AppBarKt.INSTANCE.getLambda-9$material3_release();
                }
                if((v1 & 8) != 0) {
                    function31 = ComposableSingletons.AppBarKt.INSTANCE.getLambda-10$material3_release();
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                    windowInsets1 = TopAppBarDefaults.INSTANCE.getWindowInsets(composer1, 6);
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                    topAppBarColors1 = TopAppBarDefaults.INSTANCE.mediumTopAppBarColors(composer1, 6);
                }
                if((v1 & 0x40) == 0) {
                    v5 = v2;
                label_102:
                    function33 = function31;
                    windowInsets2 = windowInsets1;
                    topAppBarColors3 = topAppBarColors1;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior0;
                }
                else {
                    v5 = v2;
                    topAppBarScrollBehavior2 = null;
                    function33 = function31;
                    windowInsets2 = windowInsets1;
                    topAppBarColors3 = topAppBarColors1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                v5 = v2;
                modifier2 = modifier1;
                goto label_102;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1805417862, v5, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:400)");
            }
            AppBarKt.MediumTopAppBar-oKE7A98(function20, modifier2, function22, function33, 0.0f, 0.0f, windowInsets2, topAppBarColors3, topAppBarScrollBehavior2, composer1, v5 & 14 | 0x36000 | v5 & 0x70 | v5 & 0x380 | v5 & 0x1C00 | 0x380000 & v5 << 6 | 0x1C00000 & v5 << 6 | v5 << 6 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            windowInsets1 = windowInsets2;
            function32 = function33;
            function23 = function22;
            topAppBarScrollBehavior1 = topAppBarScrollBehavior2;
            topAppBarColors2 = topAppBarColors3;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            function23 = function22;
            function32 = function31;
            topAppBarColors2 = topAppBarColors1;
            topAppBarScrollBehavior1 = topAppBarScrollBehavior0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g0(function20, modifier1, function23, function32, windowInsets1, topAppBarColors2, topAppBarScrollBehavior1, v, v1, 2));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void MediumTopAppBar-oKE7A98(@NotNull Function2 function20, @Nullable Modifier modifier0, @Nullable Function2 function21, @Nullable Function3 function30, float f, float f1, @Nullable WindowInsets windowInsets0, @Nullable TopAppBarColors topAppBarColors0, @Nullable TopAppBarScrollBehavior topAppBarScrollBehavior0, @Nullable Composer composer0, int v, int v1) {
        TopAppBarScrollBehavior topAppBarScrollBehavior1;
        WindowInsets windowInsets1;
        float f3;
        float f2;
        Function3 function31;
        Function2 function22;
        TopAppBarColors topAppBarColors1;
        Modifier modifier1;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        WindowInsets windowInsets2;
        float f5;
        float f4;
        Function3 function32;
        Function2 function23;
        int v3;
        TopAppBarColors topAppBarColors2;
        TopAppBarColors topAppBarColors3;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x70023086);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
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
            v2 |= (composer1.changedInstance(function21) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changed(f) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(f1) ? 0x20000 : 0x10000);
        }
        if((v & 0x180000) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(windowInsets0) ? 0x80000 : 0x100000);
        }
        if((v & 0xC00000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.changed(topAppBarColors0) ? 0x400000 : 0x800000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changed(topAppBarScrollBehavior0) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                function23 = (v1 & 4) == 0 ? function21 : ComposableSingletons.AppBarKt.INSTANCE.getLambda-11$material3_release();
                function32 = (v1 & 8) == 0 ? function30 : ComposableSingletons.AppBarKt.INSTANCE.getLambda-12$material3_release();
                f4 = (v1 & 16) == 0 ? f : 0.0f;
                f5 = (v1 & 0x20) == 0 ? f1 : 0.0f;
                if((v1 & 0x40) == 0) {
                    windowInsets2 = windowInsets0;
                }
                else {
                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composer1, 6);
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x80) == 0) {
                    topAppBarColors3 = topAppBarColors0;
                }
                else {
                    topAppBarColors3 = TopAppBarDefaults.INSTANCE.mediumTopAppBarColors(composer1, 6);
                    v2 &= 0xFE3FFFFF;
                }
                if((v1 & 0x100) == 0) {
                    topAppBarColors2 = topAppBarColors3;
                    v3 = v2;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior0;
                }
                else {
                    topAppBarScrollBehavior2 = null;
                    topAppBarColors2 = topAppBarColors3;
                    v3 = v2;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                modifier1 = modifier0;
                topAppBarColors2 = topAppBarColors0;
                v3 = v2;
                function23 = function21;
                function32 = function30;
                f4 = f;
                f5 = f1;
                windowInsets2 = windowInsets0;
                topAppBarScrollBehavior2 = topAppBarScrollBehavior0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x70023086, v3, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:469)");
            }
            TextStyle textStyle0 = TypographyKt.getValue(TopAppBarMediumTokens.INSTANCE.getHeadlineFont(), composer1, 6);
            TextStyle textStyle1 = TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composer1, 6);
            AppBarKt.b(modifier1, function20, textStyle0, AppBarKt.f, function20, textStyle1, function23, function32, (Dp.equals-impl0(f4, NaNf) || Dp.equals-impl0(f4, Infinityf) ? 0.0f : f4), (Dp.equals-impl0(f5, NaNf) || Dp.equals-impl0(f5, Infinityf) ? 0.0f : f5), windowInsets2, topAppBarColors2, topAppBarScrollBehavior2, composer1, v3 >> 3 & 14 | 0xC00 | v3 << 3 & 0x70 | 0xE000 & v3 << 12 | 0x380000 & v3 << 12 | v3 << 12 & 0x1C00000, v3 >> 18 & 0x3FE, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f2 = f4;
            windowInsets1 = windowInsets2;
            topAppBarScrollBehavior1 = topAppBarScrollBehavior2;
            function22 = function23;
            function31 = function32;
            f3 = f5;
            topAppBarColors1 = topAppBarColors2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            topAppBarColors1 = topAppBarColors0;
            function22 = function21;
            function31 = function30;
            f2 = f;
            f3 = f1;
            windowInsets1 = windowInsets0;
            topAppBarScrollBehavior1 = topAppBarScrollBehavior0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i0(function20, modifier1, function22, function31, f2, f3, windowInsets1, topAppBarColors1, topAppBarScrollBehavior1, v, v1, 1));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of TopAppBar with expandedHeight parameter")
    public static final void TopAppBar(Function2 function20, Modifier modifier0, Function2 function21, Function3 function30, WindowInsets windowInsets0, TopAppBarColors topAppBarColors0, TopAppBarScrollBehavior topAppBarScrollBehavior0, Composer composer0, int v, int v1) {
        TopAppBarScrollBehavior topAppBarScrollBehavior1;
        TopAppBarColors topAppBarColors2;
        Function3 function32;
        Function2 function23;
        Modifier modifier2;
        int v5;
        TopAppBarColors topAppBarColors3;
        WindowInsets windowInsets2;
        Function3 function33;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        int v4;
        TopAppBarColors topAppBarColors1;
        int v3;
        WindowInsets windowInsets1;
        Function3 function31;
        Function2 function22;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(1906353009);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
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
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            function22 = function21;
        }
        else if((v & 0x180) == 0) {
            function22 = function21;
            v2 |= (composer1.changedInstance(function22) ? 0x100 : 0x80);
        }
        else {
            function22 = function21;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function31 = function30;
        }
        else if((v & 0xC00) == 0) {
            function31 = function30;
            v2 |= (composer1.changedInstance(function31) ? 0x800 : 0x400);
        }
        else {
            function31 = function30;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                windowInsets1 = windowInsets0;
                v3 = composer1.changed(windowInsets1) ? 0x4000 : 0x2000;
            }
            else {
                windowInsets1 = windowInsets0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            windowInsets1 = windowInsets0;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                topAppBarColors1 = topAppBarColors0;
                v4 = composer1.changed(topAppBarColors1) ? 0x20000 : 0x10000;
            }
            else {
                topAppBarColors1 = topAppBarColors0;
                v4 = 0x10000;
            }
            v2 |= v4;
        }
        else {
            topAppBarColors1 = topAppBarColors0;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((0x180000 & v) == 0) {
            v2 |= (composer1.changed(topAppBarScrollBehavior0) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v2) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 2) == 0 ? modifier1 : Modifier.Companion;
                if((v1 & 4) != 0) {
                    function22 = ComposableSingletons.AppBarKt.INSTANCE.getLambda-1$material3_release();
                }
                if((v1 & 8) != 0) {
                    function31 = ComposableSingletons.AppBarKt.INSTANCE.getLambda-2$material3_release();
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                    windowInsets1 = TopAppBarDefaults.INSTANCE.getWindowInsets(composer1, 6);
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                    topAppBarColors1 = TopAppBarDefaults.INSTANCE.topAppBarColors(composer1, 6);
                }
                if((v1 & 0x40) == 0) {
                    v5 = v2;
                label_102:
                    function33 = function31;
                    windowInsets2 = windowInsets1;
                    topAppBarColors3 = topAppBarColors1;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior0;
                }
                else {
                    v5 = v2;
                    topAppBarScrollBehavior2 = null;
                    function33 = function31;
                    windowInsets2 = windowInsets1;
                    topAppBarColors3 = topAppBarColors1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                v5 = v2;
                modifier2 = modifier1;
                goto label_102;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1906353009, v5, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:146)");
            }
            AppBarKt.TopAppBar-GHTll3U(function20, modifier2, function22, function33, 0.0f, windowInsets2, topAppBarColors3, topAppBarScrollBehavior2, composer1, v5 & 14 | 0x6000 | v5 & 0x70 | v5 & 0x380 | v5 & 0x1C00 | 0x70000 & v5 << 3 | 0x380000 & v5 << 3 | v5 << 3 & 0x1C00000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            windowInsets1 = windowInsets2;
            function32 = function33;
            function23 = function22;
            topAppBarScrollBehavior1 = topAppBarScrollBehavior2;
            topAppBarColors2 = topAppBarColors3;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            function23 = function22;
            function32 = function31;
            topAppBarColors2 = topAppBarColors1;
            topAppBarScrollBehavior1 = topAppBarScrollBehavior0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g0(function20, modifier1, function23, function32, windowInsets1, topAppBarColors2, topAppBarScrollBehavior1, v, v1, 3));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TopAppBar-GHTll3U(@NotNull Function2 function20, @Nullable Modifier modifier0, @Nullable Function2 function21, @Nullable Function3 function30, float f, @Nullable WindowInsets windowInsets0, @Nullable TopAppBarColors topAppBarColors0, @Nullable TopAppBarScrollBehavior topAppBarScrollBehavior0, @Nullable Composer composer0, int v, int v1) {
        TopAppBarColors topAppBarColors2;
        WindowInsets windowInsets2;
        float f2;
        Function3 function32;
        Function2 function23;
        TopAppBarScrollBehavior topAppBarScrollBehavior1;
        Modifier modifier1;
        int v4;
        TopAppBarColors topAppBarColors1;
        int v3;
        WindowInsets windowInsets1;
        float f1;
        Function3 function31;
        Function2 function22;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xD7AC143);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
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
            function22 = function21;
        }
        else if((v & 0x180) == 0) {
            function22 = function21;
            v2 |= (composer1.changedInstance(function22) ? 0x100 : 0x80);
        }
        else {
            function22 = function21;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function31 = function30;
        }
        else if((v & 0xC00) == 0) {
            function31 = function30;
            v2 |= (composer1.changedInstance(function31) ? 0x800 : 0x400);
        }
        else {
            function31 = function30;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            f1 = f;
        }
        else if((v & 0x6000) == 0) {
            f1 = f;
            v2 |= (composer1.changed(f1) ? 0x4000 : 0x2000);
        }
        else {
            f1 = f;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                windowInsets1 = windowInsets0;
                v3 = composer1.changed(windowInsets1) ? 0x20000 : 0x10000;
            }
            else {
                windowInsets1 = windowInsets0;
                v3 = 0x10000;
            }
            v2 |= v3;
        }
        else {
            windowInsets1 = windowInsets0;
        }
        if((0x180000 & v) == 0) {
            if((v1 & 0x40) == 0) {
                topAppBarColors1 = topAppBarColors0;
                v4 = composer1.changed(topAppBarColors1) ? 0x100000 : 0x80000;
            }
            else {
                topAppBarColors1 = topAppBarColors0;
                v4 = 0x80000;
            }
            v2 |= v4;
        }
        else {
            topAppBarColors1 = topAppBarColors0;
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changed(topAppBarScrollBehavior0) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x492493) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 4) != 0) {
                    function22 = ComposableSingletons.AppBarKt.INSTANCE.getLambda-3$material3_release();
                }
                if((v1 & 8) != 0) {
                    function31 = ComposableSingletons.AppBarKt.INSTANCE.getLambda-4$material3_release();
                }
                if((v1 & 16) != 0) {
                    f1 = 0.0f;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                    windowInsets1 = TopAppBarDefaults.INSTANCE.getWindowInsets(composer1, 6);
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                    topAppBarColors1 = TopAppBarDefaults.INSTANCE.topAppBarColors(composer1, 6);
                }
                topAppBarScrollBehavior1 = (v1 & 0x80) == 0 ? topAppBarScrollBehavior0 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                modifier1 = modifier0;
                topAppBarScrollBehavior1 = topAppBarScrollBehavior0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD7AC143, v2, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:208)");
            }
            AppBarKt.a(modifier1, function20, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composer1, 6), false, function22, function31, (Dp.equals-impl0(f1, NaNf) || Dp.equals-impl0(f1, Infinityf) ? 0.0f : f1), windowInsets1, topAppBarColors1, topAppBarScrollBehavior1, composer1, 0xE000 & v2 << 6 | (v2 >> 3 & 14 | 0xC00 | v2 << 3 & 0x70) | 0x70000 & v2 << 6 | 0x1C00000 & v2 << 6 | 0xE000000 & v2 << 6 | v2 << 6 & 0x70000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f2 = f1;
            function23 = function22;
            topAppBarColors2 = topAppBarColors1;
            windowInsets2 = windowInsets1;
            function32 = function31;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            topAppBarScrollBehavior1 = topAppBarScrollBehavior0;
            function23 = function22;
            function32 = function31;
            f2 = f1;
            windowInsets2 = windowInsets1;
            topAppBarColors2 = topAppBarColors1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h0(function20, modifier1, function23, function32, f2, windowInsets2, topAppBarColors2, topAppBarScrollBehavior1, v, v1, 1));
        }
    }

    public static final void a(Modifier modifier0, Function2 function20, TextStyle textStyle0, boolean z, Function2 function21, Function3 function30, float f, WindowInsets windowInsets0, TopAppBarColors topAppBarColors0, TopAppBarScrollBehavior topAppBarScrollBehavior0, Composer composer0, int v, int v1) {
        Modifier modifier3;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xEB9A8521);
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
            v2 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(textStyle0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changedInstance(function21) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changed(f) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changed(windowInsets0) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changed(topAppBarColors0) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v2 |= (composer1.changed(topAppBarScrollBehavior0) ? 0x20000000 : 0x10000000);
        }
        if((306783379 & v2) == 306783378 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        else {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEB9A8521, v2, -1, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1861)");
            }
            if(Float.isNaN(f) || f == Infinityf) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            float f1 = c.coerceAtLeast(((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(f), 0.0f);
            boolean z1 = composer1.changed(f1);
            j0 j00 = composer1.rememberedValue();
            if((0x70000000 & v2) == 0x20000000 || z1 || j00 == Composer.Companion.getEmpty()) {
                j00 = new j0(topAppBarScrollBehavior0, f1);
                composer1.updateRememberedValue(j00);
            }
            EffectsKt.SideEffect(j00, composer1, 0);
            State state0 = composer1.rememberedValue();
            if((0x70000000 & v2) == 0x20000000 || state0 == Composer.Companion.getEmpty()) {
                state0 = SnapshotStateKt.derivedStateOf(new b(topAppBarScrollBehavior0, 3));
                composer1.updateRememberedValue(state0);
            }
            State state1 = SingleValueAnimationKt.animateColorAsState-euL9pac(topAppBarColors0.containerColor-vNxB06k$material3_release(((Number)state0.getValue()).floatValue()), AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), null, null, composer1, 0x30, 12);
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(1370231018, true, new n0(function30), composer1, 54);
            composer1.startReplaceGroup(0xB8DB07DB);
            if(topAppBarScrollBehavior0 == null || topAppBarScrollBehavior0.isPinned()) {
                modifier3 = Modifier.Companion;
            }
            else {
                Companion modifier$Companion0 = Modifier.Companion;
                Orientation orientation0 = Orientation.Vertical;
                o0 o00 = composer1.rememberedValue();
                if((0x70000000 & v2) == 0x20000000 || o00 == Composer.Companion.getEmpty()) {
                    o00 = new o0(topAppBarScrollBehavior0, 0);
                    composer1.updateRememberedValue(o00);
                }
                boolean z2 = false;
                DraggableState draggableState0 = DraggableKt.rememberDraggableState(o00, composer1, 0);
                if((0x70000000 & v2) == 0x20000000) {
                    z2 = true;
                }
                p0 p00 = composer1.rememberedValue();
                if(z2 || p00 == Composer.Companion.getEmpty()) {
                    p00 = new p0(0, topAppBarScrollBehavior0, null);
                    composer1.updateRememberedValue(p00);
                }
                modifier3 = DraggableKt.draggable$default(modifier$Companion0, draggableState0, orientation0, false, null, false, null, p00, false, 0xBC, null);
            }
            composer1.endReplaceGroup();
            SurfaceKt.Surface-T9BRK9s(modifier2.then(modifier3), null, ((Color)state1.getValue()).unbox-impl(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(0x8C24E366, true, new l0(windowInsets0, f, topAppBarScrollBehavior0, topAppBarColors0, function20, textStyle0, z, function21, composableLambda0), composer1, 54), composer1, 0xC00000, 0x7A);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m0(modifier1, function20, textStyle0, z, function21, function30, f, windowInsets0, topAppBarColors0, topAppBarScrollBehavior0, v, v1));
        }
    }

    public static final void access$TopAppBarLayout-kXwM9vE(Modifier modifier0, ScrolledOffset scrolledOffset0, long v, long v1, long v2, Function2 function20, TextStyle textStyle0, float f, Vertical arrangement$Vertical0, Horizontal arrangement$Horizontal0, int v3, boolean z, Function2 function21, Function2 function22, Composer composer0, int v4, int v5) {
        Composer composer1 = composer0.startRestartGroup(0xD3BF3AC8);
        int v6 = (v4 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v4 : v4;
        int v7 = 16;
        if((v4 & 0x30) == 0) {
            v6 |= (((v4 & 0x40) == 0 ? composer1.changed(scrolledOffset0) : composer1.changedInstance(scrolledOffset0)) ? 0x20 : 16);
        }
        int v8 = 0x80;
        if((v4 & 0x180) == 0) {
            v6 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        int v9 = 0x400;
        if((v4 & 0xC00) == 0) {
            v6 |= (composer1.changed(v1) ? 0x800 : 0x400);
        }
        if((v4 & 0x6000) == 0) {
            v6 |= (composer1.changed(v2) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v4) == 0) {
            v6 |= (composer1.changedInstance(function20) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x180000) == 0) {
            v6 |= (composer1.changed(textStyle0) ? 0x100000 : 0x80000);
        }
        if((v4 & 0xC00000) == 0) {
            v6 |= (composer1.changed(f) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x6000000) == 0) {
            v6 |= (composer1.changed(arrangement$Vertical0) ? 0x4000000 : 0x2000000);
        }
        if((0x30000000 & v4) == 0) {
            v6 |= (composer1.changed(arrangement$Horizontal0) ? 0x20000000 : 0x10000000);
        }
        int v10 = (v5 & 6) == 0 ? (composer1.changed(v3) ? 4 : 2) | v5 : v5;
        if((v5 & 0x30) == 0) {
            if(composer1.changed(z)) {
                v7 = 0x20;
            }
            v10 |= v7;
        }
        if((v5 & 0x180) == 0) {
            if(composer1.changedInstance(function21)) {
                v8 = 0x100;
            }
            v10 |= v8;
        }
        if((v5 & 0xC00) == 0) {
            if(composer1.changedInstance(function22)) {
                v9 = 0x800;
            }
            v10 |= v9;
        }
        if((306783379 & v6) != 306783378 || (v10 & 0x493) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD3BF3AC8, v6, v10, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:2134)");
            }
            int v11 = (v6 & 0x70) == 0x20 || (v6 & 0x40) != 0 && composer1.changedInstance(scrolledOffset0) ? 1 : 0;
            s0 s00 = composer1.rememberedValue();
            if((v11 | ((0x70000000 & v6) == 0x20000000 ? 1 : 0) | ((0xE000000 & v6) == 0x4000000 ? 1 : 0) | ((v10 & 14) == 4 ? 1 : 0)) != 0 || s00 == Composer.Companion.getEmpty()) {
                s00 = new s0(scrolledOffset0, arrangement$Horizontal0, arrangement$Vertical0, v3);
                composer1.updateRememberedValue(s00);
            }
            int v12 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            Function2 function23 = a.r(composeUiNode$Companion0, composer1, s00, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v12)) {
                a.t(v12, composer1, v12, function23);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier2 = LayoutIdKt.layoutId(modifier$Companion0, "navigationIcon");
            float f1 = AppBarKt.h;
            Modifier modifier3 = PaddingKt.padding-qDBjuR0$default(modifier2, f1, 0.0f, 0.0f, 0.0f, 14, null);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v13 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            Function2 function24 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v13)) {
                a.t(v13, composer1, v13, function24);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(v)), function21, composer1, v10 >> 3 & 0x70 | ProvidedValue.$stable);
            composer1.endNode();
            Modifier modifier5 = PaddingKt.padding-VpY3zN4$default(LayoutIdKt.layoutId(modifier$Companion0, "title"), f1, 0.0f, 2, null);
            Modifier modifier6 = z ? SemanticsModifierKt.clearAndSetSemantics(modifier$Companion0, q0.w) : modifier$Companion0;
            Modifier modifier7 = GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(modifier5.then(modifier6), 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFFB, null);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v14 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier8 = ComposedModifierKt.materializeModifier(composer1, modifier7);
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
            Function2 function25 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v14)) {
                a.t(v14, composer1, v14, function25);
            }
            Updater.set-impl(composer1, modifier8, composeUiNode$Companion0.getSetModifier());
            ProvideContentColorTextStyleKt.ProvideContentColorTextStyle-3J-VO9M(v1, textStyle0, function20, composer1, v6 >> 15 & 0x70 | v6 >> 9 & 14 | v6 >> 9 & 0x380);
            composer1.endNode();
            Modifier modifier9 = PaddingKt.padding-qDBjuR0$default(LayoutIdKt.layoutId(modifier$Companion0, "actionIcons"), 0.0f, 0.0f, f1, 0.0f, 11, null);
            MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v15 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier10 = ComposedModifierKt.materializeModifier(composer1, modifier9);
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
            Function2 function26 = a.r(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap3);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v15)) {
                a.t(v15, composer1, v15, function26);
            }
            Updater.set-impl(composer1, modifier10, composeUiNode$Companion0.getSetModifier());
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(v2)), function22, composer1, v10 >> 6 & 0x70 | 8);
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
            scopeUpdateScope0.updateScope(new t0(modifier0, scrolledOffset0, v, v1, v2, function20, textStyle0, f, arrangement$Vertical0, arrangement$Horizontal0, v3, z, function21, function22, v4, v5));
        }
    }

    public static final float access$getBottomAppBarHorizontalPadding$p() [...] // 潜在的解密器

    public static final float access$getFABHorizontalPadding$p() [...] // 潜在的解密器

    public static final float access$getFABVerticalPadding$p() [...] // 潜在的解密器

    public static final float access$getTopAppBarTitleInset$p() [...] // 潜在的解密器

    public static final Object access$settleAppBar(TopAppBarState topAppBarState0, float f, DecayAnimationSpec decayAnimationSpec0, AnimationSpec animationSpec0, Continuation continuation0) {
        AnimationSpec animationSpec1;
        FloatRef ref$FloatRef0;
        a1 a10;
        TopAppBarState topAppBarState1 = topAppBarState0;
        if(continuation0 instanceof a1) {
            a10 = (a1)continuation0;
            int v = a10.s;
            if((v & 0x80000000) == 0) {
                a10 = new a1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                a10.s = v ^ 0x80000000;
            }
        }
        else {
            a10 = new a1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = a10.r;
        Velocity velocity0 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a10.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(topAppBarState0.getCollapsedFraction() < 0.01f || topAppBarState0.getCollapsedFraction() == 1.0f) {
                    return Velocity.box-impl(0L);
                }
                ref$FloatRef0 = new FloatRef();
                ref$FloatRef0.element = f;
                if(decayAnimationSpec0 == null || Math.abs(f) <= 1.0f) {
                    animationSpec1 = animationSpec0;
                }
                else {
                    FloatRef ref$FloatRef1 = new FloatRef();
                    AnimationState animationState0 = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                    b1 b10 = new b1(ref$FloatRef1, topAppBarState1, ref$FloatRef0);
                    a10.o = topAppBarState1;
                    animationSpec1 = animationSpec0;
                    a10.p = animationSpec1;
                    a10.q = ref$FloatRef0;
                    a10.s = 1;
                    if(SuspendAnimationKt.animateDecay$default(animationState0, decayAnimationSpec0, false, b10, a10, 2, null) == velocity0) {
                        return velocity0;
                    }
                }
                goto label_39;
            }
            case 1: {
                FloatRef ref$FloatRef2 = a10.q;
                AnimationSpec animationSpec2 = a10.p;
                TopAppBarState topAppBarState2 = (TopAppBarState)a10.o;
                ResultKt.throwOnFailure(object0);
                ref$FloatRef0 = ref$FloatRef2;
                animationSpec1 = animationSpec2;
                topAppBarState1 = topAppBarState2;
            label_39:
                if(animationSpec1 != null && topAppBarState1.getHeightOffset() < 0.0f && topAppBarState1.getHeightOffset() > topAppBarState1.getHeightOffsetLimit()) {
                    AnimationState animationState1 = AnimationStateKt.AnimationState$default(topAppBarState1.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
                    float f1 = topAppBarState1.getCollapsedFraction() < 0.5f ? 0.0f : topAppBarState1.getHeightOffsetLimit();
                    g1 g10 = new g1(topAppBarState1, 2);
                    a10.o = ref$FloatRef0;
                    a10.p = null;
                    a10.q = null;
                    a10.s = 2;
                    return SuspendAnimationKt.animateTo$default(animationState1, Boxing.boxFloat(f1), animationSpec1, false, g10, a10, 4, null) == velocity0 ? velocity0 : Velocity.box-impl(VelocityKt.Velocity(0.0f, ref$FloatRef0.element));
                }
                break;
            }
            case 2: {
                FloatRef ref$FloatRef3 = (FloatRef)a10.o;
                ResultKt.throwOnFailure(object0);
                ref$FloatRef0 = ref$FloatRef3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Velocity.box-impl(VelocityKt.Velocity(0.0f, ref$FloatRef0.element));
    }

    public static final Object access$settleAppBarBottom(BottomAppBarState bottomAppBarState0, float f, DecayAnimationSpec decayAnimationSpec0, AnimationSpec animationSpec0, Continuation continuation0) {
        AnimationSpec animationSpec1;
        FloatRef ref$FloatRef0;
        c1 c10;
        BottomAppBarState bottomAppBarState1 = bottomAppBarState0;
        if(continuation0 instanceof c1) {
            c10 = (c1)continuation0;
            int v = c10.s;
            if((v & 0x80000000) == 0) {
                c10 = new c1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                c10.s = v ^ 0x80000000;
            }
        }
        else {
            c10 = new c1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = c10.r;
        Velocity velocity0 = qd.a.getCOROUTINE_SUSPENDED();
        switch(c10.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(bottomAppBarState0.getCollapsedFraction() < 0.01f || bottomAppBarState0.getCollapsedFraction() == 1.0f) {
                    return Velocity.box-impl(0L);
                }
                ref$FloatRef0 = new FloatRef();
                ref$FloatRef0.element = f;
                if(decayAnimationSpec0 == null || Math.abs(f) <= 1.0f) {
                    animationSpec1 = animationSpec0;
                }
                else {
                    FloatRef ref$FloatRef1 = new FloatRef();
                    AnimationState animationState0 = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                    d1 d10 = new d1(ref$FloatRef1, bottomAppBarState1, ref$FloatRef0);
                    c10.o = bottomAppBarState1;
                    animationSpec1 = animationSpec0;
                    c10.p = animationSpec1;
                    c10.q = ref$FloatRef0;
                    c10.s = 1;
                    if(SuspendAnimationKt.animateDecay$default(animationState0, decayAnimationSpec0, false, d10, c10, 2, null) == velocity0) {
                        return velocity0;
                    }
                }
                goto label_39;
            }
            case 1: {
                FloatRef ref$FloatRef2 = c10.q;
                AnimationSpec animationSpec2 = c10.p;
                BottomAppBarState bottomAppBarState2 = (BottomAppBarState)c10.o;
                ResultKt.throwOnFailure(object0);
                ref$FloatRef0 = ref$FloatRef2;
                animationSpec1 = animationSpec2;
                bottomAppBarState1 = bottomAppBarState2;
            label_39:
                if(animationSpec1 != null && bottomAppBarState1.getHeightOffset() < 0.0f && bottomAppBarState1.getHeightOffset() > bottomAppBarState1.getHeightOffsetLimit()) {
                    AnimationState animationState1 = AnimationStateKt.AnimationState$default(bottomAppBarState1.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
                    float f1 = bottomAppBarState1.getCollapsedFraction() < 0.5f ? 0.0f : bottomAppBarState1.getHeightOffsetLimit();
                    g1 g10 = new g1(bottomAppBarState1, 3);
                    c10.o = ref$FloatRef0;
                    c10.p = null;
                    c10.q = null;
                    c10.s = 2;
                    return SuspendAnimationKt.animateTo$default(animationState1, Boxing.boxFloat(f1), animationSpec1, false, g10, c10, 4, null) == velocity0 ? velocity0 : Velocity.box-impl(VelocityKt.Velocity(0.0f, ref$FloatRef0.element));
                }
                break;
            }
            case 2: {
                FloatRef ref$FloatRef3 = (FloatRef)c10.o;
                ResultKt.throwOnFailure(object0);
                ref$FloatRef0 = ref$FloatRef3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Velocity.box-impl(VelocityKt.Velocity(0.0f, ref$FloatRef0.element));
    }

    public static final void b(Modifier modifier0, Function2 function20, TextStyle textStyle0, float f, Function2 function21, TextStyle textStyle1, Function2 function22, Function3 function30, float f1, float f2, WindowInsets windowInsets0, TopAppBarColors topAppBarColors0, TopAppBarScrollBehavior topAppBarScrollBehavior0, Composer composer0, int v, int v1, int v2) {
        Modifier modifier3;
        float f3;
        Modifier modifier1;
        int v6;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x45B079A0);
        if((v2 & 1) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        int v4 = 0x20;
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        int v5 = 0x80;
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v3 |= (composer1.changed(textStyle0) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v3 |= (composer1.changed(f) ? 0x800 : 0x400);
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
            v3 |= (composer1.changed(textStyle1) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v3 |= (composer1.changedInstance(function30) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v3 |= (composer1.changed(f1) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v3 |= (composer1.changed(f2) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 0x400) == 0) {
            v6 = (v1 & 6) == 0 ? v1 | (composer1.changed(windowInsets0) ? 4 : 2) : v1;
        }
        else {
            v6 = v1 | 6;
        }
        if((v2 & 0x800) != 0) {
            v6 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            if(!composer1.changed(topAppBarColors0)) {
                v4 = 16;
            }
            v6 |= v4;
        }
        int v7 = v6;
        if((v2 & 0x1000) != 0) {
            v7 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            if(composer1.changed(topAppBarScrollBehavior0)) {
                v5 = 0x100;
            }
            v7 |= v5;
        }
        if((306783379 & v3) == 306783378 && (v7 & 0x93) == 0x92 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        else {
            Modifier modifier2 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x45B079A0, v3, v7, "androidx.compose.material3.TwoRowsTopAppBar (AppBar.kt:1971)");
            }
            if(Float.isNaN(f1) || f1 == Infinityf) {
                throw new IllegalArgumentException("The collapsedHeight is expected to be specified and finite");
            }
            if(Float.isNaN(f2) || f2 == Infinityf) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            if(Dp.compareTo-0680j_4(f2, f1) < 0) {
                throw new IllegalArgumentException("The expandedHeight is expected to be greater or equal to the collapsedHeight");
            }
            FloatRef ref$FloatRef0 = new FloatRef();
            FloatRef ref$FloatRef1 = new FloatRef();
            IntRef ref$IntRef0 = new IntRef();
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            ref$FloatRef0.element = density0.toPx-0680j_4(f2);
            ref$FloatRef1.element = density0.toPx-0680j_4(f1);
            ref$IntRef0.element = density0.roundToPx-0680j_4(f);
            boolean z = composer1.changed(ref$FloatRef1.element);
            boolean z1 = composer1.changed(ref$FloatRef0.element);
            u0 u00 = composer1.rememberedValue();
            if(((v7 & 0x380) == 0x100 | z | z1) != 0 || u00 == Composer.Companion.getEmpty()) {
                u00 = new u0(topAppBarScrollBehavior0, ref$FloatRef1, ref$FloatRef0);
                composer1.updateRememberedValue(u00);
            }
            EffectsKt.SideEffect(u00, composer1, 0);
            if(topAppBarScrollBehavior0 == null) {
                f3 = 0.0f;
            }
            else {
                TopAppBarState topAppBarState0 = topAppBarScrollBehavior0.getState();
                f3 = topAppBarState0 == null ? 0.0f : topAppBarState0.getCollapsedFraction();
            }
            long v8 = topAppBarColors0.containerColor-vNxB06k$material3_release(f3);
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xFAAB5369, true, new y0(function30), composer1, 54);
            float f4 = AppBarKt.e.transform(f3);
            int v9 = f3 < 0.5f ? 1 : 0;
            composer1.startReplaceGroup(0x61D3BEC8);
            if(topAppBarScrollBehavior0 == null || topAppBarScrollBehavior0.isPinned()) {
                modifier3 = Modifier.Companion;
            }
            else {
                Companion modifier$Companion0 = Modifier.Companion;
                Orientation orientation0 = Orientation.Vertical;
                o0 o00 = composer1.rememberedValue();
                if((v7 & 0x380) == 0x100 || o00 == Composer.Companion.getEmpty()) {
                    o00 = new o0(topAppBarScrollBehavior0, 1);
                    composer1.updateRememberedValue(o00);
                }
                boolean z2 = false;
                DraggableState draggableState0 = DraggableKt.rememberDraggableState(o00, composer1, 0);
                if((v7 & 0x380) == 0x100) {
                    z2 = true;
                }
                p0 p00 = composer1.rememberedValue();
                if(z2 || p00 == Composer.Companion.getEmpty()) {
                    p00 = new p0(1, topAppBarScrollBehavior0, null);
                    composer1.updateRememberedValue(p00);
                }
                modifier3 = DraggableKt.draggable$default(modifier$Companion0, draggableState0, orientation0, false, null, false, null, p00, false, 0xBC, null);
            }
            composer1.endReplaceGroup();
            SurfaceKt.Surface-T9BRK9s(modifier2.then(modifier3), null, v8, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1350062619, true, new w0(windowInsets0, f1, topAppBarColors0, function21, textStyle1, f4, ((boolean)v9), function22, composableLambda0, f2, topAppBarScrollBehavior0, function20, textStyle0, 1.0f - f3, ref$IntRef0, ((boolean)(v9 ^ 1))), composer1, 54), composer1, 0xC00000, 0x7A);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x0(modifier1, function20, textStyle0, f, function21, textStyle1, function22, function30, f1, f2, windowInsets0, topAppBarColors0, topAppBarScrollBehavior0, v, v1, v2));
        }
    }

    public static final float getBottomAppBarVerticalPadding() [...] // 潜在的解密器

    @NotNull
    public static final CubicBezierEasing getTopTitleAlphaEasing() {
        return AppBarKt.e;
    }

    @ExperimentalMaterial3Api
    @Composable
    @NotNull
    public static final BottomAppBarState rememberBottomAppBarState(float f, float f1, float f2, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            f = -3.402823E+38f;
        }
        if((v1 & 2) != 0) {
            f1 = 0.0f;
        }
        if((v1 & 4) != 0) {
            f2 = 0.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x54B0D200, v, -1, "androidx.compose.material3.rememberBottomAppBarState (AppBar.kt:1610)");
        }
        int v2 = 0;
        Saver saver0 = BottomAppBarState.Companion.getSaver();
        int v3 = ((v & 14 ^ 6) <= 4 || !composer0.changed(f)) && (v & 6) != 4 ? 0 : 1;
        int v4 = ((v & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(f1)) && (v & 0x30) != 0x20 ? 0 : 1;
        if((v & 0x380 ^ 0x180) > 0x100 && composer0.changed(f2) || (v & 0x180) == 0x100) {
            v2 = 1;
        }
        z0 z00 = composer0.rememberedValue();
        if((v3 | v4 | v2) != 0 || z00 == Composer.Companion.getEmpty()) {
            z00 = new z0(f, f1, f2, 0);
            composer0.updateRememberedValue(z00);
        }
        BottomAppBarState bottomAppBarState0 = (BottomAppBarState)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, z00, composer0, 0, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bottomAppBarState0;
    }

    @ExperimentalMaterial3Api
    @Composable
    @NotNull
    public static final TopAppBarState rememberTopAppBarState(float f, float f1, float f2, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 1) != 0) {
            f = -3.402823E+38f;
        }
        if((v1 & 2) != 0) {
            f1 = 0.0f;
        }
        if((v1 & 4) != 0) {
            f2 = 0.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6B67E0A2, v, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:1291)");
        }
        int v2 = 0;
        Saver saver0 = TopAppBarState.Companion.getSaver();
        int v3 = ((v & 14 ^ 6) <= 4 || !composer0.changed(f)) && (v & 6) != 4 ? 0 : 1;
        int v4 = ((v & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(f1)) && (v & 0x30) != 0x20 ? 0 : 1;
        if((v & 0x380 ^ 0x180) > 0x100 && composer0.changed(f2) || (v & 0x180) == 0x100) {
            v2 = 1;
        }
        z0 z00 = composer0.rememberedValue();
        if((v3 | v4 | v2) != 0 || z00 == Composer.Companion.getEmpty()) {
            z00 = new z0(f, f1, f2, 1);
            composer0.updateRememberedValue(z00);
        }
        TopAppBarState topAppBarState0 = (TopAppBarState)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, z00, composer0, 0, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return topAppBarState0;
    }
}

