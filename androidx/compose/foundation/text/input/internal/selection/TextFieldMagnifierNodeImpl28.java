package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.MagnifierNode;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import n0.b;
import n0.d;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\'\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ/\u0010\u0010\u001A\u00020\r2\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0013\u0010\u0012\u001A\u00020\r*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001A\u00020\r2\u0006\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001A\u00020\r*\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNodeImpl28;", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "", "visible", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Z)V", "", "onAttach", "()V", "update", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidTextFieldMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextFieldMagnifier.android.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNodeImpl28\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n81#2:204\n107#2,2:205\n1#3:207\n*S KotlinDebug\n*F\n+ 1 AndroidTextFieldMagnifier.android.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierNodeImpl28\n*L\n52#1:204\n52#1:205,2\n*E\n"})
public final class TextFieldMagnifierNodeImpl28 extends TextFieldMagnifierNode implements CompositionLocalConsumerModifierNode {
    public static final int $stable;
    public TransformedTextFieldState p;
    public TextFieldSelectionState q;
    public TextLayoutState r;
    public boolean s;
    public final MutableState t;
    public final Animatable u;
    public final MagnifierNode v;
    public Job w;

    public TextFieldMagnifierNodeImpl28(@NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextFieldSelectionState textFieldSelectionState0, @NotNull TextLayoutState textLayoutState0, boolean z) {
        this.p = transformedTextFieldState0;
        this.q = textFieldSelectionState0;
        this.r = textLayoutState0;
        this.s = z;
        MutableState mutableState0 = SnapshotStateKt.mutableStateOf$default(IntSize.box-impl(0L), null, 2, null);
        this.t = mutableState0;
        this.u = new Animatable(Offset.box-impl(TextFieldMagnifierKt.calculateSelectionMagnifierCenterAndroid-hUlJWOE(this.p, this.q, this.r, ((IntSize)mutableState0.getValue()).unbox-impl())), SelectionMagnifierKt.getUnspecifiedSafeOffsetVectorConverter(), Offset.box-impl(0x3C23D70A3C23D70AL), null, 8, null);
        this.v = (MagnifierNode)this.delegate(new MagnifierNode(new b(this, 0), null, new b(this, 1), 0.0f, true, 0L, 0.0f, 0.0f, false, null, 1002, null));
    }

    public static final long access$getMagnifierSize-YbymL2g(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl280) {
        return ((IntSize)textFieldMagnifierNodeImpl280.t.getValue()).unbox-impl();
    }

    public static final void access$setMagnifierSize-ozmzZPI(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl280, long v) {
        IntSize intSize0 = IntSize.box-impl(v);
        textFieldMagnifierNodeImpl280.t.setValue(intSize0);
    }

    @Override  // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        this.v.applySemantics(semanticsPropertyReceiver0);
    }

    public final void c() {
        Job job0 = this.w;
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
        this.w = BuildersKt.launch$default(this.getCoroutineScope(), null, null, new d(this, null), 3, null);
    }

    @Override  // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope0) {
        contentDrawScope0.drawContent();
        this.v.draw(contentDrawScope0);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onAttach() {
        this.c();
    }

    @Override  // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates layoutCoordinates0) {
        this.v.onGloballyPositioned(layoutCoordinates0);
    }

    @Override  // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode
    public void update(@NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextFieldSelectionState textFieldSelectionState0, @NotNull TextLayoutState textLayoutState0, boolean z) {
        TransformedTextFieldState transformedTextFieldState1 = this.p;
        TextFieldSelectionState textFieldSelectionState1 = this.q;
        TextLayoutState textLayoutState1 = this.r;
        boolean z1 = this.s;
        this.p = transformedTextFieldState0;
        this.q = textFieldSelectionState0;
        this.r = textLayoutState0;
        this.s = z;
        if(!Intrinsics.areEqual(transformedTextFieldState0, transformedTextFieldState1) || !Intrinsics.areEqual(textFieldSelectionState0, textFieldSelectionState1) || !Intrinsics.areEqual(textLayoutState0, textLayoutState1) || z != z1) {
            this.c();
        }
    }
}

