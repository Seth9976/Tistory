package jb;

import com.kakao.editortracker.KeditorTracker;
import com.kakao.kphotopicker.PhotoPickerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public final int w;
    public final PhotoPickerActivity x;

    public f(PhotoPickerActivity photoPickerActivity0, int v) {
        this.w = v;
        this.x = photoPickerActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                boolean z = this.x.h().getConfig().isDebugMode();
                String s = this.x.h().getConfig().getServiceKey$kphotopicker_release();
                String s1 = this.x.h().getConfig().getServiceDomain$kphotopicker_release();
                String s2 = this.x.h().getConfig().getServiceReferrer$kphotopicker_release();
                String s3 = this.x.h().getConfig().getServiceVersionName$kphotopicker_release();
                e e0 = new e(z, this.x);
                return new KeditorTracker(this.x, s, s1, s2, s3, e0);
            }
            case 1: {
                PhotoPickerActivity.access$showPermissionDialogForGallery(this.x);
                return Unit.INSTANCE;
            }
            case 2: {
                PhotoPickerActivity.access$showTakePicturePermissionDialog(this.x);
                return Unit.INSTANCE;
            }
            case 3: {
                PhotoPickerActivity.access$showTakeVideoPermissionDialog(this.x);
                return Unit.INSTANCE;
            }
            case 4: {
                this.x.finish();
                return Unit.INSTANCE;
            }
            default: {
                this.x.finish();
                return Unit.INSTANCE;
            }
        }
    }
}

