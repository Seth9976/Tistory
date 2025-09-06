package com.kakao.kandinsky.crop.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000F\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0082\u0001\u000F\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F¨\u0006 "}, d2 = {"Lcom/kakao/kandinsky/crop/contract/CropIntent;", "", "Cancel", "ChangeCropRatio", "ChangeViewType", "Confirm", "FinishInteraction", "Flip", "Init", "OnDrag", "OnMove", "RotateAngle", "RotateDirect", "UpdateContentBounds", "UpdatePhoto", "ZoomInOut", "ZoomReset", "Lcom/kakao/kandinsky/crop/contract/CropIntent$Cancel;", "Lcom/kakao/kandinsky/crop/contract/CropIntent$ChangeCropRatio;", "Lcom/kakao/kandinsky/crop/contract/CropIntent$ChangeViewType;", "Lcom/kakao/kandinsky/crop/contract/CropIntent$Confirm;", "Lcom/kakao/kandinsky/crop/contract/CropIntent$FinishInteraction;", "Lcom/kakao/kandinsky/crop/contract/CropIntent$Flip;", "Lcom/kakao/kandinsky/crop/contract/CropIntent$Init;", "Lcom/kakao/kandinsky/crop/contract/CropIntent$OnDrag;", "Lcom/kakao/kandinsky/crop/contract/CropIntent$OnMove;", "Lcom/kakao/kandinsky/crop/contract/CropIntent$RotateAngle;", "Lcom/kakao/kandinsky/crop/contract/CropIntent$RotateDirect;", "Lcom/kakao/kandinsky/crop/contract/CropIntent$UpdateContentBounds;", "Lcom/kakao/kandinsky/crop/contract/CropIntent$UpdatePhoto;", "Lcom/kakao/kandinsky/crop/contract/CropIntent$ZoomInOut;", "Lcom/kakao/kandinsky/crop/contract/CropIntent$ZoomReset;", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface CropIntent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/CropIntent$Cancel;", "Lcom/kakao/kandinsky/crop/contract/CropIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Cancel implements CropIntent {
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
            return 2081536424;
        }

        @Override
        @NotNull
        public String toString() {
            return "Cancel";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/CropIntent$ChangeCropRatio;", "Lcom/kakao/kandinsky/crop/contract/CropIntent;", "Lcom/kakao/kandinsky/crop/contract/CropRatioType;", "cropRatioType", "<init>", "(Lcom/kakao/kandinsky/crop/contract/CropRatioType;)V", "component1", "()Lcom/kakao/kandinsky/crop/contract/CropRatioType;", "copy", "(Lcom/kakao/kandinsky/crop/contract/CropRatioType;)Lcom/kakao/kandinsky/crop/contract/CropIntent$ChangeCropRatio;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/crop/contract/CropRatioType;", "getCropRatioType", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeCropRatio implements CropIntent {
        public static final int $stable;
        public final CropRatioType a;

        public ChangeCropRatio(@NotNull CropRatioType cropRatioType0) {
            Intrinsics.checkNotNullParameter(cropRatioType0, "cropRatioType");
            super();
            this.a = cropRatioType0;
        }

        @NotNull
        public final CropRatioType component1() {
            return this.a;
        }

        @NotNull
        public final ChangeCropRatio copy(@NotNull CropRatioType cropRatioType0) {
            Intrinsics.checkNotNullParameter(cropRatioType0, "cropRatioType");
            return new ChangeCropRatio(cropRatioType0);
        }

        public static ChangeCropRatio copy$default(ChangeCropRatio cropIntent$ChangeCropRatio0, CropRatioType cropRatioType0, int v, Object object0) {
            if((v & 1) != 0) {
                cropRatioType0 = cropIntent$ChangeCropRatio0.a;
            }
            return cropIntent$ChangeCropRatio0.copy(cropRatioType0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeCropRatio ? this.a == ((ChangeCropRatio)object0).a : false;
        }

        @NotNull
        public final CropRatioType getCropRatioType() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeCropRatio(cropRatioType=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/CropIntent$ChangeViewType;", "Lcom/kakao/kandinsky/crop/contract/CropIntent;", "Lcom/kakao/kandinsky/crop/contract/CropViewType;", "viewType", "<init>", "(Lcom/kakao/kandinsky/crop/contract/CropViewType;)V", "component1", "()Lcom/kakao/kandinsky/crop/contract/CropViewType;", "copy", "(Lcom/kakao/kandinsky/crop/contract/CropViewType;)Lcom/kakao/kandinsky/crop/contract/CropIntent$ChangeViewType;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/crop/contract/CropViewType;", "getViewType", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeViewType implements CropIntent {
        public static final int $stable;
        public final CropViewType a;

        public ChangeViewType(@NotNull CropViewType cropViewType0) {
            Intrinsics.checkNotNullParameter(cropViewType0, "viewType");
            super();
            this.a = cropViewType0;
        }

        @NotNull
        public final CropViewType component1() {
            return this.a;
        }

        @NotNull
        public final ChangeViewType copy(@NotNull CropViewType cropViewType0) {
            Intrinsics.checkNotNullParameter(cropViewType0, "viewType");
            return new ChangeViewType(cropViewType0);
        }

        public static ChangeViewType copy$default(ChangeViewType cropIntent$ChangeViewType0, CropViewType cropViewType0, int v, Object object0) {
            if((v & 1) != 0) {
                cropViewType0 = cropIntent$ChangeViewType0.a;
            }
            return cropIntent$ChangeViewType0.copy(cropViewType0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeViewType ? this.a == ((ChangeViewType)object0).a : false;
        }

        @NotNull
        public final CropViewType getViewType() {
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
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/CropIntent$Confirm;", "Lcom/kakao/kandinsky/crop/contract/CropIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Confirm implements CropIntent {
        public static final int $stable;
        @NotNull
        public static final Confirm INSTANCE;

        static {
            Confirm.INSTANCE = new Confirm();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Confirm;
        }

        @Override
        public int hashCode() {
            return 504021330;
        }

        @Override
        @NotNull
        public String toString() {
            return "Confirm";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/CropIntent$FinishInteraction;", "Lcom/kakao/kandinsky/crop/contract/CropIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class FinishInteraction implements CropIntent {
        public static final int $stable;
        @NotNull
        public static final FinishInteraction INSTANCE;

        static {
            FinishInteraction.INSTANCE = new FinishInteraction();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof FinishInteraction;
        }

        @Override
        public int hashCode() {
            return 0x73DCAB91;
        }

        @Override
        @NotNull
        public String toString() {
            return "FinishInteraction";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/CropIntent$Flip;", "Lcom/kakao/kandinsky/crop/contract/CropIntent;", "Lcom/kakao/kandinsky/crop/contract/FlipType;", "flipType", "<init>", "(Lcom/kakao/kandinsky/crop/contract/FlipType;)V", "component1", "()Lcom/kakao/kandinsky/crop/contract/FlipType;", "copy", "(Lcom/kakao/kandinsky/crop/contract/FlipType;)Lcom/kakao/kandinsky/crop/contract/CropIntent$Flip;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/crop/contract/FlipType;", "getFlipType", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Flip implements CropIntent {
        public static final int $stable;
        public final FlipType a;

        public Flip(@NotNull FlipType flipType0) {
            Intrinsics.checkNotNullParameter(flipType0, "flipType");
            super();
            this.a = flipType0;
        }

        @NotNull
        public final FlipType component1() {
            return this.a;
        }

        @NotNull
        public final Flip copy(@NotNull FlipType flipType0) {
            Intrinsics.checkNotNullParameter(flipType0, "flipType");
            return new Flip(flipType0);
        }

        public static Flip copy$default(Flip cropIntent$Flip0, FlipType flipType0, int v, Object object0) {
            if((v & 1) != 0) {
                flipType0 = cropIntent$Flip0.a;
            }
            return cropIntent$Flip0.copy(flipType0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Flip ? this.a == ((Flip)object0).a : false;
        }

        @NotNull
        public final FlipType getFlipType() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "Flip(flipType=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/CropIntent$Init;", "Lcom/kakao/kandinsky/crop/contract/CropIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Init implements CropIntent {
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
            return 0x8AEDE3BE;
        }

        @Override
        @NotNull
        public String toString() {
            return "Init";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001A\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\'\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\f\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006!"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/CropIntent$OnDrag;", "Lcom/kakao/kandinsky/crop/contract/CropIntent;", "Landroidx/compose/ui/geometry/Offset;", "offset", "Lcom/kakao/kandinsky/crop/contract/TouchDragPoint;", "touchPoint", "<init>", "(JLcom/kakao/kandinsky/crop/contract/TouchDragPoint;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-F1C5BW0", "()J", "component1", "component2", "()Lcom/kakao/kandinsky/crop/contract/TouchDragPoint;", "copy-3MmeM6k", "(JLcom/kakao/kandinsky/crop/contract/TouchDragPoint;)Lcom/kakao/kandinsky/crop/contract/CropIntent$OnDrag;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getOffset-F1C5BW0", "b", "Lcom/kakao/kandinsky/crop/contract/TouchDragPoint;", "getTouchPoint", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class OnDrag implements CropIntent {
        public static final int $stable = 8;
        public final long a;
        public final TouchDragPoint b;

        public OnDrag(long v, TouchDragPoint touchDragPoint0, DefaultConstructorMarker defaultConstructorMarker0) {
            Intrinsics.checkNotNullParameter(touchDragPoint0, "touchPoint");
            super();
            this.a = v;
            this.b = touchDragPoint0;
        }

        public final long component1-F1C5BW0() {
            return this.a;
        }

        @NotNull
        public final TouchDragPoint component2() {
            return this.b;
        }

        @NotNull
        public final OnDrag copy-3MmeM6k(long v, @NotNull TouchDragPoint touchDragPoint0) {
            Intrinsics.checkNotNullParameter(touchDragPoint0, "touchPoint");
            return new OnDrag(v, touchDragPoint0, null);
        }

        public static OnDrag copy-3MmeM6k$default(OnDrag cropIntent$OnDrag0, long v, TouchDragPoint touchDragPoint0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = cropIntent$OnDrag0.a;
            }
            if((v1 & 2) != 0) {
                touchDragPoint0 = cropIntent$OnDrag0.b;
            }
            return cropIntent$OnDrag0.copy-3MmeM6k(v, touchDragPoint0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof OnDrag)) {
                return false;
            }
            return Offset.equals-impl0(this.a, ((OnDrag)object0).a) ? Intrinsics.areEqual(this.b, ((OnDrag)object0).b) : false;
        }

        public final long getOffset-F1C5BW0() {
            return this.a;
        }

        @NotNull
        public final TouchDragPoint getTouchPoint() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + Offset.hashCode-impl(this.a) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "OnDrag(offset=" + Offset.toString-impl(this.a) + ", touchPoint=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001A\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u0007\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u001A"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/CropIntent$OnMove;", "Lcom/kakao/kandinsky/crop/contract/CropIntent;", "Landroidx/compose/ui/geometry/Offset;", "offset", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-F1C5BW0", "()J", "component1", "copy-k-4lQ0M", "(J)Lcom/kakao/kandinsky/crop/contract/CropIntent$OnMove;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getOffset-F1C5BW0", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class OnMove implements CropIntent {
        public static final int $stable;
        public final long a;

        public OnMove(long v, DefaultConstructorMarker defaultConstructorMarker0) {
            this.a = v;
        }

        public final long component1-F1C5BW0() {
            return this.a;
        }

        @NotNull
        public final OnMove copy-k-4lQ0M(long v) {
            return new OnMove(v, null);
        }

        public static OnMove copy-k-4lQ0M$default(OnMove cropIntent$OnMove0, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = cropIntent$OnMove0.a;
            }
            return cropIntent$OnMove0.copy-k-4lQ0M(v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof OnMove ? Offset.equals-impl0(this.a, ((OnMove)object0).a) : false;
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
            return a.d("OnMove(offset=", Offset.toString-impl(this.a), ")");
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/CropIntent$RotateAngle;", "Lcom/kakao/kandinsky/crop/contract/CropIntent;", "", "angle", "<init>", "(F)V", "component1", "()F", "copy", "(F)Lcom/kakao/kandinsky/crop/contract/CropIntent$RotateAngle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getAngle", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RotateAngle implements CropIntent {
        public static final int $stable;
        public final float a;

        public RotateAngle(float f) {
            this.a = f;
        }

        public final float component1() {
            return this.a;
        }

        @NotNull
        public final RotateAngle copy(float f) {
            return new RotateAngle(f);
        }

        public static RotateAngle copy$default(RotateAngle cropIntent$RotateAngle0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = cropIntent$RotateAngle0.a;
            }
            return cropIntent$RotateAngle0.copy(f);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RotateAngle ? Float.compare(this.a, ((RotateAngle)object0).a) == 0 : false;
        }

        public final float getAngle() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.a);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("RotateAngle(angle=");
            return androidx.room.a.h(this.a, ")", stringBuilder0);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/CropIntent$RotateDirect;", "Lcom/kakao/kandinsky/crop/contract/CropIntent;", "Lcom/kakao/kandinsky/crop/contract/RotateType;", "rotateType", "<init>", "(Lcom/kakao/kandinsky/crop/contract/RotateType;)V", "component1", "()Lcom/kakao/kandinsky/crop/contract/RotateType;", "copy", "(Lcom/kakao/kandinsky/crop/contract/RotateType;)Lcom/kakao/kandinsky/crop/contract/CropIntent$RotateDirect;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/crop/contract/RotateType;", "getRotateType", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RotateDirect implements CropIntent {
        public static final int $stable;
        public final RotateType a;

        public RotateDirect(@NotNull RotateType rotateType0) {
            Intrinsics.checkNotNullParameter(rotateType0, "rotateType");
            super();
            this.a = rotateType0;
        }

        @NotNull
        public final RotateType component1() {
            return this.a;
        }

        @NotNull
        public final RotateDirect copy(@NotNull RotateType rotateType0) {
            Intrinsics.checkNotNullParameter(rotateType0, "rotateType");
            return new RotateDirect(rotateType0);
        }

        public static RotateDirect copy$default(RotateDirect cropIntent$RotateDirect0, RotateType rotateType0, int v, Object object0) {
            if((v & 1) != 0) {
                rotateType0 = cropIntent$RotateDirect0.a;
            }
            return cropIntent$RotateDirect0.copy(rotateType0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RotateDirect ? this.a == ((RotateDirect)object0).a : false;
        }

        @NotNull
        public final RotateType getRotateType() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "RotateDirect(rotateType=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/CropIntent$UpdateContentBounds;", "Lcom/kakao/kandinsky/crop/contract/CropIntent;", "Landroidx/compose/ui/geometry/Rect;", "bounds", "<init>", "(Landroidx/compose/ui/geometry/Rect;)V", "component1", "()Landroidx/compose/ui/geometry/Rect;", "copy", "(Landroidx/compose/ui/geometry/Rect;)Lcom/kakao/kandinsky/crop/contract/CropIntent$UpdateContentBounds;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/geometry/Rect;", "getBounds", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateContentBounds implements CropIntent {
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

        public static UpdateContentBounds copy$default(UpdateContentBounds cropIntent$UpdateContentBounds0, Rect rect0, int v, Object object0) {
            if((v & 1) != 0) {
                rect0 = cropIntent$UpdateContentBounds0.a;
            }
            return cropIntent$UpdateContentBounds0.copy(rect0);
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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/CropIntent$UpdatePhoto;", "Lcom/kakao/kandinsky/crop/contract/CropIntent;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)Lcom/kakao/kandinsky/crop/contract/CropIntent$UpdatePhoto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getPhoto", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdatePhoto implements CropIntent {
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

        public static UpdatePhoto copy$default(UpdatePhoto cropIntent$UpdatePhoto0, KDPhoto kDPhoto0, int v, Object object0) {
            if((v & 1) != 0) {
                kDPhoto0 = cropIntent$UpdatePhoto0.a;
            }
            return cropIntent$UpdatePhoto0.copy(kDPhoto0);
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

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/CropIntent$ZoomInOut;", "Lcom/kakao/kandinsky/crop/contract/CropIntent;", "", "zoom", "<init>", "(F)V", "component1", "()F", "copy", "(F)Lcom/kakao/kandinsky/crop/contract/CropIntent$ZoomInOut;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getZoom", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ZoomInOut implements CropIntent {
        public static final int $stable;
        public final float a;

        public ZoomInOut(float f) {
            this.a = f;
        }

        public final float component1() {
            return this.a;
        }

        @NotNull
        public final ZoomInOut copy(float f) {
            return new ZoomInOut(f);
        }

        public static ZoomInOut copy$default(ZoomInOut cropIntent$ZoomInOut0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = cropIntent$ZoomInOut0.a;
            }
            return cropIntent$ZoomInOut0.copy(f);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ZoomInOut ? Float.compare(this.a, ((ZoomInOut)object0).a) == 0 : false;
        }

        public final float getZoom() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Float.hashCode(this.a);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("ZoomInOut(zoom=");
            return androidx.room.a.h(this.a, ")", stringBuilder0);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/crop/contract/CropIntent$ZoomReset;", "Lcom/kakao/kandinsky/crop/contract/CropIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "crop_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ZoomReset implements CropIntent {
        public static final int $stable;
        @NotNull
        public static final ZoomReset INSTANCE;

        static {
            ZoomReset.INSTANCE = new ZoomReset();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof ZoomReset;
        }

        @Override
        public int hashCode() {
            return 0x5813F34E;
        }

        @Override
        @NotNull
        public String toString() {
            return "ZoomReset";
        }
    }

}

