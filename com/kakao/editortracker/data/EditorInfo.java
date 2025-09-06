package com.kakao.editortracker.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\'\u0010\u0011\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\"\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001C\u0010\u0002\u001A\u0004\u0018\u00010\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000E¨\u0006\u0018"}, d2 = {"Lcom/kakao/editortracker/data/EditorInfo;", "", "version", "", "plugins", "", "(Ljava/lang/String;Ljava/util/List;)V", "getPlugins", "()Ljava/util/List;", "setPlugins", "(Ljava/util/List;)V", "getVersion", "()Ljava/lang/String;", "setVersion", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "editortracker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EditorInfo {
    @Nullable
    private List plugins;
    @Nullable
    private String version;

    public EditorInfo() {
        this(null, null, 3, null);
    }

    public EditorInfo(@Nullable String s, @Nullable List list0) {
        this.version = s;
        this.plugins = list0;
    }

    public EditorInfo(String s, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            list0 = null;
        }
        this(s, list0);
    }

    @Nullable
    public final String component1() {
        return this.version;
    }

    @Nullable
    public final List component2() {
        return this.plugins;
    }

    @NotNull
    public final EditorInfo copy(@Nullable String s, @Nullable List list0) {
        return new EditorInfo(s, list0);
    }

    public static EditorInfo copy$default(EditorInfo editorInfo0, String s, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            s = editorInfo0.version;
        }
        if((v & 2) != 0) {
            list0 = editorInfo0.plugins;
        }
        return editorInfo0.copy(s, list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof EditorInfo)) {
            return false;
        }
        return Intrinsics.areEqual(this.version, ((EditorInfo)object0).version) ? Intrinsics.areEqual(this.plugins, ((EditorInfo)object0).plugins) : false;
    }

    @Nullable
    public final List getPlugins() {
        return this.plugins;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.version == null ? 0 : this.version.hashCode();
        List list0 = this.plugins;
        if(list0 != null) {
            v = list0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    public final void setPlugins(@Nullable List list0) {
        this.plugins = list0;
    }

    public final void setVersion(@Nullable String s) {
        this.version = s;
    }

    @Override
    @NotNull
    public String toString() {
        return "EditorInfo(version=" + this.version + ", plugins=" + this.plugins + ")";
    }
}

