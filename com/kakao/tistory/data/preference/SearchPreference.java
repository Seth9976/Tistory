package com.kakao.tistory.data.preference;

import android.content.Context;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\f\u0018\u0000 \u001A2\u00020\u0001:\u0001\u001AB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001A\u0010\u000E\u001A\u00020\t8\u0014X\u0094D¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR*\u0010\u0011\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000F8F@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0017\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000F8F@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001A\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001B"}, d2 = {"Lcom/kakao/tistory/data/preference/SearchPreference;", "Lcom/kakao/tistory/data/preference/BasePreference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "clearAll", "()V", "", "b", "Ljava/lang/String;", "getPREFERENCE_NAME", "()Ljava/lang/String;", "PREFERENCE_NAME", "", "value", "recentKeywordEnabled", "Z", "getRecentKeywordEnabled", "()Z", "setRecentKeywordEnabled", "(Z)V", "recommendKeywordEnabled", "getRecommendKeywordEnabled", "setRecommendKeywordEnabled", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SearchPreference extends BasePreference {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/data/preference/SearchPreference$Companion;", "", "", "PROPERTY_RECENT_KEYWORD_ENABLED", "Ljava/lang/String;", "PROPERTY_RECOMMEND_KEYWORD_ENABLED", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final String b;

    static {
        SearchPreference.Companion = new Companion(null);
    }

    @Inject
    public SearchPreference(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        this.b = "SETTING_PREPERENCE_SEARCH";
    }

    @Override  // com.kakao.tistory.data.preference.BasePreference
    public void clearAll() {
        this.remove("PROPERTY_RECENT_KEYWORD_ENABLED");
        this.remove("PROPERTY_RECOMMEND_KEYWORD_ENABLED");
    }

    @Override  // com.kakao.tistory.data.preference.BasePreference
    @NotNull
    public String getPREFERENCE_NAME() {
        return this.b;
    }

    public final boolean getRecentKeywordEnabled() {
        return this.getBoolean("PROPERTY_RECENT_KEYWORD_ENABLED", true);
    }

    public final boolean getRecommendKeywordEnabled() {
        return this.getBoolean("PROPERTY_RECOMMEND_KEYWORD_ENABLED", true);
    }

    public final void setRecentKeywordEnabled(boolean z) {
        this.putBoolean("PROPERTY_RECENT_KEYWORD_ENABLED", z);
    }

    public final void setRecommendKeywordEnabled(boolean z) {
        this.putBoolean("PROPERTY_RECOMMEND_KEYWORD_ENABLED", z);
    }
}

