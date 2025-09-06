package com.kakao.kandinsky.mosaic;

import aa.e0;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Size;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.core.graphics.MatrixKt;
import bb.b;
import com.kakao.kandinsky.bitmap.usecase.GetBitmapUseCase;
import com.kakao.kandinsky.core.filter.usecase.GetFilteredBitmapUseCase;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.Effect;
import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.core.kdphoto.Mosaic.Type;
import com.kakao.kandinsky.core.kdphoto.Mosaic;
import com.kakao.kandinsky.designsystem.util.SizeExtensionKt;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import com.kakao.kandinsky.utils.MatrixValuesKt;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import ka.a;
import ka.d;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zd.c;

@Stable
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000EJ\u0018\u0010\u0011\u001A\u00020\n2\u0006\u0010\u0010\u001A\u00020\u000FH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0019\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00172\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001AJ\r\u0010\u001B\u001A\u00020\n¢\u0006\u0004\b\u001B\u0010\u001CR/\u0010$\u001A\u0004\u0018\u00010\u00182\b\u0010\u001D\u001A\u0004\u0018\u00010\u00188F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R/\u0010(\u001A\u0004\u0018\u00010\u00182\b\u0010\u001D\u001A\u0004\u0018\u00010\u00188F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001F\u001A\u0004\b&\u0010!\"\u0004\b\'\u0010#¨\u0006*"}, d2 = {"Lcom/kakao/kandinsky/mosaic/MosaicAndBlurBitmapLoader;", "", "Lcom/kakao/kandinsky/bitmap/usecase/GetBitmapUseCase;", "getBitmapUseCase", "Lcom/kakao/kandinsky/core/filter/usecase/GetFilteredBitmapUseCase;", "getFilteredBitmapUseCase", "<init>", "(Lcom/kakao/kandinsky/bitmap/usecase/GetBitmapUseCase;Lcom/kakao/kandinsky/core/filter/usecase/GetFilteredBitmapUseCase;)V", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "", "setPhoto", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)V", "loadFullBitmap", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "no", "loadBitmapExcludeSelected", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "mosaic", "Lcom/kakao/kandinsky/core/kdphoto/Blur;", "blur", "Landroidx/compose/runtime/State;", "Landroid/graphics/Bitmap;", "loadSelectedBitmap", "(Lcom/kakao/kandinsky/core/kdphoto/Mosaic;Lcom/kakao/kandinsky/core/kdphoto/Blur;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "clear", "()V", "<set-?>", "e", "Landroidx/compose/runtime/MutableState;", "getFullBitmap", "()Landroid/graphics/Bitmap;", "setFullBitmap", "(Landroid/graphics/Bitmap;)V", "fullBitmap", "f", "getBitmapExcludeSelected", "setBitmapExcludeSelected", "bitmapExcludeSelected", "Companion", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMosaicAndBlurBitmapLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MosaicAndBlurBitmapLoader.kt\ncom/kakao/kandinsky/mosaic/MosaicAndBlurBitmapLoader\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,155:1\n81#2:156\n107#2,2:157\n81#2:159\n107#2,2:160\n800#3,11:162\n800#3,11:173\n800#3,11:184\n766#3:195\n857#3,2:196\n800#3,11:198\n1549#3:216\n1620#3,3:217\n1#4:209\n1223#5,6:210\n*S KotlinDebug\n*F\n+ 1 MosaicAndBlurBitmapLoader.kt\ncom/kakao/kandinsky/mosaic/MosaicAndBlurBitmapLoader\n*L\n30#1:156\n30#1:157,2\n31#1:159\n31#1:160,2\n42#1:162,11\n43#1:173,11\n57#1:184,11\n57#1:195\n57#1:196,2\n58#1:198,11\n128#1:216\n128#1:217,3\n72#1:210,6\n*E\n"})
public final class MosaicAndBlurBitmapLoader {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/kandinsky/mosaic/MosaicAndBlurBitmapLoader$Companion;", "", "", "MOSAIC_DOWN_SAMPLING_RATIO", "F", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    public static final float MOSAIC_DOWN_SAMPLING_RATIO = 0.5f;
    public final GetBitmapUseCase a;
    public final GetFilteredBitmapUseCase b;
    public Bitmap c;
    public KDPhoto d;
    public final MutableState e;
    public final MutableState f;

    static {
        MosaicAndBlurBitmapLoader.Companion = new Companion(null);
    }

    @Inject
    public MosaicAndBlurBitmapLoader(@NotNull GetBitmapUseCase getBitmapUseCase0, @NotNull GetFilteredBitmapUseCase getFilteredBitmapUseCase0) {
        Intrinsics.checkNotNullParameter(getBitmapUseCase0, "getBitmapUseCase");
        Intrinsics.checkNotNullParameter(getFilteredBitmapUseCase0, "getFilteredBitmapUseCase");
        super();
        this.a = getBitmapUseCase0;
        this.b = getFilteredBitmapUseCase0;
        this.d = KDPhoto.Companion.getEmpty();
        this.e = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public final Object a(List list0, Blur blur0, Continuation continuation0) {
        Blur blur3;
        ArrayList arrayList1;
        Blur blur2;
        List list1;
        Blur blur1;
        MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader1;
        MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0;
        Bitmap bitmap0;
        a a0;
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v = a0.u;
            if((v & 0x80000000) == 0) {
                a0 = new a(this, continuation0);
            }
            else {
                a0.u = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(this, continuation0);
        }
        Object object0 = a0.s;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a0.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                bitmap0 = this.c != null && !this.c.isRecycled() ? this.c : null;
                if(bitmap0 == null) {
                    long v1 = IntSizeKt.IntSize(c.roundToInt(((float)IntSize.getWidth-impl(this.d.getBitmapSize-YbymL2g())) * 0.5f), c.roundToInt(((float)IntSize.getHeight-impl(this.d.getBitmapSize-YbymL2g())) * 0.5f));
                    String s = this.d.getOriginalUri();
                    Size size0 = SizeExtensionKt.toAndroidSize-ozmzZPI(v1);
                    a0.o = this;
                    a0.p = list0;
                    a0.q = blur0;
                    a0.r = this;
                    a0.u = 1;
                    object0 = this.a.invoke(s, size0, a0);
                    if(object0 == object1) {
                        return object1;
                    }
                    mosaicAndBlurBitmapLoader0 = this;
                    mosaicAndBlurBitmapLoader1 = mosaicAndBlurBitmapLoader0;
                    blur1 = blur0;
                    list1 = list0;
                    goto label_43;
                }
                else {
                    mosaicAndBlurBitmapLoader1 = this;
                    blur2 = blur0;
                    list1 = list0;
                }
                break;
            }
            case 1: {
                mosaicAndBlurBitmapLoader0 = a0.r;
                blur1 = a0.q;
                list1 = a0.p;
                mosaicAndBlurBitmapLoader1 = a0.o;
                ResultKt.throwOnFailure(object0);
            label_43:
                bitmap0 = (Bitmap)object0;
                mosaicAndBlurBitmapLoader0.c = bitmap0;
                if(bitmap0 == null) {
                    return null;
                }
                blur2 = blur1;
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        GetFilteredBitmapUseCase getFilteredBitmapUseCase0 = mosaicAndBlurBitmapLoader1.b;
        Filter filter0 = mosaicAndBlurBitmapLoader1.d.getFilter();
        float f = mosaicAndBlurBitmapLoader1.d.getFilterIntensity();
        Effect effect0 = mosaicAndBlurBitmapLoader1.d.getEffect();
        Matrix matrix0 = MatrixKt.scaleMatrix(0.5f, 0.5f);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
        for(Object object2: list1) {
            arrayList0.add(Mosaic.copy-lcW1YYU$default(((Mosaic)object2), 0, MatrixValuesKt.getMatrixValues(MatrixExtensionKt.buildMatrix(((Mosaic)object2).getMatrix(), new b(matrix0, 2))), 0L, 0.0f, null, 0L, 61, null));
        }
        if(blur2 == null) {
            arrayList1 = arrayList0;
            blur3 = null;
        }
        else {
            Matrix matrix1 = MatrixKt.scaleMatrix(0.5f, 0.5f);
            arrayList1 = arrayList0;
            blur3 = Blur.copy-lcW1YYU$default(blur2, 0, MatrixValuesKt.getMatrixValues(MatrixExtensionKt.buildMatrix(blur2.getMatrix(), new b(matrix1, 1))), 0L, 0.0f, null, 0L, 61, null);
        }
        a0.o = null;
        a0.p = null;
        a0.q = null;
        a0.r = null;
        a0.u = 2;
        object0 = getFilteredBitmapUseCase0.invoke(bitmap0, filter0, f, effect0, arrayList1, blur3, a0);
        return object0 == object1 ? object1 : object0;
    }

    public static final Mosaic access$getMosaicForImage--7Zfkj4(MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0, int v, long v1, long v2, float f) {
        mosaicAndBlurBitmapLoader0.getClass();
        float f1 = Math.max(androidx.compose.ui.geometry.Size.getWidth-impl(v1), androidx.compose.ui.geometry.Size.getHeight-impl(v1));
        return new Mosaic(v, MatrixValuesKt.getMatrixValues(MatrixExtensionKt.buildMatrix$default(null, new e0(f1, 9), 1, null)), SizeKt.Size(f1, f1), f, Type.Rectangle, v2, null);
    }

    public final void clear() {
        this.c = null;
        this.setFullBitmap(null);
        this.setBitmapExcludeSelected(null);
    }

    @Nullable
    public final Bitmap getBitmapExcludeSelected() {
        return (Bitmap)this.f.getValue();
    }

    @Nullable
    public final Bitmap getFullBitmap() {
        return (Bitmap)this.e.getValue();
    }

    @Nullable
    public final Object loadBitmapExcludeSelected(int v, @NotNull Continuation continuation0) {
        MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0;
        int v2;
        ka.b b0;
        if(continuation0 instanceof ka.b) {
            b0 = (ka.b)continuation0;
            int v1 = b0.s;
            if((v1 & 0x80000000) == 0) {
                b0 = new ka.b(this, continuation0);
            }
            else {
                b0.s = v1 ^ 0x80000000;
            }
        }
        else {
            b0 = new ka.b(this, continuation0);
        }
        Object object0 = b0.q;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        Object object2 = null;
        switch(b0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Bitmap bitmap0 = this.getBitmapExcludeSelected();
                this.setBitmapExcludeSelected(null);
                if(bitmap0 != null && !Intrinsics.areEqual(bitmap0, this.c)) {
                    bitmap0.recycle();
                }
                b0.o = this;
                b0.p = v;
                b0.s = 1;
                if(DelayKt.delay(10L, b0) == object1) {
                    return object1;
                }
                v2 = v;
                mosaicAndBlurBitmapLoader0 = this;
                goto label_32;
            }
            case 1: {
                int v3 = b0.p;
                MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader1 = b0.o;
                ResultKt.throwOnFailure(object0);
                v2 = v3;
                mosaicAndBlurBitmapLoader0 = mosaicAndBlurBitmapLoader1;
            label_32:
                PersistentList persistentList0 = mosaicAndBlurBitmapLoader0.d.getDecorationList();
                ArrayList arrayList0 = new ArrayList();
                for(Object object3: persistentList0) {
                    if(object3 instanceof Mosaic) {
                        arrayList0.add(object3);
                    }
                }
                ArrayList arrayList1 = new ArrayList();
                for(Object object4: arrayList0) {
                    if(((Mosaic)object4).getNo() != v2) {
                        arrayList1.add(object4);
                    }
                }
                PersistentList persistentList1 = mosaicAndBlurBitmapLoader0.d.getDecorationList();
                ArrayList arrayList2 = new ArrayList();
                for(Object object5: persistentList1) {
                    if(object5 instanceof Blur) {
                        arrayList2.add(object5);
                    }
                }
                Object object6 = CollectionsKt___CollectionsKt.firstOrNull(arrayList2);
                if(((Blur)object6) == null || ((Blur)object6).getNo() != v2) {
                    object2 = object6;
                }
                b0.o = mosaicAndBlurBitmapLoader0;
                b0.s = 2;
                object0 = mosaicAndBlurBitmapLoader0.a(arrayList1, ((Blur)object2), b0);
                if(object0 == object1) {
                    return object1;
                }
                mosaicAndBlurBitmapLoader0.setBitmapExcludeSelected(((Bitmap)object0));
                return Unit.INSTANCE;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        mosaicAndBlurBitmapLoader0 = b0.o;
        ResultKt.throwOnFailure(object0);
        mosaicAndBlurBitmapLoader0.setBitmapExcludeSelected(((Bitmap)object0));
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object loadFullBitmap(@NotNull Continuation continuation0) {
        MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader2;
        MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader1;
        Bitmap bitmap1;
        MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0;
        ka.c c0;
        if(continuation0 instanceof ka.c) {
            c0 = (ka.c)continuation0;
            int v = c0.t;
            if((v & 0x80000000) == 0) {
                c0 = new ka.c(this, continuation0);
            }
            else {
                c0.t = v ^ 0x80000000;
            }
        }
        else {
            c0 = new ka.c(this, continuation0);
        }
        Object object0 = c0.r;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(c0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Bitmap bitmap0 = this.getFullBitmap();
                c0.o = this;
                c0.p = bitmap0;
                c0.t = 1;
                if(DelayKt.delay(10L, c0) == object1) {
                    return object1;
                }
                mosaicAndBlurBitmapLoader0 = this;
                bitmap1 = bitmap0;
                goto label_26;
            }
            case 1: {
                bitmap1 = c0.p;
                mosaicAndBlurBitmapLoader0 = c0.o;
                ResultKt.throwOnFailure(object0);
            label_26:
                PersistentList persistentList0 = mosaicAndBlurBitmapLoader0.d.getDecorationList();
                ArrayList arrayList0 = new ArrayList();
                for(Object object2: persistentList0) {
                    if(object2 instanceof Mosaic) {
                        arrayList0.add(object2);
                    }
                }
                PersistentList persistentList1 = mosaicAndBlurBitmapLoader0.d.getDecorationList();
                ArrayList arrayList1 = new ArrayList();
                for(Object object3: persistentList1) {
                    if(object3 instanceof Blur) {
                        arrayList1.add(object3);
                    }
                }
                Blur blur0 = (Blur)CollectionsKt___CollectionsKt.firstOrNull(arrayList1);
                c0.o = mosaicAndBlurBitmapLoader0;
                c0.p = bitmap1;
                c0.q = mosaicAndBlurBitmapLoader0;
                c0.t = 2;
                object0 = mosaicAndBlurBitmapLoader0.a(arrayList0, blur0, c0);
                if(object0 == object1) {
                    return object1;
                }
                mosaicAndBlurBitmapLoader1 = mosaicAndBlurBitmapLoader0;
                mosaicAndBlurBitmapLoader2 = mosaicAndBlurBitmapLoader1;
                break;
            }
            case 2: {
                mosaicAndBlurBitmapLoader2 = c0.q;
                bitmap1 = c0.p;
                mosaicAndBlurBitmapLoader1 = c0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        mosaicAndBlurBitmapLoader2.setFullBitmap(((Bitmap)object0));
        if(bitmap1 != null && !Intrinsics.areEqual(bitmap1, mosaicAndBlurBitmapLoader1.c)) {
            bitmap1.recycle();
        }
        return Unit.INSTANCE;
    }

    @Composable
    @NotNull
    public final State loadSelectedBitmap(@Nullable Mosaic mosaic0, @Nullable Blur blur0, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceGroup(123295130);
        if((v1 & 1) != 0) {
            mosaic0 = null;
        }
        if((v1 & 2) != 0) {
            blur0 = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(123295130, v, -1, "com.kakao.kandinsky.mosaic.MosaicAndBlurBitmapLoader.loadSelectedBitmap (MosaicAndBlurBitmapLoader.kt:63)");
        }
        Object[] arr_object = {this.d, (mosaic0 == null ? null : mosaic0.getIntensity()), (mosaic0 == null ? null : androidx.compose.ui.geometry.Size.box-impl(mosaic0.getBlockSizeRatio-NH-jbRc())), (blur0 == null ? null : blur0.getIntensity()), (blur0 == null ? null : androidx.compose.ui.geometry.Size.box-impl(blur0.getTextureSizeRatio-NH-jbRc()))};
        composer0.startReplaceGroup(0x17383561);
        boolean z = composer0.changed(this);
        int v2 = 0;
        boolean z1 = (v & 14 ^ 6) > 4 && composer0.changed(mosaic0) || (v & 6) == 4;
        if((v & 0x70 ^ 0x30) > 0x20 && composer0.changed(blur0) || (v & 0x30) == 0x20) {
            v2 = 1;
        }
        d d0 = composer0.rememberedValue();
        if((z | z1 | v2) != 0 || d0 == Composer.Companion.getEmpty()) {
            d0 = new d(this, blur0, mosaic0, null);
            composer0.updateRememberedValue(d0);
        }
        composer0.endReplaceGroup();
        State state0 = SnapshotStateKt.produceState(null, arr_object, d0, composer0, 582);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return state0;
    }

    public final void setBitmapExcludeSelected(@Nullable Bitmap bitmap0) {
        this.f.setValue(bitmap0);
    }

    public final void setFullBitmap(@Nullable Bitmap bitmap0) {
        this.e.setValue(bitmap0);
    }

    public final void setPhoto(@NotNull KDPhoto kDPhoto0) {
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        this.d = kDPhoto0;
    }
}

