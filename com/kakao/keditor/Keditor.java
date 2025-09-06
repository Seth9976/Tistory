package com.kakao.keditor;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import androidx.core.content.res.ResourcesCompat;
import androidx.room.a;
import com.kakao.editortracker.EditorTrackDomain;
import com.kakao.editortracker.EditorTracker;
import com.kakao.editortracker.EditorTrackerConfig.Builder;
import com.kakao.editortracker.KeditorTracker;
import com.kakao.editortracker.data.Action;
import com.kakao.keditor.config.KeditorConfigKt;
import com.kakao.keditor.delegate.ImageLoader;
import com.kakao.keditor.extension.PackageManagerKt;
import com.kakao.keditor.plugin.itemspec.ItemSpecs;
import com.kakao.keditor.plugin.pluginspec.PluginSpec;
import com.kakao.keditor.plugin.pluginspec.PluginSpecs;
import com.kakao.keditor.standard.KeditorStandardKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u00C6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00A2\u0006\u0002\u0010\u0002J(\u0010/\u001A\u0002002\b\u00101\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u00103\u001A\u0004\u0018\u00010\u0005J2\u00104\u001A\u0002002\b\u00105\u001A\u0004\u0018\u00010\u00052\b\u00101\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u00103\u001A\u0004\u0018\u00010\u0005J8\u0010\u0006\u001A\u0004\u0018\u0001H6\"\u0006\b\u0000\u00106\u0018\u00012\n\b\u0002\u00107\u001A\u0004\u0018\u00010)2\u0006\u00108\u001A\u00020\u00052\n\b\u0002\u00109\u001A\u0004\u0018\u0001H6H\u0086\b\u00A2\u0006\u0002\u0010:J\u0010\u0010;\u001A\u0004\u0018\u00010*2\u0006\u00107\u001A\u00020)J\b\u0010<\u001A\u0004\u0018\u00010=J\u000E\u0010>\u001A\u0002002\u0006\u0010?\u001A\u00020*JW\u0010@\u001A\u0002002\u0006\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010A\u001A\u00020\u00052\n\b\u0002\u0010\u0019\u001A\u0004\u0018\u00010\u001A2\u0016\u0010$\u001A\u0012\u0012\u000E\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\'0&0%2\u0012\u0010-\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0&0%H\u0000\u00A2\u0006\u0002\bBJ\u000E\u0010C\u001A\u0002002\u0006\u00105\u001A\u00020\u0005J\u000E\u0010D\u001A\u0002002\u0006\u0010E\u001A\u00020\u0005J\b\u0010F\u001A\u0004\u0018\u00010\u0005J\f\u0010G\u001A\u00020\u001F*\u00020*H\u0002J\u0014\u0010H\u001A\u000200*\u00020\u00012\b\u0010H\u001A\u0004\u0018\u00010\u0001J\u0011\u0010I\u001A\u000200*\u00020*H\u0000\u00A2\u0006\u0002\bJJ\u0011\u0010K\u001A\u000200*\u00020*H\u0000\u00A2\u0006\u0002\bLR\u001A\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004X\u0082.\u00A2\u0006\u0002\n\u0000R\u001D\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00078F\u00A2\u0006\u0006\u001A\u0004\b\b\u0010\tR\u001A\u0010\n\u001A\u00020\u000BX\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\"\u0010\u0012\u001A\u0004\u0018\u00010\u00112\b\u0010\u0010\u001A\u0004\u0018\u00010\u0011@BX\u0086\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001A\u00020\u0016X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0018R\u001C\u0010\u0019\u001A\u0004\u0018\u00010\u001AX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER$\u0010 \u001A\u00020\u001F2\u0006\u0010\u0010\u001A\u00020\u001F@@X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001E\u0010$\u001A\u0012\u0012\u000E\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\'0&0%X\u0082.\u00A2\u0006\u0002\n\u0000R\u001A\u0010(\u001A\u000E\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R)\u0010+\u001A\u001A\u0012\u0004\u0012\u00020)\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00070\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b,\u0010\tR\u001A\u0010-\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0&0%X\u0082.\u00A2\u0006\u0002\n\u0000\u00A8\u0006M"}, d2 = {"Lcom/kakao/keditor/Keditor;", "", "()V", "_config", "", "", "config", "", "getConfig", "()Ljava/util/Map;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "<set-?>", "Lcom/kakao/editortracker/EditorTracker;", "editorTracker", "getEditorTracker", "()Lcom/kakao/editortracker/EditorTracker;", "idGenerator", "Ljava/util/concurrent/atomic/AtomicInteger;", "getIdGenerator$keditor_release", "()Ljava/util/concurrent/atomic/AtomicInteger;", "imageLoader", "Lcom/kakao/keditor/delegate/ImageLoader;", "getImageLoader", "()Lcom/kakao/keditor/delegate/ImageLoader;", "setImageLoader", "(Lcom/kakao/keditor/delegate/ImageLoader;)V", "", "isDebugMode", "()Z", "setDebugMode$keditor_release", "(Z)V", "itemSpecListFunction", "Lkotlin/Function0;", "", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "keditorViews", "", "Lcom/kakao/keditor/KeditorView;", "localConfigs", "getLocalConfigs", "pluginSpecListFunction", "Lcom/kakao/keditor/plugin/pluginspec/PluginSpec;", "clickEvent", "", "layer1", "layer2", "layer3", "clickEventWithVersion", "editorVersion", "T", "editorId", "key", "defaultValue", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "findKeditorView", "getCustomFont", "Landroid/graphics/Typeface;", "initEditorView", "keditorView", "initialize", "configFile", "initialize$keditor_release", "loadEventWithVersion", "setCustomFont", "fontName", "version", "isRegistered", "log", "register", "register$keditor_release", "unregister", "unregister$keditor_release", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKeditor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Keditor.kt\ncom/kakao/keditor/Keditor\n*L\n1#1,214:1\n136#1,12:215\n136#1,12:227\n136#1,12:239\n136#1,12:251\n*S KotlinDebug\n*F\n+ 1 Keditor.kt\ncom/kakao/keditor/Keditor\n*L\n103#1:215,12\n104#1:227,12\n105#1:239,12\n106#1:251,12\n*E\n"})
public final class Keditor {
    @NotNull
    public static final Keditor INSTANCE;
    private static Map _config;
    public static Context context;
    @Nullable
    private static EditorTracker editorTracker;
    @NotNull
    private static final AtomicInteger idGenerator;
    @Nullable
    private static ImageLoader imageLoader;
    private static boolean isDebugMode;
    private static Function0 itemSpecListFunction;
    @NotNull
    private static final Map keditorViews;
    @NotNull
    private static final Map localConfigs;
    private static Function0 pluginSpecListFunction;

    static {
        Keditor.INSTANCE = new Keditor();
        Keditor.idGenerator = new AtomicInteger();
        Keditor.keditorViews = new LinkedHashMap();
        Keditor.localConfigs = new LinkedHashMap();
    }

    public final void clickEvent(@Nullable String s, @Nullable String s1, @Nullable String s2) {
        EditorTracker editorTracker0 = Keditor.editorTracker;
        if(editorTracker0 != null) {
            editorTracker0.click(new Function1(s1, s2) {
                final String $layer1;
                final String $layer2;
                final String $layer3;

                {
                    this.$layer1 = s;
                    this.$layer2 = s1;
                    this.$layer3 = s2;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((Action)object0));
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Action action0) {
                    Intrinsics.checkNotNullParameter(action0, "$this$click");
                    action0.setLayer1(this.$layer1);
                    action0.setLayer2(this.$layer2);
                    action0.setLayer3(this.$layer3);
                }
            });
        }
    }

    public static void clickEvent$default(Keditor keditor0, String s, String s1, String s2, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            s2 = null;
        }
        keditor0.clickEvent(s, s1, s2);
    }

    public final void clickEventWithVersion(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3) {
        EditorTracker editorTracker0 = Keditor.editorTracker;
        if(editorTracker0 != null) {
            editorTracker0.click(s, new Function1(s2, s3) {
                final String $layer1;
                final String $layer2;
                final String $layer3;

                {
                    this.$layer1 = s;
                    this.$layer2 = s1;
                    this.$layer3 = s2;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((Action)object0));
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Action action0) {
                    Intrinsics.checkNotNullParameter(action0, "$this$click");
                    action0.setLayer1(this.$layer1);
                    action0.setLayer2(this.$layer2);
                    action0.setLayer3(this.$layer3);
                }
            });
        }
    }

    public static void clickEventWithVersion$default(Keditor keditor0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 4) != 0) {
            s2 = null;
        }
        if((v & 8) != 0) {
            s3 = null;
        }
        keditor0.clickEventWithVersion(s, s1, s2, s3);
    }

    public final Object config(Integer integer0, String s, Object object0) {
        Object object1;
        Intrinsics.checkNotNullParameter(s, "key");
        if(integer0 != null && KeditorStandardKt.getOr(this.getLocalConfigs(), integer0, null) != null && ((Map)a.g(this, integer0)).containsKey(s)) {
            object1 = ((Map)a.g(this, integer0)).get(s);
            Intrinsics.reifiedOperationMarker(2, "T");
            return object1 == null ? object0 : object1;
        }
        object1 = this.getConfig().get(s);
        Intrinsics.reifiedOperationMarker(2, "T");
        return object1 == null ? object0 : object1;
    }

    public static Object config$default(Keditor keditor0, Integer integer0, String s, Object object0, int v, Object object1) {
        Object object2;
        if((v & 1) != 0) {
            integer0 = null;
        }
        if((v & 4) != 0) {
            object0 = null;
        }
        Intrinsics.checkNotNullParameter(s, "key");
        if(integer0 != null && KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) != null && ((Map)a.g(keditor0, integer0)).containsKey(s)) {
            object2 = ((Map)a.g(keditor0, integer0)).get(s);
            Intrinsics.reifiedOperationMarker(2, "T");
            return object2 == null ? object0 : object2;
        }
        object2 = keditor0.getConfig().get(s);
        Intrinsics.reifiedOperationMarker(2, "T");
        return object2 == null ? object0 : object2;
    }

    @Nullable
    public final KeditorView findKeditorView(int v) {
        return (KeditorView)Keditor.keditorViews.get(v);
    }

    @NotNull
    public final Map getConfig() {
        Map map0 = Keditor._config;
        if(map0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_config");
            return null;
        }
        return map0;
    }

    @NotNull
    public final Context getContext() {
        Context context0 = Keditor.context;
        if(context0 != null) {
            return context0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    @Nullable
    public final Typeface getCustomFont() {
        Map map0 = Keditor._config;
        String s = null;
        if(map0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_config");
            map0 = null;
        }
        if(KeditorStandardKt.getOr(map0, "custom_font", null) != null) {
            Context context0 = this.getContext();
            Resources resources0 = this.getContext().getResources();
            Map map1 = Keditor._config;
            if(map1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_config");
                map1 = null;
            }
            Object object0 = KeditorStandardKt.getOr(map1, "custom_font", null);
            if(object0 != null) {
                s = object0.toString();
            }
            return ResourcesCompat.getFont(context0, resources0.getIdentifier(s, "font", "net.daum.android.tistoryapp"));
        }
        return Typeface.DEFAULT;
    }

    @Nullable
    public final EditorTracker getEditorTracker() {
        return Keditor.editorTracker;
    }

    @NotNull
    public final AtomicInteger getIdGenerator$keditor_release() {
        return Keditor.idGenerator;
    }

    @Nullable
    public final ImageLoader getImageLoader() {
        return Keditor.imageLoader;
    }

    @NotNull
    public final Map getLocalConfigs() {
        return Keditor.localConfigs;
    }

    public final void initEditorView(@NotNull KeditorView keditorView0) {
        Intrinsics.checkNotNullParameter(keditorView0, "keditorView");
        PluginSpecs pluginSpecs0 = new PluginSpecs(this.getContext());
        Function0 function00 = Keditor.pluginSpecListFunction;
        Function0 function01 = null;
        if(function00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pluginSpecListFunction");
            function00 = null;
        }
        pluginSpecs0.add(((List)function00.invoke()));
        ItemSpecs itemSpecs0 = new ItemSpecs(this.getContext());
        Function0 function02 = Keditor.itemSpecListFunction;
        if(function02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemSpecListFunction");
        }
        else {
            function01 = function02;
        }
        itemSpecs0.add(((List)function01.invoke()));
        keditorView0.initWithPlugins(pluginSpecs0, itemSpecs0);
    }

    public final void initialize$keditor_release(@NotNull Context context0, @NotNull String s, @Nullable ImageLoader imageLoader0, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(s, "configFile");
        Intrinsics.checkNotNullParameter(function00, "itemSpecListFunction");
        Intrinsics.checkNotNullParameter(function01, "pluginSpecListFunction");
        Keditor.INSTANCE.setContext(context0);
        Keditor.imageLoader = imageLoader0;
        Map map0 = KeditorConfigKt.loadConfig(this, s);
        if(map0 != null) {
            Map map1 = x.toMutableMap(map0);
            if(map1 != null) {
                Keditor._config = map1;
                Keditor.itemSpecListFunction = function00;
                Keditor.pluginSpecListFunction = function01;
                return;
            }
        }
        throw new Exception("Missing config");
    }

    public static void initialize$keditor_release$default(Keditor keditor0, Context context0, String s, ImageLoader imageLoader0, Function0 function00, Function0 function01, int v, Object object0) {
        if((v & 2) != 0) {
            s = "keditor/ke_config_internal.json";
        }
        if((v & 4) != 0) {
            imageLoader0 = null;
        }
        keditor0.initialize$keditor_release(context0, s, imageLoader0, function00, function01);
    }

    public final boolean isDebugMode() [...] // 潜在的解密器

    private final boolean isRegistered(KeditorView keditorView0) {
        Integer integer0 = keditorView0.getEditorId();
        return Keditor.keditorViews.containsKey(integer0);
    }

    public final void loadEventWithVersion(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "editorVersion");
        EditorTracker editorTracker0 = Keditor.editorTracker;
        if(editorTracker0 != null) {
            editorTracker0.load(s);
        }
    }

    public final void log(@NotNull Object object0, @Nullable Object object1) {
        Intrinsics.checkNotNullParameter(object0, "<this>");
        if(Keditor.isDebugMode) {
            Log.d("Keditor", String.valueOf(object1));
        }
    }

    public final void register$keditor_release(@NotNull KeditorView keditorView0) {
        String s4;
        String s3;
        String s2;
        String s1;
        Intrinsics.checkNotNullParameter(keditorView0, "<this>");
        if(!this.isRegistered(keditorView0)) {
            Keditor.keditorViews.put(keditorView0.getEditorId(), keditorView0);
            Map map0 = keditorView0.getEditorConfig$keditor_release();
            if(map0 != null) {
                Keditor.localConfigs.put(keditorView0.getEditorId(), map0);
            }
            Context context0 = keditorView0.getContext();
            Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
            Integer integer0 = keditorView0.getEditorId();
            String s = null;
            if(KeditorStandardKt.getOr(this.getLocalConfigs(), integer0, null) == null || !((Map)a.g(this, integer0)).containsKey("service_key")) {
                Object object1 = this.getConfig().get("service_key");
                if(!(object1 instanceof String)) {
                    object1 = null;
                }
                s1 = (String)object1;
            }
            else {
                Object object0 = ((Map)a.g(this, integer0)).get("service_key");
                if(!(object0 instanceof String)) {
                    object0 = null;
                }
                s1 = (String)object0;
            }
            if(s1 == null) {
                s1 = null;
            }
            Integer integer1 = keditorView0.getEditorId();
            if(KeditorStandardKt.getOr(this.getLocalConfigs(), integer1, null) == null || !((Map)a.g(this, integer1)).containsKey("service_domain")) {
                Object object3 = this.getConfig().get("service_domain");
                if(!(object3 instanceof String)) {
                    object3 = null;
                }
                s2 = (String)object3;
            }
            else {
                Object object2 = ((Map)a.g(this, integer1)).get("service_domain");
                if(!(object2 instanceof String)) {
                    object2 = null;
                }
                s2 = (String)object2;
            }
            if(s2 == null) {
                s2 = null;
            }
            Integer integer2 = keditorView0.getEditorId();
            if(KeditorStandardKt.getOr(this.getLocalConfigs(), integer2, null) == null || !((Map)a.g(this, integer2)).containsKey("service_referrer")) {
                Object object5 = this.getConfig().get("service_referrer");
                if(!(object5 instanceof String)) {
                    object5 = null;
                }
                s3 = (String)object5;
            }
            else {
                Object object4 = ((Map)a.g(this, integer2)).get("service_referrer");
                if(!(object4 instanceof String)) {
                    object4 = null;
                }
                s3 = (String)object4;
            }
            if(s3 == null) {
                s3 = null;
            }
            Integer integer3 = keditorView0.getEditorId();
            if(KeditorStandardKt.getOr(this.getLocalConfigs(), integer3, null) == null || !((Map)a.g(this, integer3)).containsKey("service_version_name")) {
                Object object7 = this.getConfig().get("service_version_name");
                if(!(object7 instanceof String)) {
                    object7 = null;
                }
                s4 = (String)object7;
            }
            else {
                Object object6 = ((Map)a.g(this, integer3)).get("service_version_name");
                if(!(object6 instanceof String)) {
                    object6 = null;
                }
                s4 = (String)object6;
            }
            if(s4 != null) {
                s = s4;
            }
            Keditor.editorTracker = new KeditorTracker(context0, (s1 == null ? "" : s1), (s2 == null ? "" : s2), (s3 == null ? "" : s3), (s == null ? "" : s), new Function1() {
                final KeditorView $this_register;

                {
                    this.$this_register = keditorView0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((Builder)object0));
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Builder editorTrackerConfig$Builder0) {
                    Intrinsics.checkNotNullParameter(editorTrackerConfig$Builder0, "$this$$receiver");
                    editorTrackerConfig$Builder0.setDebugMode(false);
                    editorTrackerConfig$Builder0.setEditorVersion("ke-android-0.24.0");
                    Iterable iterable0 = this.$this_register.getPluginSpecs().getPlugins();
                    ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
                    for(Object object0: iterable0) {
                        arrayList0.add(((PluginSpec)object0).type());
                    }
                    editorTrackerConfig$Builder0.setEditorPlugins(arrayList0);
                    editorTrackerConfig$Builder0.setTrackDomain(EditorTrackDomain.Companion.from(editorTrackerConfig$Builder0.isDebugMode()));
                }
            });
        }
    }

    public final void setContext(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "<set-?>");
        Keditor.context = context0;
    }

    public final void setCustomFont(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "fontName");
        Map map0 = Keditor._config;
        if(map0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_config");
            map0 = null;
        }
        map0.put("custom_font", s);
    }

    public final void setDebugMode$keditor_release(boolean z) {
        Keditor.isDebugMode = z;
    }

    public final void setImageLoader(@Nullable ImageLoader imageLoader0) {
        Keditor.imageLoader = imageLoader0;
    }

    public final void unregister$keditor_release(@NotNull KeditorView keditorView0) {
        Intrinsics.checkNotNullParameter(keditorView0, "<this>");
        if(this.isRegistered(keditorView0)) {
            Keditor.keditorViews.remove(keditorView0.getEditorId());
            Keditor.localConfigs.remove(keditorView0.getEditorId());
            Keditor.editorTracker = null;
        }
    }

    @Nullable
    public final String version() {
        PackageManager packageManager0 = this.getContext().getPackageManager();
        if(packageManager0 != null) {
            Intrinsics.checkNotNullExpressionValue("net.daum.android.tistoryapp", "getPackageName(...)");
            PackageInfo packageInfo0 = PackageManagerKt.getPackageInfoCompat(packageManager0, "net.daum.android.tistoryapp", 0);
            return packageInfo0 == null ? null : packageInfo0.versionName;
        }
        return null;
    }
}

