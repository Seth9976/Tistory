package coil.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.EventListener;
import coil.request.ImageRequest;
import coil.request.Options;
import coil.transform.Transformation;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class d extends SuspendLambda implements Function2 {
    public List o;
    public Options p;
    public int q;
    public int r;
    public int s;
    public Object t;
    public final EngineInterceptor u;
    public final ExecuteResult v;
    public final Options w;
    public final List x;
    public final EventListener y;
    public final ImageRequest z;

    public d(EngineInterceptor engineInterceptor0, ExecuteResult engineInterceptor$ExecuteResult0, Options options0, List list0, EventListener eventListener0, ImageRequest imageRequest0, Continuation continuation0) {
        this.u = engineInterceptor0;
        this.v = engineInterceptor$ExecuteResult0;
        this.w = options0;
        this.x = list0;
        this.y = eventListener0;
        this.z = imageRequest0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new d(this.u, this.v, this.w, this.x, this.y, this.z, continuation0);
        continuation1.t = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        int v1;
        List list0;
        Options options0;
        int v;
        Bitmap bitmap0;
        CoroutineScope coroutineScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        ImageRequest imageRequest0 = this.z;
        switch(this.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                coroutineScope0 = (CoroutineScope)this.t;
                bitmap0 = EngineInterceptor.access$convertDrawableToBitmap(this.u, this.v.getDrawable(), this.w, this.x);
                v = this.x.size();
                options0 = this.w;
                list0 = this.x;
                v1 = 0;
                goto label_21;
            }
            case 1: {
                v = this.r;
                v1 = this.q;
                options0 = this.p;
                list0 = this.o;
                coroutineScope0 = (CoroutineScope)this.t;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            bitmap0 = (Bitmap)object0;
            CoroutineScopeKt.ensureActive(coroutineScope0);
            ++v1;
        label_21:
            if(v1 >= v) {
                break;
            }
            Transformation transformation0 = (Transformation)list0.get(v1);
            this.t = coroutineScope0;
            this.o = list0;
            this.p = options0;
            this.q = v1;
            this.r = v;
            this.s = 1;
            object0 = transformation0.transform(bitmap0, options0.getSize(), this);
            if(object0 != object1) {
                continue;
            }
            return object1;
        }
        BitmapDrawable bitmapDrawable0 = new BitmapDrawable(imageRequest0.getContext().getResources(), bitmap0);
        return ExecuteResult.copy$default(this.v, bitmapDrawable0, false, null, null, 14, null);
    }
}

