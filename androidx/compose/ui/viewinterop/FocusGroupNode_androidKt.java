package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0013\u0010\u0001\u001A\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "focusInteropModifier", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFocusGroupNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusGroupNode.android.kt\nandroidx/compose/ui/viewinterop/FocusGroupNode_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
public final class FocusGroupNode_androidKt {
    public static final boolean access$containsDescendant(View view0, View view1) {
        for(ViewParent viewParent0 = view1.getParent(); viewParent0 != null; viewParent0 = viewParent0.getParent()) {
            if(viewParent0 == view0.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect access$getCurrentlyFocusedRect(FocusOwner focusOwner0, View view0, View view1) {
        int[] arr_v = new int[2];
        view0.getLocationOnScreen(arr_v);
        int[] arr_v1 = new int[2];
        view1.getLocationOnScreen(arr_v1);
        androidx.compose.ui.geometry.Rect rect0 = focusOwner0.getFocusRect();
        return rect0 == null ? null : new Rect(((int)rect0.getLeft()) + arr_v[0] - arr_v1[0], ((int)rect0.getTop()) + arr_v[1] - arr_v1[1], ((int)rect0.getRight()) + arr_v[0] - arr_v1[0], ((int)rect0.getBottom()) + arr_v[1] - arr_v1[1]);
    }

    public static final View access$getView(Node modifier$Node0) {
        View view0 = DelegatableNodeKt.requireLayoutNode(modifier$Node0.getNode()).getInteropView();
        if(view0 == null) {
            throw new IllegalStateException("Could not fetch interop view");
        }
        return view0;
    }

    @NotNull
    public static final Modifier focusInteropModifier(@NotNull Modifier modifier0) {
        return FocusModifierKt.focusTarget(FocusModifierKt.focusTarget(modifier0.then(FocusGroupPropertiesElement.b)).then(FocusTargetPropertiesElement.b));
    }
}

