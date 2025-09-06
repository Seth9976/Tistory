package v9;

import android.graphics.Bitmap;
import com.kakao.kandinsky.core.filter.FilterEngine;
import com.kakao.kandinsky.core.filter.gl.GLBitmapTexture;
import com.kakao.kandinsky.core.filter.gl.GLTexture;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class l extends SuspendLambda implements Function2 {
    public FilterEngine o;
    public int p;
    public final FilterEngine q;
    public final Bitmap r;

    public l(FilterEngine filterEngine0, Bitmap bitmap0, Continuation continuation0) {
        this.q = filterEngine0;
        this.r = bitmap0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new l(this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((l)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        GLBitmapTexture gLBitmapTexture0;
        FilterEngine filterEngine1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FilterEngine filterEngine0 = this.q;
                GLTexture gLTexture0 = filterEngine0.getInput$filter_release();
                if(gLTexture0 != null) {
                    gLTexture0.delete();
                }
                Bitmap bitmap0 = this.r;
                if(bitmap0 == null) {
                    filterEngine1 = filterEngine0;
                    gLBitmapTexture0 = null;
                }
                else {
                    this.o = filterEngine0;
                    this.p = 1;
                    Object object2 = FilterEngine.access$createBitmapTexture(filterEngine0, bitmap0, this);
                    if(object2 == object1) {
                        return object1;
                    }
                    filterEngine1 = filterEngine0;
                    gLBitmapTexture0 = (GLBitmapTexture)object2;
                }
                break;
            }
            case 1: {
                filterEngine1 = this.o;
                ResultKt.throwOnFailure(object0);
                gLBitmapTexture0 = (GLBitmapTexture)object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        filterEngine1.setInput$filter_release(gLBitmapTexture0);
        return Unit.INSTANCE;
    }
}

