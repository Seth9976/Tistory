package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Region.Op;
import android.graphics.Region;
import android.view.View;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001A\u00020\u0000H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001A#\u0010\f\u001A\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000B\u001A\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001A\u0018\u0010\u0012\u001A\u0004\u0018\u00010\u000F*\u00020\u000EH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001A\u0013\u0010\u0015\u001A\u00020\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001A\u001D\u0010\u0019\u001A\u0004\u0018\u00010\u0018*\u00020\u00172\u0006\u0010\u000B\u001A\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001A\u001A\u001B\u0010\u001D\u001A\u00020\u0014*\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u001BH\u0000¢\u0006\u0004\b\u001D\u0010\u001E\u001A\u0019\u0010\"\u001A\b\u0012\u0004\u0012\u00020!0 *\u00020\u001FH\u0000¢\u0006\u0004\b\"\u0010#\"\u001A\u0010)\u001A\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "configuration", "Landroidx/compose/ui/text/TextLayoutResult;", "getTextLayoutResult", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Landroidx/compose/ui/text/TextLayoutResult;", "", "getScrollViewportLength", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Ljava/lang/Float;", "", "Landroidx/compose/ui/platform/ScrollObservationScope;", "", "id", "findById", "(Ljava/util/List;I)Landroidx/compose/ui/platform/ScrollObservationScope;", "Landroidx/compose/ui/semantics/Role;", "", "toLegacyClassName-V4PA4sw", "(I)Ljava/lang/String;", "toLegacyClassName", "Landroidx/compose/ui/semantics/SemanticsNode;", "", "isImportantForAccessibility", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/View;", "semanticsIdToView", "(Landroidx/compose/ui/platform/AndroidViewsHandler;I)Landroid/view/View;", "Landroidx/compose/ui/node/LayoutNode;", "node", "isAncestorOf", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)Z", "Landroidx/compose/ui/semantics/SemanticsOwner;", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "getAllUncoveredSemanticsNodesToIntObjectMap", "(Landroidx/compose/ui/semantics/SemanticsOwner;)Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/geometry/Rect;", "a", "Landroidx/compose/ui/geometry/Rect;", "getDefaultFakeNodeBounds", "()Landroidx/compose/ui/geometry/Rect;", "DefaultFakeNodeBounds", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSemanticsUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsUtils.android.kt\nandroidx/compose/ui/platform/SemanticsUtils_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,234:1\n288#2,2:235\n26#3:237\n26#3:238\n26#3:239\n26#3:240\n26#3:241\n26#3:242\n26#3:243\n26#3:244\n26#3:245\n26#3:246\n26#3:247\n26#3:248\n*S KotlinDebug\n*F\n+ 1 SemanticsUtils.android.kt\nandroidx/compose/ui/platform/SemanticsUtils_androidKt\n*L\n137#1:235,2\n162#1:237\n163#1:238\n164#1:239\n165#1:240\n178#1:241\n179#1:242\n180#1:243\n181#1:244\n215#1:245\n216#1:246\n217#1:247\n218#1:248\n*E\n"})
public final class SemanticsUtils_androidKt {
    public static final Rect a;

    static {
        SemanticsUtils_androidKt.a = new Rect(0.0f, 0.0f, 10.0f, 10.0f);
    }

    public static final void a(Region region0, SemanticsNode semanticsNode0, MutableIntObjectMap mutableIntObjectMap0, SemanticsNode semanticsNode1, Region region1) {
        Rect rect1;
        if(region0.isEmpty() && semanticsNode1.getId() != semanticsNode0.getId() || (!semanticsNode1.getLayoutNode$ui_release().isPlaced() || !semanticsNode1.getLayoutNode$ui_release().isAttached()) && !semanticsNode1.isFake$ui_release()) {
            return;
        }
        Rect rect0 = semanticsNode1.getTouchBoundsInRoot();
        int v = Math.round(rect0.getLeft());
        int v1 = Math.round(rect0.getTop());
        int v2 = Math.round(rect0.getRight());
        int v3 = Math.round(rect0.getBottom());
        region1.set(v, v1, v2, v3);
        int v4 = semanticsNode1.getId() == semanticsNode0.getId() ? -1 : semanticsNode1.getId();
        if(region1.op(region0, Region.Op.INTERSECT)) {
            mutableIntObjectMap0.set(v4, new SemanticsNodeWithAdjustedBounds(semanticsNode1, region1.getBounds()));
            List list0 = semanticsNode1.getReplacedChildren$ui_release();
            for(int v5 = list0.size() - 1; -1 < v5; --v5) {
                SemanticsUtils_androidKt.a(region0, semanticsNode0, mutableIntObjectMap0, ((SemanticsNode)list0.get(v5)), region1);
            }
            if(SemanticsUtils_androidKt.isImportantForAccessibility(semanticsNode1)) {
                region0.op(v, v1, v2, v3, Region.Op.DIFFERENCE);
            }
        }
        else {
            if(semanticsNode1.isFake$ui_release()) {
                SemanticsNode semanticsNode2 = semanticsNode1.getParent();
                if(semanticsNode2 == null) {
                    rect1 = SemanticsUtils_androidKt.a;
                }
                else {
                    LayoutInfo layoutInfo0 = semanticsNode2.getLayoutInfo();
                    rect1 = layoutInfo0 == null || !layoutInfo0.isPlaced() ? SemanticsUtils_androidKt.a : semanticsNode2.getBoundsInRoot();
                }
                mutableIntObjectMap0.set(v4, new SemanticsNodeWithAdjustedBounds(semanticsNode1, new android.graphics.Rect(Math.round(rect1.getLeft()), Math.round(rect1.getTop()), Math.round(rect1.getRight()), Math.round(rect1.getBottom()))));
                return;
            }
            if(v4 == -1) {
                mutableIntObjectMap0.set(-1, new SemanticsNodeWithAdjustedBounds(semanticsNode1, region1.getBounds()));
            }
        }
    }

    @Nullable
    public static final ScrollObservationScope findById(@NotNull List list0, int v) {
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            if(((ScrollObservationScope)list0.get(v2)).getSemanticsNodeId() == v) {
                return (ScrollObservationScope)list0.get(v2);
            }
        }
        return null;
    }

    @NotNull
    public static final IntObjectMap getAllUncoveredSemanticsNodesToIntObjectMap(@NotNull SemanticsOwner semanticsOwner0) {
        SemanticsNode semanticsNode0 = semanticsOwner0.getUnmergedRootSemanticsNode();
        IntObjectMap intObjectMap0 = IntObjectMapKt.mutableIntObjectMapOf();
        if(semanticsNode0.getLayoutNode$ui_release().isPlaced() && semanticsNode0.getLayoutNode$ui_release().isAttached()) {
            Rect rect0 = semanticsNode0.getBoundsInRoot();
            SemanticsUtils_androidKt.a(new Region(Math.round(rect0.getLeft()), Math.round(rect0.getTop()), Math.round(rect0.getRight()), Math.round(rect0.getBottom())), semanticsNode0, ((MutableIntObjectMap)intObjectMap0), semanticsNode0, new Region());
        }
        return intObjectMap0;
    }

    @NotNull
    public static final Rect getDefaultFakeNodeBounds() {
        return SemanticsUtils_androidKt.a;
    }

    @SuppressLint({"PrimitiveInCollection"})
    @Nullable
    public static final Float getScrollViewportLength(@NotNull SemanticsConfiguration semanticsConfiguration0) {
        ArrayList arrayList0 = new ArrayList();
        AccessibilityAction accessibilityAction0 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, SemanticsActions.INSTANCE.getGetScrollViewportLength());
        if(accessibilityAction0 != null) {
            Function1 function10 = (Function1)accessibilityAction0.getAction();
            return function10 == null || !((Boolean)function10.invoke(arrayList0)).booleanValue() ? null : ((Float)arrayList0.get(0));
        }
        return null;
    }

    @Nullable
    public static final TextLayoutResult getTextLayoutResult(@NotNull SemanticsConfiguration semanticsConfiguration0) {
        ArrayList arrayList0 = new ArrayList();
        AccessibilityAction accessibilityAction0 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, SemanticsActions.INSTANCE.getGetTextLayoutResult());
        if(accessibilityAction0 != null) {
            Function1 function10 = (Function1)accessibilityAction0.getAction();
            return function10 == null || !((Boolean)function10.invoke(arrayList0)).booleanValue() ? null : ((TextLayoutResult)arrayList0.get(0));
        }
        return null;
    }

    public static final boolean isAncestorOf(@NotNull LayoutNode layoutNode0, @NotNull LayoutNode layoutNode1) {
        LayoutNode layoutNode2 = layoutNode1.getParent$ui_release();
        return layoutNode2 == null ? false : Intrinsics.areEqual(layoutNode2, layoutNode0) || SemanticsUtils_androidKt.isAncestorOf(layoutNode0, layoutNode2);
    }

    // 去混淆评级： 低(20)
    public static final boolean isImportantForAccessibility(@NotNull SemanticsNode semanticsNode0) {
        return semanticsNode0.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() || semanticsNode0.getUnmergedConfig$ui_release().containsImportantForAccessibility$ui_release();
    }

    @Nullable
    public static final View semanticsIdToView(@NotNull AndroidViewsHandler androidViewsHandler0, int v) {
        Object object0 = null;
        for(Object object1: androidViewsHandler0.getLayoutNodeToHolder().entrySet()) {
            if(((LayoutNode)((Map.Entry)object1).getKey()).getSemanticsId() == v) {
                object0 = object1;
                break;
            }
        }
        return ((Map.Entry)object0) != null ? ((AndroidViewHolder)((Map.Entry)object0).getValue()) : null;
    }

    @Nullable
    public static final String toLegacyClassName-V4PA4sw(int v) {
        if(Role.equals-impl0(v, 0)) {
            return "android.widget.Button";
        }
        if(Role.equals-impl0(v, 1)) {
            return "android.widget.CheckBox";
        }
        if(Role.equals-impl0(v, 3)) {
            return "android.widget.RadioButton";
        }
        if(Role.equals-impl0(v, 5)) {
            return "android.widget.ImageView";
        }
        return Role.equals-impl0(v, 6) ? "android.widget.Spinner" : null;
    }
}

