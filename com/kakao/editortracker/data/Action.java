package com.kakao.editortracker.data;

import a5.b;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u001F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\u0002\u0010\nJ\t\u0010\u001A\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010\u001B\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001C\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001D\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001E\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001F\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010 \u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J[\u0010!\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0003H\u00C6\u0001J\u0013\u0010\"\u001A\u00020#2\b\u0010$\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010%\u001A\u00020&H\u00D6\u0001J\t\u0010\'\u001A\u00020\u0003H\u00D6\u0001R\u001C\u0010\u0004\u001A\u0004\u0018\u00010\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\fR\u001C\u0010\u0005\u001A\u0004\u0018\u00010\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000ER\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000ER\u001C\u0010\u0007\u001A\u0004\u0018\u00010\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000ER\u001C\u0010\t\u001A\u0004\u0018\u00010\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000ER\u001C\u0010\b\u001A\u0004\u0018\u00010\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000E\u00A8\u0006("}, d2 = {"Lcom/kakao/editortracker/data/Action;", "", "event", "", "command", "layer1", "layer2", "layer3", "setnum", "ordnum", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCommand", "()Ljava/lang/String;", "setCommand", "(Ljava/lang/String;)V", "getEvent", "getLayer1", "setLayer1", "getLayer2", "setLayer2", "getLayer3", "setLayer3", "getOrdnum", "setOrdnum", "getSetnum", "setSetnum", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "editortracker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Action {
    @Nullable
    private String command;
    @NotNull
    private final String event;
    @Nullable
    private String layer1;
    @Nullable
    private String layer2;
    @Nullable
    private String layer3;
    @Nullable
    private String ordnum;
    @Nullable
    private String setnum;

    public Action(@NotNull String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6) {
        Intrinsics.checkNotNullParameter(s, "event");
        super();
        this.event = s;
        this.command = s1;
        this.layer1 = s2;
        this.layer2 = s3;
        this.layer3 = s4;
        this.setnum = s5;
        this.ordnum = s6;
    }

    public Action(String s, String s1, String s2, String s3, String s4, String s5, String s6, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, ((v & 2) == 0 ? s1 : null), ((v & 4) == 0 ? s2 : null), ((v & 8) == 0 ? s3 : null), ((v & 16) == 0 ? s4 : null), ((v & 0x20) == 0 ? s5 : null), ((v & 0x40) == 0 ? s6 : null));
    }

    @NotNull
    public final String component1() {
        return this.event;
    }

    @Nullable
    public final String component2() {
        return this.command;
    }

    @Nullable
    public final String component3() {
        return this.layer1;
    }

    @Nullable
    public final String component4() {
        return this.layer2;
    }

    @Nullable
    public final String component5() {
        return this.layer3;
    }

    @Nullable
    public final String component6() {
        return this.setnum;
    }

    @Nullable
    public final String component7() {
        return this.ordnum;
    }

    @NotNull
    public final Action copy(@NotNull String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6) {
        Intrinsics.checkNotNullParameter(s, "event");
        return new Action(s, s1, s2, s3, s4, s5, s6);
    }

    public static Action copy$default(Action action0, String s, String s1, String s2, String s3, String s4, String s5, String s6, int v, Object object0) {
        if((v & 1) != 0) {
            s = action0.event;
        }
        if((v & 2) != 0) {
            s1 = action0.command;
        }
        if((v & 4) != 0) {
            s2 = action0.layer1;
        }
        if((v & 8) != 0) {
            s3 = action0.layer2;
        }
        if((v & 16) != 0) {
            s4 = action0.layer3;
        }
        if((v & 0x20) != 0) {
            s5 = action0.setnum;
        }
        if((v & 0x40) != 0) {
            s6 = action0.ordnum;
        }
        return action0.copy(s, s1, s2, s3, s4, s5, s6);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Action)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.event, ((Action)object0).event)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.command, ((Action)object0).command)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.layer1, ((Action)object0).layer1)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.layer2, ((Action)object0).layer2)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.layer3, ((Action)object0).layer3)) {
            return false;
        }
        return Intrinsics.areEqual(this.setnum, ((Action)object0).setnum) ? Intrinsics.areEqual(this.ordnum, ((Action)object0).ordnum) : false;
    }

    @Nullable
    public final String getCommand() {
        return this.command;
    }

    @NotNull
    public final String getEvent() {
        return this.event;
    }

    @Nullable
    public final String getLayer1() {
        return this.layer1;
    }

    @Nullable
    public final String getLayer2() {
        return this.layer2;
    }

    @Nullable
    public final String getLayer3() {
        return this.layer3;
    }

    @Nullable
    public final String getOrdnum() {
        return this.ordnum;
    }

    @Nullable
    public final String getSetnum() {
        return this.setnum;
    }

    @Override
    public int hashCode() {
        int v = this.event.hashCode();
        int v1 = 0;
        int v2 = this.command == null ? 0 : this.command.hashCode();
        int v3 = this.layer1 == null ? 0 : this.layer1.hashCode();
        int v4 = this.layer2 == null ? 0 : this.layer2.hashCode();
        int v5 = this.layer3 == null ? 0 : this.layer3.hashCode();
        int v6 = this.setnum == null ? 0 : this.setnum.hashCode();
        String s = this.ordnum;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v1;
    }

    public final void setCommand(@Nullable String s) {
        this.command = s;
    }

    public final void setLayer1(@Nullable String s) {
        this.layer1 = s;
    }

    public final void setLayer2(@Nullable String s) {
        this.layer2 = s;
    }

    public final void setLayer3(@Nullable String s) {
        this.layer3 = s;
    }

    public final void setOrdnum(@Nullable String s) {
        this.ordnum = s;
    }

    public final void setSetnum(@Nullable String s) {
        this.setnum = s;
    }

    @Override
    @NotNull
    public String toString() {
        String s = this.layer1;
        String s1 = this.layer2;
        String s2 = this.layer3;
        String s3 = this.setnum;
        String s4 = this.ordnum;
        StringBuilder stringBuilder0 = b.w("Action(event=", this.event, ", command=", this.command, ", layer1=");
        a.w(stringBuilder0, s, ", layer2=", s1, ", layer3=");
        a.w(stringBuilder0, s2, ", setnum=", s3, ", ordnum=");
        return r0.a.o(stringBuilder0, s4, ")");
    }
}

