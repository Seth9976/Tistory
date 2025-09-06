package com.kakao.kandinsky.textedit.contract;

import androidx.compose.runtime.Immutable;
import db.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0081\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00028\u0000HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001C\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ6\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001A\u00028\u00002\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\nR#\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\f¨\u0006\u001F"}, d2 = {"Lcom/kakao/kandinsky/textedit/contract/InputState;", "T", "", "value", "Lkotlin/Function1;", "", "onChange", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lkotlin/jvm/functions/Function1;", "copy", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lcom/kakao/kandinsky/textedit/contract/InputState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getValue", "b", "Lkotlin/jvm/functions/Function1;", "getOnChange", "textedit_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class InputState {
    public static final int $stable;
    public final Object a;
    public final Function1 b;

    public InputState(Object object0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "onChange");
        super();
        this.a = object0;
        this.b = function10;
    }

    public InputState(Object object0, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            function10 = a.w;
        }
        this(object0, function10);
    }

    public final Object component1() {
        return this.a;
    }

    @NotNull
    public final Function1 component2() {
        return this.b;
    }

    @NotNull
    public final InputState copy(Object object0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "onChange");
        return new InputState(object0, function10);
    }

    public static InputState copy$default(InputState inputState0, Object object0, Function1 function10, int v, Object object1) {
        if((v & 1) != 0) {
            object0 = inputState0.a;
        }
        if((v & 2) != 0) {
            function10 = inputState0.b;
        }
        return inputState0.copy(object0, function10);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof InputState)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((InputState)object0).a) ? Intrinsics.areEqual(this.b, ((InputState)object0).b) : false;
    }

    @NotNull
    public final Function1 getOnChange() {
        return this.b;
    }

    public final Object getValue() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a == null ? this.b.hashCode() : this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "InputState(value=" + this.a + ", onChange=" + this.b + ")";
    }
}

