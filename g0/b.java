package g0;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterNode;
import androidx.compose.foundation.relocation.ScrollIntoView;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

public final class b implements BringIntoViewRequester {
    public final MutableVector a;

    public b() {
        this.a = new MutableVector(new BringIntoViewRequesterNode[16], 0);
    }

    @Override  // androidx.compose.foundation.relocation.BringIntoViewRequester
    public final Object bringIntoView(Rect rect0, Continuation continuation0) {
        Object[] arr_object;
        int v2;
        Rect rect1;
        int v1;
        a a0;
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v = a0.u;
            if((v & 0x80000000) == 0) {
                a0 = new a(this, continuation0);
            }
            else {
                a0.u = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(this, continuation0);
        }
        Object object0 = a0.s;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a0.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                MutableVector mutableVector0 = this.a;
                v1 = mutableVector0.getSize();
                if(v1 <= 0) {
                    return Unit.INSTANCE;
                }
                rect1 = rect0;
                v2 = 0;
                arr_object = mutableVector0.getContent();
                goto label_30;
            }
            case 1: {
                v2 = a0.r;
                v1 = a0.q;
                arr_object = a0.p;
                Rect rect2 = a0.o;
                ResultKt.throwOnFailure(object0);
                rect1 = rect2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            ++v2;
            if(v2 >= v1) {
                return Unit.INSTANCE;
            }
        label_30:
            a0.o = rect1;
            a0.p = arr_object;
            a0.q = v1;
            a0.r = v2;
            a0.u = 1;
        }
        while(ScrollIntoView.scrollIntoView(((BringIntoViewRequesterNode)arr_object[v2]), rect1, a0) != object1);
        return object1;
    }
}

