package u;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class k extends RestrictedSuspendLambda implements Function2 {
    public int p;
    public Object q;
    public final AndroidEdgeEffectOverscrollEffect r;

    public k(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect0, Continuation continuation0) {
        this.r = androidEdgeEffectOverscrollEffect0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new k(this.r, continuation0);
        continuation1.q = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k)this.create(((AwaitPointerEventScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object3;
        AwaitPointerEventScope awaitPointerEventScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect0 = this.r;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                this.q = awaitPointerEventScope0;
                this.p = 1;
                object0 = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope0, false, null, this, 2, null);
                if(object0 == object1) {
                    return object1;
                }
                androidEdgeEffectOverscrollEffect0.g = PointerId.box-impl(((PointerInputChange)object0).getId-J3iCeTQ());
                androidEdgeEffectOverscrollEffect0.a = Offset.box-impl(((PointerInputChange)object0).getPosition-F1C5BW0());
                goto label_51;
            }
            case 1: {
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                ResultKt.throwOnFailure(object0);
                androidEdgeEffectOverscrollEffect0.g = PointerId.box-impl(((PointerInputChange)object0).getId-J3iCeTQ());
                androidEdgeEffectOverscrollEffect0.a = Offset.box-impl(((PointerInputChange)object0).getPosition-F1C5BW0());
                goto label_51;
            }
            case 2: {
                awaitPointerEventScope0 = (AwaitPointerEventScope)this.q;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            List list0 = ((PointerEvent)object0).getChanges();
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v = list0.size();
            int v1 = 0;
            for(int v2 = 0; v2 < v; ++v2) {
                Object object2 = list0.get(v2);
                if(((PointerInputChange)object2).getPressed()) {
                    arrayList0.add(object2);
                }
            }
            int v3 = arrayList0.size();
            while(true) {
                object3 = null;
                if(v1 < v3) {
                    Object object4 = arrayList0.get(v1);
                    if(PointerId.equals-impl(((PointerInputChange)object4).getId-J3iCeTQ(), androidEdgeEffectOverscrollEffect0.g)) {
                        object3 = object4;
                    }
                    else {
                        ++v1;
                        continue;
                    }
                }
                break;
            }
            PointerInputChange pointerInputChange0 = (PointerInputChange)object3;
            if(pointerInputChange0 == null) {
                pointerInputChange0 = (PointerInputChange)CollectionsKt___CollectionsKt.firstOrNull(arrayList0);
            }
            if(pointerInputChange0 != null) {
                androidEdgeEffectOverscrollEffect0.g = PointerId.box-impl(pointerInputChange0.getId-J3iCeTQ());
                androidEdgeEffectOverscrollEffect0.a = Offset.box-impl(pointerInputChange0.getPosition-F1C5BW0());
            }
            if(arrayList0.isEmpty()) {
                androidEdgeEffectOverscrollEffect0.g = null;
                return Unit.INSTANCE;
            }
        label_51:
            this.q = awaitPointerEventScope0;
            this.p = 2;
            object0 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope0, null, this, 1, null);
        }
        while(object0 != object1);
        return object1;
    }
}

