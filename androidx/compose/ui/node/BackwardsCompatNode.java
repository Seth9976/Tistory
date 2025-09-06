package androidx.compose.ui.node;

import a2.b;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.DrawCacheModifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusOrder;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifier;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.modifier.BackwardsCompatLocalMap;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import b2.c;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00F8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000B2\u00020\f2\u00020\r2\u00020\u000E2\u00020\u000FB\u000F\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0016J\u000F\u0010\u0018\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0016J\u000F\u0010\u001A\u001A\u00020\u0014H\u0000\u00A2\u0006\u0004\b\u0019\u0010\u0016J\r\u0010\u001B\u001A\u00020\u0014\u00A2\u0006\u0004\b\u001B\u0010\u0016J&\u0010$\u001A\u00020!*\u00020\u001C2\u0006\u0010\u001E\u001A\u00020\u001D2\u0006\u0010 \u001A\u00020\u001FH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010#J#\u0010)\u001A\u00020\'*\u00020%2\u0006\u0010\u001E\u001A\u00020&2\u0006\u0010(\u001A\u00020\'H\u0016\u00A2\u0006\u0004\b)\u0010*J#\u0010,\u001A\u00020\'*\u00020%2\u0006\u0010\u001E\u001A\u00020&2\u0006\u0010+\u001A\u00020\'H\u0016\u00A2\u0006\u0004\b,\u0010*J#\u0010-\u001A\u00020\'*\u00020%2\u0006\u0010\u001E\u001A\u00020&2\u0006\u0010(\u001A\u00020\'H\u0016\u00A2\u0006\u0004\b-\u0010*J#\u0010.\u001A\u00020\'*\u00020%2\u0006\u0010\u001E\u001A\u00020&2\u0006\u0010+\u001A\u00020\'H\u0016\u00A2\u0006\u0004\b.\u0010*J\u0013\u00100\u001A\u00020\u0014*\u00020/H\u0016\u00A2\u0006\u0004\b0\u00101J\u0013\u00103\u001A\u00020\u0014*\u000202H\u0016\u00A2\u0006\u0004\b3\u00104J*\u0010=\u001A\u00020\u00142\u0006\u00106\u001A\u0002052\u0006\u00108\u001A\u0002072\u0006\u0010:\u001A\u000209H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b;\u0010<J\u000F\u0010>\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b>\u0010\u0016J\u000F\u0010@\u001A\u00020?H\u0016\u00A2\u0006\u0004\b@\u0010AJ\u000F\u0010B\u001A\u00020?H\u0016\u00A2\u0006\u0004\bB\u0010AJ\u001F\u0010F\u001A\u0004\u0018\u00010D*\u00020C2\b\u0010E\u001A\u0004\u0018\u00010DH\u0016\u00A2\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001A\u00020\u00142\u0006\u0010I\u001A\u00020HH\u0016\u00A2\u0006\u0004\bJ\u0010KJ\u001A\u0010O\u001A\u00020\u00142\u0006\u0010L\u001A\u000209H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001A\u00020\u00142\u0006\u0010I\u001A\u00020HH\u0016\u00A2\u0006\u0004\bP\u0010KJ\u0017\u0010S\u001A\u00020\u00142\u0006\u0010R\u001A\u00020QH\u0016\u00A2\u0006\u0004\bS\u0010TJ\u0017\u0010W\u001A\u00020\u00142\u0006\u0010V\u001A\u00020UH\u0016\u00A2\u0006\u0004\bW\u0010XJ\u000F\u0010Z\u001A\u00020YH\u0016\u00A2\u0006\u0004\bZ\u0010[R*\u0010\u0011\u001A\u00020\u00102\u0006\u0010\\\u001A\u00020\u00108\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b]\u0010^\u001A\u0004\b_\u0010`\"\u0004\ba\u0010\u0013R:\u0010k\u001A\u001A\u0012\b\u0012\u0006\u0012\u0002\b\u00030c0bj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030c`d8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\be\u0010f\u001A\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0014\u0010n\u001A\u00020C8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bl\u0010mR\u0014\u0010r\u001A\u00020o8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bp\u0010qR\u001A\u0010L\u001A\u00020s8VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bt\u0010uR\u0014\u0010y\u001A\u00020v8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bw\u0010xR$\u0010}\u001A\u00028\u0000\"\u0004\b\u0000\u0010z*\b\u0012\u0004\u0012\u00028\u00000c8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b{\u0010|R\u0014\u0010~\u001A\u00020?8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b~\u0010A\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u007F"}, d2 = {"Landroidx/compose/ui/node/BackwardsCompatNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/Modifier$Element;", "element", "<init>", "(Landroidx/compose/ui/Modifier$Element;)V", "", "onAttach", "()V", "onDetach", "onMeasureResultChanged", "onDrawCacheReadsChanged$ui_release", "onDrawCacheReadsChanged", "updateModifierLocalConsumer", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "", "sharePointerInputWithSiblings", "()Z", "interceptOutOfBoundsChildEvents", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "size", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "onPlaced", "Landroidx/compose/ui/focus/FocusState;", "focusState", "onFocusEvent", "(Landroidx/compose/ui/focus/FocusState;)V", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "applyFocusProperties", "(Landroidx/compose/ui/focus/FocusProperties;)V", "", "toString", "()Ljava/lang/String;", "value", "n", "Landroidx/compose/ui/Modifier$Element;", "getElement", "()Landroidx/compose/ui/Modifier$Element;", "setElement", "Ljava/util/HashSet;", "Landroidx/compose/ui/modifier/ModifierLocal;", "Lkotlin/collections/HashSet;", "q", "Ljava/util/HashSet;", "getReadValues", "()Ljava/util/HashSet;", "setReadValues", "(Ljava/util/HashSet;)V", "readValues", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "T", "getCurrent", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "current", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,452:1\n42#2,7:453\n42#2,7:466\n42#2,7:556\n42#2,7:563\n84#3:460\n80#3:462\n84#3:473\n78#3:475\n76#3:477\n88#3:479\n90#3:481\n82#3:485\n80#3:487\n88#3:489\n84#3:490\n264#4:461\n264#4:463\n264#4:474\n264#4:476\n264#4:478\n264#4:480\n264#4:482\n264#4:486\n264#4:488\n264#4:512\n735#5,2:464\n728#5,2:483\n251#6,5:491\n62#6:496\n63#6,8:498\n432#6,6:506\n442#6,2:513\n444#6,8:518\n452#6,9:529\n461#6,8:541\n72#6,7:549\n1#7:497\n245#8,3:515\n248#8,3:538\n1208#9:526\n1187#9,2:527\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n*L\n115#1:453,7\n136#1:466,7\n416#1:556,7\n424#1:563,7\n117#1:460\n127#1:462\n138#1:473\n146#1:475\n154#1:477\n170#1:479\n195#1:481\n208#1:485\n213#1:487\n223#1:489\n259#1:490\n117#1:461\n127#1:463\n138#1:474\n146#1:476\n154#1:478\n170#1:480\n195#1:482\n208#1:486\n213#1:488\n259#1:512\n131#1:464,2\n206#1:483,2\n259#1:491,5\n259#1:496\n259#1:498,8\n259#1:506,6\n259#1:513,2\n259#1:518,8\n259#1:529,9\n259#1:541,8\n259#1:549,7\n259#1:497\n259#1:515,3\n259#1:538,3\n259#1:526\n259#1:527,2\n*E\n"})
public final class BackwardsCompatNode extends Node implements BuildDrawCacheParams, FocusEventModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode, ModifierLocalModifierNode, ModifierLocalReadScope, DrawModifierNode, GlobalPositionAwareModifierNode, LayoutAwareModifierNode, LayoutModifierNode, OwnerScope, ParentDataModifierNode, PointerInputModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    public Element n;
    public boolean o;
    public BackwardsCompatLocalMap p;
    public HashSet q;
    public LayoutCoordinates r;

    public BackwardsCompatNode(@NotNull Element modifier$Element0) {
        this.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(modifier$Element0));
        this.n = modifier$Element0;
        this.o = true;
        this.q = new HashSet();
    }

    @Override  // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(@NotNull FocusProperties focusProperties0) {
        Element modifier$Element0 = this.n;
        if(!(modifier$Element0 instanceof FocusOrderModifier)) {
            InlineClassHelperKt.throwIllegalStateException("applyFocusProperties called on wrong node");
        }
        ((FocusOrderModifier)modifier$Element0).populateFocusOrder(new FocusOrder(focusProperties0));
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Element modifier$Element0 = this.n;
        Intrinsics.checkNotNull(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        SemanticsConfiguration semanticsConfiguration0 = ((SemanticsModifier)modifier$Element0).getSemanticsConfiguration();
        Intrinsics.checkNotNull(semanticsPropertyReceiver0, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((SemanticsConfiguration)semanticsPropertyReceiver0).collapsePeer$ui_release(semanticsConfiguration0);
    }

    public final void b(boolean z) {
        if(!this.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("initializeModifier called on unattached node");
        }
        Element modifier$Element0 = this.n;
        if((0x20 & this.getKindSet$ui_release()) != 0) {
            if(modifier$Element0 instanceof ModifierLocalConsumer) {
                this.sideEffect(new b(this, 22));
            }
            if(modifier$Element0 instanceof ModifierLocalProvider) {
                BackwardsCompatLocalMap backwardsCompatLocalMap0 = this.p;
                if(backwardsCompatLocalMap0 == null || !backwardsCompatLocalMap0.contains$ui_release(((ModifierLocalProvider)modifier$Element0).getKey())) {
                    this.p = new BackwardsCompatLocalMap(((ModifierLocalProvider)modifier$Element0));
                    if(BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                        DelegatableNodeKt.requireOwner(this).getModifierLocalManager().insertedProvider(this, ((ModifierLocalProvider)modifier$Element0).getKey());
                    }
                }
                else {
                    backwardsCompatLocalMap0.setElement(((ModifierLocalProvider)modifier$Element0));
                    DelegatableNodeKt.requireOwner(this).getModifierLocalManager().updatedProvider(this, ((ModifierLocalProvider)modifier$Element0).getKey());
                }
            }
        }
        if((4 & this.getKindSet$ui_release()) != 0) {
            if(modifier$Element0 instanceof DrawCacheModifier) {
                this.o = true;
            }
            if(!z) {
                LayoutModifierNodeKt.invalidateLayer(this);
            }
        }
        if((2 & this.getKindSet$ui_release()) != 0) {
            if(BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                NodeCoordinator nodeCoordinator0 = this.getCoordinator$ui_release();
                Intrinsics.checkNotNull(nodeCoordinator0);
                ((LayoutModifierNodeCoordinator)nodeCoordinator0).setLayoutModifierNode$ui_release(this);
                nodeCoordinator0.onLayoutModifierNodeChanged();
            }
            if(!z) {
                LayoutModifierNodeKt.invalidateLayer(this);
                DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
            }
        }
        if(modifier$Element0 instanceof RemeasurementModifier) {
            ((RemeasurementModifier)modifier$Element0).onRemeasurementAvailable(DelegatableNodeKt.requireLayoutNode(this));
        }
        if((0x80 & this.getKindSet$ui_release()) != 0) {
            if(modifier$Element0 instanceof OnRemeasuredModifier && BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
            }
            if(modifier$Element0 instanceof OnPlacedModifier) {
                this.r = null;
                if(BackwardsCompatNodeKt.access$isChainUpdate(this)) {
                    DelegatableNodeKt.requireOwner(this).registerOnLayoutCompletedListener(new BackwardsCompatNode.initializeModifier.3(this));
                }
            }
        }
        if((0x100 & this.getKindSet$ui_release()) != 0 && modifier$Element0 instanceof OnGloballyPositionedModifier && BackwardsCompatNodeKt.access$isChainUpdate(this)) {
            DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
        }
        if(modifier$Element0 instanceof FocusRequesterModifier) {
            ((FocusRequesterModifier)modifier$Element0).getFocusRequester().getFocusRequesterNodes$ui_release().add(this);
        }
        if((16 & this.getKindSet$ui_release()) != 0 && modifier$Element0 instanceof PointerInputModifier) {
            ((PointerInputModifier)modifier$Element0).getPointerInputFilter().setLayoutCoordinates$ui_release(this.getCoordinator$ui_release());
        }
        if((8 & this.getKindSet$ui_release()) != 0) {
            DelegatableNodeKt.requireOwner(this).onSemanticsChange();
        }
    }

    public final void c() {
        if(!this.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("unInitializeModifier called on unattached node");
        }
        Element modifier$Element0 = this.n;
        if((0x20 & this.getKindSet$ui_release()) != 0) {
            if(modifier$Element0 instanceof ModifierLocalProvider) {
                DelegatableNodeKt.requireOwner(this).getModifierLocalManager().removedProvider(this, ((ModifierLocalProvider)modifier$Element0).getKey());
            }
            if(modifier$Element0 instanceof ModifierLocalConsumer) {
                ((ModifierLocalConsumer)modifier$Element0).onModifierLocalsUpdated(BackwardsCompatNodeKt.access$getDetachedModifierLocalReadScope$p());
            }
        }
        if((8 & this.getKindSet$ui_release()) != 0) {
            DelegatableNodeKt.requireOwner(this).onSemanticsChange();
        }
        if(modifier$Element0 instanceof FocusRequesterModifier) {
            ((FocusRequesterModifier)modifier$Element0).getFocusRequester().getFocusRequesterNodes$ui_release().remove(this);
        }
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope0) {
        Element modifier$Element0 = this.n;
        Intrinsics.checkNotNull(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        if(this.o && modifier$Element0 instanceof DrawCacheModifier) {
            Element modifier$Element1 = this.n;
            if(modifier$Element1 instanceof DrawCacheModifier) {
                DelegatableNodeKt.requireOwner(this).getSnapshotObserver().observeReads$ui_release(this, BackwardsCompatNodeKt.access$getOnDrawCacheReadsChanged$p(), new b2.b(modifier$Element1, this));
            }
            this.o = false;
        }
        ((DrawModifier)modifier$Element0).draw(contentDrawScope0);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public Object getCurrent(@NotNull ModifierLocal modifierLocal0) {
        this.q.add(modifierLocal0);
        if(!this.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        Node modifier$Node0 = this.getNode().getParent$ui_release();
        LayoutNode layoutNode0 = DelegatableNodeKt.requireLayoutNode(this);
        while(layoutNode0 != null) {
            if((q.e(layoutNode0) & 0x20) != 0) {
                while(modifier$Node0 != null) {
                    if((modifier$Node0.getKindSet$ui_release() & 0x20) != 0) {
                        Node modifier$Node1 = modifier$Node0;
                        MutableVector mutableVector0 = null;
                        while(modifier$Node1 != null) {
                            if(modifier$Node1 instanceof ModifierLocalModifierNode) {
                                if(((ModifierLocalModifierNode)modifier$Node1).getProvidedValues().contains$ui_release(modifierLocal0)) {
                                    return ((ModifierLocalModifierNode)modifier$Node1).getProvidedValues().get$ui_release(modifierLocal0);
                                }
                            }
                            else if((modifier$Node1.getKindSet$ui_release() & 0x20) != 0 && modifier$Node1 instanceof DelegatingNode) {
                                Node modifier$Node2 = ((DelegatingNode)modifier$Node1).getDelegate$ui_release();
                                int v = 0;
                                while(modifier$Node2 != null) {
                                    if((modifier$Node2.getKindSet$ui_release() & 0x20) != 0) {
                                        ++v;
                                        if(v == 1) {
                                            modifier$Node1 = modifier$Node2;
                                        }
                                        else {
                                            if(mutableVector0 == null) {
                                                mutableVector0 = new MutableVector(new Node[16], 0);
                                            }
                                            if(modifier$Node1 != null) {
                                                mutableVector0.add(modifier$Node1);
                                                modifier$Node1 = null;
                                            }
                                            mutableVector0.add(modifier$Node2);
                                        }
                                    }
                                    modifier$Node2 = modifier$Node2.getChild$ui_release();
                                }
                                if(v != 1) {
                                    goto label_32;
                                }
                                continue;
                            }
                        label_32:
                            modifier$Node1 = DelegatableNodeKt.access$pop(mutableVector0);
                        }
                    }
                    modifier$Node0 = modifier$Node0.getParent$ui_release();
                }
            }
            layoutNode0 = layoutNode0.getParent$ui_release();
            if(layoutNode0 != null) {
                NodeChain nodeChain0 = layoutNode0.getNodes$ui_release();
                if(nodeChain0 != null) {
                    modifier$Node0 = nodeChain0.getTail$ui_release();
                    continue;
                }
            }
            modifier$Node0 = null;
        }
        return modifierLocal0.getDefaultFactory$ui_release().invoke();
    }

    @Override  // androidx.compose.ui.draw.BuildDrawCacheParams
    @NotNull
    public Density getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity();
    }

    @NotNull
    public final Element getElement() {
        return this.n;
    }

    @Override  // androidx.compose.ui.draw.BuildDrawCacheParams
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.requireLayoutNode(this).getLayoutDirection();
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalModifierNode
    @NotNull
    public ModifierLocalMap getProvidedValues() {
        return this.p == null ? ModifierLocalModifierNodeKt.modifierLocalMapOf() : this.p;
    }

    @NotNull
    public final HashSet getReadValues() {
        return this.q;
    }

    @Override  // androidx.compose.ui.draw.BuildDrawCacheParams
    public long getSize-NH-jbRc() {
        return IntSizeKt.toSize-ozmzZPI(DelegatableNodeKt.requireCoordinator-64DMado(this, 0x80).getSize-YbymL2g());
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public boolean interceptOutOfBoundsChildEvents() {
        Element modifier$Element0 = this.n;
        Intrinsics.checkNotNull(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier)modifier$Element0).getPointerInputFilter().getInterceptOutOfBoundsChildEvents();
    }

    @Override  // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.isAttached();
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        Element modifier$Element0 = this.n;
        Intrinsics.checkNotNull(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier)modifier$Element0).maxIntrinsicHeight(intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        Element modifier$Element0 = this.n;
        Intrinsics.checkNotNull(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier)modifier$Element0).maxIntrinsicWidth(intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull Measurable measurable0, long v) {
        Element modifier$Element0 = this.n;
        Intrinsics.checkNotNull(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier)modifier$Element0).measure-3p2s80s(measureScope0, measurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        Element modifier$Element0 = this.n;
        Intrinsics.checkNotNull(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier)modifier$Element0).minIntrinsicHeight(intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        Element modifier$Element0 = this.n;
        Intrinsics.checkNotNull(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier)modifier$Element0).minIntrinsicWidth(intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.node.ParentDataModifierNode
    @Nullable
    public Object modifyParentData(@NotNull Density density0, @Nullable Object object0) {
        Element modifier$Element0 = this.n;
        Intrinsics.checkNotNull(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((ParentDataModifier)modifier$Element0).modifyParentData(density0, object0);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onAttach() {
        this.b(true);
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        Element modifier$Element0 = this.n;
        Intrinsics.checkNotNull(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier)modifier$Element0).getPointerInputFilter().onCancel();
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onDetach() {
        this.c();
    }

    public final void onDrawCacheReadsChanged$ui_release() {
        this.o = true;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override  // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(@NotNull FocusState focusState0) {
        Element modifier$Element0 = this.n;
        if(!(modifier$Element0 instanceof FocusEventModifier)) {
            InlineClassHelperKt.throwIllegalStateException("onFocusEvent called on wrong node");
        }
        ((FocusEventModifier)modifier$Element0).onFocusEvent(focusState0);
    }

    @Override  // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates layoutCoordinates0) {
        Element modifier$Element0 = this.n;
        Intrinsics.checkNotNull(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((OnGloballyPositionedModifier)modifier$Element0).onGloballyPositioned(layoutCoordinates0);
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public void onMeasureResultChanged() {
        this.o = true;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override  // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(@NotNull LayoutCoordinates layoutCoordinates0) {
        this.r = layoutCoordinates0;
        Element modifier$Element0 = this.n;
        if(modifier$Element0 instanceof OnPlacedModifier) {
            ((OnPlacedModifier)modifier$Element0).onPlaced(layoutCoordinates0);
        }
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public void onPointerEvent-H0pRuoY(@NotNull PointerEvent pointerEvent0, @NotNull PointerEventPass pointerEventPass0, long v) {
        Element modifier$Element0 = this.n;
        Intrinsics.checkNotNull(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier)modifier$Element0).getPointerInputFilter().onPointerEvent-H0pRuoY(pointerEvent0, pointerEventPass0, v);
    }

    @Override  // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onRemeasured-ozmzZPI(long v) {
        Element modifier$Element0 = this.n;
        if(modifier$Element0 instanceof OnRemeasuredModifier) {
            ((OnRemeasuredModifier)modifier$Element0).onRemeasured-ozmzZPI(v);
        }
    }

    public final void setElement(@NotNull Element modifier$Element0) {
        if(this.isAttached()) {
            this.c();
        }
        this.n = modifier$Element0;
        this.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(modifier$Element0));
        if(this.isAttached()) {
            this.b(false);
        }
    }

    public final void setReadValues(@NotNull HashSet hashSet0) {
        this.q = hashSet0;
    }

    @Override  // androidx.compose.ui.node.PointerInputModifierNode
    public boolean sharePointerInputWithSiblings() {
        Element modifier$Element0 = this.n;
        Intrinsics.checkNotNull(modifier$Element0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier)modifier$Element0).getPointerInputFilter().getShareWithSiblings();
    }

    @Override
    @NotNull
    public String toString() {
        return this.n.toString();
    }

    public final void updateModifierLocalConsumer() {
        if(this.isAttached()) {
            this.q.clear();
            DelegatableNodeKt.requireOwner(this).getSnapshotObserver().observeReads$ui_release(this, BackwardsCompatNodeKt.c, new c(this));
        }
    }
}

