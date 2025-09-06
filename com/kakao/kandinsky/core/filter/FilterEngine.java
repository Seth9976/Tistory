package com.kakao.kandinsky.core.filter;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.util.Size;
import androidx.annotation.CallSuper;
import com.kakao.kandinsky.core.filter.filter.BlurChain;
import com.kakao.kandinsky.core.filter.filter.EffectFilter;
import com.kakao.kandinsky.core.filter.filter.FilterChain;
import com.kakao.kandinsky.core.filter.filter.FilterFactory;
import com.kakao.kandinsky.core.filter.filter.MosaicChain;
import com.kakao.kandinsky.core.filter.gl.GLContext;
import com.kakao.kandinsky.core.filter.gl.GLResourcesProvider;
import com.kakao.kandinsky.core.filter.gl.GLTexture;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.Effect;
import com.kakao.kandinsky.core.kdphoto.Filter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import v9.b;
import v9.c;
import v9.d;
import v9.e;
import v9.f;
import v9.g;
import v9.h;
import v9.i;
import v9.j;
import v9.k;
import v9.l;
import v9.m;
import v9.n;

@Metadata(d1 = {"\u0000\u00B0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0086@\u00A2\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u000BH\u0086@\u00A2\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u0011\u001A\u00020\b2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0086@\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u001C\u0010\u0015\u001A\u0004\u0018\u00010\b2\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0086@\u00A2\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u001C\u001A\u00020\b2\u000E\u0010\u0019\u001A\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u001B\u001A\u00020\u001AH\u0086@\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\"\u0010 \u001A\u00020\b2\b\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\u0006\u0010\u001B\u001A\u00020\u001AH\u0086@\u00A2\u0006\u0004\b \u0010!J\u0010\u0010\"\u001A\u00020\bH\u0097@\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001A\u00020\bH\u0086@\u00A2\u0006\u0004\b$\u0010#J?\u0010+\u001A\u00028\u0000\"\u0004\b\u0000\u0010%2\'\u0010*\u001A#\b\u0001\u0012\u0004\u0012\u00020\'\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(\u0012\u0006\u0012\u0004\u0018\u00010\u00010&\u00A2\u0006\u0002\b)H\u0084@\u00A2\u0006\u0004\b+\u0010,R\u001A\u00102\u001A\u00020-8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u00101R\u001A\u00108\u001A\u0002038\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u00107R\"\u0010<\u001A\u0002098\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010H\u001A\u00060@j\u0002`A8\u0004X\u0084\u0004\u00A2\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u0010G\u001A\u0004\bD\u0010ER$\u0010P\u001A\u0004\u0018\u00010I8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010X\u001A\u0004\u0018\u00010Q8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bR\u0010S\u001A\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010_\u001A\u00020\u000B8\u0004@\u0004X\u0084\u000E\u00A2\u0006\u0012\n\u0004\bY\u0010Z\u001A\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010g\u001A\u0004\u0018\u00010`8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\ba\u0010b\u001A\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010o\u001A\u0004\u0018\u00010h8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bi\u0010j\u001A\u0004\bk\u0010l\"\u0004\bm\u0010nR$\u0010w\u001A\u0004\u0018\u00010p8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bq\u0010r\u001A\u0004\bs\u0010t\"\u0004\bu\u0010v\u00A8\u0006x"}, d2 = {"Lcom/kakao/kandinsky/core/filter/FilterEngine;", "", "Landroid/content/res/AssetManager;", "assetManager", "<init>", "(Landroid/content/res/AssetManager;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "updateInput", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "value", "updateFilterIntensity", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/kandinsky/core/kdphoto/Filter;", "filter", "updateFilter", "(Lcom/kakao/kandinsky/core/kdphoto/Filter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/kandinsky/core/kdphoto/Effect;", "effect", "updateEffect", "(Lcom/kakao/kandinsky/core/kdphoto/Effect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "mosaicList", "Landroid/util/Size;", "originBitmapSize", "updateMosaic", "(Ljava/util/List;Landroid/util/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/kandinsky/core/kdphoto/Blur;", "blur", "updateBlur", "(Lcom/kakao/kandinsky/core/kdphoto/Blur;Landroid/util/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "releaseResource", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "T", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "withGLContext", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/kandinsky/core/filter/gl/GLContext;", "a", "Lcom/kakao/kandinsky/core/filter/gl/GLContext;", "getGlContext$filter_release", "()Lcom/kakao/kandinsky/core/filter/gl/GLContext;", "glContext", "Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "b", "Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "getGlResourcesProvider$filter_release", "()Lcom/kakao/kandinsky/core/filter/gl/GLResourcesProvider;", "glResourcesProvider", "", "d", "Z", "isActive", "()Z", "setActive", "(Z)V", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/CloseableCoroutineDispatcher;", "e", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getGlThreadContext", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getGlThreadContext$annotations", "()V", "glThreadContext", "Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "f", "Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "getInput$filter_release", "()Lcom/kakao/kandinsky/core/filter/gl/GLTexture;", "setInput$filter_release", "(Lcom/kakao/kandinsky/core/filter/gl/GLTexture;)V", "input", "Lcom/kakao/kandinsky/core/filter/filter/FilterChain;", "g", "Lcom/kakao/kandinsky/core/filter/filter/FilterChain;", "getFilterChain$filter_release", "()Lcom/kakao/kandinsky/core/filter/filter/FilterChain;", "setFilterChain$filter_release", "(Lcom/kakao/kandinsky/core/filter/filter/FilterChain;)V", "filterChain", "h", "F", "getFilterIntensity", "()F", "setFilterIntensity", "(F)V", "filterIntensity", "Lcom/kakao/kandinsky/core/filter/filter/EffectFilter;", "i", "Lcom/kakao/kandinsky/core/filter/filter/EffectFilter;", "getEffectFilter$filter_release", "()Lcom/kakao/kandinsky/core/filter/filter/EffectFilter;", "setEffectFilter$filter_release", "(Lcom/kakao/kandinsky/core/filter/filter/EffectFilter;)V", "effectFilter", "Lcom/kakao/kandinsky/core/filter/filter/MosaicChain;", "j", "Lcom/kakao/kandinsky/core/filter/filter/MosaicChain;", "getMosaicChain$filter_release", "()Lcom/kakao/kandinsky/core/filter/filter/MosaicChain;", "setMosaicChain$filter_release", "(Lcom/kakao/kandinsky/core/filter/filter/MosaicChain;)V", "mosaicChain", "Lcom/kakao/kandinsky/core/filter/filter/BlurChain;", "k", "Lcom/kakao/kandinsky/core/filter/filter/BlurChain;", "getBlurChain$filter_release", "()Lcom/kakao/kandinsky/core/filter/filter/BlurChain;", "setBlurChain$filter_release", "(Lcom/kakao/kandinsky/core/filter/filter/BlurChain;)V", "blurChain", "filter_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class FilterEngine {
    public final GLContext a;
    public final GLResourcesProvider b;
    public final FilterFactory c;
    public boolean d;
    public final ExecutorCoroutineDispatcher e;
    public GLTexture f;
    public FilterChain g;
    public float h;
    public EffectFilter i;
    public MosaicChain j;
    public BlurChain k;

    public FilterEngine(@NotNull AssetManager assetManager0) {
        Intrinsics.checkNotNullParameter(assetManager0, "assetManager");
        super();
        this.a = new GLContext();
        GLResourcesProvider gLResourcesProvider0 = new GLResourcesProvider();
        this.b = gLResourcesProvider0;
        this.c = new FilterFactory(gLResourcesProvider0, assetManager0);
        this.d = true;
        this.e = ThreadPoolDispatcherKt.newSingleThreadContext("glThread");
        this.h = 1.0f;
    }

    public static final Object access$createBitmapTexture(FilterEngine filterEngine0, Bitmap bitmap0, Continuation continuation0) {
        filterEngine0.getClass();
        return filterEngine0.withGLContext(new b(bitmap0, null), continuation0);
    }

    public static final Object access$createBlurChain(FilterEngine filterEngine0, Blur blur0, Size size0, Continuation continuation0) {
        filterEngine0.getClass();
        return filterEngine0.withGLContext(new c(filterEngine0, blur0, size0, null), continuation0);
    }

    public static final Object access$createFilterChain(FilterEngine filterEngine0, Filter filter0, Continuation continuation0) {
        filterEngine0.getClass();
        return filterEngine0.withGLContext(new d(filterEngine0, filter0, null), continuation0);
    }

    public static final Object access$createMosaicChain(FilterEngine filterEngine0, List list0, Size size0, Continuation continuation0) {
        filterEngine0.getClass();
        return filterEngine0.withGLContext(new e(filterEngine0, list0, size0, null), continuation0);
    }

    @Nullable
    public final Object delete(@NotNull Continuation continuation0) {
        Object object0 = this.withGLContext(new f(this, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final BlurChain getBlurChain$filter_release() {
        return this.k;
    }

    @Nullable
    public final EffectFilter getEffectFilter$filter_release() {
        return this.i;
    }

    @Nullable
    public final FilterChain getFilterChain$filter_release() {
        return this.g;
    }

    public final float getFilterIntensity() {
        return this.h;
    }

    @NotNull
    public final GLContext getGlContext$filter_release() {
        return this.a;
    }

    @NotNull
    public final GLResourcesProvider getGlResourcesProvider$filter_release() {
        return this.b;
    }

    @NotNull
    public final ExecutorCoroutineDispatcher getGlThreadContext() {
        return this.e;
    }

    public static void getGlThreadContext$annotations() {
    }

    @Nullable
    public final GLTexture getInput$filter_release() {
        return this.f;
    }

    @Nullable
    public final MosaicChain getMosaicChain$filter_release() {
        return this.j;
    }

    public final boolean isActive() {
        return this.d;
    }

    @CallSuper
    @Nullable
    public Object releaseResource(@NotNull Continuation continuation0) {
        Unit unit0 = this.withGLContext(new g(this, null), continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public final void setActive(boolean z) {
        this.d = z;
    }

    public final void setBlurChain$filter_release(@Nullable BlurChain blurChain0) {
        this.k = blurChain0;
    }

    public final void setEffectFilter$filter_release(@Nullable EffectFilter effectFilter0) {
        this.i = effectFilter0;
    }

    public final void setFilterChain$filter_release(@Nullable FilterChain filterChain0) {
        this.g = filterChain0;
    }

    public final void setFilterIntensity(float f) {
        this.h = f;
    }

    public final void setInput$filter_release(@Nullable GLTexture gLTexture0) {
        this.f = gLTexture0;
    }

    public final void setMosaicChain$filter_release(@Nullable MosaicChain mosaicChain0) {
        this.j = mosaicChain0;
    }

    @Nullable
    public final Object updateBlur(@Nullable Blur blur0, @NotNull Size size0, @NotNull Continuation continuation0) {
        Object object0 = this.withGLContext(new h(this, blur0, size0, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateEffect(@Nullable Effect effect0, @NotNull Continuation continuation0) {
        return this.withGLContext(new i(effect0, this, null), continuation0);
    }

    @Nullable
    public final Object updateFilter(@Nullable Filter filter0, @NotNull Continuation continuation0) {
        Object object0 = this.withGLContext(new j(this, filter0, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateFilterIntensity(float f, @NotNull Continuation continuation0) {
        Object object0 = this.withGLContext(new k(this, f, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateInput(@Nullable Bitmap bitmap0, @NotNull Continuation continuation0) {
        Object object0 = this.withGLContext(new l(this, bitmap0, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateMosaic(@Nullable List list0, @NotNull Size size0, @NotNull Continuation continuation0) {
        Object object0 = this.withGLContext(new m(this, list0, size0, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object withGLContext(@NotNull Function2 function20, @NotNull Continuation continuation0) {
        n n0 = new n(this, function20, null);
        return BuildersKt.withContext(this.e, n0, continuation0);
    }
}

