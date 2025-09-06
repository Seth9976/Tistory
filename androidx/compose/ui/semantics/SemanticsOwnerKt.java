package androidx.compose.ui.semantics;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\u001A\u001A\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0007\u001A\"\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u001A,\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b*\u00020\u00032\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0005H\u0000¨\u0006\u000B"}, d2 = {"getAllSemanticsNodes", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "mergingEnabled", "", "skipDeactivatedNodes", "getAllSemanticsNodesToMap", "", "", "useUnmergedTree", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSemanticsOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,104:1\n33#2,6:105\n*S KotlinDebug\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n*L\n93#1:105,6\n*E\n"})
public final class SemanticsOwnerKt {
    public static final void a(LinkedHashMap linkedHashMap0, boolean z, SemanticsNode semanticsNode0) {
        linkedHashMap0.put(semanticsNode0.getId(), semanticsNode0);
        List list0 = SemanticsNode.getChildren$ui_release$default(semanticsNode0, false, false, !z, 3, null);
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            SemanticsOwnerKt.a(linkedHashMap0, z, ((SemanticsNode)list0.get(v1)));
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use a new overload instead")
    public static final List getAllSemanticsNodes(SemanticsOwner semanticsOwner0, boolean z) {
        return SemanticsOwnerKt.getAllSemanticsNodes(semanticsOwner0, z, true);
    }

    @NotNull
    public static final List getAllSemanticsNodes(@NotNull SemanticsOwner semanticsOwner0, boolean z, boolean z1) {
        return CollectionsKt___CollectionsKt.toList(SemanticsOwnerKt.getAllSemanticsNodesToMap(semanticsOwner0, !z, z1).values());
    }

    public static List getAllSemanticsNodes$default(SemanticsOwner semanticsOwner0, boolean z, boolean z1, int v, Object object0) {
        if((v & 2) != 0) {
            z1 = true;
        }
        return SemanticsOwnerKt.getAllSemanticsNodes(semanticsOwner0, z, z1);
    }

    @NotNull
    public static final Map getAllSemanticsNodesToMap(@NotNull SemanticsOwner semanticsOwner0, boolean z, boolean z1) {
        Map map0 = new LinkedHashMap();
        SemanticsNode semanticsNode0 = z ? semanticsOwner0.getUnmergedRootSemanticsNode() : semanticsOwner0.getRootSemanticsNode();
        if(!z1 || !semanticsNode0.getLayoutNode$ui_release().isDeactivated()) {
            SemanticsOwnerKt.a(((LinkedHashMap)map0), z1, semanticsNode0);
        }
        return map0;
    }

    public static Map getAllSemanticsNodesToMap$default(SemanticsOwner semanticsOwner0, boolean z, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = true;
        }
        return SemanticsOwnerKt.getAllSemanticsNodesToMap(semanticsOwner0, z, z1);
    }
}

