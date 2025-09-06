package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@LayoutScopeMarker
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001A\u00060\u0007R\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\u0003J4\u0010\u0012\u001A\u00020\f*\u00020\f2\u0006\u0010\r\u001A\u00020\u00042\u0017\u0010\u0011\u001A\u0013\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\n0\u000E¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;", "<init>", "()V", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "createRef", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;", "createRefs", "()Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;", "", "reset", "Landroidx/compose/ui/Modifier;", "ref", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstrainScope;", "Lkotlin/ExtensionFunctionType;", "constrainBlock", "constrainAs", "(Landroidx/compose/ui/Modifier;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "androidx/constraintlayout/compose/q", "ConstrainedLayoutReferences", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ConstraintLayoutScope extends ConstraintLayoutBaseScope {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001A\u00020\u0004H\u0086\u0002J\t\u0010\u0005\u001A\u00020\u0004H\u0086\u0002J\t\u0010\u0006\u001A\u00020\u0004H\u0086\u0002J\t\u0010\u0007\u001A\u00020\u0004H\u0086\u0002J\t\u0010\b\u001A\u00020\u0004H\u0086\u0002J\t\u0010\t\u001A\u00020\u0004H\u0086\u0002J\t\u0010\n\u001A\u00020\u0004H\u0086\u0002J\t\u0010\u000B\u001A\u00020\u0004H\u0086\u0002J\t\u0010\f\u001A\u00020\u0004H\u0086\u0002J\t\u0010\r\u001A\u00020\u0004H\u0086\u0002J\t\u0010\u000E\u001A\u00020\u0004H\u0086\u0002J\t\u0010\u000F\u001A\u00020\u0004H\u0086\u0002J\t\u0010\u0010\u001A\u00020\u0004H\u0086\u0002J\t\u0010\u0011\u001A\u00020\u0004H\u0086\u0002J\t\u0010\u0012\u001A\u00020\u0004H\u0086\u0002J\t\u0010\u0013\u001A\u00020\u0004H\u0086\u0002¨\u0006\u0014"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;", "", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;)V", "component1", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public final class ConstrainedLayoutReferences {
        public final ConstraintLayoutScope a;

        public ConstrainedLayoutReferences() {
            Intrinsics.checkNotNullParameter(constraintLayoutScope0, "this$0");
            this.a = constraintLayoutScope0;
            super();
        }

        @NotNull
        public final ConstrainedLayoutReference component1() {
            return this.a.createRef();
        }

        @NotNull
        public final ConstrainedLayoutReference component10() {
            return this.a.createRef();
        }

        @NotNull
        public final ConstrainedLayoutReference component11() {
            return this.a.createRef();
        }

        @NotNull
        public final ConstrainedLayoutReference component12() {
            return this.a.createRef();
        }

        @NotNull
        public final ConstrainedLayoutReference component13() {
            return this.a.createRef();
        }

        @NotNull
        public final ConstrainedLayoutReference component14() {
            return this.a.createRef();
        }

        @NotNull
        public final ConstrainedLayoutReference component15() {
            return this.a.createRef();
        }

        @NotNull
        public final ConstrainedLayoutReference component16() {
            return this.a.createRef();
        }

        @NotNull
        public final ConstrainedLayoutReference component2() {
            return this.a.createRef();
        }

        @NotNull
        public final ConstrainedLayoutReference component3() {
            return this.a.createRef();
        }

        @NotNull
        public final ConstrainedLayoutReference component4() {
            return this.a.createRef();
        }

        @NotNull
        public final ConstrainedLayoutReference component5() {
            return this.a.createRef();
        }

        @NotNull
        public final ConstrainedLayoutReference component6() {
            return this.a.createRef();
        }

        @NotNull
        public final ConstrainedLayoutReference component7() {
            return this.a.createRef();
        }

        @NotNull
        public final ConstrainedLayoutReference component8() {
            return this.a.createRef();
        }

        @NotNull
        public final ConstrainedLayoutReference component9() {
            return this.a.createRef();
        }
    }

    public static final int $stable = 8;
    public ConstrainedLayoutReferences e;
    public int f;
    public final ArrayList g;

    @PublishedApi
    public ConstraintLayoutScope() {
        this.f = 0;
        this.g = new ArrayList();
    }

    @Stable
    @NotNull
    public final Modifier constrainAs(@NotNull Modifier modifier0, @NotNull ConstrainedLayoutReference constrainedLayoutReference0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(constrainedLayoutReference0, "ref");
        Intrinsics.checkNotNullParameter(function10, "constrainBlock");
        return modifier0.then(new q(constrainedLayoutReference0, function10));
    }

    @NotNull
    public final ConstrainedLayoutReference createRef() {
        ArrayList arrayList0 = this.g;
        int v = this.f;
        this.f = v + 1;
        ConstrainedLayoutReference constrainedLayoutReference0 = (ConstrainedLayoutReference)CollectionsKt___CollectionsKt.getOrNull(arrayList0, v);
        if(constrainedLayoutReference0 == null) {
            constrainedLayoutReference0 = new ConstrainedLayoutReference(this.f);
            arrayList0.add(constrainedLayoutReference0);
        }
        return constrainedLayoutReference0;
    }

    @Stable
    @NotNull
    public final ConstrainedLayoutReferences createRefs() {
        ConstrainedLayoutReferences constraintLayoutScope$ConstrainedLayoutReferences0 = this.e;
        if(constraintLayoutScope$ConstrainedLayoutReferences0 == null) {
            constraintLayoutScope$ConstrainedLayoutReferences0 = new ConstrainedLayoutReferences(this);
            this.e = constraintLayoutScope$ConstrainedLayoutReferences0;
        }
        return constraintLayoutScope$ConstrainedLayoutReferences0;
    }

    @Override  // androidx.constraintlayout.compose.ConstraintLayoutBaseScope
    public void reset() {
        super.reset();
        this.f = 0;
    }
}

