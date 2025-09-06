package androidx.compose.ui.text.font;

import aa.o;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import i2.g;
import i2.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00020\u000EH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u001A0\u00192\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001B\u0010\u001CR\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "platformResolveInterceptor", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "typefaceRequestCache", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "fontListFontFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "platformFamilyTypefaceAdapter", "<init>", "(Landroidx/compose/ui/text/font/PlatformFontLoader;Landroidx/compose/ui/text/font/PlatformResolveInterceptor;Landroidx/compose/ui/text/font/TypefaceRequestCache;Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;)V", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "", "preload", "(Landroidx/compose/ui/text/font/FontFamily;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/runtime/State;", "", "resolve-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "resolve", "a", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "getPlatformFontLoader$ui_text_release", "()Landroidx/compose/ui/text/font/PlatformFontLoader;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,256:1\n151#2,3:257\n33#2,4:260\n154#2,2:264\n38#2:266\n156#2:267\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n*L\n47#1:257,3\n47#1:260,4\n47#1:264,2\n47#1:266\n47#1:267\n*E\n"})
public final class FontFamilyResolverImpl implements Resolver {
    public static final int $stable = 8;
    public final PlatformFontLoader a;
    public final PlatformResolveInterceptor b;
    public final TypefaceRequestCache c;
    public final FontListFontFamilyTypefaceAdapter d;
    public final PlatformFontFamilyTypefaceAdapter e;
    public final g f;

    public FontFamilyResolverImpl(@NotNull PlatformFontLoader platformFontLoader0, @NotNull PlatformResolveInterceptor platformResolveInterceptor0, @NotNull TypefaceRequestCache typefaceRequestCache0, @NotNull FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter0, @NotNull PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter0) {
        this.a = platformFontLoader0;
        this.b = platformResolveInterceptor0;
        this.c = typefaceRequestCache0;
        this.d = fontListFontFamilyTypefaceAdapter0;
        this.e = platformFontFamilyTypefaceAdapter0;
        this.f = new g(this, 0);
    }

    public FontFamilyResolverImpl(PlatformFontLoader platformFontLoader0, PlatformResolveInterceptor platformResolveInterceptor0, TypefaceRequestCache typefaceRequestCache0, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter0, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            platformResolveInterceptor0 = PlatformResolveInterceptor.Companion.getDefault$ui_text_release();
        }
        if((v & 4) != 0) {
            typefaceRequestCache0 = FontFamilyResolverKt.getGlobalTypefaceRequestCache();
        }
        if((v & 8) != 0) {
            fontListFontFamilyTypefaceAdapter0 = new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), null, 2, null);
        }
        if((v & 16) != 0) {
            platformFontFamilyTypefaceAdapter0 = new PlatformFontFamilyTypefaceAdapter();
        }
        this(platformFontLoader0, platformResolveInterceptor0, typefaceRequestCache0, fontListFontFamilyTypefaceAdapter0, platformFontFamilyTypefaceAdapter0);
    }

    public static final State access$resolve(FontFamilyResolverImpl fontFamilyResolverImpl0, TypefaceRequest typefaceRequest0) {
        fontFamilyResolverImpl0.getClass();
        o o0 = new o(25, fontFamilyResolverImpl0, typefaceRequest0);
        return fontFamilyResolverImpl0.c.runCached(typefaceRequest0, o0);
    }

    @NotNull
    public final PlatformFontLoader getPlatformFontLoader$ui_text_release() {
        return this.a;
    }

    @Override  // androidx.compose.ui.text.font.FontFamily$Resolver
    @Nullable
    public Object preload(@NotNull FontFamily fontFamily0, @NotNull Continuation continuation0) {
        FontFamilyResolverImpl fontFamilyResolverImpl0;
        h h0;
        if(continuation0 instanceof h) {
            h0 = (h)continuation0;
            int v = h0.s;
            if((v & 0x80000000) == 0) {
                h0 = new h(this, continuation0);
            }
            else {
                h0.s = v ^ 0x80000000;
            }
        }
        else {
            h0 = new h(this, continuation0);
        }
        Object object0 = h0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(h0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(!(fontFamily0 instanceof FontListFontFamily)) {
                    return Unit.INSTANCE;
                }
                h0.o = this;
                h0.p = fontFamily0;
                h0.s = 1;
                if(this.d.preload(fontFamily0, this.a, h0) == object1) {
                    return object1;
                }
                fontFamilyResolverImpl0 = this;
                break;
            }
            case 1: {
                fontFamily0 = h0.p;
                fontFamilyResolverImpl0 = h0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        List list0 = ((FontListFontFamily)fontFamily0).getFonts();
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            Font font0 = (Font)list0.get(v2);
            FontWeight fontWeight0 = font0.getWeight();
            int v3 = font0.getStyle-_-LCdwA();
            Object object2 = fontFamilyResolverImpl0.a.getCacheKey();
            arrayList0.add(new TypefaceRequest(fontFamily0, fontFamilyResolverImpl0.b.interceptFontWeight(fontWeight0), v3, 1, object2, null));
        }
        g g0 = new g(fontFamilyResolverImpl0, 1);
        fontFamilyResolverImpl0.c.preWarmCache(arrayList0, g0);
        return Unit.INSTANCE;
    }

    @Override  // androidx.compose.ui.text.font.FontFamily$Resolver
    @NotNull
    public State resolve-DPcqOEQ(@Nullable FontFamily fontFamily0, @NotNull FontWeight fontWeight0, int v, int v1) {
        Object object0 = this.a.getCacheKey();
        TypefaceRequest typefaceRequest0 = new TypefaceRequest(fontFamily0, this.b.interceptFontWeight(fontWeight0), v, v1, object0, null);
        o o0 = new o(25, this, typefaceRequest0);
        return this.c.runCached(typefaceRequest0, o0);
    }
}

