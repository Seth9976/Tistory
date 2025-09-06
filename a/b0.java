package a;

import b.s;
import com.kakao.kandinsky.KandinskyActivity;
import com.kakao.kandinsky.border.BorderViewModel;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.crop.CropViewModel;
import com.kakao.kandinsky.filter.FilterViewModel;
import com.kakao.kandinsky.resize.ResizeViewModel;
import com.kakao.kandinsky.resize.contract.ResizeIntent.UpdatePhoto;
import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.sticker.StickerViewModel;
import com.kakao.kandinsky.text.TextViewModel;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class b0 extends SuspendLambda implements Function2 {
    public Object a;
    public final KandinskyActivity b;

    public b0(KandinskyActivity kandinskyActivity0, Continuation continuation0) {
        this.b = kandinskyActivity0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new b0(this.b, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        b0 b00 = new b0(this.b, ((Continuation)object1));
        b00.a = (Pair)object0;
        return b00.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Pair pair0 = (Pair)this.a;
        KDPhoto kDPhoto0 = (KDPhoto)pair0.component1();
        ResizeViewModel resizeViewModel0 = null;
        switch(((s)pair0.component2()).ordinal()) {
            case 1: {
                ResizeViewModel resizeViewModel1 = this.b.c;
                if(resizeViewModel1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("resizeViewModel");
                }
                else {
                    resizeViewModel0 = resizeViewModel1;
                }
                resizeViewModel0.sendIntent(new UpdatePhoto(kDPhoto0));
                return Unit.INSTANCE;
            }
            case 2: {
                CropViewModel cropViewModel0 = this.b.d;
                if(cropViewModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cropViewModel");
                }
                else {
                    resizeViewModel0 = cropViewModel0;
                }
                resizeViewModel0.sendIntent(new com.kakao.kandinsky.crop.contract.CropIntent.UpdatePhoto(kDPhoto0));
                return Unit.INSTANCE;
            }
            case 3: {
                FilterViewModel filterViewModel0 = this.b.e;
                if(filterViewModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("filterViewModel");
                }
                else {
                    resizeViewModel0 = filterViewModel0;
                }
                resizeViewModel0.sendIntent(new com.kakao.kandinsky.filter.contract.FilterIntent.UpdatePhoto(kDPhoto0));
                return Unit.INSTANCE;
            }
            case 4: {
                SignatureVieModel signatureVieModel0 = this.b.f;
                if(signatureVieModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("signatureViewModel");
                }
                else {
                    resizeViewModel0 = signatureVieModel0;
                }
                resizeViewModel0.sendIntent(new com.kakao.kandinsky.signature.contract.SignatureIntent.UpdatePhoto(kDPhoto0));
                return Unit.INSTANCE;
            }
            case 5: {
                StickerViewModel stickerViewModel0 = this.b.g;
                if(stickerViewModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stickerViewModel");
                }
                else {
                    resizeViewModel0 = stickerViewModel0;
                }
                resizeViewModel0.sendIntent(new com.kakao.kandinsky.sticker.contract.StickerIntent.UpdatePhoto(kDPhoto0));
                return Unit.INSTANCE;
            }
            case 6: {
                this.b.b().sendIntent(new com.kakao.kandinsky.mosaic.contract.MosaicIntent.UpdatePhoto(kDPhoto0));
                return Unit.INSTANCE;
            }
            case 7: {
                TextViewModel textViewModel0 = this.b.i;
                if(textViewModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textViewModel");
                }
                else {
                    resizeViewModel0 = textViewModel0;
                }
                resizeViewModel0.sendIntent(new com.kakao.kandinsky.text.contract.TextIntent.UpdatePhoto(kDPhoto0));
                return Unit.INSTANCE;
            }
            case 8: {
                BorderViewModel borderViewModel0 = this.b.j;
                if(borderViewModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("borderViewModel");
                }
                else {
                    resizeViewModel0 = borderViewModel0;
                }
                resizeViewModel0.sendIntent(new com.kakao.kandinsky.border.contract.BorderIntent.UpdatePhoto(kDPhoto0));
                return Unit.INSTANCE;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}

