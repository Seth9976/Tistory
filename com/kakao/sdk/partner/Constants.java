package com.kakao.sdk.partner;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000B\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\u0004R\u0014\u0010\f\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000E\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000E\u0010\u0004R\u0014\u0010\u000F\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000F\u0010\u0004R\u0014\u0010\u0010\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/kakao/sdk/partner/Constants;", "", "", "V1_SIGNUP_PATH", "Ljava/lang/String;", "V1_FRIENDS_PATH", "V1_CHATS_PATH", "V1_CHAT_MEMBERS_PATH", "V2_MESSAGE_PATH", "V2_MESSAGE_DEFAULT_PATH", "V2_MESSAGE_SCRAP_PATH", "FROM_ID", "OFFSET", "LIMIT", "ORDER", "FILTER", "CHAT_ID", "FRIENDS_ONLY", "INCLUDE_PROFILE", "RECEIVER_ID_TYPE", "RECEIVER_IDS", "FRIEND_TYPE", "FRIEND_FILTER", "partner-common_release"}, k = 1, mv = {1, 4, 0})
public final class Constants {
    @NotNull
    public static final String CHAT_ID = "chat_id";
    @NotNull
    public static final String FILTER = "filter";
    @NotNull
    public static final String FRIENDS_ONLY = "friends_only";
    @NotNull
    public static final String FRIEND_FILTER = "friend_filter";
    @NotNull
    public static final String FRIEND_TYPE = "friend_type";
    @NotNull
    public static final String FROM_ID = "from_id";
    @NotNull
    public static final String INCLUDE_PROFILE = "include_profile";
    public static final Constants INSTANCE = null;
    @NotNull
    public static final String LIMIT = "limit";
    @NotNull
    public static final String OFFSET = "offset";
    @NotNull
    public static final String ORDER = "order";
    @NotNull
    public static final String RECEIVER_IDS = "receiver_ids";
    @NotNull
    public static final String RECEIVER_ID_TYPE = "receiver_id_type";
    @NotNull
    public static final String V1_CHATS_PATH = "/v1/api/talk/chat/list";
    @NotNull
    public static final String V1_CHAT_MEMBERS_PATH = "/v1/api/talk/members";
    @NotNull
    public static final String V1_FRIENDS_PATH = "/v1/friends";
    @NotNull
    public static final String V1_SIGNUP_PATH = "/v1/user/signup";
    @NotNull
    public static final String V2_MESSAGE_DEFAULT_PATH = "/v2/api/talk/message/default/send";
    @NotNull
    public static final String V2_MESSAGE_PATH = "/v2/api/talk/message/send";
    @NotNull
    public static final String V2_MESSAGE_SCRAP_PATH = "/v2/api/talk/message/scrap/send";

    static {
        Constants.INSTANCE = new Constants();  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

