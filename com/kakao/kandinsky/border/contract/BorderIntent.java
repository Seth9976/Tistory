package com.kakao.kandinsky.border.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.core.kdphoto.Border;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/kandinsky/border/contract/BorderIntent;", "", "Cancel", "Init", "SelectBorder", "UpdateContentBounds", "UpdatePhoto", "Lcom/kakao/kandinsky/border/contract/BorderIntent$Cancel;", "Lcom/kakao/kandinsky/border/contract/BorderIntent$Init;", "Lcom/kakao/kandinsky/border/contract/BorderIntent$SelectBorder;", "Lcom/kakao/kandinsky/border/contract/BorderIntent$UpdateContentBounds;", "Lcom/kakao/kandinsky/border/contract/BorderIntent$UpdatePhoto;", "border_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface BorderIntent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/border/contract/BorderIntent$Cancel;", "Lcom/kakao/kandinsky/border/contract/BorderIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "border_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Cancel implements BorderIntent {
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
            return 0x44F263F0;
        }

        @Override
        @NotNull
        public String toString() {
            return "Cancel";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0012\u001A\u00020\u00022\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0003\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/kandinsky/border/contract/BorderIntent$Init;", "Lcom/kakao/kandinsky/border/contract/BorderIntent;", "", "isSingleImage", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/kakao/kandinsky/border/contract/BorderIntent$Init;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "border_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Init implements BorderIntent {
        public static final int $stable;
        public final boolean a;

        public Init(boolean z) {
            this.a = z;
        }

        public final boolean component1() {
            return this.a;
        }

        @NotNull
        public final Init copy(boolean z) {
            return new Init(z);
        }

        public static Init copy$default(Init borderIntent$Init0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = borderIntent$Init0.a;
            }
            return borderIntent$Init0.copy(z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Init ? this.a == ((Init)object0).a : false;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final boolean isSingleImage() {
            return this.a;
        }

        @Override
        @NotNull
        public String toString() {
            return "Init(isSingleImage=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/border/contract/BorderIntent$SelectBorder;", "Lcom/kakao/kandinsky/border/contract/BorderIntent;", "Lcom/kakao/kandinsky/core/kdphoto/Border;", "border", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/Border;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/Border;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/Border;)Lcom/kakao/kandinsky/border/contract/BorderIntent$SelectBorder;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/Border;", "getBorder", "border_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SelectBorder implements BorderIntent {
        public static final int $stable;
        public final Border a;

        public SelectBorder(@NotNull Border border0) {
            Intrinsics.checkNotNullParameter(border0, "border");
            super();
            this.a = border0;
        }

        @NotNull
        public final Border component1() {
            return this.a;
        }

        @NotNull
        public final SelectBorder copy(@NotNull Border border0) {
            Intrinsics.checkNotNullParameter(border0, "border");
            return new SelectBorder(border0);
        }

        public static SelectBorder copy$default(SelectBorder borderIntent$SelectBorder0, Border border0, int v, Object object0) {
            if((v & 1) != 0) {
                border0 = borderIntent$SelectBorder0.a;
            }
            return borderIntent$SelectBorder0.copy(border0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof SelectBorder ? Intrinsics.areEqual(this.a, ((SelectBorder)object0).a) : false;
        }

        @NotNull
        public final Border getBorder() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "SelectBorder(border=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/border/contract/BorderIntent$UpdateContentBounds;", "Lcom/kakao/kandinsky/border/contract/BorderIntent;", "Landroidx/compose/ui/geometry/Rect;", "bounds", "<init>", "(Landroidx/compose/ui/geometry/Rect;)V", "component1", "()Landroidx/compose/ui/geometry/Rect;", "copy", "(Landroidx/compose/ui/geometry/Rect;)Lcom/kakao/kandinsky/border/contract/BorderIntent$UpdateContentBounds;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/geometry/Rect;", "getBounds", "border_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateContentBounds implements BorderIntent {
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

        public static UpdateContentBounds copy$default(UpdateContentBounds borderIntent$UpdateContentBounds0, Rect rect0, int v, Object object0) {
            if((v & 1) != 0) {
                rect0 = borderIntent$UpdateContentBounds0.a;
            }
            return borderIntent$UpdateContentBounds0.copy(rect0);
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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/border/contract/BorderIntent$UpdatePhoto;", "Lcom/kakao/kandinsky/border/contract/BorderIntent;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)Lcom/kakao/kandinsky/border/contract/BorderIntent$UpdatePhoto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getPhoto", "border_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdatePhoto implements BorderIntent {
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

        public static UpdatePhoto copy$default(UpdatePhoto borderIntent$UpdatePhoto0, KDPhoto kDPhoto0, int v, Object object0) {
            if((v & 1) != 0) {
                kDPhoto0 = borderIntent$UpdatePhoto0.a;
            }
            return borderIntent$UpdatePhoto0.copy(kDPhoto0);
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

