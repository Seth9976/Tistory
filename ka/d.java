package ka;

import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.ui.unit.IntSizeKt;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.Mosaic;
import com.kakao.kandinsky.mosaic.MosaicAndBlurBitmapLoader;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class d extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final MosaicAndBlurBitmapLoader q;
    public final Blur r;
    public final Mosaic s;

    public d(MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0, Blur blur0, Mosaic mosaic0, Continuation continuation0) {
        this.q = mosaicAndBlurBitmapLoader0;
        this.r = blur0;
        this.s = mosaic0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new d(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d)this.create(((ProduceStateScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ProduceStateScope produceStateScope1;
        Object object5;
        Blur blur1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ProduceStateScope produceStateScope0 = (ProduceStateScope)this.p;
                MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0 = this.q;
                ArrayList arrayList0 = new ArrayList();
                for(Object object2: mosaicAndBlurBitmapLoader0.d.getDecorationList()) {
                    if(object2 instanceof Mosaic) {
                        arrayList0.add(object2);
                    }
                }
                ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
                for(Object object3: arrayList0) {
                    Mosaic mosaic0 = (Mosaic)object3;
                    Mosaic mosaic1 = this.s;
                    if(mosaic1 != null && mosaic0.getNo() == mosaic1.getNo()) {
                        mosaic0 = MosaicAndBlurBitmapLoader.access$getMosaicForImage--7Zfkj4(this.q, mosaic1.getNo(), IntSizeKt.toSize-ozmzZPI(this.q.d.getBitmapSize-YbymL2g()), mosaic1.getBlockSizeRatio-NH-jbRc(), mosaic1.getIntensity());
                    }
                    arrayList1.add(mosaic0);
                }
                Blur blur0 = this.r;
                if(blur0 == null) {
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object4: mosaicAndBlurBitmapLoader0.d.getDecorationList()) {
                        if(object4 instanceof Blur) {
                            arrayList2.add(object4);
                        }
                    }
                    blur1 = (Blur)CollectionsKt___CollectionsKt.firstOrNull(arrayList2);
                }
                else {
                    blur1 = new Blur(0, null, 0L, blur0.getIntensity(), null, blur0.getTextureSizeRatio-NH-jbRc(), 18, null);
                }
                this.p = produceStateScope0;
                this.o = 1;
                object5 = mosaicAndBlurBitmapLoader0.a(arrayList1, blur1, this);
                if(object5 == object1) {
                    return object1;
                }
                produceStateScope1 = produceStateScope0;
                break;
            }
            case 1: {
                produceStateScope1 = (ProduceStateScope)this.p;
                ResultKt.throwOnFailure(object0);
                object5 = object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        produceStateScope1.setValue(object5);
        return Unit.INSTANCE;
    }
}

