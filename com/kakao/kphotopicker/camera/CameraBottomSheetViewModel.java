package com.kakao.kphotopicker.camera;

import androidx.lifecycle.ViewModel;
import com.kakao.kphotopicker.util.SingleLiveEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R\u001F\u0010\r\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u001F\u0010\u0010\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0006¢\u0006\f\n\u0004\b\u000E\u0010\n\u001A\u0004\b\u000F\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/kakao/kphotopicker/camera/CameraBottomSheetViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "onClickPhotoItem", "onClickVideoItem", "Lcom/kakao/kphotopicker/util/SingleLiveEvent;", "Ljava/lang/Void;", "H0", "Lcom/kakao/kphotopicker/util/SingleLiveEvent;", "getOnClickPhoto", "()Lcom/kakao/kphotopicker/util/SingleLiveEvent;", "onClickPhoto", "I0", "getOnClickVideo", "onClickVideo", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CameraBottomSheetViewModel extends ViewModel {
    public final SingleLiveEvent H0;
    public final SingleLiveEvent I0;

    public CameraBottomSheetViewModel() {
        this.H0 = new SingleLiveEvent();
        this.I0 = new SingleLiveEvent();
    }

    @NotNull
    public final SingleLiveEvent getOnClickPhoto() {
        return this.H0;
    }

    @NotNull
    public final SingleLiveEvent getOnClickVideo() {
        return this.I0;
    }

    public final void onClickPhotoItem() {
        this.H0.call();
    }

    public final void onClickVideoItem() {
        this.I0.call();
    }
}

