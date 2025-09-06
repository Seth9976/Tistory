package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import c2.a;
import c2.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A\u001F\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A\u001F\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001A\u0013\u0010\t\u001A\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "", "setCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "setCollectionItemInfo", "", "hasCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCollectionInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionInfo.android.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfo_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,154:1\n33#2,6:155\n33#2,6:161\n340#2,11:167\n372#2,7:178\n70#3,4:185\n*S KotlinDebug\n*F\n+ 1 CollectionInfo.android.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfo_androidKt\n*L\n43#1:155,6\n87#1:161,6\n122#1:167,11\n130#1:178,7\n128#1:185,4\n*E\n"})
public final class CollectionInfo_androidKt {
    public static final boolean a(ArrayList arrayList0) {
        long v2;
        List list0;
        if(arrayList0.size() < 2) {
            return true;
        }
        if(arrayList0.size() == 0 || arrayList0.size() == 1) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        else {
            list0 = new ArrayList();
            Object object0 = arrayList0.get(0);
            int v = CollectionsKt__CollectionsKt.getLastIndex(arrayList0);
            int v1 = 0;
            while(v1 < v) {
                ++v1;
                Object object1 = arrayList0.get(v1);
                ((ArrayList)list0).add(Offset.box-impl(OffsetKt.Offset(Math.abs(Offset.getX-impl(((SemanticsNode)object0).getBoundsInRoot().getCenter-F1C5BW0()) - Offset.getX-impl(((SemanticsNode)object1).getBoundsInRoot().getCenter-F1C5BW0())), Math.abs(Offset.getY-impl(((SemanticsNode)object0).getBoundsInRoot().getCenter-F1C5BW0()) - Offset.getY-impl(((SemanticsNode)object1).getBoundsInRoot().getCenter-F1C5BW0())))));
                object0 = object1;
            }
        }
        if(list0.size() == 1) {
            v2 = ((Offset)CollectionsKt___CollectionsKt.first(list0)).unbox-impl();
            return Offset.getY-impl(v2) < Offset.getX-impl(v2);
        }
        if(list0.isEmpty()) {
            throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
        }
        Offset offset0 = CollectionsKt___CollectionsKt.first(list0);
        int v3 = CollectionsKt__CollectionsKt.getLastIndex(list0);
        if(1 <= v3) {
            for(int v4 = 1; true; ++v4) {
                offset0 = Offset.box-impl(Offset.plus-MK-Hz9U(offset0.unbox-impl(), ((Offset)list0.get(v4)).unbox-impl()));
                if(v4 == v3) {
                    break;
                }
            }
        }
        v2 = offset0.unbox-impl();
        return Offset.getY-impl(v2) < Offset.getX-impl(v2);
    }

    public static final boolean hasCollectionInfo(@NotNull SemanticsNode semanticsNode0) {
        return SemanticsConfigurationKt.getOrNull(semanticsNode0.getConfig(), SemanticsProperties.INSTANCE.getCollectionInfo()) != null || SemanticsConfigurationKt.getOrNull(semanticsNode0.getConfig(), SemanticsProperties.INSTANCE.getSelectableGroup()) != null;
    }

    public static final void setCollectionInfo(@NotNull SemanticsNode semanticsNode0, @NotNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        SemanticsConfiguration semanticsConfiguration0 = semanticsNode0.getConfig();
        SemanticsProperties semanticsProperties0 = SemanticsProperties.INSTANCE;
        CollectionInfo collectionInfo0 = (CollectionInfo)SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, semanticsProperties0.getCollectionInfo());
        if(collectionInfo0 != null) {
            accessibilityNodeInfoCompat0.setCollectionInfo(CollectionInfoCompat.obtain(collectionInfo0.getRowCount(), collectionInfo0.getColumnCount(), false, 0));
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        if(SemanticsConfigurationKt.getOrNull(semanticsNode0.getConfig(), semanticsProperties0.getSelectableGroup()) != null) {
            List list0 = semanticsNode0.getReplacedChildren$ui_release();
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                SemanticsNode semanticsNode1 = (SemanticsNode)list0.get(v1);
                if(semanticsNode1.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList0.add(semanticsNode1);
                }
            }
        }
        if(!arrayList0.isEmpty()) {
            boolean z = CollectionInfo_androidKt.a(arrayList0);
            int v2 = 1;
            int v3 = z ? 1 : arrayList0.size();
            if(z) {
                v2 = arrayList0.size();
            }
            accessibilityNodeInfoCompat0.setCollectionInfo(CollectionInfoCompat.obtain(v3, v2, false, 0));
        }
    }

    public static final void setCollectionItemInfo(@NotNull SemanticsNode semanticsNode0, @NotNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        SemanticsConfiguration semanticsConfiguration0 = semanticsNode0.getConfig();
        SemanticsProperties semanticsProperties0 = SemanticsProperties.INSTANCE;
        CollectionItemInfo collectionItemInfo0 = (CollectionItemInfo)SemanticsConfigurationKt.getOrNull(semanticsConfiguration0, semanticsProperties0.getCollectionItemInfo());
        if(collectionItemInfo0 != null) {
            accessibilityNodeInfoCompat0.setCollectionItemInfo(CollectionItemInfoCompat.obtain(collectionItemInfo0.getRowIndex(), collectionItemInfo0.getRowSpan(), collectionItemInfo0.getColumnIndex(), collectionItemInfo0.getColumnSpan(), false, ((Boolean)semanticsNode0.getConfig().getOrElse(semanticsProperties0.getSelected(), b.w)).booleanValue()));
        }
        SemanticsNode semanticsNode1 = semanticsNode0.getParent();
        if(semanticsNode1 == null) {
            return;
        }
        if(SemanticsConfigurationKt.getOrNull(semanticsNode1.getConfig(), semanticsProperties0.getSelectableGroup()) != null) {
            CollectionInfo collectionInfo0 = (CollectionInfo)SemanticsConfigurationKt.getOrNull(semanticsNode1.getConfig(), semanticsProperties0.getCollectionInfo());
            if(collectionInfo0 != null && (collectionInfo0.getRowCount() < 0 || collectionInfo0.getColumnCount() < 0)) {
                return;
            }
            if(!semanticsNode0.getConfig().contains(semanticsProperties0.getSelected())) {
                return;
            }
            ArrayList arrayList0 = new ArrayList();
            List list0 = semanticsNode1.getReplacedChildren$ui_release();
            int v = list0.size();
            int v2 = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                SemanticsNode semanticsNode2 = (SemanticsNode)list0.get(v1);
                if(semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList0.add(semanticsNode2);
                    if(semanticsNode2.getLayoutNode$ui_release().getPlaceOrder$ui_release() < semanticsNode0.getLayoutNode$ui_release().getPlaceOrder$ui_release()) {
                        ++v2;
                    }
                }
            }
            if(!arrayList0.isEmpty()) {
                boolean z = CollectionInfo_androidKt.a(arrayList0);
                CollectionItemInfoCompat accessibilityNodeInfoCompat$CollectionItemInfoCompat0 = CollectionItemInfoCompat.obtain((z ? 0 : v2), 1, (z ? v2 : 0), 1, false, ((Boolean)semanticsNode0.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), a.w)).booleanValue());
                if(accessibilityNodeInfoCompat$CollectionItemInfoCompat0 != null) {
                    accessibilityNodeInfoCompat0.setCollectionItemInfo(accessibilityNodeInfoCompat$CollectionItemInfoCompat0);
                }
            }
        }
    }
}

