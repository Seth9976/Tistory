package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.media.Image;
import android.media.ImageReader;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.IntSize;
import androidx.core.os.HandlerCompat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s1.f;
import s1.g;

@RequiresApi(22)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/layer/LayerSnapshotV22;", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "Landroid/graphics/Bitmap;", "toBitmap", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLayerSnapshot.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerSnapshot.android.kt\nandroidx/compose/ui/graphics/layer/LayerSnapshotV22\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,230:1\n314#2,11:231\n*S KotlinDebug\n*F\n+ 1 LayerSnapshot.android.kt\nandroidx/compose/ui/graphics/layer/LayerSnapshotV22\n*L\n90#1:231,11\n*E\n"})
public final class LayerSnapshotV22 implements LayerSnapshotImpl {
    @NotNull
    public static final LayerSnapshotV22 INSTANCE;

    static {
        LayerSnapshotV22.INSTANCE = new LayerSnapshotV22();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    @Nullable
    public Object toBitmap(@NotNull GraphicsLayer graphicsLayer0, @NotNull Continuation continuation0) {
        Bitmap bitmap0;
        ImageReader imageReader1;
        f f0;
        if(continuation0 instanceof f) {
            f0 = (f)continuation0;
            int v = f0.r;
            if((v & 0x80000000) == 0) {
                f0 = new f(this, continuation0);
            }
            else {
                f0.r = v ^ 0x80000000;
            }
        }
        else {
            f0 = new f(this, continuation0);
        }
        Object object0 = f0.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(f0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                long v1 = graphicsLayer0.getSize-YbymL2g();
                Looper looper0 = Looper.myLooper();
                if(looper0 == null) {
                    looper0 = Looper.getMainLooper();
                }
                ImageReader imageReader0 = ImageReader.newInstance(IntSize.getWidth-impl(v1), IntSize.getHeight-impl(v1), 1, 1);
                try {
                    f0.o = imageReader0;
                    f0.r = 1;
                    CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(f0), 1);
                    cancellableContinuationImpl0.initCancellability();
                    imageReader0.setOnImageAvailableListener(new g(cancellableContinuationImpl0), HandlerCompat.createAsync(looper0));
                    Surface surface0 = imageReader0.getSurface();
                    Canvas canvas0 = SurfaceUtils.INSTANCE.lockCanvas(surface0);
                    try {
                        canvas0.drawColor(ColorKt.toArgb-8_81llA(0xFF00000000000000L), PorterDuff.Mode.CLEAR);
                        graphicsLayer0.draw$ui_graphics_release(AndroidCanvas_androidKt.Canvas(canvas0), null);
                    }
                    finally {
                        surface0.unlockCanvasAndPost(canvas0);
                    }
                    object0 = cancellableContinuationImpl0.getResult();
                    if(object0 == a.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(f0);
                    }
                }
                catch(Throwable throwable0) {
                    imageReader1 = imageReader0;
                    break;
                }
                if(object0 == object1) {
                    return object1;
                }
                imageReader1 = imageReader0;
                bitmap0 = LayerSnapshot_androidKt.access$toBitmap(((Image)object0));
                goto label_52;
            }
            case 1: {
                try {
                    imageReader1 = f0.o;
                    ResultKt.throwOnFailure(object0);
                    bitmap0 = LayerSnapshot_androidKt.access$toBitmap(((Image)object0));
                    goto label_52;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            AutoCloseableKt.closeFinally(imageReader1, throwable0);
            throw throwable1;
        }
    label_52:
        AutoCloseableKt.closeFinally(imageReader1, null);
        return bitmap0;
    }
}

