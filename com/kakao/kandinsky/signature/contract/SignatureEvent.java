package com.kakao.kandinsky.signature.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.kandinsky.base.contract.Destination;
import com.kakao.kandinsky.base.contract.DialogUiState;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000B\f\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureEvent;", "", "Go", "ShowDialog", "ShowHistory", "ShowImageSelector", "UpdateConfirm", "UpdateMultipleConfirm", "Lcom/kakao/kandinsky/signature/contract/SignatureEvent$Go;", "Lcom/kakao/kandinsky/signature/contract/SignatureEvent$ShowDialog;", "Lcom/kakao/kandinsky/signature/contract/SignatureEvent$ShowHistory;", "Lcom/kakao/kandinsky/signature/contract/SignatureEvent$ShowImageSelector;", "Lcom/kakao/kandinsky/signature/contract/SignatureEvent$UpdateConfirm;", "Lcom/kakao/kandinsky/signature/contract/SignatureEvent$UpdateMultipleConfirm;", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class SignatureEvent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureEvent$Go;", "Lcom/kakao/kandinsky/signature/contract/SignatureEvent;", "Lcom/kakao/kandinsky/base/contract/Destination;", "destination", "<init>", "(Lcom/kakao/kandinsky/base/contract/Destination;)V", "component1", "()Lcom/kakao/kandinsky/base/contract/Destination;", "copy", "(Lcom/kakao/kandinsky/base/contract/Destination;)Lcom/kakao/kandinsky/signature/contract/SignatureEvent$Go;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/base/contract/Destination;", "getDestination", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Go extends SignatureEvent {
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

        public static Go copy$default(Go signatureEvent$Go0, Destination destination0, int v, Object object0) {
            if((v & 1) != 0) {
                destination0 = signatureEvent$Go0.a;
            }
            return signatureEvent$Go0.copy(destination0);
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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureEvent$ShowDialog;", "Lcom/kakao/kandinsky/signature/contract/SignatureEvent;", "Lcom/kakao/kandinsky/base/contract/DialogUiState;", "dialog", "<init>", "(Lcom/kakao/kandinsky/base/contract/DialogUiState;)V", "component1", "()Lcom/kakao/kandinsky/base/contract/DialogUiState;", "copy", "(Lcom/kakao/kandinsky/base/contract/DialogUiState;)Lcom/kakao/kandinsky/signature/contract/SignatureEvent$ShowDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/base/contract/DialogUiState;", "getDialog", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowDialog extends SignatureEvent {
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

        public static ShowDialog copy$default(ShowDialog signatureEvent$ShowDialog0, DialogUiState dialogUiState0, int v, Object object0) {
            if((v & 1) != 0) {
                dialogUiState0 = signatureEvent$ShowDialog0.a;
            }
            return signatureEvent$ShowDialog0.copy(dialogUiState0);
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

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001A\u00020\u00002\u0014\b\u0002\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\t¨\u0006\u001A"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureEvent$ShowHistory;", "Lcom/kakao/kandinsky/signature/contract/SignatureEvent;", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kakao/kandinsky/core/kdphoto/Signature;", "histories", "<init>", "(Lkotlinx/coroutines/flow/Flow;)V", "component1", "()Lkotlinx/coroutines/flow/Flow;", "copy", "(Lkotlinx/coroutines/flow/Flow;)Lcom/kakao/kandinsky/signature/contract/SignatureEvent$ShowHistory;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlinx/coroutines/flow/Flow;", "getHistories", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowHistory extends SignatureEvent {
        public static final int $stable = 8;
        public final Flow a;

        public ShowHistory(@NotNull Flow flow0) {
            Intrinsics.checkNotNullParameter(flow0, "histories");
            super(null);
            this.a = flow0;
        }

        @NotNull
        public final Flow component1() {
            return this.a;
        }

        @NotNull
        public final ShowHistory copy(@NotNull Flow flow0) {
            Intrinsics.checkNotNullParameter(flow0, "histories");
            return new ShowHistory(flow0);
        }

        public static ShowHistory copy$default(ShowHistory signatureEvent$ShowHistory0, Flow flow0, int v, Object object0) {
            if((v & 1) != 0) {
                flow0 = signatureEvent$ShowHistory0.a;
            }
            return signatureEvent$ShowHistory0.copy(flow0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ShowHistory ? Intrinsics.areEqual(this.a, ((ShowHistory)object0).a) : false;
        }

        @NotNull
        public final Flow getHistories() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowHistory(histories=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureEvent$ShowImageSelector;", "Lcom/kakao/kandinsky/signature/contract/SignatureEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowImageSelector extends SignatureEvent {
        public static final int $stable;
        @NotNull
        public static final ShowImageSelector INSTANCE;

        static {
            ShowImageSelector.INSTANCE = new ShowImageSelector(null);  // 初始化器: Lcom/kakao/kandinsky/signature/contract/SignatureEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof ShowImageSelector;
        }

        @Override
        public int hashCode() {
            return 0xFDA492E1;
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowImageSelector";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureEvent$UpdateConfirm;", "Lcom/kakao/kandinsky/signature/contract/SignatureEvent;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)Lcom/kakao/kandinsky/signature/contract/SignatureEvent$UpdateConfirm;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getPhoto", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateConfirm extends SignatureEvent {
        public static final int $stable;
        public final KDPhoto a;

        public UpdateConfirm(@NotNull KDPhoto kDPhoto0) {
            Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
            super(null);
            this.a = kDPhoto0;
        }

        @NotNull
        public final KDPhoto component1() {
            return this.a;
        }

        @NotNull
        public final UpdateConfirm copy(@NotNull KDPhoto kDPhoto0) {
            Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
            return new UpdateConfirm(kDPhoto0);
        }

        public static UpdateConfirm copy$default(UpdateConfirm signatureEvent$UpdateConfirm0, KDPhoto kDPhoto0, int v, Object object0) {
            if((v & 1) != 0) {
                kDPhoto0 = signatureEvent$UpdateConfirm0.a;
            }
            return signatureEvent$UpdateConfirm0.copy(kDPhoto0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateConfirm ? Intrinsics.areEqual(this.a, ((UpdateConfirm)object0).a) : false;
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
            return "UpdateConfirm(photo=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/signature/contract/SignatureEvent$UpdateMultipleConfirm;", "Lcom/kakao/kandinsky/signature/contract/SignatureEvent;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)V", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;)Lcom/kakao/kandinsky/signature/contract/SignatureEvent$UpdateMultipleConfirm;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getPhoto", "signature_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateMultipleConfirm extends SignatureEvent {
        public static final int $stable;
        public final KDPhoto a;

        public UpdateMultipleConfirm(@NotNull KDPhoto kDPhoto0) {
            Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
            super(null);
            this.a = kDPhoto0;
        }

        @NotNull
        public final KDPhoto component1() {
            return this.a;
        }

        @NotNull
        public final UpdateMultipleConfirm copy(@NotNull KDPhoto kDPhoto0) {
            Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
            return new UpdateMultipleConfirm(kDPhoto0);
        }

        public static UpdateMultipleConfirm copy$default(UpdateMultipleConfirm signatureEvent$UpdateMultipleConfirm0, KDPhoto kDPhoto0, int v, Object object0) {
            if((v & 1) != 0) {
                kDPhoto0 = signatureEvent$UpdateMultipleConfirm0.a;
            }
            return signatureEvent$UpdateMultipleConfirm0.copy(kDPhoto0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateMultipleConfirm ? Intrinsics.areEqual(this.a, ((UpdateMultipleConfirm)object0).a) : false;
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
            return "UpdateMultipleConfirm(photo=" + this.a + ")";
        }
    }

    public static final int $stable;

    public SignatureEvent(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

