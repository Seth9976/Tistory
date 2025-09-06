package ea;

import android.graphics.Bitmap;
import android.util.Size;
import com.kakao.kandinsky.core.filter.usecase.GetFilteredBitmapUseCase;
import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.filter.FilterViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import qd.a;

public final class h extends SuspendLambda implements Function4 {
    public int o;
    public Object p;
    public Object q;
    public int r;
    public final FilterViewModel s;

    public h(FilterViewModel filterViewModel0, Continuation continuation0) {
        this.s = filterViewModel0;
        super(4, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        h h0 = new h(this.s, ((Continuation)object3));
        h0.p = (String)object0;
        h0.q = (Filter)object1;
        h0.r = ((Number)object2).intValue();
        return h0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Filter filter3;
        FilterViewModel filterViewModel2;
        FilterViewModel filterViewModel1;
        Filter filter1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = (String)this.p;
                Filter filter0 = (Filter)this.q;
                int v = this.r;
                FilterViewModel filterViewModel0 = this.s;
                Bitmap bitmap0 = (Bitmap)filterViewModel0.P0.get(filter0.getFilterId());
                if(bitmap0 == null) {
                    Size size0 = new Size(v, v);
                    this.p = filter0;
                    this.q = filterViewModel0;
                    this.o = 1;
                    object0 = filterViewModel0.M0.invoke(s, size0, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    filter1 = filter0;
                    filterViewModel1 = filterViewModel0;
                    goto label_25;
                }
                return bitmap0;
            }
            case 1: {
                filterViewModel1 = (FilterViewModel)this.q;
                Filter filter2 = (Filter)this.p;
                ResultKt.throwOnFailure(object0);
                filter1 = filter2;
            label_25:
                if(((Bitmap)object0) != null) {
                    this.p = filter1;
                    this.q = filterViewModel1;
                    this.o = 2;
                    object0 = GetFilteredBitmapUseCase.invoke$default(filterViewModel1.N0, ((Bitmap)object0), filter1, 0.0f, null, null, null, this, 60, null);
                    if(object0 == object1) {
                        return object1;
                    }
                    filterViewModel2 = filterViewModel1;
                    filter3 = filter1;
                    break;
                }
                return null;
            }
            case 2: {
                filterViewModel2 = (FilterViewModel)this.q;
                filter3 = (Filter)this.p;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        filterViewModel2.P0.put(filter3.getFilterId(), ((Bitmap)object0));
        return (Bitmap)object0;
    }
}

