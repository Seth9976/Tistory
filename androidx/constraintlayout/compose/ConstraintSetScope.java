package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@LayoutScopeMarker
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\'\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nJ\u000E\u0010\u000B\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\r¨\u0006\u000E"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintSetScope;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;", "()V", "constrain", "Landroidx/constraintlayout/compose/ConstrainScope;", "ref", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "constrainBlock", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "createRefFor", "id", "", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ConstraintSetScope extends ConstraintLayoutBaseScope {
    public static final int $stable;

    @NotNull
    public final ConstrainScope constrain(@NotNull ConstrainedLayoutReference constrainedLayoutReference0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(constrainedLayoutReference0, "ref");
        Intrinsics.checkNotNullParameter(function10, "constrainBlock");
        ConstrainScope constrainScope0 = new ConstrainScope(constrainedLayoutReference0.getId());
        function10.invoke(constrainScope0);
        this.getTasks().addAll(constrainScope0.getTasks$compose_release());
        return constrainScope0;
    }

    @NotNull
    public final ConstrainedLayoutReference createRefFor(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "id");
        return new ConstrainedLayoutReference(object0);
    }
}

