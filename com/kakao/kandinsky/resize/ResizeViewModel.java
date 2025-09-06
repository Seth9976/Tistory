package com.kakao.kandinsky.resize;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntSize;
import com.kakao.kandinsky.base.KDMviViewModel;
import com.kakao.kandinsky.base.contract.DialogUiState;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.resize.contract.ResizeEvent.BounceAnimation;
import com.kakao.kandinsky.resize.contract.ResizeEvent.ShowDialog;
import com.kakao.kandinsky.resize.contract.ResizeEvent.ShowToast;
import com.kakao.kandinsky.resize.contract.ResizeIntent.BackPressed;
import com.kakao.kandinsky.resize.contract.ResizeIntent.ChangeScreenType;
import com.kakao.kandinsky.resize.contract.ResizeIntent.ChangeWidth;
import com.kakao.kandinsky.resize.contract.ResizeIntent.Init;
import com.kakao.kandinsky.resize.contract.ResizeIntent.ResetWidth;
import com.kakao.kandinsky.resize.contract.ResizeIntent.UpdateContentBounds;
import com.kakao.kandinsky.resize.contract.ResizeIntent.UpdatePhoto;
import com.kakao.kandinsky.resize.contract.ResizeIntent;
import com.kakao.kandinsky.resize.contract.ResizeUiState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
import org.jetbrains.annotations.NotNull;
import pa.a0;
import pa.b0;
import pa.w;
import pa.x;
import pa.y;
import pa.z;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000B2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000BB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\t\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0003H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/kakao/kandinsky/resize/ResizeViewModel;", "Lcom/kakao/kandinsky/base/KDMviViewModel;", "Lcom/kakao/kandinsky/resize/contract/ResizeUiState;", "Lcom/kakao/kandinsky/resize/contract/ResizeIntent;", "Lcom/kakao/kandinsky/resize/contract/ResizeEvent;", "<init>", "()V", "current", "intent", "handleIntent", "(Lcom/kakao/kandinsky/resize/contract/ResizeUiState;Lcom/kakao/kandinsky/resize/contract/ResizeIntent;)Lcom/kakao/kandinsky/resize/contract/ResizeUiState;", "Companion", "resize_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nResizeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResizeViewModel.kt\ncom/kakao/kandinsky/resize/ResizeViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
public final class ResizeViewModel extends KDMviViewModel {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001A\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/kandinsky/resize/ResizeViewModel$Companion;", "", "Lkotlinx/collections/immutable/PersistentList;", "", "FIXED_WIDTH_LIST", "Lkotlinx/collections/immutable/PersistentList;", "PHOTO_MIN_WIDTH", "I", "resize_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[ResizeScreenType.values().length];
            try {
                arr_v[ResizeScreenType.Custom.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ResizeScreenType.Default.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public static final PersistentList L0;

    static {
        ResizeViewModel.Companion = new Companion(null);
        ResizeViewModel.L0 = ExtensionsKt.persistentListOf(new Integer[]{300, 400, 500, 600, 700, 800, 900, 1000});
    }

    @Inject
    public ResizeViewModel() {
        super(new ResizeUiState(null, null, null, null, null, false, 0, null, null, null, null, null, 0xFFF, null));
    }

    @NotNull
    public ResizeUiState handleIntent(@NotNull ResizeUiState resizeUiState0, @NotNull ResizeIntent resizeIntent0) {
        Intrinsics.checkNotNullParameter(resizeUiState0, "current");
        Intrinsics.checkNotNullParameter(resizeIntent0, "intent");
        if(resizeIntent0 instanceof Init) {
            boolean z = ((Init)resizeIntent0).isSingleImage();
            w w0 = new w(this);
            x x0 = new x(this);
            y y0 = new y(this);
            z z1 = new z(this);
            a0 a00 = new a0(this);
            return ResizeUiState.copy$default(resizeUiState0, null, null, null, null, w0, z, 10, ResizeViewModel.L0, x0, y0, z1, a00, 15, null);
        }
        if(resizeIntent0 instanceof UpdatePhoto) {
            return ResizeUiState.copy$default(resizeUiState0, null, ((UpdatePhoto)resizeIntent0).getPhoto(), ((UpdatePhoto)resizeIntent0).getPhoto(), null, null, false, 0, null, null, null, null, null, 0xFF9, null);
        }
        if(resizeIntent0 instanceof UpdateContentBounds) {
            return ResizeUiState.copy$default(resizeUiState0, null, null, null, ((UpdateContentBounds)resizeIntent0).getBounds(), null, false, 0, null, null, null, null, null, 0xFF7, null);
        }
        if(resizeIntent0 instanceof ChangeScreenType) {
            return ResizeUiState.copy$default(resizeUiState0, ((ChangeScreenType)resizeIntent0).getScreenType(), null, null, null, null, false, 0, null, null, null, null, null, 0xFFE, null);
        }
        if(resizeIntent0 instanceof ChangeWidth) {
            int v = IntSize.getWidth-impl(resizeUiState0.getOriginalSize-YbymL2g());
            int v1 = ((ChangeWidth)resizeIntent0).getWidth();
            if(v < v1) {
                this.sendEvent(new ShowToast(string.resize_change_impossible_bigger_than_origin));
                return resizeUiState0;
            }
            if(v1 < 10) {
                this.sendEvent(new ShowToast(string.resize_change_impossible_small_than_origin));
                return resizeUiState0;
            }
            Integer integer0 = resizeUiState0.getModifiedWidth() > 0 ? resizeUiState0.getModifiedWidth() : null;
            this.sendEvent(new BounceAnimation((integer0 == null ? v : ((int)integer0)), v1));
            ResizeScreenType resizeScreenType0 = ResizeScreenType.Default;
            KDPhoto kDPhoto0 = resizeUiState0.getPhoto();
            if(v1 == v) {
                v1 = 0;
            }
            return ResizeUiState.copy$default(resizeUiState0, resizeScreenType0, KDPhoto.copy-2Ycw6ww$default(kDPhoto0, null, 0, null, 0L, false, v1, null, 0L, null, 0.0f, null, null, null, null, 0x3FDF, null), null, null, null, false, 0, null, null, null, null, null, 0xFFC, null);
        }
        if(Intrinsics.areEqual(resizeIntent0, ResetWidth.INSTANCE)) {
            return ResizeUiState.copy$default(resizeUiState0, null, KDPhoto.copy-2Ycw6ww$default(resizeUiState0.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, null, 0x3FDF, null), null, null, null, false, 0, null, null, null, null, null, 0xFFD, null);
        }
        if(resizeIntent0 instanceof BackPressed) {
            switch(WhenMappings.$EnumSwitchMapping$0[resizeUiState0.getScreenType().ordinal()]) {
                case 1: {
                    return ResizeUiState.copy$default(resizeUiState0, ResizeScreenType.Default, null, null, null, null, false, 0, null, null, null, null, null, 0xFFE, null);
                }
                case 2: {
                    b0 b00 = new b0(this);
                    if(resizeUiState0.getChanged()) {
                        this.sendEvent(new ShowDialog(new DialogUiState(0, 0, b00, 3, null)));
                        return resizeUiState0;
                    }
                    b00.invoke();
                    return resizeUiState0;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override  // com.kakao.kandinsky.base.KDMviViewModel
    public Object handleIntent(Object object0, Object object1) {
        return this.handleIntent(((ResizeUiState)object0), ((ResizeIntent)object1));
    }
}

