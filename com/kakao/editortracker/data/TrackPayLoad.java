package com.kakao.editortracker.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0014\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001A\u00020\tHÆ\u0003J3\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001A\u00020\u00192\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001B\u001A\u00020\u001CHÖ\u0001J\t\u0010\u001D\u001A\u00020\u001EHÖ\u0001R\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\b\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u001F"}, d2 = {"Lcom/kakao/editortracker/data/TrackPayLoad;", "", "service", "Lcom/kakao/editortracker/data/Service;", "editor", "Lcom/kakao/editortracker/data/EditorInfo;", "action", "Lcom/kakao/editortracker/data/Action;", "ua", "Lcom/kakao/editortracker/data/UserAgent;", "(Lcom/kakao/editortracker/data/Service;Lcom/kakao/editortracker/data/EditorInfo;Lcom/kakao/editortracker/data/Action;Lcom/kakao/editortracker/data/UserAgent;)V", "getAction", "()Lcom/kakao/editortracker/data/Action;", "getEditor", "()Lcom/kakao/editortracker/data/EditorInfo;", "getService", "()Lcom/kakao/editortracker/data/Service;", "getUa", "()Lcom/kakao/editortracker/data/UserAgent;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "editortracker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TrackPayLoad {
    @NotNull
    private final Action action;
    @Nullable
    private final EditorInfo editor;
    @NotNull
    private final Service service;
    @NotNull
    private final UserAgent ua;

    public TrackPayLoad(@NotNull Service service0, @Nullable EditorInfo editorInfo0, @NotNull Action action0, @NotNull UserAgent userAgent0) {
        Intrinsics.checkNotNullParameter(service0, "service");
        Intrinsics.checkNotNullParameter(action0, "action");
        Intrinsics.checkNotNullParameter(userAgent0, "ua");
        super();
        this.service = service0;
        this.editor = editorInfo0;
        this.action = action0;
        this.ua = userAgent0;
    }

    @NotNull
    public final Service component1() {
        return this.service;
    }

    @Nullable
    public final EditorInfo component2() {
        return this.editor;
    }

    @NotNull
    public final Action component3() {
        return this.action;
    }

    @NotNull
    public final UserAgent component4() {
        return this.ua;
    }

    @NotNull
    public final TrackPayLoad copy(@NotNull Service service0, @Nullable EditorInfo editorInfo0, @NotNull Action action0, @NotNull UserAgent userAgent0) {
        Intrinsics.checkNotNullParameter(service0, "service");
        Intrinsics.checkNotNullParameter(action0, "action");
        Intrinsics.checkNotNullParameter(userAgent0, "ua");
        return new TrackPayLoad(service0, editorInfo0, action0, userAgent0);
    }

    public static TrackPayLoad copy$default(TrackPayLoad trackPayLoad0, Service service0, EditorInfo editorInfo0, Action action0, UserAgent userAgent0, int v, Object object0) {
        if((v & 1) != 0) {
            service0 = trackPayLoad0.service;
        }
        if((v & 2) != 0) {
            editorInfo0 = trackPayLoad0.editor;
        }
        if((v & 4) != 0) {
            action0 = trackPayLoad0.action;
        }
        if((v & 8) != 0) {
            userAgent0 = trackPayLoad0.ua;
        }
        return trackPayLoad0.copy(service0, editorInfo0, action0, userAgent0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TrackPayLoad)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.service, ((TrackPayLoad)object0).service)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.editor, ((TrackPayLoad)object0).editor)) {
            return false;
        }
        return Intrinsics.areEqual(this.action, ((TrackPayLoad)object0).action) ? Intrinsics.areEqual(this.ua, ((TrackPayLoad)object0).ua) : false;
    }

    @NotNull
    public final Action getAction() {
        return this.action;
    }

    @Nullable
    public final EditorInfo getEditor() {
        return this.editor;
    }

    @NotNull
    public final Service getService() {
        return this.service;
    }

    @NotNull
    public final UserAgent getUa() {
        return this.ua;
    }

    @Override
    public int hashCode() {
        int v = this.service.hashCode();
        return this.editor == null ? this.ua.hashCode() + (this.action.hashCode() + v * 961) * 0x1F : this.ua.hashCode() + (this.action.hashCode() + (v * 0x1F + this.editor.hashCode()) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "TrackPayLoad(service=" + this.service + ", editor=" + this.editor + ", action=" + this.action + ", ua=" + this.ua + ")";
    }
}

