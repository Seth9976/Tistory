package com.kakao.kphotopicker.widget;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000BJ\u0016\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ4\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000BJ\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u000BR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001A\u001A\u0004\b\u001D\u0010\u000BR\u001D\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\u000E¨\u0006!"}, d2 = {"Lcom/kakao/kphotopicker/widget/CustomAction;", "", "", "actionIdRes", "actionNameRes", "Lkotlin/Function0;", "", "action", "<init>", "(IILkotlin/jvm/functions/Function0;)V", "component1", "()I", "component2", "component3", "()Lkotlin/jvm/functions/Function0;", "copy", "(IILkotlin/jvm/functions/Function0;)Lcom/kakao/kphotopicker/widget/CustomAction;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getActionIdRes", "b", "getActionNameRes", "c", "Lkotlin/jvm/functions/Function0;", "getAction", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CustomAction {
    public final int a;
    public final int b;
    public final Function0 c;

    public CustomAction(int v, int v1, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "action");
        super();
        this.a = v;
        this.b = v1;
        this.c = function00;
    }

    public final int component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    @NotNull
    public final Function0 component3() {
        return this.c;
    }

    @NotNull
    public final CustomAction copy(int v, int v1, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "action");
        return new CustomAction(v, v1, function00);
    }

    public static CustomAction copy$default(CustomAction customAction0, int v, int v1, Function0 function00, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = customAction0.a;
        }
        if((v2 & 2) != 0) {
            v1 = customAction0.b;
        }
        if((v2 & 4) != 0) {
            function00 = customAction0.c;
        }
        return customAction0.copy(v, v1, function00);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CustomAction)) {
            return false;
        }
        if(this.a != ((CustomAction)object0).a) {
            return false;
        }
        return this.b == ((CustomAction)object0).b ? Intrinsics.areEqual(this.c, ((CustomAction)object0).c) : false;
    }

    @NotNull
    public final Function0 getAction() {
        return this.c;
    }

    public final int getActionIdRes() {
        return this.a;
    }

    public final int getActionNameRes() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + a.c(this.b, this.a * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CustomAction(actionIdRes=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", actionNameRes=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", action=");
        return q.q(stringBuilder0, this.c, ")");
    }
}

