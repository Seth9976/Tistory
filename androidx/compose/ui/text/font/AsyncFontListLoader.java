package androidx.compose.ui.text.font;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import i2.b;
import i2.c;
import i2.d;
import i2.e;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.YieldKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0012\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000B\u0012\u0006\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\rH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0017\u001A\u0004\u0018\u00010\u0002*\u00020\u0004H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016R+\u0010\u001F\u001A\u00020\u00022\u0006\u0010\u0018\u001A\u00020\u00028V@RX\u0096\u008E\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER\"\u0010\'\u001A\u00020 8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Landroidx/compose/runtime/State;", "", "", "Landroidx/compose/ui/text/font/Font;", "fontList", "initialType", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "onCompletion", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "<init>", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/font/PlatformFontLoader;)V", "load", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithTimeoutOrNull$ui_text_release", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithTimeoutOrNull", "<set-?>", "f", "Landroidx/compose/runtime/MutableState;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "", "g", "Z", "getCacheable$ui_text_release", "()Z", "setCacheable$ui_text_release", "(Z)V", "cacheable", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,432:1\n81#2:433\n107#2,2:434\n33#3,6:436\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n*L\n256#1:433\n256#1:434,2\n263#1:436,6\n*E\n"})
public final class AsyncFontListLoader implements State {
    public static final int $stable;
    public final List a;
    public final TypefaceRequest b;
    public final AsyncTypefaceCache c;
    public final Function1 d;
    public final PlatformFontLoader e;
    public final MutableState f;
    public boolean g;

    public AsyncFontListLoader(@NotNull List list0, @NotNull Object object0, @NotNull TypefaceRequest typefaceRequest0, @NotNull AsyncTypefaceCache asyncTypefaceCache0, @NotNull Function1 function10, @NotNull PlatformFontLoader platformFontLoader0) {
        this.a = list0;
        this.b = typefaceRequest0;
        this.c = asyncTypefaceCache0;
        this.d = function10;
        this.e = platformFontLoader0;
        this.f = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
        this.g = true;
    }

    public final boolean getCacheable$ui_text_release() {
        return this.g;
    }

    @Override  // androidx.compose.runtime.State
    @NotNull
    public Object getValue() {
        return this.f.getValue();
    }

    @Nullable
    public final Object load(@NotNull Continuation continuation0) {
        List list2;
        Font font1;
        AsyncFontListLoader asyncFontListLoader2;
        int v3;
        AsyncFontListLoader asyncFontListLoader1;
        int v2;
        AsyncFontListLoader asyncFontListLoader0;
        int v1;
        List list0;
        b b0;
        if(continuation0 instanceof b) {
            b0 = (b)continuation0;
            int v = b0.v;
            if((v & 0x80000000) == 0) {
                b0 = new b(this, continuation0);
            }
            else {
                b0.v = v ^ 0x80000000;
            }
        }
        else {
            b0 = new b(this, continuation0);
        }
        Object object0 = b0.t;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(b0.v) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    list0 = this.a;
                    v1 = list0.size();
                    asyncFontListLoader0 = this;
                    v2 = 0;
                    goto label_48;
                }
                catch(Throwable throwable0) {
                    asyncFontListLoader1 = this;
                    goto label_83;
                }
            }
            case 1: {
                try {
                    v1 = b0.s;
                    v3 = b0.r;
                    Font font0 = b0.q;
                    List list1 = b0.p;
                    asyncFontListLoader2 = b0.o;
                    ResultKt.throwOnFailure(object0);
                    asyncFontListLoader0 = asyncFontListLoader2;
                    font1 = font0;
                    list2 = list1;
                    goto label_65;
                }
                catch(Throwable throwable0) {
                    asyncFontListLoader1 = asyncFontListLoader2;
                    goto label_83;
                }
            }
            case 2: {
                try {
                    v1 = b0.s;
                    v3 = b0.r;
                    list2 = b0.p;
                    asyncFontListLoader1 = b0.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
                goto label_83;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            v2 = v3;
            list0 = list2;
            asyncFontListLoader0 = asyncFontListLoader1;
            while(true) {
                ++v2;
            label_48:
                if(v2 >= v1) {
                    break alab1;
                }
                try {
                    Font font2 = (Font)list0.get(v2);
                    if(!FontLoadingStrategy.equals-impl0(font2.getLoadingStrategy-PKNRLFQ(), 2)) {
                        continue;
                    }
                    c c0 = new c(asyncFontListLoader0, font2, null);
                    b0.o = asyncFontListLoader0;
                    b0.p = list0;
                    b0.q = font2;
                    b0.r = v2;
                    b0.s = v1;
                    b0.v = 1;
                    Object object2 = asyncFontListLoader0.c.runCached(font2, asyncFontListLoader0.e, false, c0, b0);
                    if(object2 == object1) {
                        return object1;
                    }
                    list2 = list0;
                    object0 = object2;
                    font1 = font2;
                    v3 = v2;
                label_65:
                    if(object0 != null) {
                        Object object3 = FontSynthesis_androidKt.synthesizeTypeface-FxwP2eA(asyncFontListLoader0.b.getFontSynthesis-GVVA2EU(), object0, font1, asyncFontListLoader0.b.getFontWeight(), asyncFontListLoader0.b.getFontStyle-_-LCdwA());
                        asyncFontListLoader0.f.setValue(object3);
                        break;
                    }
                    goto label_73;
                }
                catch(Throwable throwable0) {
                    goto label_82;
                }
            }
            boolean z = JobKt.isActive(b0.getContext());
            asyncFontListLoader0.g = false;
            Immutable typefaceResult$Immutable0 = new Immutable(asyncFontListLoader0.getValue(), z);
            asyncFontListLoader0.d.invoke(typefaceResult$Immutable0);
            return Unit.INSTANCE;
            try {
            label_73:
                b0.o = asyncFontListLoader0;
                b0.p = list2;
                b0.q = null;
                b0.r = v3;
                b0.s = v1;
                b0.v = 2;
                if(YieldKt.yield(b0) == object1) {
                    return object1;
                }
                goto label_89;
            }
            catch(Throwable throwable0) {
            label_82:
                asyncFontListLoader1 = asyncFontListLoader0;
            }
        label_83:
            boolean z1 = JobKt.isActive(b0.getContext());
            asyncFontListLoader1.g = false;
            Immutable typefaceResult$Immutable1 = new Immutable(asyncFontListLoader1.getValue(), z1);
            asyncFontListLoader1.d.invoke(typefaceResult$Immutable1);
            throw throwable0;
        label_89:
            asyncFontListLoader1 = asyncFontListLoader0;
        }
        boolean z2 = JobKt.isActive(b0.getContext());
        asyncFontListLoader0.g = false;
        Immutable typefaceResult$Immutable2 = new Immutable(asyncFontListLoader0.getValue(), z2);
        asyncFontListLoader0.d.invoke(typefaceResult$Immutable2);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object loadWithTimeoutOrNull$ui_text_release(@NotNull Font font0, @NotNull Continuation continuation0) {
        d d0;
        if(continuation0 instanceof d) {
            d0 = (d)continuation0;
            int v = d0.r;
            if((v & 0x80000000) == 0) {
                d0 = new d(this, continuation0);
            }
            else {
                d0.r = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(this, continuation0);
        }
        Object object0 = d0.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(d0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    e e0 = new e(this, font0, null);
                    d0.o = font0;
                    d0.r = 1;
                    object0 = TimeoutKt.withTimeoutOrNull(15000L, e0, d0);
                    return object0 == object1 ? object1 : object0;
                label_21:
                    font0 = d0.o;
                    ResultKt.throwOnFailure(object0);
                    return object0;
                }
                catch(CancellationException cancellationException0) {
                    goto label_25;
                }
                catch(Exception exception0) {
                    goto label_28;
                }
            }
            case 1: {
                goto label_21;
            label_25:
                if(!JobKt.isActive(d0.getContext())) {
                    throw cancellationException0;
                label_28:
                    CoroutineExceptionHandler coroutineExceptionHandler0 = (CoroutineExceptionHandler)d0.getContext().get(CoroutineExceptionHandler.Key);
                    if(coroutineExceptionHandler0 != null) {
                        coroutineExceptionHandler0.handleException(d0.getContext(), new IllegalStateException("Unable to load font " + font0, exception0));
                        return null;
                    }
                }
                return null;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final void setCacheable$ui_text_release(boolean z) {
        this.g = z;
    }
}

