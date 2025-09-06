package f;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.net.Uri;
import android.text.StaticLayout;
import android.webkit.MimeTypeMap;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.text.style.TextAlign;
import com.kakao.kandinsky.bitmap.usecase.GetBitmapUseCase;
import com.kakao.kandinsky.core.filter.usecase.GetFilteredBitmapUseCase;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.Border;
import com.kakao.kandinsky.core.kdphoto.Decoration.Absolute;
import com.kakao.kandinsky.core.kdphoto.Effect;
import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.core.kdphoto.Mosaic;
import com.kakao.kandinsky.core.kdphoto.Signature.Image;
import com.kakao.kandinsky.core.kdphoto.Signature.Text.Companion.WatermarkDrawData;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.core.kdphoto.Sticker;
import com.kakao.kandinsky.core.kdphoto.Text;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.designsystem.util.SizeExtensionKt;
import com.kakao.kandinsky.history.KPhotoKey;
import com.kakao.kandinsky.signature.MetaDataConverter;
import com.kakao.kandinsky.utils.Logger;
import e.u;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import qd.a;
import zd.c;

public final class l {
    public final Context a;
    public final ContentResolver b;
    public final File c;
    public final b d;
    public final GetBitmapUseCase e;
    public final GetFilteredBitmapUseCase f;
    public final u g;

    public l(Context context0, ContentResolver contentResolver0, File file0, b b0, GetBitmapUseCase getBitmapUseCase0, GetFilteredBitmapUseCase getFilteredBitmapUseCase0, u u0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(contentResolver0, "contentResolver");
        Intrinsics.checkNotNullParameter(file0, "cacheDir");
        Intrinsics.checkNotNullParameter(b0, "fileRepository");
        Intrinsics.checkNotNullParameter(getBitmapUseCase0, "getBitmapUseCase");
        Intrinsics.checkNotNullParameter(getFilteredBitmapUseCase0, "getFilteredBitmapUseCase");
        Intrinsics.checkNotNullParameter(u0, "historyRepository");
        super();
        this.a = context0;
        this.b = contentResolver0;
        this.c = file0;
        this.d = b0;
        this.e = getBitmapUseCase0;
        this.f = getFilteredBitmapUseCase0;
        this.g = u0;
    }

    public static Bitmap a(Bitmap bitmap0, int v) {
        String s = Size.toString-impl(SizeKt.Size(bitmap0.getWidth(), bitmap0.getHeight()));
        Logger.INSTANCE.log("resize " + s + " " + v);
        if(v > 0 && bitmap0.getWidth() >= v) {
            float f = ((float)v) / ((float)bitmap0.getWidth());
            Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap0, v, c.roundToInt(((float)bitmap0.getHeight()) * f), true);
            bitmap0.recycle();
            return bitmap1;
        }
        return bitmap0;
    }

    public static Bitmap a(Bitmap bitmap0, KDPhoto kDPhoto0) {
        if(c.roundToInt(Size.getWidth-impl(kDPhoto0.getCropSize-NH-jbRc())) == bitmap0.getWidth() && c.roundToInt(Size.getHeight-impl(kDPhoto0.getCropSize-NH-jbRc())) == bitmap0.getHeight() && kDPhoto0.getMatrix().isIdentity()) {
            return bitmap0;
        }
        Bitmap bitmap1 = Bitmap.createBitmap(((int)Size.getWidth-impl(kDPhoto0.getCropSize-NH-jbRc())), ((int)Size.getHeight-impl(kDPhoto0.getCropSize-NH-jbRc())), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmap1, "createBitmap(...)");
        Canvas canvas0 = new Canvas(bitmap1);
        int v = canvas0.save();
        try {
            canvas0.concat(kDPhoto0.getMatrix());
            canvas0.drawBitmap(bitmap0, 0.0f, 0.0f, null);
        }
        finally {
            canvas0.restoreToCount(v);
        }
        bitmap0.recycle();
        return bitmap1;
    }

    public static void a(StaticLayout staticLayout0, Canvas canvas0, long v, Paint paint0, int v1) {
        int v2 = canvas0.save();
        try {
            float f = Size.getMinDimension-impl(v) * ((float)v1) / 100.0f;
            canvas0.drawRoundRect(0.0f, 0.0f, Size.getWidth-impl(v), Size.getHeight-impl(v), f, f, paint0);
            canvas0.translate(Size.getWidth-impl(v) / 2.0f, (Size.getHeight-impl(v) - ((float)staticLayout0.getHeight())) / 2.0f);
            staticLayout0.draw(canvas0);
        }
        finally {
            canvas0.restoreToCount(v2);
        }
    }

    public final Object a(int v, int v1, PersistentList persistentList0, Continuation continuation0) {
        float f5;
        l l1;
        Bitmap bitmap1;
        Canvas canvas1;
        Iterator iterator1;
        Absolute decoration$Absolute0;
        int v3;
        Iterator iterator0;
        l l0;
        Canvas canvas0;
        Bitmap bitmap0;
        h h0;
        if(continuation0 instanceof h) {
            h0 = (h)continuation0;
            int v2 = h0.i;
            if((v2 & 0x80000000) == 0) {
                h0 = new h(this, continuation0);
            }
            else {
                h0.i = v2 ^ 0x80000000;
            }
        }
        else {
            h0 = new h(this, continuation0);
        }
        Object object0 = h0.g;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(h0.i) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                bitmap0 = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmap0, "createBitmap(...)");
                canvas0 = new Canvas(bitmap0);
                l0 = this;
                iterator0 = persistentList0.iterator();
                goto label_41;
            }
            case 1: {
                v3 = h0.f;
                decoration$Absolute0 = h0.e;
                iterator1 = h0.d;
                canvas1 = h0.c;
                bitmap1 = h0.b;
                l1 = h0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            if(((Bitmap)object0) != null) {
                float f = Size.getWidth-impl(decoration$Absolute0.getSize-NH-jbRc()) / ((float)((Bitmap)object0).getWidth());
                float f1 = Size.getHeight-impl(decoration$Absolute0.getSize-NH-jbRc()) / ((float)((Bitmap)object0).getHeight());
                Matrix matrix0 = new Matrix();
                matrix0.postTranslate(((float)(-((Bitmap)object0).getWidth())) / 2.0f, ((float)(-((Bitmap)object0).getHeight())) / 2.0f);
                matrix0.postScale(f, f1);
                matrix0.postConcat(decoration$Absolute0.getMatrix());
                canvas1.drawBitmap(((Bitmap)object0), matrix0, null);
            }
            int v4 = v3;
            iterator0 = iterator1;
            canvas0 = canvas1;
            bitmap0 = bitmap1;
            l0 = l1;
        label_40:
            canvas0.restoreToCount(v4);
        label_41:
            if(!iterator0.hasNext()) {
                break;
            }
            Object object2 = iterator0.next();
            Absolute decoration$Absolute1 = (Absolute)object2;
            int v5 = canvas0.save();
            if(decoration$Absolute1 instanceof Sticker) {
                h0.a = l0;
                h0.b = bitmap0;
                h0.c = canvas0;
                h0.d = iterator0;
                h0.e = decoration$Absolute1;
                h0.f = v5;
                h0.i = 1;
                Object object3 = GetBitmapUseCase.invoke$default(l0.e, ((Sticker)decoration$Absolute1).getStickerUrl(), null, h0, 2, null);
                if(object3 == object1) {
                    return object1;
                }
                bitmap1 = bitmap0;
                canvas1 = canvas0;
                object0 = object3;
                l1 = l0;
                v3 = v5;
                iterator1 = iterator0;
                decoration$Absolute0 = decoration$Absolute1;
                continue;
            }
            if(decoration$Absolute1 instanceof Text) {
                TextData textData0 = ((Text)decoration$Absolute1).getTextData();
                long v6 = textData0.getBoundsSize-NH-jbRc();
                float f2 = Size.getWidth-impl(decoration$Absolute1.getSize-NH-jbRc()) / Size.getWidth-impl(v6);
                float f3 = Size.getHeight-impl(decoration$Absolute1.getSize-NH-jbRc()) / Size.getHeight-impl(v6);
                int v7 = textData0.getAlign-e0LSkKk();
                if(TextAlign.equals-impl0(v7, 1)) {
                    float f4 = Size.getWidth-impl(v6);
                    f5 = Size.getWidth-impl(textData0.getPadding-NH-jbRc()) + -f4;
                }
                else {
                    f5 = TextAlign.equals-impl0(v7, 2) ? -Size.getWidth-impl(textData0.getPadding-NH-jbRc()) : -Size.getWidth-impl(v6) / 2.0f;
                }
                Matrix matrix1 = decoration$Absolute1.getMatrix();
                int v8 = canvas0.save();
                canvas0.concat(matrix1);
                try {
                    canvas0.scale(f2, f3);
                    canvas0.translate(f5, -Size.getHeight-impl(v6) / 2.0f);
                    l.a(textData0.getStaticLayout(l0.a), canvas0, v6, textData0.getBackgroundPaint(), 8);
                }
                finally {
                    canvas0.restoreToCount(v8);
                }
            }
            v4 = v5;
            goto label_40;
        }
        return bitmap0;
    }

    public final Object a(Bitmap bitmap0, Border border0, Continuation continuation0) {
        Canvas canvas18;
        Function3 function328;
        float f23;
        l l12;
        Border border11;
        Function3 function326;
        float f20;
        float f19;
        Canvas canvas16;
        l l10;
        Function3 function323;
        Object object6;
        float f18;
        float f17;
        float f16;
        Border border8;
        Canvas canvas14;
        l l8;
        float f15;
        Object object5;
        Canvas canvas13;
        Integer integer3;
        float f12;
        Function3 function316;
        Function3 function315;
        l l6;
        Border border6;
        Canvas canvas11;
        Integer integer2;
        float f11;
        Bitmap bitmap1;
        Canvas canvas10;
        l l4;
        Canvas canvas9;
        float f9;
        Border border4;
        Object object4;
        Integer integer1;
        Function3 function38;
        l l2;
        Function3 function37;
        Border border2;
        Canvas canvas7;
        Object object3;
        Canvas canvas6;
        Function3 function36;
        Integer integer0;
        Canvas canvas5;
        int v4;
        float f4;
        int v3;
        float f3;
        float f2;
        l l0;
        Border border1;
        Function3 function32;
        Function3 function31;
        Function3 function30;
        Canvas canvas3;
        Canvas canvas2;
        int v2;
        Canvas canvas1;
        Object object2;
        f f1;
        d d0;
        e e0;
        float f;
        f.c c0;
        if(continuation0 instanceof f.c) {
            c0 = (f.c)continuation0;
            int v = c0.n;
            if((v & 0x80000000) == 0) {
                c0 = new f.c(this, continuation0);
            }
            else {
                c0.n = v ^ 0x80000000;
            }
        }
        else {
            c0 = new f.c(this, continuation0);
        }
        Object object0 = c0.l;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(c0.n) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(Intrinsics.areEqual(border0, Border.Companion.getORIGIN())) {
                    return Unit.INSTANCE;
                }
                Canvas canvas0 = new Canvas(bitmap0);
                int v1 = canvas0.save();
                try {
                    f = ((float)Math.min(canvas0.getWidth(), canvas0.getHeight())) / 5.0f;
                    e0 = new e(canvas0, f);
                    d0 = new d(canvas0, f);
                    f1 = new f(canvas0, f);
                    c0.a = this;
                    c0.b = border0;
                    c0.c = canvas0;
                    c0.d = canvas0;
                    c0.e = e0;
                    c0.f = d0;
                    c0.g = f1;
                    c0.h = v1;
                    c0.i = f;
                    c0.j = 0.0f;
                    c0.k = f;
                    c0.n = 1;
                    object2 = GetBitmapUseCase.invoke$default(this.e, Boxing.boxInt(border0.getIconLeftTop()), null, c0, 2, null);
                }
                catch(Throwable throwable0) {
                    canvas1 = canvas0;
                    v2 = v1;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                if(object2 == object1) {
                    return object1;
                }
                canvas2 = canvas0;
                canvas3 = canvas2;
                object0 = object2;
                function30 = e0;
                function31 = d0;
                function32 = f1;
                border1 = border0;
                l0 = this;
                f2 = f;
                f3 = f2;
                v3 = v1;
                f4 = 0.0f;
                goto label_76;
            }
            case 1: {
                f2 = c0.k;
                float f5 = c0.j;
                float f6 = c0.i;
                v4 = c0.h;
                Function3 function33 = c0.g;
                Function3 function34 = c0.f;
                Function3 function35 = c0.e;
                Canvas canvas4 = (Canvas)c0.d;
                canvas5 = c0.c;
                border1 = (Border)c0.b;
                l l1 = (l)c0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    f4 = f5;
                    l0 = l1;
                    f3 = f6;
                    canvas2 = canvas4;
                    v3 = v4;
                    function30 = function35;
                    function32 = function33;
                    function31 = function34;
                    canvas3 = canvas5;
                }
                catch(Throwable throwable0) {
                    v2 = v4;
                    canvas1 = canvas5;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                try {
                label_76:
                    if(((Bitmap)object0) != null) {
                        function30.invoke(((Bitmap)object0), Boxing.boxFloat(f4), Boxing.boxFloat(f2));
                    }
                    integer0 = Boxing.boxInt(border1.getIconTop());
                    c0.a = l0;
                    c0.b = border1;
                    c0.c = canvas3;
                    c0.d = canvas2;
                    c0.e = function30;
                    c0.f = function31;
                    c0.g = function32;
                    c0.h = v3;
                    c0.i = f3;
                    c0.j = f4;
                    c0.k = f2;
                    c0.n = 2;
                    function36 = function31;
                    canvas6 = canvas3;
                }
                catch(Throwable throwable0) {
                    canvas6 = canvas3;
                    v2 = v3;
                    canvas1 = canvas6;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                try {
                    object3 = GetBitmapUseCase.invoke$default(l0.e, integer0, null, c0, 2, null);
                    if(object3 == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    v2 = v3;
                    canvas1 = canvas6;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                canvas7 = canvas2;
                border2 = border1;
                function37 = function32;
                l2 = l0;
                canvas1 = canvas6;
                function38 = function30;
                object0 = object3;
                goto label_130;
            }
            case 2: {
                f2 = c0.k;
                float f7 = c0.j;
                float f8 = c0.i;
                v4 = c0.h;
                Function3 function39 = c0.g;
                Function3 function310 = c0.f;
                Function3 function311 = c0.e;
                Canvas canvas8 = (Canvas)c0.d;
                canvas5 = c0.c;
                Border border3 = (Border)c0.b;
                l l3 = (l)c0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    function37 = function39;
                    function36 = function310;
                    canvas1 = canvas5;
                    border2 = border3;
                    v3 = v4;
                    function38 = function311;
                    canvas7 = canvas8;
                    l2 = l3;
                    f4 = f7;
                    f3 = f8;
                }
                catch(Throwable throwable0) {
                    v2 = v4;
                    canvas1 = canvas5;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                try {
                label_130:
                    if(((Bitmap)object0) != null) {
                        function36.invoke(((Bitmap)object0), Boxing.boxFloat(f4), Boxing.boxFloat(f2));
                    }
                    integer1 = Boxing.boxInt(border2.getIconRightTop());
                    c0.a = l2;
                    c0.b = border2;
                    c0.c = canvas1;
                    c0.d = canvas7;
                    c0.e = function38;
                    c0.f = function36;
                    c0.g = function37;
                    c0.h = v3;
                    c0.i = f3;
                    c0.j = f4;
                    c0.k = f2;
                    c0.n = 3;
                    canvas6 = canvas1;
                }
                catch(Throwable throwable0) {
                    v2 = v3;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                try {
                    object4 = GetBitmapUseCase.invoke$default(l2.e, integer1, null, c0, 2, null);
                    if(object4 == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    v2 = v3;
                    canvas1 = canvas6;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                border4 = border2;
                object0 = object4;
                f9 = f4;
                canvas9 = canvas7;
                l4 = l2;
                canvas10 = canvas6;
                goto label_176;
            }
            case 3: {
                f2 = c0.k;
                f9 = c0.j;
                float f10 = c0.i;
                v4 = c0.h;
                Function3 function312 = c0.g;
                Function3 function313 = c0.f;
                Function3 function314 = c0.e;
                canvas9 = (Canvas)c0.d;
                canvas5 = c0.c;
                Border border5 = (Border)c0.b;
                l l5 = (l)c0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    function37 = function312;
                    function36 = function313;
                    border4 = border5;
                    l4 = l5;
                    f3 = f10;
                    function38 = function314;
                    canvas10 = canvas5;
                    v3 = v4;
                }
                catch(Throwable throwable0) {
                    v2 = v4;
                    canvas1 = canvas5;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                try {
                label_176:
                    bitmap1 = (Bitmap)object0;
                    if(bitmap1 != null) {
                        goto label_178;
                    }
                    goto label_183;
                }
                catch(Throwable throwable0) {
                    goto label_200;
                }
                try {
                label_178:
                    function37.invoke(bitmap1, Boxing.boxFloat(f9), Boxing.boxFloat(f2));
                }
                catch(Throwable throwable0) {
                    canvas1 = canvas10;
                    v2 = v3;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                try {
                label_183:
                    f11 = ((float)canvas9.getHeight()) - f3;
                    integer2 = Boxing.boxInt(border4.getIconLeft());
                    c0.a = l4;
                    c0.b = border4;
                    c0.c = canvas10;
                    c0.d = canvas9;
                    c0.e = function38;
                    c0.f = function36;
                    c0.g = function37;
                    c0.h = v3;
                    c0.i = f3;
                    c0.j = f3;
                    c0.k = f11;
                    c0.n = 4;
                    canvas6 = canvas10;
                }
                catch(Throwable throwable0) {
                label_200:
                    canvas6 = canvas10;
                    v2 = v3;
                    canvas1 = canvas6;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                try {
                    object0 = GetBitmapUseCase.invoke$default(l4.e, integer2, null, c0, 2, null);
                    if(object0 == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    v2 = v3;
                    canvas1 = canvas6;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                canvas11 = canvas9;
                border6 = border4;
                l6 = l4;
                canvas1 = canvas6;
                function315 = function36;
                function316 = function37;
                f12 = f3;
                goto label_235;
            }
            case 4: {
                f11 = c0.k;
                float f13 = c0.j;
                float f14 = c0.i;
                v4 = c0.h;
                Function3 function317 = c0.g;
                Function3 function318 = c0.f;
                Function3 function319 = c0.e;
                Canvas canvas12 = (Canvas)c0.d;
                canvas5 = c0.c;
                Border border7 = (Border)c0.b;
                l l7 = (l)c0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    f12 = f14;
                    function316 = function317;
                    border6 = border7;
                    function38 = function319;
                    canvas11 = canvas12;
                    function315 = function318;
                    canvas1 = canvas5;
                    v3 = v4;
                    l6 = l7;
                    f3 = f13;
                }
                catch(Throwable throwable0) {
                    v2 = v4;
                    canvas1 = canvas5;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                try {
                label_235:
                    if(((Bitmap)object0) != null) {
                        function38.invoke(((Bitmap)object0), Boxing.boxFloat(f3), Boxing.boxFloat(f11));
                    }
                    integer3 = Boxing.boxInt(border6.getIconRight());
                    c0.a = l6;
                    c0.b = border6;
                    c0.c = canvas1;
                    c0.d = canvas11;
                    c0.e = function38;
                    c0.f = function315;
                    c0.g = function316;
                    c0.h = v3;
                    c0.i = f12;
                    c0.j = f3;
                    c0.k = f11;
                    c0.n = 5;
                    canvas6 = canvas1;
                    canvas13 = canvas11;
                }
                catch(Throwable throwable0) {
                    v2 = v3;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                try {
                    object5 = GetBitmapUseCase.invoke$default(l6.e, integer3, null, c0, 2, null);
                }
                catch(Throwable throwable0) {
                    v2 = v3;
                    canvas1 = canvas6;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                if(object5 == object1) {
                    return object1;
                }
                f15 = f12;
                l8 = l6;
                canvas14 = canvas6;
                border8 = border6;
                object0 = object5;
                f16 = f3;
                goto label_295;
            }
            case 5: {
                f11 = c0.k;
                f16 = c0.j;
                f15 = c0.i;
                v4 = c0.h;
                Function3 function320 = c0.g;
                Function3 function321 = c0.f;
                Function3 function322 = c0.e;
                Canvas canvas15 = (Canvas)c0.d;
                canvas5 = c0.c;
                Border border9 = (Border)c0.b;
                l l9 = (l)c0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    function316 = function320;
                    canvas13 = canvas15;
                    canvas14 = canvas5;
                    v3 = v4;
                    function315 = function321;
                    function38 = function322;
                    l8 = l9;
                    border8 = border9;
                }
                catch(Throwable throwable0) {
                    v2 = v4;
                    canvas1 = canvas5;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                try {
                label_295:
                    if(((Bitmap)object0) != null) {
                        function316.invoke(((Bitmap)object0), Boxing.boxFloat(f16), Boxing.boxFloat(f11));
                    }
                    f17 = ((float)canvas13.getHeight()) - f15;
                    f18 = (float)canvas13.getHeight();
                    c0.a = l8;
                    c0.b = border8;
                    c0.c = canvas14;
                    c0.d = function38;
                    c0.e = function315;
                    c0.f = function316;
                    c0.g = null;
                    c0.h = v3;
                    c0.i = f17;
                    c0.j = f18;
                    c0.n = 6;
                    object6 = GetBitmapUseCase.invoke$default(l8.e, Boxing.boxInt(border8.getIconLeftBottom()), null, c0, 2, null);
                }
                catch(Throwable throwable0) {
                    canvas1 = canvas14;
                    v2 = v3;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                if(object6 == object1) {
                    return object1;
                }
                function323 = function38;
                l10 = l8;
                canvas16 = canvas14;
                f19 = f17;
                f20 = f18;
                object0 = object6;
                goto label_346;
            }
            case 6: {
                f20 = c0.j;
                float f21 = c0.i;
                v2 = c0.h;
                Function3 function324 = c0.f;
                Function3 function325 = c0.e;
                function323 = (Function3)c0.d;
                Canvas canvas17 = c0.c;
                Border border10 = (Border)c0.b;
                l l11 = (l)c0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    f19 = f21;
                    function316 = function324;
                    canvas16 = canvas17;
                    border8 = border10;
                    l10 = l11;
                    v3 = v2;
                    function315 = function325;
                }
                catch(Throwable throwable0) {
                    canvas1 = canvas17;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                try {
                label_346:
                    if(((Bitmap)object0) != null) {
                        function323.invoke(((Bitmap)object0), Boxing.boxFloat(f19), Boxing.boxFloat(f20));
                    }
                    c0.a = l10;
                    c0.b = border8;
                    c0.c = canvas16;
                    c0.d = function315;
                    c0.e = function316;
                    c0.f = null;
                    c0.h = v3;
                    c0.i = f19;
                    c0.j = f20;
                    c0.n = 7;
                    object0 = GetBitmapUseCase.invoke$default(l10.e, Boxing.boxInt(border8.getIconBottom()), null, c0, 2, null);
                    if(object0 == object1) {
                        return object1;
                    }
                    function326 = function315;
                    border11 = border8;
                    l12 = l10;
                    goto label_381;
                }
                catch(Throwable throwable0) {
                    v2 = v3;
                    canvas1 = canvas16;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
            }
            case 7: {
                f20 = c0.j;
                float f22 = c0.i;
                v2 = c0.h;
                Function3 function327 = c0.e;
                function326 = (Function3)c0.d;
                canvas1 = c0.c;
                border11 = (Border)c0.b;
                l12 = (l)c0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                    f19 = f22;
                    v3 = v2;
                    function316 = function327;
                    canvas16 = canvas1;
                }
                catch(Throwable throwable0) {
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                try {
                label_381:
                    if(((Bitmap)object0) != null) {
                        function326.invoke(((Bitmap)object0), Boxing.boxFloat(f19), Boxing.boxFloat(f20));
                    }
                    c0.a = canvas16;
                    c0.b = function316;
                    c0.c = null;
                    c0.d = null;
                    c0.e = null;
                    c0.h = v3;
                    c0.i = f19;
                    c0.j = f20;
                    c0.n = 8;
                    object0 = GetBitmapUseCase.invoke$default(l12.e, Boxing.boxInt(border11.getIconRightBottom()), null, c0, 2, null);
                }
                catch(Throwable throwable0) {
                    v2 = v3;
                    canvas1 = canvas16;
                    canvas1.restoreToCount(v2);
                    throw throwable0;
                }
                if(object0 == object1) {
                    return object1;
                }
                f23 = f19;
                function328 = function316;
                v2 = v3;
                canvas18 = canvas16;
                goto label_411;
            }
            case 8: {
                f20 = c0.j;
                f23 = c0.i;
                v2 = c0.h;
                function328 = (Function3)c0.b;
                canvas18 = (Canvas)c0.a;
                try {
                    ResultKt.throwOnFailure(object0);
                label_411:
                    if(((Bitmap)object0) != null) {
                        function328.invoke(((Bitmap)object0), Boxing.boxFloat(f23), Boxing.boxFloat(f20));
                    }
                    goto label_418;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        canvas1 = canvas18;
        canvas1.restoreToCount(v2);
        throw throwable0;
    label_418:
        canvas18.restoreToCount(v2);
        return Unit.INSTANCE;
    }

    public final Object a(Bitmap bitmap0, Signature signature0, Continuation continuation0) {
        l l0;
        Object object2;
        Paint paint0;
        long v7;
        long v6;
        g g0;
        Bitmap bitmap1 = bitmap0;
        Signature signature1 = signature0;
        if(continuation0 instanceof g) {
            g0 = (g)continuation0;
            int v = g0.i;
            if((v & 0x80000000) == 0) {
                g0 = new g(this, continuation0);
            }
            else {
                g0.i = v ^ 0x80000000;
            }
        }
        else {
            g0 = new g(this, continuation0);
        }
        Object object0 = g0.g;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(g0.i) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(signature1 instanceof com.kakao.kandinsky.core.kdphoto.Signature.Text && ((com.kakao.kandinsky.core.kdphoto.Signature.Text)signature1).getWatermark()) {
                    this.a(bitmap1, ((com.kakao.kandinsky.core.kdphoto.Signature.Text)signature1));
                    return Unit.INSTANCE;
                }
                if(signature1 instanceof com.kakao.kandinsky.core.kdphoto.Signature.Text) {
                    long v1 = SizeKt.Size(bitmap0.getWidth(), bitmap0.getHeight());
                    float f = Size.getWidth-impl(v1);
                    long v2 = MetaDataConverter.INSTANCE.createSize-xjbvk4A(f, ((com.kakao.kandinsky.core.kdphoto.Signature.Text)signature1).getMetaData());
                    Rect rect0 = SizeKt.toRect-uvyYCjk(v1);
                    Matrix matrix0 = MetaDataConverter.INSTANCE.createMatrixForPhoto(rect0, ((com.kakao.kandinsky.core.kdphoto.Signature.Text)signature1).getMetaData());
                    long v3 = ((com.kakao.kandinsky.core.kdphoto.Signature.Text)signature1).getTextData().getBoundsSize-NH-jbRc();
                    float f1 = Size.getWidth-impl(v2) / Size.getWidth-impl(v3);
                    Canvas canvas0 = new Canvas(bitmap1);
                    int v4 = canvas0.save();
                    canvas0.concat(matrix0);
                    try {
                        canvas0.scale(f1, f1);
                        canvas0.translate(-Size.getWidth-impl(v3) / 2.0f, -Size.getHeight-impl(v3) / 2.0f);
                        l.a(((com.kakao.kandinsky.core.kdphoto.Signature.Text)signature1).getTextData().getStaticLayout(this.a), canvas0, v3, ((com.kakao.kandinsky.core.kdphoto.Signature.Text)signature1).getTextData().getBackgroundPaint(), 8);
                        return Unit.INSTANCE;
                    }
                    finally {
                        canvas0.restoreToCount(v4);
                    }
                }
                if(signature1 instanceof Image) {
                    v6 = SizeKt.Size(bitmap0.getWidth(), bitmap0.getHeight());
                    float f2 = Size.getWidth-impl(v6);
                    v7 = MetaDataConverter.INSTANCE.createSize-xjbvk4A(f2, ((Image)signature1).getMetaData());
                    paint0 = new Paint();
                    paint0.setAlpha(((int)(((Image)signature1).getAlpha() / 100.0f * 255.0f)));
                    android.util.Size size0 = SizeExtensionKt.toAndroidSize-ozmzZPI(SizeExtensionKt.roundToIntSize-uvyYCjk(SizeExtensionKt.correctionMax-TmRCtEA(v7, Size.getMaxDimension-impl(v6))));
                    g0.a = this;
                    g0.b = bitmap1;
                    g0.c = signature1;
                    g0.d = paint0;
                    g0.e = v6;
                    g0.f = v7;
                    g0.i = 1;
                    object2 = this.e.invoke(((Image)signature1).getUri(), size0, g0);
                    if(object2 == object1) {
                        return object1;
                    }
                    l0 = this;
                    goto label_69;
                }
                break;
            }
            case 1: {
                long v8 = g0.f;
                v6 = g0.e;
                Paint paint1 = g0.d;
                signature1 = g0.c;
                Bitmap bitmap2 = g0.b;
                l l1 = g0.a;
                ResultKt.throwOnFailure(object0);
                v7 = v8;
                l0 = l1;
                object2 = object0;
                paint0 = paint1;
                bitmap1 = bitmap2;
            label_69:
                Bitmap bitmap3 = (Bitmap)object2;
                if(bitmap3 != null) {
                    l0.getClass();
                    long v9 = SizeKt.Size(bitmap3.getWidth(), bitmap3.getHeight());
                    float f3 = Size.getWidth-impl(v7);
                    float f4 = Size.getWidth-impl(v9);
                    float f5 = Size.getHeight-impl(v7);
                    float f6 = Size.getHeight-impl(v9);
                    Rect rect1 = SizeKt.toRect-uvyYCjk(v6);
                    Matrix matrix1 = MetaDataConverter.INSTANCE.createMatrixForPhoto(rect1, ((Image)signature1).getMetaData());
                    matrix1.preTranslate(-Size.getWidth-impl(v7) / 2.0f, -Size.getHeight-impl(v7) / 2.0f);
                    matrix1.preScale(f3 / f4, f5 / f6);
                    Canvas canvas1 = new Canvas(bitmap1);
                    int v10 = canvas1.save();
                    try {
                        int v12 = canvas1.save();
                        canvas1.concat(matrix1);
                        try {
                            float f7 = Size.getMinDimension-impl(v9) * 8.0f / 100.0f;
                            Path path0 = new Path();
                            path0.addRoundRect(0.0f, 0.0f, Size.getWidth-impl(v9), Size.getHeight-impl(v9), f7, f7, Path.Direction.CW);
                            canvas1.clipPath(path0);
                            canvas1.drawBitmap(bitmap3, 0.0f, 0.0f, paint0);
                        }
                        catch(Throwable throwable0) {
                            canvas1.restoreToCount(v12);
                            throw throwable0;
                        }
                        canvas1.restoreToCount(v12);
                        return Unit.INSTANCE;
                    }
                    finally {
                        canvas1.restoreToCount(v10);
                    }
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }

    public final Object a(KDPhoto kDPhoto0, Continuation continuation0) {
        Object object1;
        Object object0;
        j j0;
        if(continuation0 instanceof j) {
            j0 = (j)continuation0;
            int v = j0.g;
            if((v & 0x80000000) == 0) {
                j0 = new j(this, continuation0);
            }
            else {
                j0.g = v ^ 0x80000000;
            }
        }
        else {
            j0 = new j(this, continuation0);
        }
        try {
            object0 = j0.e;
            object1 = a.getCOROUTINE_SUSPENDED();
            switch(j0.g) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_30;
                }
                case 2: {
                    goto label_76;
                }
                case 3: {
                    goto label_96;
                }
                case 4: {
                    goto label_120;
                }
                case 5: {
                    goto label_130;
                }
                case 6: {
                    goto label_141;
                }
            }
        }
        catch(Exception exception0) {
            Logger.INSTANCE.log("save exception " + exception0);
            return null;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ResultKt.throwOnFailure(object0);
        try {
            ObjectRef ref$ObjectRef0 = new ObjectRef();
            android.util.Size size0 = SizeExtensionKt.toAndroidSize-ozmzZPI(kDPhoto0.getBitmapSize-YbymL2g());
            j0.a = this;
            j0.b = kDPhoto0;
            j0.c = ref$ObjectRef0;
            j0.d = ref$ObjectRef0;
            j0.g = 1;
            Object object2 = this.e.invoke(kDPhoto0.getOriginalUri(), size0, j0);
            if(object2 == object1) {
                return object1;
            }
            l l0 = this;
            ObjectRef ref$ObjectRef1 = ref$ObjectRef0;
            ObjectRef ref$ObjectRef2 = ref$ObjectRef1;
            Object object3 = object2;
            KDPhoto kDPhoto1 = kDPhoto0;
            goto label_40;
        label_30:
            ObjectRef ref$ObjectRef3 = j0.d;
            ObjectRef ref$ObjectRef4 = j0.c;
            KDPhoto kDPhoto2 = j0.b;
            l l1 = j0.a;
            ResultKt.throwOnFailure(object0);
            ref$ObjectRef2 = ref$ObjectRef4;
            l0 = l1;
            ref$ObjectRef1 = ref$ObjectRef3;
            object3 = object0;
            kDPhoto1 = kDPhoto2;
        label_40:
            if(((Bitmap)object3) == null) {
                return null;
            }
            ref$ObjectRef1.element = (Bitmap)object3;
            GetFilteredBitmapUseCase getFilteredBitmapUseCase0 = l0.f;
            Bitmap bitmap0 = (Bitmap)ref$ObjectRef2.element;
            Filter filter0 = kDPhoto1.getFilter();
            float f = kDPhoto1.getFilterIntensity();
            Effect effect0 = kDPhoto1.getEffect();
            ArrayList arrayList0 = new ArrayList();
            for(Object object4: kDPhoto1.getDecorationList()) {
                if(object4 instanceof Mosaic) {
                    arrayList0.add(object4);
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object5: kDPhoto1.getDecorationList()) {
                if(object5 instanceof Blur) {
                    arrayList1.add(object5);
                }
            }
            Object object6 = CollectionsKt___CollectionsKt.firstOrNull(arrayList1);
            j0.a = l0;
            j0.b = kDPhoto1;
            j0.c = ref$ObjectRef2;
            j0.d = ref$ObjectRef2;
            j0.g = 2;
            Object object7 = getFilteredBitmapUseCase0.invoke(bitmap0, filter0, f, effect0, arrayList0, ((Blur)object6), j0);
            if(object7 == object1) {
                return object1;
            }
            KDPhoto kDPhoto3 = kDPhoto1;
            object0 = object7;
            ObjectRef ref$ObjectRef5 = ref$ObjectRef2;
            l l2 = l0;
            goto label_85;
        label_76:
            ObjectRef ref$ObjectRef6 = j0.d;
            ObjectRef ref$ObjectRef7 = j0.c;
            KDPhoto kDPhoto4 = j0.b;
            l l3 = j0.a;
            ResultKt.throwOnFailure(object0);
            ref$ObjectRef2 = ref$ObjectRef6;
            ref$ObjectRef5 = ref$ObjectRef7;
            kDPhoto3 = kDPhoto4;
            l2 = l3;
        label_85:
            ref$ObjectRef2.element = object0;
            int v1 = ((Bitmap)ref$ObjectRef5.element).getWidth();
            int v2 = ((Bitmap)ref$ObjectRef5.element).getHeight();
            j0.a = l2;
            j0.b = kDPhoto3;
            j0.c = ref$ObjectRef5;
            j0.d = null;
            j0.g = 3;
            object0 = l2.a(v1, v2, kDPhoto3.getDecorationList(), j0);
            if(object0 == object1) {
                return object1;
            label_96:
                ref$ObjectRef5 = j0.c;
                kDPhoto3 = j0.b;
                l2 = j0.a;
                ResultKt.throwOnFailure(object0);
            }
            Bitmap bitmap1 = (Bitmap)ref$ObjectRef5.element;
            l2.getClass();
            Canvas canvas0 = new Canvas(bitmap1);
            int v3 = canvas0.save();
            try {
                canvas0.drawBitmap(((Bitmap)object0), 0.0f, 0.0f, null);
            }
            finally {
                canvas0.restoreToCount(v3);
            }
            ((Bitmap)object0).recycle();
            Bitmap bitmap2 = l.a(((Bitmap)ref$ObjectRef5.element), kDPhoto3);
            ref$ObjectRef5.element = bitmap2;
            Bitmap bitmap3 = l.a(bitmap2, kDPhoto3.getRequireWidth());
            ref$ObjectRef5.element = bitmap3;
            j0.a = l2;
            j0.b = kDPhoto3;
            j0.c = ref$ObjectRef5;
            j0.g = 4;
            if(l2.a(bitmap3, kDPhoto3.getBorder(), j0) == object1) {
                return object1;
            label_120:
                ref$ObjectRef5 = j0.c;
                kDPhoto3 = j0.b;
                l2 = j0.a;
                ResultKt.throwOnFailure(object0);
            }
            j0.a = l2;
            j0.b = kDPhoto3;
            j0.c = ref$ObjectRef5;
            j0.g = 5;
            if(l2.a(((Bitmap)ref$ObjectRef5.element), kDPhoto3.getSignature(), j0) == object1) {
                return object1;
            label_130:
                ref$ObjectRef5 = j0.c;
                kDPhoto3 = j0.b;
                l2 = j0.a;
                ResultKt.throwOnFailure(object0);
            }
            j0.a = null;
            j0.b = null;
            j0.c = null;
            j0.g = 6;
            object0 = l2.a(kDPhoto3.getOriginalUri(), ((Bitmap)ref$ObjectRef5.element), j0);
            if(object0 == object1) {
                return object1;
            label_141:
                ResultKt.throwOnFailure(object0);
            }
            return (String)object0;
        }
        catch(Exception exception0) {
            Logger.INSTANCE.log("save exception " + exception0);
            return null;
        }
    }

    public final Object a(KPhotoKey kPhotoKey0, Continuation continuation0) {
        l l0;
        i i0;
        if(continuation0 instanceof i) {
            i0 = (i)continuation0;
            int v = i0.d;
            if((v & 0x80000000) == 0) {
                i0 = new i(this, continuation0);
            }
            else {
                i0.d = v ^ 0x80000000;
            }
        }
        else {
            i0 = new i(this, continuation0);
        }
        Object object0 = i0.b;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(i0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                i0.a = this;
                i0.d = 1;
                object0 = this.g.a(kPhotoKey0, i0);
                if(object0 == object1) {
                    return object1;
                }
                l0 = this;
                break;
            }
            case 1: {
                l0 = i0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return (String)object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((KDPhoto)object0) != null) {
            i0.a = null;
            i0.d = 2;
            object0 = l0.a(((KDPhoto)object0), i0);
            return object0 == object1 ? object1 : ((String)object0);
        }
        return null;
    }

    public final Object a(String s, Bitmap bitmap0, Continuation continuation0) {
        Uri uri2;
        k k0;
        if(continuation0 instanceof k) {
            k0 = (k)continuation0;
            int v = k0.e;
            if((v & 0x80000000) == 0) {
                k0 = new k(this, continuation0);
            }
            else {
                k0.e = v ^ 0x80000000;
            }
        }
        else {
            k0 = new k(this, continuation0);
        }
        Object object0 = k0.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(k0.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Uri uri0 = Uri.parse(s);
                String s1 = this.b.getType(uri0);
                if(s1 == null) {
                    s1 = "image/jpeg";
                }
                String s2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(s1);
                if(s2 == null) {
                    s2 = "jpg";
                }
                this.d.getClass();
                Uri uri1 = b.a(this.c, s2);
                Bitmap.CompressFormat bitmap$CompressFormat0 = Intrinsics.areEqual(s1, "image/jpeg") ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG;
                k0.a = bitmap0;
                k0.b = uri1;
                k0.e = 1;
                this.d.getClass();
                Unit unit0 = BuildersKt.withContext(Dispatchers.getIO(), new f.a(this.b, bitmap$CompressFormat0, bitmap0, uri1, null), k0);
                if(unit0 != a.getCOROUTINE_SUSPENDED()) {
                    unit0 = Unit.INSTANCE;
                }
                if(unit0 == object1) {
                    return object1;
                }
                uri2 = uri1;
                break;
            }
            case 1: {
                uri2 = k0.b;
                bitmap0 = k0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        bitmap0.recycle();
        return uri2.getPath();
    }

    public final void a(Bitmap bitmap0, com.kakao.kandinsky.core.kdphoto.Signature.Text signature$Text0) {
        int v4;
        long v = SizeKt.Size(bitmap0.getWidth(), bitmap0.getHeight());
        WatermarkDrawData signature$Text$Companion$WatermarkDrawData0 = signature$Text0.getWatermarkDrawData-uvyYCjk(v);
        TextData textData0 = signature$Text0.getTextData();
        StaticLayout staticLayout0 = signature$Text0.getTextData().getStaticLayout(this.a);
        Paint paint0 = signature$Text0.getTextData().getBackgroundPaint();
        String s = Size.toString-impl(v);
        Logger.INSTANCE.log("watermark drawdata " + s + " " + signature$Text$Companion$WatermarkDrawData0);
        Canvas canvas0 = new Canvas(bitmap0);
        int v1 = canvas0.save();
        try {
            canvas0.translate(-(Size.getWidth-impl(signature$Text$Companion$WatermarkDrawData0.getBoundsSize-NH-jbRc()) - Size.getWidth-impl(v)) / 2.0f, -(Size.getHeight-impl(signature$Text$Companion$WatermarkDrawData0.getBoundsSize-NH-jbRc()) - Size.getHeight-impl(v)) / 2.0f);
            canvas0.rotate(-45.0f, Size.getWidth-impl(signature$Text$Companion$WatermarkDrawData0.getBoundsSize-NH-jbRc()) / 2.0f, Size.getHeight-impl(signature$Text$Companion$WatermarkDrawData0.getBoundsSize-NH-jbRc()) / 2.0f);
            for(float f = 0.0f; f < Size.getWidth-impl(signature$Text$Companion$WatermarkDrawData0.getBoundsSize-NH-jbRc()); f += Size.getWidth-impl(signature$Text$Companion$WatermarkDrawData0.getSignSize-NH-jbRc()) + signature$Text$Companion$WatermarkDrawData0.getPadding()) {
                for(float f1 = 0.0f; f1 < Size.getHeight-impl(signature$Text$Companion$WatermarkDrawData0.getBoundsSize-NH-jbRc()); f1 += Size.getHeight-impl(signature$Text$Companion$WatermarkDrawData0.getSignSize-NH-jbRc()) + signature$Text$Companion$WatermarkDrawData0.getPadding()) {
                    int v3 = canvas0.save();
                    try {
                        canvas0.translate(f, f1);
                        canvas0.scale(signature$Text$Companion$WatermarkDrawData0.getSignScale(), signature$Text$Companion$WatermarkDrawData0.getSignScale());
                        v4 = v3;
                        l.a(staticLayout0, canvas0, textData0.getBoundsSize-NH-jbRc(), paint0, 0);
                    }
                    catch(Throwable throwable0) {
                        canvas0.restoreToCount(v4);
                        throw throwable0;
                    }
                    canvas0.restoreToCount(v4);
                }
            }
        }
        finally {
            canvas0.restoreToCount(v1);
        }
    }
}

