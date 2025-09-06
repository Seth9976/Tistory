package g;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.EmojiConsistency;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.view.View.OnLongClickListener;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import androidx.appcompat.widget.WithHint;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.utils.futures.d;
import androidx.work.impl.utils.futures.h;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.inject.Provider;
import fg.i;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.MaybeSource;
import io.reactivex.Observer;
import io.reactivex.SingleSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.maybe.MaybeToObservable;
import io.reactivex.internal.operators.single.SingleToObservable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader.Cache;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersCacheKt;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.modules.SerializersModule;
import qd.a;
import xf.m;

public abstract class b implements ComponentContainer {
    public static Java16RecordComponentsLoader.Cache a;

    public void A() {
    }

    public static final KSerializer B(SerializersModule serializersModule0, KType kType0, boolean z) {
        KSerializer kSerializer1;
        KSerializer kSerializer0;
        KClass kClass0 = Platform_commonKt.kclass(kType0);
        boolean z1 = kType0.isMarkedNullable();
        Iterable iterable0 = kType0.getArguments();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(Platform_commonKt.typeOrThrow(((KTypeProjection)object0)));
        }
        if(arrayList0.isEmpty()) {
            kSerializer0 = SerializersCacheKt.findCachedSerializer(kClass0, z1);
        }
        else {
            Object object1 = SerializersCacheKt.findParametrizedCachedSerializer(kClass0, arrayList0, z1);
            if(Result.isFailure-impl(object1)) {
                object1 = null;
            }
            kSerializer0 = (KSerializer)object1;
        }
        if(kSerializer0 != null) {
            return kSerializer0;
        }
        if(arrayList0.isEmpty()) {
            kSerializer1 = SerializersModule.getContextual$default(serializersModule0, kClass0, null, 2, null);
        }
        else {
            List list0 = SerializersKt.serializersForParameters(serializersModule0, arrayList0, z);
            if(list0 == null) {
                return null;
            }
            KSerializer kSerializer2 = SerializersKt.parametrizedSerializerOrNull(kClass0, list0, new i(arrayList0, 0));
            kSerializer1 = kSerializer2 == null ? serializersModule0.getContextual(kClass0, list0) : kSerializer2;
        }
        if(kSerializer1 != null) {
            if(z1) {
                return BuiltinSerializersKt.getNullable(kSerializer1);
            }
            Intrinsics.checkNotNull(kSerializer1, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
            return kSerializer1;
        }
        return null;
    }

    public abstract void C(boolean arg1);

    public abstract void D(boolean arg1);

    public static void E(CheckableImageButton checkableImageButton0, View.OnLongClickListener view$OnLongClickListener0) {
        boolean z = ViewCompat.hasOnClickListeners(checkableImageButton0);
        boolean z1 = false;
        int v = 1;
        if(z || view$OnLongClickListener0 != null) {
            z1 = true;
        }
        checkableImageButton0.setFocusable(z1);
        checkableImageButton0.setClickable(z);
        checkableImageButton0.setPressable(z);
        checkableImageButton0.setLongClickable(view$OnLongClickListener0 != null);
        if(!z1) {
            v = 2;
        }
        ViewCompat.setImportantForAccessibility(checkableImageButton0, v);
    }

    public abstract void F();

    public abstract void G();

    public static boolean H(Object object0, Function function0, CompletableObserver completableObserver0) {
        CompletableSource completableSource0;
        if(object0 instanceof Callable) {
            Callable callable0 = (Callable)object0;
            try {
                Object object1 = callable0.call();
                completableSource0 = object1 == null ? null : ((CompletableSource)ObjectHelper.requireNonNull(function0.apply(object1), "The mapper returned a null CompletableSource"));
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                EmptyDisposable.error(throwable0, completableObserver0);
                return true;
            }
            if(completableSource0 == null) {
                EmptyDisposable.complete(completableObserver0);
                return true;
            }
            completableSource0.subscribe(completableObserver0);
            return true;
        }
        return false;
    }

    public static boolean I(Object object0, Function function0, Observer observer0) {
        MaybeSource maybeSource0;
        if(object0 instanceof Callable) {
            Callable callable0 = (Callable)object0;
            try {
                Object object1 = callable0.call();
                maybeSource0 = object1 == null ? null : ((MaybeSource)ObjectHelper.requireNonNull(function0.apply(object1), "The mapper returned a null MaybeSource"));
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                EmptyDisposable.error(throwable0, observer0);
                return true;
            }
            if(maybeSource0 == null) {
                EmptyDisposable.complete(observer0);
                return true;
            }
            maybeSource0.subscribe(MaybeToObservable.create(observer0));
            return true;
        }
        return false;
    }

    public static boolean J(Object object0, Function function0, Observer observer0) {
        SingleSource singleSource0;
        if(object0 instanceof Callable) {
            Callable callable0 = (Callable)object0;
            try {
                Object object1 = callable0.call();
                singleSource0 = object1 == null ? null : ((SingleSource)ObjectHelper.requireNonNull(function0.apply(object1), "The mapper returned a null SingleSource"));
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                EmptyDisposable.error(throwable0, observer0);
                return true;
            }
            if(singleSource0 == null) {
                EmptyDisposable.complete(observer0);
                return true;
            }
            singleSource0.subscribe(SingleToObservable.create(observer0));
            return true;
        }
        return false;
    }

    public abstract void K();

    public abstract TransformationMethod L(TransformationMethod arg1);

    public static void a(TextInputLayout textInputLayout0, CheckableImageButton checkableImageButton0, ColorStateList colorStateList0, PorterDuff.Mode porterDuff$Mode0) {
        Drawable drawable0 = checkableImageButton0.getDrawable();
        if(drawable0 != null) {
            drawable0 = drawable0.mutate();
            if(colorStateList0 == null || !colorStateList0.isStateful()) {
                DrawableCompat.setTintList(drawable0, colorStateList0);
            }
            else {
                int[] arr_v = textInputLayout0.getDrawableState();
                int[] arr_v1 = checkableImageButton0.getDrawableState();
                int[] arr_v2 = Arrays.copyOf(arr_v, arr_v.length + arr_v1.length);
                System.arraycopy(arr_v1, 0, arr_v2, arr_v.length, arr_v1.length);
                DrawableCompat.setTintList(drawable0, ColorStateList.valueOf(colorStateList0.getColorForState(arr_v2, colorStateList0.getDefaultColor())));
            }
            if(porterDuff$Mode0 != null) {
                DrawableCompat.setTintMode(drawable0, porterDuff$Mode0);
            }
        }
        if(checkableImageButton0.getDrawable() != drawable0) {
            checkableImageButton0.setImageDrawable(drawable0);
        }
    }

    public static void b(float f, float[] arr_f) {
        if(Float.compare(f, 0.5f) <= 0) {
            arr_f[0] = 1.0f - f * 2.0f;
            arr_f[1] = 0.0f;
            return;
        }
        arr_f[0] = 0.0f;
        arr_f[1] = f * 2.0f - 1.0f;
    }

    public boolean c() {
        return false;
    }

    public abstract boolean d(AbstractFuture arg1, d arg2, d arg3);

    public abstract boolean e(AbstractFuture arg1, Object arg2, Object arg3);

    public abstract boolean f(AbstractFuture arg1, h arg2, h arg3);

    public abstract boolean g(String arg1);

    @Override  // com.google.firebase.components.ComponentContainer
    public Object get(Class class0) {
        Provider provider0 = this.getProvider(class0);
        return provider0 == null ? null : provider0.get();
    }

    public static ImageView.ScaleType h(int v) {
        switch(v) {
            case 0: {
                return ImageView.ScaleType.FIT_XY;
            }
            case 1: {
                return ImageView.ScaleType.FIT_START;
            }
            case 2: {
                return ImageView.ScaleType.FIT_CENTER;
            }
            case 3: {
                return ImageView.ScaleType.FIT_END;
            }
            case 5: {
                return ImageView.ScaleType.CENTER_CROP;
            }
            case 6: {
                return ImageView.ScaleType.CENTER_INSIDE;
            }
            default: {
                return ImageView.ScaleType.CENTER;
            }
        }
    }

    public static final Object i(FlowCollector flowCollector0, ReceiveChannel receiveChannel0, boolean z, Continuation continuation0) {
        Object object1;
        Object object0;
        m m0;
        if(continuation0 instanceof m) {
            m0 = (m)continuation0;
            int v = m0.t;
            if((v & 0x80000000) == 0) {
                m0 = new m(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                m0.t = v ^ 0x80000000;
            }
        }
        else {
            m0 = new m(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        try {
            object0 = m0.s;
            object1 = a.getCOROUTINE_SUSPENDED();
            switch(m0.t) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_17;
                }
                case 2: {
                    goto label_23;
                }
            }
        }
        catch(Throwable throwable0) {
            goto label_51;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ResultKt.throwOnFailure(object0);
        FlowKt.ensureActive(flowCollector0);
        try {
            ChannelIterator channelIterator0 = receiveChannel0.iterator();
            goto label_30;
        label_17:
            z = m0.r;
            ChannelIterator channelIterator1 = m0.q;
            receiveChannel0 = m0.p;
            FlowCollector flowCollector1 = m0.o;
            ResultKt.throwOnFailure(object0);
            goto label_41;
        label_23:
            z = m0.r;
            channelIterator1 = m0.q;
            receiveChannel0 = m0.p;
            flowCollector1 = m0.o;
            ResultKt.throwOnFailure(object0);
            while(true) {
                channelIterator0 = channelIterator1;
                flowCollector0 = flowCollector1;
            label_30:
                m0.o = flowCollector0;
                m0.p = receiveChannel0;
                m0.q = channelIterator0;
                m0.r = z;
                m0.t = 1;
                Object object2 = channelIterator0.hasNext(m0);
                if(object2 == object1) {
                    return object1;
                }
                flowCollector1 = flowCollector0;
                channelIterator1 = channelIterator0;
                object0 = object2;
            label_41:
                if(!((Boolean)object0).booleanValue()) {
                    goto label_55;
                }
                Object object3 = channelIterator1.next();
                m0.o = flowCollector1;
                m0.p = receiveChannel0;
                m0.q = channelIterator1;
                m0.r = z;
                m0.t = 2;
                if(flowCollector1.emit(object3, m0) == object1) {
                    break;
                }
            }
            return object1;
        }
        catch(Throwable throwable0) {
        label_51:
            if(z) {
                ChannelsKt.cancelConsumed(receiveChannel0, throwable0);
            }
            throw throwable0;
        }
    label_55:
        if(z) {
            ChannelsKt.cancelConsumed(receiveChannel0, null);
        }
        return Unit.INSTANCE;
    }

    public abstract Object j(String arg1);

    public abstract Method k(Class arg1, Field arg2);

    public abstract Constructor l(Class arg1);

    public static final int m(int[] arr_v) {
        return Math.min(arr_v[2] - arr_v[0], arr_v[3] - arr_v[1]);
    }

    public static Set n() {
        Set set0 = EmojiConsistency.getEmojiConsistencySet();
        if(set0 == null) {
            return Collections.emptySet();
        }
        for(Object object0: set0) {
            if(!(object0 instanceof int[])) {
                return Collections.emptySet();
            }
            if(false) {
                break;
            }
        }
        return set0;
    }

    public abstract InputFilter[] o(InputFilter[] arg1);

    public abstract String[] p(Class arg1);

    public static void q(File file0, InputStream inputStream0) {
        GZIPOutputStream gZIPOutputStream1;
        GZIPOutputStream gZIPOutputStream0;
        byte[] arr_b;
        try {
            arr_b = new byte[0x2000];
            gZIPOutputStream0 = null;
            gZIPOutputStream1 = new GZIPOutputStream(new FileOutputStream(file0));
        }
        catch(Throwable throwable0) {
            CommonUtils.closeQuietly(gZIPOutputStream0);
            throw throwable0;
        }
        try {
            int v;
            while((v = inputStream0.read(arr_b)) > 0) {
                gZIPOutputStream1.write(arr_b, 0, v);
            }
            gZIPOutputStream1.finish();
        }
        catch(Throwable throwable0) {
            gZIPOutputStream0 = gZIPOutputStream1;
            CommonUtils.closeQuietly(gZIPOutputStream0);
            throw throwable0;
        }
        CommonUtils.closeQuietly(gZIPOutputStream1);
    }

    public abstract boolean r();

    public abstract boolean s(Class arg1);

    @Override  // com.google.firebase.components.ComponentContainer
    public Set setOf(Class class0) {
        return (Set)this.setOfProvider(class0).get();
    }

    public abstract Object t();

    public static PorterDuff.Mode u(BlendModeCompat blendModeCompat0) {
        if(blendModeCompat0 == null) {
            return null;
        }
        switch(blendModeCompat0) {
            case 1: {
                return PorterDuff.Mode.CLEAR;
            }
            case 2: {
                return PorterDuff.Mode.SRC;
            }
            case 3: {
                return PorterDuff.Mode.DST;
            }
            case 4: {
                return PorterDuff.Mode.SRC_OVER;
            }
            case 5: {
                return PorterDuff.Mode.DST_OVER;
            }
            case 6: {
                return PorterDuff.Mode.SRC_IN;
            }
            case 7: {
                return PorterDuff.Mode.DST_IN;
            }
            case 8: {
                return PorterDuff.Mode.SRC_OUT;
            }
            case 9: {
                return PorterDuff.Mode.DST_OUT;
            }
            case 10: {
                return PorterDuff.Mode.SRC_ATOP;
            }
            case 11: {
                return PorterDuff.Mode.DST_ATOP;
            }
            case 12: {
                return PorterDuff.Mode.XOR;
            }
            case 13: {
                return PorterDuff.Mode.ADD;
            }
            case 14: {
                return PorterDuff.Mode.MULTIPLY;
            }
            case 15: {
                return PorterDuff.Mode.SCREEN;
            }
            case 16: {
                return PorterDuff.Mode.OVERLAY;
            }
            case 17: {
                return PorterDuff.Mode.DARKEN;
            }
            case 18: {
                return PorterDuff.Mode.LIGHTEN;
            }
            default: {
                return null;
            }
        }
    }

    public static void v(InputConnection inputConnection0, EditorInfo editorInfo0, TextView textView0) {
        if(inputConnection0 != null && editorInfo0.hintText == null) {
            for(ViewParent viewParent0 = textView0.getParent(); viewParent0 instanceof View; viewParent0 = viewParent0.getParent()) {
                if(viewParent0 instanceof WithHint) {
                    editorInfo0.hintText = ((WithHint)viewParent0).getHint();
                    return;
                }
            }
        }
    }

    public abstract void w(String arg1);

    public abstract void x(h arg1, h arg2);

    public abstract void y(h arg1, Thread arg2);

    public static void z(TextInputLayout textInputLayout0, CheckableImageButton checkableImageButton0, ColorStateList colorStateList0) {
        Drawable drawable0 = checkableImageButton0.getDrawable();
        if(checkableImageButton0.getDrawable() != null && colorStateList0 != null && colorStateList0.isStateful()) {
            int[] arr_v = textInputLayout0.getDrawableState();
            int[] arr_v1 = checkableImageButton0.getDrawableState();
            int[] arr_v2 = Arrays.copyOf(arr_v, arr_v.length + arr_v1.length);
            System.arraycopy(arr_v1, 0, arr_v2, arr_v.length, arr_v1.length);
            int v = colorStateList0.getColorForState(arr_v2, colorStateList0.getDefaultColor());
            Drawable drawable1 = drawable0.mutate();
            DrawableCompat.setTintList(drawable1, ColorStateList.valueOf(v));
            checkableImageButton0.setImageDrawable(drawable1);
        }
    }
}

