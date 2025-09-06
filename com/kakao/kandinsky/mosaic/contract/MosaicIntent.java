package com.kakao.kandinsky.mosaic.contract;

import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.room.a;
import com.kakao.kandinsky.core.kdphoto.Blur.Type;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.core.kdphoto.Mosaic;
import com.kakao.kandinsky.mosaic.ViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F !\"#¨\u0006$"}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "", "Cancel", "ChangeBlurType", "ChangeIntensity", "ChangeMosaicType", "ChangeViewType", "ClearMosaic", "ClickEmptyArea", "DeleteSelectedBlur", "DeleteSelectedMosaic", "Init", "MoveSelectBlur", "MoveSelectMosaic", "ScaleNRotateSelectBlur", "ScaleNRotateSelectMosaic", "SelectMosaic", "UpdateContentBounds", "UpdatePhoto", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$Cancel;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ChangeBlurType;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ChangeIntensity;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ChangeMosaicType;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ChangeViewType;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ClearMosaic;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ClickEmptyArea;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$DeleteSelectedBlur;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$DeleteSelectedMosaic;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$Init;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$MoveSelectBlur;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$MoveSelectMosaic;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ScaleNRotateSelectBlur;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ScaleNRotateSelectMosaic;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$SelectMosaic;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$UpdateContentBounds;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$UpdatePhoto;", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface MosaicIntent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$Cancel;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Cancel implements MosaicIntent {
        public static final int $stable;
        @NotNull
        public static final Cancel INSTANCE;

        static {
            Cancel.INSTANCE = new Cancel();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Cancel;
        }

        @Override
        public int hashCode() {
            return 0x8CC400B4;
        }

        @Override
        @NotNull
        public String toString() {
            return "Cancel";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ChangeBlurType;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Blur$Type;", "type", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Blur$Type;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Blur$Type;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/Blur$Type;)Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ChangeBlurType;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Blur$Type;", "getType", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeBlurType implements MosaicIntent {
        public static final int $stable;
        public final Type a;

        public ChangeBlurType(@NotNull Type blur$Type0) {
            Intrinsics.checkNotNullParameter(blur$Type0, "type");
            super();
            this.a = blur$Type0;
        }

        @NotNull
        public final Type component1() {
            return this.a;
        }

        @NotNull
        public final ChangeBlurType copy(@NotNull Type blur$Type0) {
            Intrinsics.checkNotNullParameter(blur$Type0, "type");
            return new ChangeBlurType(blur$Type0);
        }

        public static ChangeBlurType copy$default(ChangeBlurType mosaicIntent$ChangeBlurType0, Type blur$Type0, int v, Object object0) {
            if((v & 1) != 0) {
                blur$Type0 = mosaicIntent$ChangeBlurType0.a;
            }
            return mosaicIntent$ChangeBlurType0.copy(blur$Type0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeBlurType ? this.a == ((ChangeBlurType)object0).a : false;
        }

        @NotNull
        public final Type getType() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeBlurType(type=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ChangeIntensity;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "", "offset", "<init>", "(F)V", "component1", "()F", "copy", "(F)Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ChangeIntensity;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getOffset", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeIntensity implements MosaicIntent {
        public static final int $stable;
        public final float a;

        public ChangeIntensity(float f) {
            this.a = f;
        }

        public final float component1() {
            return this.a;
        }

        @NotNull
        public final ChangeIntensity copy(float f) {
            return new ChangeIntensity(f);
        }

        public static ChangeIntensity copy$default(ChangeIntensity mosaicIntent$ChangeIntensity0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = mosaicIntent$ChangeIntensity0.a;
            }
            return mosaicIntent$ChangeIntensity0.copy(f);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeIntensity ? Float.compare(this.a, ((ChangeIntensity)object0).a) == 0 : false;
        }

        public final float getOffset() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.a);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("ChangeIntensity(offset=");
            return a.h(this.a, ")", stringBuilder0);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ChangeMosaicType;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic$Type;", "type", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Mosaic$Type;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Mosaic$Type;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/Mosaic$Type;)Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ChangeMosaicType;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic$Type;", "getType", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeMosaicType implements MosaicIntent {
        public static final int $stable;
        public final com.kakao.kandinsky.core.kdphoto.Mosaic.Type a;

        public ChangeMosaicType(@NotNull com.kakao.kandinsky.core.kdphoto.Mosaic.Type mosaic$Type0) {
            Intrinsics.checkNotNullParameter(mosaic$Type0, "type");
            super();
            this.a = mosaic$Type0;
        }

        @NotNull
        public final com.kakao.kandinsky.core.kdphoto.Mosaic.Type component1() {
            return this.a;
        }

        @NotNull
        public final ChangeMosaicType copy(@NotNull com.kakao.kandinsky.core.kdphoto.Mosaic.Type mosaic$Type0) {
            Intrinsics.checkNotNullParameter(mosaic$Type0, "type");
            return new ChangeMosaicType(mosaic$Type0);
        }

        public static ChangeMosaicType copy$default(ChangeMosaicType mosaicIntent$ChangeMosaicType0, com.kakao.kandinsky.core.kdphoto.Mosaic.Type mosaic$Type0, int v, Object object0) {
            if((v & 1) != 0) {
                mosaic$Type0 = mosaicIntent$ChangeMosaicType0.a;
            }
            return mosaicIntent$ChangeMosaicType0.copy(mosaic$Type0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeMosaicType ? this.a == ((ChangeMosaicType)object0).a : false;
        }

        @NotNull
        public final com.kakao.kandinsky.core.kdphoto.Mosaic.Type getType() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeMosaicType(type=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ChangeViewType;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "Lcom/kakao/kandinsky/mosaic/ViewType;", "viewType", "<init>", "(Lcom/kakao/kandinsky/mosaic/ViewType;)V", "component1", "()Lcom/kakao/kandinsky/mosaic/ViewType;", "copy", "(Lcom/kakao/kandinsky/mosaic/ViewType;)Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ChangeViewType;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/mosaic/ViewType;", "getViewType", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeViewType implements MosaicIntent {
        public static final int $stable;
        public final ViewType a;

        public ChangeViewType(@NotNull ViewType viewType0) {
            Intrinsics.checkNotNullParameter(viewType0, "viewType");
            super();
            this.a = viewType0;
        }

        @NotNull
        public final ViewType component1() {
            return this.a;
        }

        @NotNull
        public final ChangeViewType copy(@NotNull ViewType viewType0) {
            Intrinsics.checkNotNullParameter(viewType0, "viewType");
            return new ChangeViewType(viewType0);
        }

        public static ChangeViewType copy$default(ChangeViewType mosaicIntent$ChangeViewType0, ViewType viewType0, int v, Object object0) {
            if((v & 1) != 0) {
                viewType0 = mosaicIntent$ChangeViewType0.a;
            }
            return mosaicIntent$ChangeViewType0.copy(viewType0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeViewType ? this.a == ((ChangeViewType)object0).a : false;
        }

        @NotNull
        public final ViewType getViewType() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeViewType(viewType=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ClearMosaic;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ClearMosaic implements MosaicIntent {
        public static final int $stable;
        @NotNull
        public static final ClearMosaic INSTANCE;

        static {
            ClearMosaic.INSTANCE = new ClearMosaic();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof ClearMosaic;
        }

        @Override
        public int hashCode() {
            return 0xFAFEA33D;
        }

        @Override
        @NotNull
        public String toString() {
            return "ClearMosaic";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001A\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u0007\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u001A"}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ClickEmptyArea;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "Landroidx/compose/ui/geometry/Offset;", "offset", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-F1C5BW0", "()J", "component1", "copy-k-4lQ0M", "(J)Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ClickEmptyArea;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getOffset-F1C5BW0", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ClickEmptyArea implements MosaicIntent {
        public static final int $stable;
        public final long a;

        public ClickEmptyArea(long v, DefaultConstructorMarker defaultConstructorMarker0) {
            this.a = v;
        }

        public final long component1-F1C5BW0() {
            return this.a;
        }

        @NotNull
        public final ClickEmptyArea copy-k-4lQ0M(long v) {
            return new ClickEmptyArea(v, null);
        }

        public static ClickEmptyArea copy-k-4lQ0M$default(ClickEmptyArea mosaicIntent$ClickEmptyArea0, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = mosaicIntent$ClickEmptyArea0.a;
            }
            return mosaicIntent$ClickEmptyArea0.copy-k-4lQ0M(v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ClickEmptyArea ? Offset.equals-impl0(this.a, ((ClickEmptyArea)object0).a) : false;
        }

        public final long getOffset-F1C5BW0() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Offset.hashCode-impl(this.a);
        }

        @Override
        @NotNull
        public String toString() {
            return wb.a.d("ClickEmptyArea(offset=", Offset.toString-impl(this.a), ")");
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$DeleteSelectedBlur;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Blur;", "blur", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Blur;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Blur;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/Blur;)Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$DeleteSelectedBlur;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Blur;", "getBlur", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class DeleteSelectedBlur implements MosaicIntent {
        public static final int $stable;
        public final Blur a;

        public DeleteSelectedBlur(@NotNull Blur blur0) {
            Intrinsics.checkNotNullParameter(blur0, "blur");
            super();
            this.a = blur0;
        }

        @NotNull
        public final Blur component1() {
            return this.a;
        }

        @NotNull
        public final DeleteSelectedBlur copy(@NotNull Blur blur0) {
            Intrinsics.checkNotNullParameter(blur0, "blur");
            return new DeleteSelectedBlur(blur0);
        }

        public static DeleteSelectedBlur copy$default(DeleteSelectedBlur mosaicIntent$DeleteSelectedBlur0, Blur blur0, int v, Object object0) {
            if((v & 1) != 0) {
                blur0 = mosaicIntent$DeleteSelectedBlur0.a;
            }
            return mosaicIntent$DeleteSelectedBlur0.copy(blur0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof DeleteSelectedBlur ? Intrinsics.areEqual(this.a, ((DeleteSelectedBlur)object0).a) : false;
        }

        @NotNull
        public final Blur getBlur() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "DeleteSelectedBlur(blur=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$DeleteSelectedMosaic;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "mosaic", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Mosaic;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/Mosaic;)Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$DeleteSelectedMosaic;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "getMosaic", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class DeleteSelectedMosaic implements MosaicIntent {
        public static final int $stable;
        public final Mosaic a;

        public DeleteSelectedMosaic(@NotNull Mosaic mosaic0) {
            Intrinsics.checkNotNullParameter(mosaic0, "mosaic");
            super();
            this.a = mosaic0;
        }

        @NotNull
        public final Mosaic component1() {
            return this.a;
        }

        @NotNull
        public final DeleteSelectedMosaic copy(@NotNull Mosaic mosaic0) {
            Intrinsics.checkNotNullParameter(mosaic0, "mosaic");
            return new DeleteSelectedMosaic(mosaic0);
        }

        public static DeleteSelectedMosaic copy$default(DeleteSelectedMosaic mosaicIntent$DeleteSelectedMosaic0, Mosaic mosaic0, int v, Object object0) {
            if((v & 1) != 0) {
                mosaic0 = mosaicIntent$DeleteSelectedMosaic0.a;
            }
            return mosaicIntent$DeleteSelectedMosaic0.copy(mosaic0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof DeleteSelectedMosaic ? Intrinsics.areEqual(this.a, ((DeleteSelectedMosaic)object0).a) : false;
        }

        @NotNull
        public final Mosaic getMosaic() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "DeleteSelectedMosaic(mosaic=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$Init;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Init implements MosaicIntent {
        public static final int $stable;
        @NotNull
        public static final Init INSTANCE;

        static {
            Init.INSTANCE = new Init();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Init;
        }

        @Override
        public int hashCode() {
            return 0x755E7DCA;
        }

        @Override
        @NotNull
        public String toString() {
            return "Init";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001A\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000BJ\'\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\tR\u001D\u0010\u0005\u001A\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\u000B\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006!"}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$MoveSelectBlur;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Blur;", "blur", "Landroidx/compose/ui/geometry/Offset;", "offset", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Blur;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Blur;", "component2-F1C5BW0", "()J", "component2", "copy-Uv8p0NA", "(Lcom/kakao/kandinsky/core/kdphoto/Blur;J)Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$MoveSelectBlur;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Blur;", "getBlur", "b", "J", "getOffset-F1C5BW0", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class MoveSelectBlur implements MosaicIntent {
        public static final int $stable;
        public final Blur a;
        public final long b;

        public MoveSelectBlur(Blur blur0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
            Intrinsics.checkNotNullParameter(blur0, "blur");
            super();
            this.a = blur0;
            this.b = v;
        }

        @NotNull
        public final Blur component1() {
            return this.a;
        }

        public final long component2-F1C5BW0() {
            return this.b;
        }

        @NotNull
        public final MoveSelectBlur copy-Uv8p0NA(@NotNull Blur blur0, long v) {
            Intrinsics.checkNotNullParameter(blur0, "blur");
            return new MoveSelectBlur(blur0, v, null);
        }

        public static MoveSelectBlur copy-Uv8p0NA$default(MoveSelectBlur mosaicIntent$MoveSelectBlur0, Blur blur0, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                blur0 = mosaicIntent$MoveSelectBlur0.a;
            }
            if((v1 & 2) != 0) {
                v = mosaicIntent$MoveSelectBlur0.b;
            }
            return mosaicIntent$MoveSelectBlur0.copy-Uv8p0NA(blur0, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof MoveSelectBlur)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((MoveSelectBlur)object0).a) ? Offset.equals-impl0(this.b, ((MoveSelectBlur)object0).b) : false;
        }

        @NotNull
        public final Blur getBlur() {
            return this.a;
        }

        public final long getOffset-F1C5BW0() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return Offset.hashCode-impl(this.b) + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            String s = Offset.toString-impl(this.b);
            return "MoveSelectBlur(blur=" + this.a + ", offset=" + s + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001A\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000BJ\'\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\tR\u001D\u0010\u0005\u001A\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\u000B\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006!"}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$MoveSelectMosaic;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "mosaic", "Landroidx/compose/ui/geometry/Offset;", "offset", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Mosaic;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "component2-F1C5BW0", "()J", "component2", "copy-Uv8p0NA", "(Lcom/kakao/kandinsky/core/kdphoto/Mosaic;J)Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$MoveSelectMosaic;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "getMosaic", "b", "J", "getOffset-F1C5BW0", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class MoveSelectMosaic implements MosaicIntent {
        public static final int $stable;
        public final Mosaic a;
        public final long b;

        public MoveSelectMosaic(Mosaic mosaic0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
            Intrinsics.checkNotNullParameter(mosaic0, "mosaic");
            super();
            this.a = mosaic0;
            this.b = v;
        }

        @NotNull
        public final Mosaic component1() {
            return this.a;
        }

        public final long component2-F1C5BW0() {
            return this.b;
        }

        @NotNull
        public final MoveSelectMosaic copy-Uv8p0NA(@NotNull Mosaic mosaic0, long v) {
            Intrinsics.checkNotNullParameter(mosaic0, "mosaic");
            return new MoveSelectMosaic(mosaic0, v, null);
        }

        public static MoveSelectMosaic copy-Uv8p0NA$default(MoveSelectMosaic mosaicIntent$MoveSelectMosaic0, Mosaic mosaic0, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                mosaic0 = mosaicIntent$MoveSelectMosaic0.a;
            }
            if((v1 & 2) != 0) {
                v = mosaicIntent$MoveSelectMosaic0.b;
            }
            return mosaicIntent$MoveSelectMosaic0.copy-Uv8p0NA(mosaic0, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof MoveSelectMosaic)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((MoveSelectMosaic)object0).a) ? Offset.equals-impl0(this.b, ((MoveSelectMosaic)object0).b) : false;
        }

        @NotNull
        public final Mosaic getMosaic() {
            return this.a;
        }

        public final long getOffset-F1C5BW0() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return Offset.hashCode-impl(this.b) + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            String s = Offset.toString-impl(this.b);
            return "MoveSelectMosaic(mosaic=" + this.a + ", offset=" + s + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0016\u0010\u000E\u001A\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001AHÖ\u0003¢\u0006\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000BR\u001D\u0010\u0005\u001A\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\rR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0010\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006("}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ScaleNRotateSelectBlur;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Blur;", "blur", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Matrix;", "matrix", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Blur;JLandroid/graphics/Matrix;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Blur;", "component2-NH-jbRc", "()J", "component2", "component3", "()Landroid/graphics/Matrix;", "copy-12SF9DM", "(Lcom/kakao/kandinsky/core/kdphoto/Blur;JLandroid/graphics/Matrix;)Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ScaleNRotateSelectBlur;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Blur;", "getBlur", "b", "J", "getSize-NH-jbRc", "c", "Landroid/graphics/Matrix;", "getMatrix", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ScaleNRotateSelectBlur implements MosaicIntent {
        public static final int $stable = 8;
        public final Blur a;
        public final long b;
        public final Matrix c;

        public ScaleNRotateSelectBlur(Blur blur0, long v, Matrix matrix0, DefaultConstructorMarker defaultConstructorMarker0) {
            Intrinsics.checkNotNullParameter(blur0, "blur");
            Intrinsics.checkNotNullParameter(matrix0, "matrix");
            super();
            this.a = blur0;
            this.b = v;
            this.c = matrix0;
        }

        @NotNull
        public final Blur component1() {
            return this.a;
        }

        public final long component2-NH-jbRc() {
            return this.b;
        }

        @NotNull
        public final Matrix component3() {
            return this.c;
        }

        @NotNull
        public final ScaleNRotateSelectBlur copy-12SF9DM(@NotNull Blur blur0, long v, @NotNull Matrix matrix0) {
            Intrinsics.checkNotNullParameter(blur0, "blur");
            Intrinsics.checkNotNullParameter(matrix0, "matrix");
            return new ScaleNRotateSelectBlur(blur0, v, matrix0, null);
        }

        public static ScaleNRotateSelectBlur copy-12SF9DM$default(ScaleNRotateSelectBlur mosaicIntent$ScaleNRotateSelectBlur0, Blur blur0, long v, Matrix matrix0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                blur0 = mosaicIntent$ScaleNRotateSelectBlur0.a;
            }
            if((v1 & 2) != 0) {
                v = mosaicIntent$ScaleNRotateSelectBlur0.b;
            }
            if((v1 & 4) != 0) {
                matrix0 = mosaicIntent$ScaleNRotateSelectBlur0.c;
            }
            return mosaicIntent$ScaleNRotateSelectBlur0.copy-12SF9DM(blur0, v, matrix0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ScaleNRotateSelectBlur)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((ScaleNRotateSelectBlur)object0).a)) {
                return false;
            }
            return Size.equals-impl0(this.b, ((ScaleNRotateSelectBlur)object0).b) ? Intrinsics.areEqual(this.c, ((ScaleNRotateSelectBlur)object0).c) : false;
        }

        @NotNull
        public final Blur getBlur() {
            return this.a;
        }

        @NotNull
        public final Matrix getMatrix() {
            return this.c;
        }

        public final long getSize-NH-jbRc() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() + (Size.hashCode-impl(this.b) + this.a.hashCode() * 0x1F) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            String s = Size.toString-impl(this.b);
            return "ScaleNRotateSelectBlur(blur=" + this.a + ", size=" + s + ", matrix=" + this.c + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0016\u0010\u000E\u001A\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001AHÖ\u0003¢\u0006\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000BR\u001D\u0010\u0005\u001A\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\rR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0010\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006("}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ScaleNRotateSelectMosaic;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "mosaic", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Matrix;", "matrix", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Mosaic;JLandroid/graphics/Matrix;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "component2-NH-jbRc", "()J", "component2", "component3", "()Landroid/graphics/Matrix;", "copy-12SF9DM", "(Lcom/kakao/kandinsky/core/kdphoto/Mosaic;JLandroid/graphics/Matrix;)Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$ScaleNRotateSelectMosaic;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "getMosaic", "b", "J", "getSize-NH-jbRc", "c", "Landroid/graphics/Matrix;", "getMatrix", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ScaleNRotateSelectMosaic implements MosaicIntent {
        public static final int $stable = 8;
        public final Mosaic a;
        public final long b;
        public final Matrix c;

        public ScaleNRotateSelectMosaic(Mosaic mosaic0, long v, Matrix matrix0, DefaultConstructorMarker defaultConstructorMarker0) {
            Intrinsics.checkNotNullParameter(mosaic0, "mosaic");
            Intrinsics.checkNotNullParameter(matrix0, "matrix");
            super();
            this.a = mosaic0;
            this.b = v;
            this.c = matrix0;
        }

        @NotNull
        public final Mosaic component1() {
            return this.a;
        }

        public final long component2-NH-jbRc() {
            return this.b;
        }

        @NotNull
        public final Matrix component3() {
            return this.c;
        }

        @NotNull
        public final ScaleNRotateSelectMosaic copy-12SF9DM(@NotNull Mosaic mosaic0, long v, @NotNull Matrix matrix0) {
            Intrinsics.checkNotNullParameter(mosaic0, "mosaic");
            Intrinsics.checkNotNullParameter(matrix0, "matrix");
            return new ScaleNRotateSelectMosaic(mosaic0, v, matrix0, null);
        }

        public static ScaleNRotateSelectMosaic copy-12SF9DM$default(ScaleNRotateSelectMosaic mosaicIntent$ScaleNRotateSelectMosaic0, Mosaic mosaic0, long v, Matrix matrix0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                mosaic0 = mosaicIntent$ScaleNRotateSelectMosaic0.a;
            }
            if((v1 & 2) != 0) {
                v = mosaicIntent$ScaleNRotateSelectMosaic0.b;
            }
            if((v1 & 4) != 0) {
                matrix0 = mosaicIntent$ScaleNRotateSelectMosaic0.c;
            }
            return mosaicIntent$ScaleNRotateSelectMosaic0.copy-12SF9DM(mosaic0, v, matrix0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ScaleNRotateSelectMosaic)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((ScaleNRotateSelectMosaic)object0).a)) {
                return false;
            }
            return Size.equals-impl0(this.b, ((ScaleNRotateSelectMosaic)object0).b) ? Intrinsics.areEqual(this.c, ((ScaleNRotateSelectMosaic)object0).c) : false;
        }

        @NotNull
        public final Matrix getMatrix() {
            return this.c;
        }

        @NotNull
        public final Mosaic getMosaic() {
            return this.a;
        }

        public final long getSize-NH-jbRc() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() + (Size.hashCode-impl(this.b) + this.a.hashCode() * 0x1F) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            String s = Size.toString-impl(this.b);
            return "ScaleNRotateSelectMosaic(mosaic=" + this.a + ", size=" + s + ", matrix=" + this.c + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$SelectMosaic;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "mosaic", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Mosaic;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/Mosaic;)Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$SelectMosaic;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic;", "getMosaic", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SelectMosaic implements MosaicIntent {
        public static final int $stable;
        public final Mosaic a;

        public SelectMosaic(@Nullable Mosaic mosaic0) {
            this.a = mosaic0;
        }

        @Nullable
        public final Mosaic component1() {
            return this.a;
        }

        @NotNull
        public final SelectMosaic copy(@Nullable Mosaic mosaic0) {
            return new SelectMosaic(mosaic0);
        }

        public static SelectMosaic copy$default(SelectMosaic mosaicIntent$SelectMosaic0, Mosaic mosaic0, int v, Object object0) {
            if((v & 1) != 0) {
                mosaic0 = mosaicIntent$SelectMosaic0.a;
            }
            return mosaicIntent$SelectMosaic0.copy(mosaic0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof SelectMosaic ? Intrinsics.areEqual(this.a, ((SelectMosaic)object0).a) : false;
        }

        @Nullable
        public final Mosaic getMosaic() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "SelectMosaic(mosaic=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$UpdateContentBounds;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "Landroidx/compose/ui/geometry/Rect;", "bounds", "<init>", "(Landroidx/compose/ui/geometry/Rect;)V", "component1", "()Landroidx/compose/ui/geometry/Rect;", "copy", "(Landroidx/compose/ui/geometry/Rect;)Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$UpdateContentBounds;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/geometry/Rect;", "getBounds", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateContentBounds implements MosaicIntent {
        public static final int $stable;
        public final Rect a;

        public UpdateContentBounds(@NotNull Rect rect0) {
            Intrinsics.checkNotNullParameter(rect0, "bounds");
            super();
            this.a = rect0;
        }

        @NotNull
        public final Rect component1() {
            return this.a;
        }

        @NotNull
        public final UpdateContentBounds copy(@NotNull Rect rect0) {
            Intrinsics.checkNotNullParameter(rect0, "bounds");
            return new UpdateContentBounds(rect0);
        }

        public static UpdateContentBounds copy$default(UpdateContentBounds mosaicIntent$UpdateContentBounds0, Rect rect0, int v, Object object0) {
            if((v & 1) != 0) {
                rect0 = mosaicIntent$UpdateContentBounds0.a;
            }
            return mosaicIntent$UpdateContentBounds0.copy(rect0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateContentBounds ? Intrinsics.areEqual(this.a, ((UpdateContentBounds)object0).a) : false;
        }

        @NotNull
        public final Rect getBounds() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateContentBounds(bounds=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$UpdatePhoto;", "Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)Lcom/kakao/kandinsky/mosaic/contract/MosaicIntent$UpdatePhoto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getPhoto", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdatePhoto implements MosaicIntent {
        public static final int $stable;
        public final KDPhoto a;

        public UpdatePhoto(@NotNull KDPhoto kDPhoto0) {
            Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
            super();
            this.a = kDPhoto0;
        }

        @NotNull
        public final KDPhoto component1() {
            return this.a;
        }

        @NotNull
        public final UpdatePhoto copy(@NotNull KDPhoto kDPhoto0) {
            Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
            return new UpdatePhoto(kDPhoto0);
        }

        public static UpdatePhoto copy$default(UpdatePhoto mosaicIntent$UpdatePhoto0, KDPhoto kDPhoto0, int v, Object object0) {
            if((v & 1) != 0) {
                kDPhoto0 = mosaicIntent$UpdatePhoto0.a;
            }
            return mosaicIntent$UpdatePhoto0.copy(kDPhoto0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdatePhoto ? Intrinsics.areEqual(this.a, ((UpdatePhoto)object0).a) : false;
        }

        @NotNull
        public final KDPhoto getPhoto() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdatePhoto(photo=" + this.a + ")";
        }
    }

}

