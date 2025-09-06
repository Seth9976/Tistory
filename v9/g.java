package v9;

import com.kakao.kandinsky.core.filter.FilterEngine;
import com.kakao.kandinsky.core.filter.filter.BlurChain;
import com.kakao.kandinsky.core.filter.filter.EffectFilter;
import com.kakao.kandinsky.core.filter.filter.FilterChain;
import com.kakao.kandinsky.core.filter.filter.MosaicChain;
import com.kakao.kandinsky.core.filter.gl.GLTexture;
import com.kakao.kandinsky.utils.Logger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class g extends SuspendLambda implements Function2 {
    public final FilterEngine o;

    public g(FilterEngine filterEngine0, Continuation continuation0) {
        this.o = filterEngine0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new g(this.o, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Logger.INSTANCE.log("filterEngine release resource");
        FilterEngine filterEngine0 = this.o;
        GLTexture gLTexture0 = filterEngine0.getInput$filter_release();
        if(gLTexture0 != null) {
            gLTexture0.delete();
        }
        filterEngine0.setInput$filter_release(null);
        FilterChain filterChain0 = filterEngine0.getFilterChain$filter_release();
        if(filterChain0 != null) {
            filterChain0.delete();
        }
        filterEngine0.setFilterChain$filter_release(null);
        EffectFilter effectFilter0 = filterEngine0.getEffectFilter$filter_release();
        if(effectFilter0 != null) {
            effectFilter0.release();
        }
        filterEngine0.setEffectFilter$filter_release(null);
        MosaicChain mosaicChain0 = filterEngine0.getMosaicChain$filter_release();
        if(mosaicChain0 != null) {
            mosaicChain0.delete();
        }
        filterEngine0.setMosaicChain$filter_release(null);
        BlurChain blurChain0 = filterEngine0.getBlurChain$filter_release();
        if(blurChain0 != null) {
            blurChain0.delete();
        }
        filterEngine0.setBlurChain$filter_release(null);
        filterEngine0.getGlResourcesProvider$filter_release().release();
        return Unit.INSTANCE;
    }
}

