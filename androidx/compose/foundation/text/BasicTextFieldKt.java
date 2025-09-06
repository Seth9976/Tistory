package androidx.compose.foundation.text;

import aa.m;
import aa.o;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits.SingleLine;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifier;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.a;
import j0.a0;
import j0.b0;
import j0.c0;
import j0.e0;
import j0.f0;
import j0.g0;
import j0.h0;
import j0.i0;
import j0.j0;
import j0.q;
import j0.r;
import j0.s;
import j0.t;
import j0.u;
import j0.v;
import j0.w;
import j0.x;
import j0.y;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00BE\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u00DD\u0001\u0010%\u001A\u00020\u00182\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001A\u00020\u000F28\b\u0002\u0010\u001A\u001A2\u0012\u0004\u0012\u00020\u0012\u0012\u001B\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011\u00A2\u0006\u0002\b\u00192\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001F2\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!2\b\b\u0002\u0010$\u001A\u00020#H\u0007\u00A2\u0006\u0004\b%\u0010&\u001A\u00F3\u0001\u0010%\u001A\u00020\u00182\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001A\u00020\u000F28\b\u0002\u0010\u001A\u001A2\u0012\u0004\u0012\u00020\u0012\u0012\u001B\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011\u00A2\u0006\u0002\b\u00192\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\'2\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001F2\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!2\b\b\u0002\u0010$\u001A\u00020#2\b\b\u0002\u0010)\u001A\u00020\u0004H\u0001\u00A2\u0006\u0004\b%\u0010*\u001A\u0017\u0010-\u001A\u00020\u00182\u0006\u0010,\u001A\u00020+H\u0001\u00A2\u0006\u0004\b-\u0010.\u001A\u0017\u0010/\u001A\u00020\u00182\u0006\u0010,\u001A\u00020+H\u0001\u00A2\u0006\u0004\b/\u0010.\u001A\u00F0\u0001\u0010%\u001A\u00020\u00182\u0006\u00101\u001A\u0002002\u0012\u00103\u001A\u000E\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0018022\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u00105\u001A\u0002042\b\b\u0002\u00106\u001A\u00020\u00042\b\b\u0002\u00108\u001A\u0002072\b\b\u0002\u00109\u001A\u0002072\b\b\u0002\u0010;\u001A\u00020:2\u0014\b\u0002\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0018022\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u001D23\b\u0002\u0010>\u001A-\u0012\u001E\u0012\u001C\u0012\u0004\u0012\u00020\u00180\u0013\u00A2\u0006\u0002\b<\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u001802\u00A2\u0006\u0002\b<H\u0007\u00A2\u0006\u0004\b%\u0010?\u001A\u00F0\u0001\u0010%\u001A\u00020\u00182\u0006\u00101\u001A\u00020@2\u0012\u00103\u001A\u000E\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0018022\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u00105\u001A\u0002042\b\b\u0002\u00106\u001A\u00020\u00042\b\b\u0002\u00108\u001A\u0002072\b\b\u0002\u00109\u001A\u0002072\b\b\u0002\u0010;\u001A\u00020:2\u0014\b\u0002\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0018022\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u001D23\b\u0002\u0010>\u001A-\u0012\u001E\u0012\u001C\u0012\u0004\u0012\u00020\u00180\u0013\u00A2\u0006\u0002\b<\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u001802\u00A2\u0006\u0002\b<H\u0007\u00A2\u0006\u0004\b%\u0010A\u001A\u00E4\u0001\u0010%\u001A\u00020\u00182\u0006\u00101\u001A\u0002002\u0012\u00103\u001A\u000E\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0018022\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u00105\u001A\u0002042\b\b\u0002\u00106\u001A\u00020\u00042\b\b\u0002\u00108\u001A\u0002072\b\b\u0002\u0010;\u001A\u00020:2\u0014\b\u0002\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0018022\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u001D23\b\u0002\u0010>\u001A-\u0012\u001E\u0012\u001C\u0012\u0004\u0012\u00020\u00180\u0013\u00A2\u0006\u0002\b<\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u001802\u00A2\u0006\u0002\b<H\u0007\u00A2\u0006\u0004\b%\u0010B\u001A\u00E4\u0001\u0010%\u001A\u00020\u00182\u0006\u00101\u001A\u00020@2\u0012\u00103\u001A\u000E\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0018022\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u00105\u001A\u0002042\b\b\u0002\u00106\u001A\u00020\u00042\b\b\u0002\u00108\u001A\u0002072\b\b\u0002\u0010;\u001A\u00020:2\u0014\b\u0002\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0018022\b\b\u0002\u0010\u001C\u001A\u00020\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u001D23\b\u0002\u0010>\u001A-\u0012\u001E\u0012\u001C\u0012\u0004\u0012\u00020\u00180\u0013\u00A2\u0006\u0002\b<\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u001802\u00A2\u0006\u0002\b<H\u0007\u00A2\u0006\u0004\b%\u0010C\u00A8\u0006J\u00B2\u0006\f\u0010E\u001A\u00020D8\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010F\u001A\u00020D8\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010G\u001A\u00020D8\nX\u008A\u0084\u0002\u00B2\u0006\u000E\u0010H\u001A\u00020@8\n@\nX\u008A\u008E\u0002\u00B2\u0006\u000E\u0010I\u001A\u0002008\n@\nX\u008A\u008E\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/foundation/text/input/InputTransformation;", "inputTransformation", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "lineLimits", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "name", "getResult", "", "Lkotlin/ExtensionFunctionType;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "Landroidx/compose/foundation/text/input/OutputTransformation;", "outputTransformation", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "decorator", "Landroidx/compose/foundation/ScrollState;", "scrollState", "BasicTextField", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "codepointTransformation", "isPassword", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "selectionState", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/runtime/Composer;I)V", "TextFieldSelectionHandles", "", "value", "Lkotlin/Function1;", "onValueChange", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/runtime/Composable;", "innerTextField", "decorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "cursorHandleState", "startHandleState", "endHandleState", "textFieldValueState", "lastTextValue", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,868:1\n77#2:869\n77#2:870\n77#2:871\n77#2:897\n77#2:898\n77#2:899\n1223#3,6:872\n1223#3,3:878\n1226#3,3:882\n1223#3,6:885\n1223#3,6:891\n1223#3,6:900\n1223#3,6:906\n1223#3,6:952\n1223#3,6:958\n1223#3,6:964\n1223#3,6:970\n1223#3,6:976\n1223#3,6:982\n1223#3,6:988\n1223#3,6:994\n1223#3,6:1000\n1223#3,6:1006\n1223#3,6:1012\n1223#3,6:1018\n1223#3,6:1024\n1223#3,6:1030\n1223#3,6:1036\n1223#3,6:1042\n1#4:881\n71#5:912\n68#5,6:913\n74#5:947\n78#5:951\n78#6,6:919\n85#6,4:934\n89#6,2:944\n93#6:950\n368#7,9:925\n377#7:946\n378#7,2:948\n4032#8,6:938\n81#9:1048\n81#9:1049\n81#9:1050\n81#9:1051\n107#9,2:1052\n81#9:1054\n107#9,2:1055\n148#10:1057\n*S KotlinDebug\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n*L\n240#1:869\n241#1:870\n242#1:871\n285#1:897\n286#1:898\n287#1:899\n246#1:872,6\n252#1:878,3\n252#1:882,3\n272#1:885,6\n274#1:891,6\n288#1:900,6\n304#1:906,6\n417#1:952,6\n424#1:958,6\n430#1:964,6\n443#1:970,6\n450#1:976,6\n458#1:982,6\n466#1:988,6\n473#1:994,6\n481#1:1000,6\n615#1:1006,6\n621#1:1012,6\n630#1:1018,6\n634#1:1024,6\n767#1:1030,6\n804#1:1036,6\n844#1:1042,6\n343#1:912\n343#1:913,6\n343#1:947\n343#1:951\n343#1:919,6\n343#1:934,4\n343#1:944,2\n343#1:950\n343#1:925,9\n343#1:946\n343#1:948,2\n343#1:938,6\n417#1:1048\n443#1:1049\n466#1:1050\n615#1:1051\n615#1:1052,2\n630#1:1054\n630#1:1055,2\n500#1:1057\n*E\n"})
public final class BasicTextFieldKt {
    public static final long a;

    static {
        BasicTextFieldKt.a = DpKt.DpSize-YgX7TsA(40.0f, 40.0f);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    public static final void BasicTextField(@NotNull TextFieldState textFieldState0, @Nullable Modifier modifier0, boolean z, boolean z1, @Nullable InputTransformation inputTransformation0, @Nullable TextStyle textStyle0, @Nullable KeyboardOptions keyboardOptions0, @Nullable KeyboardActionHandler keyboardActionHandler0, @Nullable TextFieldLineLimits textFieldLineLimits0, @Nullable Function2 function20, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Brush brush0, @Nullable OutputTransformation outputTransformation0, @Nullable TextFieldDecorator textFieldDecorator0, @Nullable ScrollState scrollState0, @Nullable Composer composer0, int v, int v1, int v2) {
        ScrollState scrollState1;
        TextFieldDecorator textFieldDecorator1;
        OutputTransformation outputTransformation1;
        Brush brush1;
        MutableInteractionSource mutableInteractionSource1;
        Function2 function21;
        TextFieldLineLimits textFieldLineLimits1;
        KeyboardActionHandler keyboardActionHandler1;
        KeyboardOptions keyboardOptions1;
        TextStyle textStyle1;
        InputTransformation inputTransformation1;
        boolean z3;
        boolean z2;
        Modifier modifier1;
        KeyboardOptions keyboardOptions2;
        int v8;
        TextFieldDecorator textFieldDecorator2;
        OutputTransformation outputTransformation2;
        Brush brush2;
        Function2 function22;
        TextFieldLineLimits textFieldLineLimits2;
        KeyboardActionHandler keyboardActionHandler2;
        TextStyle textStyle2;
        InputTransformation inputTransformation2;
        boolean z5;
        boolean z4;
        Modifier modifier2;
        Modifier modifier4;
        int v6;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x1BFB15B1);
        int v3 = 2;
        if((v2 & 1) == 0) {
            v4 = (v & 6) == 0 ? v | (composer1.changed(textFieldState0) ? 4 : 2) : v;
        }
        else {
            v4 = v | 6;
        }
        if((v2 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        int v5 = v4;
        if((v2 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v5 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v5 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v5 |= (composer1.changed(inputTransformation0) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v5 |= (composer1.changed(textStyle0) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v5 |= (composer1.changed(keyboardOptions0) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v5 |= (composer1.changed(keyboardActionHandler0) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v5 |= (composer1.changed(textFieldLineLimits0) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v5 |= (composer1.changedInstance(function20) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 0x400) != 0) {
            v6 = v1 | 6;
        }
        else if((v1 & 6) == 0) {
            if(composer1.changed(mutableInteractionSource0)) {
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
            v6 |= (composer1.changed(brush0) ? 0x20 : 16);
        }
        int v7 = v6;
        if((v2 & 0x1000) != 0) {
            v7 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v7 |= (composer1.changed(outputTransformation0) ? 0x100 : 0x80);
        }
        if((v2 & 0x2000) != 0) {
            v7 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v7 |= (((v1 & 0x1000) == 0 ? composer1.changed(textFieldDecorator0) : composer1.changedInstance(textFieldDecorator0)) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v7 |= ((v2 & 0x4000) != 0 || !composer1.changed(scrollState0) ? 0x2000 : 0x4000);
        }
        if((306783379 & v5) != 306783378 || (v7 & 9363) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v2 & 4) == 0) {
                    z4 = z;
                    modifier4 = modifier3;
                }
                else {
                    modifier4 = modifier3;
                    z4 = true;
                }
                TextFieldDecorator textFieldDecorator3 = null;
                TextStyle textStyle3 = (v2 & 0x20) == 0 ? textStyle0 : TextStyle.Companion.getDefault();
                KeyboardOptions keyboardOptions3 = (v2 & 0x40) == 0 ? keyboardOptions0 : KeyboardOptions.Companion.getDefault();
                TextFieldLineLimits textFieldLineLimits3 = (v2 & 0x100) == 0 ? textFieldLineLimits0 : TextFieldLineLimits.Companion.getDefault();
                MutableInteractionSource mutableInteractionSource2 = (v2 & 0x400) == 0 ? mutableInteractionSource0 : null;
                Brush brush3 = (v2 & 0x800) == 0 ? brush0 : q.a;
                OutputTransformation outputTransformation3 = (v2 & 0x1000) == 0 ? outputTransformation0 : null;
                if((v2 & 0x2000) == 0) {
                    textFieldDecorator3 = textFieldDecorator0;
                }
                if((0x4000 & v2) == 0) {
                    modifier2 = modifier4;
                    scrollState1 = scrollState0;
                    v8 = v7;
                    mutableInteractionSource1 = mutableInteractionSource2;
                    brush2 = brush3;
                    outputTransformation2 = outputTransformation3;
                    textFieldDecorator2 = textFieldDecorator3;
                    keyboardOptions2 = keyboardOptions3;
                }
                else {
                    scrollState1 = ScrollKt.rememberScrollState(0, composer1, 0, 1);
                    v8 = v7 & 0xFFFF1FFF;
                    mutableInteractionSource1 = mutableInteractionSource2;
                    brush2 = brush3;
                    outputTransformation2 = outputTransformation3;
                    textFieldDecorator2 = textFieldDecorator3;
                    keyboardOptions2 = keyboardOptions3;
                    modifier2 = modifier4;
                }
                textFieldLineLimits2 = textFieldLineLimits3;
                keyboardActionHandler2 = (v2 & 0x80) == 0 ? keyboardActionHandler0 : null;
                function22 = (v2 & 0x200) == 0 ? function20 : null;
                z5 = (v2 & 8) == 0 ? z1 : false;
                inputTransformation2 = (v2 & 16) == 0 ? inputTransformation0 : null;
                textStyle2 = textStyle3;
            }
            else {
                composer1.skipToGroupEnd();
                if((0x4000 & v2) != 0) {
                    v7 &= 0xFFFF1FFF;
                }
                modifier2 = modifier0;
                z4 = z;
                z5 = z1;
                inputTransformation2 = inputTransformation0;
                textStyle2 = textStyle0;
                keyboardActionHandler2 = keyboardActionHandler0;
                textFieldLineLimits2 = textFieldLineLimits0;
                function22 = function20;
                mutableInteractionSource1 = mutableInteractionSource0;
                brush2 = brush0;
                outputTransformation2 = outputTransformation0;
                textFieldDecorator2 = textFieldDecorator0;
                scrollState1 = scrollState0;
                v8 = v7;
                keyboardOptions2 = keyboardOptions0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1BFB15B1, v5, v8, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:187)");
            }
            BasicTextFieldKt.BasicTextField(textFieldState0, modifier2, z4, z5, inputTransformation2, textStyle2, keyboardOptions2, keyboardActionHandler2, textFieldLineLimits2, function22, mutableInteractionSource1, brush2, null, outputTransformation2, textFieldDecorator2, scrollState1, false, composer1, v5 & 0x7FFFFFFE, v8 & 14 | 0x180 | v8 & 0x70 | v8 << 3 & 0x1C00 | 0xE000 & v8 << 3 | v8 << 3 & 0x70000, 0x10000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z3 = z5;
            brush1 = brush2;
            outputTransformation1 = outputTransformation2;
            textFieldDecorator1 = textFieldDecorator2;
            modifier1 = modifier2;
            inputTransformation1 = inputTransformation2;
            z2 = z4;
            function21 = function22;
            textFieldLineLimits1 = textFieldLineLimits2;
            keyboardActionHandler1 = keyboardActionHandler2;
            keyboardOptions1 = keyboardOptions2;
            textStyle1 = textStyle2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z;
            z3 = z1;
            inputTransformation1 = inputTransformation0;
            textStyle1 = textStyle0;
            keyboardOptions1 = keyboardOptions0;
            keyboardActionHandler1 = keyboardActionHandler0;
            textFieldLineLimits1 = textFieldLineLimits0;
            function21 = function20;
            mutableInteractionSource1 = mutableInteractionSource0;
            brush1 = brush0;
            outputTransformation1 = outputTransformation0;
            textFieldDecorator1 = textFieldDecorator0;
            scrollState1 = scrollState0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w(textFieldState0, modifier1, z2, z3, inputTransformation1, textStyle1, keyboardOptions1, keyboardActionHandler1, textFieldLineLimits1, function21, mutableInteractionSource1, brush1, outputTransformation1, textFieldDecorator1, scrollState1, v, v1, v2));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    public static final void BasicTextField(@NotNull TextFieldState textFieldState0, @Nullable Modifier modifier0, boolean z, boolean z1, @Nullable InputTransformation inputTransformation0, @Nullable TextStyle textStyle0, @Nullable KeyboardOptions keyboardOptions0, @Nullable KeyboardActionHandler keyboardActionHandler0, @Nullable TextFieldLineLimits textFieldLineLimits0, @Nullable Function2 function20, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Brush brush0, @Nullable CodepointTransformation codepointTransformation0, @Nullable OutputTransformation outputTransformation0, @Nullable TextFieldDecorator textFieldDecorator0, @Nullable ScrollState scrollState0, boolean z2, @Nullable Composer composer0, int v, int v1, int v2) {
        boolean z5;
        ScrollState scrollState1;
        TextFieldDecorator textFieldDecorator1;
        OutputTransformation outputTransformation1;
        CodepointTransformation codepointTransformation1;
        Brush brush1;
        MutableInteractionSource mutableInteractionSource1;
        Function2 function21;
        TextFieldLineLimits textFieldLineLimits1;
        KeyboardActionHandler keyboardActionHandler1;
        KeyboardOptions keyboardOptions1;
        TextStyle textStyle1;
        InputTransformation inputTransformation1;
        boolean z4;
        boolean z3;
        Modifier modifier1;
        Modifier modifier6;
        OutputTransformation outputTransformation4;
        CodepointTransformation codepointTransformation3;
        CodepointTransformation codepointTransformation4;
        MutableInteractionSource mutableInteractionSource5;
        MutableInteractionSource mutableInteractionSource4;
        Brush brush2;
        int v13;
        boolean z7;
        ScrollState scrollState2;
        TextFieldDecorator textFieldDecorator2;
        OutputTransformation outputTransformation2;
        CodepointTransformation codepointTransformation2;
        MutableInteractionSource mutableInteractionSource2;
        Function2 function22;
        TextFieldLineLimits textFieldLineLimits2;
        KeyboardActionHandler keyboardActionHandler2;
        TextStyle textStyle2;
        InputTransformation inputTransformation2;
        boolean z6;
        Modifier modifier2;
        int v12;
        int v11;
        int v9;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x398702F5);
        if((v2 & 1) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changed(textFieldState0) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        int v4 = 0x80;
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v3 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        int v5 = 0x400;
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v3 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        int v6 = 0x2000;
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v3 |= (composer1.changed(inputTransformation0) ? 0x4000 : 0x2000);
        }
        int v7 = 0x20000;
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v3 |= (composer1.changed(textStyle0) ? 0x20000 : 0x10000);
        }
        int v8 = 0x80000;
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v3 |= (composer1.changed(keyboardOptions0) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v3 |= (composer1.changed(keyboardActionHandler0) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v3 |= (composer1.changed(textFieldLineLimits0) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 0x400) == 0) {
            v9 = (v1 & 6) == 0 ? v1 | (composer1.changed(mutableInteractionSource0) ? 4 : 2) : v1;
        }
        else {
            v9 = v1 | 6;
        }
        if((v2 & 0x800) != 0) {
            v9 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v9 |= (composer1.changed(brush0) ? 0x20 : 16);
        }
        int v10 = v9;
        if((v2 & 0x1000) != 0) {
            v10 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            if(composer1.changed(codepointTransformation0)) {
                v4 = 0x100;
            }
            v10 |= v4;
        }
        if((v2 & 0x2000) == 0) {
            v11 = v2 & 0x2000;
            if((v1 & 0xC00) == 0) {
                if(composer1.changed(outputTransformation0)) {
                    v5 = 0x800;
                }
                v10 |= v5;
            }
        }
        else {
            v10 |= 0xC00;
            v11 = v2 & 0x2000;
        }
        if((v2 & 0x4000) == 0) {
            v12 = v2 & 0x4000;
            if((v1 & 0x6000) == 0) {
                if(((v1 & 0x8000) == 0 ? composer1.changed(textFieldDecorator0) : composer1.changedInstance(textFieldDecorator0))) {
                    v6 = 0x4000;
                }
                v10 |= v6;
            }
        }
        else {
            v10 |= 0x6000;
            v12 = v2 & 0x4000;
        }
        if((v1 & 0x30000) == 0) {
            if((v2 & 0x8000) != 0 || !composer1.changed(scrollState0)) {
                v7 = 0x10000;
            }
            v10 |= v7;
        }
        if((v2 & 0x10000) != 0) {
            v10 |= 0x180000;
        }
        else if((v1 & 0x180000) == 0) {
            if(composer1.changed(z2)) {
                v8 = 0x100000;
            }
            v10 |= v8;
        }
        if((v3 & 306783379) != 306783378 || (0x92493 & v10) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 2) == 0 ? modifier0 : Modifier.Companion;
                z3 = (v2 & 4) == 0 ? z : true;
                z6 = (v2 & 8) == 0 ? z1 : false;
                textStyle2 = (v2 & 0x20) == 0 ? textStyle0 : TextStyle.Companion.getDefault();
                keyboardOptions1 = (v2 & 0x40) == 0 ? keyboardOptions0 : KeyboardOptions.Companion.getDefault();
                TextFieldLineLimits textFieldLineLimits3 = (v2 & 0x100) == 0 ? textFieldLineLimits0 : TextFieldLineLimits.Companion.getDefault();
                Brush brush3 = (v2 & 0x800) == 0 ? brush0 : q.a;
                codepointTransformation2 = (v2 & 0x1000) == 0 ? codepointTransformation0 : null;
                OutputTransformation outputTransformation3 = v11 == 0 ? outputTransformation0 : null;
                textFieldDecorator2 = v12 == 0 ? textFieldDecorator0 : null;
                if((v2 & 0x8000) == 0) {
                    scrollState2 = scrollState0;
                }
                else {
                    scrollState2 = ScrollKt.rememberScrollState(0, composer1, 0, 1);
                    v10 &= 0xFFF8FFFF;
                }
                modifier2 = modifier3;
                if((v2 & 0x10000) == 0) {
                    v13 = v10;
                    outputTransformation2 = outputTransformation3;
                    z7 = z2;
                }
                else {
                    outputTransformation2 = outputTransformation3;
                    z7 = false;
                    v13 = v10;
                }
                brush2 = brush3;
                mutableInteractionSource2 = (v2 & 0x400) == 0 ? mutableInteractionSource0 : null;
                function22 = (v2 & 0x200) == 0 ? function20 : null;
                textFieldLineLimits2 = textFieldLineLimits3;
                keyboardActionHandler2 = (v2 & 0x80) == 0 ? keyboardActionHandler0 : null;
                inputTransformation2 = (v2 & 16) == 0 ? inputTransformation0 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x8000) != 0) {
                    v10 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                z3 = z;
                z6 = z1;
                inputTransformation2 = inputTransformation0;
                textStyle2 = textStyle0;
                keyboardOptions1 = keyboardOptions0;
                keyboardActionHandler2 = keyboardActionHandler0;
                textFieldLineLimits2 = textFieldLineLimits0;
                function22 = function20;
                mutableInteractionSource2 = mutableInteractionSource0;
                codepointTransformation2 = codepointTransformation0;
                outputTransformation2 = outputTransformation0;
                textFieldDecorator2 = textFieldDecorator0;
                scrollState2 = scrollState0;
                z7 = z2;
                v13 = v10;
                brush2 = brush0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x398702F5, v3, v13, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:238)");
            }
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            WindowInfo windowInfo0 = (WindowInfo)composer1.consume(CompositionLocalsKt.getLocalWindowInfo());
            boolean z8 = Intrinsics.areEqual(textFieldLineLimits2, SingleLine.INSTANCE);
            if(mutableInteractionSource2 == null) {
                composer1.startReplaceGroup(96938805);
                MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                mutableInteractionSource4 = null;
                if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                    mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                    composer1.updateRememberedValue(mutableInteractionSource3);
                }
                mutableInteractionSource5 = mutableInteractionSource3;
                composer1.endReplaceGroup();
            }
            else {
                mutableInteractionSource4 = mutableInteractionSource2;
                composer1.startReplaceGroup(0xB5DD1FE2);
                composer1.endReplaceGroup();
                mutableInteractionSource5 = mutableInteractionSource4;
            }
            Orientation orientation0 = z8 ? Orientation.Horizontal : Orientation.Vertical;
            boolean z9 = ((Boolean)FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource5, composer1, 0).getValue()).booleanValue();
            boolean z10 = ((Boolean)HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource5, composer1, 0).getValue()).booleanValue();
            boolean z11 = windowInfo0.isWindowFocused();
            TransformedTextFieldState transformedTextFieldState0 = composer1.rememberedValue();
            if((((v13 & 0x380) == 0x100 ? 1 : 0) | ((v3 & 14) == 4 ? 1 : 0) | ((v13 & 0x1C00) == 0x800 ? 1 : 0)) != 0 || transformedTextFieldState0 == Composer.Companion.getEmpty()) {
                if(codepointTransformation2 == null) {
                    codepointTransformation4 = (int v, int v1) -> switch(v1) {
                        case 10: {
                            return 0x20;
                        }
                        case 13: {
                            return 0xFEFF;
                        }
                        default: {
                            return v1;
                        }
                    };
                    if(!z8) {
                        codepointTransformation4 = null;
                    }
                }
                else {
                    codepointTransformation4 = codepointTransformation2;
                }
                codepointTransformation3 = codepointTransformation2;
                outputTransformation4 = outputTransformation2;
                transformedTextFieldState0 = new TransformedTextFieldState(textFieldState0, inputTransformation2, codepointTransformation4, outputTransformation4);
                composer1.updateRememberedValue(transformedTextFieldState0);
            }
            else {
                codepointTransformation3 = codepointTransformation2;
                outputTransformation4 = outputTransformation2;
            }
            boolean z12 = composer1.changed(transformedTextFieldState0);
            TextLayoutState textLayoutState0 = composer1.rememberedValue();
            if(z12 || textLayoutState0 == Composer.Companion.getEmpty()) {
                textLayoutState0 = new TextLayoutState();
                composer1.updateRememberedValue(textLayoutState0);
            }
            boolean z13 = composer1.changed(transformedTextFieldState0);
            TextFieldSelectionState textFieldSelectionState0 = composer1.rememberedValue();
            if(z13 || textFieldSelectionState0 == Composer.Companion.getEmpty()) {
                textFieldSelectionState0 = new TextFieldSelectionState(transformedTextFieldState0, textLayoutState0, density0, z3, z6, z9 && z11, z7);
                composer1.updateRememberedValue(textFieldSelectionState0);
            }
            HapticFeedback hapticFeedback0 = (HapticFeedback)composer1.consume(CompositionLocalsKt.getLocalHapticFeedback());
            ClipboardManager clipboardManager0 = (ClipboardManager)composer1.consume(CompositionLocalsKt.getLocalClipboardManager());
            TextToolbar textToolbar0 = (TextToolbar)composer1.consume(CompositionLocalsKt.getLocalTextToolbar());
            boolean z14 = composer1.changed(transformedTextFieldState0);
            boolean z15 = composer1.changedInstance(textFieldSelectionState0);
            boolean z16 = composer1.changedInstance(hapticFeedback0);
            boolean z17 = composer1.changedInstance(clipboardManager0);
            boolean z18 = composer1.changedInstance(textToolbar0);
            boolean z19 = composer1.changed(density0);
            x x0 = composer1.rememberedValue();
            if((z14 | (v3 & 0xE000) == 0x4000 | z15 | z16 | z17 | z18 | z19 | ((v3 & 0x380) == 0x100 ? 1 : 0) | ((v3 & 0x1C00) == 0x800 ? 1 : 0) | ((v13 & 0x380000) == 0x100000 ? 1 : 0)) != 0 || x0 == Composer.Companion.getEmpty()) {
                x0 = new x(transformedTextFieldState0, inputTransformation2, textFieldSelectionState0, hapticFeedback0, clipboardManager0, textToolbar0, density0, z3, z6, z7);
                composer1.updateRememberedValue(x0);
            }
            EffectsKt.SideEffect(x0, composer1, 0);
            boolean z20 = composer1.changedInstance(textFieldSelectionState0);
            y y0 = composer1.rememberedValue();
            if(z20 || y0 == Composer.Companion.getEmpty()) {
                y0 = new y(textFieldSelectionState0, 0);
                composer1.updateRememberedValue(y0);
            }
            EffectsKt.DisposableEffect(textFieldSelectionState0, y0, composer1, 0);
            Modifier modifier4 = PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(FocusableKt.focusable(modifier2.then(new TextFieldDecoratorModifier(transformedTextFieldState0, textLayoutState0, textFieldSelectionState0, inputTransformation2, z3, z6, keyboardOptions1, keyboardActionHandler2, z8, mutableInteractionSource5)), z3, mutableInteractionSource5), scrollState2, orientation0, z3 && textFieldSelectionState0.getDirectDragGestureInitiator() == InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection0, orientation0, false), null, mutableInteractionSource5, 16, null), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int v14 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            Function2 function23 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting()) {
                modifier6 = modifier2;
                a.t(v14, composer1, v14, function23);
            }
            else {
                modifier6 = modifier2;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v14)) {
                    a.t(v14, composer1, v14, function23);
                }
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState0, z3, ComposableLambdaKt.rememberComposableLambda(0xD7DF2601, true, new a0(textFieldDecorator2, textFieldLineLimits2, textLayoutState0, textStyle2, z9, z11, z10, transformedTextFieldState0, textFieldSelectionState0, brush2, z3, z6, scrollState2, orientation0, z8, function22), composer1, 54), composer1, v3 >> 3 & 0x70 | 0x180);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function21 = function22;
            brush1 = brush2;
            codepointTransformation1 = codepointTransformation3;
            keyboardActionHandler1 = keyboardActionHandler2;
            z4 = z6;
            z5 = z7;
            scrollState1 = scrollState2;
            textFieldDecorator1 = textFieldDecorator2;
            textStyle1 = textStyle2;
            textFieldLineLimits1 = textFieldLineLimits2;
            outputTransformation1 = outputTransformation4;
            mutableInteractionSource1 = mutableInteractionSource4;
            inputTransformation1 = inputTransformation2;
            modifier1 = modifier6;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z3 = z;
            z4 = z1;
            inputTransformation1 = inputTransformation0;
            textStyle1 = textStyle0;
            keyboardOptions1 = keyboardOptions0;
            keyboardActionHandler1 = keyboardActionHandler0;
            textFieldLineLimits1 = textFieldLineLimits0;
            function21 = function20;
            mutableInteractionSource1 = mutableInteractionSource0;
            brush1 = brush0;
            codepointTransformation1 = codepointTransformation0;
            outputTransformation1 = outputTransformation0;
            textFieldDecorator1 = textFieldDecorator0;
            scrollState1 = scrollState0;
            z5 = z2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(textFieldState0, modifier1, z3, z4, inputTransformation1, textStyle1, keyboardOptions1, keyboardActionHandler1, textFieldLineLimits1, function21, mutableInteractionSource1, brush1, codepointTransformation1, outputTransformation1, textFieldDecorator1, scrollState1, z5, v, v1, v2));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    public static final void BasicTextField(@NotNull TextFieldValue textFieldValue0, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z, boolean z1, @Nullable TextStyle textStyle0, @Nullable KeyboardOptions keyboardOptions0, @Nullable KeyboardActions keyboardActions0, boolean z2, int v, int v1, @Nullable VisualTransformation visualTransformation0, @Nullable Function1 function11, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Brush brush0, @Nullable Function3 function30, @Nullable Composer composer0, int v2, int v3, int v4) {
        int v12;
        Function3 function31;
        Brush brush1;
        MutableInteractionSource mutableInteractionSource1;
        Function1 function12;
        VisualTransformation visualTransformation1;
        int v11;
        boolean z5;
        KeyboardActions keyboardActions1;
        KeyboardOptions keyboardOptions1;
        TextStyle textStyle1;
        boolean z4;
        boolean z3;
        Modifier modifier1;
        int v16;
        Function3 function32;
        Brush brush2;
        MutableInteractionSource mutableInteractionSource2;
        Function1 function13;
        VisualTransformation visualTransformation2;
        int v15;
        int v14;
        boolean z8;
        KeyboardActions keyboardActions2;
        KeyboardOptions keyboardOptions2;
        TextStyle textStyle2;
        boolean z7;
        boolean z6;
        Modifier modifier2;
        Brush brush3;
        int v20;
        int v19;
        boolean z12;
        int v17;
        int v9;
        int v5;
        Composer composer1 = composer0.startRestartGroup(1804514146);
        if((v4 & 1) == 0) {
            v5 = (v2 & 6) == 0 ? (composer1.changed(textFieldValue0) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v5 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        int v6 = 0x400;
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            v5 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        int v7 = 0x2000;
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v2 & 0x6000) == 0) {
            v5 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        int v8 = 0x10000;
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v2 & 0x30000) == 0) {
            v5 |= (composer1.changed(textStyle0) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v5 |= (composer1.changed(keyboardOptions0) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v2 & 0xC00000) == 0) {
            v5 |= (composer1.changed(keyboardActions0) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v2 & 0x6000000) == 0) {
            v5 |= (composer1.changed(z2) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x30000000) == 0) {
            v5 |= ((v4 & 0x200) != 0 || !composer1.changed(v) ? 0x10000000 : 0x20000000);
        }
        if((v4 & 0x400) == 0) {
            v9 = (v3 & 6) == 0 ? v3 | (composer1.changed(v1) ? 4 : 2) : v3;
        }
        else {
            v9 = v3 | 6;
        }
        if((v4 & 0x800) != 0) {
            v9 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v9 |= (composer1.changed(visualTransformation0) ? 0x20 : 16);
        }
        int v10 = v9;
        if((v4 & 0x1000) != 0) {
            v10 |= 0x180;
        }
        else if((v3 & 0x180) == 0) {
            v10 |= (composer1.changedInstance(function11) ? 0x100 : 0x80);
        }
        if((v4 & 0x2000) != 0) {
            v10 |= 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            if(composer1.changed(mutableInteractionSource0)) {
                v6 = 0x800;
            }
            v10 |= v6;
        }
        if((v4 & 0x4000) != 0) {
            v10 |= 0x6000;
        }
        else if((v3 & 0x6000) == 0) {
            if(composer1.changed(brush0)) {
                v7 = 0x4000;
            }
            v10 |= v7;
        }
        if((v4 & 0x8000) != 0) {
            v10 |= 0x30000;
        }
        else if((v3 & 0x30000) == 0) {
            if(composer1.changedInstance(function30)) {
                v8 = 0x20000;
            }
            v10 |= v8;
        }
        if((v5 & 306783379) != 306783378 || (74899 & v10) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            int v13 = 1;
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v4 & 4) == 0 ? modifier0 : Modifier.Companion;
                boolean z9 = (v4 & 8) == 0 ? z : true;
                boolean z10 = (v4 & 16) == 0 ? z1 : false;
                TextStyle textStyle3 = (v4 & 0x20) == 0 ? textStyle0 : TextStyle.Companion.getDefault();
                KeyboardOptions keyboardOptions3 = (v4 & 0x40) == 0 ? keyboardOptions0 : KeyboardOptions.Companion.getDefault();
                KeyboardActions keyboardActions3 = (v4 & 0x80) == 0 ? keyboardActions0 : KeyboardActions.Companion.getDefault();
                boolean z11 = (v4 & 0x100) == 0 ? z2 : false;
                if((v4 & 0x200) == 0) {
                    v17 = v;
                }
                else {
                    v17 = z11 ? 1 : 0x7FFFFFFF;
                    v5 &= 0x8FFFFFFF;
                }
                int v18 = (v4 & 0x400) == 0 ? v1 : 1;
                VisualTransformation visualTransformation3 = (v4 & 0x800) == 0 ? visualTransformation0 : VisualTransformation.Companion.getNone();
                Function1 function14 = (v4 & 0x1000) == 0 ? function11 : r.w;
                MutableInteractionSource mutableInteractionSource3 = (v4 & 0x2000) == 0 ? mutableInteractionSource0 : null;
                if((v4 & 0x4000) == 0) {
                    z12 = z11;
                    v19 = v5;
                    v20 = v18;
                    brush3 = brush0;
                }
                else {
                    z12 = z11;
                    v19 = v5;
                    v20 = v18;
                    brush3 = new SolidColor(0xFF00000000000000L, null);
                }
                if((v4 & 0x8000) == 0) {
                    v16 = v19;
                    v15 = v20;
                    function32 = function30;
                    visualTransformation2 = visualTransformation3;
                    keyboardActions2 = keyboardActions3;
                    function13 = function14;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    brush2 = brush3;
                    z6 = z9;
                    v14 = v17;
                    z7 = z10;
                    textStyle2 = textStyle3;
                    keyboardOptions2 = keyboardOptions3;
                    z8 = z12;
                }
                else {
                    v15 = v20;
                    function32 = ComposableSingletons.BasicTextFieldKt.INSTANCE.getLambda-2$foundation_release();
                    visualTransformation2 = visualTransformation3;
                    keyboardActions2 = keyboardActions3;
                    function13 = function14;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    brush2 = brush3;
                    z6 = z9;
                    v14 = v17;
                    z7 = z10;
                    textStyle2 = textStyle3;
                    keyboardOptions2 = keyboardOptions3;
                    z8 = z12;
                    v16 = v19;
                }
                modifier2 = modifier3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 0x200) != 0) {
                    v5 &= 0x8FFFFFFF;
                }
                modifier2 = modifier0;
                z6 = z;
                z7 = z1;
                textStyle2 = textStyle0;
                keyboardOptions2 = keyboardOptions0;
                keyboardActions2 = keyboardActions0;
                z8 = z2;
                v14 = v;
                v15 = v1;
                visualTransformation2 = visualTransformation0;
                function13 = function11;
                mutableInteractionSource2 = mutableInteractionSource0;
                brush2 = brush0;
                function32 = function30;
                v16 = v5;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1804514146, v16, v10, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:763)");
            }
            ImeOptions imeOptions0 = keyboardOptions2.toImeOptions$foundation_release(z8);
            if((v16 & 0x70) != 0x20) {
                v13 = 0;
            }
            o o0 = composer1.rememberedValue();
            if((((v16 & 14) == 4 ? 1 : 0) | v13) != 0 || o0 == Composer.Companion.getEmpty()) {
                o0 = new o(29, textFieldValue0, function10);
                composer1.updateRememberedValue(o0);
            }
            CoreTextFieldKt.CoreTextField(textFieldValue0, o0, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource2, brush2, !z8, (z8 ? 1 : v14), (z8 ? 1 : v15), imeOptions0, keyboardActions2, z6, z7, function32, composer1, v16 & 910 | v16 >> 6 & 0x1C00 | 0xE000 & v10 << 9 | 0x70000 & v10 << 9 | 0x380000 & v10 << 9 | v10 << 9 & 0x1C00000, v16 & 0xE000 | (v16 >> 15 & 0x380 | v16 & 0x1C00) | 0x70000 & v10, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            z3 = z6;
            z4 = z7;
            textStyle1 = textStyle2;
            keyboardActions1 = keyboardActions2;
            v12 = v14;
            v11 = v15;
            visualTransformation1 = visualTransformation2;
            function12 = function13;
            mutableInteractionSource1 = mutableInteractionSource2;
            z5 = z8;
            keyboardOptions1 = keyboardOptions2;
            brush1 = brush2;
            function31 = function32;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z3 = z;
            z4 = z1;
            textStyle1 = textStyle0;
            keyboardOptions1 = keyboardOptions0;
            keyboardActions1 = keyboardActions0;
            z5 = z2;
            v11 = v1;
            visualTransformation1 = visualTransformation0;
            function12 = function11;
            mutableInteractionSource1 = mutableInteractionSource0;
            brush1 = brush0;
            function31 = function30;
            v12 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(textFieldValue0, function10, modifier1, z3, z4, textStyle1, keyboardOptions1, keyboardActions1, z5, v12, v11, visualTransformation1, function12, mutableInteractionSource1, brush1, function31, v2, v3, v4, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public static final void BasicTextField(TextFieldValue textFieldValue0, Function1 function10, Modifier modifier0, boolean z, boolean z1, TextStyle textStyle0, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, boolean z2, int v, VisualTransformation visualTransformation0, Function1 function11, MutableInteractionSource mutableInteractionSource0, Brush brush0, Function3 function30, Composer composer0, int v1, int v2, int v3) {
        Function3 function31;
        Brush brush1;
        MutableInteractionSource mutableInteractionSource1;
        Function1 function12;
        VisualTransformation visualTransformation1;
        int v9;
        boolean z5;
        KeyboardActions keyboardActions1;
        KeyboardOptions keyboardOptions1;
        TextStyle textStyle1;
        boolean z4;
        boolean z3;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource3;
        int v7;
        int v4;
        Composer composer1 = composer0.startRestartGroup(-560482651);
        if((v3 & 1) == 0) {
            v4 = (v1 & 6) == 0 ? (composer1.changed(textFieldValue0) ? 4 : 2) | v1 : v1;
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
        int v5 = 0x400;
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v4 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        int v6 = 0x2000;
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            v4 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v1 & 0x30000) == 0) {
            v4 |= (composer1.changed(textStyle0) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x180000) == 0) {
            v4 |= (composer1.changed(keyboardOptions0) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v1 & 0xC00000) == 0) {
            v4 |= (composer1.changed(keyboardActions0) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v1 & 0x6000000) == 0) {
            v4 |= (composer1.changed(z2) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((v1 & 0x30000000) == 0) {
            v4 |= (composer1.changed(v) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) == 0) {
            v7 = (v2 & 6) == 0 ? v2 | (composer1.changed(visualTransformation0) ? 4 : 2) : v2;
        }
        else {
            v7 = v2 | 6;
        }
        if((v3 & 0x800) != 0) {
            v7 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v7 |= (composer1.changedInstance(function11) ? 0x20 : 16);
        }
        int v8 = v7;
        if((v3 & 0x1000) != 0) {
            v8 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v8 |= (composer1.changed(mutableInteractionSource0) ? 0x100 : 0x80);
        }
        if((v3 & 0x2000) != 0) {
            v8 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            if(composer1.changed(brush0)) {
                v5 = 0x800;
            }
            v8 |= v5;
        }
        if((v3 & 0x4000) != 0) {
            v8 |= 0x6000;
        }
        else if((v2 & 0x6000) == 0) {
            if(composer1.changedInstance(function30)) {
                v6 = 0x4000;
            }
            v8 |= v6;
        }
        if((v4 & 306783379) != 306783378 || (v8 & 9363) != 9362 || !composer1.getSkipping()) {
            Modifier modifier2 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
            boolean z6 = (v3 & 8) == 0 ? z : true;
            boolean z7 = (v3 & 16) == 0 ? z1 : false;
            TextStyle textStyle2 = (v3 & 0x20) == 0 ? textStyle0 : TextStyle.Companion.getDefault();
            KeyboardOptions keyboardOptions2 = (v3 & 0x40) == 0 ? keyboardOptions0 : KeyboardOptions.Companion.getDefault();
            KeyboardActions keyboardActions2 = (v3 & 0x80) == 0 ? keyboardActions0 : KeyboardActions.Companion.getDefault();
            boolean z8 = (v3 & 0x100) == 0 ? z2 : false;
            int v10 = (v3 & 0x200) == 0 ? v : 0x7FFFFFFF;
            VisualTransformation visualTransformation2 = (v3 & 0x400) == 0 ? visualTransformation0 : VisualTransformation.Companion.getNone();
            Function1 function13 = (v3 & 0x800) == 0 ? function11 : v.w;
            if((v3 & 0x1000) == 0) {
                mutableInteractionSource3 = mutableInteractionSource0;
            }
            else {
                MutableInteractionSource mutableInteractionSource2 = composer1.rememberedValue();
                if(mutableInteractionSource2 == Composer.Companion.getEmpty()) {
                    mutableInteractionSource2 = InteractionSourceKt.MutableInteractionSource();
                    composer1.updateRememberedValue(mutableInteractionSource2);
                }
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            Brush brush2 = (v3 & 0x2000) == 0 ? brush0 : new SolidColor(0xFF00000000000000L, null);
            Function3 function32 = (v3 & 0x4000) == 0 ? function30 : ComposableSingletons.BasicTextFieldKt.INSTANCE.getLambda-4$foundation_release();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-560482651, v4, v8, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:847)");
            }
            BasicTextFieldKt.BasicTextField(textFieldValue0, function10, modifier2, z6, z7, textStyle2, keyboardOptions2, keyboardActions2, z8, v10, 1, visualTransformation2, function13, mutableInteractionSource3, brush2, function32, composer1, v4 & 0x7FFFFFFE, v8 << 3 & 0x70 | 6 | v8 << 3 & 0x380 | v8 << 3 & 0x1C00 | 0xE000 & v8 << 3 | v8 << 3 & 0x70000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function31 = function32;
            visualTransformation1 = visualTransformation2;
            brush1 = brush2;
            modifier1 = modifier2;
            keyboardActions1 = keyboardActions2;
            z4 = z7;
            textStyle1 = textStyle2;
            z5 = z8;
            v9 = v10;
            mutableInteractionSource1 = mutableInteractionSource3;
            keyboardOptions1 = keyboardOptions2;
            function12 = function13;
            z3 = z6;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z3 = z;
            z4 = z1;
            textStyle1 = textStyle0;
            keyboardOptions1 = keyboardOptions0;
            keyboardActions1 = keyboardActions0;
            z5 = z2;
            v9 = v;
            visualTransformation1 = visualTransformation0;
            function12 = function11;
            mutableInteractionSource1 = mutableInteractionSource0;
            brush1 = brush0;
            function31 = function30;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u(textFieldValue0, function10, modifier1, z3, z4, textStyle1, keyboardOptions1, keyboardActions1, z5, v9, visualTransformation1, function12, mutableInteractionSource1, brush1, function31, v1, v2, v3, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    public static final void BasicTextField(@NotNull String s, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z, boolean z1, @Nullable TextStyle textStyle0, @Nullable KeyboardOptions keyboardOptions0, @Nullable KeyboardActions keyboardActions0, boolean z2, int v, int v1, @Nullable VisualTransformation visualTransformation0, @Nullable Function1 function11, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Brush brush0, @Nullable Function3 function30, @Nullable Composer composer0, int v2, int v3, int v4) {
        Function3 function31;
        Brush brush1;
        MutableInteractionSource mutableInteractionSource1;
        Function1 function12;
        VisualTransformation visualTransformation1;
        int v12;
        int v11;
        boolean z5;
        KeyboardActions keyboardActions1;
        KeyboardOptions keyboardOptions1;
        TextStyle textStyle1;
        boolean z4;
        boolean z3;
        Modifier modifier1;
        boolean z12;
        int v17;
        TextStyle textStyle2;
        int v15;
        Function3 function32;
        Function1 function13;
        VisualTransformation visualTransformation2;
        int v14;
        int v13;
        boolean z9;
        KeyboardActions keyboardActions2;
        KeyboardOptions keyboardOptions2;
        boolean z8;
        boolean z7;
        Modifier modifier2;
        Brush brush2;
        boolean z11;
        KeyboardActions keyboardActions4;
        int v16;
        int v9;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0x3857730F);
        if((v4 & 1) == 0) {
            v5 = (v2 & 6) == 0 ? (composer1.changed(s) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v5 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        int v6 = 0x800;
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            v5 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        int v7 = 0x4000;
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v2 & 0x6000) == 0) {
            v5 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        int v8 = 0x10000;
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v2 & 0x30000) == 0) {
            v5 |= (composer1.changed(textStyle0) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v5 |= (composer1.changed(keyboardOptions0) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v2 & 0xC00000) == 0) {
            v5 |= (composer1.changed(keyboardActions0) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v2 & 0x6000000) == 0) {
            v5 |= (composer1.changed(z2) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x30000000) == 0) {
            v5 |= ((v4 & 0x200) != 0 || !composer1.changed(v) ? 0x10000000 : 0x20000000);
        }
        if((v4 & 0x400) == 0) {
            v9 = (v3 & 6) == 0 ? v3 | (composer1.changed(v1) ? 4 : 2) : v3;
        }
        else {
            v9 = v3 | 6;
        }
        if((v4 & 0x800) != 0) {
            v9 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v9 |= (composer1.changed(visualTransformation0) ? 0x20 : 16);
        }
        int v10 = v9;
        if((v4 & 0x1000) != 0) {
            v10 |= 0x180;
        }
        else if((v3 & 0x180) == 0) {
            v10 |= (composer1.changedInstance(function11) ? 0x100 : 0x80);
        }
        if((v4 & 0x2000) != 0) {
            v10 |= 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            if(!composer1.changed(mutableInteractionSource0)) {
                v6 = 0x400;
            }
            v10 |= v6;
        }
        if((v4 & 0x4000) != 0) {
            v10 |= 0x6000;
        }
        else if((v3 & 0x6000) == 0) {
            if(!composer1.changed(brush0)) {
                v7 = 0x2000;
            }
            v10 |= v7;
        }
        if((v4 & 0x8000) != 0) {
            v10 |= 0x30000;
        }
        else if((v3 & 0x30000) == 0) {
            if(composer1.changedInstance(function30)) {
                v8 = 0x20000;
            }
            v10 |= v8;
        }
        if((v5 & 306783379) != 306783378 || (74899 & v10) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            boolean z6 = true;
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 4) == 0 ? modifier0 : Modifier.Companion;
                z7 = (v4 & 8) == 0 ? z : true;
                TextStyle textStyle3 = (v4 & 0x20) == 0 ? textStyle0 : TextStyle.Companion.getDefault();
                KeyboardOptions keyboardOptions3 = (v4 & 0x40) == 0 ? keyboardOptions0 : KeyboardOptions.Companion.getDefault();
                KeyboardActions keyboardActions3 = (v4 & 0x80) == 0 ? keyboardActions0 : KeyboardActions.Companion.getDefault();
                boolean z10 = (v4 & 0x100) == 0 ? z2 : false;
                if((v4 & 0x200) == 0) {
                    v13 = v;
                }
                else {
                    v13 = z10 ? 1 : 0x7FFFFFFF;
                    v5 &= 0x8FFFFFFF;
                }
                VisualTransformation visualTransformation3 = (v4 & 0x800) == 0 ? visualTransformation0 : VisualTransformation.Companion.getNone();
                Function1 function14 = (v4 & 0x1000) == 0 ? function11 : c0.w;
                if((v4 & 0x4000) == 0) {
                    z11 = z10;
                    v16 = v5;
                    keyboardActions4 = keyboardActions3;
                    brush2 = brush0;
                }
                else {
                    v16 = v5;
                    keyboardActions4 = keyboardActions3;
                    z11 = z10;
                    brush2 = new SolidColor(0xFF00000000000000L, null);
                }
                function32 = (v4 & 0x8000) == 0 ? function30 : ComposableSingletons.BasicTextFieldKt.INSTANCE.getLambda-1$foundation_release();
                v14 = (v4 & 0x400) == 0 ? v1 : 1;
                mutableInteractionSource1 = (v4 & 0x2000) == 0 ? mutableInteractionSource0 : null;
                brush1 = brush2;
                z8 = (v4 & 16) == 0 ? z1 : false;
                textStyle2 = textStyle3;
                keyboardOptions2 = keyboardOptions3;
                keyboardActions2 = keyboardActions4;
                visualTransformation2 = visualTransformation3;
                function13 = function14;
                v15 = v16;
                z9 = z11;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 0x200) != 0) {
                    v5 &= 0x8FFFFFFF;
                }
                modifier2 = modifier0;
                z7 = z;
                z8 = z1;
                keyboardOptions2 = keyboardOptions0;
                keyboardActions2 = keyboardActions0;
                z9 = z2;
                v13 = v;
                v14 = v1;
                visualTransformation2 = visualTransformation0;
                function13 = function11;
                mutableInteractionSource1 = mutableInteractionSource0;
                brush1 = brush0;
                function32 = function30;
                v15 = v5;
                textStyle2 = textStyle0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                v17 = v13;
                ComposerKt.traceEventStart(0x3857730F, v15, v10, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:611)");
            }
            else {
                v17 = v13;
            }
            MutableState mutableState0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                z12 = z8;
                mutableState0 = SnapshotStateKt.mutableStateOf$default(new TextFieldValue(s, 0L, null, 6, null), null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            else {
                z12 = z8;
            }
            TextFieldValue textFieldValue0 = TextFieldValue.copy-3r_uNRQ$default(((TextFieldValue)mutableState0.getValue()), s, 0L, null, 6, null);
            boolean z13 = composer1.changed(textFieldValue0);
            m m0 = composer1.rememberedValue();
            if(z13 || m0 == composer$Companion0.getEmpty()) {
                m0 = new m(29, textFieldValue0, mutableState0);
                composer1.updateRememberedValue(m0);
            }
            EffectsKt.SideEffect(m0, composer1, 0);
            MutableState mutableState1 = composer1.rememberedValue();
            if((v15 & 14) == 4 || mutableState1 == composer$Companion0.getEmpty()) {
                mutableState1 = SnapshotStateKt.mutableStateOf$default(s, null, 2, null);
                composer1.updateRememberedValue(mutableState1);
            }
            ImeOptions imeOptions0 = keyboardOptions2.toImeOptions$foundation_release(z9);
            boolean z14 = composer1.changed(mutableState1);
            if((v15 & 0x70) != 0x20) {
                z6 = false;
            }
            aa.r r0 = composer1.rememberedValue();
            if(z14 || z6 || r0 == composer$Companion0.getEmpty()) {
                r0 = new aa.r(function10, mutableState0, 12, mutableState1);
                composer1.updateRememberedValue(r0);
            }
            CoreTextFieldKt.CoreTextField(textFieldValue0, r0, modifier2, textStyle2, visualTransformation2, function13, mutableInteractionSource1, brush1, !z9, (z9 ? 1 : v17), (z9 ? 1 : v14), imeOptions0, keyboardActions2, z7, z12, function32, composer1, v15 & 0x380 | v15 >> 6 & 0x1C00 | 0xE000 & v10 << 9 | 0x70000 & v10 << 9 | 0x380000 & v10 << 9 | v10 << 9 & 0x1C00000, v15 >> 15 & 0x380 | v15 & 0x1C00 | 0xE000 & v15 | 0x70000 & v10, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z3 = z7;
            keyboardOptions1 = keyboardOptions2;
            v12 = v14;
            keyboardActions1 = keyboardActions2;
            visualTransformation1 = visualTransformation2;
            function12 = function13;
            function31 = function32;
            v11 = v17;
            z4 = z12;
            z5 = z9;
            textStyle1 = textStyle2;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z3 = z;
            z4 = z1;
            textStyle1 = textStyle0;
            keyboardOptions1 = keyboardOptions0;
            keyboardActions1 = keyboardActions0;
            z5 = z2;
            v11 = v;
            v12 = v1;
            visualTransformation1 = visualTransformation0;
            function12 = function11;
            mutableInteractionSource1 = mutableInteractionSource0;
            brush1 = brush0;
            function31 = function30;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(s, function10, modifier1, z3, z4, textStyle1, keyboardOptions1, keyboardActions1, z5, v11, v12, visualTransformation1, function12, mutableInteractionSource1, brush1, function31, v2, v3, v4, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public static final void BasicTextField(String s, Function1 function10, Modifier modifier0, boolean z, boolean z1, TextStyle textStyle0, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, boolean z2, int v, VisualTransformation visualTransformation0, Function1 function11, MutableInteractionSource mutableInteractionSource0, Brush brush0, Function3 function30, Composer composer0, int v1, int v2, int v3) {
        Function3 function31;
        Brush brush1;
        MutableInteractionSource mutableInteractionSource1;
        Function1 function12;
        VisualTransformation visualTransformation1;
        int v9;
        boolean z5;
        KeyboardActions keyboardActions1;
        KeyboardOptions keyboardOptions1;
        TextStyle textStyle1;
        boolean z4;
        boolean z3;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource3;
        int v7;
        int v4;
        Composer composer1 = composer0.startRestartGroup(-454732590);
        if((v3 & 1) == 0) {
            v4 = (v1 & 6) == 0 ? (composer1.changed(s) ? 4 : 2) | v1 : v1;
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
        int v5 = 0x400;
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v4 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        int v6 = 0x2000;
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            v4 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v1 & 0x30000) == 0) {
            v4 |= (composer1.changed(textStyle0) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x180000) == 0) {
            v4 |= (composer1.changed(keyboardOptions0) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v1 & 0xC00000) == 0) {
            v4 |= (composer1.changed(keyboardActions0) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v1 & 0x6000000) == 0) {
            v4 |= (composer1.changed(z2) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((v1 & 0x30000000) == 0) {
            v4 |= (composer1.changed(v) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) == 0) {
            v7 = (v2 & 6) == 0 ? v2 | (composer1.changed(visualTransformation0) ? 4 : 2) : v2;
        }
        else {
            v7 = v2 | 6;
        }
        if((v3 & 0x800) != 0) {
            v7 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v7 |= (composer1.changedInstance(function11) ? 0x20 : 16);
        }
        int v8 = v7;
        if((v3 & 0x1000) != 0) {
            v8 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v8 |= (composer1.changed(mutableInteractionSource0) ? 0x100 : 0x80);
        }
        if((v3 & 0x2000) != 0) {
            v8 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            if(composer1.changed(brush0)) {
                v5 = 0x800;
            }
            v8 |= v5;
        }
        if((v3 & 0x4000) != 0) {
            v8 |= 0x6000;
        }
        else if((v2 & 0x6000) == 0) {
            if(composer1.changedInstance(function30)) {
                v6 = 0x4000;
            }
            v8 |= v6;
        }
        if((v4 & 306783379) != 306783378 || (v8 & 9363) != 9362 || !composer1.getSkipping()) {
            Modifier modifier2 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
            boolean z6 = (v3 & 8) == 0 ? z : true;
            boolean z7 = (v3 & 16) == 0 ? z1 : false;
            TextStyle textStyle2 = (v3 & 0x20) == 0 ? textStyle0 : TextStyle.Companion.getDefault();
            KeyboardOptions keyboardOptions2 = (v3 & 0x40) == 0 ? keyboardOptions0 : KeyboardOptions.Companion.getDefault();
            KeyboardActions keyboardActions2 = (v3 & 0x80) == 0 ? keyboardActions0 : KeyboardActions.Companion.getDefault();
            boolean z8 = (v3 & 0x100) == 0 ? z2 : false;
            int v10 = (v3 & 0x200) == 0 ? v : 0x7FFFFFFF;
            VisualTransformation visualTransformation2 = (v3 & 0x400) == 0 ? visualTransformation0 : VisualTransformation.Companion.getNone();
            Function1 function13 = (v3 & 0x800) == 0 ? function11 : t.w;
            if((v3 & 0x1000) == 0) {
                mutableInteractionSource3 = mutableInteractionSource0;
            }
            else {
                MutableInteractionSource mutableInteractionSource2 = composer1.rememberedValue();
                if(mutableInteractionSource2 == Composer.Companion.getEmpty()) {
                    mutableInteractionSource2 = InteractionSourceKt.MutableInteractionSource();
                    composer1.updateRememberedValue(mutableInteractionSource2);
                }
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            Brush brush2 = (v3 & 0x2000) == 0 ? brush0 : new SolidColor(0xFF00000000000000L, null);
            Function3 function32 = (v3 & 0x4000) == 0 ? function30 : ComposableSingletons.BasicTextFieldKt.INSTANCE.getLambda-3$foundation_release();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-454732590, v4, v8, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:807)");
            }
            BasicTextFieldKt.BasicTextField(s, function10, modifier2, z6, z7, textStyle2, keyboardOptions2, keyboardActions2, z8, v10, 1, visualTransformation2, function13, mutableInteractionSource3, brush2, function32, composer1, v4 & 0x7FFFFFFE, v8 << 3 & 0x70 | 6 | v8 << 3 & 0x380 | v8 << 3 & 0x1C00 | 0xE000 & v8 << 3 | v8 << 3 & 0x70000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function31 = function32;
            visualTransformation1 = visualTransformation2;
            brush1 = brush2;
            modifier1 = modifier2;
            keyboardActions1 = keyboardActions2;
            z4 = z7;
            textStyle1 = textStyle2;
            z5 = z8;
            v9 = v10;
            mutableInteractionSource1 = mutableInteractionSource3;
            keyboardOptions1 = keyboardOptions2;
            function12 = function13;
            z3 = z6;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z3 = z;
            z4 = z1;
            textStyle1 = textStyle0;
            keyboardOptions1 = keyboardOptions0;
            keyboardActions1 = keyboardActions0;
            z5 = z2;
            v9 = v;
            visualTransformation1 = visualTransformation0;
            function12 = function11;
            mutableInteractionSource1 = mutableInteractionSource0;
            brush1 = brush0;
            function31 = function30;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u(s, function10, modifier1, z3, z4, textStyle1, keyboardOptions1, keyboardActions1, z5, v9, visualTransformation1, function12, mutableInteractionSource1, brush1, function31, v1, v2, v3, 0));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TextFieldCursorHandle(@NotNull TextFieldSelectionState textFieldSelectionState0, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x76B52065);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(textFieldSelectionState0) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x76B52065, v1, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (BasicTextField.kt:414)");
            }
            State state0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(state0 == composer$Companion0.getEmpty()) {
                state0 = SnapshotStateKt.derivedStateOf(new h0(textFieldSelectionState0, 0));
                composer1.updateRememberedValue(state0);
            }
            if(((TextFieldHandleState)state0.getValue()).getVisible()) {
                composer1.startReplaceGroup(0xED194F84);
                boolean z = composer1.changedInstance(textFieldSelectionState0);
                e0 e00 = composer1.rememberedValue();
                if(z || e00 == composer$Companion0.getEmpty()) {
                    e00 = new e0(textFieldSelectionState0, 0);
                    composer1.updateRememberedValue(e00);
                }
                androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
                boolean z1 = composer1.changedInstance(textFieldSelectionState0);
                f0 f00 = composer1.rememberedValue();
                if(z1 || f00 == composer$Companion0.getEmpty()) {
                    f00 = new f0(textFieldSelectionState0, null);
                    composer1.updateRememberedValue(f00);
                }
                AndroidCursorHandle_androidKt.CursorHandle-USBMPiE(e00, SuspendingPointerInputFilterKt.pointerInput(modifier$Companion0, textFieldSelectionState0, f00), BasicTextFieldKt.a, composer1, 0x180, 0);
            }
            else {
                composer1.startReplaceGroup(0xED1FCABE);
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
            scopeUpdateScope0.updateScope(new g0(textFieldSelectionState0, v, 0));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TextFieldSelectionHandles(@NotNull TextFieldSelectionState textFieldSelectionState0, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x78B77004);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(textFieldSelectionState0) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x78B77004, v1, -1, "androidx.compose.foundation.text.TextFieldSelectionHandles (BasicTextField.kt:440)");
            }
            State state0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(state0 == composer$Companion0.getEmpty()) {
                state0 = SnapshotStateKt.derivedStateOf(new h0(textFieldSelectionState0, 2));
                composer1.updateRememberedValue(state0);
            }
            if(((TextFieldHandleState)state0.getValue()).getVisible()) {
                composer1.startReplaceGroup(0xAF4BD005);
                boolean z = composer1.changedInstance(textFieldSelectionState0);
                e0 e00 = composer1.rememberedValue();
                if(z || e00 == composer$Companion0.getEmpty()) {
                    e00 = new e0(textFieldSelectionState0, 1);
                    composer1.updateRememberedValue(e00);
                }
                ResolvedTextDirection resolvedTextDirection0 = ((TextFieldHandleState)state0.getValue()).getDirection();
                boolean z1 = ((TextFieldHandleState)state0.getValue()).getHandlesCrossed();
                androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
                boolean z2 = composer1.changedInstance(textFieldSelectionState0);
                i0 i00 = composer1.rememberedValue();
                if(z2 || i00 == composer$Companion0.getEmpty()) {
                    i00 = new i0(textFieldSelectionState0, null);
                    composer1.updateRememberedValue(i00);
                }
                Modifier modifier0 = SuspendingPointerInputFilterKt.pointerInput(modifier$Companion0, textFieldSelectionState0, i00);
                AndroidSelectionHandles_androidKt.SelectionHandle-pzduO1o(e00, true, resolvedTextDirection0, z1, BasicTextFieldKt.a, modifier0, composer1, 0x6030, 0);
            }
            else {
                composer1.startReplaceGroup(0xAF549C5D);
            }
            composer1.endReplaceGroup();
            State state1 = composer1.rememberedValue();
            if(state1 == composer$Companion0.getEmpty()) {
                state1 = SnapshotStateKt.derivedStateOf(new h0(textFieldSelectionState0, 1));
                composer1.updateRememberedValue(state1);
            }
            if(((TextFieldHandleState)state1.getValue()).getVisible()) {
                composer1.startReplaceGroup(-1353116090);
                boolean z3 = composer1.changedInstance(textFieldSelectionState0);
                e0 e01 = composer1.rememberedValue();
                if(z3 || e01 == composer$Companion0.getEmpty()) {
                    e01 = new e0(textFieldSelectionState0, 2);
                    composer1.updateRememberedValue(e01);
                }
                ResolvedTextDirection resolvedTextDirection1 = ((TextFieldHandleState)state1.getValue()).getDirection();
                boolean z4 = ((TextFieldHandleState)state1.getValue()).getHandlesCrossed();
                androidx.compose.ui.Modifier.Companion modifier$Companion1 = Modifier.Companion;
                boolean z5 = composer1.changedInstance(textFieldSelectionState0);
                j0 j00 = composer1.rememberedValue();
                if(z5 || j00 == composer$Companion0.getEmpty()) {
                    j00 = new j0(textFieldSelectionState0, null);
                    composer1.updateRememberedValue(j00);
                }
                Modifier modifier1 = SuspendingPointerInputFilterKt.pointerInput(modifier$Companion1, textFieldSelectionState0, j00);
                AndroidSelectionHandles_androidKt.SelectionHandle-pzduO1o(e01, false, resolvedTextDirection1, z4, BasicTextFieldKt.a, modifier1, composer1, 0x6030, 0);
            }
            else {
                composer1.startReplaceGroup(0xAF61DEDD);
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
            scopeUpdateScope0.updateScope(new g0(textFieldSelectionState0, v, 1));
        }
    }

    public static final TextFieldValue access$BasicTextField$lambda$21(MutableState mutableState0) {
        return (TextFieldValue)mutableState0.getValue();
    }

    public static final void access$BasicTextField$lambda$22(MutableState mutableState0, TextFieldValue textFieldValue0) {
        mutableState0.setValue(textFieldValue0);
    }

    public static final String access$BasicTextField$lambda$25(MutableState mutableState0) {
        return (String)mutableState0.getValue();
    }

    public static final void access$BasicTextField$lambda$26(MutableState mutableState0, String s) {
        mutableState0.setValue(s);
    }
}

