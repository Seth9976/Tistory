package androidx.constraintlayout.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\u001A\u001E\u0010\u0007\u001A\u00020\b*\u00020\b2\u0006\u0010\u0007\u001A\u00020\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\"\u0017\u0010\u0000\u001A\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001A\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0004¨\u0006\u000B"}, d2 = {"constraintLayoutId", "", "Landroidx/compose/ui/layout/Measurable;", "getConstraintLayoutId", "(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;", "constraintLayoutTag", "getConstraintLayoutTag", "layoutId", "Landroidx/compose/ui/Modifier;", "", "tag", "compose_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ConstraintLayoutTagKt {
    @Nullable
    public static final Object getConstraintLayoutId(@NotNull Measurable measurable0) {
        Intrinsics.checkNotNullParameter(measurable0, "<this>");
        Object object0 = measurable0.getParentData();
        ConstraintLayoutTagParentData constraintLayoutTagParentData0 = object0 instanceof ConstraintLayoutTagParentData ? ((ConstraintLayoutTagParentData)object0) : null;
        return constraintLayoutTagParentData0 == null ? null : constraintLayoutTagParentData0.getConstraintLayoutId();
    }

    @Nullable
    public static final Object getConstraintLayoutTag(@NotNull Measurable measurable0) {
        Intrinsics.checkNotNullParameter(measurable0, "<this>");
        Object object0 = measurable0.getParentData();
        ConstraintLayoutTagParentData constraintLayoutTagParentData0 = object0 instanceof ConstraintLayoutTagParentData ? ((ConstraintLayoutTagParentData)object0) : null;
        return constraintLayoutTagParentData0 == null ? null : constraintLayoutTagParentData0.getConstraintLayoutTag();
    }

    @NotNull
    public static final Modifier layoutId(@NotNull Modifier modifier0, @NotNull String s, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(s, "layoutId");
        return s1 == null ? LayoutIdKt.layoutId(modifier0, s) : modifier0.then(new s(s1, s, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 5, 1}, xi = 0x30)
        public final class androidx.constraintlayout.compose.ConstraintLayoutTagKt.layoutId..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final String w;

            public androidx.constraintlayout.compose.ConstraintLayoutTagKt.layoutId..inlined.debugInspectorInfo.1(String s) {
                this.w = s;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("constraintLayoutId");
                inspectorInfo0.setValue(this.w);
            }
        }

    }

    public static Modifier layoutId$default(Modifier modifier0, String s, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        return ConstraintLayoutTagKt.layoutId(modifier0, s, s1);
    }
}

