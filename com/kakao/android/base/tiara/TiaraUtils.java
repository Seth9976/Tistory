package com.kakao.android.base.tiara;

import a5.b;
import android.app.Application;
import com.kakao.android.base.BaseKt;
import com.kakao.android.base.R.string;
import com.kakao.android.base.utils.ADIDUtils;
import com.kakao.android.base.utils.Logger;
import com.kakao.tiara.TiaraTracker;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tiara.data.Click.Builder;
import com.kakao.tiara.data.Click;
import com.kakao.tiara.data.LogBuilder;
import com.kakao.tiara.data.Meta;
import com.kakao.tiara.data.Search;
import g9.a;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b \b\u00C7\u0002\u0018\u00002\u00020\u0001J5\u0010\t\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\u0004\u00A2\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001A\u00020\b2\u0006\u0010\u000F\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0010\u0010\u0011JE\u0010\u0018\u001A\u00020\b2\u0006\u0010\u000F\u001A\u00020\u000E2\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0015\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019Jo\u0010#\u001A\u00020\b2\b\u0010\u001A\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u001B\u001A\u00020\u00042\u0006\u0010\u001D\u001A\u00020\u001C2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\n\b\u0002\u0010!\u001A\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0015\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u0012\u00A2\u0006\u0004\b#\u0010$JK\u0010%\u001A\u00020\b2\b\u0010\u001A\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u001B\u001A\u00020\u00042\u0006\u0010\u001D\u001A\u00020\u001C2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\u0016\b\u0002\u0010\u0015\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014\u00A2\u0006\u0004\b%\u0010&Ja\u0010+\u001A\u00020\b2\b\u0010\u001A\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u001B\u001A\u00020\u00042\u0006\u0010\u001D\u001A\u00020\u001C2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\b\u0010\'\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010(\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001A\u0004\u0018\u00010)2\n\b\u0002\u0010!\u001A\u0004\u0018\u00010 \u00A2\u0006\u0004\b+\u0010,J\u00C1\u0001\u0010<\u001A\u00020\u00122\n\b\u0002\u0010-\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010.\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010/\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u00100\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u00101\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u00102\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u00103\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u00104\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u00105\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u00106\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u00107\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u00108\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u00109\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010:\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010;\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\b<\u0010=J\u0085\u0001\u0010G\u001A\u00020 2\n\b\u0002\u0010>\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010?\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010@\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010A\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010B\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010C\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010D\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u00109\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010E\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010F\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\bG\u0010H\u00A8\u0006I"}, d2 = {"Lcom/kakao/android/base/tiara/TiaraUtils;", "", "Landroid/app/Application;", "application", "", "serviceDomain", "kakaoAppKey", "cookieDomain", "", "init", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "token", "setAccessToken", "(Ljava/lang/String;)V", "Lcom/kakao/android/base/tiara/TiaraListener;", "tiaraListener", "updatePageInfo", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "Lcom/kakao/tiara/data/Meta;", "pageMeta", "", "customProperties", "Lcom/kakao/tiara/data/Search;", "search", "trackPage", "(Lcom/kakao/android/base/tiara/TiaraListener;Lcom/kakao/tiara/data/Meta;Ljava/util/Map;Lcom/kakao/tiara/data/Search;)V", "section", "page", "Lcom/kakao/android/base/tiara/TiaraBaseEnum;", "action", "Lcom/kakao/tiara/data/ActionKind;", "actionKind", "Lcom/kakao/tiara/data/Click;", "click", "eventMeta", "trackClick", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/android/base/tiara/TiaraBaseEnum;Lcom/kakao/tiara/data/ActionKind;Lcom/kakao/tiara/data/Click;Lcom/kakao/tiara/data/Meta;Ljava/util/Map;Lcom/kakao/tiara/data/Meta;)V", "trackEvent", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/android/base/tiara/TiaraBaseEnum;Lcom/kakao/tiara/data/ActionKind;Ljava/util/Map;)V", "searchKeyword", "searchType", "", "searchResultsNum", "trackSearch", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/android/base/tiara/TiaraBaseEnum;Lcom/kakao/tiara/data/ActionKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/kakao/tiara/data/Click;)V", "id", "type", "name", "category", "categoryId", "provider", "providerId", "providerType", "series", "seriesId", "author", "authorId", "image", "pLink", "tags", "createMeta", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tiara/data/Meta;", "layer1", "layer2", "layer3", "clickUrl", "setNum", "orderNum", "copy", "posX", "posY", "createClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tiara/data/Click;", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTiaraUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TiaraUtils.kt\ncom/kakao/android/base/tiara/TiaraUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n1#2:365\n*E\n"})
public final class TiaraUtils {
    @NotNull
    public static final TiaraUtils INSTANCE;
    public static TiaraTracker a;
    public static String b;
    public static boolean c;

    static {
        TiaraUtils.INSTANCE = new TiaraUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static boolean a() {
        String s = TiaraUtils.b;
        if(s != null) {
            if(TiaraTracker.get(s) == null) {
                s = null;
            }
            if(s != null) {
                return true;
            }
        }
        Logger.INSTANCE.log("checkTiaraEnabled() Tiara NOT initialized");
        return false;
    }

    public static LogBuilder b(String s, String s1, String s2, ActionKind actionKind0) {
        TiaraTracker tiaraTracker0 = TiaraUtils.a;
        if(tiaraTracker0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tiaraTracker");
            tiaraTracker0 = null;
        }
        LogBuilder logBuilder0 = tiaraTracker0.trackEvent(s2).page(s1);
        if(s != null) {
            logBuilder0.section(s);
        }
        if(actionKind0 != null) {
            logBuilder0.actionKind(actionKind0);
        }
        return logBuilder0;
    }

    public final void c(String s, String s1, String s2, ActionKind actionKind0, Click click0, Meta meta0, Map map0, Meta meta1) {
        if(!TiaraUtils.a()) {
            return;
        }
        TiaraUtils.log$default(this, "trackClick()", s, s1, s2, actionKind0, click0, meta0, map0, null, 0x100, null);
        LogBuilder logBuilder0 = TiaraUtils.b(s, s1, s2, actionKind0);
        if(click0 != null) {
            logBuilder0.click(click0);
        }
        if(meta0 != null) {
            logBuilder0.eventMeta(meta0);
        }
        if(map0 != null) {
            Map map1 = map0.isEmpty() ? null : map0;
            if(map1 != null) {
                logBuilder0.customProps(map1);
            }
        }
        if(meta1 != null) {
            logBuilder0.pageMeta(meta1);
        }
        logBuilder0.track();
    }

    @NotNull
    public final Click createClick(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6, @Nullable String s7, @Nullable String s8, @Nullable String s9) {
        Builder click$Builder0 = new Builder();
        if(s != null) {
            click$Builder0.layer1(s);
        }
        if(s1 != null) {
            click$Builder0.layer2(s1);
        }
        if(s2 != null) {
            click$Builder0.layer3(s2);
        }
        if(s3 != null) {
            click$Builder0.clickUrl(s3);
        }
        if(s4 != null) {
            click$Builder0.setNum(s4);
        }
        if(s5 != null) {
            click$Builder0.ordNum(s5);
        }
        if(s6 != null) {
            click$Builder0.copy(s6);
        }
        if(s7 != null) {
            click$Builder0.image(s7);
        }
        if(s8 != null) {
            click$Builder0.posX(s8);
        }
        if(s9 != null) {
            click$Builder0.posY(s9);
        }
        Click click0 = click$Builder0.build();
        Intrinsics.checkNotNullExpressionValue(click0, "build(...)");
        return click0;
    }

    public static Click createClick$default(TiaraUtils tiaraUtils0, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            s2 = null;
        }
        if((v & 8) != 0) {
            s3 = null;
        }
        if((v & 16) != 0) {
            s4 = null;
        }
        if((v & 0x20) != 0) {
            s5 = null;
        }
        if((v & 0x40) != 0) {
            s6 = null;
        }
        if((v & 0x80) != 0) {
            s7 = null;
        }
        if((v & 0x100) != 0) {
            s8 = null;
        }
        if((v & 0x200) != 0) {
            s9 = null;
        }
        return tiaraUtils0.createClick(s, s1, s2, s3, s4, s5, s6, s7, s8, s9);
    }

    @NotNull
    public final Meta createMeta(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6, @Nullable String s7, @Nullable String s8, @Nullable String s9, @Nullable String s10, @Nullable String s11, @Nullable String s12, @Nullable String s13, @Nullable String s14) {
        com.kakao.tiara.data.Meta.Builder meta$Builder0 = new com.kakao.tiara.data.Meta.Builder();
        if(s != null) {
            meta$Builder0.id(s);
        }
        if(s1 != null) {
            meta$Builder0.type(s1);
        }
        if(s2 != null) {
            meta$Builder0.name(s2);
        }
        if(s3 != null) {
            meta$Builder0.category(s3);
        }
        if(s4 != null) {
            meta$Builder0.categoryId(s4);
        }
        if(s5 != null) {
            meta$Builder0.provider(s5);
        }
        if(s6 != null) {
            meta$Builder0.providerId(s6);
        }
        if(s7 != null) {
            meta$Builder0.providerType(s7);
        }
        if(s8 != null) {
            meta$Builder0.series(s8);
        }
        if(s9 != null) {
            meta$Builder0.seriesId(s9);
        }
        if(s10 != null) {
            meta$Builder0.author(s10);
        }
        if(s11 != null) {
            meta$Builder0.authorId(s11);
        }
        if(s12 != null) {
            meta$Builder0.image(s12);
        }
        if(s13 != null) {
            meta$Builder0.plink(s13);
        }
        if(s14 != null) {
            meta$Builder0.tags(s14);
        }
        Meta meta0 = meta$Builder0.build();
        Intrinsics.checkNotNullExpressionValue(meta0, "build(...)");
        return meta0;
    }

    public static Meta createMeta$default(TiaraUtils tiaraUtils0, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, String s11, String s12, String s13, String s14, int v, Object object0) {
        return tiaraUtils0.createMeta(((v & 1) == 0 ? s : null), ((v & 2) == 0 ? s1 : null), ((v & 4) == 0 ? s2 : null), ((v & 8) == 0 ? s3 : null), ((v & 16) == 0 ? s4 : null), ((v & 0x20) == 0 ? s5 : null), ((v & 0x40) == 0 ? s6 : null), ((v & 0x80) == 0 ? s7 : null), ((v & 0x100) == 0 ? s8 : null), ((v & 0x200) == 0 ? s9 : null), ((v & 0x400) == 0 ? s10 : null), ((v & 0x800) == 0 ? s11 : null), ((v & 0x1000) == 0 ? s12 : null), ((v & 0x2000) == 0 ? s13 : null), ((v & 0x4000) == 0 ? s14 : null));
    }

    public static LogBuilder getEventLogBuilder$default(TiaraUtils tiaraUtils0, String s, String s1, TiaraBaseEnum tiaraBaseEnum0, ActionKind actionKind0, int v, Object object0) {
        if((v & 8) != 0) {
            actionKind0 = null;
        }
        tiaraUtils0.getClass();
        return TiaraUtils.b(s, s1, tiaraBaseEnum0.getValue(), actionKind0);
    }

    public static LogBuilder getEventLogBuilder$default(TiaraUtils tiaraUtils0, String s, String s1, String s2, ActionKind actionKind0, int v, Object object0) {
        if((v & 8) != 0) {
            actionKind0 = null;
        }
        tiaraUtils0.getClass();
        return TiaraUtils.b(s, s1, s2, actionKind0);
    }

    public final void init(@NotNull Application application0, @NotNull String s, @Nullable String s1, @Nullable String s2) {
        Intrinsics.checkNotNullParameter(application0, "application");
        Intrinsics.checkNotNullParameter(s, "serviceDomain");
        TiaraUtils.b = s;
        TiaraUtils.c = (s1 == null || p.isBlank(s1) ? 1 : 0) ^ 1;
        com.kakao.tiara.TiaraConfiguration.Builder tiaraConfiguration$Builder0 = new com.kakao.tiara.TiaraConfiguration.Builder().sessionTimeout(300).syncTiaraUserToWebview(true);
        if(s2 != null) {
            tiaraConfiguration$Builder0.cookieDomains(new String[]{s2});
        }
        TiaraTracker.initialize(application0, tiaraConfiguration$Builder0.build());
        TiaraTracker tiaraTracker0 = TiaraTracker.get(s);
        if(tiaraTracker0 == null) {
            com.kakao.tiara.TiaraSettings.Builder tiaraSettings$Builder0 = new com.kakao.tiara.TiaraSettings.Builder();
            tiaraSettings$Builder0.deployment(BaseKt.getAppContext().getString(string.tiara_development_type));
            tiaraSettings$Builder0.batchSize(1);
            tiaraSettings$Builder0.batchInterval(30);
            if(TiaraUtils.c) {
                tiaraSettings$Builder0.kakaoAppKey(s1);
            }
            tiaraTracker0 = TiaraTracker.newInstance(s, tiaraSettings$Builder0.build());
            Intrinsics.checkNotNullExpressionValue(tiaraTracker0, "newInstance(...)");
        }
        TiaraUtils.a = tiaraTracker0;
        ADIDUtils.INSTANCE.requestAdInfo(a.w);
    }

    public static void init$default(TiaraUtils tiaraUtils0, Application application0, String s, String s1, String s2, int v, Object object0) {
        if((v & 4) != 0) {
            s1 = null;
        }
        if((v & 8) != 0) {
            s2 = null;
        }
        tiaraUtils0.init(application0, s, s1, s2);
    }

    public static void log$default(TiaraUtils tiaraUtils0, String s, String s1, String s2, String s3, ActionKind actionKind0, Click click0, Meta meta0, Map map0, Meta meta1, int v, Object object0) {
        if((v & 0x20) != 0) {
            click0 = null;
        }
        if((v & 0x40) != 0) {
            meta0 = null;
        }
        if((v & 0x80) != 0) {
            map0 = null;
        }
        if((v & 0x100) != 0) {
            meta1 = null;
        }
        tiaraUtils0.getClass();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s);
        stringBuilder0.append(", section=");
        stringBuilder0.append(s1);
        stringBuilder0.append(", page=");
        androidx.room.a.w(stringBuilder0, s2, ", action=", s3, ", actionKind=");
        stringBuilder0.append(actionKind0);
        String s4 = click0 == null ? stringBuilder0.toString() : stringBuilder0.toString() + ", click=" + click0;
        if(meta0 != null) {
            s4 = s4 + ", eventMeta=" + meta0;
        }
        if(meta1 != null) {
            s4 = s4 + ", pageMeta=" + meta1;
        }
        if(map0 != null) {
            s4 = s4 + ", customProperties=" + map0;
        }
        Logger.INSTANCE.log(s4);
    }

    public final void setAccessToken(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "token");
        TiaraTracker tiaraTracker0 = TiaraUtils.a;
        if(tiaraTracker0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tiaraTracker");
            tiaraTracker0 = null;
        }
        tiaraTracker0.getSettings().setAccessToken(s);
    }

    public final void trackClick(@Nullable String s, @NotNull String s1, @NotNull TiaraBaseEnum tiaraBaseEnum0, @Nullable ActionKind actionKind0, @Nullable Click click0, @Nullable Meta meta0, @Nullable Map map0, @Nullable Meta meta1) {
        Intrinsics.checkNotNullParameter(s1, "page");
        Intrinsics.checkNotNullParameter(tiaraBaseEnum0, "action");
        this.c(s, s1, tiaraBaseEnum0.getValue(), actionKind0, click0, meta0, map0, meta1);
    }

    public static void trackClick$default(TiaraUtils tiaraUtils0, String s, String s1, TiaraBaseEnum tiaraBaseEnum0, ActionKind actionKind0, Click click0, Meta meta0, Map map0, Meta meta1, int v, Object object0) {
        tiaraUtils0.trackClick(s, s1, tiaraBaseEnum0, ((v & 8) == 0 ? actionKind0 : null), ((v & 16) == 0 ? click0 : null), ((v & 0x20) == 0 ? meta0 : null), ((v & 0x40) == 0 ? map0 : null), ((v & 0x80) == 0 ? meta1 : null));
    }

    public static void trackClick$default(TiaraUtils tiaraUtils0, String s, String s1, String s2, ActionKind actionKind0, Click click0, Meta meta0, Map map0, Meta meta1, int v, Object object0) {
        tiaraUtils0.c(s, s1, s2, ((v & 8) == 0 ? actionKind0 : null), ((v & 16) == 0 ? click0 : null), ((v & 0x20) == 0 ? meta0 : null), ((v & 0x40) == 0 ? map0 : null), ((v & 0x80) == 0 ? meta1 : null));
    }

    public final void trackEvent(@Nullable String s, @NotNull String s1, @NotNull TiaraBaseEnum tiaraBaseEnum0, @Nullable ActionKind actionKind0, @Nullable Map map0) {
        Intrinsics.checkNotNullParameter(s1, "page");
        Intrinsics.checkNotNullParameter(tiaraBaseEnum0, "action");
        if(!TiaraUtils.a()) {
            return;
        }
        TiaraUtils.log$default(this, "trackEvent()", s, s1, tiaraBaseEnum0.getValue(), actionKind0, null, null, map0, null, 0x160, null);
        LogBuilder logBuilder0 = TiaraUtils.b(s, s1, tiaraBaseEnum0.getValue(), actionKind0);
        if(map0 != null) {
            Map map1 = map0.isEmpty() ? null : map0;
            if(map1 != null) {
                logBuilder0.customProps(map1);
            }
        }
        logBuilder0.track();
    }

    public static void trackEvent$default(TiaraUtils tiaraUtils0, String s, String s1, TiaraBaseEnum tiaraBaseEnum0, ActionKind actionKind0, Map map0, int v, Object object0) {
        tiaraUtils0.trackEvent(s, s1, tiaraBaseEnum0, ((v & 8) == 0 ? actionKind0 : null), ((v & 16) == 0 ? map0 : null));
    }

    public final void trackPage(@NotNull TiaraListener tiaraListener0, @Nullable Meta meta0, @Nullable Map map0, @Nullable Search search0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
        if(!TiaraUtils.a()) {
            return;
        }
        this.updatePageInfo(tiaraListener0);
        String s = tiaraListener0.getSection();
        String s1 = tiaraListener0.getPage();
        if(p.isBlank(s1)) {
            return;
        }
        String s2 = tiaraListener0.getAction();
        ActionKind actionKind0 = tiaraListener0.getActionKind();
        TiaraUtils.log$default(this, "trackPage()", s, s1, s2, actionKind0, null, null, null, null, 480, null);
        TiaraTracker tiaraTracker0 = TiaraUtils.a;
        if(tiaraTracker0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tiaraTracker");
            tiaraTracker0 = null;
        }
        LogBuilder logBuilder0 = tiaraTracker0.trackPage(s2).page(s1);
        if(s != null) {
            logBuilder0.section(s);
        }
        if(actionKind0 != null) {
            logBuilder0.actionKind(actionKind0);
        }
        if(meta0 != null) {
            logBuilder0.pageMeta(meta0);
        }
        if(map0 != null) {
            logBuilder0.customProps(map0);
        }
        if(search0 != null) {
            logBuilder0.search(search0);
        }
        logBuilder0.track();
    }

    public static void trackPage$default(TiaraUtils tiaraUtils0, TiaraListener tiaraListener0, Meta meta0, Map map0, Search search0, int v, Object object0) {
        if((v & 2) != 0) {
            meta0 = null;
        }
        if((v & 4) != 0) {
            map0 = null;
        }
        if((v & 8) != 0) {
            search0 = null;
        }
        tiaraUtils0.trackPage(tiaraListener0, meta0, map0, search0);
    }

    public final void trackSearch(@Nullable String s, @NotNull String s1, @NotNull TiaraBaseEnum tiaraBaseEnum0, @Nullable ActionKind actionKind0, @Nullable String s2, @Nullable String s3, @Nullable Integer integer0, @Nullable Click click0) {
        Intrinsics.checkNotNullParameter(s1, "page");
        Intrinsics.checkNotNullParameter(tiaraBaseEnum0, "action");
        if(!TiaraUtils.a()) {
            return;
        }
        String s4 = tiaraBaseEnum0.getValue();
        StringBuilder stringBuilder0 = b.w("trackSearch() section=", s, ", page=", s1, ", action=");
        stringBuilder0.append(s4);
        stringBuilder0.append(", actionKind=");
        stringBuilder0.append(actionKind0);
        stringBuilder0.append(", click=");
        stringBuilder0.append(click0);
        stringBuilder0.append(", searchKeyword=");
        stringBuilder0.append(s2);
        stringBuilder0.append(", searchType=");
        stringBuilder0.append(s3);
        stringBuilder0.append(", searchResultsNum=");
        stringBuilder0.append(integer0);
        Logger.INSTANCE.log(stringBuilder0.toString());
        LogBuilder logBuilder0 = TiaraUtils.b(s, s1, tiaraBaseEnum0.getValue(), actionKind0);
        if(click0 != null) {
            logBuilder0.click(click0);
        }
        if(s2 != null) {
            com.kakao.tiara.data.Search.Builder search$Builder0 = new com.kakao.tiara.data.Search.Builder().searchTerm(s2);
            if(s3 != null) {
                search$Builder0.searchType(s3);
            }
            if(integer0 != null) {
                search$Builder0.searchResultsNum(((int)integer0));
            }
            logBuilder0.search(search$Builder0.build());
        }
        logBuilder0.track();
    }

    public static void trackSearch$default(TiaraUtils tiaraUtils0, String s, String s1, TiaraBaseEnum tiaraBaseEnum0, ActionKind actionKind0, String s2, String s3, Integer integer0, Click click0, int v, Object object0) {
        tiaraUtils0.trackSearch(s, s1, tiaraBaseEnum0, ((v & 8) == 0 ? actionKind0 : null), s2, ((v & 0x20) == 0 ? s3 : null), ((v & 0x40) == 0 ? integer0 : null), ((v & 0x80) == 0 ? click0 : null));
    }

    public final void updatePageInfo(@NotNull TiaraListener tiaraListener0) {
        Class class0;
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
        String s = tiaraListener0.getSection();
        String s1 = null;
        if(s == null) {
            class0 = tiaraListener0.getClass();
            s = TiaraAnnotationUtil.INSTANCE.getSection(class0);
        }
        else {
            if(p.isBlank(s)) {
                s = null;
            }
            if(s == null) {
                class0 = tiaraListener0.getClass();
                s = TiaraAnnotationUtil.INSTANCE.getSection(class0);
            }
        }
        tiaraListener0.setSection(s);
        String s2 = tiaraListener0.getPage();
        if(p.isBlank(s2)) {
            s2 = null;
        }
        if(s2 == null) {
            Class class1 = tiaraListener0.getClass();
            s2 = TiaraAnnotationUtil.INSTANCE.getPage(class1);
            if(s2 == null) {
                s2 = "";
            }
        }
        tiaraListener0.setPage(s2);
        String s3 = tiaraListener0.getAction();
        if(!p.isBlank(s3)) {
            s1 = s3;
        }
        if(s1 == null) {
            Class class2 = tiaraListener0.getClass();
            s1 = TiaraAnnotationUtil.INSTANCE.getAction(class2);
            if(s1 == null) {
                s1 = androidx.room.a.z(tiaraListener0.getPage(), "_보기");
            }
        }
        tiaraListener0.setAction(s1);
        ActionKind actionKind0 = tiaraListener0.getActionKind();
        if(actionKind0 == null) {
            Class class3 = tiaraListener0.getClass();
            actionKind0 = TiaraAnnotationUtil.INSTANCE.getActionKind(class3);
        }
        tiaraListener0.setActionKind(actionKind0);
    }
}

