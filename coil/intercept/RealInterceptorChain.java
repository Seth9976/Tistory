package coil.intercept;

import coil.EventListener;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.NullRequestData;
import coil.size.Size;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import u5.d;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001C\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001A\u00020\u00012\u0006\u0010\t\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001A\u00020\u00012\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001A\u00020\u00162\u0006\u0010\t\u001A\u00020\u0002H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R\u001A\u0010\t\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001A\u001A\u0004\b&\u0010\u001CR\u001A\u0010\u000B\u001A\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*R\u0017\u0010\r\u001A\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.R\u0017\u0010\u000F\u001A\u00020\u000E8\u0006¢\u0006\f\n\u0004\b/\u00100\u001A\u0004\b\u000F\u00101¨\u00062"}, d2 = {"Lcoil/intercept/RealInterceptorChain;", "Lcoil/intercept/Interceptor$Chain;", "Lcoil/request/ImageRequest;", "initialRequest", "", "Lcoil/intercept/Interceptor;", "interceptors", "", "index", "request", "Lcoil/size/Size;", "size", "Lcoil/EventListener;", "eventListener", "", "isPlaceholderCached", "<init>", "(Lcoil/request/ImageRequest;Ljava/util/List;ILcoil/request/ImageRequest;Lcoil/size/Size;Lcoil/EventListener;Z)V", "withRequest", "(Lcoil/request/ImageRequest;)Lcoil/intercept/Interceptor$Chain;", "withSize", "(Lcoil/size/Size;)Lcoil/intercept/Interceptor$Chain;", "Lcoil/request/ImageResult;", "proceed", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lcoil/request/ImageRequest;", "getInitialRequest", "()Lcoil/request/ImageRequest;", "b", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "c", "I", "getIndex", "()I", "d", "getRequest", "e", "Lcoil/size/Size;", "getSize", "()Lcoil/size/Size;", "f", "Lcoil/EventListener;", "getEventListener", "()Lcoil/EventListener;", "g", "Z", "()Z", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RealInterceptorChain implements Chain {
    public final ImageRequest a;
    public final List b;
    public final int c;
    public final ImageRequest d;
    public final Size e;
    public final EventListener f;
    public final boolean g;

    public RealInterceptorChain(@NotNull ImageRequest imageRequest0, @NotNull List list0, int v, @NotNull ImageRequest imageRequest1, @NotNull Size size0, @NotNull EventListener eventListener0, boolean z) {
        this.a = imageRequest0;
        this.b = list0;
        this.c = v;
        this.d = imageRequest1;
        this.e = size0;
        this.f = eventListener0;
        this.g = z;
    }

    public final void a(ImageRequest imageRequest0, Interceptor interceptor0) {
        ImageRequest imageRequest1 = this.a;
        if(imageRequest0.getContext() != imageRequest1.getContext()) {
            throw new IllegalStateException(("Interceptor \'" + interceptor0 + "\' cannot modify the request\'s context.").toString());
        }
        if(imageRequest0.getData() == NullRequestData.INSTANCE) {
            throw new IllegalStateException(("Interceptor \'" + interceptor0 + "\' cannot set the request\'s data to null.").toString());
        }
        if(imageRequest0.getTarget() != imageRequest1.getTarget()) {
            throw new IllegalStateException(("Interceptor \'" + interceptor0 + "\' cannot modify the request\'s target.").toString());
        }
        if(imageRequest0.getLifecycle() != imageRequest1.getLifecycle()) {
            throw new IllegalStateException(("Interceptor \'" + interceptor0 + "\' cannot modify the request\'s lifecycle.").toString());
        }
        if(imageRequest0.getSizeResolver() != imageRequest1.getSizeResolver()) {
            throw new IllegalStateException(("Interceptor \'" + interceptor0 + "\' cannot modify the request\'s size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
        }
    }

    public static RealInterceptorChain b(RealInterceptorChain realInterceptorChain0, int v, ImageRequest imageRequest0, Size size0, int v1) {
        if((v1 & 1) != 0) {
            v = realInterceptorChain0.c;
        }
        if((v1 & 2) != 0) {
            imageRequest0 = realInterceptorChain0.getRequest();
        }
        if((v1 & 4) != 0) {
            size0 = realInterceptorChain0.getSize();
        }
        return new RealInterceptorChain(realInterceptorChain0.a, realInterceptorChain0.b, v, imageRequest0, size0, realInterceptorChain0.f, realInterceptorChain0.g);
    }

    @NotNull
    public final EventListener getEventListener() {
        return this.f;
    }

    public final int getIndex() {
        return this.c;
    }

    @NotNull
    public final ImageRequest getInitialRequest() {
        return this.a;
    }

    @NotNull
    public final List getInterceptors() {
        return this.b;
    }

    @Override  // coil.intercept.Interceptor$Chain
    @NotNull
    public ImageRequest getRequest() {
        return this.d;
    }

    @Override  // coil.intercept.Interceptor$Chain
    @NotNull
    public Size getSize() {
        return this.e;
    }

    public final boolean isPlaceholderCached() {
        return this.g;
    }

    @Override  // coil.intercept.Interceptor$Chain
    @Nullable
    public Object proceed(@NotNull ImageRequest imageRequest0, @NotNull Continuation continuation0) {
        Interceptor interceptor1;
        RealInterceptorChain realInterceptorChain1;
        d d0;
        if(continuation0 instanceof d) {
            d0 = (d)continuation0;
            int v = d0.s;
            if((v & 0x80000000) == 0) {
                d0 = new d(this, continuation0);
            }
            else {
                d0.s = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(this, continuation0);
        }
        Object object0 = d0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(d0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                List list0 = this.b;
                int v1 = this.c;
                if(v1 > 0) {
                    this.a(imageRequest0, ((Interceptor)list0.get(v1 - 1)));
                }
                Interceptor interceptor0 = (Interceptor)list0.get(v1);
                RealInterceptorChain realInterceptorChain0 = RealInterceptorChain.b(this, v1 + 1, imageRequest0, null, 4);
                d0.o = this;
                d0.p = interceptor0;
                d0.s = 1;
                Object object2 = interceptor0.intercept(realInterceptorChain0, d0);
                if(object2 == object1) {
                    return object1;
                }
                realInterceptorChain1 = this;
                object0 = object2;
                interceptor1 = interceptor0;
                break;
            }
            case 1: {
                interceptor1 = d0.p;
                realInterceptorChain1 = d0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        realInterceptorChain1.a(((ImageResult)object0).getRequest(), interceptor1);
        return (ImageResult)object0;
    }

    @Override  // coil.intercept.Interceptor$Chain
    @NotNull
    public Chain withRequest(@NotNull ImageRequest imageRequest0) {
        int v = this.c;
        if(v > 0) {
            this.a(imageRequest0, ((Interceptor)this.b.get(v - 1)));
        }
        return RealInterceptorChain.b(this, 0, imageRequest0, null, 5);
    }

    @Override  // coil.intercept.Interceptor$Chain
    @NotNull
    public Chain withSize(@NotNull Size size0) {
        return RealInterceptorChain.b(this, 0, null, size0, 3);
    }
}

