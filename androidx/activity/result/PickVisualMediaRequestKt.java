package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo;
import androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0010\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u0003¨\u0006\u0004"}, d2 = {"PickVisualMediaRequest", "Landroidx/activity/result/PickVisualMediaRequest;", "mediaType", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PickVisualMediaRequestKt {
    @NotNull
    public static final PickVisualMediaRequest PickVisualMediaRequest(@NotNull VisualMediaType activityResultContracts$PickVisualMedia$VisualMediaType0) {
        Intrinsics.checkNotNullParameter(activityResultContracts$PickVisualMedia$VisualMediaType0, "mediaType");
        return new Builder().setMediaType(activityResultContracts$PickVisualMedia$VisualMediaType0).build();
    }

    public static PickVisualMediaRequest PickVisualMediaRequest$default(VisualMediaType activityResultContracts$PickVisualMedia$VisualMediaType0, int v, Object object0) {
        if((v & 1) != 0) {
            activityResultContracts$PickVisualMedia$VisualMediaType0 = ImageAndVideo.INSTANCE;
        }
        return PickVisualMediaRequestKt.PickVisualMediaRequest(activityResultContracts$PickVisualMedia$VisualMediaType0);
    }
}

