package androidx.navigation;

import kotlin.Metadata;

@NavOptionsDsl
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000B\u001A\u00020\u00048\u0006@\u0006X\u0087\u000E¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000F\u001A\u00020\u00048\u0006@\u0006X\u0087\u000E¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001A\u0004\b\r\u0010\b\"\u0004\b\u000E\u0010\nR\"\u0010\u0013\u001A\u00020\u00048\u0006@\u0006X\u0087\u000E¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001A\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\"\u0010\u0017\u001A\u00020\u00048\u0006@\u0006X\u0087\u000E¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001A\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Landroidx/navigation/AnimBuilder;", "", "<init>", "()V", "", "a", "I", "getEnter", "()I", "setEnter", "(I)V", "enter", "b", "getExit", "setExit", "exit", "c", "getPopEnter", "setPopEnter", "popEnter", "d", "getPopExit", "setPopExit", "popExit", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AnimBuilder {
    public int a;
    public int b;
    public int c;
    public int d;

    public AnimBuilder() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }

    public final int getEnter() {
        return this.a;
    }

    public final int getExit() {
        return this.b;
    }

    public final int getPopEnter() {
        return this.c;
    }

    public final int getPopExit() {
        return this.d;
    }

    public final void setEnter(int v) {
        this.a = v;
    }

    public final void setExit(int v) {
        this.b = v;
    }

    public final void setPopEnter(int v) {
        this.c = v;
    }

    public final void setPopExit(int v) {
        this.d = v;
    }
}

