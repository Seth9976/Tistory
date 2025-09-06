package com.kakao.kandinsky.sticker.contract;

import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.core.kdphoto.Sticker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\u0082\u0001\n\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/kakao/kandinsky/sticker/contract/StickerIntent;", "", "AddSticker", "Confirm", "MoveSelectSticker", "RemoveAllSticker", "RemoveSelectSticker", "ScaleNRotateSelectSticker", "SelectDecoSticker", "SelectStickerGroup", "UpdateContentBounds", "UpdatePhoto", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent$AddSticker;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent$Confirm;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent$MoveSelectSticker;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent$RemoveAllSticker;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent$RemoveSelectSticker;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent$ScaleNRotateSelectSticker;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent$SelectDecoSticker;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent$SelectStickerGroup;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent$UpdateContentBounds;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent$UpdatePhoto;", "sticker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface StickerIntent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/sticker/contract/StickerIntent$AddSticker;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent;", "Lcom/kakao/kandinsky/sticker/contract/StickerItem;", "stickerItem", "<init>", "(Lcom/kakao/kandinsky/sticker/contract/StickerItem;)V", "component1", "()Lcom/kakao/kandinsky/sticker/contract/StickerItem;", "copy", "(Lcom/kakao/kandinsky/sticker/contract/StickerItem;)Lcom/kakao/kandinsky/sticker/contract/StickerIntent$AddSticker;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/sticker/contract/StickerItem;", "getStickerItem", "sticker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class AddSticker implements StickerIntent {
        public static final int $stable;
        public final StickerItem a;

        public AddSticker(@NotNull StickerItem stickerItem0) {
            Intrinsics.checkNotNullParameter(stickerItem0, "stickerItem");
            super();
            this.a = stickerItem0;
        }

        @NotNull
        public final StickerItem component1() {
            return this.a;
        }

        @NotNull
        public final AddSticker copy(@NotNull StickerItem stickerItem0) {
            Intrinsics.checkNotNullParameter(stickerItem0, "stickerItem");
            return new AddSticker(stickerItem0);
        }

        public static AddSticker copy$default(AddSticker stickerIntent$AddSticker0, StickerItem stickerItem0, int v, Object object0) {
            if((v & 1) != 0) {
                stickerItem0 = stickerIntent$AddSticker0.a;
            }
            return stickerIntent$AddSticker0.copy(stickerItem0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof AddSticker ? Intrinsics.areEqual(this.a, ((AddSticker)object0).a) : false;
        }

        @NotNull
        public final StickerItem getStickerItem() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "AddSticker(stickerItem=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/sticker/contract/StickerIntent$Confirm;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "sticker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Confirm implements StickerIntent {
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
            return 1591006070;
        }

        @Override
        @NotNull
        public String toString() {
            return "Confirm";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001A\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000BJ\'\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\tR\u001D\u0010\u0005\u001A\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\u000B\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006!"}, d2 = {"Lcom/kakao/kandinsky/sticker/contract/StickerIntent$MoveSelectSticker;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Sticker;", "sticker", "Landroidx/compose/ui/geometry/Offset;", "offset", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Sticker;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Sticker;", "component2-F1C5BW0", "()J", "component2", "copy-Uv8p0NA", "(Lcom/kakao/kandinsky/core/kdphoto/Sticker;J)Lcom/kakao/kandinsky/sticker/contract/StickerIntent$MoveSelectSticker;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Sticker;", "getSticker", "b", "J", "getOffset-F1C5BW0", "sticker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class MoveSelectSticker implements StickerIntent {
        public static final int $stable;
        public final Sticker a;
        public final long b;

        public MoveSelectSticker(Sticker sticker0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
            Intrinsics.checkNotNullParameter(sticker0, "sticker");
            super();
            this.a = sticker0;
            this.b = v;
        }

        @NotNull
        public final Sticker component1() {
            return this.a;
        }

        public final long component2-F1C5BW0() {
            return this.b;
        }

        @NotNull
        public final MoveSelectSticker copy-Uv8p0NA(@NotNull Sticker sticker0, long v) {
            Intrinsics.checkNotNullParameter(sticker0, "sticker");
            return new MoveSelectSticker(sticker0, v, null);
        }

        public static MoveSelectSticker copy-Uv8p0NA$default(MoveSelectSticker stickerIntent$MoveSelectSticker0, Sticker sticker0, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                sticker0 = stickerIntent$MoveSelectSticker0.a;
            }
            if((v1 & 2) != 0) {
                v = stickerIntent$MoveSelectSticker0.b;
            }
            return stickerIntent$MoveSelectSticker0.copy-Uv8p0NA(sticker0, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof MoveSelectSticker)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((MoveSelectSticker)object0).a) ? Offset.equals-impl0(this.b, ((MoveSelectSticker)object0).b) : false;
        }

        public final long getOffset-F1C5BW0() {
            return this.b;
        }

        @NotNull
        public final Sticker getSticker() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Offset.hashCode-impl(this.b) + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            String s = Offset.toString-impl(this.b);
            return "MoveSelectSticker(sticker=" + this.a + ", offset=" + s + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/sticker/contract/StickerIntent$RemoveAllSticker;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "sticker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RemoveAllSticker implements StickerIntent {
        public static final int $stable;
        @NotNull
        public static final RemoveAllSticker INSTANCE;

        static {
            RemoveAllSticker.INSTANCE = new RemoveAllSticker();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof RemoveAllSticker;
        }

        @Override
        public int hashCode() {
            return 0x91AE400A;
        }

        @Override
        @NotNull
        public String toString() {
            return "RemoveAllSticker";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/sticker/contract/StickerIntent$RemoveSelectSticker;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Sticker;", "sticker", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Sticker;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Sticker;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/Sticker;)Lcom/kakao/kandinsky/sticker/contract/StickerIntent$RemoveSelectSticker;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Sticker;", "getSticker", "sticker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RemoveSelectSticker implements StickerIntent {
        public static final int $stable;
        public final Sticker a;

        public RemoveSelectSticker(@NotNull Sticker sticker0) {
            Intrinsics.checkNotNullParameter(sticker0, "sticker");
            super();
            this.a = sticker0;
        }

        @NotNull
        public final Sticker component1() {
            return this.a;
        }

        @NotNull
        public final RemoveSelectSticker copy(@NotNull Sticker sticker0) {
            Intrinsics.checkNotNullParameter(sticker0, "sticker");
            return new RemoveSelectSticker(sticker0);
        }

        public static RemoveSelectSticker copy$default(RemoveSelectSticker stickerIntent$RemoveSelectSticker0, Sticker sticker0, int v, Object object0) {
            if((v & 1) != 0) {
                sticker0 = stickerIntent$RemoveSelectSticker0.a;
            }
            return stickerIntent$RemoveSelectSticker0.copy(sticker0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RemoveSelectSticker ? Intrinsics.areEqual(this.a, ((RemoveSelectSticker)object0).a) : false;
        }

        @NotNull
        public final Sticker getSticker() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "RemoveSelectSticker(sticker=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0016\u0010\u000E\u001A\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001AHÖ\u0003¢\u0006\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000BR\u001D\u0010\u0005\u001A\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\rR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0010\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006("}, d2 = {"Lcom/kakao/kandinsky/sticker/contract/StickerIntent$ScaleNRotateSelectSticker;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Sticker;", "sticker", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Matrix;", "matrix", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Sticker;JLandroid/graphics/Matrix;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Sticker;", "component2-NH-jbRc", "()J", "component2", "component3", "()Landroid/graphics/Matrix;", "copy-12SF9DM", "(Lcom/kakao/kandinsky/core/kdphoto/Sticker;JLandroid/graphics/Matrix;)Lcom/kakao/kandinsky/sticker/contract/StickerIntent$ScaleNRotateSelectSticker;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Sticker;", "getSticker", "b", "J", "getSize-NH-jbRc", "c", "Landroid/graphics/Matrix;", "getMatrix", "sticker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ScaleNRotateSelectSticker implements StickerIntent {
        public static final int $stable = 8;
        public final Sticker a;
        public final long b;
        public final Matrix c;

        public ScaleNRotateSelectSticker(Sticker sticker0, long v, Matrix matrix0, DefaultConstructorMarker defaultConstructorMarker0) {
            Intrinsics.checkNotNullParameter(sticker0, "sticker");
            Intrinsics.checkNotNullParameter(matrix0, "matrix");
            super();
            this.a = sticker0;
            this.b = v;
            this.c = matrix0;
        }

        @NotNull
        public final Sticker component1() {
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
        public final ScaleNRotateSelectSticker copy-12SF9DM(@NotNull Sticker sticker0, long v, @NotNull Matrix matrix0) {
            Intrinsics.checkNotNullParameter(sticker0, "sticker");
            Intrinsics.checkNotNullParameter(matrix0, "matrix");
            return new ScaleNRotateSelectSticker(sticker0, v, matrix0, null);
        }

        public static ScaleNRotateSelectSticker copy-12SF9DM$default(ScaleNRotateSelectSticker stickerIntent$ScaleNRotateSelectSticker0, Sticker sticker0, long v, Matrix matrix0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                sticker0 = stickerIntent$ScaleNRotateSelectSticker0.a;
            }
            if((v1 & 2) != 0) {
                v = stickerIntent$ScaleNRotateSelectSticker0.b;
            }
            if((v1 & 4) != 0) {
                matrix0 = stickerIntent$ScaleNRotateSelectSticker0.c;
            }
            return stickerIntent$ScaleNRotateSelectSticker0.copy-12SF9DM(sticker0, v, matrix0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ScaleNRotateSelectSticker)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((ScaleNRotateSelectSticker)object0).a)) {
                return false;
            }
            return Size.equals-impl0(this.b, ((ScaleNRotateSelectSticker)object0).b) ? Intrinsics.areEqual(this.c, ((ScaleNRotateSelectSticker)object0).c) : false;
        }

        @NotNull
        public final Matrix getMatrix() {
            return this.c;
        }

        public final long getSize-NH-jbRc() {
            return this.b;
        }

        @NotNull
        public final Sticker getSticker() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() + (Size.hashCode-impl(this.b) + this.a.hashCode() * 0x1F) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            String s = Size.toString-impl(this.b);
            return "ScaleNRotateSelectSticker(sticker=" + this.a + ", size=" + s + ", matrix=" + this.c + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/sticker/contract/StickerIntent$SelectDecoSticker;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Sticker;", "sticker", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Sticker;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Sticker;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/Sticker;)Lcom/kakao/kandinsky/sticker/contract/StickerIntent$SelectDecoSticker;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Sticker;", "getSticker", "sticker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SelectDecoSticker implements StickerIntent {
        public static final int $stable;
        public final Sticker a;

        public SelectDecoSticker(@Nullable Sticker sticker0) {
            this.a = sticker0;
        }

        @Nullable
        public final Sticker component1() {
            return this.a;
        }

        @NotNull
        public final SelectDecoSticker copy(@Nullable Sticker sticker0) {
            return new SelectDecoSticker(sticker0);
        }

        public static SelectDecoSticker copy$default(SelectDecoSticker stickerIntent$SelectDecoSticker0, Sticker sticker0, int v, Object object0) {
            if((v & 1) != 0) {
                sticker0 = stickerIntent$SelectDecoSticker0.a;
            }
            return stickerIntent$SelectDecoSticker0.copy(sticker0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof SelectDecoSticker ? Intrinsics.areEqual(this.a, ((SelectDecoSticker)object0).a) : false;
        }

        @Nullable
        public final Sticker getSticker() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "SelectDecoSticker(sticker=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/sticker/contract/StickerIntent$SelectStickerGroup;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent;", "Lcom/kakao/kandinsky/sticker/contract/StickerGroup;", "stickerGroup", "<init>", "(Lcom/kakao/kandinsky/sticker/contract/StickerGroup;)V", "component1", "()Lcom/kakao/kandinsky/sticker/contract/StickerGroup;", "copy", "(Lcom/kakao/kandinsky/sticker/contract/StickerGroup;)Lcom/kakao/kandinsky/sticker/contract/StickerIntent$SelectStickerGroup;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/sticker/contract/StickerGroup;", "getStickerGroup", "sticker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SelectStickerGroup implements StickerIntent {
        public static final int $stable;
        public final StickerGroup a;

        public SelectStickerGroup(@NotNull StickerGroup stickerGroup0) {
            Intrinsics.checkNotNullParameter(stickerGroup0, "stickerGroup");
            super();
            this.a = stickerGroup0;
        }

        @NotNull
        public final StickerGroup component1() {
            return this.a;
        }

        @NotNull
        public final SelectStickerGroup copy(@NotNull StickerGroup stickerGroup0) {
            Intrinsics.checkNotNullParameter(stickerGroup0, "stickerGroup");
            return new SelectStickerGroup(stickerGroup0);
        }

        public static SelectStickerGroup copy$default(SelectStickerGroup stickerIntent$SelectStickerGroup0, StickerGroup stickerGroup0, int v, Object object0) {
            if((v & 1) != 0) {
                stickerGroup0 = stickerIntent$SelectStickerGroup0.a;
            }
            return stickerIntent$SelectStickerGroup0.copy(stickerGroup0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof SelectStickerGroup ? Intrinsics.areEqual(this.a, ((SelectStickerGroup)object0).a) : false;
        }

        @NotNull
        public final StickerGroup getStickerGroup() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "SelectStickerGroup(stickerGroup=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/sticker/contract/StickerIntent$UpdateContentBounds;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent;", "Landroidx/compose/ui/geometry/Rect;", "bounds", "<init>", "(Landroidx/compose/ui/geometry/Rect;)V", "component1", "()Landroidx/compose/ui/geometry/Rect;", "copy", "(Landroidx/compose/ui/geometry/Rect;)Lcom/kakao/kandinsky/sticker/contract/StickerIntent$UpdateContentBounds;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/geometry/Rect;", "getBounds", "sticker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateContentBounds implements StickerIntent {
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

        public static UpdateContentBounds copy$default(UpdateContentBounds stickerIntent$UpdateContentBounds0, Rect rect0, int v, Object object0) {
            if((v & 1) != 0) {
                rect0 = stickerIntent$UpdateContentBounds0.a;
            }
            return stickerIntent$UpdateContentBounds0.copy(rect0);
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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/sticker/contract/StickerIntent$UpdatePhoto;", "Lcom/kakao/kandinsky/sticker/contract/StickerIntent;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)Lcom/kakao/kandinsky/sticker/contract/StickerIntent$UpdatePhoto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getPhoto", "sticker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdatePhoto implements StickerIntent {
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

        public static UpdatePhoto copy$default(UpdatePhoto stickerIntent$UpdatePhoto0, KDPhoto kDPhoto0, int v, Object object0) {
            if((v & 1) != 0) {
                kDPhoto0 = stickerIntent$UpdatePhoto0.a;
            }
            return stickerIntent$UpdatePhoto0.copy(kDPhoto0);
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

