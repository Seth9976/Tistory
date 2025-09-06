package com.kakao.keditor;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004J\u0016\u0010\u000E\u001A\u00020\u00052\u0006\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00020\u0005J\b\u0010\u0011\u001A\u00020\u0012H\u0016J\u0010\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u000F\u001A\u00020\u0005H\u0004J\u001A\u0010\u0015\u001A\u00020\u00142\u0012\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004J\u001A\u0010\u0017\u001A\u00020\u00142\u0012\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004R&\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004X\u0094\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001A\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\f¨\u0006\u001A"}, d2 = {"Lcom/kakao/keditor/KeditorItem;", "", "()V", "bypassStored", "", "", "getBypassStored", "()Ljava/util/Map;", "setBypassStored", "(Ljava/util/Map;)V", "type", "getType", "()Ljava/lang/String;", "getBypassMap", "getValueOrBypass", "key", "valueFromView", "isEmpty", "", "removeBypass", "", "setBypassMap", "map", "storeUnknownProperty", "leftValuesMap", "Companion", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class KeditorItem {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001A\u00020\u0004\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0006H\u0086\b¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/KeditorItem$Companion;", "", "()V", "type", "", "T", "Lcom/kakao/keditor/KeditorItem;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final String type() {
            Intrinsics.reifiedOperationMarker(4, "T");
            return KeditorItemKt.type(KeditorItem.class);
        }
    }

    @NotNull
    public static final Companion Companion;
    @NotNull
    private Map bypassStored;
    @NotNull
    private final String type;

    static {
        KeditorItem.Companion = new Companion(null);
    }

    public KeditorItem() {
        this.type = KeditorItemKt.type(this.getClass());
        this.bypassStored = new LinkedHashMap();
    }

    @NotNull
    public final Map getBypassMap() {
        return this.getBypassStored();
    }

    @NotNull
    public Map getBypassStored() {
        return this.bypassStored;
    }

    @NotNull
    public String getType() {
        return this.type;
    }

    @NotNull
    public final String getValueOrBypass(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(s1, "valueFromView");
        Object object0 = this.getBypassStored().get(s);
        if(object0 != null) {
            String s2 = object0.toString();
            return s2 == null ? s1 : s2;
        }
        return s1;
    }

    public boolean isEmpty() {
        return false;
    }

    public final void removeBypass(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        this.getBypassStored().remove(s);
    }

    public final void setBypassMap(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "map");
        this.setBypassStored(map0);
    }

    public void setBypassStored(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<set-?>");
        this.bypassStored = map0;
    }

    public final void storeUnknownProperty(@NotNull Map map0) {
        Intrinsics.checkNotNullParameter(map0, "leftValuesMap");
        this.getBypassStored().putAll(map0);
    }
}

