package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import f2.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import m0.v;
import m0.w;
import m0.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(34)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u00AC\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00C1\u0002\u0018\u00002\u00020\u0001J-\u0010\f\u001A\u00020\t*\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0001\u00A2\u0006\u0004\b\n\u0010\u000BJ-\u0010\u0013\u001A\u00020\u0010*\u00020\u00022\u0006\u0010\u0004\u001A\u00020\r2\u0006\u0010\u0006\u001A\u00020\u00052\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0001\u00A2\u0006\u0004\b\u0011\u0010\u0012JC\u0010\f\u001A\u00020\t*\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u00032\b\u0010\u0017\u001A\u0004\u0018\u00010\u00162\b\u0010\b\u001A\u0004\u0018\u00010\u00072\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001A0\u0018H\u0001\u00A2\u0006\u0004\b\n\u0010\u001CJ/\u0010\u0013\u001A\u00020\u0010*\u00020\u00142\u0006\u0010\u0015\u001A\u00020\r2\b\u0010\u0017\u001A\u0004\u0018\u00010\u00162\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0001\u00A2\u0006\u0004\b\u0011\u0010\u001DJ#\u0010\u001F\u001A\u00020\t*\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u001E2\u0006\u0010\u0006\u001A\u00020\u0005H\u0003\u00A2\u0006\u0004\b\u001F\u0010 J#\u0010!\u001A\u00020\u001A*\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u001E2\u0006\u0010\u0006\u001A\u00020\u0005H\u0003\u00A2\u0006\u0004\b!\u0010\"J#\u0010$\u001A\u00020\t*\u00020\u00022\u0006\u0010\u0015\u001A\u00020#2\u0006\u0010\u0006\u001A\u00020\u0005H\u0003\u00A2\u0006\u0004\b$\u0010%J#\u0010&\u001A\u00020\u001A*\u00020\u00022\u0006\u0010\u0015\u001A\u00020#2\u0006\u0010\u0006\u001A\u00020\u0005H\u0003\u00A2\u0006\u0004\b&\u0010\'J#\u0010)\u001A\u00020\t*\u00020\u00022\u0006\u0010\u0015\u001A\u00020(2\u0006\u0010\u0006\u001A\u00020\u0005H\u0003\u00A2\u0006\u0004\b)\u0010*J#\u0010+\u001A\u00020\u001A*\u00020\u00022\u0006\u0010\u0015\u001A\u00020(2\u0006\u0010\u0006\u001A\u00020\u0005H\u0003\u00A2\u0006\u0004\b+\u0010,J#\u0010.\u001A\u00020\t*\u00020\u00022\u0006\u0010\u0015\u001A\u00020-2\u0006\u0010\u0006\u001A\u00020\u0005H\u0003\u00A2\u0006\u0004\b.\u0010/J#\u00100\u001A\u00020\u001A*\u00020\u00022\u0006\u0010\u0015\u001A\u00020-2\u0006\u0010\u0006\u001A\u00020\u0005H\u0003\u00A2\u0006\u0004\b0\u00101J-\u00103\u001A\u00020\t*\u00020\u00022\u0006\u0010\u0015\u001A\u0002022\u0006\u0010\u0006\u001A\u00020\u00052\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0003\u00A2\u0006\u0004\b3\u00104J-\u00106\u001A\u00020\t*\u00020\u00022\u0006\u0010\u0015\u001A\u0002052\u0006\u0010\u0006\u001A\u00020\u00052\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0003\u00A2\u0006\u0004\b6\u00107J-\u00109\u001A\u00020\t*\u00020\u00022\u0006\u0010\u0015\u001A\u0002082\u0006\u0010\u0006\u001A\u00020\u00052\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0003\u00A2\u0006\u0004\b9\u0010:J&\u0010>\u001A\u00020\u001A*\u00020\u00022\u0006\u0010<\u001A\u00020;2\u0006\u0010=\u001A\u00020\u0010H\u0003\u00F8\u0001\u0000\u00A2\u0006\u0004\b>\u0010?J\u001B\u0010@\u001A\u00020\t*\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u0003H\u0003\u00A2\u0006\u0004\b@\u0010AJ9\u0010C\u001A\u00020\t*\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u001E2\b\u0010B\u001A\u0004\u0018\u00010\u00162\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001A0\u0018H\u0003\u00A2\u0006\u0004\bC\u0010DJ%\u0010E\u001A\u00020\u001A*\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u001E2\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016H\u0003\u00A2\u0006\u0004\bE\u0010FJ7\u0010I\u001A\u00020\t*\u00020\u00142\u0006\u0010\u0015\u001A\u00020#2\u0006\u0010H\u001A\u00020G2\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001A0\u0018H\u0003\u00A2\u0006\u0004\bI\u0010JJ%\u0010K\u001A\u00020\u001A*\u00020\u00142\u0006\u0010\u0015\u001A\u00020#2\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016H\u0003\u00A2\u0006\u0004\bK\u0010LJ9\u0010M\u001A\u00020\t*\u00020\u00142\u0006\u0010\u0015\u001A\u00020(2\b\u0010B\u001A\u0004\u0018\u00010\u00162\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001A0\u0018H\u0003\u00A2\u0006\u0004\bM\u0010NJ%\u0010O\u001A\u00020\u001A*\u00020\u00142\u0006\u0010\u0015\u001A\u00020(2\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016H\u0003\u00A2\u0006\u0004\bO\u0010PJ7\u0010Q\u001A\u00020\t*\u00020\u00142\u0006\u0010\u0015\u001A\u00020-2\u0006\u0010H\u001A\u00020G2\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001A0\u0018H\u0003\u00A2\u0006\u0004\bQ\u0010RJ%\u0010S\u001A\u00020\u001A*\u00020\u00142\u0006\u0010\u0015\u001A\u00020-2\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016H\u0003\u00A2\u0006\u0004\bS\u0010TJA\u0010U\u001A\u00020\t*\u00020\u00142\u0006\u0010\u0015\u001A\u0002022\u0006\u0010H\u001A\u00020G2\b\u0010\b\u001A\u0004\u0018\u00010\u00072\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001A0\u0018H\u0003\u00A2\u0006\u0004\bU\u0010VJ9\u0010W\u001A\u00020\t*\u00020\u00142\u0006\u0010\u0015\u001A\u0002052\b\u0010\b\u001A\u0004\u0018\u00010\u00072\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001A0\u0018H\u0003\u00A2\u0006\u0004\bW\u0010XJA\u0010Y\u001A\u00020\t*\u00020\u00142\u0006\u0010\u0015\u001A\u0002082\u0006\u0010H\u001A\u00020G2\b\u0010\b\u001A\u0004\u0018\u00010\u00072\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001A0\u0018H\u0003\u00A2\u0006\u0004\bY\u0010ZJ3\u0010]\u001A\u00020\u001A2\u0006\u0010[\u001A\u00020\t2\u0006\u0010H\u001A\u00020\\2\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001A0\u0018H\u0003\u00A2\u0006\u0004\b]\u0010^J8\u0010`\u001A\u00020\u001A2\u0006\u0010_\u001A\u00020;2\b\u0010B\u001A\u0004\u0018\u00010\u00162\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001A0\u0018H\u0003\u00F8\u0001\u0000\u00A2\u0006\u0004\b`\u0010aJ>\u0010b\u001A\u00020\u001A2\u0006\u0010_\u001A\u00020;2\u0006\u0010H\u001A\u00020G2\u0006\u0010=\u001A\u00020\u00102\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001A0\u0018H\u0003\u00F8\u0001\u0000\u00A2\u0006\u0004\bb\u0010cJ+\u0010d\u001A\u00020\t2\u0006\u0010\u0015\u001A\u00020\u00032\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001A0\u0018H\u0003\u00A2\u0006\u0004\bd\u0010eJ\u0019\u0010g\u001A\u00020f*\u00020\tH\u0003\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bg\u0010h\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006i"}, d2 = {"Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;", "", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "Landroid/view/inputmethod/HandwritingGesture;", "handwritingGesture", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "layoutState", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "", "performHandwritingGesture$foundation_release", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I", "performHandwritingGesture", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "previewHandwritingGesture$foundation_release", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroid/os/CancellationSignal;)Z", "previewHandwritingGesture", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "gesture", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textFieldSelectionManager", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/EditCommand;", "", "editCommandConsumer", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroid/os/CancellationSignal;)Z", "Landroid/view/inputmethod/SelectGesture;", "r", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)I", "A", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroid/view/inputmethod/DeleteGesture;", "e", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)I", "w", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroid/view/inputmethod/SelectRangeGesture;", "t", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)I", "C", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroid/view/inputmethod/DeleteRangeGesture;", "g", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)I", "y", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroid/view/inputmethod/JoinOrSplitGesture;", "n", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/JoinOrSplitGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I", "Landroid/view/inputmethod/InsertGesture;", "k", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I", "Landroid/view/inputmethod/RemoveSpaceGesture;", "p", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/RemoveSpaceGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I", "Landroidx/compose/ui/text/TextRange;", "rangeInTransformedText", "adjustRange", "h", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JZ)V", "a", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;)I", "textSelectionManager", "q", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)I", "z", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroidx/compose/ui/text/AnnotatedString;", "text", "d", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;)I", "v", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "s", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)I", "B", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "f", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;)I", "x", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "m", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/JoinOrSplitGesture;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "j", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "o", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/RemoveSpaceGesture;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "offset", "", "l", "(ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "range", "u", "(JLandroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)V", "i", "(JLandroidx/compose/ui/text/AnnotatedString;ZLkotlin/jvm/functions/Function1;)V", "b", "(Landroid/view/inputmethod/HandwritingGesture;Lkotlin/jvm/functions/Function1;)I", "Landroidx/compose/ui/text/TextGranularity;", "D", "(I)I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHandwritingGesture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGestureApi34\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,1133:1\n314#2,6:1134\n323#2:1155\n314#2,6:1156\n323#2:1177\n314#2,6:1178\n323#2:1199\n261#3,15:1140\n261#3,15:1162\n261#3,15:1184\n*S KotlinDebug\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGestureApi34\n*L\n366#1:1134,6\n366#1:1155\n385#1:1156,6\n385#1:1177\n98#1:1178,6\n98#1:1199\n366#1:1140,15\n385#1:1162,15\n98#1:1184,15\n*E\n"})
public final class HandwritingGestureApi34 {
    public static final int $stable;
    @NotNull
    public static final HandwritingGestureApi34 INSTANCE;

    static {
        HandwritingGestureApi34.INSTANCE = new HandwritingGestureApi34();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    private final void A(TransformedTextFieldState transformedTextFieldState0, SelectGesture selectGesture0, TextLayoutState textLayoutState0) {
        HandwritingGestureApi34.c(transformedTextFieldState0, HandwritingGesture_androidKt.d(textLayoutState0, RectHelper_androidKt.toComposeRect(v.j(selectGesture0)), this.D(v.c(selectGesture0)), TextInclusionStrategy.Companion.getContainsCenter()), 0);
    }

    @DoNotInline
    private final void B(LegacyTextFieldState legacyTextFieldState0, SelectRangeGesture selectRangeGesture0, TextFieldSelectionManager textFieldSelectionManager0) {
        if(textFieldSelectionManager0 != null) {
            textFieldSelectionManager0.setSelectionPreviewHighlight-5zc-tL8$foundation_release(HandwritingGesture_androidKt.access$getRangeForScreenRects-O048IG0(legacyTextFieldState0, RectHelper_androidKt.toComposeRect(m0.c(selectRangeGesture0)), RectHelper_androidKt.toComposeRect(v.k(selectRangeGesture0)), this.D(v.d(selectRangeGesture0)), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    @DoNotInline
    private final void C(TransformedTextFieldState transformedTextFieldState0, SelectRangeGesture selectRangeGesture0, TextLayoutState textLayoutState0) {
        HandwritingGestureApi34.c(transformedTextFieldState0, HandwritingGesture_androidKt.access$getRangeForScreenRects-O048IG0(textLayoutState0, RectHelper_androidKt.toComposeRect(m0.c(selectRangeGesture0)), RectHelper_androidKt.toComposeRect(v.k(selectRangeGesture0)), this.D(v.d(selectRangeGesture0)), TextInclusionStrategy.Companion.getContainsCenter()), 0);
    }

    @DoNotInline
    private final int D(int v) {
        switch(v) {
            case 1: {
                return 1;
            }
            case 2: {
                return 0;
            }
            default: {
                return 0;
            }
        }
    }

    @DoNotInline
    private final int a(TransformedTextFieldState transformedTextFieldState0, HandwritingGesture handwritingGesture0) {
        TextFieldState textFieldState0 = transformedTextFieldState0.a;
        textFieldState0.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        textFieldState0.getMainBuffer$foundation_release().clearHighlight();
        TextFieldState.access$commitEditAsUser(textFieldState0, transformedTextFieldState0.b, true, TextFieldEditUndoBehavior.MergeIfPossible);
        String s = v.t(handwritingGesture0);
        if(s == null) {
            return 3;
        }
        TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState0, s, true, null, 4, null);
        return 5;
    }

    @DoNotInline
    private final int b(HandwritingGesture handwritingGesture0, Function1 function10) {
        String s = v.t(handwritingGesture0);
        if(s == null) {
            return 3;
        }
        function10.invoke(new CommitTextCommand(s, 1));
        return 5;
    }

    public static void c(TransformedTextFieldState transformedTextFieldState0, long v, int v1) {
        if(TextRange.getCollapsed-impl(v)) {
            TextFieldState textFieldState0 = transformedTextFieldState0.a;
            textFieldState0.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
            textFieldState0.getMainBuffer$foundation_release().clearHighlight();
            TextFieldState.access$commitEditAsUser(textFieldState0, transformedTextFieldState0.b, true, TextFieldEditUndoBehavior.MergeIfPossible);
            return;
        }
        transformedTextFieldState0.highlightCharsIn-7RAjNK8(v1, v);
    }

    @DoNotInline
    private final int d(LegacyTextFieldState legacyTextFieldState0, DeleteGesture deleteGesture0, AnnotatedString annotatedString0, Function1 function10) {
        int v = this.D(v.a(deleteGesture0));
        long v1 = HandwritingGesture_androidKt.access$getRangeForScreenRect-OH9lIzo(legacyTextFieldState0, RectHelper_androidKt.toComposeRect(v.h(deleteGesture0)), v, TextInclusionStrategy.Companion.getContainsCenter());
        if(TextRange.getCollapsed-impl(v1)) {
            return HandwritingGestureApi34.INSTANCE.b(deleteGesture0, function10);
        }
        this.i(v1, annotatedString0, TextGranularity.equals-impl0(v, 1), function10);
        return 1;
    }

    @DoNotInline
    private final int e(TransformedTextFieldState transformedTextFieldState0, DeleteGesture deleteGesture0, TextLayoutState textLayoutState0) {
        int v = this.D(v.a(deleteGesture0));
        long v1 = HandwritingGesture_androidKt.d(textLayoutState0, RectHelper_androidKt.toComposeRect(v.h(deleteGesture0)), v, TextInclusionStrategy.Companion.getContainsCenter());
        if(TextRange.getCollapsed-impl(v1)) {
            return HandwritingGestureApi34.INSTANCE.a(transformedTextFieldState0, deleteGesture0);
        }
        this.h(transformedTextFieldState0, v1, TextGranularity.equals-impl0(v, 1));
        return 1;
    }

    @DoNotInline
    private final int f(LegacyTextFieldState legacyTextFieldState0, DeleteRangeGesture deleteRangeGesture0, AnnotatedString annotatedString0, Function1 function10) {
        int v = this.D(v.b(deleteRangeGesture0));
        long v1 = HandwritingGesture_androidKt.access$getRangeForScreenRects-O048IG0(legacyTextFieldState0, RectHelper_androidKt.toComposeRect(v.i(deleteRangeGesture0)), RectHelper_androidKt.toComposeRect(v.x(deleteRangeGesture0)), v, TextInclusionStrategy.Companion.getContainsCenter());
        if(TextRange.getCollapsed-impl(v1)) {
            return HandwritingGestureApi34.INSTANCE.b(deleteRangeGesture0, function10);
        }
        this.i(v1, annotatedString0, TextGranularity.equals-impl0(v, 1), function10);
        return 1;
    }

    @DoNotInline
    private final int g(TransformedTextFieldState transformedTextFieldState0, DeleteRangeGesture deleteRangeGesture0, TextLayoutState textLayoutState0) {
        int v = this.D(v.b(deleteRangeGesture0));
        long v1 = HandwritingGesture_androidKt.access$getRangeForScreenRects-O048IG0(textLayoutState0, RectHelper_androidKt.toComposeRect(v.i(deleteRangeGesture0)), RectHelper_androidKt.toComposeRect(v.x(deleteRangeGesture0)), v, TextInclusionStrategy.Companion.getContainsCenter());
        if(TextRange.getCollapsed-impl(v1)) {
            return HandwritingGestureApi34.INSTANCE.a(transformedTextFieldState0, deleteRangeGesture0);
        }
        this.h(transformedTextFieldState0, v1, TextGranularity.equals-impl0(v, 1));
        return 1;
    }

    @DoNotInline
    private final void h(TransformedTextFieldState transformedTextFieldState0, long v, boolean z) {
        if(z) {
            v = HandwritingGesture_androidKt.access$adjustHandwritingDeleteGestureRange-72CqOWE(v, transformedTextFieldState0.getVisualText());
        }
        TransformedTextFieldState.replaceText-M8tDOmk$default(transformedTextFieldState0, "", v, null, false, 12, null);
    }

    @DoNotInline
    private final void i(long v, AnnotatedString annotatedString0, boolean z, Function1 function10) {
        if(z) {
            v = HandwritingGesture_androidKt.access$adjustHandwritingDeleteGestureRange-72CqOWE(v, annotatedString0);
        }
        function10.invoke(HandwritingGesture_androidKt.access$compoundEditCommand(new EditCommand[]{new SetSelectionCommand(TextRange.getEnd-impl(v), TextRange.getEnd-impl(v)), new DeleteSurroundingTextCommand(TextRange.getLength-impl(v), 0)}));
    }

    @DoNotInline
    private final int j(LegacyTextFieldState legacyTextFieldState0, InsertGesture insertGesture0, ViewConfiguration viewConfiguration0, Function1 function10) {
        if(viewConfiguration0 == null) {
            return this.b(insertGesture0, function10);
        }
        int v = HandwritingGesture_androidKt.access$getOffsetForHandwritingGesture-d-4ec7I(legacyTextFieldState0, HandwritingGesture_androidKt.access$toOffset(v.e(insertGesture0)), viewConfiguration0);
        if(v != -1) {
            TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
            if(textLayoutResultProxy0 == null) {
                this.l(v, v.u(insertGesture0), function10);
                return 1;
            }
            TextLayoutResult textLayoutResult0 = textLayoutResultProxy0.getValue();
            if(textLayoutResult0 == null || !HandwritingGesture_androidKt.access$isBiDiBoundary(textLayoutResult0, v)) {
                this.l(v, v.u(insertGesture0), function10);
                return 1;
            }
        }
        return this.b(insertGesture0, function10);
    }

    @DoNotInline
    private final int k(TransformedTextFieldState transformedTextFieldState0, InsertGesture insertGesture0, TextLayoutState textLayoutState0, ViewConfiguration viewConfiguration0) {
        int v = HandwritingGesture_androidKt.access$getOffsetForHandwritingGesture-d-4ec7I(textLayoutState0, HandwritingGesture_androidKt.access$toOffset(v.e(insertGesture0)), viewConfiguration0);
        if(v == -1) {
            return this.a(transformedTextFieldState0, insertGesture0);
        }
        TransformedTextFieldState.replaceText-M8tDOmk$default(transformedTextFieldState0, v.u(insertGesture0), TextRangeKt.TextRange(v), null, false, 12, null);
        return 1;
    }

    @DoNotInline
    private final void l(int v, String s, Function1 function10) {
        function10.invoke(HandwritingGesture_androidKt.access$compoundEditCommand(new EditCommand[]{new SetSelectionCommand(v, v), new CommitTextCommand(s, 1)}));
    }

    @DoNotInline
    private final int m(LegacyTextFieldState legacyTextFieldState0, JoinOrSplitGesture joinOrSplitGesture0, AnnotatedString annotatedString0, ViewConfiguration viewConfiguration0, Function1 function10) {
        if(viewConfiguration0 == null) {
            return this.b(joinOrSplitGesture0, function10);
        }
        int v = HandwritingGesture_androidKt.access$getOffsetForHandwritingGesture-d-4ec7I(legacyTextFieldState0, HandwritingGesture_androidKt.access$toOffset(v.f(joinOrSplitGesture0)), viewConfiguration0);
        if(v != -1) {
            TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
            if(textLayoutResultProxy0 == null) {
                goto label_8;
            }
            TextLayoutResult textLayoutResult0 = textLayoutResultProxy0.getValue();
            if(textLayoutResult0 == null || !HandwritingGesture_androidKt.access$isBiDiBoundary(textLayoutResult0, v)) {
            label_8:
                long v1 = HandwritingGesture_androidKt.access$rangeOfWhitespaces(annotatedString0, v);
                if(TextRange.getCollapsed-impl(v1)) {
                    this.l(TextRange.getStart-impl(v1), " ", function10);
                    return 1;
                }
                this.i(v1, annotatedString0, false, function10);
                return 1;
            }
        }
        return this.b(joinOrSplitGesture0, function10);
    }

    @DoNotInline
    private final int n(TransformedTextFieldState transformedTextFieldState0, JoinOrSplitGesture joinOrSplitGesture0, TextLayoutState textLayoutState0, ViewConfiguration viewConfiguration0) {
        if(transformedTextFieldState0.getOutputText() != transformedTextFieldState0.getUntransformedText()) {
            return 3;
        }
        int v = HandwritingGesture_androidKt.access$getOffsetForHandwritingGesture-d-4ec7I(textLayoutState0, HandwritingGesture_androidKt.access$toOffset(v.f(joinOrSplitGesture0)), viewConfiguration0);
        if(v != -1) {
            TextLayoutResult textLayoutResult0 = textLayoutState0.getLayoutResult();
            if(textLayoutResult0 == null || !HandwritingGesture_androidKt.access$isBiDiBoundary(textLayoutResult0, v)) {
                long v1 = HandwritingGesture_androidKt.access$rangeOfWhitespaces(transformedTextFieldState0.getVisualText(), v);
                if(TextRange.getCollapsed-impl(v1)) {
                    TransformedTextFieldState.replaceText-M8tDOmk$default(transformedTextFieldState0, " ", v1, null, false, 12, null);
                    return 1;
                }
                this.h(transformedTextFieldState0, v1, false);
                return 1;
            }
        }
        return this.a(transformedTextFieldState0, joinOrSplitGesture0);
    }

    @DoNotInline
    private final int o(LegacyTextFieldState legacyTextFieldState0, RemoveSpaceGesture removeSpaceGesture0, AnnotatedString annotatedString0, ViewConfiguration viewConfiguration0, Function1 function10) {
        TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
        long v = HandwritingGesture_androidKt.access$getRangeForRemoveSpaceGesture-5iVPX68((textLayoutResultProxy0 == null ? null : textLayoutResultProxy0.getValue()), HandwritingGesture_androidKt.access$toOffset(v.g(removeSpaceGesture0)), HandwritingGesture_androidKt.access$toOffset(v.w(removeSpaceGesture0)), legacyTextFieldState0.getLayoutCoordinates(), viewConfiguration0);
        if(TextRange.getCollapsed-impl(v)) {
            return HandwritingGestureApi34.INSTANCE.b(removeSpaceGesture0, function10);
        }
        IntRef ref$IntRef0 = new IntRef();
        ref$IntRef0.element = -1;
        IntRef ref$IntRef1 = new IntRef();
        ref$IntRef1.element = -1;
        String s = TextRangeKt.substring-FDrldGo(annotatedString0, v);
        String s1 = new Regex("\\s+").replace(s, new x(ref$IntRef0, ref$IntRef1));
        if(ref$IntRef0.element != -1 && ref$IntRef1.element != -1) {
            int v1 = TextRange.getStart-impl(v) + ref$IntRef0.element;
            int v2 = TextRange.getStart-impl(v) + ref$IntRef1.element;
            String s2 = s1.substring(ref$IntRef0.element, s1.length() - (TextRange.getLength-impl(v) - ref$IntRef1.element));
            Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String…ing(startIndex, endIndex)");
            function10.invoke(HandwritingGesture_androidKt.access$compoundEditCommand(new EditCommand[]{new SetSelectionCommand(v1, v2), new CommitTextCommand(s2, 1)}));
            return 1;
        }
        return this.b(removeSpaceGesture0, function10);
    }

    @DoNotInline
    private final int p(TransformedTextFieldState transformedTextFieldState0, RemoveSpaceGesture removeSpaceGesture0, TextLayoutState textLayoutState0, ViewConfiguration viewConfiguration0) {
        long v = HandwritingGesture_androidKt.access$getRangeForRemoveSpaceGesture-5iVPX68(textLayoutState0.getLayoutResult(), HandwritingGesture_androidKt.access$toOffset(v.g(removeSpaceGesture0)), HandwritingGesture_androidKt.access$toOffset(v.w(removeSpaceGesture0)), textLayoutState0.getTextLayoutNodeCoordinates(), viewConfiguration0);
        if(TextRange.getCollapsed-impl(v)) {
            return HandwritingGestureApi34.INSTANCE.a(transformedTextFieldState0, removeSpaceGesture0);
        }
        IntRef ref$IntRef0 = new IntRef();
        ref$IntRef0.element = -1;
        IntRef ref$IntRef1 = new IntRef();
        ref$IntRef1.element = -1;
        String s = TextRangeKt.substring-FDrldGo(transformedTextFieldState0.getVisualText(), v);
        String s1 = new Regex("\\s+").replace(s, new w(ref$IntRef0, ref$IntRef1));
        if(ref$IntRef0.element != -1 && ref$IntRef1.element != -1) {
            long v1 = TextRangeKt.TextRange(TextRange.getStart-impl(v) + ref$IntRef0.element, TextRange.getStart-impl(v) + ref$IntRef1.element);
            String s2 = s1.substring(ref$IntRef0.element, s1.length() - (TextRange.getLength-impl(v) - ref$IntRef1.element));
            Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String…ing(startIndex, endIndex)");
            TransformedTextFieldState.replaceText-M8tDOmk$default(transformedTextFieldState0, s2, v1, null, false, 12, null);
            return 1;
        }
        return this.a(transformedTextFieldState0, removeSpaceGesture0);
    }

    @DoNotInline
    public final int performHandwritingGesture$foundation_release(@NotNull LegacyTextFieldState legacyTextFieldState0, @NotNull HandwritingGesture handwritingGesture0, @Nullable TextFieldSelectionManager textFieldSelectionManager0, @Nullable ViewConfiguration viewConfiguration0, @NotNull Function1 function10) {
        AnnotatedString annotatedString1;
        AnnotatedString annotatedString0 = legacyTextFieldState0.getUntransformedText();
        if(annotatedString0 == null) {
            return 3;
        }
        TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
        if(textLayoutResultProxy0 == null) {
            annotatedString1 = null;
        }
        else {
            TextLayoutResult textLayoutResult0 = textLayoutResultProxy0.getValue();
            if(textLayoutResult0 == null) {
                annotatedString1 = null;
            }
            else {
                TextLayoutInput textLayoutInput0 = textLayoutResult0.getLayoutInput();
                annotatedString1 = textLayoutInput0 == null ? null : textLayoutInput0.getText();
            }
        }
        if(!Intrinsics.areEqual(annotatedString0, annotatedString1)) {
            return 3;
        }
        if(v.B(handwritingGesture0)) {
            return this.q(legacyTextFieldState0, ((SelectGesture)handwritingGesture0), textFieldSelectionManager0, function10);
        }
        if(m0.t(handwritingGesture0)) {
            return this.d(legacyTextFieldState0, ((DeleteGesture)handwritingGesture0), annotatedString0, function10);
        }
        if(m0.y(handwritingGesture0)) {
            return this.s(legacyTextFieldState0, ((SelectRangeGesture)handwritingGesture0), textFieldSelectionManager0, function10);
        }
        if(v.v(handwritingGesture0)) {
            return this.f(legacyTextFieldState0, ((DeleteRangeGesture)handwritingGesture0), annotatedString0, function10);
        }
        if(v.A(handwritingGesture0)) {
            return this.m(legacyTextFieldState0, ((JoinOrSplitGesture)handwritingGesture0), annotatedString0, viewConfiguration0, function10);
        }
        if(v.y(handwritingGesture0)) {
            return this.j(legacyTextFieldState0, ((InsertGesture)handwritingGesture0), viewConfiguration0, function10);
        }
        return v.z(handwritingGesture0) ? this.o(legacyTextFieldState0, ((RemoveSpaceGesture)handwritingGesture0), annotatedString0, viewConfiguration0, function10) : 2;
    }

    @DoNotInline
    public final int performHandwritingGesture$foundation_release(@NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull HandwritingGesture handwritingGesture0, @NotNull TextLayoutState textLayoutState0, @Nullable ViewConfiguration viewConfiguration0) {
        if(v.B(handwritingGesture0)) {
            return this.r(transformedTextFieldState0, ((SelectGesture)handwritingGesture0), textLayoutState0);
        }
        if(m0.t(handwritingGesture0)) {
            return this.e(transformedTextFieldState0, ((DeleteGesture)handwritingGesture0), textLayoutState0);
        }
        if(m0.y(handwritingGesture0)) {
            return this.t(transformedTextFieldState0, ((SelectRangeGesture)handwritingGesture0), textLayoutState0);
        }
        if(v.v(handwritingGesture0)) {
            return this.g(transformedTextFieldState0, ((DeleteRangeGesture)handwritingGesture0), textLayoutState0);
        }
        if(v.A(handwritingGesture0)) {
            return this.n(transformedTextFieldState0, ((JoinOrSplitGesture)handwritingGesture0), textLayoutState0, viewConfiguration0);
        }
        if(v.y(handwritingGesture0)) {
            return this.k(transformedTextFieldState0, ((InsertGesture)handwritingGesture0), textLayoutState0, viewConfiguration0);
        }
        return v.z(handwritingGesture0) ? this.p(transformedTextFieldState0, ((RemoveSpaceGesture)handwritingGesture0), textLayoutState0, viewConfiguration0) : 2;
    }

    @DoNotInline
    public final boolean previewHandwritingGesture$foundation_release(@NotNull LegacyTextFieldState legacyTextFieldState0, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture0, @Nullable TextFieldSelectionManager textFieldSelectionManager0, @Nullable CancellationSignal cancellationSignal0) {
        AnnotatedString annotatedString1;
        AnnotatedString annotatedString0 = legacyTextFieldState0.getUntransformedText();
        if(annotatedString0 == null) {
            return false;
        }
        TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
        if(textLayoutResultProxy0 == null) {
            annotatedString1 = null;
        }
        else {
            TextLayoutResult textLayoutResult0 = textLayoutResultProxy0.getValue();
            if(textLayoutResult0 == null) {
                annotatedString1 = null;
            }
            else {
                TextLayoutInput textLayoutInput0 = textLayoutResult0.getLayoutInput();
                annotatedString1 = textLayoutInput0 == null ? null : textLayoutInput0.getText();
            }
        }
        if(!Intrinsics.areEqual(annotatedString0, annotatedString1)) {
            return false;
        }
        if(v.B(previewableHandwritingGesture0)) {
            this.z(legacyTextFieldState0, ((SelectGesture)previewableHandwritingGesture0), textFieldSelectionManager0);
        }
        else {
            if(m0.t(previewableHandwritingGesture0)) {
                this.v(legacyTextFieldState0, ((DeleteGesture)previewableHandwritingGesture0), textFieldSelectionManager0);
                goto label_29;
            }
            if(m0.y(previewableHandwritingGesture0)) {
                this.B(legacyTextFieldState0, ((SelectRangeGesture)previewableHandwritingGesture0), textFieldSelectionManager0);
            }
            else if(v.v(previewableHandwritingGesture0)) {
                this.x(legacyTextFieldState0, ((DeleteRangeGesture)previewableHandwritingGesture0), textFieldSelectionManager0);
            }
            else {
                return false;
            }
        }
    label_29:
        if(cancellationSignal0 != null) {
            cancellationSignal0.setOnCancelListener(new d(textFieldSelectionManager0, 2));
        }
        return true;
    }

    @DoNotInline
    public final boolean previewHandwritingGesture$foundation_release(@NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture0, @NotNull TextLayoutState textLayoutState0, @Nullable CancellationSignal cancellationSignal0) {
        if(v.B(previewableHandwritingGesture0)) {
            this.A(transformedTextFieldState0, ((SelectGesture)previewableHandwritingGesture0), textLayoutState0);
        }
        else {
            if(m0.t(previewableHandwritingGesture0)) {
                this.w(transformedTextFieldState0, ((DeleteGesture)previewableHandwritingGesture0), textLayoutState0);
                goto label_11;
            }
            if(m0.y(previewableHandwritingGesture0)) {
                this.C(transformedTextFieldState0, ((SelectRangeGesture)previewableHandwritingGesture0), textLayoutState0);
            }
            else if(v.v(previewableHandwritingGesture0)) {
                this.y(transformedTextFieldState0, ((DeleteRangeGesture)previewableHandwritingGesture0), textLayoutState0);
            }
            else {
                return false;
            }
        }
    label_11:
        if(cancellationSignal0 != null) {
            cancellationSignal0.setOnCancelListener(new d(transformedTextFieldState0, 3));
        }
        return true;
    }

    @DoNotInline
    private final int q(LegacyTextFieldState legacyTextFieldState0, SelectGesture selectGesture0, TextFieldSelectionManager textFieldSelectionManager0, Function1 function10) {
        long v = HandwritingGesture_androidKt.c(legacyTextFieldState0, RectHelper_androidKt.toComposeRect(v.j(selectGesture0)), this.D(v.c(selectGesture0)), TextInclusionStrategy.Companion.getContainsCenter());
        if(TextRange.getCollapsed-impl(v)) {
            return HandwritingGestureApi34.INSTANCE.b(selectGesture0, function10);
        }
        this.u(v, textFieldSelectionManager0, function10);
        return 1;
    }

    @DoNotInline
    private final int r(TransformedTextFieldState transformedTextFieldState0, SelectGesture selectGesture0, TextLayoutState textLayoutState0) {
        long v = HandwritingGesture_androidKt.d(textLayoutState0, RectHelper_androidKt.toComposeRect(v.j(selectGesture0)), this.D(v.c(selectGesture0)), TextInclusionStrategy.Companion.getContainsCenter());
        if(TextRange.getCollapsed-impl(v)) {
            return HandwritingGestureApi34.INSTANCE.a(transformedTextFieldState0, selectGesture0);
        }
        transformedTextFieldState0.selectCharsIn-5zc-tL8(v);
        return 1;
    }

    @DoNotInline
    private final int s(LegacyTextFieldState legacyTextFieldState0, SelectRangeGesture selectRangeGesture0, TextFieldSelectionManager textFieldSelectionManager0, Function1 function10) {
        long v = HandwritingGesture_androidKt.access$getRangeForScreenRects-O048IG0(legacyTextFieldState0, RectHelper_androidKt.toComposeRect(m0.c(selectRangeGesture0)), RectHelper_androidKt.toComposeRect(v.k(selectRangeGesture0)), this.D(v.d(selectRangeGesture0)), TextInclusionStrategy.Companion.getContainsCenter());
        if(TextRange.getCollapsed-impl(v)) {
            return HandwritingGestureApi34.INSTANCE.b(selectRangeGesture0, function10);
        }
        this.u(v, textFieldSelectionManager0, function10);
        return 1;
    }

    @DoNotInline
    private final int t(TransformedTextFieldState transformedTextFieldState0, SelectRangeGesture selectRangeGesture0, TextLayoutState textLayoutState0) {
        long v = HandwritingGesture_androidKt.access$getRangeForScreenRects-O048IG0(textLayoutState0, RectHelper_androidKt.toComposeRect(m0.c(selectRangeGesture0)), RectHelper_androidKt.toComposeRect(v.k(selectRangeGesture0)), this.D(v.d(selectRangeGesture0)), TextInclusionStrategy.Companion.getContainsCenter());
        if(TextRange.getCollapsed-impl(v)) {
            return HandwritingGestureApi34.INSTANCE.a(transformedTextFieldState0, selectRangeGesture0);
        }
        transformedTextFieldState0.selectCharsIn-5zc-tL8(v);
        return 1;
    }

    @DoNotInline
    private final void u(long v, TextFieldSelectionManager textFieldSelectionManager0, Function1 function10) {
        function10.invoke(new SetSelectionCommand(TextRange.getStart-impl(v), TextRange.getEnd-impl(v)));
        if(textFieldSelectionManager0 != null) {
            textFieldSelectionManager0.enterSelectionMode$foundation_release(true);
        }
    }

    @DoNotInline
    private final void v(LegacyTextFieldState legacyTextFieldState0, DeleteGesture deleteGesture0, TextFieldSelectionManager textFieldSelectionManager0) {
        if(textFieldSelectionManager0 != null) {
            textFieldSelectionManager0.setDeletionPreviewHighlight-5zc-tL8$foundation_release(HandwritingGesture_androidKt.c(legacyTextFieldState0, RectHelper_androidKt.toComposeRect(v.h(deleteGesture0)), this.D(v.a(deleteGesture0)), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    @DoNotInline
    private final void w(TransformedTextFieldState transformedTextFieldState0, DeleteGesture deleteGesture0, TextLayoutState textLayoutState0) {
        HandwritingGestureApi34.c(transformedTextFieldState0, HandwritingGesture_androidKt.d(textLayoutState0, RectHelper_androidKt.toComposeRect(v.h(deleteGesture0)), this.D(v.a(deleteGesture0)), TextInclusionStrategy.Companion.getContainsCenter()), 1);
    }

    @DoNotInline
    private final void x(LegacyTextFieldState legacyTextFieldState0, DeleteRangeGesture deleteRangeGesture0, TextFieldSelectionManager textFieldSelectionManager0) {
        if(textFieldSelectionManager0 != null) {
            textFieldSelectionManager0.setDeletionPreviewHighlight-5zc-tL8$foundation_release(HandwritingGesture_androidKt.access$getRangeForScreenRects-O048IG0(legacyTextFieldState0, RectHelper_androidKt.toComposeRect(v.i(deleteRangeGesture0)), RectHelper_androidKt.toComposeRect(v.x(deleteRangeGesture0)), this.D(v.b(deleteRangeGesture0)), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    @DoNotInline
    private final void y(TransformedTextFieldState transformedTextFieldState0, DeleteRangeGesture deleteRangeGesture0, TextLayoutState textLayoutState0) {
        HandwritingGestureApi34.c(transformedTextFieldState0, HandwritingGesture_androidKt.access$getRangeForScreenRects-O048IG0(textLayoutState0, RectHelper_androidKt.toComposeRect(v.i(deleteRangeGesture0)), RectHelper_androidKt.toComposeRect(v.x(deleteRangeGesture0)), this.D(v.b(deleteRangeGesture0)), TextInclusionStrategy.Companion.getContainsCenter()), 1);
    }

    @DoNotInline
    private final void z(LegacyTextFieldState legacyTextFieldState0, SelectGesture selectGesture0, TextFieldSelectionManager textFieldSelectionManager0) {
        if(textFieldSelectionManager0 != null) {
            textFieldSelectionManager0.setSelectionPreviewHighlight-5zc-tL8$foundation_release(HandwritingGesture_androidKt.c(legacyTextFieldState0, RectHelper_androidKt.toComposeRect(v.j(selectGesture0)), this.D(v.c(selectGesture0)), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }
}

