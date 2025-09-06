package coil.intercept;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import coil.ComponentRegistry.Builder;
import coil.ComponentRegistry;
import coil.EventListener;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.DecodeResult;
import coil.decode.Decoder.Factory;
import coil.decode.Decoder;
import coil.decode.FileImageSource;
import coil.decode.ImageSource;
import coil.fetch.DrawableResult;
import coil.fetch.FetchResult;
import coil.fetch.Fetcher;
import coil.fetch.SourceResult;
import coil.memory.MemoryCache.Key;
import coil.memory.MemoryCache.Value;
import coil.memory.MemoryCacheService;
import coil.request.ImageRequest;
import coil.request.Options;
import coil.request.RequestService;
import coil.size.Size;
import coil.util.-Bitmaps;
import coil.util.-Utils;
import coil.util.DrawableUtils;
import coil.util.Logger;
import coil.util.SystemCallbacks;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import u5.b;
import u5.c;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001C2\u00020\u0001:\u0002\u001C\u001DB)\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000BJ\u0018\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0096@¢\u0006\u0004\b\u000F\u0010\u0010J0\u0010\u001B\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u0017H\u0081@¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001E"}, d2 = {"Lcoil/intercept/EngineInterceptor;", "Lcoil/intercept/Interceptor;", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/util/SystemCallbacks;", "systemCallbacks", "Lcoil/request/RequestService;", "requestService", "Lcoil/util/Logger;", "logger", "<init>", "(Lcoil/ImageLoader;Lcoil/util/SystemCallbacks;Lcoil/request/RequestService;Lcoil/util/Logger;)V", "Lcoil/intercept/Interceptor$Chain;", "chain", "Lcoil/request/ImageResult;", "intercept", "(Lcoil/intercept/Interceptor$Chain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcoil/intercept/EngineInterceptor$ExecuteResult;", "result", "Lcoil/request/ImageRequest;", "request", "Lcoil/request/Options;", "options", "Lcoil/EventListener;", "eventListener", "transform$coil_base_release", "(Lcoil/intercept/EngineInterceptor$ExecuteResult;Lcoil/request/ImageRequest;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transform", "Companion", "ExecuteResult", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEngineInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Utils.kt\ncoil/util/-Utils\n+ 4 Logs.kt\ncoil/util/-Logs\n*L\n1#1,306:1\n1#2:307\n1#2:309\n1#2:311\n184#3:308\n188#3:310\n21#4,4:312\n21#4,4:316\n21#4,4:320\n*S KotlinDebug\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor\n*L\n120#1:309\n121#1:311\n120#1:308\n121#1:310\n234#1:312,4\n266#1:316,4\n272#1:320,4\n*E\n"})
public final class EngineInterceptor implements Interceptor {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/intercept/EngineInterceptor$Companion;", "", "", "TAG", "Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0015\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000BJ7\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0005\u0010\u0014R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u0019\u0010\t\u001A\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001D"}, d2 = {"Lcoil/intercept/EngineInterceptor$ExecuteResult;", "", "Landroid/graphics/drawable/Drawable;", "drawable", "", "isSampled", "Lcoil/decode/DataSource;", "dataSource", "", "diskCacheKey", "<init>", "(Landroid/graphics/drawable/Drawable;ZLcoil/decode/DataSource;Ljava/lang/String;)V", "copy", "(Landroid/graphics/drawable/Drawable;ZLcoil/decode/DataSource;Ljava/lang/String;)Lcoil/intercept/EngineInterceptor$ExecuteResult;", "a", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "b", "Z", "()Z", "c", "Lcoil/decode/DataSource;", "getDataSource", "()Lcoil/decode/DataSource;", "d", "Ljava/lang/String;", "getDiskCacheKey", "()Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ExecuteResult {
        public final Drawable a;
        public final boolean b;
        public final DataSource c;
        public final String d;

        public ExecuteResult(@NotNull Drawable drawable0, boolean z, @NotNull DataSource dataSource0, @Nullable String s) {
            this.a = drawable0;
            this.b = z;
            this.c = dataSource0;
            this.d = s;
        }

        @NotNull
        public final ExecuteResult copy(@NotNull Drawable drawable0, boolean z, @NotNull DataSource dataSource0, @Nullable String s) {
            return new ExecuteResult(drawable0, z, dataSource0, s);
        }

        public static ExecuteResult copy$default(ExecuteResult engineInterceptor$ExecuteResult0, Drawable drawable0, boolean z, DataSource dataSource0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                drawable0 = engineInterceptor$ExecuteResult0.a;
            }
            if((v & 2) != 0) {
                z = engineInterceptor$ExecuteResult0.b;
            }
            if((v & 4) != 0) {
                dataSource0 = engineInterceptor$ExecuteResult0.c;
            }
            if((v & 8) != 0) {
                s = engineInterceptor$ExecuteResult0.d;
            }
            return engineInterceptor$ExecuteResult0.copy(drawable0, z, dataSource0, s);
        }

        @NotNull
        public final DataSource getDataSource() {
            return this.c;
        }

        @Nullable
        public final String getDiskCacheKey() {
            return this.d;
        }

        @NotNull
        public final Drawable getDrawable() {
            return this.a;
        }

        public final boolean isSampled() {
            return this.b;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final ImageLoader a;
    public final SystemCallbacks b;
    public final RequestService c;
    public final Logger d;
    public final MemoryCacheService e;

    static {
        EngineInterceptor.Companion = new Companion(null);
    }

    public EngineInterceptor(@NotNull ImageLoader imageLoader0, @NotNull SystemCallbacks systemCallbacks0, @NotNull RequestService requestService0, @Nullable Logger logger0) {
        this.a = imageLoader0;
        this.b = systemCallbacks0;
        this.c = requestService0;
        this.d = logger0;
        this.e = new MemoryCacheService(imageLoader0, requestService0, logger0);
    }

    public final Object a(ComponentRegistry componentRegistry0, ImageRequest imageRequest0, Object object0, Options options0, EventListener eventListener0, Continuation continuation0) {
        c c1;
        int v3;
        EngineInterceptor engineInterceptor0;
        int v1;
        c c0;
        if(continuation0 instanceof c) {
            c0 = (c)continuation0;
            int v = c0.y;
            if((v & 0x80000000) == 0) {
                c0 = new c(this, continuation0);
            }
            else {
                c0.y = v ^ 0x80000000;
            }
        }
        else {
            c0 = new c(this, continuation0);
        }
        Object object1 = c0.w;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(c0.y) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                v1 = 0;
                engineInterceptor0 = this;
                goto label_35;
            }
            case 1: {
                int v2 = c0.v;
                EventListener eventListener1 = c0.t;
                options0 = c0.s;
                Object object3 = c0.r;
                ImageRequest imageRequest1 = c0.q;
                ComponentRegistry componentRegistry1 = c0.p;
                engineInterceptor0 = c0.o;
                ResultKt.throwOnFailure(object1);
                v3 = v2;
                componentRegistry0 = componentRegistry1;
                c1 = c0;
                imageRequest0 = imageRequest1;
                eventListener0 = eventListener1;
                object0 = object3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            if(((FetchResult)object1) != null) {
                return (FetchResult)object1;
            }
            v1 = v3;
            c0 = c1;
        label_35:
            Pair pair0 = componentRegistry0.newFetcher(object0, options0, engineInterceptor0.a, v1);
            if(pair0 == null) {
                break;
            }
            Fetcher fetcher0 = (Fetcher)pair0.getFirst();
            int v4 = ((Number)pair0.getSecond()).intValue();
            c0.o = engineInterceptor0;
            c0.p = componentRegistry0;
            c0.q = imageRequest0;
            c0.r = object0;
            c0.s = options0;
            c0.t = eventListener0;
            c0.u = fetcher0;
            c0.v = v4 + 1;
            c0.y = 1;
            Object object4 = fetcher0.fetch(c0);
            if(object4 == object2) {
                return object2;
            }
            v3 = v4 + 1;
            object1 = object4;
            c1 = c0;
        }
        throw new IllegalStateException(("Unable to create a fetcher that supports: " + object0).toString());
    }

    public static final Bitmap access$convertDrawableToBitmap(EngineInterceptor engineInterceptor0, Drawable drawable0, Options options0, List list0) {
        engineInterceptor0.getClass();
        Logger logger0 = engineInterceptor0.d;
        if(drawable0 instanceof BitmapDrawable) {
            Bitmap bitmap0 = ((BitmapDrawable)drawable0).getBitmap();
            Bitmap.Config bitmap$Config0 = -Bitmaps.getSafeConfig(bitmap0);
            if(ArraysKt___ArraysKt.contains(-Utils.getVALID_TRANSFORMATION_CONFIGS(), bitmap$Config0)) {
                return bitmap0;
            }
            if(logger0 != null && logger0.getLevel() <= 4) {
                logger0.log("EngineInterceptor", 4, "Converting bitmap with config " + bitmap$Config0 + " to apply transformations: " + list0 + '.', null);
                return DrawableUtils.INSTANCE.convertToBitmap(drawable0, options0.getConfig(), options0.getSize(), options0.getScale(), options0.getAllowInexactSize());
            }
        }
        else if(logger0 != null && logger0.getLevel() <= 4) {
            logger0.log("EngineInterceptor", 4, "Converting drawable of type " + drawable0.getClass().getCanonicalName() + " to apply transformations: " + list0 + '.', null);
        }
        return DrawableUtils.INSTANCE.convertToBitmap(drawable0, options0.getConfig(), options0.getSize(), options0.getScale(), options0.getAllowInexactSize());
    }

    public static final Object access$decode(EngineInterceptor engineInterceptor0, SourceResult sourceResult0, ComponentRegistry componentRegistry0, ImageRequest imageRequest0, Object object0, Options options0, EventListener eventListener0, Continuation continuation0) {
        u5.a a1;
        int v3;
        SourceResult sourceResult1;
        int v1;
        u5.a a0;
        engineInterceptor0.getClass();
        if(continuation0 instanceof u5.a) {
            a0 = (u5.a)continuation0;
            int v = a0.z;
            if((v & 0x80000000) == 0) {
                a0 = new u5.a(engineInterceptor0, continuation0);
            }
            else {
                a0.z = v ^ 0x80000000;
            }
        }
        else {
            a0 = new u5.a(engineInterceptor0, continuation0);
        }
        Object object1 = a0.x;
        ExecuteResult engineInterceptor$ExecuteResult0 = a.getCOROUTINE_SUSPENDED();
        switch(a0.z) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                v1 = 0;
                goto label_46;
            }
            case 1: {
                int v2 = a0.w;
                EventListener eventListener1 = a0.u;
                Options options1 = a0.t;
                object0 = a0.s;
                ImageRequest imageRequest1 = a0.r;
                ComponentRegistry componentRegistry1 = a0.q;
                sourceResult1 = a0.p;
                EngineInterceptor engineInterceptor1 = a0.o;
                ResultKt.throwOnFailure(object1);
                v3 = v2;
                engineInterceptor0 = engineInterceptor1;
                a1 = a0;
                eventListener0 = eventListener1;
                componentRegistry0 = componentRegistry1;
                options0 = options1;
                imageRequest0 = imageRequest1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            if(((DecodeResult)object1) != null) {
                Drawable drawable0 = ((DecodeResult)object1).getDrawable();
                boolean z = ((DecodeResult)object1).isSampled();
                DataSource dataSource0 = sourceResult1.getDataSource();
                ImageSource imageSource0 = sourceResult1.getSource();
                String s = null;
                FileImageSource fileImageSource0 = imageSource0 instanceof FileImageSource ? ((FileImageSource)imageSource0) : null;
                if(fileImageSource0 != null) {
                    s = fileImageSource0.getDiskCacheKey$coil_base_release();
                }
                return new ExecuteResult(drawable0, z, dataSource0, s);
            }
            v1 = v3;
            sourceResult0 = sourceResult1;
            a0 = a1;
        label_46:
            Pair pair0 = componentRegistry0.newDecoder(sourceResult0, options0, engineInterceptor0.a, v1);
            if(pair0 == null) {
                break;
            }
            Decoder decoder0 = (Decoder)pair0.getFirst();
            int v4 = ((Number)pair0.getSecond()).intValue();
            a0.o = engineInterceptor0;
            a0.p = sourceResult0;
            a0.q = componentRegistry0;
            a0.r = imageRequest0;
            a0.s = object0;
            a0.t = options0;
            a0.u = eventListener0;
            a0.v = decoder0;
            a0.w = v4 + 1;
            a0.z = 1;
            Object object2 = decoder0.decode(a0);
            if(object2 != engineInterceptor$ExecuteResult0) {
                sourceResult1 = sourceResult0;
                v3 = v4 + 1;
                object1 = object2;
                a1 = a0;
                continue;
            }
            return engineInterceptor$ExecuteResult0;
        }
        throw new IllegalStateException(("Unable to create a decoder that supports: " + object0).toString());
    }

    public static final Object access$execute(EngineInterceptor engineInterceptor0, ImageRequest imageRequest0, Object object0, Options options0, EventListener eventListener0, Continuation continuation0) {
        ExecuteResult engineInterceptor$ExecuteResult1;
        ImageRequest imageRequest2;
        EventListener eventListener2;
        ObjectRef ref$ObjectRef8;
        ObjectRef ref$ObjectRef6;
        EngineInterceptor engineInterceptor1;
        ObjectRef ref$ObjectRef5;
        ObjectRef ref$ObjectRef4;
        EventListener eventListener1;
        Object object2;
        ImageRequest imageRequest1;
        ObjectRef ref$ObjectRef3;
        b b0;
        engineInterceptor0.getClass();
        if(continuation0 instanceof b) {
            b0 = (b)continuation0;
            int v = b0.y;
            if((v & 0x80000000) == 0) {
                b0 = new b(engineInterceptor0, continuation0);
            }
            else {
                b0.y = v ^ 0x80000000;
            }
        }
        else {
            b0 = new b(engineInterceptor0, continuation0);
        }
        Object object1 = b0.w;
        ExecuteResult engineInterceptor$ExecuteResult0 = a.getCOROUTINE_SUSPENDED();
        SourceResult sourceResult0 = null;
        switch(b0.y) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                ref$ObjectRef0.element = options0;
                ObjectRef ref$ObjectRef1 = new ObjectRef();
                ref$ObjectRef1.element = engineInterceptor0.a.getComponents();
                ObjectRef ref$ObjectRef2 = new ObjectRef();
                try {
                    ref$ObjectRef0.element = engineInterceptor0.c.updateOptionsOnWorkerThread(((Options)ref$ObjectRef0.element));
                    if(imageRequest0.getFetcherFactory() != null || imageRequest0.getDecoderFactory() != null) {
                        Builder componentRegistry$Builder0 = ((ComponentRegistry)ref$ObjectRef1.element).newBuilder();
                        Pair pair0 = imageRequest0.getFetcherFactory();
                        if(pair0 != null) {
                            componentRegistry$Builder0.getFetcherFactories$coil_base_release().add(0, pair0);
                        }
                        Factory decoder$Factory0 = imageRequest0.getDecoderFactory();
                        if(decoder$Factory0 != null) {
                            componentRegistry$Builder0.getDecoderFactories$coil_base_release().add(0, decoder$Factory0);
                        }
                        ref$ObjectRef1.element = componentRegistry$Builder0.build();
                    }
                    b0.o = engineInterceptor0;
                    b0.p = imageRequest0;
                    b0.q = object0;
                    b0.r = eventListener0;
                    b0.s = ref$ObjectRef0;
                    b0.t = ref$ObjectRef1;
                    b0.u = ref$ObjectRef2;
                    b0.v = ref$ObjectRef2;
                    b0.y = 1;
                    object1 = engineInterceptor0.a(((ComponentRegistry)ref$ObjectRef1.element), imageRequest0, object0, ((Options)ref$ObjectRef0.element), eventListener0, b0);
                }
                catch(Throwable throwable0) {
                    ref$ObjectRef3 = ref$ObjectRef2;
                    goto label_129;
                }
                if(object1 != engineInterceptor$ExecuteResult0) {
                    imageRequest1 = imageRequest0;
                    object2 = object0;
                    eventListener1 = eventListener0;
                    ref$ObjectRef4 = ref$ObjectRef0;
                    ref$ObjectRef5 = ref$ObjectRef1;
                    ref$ObjectRef3 = ref$ObjectRef2;
                    engineInterceptor1 = engineInterceptor0;
                    ref$ObjectRef6 = ref$ObjectRef3;
                    goto label_66;
                }
                break;
            }
            case 1: {
                ref$ObjectRef6 = b0.v;
                ref$ObjectRef3 = b0.u;
                ObjectRef ref$ObjectRef7 = b0.t;
                ref$ObjectRef4 = b0.s;
                eventListener1 = (EventListener)b0.r;
                Object object3 = b0.q;
                imageRequest1 = b0.p;
                engineInterceptor1 = b0.o;
                try {
                    ResultKt.throwOnFailure(object1);
                    ref$ObjectRef5 = ref$ObjectRef7;
                    object2 = object3;
                label_66:
                    ref$ObjectRef6.element = object1;
                    Object object4 = ref$ObjectRef3.element;
                    if(((FetchResult)object4) instanceof SourceResult) {
                        coil.intercept.a a0 = new coil.intercept.a(engineInterceptor1, ref$ObjectRef3, ref$ObjectRef5, imageRequest1, object2, ref$ObjectRef4, eventListener1, null);
                        b0.o = engineInterceptor1;
                        b0.p = imageRequest1;
                        b0.q = eventListener1;
                        b0.r = ref$ObjectRef4;
                        b0.s = ref$ObjectRef3;
                        b0.t = null;
                        b0.u = null;
                        b0.v = null;
                        b0.y = 2;
                        object1 = BuildersKt.withContext(imageRequest1.getDecoderDispatcher(), a0, b0);
                        if(object1 != engineInterceptor$ExecuteResult0) {
                            ref$ObjectRef8 = ref$ObjectRef4;
                            eventListener2 = eventListener1;
                            imageRequest2 = imageRequest1;
                            engineInterceptor$ExecuteResult1 = (ExecuteResult)object1;
                            goto label_101;
                        }
                    }
                    else {
                        if(!(((FetchResult)object4) instanceof DrawableResult)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        engineInterceptor$ExecuteResult1 = new ExecuteResult(((DrawableResult)object4).getDrawable(), ((DrawableResult)ref$ObjectRef3.element).isSampled(), ((DrawableResult)ref$ObjectRef3.element).getDataSource(), null);
                        ref$ObjectRef8 = ref$ObjectRef4;
                        eventListener2 = eventListener1;
                        imageRequest2 = imageRequest1;
                        goto label_101;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_129;
                }
            }
            case 2: {
                ref$ObjectRef3 = b0.s;
                ref$ObjectRef8 = (ObjectRef)b0.r;
                eventListener2 = (EventListener)b0.q;
                imageRequest2 = b0.p;
                EngineInterceptor engineInterceptor2 = b0.o;
                try {
                    ResultKt.throwOnFailure(object1);
                    engineInterceptor$ExecuteResult1 = (ExecuteResult)object1;
                    engineInterceptor1 = engineInterceptor2;
                }
                catch(Throwable throwable0) {
                    goto label_129;
                }
            label_101:
                SourceResult sourceResult1 = ref$ObjectRef3.element instanceof SourceResult ? ((SourceResult)ref$ObjectRef3.element) : null;
                if(sourceResult1 != null) {
                    ImageSource imageSource0 = sourceResult1.getSource();
                    if(imageSource0 != null) {
                        -Utils.closeQuietly(imageSource0);
                    }
                }
                b0.o = null;
                b0.p = null;
                b0.q = null;
                b0.r = null;
                b0.s = null;
                b0.t = null;
                b0.u = null;
                b0.v = null;
                b0.y = 3;
                object1 = engineInterceptor1.transform$coil_base_release(engineInterceptor$ExecuteResult1, imageRequest2, ((Options)ref$ObjectRef8.element), eventListener2, b0);
                if(object1 != engineInterceptor$ExecuteResult0) {
                    goto label_119;
                }
                break;
            }
            case 3: {
                ResultKt.throwOnFailure(object1);
            label_119:
                engineInterceptor$ExecuteResult0 = (ExecuteResult)object1;
                Drawable drawable0 = engineInterceptor$ExecuteResult0.getDrawable();
                if(drawable0 instanceof BitmapDrawable) {
                    sourceResult0 = (BitmapDrawable)drawable0;
                }
                if(sourceResult0 != null) {
                    Bitmap bitmap0 = ((BitmapDrawable)sourceResult0).getBitmap();
                    if(bitmap0 != null) {
                        bitmap0.prepareToDraw();
                    }
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            return engineInterceptor$ExecuteResult0;
        }
        catch(Throwable throwable0) {
        }
    label_129:
        Object object5 = ref$ObjectRef3.element;
        if(object5 instanceof SourceResult) {
            sourceResult0 = (SourceResult)object5;
        }
        if(sourceResult0 != null) {
            ImageSource imageSource1 = sourceResult0.getSource();
            if(imageSource1 != null) {
                -Utils.closeQuietly(imageSource1);
            }
        }
        throw throwable0;
    }

    @Override  // coil.intercept.Interceptor
    @Nullable
    public Object intercept(@NotNull Chain interceptor$Chain0, @NotNull Continuation continuation0) {
        Chain interceptor$Chain2;
        EngineInterceptor engineInterceptor0;
        coil.intercept.b b0;
        Chain interceptor$Chain1 = interceptor$Chain0;
        MemoryCacheService memoryCacheService0 = this.e;
        if(continuation0 instanceof coil.intercept.b) {
            b0 = (coil.intercept.b)continuation0;
            int v = b0.s;
            if((v & 0x80000000) == 0) {
                b0 = new coil.intercept.b(this, continuation0);
            }
            else {
                b0.s = v ^ 0x80000000;
            }
        }
        else {
            b0 = new coil.intercept.b(this, continuation0);
        }
        Object object0 = b0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(b0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    ImageRequest imageRequest0 = interceptor$Chain0.getRequest();
                    Size size0 = interceptor$Chain0.getSize();
                    EventListener eventListener0 = -Utils.getEventListener(interceptor$Chain0);
                    Options options0 = this.c.options(imageRequest0, size0);
                    Object object2 = this.a.getComponents().map(imageRequest0.getData(), options0);
                    Key memoryCache$Key0 = memoryCacheService0.newCacheKey(imageRequest0, object2, options0, eventListener0);
                    Value memoryCache$Value0 = memoryCache$Key0 == null ? null : memoryCacheService0.getCacheValue(imageRequest0, memoryCache$Key0, size0, options0.getScale());
                    if(memoryCache$Value0 != null) {
                        return memoryCacheService0.newResult(interceptor$Chain1, imageRequest0, memoryCache$Key0, memoryCache$Value0);
                    }
                    coil.intercept.c c0 = new coil.intercept.c(this, imageRequest0, object2, options0, eventListener0, memoryCache$Key0, interceptor$Chain0, null);
                    b0.o = this;
                    b0.p = interceptor$Chain1;
                    b0.s = 1;
                    object0 = BuildersKt.withContext(imageRequest0.getFetcherDispatcher(), c0, b0);
                    return object0 == object1 ? object1 : object0;
                }
                catch(Throwable throwable0) {
                    engineInterceptor0 = this;
                    goto label_40;
                }
            }
            case 1: {
                try {
                    interceptor$Chain2 = b0.p;
                    engineInterceptor0 = b0.o;
                    ResultKt.throwOnFailure(object0);
                    return object0;
                }
                catch(Throwable throwable0) {
                    interceptor$Chain1 = interceptor$Chain2;
                }
            label_40:
                if(throwable0 instanceof CancellationException) {
                    throw throwable0;
                }
                ImageRequest imageRequest1 = interceptor$Chain1.getRequest();
                return engineInterceptor0.c.errorResult(imageRequest1, throwable0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @VisibleForTesting
    @Nullable
    public final Object transform$coil_base_release(@NotNull ExecuteResult engineInterceptor$ExecuteResult0, @NotNull ImageRequest imageRequest0, @NotNull Options options0, @NotNull EventListener eventListener0, @NotNull Continuation continuation0) {
        List list0 = imageRequest0.getTransformations();
        if(list0.isEmpty()) {
            return engineInterceptor$ExecuteResult0;
        }
        if(!(engineInterceptor$ExecuteResult0.getDrawable() instanceof BitmapDrawable) && !imageRequest0.getAllowConversionToBitmap()) {
            Logger logger0 = this.d;
            if(logger0 != null && logger0.getLevel() <= 4) {
                logger0.log("EngineInterceptor", 4, a5.b.j("allowConversionToBitmap=false, skipping transformations for type ", '.', engineInterceptor$ExecuteResult0.getDrawable().getClass().getCanonicalName()), null);
            }
            return engineInterceptor$ExecuteResult0;
        }
        return BuildersKt.withContext(imageRequest0.getTransformationDispatcher(), new d(this, engineInterceptor$ExecuteResult0, options0, list0, eventListener0, imageRequest0, null), continuation0);
    }
}

