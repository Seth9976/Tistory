package androidx.constraintlayout.compose;

import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.State.Direction;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.c;

public final class j extends Lambda implements Function1 {
    public final int w;
    public final int x;
    public final float y;
    public final Object z;

    public j(float f, ClosedFloatingPointRange closedFloatingPointRange0, int v) {
        this.w = 6;
        this.y = f;
        this.z = closedFloatingPointRange0;
        this.x = v;
        super(1);
    }

    public j(int v, float f, ConstrainedLayoutReference[] arr_constrainedLayoutReference, int v1) {
        this.w = v1;
        this.x = v;
        this.y = f;
        this.z = arr_constrainedLayoutReference;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                BarrierReference barrierReference0 = ((State)object0).barrier(this.x, Direction.LEFT);
                ConstrainedLayoutReference[] arr_constrainedLayoutReference = (ConstrainedLayoutReference[])this.z;
                ArrayList arrayList0 = new ArrayList(arr_constrainedLayoutReference.length);
                for(int v = 0; v < arr_constrainedLayoutReference.length; ++v) {
                    arrayList0.add(arr_constrainedLayoutReference[v].getId());
                }
                Object[] arr_object = arrayList0.toArray(new Object[0]);
                if(arr_object == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                barrierReference0.add(Arrays.copyOf(arr_object, arr_object.length));
                barrierReference0.margin(((State)object0).convertDimension(Dp.box-impl(this.y)));
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                BarrierReference barrierReference1 = ((State)object0).barrier(this.x, Direction.RIGHT);
                ConstrainedLayoutReference[] arr_constrainedLayoutReference1 = (ConstrainedLayoutReference[])this.z;
                ArrayList arrayList1 = new ArrayList(arr_constrainedLayoutReference1.length);
                for(int v1 = 0; v1 < arr_constrainedLayoutReference1.length; ++v1) {
                    arrayList1.add(arr_constrainedLayoutReference1[v1].getId());
                }
                Object[] arr_object1 = arrayList1.toArray(new Object[0]);
                if(arr_object1 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                barrierReference1.add(Arrays.copyOf(arr_object1, arr_object1.length));
                barrierReference1.margin(((State)object0).convertDimension(Dp.box-impl(this.y)));
                return Unit.INSTANCE;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                BarrierReference barrierReference2 = ((State)object0).barrier(this.x, Direction.BOTTOM);
                ConstrainedLayoutReference[] arr_constrainedLayoutReference2 = (ConstrainedLayoutReference[])this.z;
                ArrayList arrayList2 = new ArrayList(arr_constrainedLayoutReference2.length);
                for(int v2 = 0; v2 < arr_constrainedLayoutReference2.length; ++v2) {
                    arrayList2.add(arr_constrainedLayoutReference2[v2].getId());
                }
                Object[] arr_object2 = arrayList2.toArray(new Object[0]);
                if(arr_object2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                barrierReference2.add(Arrays.copyOf(arr_object2, arr_object2.length));
                barrierReference2.margin(((State)object0).convertDimension(Dp.box-impl(this.y)));
                return Unit.INSTANCE;
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                Direction state$Direction0 = ((State)object0).getLayoutDirection() == LayoutDirection.Ltr ? Direction.RIGHT : Direction.LEFT;
                BarrierReference barrierReference3 = ((State)object0).barrier(this.x, state$Direction0);
                ConstrainedLayoutReference[] arr_constrainedLayoutReference3 = (ConstrainedLayoutReference[])this.z;
                ArrayList arrayList3 = new ArrayList(arr_constrainedLayoutReference3.length);
                for(int v3 = 0; v3 < arr_constrainedLayoutReference3.length; ++v3) {
                    arrayList3.add(arr_constrainedLayoutReference3[v3].getId());
                }
                Object[] arr_object3 = arrayList3.toArray(new Object[0]);
                if(arr_object3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                barrierReference3.add(Arrays.copyOf(arr_object3, arr_object3.length));
                barrierReference3.margin(((State)object0).convertDimension(Dp.box-impl(this.y)));
                return Unit.INSTANCE;
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                Direction state$Direction1 = ((State)object0).getLayoutDirection() == LayoutDirection.Ltr ? Direction.LEFT : Direction.RIGHT;
                BarrierReference barrierReference4 = ((State)object0).barrier(this.x, state$Direction1);
                ConstrainedLayoutReference[] arr_constrainedLayoutReference4 = (ConstrainedLayoutReference[])this.z;
                ArrayList arrayList4 = new ArrayList(arr_constrainedLayoutReference4.length);
                for(int v4 = 0; v4 < arr_constrainedLayoutReference4.length; ++v4) {
                    arrayList4.add(arr_constrainedLayoutReference4[v4].getId());
                }
                Object[] arr_object4 = arrayList4.toArray(new Object[0]);
                if(arr_object4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                barrierReference4.add(Arrays.copyOf(arr_object4, arr_object4.length));
                barrierReference4.margin(((State)object0).convertDimension(Dp.box-impl(this.y)));
                return Unit.INSTANCE;
            }
            case 5: {
                Intrinsics.checkNotNullParameter(((State)object0), "state");
                BarrierReference barrierReference5 = ((State)object0).barrier(this.x, Direction.TOP);
                ConstrainedLayoutReference[] arr_constrainedLayoutReference5 = (ConstrainedLayoutReference[])this.z;
                ArrayList arrayList5 = new ArrayList(arr_constrainedLayoutReference5.length);
                for(int v5 = 0; v5 < arr_constrainedLayoutReference5.length; ++v5) {
                    arrayList5.add(arr_constrainedLayoutReference5[v5].getId());
                }
                Object[] arr_object5 = arrayList5.toArray(new Object[0]);
                if(arr_object5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                barrierReference5.add(Arrays.copyOf(arr_object5, arr_object5.length));
                barrierReference5.margin(((State)object0).convertDimension(Dp.box-impl(this.y)));
                return Unit.INSTANCE;
            }
            default: {
                SemanticsPropertiesKt.setProgressBarRangeInfo(((SemanticsPropertyReceiver)object0), new ProgressBarRangeInfo(((Number)c.coerceIn(this.y, ((ClosedFloatingPointRange)this.z))).floatValue(), ((ClosedFloatingPointRange)this.z), this.x));
                return Unit.INSTANCE;
            }
        }
    }
}

