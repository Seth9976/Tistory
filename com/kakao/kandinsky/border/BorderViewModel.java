package com.kakao.kandinsky.border;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.kandinsky.base.KDMviViewModel;
import com.kakao.kandinsky.border.contract.BorderIntent.Cancel;
import com.kakao.kandinsky.border.contract.BorderIntent.Init;
import com.kakao.kandinsky.border.contract.BorderIntent.SelectBorder;
import com.kakao.kandinsky.border.contract.BorderIntent.UpdateContentBounds;
import com.kakao.kandinsky.border.contract.BorderIntent.UpdatePhoto;
import com.kakao.kandinsky.border.contract.BorderIntent;
import com.kakao.kandinsky.border.contract.BorderUiState;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t9.d;
import t9.e;
import t9.f;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0003H\u0014¨\u0006\t"}, d2 = {"Lcom/kakao/kandinsky/border/BorderViewModel;", "Lcom/kakao/kandinsky/base/KDMviViewModel;", "Lcom/kakao/kandinsky/border/contract/BorderUiState;", "Lcom/kakao/kandinsky/border/contract/BorderIntent;", "Lcom/kakao/kandinsky/base/contract/KDEvent;", "()V", "handleIntent", "current", "intent", "border_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BorderViewModel extends KDMviViewModel {
    public static final int $stable;

    @Inject
    public BorderViewModel() {
        super(new BorderUiState(null, null, null, null, false, null, null, null, 0xFF, null));
    }

    @NotNull
    public BorderUiState handleIntent(@NotNull BorderUiState borderUiState0, @NotNull BorderIntent borderIntent0) {
        Intrinsics.checkNotNullParameter(borderUiState0, "current");
        Intrinsics.checkNotNullParameter(borderIntent0, "intent");
        if(borderIntent0 instanceof Init) {
            boolean z = ((Init)borderIntent0).isSingleImage();
            return BorderUiState.copy$default(borderUiState0, null, null, null, new d(this), z, null, new e(this), new f(this), 39, null);
        }
        if(borderIntent0 instanceof UpdateContentBounds) {
            return BorderUiState.copy$default(borderUiState0, null, null, ((UpdateContentBounds)borderIntent0).getBounds(), null, false, null, null, null, 0xFB, null);
        }
        if(borderIntent0 instanceof UpdatePhoto) {
            return BorderUiState.copy$default(borderUiState0, ((UpdatePhoto)borderIntent0).getPhoto(), ((UpdatePhoto)borderIntent0).getPhoto(), null, null, false, null, null, null, 0xFC, null);
        }
        if(borderIntent0 instanceof SelectBorder) {
            return BorderUiState.copy$default(borderUiState0, KDPhoto.copy-2Ycw6ww$default(borderUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, ((SelectBorder)borderIntent0).getBorder(), null, 0x2FFF, null), null, null, null, false, null, null, null, 0xFE, null);
        }
        if(!Intrinsics.areEqual(borderIntent0, Cancel.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        this.cancel(this, borderUiState0.getChanged());
        return borderUiState0;
    }

    @Override  // com.kakao.kandinsky.base.KDMviViewModel
    public Object handleIntent(Object object0, Object object1) {
        return this.handleIntent(((BorderUiState)object0), ((BorderIntent)object1));
    }
}

