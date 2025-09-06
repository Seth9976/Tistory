package com.kakao.kphotopicker.picker.permission;

import com.kakao.kphotopicker.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ob.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR)\u0010\u0015\u001A\u0014\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u00100\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/kakao/kphotopicker/picker/permission/MediaPermissionAction;", "", "", "a", "I", "getTitleRes", "()I", "titleRes", "b", "Ljava/lang/Integer;", "getDescRes", "()Ljava/lang/Integer;", "descRes", "Lkotlin/Function2;", "Landroid/app/Activity;", "Lcom/kakao/kphotopicker/loader/GalleryType;", "", "c", "Lkotlin/jvm/functions/Function2;", "getOnClick", "()Lkotlin/jvm/functions/Function2;", "onClick", "Companion", "SELECT_MORE_MEDIA", "GO_TO_PERMISSION_SETTINGS", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum MediaPermissionAction {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/kphotopicker/picker/permission/MediaPermissionAction$Companion;", "", "", "ordinal", "Lcom/kakao/kphotopicker/picker/permission/MediaPermissionAction;", "from", "(I)Lcom/kakao/kphotopicker/picker/permission/MediaPermissionAction;", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final MediaPermissionAction from(int v) {
            return MediaPermissionAction.values()[v];
        }
    }

    SELECT_MORE_MEDIA(string.kphotopicker_item_media_permission_more, null, a.x),
    GO_TO_PERMISSION_SETTINGS(string.kphotopicker_item_media_permission_setting_title, string.kphotopicker_item_media_permission_setting_desc, a.y);

    @NotNull
    public static final Companion Companion;
    public final int a;
    public final Integer b;
    public final Lambda c;
    public static final MediaPermissionAction[] d;
    public static final EnumEntries e;

    static {
        MediaPermissionAction.d = arr_mediaPermissionAction;
        Intrinsics.checkNotNullParameter(arr_mediaPermissionAction, "entries");
        MediaPermissionAction.e = new sd.a(arr_mediaPermissionAction);
        MediaPermissionAction.Companion = new Companion(null);
    }

    public MediaPermissionAction(int v1, Integer integer0, Function2 function20) {
        this.a = v1;
        this.b = integer0;
        this.c = (Lambda)function20;
    }

    @Nullable
    public final Integer getDescRes() {
        return this.b;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return MediaPermissionAction.e;
    }

    @NotNull
    public final Function2 getOnClick() {
        return this.c;
    }

    public final int getTitleRes() {
        return this.a;
    }
}

