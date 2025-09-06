package kb;

import com.kakao.kphotopicker.camera.CameraBottomSheetDialogFragment;
import com.kakao.kphotopicker.camera.CameraListAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public final int w;
    public final CameraBottomSheetDialogFragment x;

    public a(CameraBottomSheetDialogFragment cameraBottomSheetDialogFragment0, int v) {
        this.w = v;
        this.x = cameraBottomSheetDialogFragment0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                this.x.dismiss();
                CameraBottomSheetDialogFragment.access$getCameraBottomSheetViewModel(this.x).onClickPhotoItem();
                return Unit.INSTANCE;
            }
            case 1: {
                this.x.dismiss();
                CameraBottomSheetDialogFragment.access$getCameraBottomSheetViewModel(this.x).onClickVideoItem();
                return Unit.INSTANCE;
            }
            default: {
                return new CameraListAdapter(new a(this.x, 0), new a(this.x, 1));
            }
        }
    }
}

