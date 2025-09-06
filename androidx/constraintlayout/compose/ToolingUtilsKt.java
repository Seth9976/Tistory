package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.o;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001A7\u0010\t\u001A\u00020\u00072\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\"\u001D\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\f0\u000B8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010\"5\u0010\u001B\u001A\u00020\f*\u00020\u00122\u0006\u0010\u0013\u001A\u00020\f8@@@X\u0081\u008E\u0002¢\u0006\u0018\n\u0004\b\u0014\u0010\u000E\u0012\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001C"}, d2 = {"Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "root", "Landroidx/constraintlayout/compose/State;", "state", "", "startX", "startY", "", "args", "parseConstraintsToJson", "(Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;Landroidx/constraintlayout/compose/State;IILjava/lang/String;)Ljava/lang/String;", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "b", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getDesignInfoDataKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "DesignInfoDataKey", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "<set-?>", "c", "getDesignInfoProvider", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;", "setDesignInfoProvider", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/constraintlayout/compose/DesignInfoProvider;)V", "getDesignInfoProvider$annotations", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "designInfoProvider", "compose_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ToolingUtilsKt {
    public static final KProperty[] a;
    public static final SemanticsPropertyKey b;
    public static final SemanticsPropertyKey c;

    static {
        ToolingUtilsKt.a = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinPackage(ToolingUtilsKt.class, "compose_release"), "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;"))};
        SemanticsPropertyKey semanticsPropertyKey0 = new SemanticsPropertyKey("DesignInfoProvider", null, 2, null);
        ToolingUtilsKt.b = semanticsPropertyKey0;
        ToolingUtilsKt.c = semanticsPropertyKey0;
    }

    public static final JSONObject a(ConstraintWidget constraintWidget0, int v, int v1) {
        return new JSONObject().put("left", constraintWidget0.getLeft() + v).put("top", constraintWidget0.getTop() + v1).put("right", constraintWidget0.getRight() + v).put("bottom", constraintWidget0.getBottom() + v1);
    }

    public static final String b(ConstraintWidget constraintWidget0) {
        String s1;
        String s = null;
        Object object0 = constraintWidget0 == null ? null : constraintWidget0.getCompanionWidget();
        Measurable measurable0 = object0 instanceof Measurable ? ((Measurable)object0) : null;
        if(measurable0 == null) {
            s1 = null;
        }
        else {
            Object object1 = LayoutIdKt.getLayoutId(measurable0);
            s1 = object1 == null ? null : object1.toString();
        }
        if(s1 == null) {
            if(constraintWidget0 != null) {
                s = constraintWidget0.stringId;
            }
            return String.valueOf(s);
        }
        return s1;
    }

    public static final void c(JSONObject jSONObject0, String s, JSONObject jSONObject1, boolean z, boolean z1, List list0, JSONArray jSONArray0, boolean z2, boolean z3) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("viewId", s);
        if(z3) {
            jSONObject2.put("box", jSONObject1);
        }
        jSONObject2.put("isHelper", z);
        jSONObject2.put("isRoot", z1);
        JSONArray jSONArray1 = new JSONArray();
        for(Object object0: list0) {
            jSONArray1.put(object0);
        }
        jSONObject2.put("helperReferences", jSONArray1);
        if(z2) {
            jSONObject2.put("constraints", jSONArray0);
        }
        jSONObject0.put(s, jSONObject2);
    }

    @NotNull
    public static final SemanticsPropertyKey getDesignInfoDataKey() {
        return ToolingUtilsKt.b;
    }

    @NotNull
    public static final DesignInfoProvider getDesignInfoProvider(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        return (DesignInfoProvider)ToolingUtilsKt.c.getValue(semanticsPropertyReceiver0, ToolingUtilsKt.a[0]);
    }

    @PublishedApi
    public static void getDesignInfoProvider$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
    }

    @NotNull
    public static final String parseConstraintsToJson(@NotNull ConstraintWidgetContainer constraintWidgetContainer0, @NotNull State state0, int v, int v1, @NotNull String s) {
        String s2;
        boolean z1;
        boolean z;
        Intrinsics.checkNotNullParameter(constraintWidgetContainer0, "root");
        Intrinsics.checkNotNullParameter(state0, "state");
        Intrinsics.checkNotNullParameter(s, "args");
        JSONObject jSONObject0 = new JSONObject();
        Integer integer0 = o.toIntOrNull(s);
        if(integer0 == null) {
            z = true;
            z1 = true;
        }
        else {
            int v2 = integer0.intValue();
            z = v2 == 1;
            z1 = v2 >> 1 == 1;
        }
        ArrayList arrayList0 = constraintWidgetContainer0.getChildren();
        Intrinsics.checkNotNullExpressionValue(arrayList0, "root.children");
        for(Object object0: arrayList0) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)object0;
            JSONArray jSONArray0 = new JSONArray();
            ArrayList arrayList1 = new ArrayList();
            String s1 = constraintWidget0.stringId;
            if(constraintWidget0 instanceof HelperWidget) {
                HelperWidget helperWidget0 = (HelperWidget)constraintWidget0;
                int v3 = helperWidget0.mWidgetsCount;
                if(v3 > 0) {
                    for(int v4 = 0; true; ++v4) {
                        ConstraintWidget constraintWidget1 = helperWidget0.mWidgets[v4];
                        arrayList1.add((Intrinsics.areEqual(constraintWidget1, constraintWidgetContainer0) ? "0" : ToolingUtilsKt.b(constraintWidget1)));
                        if(v4 + 1 >= v3) {
                            break;
                        }
                    }
                }
            }
            ArrayList arrayList2 = constraintWidget0.getAnchors();
            Intrinsics.checkNotNullExpressionValue(arrayList2, "constraintWidget.anchors");
            for(Object object1: arrayList2) {
                ConstraintAnchor constraintAnchor0 = (ConstraintAnchor)object1;
                if(constraintAnchor0.isConnected()) {
                    ConstraintWidget constraintWidget2 = constraintAnchor0.getTarget().getOwner();
                    boolean z2 = constraintWidget2 instanceof HelperWidget;
                    if(Intrinsics.areEqual(constraintWidgetContainer0, constraintWidget2)) {
                        s2 = "0";
                    }
                    else if(z2) {
                        Intrinsics.checkNotNullExpressionValue(constraintWidget2, "targetWidget");
                        s2 = String.valueOf(state0.getKeyId$compose_release(((HelperWidget)constraintWidget2)));
                    }
                    else {
                        s2 = ToolingUtilsKt.b(constraintWidget2);
                    }
                    JSONObject jSONObject1 = new JSONObject().put("originAnchor", constraintAnchor0.getType());
                    ConstraintAnchor constraintAnchor1 = constraintAnchor0.getTarget();
                    Intrinsics.checkNotNull(constraintAnchor1);
                    jSONArray0.put(jSONObject1.put("targetAnchor", constraintAnchor1.getType()).put("target", s2).put("margin", constraintAnchor0.getMargin()));
                }
            }
            Intrinsics.checkNotNullExpressionValue(s1, "widgetId");
            Intrinsics.checkNotNullExpressionValue(constraintWidget0, "constraintWidget");
            JSONObject jSONObject2 = ToolingUtilsKt.a(constraintWidget0, v, v1);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "constraintWidget.boundsToJson(startX, startY)");
            ToolingUtilsKt.c(jSONObject0, s1, jSONObject2, constraintWidget0 instanceof HelperWidget, false, arrayList1, jSONArray0, z, z1);
        }
        JSONObject jSONObject3 = ToolingUtilsKt.a(constraintWidgetContainer0, v, v1);
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "root.boundsToJson(startX, startY)");
        ToolingUtilsKt.c(jSONObject0, "0", jSONObject3, false, true, CollectionsKt__CollectionsKt.emptyList(), new JSONArray(), z, z1);
        String s3 = new JSONObject().put("type", "CONSTRAINTS").put("version", 1).put("content", jSONObject0).toString();
        Intrinsics.checkNotNullExpressionValue(s3, "JSONObject()\n    .put(\"type\", \"CONSTRAINTS\")\n    .put(\"version\", CONSTRAINTS_JSON_VERSION)\n    .put(\"content\", content).toString()");
        return s3;
    }

    public static final void setDesignInfoProvider(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull DesignInfoProvider designInfoProvider0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "<this>");
        Intrinsics.checkNotNullParameter(designInfoProvider0, "<set-?>");
        ToolingUtilsKt.c.setValue(semanticsPropertyReceiver0, ToolingUtilsKt.a[0], designInfoProvider0);
    }
}

