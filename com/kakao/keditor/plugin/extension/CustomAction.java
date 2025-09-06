package com.kakao.keditor.plugin.extension;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\u000F\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001R\u0017\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/kakao/keditor/plugin/extension/CustomAction;", "", "actionIdRes", "", "actionNameRes", "action", "Lkotlin/Function0;", "", "(IILkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "getActionIdRes", "()I", "getActionNameRes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CustomAction {
    @NotNull
    private final Function0 action;
    private final int actionIdRes;
    private final int actionNameRes;

    public CustomAction(int v, int v1, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "action");
        super();
        this.actionIdRes = v;
        this.actionNameRes = v1;
        this.action = function00;
    }

    public final int component1() {
        return this.actionIdRes;
    }

    public final int component2() {
        return this.actionNameRes;
    }

    @NotNull
    public final Function0 component3() {
        return this.action;
    }

    @NotNull
    public final CustomAction copy(int v, int v1, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "action");
        return new CustomAction(v, v1, function00);
    }

    public static CustomAction copy$default(CustomAction customAction0, int v, int v1, Function0 function00, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = customAction0.actionIdRes;
        }
        if((v2 & 2) != 0) {
            v1 = customAction0.actionNameRes;
        }
        if((v2 & 4) != 0) {
            function00 = customAction0.action;
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
        if(this.actionIdRes != ((CustomAction)object0).actionIdRes) {
            return false;
        }
        return this.actionNameRes == ((CustomAction)object0).actionNameRes ? Intrinsics.areEqual(this.action, ((CustomAction)object0).action) : false;
    }

    @NotNull
    public final Function0 getAction() {
        return this.action;
    }

    public final int getActionIdRes() {
        return this.actionIdRes;
    }

    public final int getActionNameRes() {
        return this.actionNameRes;
    }

    @Override
    public int hashCode() {
        return this.action.hashCode() + a.c(this.actionNameRes, this.actionIdRes * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        return q.q(q.u("CustomAction(actionIdRes=", this.actionIdRes, ", actionNameRes=", this.actionNameRes, ", action="), this.action, ")");
    }
}

