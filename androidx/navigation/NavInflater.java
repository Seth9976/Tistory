package androidx.navigation;

import a5.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.navigation.common.R.styleable;
import jeb.synthetic.TWR;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000B\u001A\u00020\n2\b\b\u0001\u0010\t\u001A\u00020\bH\u0007¢\u0006\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Landroidx/navigation/NavInflater;", "", "Landroid/content/Context;", "context", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "<init>", "(Landroid/content/Context;Landroidx/navigation/NavigatorProvider;)V", "", "graphResId", "Landroidx/navigation/NavGraph;", "inflate", "(I)Landroidx/navigation/NavGraph;", "Companion", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavInflater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavInflater.kt\nandroidx/navigation/NavInflater\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 4 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,365:1\n1#2:366\n232#3,3:367\n232#3,3:370\n232#3,3:373\n232#3,3:376\n55#4,6:379\n*S KotlinDebug\n*F\n+ 1 NavInflater.kt\nandroidx/navigation/NavInflater\n*L\n110#1:367,3\n128#1:370,3\n144#1:373,3\n261#1:376,3\n295#1:379,6\n*E\n"})
public final class NavInflater {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001JG\u0010\f\u001A\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001A\u00020\u00022\f\u0010\u0005\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00042\n\u0010\u0006\u001A\u0006\u0012\u0002\b\u00030\u00042\b\u0010\b\u001A\u0004\u0018\u00010\u00072\u0006\u0010\t\u001A\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000BR\u0014\u0010\r\u001A\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u000ER\u0014\u0010\u000F\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000F\u0010\u000ER\u0014\u0010\u0010\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000ER\u0014\u0010\u0011\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000ER\u0014\u0010\u0012\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000ER\u001A\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/navigation/NavInflater$Companion;", "", "Landroid/util/TypedValue;", "value", "Landroidx/navigation/NavType;", "navType", "expectedNavType", "", "argType", "foundType", "checkNavType$navigation_runtime_release", "(Landroid/util/TypedValue;Landroidx/navigation/NavType;Landroidx/navigation/NavType;Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavType;", "checkNavType", "APPLICATION_ID_PLACEHOLDER", "Ljava/lang/String;", "TAG_ACTION", "TAG_ARGUMENT", "TAG_DEEP_LINK", "TAG_INCLUDE", "Ljava/lang/ThreadLocal;", "sTmpValue", "Ljava/lang/ThreadLocal;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final NavType checkNavType$navigation_runtime_release(@NotNull TypedValue typedValue0, @Nullable NavType navType0, @NotNull NavType navType1, @Nullable String s, @NotNull String s1) throws XmlPullParserException {
            Intrinsics.checkNotNullParameter(typedValue0, "value");
            Intrinsics.checkNotNullParameter(navType1, "expectedNavType");
            Intrinsics.checkNotNullParameter(s1, "foundType");
            if(navType0 != null && navType0 != navType1) {
                StringBuilder stringBuilder0 = b.w("Type is ", s, " but found ", s1, ": ");
                stringBuilder0.append(typedValue0.data);
                throw new XmlPullParserException(stringBuilder0.toString());
            }
            return navType0 == null ? navType1 : navType0;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public static final String APPLICATION_ID_PLACEHOLDER = "${applicationId}";
    @NotNull
    public static final Companion Companion;
    public final Context a;
    public final NavigatorProvider b;
    public static final ThreadLocal c;

    static {
        NavInflater.Companion = new Companion(null);
        NavInflater.c = new ThreadLocal();
    }

    public NavInflater(@NotNull Context context0, @NotNull NavigatorProvider navigatorProvider0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(navigatorProvider0, "navigatorProvider");
        super();
        this.a = context0;
        this.b = navigatorProvider0;
    }

    public final NavDestination a(Resources resources0, XmlResourceParser xmlResourceParser0, AttributeSet attributeSet0, int v) {
        Builder navDeepLink$Builder1;
        String s = xmlResourceParser0.getName();
        Intrinsics.checkNotNullExpressionValue(s, "parser.name");
        NavDestination navDestination0 = this.b.getNavigator(s).createDestination();
        Context context0 = this.a;
        navDestination0.onInflate(context0, attributeSet0);
        int v1 = xmlResourceParser0.getDepth() + 1;
        int v2;
        while((v2 = xmlResourceParser0.next()) != 1) {
            int v3 = xmlResourceParser0.getDepth();
            if(v3 < v1 && v2 == 3) {
                break;
            }
            if(v2 == 2 && v3 <= v1) {
                String s1 = xmlResourceParser0.getName();
                if(Intrinsics.areEqual("argument", s1)) {
                    TypedArray typedArray0 = resources0.obtainAttributes(attributeSet0, styleable.NavArgument);
                    Intrinsics.checkNotNullExpressionValue(typedArray0, "res.obtainAttributes(att… R.styleable.NavArgument)");
                    String s2 = typedArray0.getString(styleable.NavArgument_android_name);
                    if(s2 == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    Intrinsics.checkNotNullExpressionValue(s2, "array.getString(R.stylea…uments must have a name\")");
                    navDestination0.addArgument(s2, NavInflater.b(typedArray0, resources0, v));
                    typedArray0.recycle();
                    continue;
                }
                if(Intrinsics.areEqual("deepLink", s1)) {
                    TypedArray typedArray1 = resources0.obtainAttributes(attributeSet0, styleable.NavDeepLink);
                    Intrinsics.checkNotNullExpressionValue(typedArray1, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
                    String s3 = typedArray1.getString(styleable.NavDeepLink_uri);
                    String s4 = typedArray1.getString(styleable.NavDeepLink_action);
                    String s5 = typedArray1.getString(styleable.NavDeepLink_mimeType);
                    if((s3 == null || s3.length() == 0) && (s4 == null || s4.length() == 0) && (s5 == null || s5.length() == 0)) {
                        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                    }
                    Builder navDeepLink$Builder0 = new Builder();
                    if(s3 == null) {
                        navDeepLink$Builder1 = navDeepLink$Builder0;
                    }
                    else {
                        Intrinsics.checkNotNullExpressionValue("net.daum.android.tistoryapp", "context.packageName");
                        navDeepLink$Builder1 = navDeepLink$Builder0;
                        navDeepLink$Builder1.setUriPattern(p.replace$default(s3, "${applicationId}", "net.daum.android.tistoryapp", false, 4, null));
                    }
                    if(s4 != null && s4.length() != 0) {
                        Intrinsics.checkNotNullExpressionValue("net.daum.android.tistoryapp", "context.packageName");
                        navDeepLink$Builder1.setAction(p.replace$default(s4, "${applicationId}", "net.daum.android.tistoryapp", false, 4, null));
                    }
                    if(s5 != null) {
                        Intrinsics.checkNotNullExpressionValue("net.daum.android.tistoryapp", "context.packageName");
                        navDeepLink$Builder1.setMimeType(p.replace$default(s5, "${applicationId}", "net.daum.android.tistoryapp", false, 4, null));
                    }
                    navDestination0.addDeepLink(navDeepLink$Builder1.build());
                    typedArray1.recycle();
                    continue;
                }
                if(Intrinsics.areEqual("action", s1)) {
                    int[] arr_v = styleable.NavAction;
                    Intrinsics.checkNotNullExpressionValue(arr_v, "NavAction");
                    TypedArray typedArray2 = context0.obtainStyledAttributes(attributeSet0, arr_v, 0, 0);
                    int v4 = typedArray2.getResourceId(styleable.NavAction_android_id, 0);
                    NavAction navAction0 = new NavAction(typedArray2.getResourceId(styleable.NavAction_destination, 0), null, null, 6, null);
                    androidx.navigation.NavOptions.Builder navOptions$Builder0 = new androidx.navigation.NavOptions.Builder();
                    navOptions$Builder0.setLaunchSingleTop(typedArray2.getBoolean(styleable.NavAction_launchSingleTop, false));
                    navOptions$Builder0.setRestoreState(typedArray2.getBoolean(styleable.NavAction_restoreState, false));
                    navOptions$Builder0.setPopUpTo(typedArray2.getResourceId(styleable.NavAction_popUpTo, -1), typedArray2.getBoolean(styleable.NavAction_popUpToInclusive, false), typedArray2.getBoolean(styleable.NavAction_popUpToSaveState, false));
                    navOptions$Builder0.setEnterAnim(typedArray2.getResourceId(styleable.NavAction_enterAnim, -1));
                    navOptions$Builder0.setExitAnim(typedArray2.getResourceId(styleable.NavAction_exitAnim, -1));
                    navOptions$Builder0.setPopEnterAnim(typedArray2.getResourceId(styleable.NavAction_popEnterAnim, -1));
                    navOptions$Builder0.setPopExitAnim(typedArray2.getResourceId(styleable.NavAction_popExitAnim, -1));
                    navAction0.setNavOptions(navOptions$Builder0.build());
                    Bundle bundle0 = new Bundle();
                    int v5 = xmlResourceParser0.getDepth() + 1;
                    int v6;
                    while((v6 = xmlResourceParser0.next()) != 1) {
                        int v7 = xmlResourceParser0.getDepth();
                        if(v7 < v5 && v6 == 3) {
                            break;
                        }
                        if(v6 == 2 && v7 <= v5 && Intrinsics.areEqual("argument", xmlResourceParser0.getName())) {
                            TypedArray typedArray3 = resources0.obtainAttributes(attributeSet0, styleable.NavArgument);
                            Intrinsics.checkNotNullExpressionValue(typedArray3, "res.obtainAttributes(att… R.styleable.NavArgument)");
                            String s6 = typedArray3.getString(styleable.NavArgument_android_name);
                            if(s6 == null) {
                                throw new XmlPullParserException("Arguments must have a name");
                            }
                            Intrinsics.checkNotNullExpressionValue(s6, "array.getString(R.stylea…uments must have a name\")");
                            NavArgument navArgument0 = NavInflater.b(typedArray3, resources0, v);
                            if(navArgument0.isDefaultValuePresent()) {
                                navArgument0.putDefaultValue(s6, bundle0);
                            }
                            typedArray3.recycle();
                        }
                    }
                    if(!bundle0.isEmpty()) {
                        navAction0.setDefaultArguments(bundle0);
                    }
                    navDestination0.putAction(v4, navAction0);
                    typedArray2.recycle();
                }
                else if(Intrinsics.areEqual("include", s1) && navDestination0 instanceof NavGraph) {
                    TypedArray typedArray4 = resources0.obtainAttributes(attributeSet0, androidx.navigation.R.styleable.NavInclude);
                    Intrinsics.checkNotNullExpressionValue(typedArray4, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((NavGraph)navDestination0).addDestination(this.inflate(typedArray4.getResourceId(androidx.navigation.R.styleable.NavInclude_graph, 0)));
                    typedArray4.recycle();
                }
                else if(navDestination0 instanceof NavGraph) {
                    ((NavGraph)navDestination0).addDestination(this.a(resources0, xmlResourceParser0, attributeSet0, v));
                }
            }
        }
        return navDestination0;
    }

    public static NavArgument b(TypedArray typedArray0, Resources resources0, int v) {
        NavType navType0;
        androidx.navigation.NavArgument.Builder navArgument$Builder0 = new androidx.navigation.NavArgument.Builder();
        int v1 = 0;
        navArgument$Builder0.setIsNullable(typedArray0.getBoolean(styleable.NavArgument_nullable, false));
        ThreadLocal threadLocal0 = NavInflater.c;
        TypedValue typedValue0 = (TypedValue)threadLocal0.get();
        if(typedValue0 == null) {
            typedValue0 = new TypedValue();
            threadLocal0.set(typedValue0);
        }
        String s = typedArray0.getString(styleable.NavArgument_argType);
        Object object0 = null;
        if(s == null) {
            navType0 = null;
        }
        else {
            String s1 = resources0.getResourcePackageName(v);
            navType0 = NavType.Companion.fromArgType(s, s1);
        }
        if(typedArray0.getValue(styleable.NavArgument_android_defaultValue, typedValue0)) {
            NavType navType1 = NavType.ReferenceType;
            if(navType0 == navType1) {
                int v2 = typedValue0.resourceId;
                if(v2 == 0) {
                    if(typedValue0.type != 16 || typedValue0.data != 0) {
                        throw new XmlPullParserException("unsupported value \'" + typedValue0.string + "\' for " + "nav_type" + ". Must be a reference to a resource.");
                    }
                    object0 = 0;
                }
                else {
                    object0 = v2;
                }
            }
            else {
                int v3 = typedValue0.resourceId;
                if(v3 != 0) {
                    if(navType0 != null) {
                        throw new XmlPullParserException("unsupported value \'" + typedValue0.string + "\' for " + "nav_type" + ". You must use a \"" + "nav_type" + "\" type to reference other resources.");
                    }
                    object0 = v3;
                    navType0 = navType1;
                }
                else if(navType0 == NavType.StringType) {
                    object0 = typedArray0.getString(styleable.NavArgument_android_defaultValue);
                }
                else {
                    int v4 = typedValue0.type;
                    switch(v4) {
                        case 3: {
                            String s2 = typedValue0.string.toString();
                            if(navType0 == null) {
                                navType0 = NavType.Companion.inferFromValue(s2);
                            }
                            object0 = navType0.parseValue(s2);
                            break;
                        }
                        case 4: {
                            navType0 = NavInflater.Companion.checkNavType$navigation_runtime_release(typedValue0, navType0, NavType.FloatType, s, "float");
                            object0 = typedValue0.getFloat();
                            break;
                        }
                        case 5: {
                            navType0 = NavInflater.Companion.checkNavType$navigation_runtime_release(typedValue0, navType0, NavType.IntType, s, "dimension");
                            object0 = (int)typedValue0.getDimension(resources0.getDisplayMetrics());
                            break;
                        }
                        case 18: {
                            navType0 = NavInflater.Companion.checkNavType$navigation_runtime_release(typedValue0, navType0, NavType.BoolType, s, "boolean");
                            if(typedValue0.data != 0) {
                                v1 = 1;
                            }
                            object0 = Boolean.valueOf(((boolean)v1));
                            break;
                        }
                        default: {
                            if(v4 < 16 || v4 > 0x1F) {
                                throw new XmlPullParserException("unsupported argument type " + typedValue0.type);
                            }
                            NavType navType2 = NavType.FloatType;
                            if(navType0 == navType2) {
                                navType0 = NavInflater.Companion.checkNavType$navigation_runtime_release(typedValue0, navType0, navType2, s, "float");
                                object0 = (float)typedValue0.data;
                            }
                            else {
                                navType0 = NavInflater.Companion.checkNavType$navigation_runtime_release(typedValue0, navType0, NavType.IntType, s, "integer");
                                object0 = typedValue0.data;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if(object0 != null) {
            navArgument$Builder0.setDefaultValue(object0);
        }
        if(navType0 != null) {
            navArgument$Builder0.setType(navType0);
        }
        return navArgument$Builder0.build();
    }

    @SuppressLint({"ResourceType"})
    @NotNull
    public final NavGraph inflate(@NavigationRes int v) {
        NavGraph navGraph0;
        Resources resources0 = this.a.getResources();
        XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
        Intrinsics.checkNotNullExpressionValue(xmlResourceParser0, "res.getXml(graphResId)");
        AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
        try {
            try {
                do {
                    int v1 = xmlResourceParser0.next();
                }
                while(v1 != 1 && v1 != 2);
                if(v1 != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String s = xmlResourceParser0.getName();
                Intrinsics.checkNotNullExpressionValue(resources0, "res");
                Intrinsics.checkNotNullExpressionValue(attributeSet0, "attrs");
                NavDestination navDestination0 = this.a(resources0, xmlResourceParser0, attributeSet0, v);
                if(!(navDestination0 instanceof NavGraph)) {
                    throw new IllegalArgumentException(("Root element <" + s + "> did not inflate into a NavGraph").toString());
                }
                navGraph0 = (NavGraph)navDestination0;
            }
            catch(Exception exception0) {
                throw new RuntimeException("Exception inflating " + resources0.getResourceName(v) + " line " + xmlResourceParser0.getLineNumber(), exception0);
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(xmlResourceParser0, throwable0);
            throw throwable0;
        }
        xmlResourceParser0.close();
        return navGraph0;
    }
}

