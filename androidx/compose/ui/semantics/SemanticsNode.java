package androidx.compose.ui.semantics;

import androidx.compose.material3.m;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import fg.c;
import g2.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\f\u00A2\u0006\u0004\b\u000F\u0010\u0010J)\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00000\u00132\b\b\u0002\u0010\u0011\u001A\u00020\u00042\b\b\u0002\u0010\u0012\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00000\u00132\b\b\u0002\u0010\u0017\u001A\u00020\u00042\b\b\u0002\u0010\u0011\u001A\u00020\u00042\b\b\u0002\u0010\u0012\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001E\u001A\u0004\u0018\u00010\u001BH\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010!\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b\u001F\u0010 R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)R\u001A\u0010\u0007\u001A\u00020\u00068\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R\u001A\u0010\t\u001A\u00020\b8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u00101R\"\u00106\u001A\u00020\u00048\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b2\u0010\'\u001A\u0004\b3\u0010)\"\u0004\b4\u00105R\u0017\u0010;\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010:R\u0014\u0010=\u001A\u00020\u00048@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b<\u0010)R\u0011\u0010A\u001A\u00020>8F\u00A2\u0006\u0006\u001A\u0004\b?\u0010@R\u0013\u0010E\u001A\u0004\u0018\u00010B8F\u00A2\u0006\u0006\u001A\u0004\bC\u0010DR\u0011\u0010I\u001A\u00020F8F\u00A2\u0006\u0006\u001A\u0004\bG\u0010HR\u0017\u0010M\u001A\u00020J8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bK\u0010LR\u0011\u0010O\u001A\u00020F8F\u00A2\u0006\u0006\u001A\u0004\bN\u0010HR\u0017\u0010R\u001A\u00020P8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bQ\u0010LR\u0011\u0010T\u001A\u00020F8F\u00A2\u0006\u0006\u001A\u0004\bS\u0010HR\u0017\u0010V\u001A\u00020P8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bU\u0010LR\u0017\u0010X\u001A\u00020P8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bW\u0010LR\u0014\u0010Z\u001A\u00020F8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bY\u0010HR\u0014\u0010\\\u001A\u00020\u00048@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b[\u0010)R\u0011\u0010^\u001A\u00020\b8F\u00A2\u0006\u0006\u001A\u0004\b]\u00101R\u0017\u0010`\u001A\b\u0012\u0004\u0012\u00020\u00000\u00138F\u00A2\u0006\u0006\u001A\u0004\b\u001A\u0010_R\u001A\u0010b\u001A\b\u0012\u0004\u0012\u00020\u00000\u00138@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\ba\u0010_R\u0011\u0010c\u001A\u00020\u00048F\u00A2\u0006\u0006\u001A\u0004\bc\u0010)R\u0013\u0010e\u001A\u0004\u0018\u00010\u00008F\u00A2\u0006\u0006\u001A\u0004\bd\u0010 \u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006f"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "Landroidx/compose/ui/Modifier$Node;", "outerSemanticsNode", "", "mergingEnabled", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "unmergedConfig", "<init>", "(Landroidx/compose/ui/Modifier$Node;ZLandroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "getAlignmentLinePosition", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "includeFakeNodes", "includeDeactivatedNodes", "", "unmergedChildren$ui_release", "(ZZ)Ljava/util/List;", "unmergedChildren", "includeReplacedSemantics", "getChildren$ui_release", "(ZZZ)Ljava/util/List;", "getChildren", "Landroidx/compose/ui/node/NodeCoordinator;", "findCoordinatorToGetBounds$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "findCoordinatorToGetBounds", "copyWithMergingEnabled$ui_release", "()Landroidx/compose/ui/semantics/SemanticsNode;", "copyWithMergingEnabled", "a", "Landroidx/compose/ui/Modifier$Node;", "getOuterSemanticsNode$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "b", "Z", "getMergingEnabled", "()Z", "c", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "d", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig$ui_release", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "e", "isFake$ui_release", "setFake$ui_release", "(Z)V", "isFake", "g", "I", "getId", "()I", "id", "isUnmergedLeafNode$ui_release", "isUnmergedLeafNode", "Landroidx/compose/ui/layout/LayoutInfo;", "getLayoutInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "layoutInfo", "Landroidx/compose/ui/node/RootForTest;", "getRoot", "()Landroidx/compose/ui/node/RootForTest;", "root", "Landroidx/compose/ui/geometry/Rect;", "getTouchBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "getBoundsInRoot", "boundsInRoot", "Landroidx/compose/ui/geometry/Offset;", "getPositionInRoot-F1C5BW0", "positionInRoot", "getBoundsInWindow", "boundsInWindow", "getPositionInWindow-F1C5BW0", "positionInWindow", "getPositionOnScreen-F1C5BW0", "positionOnScreen", "getBoundsInParent$ui_release", "boundsInParent", "isTransparent$ui_release", "isTransparent", "getConfig", "config", "()Ljava/util/List;", "children", "getReplacedChildren$ui_release", "replacedChildren", "isRoot", "getParent", "parent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,486:1\n1#2:487\n80#3:488\n80#3:502\n80#3:513\n33#4,6:489\n33#4,6:507\n460#5,7:495\n467#5,4:503\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n*L\n193#1:488\n277#1:502\n392#1:513\n235#1:489,6\n371#1:507,6\n272#1:495,7\n272#1:503,4\n*E\n"})
public final class SemanticsNode {
    public static final int $stable = 8;
    public final Node a;
    public final boolean b;
    public final LayoutNode c;
    public final SemanticsConfiguration d;
    public boolean e;
    public SemanticsNode f;
    public final int g;

    public SemanticsNode(@NotNull Node modifier$Node0, boolean z, @NotNull LayoutNode layoutNode0, @NotNull SemanticsConfiguration semanticsConfiguration0) {
        this.a = modifier$Node0;
        this.b = z;
        this.c = layoutNode0;
        this.d = semanticsConfiguration0;
        this.g = layoutNode0.getSemanticsId();
    }

    public final SemanticsNode a(Role role0, Function1 function10) {
        SemanticsConfiguration semanticsConfiguration0 = new SemanticsConfiguration();
        semanticsConfiguration0.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration0.setClearingSemantics(false);
        function10.invoke(semanticsConfiguration0);
        SemanticsNode semanticsNode0 = new SemanticsNode(new SemanticsNode.fakeSemanticsNode.fakeNode.1(function10), false, new LayoutNode(true, (role0 == null ? SemanticsNodeKt.access$contentDescriptionFakeNodeId(this) : SemanticsNodeKt.access$roleFakeNodeId(this))), semanticsConfiguration0);
        semanticsNode0.e = true;
        semanticsNode0.f = this;
        return semanticsNode0;
    }

    public final void b(LayoutNode layoutNode0, ArrayList arrayList0, boolean z) {
        MutableVector mutableVector0 = layoutNode0.getZSortedChildren();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode1 = (LayoutNode)arr_object[v1];
                if(layoutNode1.isAttached() && (z || !layoutNode1.isDeactivated())) {
                    if(layoutNode1.getNodes$ui_release().has-H91voCI$ui_release(8)) {
                        arrayList0.add(SemanticsNodeKt.SemanticsNode(layoutNode1, this.b));
                    }
                    else {
                        this.b(layoutNode1, arrayList0, z);
                    }
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final void c(List list0) {
        List list1 = SemanticsNode.unmergedChildren$ui_release$default(this, false, false, 3, null);
        int v1 = list1.size();
        for(int v = 0; v < v1; ++v) {
            SemanticsNode semanticsNode0 = (SemanticsNode)list1.get(v);
            if(semanticsNode0.d()) {
                list0.add(semanticsNode0);
            }
            else if(!semanticsNode0.d.isClearingSemantics()) {
                semanticsNode0.c(list0);
            }
        }
    }

    @NotNull
    public final SemanticsNode copyWithMergingEnabled$ui_release() {
        return new SemanticsNode(this.a, true, this.c, this.d);
    }

    // 去混淆评级： 低(20)
    public final boolean d() {
        return this.b && this.d.isMergingSemanticsOfDescendants();
    }

    public final void e(SemanticsConfiguration semanticsConfiguration0) {
        if(!this.d.isClearingSemantics()) {
            List list0 = SemanticsNode.unmergedChildren$ui_release$default(this, false, false, 3, null);
            int v1 = list0.size();
            for(int v = 0; v < v1; ++v) {
                SemanticsNode semanticsNode0 = (SemanticsNode)list0.get(v);
                if(!semanticsNode0.d()) {
                    semanticsConfiguration0.mergeChild$ui_release(semanticsNode0.d);
                    semanticsNode0.e(semanticsConfiguration0);
                }
            }
        }
    }

    @Nullable
    public final NodeCoordinator findCoordinatorToGetBounds$ui_release() {
        if(this.e) {
            SemanticsNode semanticsNode0 = this.getParent();
            return semanticsNode0 == null ? null : semanticsNode0.findCoordinatorToGetBounds$ui_release();
        }
        SemanticsModifierNode semanticsModifierNode0 = SemanticsNodeKt.getOuterMergingSemantics(this.c);
        if(semanticsModifierNode0 == null) {
            semanticsModifierNode0 = this.a;
        }
        return DelegatableNodeKt.requireCoordinator-64DMado(semanticsModifierNode0, 8);
    }

    public final int getAlignmentLinePosition(@NotNull AlignmentLine alignmentLine0) {
        NodeCoordinator nodeCoordinator0 = this.findCoordinatorToGetBounds$ui_release();
        return nodeCoordinator0 == null ? 0x80000000 : nodeCoordinator0.get(alignmentLine0);
    }

    @NotNull
    public final Rect getBoundsInParent$ui_release() {
        SemanticsNode semanticsNode0 = this.getParent();
        if(semanticsNode0 == null) {
            return Rect.Companion.getZero();
        }
        NodeCoordinator nodeCoordinator0 = this.findCoordinatorToGetBounds$ui_release();
        if(nodeCoordinator0 != null) {
            if(!nodeCoordinator0.isAttached()) {
                nodeCoordinator0 = null;
            }
            return nodeCoordinator0 == null ? Rect.Companion.getZero() : LayoutCoordinates.localBoundingBoxOf$default(DelegatableNodeKt.requireCoordinator-64DMado(semanticsNode0.a, 8), nodeCoordinator0, false, 2, null);
        }
        return Rect.Companion.getZero();
    }

    @NotNull
    public final Rect getBoundsInRoot() {
        NodeCoordinator nodeCoordinator0 = this.findCoordinatorToGetBounds$ui_release();
        if(nodeCoordinator0 != null) {
            if(!nodeCoordinator0.isAttached()) {
                nodeCoordinator0 = null;
            }
            if(nodeCoordinator0 != null) {
                Rect rect0 = LayoutCoordinatesKt.boundsInRoot(nodeCoordinator0);
                return rect0 == null ? Rect.Companion.getZero() : rect0;
            }
        }
        return Rect.Companion.getZero();
    }

    @NotNull
    public final Rect getBoundsInWindow() {
        NodeCoordinator nodeCoordinator0 = this.findCoordinatorToGetBounds$ui_release();
        if(nodeCoordinator0 != null) {
            if(!nodeCoordinator0.isAttached()) {
                nodeCoordinator0 = null;
            }
            if(nodeCoordinator0 != null) {
                Rect rect0 = LayoutCoordinatesKt.boundsInWindow(nodeCoordinator0);
                return rect0 == null ? Rect.Companion.getZero() : rect0;
            }
        }
        return Rect.Companion.getZero();
    }

    @NotNull
    public final List getChildren() {
        return SemanticsNode.getChildren$ui_release$default(this, false, false, false, 7, null);
    }

    @NotNull
    public final List getChildren$ui_release(boolean z, boolean z1, boolean z2) {
        if(!z && this.d.isClearingSemantics()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(this.d()) {
            List list0 = new ArrayList();
            this.c(list0);
            return list0;
        }
        return this.unmergedChildren$ui_release(z1, z2);
    }

    public static List getChildren$ui_release$default(SemanticsNode semanticsNode0, boolean z, boolean z1, boolean z2, int v, Object object0) {
        if((v & 1) != 0) {
            z = !semanticsNode0.b;
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        if((v & 4) != 0) {
            z2 = false;
        }
        return semanticsNode0.getChildren$ui_release(z, z1, z2);
    }

    @NotNull
    public final SemanticsConfiguration getConfig() {
        SemanticsConfiguration semanticsConfiguration0 = this.d;
        if(this.d()) {
            SemanticsConfiguration semanticsConfiguration1 = semanticsConfiguration0.copy();
            this.e(semanticsConfiguration1);
            return semanticsConfiguration1;
        }
        return semanticsConfiguration0;
    }

    public final int getId() {
        return this.g;
    }

    @NotNull
    public final LayoutInfo getLayoutInfo() {
        return this.c;
    }

    @NotNull
    public final LayoutNode getLayoutNode$ui_release() {
        return this.c;
    }

    public final boolean getMergingEnabled() {
        return this.b;
    }

    @NotNull
    public final Node getOuterSemanticsNode$ui_release() {
        return this.a;
    }

    @Nullable
    public final SemanticsNode getParent() {
        SemanticsNode semanticsNode0 = this.f;
        if(semanticsNode0 != null) {
            return semanticsNode0;
        }
        LayoutNode layoutNode0 = this.c;
        boolean z = this.b;
        LayoutNode layoutNode1 = z ? SemanticsNodeKt.findClosestParentNode(layoutNode0, b.y) : null;
        if(layoutNode1 == null) {
            layoutNode1 = SemanticsNodeKt.findClosestParentNode(layoutNode0, b.z);
        }
        return layoutNode1 == null ? null : SemanticsNodeKt.SemanticsNode(layoutNode1, z);
    }

    public final long getPositionInRoot-F1C5BW0() {
        NodeCoordinator nodeCoordinator0 = this.findCoordinatorToGetBounds$ui_release();
        if(nodeCoordinator0 != null) {
            if(!nodeCoordinator0.isAttached()) {
                nodeCoordinator0 = null;
            }
            return nodeCoordinator0 == null ? 0L : LayoutCoordinatesKt.positionInRoot(nodeCoordinator0);
        }
        return 0L;
    }

    public final long getPositionInWindow-F1C5BW0() {
        NodeCoordinator nodeCoordinator0 = this.findCoordinatorToGetBounds$ui_release();
        if(nodeCoordinator0 != null) {
            if(!nodeCoordinator0.isAttached()) {
                nodeCoordinator0 = null;
            }
            return nodeCoordinator0 == null ? 0L : LayoutCoordinatesKt.positionInWindow(nodeCoordinator0);
        }
        return 0L;
    }

    public final long getPositionOnScreen-F1C5BW0() {
        NodeCoordinator nodeCoordinator0 = this.findCoordinatorToGetBounds$ui_release();
        if(nodeCoordinator0 != null) {
            if(!nodeCoordinator0.isAttached()) {
                nodeCoordinator0 = null;
            }
            return nodeCoordinator0 == null ? 0L : LayoutCoordinatesKt.positionOnScreen(nodeCoordinator0);
        }
        return 0L;
    }

    @NotNull
    public final List getReplacedChildren$ui_release() {
        return SemanticsNode.getChildren$ui_release$default(this, false, true, false, 4, null);
    }

    @Nullable
    public final RootForTest getRoot() {
        Owner owner0 = this.c.getOwner$ui_release();
        return owner0 == null ? null : owner0.getRootForTest();
    }

    public final long getSize-YbymL2g() {
        NodeCoordinator nodeCoordinator0 = this.findCoordinatorToGetBounds$ui_release();
        return nodeCoordinator0 == null ? 0L : nodeCoordinator0.getSize-YbymL2g();
    }

    @NotNull
    public final Rect getTouchBoundsInRoot() {
        SemanticsConfiguration semanticsConfiguration0 = this.d;
        Node modifier$Node0 = this.a;
        if(semanticsConfiguration0.isMergingSemanticsOfDescendants()) {
            SemanticsModifierNode semanticsModifierNode0 = SemanticsNodeKt.getOuterMergingSemantics(this.c);
            if(semanticsModifierNode0 != null) {
                modifier$Node0 = semanticsModifierNode0;
            }
        }
        return SemanticsModifierNodeKt.touchBoundsInRoot(modifier$Node0.getNode(), SemanticsModifierNodeKt.getUseMinimumTouchTarget(semanticsConfiguration0));
    }

    @NotNull
    public final SemanticsConfiguration getUnmergedConfig$ui_release() {
        return this.d;
    }

    public final boolean isFake$ui_release() {
        return this.e;
    }

    public final boolean isRoot() {
        return this.getParent() == null;
    }

    public final boolean isTransparent$ui_release() {
        NodeCoordinator nodeCoordinator0 = this.findCoordinatorToGetBounds$ui_release();
        return nodeCoordinator0 == null ? false : nodeCoordinator0.isTransparent();
    }

    // 去混淆评级： 低(20)
    public final boolean isUnmergedLeafNode$ui_release() {
        return !this.e && this.getReplacedChildren$ui_release().isEmpty() && SemanticsNodeKt.findClosestParentNode(this.c, b.x) == null;
    }

    public final void setFake$ui_release(boolean z) {
        this.e = z;
    }

    @NotNull
    public final List unmergedChildren$ui_release(boolean z, boolean z1) {
        if(this.e) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList();
        this.b(this.c, ((ArrayList)list0), z1);
        if(z) {
            Role role0 = SemanticsNodeKt.access$getRole(this);
            SemanticsConfiguration semanticsConfiguration0 = this.d;
            if(role0 != null && semanticsConfiguration0.isMergingSemanticsOfDescendants() && !((ArrayList)list0).isEmpty()) {
                ((ArrayList)list0).add(this.a(role0, new c(role0, 1)));
            }
            SemanticsProperties semanticsProperties0 = SemanticsProperties.INSTANCE;
            if(semanticsConfiguration0.contains(semanticsProperties0.getContentDescription()) && !((ArrayList)list0).isEmpty() && semanticsConfiguration0.isMergingSemanticsOfDescendants()) {
                List list1 = (List)SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, semanticsProperties0.getContentDescription());
                String s = list1 == null ? null : ((String)CollectionsKt___CollectionsKt.firstOrNull(list1));
                if(s != null) {
                    ((ArrayList)list0).add(0, this.a(null, new m(s, 11)));
                }
            }
        }
        return list0;
    }

    public static List unmergedChildren$ui_release$default(SemanticsNode semanticsNode0, boolean z, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        return semanticsNode0.unmergedChildren$ui_release(z, z1);
    }
}

