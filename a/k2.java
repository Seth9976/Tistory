package a;

import com.kakao.kandinsky.b;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import e.g;
import e.p;
import e.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class k2 extends SuspendLambda implements Function2 {
    public int a;
    public final b b;
    public final List c;

    public k2(b b0, List list0, Continuation continuation0) {
        this.b = b0;
        this.c = list0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new k2(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new k2(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                u u0 = this.b.c;
                this.a = 1;
                g g0 = u0.a;
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(this.c, 10));
                for(Object object2: this.c) {
                    arrayList0.add(u0.a(((KDPhoto)object2)));
                }
                Unit unit0 = ((p)g0).c(arrayList0, this);
                if(unit0 != a.getCOROUTINE_SUSPENDED()) {
                    unit0 = Unit.INSTANCE;
                }
                return unit0 == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

