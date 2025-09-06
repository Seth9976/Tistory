package v9;

import android.util.Size;
import com.kakao.kandinsky.core.filter.FilterEngine;
import com.kakao.kandinsky.core.filter.filter.BlurChain;
import com.kakao.kandinsky.core.filter.filter.BlurFilter;
import com.kakao.kandinsky.core.kdphoto.Blur;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class c extends SuspendLambda implements Function2 {
    public final FilterEngine o;
    public final Blur p;
    public final Size q;

    public c(FilterEngine filterEngine0, Blur blur0, Size size0, Continuation continuation0) {
        this.o = filterEngine0;
        this.p = blur0;
        this.q = size0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c(this.o, this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        return new BlurChain(this.o.getGlResourcesProvider$filter_release(), CollectionsKt__CollectionsKt.listOf(new BlurFilter[]{new BlurFilter(this.o.getGlResourcesProvider$filter_release(), this.p, this.q, 0), new BlurFilter(this.o.getGlResourcesProvider$filter_release(), this.p, this.q, 1), new BlurFilter(this.o.getGlResourcesProvider$filter_release(), this.p, this.q, 2), new BlurFilter(this.o.getGlResourcesProvider$filter_release(), this.p, this.q, 3)}));
    }
}

