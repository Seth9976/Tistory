package com.kakao.tistory.presentation.view.setting;

import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\"\u0010\t\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\u000F\u001A\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000ER\u0019\u0010\u0015\u001A\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001B\u001A\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001Aj\u0002\b\u001Cj\u0002\b\u001Dj\u0002\b\u001Ej\u0002\b\u001Fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/SettingPushItem;", "", "", "a", "I", "getTitleString", "()I", "setTitleString", "(I)V", "titleString", "", "b", "Z", "getHasDivider", "()Z", "hasDivider", "Lcom/kakao/tistory/presentation/common/tiara/TistoryTiaraActionType;", "c", "Lcom/kakao/tistory/presentation/common/tiara/TistoryTiaraActionType;", "getTiaraActionType", "()Lcom/kakao/tistory/presentation/common/tiara/TistoryTiaraActionType;", "tiaraActionType", "", "d", "Ljava/lang/String;", "getTiaraClickLayer", "()Ljava/lang/String;", "tiaraClickLayer", "PUSH_NOTIFICATION", "COMMENT_AND_REPLY", "INVITE_AND_ACCEPT", "SUBSCRIBE", "NEW_ENTRY", "CHALLENGE", "DO_NOT_DISTURB", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum SettingPushItem {
    PUSH_NOTIFICATION(string.label_setting_push_notification, false, TistoryTiaraActionType.CLICK_SETTING_NOTIFICATION_ALL, "푸시 알림"),
    COMMENT_AND_REPLY(string.label_setting_push_comment_and_reply, true, TistoryTiaraActionType.CLICK_SETTING_NOTIFICATION_COMMENT, "댓글/답글 알림"),
    INVITE_AND_ACCEPT(string.label_setting_push_invite_and_accept, false, TistoryTiaraActionType.CLICK_SETTING_NOTIFICATION_BLOG_INVITATION, "팀블로그 초대/수락 알림"),
    SUBSCRIBE(string.label_setting_push_subscribe, false, TistoryTiaraActionType.CLICK_SETTING_NOTIFICATION_FOLLOW, "구독 알림"),
    NEW_ENTRY(string.label_setting_push_new_entry, false, TistoryTiaraActionType.CLICK_SETTING_NOTIFICATION_NEW_ENTRY, "새 글 알림"),
    CHALLENGE(string.label_setting_push_challenge, true, TistoryTiaraActionType.CLICK_SETTING_NOTIFICATION_CHALLENGE, "챌린지 알림"),
    DO_NOT_DISTURB(string.label_setting_push_do_not_disturb, true, TistoryTiaraActionType.CLICK_SETTING_NOTIFICATION_ETIQUETTE, "방해금지 모드");

    public int a;
    public final boolean b;
    public final TistoryTiaraActionType c;
    public final String d;
    public static final SettingPushItem[] e;
    public static final EnumEntries f;

    static {
        SettingPushItem.e = arr_settingPushItem;
        Intrinsics.checkNotNullParameter(arr_settingPushItem, "entries");
        SettingPushItem.f = new a(arr_settingPushItem);
    }

    public SettingPushItem(int v1, boolean z, TistoryTiaraActionType tistoryTiaraActionType0, String s1) {
        this.a = v1;
        this.b = z;
        this.c = tistoryTiaraActionType0;
        this.d = s1;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return SettingPushItem.f;
    }

    public final boolean getHasDivider() {
        return this.b;
    }

    @Nullable
    public final TistoryTiaraActionType getTiaraActionType() {
        return this.c;
    }

    @NotNull
    public final String getTiaraClickLayer() {
        return this.d;
    }

    public final int getTitleString() {
        return this.a;
    }

    public final void setTitleString(int v) {
        this.a = v;
    }
}

