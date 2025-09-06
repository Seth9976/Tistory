package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import androidx.compose.foundation.interaction.HoverInteraction.Exit;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.handwriting.StylusHandwritingNode;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.material3.e0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import m0.l0;
import m0.m0;
import m0.n0;
import m0.o0;
import m0.p0;
import m0.q0;
import m0.v0;
import m0.x0;
import m0.y0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00A4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b?\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000B2\u00020\fB[\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u0012\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001A\u00020\u0015\u0012\u0006\u0010\u0017\u001A\u00020\u0015\u0012\u0006\u0010\u0019\u001A\u00020\u0018\u0012\b\u0010\u001B\u001A\u0004\u0018\u00010\u001A\u0012\u0006\u0010\u001C\u001A\u00020\u0015\u0012\u0006\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\b\u001F\u0010 Ja\u0010\"\u001A\u00020!2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u00112\b\u0010\u0014\u001A\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\u00152\u0006\u0010\u0019\u001A\u00020\u00182\b\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\u0006\u0010\u001C\u001A\u00020\u00152\u0006\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\b\"\u0010 J\u0013\u0010$\u001A\u00020!*\u00020#H\u0016\u00A2\u0006\u0004\b$\u0010%J\u0017\u0010(\u001A\u00020!2\u0006\u0010\'\u001A\u00020&H\u0016\u00A2\u0006\u0004\b(\u0010)J\u000F\u0010*\u001A\u00020!H\u0016\u00A2\u0006\u0004\b*\u0010+J\u000F\u0010,\u001A\u00020!H\u0016\u00A2\u0006\u0004\b,\u0010+J\u0017\u0010/\u001A\u00020!2\u0006\u0010.\u001A\u00020-H\u0016\u00A2\u0006\u0004\b/\u00100J*\u00109\u001A\u00020!2\u0006\u00102\u001A\u0002012\u0006\u00104\u001A\u0002032\u0006\u00106\u001A\u000205H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b7\u00108J\u000F\u0010:\u001A\u00020!H\u0016\u00A2\u0006\u0004\b:\u0010+J\u001A\u0010?\u001A\u00020\u00152\u0006\u0010<\u001A\u00020;H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b=\u0010>J\u001A\u0010A\u001A\u00020\u00152\u0006\u0010<\u001A\u00020;H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b@\u0010>J\u000F\u0010B\u001A\u00020!H\u0016\u00A2\u0006\u0004\bB\u0010+R\"\u0010\u000E\u001A\u00020\r8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bC\u0010D\u001A\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u0010\u001A\u00020\u000F8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bI\u0010J\u001A\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010\u0012\u001A\u00020\u00118\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bO\u0010P\u001A\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010\u0014\u001A\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bU\u0010V\u001A\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010\u0016\u001A\u00020\u00158\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b[\u0010\\\u001A\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010\u0017\u001A\u00020\u00158\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\ba\u0010\\\u001A\u0004\bb\u0010^\"\u0004\bc\u0010`R$\u0010\u001B\u001A\u0004\u0018\u00010\u001A8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bd\u0010e\u001A\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010\u001C\u001A\u00020\u00158\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bj\u0010\\\u001A\u0004\bk\u0010^\"\u0004\bl\u0010`R\"\u0010\u001E\u001A\u00020\u001D8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bm\u0010n\u001A\u0004\bo\u0010p\"\u0004\bq\u0010rR$\u0010\u0019\u001A\u00020\u00182\u0006\u0010s\u001A\u00020\u00188\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\bt\u0010u\u001A\u0004\bv\u0010wR\u0014\u0010y\u001A\u00020\u00158VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bx\u0010^\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006z"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/InputTransformation;", "filter", "", "enabled", "readOnly", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "keyboardActionHandler", "singleLine", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;)V", "", "updateNode", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/focus/FocusState;", "focusState", "onFocusEvent", "(Landroidx/compose/ui/focus/FocusState;)V", "onAttach", "()V", "onDetach", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "onPreKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onPreKeyEvent", "onKeyEvent-ZmokQxo", "onKeyEvent", "onObservedReadsChanged", "p", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "getTextFieldState", "()Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "setTextFieldState", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)V", "q", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "getTextLayoutState", "()Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "setTextLayoutState", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "r", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "getTextFieldSelectionState", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "setTextFieldSelectionState", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V", "s", "Landroidx/compose/foundation/text/input/InputTransformation;", "getFilter", "()Landroidx/compose/foundation/text/input/InputTransformation;", "setFilter", "(Landroidx/compose/foundation/text/input/InputTransformation;)V", "t", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V", "u", "getReadOnly", "setReadOnly", "v", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "getKeyboardActionHandler", "()Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "setKeyboardActionHandler", "(Landroidx/compose/foundation/text/input/KeyboardActionHandler;)V", "w", "getSingleLine", "setSingleLine", "x", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "setInteractionSource", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "<set-?>", "D", "Landroidx/compose/foundation/text/KeyboardOptions;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "getShouldMergeDescendantSemantics", "shouldMergeDescendantSemantics", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldDecoratorModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDecoratorModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 4 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,768:1\n1#2:769\n314#3,6:770\n323#3:791\n261#4,15:776\n*S KotlinDebug\n*F\n+ 1 TextFieldDecoratorModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode\n*L\n619#1:770,6\n619#1:791\n619#1:776,15\n*E\n"})
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements FocusEventModifierNode, FocusRequesterModifierNode, KeyInputModifierNode, ModifierLocalModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, LayoutAwareModifierNode, ObserverModifierNode, PointerInputModifierNode, SemanticsModifierNode, PlatformTextInputModifierNode {
    public static final int $stable = 8;
    public final StylusHandwritingNode A;
    public Enter B;
    public final DragAndDropModifierNode C;
    public KeyboardOptions D;
    public boolean E;
    public WindowInfo F;
    public Job G;
    public final TextFieldKeyEventHandler H;
    public final androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.keyboardActionScope.1 I;
    public Job J;
    public final l0 K;
    public TransformedTextFieldState p;
    public TextLayoutState q;
    public TextFieldSelectionState r;
    public InputTransformation s;
    public boolean t;
    public boolean u;
    public KeyboardActionHandler v;
    public boolean w;
    public MutableInteractionSource x;
    public MutableSharedFlow y;
    public final SuspendingPointerInputModifierNode z;

    public TextFieldDecoratorModifierNode(@NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextLayoutState textLayoutState0, @NotNull TextFieldSelectionState textFieldSelectionState0, @Nullable InputTransformation inputTransformation0, boolean z, boolean z1, @NotNull KeyboardOptions keyboardOptions0, @Nullable KeyboardActionHandler keyboardActionHandler0, boolean z2, @NotNull MutableInteractionSource mutableInteractionSource0) {
        this.p = transformedTextFieldState0;
        this.q = textLayoutState0;
        this.r = textFieldSelectionState0;
        this.s = inputTransformation0;
        this.t = z;
        this.u = z1;
        this.v = keyboardActionHandler0;
        this.w = z2;
        this.x = mutableInteractionSource0;
        KeyboardOptions keyboardOptions1 = null;
        this.z = (SuspendingPointerInputModifierNode)this.delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new v0(this, null)));
        this.A = (StylusHandwritingNode)this.delegate(new StylusHandwritingNode(new y0(this, keyboardOptions0)));
        this.C = (DragAndDropModifierNode)this.delegate(TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode$default(new l0(this, 5), new o0(this), new m0(this, 3), null, new p0(this), new m0(this, 4), null, new m0(this, 5), new m0(this, 6), 72, null));
        InputTransformation inputTransformation1 = this.s;
        if(inputTransformation1 != null) {
            keyboardOptions1 = inputTransformation1.getKeyboardOptions();
        }
        this.D = keyboardOptions0.fillUnspecifiedValuesWith$foundation_release(keyboardOptions1);
        this.H = TextFieldKeyEventHandler_androidKt.createTextFieldKeyEventHandler();
        this.I = new KeyboardActionScope() {
            public final TextFieldDecoratorModifierNode a;

            {
                this.a = textFieldDecoratorModifierNode0;
            }

            @Override  // androidx.compose.foundation.text.KeyboardActionScope
            public void defaultKeyboardAction-KlQnJC8(int v) {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0 = this.a;
                if(ImeAction.equals-impl0(v, 6)) {
                    ((FocusManager)CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode0, CompositionLocalsKt.getLocalFocusManager())).moveFocus-3ESFkO8(1);
                    return;
                }
                if(ImeAction.equals-impl0(v, 5)) {
                    ((FocusManager)CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode0, CompositionLocalsKt.getLocalFocusManager())).moveFocus-3ESFkO8(2);
                    return;
                }
                if(ImeAction.equals-impl0(v, 7)) {
                    TextFieldDecoratorModifierNode.access$requireKeyboardController(textFieldDecoratorModifierNode0).hide();
                }
            }
        };
        this.K = new l0(this, 9);
    }

    public static final void access$emitDragExitEvent(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0) {
        Enter hoverInteraction$Enter0 = textFieldDecoratorModifierNode0.B;
        if(hoverInteraction$Enter0 != null) {
            textFieldDecoratorModifierNode0.x.tryEmit(new Exit(hoverInteraction$Enter0));
            textFieldDecoratorModifierNode0.B = null;
        }
    }

    // 去混淆评级： 低(40)
    public static final MutableSharedFlow access$getStylusHandwritingTrigger(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0) {
        return textFieldDecoratorModifierNode0.y == null ? null : textFieldDecoratorModifierNode0.y;
    }

    public static final void access$onImeActionPerformed-KlQnJC8(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0, int v) {
        textFieldDecoratorModifierNode0.getClass();
        if(!ImeAction.equals-impl0(v, 0) && !ImeAction.equals-impl0(v, 1)) {
            KeyboardActionHandler keyboardActionHandler0 = textFieldDecoratorModifierNode0.v;
            if(keyboardActionHandler0 != null) {
                keyboardActionHandler0.onKeyboardAction(new n0(textFieldDecoratorModifierNode0, v, 1));
                return;
            }
        }
        textFieldDecoratorModifierNode0.I.defaultKeyboardAction-KlQnJC8(v);
    }

    public static final SoftwareKeyboardController access$requireKeyboardController(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0) {
        textFieldDecoratorModifierNode0.getClass();
        SoftwareKeyboardController softwareKeyboardController0 = (SoftwareKeyboardController)CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode0, CompositionLocalsKt.getLocalSoftwareKeyboardController());
        if(softwareKeyboardController0 == null) {
            throw new IllegalStateException("No software keyboard controller");
        }
        return softwareKeyboardController0;
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        TextFieldCharSequence textFieldCharSequence0 = this.p.getOutputText();
        long v = textFieldCharSequence0.getSelection-d9O1mEE();
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver0, new AnnotatedString(textFieldCharSequence0.toString(), null, null, 6, null));
        SemanticsPropertiesKt.setTextSelectionRange-FDrldGo(semanticsPropertyReceiver0, v);
        if(!this.t) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver0);
        }
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver0, this.d());
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver0, null, new m0(this, 0), 1, null);
        if(this.d()) {
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver0, null, new m0(this, 1), 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver0, null, new m0(this, 2), 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver0, null, new e0(this, 7), 1, null);
        int v1 = this.D.getImeActionOrDefault-eUduSuo$foundation_release();
        SemanticsPropertiesKt.onImeAction-9UiTYpY$default(semanticsPropertyReceiver0, v1, null, new n0(this, v1, 0), 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver0, null, new l0(this, 1), 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver0, null, new l0(this, 2), 1, null);
        if(!TextRange.getCollapsed-impl(v)) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver0, null, new l0(this, 3), 1, null);
            if(this.t && !this.u) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver0, null, new l0(this, 4), 1, null);
            }
        }
        if(this.d()) {
            SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver0, null, new l0(this, 0), 1, null);
        }
        InputTransformation inputTransformation0 = this.s;
        if(inputTransformation0 != null) {
            inputTransformation0.applySemantics(semanticsPropertyReceiver0);
        }
    }

    public final void c() {
        Job job0 = this.J;
        MutableSharedFlow mutableSharedFlow0 = null;
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
        this.J = null;
        MutableSharedFlow mutableSharedFlow1 = this.y;
        if(mutableSharedFlow1 != null) {
            mutableSharedFlow0 = mutableSharedFlow1;
        }
        if(mutableSharedFlow0 != null) {
            mutableSharedFlow0.resetReplayCache();
        }
    }

    // 去混淆评级： 低(20)
    public final boolean d() {
        return this.t && !this.u;
    }

    public final boolean e() {
        boolean z = this.F != null && this.F.isWindowFocused();
        return this.E && z;
    }

    public final void f() {
        this.r.setFocused(this.e());
        if(this.e() && this.G == null) {
            this.G = BuildersKt.launch$default(this.getCoroutineScope(), null, null, new q0(this, null), 3, null);
            return;
        }
        if(!this.e()) {
            Job job0 = this.G;
            if(job0 != null) {
                DefaultImpls.cancel$default(job0, null, 1, null);
            }
            this.G = null;
        }
    }

    public final void g(boolean z) {
        if(!z && !this.D.getShowKeyboardOnFocusOrDefault$foundation_release()) {
            return;
        }
        ReceiveContentConfiguration receiveContentConfiguration0 = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this);
        this.J = BuildersKt.launch$default(this.getCoroutineScope(), null, null, new x0(this, receiveContentConfiguration0, null), 3, null);
    }

    public final boolean getEnabled() {
        return this.t;
    }

    @Nullable
    public final InputTransformation getFilter() {
        return this.s;
    }

    @NotNull
    public final MutableInteractionSource getInteractionSource() {
        return this.x;
    }

    @Nullable
    public final KeyboardActionHandler getKeyboardActionHandler() {
        return this.v;
    }

    @NotNull
    public final KeyboardOptions getKeyboardOptions() {
        return this.D;
    }

    public final boolean getReadOnly() {
        return this.u;
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public final boolean getSingleLine() {
        return this.w;
    }

    @NotNull
    public final TextFieldSelectionState getTextFieldSelectionState() {
        return this.r;
    }

    @NotNull
    public final TransformedTextFieldState getTextFieldState() {
        return this.p;
    }

    @NotNull
    public final TextLayoutState getTextLayoutState() {
        return this.q;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onAttach() {
        this.onObservedReadsChanged();
        this.r.setReceiveContentConfiguration(this.K);
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.A.onCancelPointerInput();
        this.z.onCancelPointerInput();
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onDetach() {
        this.c();
        this.r.setReceiveContentConfiguration(null);
    }

    @Override  // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(@NotNull FocusState focusState0) {
        if(this.E == focusState0.isFocused()) {
            return;
        }
        this.E = focusState0.isFocused();
        this.f();
        if(!focusState0.isFocused()) {
            this.c();
            TextFieldState textFieldState0 = this.p.a;
            InputTransformation inputTransformation0 = this.p.b;
            textFieldState0.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
            EditCommandKt.finishComposingText(textFieldState0.getMainBuffer$foundation_release());
            TextFieldState.access$commitEditAsUser(textFieldState0, inputTransformation0, true, TextFieldEditUndoBehavior.MergeIfPossible);
            this.p.collapseSelectionToMax();
        }
        else if(this.d()) {
            this.g(false);
        }
        this.A.onFocusEvent(focusState0);
    }

    @Override  // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates layoutCoordinates0) {
        this.q.setDecoratorNodeCoordinates(layoutCoordinates0);
    }

    @Override  // androidx.compose.ui.input.key.KeyInputModifierNode
    public boolean onKeyEvent-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        TransformedTextFieldState transformedTextFieldState0 = this.p;
        TextLayoutState textLayoutState0 = this.q;
        TextFieldSelectionState textFieldSelectionState0 = this.r;
        boolean z = this.t && !this.u;
        boolean z1 = this.w;
        l0 l00 = new l0(this, 6);
        return this.H.onKeyEvent-6ptp14s(keyEvent0, transformedTextFieldState0, textLayoutState0, textFieldSelectionState0, z, z1, l00);
    }

    @Override  // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new l0(this, 7));
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public void onPointerEvent-H0pRuoY(@NotNull PointerEvent pointerEvent0, @NotNull PointerEventPass pointerEventPass0, long v) {
        this.A.onPointerEvent-H0pRuoY(pointerEvent0, pointerEventPass0, v);
        this.z.onPointerEvent-H0pRuoY(pointerEvent0, pointerEventPass0, v);
    }

    @Override  // androidx.compose.ui.input.key.KeyInputModifierNode
    public boolean onPreKeyEvent-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        TransformedTextFieldState transformedTextFieldState0 = this.p;
        TextFieldSelectionState textFieldSelectionState0 = this.r;
        Object object0 = CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFocusManager());
        Object object1 = CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalSoftwareKeyboardController());
        if(((SoftwareKeyboardController)object1) == null) {
            throw new IllegalStateException("No software keyboard controller");
        }
        return this.H.onPreKeyEvent-MyFupTE(keyEvent0, transformedTextFieldState0, textFieldSelectionState0, ((FocusManager)object0), ((SoftwareKeyboardController)object1));
    }

    public final void setEnabled(boolean z) {
        this.t = z;
    }

    public final void setFilter(@Nullable InputTransformation inputTransformation0) {
        this.s = inputTransformation0;
    }

    public final void setInteractionSource(@NotNull MutableInteractionSource mutableInteractionSource0) {
        this.x = mutableInteractionSource0;
    }

    public final void setKeyboardActionHandler(@Nullable KeyboardActionHandler keyboardActionHandler0) {
        this.v = keyboardActionHandler0;
    }

    public final void setReadOnly(boolean z) {
        this.u = z;
    }

    public final void setSingleLine(boolean z) {
        this.w = z;
    }

    public final void setTextFieldSelectionState(@NotNull TextFieldSelectionState textFieldSelectionState0) {
        this.r = textFieldSelectionState0;
    }

    public final void setTextFieldState(@NotNull TransformedTextFieldState transformedTextFieldState0) {
        this.p = transformedTextFieldState0;
    }

    public final void setTextLayoutState(@NotNull TextLayoutState textLayoutState0) {
        this.q = textLayoutState0;
    }

    public final void updateNode(@NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextLayoutState textLayoutState0, @NotNull TextFieldSelectionState textFieldSelectionState0, @Nullable InputTransformation inputTransformation0, boolean z, boolean z1, @NotNull KeyboardOptions keyboardOptions0, @Nullable KeyboardActionHandler keyboardActionHandler0, boolean z2, @NotNull MutableInteractionSource mutableInteractionSource0) {
        boolean z3 = this.t;
        int v = 1;
        int v1 = !z3 || this.u ? 0 : 1;
        if(!z || z1) {
            v = 0;
        }
        TransformedTextFieldState transformedTextFieldState1 = this.p;
        KeyboardOptions keyboardOptions1 = this.D;
        TextFieldSelectionState textFieldSelectionState1 = this.r;
        MutableInteractionSource mutableInteractionSource1 = this.x;
        this.p = transformedTextFieldState0;
        this.q = textLayoutState0;
        this.r = textFieldSelectionState0;
        this.s = inputTransformation0;
        this.t = z;
        this.u = z1;
        this.D = keyboardOptions0.fillUnspecifiedValuesWith$foundation_release((inputTransformation0 == null ? null : inputTransformation0.getKeyboardOptions()));
        this.v = keyboardActionHandler0;
        this.w = z2;
        this.x = mutableInteractionSource0;
        if(v != v1 || !Intrinsics.areEqual(transformedTextFieldState0, transformedTextFieldState1) || !Intrinsics.areEqual(this.D, keyboardOptions1)) {
            if(v != 0 && this.e()) {
                this.g(false);
            }
            else if(v == 0) {
                this.c();
            }
        }
        if(z3 != z) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        boolean z4 = Intrinsics.areEqual(textFieldSelectionState0, textFieldSelectionState1);
        StylusHandwritingNode stylusHandwritingNode0 = this.A;
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode0 = this.z;
        if(!z4) {
            suspendingPointerInputModifierNode0.resetPointerInputHandler();
            stylusHandwritingNode0.resetPointerInputHandler();
            if(this.isAttached()) {
                textFieldSelectionState0.setReceiveContentConfiguration(this.K);
            }
        }
        if(!Intrinsics.areEqual(mutableInteractionSource0, mutableInteractionSource1)) {
            suspendingPointerInputModifierNode0.resetPointerInputHandler();
            stylusHandwritingNode0.resetPointerInputHandler();
        }
    }
}

