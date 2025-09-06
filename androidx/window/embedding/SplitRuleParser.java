package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.window.R.styleable;
import androidx.window.core.ExperimentalWindowApi;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalWindowApi
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\'\u0010\f\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000B¨\u0006\r"}, d2 = {"Landroidx/window/embedding/SplitRuleParser;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "staticRuleResourceId", "", "Landroidx/window/embedding/EmbeddingRule;", "parseSplitRules$window_release", "(Landroid/content/Context;I)Ljava/util/Set;", "parseSplitRules", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SplitRuleParser {
    public static ComponentName a(String s, String s1) {
        if(s1 == null || s1.length() == 0) {
            throw new IllegalArgumentException("Activity name must not be null");
        }
        String s2 = s1.toString();
        if(s2.charAt(0) == 46) {
            return new ComponentName(s, s + s2);
        }
        int v = StringsKt__StringsKt.indexOf$default(s2, '/', 0, false, 6, null);
        if(v > 0) {
            s = s2.substring(0, v);
            Intrinsics.checkNotNullExpressionValue(s, "this as java.lang.String…ing(startIndex, endIndex)");
            s2 = s2.substring(v + 1);
            Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String).substring(startIndex)");
        }
        return Intrinsics.areEqual(s2, "*") || StringsKt__StringsKt.indexOf$default(s2, '.', 0, false, 6, null) >= 0 ? new ComponentName(s, s2) : new ComponentName(s, s + '.' + s2);
    }

    @Nullable
    public final Set parseSplitRules$window_release(@NotNull Context context0, int v) {
        SplitPairRule splitPairRule1;
        XmlResourceParser xmlResourceParser0;
        Intrinsics.checkNotNullParameter(context0, "context");
        Resources resources0 = context0.getResources();
        try {
            xmlResourceParser0 = resources0.getXml(v);
            Intrinsics.checkNotNullExpressionValue(xmlResourceParser0, "resources.getXml(splitResourceId)");
        }
        catch(Resources.NotFoundException unused_ex) {
            return null;
        }
        HashSet hashSet0 = new HashSet();
        int v1 = xmlResourceParser0.getDepth();
        int v2 = xmlResourceParser0.next();
        ActivityRule activityRule0 = null;
        SplitPairRule splitPairRule0 = null;
        SplitPlaceholderRule splitPlaceholderRule0 = null;
        while(v2 != 1 && (v2 != 3 || xmlResourceParser0.getDepth() > v1)) {
            if(xmlResourceParser0.getEventType() == 2 && !Intrinsics.areEqual("split-config", xmlResourceParser0.getName())) {
                String s = xmlResourceParser0.getName();
                if(s != null) {
                    switch(s) {
                        case "ActivityFilter": {
                            if(activityRule0 == null && splitPlaceholderRule0 == null) {
                                throw new IllegalArgumentException("Found orphaned ActivityFilter");
                            }
                            TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(xmlResourceParser0, styleable.ActivityFilter, 0, 0);
                            String s1 = typedArray0.getString(styleable.ActivityFilter_activityName);
                            String s2 = typedArray0.getString(styleable.ActivityFilter_activityAction);
                            Intrinsics.checkNotNullExpressionValue("net.daum.android.tistoryapp", "packageName");
                            ActivityFilter activityFilter0 = new ActivityFilter(SplitRuleParser.a("net.daum.android.tistoryapp", s1), s2);
                            if(activityRule0 != null) {
                                hashSet0.remove(activityRule0);
                                ActivityRule activityRule1 = activityRule0.plus$window_release(activityFilter0);
                                hashSet0.add(activityRule1);
                                activityRule0 = activityRule1;
                            }
                            else if(splitPlaceholderRule0 != null) {
                                hashSet0.remove(splitPlaceholderRule0);
                                SplitPlaceholderRule splitPlaceholderRule1 = splitPlaceholderRule0.plus$window_release(activityFilter0);
                                hashSet0.add(splitPlaceholderRule1);
                                splitPlaceholderRule0 = splitPlaceholderRule1;
                            }
                            break;
                        }
                        case "ActivityRule": {
                            activityRule0 = new ActivityRule(f0.emptySet(), context0.getTheme().obtainStyledAttributes(xmlResourceParser0, styleable.ActivityRule, 0, 0).getBoolean(styleable.ActivityRule_alwaysExpand, false));
                            hashSet0.add(activityRule0);
                            splitPairRule0 = null;
                            splitPlaceholderRule0 = null;
                            break;
                        }
                        case "SplitPairFilter": {
                            if(splitPairRule0 == null) {
                                throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                            }
                            TypedArray typedArray2 = context0.getTheme().obtainStyledAttributes(xmlResourceParser0, styleable.SplitPairFilter, 0, 0);
                            String s3 = typedArray2.getString(styleable.SplitPairFilter_primaryActivityName);
                            String s4 = typedArray2.getString(styleable.SplitPairFilter_secondaryActivityName);
                            String s5 = typedArray2.getString(styleable.SplitPairFilter_secondaryActivityAction);
                            Intrinsics.checkNotNullExpressionValue("net.daum.android.tistoryapp", "packageName");
                            SplitPairFilter splitPairFilter0 = new SplitPairFilter(SplitRuleParser.a("net.daum.android.tistoryapp", s3), SplitRuleParser.a("net.daum.android.tistoryapp", s4), s5);
                            hashSet0.remove(splitPairRule0);
                            splitPairRule1 = splitPairRule0.plus$window_release(splitPairFilter0);
                            hashSet0.add(splitPairRule1);
                            splitPairRule0 = splitPairRule1;
                            break;
                        }
                        case "SplitPairRule": {
                            TypedArray typedArray1 = context0.getTheme().obtainStyledAttributes(xmlResourceParser0, styleable.SplitPairRule, 0, 0);
                            float f = typedArray1.getFloat(styleable.SplitPairRule_splitRatio, 0.0f);
                            int v3 = (int)typedArray1.getDimension(styleable.SplitPairRule_splitMinWidth, 0.0f);
                            int v4 = (int)typedArray1.getDimension(styleable.SplitPairRule_splitMinSmallestWidth, 0.0f);
                            int v5 = typedArray1.getInt(styleable.SplitPairRule_splitLayoutDirection, 3);
                            splitPairRule1 = new SplitPairRule(f0.emptySet(), typedArray1.getBoolean(styleable.SplitPairRule_finishPrimaryWithSecondary, false), typedArray1.getBoolean(styleable.SplitPairRule_finishSecondaryWithPrimary, true), typedArray1.getBoolean(styleable.SplitPairRule_clearTop, false), v3, v4, f, v5);
                            hashSet0.add(splitPairRule1);
                            activityRule0 = null;
                            splitPlaceholderRule0 = null;
                            splitPairRule0 = splitPairRule1;
                            break;
                        }
                        case "SplitPlaceholderRule": {
                            TypedArray typedArray3 = context0.getTheme().obtainStyledAttributes(xmlResourceParser0, styleable.SplitPlaceholderRule, 0, 0);
                            String s6 = typedArray3.getString(styleable.SplitPlaceholderRule_placeholderActivityName);
                            float f1 = typedArray3.getFloat(styleable.SplitPlaceholderRule_splitRatio, 0.0f);
                            int v6 = (int)typedArray3.getDimension(styleable.SplitPlaceholderRule_splitMinWidth, 0.0f);
                            int v7 = (int)typedArray3.getDimension(styleable.SplitPlaceholderRule_splitMinSmallestWidth, 0.0f);
                            int v8 = typedArray3.getInt(styleable.SplitPlaceholderRule_splitLayoutDirection, 3);
                            Intrinsics.checkNotNullExpressionValue("net.daum.android.tistoryapp", "packageName");
                            ComponentName componentName0 = SplitRuleParser.a("net.daum.android.tistoryapp", s6);
                            Intent intent0 = new Intent().setComponent(componentName0);
                            Intrinsics.checkNotNullExpressionValue(intent0, "Intent().setComponent(pl…eholderActivityClassName)");
                            SplitPlaceholderRule splitPlaceholderRule2 = new SplitPlaceholderRule(f0.emptySet(), intent0, v6, v7, f1, v8);
                            hashSet0.add(splitPlaceholderRule2);
                            splitPairRule0 = null;
                            splitPlaceholderRule0 = splitPlaceholderRule2;
                            activityRule0 = null;
                        }
                    }
                }
            }
            v2 = xmlResourceParser0.next();
        }
        return hashSet0;
    }
}

