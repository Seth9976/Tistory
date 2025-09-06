package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import j0.t1;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import m0.f1;
import m0.g1;
import m0.h1;
import m0.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Stable
@Metadata(d1 = {"\u0000\u008E\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u0002cdB3\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\r\u001A\u00020\f2\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u0011\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0017\u001A\u00020\f2\u0006\u0010\u0014\u001A\u00020\u0013\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001A\u001A\u00020\f2\u0006\u0010\u0018\u001A\u00020\u0013\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u0016J \u0010\u001F\u001A\u00020\f2\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u0014\u001A\u00020\u0013\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0015\u0010\"\u001A\u00020\f2\u0006\u0010!\u001A\u00020 \u00A2\u0006\u0004\b\"\u0010#J\r\u0010$\u001A\u00020\f\u00A2\u0006\u0004\b$\u0010%J\r\u0010&\u001A\u00020\f\u00A2\u0006\u0004\b&\u0010%J4\u0010.\u001A\u00020\f2\u0006\u0010!\u001A\u00020 2\u0006\u0010\'\u001A\u00020\u00132\b\b\u0002\u0010)\u001A\u00020(2\b\b\u0002\u0010+\u001A\u00020*\u00F8\u0001\u0000\u00A2\u0006\u0004\b,\u0010-J)\u00100\u001A\u00020\f2\u0006\u0010!\u001A\u00020 2\b\b\u0002\u0010/\u001A\u00020*2\b\b\u0002\u0010)\u001A\u00020(\u00A2\u0006\u0004\b0\u00101J\r\u00102\u001A\u00020\f\u00A2\u0006\u0004\b2\u0010%J\r\u00103\u001A\u00020\f\u00A2\u0006\u0004\b3\u0010%J\r\u00104\u001A\u00020\f\u00A2\u0006\u0004\b4\u0010%J\r\u00105\u001A\u00020\f\u00A2\u0006\u0004\b5\u0010%J3\u0010:\u001A\u00020\f2\b\b\u0002\u0010+\u001A\u00020*2\u0017\u00109\u001A\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\f06\u00A2\u0006\u0002\b8H\u0086\b\u00A2\u0006\u0004\b:\u0010;J\u001B\u0010?\u001A\u00020\u00132\u0006\u0010<\u001A\u00020\u000F\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b=\u0010>J\u0018\u0010?\u001A\u00020\u00132\u0006\u0010\'\u001A\u00020\u0013\u00F8\u0001\u0000\u00A2\u0006\u0004\b@\u0010AJ\u001B\u0010C\u001A\u00020\u00132\u0006\u0010<\u001A\u00020\u000F\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\bB\u0010>J\u0018\u0010C\u001A\u00020\u00132\u0006\u0010\'\u001A\u00020\u0013\u00F8\u0001\u0000\u00A2\u0006\u0004\bD\u0010AJ\u0018\u0010H\u001A\u00020G2\u0006\u0010F\u001A\u00020EH\u0086@\u00A2\u0006\u0004\bH\u0010IJ\u001A\u0010K\u001A\u00020*2\b\u0010J\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\bK\u0010LJ\u000F\u0010M\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\bM\u0010NJ\u000F\u0010P\u001A\u00020OH\u0016\u00A2\u0006\u0004\bP\u0010QR+\u0010Z\u001A\u00020R2\u0006\u0010S\u001A\u00020R8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\bT\u0010U\u001A\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0011\u0010^\u001A\u00020[8F\u00A2\u0006\u0006\u001A\u0004\b\\\u0010]R\u0011\u0010`\u001A\u00020[8F\u00A2\u0006\u0006\u001A\u0004\b_\u0010]R\u0011\u0010b\u001A\u00020[8F\u00A2\u0006\u0006\u001A\u0004\ba\u0010]\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006e"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "", "Landroidx/compose/foundation/text/input/TextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/InputTransformation;", "inputTransformation", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "codepointTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "outputTransformation", "<init>", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;)V", "", "update", "(Landroidx/compose/foundation/text/input/InputTransformation;)V", "", "transformedOffset", "placeCursorBeforeCharAt", "(I)V", "Landroidx/compose/ui/text/TextRange;", "transformedRange", "selectCharsIn-5zc-tL8", "(J)V", "selectCharsIn", "untransformedRange", "selectUntransformedCharsIn-5zc-tL8", "selectUntransformedCharsIn", "Landroidx/compose/foundation/text/input/TextHighlightType;", "type", "highlightCharsIn-7RAjNK8", "(IJ)V", "highlightCharsIn", "", "newText", "replaceAll", "(Ljava/lang/CharSequence;)V", "selectAll", "()V", "deleteSelectedText", "range", "Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;", "undoBehavior", "", "restartImeIfContentChanges", "replaceText-M8tDOmk", "(Ljava/lang/CharSequence;JLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;Z)V", "replaceText", "clearComposition", "replaceSelectedText", "(Ljava/lang/CharSequence;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V", "collapseSelectionToMax", "collapseSelectionToEnd", "undo", "redo", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/internal/EditingBuffer;", "Lkotlin/ExtensionFunctionType;", "block", "editUntransformedTextAsUser", "(ZLkotlin/jvm/functions/Function1;)V", "offset", "mapToTransformed--jx7JFs", "(I)J", "mapToTransformed", "mapToTransformed-GEjPoXI", "(J)J", "mapFromTransformed--jx7JFs", "mapFromTransformed", "mapFromTransformed-GEjPoXI", "Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;", "notifyImeListener", "", "collectImeNotifications", "(Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "<set-?>", "g", "Landroidx/compose/runtime/MutableState;", "getSelectionWedgeAffinity", "()Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "setSelectionWedgeAffinity", "(Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)V", "selectionWedgeAffinity", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getUntransformedText", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "untransformedText", "getOutputText", "outputText", "getVisualText", "visualText", "m0/f1", "m0/g1", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTransformedTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,678:1\n81#2:679\n107#2,2:680\n261#3,15:682\n261#3,15:697\n261#3,15:712\n261#3,15:727\n261#3,15:742\n267#3,9:757\n261#3,15:766\n261#3,15:781\n261#3,15:796\n261#3,15:811\n1#4:826\n314#5,11:827\n*S KotlinDebug\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n*L\n174#1:679\n174#1:680,2\n198#1:682,15\n205#1:697,15\n211#1:712,15\n218#1:727,15\n224#1:742,15\n244#1:757,9\n265#1:766,15\n283#1:781,15\n290#1:796,15\n318#1:811,15\n419#1:827,11\n*E\n"})
public final class TransformedTextFieldState {
    public static final int $stable;
    public final TextFieldState a;
    public InputTransformation b;
    public final CodepointTransformation c;
    public final OutputTransformation d;
    public final State e;
    public final State f;
    public final MutableState g;
    public static final f1 h;

    static {
        TransformedTextFieldState.h = new f1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public TransformedTextFieldState(@NotNull TextFieldState textFieldState0, @Nullable InputTransformation inputTransformation0, @Nullable CodepointTransformation codepointTransformation0, @Nullable OutputTransformation outputTransformation0) {
        this.a = textFieldState0;
        this.b = inputTransformation0;
        this.c = codepointTransformation0;
        this.d = outputTransformation0;
        this.e = outputTransformation0 == null ? null : SnapshotStateKt.derivedStateOf(new t1(11, this, outputTransformation0));
        this.f = codepointTransformation0 == null ? null : SnapshotStateKt.derivedStateOf(new t1(10, this, codepointTransformation0));
        this.g = SnapshotStateKt.mutableStateOf$default(new SelectionWedgeAffinity(WedgeAffinity.Start), null, 2, null);
    }

    public TransformedTextFieldState(TextFieldState textFieldState0, InputTransformation inputTransformation0, CodepointTransformation codepointTransformation0, OutputTransformation outputTransformation0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            inputTransformation0 = null;
        }
        if((v & 4) != 0) {
            codepointTransformation0 = null;
        }
        if((v & 8) != 0) {
            outputTransformation0 = null;
        }
        this(textFieldState0, inputTransformation0, codepointTransformation0, outputTransformation0);
    }

    public final void collapseSelectionToEnd() {
        InputTransformation inputTransformation0 = this.b;
        this.a.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer editingBuffer0 = this.a.getMainBuffer$foundation_release();
        editingBuffer0.setSelection(TextRange.getEnd-impl(editingBuffer0.getSelection-d9O1mEE()), TextRange.getEnd-impl(editingBuffer0.getSelection-d9O1mEE()));
        TextFieldState.access$commitEditAsUser(this.a, inputTransformation0, true, TextFieldEditUndoBehavior.MergeIfPossible);
    }

    public final void collapseSelectionToMax() {
        InputTransformation inputTransformation0 = this.b;
        this.a.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer editingBuffer0 = this.a.getMainBuffer$foundation_release();
        editingBuffer0.setSelection(TextRange.getMax-impl(editingBuffer0.getSelection-d9O1mEE()), TextRange.getMax-impl(editingBuffer0.getSelection-d9O1mEE()));
        TextFieldState.access$commitEditAsUser(this.a, inputTransformation0, true, TextFieldEditUndoBehavior.MergeIfPossible);
    }

    @Nullable
    public final Object collectImeNotifications(@NotNull NotifyImeListener textFieldState$NotifyImeListener0, @NotNull Continuation continuation0) {
        h1 h10;
        if(continuation0 instanceof h1) {
            h10 = (h1)continuation0;
            int v = h10.r;
            if((v & 0x80000000) == 0) {
                h10 = new h1(this, continuation0);
            }
            else {
                h10.r = v ^ 0x80000000;
            }
        }
        else {
            h10 = new h1(this, continuation0);
        }
        Object object0 = h10.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(h10.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                h10.o = textFieldState$NotifyImeListener0;
                h10.r = 1;
                CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(h10), 1);
                cancellableContinuationImpl0.initCancellability();
                this.a.addNotifyImeListener$foundation_release(textFieldState$NotifyImeListener0);
                cancellableContinuationImpl0.invokeOnCancellation(new i1(this, textFieldState$NotifyImeListener0));
                Object object2 = cancellableContinuationImpl0.getResult();
                if(object2 == a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(h10);
                }
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw new KotlinNothingValueException();
    }

    public final void deleteSelectedText() {
        InputTransformation inputTransformation0 = this.b;
        this.a.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer editingBuffer0 = this.a.getMainBuffer$foundation_release();
        editingBuffer0.delete(TextRange.getMin-impl(editingBuffer0.getSelection-d9O1mEE()), TextRange.getMax-impl(editingBuffer0.getSelection-d9O1mEE()));
        editingBuffer0.setSelection(TextRange.getMin-impl(editingBuffer0.getSelection-d9O1mEE()), TextRange.getMin-impl(editingBuffer0.getSelection-d9O1mEE()));
        TextFieldState.access$commitEditAsUser(this.a, inputTransformation0, true, TextFieldEditUndoBehavior.NeverMerge);
    }

    public final void editUntransformedTextAsUser(boolean z, @NotNull Function1 function10) {
        TextFieldState textFieldState0 = this.a;
        textFieldState0.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        function10.invoke(textFieldState0.getMainBuffer$foundation_release());
        TextFieldState.access$commitEditAsUser(textFieldState0, this.b, z, TextFieldEditUndoBehavior.MergeIfPossible);
    }

    public static void editUntransformedTextAsUser$default(TransformedTextFieldState transformedTextFieldState0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        TextFieldState textFieldState0 = transformedTextFieldState0.a;
        textFieldState0.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        function10.invoke(textFieldState0.getMainBuffer$foundation_release());
        TextFieldState.access$commitEditAsUser(textFieldState0, transformedTextFieldState0.b, z, TextFieldEditUndoBehavior.MergeIfPossible);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TransformedTextFieldState)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((TransformedTextFieldState)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((TransformedTextFieldState)object0).c) ? Intrinsics.areEqual(this.d, ((TransformedTextFieldState)object0).d) : false;
    }

    @NotNull
    public final TextFieldCharSequence getOutputText() {
        State state0 = this.e;
        if(state0 != null) {
            g1 g10 = (g1)state0.getValue();
            if(g10 != null) {
                return g10.a == null ? this.getUntransformedText() : g10.a;
            }
        }
        return this.getUntransformedText();
    }

    @NotNull
    public final SelectionWedgeAffinity getSelectionWedgeAffinity() {
        return (SelectionWedgeAffinity)this.g.getValue();
    }

    @NotNull
    public final TextFieldCharSequence getUntransformedText() {
        return this.a.getValue$foundation_release();
    }

    @NotNull
    public final TextFieldCharSequence getVisualText() {
        State state0 = this.f;
        if(state0 != null) {
            g1 g10 = (g1)state0.getValue();
            if(g10 != null) {
                return g10.a == null ? this.getOutputText() : g10.a;
            }
        }
        return this.getOutputText();
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        OutputTransformation outputTransformation0 = this.d;
        if(outputTransformation0 != null) {
            v1 = outputTransformation0.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    public final void highlightCharsIn-7RAjNK8(int v, long v1) {
        long v2 = this.mapFromTransformed-GEjPoXI(v1);
        InputTransformation inputTransformation0 = this.b;
        this.a.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        this.a.getMainBuffer$foundation_release().setHighlight-K7f2yys(v, TextRange.getStart-impl(v2), TextRange.getEnd-impl(v2));
        TextFieldState.access$commitEditAsUser(this.a, inputTransformation0, true, TextFieldEditUndoBehavior.MergeIfPossible);
    }

    public final long mapFromTransformed--jx7JFs(int v) {
        OffsetMappingCalculator offsetMappingCalculator1;
        OffsetMappingCalculator offsetMappingCalculator0 = null;
        State state0 = this.e;
        if(state0 == null) {
            offsetMappingCalculator1 = null;
        }
        else {
            g1 g10 = (g1)state0.getValue();
            offsetMappingCalculator1 = g10 == null ? null : g10.b;
        }
        State state1 = this.f;
        if(state1 != null) {
            g1 g11 = (g1)state1.getValue();
            if(g11 != null) {
                offsetMappingCalculator0 = g11.b;
            }
        }
        long v1 = offsetMappingCalculator0 == null ? TextRangeKt.TextRange(v) : offsetMappingCalculator0.mapFromDest--jx7JFs(v);
        return offsetMappingCalculator1 == null ? v1 : f1.a(v1, offsetMappingCalculator1);
    }

    public final long mapFromTransformed-GEjPoXI(long v) {
        OffsetMappingCalculator offsetMappingCalculator1;
        OffsetMappingCalculator offsetMappingCalculator0 = null;
        State state0 = this.e;
        if(state0 == null) {
            offsetMappingCalculator1 = null;
        }
        else {
            g1 g10 = (g1)state0.getValue();
            offsetMappingCalculator1 = g10 == null ? null : g10.b;
        }
        State state1 = this.f;
        if(state1 != null) {
            g1 g11 = (g1)state1.getValue();
            if(g11 != null) {
                offsetMappingCalculator0 = g11.b;
            }
        }
        if(offsetMappingCalculator0 != null) {
            v = f1.a(v, offsetMappingCalculator0);
        }
        return offsetMappingCalculator1 == null ? v : f1.a(v, offsetMappingCalculator1);
    }

    public final long mapToTransformed--jx7JFs(int v) {
        OffsetMappingCalculator offsetMappingCalculator1;
        OffsetMappingCalculator offsetMappingCalculator0 = null;
        State state0 = this.e;
        if(state0 == null) {
            offsetMappingCalculator1 = null;
        }
        else {
            g1 g10 = (g1)state0.getValue();
            offsetMappingCalculator1 = g10 == null ? null : g10.b;
        }
        State state1 = this.f;
        if(state1 != null) {
            g1 g11 = (g1)state1.getValue();
            if(g11 != null) {
                offsetMappingCalculator0 = g11.b;
            }
        }
        long v1 = offsetMappingCalculator1 == null ? TextRangeKt.TextRange(v) : offsetMappingCalculator1.mapFromSource--jx7JFs(v);
        return offsetMappingCalculator0 == null ? v1 : f1.b(v1, offsetMappingCalculator0, this.getSelectionWedgeAffinity());
    }

    public final long mapToTransformed-GEjPoXI(long v) {
        OffsetMappingCalculator offsetMappingCalculator1;
        OffsetMappingCalculator offsetMappingCalculator0;
        State state0 = this.e;
        if(state0 == null) {
            offsetMappingCalculator0 = null;
        }
        else {
            g1 g10 = (g1)state0.getValue();
            offsetMappingCalculator0 = g10 == null ? null : g10.b;
        }
        State state1 = this.f;
        if(state1 == null) {
            offsetMappingCalculator1 = null;
        }
        else {
            g1 g11 = (g1)state1.getValue();
            offsetMappingCalculator1 = g11 == null ? null : g11.b;
        }
        if(offsetMappingCalculator0 != null) {
            v = f1.b(v, offsetMappingCalculator0, null);
        }
        return offsetMappingCalculator1 == null ? v : f1.b(v, offsetMappingCalculator1, this.getSelectionWedgeAffinity());
    }

    public final void placeCursorBeforeCharAt(int v) {
        this.selectCharsIn-5zc-tL8(TextRangeKt.TextRange(v));
    }

    public final void redo() {
        this.a.getUndoState().redo();
    }

    public final void replaceAll(@NotNull CharSequence charSequence0) {
        InputTransformation inputTransformation0 = this.b;
        this.a.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer editingBuffer0 = this.a.getMainBuffer$foundation_release();
        EditCommandKt.deleteAll(editingBuffer0);
        EditCommandKt.commitText(editingBuffer0, charSequence0.toString(), 1);
        TextFieldState.access$commitEditAsUser(this.a, inputTransformation0, true, TextFieldEditUndoBehavior.MergeIfPossible);
    }

    public final void replaceSelectedText(@NotNull CharSequence charSequence0, boolean z, @NotNull TextFieldEditUndoBehavior textFieldEditUndoBehavior0) {
        InputTransformation inputTransformation0 = this.b;
        TextFieldState textFieldState0 = this.a;
        textFieldState0.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer editingBuffer0 = textFieldState0.getMainBuffer$foundation_release();
        if(z) {
            editingBuffer0.commitComposition();
        }
        long v = editingBuffer0.getSelection-d9O1mEE();
        editingBuffer0.replace(TextRange.getMin-impl(v), TextRange.getMax-impl(v), charSequence0);
        int v1 = TextRange.getMin-impl(v);
        int v2 = charSequence0.length();
        editingBuffer0.setSelection(v2 + v1, v2 + v1);
        TextFieldState.access$commitEditAsUser(textFieldState0, inputTransformation0, true, textFieldEditUndoBehavior0);
    }

    public static void replaceSelectedText$default(TransformedTextFieldState transformedTextFieldState0, CharSequence charSequence0, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior0, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            textFieldEditUndoBehavior0 = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        transformedTextFieldState0.replaceSelectedText(charSequence0, z, textFieldEditUndoBehavior0);
    }

    public final void replaceText-M8tDOmk(@NotNull CharSequence charSequence0, long v, @NotNull TextFieldEditUndoBehavior textFieldEditUndoBehavior0, boolean z) {
        InputTransformation inputTransformation0 = this.b;
        this.a.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer editingBuffer0 = this.a.getMainBuffer$foundation_release();
        long v1 = this.mapFromTransformed-GEjPoXI(v);
        editingBuffer0.replace(TextRange.getMin-impl(v1), TextRange.getMax-impl(v1), charSequence0);
        int v2 = TextRange.getMin-impl(v1);
        int v3 = charSequence0.length();
        editingBuffer0.setSelection(v3 + v2, v3 + v2);
        TextFieldState.access$commitEditAsUser(this.a, inputTransformation0, z, textFieldEditUndoBehavior0);
    }

    public static void replaceText-M8tDOmk$default(TransformedTextFieldState transformedTextFieldState0, CharSequence charSequence0, long v, TextFieldEditUndoBehavior textFieldEditUndoBehavior0, boolean z, int v1, Object object0) {
        if((v1 & 4) != 0) {
            textFieldEditUndoBehavior0 = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        if((v1 & 8) != 0) {
            z = true;
        }
        transformedTextFieldState0.replaceText-M8tDOmk(charSequence0, v, textFieldEditUndoBehavior0, z);
    }

    public final void selectAll() {
        InputTransformation inputTransformation0 = this.b;
        this.a.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer editingBuffer0 = this.a.getMainBuffer$foundation_release();
        editingBuffer0.setSelection(0, editingBuffer0.getLength());
        TextFieldState.access$commitEditAsUser(this.a, inputTransformation0, true, TextFieldEditUndoBehavior.MergeIfPossible);
    }

    public final void selectCharsIn-5zc-tL8(long v) {
        this.selectUntransformedCharsIn-5zc-tL8(this.mapFromTransformed-GEjPoXI(v));
    }

    public final void selectUntransformedCharsIn-5zc-tL8(long v) {
        InputTransformation inputTransformation0 = this.b;
        this.a.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        this.a.getMainBuffer$foundation_release().setSelection(TextRange.getStart-impl(v), TextRange.getEnd-impl(v));
        TextFieldState.access$commitEditAsUser(this.a, inputTransformation0, true, TextFieldEditUndoBehavior.MergeIfPossible);
    }

    public final void setSelectionWedgeAffinity(@NotNull SelectionWedgeAffinity selectionWedgeAffinity0) {
        this.g.setValue(selectionWedgeAffinity0);
    }

    @Override
    @NotNull
    public String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.a + ", outputTransformation=" + this.d + ", outputTransformedText=" + this.e + ", codepointTransformation=" + this.c + ", codepointTransformedText=" + this.f + ", outputText=\"" + this.getOutputText() + "\", visualText=\"" + this.getVisualText() + "\")";
    }

    public final void undo() {
        this.a.getUndoState().undo();
    }

    public final void update(@Nullable InputTransformation inputTransformation0) {
        this.b = inputTransformation0;
    }
}

