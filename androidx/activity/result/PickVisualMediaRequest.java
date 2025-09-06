package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo;
import androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\f\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00048\u0006@@X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000B¨\u0006\u000E"}, d2 = {"Landroidx/activity/result/PickVisualMediaRequest;", "", "<init>", "()V", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "<set-?>", "a", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "getMediaType", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "setMediaType$activity_release", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)V", "mediaType", "Builder", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PickVisualMediaRequest {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001A\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/activity/result/PickVisualMediaRequest$Builder;", "", "<init>", "()V", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "mediaType", "setMediaType", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)Landroidx/activity/result/PickVisualMediaRequest$Builder;", "Landroidx/activity/result/PickVisualMediaRequest;", "build", "()Landroidx/activity/result/PickVisualMediaRequest;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Builder {
        public VisualMediaType a;

        public Builder() {
            this.a = ImageAndVideo.INSTANCE;
        }

        @NotNull
        public final PickVisualMediaRequest build() {
            PickVisualMediaRequest pickVisualMediaRequest0 = new PickVisualMediaRequest();
            pickVisualMediaRequest0.setMediaType$activity_release(this.a);
            return pickVisualMediaRequest0;
        }

        @NotNull
        public final Builder setMediaType(@NotNull VisualMediaType activityResultContracts$PickVisualMedia$VisualMediaType0) {
            Intrinsics.checkNotNullParameter(activityResultContracts$PickVisualMedia$VisualMediaType0, "mediaType");
            this.a = activityResultContracts$PickVisualMedia$VisualMediaType0;
            return this;
        }
    }

    public VisualMediaType a;

    public PickVisualMediaRequest() {
        this.a = ImageAndVideo.INSTANCE;
    }

    @NotNull
    public final VisualMediaType getMediaType() {
        return this.a;
    }

    public final void setMediaType$activity_release(@NotNull VisualMediaType activityResultContracts$PickVisualMedia$VisualMediaType0) {
        Intrinsics.checkNotNullParameter(activityResultContracts$PickVisualMedia$VisualMediaType0, "<set-?>");
        this.a = activityResultContracts$PickVisualMedia$VisualMediaType0;
    }
}

