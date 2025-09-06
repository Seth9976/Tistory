package sa;

import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageOnly;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function0 {
    public final ManagedActivityResultLauncher w;

    public e(ManagedActivityResultLauncher managedActivityResultLauncher0) {
        this.w = managedActivityResultLauncher0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PickVisualMediaRequest pickVisualMediaRequest0 = PickVisualMediaRequestKt.PickVisualMediaRequest(ImageOnly.INSTANCE);
        this.w.launch(pickVisualMediaRequest0);
        return Unit.INSTANCE;
    }
}

