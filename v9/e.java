package v9;

import android.util.Size;
import com.kakao.kandinsky.core.filter.FilterEngine;
import com.kakao.kandinsky.core.filter.filter.MosaicChain;
import com.kakao.kandinsky.core.filter.filter.MosaicFilter;
import com.kakao.kandinsky.core.filter.gl.GLResourcesProvider;
import com.kakao.kandinsky.core.kdphoto.Mosaic;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class e extends SuspendLambda implements Function2 {
    public final FilterEngine o;
    public final List p;
    public final Size q;

    public e(FilterEngine filterEngine0, List list0, Size size0, Continuation continuation0) {
        this.o = filterEngine0;
        this.p = list0;
        this.q = size0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new e(this.o, this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((e)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        FilterEngine filterEngine0 = this.o;
        GLResourcesProvider gLResourcesProvider0 = filterEngine0.getGlResourcesProvider$filter_release();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(this.p, 10));
        for(Object object1: this.p) {
            arrayList0.add(new MosaicFilter(filterEngine0.getGlResourcesProvider$filter_release(), ((Mosaic)object1), this.q));
        }
        return new MosaicChain(gLResourcesProvider0, arrayList0);
    }
}

