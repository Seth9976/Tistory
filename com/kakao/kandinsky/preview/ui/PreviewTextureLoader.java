package com.kakao.kandinsky.preview.ui;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.IntSize;
import com.kakao.kandinsky.bitmap.usecase.GetBitmapUseCase;
import com.kakao.kandinsky.core.filter.ViewFilterEngine;
import com.kakao.kandinsky.core.filter.usecase.GetViewFilterEngineUseCase;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.core.kdphoto.Mosaic;
import com.kakao.kandinsky.designsystem.util.SizeExtensionKt;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.JobKt;
import oa.b;
import oa.c;
import oa.d;
import oa.f;
import oa.g;
import org.jetbrains.annotations.NotNull;
import qd.a;

@Stable
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001D\u0010\r\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\r\u0010\u000EJ%\u0010\u0014\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001A\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001A\u001A\u00020\f¢\u0006\u0004\b\u001A\u0010\u0019R1\u0010#\u001A\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u001B8F@FX\u0086\u008E\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Lcom/kakao/kandinsky/preview/ui/PreviewTextureLoader;", "", "Lcom/kakao/kandinsky/bitmap/usecase/GetBitmapUseCase;", "getBitmapUseCase", "Lcom/kakao/kandinsky/core/filter/usecase/GetViewFilterEngineUseCase;", "getViewFilterEngineUseCase", "<init>", "(Lcom/kakao/kandinsky/bitmap/usecase/GetBitmapUseCase;Lcom/kakao/kandinsky/core/filter/usecase/GetViewFilterEngineUseCase;)V", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "Landroid/util/Size;", "screenSize", "", "loadPhotoBitmap", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Landroid/util/Size;)V", "Landroid/graphics/SurfaceTexture;", "surface", "", "width", "height", "updateSurfaceInfo", "(Landroid/graphics/SurfaceTexture;II)V", "updatePhoto", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)V", "removeSurfaceInfo", "()V", "deleteEngine", "Landroidx/compose/ui/unit/IntSize;", "<set-?>", "g", "Landroidx/compose/runtime/MutableState;", "getBitmapSize-YbymL2g", "()J", "setBitmapSize-ozmzZPI", "(J)V", "bitmapSize", "preview_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPreviewTextureLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewTextureLoader.kt\ncom/kakao/kandinsky/preview/ui/PreviewTextureLoader\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,138:1\n81#2:139\n107#2,2:140\n800#3,11:142\n800#3,11:153\n473#4:164\n473#4:165\n*S KotlinDebug\n*F\n+ 1 PreviewTextureLoader.kt\ncom/kakao/kandinsky/preview/ui/PreviewTextureLoader\n*L\n46#1:139\n46#1:140,2\n122#1:142,11\n123#1:153,11\n125#1:164\n126#1:165\n*E\n"})
public final class PreviewTextureLoader {
    public static final int $stable;
    public final GetBitmapUseCase a;
    public final GetViewFilterEngineUseCase b;
    public ViewFilterEngine c;
    public CompletableJob d;
    public final CoroutineScope e;
    public Bitmap f;
    public final MutableState g;
    public KDPhoto h;

    @Inject
    public PreviewTextureLoader(@NotNull GetBitmapUseCase getBitmapUseCase0, @NotNull GetViewFilterEngineUseCase getViewFilterEngineUseCase0) {
        Intrinsics.checkNotNullParameter(getBitmapUseCase0, "getBitmapUseCase");
        Intrinsics.checkNotNullParameter(getViewFilterEngineUseCase0, "getViewFilterEngineUseCase");
        super();
        this.a = getBitmapUseCase0;
        this.b = getViewFilterEngineUseCase0;
        this.c = getViewFilterEngineUseCase0.invoke();
        this.d = JobKt.Job$default(null, 1, null);
        this.e = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        this.g = SnapshotStateKt.mutableStateOf$default(IntSize.box-impl(0L), null, 2, null);
        this.h = KDPhoto.Companion.getEmpty();
    }

    public static final ViewFilterEngine access$getFilterEngine(PreviewTextureLoader previewTextureLoader0) {
        ViewFilterEngine viewFilterEngine0;
        synchronized(previewTextureLoader0) {
            if(previewTextureLoader0.c.isActive()) {
                viewFilterEngine0 = previewTextureLoader0.c;
            }
            else {
                viewFilterEngine0 = previewTextureLoader0.b.invoke();
                previewTextureLoader0.c = viewFilterEngine0;
            }
            return viewFilterEngine0;
        }
    }

    public static final Object access$update(PreviewTextureLoader previewTextureLoader0, ViewFilterEngine viewFilterEngine0, KDPhoto kDPhoto0, KDPhoto kDPhoto1, Continuation continuation0) {
        Blur blur1;
        ArrayList arrayList0;
        ViewFilterEngine viewFilterEngine1;
        KDPhoto kDPhoto2;
        Blur blur0;
        boolean z;
        KDPhoto kDPhoto3;
        d d0;
        previewTextureLoader0.getClass();
        if(continuation0 instanceof d) {
            d0 = (d)continuation0;
            int v = d0.t;
            if((v & 0x80000000) == 0) {
                d0 = new d(previewTextureLoader0, continuation0);
            }
            else {
                d0.t = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(previewTextureLoader0, continuation0);
        }
        Object object0 = d0.r;
        Boolean boolean0 = a.getCOROUTINE_SUSPENDED();
        switch(d0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(Intrinsics.areEqual((kDPhoto0 == null ? null : kDPhoto0.getFilter()), kDPhoto1.getFilter())) {
                    z = false;
                }
                else {
                    d0.o = viewFilterEngine0;
                    d0.p = kDPhoto0;
                    d0.q = kDPhoto1;
                    d0.t = 1;
                    if(viewFilterEngine0.updateFilter(kDPhoto1.getFilter(), d0) == boolean0) {
                        return boolean0;
                    }
                    z = true;
                }
            label_49:
                if(Intrinsics.areEqual((kDPhoto0 == null ? null : Boxing.boxFloat(kDPhoto0.getFilterIntensity())), kDPhoto1.getFilterIntensity())) {
                    viewFilterEngine1 = viewFilterEngine0;
                    kDPhoto3 = kDPhoto1;
                }
                else {
                    d0.o = viewFilterEngine0;
                    d0.p = kDPhoto0;
                    d0.q = kDPhoto1;
                    d0.t = 2;
                    if(viewFilterEngine0.updateFilterIntensity(kDPhoto1.getFilterIntensity(), d0) == boolean0) {
                        return boolean0;
                    }
                    viewFilterEngine1 = viewFilterEngine0;
                    kDPhoto3 = kDPhoto1;
                    z = true;
                }
            label_61:
                if(!Intrinsics.areEqual((kDPhoto0 == null ? null : kDPhoto0.getEffect()), kDPhoto3.getEffect())) {
                    d0.o = viewFilterEngine1;
                    d0.p = kDPhoto0;
                    d0.q = kDPhoto3;
                    d0.t = 3;
                    if(viewFilterEngine1.updateEffect(kDPhoto3.getEffect(), d0) == boolean0) {
                        return boolean0;
                    }
                    z = true;
                }
                break;
            }
            case 1: {
                kDPhoto1 = (KDPhoto)d0.q;
                kDPhoto0 = d0.p;
                viewFilterEngine0 = d0.o;
                ResultKt.throwOnFailure(object0);
                z = true;
                goto label_49;
            }
            case 2: {
                kDPhoto3 = (KDPhoto)d0.q;
                kDPhoto0 = d0.p;
                viewFilterEngine1 = d0.o;
                ResultKt.throwOnFailure(object0);
                z = true;
                goto label_61;
            }
            case 3: {
                kDPhoto3 = (KDPhoto)d0.q;
                kDPhoto0 = d0.p;
                viewFilterEngine1 = d0.o;
                ResultKt.throwOnFailure(object0);
                z = true;
                break;
            }
            case 4: {
                blur0 = (Blur)d0.q;
                kDPhoto2 = d0.p;
                viewFilterEngine1 = d0.o;
                ResultKt.throwOnFailure(object0);
                goto label_119;
            }
            case 5: {
                ResultKt.throwOnFailure(object0);
                return Boxing.boxBoolean(true);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!Intrinsics.areEqual((kDPhoto0 == null ? null : kDPhoto0.getDecorationList()), kDPhoto3.getDecorationList())) {
            if(kDPhoto0 == null) {
                arrayList0 = null;
            }
            else {
                PersistentList persistentList0 = kDPhoto0.getDecorationList();
                if(persistentList0 == null) {
                    arrayList0 = null;
                }
                else {
                    arrayList0 = new ArrayList();
                    for(Object object1: persistentList0) {
                        if(object1 instanceof Mosaic) {
                            arrayList0.add(object1);
                        }
                    }
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object2: kDPhoto3.getDecorationList()) {
                if(object2 instanceof Mosaic) {
                    arrayList1.add(object2);
                }
            }
            if(kDPhoto0 == null) {
                blur1 = null;
            }
            else {
                PersistentList persistentList1 = kDPhoto0.getDecorationList();
                if(persistentList1 == null) {
                    blur1 = null;
                }
                else {
                    Sequence sequence0 = CollectionsKt___CollectionsKt.asSequence(persistentList1);
                    if(sequence0 == null) {
                        blur1 = null;
                    }
                    else {
                        Sequence sequence1 = SequencesKt___SequencesKt.filter(sequence0, PreviewTextureLoader.update..inlined.filterIsInstance.1.INSTANCE);
                        Intrinsics.checkNotNull(sequence1, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
                        blur1 = sequence1 == null ? null : ((Blur)SequencesKt___SequencesKt.firstOrNull(sequence1));
                    }
                }
            }
            Sequence sequence2 = SequencesKt___SequencesKt.filter(CollectionsKt___CollectionsKt.asSequence(kDPhoto3.getDecorationList()), PreviewTextureLoader.update..inlined.filterIsInstance.2.INSTANCE);
            Intrinsics.checkNotNull(sequence2, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
            Blur blur2 = (Blur)SequencesKt___SequencesKt.firstOrNull(sequence2);
            if(!Intrinsics.areEqual(arrayList0, arrayList1) || !Intrinsics.areEqual(blur1, blur2)) {
                Size size0 = SizeExtensionKt.toAndroidSize-ozmzZPI(kDPhoto3.getBitmapSize-YbymL2g());
                d0.o = viewFilterEngine1;
                d0.p = kDPhoto3;
                d0.q = blur2;
                d0.t = 4;
                if(viewFilterEngine1.updateMosaic(arrayList1, size0, d0) != boolean0) {
                    kDPhoto2 = kDPhoto3;
                    blur0 = blur2;
                label_119:
                    Size size1 = SizeExtensionKt.toAndroidSize-ozmzZPI(kDPhoto2.getBitmapSize-YbymL2g());
                    d0.o = null;
                    d0.p = null;
                    d0.q = null;
                    d0.t = 5;
                    return viewFilterEngine1.updateBlur(blur0, size1, d0) == boolean0 ? boolean0 : Boxing.boxBoolean(true);
                }
                return boolean0;
            }
        }
        return Boxing.boxBoolean(z);
    }

    public final void deleteEngine() {
        DefaultImpls.cancel$default(this.d, null, 1, null);
        this.f = null;
        this.setBitmapSize-ozmzZPI(0L);
        this.h = KDPhoto.Companion.getEmpty();
        oa.a a0 = new oa.a(this, null);
        BuildersKt.launch$default(this.e, null, null, a0, 3, null);
    }

    public final long getBitmapSize-YbymL2g() {
        return ((IntSize)this.g.getValue()).unbox-impl();
    }

    public final void loadPhotoBitmap(@NotNull KDPhoto kDPhoto0, @NotNull Size size0) {
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        Intrinsics.checkNotNullParameter(size0, "screenSize");
        DefaultImpls.cancel$default(this.d, null, 1, null);
        this.f = null;
        this.setBitmapSize-ozmzZPI(0L);
        this.h = KDPhoto.Companion.getEmpty();
        CompletableJob completableJob0 = JobKt.Job$default(null, 1, null);
        this.d = completableJob0;
        b b0 = new b(size0, kDPhoto0, this, null);
        BuildersKt.launch$default(this.e, completableJob0, null, b0, 2, null);
    }

    public final void removeSurfaceInfo() {
        CompletableJob completableJob0 = this.d;
        c c0 = new c(this, null);
        BuildersKt.launch$default(this.e, completableJob0, null, c0, 2, null);
    }

    public final void setBitmapSize-ozmzZPI(long v) {
        IntSize intSize0 = IntSize.box-impl(v);
        this.g.setValue(intSize0);
    }

    public final void updatePhoto(@NotNull KDPhoto kDPhoto0) {
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        CompletableJob completableJob0 = this.d;
        f f0 = new f(this, kDPhoto0, null);
        BuildersKt.launch$default(this.e, completableJob0, null, f0, 2, null);
    }

    public final void updateSurfaceInfo(@NotNull SurfaceTexture surfaceTexture0, int v, int v1) {
        Intrinsics.checkNotNullParameter(surfaceTexture0, "surface");
        CompletableJob completableJob0 = this.d;
        g g0 = new g(this, surfaceTexture0, v, v1, null);
        BuildersKt.launch$default(this.e, completableJob0, null, g0, 2, null);
    }
}

