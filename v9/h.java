package v9;

import android.util.Size;
import com.kakao.kandinsky.core.filter.FilterEngine;
import com.kakao.kandinsky.core.filter.filter.BlurChain;
import com.kakao.kandinsky.core.kdphoto.Blur;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class h extends SuspendLambda implements Function2 {
    public FilterEngine o;
    public int p;
    public final FilterEngine q;
    public final Blur r;
    public final Size s;

    public h(FilterEngine filterEngine0, Blur blur0, Size size0, Continuation continuation0) {
        this.q = filterEngine0;
        this.r = blur0;
        this.s = size0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new h(this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((h)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        BlurChain blurChain1;
        FilterEngine filterEngine0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                filterEngine0 = this.q;
                BlurChain blurChain0 = filterEngine0.getBlurChain$filter_release();
                if(blurChain0 != null) {
                    blurChain0.delete();
                }
                Blur blur0 = this.r;
                if(blur0 == null) {
                    blurChain1 = null;
                }
                else {
                    this.o = filterEngine0;
                    this.p = 1;
                    Object object2 = FilterEngine.access$createBlurChain(filterEngine0, blur0, this.s, this);
                    if(object2 == object1) {
                        return object1;
                    }
                    blurChain1 = (BlurChain)object2;
                }
                break;
            }
            case 1: {
                FilterEngine filterEngine1 = this.o;
                ResultKt.throwOnFailure(object0);
                blurChain1 = (BlurChain)object0;
                filterEngine0 = filterEngine1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        filterEngine0.setBlurChain$filter_release(blurChain1);
        return Unit.INSTANCE;
    }
}

