package v9;

import android.graphics.Bitmap;
import android.util.Size;
import com.kakao.kandinsky.core.filter.BitmapFilterEngine;
import com.kakao.kandinsky.core.filter.filter.BaseFilter;
import com.kakao.kandinsky.core.filter.filter.BlurChain;
import com.kakao.kandinsky.core.filter.filter.EffectFilter;
import com.kakao.kandinsky.core.filter.filter.FilterChain;
import com.kakao.kandinsky.core.filter.filter.MosaicChain;
import com.kakao.kandinsky.core.filter.gl.GLTexture;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.Effect;
import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.utils.Logger;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

public final class a extends SuspendLambda implements Function2 {
    public int o;
    public final BitmapFilterEngine p;
    public final Bitmap q;
    public final Filter r;
    public final float s;
    public final Effect t;
    public final Blur u;
    public final List v;

    public a(BitmapFilterEngine bitmapFilterEngine0, Bitmap bitmap0, Filter filter0, float f, Effect effect0, Blur blur0, List list0, Continuation continuation0) {
        this.p = bitmapFilterEngine0;
        this.q = bitmap0;
        this.r = filter0;
        this.s = f;
        this.t = effect0;
        this.u = blur0;
        this.v = list0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a(this.p, this.q, this.r, this.s, this.t, this.u, this.v, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Bitmap bitmap2;
        GLTexture gLTexture4;
        GLTexture gLTexture3;
        GLTexture gLTexture2;
        GLTexture gLTexture1;
        BitmapFilterEngine bitmapFilterEngine0;
        Bitmap bitmap0;
        Filter filter0;
        float f;
        Object object1;
        try {
            object1 = qd.a.getCOROUTINE_SUSPENDED();
            f = this.s;
            filter0 = this.r;
            bitmap0 = this.q;
            bitmapFilterEngine0 = this.p;
            switch(this.o) {
                case 0: {
                    goto label_7;
                }
                case 1: {
                    goto label_11;
                }
                case 2: {
                    goto label_15;
                }
                case 3: {
                    goto label_19;
                }
                case 4: {
                    goto label_23;
                }
                case 5: {
                    goto label_28;
                }
                case 6: {
                    goto label_33;
                }
            }
        }
        catch(Exception exception0) {
            Logger.INSTANCE.error("exception " + exception0 + " " + filter0 + " " + bitmap0 + " ");
            return bitmap0;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_7:
        ResultKt.throwOnFailure(object0);
        try {
            this.o = 1;
            if(bitmapFilterEngine0.updateInput(bitmap0, this) == object1) {
                return object1;
            label_11:
                ResultKt.throwOnFailure(object0);
            }
            this.o = 2;
            if(bitmapFilterEngine0.updateFilter(filter0, this) == object1) {
                return object1;
            label_15:
                ResultKt.throwOnFailure(object0);
            }
            this.o = 3;
            if(bitmapFilterEngine0.updateFilterIntensity(f, this) == object1) {
                return object1;
            label_19:
                ResultKt.throwOnFailure(object0);
            }
            this.o = 4;
            if(bitmapFilterEngine0.updateEffect(this.t, this) == object1) {
                return object1;
            label_23:
                ResultKt.throwOnFailure(object0);
            }
            Size size0 = new Size(bitmap0.getWidth(), bitmap0.getHeight());
            this.o = 5;
            if(bitmapFilterEngine0.updateBlur(this.u, size0, this) == object1) {
                return object1;
            label_28:
                ResultKt.throwOnFailure(object0);
            }
            Size size1 = new Size(bitmap0.getWidth(), bitmap0.getHeight());
            this.o = 6;
            if(bitmapFilterEngine0.updateMosaic(this.v, size1, this) == object1) {
                return object1;
            label_33:
                ResultKt.throwOnFailure(object0);
            }
            GLTexture gLTexture0 = bitmapFilterEngine0.getInput$filter_release();
            if(gLTexture0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            FilterChain filterChain0 = bitmapFilterEngine0.getFilterChain$filter_release();
            if(filterChain0 == null) {
                gLTexture1 = gLTexture0;
            }
            else {
                gLTexture1 = filterChain0.execute(gLTexture0, f);
                if(gLTexture1 == null) {
                    gLTexture1 = gLTexture0;
                }
            }
            EffectFilter effectFilter0 = bitmapFilterEngine0.getEffectFilter$filter_release();
            Bitmap bitmap1 = null;
            if(effectFilter0 == null) {
                gLTexture2 = gLTexture1;
            }
            else {
                gLTexture2 = BaseFilter.execute$default(effectFilter0, gLTexture1, 0.0f, 2, null);
                if(gLTexture2 == null) {
                    gLTexture2 = gLTexture1;
                }
            }
            BlurChain blurChain0 = bitmapFilterEngine0.getBlurChain$filter_release();
            if(blurChain0 == null) {
                gLTexture3 = gLTexture2;
            }
            else {
                gLTexture3 = blurChain0.execute(gLTexture2);
                if(gLTexture3 == null) {
                    gLTexture3 = gLTexture2;
                }
            }
            MosaicChain mosaicChain0 = bitmapFilterEngine0.getMosaicChain$filter_release();
            if(mosaicChain0 == null) {
                gLTexture4 = gLTexture3;
            }
            else {
                gLTexture4 = mosaicChain0.execute(gLTexture3);
                if(gLTexture4 == null) {
                    gLTexture4 = gLTexture3;
                }
            }
            MosaicChain mosaicChain1 = bitmapFilterEngine0.getMosaicChain$filter_release();
            if(mosaicChain1 == null) {
            label_69:
                BlurChain blurChain1 = bitmapFilterEngine0.getBlurChain$filter_release();
                bitmap2 = blurChain1 == null ? null : blurChain1.capture();
                if(bitmap2 == null) {
                    EffectFilter effectFilter1 = bitmapFilterEngine0.getEffectFilter$filter_release();
                    bitmap2 = effectFilter1 == null ? null : effectFilter1.capture();
                    if(bitmap2 == null) {
                        FilterChain filterChain1 = bitmapFilterEngine0.getFilterChain$filter_release();
                        if(filterChain1 != null) {
                            bitmap1 = filterChain1.capture();
                        }
                        bitmap2 = bitmap1 == null ? bitmap0 : bitmap1;
                    }
                }
            }
            else {
                bitmap2 = mosaicChain1.capture();
                if(bitmap2 == null) {
                    goto label_69;
                }
            }
            gLTexture0.delete();
            if(!Intrinsics.areEqual(gLTexture1, gLTexture0)) {
                gLTexture1.delete();
            }
            if(!Intrinsics.areEqual(gLTexture2, gLTexture1)) {
                gLTexture2.delete();
            }
            if(!Intrinsics.areEqual(gLTexture3, gLTexture2)) {
                gLTexture3.delete();
            }
            if(!Intrinsics.areEqual(gLTexture4, gLTexture3)) {
                gLTexture4.delete();
            }
            return bitmap2;
        }
        catch(Exception exception0) {
        }
        Logger.INSTANCE.error("exception " + exception0 + " " + filter0 + " " + bitmap0 + " ");
        return bitmap0;
    }
}

