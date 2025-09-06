package com.kakao.tistory.presentation.common.redirect;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.android.base.utils.IntentUtils;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.TistoryMainActivity;
import com.kakao.tistory.presentation.blog.BlogActivity.Companion;
import com.kakao.tistory.presentation.blog.BlogActivity;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.common.utils.UrlUtils;
import com.kakao.tistory.presentation.main.navigation.MainCommand.GoNotification;
import com.kakao.tistory.presentation.main.navigation.MainNavigationKt;
import com.kakao.tistory.presentation.screen.item.GuestbookExtra;
import com.kakao.tistory.presentation.view.blog.BlogFollowActivity;
import com.kakao.tistory.presentation.view.comment.guestbook.GuestbookActivity;
import com.kakao.tistory.presentation.view.editor.EditorActivity;
import com.kakao.tistory.presentation.view.entry.EntryViewActivity.EntryWayPoint.Comment;
import com.kakao.tistory.presentation.view.entry.EntryViewActivity.EntryWayPoint.Modify;
import com.kakao.tistory.presentation.view.entry.EntryViewActivity;
import com.kakao.tistory.presentation.view.login.KakaoLoginActivity;
import com.kakao.tistory.presentation.view.search.SearchActivity.RedirectDestination;
import com.kakao.tistory.presentation.view.search.SearchActivity;
import java.net.URLDecoder;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.o;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001BJ\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\t\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00020\u000E2\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001D\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0013\u001A\u00020\b¢\u0006\u0004\b\u0011\u0010\u0014R\u0014\u0010\u0015\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001A\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001A\u0010\u0016¨\u0006\u001C"}, d2 = {"Lcom/kakao/tistory/presentation/common/redirect/RedirectUtils;", "", "", "url", "", "isTistoryBlogUrl", "(Ljava/lang/String;)Z", "blockExternalUrls", "Lcom/kakao/tistory/presentation/common/redirect/RedirectData;", "createRedirectData", "(Ljava/lang/String;Z)Lcom/kakao/tistory/presentation/common/redirect/RedirectData;", "appScheme", "parsingAppScheme", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/common/redirect/RedirectData;", "Landroid/content/Context;", "context", "", "goToDestination", "(Landroid/content/Context;Ljava/lang/String;Z)V", "redirectData", "(Landroid/content/Context;Lcom/kakao/tistory/presentation/common/redirect/RedirectData;)V", "PREFIX_TISTORY_APP_SCHEME", "Ljava/lang/String;", "APP_SCHEME_TISTORY_OPEN", "APP_SCHEME_LOGIN", "APP_SCHEME_NOTIFICATION", "TEL_SCHEME", "Type", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRedirectUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedirectUtils.kt\ncom/kakao/tistory/presentation/common/redirect/RedirectUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,467:1\n1#2:468\n*E\n"})
public final class RedirectUtils {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000Bj\u0002\b\fj\u0002\b\rj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/presentation/common/redirect/RedirectUtils$Type;", "", "NONE", "WEB", "BLOGTOP", "ENTRY", "COMMENT", "FOLLOWER", "INTENT", "TAG", "TEL", "EXTERNAL", "ENTRY_MODIFY", "NEW_ENTRY", "BLOGTOP_SETTING", "GUESTBOOK", "NOTIFICATION", "PAYMENT_VERIFY_ACCOUNT_CLOSE", "LOGIN", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum Type {
        NONE,
        WEB,
        BLOGTOP,
        ENTRY,
        COMMENT,
        FOLLOWER,
        INTENT,
        TAG,
        TEL,
        EXTERNAL,
        ENTRY_MODIFY,
        NEW_ENTRY,
        BLOGTOP_SETTING,
        GUESTBOOK,
        NOTIFICATION,
        PAYMENT_VERIFY_ACCOUNT_CLOSE,
        LOGIN;

        public static final Type[] a;
        public static final EnumEntries b;

        static {
            Type.a = arr_redirectUtils$Type;
            Intrinsics.checkNotNullParameter(arr_redirectUtils$Type, "entries");
            Type.b = new a(arr_redirectUtils$Type);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return Type.b;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Type.values().length];
            try {
                arr_v[Type.BLOGTOP.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.ENTRY.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.COMMENT.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.FOLLOWER.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.INTENT.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.TAG.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.TEL.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.ENTRY_MODIFY.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.NEW_ENTRY.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.BLOGTOP_SETTING.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.GUESTBOOK.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.NOTIFICATION.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.LOGIN.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.NONE.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.PAYMENT_VERIFY_ACCOUNT_CLOSE.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.WEB.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.EXTERNAL.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final String APP_SCHEME_LOGIN = "login";
    @NotNull
    public static final String APP_SCHEME_NOTIFICATION = "notification";
    @NotNull
    public static final String APP_SCHEME_TISTORY_OPEN = "open";
    @NotNull
    public static final RedirectUtils INSTANCE = null;
    @NotNull
    public static final String PREFIX_TISTORY_APP_SCHEME = "tistoryapp://";
    @NotNull
    public static final String TEL_SCHEME = "tel:";
    public static final Regex a;
    public static final Regex b;
    public static final Regex c;
    public static final Regex d;
    public static final Regex e;
    public static final Regex f;
    public static final Regex g;
    public static final Regex h;
    public static final Regex i;
    public static final Regex j;
    public static final Regex k;
    public static final Regex l;
    public static final String m;
    public static final ArrayList n;

    static {
        RedirectUtils.INSTANCE = new RedirectUtils();
        RedirectUtils.a = new Regex("#TISTORYAPPCHOARA$");
        RedirectUtils.b = new Regex("^(?:https?(?::\\/\\/))?(?:w{3}\\.)?(?:[a-zA-Z0-9-]+\\.)?(?:(?:cbt\\.)|(?:dev\\.))?tistory\\.com(?:\\/.*|$)");
        RedirectUtils.c = new Regex("^(?:https?(?:://))?(?:w{3}.)?(?:(?:cbt.)|(?:dev.))?tistory\\.com/");
        RedirectUtils.d = new Regex("^(?:https?(?:://))?(?:w{3}.)?([a-zA-Z0-9-]+)(?:\\..*)?\\.(?:(?:cbt.)|(?:dev.))?tistory\\.com(?:/)?(?:m/)?((?:m.+|(?!m).*)*)");
        RedirectUtils.e = new Regex("^(\\d+)(?:#comment(\\d+))*");
        RedirectUtils.f = new Regex("^guestbook#comment(\\d+)*");
        RedirectUtils.g = new Regex("^entry/((?!category=\\d+)(?:(?:.*)(?=\\?category=\\d+$))|(?:.*))");
        RedirectUtils.h = new Regex("^(.+)(?:#comment(\\d+)$)");
        RedirectUtils.i = new Regex("^tag/(.*)");
        RedirectUtils.j = new Regex("^manage(/.*)?");
        RedirectUtils.k = new Regex("^/post(?:/(\\d+))*");
        RedirectUtils.l = new Regex("^/subscribers$");
        RedirectUtils.m = "paymentverifyaccount://close";
        RedirectUtils.n = new ArrayList();
        RedirectUtils.$stable = 8;
    }

    public static Intent a() {
        ArrayList arrayList0 = RedirectUtils.n;
        if(arrayList0.size() > 1) {
            for(int v = arrayList0.size() - 1; -1 < v; --v) {
                Intent intent0 = (Intent)RedirectUtils.n.get(v);
                ((Intent)RedirectUtils.n.get(v - 1)).putExtra("REDIRECT_INTENT", intent0);
            }
        }
        return (Intent)RedirectUtils.n.get(0);
    }

    public static RedirectData a(String s, boolean z) {
        String s4;
        Unit unit0;
        Object object2;
        String s3;
        Type redirectUtils$Type1;
        Long long0;
        Logger logger0 = Logger.INSTANCE;
        logger0.log("parsingUrl " + s);
        if(Regex.find$default(RedirectUtils.c, s, 0, 2, null) != null) {
            logger0.log("parsingUrl() : WEB url=" + s);
            return new RedirectData(s, null, null, null, null, null, Type.WEB, 62, null);
        }
        MatchResult matchResult0 = Regex.find$default(RedirectUtils.d, s, 0, 2, null);
        if(matchResult0 != null) {
            logger0.log("parsingUrl() : WEB url=" + s);
            String s1 = (String)matchResult0.getGroupValues().get(1);
            ObjectRef ref$ObjectRef0 = new ObjectRef();
            ObjectRef ref$ObjectRef1 = new ObjectRef();
            Type redirectUtils$Type0 = Type.WEB;
            ref$ObjectRef1.element = redirectUtils$Type0;
            if(Intrinsics.areEqual(s1, "www")) {
                logger0.log("parsingUrl() : blogName=" + s1 + " -> etc url");
                return new RedirectData(s, null, null, null, null, null, redirectUtils$Type0, 62, null);
            }
            String s2 = matchResult0.getGroupValues().get(2);
            Regex regex0 = RedirectUtils.a;
            if(Regex.find$default(regex0, s2, 0, 2, null) != null) {
                logger0.log("parsingUrl() : IN_APP_BROWSER");
                s2 = regex0.replace(s2, "");
            }
            if(p.isBlank(s2)) {
                logger0.log("parsingUrl() : BLOGTOP blogName=" + s1);
                return new RedirectData(s, s1, null, null, null, null, Type.BLOGTOP, 60, null);
            }
            MatchResult matchResult1 = Regex.find$default(RedirectUtils.e, s2, 0, 2, null);
            if(matchResult1 == null) {
                long0 = null;
            }
            else {
                logger0.log("parsingUrl() : ENTRY or COMMENT blogName=" + s1 + ", entryId=null, commentId=" + ref$ObjectRef0.element);
                long0 = Long.parseLong(((String)matchResult1.getGroupValues().get(1)));
                Object object0 = matchResult1.getGroupValues().get(2);
                if(p.isBlank(((String)object0))) {
                    object0 = null;
                }
                Long long1 = ((String)object0) == null ? null : Long.parseLong(((String)object0));
                ref$ObjectRef0.element = long1;
                if(long1 == null) {
                    redirectUtils$Type1 = Type.ENTRY;
                }
                else {
                    redirectUtils$Type1 = Type.COMMENT;
                    if(redirectUtils$Type1 == null) {
                        redirectUtils$Type1 = Type.ENTRY;
                    }
                }
                ref$ObjectRef1.element = redirectUtils$Type1;
            }
            MatchResult matchResult2 = Regex.find$default(RedirectUtils.f, s2, 0, 2, null);
            if(matchResult2 != null) {
                Object object1 = matchResult2.getGroupValues().get(1);
                if(p.isBlank(((String)object1))) {
                    object1 = null;
                }
                ref$ObjectRef0.element = ((String)object1) == null ? null : Long.parseLong(((String)object1));
                ref$ObjectRef1.element = Type.GUESTBOOK;
            }
            MatchResult matchResult3 = Regex.find$default(RedirectUtils.g, s2, 0, 2, null);
            if(matchResult3 == null) {
                s3 = null;
            }
            else {
                s3 = URLDecoder.decode(((String)matchResult3.getGroupValues().get(1)), "UTF-8");
                if(s3 == null) {
                    s3 = null;
                }
                else {
                    if(p.isBlank(s3)) {
                        s3 = null;
                    }
                    if(s3 == null) {
                        s3 = null;
                    }
                    else {
                        logger0.log("parsingUrl() : ENTRY blogName=" + s1 + ", slogan=" + s3);
                        MatchResult matchResult4 = Regex.find$default(RedirectUtils.h, s3, 0, 2, null);
                        if(matchResult4 == null) {
                            unit0 = null;
                            object2 = null;
                        }
                        else {
                            object2 = matchResult4.getGroupValues().get(1);
                            ref$ObjectRef0.element = Long.parseLong(((String)matchResult4.getGroupValues().get(2)));
                            ref$ObjectRef1.element = Type.COMMENT;
                            unit0 = Unit.INSTANCE;
                        }
                        if(unit0 == null) {
                            ref$ObjectRef1.element = Type.ENTRY;
                        }
                        else {
                            s3 = object2;
                        }
                    }
                }
            }
            MatchResult matchResult5 = Regex.find$default(RedirectUtils.i, s2, 0, 2, null);
            if(matchResult5 == null) {
                s4 = null;
            }
            else {
                s4 = URLDecoder.decode(((String)matchResult5.getGroupValues().get(1)), "UTF-8");
                ref$ObjectRef1.element = Type.TAG;
                logger0.log("parsingUrl() : SEARCH TAG blogName=" + s1 + ", keyword=" + s4);
            }
            MatchResult matchResult6 = Regex.find$default(RedirectUtils.j, s2, 0, 2, null);
            if(matchResult6 != null) {
                ref$ObjectRef1.element = Type.BLOGTOP_SETTING;
                String s5 = (String)CollectionsKt___CollectionsKt.getOrNull(matchResult6.getGroupValues(), 1);
                if(s5 != null) {
                    MatchResult matchResult7 = Regex.find$default(RedirectUtils.k, s5, 0, 2, null);
                    if(matchResult7 != null) {
                        long0 = o.toLongOrNull(((String)matchResult7.getGroupValues().get(1)));
                        ref$ObjectRef1.element = long0 == null ? Type.NEW_ENTRY : Type.ENTRY_MODIFY;
                    }
                    if(Regex.find$default(RedirectUtils.l, s5, 0, 2, null) != null) {
                        logger0.log("parsingUrl() : FOLLOWER blogName=" + s1);
                        ref$ObjectRef1.element = Type.FOLLOWER;
                    }
                }
            }
            return new RedirectData(s, s1, long0, s3, ((Long)ref$ObjectRef0.element), s4, ((Type)ref$ObjectRef1.element));
        }
        if(z) {
            return new RedirectData(s, null, null, null, null, null, Type.NONE, 62, null);
        }
        return UrlUtils.INSTANCE.isUrl(s) ? new RedirectData(s, null, null, null, null, null, Type.WEB, 62, null) : new RedirectData(s, null, null, null, null, null, Type.EXTERNAL, 62, null);
    }

    @NotNull
    public final RedirectData createRedirectData(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "url");
        if(p.isBlank(s)) {
            Logger.INSTANCE.log("createRedirectType() : EMPTY url=" + s);
            return new RedirectData(s, null, null, null, null, null, Type.NONE, 62, null);
        }
        if(p.startsWith$default(s, "intent://", false, 2, null)) {
            Logger.INSTANCE.log("createRedirectType() : INTENT url=" + s);
            return new RedirectData(s, null, null, null, null, null, Type.INTENT, 62, null);
        }
        if(p.startsWith$default(s, "tistoryapp://", false, 2, null)) {
            Logger.INSTANCE.log("createRedirectType() : APP SCHEME url=" + s);
            return this.parsingAppScheme(s);
        }
        if(p.startsWith$default(s, "tel:", false, 2, null)) {
            Logger.INSTANCE.log("createRedirectType() : TEL SCHEME url=" + s);
            return new RedirectData(s, null, null, null, null, null, Type.TEL, 62, null);
        }
        if(Intrinsics.areEqual(s, "paymentverifyaccount://close")) {
            return new RedirectData(s, null, null, null, null, null, Type.PAYMENT_VERIFY_ACCOUNT_CLOSE, 62, null);
        }
        Logger.INSTANCE.log("createRedirectType() : URL url=" + s);
        return RedirectUtils.a(s, z);
    }

    public static RedirectData createRedirectData$default(RedirectUtils redirectUtils0, String s, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return redirectUtils0.createRedirectData(s, z);
    }

    public final void goToDestination(@NotNull Context context0, @NotNull RedirectData redirectData0) {
        Intent intent1;
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(redirectData0, "redirectData");
        ArrayList arrayList0 = RedirectUtils.n;
        arrayList0.clear();
        String s = redirectData0.getBlogName();
        int[] arr_v = WhenMappings.$EnumSwitchMapping$0;
        Intent intent0 = null;
        switch(arr_v[redirectData0.getType().ordinal()]) {
            case 1: {
                if(s == null) {
                    intent1 = null;
                }
                else {
                    Intent intent2 = Companion.createIntent$default(BlogActivity.Companion, context0, s, false, 4, null);
                    RedirectUtils.INSTANCE.getClass();
                    arrayList0.add(intent2);
                    intent1 = RedirectUtils.a();
                }
                break;
            }
            case 2: 
            case 3: {
                if(s == null) {
                    intent1 = null;
                }
                else {
                    String s1 = redirectData0.getSlogan();
                    if(s1 == null || p.isBlank(s1)) {
                        Long long0 = redirectData0.getCommentId();
                        Comment entryViewActivity$EntryWayPoint$Comment0 = long0 == null ? null : new Comment(long0.longValue());
                        Intent intent4 = com.kakao.tistory.presentation.view.entry.EntryViewActivity.Companion.createIntent$default(EntryViewActivity.Companion, context0, s, redirectData0.getEntryId(), null, null, null, entryViewActivity$EntryWayPoint$Comment0, 56, null);
                        RedirectUtils.INSTANCE.getClass();
                        arrayList0.add(intent4);
                    }
                    else {
                        Intent intent3 = com.kakao.tistory.presentation.view.entry.EntryViewActivity.Companion.createIntent$default(EntryViewActivity.Companion, context0, s, null, redirectData0.getSlogan(), null, null, null, 0x74, null);
                        RedirectUtils.INSTANCE.getClass();
                        arrayList0.add(intent3);
                    }
                    intent1 = RedirectUtils.a();
                }
                break;
            }
            case 4: {
                arrayList0.add(BlogFollowActivity.Companion.createIntent(context0, s, com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel.Type.FOLLOWER));
                intent1 = RedirectUtils.a();
                break;
            }
            case 5: {
                Intent intent5 = Intent.parseUri(redirectData0.getUrl(), 1);
                if(intent5 == null) {
                    intent5 = null;
                }
                else {
                    if(!IntentUtils.INSTANCE.isAvailableIntent(intent5)) {
                        intent5 = null;
                    }
                    if(intent5 == null) {
                        intent5 = null;
                    }
                    else {
                        intent5.addFlags(0x10000000);
                    }
                }
                if(intent5 == null) {
                    intent1 = null;
                }
                else {
                    RedirectUtils.INSTANCE.getClass();
                    arrayList0.add(intent5);
                    intent1 = RedirectUtils.a();
                }
                break;
            }
            case 6: {
                arrayList0.add(SearchActivity.Companion.createIntent(context0, redirectData0.getKeyword(), redirectData0.getBlogName(), RedirectDestination.TAG));
                intent1 = RedirectUtils.a();
                break;
            }
            case 7: {
                arrayList0.add(new Intent("android.intent.action.DIAL", Uri.parse(redirectData0.getUrl())));
                intent1 = RedirectUtils.a();
                break;
            }
            case 8: {
                if(s == null) {
                    intent1 = null;
                }
                else {
                    Intent intent6 = com.kakao.tistory.presentation.view.entry.EntryViewActivity.Companion.createIntent$default(EntryViewActivity.Companion, context0, s, redirectData0.getEntryId(), null, null, null, Modify.INSTANCE, 56, null);
                    RedirectUtils.INSTANCE.getClass();
                    arrayList0.add(intent6);
                    intent1 = RedirectUtils.a();
                }
                break;
            }
            case 9: {
                if(s == null) {
                    intent1 = null;
                }
                else {
                    Intent intent7 = com.kakao.tistory.presentation.view.editor.EditorActivity.Companion.createIntent$default(EditorActivity.Companion, context0, false, null, s, 6, null);
                    RedirectUtils.INSTANCE.getClass();
                    arrayList0.add(intent7);
                    intent1 = RedirectUtils.a();
                }
                break;
            }
            case 10: {
                if(s == null) {
                    intent1 = null;
                }
                else {
                    Intent intent8 = BlogActivity.Companion.createIntent(context0, s, true);
                    RedirectUtils.INSTANCE.getClass();
                    arrayList0.add(intent8);
                    intent1 = RedirectUtils.a();
                }
                break;
            }
            case 11: {
                if(s == null) {
                    intent1 = null;
                }
                else {
                    GuestbookExtra guestbookExtra0 = new GuestbookExtra(s, null, null, redirectData0.getCommentId(), false, true);
                    Intent intent9 = new Intent(context0, GuestbookActivity.class);
                    intent9.putExtra("EXTRA_GUESTBOOK", guestbookExtra0);
                    intent9.putExtra("EXTRA_FROM_NOTIFICATION", true);
                    RedirectUtils.INSTANCE.getClass();
                    arrayList0.add(intent9);
                    intent1 = RedirectUtils.a();
                }
                break;
            }
            case 12: {
                arrayList0.add(MainNavigationKt.createIntent(TistoryMainActivity.Companion, context0, null, null, GoNotification.INSTANCE));
                intent1 = RedirectUtils.a();
                break;
            }
            case 13: {
                boolean z = Intrinsics.areEqual(StringsKt__StringsKt.substringAfter(redirectData0.getUrl(), "tistoryapp://", ""), "tistorylogin");
                arrayList0.add(KakaoLoginActivity.Companion.createIntent(context0, z));
                intent1 = RedirectUtils.a();
                break;
            }
            default: {
                intent1 = null;
            }
        }
        if(intent1 == null) {
            String s2 = redirectData0.getUrl();
            boolean z1 = StringsKt__StringsKt.contains$default(s2, "scheme=daummaps", false, 2, null);
            if((StringsKt__StringsKt.contains$default(s2, "scheme=kakaomap", false, 2, null) | z1) != 0) {
                intent0 = new Intent("android.intent.action.VIEW", Uri.parse(context0.getString(string.market_link_kakaomap)));
            }
        }
        else {
            intent0 = intent1;
        }
        switch(arr_v[redirectData0.getType().ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                if(intent0 != null) {
                    NavigatorExtensionKt.goToRedirect(context0, intent0);
                }
                return;
            }
            case 16: {
                NavigatorExtensionKt.goToWebView$default(context0, redirectData0.getUrl(), false, false, false, false, 30, null);
                return;
            }
            case 17: {
                NavigatorExtensionKt.goToExternal(context0, redirectData0.getUrl());
            }
        }
    }

    public final void goToDestination(@NotNull Context context0, @Nullable String s, boolean z) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Logger.INSTANCE.log("goToDestination() : url=" + s);
        if(s != null && s.length() != 0) {
            this.goToDestination(context0, this.createRedirectData(s, z));
        }
    }

    public static void goToDestination$default(RedirectUtils redirectUtils0, Context context0, String s, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        redirectUtils0.goToDestination(context0, s, z);
    }

    public final boolean isTistoryBlogUrl(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "url");
        return RedirectUtils.d.matches(s);
    }

    @NotNull
    public final RedirectData parsingAppScheme(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "appScheme");
        String s1 = StringsKt__StringsKt.substringAfter(s, "tistoryapp://", "");
        if(Intrinsics.areEqual(s1, "open")) {
            return new RedirectData(s, null, null, null, null, null, Type.NONE, 62, null);
        }
        if(p.endsWith$default(s1, "login", false, 2, null)) {
            return new RedirectData(s, null, null, null, null, null, Type.LOGIN, 62, null);
        }
        if(Intrinsics.areEqual(s1, "notification")) {
            return new RedirectData(s, null, null, null, null, null, Type.NOTIFICATION, 62, null);
        }
        return RedirectUtils.b.matches(s1) ? RedirectUtils.a(("https://" + s1), false) : new RedirectData(s, null, null, null, null, null, Type.NONE, 62, null);
    }
}

