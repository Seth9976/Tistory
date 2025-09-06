package com.kakao.tistory.presentation.screen.home.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.widget.dialog.AlertDialogData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/contract/DialogType;", "", "Alert", "Lcom/kakao/tistory/presentation/screen/home/contract/DialogType$Alert;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface DialogType {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0012\u0010\u0010\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0013J\u0018\u0010\u0016\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\\\u0010\u001A\u001A\u00020\u00002\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\r\u001A\u00020\fH\u00C6\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0003H\u00D6\u0001\u00A2\u0006\u0004\b\u001C\u0010\u0011J\u0010\u0010\u001D\u001A\u00020\u0005H\u00D6\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u001A\u0010!\u001A\u00020\f2\b\u0010 \u001A\u0004\u0018\u00010\u001FH\u00D6\u0003\u00A2\u0006\u0004\b!\u0010\"R\u001C\u0010\u0004\u001A\u0004\u0018\u00010\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0011R\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u0013R\u001C\u0010\u0007\u001A\u0004\u0018\u00010\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b)\u0010$\u001A\u0004\b*\u0010\u0011R\u001C\u0010\b\u001A\u0004\u0018\u00010\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b+\u0010\'\u001A\u0004\b,\u0010\u0013R\"\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\u0017R\u001A\u0010\r\u001A\u00020\f8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u0019\u00A8\u00063"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/contract/DialogType$Alert;", "Lcom/kakao/tistory/presentation/screen/home/contract/DialogType;", "Lcom/kakao/tistory/presentation/widget/dialog/AlertDialogData;", "", "title", "", "titleRes", "message", "messageRes", "Lkotlin/Function0;", "", "okCallback", "", "showCancel", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "()Lkotlin/jvm/functions/Function0;", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Z)Lcom/kakao/tistory/presentation/screen/home/contract/DialogType$Alert;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "Ljava/lang/Integer;", "getTitleRes", "c", "getMessage", "d", "getMessageRes", "e", "Lkotlin/jvm/functions/Function0;", "getOkCallback", "f", "Z", "getShowCancel", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Alert implements DialogType, AlertDialogData {
        public static final int $stable;
        public final String a;
        public final Integer b;
        public final String c;
        public final Integer d;
        public final Function0 e;
        public final boolean f;

        public Alert() {
            this(null, null, null, null, null, false, 0x3F, null);
        }

        public Alert(@Nullable String s, @Nullable Integer integer0, @Nullable String s1, @Nullable Integer integer1, @Nullable Function0 function00, boolean z) {
            this.a = s;
            this.b = integer0;
            this.c = s1;
            this.d = integer1;
            this.e = function00;
            this.f = z;
        }

        public Alert(String s, Integer integer0, String s1, Integer integer1, Function0 function00, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 16) != 0) {
                function00 = a.a;
            }
            if((v & 0x20) != 0) {
                z = false;
            }
            this(((v & 1) == 0 ? s : null), ((v & 2) == 0 ? integer0 : null), ((v & 4) == 0 ? s1 : null), ((v & 8) == 0 ? integer1 : null), function00, z);
        }

        @Nullable
        public final String component1() {
            return this.a;
        }

        @Nullable
        public final Integer component2() {
            return this.b;
        }

        @Nullable
        public final String component3() {
            return this.c;
        }

        @Nullable
        public final Integer component4() {
            return this.d;
        }

        @Nullable
        public final Function0 component5() {
            return this.e;
        }

        public final boolean component6() {
            return this.f;
        }

        @NotNull
        public final Alert copy(@Nullable String s, @Nullable Integer integer0, @Nullable String s1, @Nullable Integer integer1, @Nullable Function0 function00, boolean z) {
            return new Alert(s, integer0, s1, integer1, function00, z);
        }

        public static Alert copy$default(Alert dialogType$Alert0, String s, Integer integer0, String s1, Integer integer1, Function0 function00, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                s = dialogType$Alert0.a;
            }
            if((v & 2) != 0) {
                integer0 = dialogType$Alert0.b;
            }
            if((v & 4) != 0) {
                s1 = dialogType$Alert0.c;
            }
            if((v & 8) != 0) {
                integer1 = dialogType$Alert0.d;
            }
            if((v & 16) != 0) {
                function00 = dialogType$Alert0.e;
            }
            if((v & 0x20) != 0) {
                z = dialogType$Alert0.f;
            }
            return dialogType$Alert0.copy(s, integer0, s1, integer1, function00, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Alert)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Alert)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((Alert)object0).b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Alert)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((Alert)object0).d)) {
                return false;
            }
            return Intrinsics.areEqual(this.e, ((Alert)object0).e) ? this.f == ((Alert)object0).f : false;
        }

        @Override  // com.kakao.tistory.presentation.widget.dialog.AlertDialogData
        @Nullable
        public String getMessage() {
            return this.c;
        }

        @Override  // com.kakao.tistory.presentation.widget.dialog.AlertDialogData
        @Nullable
        public Integer getMessageRes() {
            return this.d;
        }

        @Override  // com.kakao.tistory.presentation.widget.dialog.AlertDialogData
        @Nullable
        public Function0 getOkCallback() {
            return this.e;
        }

        @Override  // com.kakao.tistory.presentation.widget.dialog.AlertDialogData
        public boolean getShowCancel() {
            return this.f;
        }

        @Override  // com.kakao.tistory.presentation.widget.dialog.AlertDialogData
        @Nullable
        public String getTitle() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.widget.dialog.AlertDialogData
        @Nullable
        public Integer getTitleRes() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            int v2 = this.b == null ? 0 : this.b.hashCode();
            int v3 = this.c == null ? 0 : this.c.hashCode();
            int v4 = this.d == null ? 0 : this.d.hashCode();
            Function0 function00 = this.e;
            if(function00 != null) {
                v = function00.hashCode();
            }
            return Boolean.hashCode(this.f) + ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "Alert(title=" + this.a + ", titleRes=" + this.b + ", message=" + this.c + ", messageRes=" + this.d + ", okCallback=" + this.e + ", showCancel=" + this.f + ")";
        }
    }

}

