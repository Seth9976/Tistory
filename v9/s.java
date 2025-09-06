package v9;

import android.opengl.GLES20;
import com.kakao.kandinsky.core.filter.ViewFilterEngine;
import com.kakao.kandinsky.core.filter.filter.BaseFilter;
import com.kakao.kandinsky.core.filter.filter.BlurChain;
import com.kakao.kandinsky.core.filter.filter.EffectFilter;
import com.kakao.kandinsky.core.filter.filter.FilterChain;
import com.kakao.kandinsky.core.filter.filter.MosaicChain;
import com.kakao.kandinsky.core.filter.gl.GLTexture;
import com.kakao.kandinsky.core.filter.gl.GLTools;
import com.kakao.kandinsky.core.filter.io.SurfaceOutput;
import com.kakao.kandinsky.utils.Logger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class s extends SuspendLambda implements Function2 {
    public int o;
    public final Function2 p;
    public final ViewFilterEngine q;
    public final Function0 r;

    public s(Function2 function20, ViewFilterEngine viewFilterEngine0, Function0 function00, Continuation continuation0) {
        this.p = function20;
        this.q = viewFilterEngine0;
        this.r = function00;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new s(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((s)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        GLTexture gLTexture5;
        GLTexture gLTexture4;
        GLTexture gLTexture3;
        GLTexture gLTexture2;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        ViewFilterEngine viewFilterEngine0 = this.q;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                object0 = this.p.invoke(viewFilterEngine0, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Boolean)object0).booleanValue()) {
            try {
                Logger logger0 = Logger.INSTANCE;
                GLTexture gLTexture0 = viewFilterEngine0.getInput$filter_release();
                SurfaceOutput surfaceOutput0 = viewFilterEngine0.l;
                logger0.log("engine execute input-" + viewFilterEngine0.getInput$filter_release() + " " + (gLTexture0 == null ? null : gLTexture0.getSize()) + "\nchain-" + viewFilterEngine0.getFilterChain$filter_release() + "\neffect-" + viewFilterEngine0.getEffectFilter$filter_release() + "output-" + viewFilterEngine0.l + " " + (surfaceOutput0 == null ? null : surfaceOutput0.getOutputSize()));
                GLTexture gLTexture1 = viewFilterEngine0.getInput$filter_release();
                if(gLTexture1 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                SurfaceOutput surfaceOutput1 = viewFilterEngine0.l;
                if(surfaceOutput1 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if(surfaceOutput1.getOutputSize().getWidth() <= 0 || surfaceOutput1.getOutputSize().getHeight() <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                FilterChain filterChain0 = viewFilterEngine0.getFilterChain$filter_release();
                if(filterChain0 == null) {
                    gLTexture2 = gLTexture1;
                }
                else {
                    gLTexture2 = filterChain0.execute(gLTexture1, viewFilterEngine0.getFilterIntensity());
                    if(gLTexture2 == null) {
                        gLTexture2 = gLTexture1;
                    }
                }
                EffectFilter effectFilter0 = viewFilterEngine0.getEffectFilter$filter_release();
                if(effectFilter0 == null) {
                    gLTexture3 = gLTexture2;
                }
                else {
                    gLTexture3 = BaseFilter.execute$default(effectFilter0, gLTexture2, 0.0f, 2, null);
                    if(gLTexture3 == null) {
                        gLTexture3 = gLTexture2;
                    }
                }
                BlurChain blurChain0 = viewFilterEngine0.getBlurChain$filter_release();
                if(blurChain0 == null) {
                    gLTexture4 = gLTexture3;
                }
                else {
                    gLTexture4 = blurChain0.execute(gLTexture3);
                    if(gLTexture4 == null) {
                        gLTexture4 = gLTexture3;
                    }
                }
                MosaicChain mosaicChain0 = viewFilterEngine0.getMosaicChain$filter_release();
                if(mosaicChain0 == null) {
                    gLTexture5 = gLTexture4;
                }
                else {
                    gLTexture5 = mosaicChain0.execute(gLTexture4);
                    if(gLTexture5 == null) {
                        gLTexture5 = gLTexture4;
                    }
                }
                surfaceOutput1.execute(gLTexture5);
                if(!Intrinsics.areEqual(gLTexture5, gLTexture1) && !Intrinsics.areEqual(gLTexture5, gLTexture4)) {
                    viewFilterEngine0.getGlResourcesProvider$filter_release().releaseTexture(gLTexture5);
                }
                if(!Intrinsics.areEqual(gLTexture4, gLTexture1) && !Intrinsics.areEqual(gLTexture4, gLTexture3)) {
                    viewFilterEngine0.getGlResourcesProvider$filter_release().releaseTexture(gLTexture4);
                }
                if(!Intrinsics.areEqual(gLTexture3, gLTexture1) && !Intrinsics.areEqual(gLTexture3, gLTexture2)) {
                    viewFilterEngine0.getGlResourcesProvider$filter_release().releaseTexture(gLTexture3);
                }
                if(!Intrinsics.areEqual(gLTexture2, gLTexture1)) {
                    viewFilterEngine0.getGlResourcesProvider$filter_release().releaseTexture(gLTexture2);
                }
                GLES20.glFlush();
                viewFilterEngine0.getGlContext$filter_release().swapBuffer();
                GLTools.INSTANCE.checkGLError("engine execute", true);
                logger0.log("view engine execute complete");
                goto label_67;
            }
            catch(Exception exception0) {
            }
            Logger.INSTANCE.error("exception " + exception0);
        }
    label_67:
        this.r.invoke();
        return Unit.INSTANCE;
    }
}

