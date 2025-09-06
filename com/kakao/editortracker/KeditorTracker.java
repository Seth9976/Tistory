package com.kakao.editortracker;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import androidx.work.WorkManager;
import com.kakao.editortracker.data.Action;
import com.kakao.editortracker.data.EditorInfo;
import com.kakao.editortracker.data.Service;
import com.kakao.editortracker.data.UserAgent;
import com.kakao.editortracker.extension.ContextKt;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import m0.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BR\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0004\u0012\b\b\u0002\u0010\b\u001A\u00020\u0004\u0012\u0019\b\u0002\u0010\r\u001A\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B0\t¢\u0006\u0002\b\f¢\u0006\u0004\b\u000E\u0010\u000FJ(\u0010\u0012\u001A\u00020\u000B2\u0017\u0010\u0011\u001A\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000B0\t¢\u0006\u0002\b\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001A\u00020\u000B2\u0006\u0010\u0014\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0015J(\u0010\u0018\u001A\u00020\u000B2\u0017\u0010\u0017\u001A\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000B0\t¢\u0006\u0002\b\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0013J2\u0010\u0018\u001A\u00020\u000B2\b\u0010\u0014\u001A\u0004\u0018\u00010\u00042\u0017\u0010\u0017\u001A\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000B0\t¢\u0006\u0002\b\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001A"}, d2 = {"Lcom/kakao/editortracker/KeditorTracker;", "Lcom/kakao/editortracker/EditorTracker;", "Landroid/content/Context;", "context", "", "serviceKey", "serviceDomain", "serviceReferrer", "serviceVersionName", "Lkotlin/Function1;", "Lcom/kakao/editortracker/EditorTrackerConfig$Builder;", "", "Lkotlin/ExtensionFunctionType;", "configBuilder", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lcom/kakao/editortracker/data/EditorInfo;", "editorBuilder", "load", "(Lkotlin/jvm/functions/Function1;)V", "editorVersion", "(Ljava/lang/String;)V", "Lcom/kakao/editortracker/data/Action;", "clickBuilder", "click", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "editortracker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKeditorTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeditorTracker.kt\ncom/kakao/editortracker/KeditorTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
public final class KeditorTracker implements EditorTracker {
    public final EditorTrackerConfig a;
    public String b;
    public final boolean c;

    public KeditorTracker(@NotNull Context context0, @NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(context0, "context");
        String s7;
        String s6;
        String s5;
        String s4;
        Intrinsics.checkNotNullParameter(s, "serviceKey");
        Intrinsics.checkNotNullParameter(s1, "serviceDomain");
        Intrinsics.checkNotNullParameter(s2, "serviceReferrer");
        Intrinsics.checkNotNullParameter(s3, "serviceVersionName");
        Intrinsics.checkNotNullParameter(function10, "configBuilder");
        super();
        Intrinsics.checkNotNullExpressionValue(WorkManager.getInstance(context0), "getInstance(...)");
        if(p.isBlank(s)) {
            s4 = ContextKt.getMetadata(context0, "com.kakao.editortracker.key");
            if(s4 == null) {
                s4 = "";
            }
        }
        else {
            s4 = s;
        }
        if(p.isBlank(s1)) {
            s5 = ContextKt.getMetadata(context0, "com.kakao.editortracker.domain");
            if(s5 == null) {
                s5 = "";
            }
        }
        else {
            s5 = s1;
        }
        if(p.isBlank(s2)) {
            s6 = ContextKt.getMetadata(context0, "com.kakao.editortracker.referrer");
            if(s6 == null) {
                s6 = "";
            }
        }
        else {
            s6 = s2;
        }
        if(p.isBlank(s3)) {
            s7 = ContextKt.getVersionName(context0);
            if(s7 == null) {
                s7 = "";
            }
        }
        else {
            s7 = s3;
        }
        Builder editorTrackerConfig$Builder0 = new Builder(s4, s5, s6, s7);
        function10.invoke(editorTrackerConfig$Builder0);
        EditorTrackerConfig editorTrackerConfig0 = editorTrackerConfig$Builder0.build();
        this.a = editorTrackerConfig0;
        Service service0 = editorTrackerConfig0.getService();
        this.c = editorTrackerConfig0.isTrackEnabled();
        String s8 = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(s8, "RELEASE");
        String s9 = context0.getResources().getBoolean(bool.isTablet) ? "tablet" : "mobile";
        String s10 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(s10, "MODEL");
        new UserAgent("android", s8, null, null, s9, s10, "app", 12, null);
        if(p.isBlank(service0.getKey())) {
            Intrinsics.checkNotNullExpressionValue("KeditorTracker", "access$getTAG$p(...)");
            Logger.INSTANCE.warn("KeditorTracker", "service.key 는 필수 값 입니다.", new Object[0]);
            this.c = false;
        }
        if(p.isBlank(service0.getDomain())) {
            Intrinsics.checkNotNullExpressionValue("KeditorTracker", "access$getTAG$p(...)");
            Logger.INSTANCE.warn("KeditorTracker", "service.domain 은 필수 값 입니다.", new Object[0]);
            this.c = false;
        }
        if(!this.c) {
            Intrinsics.checkNotNullExpressionValue("KeditorTracker", "access$getTAG$p(...)");
            Logger.INSTANCE.warn("KeditorTracker", "isTrackEnabled 가 false 로 로그를 수집하지 않습니다.", new Object[0]);
        }
        String s11 = editorTrackerConfig0.getEditorVersion();
        if(s11 != null && !p.isBlank(s11)) {
            this.load(new b0(this, 1));
        }
        else {
            Collection collection0 = editorTrackerConfig0.getEditorPlugins();
            if(collection0 != null && !collection0.isEmpty()) {
                this.load(new b0(this, 1));
            }
        }
    }

    public KeditorTracker(Context context0, String s, String s1, String s2, String s3, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        Function1 function11 = (v & 0x20) == 0 ? function10 : a.w;
        this(context0, ((v & 2) == 0 ? s : ""), ((v & 4) == 0 ? s1 : ""), ((v & 8) == 0 ? s2 : ""), ((v & 16) == 0 ? s3 : ""), function11);
    }

    public static void a() {
        Intrinsics.checkNotNullExpressionValue("KeditorTracker", "access$getTAG$p(...)");
        Logger.INSTANCE.warn("KeditorTracker", "editor tracker is no longer functional and will only print this message.", new Object[0]);
    }

    public static final EditorTrackerConfig access$getConfig$p(KeditorTracker keditorTracker0) {
        return keditorTracker0.a;
    }

    @Override  // com.kakao.editortracker.EditorTracker
    public void click(@Nullable String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "clickBuilder");
        new EditorInfo(s, null, 2, null);
        function10.invoke(new Action("click", null, null, null, null, null, null, 0x7E, null));
        KeditorTracker.a();
    }

    @Override  // com.kakao.editortracker.EditorTracker
    public void click(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "clickBuilder");
        this.click(this.b, function10);
    }

    @Override  // com.kakao.editortracker.EditorTracker
    public void load(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "editorVersion");
        new EditorInfo(s, null, 2, null);
        new Action("load", null, null, null, null, null, null, 0x7E, null);
        KeditorTracker.a();
    }

    @Override  // com.kakao.editortracker.EditorTracker
    public void load(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "editorBuilder");
        EditorInfo editorInfo0 = new EditorInfo(null, null, 3, null);
        function10.invoke(editorInfo0);
        this.b = editorInfo0.getVersion();
        new Action("load", null, null, null, null, null, null, 0x7E, null);
        KeditorTracker.a();
    }
}

