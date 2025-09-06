package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import androidx.compose.foundation.interaction.HoverInteraction.Exit;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Cancel;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.a;
import u.b;
import u.d;
import u.f;
import u.g;
import u.h;
import u.i;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u008E\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u000B\b \u0018\u0000 T2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001TBE\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u0012\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00120\u0011\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0017\u001A\u00020\u0012*\u00020\u0016H\u00A6@\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001A\u001A\u00020\u0012*\u00020\u0019H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJP\u0010\u001E\u001A\u00020\u00122\b\u0010\b\u001A\u0004\u0018\u00010\u00072\b\u0010\n\u001A\u0004\u0018\u00010\t2\u0006\u0010\f\u001A\u00020\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0004\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\r\u0010\u001F\u001A\u00020\u0012\u00A2\u0006\u0004\b\u001F\u0010 J\r\u0010!\u001A\u00020\u0012\u00A2\u0006\u0004\b!\u0010 J\u000F\u0010\"\u001A\u00020\u0012H\u0004\u00A2\u0006\u0004\b\"\u0010 J(\u0010+\u001A\u00020\u00122\u0006\u0010$\u001A\u00020#2\u0006\u0010&\u001A\u00020%2\u0006\u0010(\u001A\u00020\'\u00F8\u0001\u0000\u00A2\u0006\u0004\b)\u0010*J\r\u0010,\u001A\u00020\u0012\u00A2\u0006\u0004\b,\u0010 J\u0018\u00101\u001A\u00020\u000B2\u0006\u0010.\u001A\u00020-\u00F8\u0001\u0000\u00A2\u0006\u0004\b/\u00100J\u0018\u00103\u001A\u00020\u000B2\u0006\u0010.\u001A\u00020-\u00F8\u0001\u0000\u00A2\u0006\u0004\b2\u00100J\u0015\u00106\u001A\u00020\u00122\u0006\u00105\u001A\u000204\u00A2\u0006\u0004\b6\u00107J\u0011\u00108\u001A\u00020\u0012*\u00020\u0019\u00A2\u0006\u0004\b8\u0010\u001BJ\u0011\u00109\u001A\u0004\u0018\u00010\u0012H\u0004\u00A2\u0006\u0004\b9\u0010:J\u001F\u0010@\u001A\u00020\u0012*\u00020;2\u0006\u0010=\u001A\u00020<H\u0084@\u00F8\u0001\u0000\u00A2\u0006\u0004\b>\u0010?R$\u0010\f\u001A\u00020\u000B2\u0006\u0010A\u001A\u00020\u000B8\u0004@BX\u0084\u000E\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010ER0\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010A\u001A\b\u0012\u0004\u0012\u00020\u00120\u00118\u0004@BX\u0084\u000E\u00A2\u0006\f\n\u0004\bF\u0010G\u001A\u0004\bH\u0010IR\u001A\u0010O\u001A\u00020J8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bK\u0010L\u001A\u0004\bM\u0010NR\u001A\u0010P\u001A\u00020\u000B8\u0006X\u0086D\u00A2\u0006\f\n\u0004\bP\u0010C\u001A\u0004\bQ\u0010ER\u0011\u0010S\u001A\u00020\u000B8F\u00A2\u0006\u0006\u001A\u0004\bR\u0010E\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006U"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/IndicationNodeFactory;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "clickPointerInput", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applyAdditionalSemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "updateCommon-QzZPfjk", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)V", "updateCommon", "onAttach", "()V", "onDetach", "disposeInteractions", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onKeyEvent", "onPreKeyEvent-ZmokQxo", "onPreKeyEvent", "Landroidx/compose/ui/focus/FocusState;", "focusState", "onFocusEvent", "(Landroidx/compose/ui/focus/FocusState;)V", "applySemantics", "resetPointerInputHandler", "()Lkotlin/Unit;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "offset", "handlePressInteraction-d-4ec7I", "(Landroidx/compose/foundation/gestures/PressGestureScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handlePressInteraction", "<set-?>", "t", "Z", "getEnabled", "()Z", "u", "Lkotlin/jvm/functions/Function0;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "", "F", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;", "traverseKey", "shouldAutoInvalidate", "getShouldAutoInvalidate", "getShouldMergeDescendantSemantics", "shouldMergeDescendantSemantics", "TraverseKey", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,1301:1\n1#2:1302\n1855#3,2:1303\n175#4:1305\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n*L\n1003#1:1303,2\n1031#1:1305\n*E\n"})
public abstract class AbstractClickableNode extends DelegatingNode implements FocusEventModifierNode, KeyInputModifierNode, PointerInputModifierNode, SemanticsModifierNode, TraversableNode {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode$TraverseKey;", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class TraverseKey {
        public TraverseKey(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    public Enter A;
    public final LinkedHashMap B;
    public long C;
    public MutableInteractionSource D;
    public boolean E;
    public final TraverseKey F;
    @NotNull
    public static final TraverseKey TraverseKey;
    public MutableInteractionSource p;
    public IndicationNodeFactory q;
    public String r;
    public Role s;
    public boolean t;
    public Function0 u;
    public final FocusableInNonTouchMode v;
    public final FocusableNode w;
    public SuspendingPointerInputModifierNode x;
    public DelegatableNode y;
    public Press z;

    static {
        AbstractClickableNode.TraverseKey = new TraverseKey(null);
        AbstractClickableNode.$stable = 8;
    }

    public AbstractClickableNode(MutableInteractionSource mutableInteractionSource0, IndicationNodeFactory indicationNodeFactory0, boolean z, String s, Role role0, Function0 function00, DefaultConstructorMarker defaultConstructorMarker0) {
        this.p = mutableInteractionSource0;
        this.q = indicationNodeFactory0;
        this.r = s;
        this.s = role0;
        this.t = z;
        this.u = function00;
        this.v = new FocusableInNonTouchMode();
        this.w = new FocusableNode(this.p);
        this.B = new LinkedHashMap();
        this.C = 0L;
        this.D = this.p;
        this.E = this.p == null && this.q != null;
        this.F = AbstractClickableNode.TraverseKey;
    }

    public static final boolean access$delayPressInteraction(AbstractClickableNode abstractClickableNode0) {
        abstractClickableNode0.getClass();
        return ClickableKt.hasScrollableContainer(abstractClickableNode0) || Clickable_androidKt.isComposeRootInScrollableContainer(abstractClickableNode0);
    }

    public static final void access$emitHoverEnter(AbstractClickableNode abstractClickableNode0) {
        if(abstractClickableNode0.A == null) {
            Enter hoverInteraction$Enter0 = new Enter();
            MutableInteractionSource mutableInteractionSource0 = abstractClickableNode0.p;
            if(mutableInteractionSource0 != null) {
                BuildersKt.launch$default(abstractClickableNode0.getCoroutineScope(), null, null, new a(mutableInteractionSource0, hoverInteraction$Enter0, null), 3, null);
            }
            abstractClickableNode0.A = hoverInteraction$Enter0;
        }
    }

    public static final void access$emitHoverExit(AbstractClickableNode abstractClickableNode0) {
        Enter hoverInteraction$Enter0 = abstractClickableNode0.A;
        if(hoverInteraction$Enter0 != null) {
            Exit hoverInteraction$Exit0 = new Exit(hoverInteraction$Enter0);
            MutableInteractionSource mutableInteractionSource0 = abstractClickableNode0.p;
            if(mutableInteractionSource0 != null) {
                BuildersKt.launch$default(abstractClickableNode0.getCoroutineScope(), null, null, new b(mutableInteractionSource0, hoverInteraction$Exit0, null), 3, null);
            }
            abstractClickableNode0.A = null;
        }
    }

    public void applyAdditionalSemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Role role0 = this.s;
        if(role0 != null) {
            Intrinsics.checkNotNull(role0);
            SemanticsPropertiesKt.setRole-kuIjeqM(semanticsPropertyReceiver0, role0.unbox-impl());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver0, this.r, new e(this, 23));
        if(this.t) {
            this.w.applySemantics(semanticsPropertyReceiver0);
        }
        else {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver0);
        }
        this.applyAdditionalSemantics(semanticsPropertyReceiver0);
    }

    public final void c() {
        if(this.y != null) {
            return;
        }
        IndicationNodeFactory indicationNodeFactory0 = this.q;
        if(indicationNodeFactory0 != null) {
            if(this.p == null) {
                this.p = InteractionSourceKt.MutableInteractionSource();
            }
            this.w.update(this.p);
            MutableInteractionSource mutableInteractionSource0 = this.p;
            Intrinsics.checkNotNull(mutableInteractionSource0);
            DelegatableNode delegatableNode0 = indicationNodeFactory0.create(mutableInteractionSource0);
            this.delegate(delegatableNode0);
            this.y = delegatableNode0;
        }
    }

    @Nullable
    public abstract Object clickPointerInput(@NotNull PointerInputScope arg1, @NotNull Continuation arg2);

    public final void disposeInteractions() {
        MutableInteractionSource mutableInteractionSource0 = this.p;
        LinkedHashMap linkedHashMap0 = this.B;
        if(mutableInteractionSource0 != null) {
            Press pressInteraction$Press0 = this.z;
            if(pressInteraction$Press0 != null) {
                mutableInteractionSource0.tryEmit(new Cancel(pressInteraction$Press0));
            }
            Enter hoverInteraction$Enter0 = this.A;
            if(hoverInteraction$Enter0 != null) {
                mutableInteractionSource0.tryEmit(new Exit(hoverInteraction$Enter0));
            }
            for(Object object0: linkedHashMap0.values()) {
                mutableInteractionSource0.tryEmit(new Cancel(((Press)object0)));
            }
        }
        this.z = null;
        this.A = null;
        linkedHashMap0.clear();
    }

    public final boolean getEnabled() {
        return this.t;
    }

    @NotNull
    public final Function0 getOnClick() {
        return this.u;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override  // androidx.compose.ui.node.TraversableNode
    @NotNull
    public Object getTraverseKey() {
        return this.F;
    }

    @Nullable
    public final Object handlePressInteraction-d-4ec7I(@NotNull PressGestureScope pressGestureScope0, long v, @NotNull Continuation continuation0) {
        MutableInteractionSource mutableInteractionSource0 = this.p;
        if(mutableInteractionSource0 != null) {
            Object object0 = CoroutineScopeKt.coroutineScope(new d(pressGestureScope0, v, mutableInteractionSource0, this, null), continuation0);
            if(object0 == qd.a.getCOROUTINE_SUSPENDED()) {
                return object0;
            }
        }
        return Unit.INSTANCE;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onAttach() {
        if(!this.E) {
            this.c();
        }
        if(this.t) {
            this.delegate(this.v);
            this.delegate(this.w);
        }
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        MutableInteractionSource mutableInteractionSource0 = this.p;
        if(mutableInteractionSource0 != null) {
            Enter hoverInteraction$Enter0 = this.A;
            if(hoverInteraction$Enter0 != null) {
                mutableInteractionSource0.tryEmit(new Exit(hoverInteraction$Enter0));
            }
        }
        this.A = null;
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode0 = this.x;
        if(suspendingPointerInputModifierNode0 != null) {
            suspendingPointerInputModifierNode0.onCancelPointerInput();
        }
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onDetach() {
        this.disposeInteractions();
        if(this.D == null) {
            this.p = null;
        }
        DelegatableNode delegatableNode0 = this.y;
        if(delegatableNode0 != null) {
            this.undelegate(delegatableNode0);
        }
        this.y = null;
    }

    @Override  // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(@NotNull FocusState focusState0) {
        if(focusState0.isFocused()) {
            this.c();
        }
        if(this.t) {
            this.w.onFocusEvent(focusState0);
        }
    }

    @Override  // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean onKeyEvent-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        this.c();
        LinkedHashMap linkedHashMap0 = this.B;
        if(this.t && Clickable_androidKt.isPress-ZmokQxo(keyEvent0)) {
            if(!linkedHashMap0.containsKey(Key.box-impl(KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0)))) {
                Press pressInteraction$Press0 = new Press(this.C, null);
                linkedHashMap0.put(Key.box-impl(KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0)), pressInteraction$Press0);
                if(this.p != null) {
                    BuildersKt.launch$default(this.getCoroutineScope(), null, null, new u.e(this, pressInteraction$Press0, null), 3, null);
                }
                return true;
            }
        }
        else if(this.t && Clickable_androidKt.isClick-ZmokQxo(keyEvent0)) {
            Press pressInteraction$Press1 = (Press)linkedHashMap0.remove(Key.box-impl(KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0)));
            if(pressInteraction$Press1 != null && this.p != null) {
                BuildersKt.launch$default(this.getCoroutineScope(), null, null, new f(this, pressInteraction$Press1, null), 3, null);
            }
            this.u.invoke();
            return true;
        }
        return false;
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public final void onPointerEvent-H0pRuoY(@NotNull PointerEvent pointerEvent0, @NotNull PointerEventPass pointerEventPass0, long v) {
        long v1 = IntSizeKt.getCenter-ozmzZPI(v);
        this.C = OffsetKt.Offset(IntOffset.getX-impl(v1), IntOffset.getY-impl(v1));
        this.c();
        if(this.t && pointerEventPass0 == PointerEventPass.Main) {
            int v2 = pointerEvent0.getType-7fucELk();
            if(PointerEventType.equals-impl0(v2, 4)) {
                BuildersKt.launch$default(this.getCoroutineScope(), null, null, new g(this, null), 3, null);
            }
            else if(PointerEventType.equals-impl0(v2, 5)) {
                BuildersKt.launch$default(this.getCoroutineScope(), null, null, new h(this, null), 3, null);
            }
        }
        if(this.x == null) {
            this.x = (SuspendingPointerInputModifierNode)this.delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new i(this, null)));
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode0 = this.x;
        if(suspendingPointerInputModifierNode0 != null) {
            suspendingPointerInputModifierNode0.onPointerEvent-H0pRuoY(pointerEvent0, pointerEventPass0, v);
        }
    }

    @Override  // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean onPreKeyEvent-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        return false;
    }

    @Nullable
    public final Unit resetPointerInputHandler() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode0 = this.x;
        if(suspendingPointerInputModifierNode0 != null) {
            suspendingPointerInputModifierNode0.resetPointerInputHandler();
            return Unit.INSTANCE;
        }
        return null;
    }

    public final void updateCommon-QzZPfjk(@Nullable MutableInteractionSource mutableInteractionSource0, @Nullable IndicationNodeFactory indicationNodeFactory0, boolean z, @Nullable String s, @Nullable Role role0, @NotNull Function0 function00) {
        int v1;
        boolean z1 = false;
        int v = 1;
        if(Intrinsics.areEqual(this.D, mutableInteractionSource0)) {
            v1 = 0;
        }
        else {
            this.disposeInteractions();
            this.D = mutableInteractionSource0;
            this.p = mutableInteractionSource0;
            v1 = 1;
        }
        if(!Intrinsics.areEqual(this.q, indicationNodeFactory0)) {
            this.q = indicationNodeFactory0;
            v1 = 1;
        }
        FocusableNode focusableNode0 = this.w;
        if(this.t != z) {
            FocusableInNonTouchMode focusableInNonTouchMode0 = this.v;
            if(z) {
                this.delegate(focusableInNonTouchMode0);
                this.delegate(focusableNode0);
            }
            else {
                this.undelegate(focusableInNonTouchMode0);
                this.undelegate(focusableNode0);
                this.disposeInteractions();
            }
            SemanticsModifierNodeKt.invalidateSemantics(this);
            this.t = z;
        }
        if(!Intrinsics.areEqual(this.r, s)) {
            this.r = s;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if(!Intrinsics.areEqual(this.s, role0)) {
            this.s = role0;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        this.u = function00;
        MutableInteractionSource mutableInteractionSource1 = this.D;
        if(this.E == (mutableInteractionSource1 == null && this.q != null)) {
            v = v1;
        }
        else {
            if(mutableInteractionSource1 == null && this.q != null) {
                z1 = true;
            }
            this.E = z1;
            if(z1 || this.y != null) {
                v = v1;
            }
        }
        if(v != 0) {
            DelegatableNode delegatableNode0 = this.y;
            if(delegatableNode0 != null || !this.E) {
                if(delegatableNode0 != null) {
                    this.undelegate(delegatableNode0);
                }
                this.y = null;
                this.c();
            }
        }
        focusableNode0.update(this.p);
    }
}

