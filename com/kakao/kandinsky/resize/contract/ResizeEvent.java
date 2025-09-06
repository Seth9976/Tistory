package com.kakao.kandinsky.resize.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.kandinsky.base.contract.Destination;
import com.kakao.kandinsky.base.contract.DialogUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/kakao/kandinsky/resize/contract/ResizeEvent;", "", "BounceAnimation", "Go", "ShowDialog", "ShowToast", "Lcom/kakao/kandinsky/resize/contract/ResizeEvent$BounceAnimation;", "Lcom/kakao/kandinsky/resize/contract/ResizeEvent$Go;", "Lcom/kakao/kandinsky/resize/contract/ResizeEvent$ShowDialog;", "Lcom/kakao/kandinsky/resize/contract/ResizeEvent$ShowToast;", "resize_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class ResizeEvent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\bJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\bR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001A\u0004\b\u0019\u0010\b¨\u0006\u001A"}, d2 = {"Lcom/kakao/kandinsky/resize/contract/ResizeEvent$BounceAnimation;", "Lcom/kakao/kandinsky/resize/contract/ResizeEvent;", "", "from", "to", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/kakao/kandinsky/resize/contract/ResizeEvent$BounceAnimation;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getFrom", "b", "getTo", "resize_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class BounceAnimation extends ResizeEvent {
        public static final int $stable;
        public final int a;
        public final int b;

        public BounceAnimation(int v, int v1) {
            super(null);
            this.a = v;
            this.b = v1;
        }

        public final int component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        @NotNull
        public final BounceAnimation copy(int v, int v1) {
            return new BounceAnimation(v, v1);
        }

        public static BounceAnimation copy$default(BounceAnimation resizeEvent$BounceAnimation0, int v, int v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                v = resizeEvent$BounceAnimation0.a;
            }
            if((v2 & 2) != 0) {
                v1 = resizeEvent$BounceAnimation0.b;
            }
            return resizeEvent$BounceAnimation0.copy(v, v1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof BounceAnimation)) {
                return false;
            }
            return this.a == ((BounceAnimation)object0).a ? this.b == ((BounceAnimation)object0).b : false;
        }

        public final int getFrom() {
            return this.a;
        }

        public final int getTo() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.b + this.a * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("BounceAnimation(from=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", to=");
            return a.c(this.b, ")", stringBuilder0);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/resize/contract/ResizeEvent$Go;", "Lcom/kakao/kandinsky/resize/contract/ResizeEvent;", "Lcom/kakao/kandinsky/base/contract/Destination;", "destination", "<init>", "(Lcom/kakao/kandinsky/base/contract/Destination;)V", "component1", "()Lcom/kakao/kandinsky/base/contract/Destination;", "copy", "(Lcom/kakao/kandinsky/base/contract/Destination;)Lcom/kakao/kandinsky/resize/contract/ResizeEvent$Go;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/base/contract/Destination;", "getDestination", "resize_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Go extends ResizeEvent {
        public static final int $stable;
        public final Destination a;

        public Go(@NotNull Destination destination0) {
            Intrinsics.checkNotNullParameter(destination0, "destination");
            super(null);
            this.a = destination0;
        }

        @NotNull
        public final Destination component1() {
            return this.a;
        }

        @NotNull
        public final Go copy(@NotNull Destination destination0) {
            Intrinsics.checkNotNullParameter(destination0, "destination");
            return new Go(destination0);
        }

        public static Go copy$default(Go resizeEvent$Go0, Destination destination0, int v, Object object0) {
            if((v & 1) != 0) {
                destination0 = resizeEvent$Go0.a;
            }
            return resizeEvent$Go0.copy(destination0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Go ? this.a == ((Go)object0).a : false;
        }

        @NotNull
        public final Destination getDestination() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "Go(destination=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/resize/contract/ResizeEvent$ShowDialog;", "Lcom/kakao/kandinsky/resize/contract/ResizeEvent;", "Lcom/kakao/kandinsky/base/contract/DialogUiState;", "dialog", "<init>", "(Lcom/kakao/kandinsky/base/contract/DialogUiState;)V", "component1", "()Lcom/kakao/kandinsky/base/contract/DialogUiState;", "copy", "(Lcom/kakao/kandinsky/base/contract/DialogUiState;)Lcom/kakao/kandinsky/resize/contract/ResizeEvent$ShowDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/base/contract/DialogUiState;", "getDialog", "resize_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowDialog extends ResizeEvent {
        public static final int $stable;
        public final DialogUiState a;

        static {
            ShowDialog.$stable = DialogUiState.$stable;
        }

        public ShowDialog(@NotNull DialogUiState dialogUiState0) {
            Intrinsics.checkNotNullParameter(dialogUiState0, "dialog");
            super(null);
            this.a = dialogUiState0;
        }

        @NotNull
        public final DialogUiState component1() {
            return this.a;
        }

        @NotNull
        public final ShowDialog copy(@NotNull DialogUiState dialogUiState0) {
            Intrinsics.checkNotNullParameter(dialogUiState0, "dialog");
            return new ShowDialog(dialogUiState0);
        }

        public static ShowDialog copy$default(ShowDialog resizeEvent$ShowDialog0, DialogUiState dialogUiState0, int v, Object object0) {
            if((v & 1) != 0) {
                dialogUiState0 = resizeEvent$ShowDialog0.a;
            }
            return resizeEvent$ShowDialog0.copy(dialogUiState0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ShowDialog ? Intrinsics.areEqual(this.a, ((ShowDialog)object0).a) : false;
        }

        @NotNull
        public final DialogUiState getDialog() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowDialog(dialog=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/kandinsky/resize/contract/ResizeEvent$ShowToast;", "Lcom/kakao/kandinsky/resize/contract/ResizeEvent;", "", "stringRes", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/kakao/kandinsky/resize/contract/ResizeEvent$ShowToast;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getStringRes", "resize_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowToast extends ResizeEvent {
        public static final int $stable;
        public final int a;

        public ShowToast(int v) {
            super(null);
            this.a = v;
        }

        public final int component1() {
            return this.a;
        }

        @NotNull
        public final ShowToast copy(int v) {
            return new ShowToast(v);
        }

        public static ShowToast copy$default(ShowToast resizeEvent$ShowToast0, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = resizeEvent$ShowToast0.a;
            }
            return resizeEvent$ShowToast0.copy(v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ShowToast ? this.a == ((ShowToast)object0).a : false;
        }

        public final int getStringRes() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("ShowToast(stringRes=");
            return a.c(this.a, ")", stringBuilder0);
        }
    }

    public static final int $stable;

    public ResizeEvent(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

