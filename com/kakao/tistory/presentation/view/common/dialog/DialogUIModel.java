package com.kakao.tistory.presentation.view.common.dialog;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.main.contract.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000E\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0001\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\n0\t\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0012\u0010\u0011\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0018Jh\u0010\u001A\u001A\u00020\u00002\b\b\u0003\u0010\u0003\u001A\u00020\u00022\n\b\u0003\u0010\u0004\u001A\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001A\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001D\u001A\u00020\u001CH\u00D6\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u001F\u0010\u0010J\u001A\u0010!\u001A\u00020\u00072\b\u0010 \u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0010R\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u0012R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b)\u0010\'\u001A\u0004\b*\u0010\u0012R\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b+\u0010\'\u001A\u0004\b,\u0010\u0012R\u0017\u0010\b\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\u0016R\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u0018R\u001D\u0010\f\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0006\u00A2\u0006\f\n\u0004\b3\u00101\u001A\u0004\b4\u0010\u0018\u00A8\u00065"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/dialog/DialogUIModel;", "", "", "title", "message", "leftButtonTitle", "rightButtonTitle", "", "rightButtonColorEnabled", "Lkotlin/Function0;", "", "onClickLeft", "onClickRight", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "()Z", "component6", "()Lkotlin/jvm/functions/Function0;", "component7", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/view/common/dialog/DialogUIModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getTitle", "b", "Ljava/lang/Integer;", "getMessage", "c", "getLeftButtonTitle", "d", "getRightButtonTitle", "e", "Z", "getRightButtonColorEnabled", "f", "Lkotlin/jvm/functions/Function0;", "getOnClickLeft", "g", "getOnClickRight", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DialogUIModel {
    public static final int $stable;
    public final int a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final boolean e;
    public final Function0 f;
    public final Function0 g;

    public DialogUIModel(@StringRes int v, @StringRes @Nullable Integer integer0, @StringRes @Nullable Integer integer1, @StringRes @Nullable Integer integer2, boolean z, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(function00, "onClickLeft");
        Intrinsics.checkNotNullParameter(function01, "onClickRight");
        super();
        this.a = v;
        this.b = integer0;
        this.c = integer1;
        this.d = integer2;
        this.e = z;
        this.f = function00;
        this.g = function01;
    }

    public DialogUIModel(int v, Integer integer0, Integer integer1, Integer integer2, boolean z, Function0 function00, Function0 function01, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        Function0 function02 = (v1 & 0x20) == 0 ? function00 : a.a;
        Function0 function03 = (v1 & 0x40) == 0 ? function01 : b.a;
        this(v, ((v1 & 2) == 0 ? integer0 : null), ((v1 & 4) == 0 ? integer1 : null), ((v1 & 8) == 0 ? integer2 : null), ((v1 & 16) == 0 ? z : false), function02, function03);
    }

    public final int component1() {
        return this.a;
    }

    @Nullable
    public final Integer component2() {
        return this.b;
    }

    @Nullable
    public final Integer component3() {
        return this.c;
    }

    @Nullable
    public final Integer component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    @NotNull
    public final Function0 component6() {
        return this.f;
    }

    @NotNull
    public final Function0 component7() {
        return this.g;
    }

    @NotNull
    public final DialogUIModel copy(@StringRes int v, @StringRes @Nullable Integer integer0, @StringRes @Nullable Integer integer1, @StringRes @Nullable Integer integer2, boolean z, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(function00, "onClickLeft");
        Intrinsics.checkNotNullParameter(function01, "onClickRight");
        return new DialogUIModel(v, integer0, integer1, integer2, z, function00, function01);
    }

    public static DialogUIModel copy$default(DialogUIModel dialogUIModel0, int v, Integer integer0, Integer integer1, Integer integer2, boolean z, Function0 function00, Function0 function01, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = dialogUIModel0.a;
        }
        if((v1 & 2) != 0) {
            integer0 = dialogUIModel0.b;
        }
        if((v1 & 4) != 0) {
            integer1 = dialogUIModel0.c;
        }
        if((v1 & 8) != 0) {
            integer2 = dialogUIModel0.d;
        }
        if((v1 & 16) != 0) {
            z = dialogUIModel0.e;
        }
        if((v1 & 0x20) != 0) {
            function00 = dialogUIModel0.f;
        }
        if((v1 & 0x40) != 0) {
            function01 = dialogUIModel0.g;
        }
        return dialogUIModel0.copy(v, integer0, integer1, integer2, z, function00, function01);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DialogUIModel)) {
            return false;
        }
        if(this.a != ((DialogUIModel)object0).a) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((DialogUIModel)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((DialogUIModel)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((DialogUIModel)object0).d)) {
            return false;
        }
        if(this.e != ((DialogUIModel)object0).e) {
            return false;
        }
        return Intrinsics.areEqual(this.f, ((DialogUIModel)object0).f) ? Intrinsics.areEqual(this.g, ((DialogUIModel)object0).g) : false;
    }

    @Nullable
    public final Integer getLeftButtonTitle() {
        return this.c;
    }

    @Nullable
    public final Integer getMessage() {
        return this.b;
    }

    @NotNull
    public final Function0 getOnClickLeft() {
        return this.f;
    }

    @NotNull
    public final Function0 getOnClickRight() {
        return this.g;
    }

    public final boolean getRightButtonColorEnabled() {
        return this.e;
    }

    @Nullable
    public final Integer getRightButtonTitle() {
        return this.d;
    }

    public final int getTitle() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = this.a;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        Integer integer0 = this.d;
        if(integer0 != null) {
            v1 = integer0.hashCode();
        }
        return this.g.hashCode() + com.kakao.tistory.presentation.main.contract.a.a(this.f, c.a(this.e, (((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F, 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DialogUIModel(title=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", message=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", leftButtonTitle=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", rightButtonTitle=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", rightButtonColorEnabled=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", onClickLeft=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", onClickRight=");
        return q.q(stringBuilder0, this.g, ")");
    }
}

