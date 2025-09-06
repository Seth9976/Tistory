package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import d7.a;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@KeepForSdk
@VisibleForTesting
public final class JsonUtils {
    public static final Pattern a;
    public static final Pattern b;

    static {
        JsonUtils.a = Pattern.compile("\\\\.");
        JsonUtils.b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    }

    @KeepForSdk
    public static boolean areJsonValuesEquivalent(@Nullable Object object0, @Nullable Object object1) {
        if(object0 == null && object1 == null) {
            return true;
        }
        if(object0 != null && object1 != null) {
            if(object0 instanceof JSONObject && object1 instanceof JSONObject) {
                JSONObject jSONObject0 = (JSONObject)object0;
                JSONObject jSONObject1 = (JSONObject)object1;
                if(jSONObject0.length() != jSONObject1.length()) {
                    return false;
                }
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    String s = (String)object2;
                    if(!jSONObject1.has(s)) {
                        return false;
                    }
                    try {
                        Preconditions.checkNotNull(s);
                        if(!JsonUtils.areJsonValuesEquivalent(jSONObject0.get(s), jSONObject1.get(s))) {
                            return false;
                        }
                    }
                    catch(JSONException unused_ex) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
                return true;
            }
            if(object0 instanceof JSONArray && object1 instanceof JSONArray) {
                JSONArray jSONArray0 = (JSONArray)object0;
                JSONArray jSONArray1 = (JSONArray)object1;
                if(jSONArray0.length() == jSONArray1.length()) {
                    int v = 0;
                    while(v < jSONArray0.length()) {
                        try {
                            if(!JsonUtils.areJsonValuesEquivalent(jSONArray0.get(v), jSONArray1.get(v))) {
                                return false;
                            }
                            ++v;
                            continue;
                        }
                        catch(JSONException unused_ex) {
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return object0.equals(object1);
        }
        return false;
    }

    @Nullable
    @KeepForSdk
    public static String escapeString(@Nullable String s) {
        if(!TextUtils.isEmpty(s)) {
            Matcher matcher0 = JsonUtils.b.matcher(s);
            StringBuffer stringBuffer0 = null;
            while(matcher0.find()) {
                if(stringBuffer0 == null) {
                    stringBuffer0 = new StringBuffer();
                }
                switch(matcher0.group().charAt(0)) {
                    case 8: {
                        matcher0.appendReplacement(stringBuffer0, "\\\\b");
                        break;
                    }
                    case 9: {
                        matcher0.appendReplacement(stringBuffer0, "\\\\t");
                        break;
                    }
                    case 10: {
                        matcher0.appendReplacement(stringBuffer0, "\\\\n");
                        break;
                    }
                    case 12: {
                        matcher0.appendReplacement(stringBuffer0, "\\\\f");
                        break;
                    }
                    case 13: {
                        matcher0.appendReplacement(stringBuffer0, "\\\\r");
                        break;
                    }
                    case 34: {
                        matcher0.appendReplacement(stringBuffer0, "\\\\\\\"");
                        break;
                    }
                    case 0x2F: {
                        matcher0.appendReplacement(stringBuffer0, "\\\\/");
                        break;
                    }
                    case 92: {
                        matcher0.appendReplacement(stringBuffer0, "\\\\\\\\");
                    }
                }
            }
            if(stringBuffer0 == null) {
                return s;
            }
            matcher0.appendTail(stringBuffer0);
            return stringBuffer0.toString();
        }
        return s;
    }

    @NonNull
    @KeepForSdk
    public static String unescapeString(@NonNull String s) {
        StringBuffer stringBuffer0 = null;
        if(!TextUtils.isEmpty(s)) {
            if(!TextUtils.isEmpty(s)) {
                Matcher matcher0 = a.a.matcher(s);
                int v = 0;
                StringBuilder stringBuilder0 = null;
                while(matcher0.find()) {
                    if(stringBuilder0 == null) {
                        stringBuilder0 = new StringBuilder();
                    }
                    int v1 = matcher0.start();
                    int v2;
                    for(v2 = v1; v2 >= 0 && s.charAt(v2) == 92; --v2) {
                    }
                    if((v1 - v2) % 2 != 0) {
                        int v3 = Integer.parseInt(matcher0.group().substring(2), 16);
                        stringBuilder0.append(s, v, matcher0.start());
                        if(v3 == 92) {
                            stringBuilder0.append("\\\\");
                        }
                        else {
                            stringBuilder0.append(Character.toChars(v3));
                        }
                        v = matcher0.end();
                    }
                }
                if(stringBuilder0 != null) {
                    if(v < matcher0.regionEnd()) {
                        stringBuilder0.append(s, v, matcher0.regionEnd());
                    }
                    s = stringBuilder0.toString();
                }
            }
            Matcher matcher1 = JsonUtils.a.matcher(s);
            while(matcher1.find()) {
                if(stringBuffer0 == null) {
                    stringBuffer0 = new StringBuffer();
                }
                int v4 = matcher1.group().charAt(1);
                if(v4 == 34) {
                    matcher1.appendReplacement(stringBuffer0, "\"");
                }
                else {
                    switch(v4) {
                        case 0x2F: {
                            matcher1.appendReplacement(stringBuffer0, "/");
                            break;
                        }
                        case 92: {
                            matcher1.appendReplacement(stringBuffer0, "\\\\");
                            break;
                        }
                        case 98: {
                            matcher1.appendReplacement(stringBuffer0, "\b");
                            break;
                        }
                        case 102: {
                            matcher1.appendReplacement(stringBuffer0, "\f");
                            break;
                        }
                        case 110: {
                            matcher1.appendReplacement(stringBuffer0, "\n");
                            break;
                        }
                        case 0x72: {
                            matcher1.appendReplacement(stringBuffer0, "\r");
                            break;
                        }
                        case 0x74: {
                            matcher1.appendReplacement(stringBuffer0, "\t");
                            break;
                        }
                        default: {
                            throw new IllegalStateException("Found an escaped character that should never be.");
                        }
                    }
                }
            }
            if(stringBuffer0 == null) {
                return s;
            }
            matcher1.appendTail(stringBuffer0);
            return stringBuffer0.toString();
        }
        return s;
    }
}

