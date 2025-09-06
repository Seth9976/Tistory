package oa;

import android.graphics.Bitmap;
import android.util.Size;
import androidx.compose.ui.unit.IntSizeKt;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.preview.ui.PreviewTextureLoader;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.p;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class b extends SuspendLambda implements Function2 {
    public PreviewTextureLoader o;
    public int p;
    public final KDPhoto q;
    public final Size r;
    public final PreviewTextureLoader s;

    public b(Size size0, KDPhoto kDPhoto0, PreviewTextureLoader previewTextureLoader0, Continuation continuation0) {
        this.q = kDPhoto0;
        this.r = size0;
        this.s = previewTextureLoader0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new b(this.r, this.q, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        PreviewTextureLoader previewTextureLoader1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        PreviewTextureLoader previewTextureLoader0 = this.s;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                KDPhoto kDPhoto0 = this.q;
                if(!p.isBlank(kDPhoto0.getOriginalUri())) {
                    Size size0 = this.r;
                    if(size0.getWidth() > 0 && size0.getHeight() > 0) {
                        this.o = previewTextureLoader0;
                        this.p = 1;
                        object0 = previewTextureLoader0.a.invoke(kDPhoto0.getOriginalUri(), size0, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        previewTextureLoader1 = previewTextureLoader0;
                        goto label_18;
                    }
                }
                break;
            }
            case 1: {
                previewTextureLoader1 = this.o;
                ResultKt.throwOnFailure(object0);
            label_18:
                previewTextureLoader1.f = (Bitmap)object0;
                Bitmap bitmap0 = previewTextureLoader0.f;
                previewTextureLoader0.setBitmapSize-ozmzZPI((bitmap0 == null ? 0L : IntSizeKt.IntSize(bitmap0.getWidth(), bitmap0.getHeight())));
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

