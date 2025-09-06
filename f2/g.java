package f2;

import androidx.compose.ui.scrollcapture.b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import qd.a;

public final class g {
    public final int a;
    public final b b;
    public float c;

    public g(int v, b b0) {
        this.a = v;
        this.b = b0;
    }

    public final Object a(float f, ContinuationImpl continuationImpl0) {
        g g0;
        f f1;
        if(continuationImpl0 instanceof f) {
            f1 = (f)continuationImpl0;
            int v = f1.r;
            if((v & 0x80000000) == 0) {
                f1 = new f(this, continuationImpl0);
            }
            else {
                f1.r = v ^ 0x80000000;
            }
        }
        else {
            f1 = new f(this, continuationImpl0);
        }
        Object object0 = f1.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(f1.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                f1.o = this;
                f1.r = 1;
                object0 = this.b.invoke(Boxing.boxFloat(f), f1);
                if(object0 == object1) {
                    return object1;
                }
                g0 = this;
                break;
            }
            case 1: {
                g0 = f1.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        g0.c += ((Number)object0).floatValue();
        return Unit.INSTANCE;
    }
}

