package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State.Helper;
import androidx.constraintlayout.core.state.helpers.HorizontalChainReference;
import androidx.constraintlayout.core.state.helpers.VerticalChainReference;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public final int w;
    public final int x;
    public final ConstrainedLayoutReference[] y;
    public final ChainStyle z;

    public l(int v, ConstrainedLayoutReference[] arr_constrainedLayoutReference, ChainStyle chainStyle0, int v1) {
        this.w = v1;
        this.x = v;
        this.y = arr_constrainedLayoutReference;
        this.z = chainStyle0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((State)object0), "state");
            HelperReference helperReference0 = ((State)object0).helper(this.x, Helper.VERTICAL_CHAIN);
            if(helperReference0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.state.helpers.VerticalChainReference");
            }
            ConstrainedLayoutReference[] arr_constrainedLayoutReference = this.y;
            ArrayList arrayList0 = new ArrayList(arr_constrainedLayoutReference.length);
            for(int v = 0; v < arr_constrainedLayoutReference.length; ++v) {
                arrayList0.add(arr_constrainedLayoutReference[v].getId());
            }
            Object[] arr_object = arrayList0.toArray(new Object[0]);
            if(arr_object == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            ((VerticalChainReference)helperReference0).add(Arrays.copyOf(arr_object, arr_object.length));
            ChainStyle chainStyle0 = this.z;
            ((VerticalChainReference)helperReference0).style(chainStyle0.getStyle$compose_release());
            ((VerticalChainReference)helperReference0).apply();
            if(chainStyle0.getBias$compose_release() != null) {
                ((State)object0).constraints(arr_constrainedLayoutReference[0].getId()).verticalBias(((float)chainStyle0.getBias$compose_release()));
            }
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(((State)object0), "state");
        HelperReference helperReference1 = ((State)object0).helper(this.x, Helper.HORIZONTAL_CHAIN);
        if(helperReference1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.state.helpers.HorizontalChainReference");
        }
        ConstrainedLayoutReference[] arr_constrainedLayoutReference1 = this.y;
        ArrayList arrayList1 = new ArrayList(arr_constrainedLayoutReference1.length);
        for(int v1 = 0; v1 < arr_constrainedLayoutReference1.length; ++v1) {
            arrayList1.add(arr_constrainedLayoutReference1[v1].getId());
        }
        Object[] arr_object1 = arrayList1.toArray(new Object[0]);
        if(arr_object1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        ((HorizontalChainReference)helperReference1).add(Arrays.copyOf(arr_object1, arr_object1.length));
        ChainStyle chainStyle1 = this.z;
        ((HorizontalChainReference)helperReference1).style(chainStyle1.getStyle$compose_release());
        ((HorizontalChainReference)helperReference1).apply();
        if(chainStyle1.getBias$compose_release() != null) {
            ((State)object0).constraints(arr_constrainedLayoutReference1[0].getId()).horizontalBias(((float)chainStyle1.getBias$compose_release()));
        }
        return Unit.INSTANCE;
    }
}

