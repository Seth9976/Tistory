package jb;

import androidx.compose.material3.y4;
import com.kakao.kphotopicker.PhotoPickerActivity;
import com.kakao.kphotopicker.PickerViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final int w;
    public final PhotoPickerActivity x;

    public i(PhotoPickerActivity photoPickerActivity0, int v) {
        this.w = v;
        this.x = photoPickerActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((String)object0), "editorVersion");
                PhotoPickerActivity.access$getEditorTracker(this.x).load(((String)object0));
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((Pair)object0), "<name for destructuring parameter 0>");
                PhotoPickerActivity.access$getEditorTracker(this.x).click(new y4(((String)((Pair)object0).component1()), ((String)((Pair)object0).component2()), 3));
                return Unit.INSTANCE;
            }
            case 2: {
                Void void1 = (Void)object0;
                this.x.i();
                PickerViewModel.clickEvent$default(this.x.h(), "camera-image", null, 2, null);
                return Unit.INSTANCE;
            }
            default: {
                Void void0 = (Void)object0;
                this.x.j();
                PickerViewModel.clickEvent$default(this.x.h(), "camera-video", null, 2, null);
                return Unit.INSTANCE;
            }
        }
    }
}

