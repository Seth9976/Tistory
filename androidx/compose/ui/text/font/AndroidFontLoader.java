package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import i2.a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\u000B\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0096@¢\u0006\u0004\b\u000B\u0010\fR\u001C\u0010\u000E\u001A\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/compose/ui/text/font/Font;", "font", "Landroid/graphics/Typeface;", "loadBlocking", "(Landroidx/compose/ui/text/font/Font;)Landroid/graphics/Typeface;", "awaitLoad", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cacheKey", "Ljava/lang/Object;", "getCacheKey", "()Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
public final class AndroidFontLoader implements PlatformFontLoader {
    public static final int $stable = 8;
    public final Context a;

    public AndroidFontLoader(@NotNull Context context0) {
        this.a = context0.getApplicationContext();
    }

    @Override  // androidx.compose.ui.text.font.PlatformFontLoader
    @Nullable
    public Object awaitLoad(@NotNull Font font0, @NotNull Continuation continuation0) {
        a a0;
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v = a0.s;
            if((v & 0x80000000) == 0) {
                a0 = new a(this, continuation0);
            }
            else {
                a0.s = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(this, continuation0);
        }
        Object object0 = a0.q;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Context context0 = this.a;
                if(font0 instanceof AndroidFont) {
                    TypefaceLoader androidFont$TypefaceLoader0 = ((AndroidFont)font0).getTypefaceLoader();
                    a0.s = 1;
                    object0 = androidFont$TypefaceLoader0.awaitLoad(context0, ((AndroidFont)font0), a0);
                    return object0 == object1 ? object1 : object0;
                }
                if(!(font0 instanceof ResourceFont)) {
                    throw new IllegalArgumentException("Unknown font type: " + font0);
                }
                a0.o = this;
                a0.p = font0;
                a0.s = 2;
                object0 = AndroidFontLoader_androidKt.access$loadAsync(((ResourceFont)font0), context0, a0);
                return object0 == object1 ? object1 : PlatformTypefaces_androidKt.setFontVariationSettings(((Typeface)object0), ((ResourceFont)font0).getVariationSettings(), this.a);
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return object0;
            }
            case 2: {
                font0 = a0.p;
                AndroidFontLoader androidFontLoader0 = a0.o;
                ResultKt.throwOnFailure(object0);
                return PlatformTypefaces_androidKt.setFontVariationSettings(((Typeface)object0), ((ResourceFont)font0).getVariationSettings(), androidFontLoader0.a);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // androidx.compose.ui.text.font.PlatformFontLoader
    @Nullable
    public Object getCacheKey() {
        return null;
    }

    @Nullable
    public Typeface loadBlocking(@NotNull Font font0) {
        Object object1;
        Object object0 = null;
        Context context0 = this.a;
        if(font0 instanceof AndroidFont) {
            return ((AndroidFont)font0).getTypefaceLoader().loadBlocking(context0, ((AndroidFont)font0));
        }
        if(font0 instanceof ResourceFont) {
            int v = font0.getLoadingStrategy-PKNRLFQ();
            if(FontLoadingStrategy.equals-impl0(v, 0)) {
                return PlatformTypefaces_androidKt.setFontVariationSettings(AndroidFontLoader_androidKt.access$load(((ResourceFont)font0), context0), ((ResourceFont)font0).getVariationSettings(), context0);
            }
            if(FontLoadingStrategy.equals-impl0(v, 1)) {
                try {
                    object1 = Result.constructor-impl(AndroidFontLoader_androidKt.access$load(((ResourceFont)font0), context0));
                }
                catch(Throwable throwable0) {
                    object1 = Result.constructor-impl(ResultKt.createFailure(throwable0));
                }
                if(!Result.isFailure-impl(object1)) {
                    object0 = object1;
                }
                return PlatformTypefaces_androidKt.setFontVariationSettings(((Typeface)object0), ((ResourceFont)font0).getVariationSettings(), context0);
            }
            if(FontLoadingStrategy.equals-impl0(v, 2)) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            }
            throw new IllegalArgumentException("Unknown loading type " + FontLoadingStrategy.toString-impl(font0.getLoadingStrategy-PKNRLFQ()));
        }
        return null;
    }

    @Override  // androidx.compose.ui.text.font.PlatformFontLoader
    public Object loadBlocking(Font font0) {
        return this.loadBlocking(font0);
    }
}

