package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.R.styleable;
import androidx.core.provider.FontRequest;
import c3.b;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class FontResourcesParserCompat {
    public interface FamilyResourceEntry {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public static final class FontFamilyFilesResourceEntry implements FamilyResourceEntry {
        public final FontFileResourceEntry[] a;

        public FontFamilyFilesResourceEntry(@NonNull FontFileResourceEntry[] arr_fontResourcesParserCompat$FontFileResourceEntry) {
            this.a = arr_fontResourcesParserCompat$FontFileResourceEntry;
        }

        @NonNull
        public FontFileResourceEntry[] getEntries() {
            return this.a;
        }
    }

    public static final class FontFileResourceEntry {
        public final String a;
        public final int b;
        public final boolean c;
        public final String d;
        public final int e;
        public final int f;

        public FontFileResourceEntry(@NonNull String s, int v, boolean z, @Nullable String s1, int v1, int v2) {
            this.a = s;
            this.b = v;
            this.c = z;
            this.d = s1;
            this.e = v1;
            this.f = v2;
        }

        @NonNull
        public String getFileName() {
            return this.a;
        }

        public int getResourceId() {
            return this.f;
        }

        public int getTtcIndex() {
            return this.e;
        }

        @Nullable
        public String getVariationSettings() {
            return this.d;
        }

        public int getWeight() {
            return this.b;
        }

        public boolean isItalic() {
            return this.c;
        }
    }

    public static final class ProviderResourceEntry implements FamilyResourceEntry {
        public final FontRequest a;
        public final int b;
        public final int c;
        public final String d;

        public ProviderResourceEntry(@NonNull FontRequest fontRequest0, int v, int v1) {
            this(fontRequest0, v, v1, null);
        }

        @RestrictTo({Scope.LIBRARY})
        public ProviderResourceEntry(@NonNull FontRequest fontRequest0, int v, int v1, @Nullable String s) {
            this.a = fontRequest0;
            this.c = v;
            this.b = v1;
            this.d = s;
        }

        public int getFetchStrategy() {
            return this.c;
        }

        @NonNull
        public FontRequest getRequest() {
            return this.a;
        }

        @Nullable
        @RestrictTo({Scope.LIBRARY})
        public String getSystemFontFamilyName() {
            return this.d;
        }

        public int getTimeout() {
            return this.b;
        }
    }

    public static final int FETCH_STRATEGY_ASYNC = 1;
    public static final int FETCH_STRATEGY_BLOCKING = 0;
    public static final int INFINITE_TIMEOUT_VALUE = -1;

    public static void a(XmlPullParser xmlPullParser0) {
        int v = 1;
        while(v > 0) {
            switch(xmlPullParser0.next()) {
                case 2: {
                    ++v;
                    break;
                }
                case 3: {
                    --v;
                }
            }
        }
    }

    @Nullable
    public static FamilyResourceEntry parse(@NonNull XmlPullParser xmlPullParser0, @NonNull Resources resources0) throws XmlPullParserException, IOException {
        do {
            int v = xmlPullParser0.next();
        }
        while(v != 1 && v != 2);
        if(v != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlPullParser0.require(2, null, "font-family");
        if(xmlPullParser0.getName().equals("font-family")) {
            TypedArray typedArray0 = resources0.obtainAttributes(Xml.asAttributeSet(xmlPullParser0), styleable.FontFamily);
            String s = typedArray0.getString(styleable.FontFamily_fontProviderAuthority);
            String s1 = typedArray0.getString(styleable.FontFamily_fontProviderPackage);
            String s2 = typedArray0.getString(styleable.FontFamily_fontProviderQuery);
            int v1 = typedArray0.getResourceId(styleable.FontFamily_fontProviderCerts, 0);
            int v2 = typedArray0.getInteger(styleable.FontFamily_fontProviderFetchStrategy, 1);
            int v3 = typedArray0.getInteger(styleable.FontFamily_fontProviderFetchTimeout, 500);
            String s3 = typedArray0.getString(styleable.FontFamily_fontProviderSystemFontFamily);
            typedArray0.recycle();
            if(s != null && s1 != null && s2 != null) {
                while(xmlPullParser0.next() != 3) {
                    FontResourcesParserCompat.a(xmlPullParser0);
                }
                return new ProviderResourceEntry(new FontRequest(s, s1, s2, FontResourcesParserCompat.readCerts(resources0, v1)), v2, v3, s3);
            }
            ArrayList arrayList0 = new ArrayList();
            while(xmlPullParser0.next() != 3) {
                if(xmlPullParser0.getEventType() != 2) {
                }
                else if(xmlPullParser0.getName().equals("font")) {
                    TypedArray typedArray1 = resources0.obtainAttributes(Xml.asAttributeSet(xmlPullParser0), styleable.FontFamilyFont);
                    int v4 = typedArray1.getInt((typedArray1.hasValue(styleable.FontFamilyFont_fontWeight) ? styleable.FontFamilyFont_fontWeight : styleable.FontFamilyFont_android_fontWeight), 400);
                    boolean z = 1 == typedArray1.getInt((typedArray1.hasValue(styleable.FontFamilyFont_fontStyle) ? styleable.FontFamilyFont_fontStyle : styleable.FontFamilyFont_android_fontStyle), 0);
                    int v5 = typedArray1.hasValue(styleable.FontFamilyFont_ttcIndex) ? styleable.FontFamilyFont_ttcIndex : styleable.FontFamilyFont_android_ttcIndex;
                    String s4 = typedArray1.getString((typedArray1.hasValue(styleable.FontFamilyFont_fontVariationSettings) ? styleable.FontFamilyFont_fontVariationSettings : styleable.FontFamilyFont_android_fontVariationSettings));
                    int v6 = typedArray1.getInt(v5, 0);
                    int v7 = typedArray1.hasValue(styleable.FontFamilyFont_font) ? styleable.FontFamilyFont_font : styleable.FontFamilyFont_android_font;
                    int v8 = typedArray1.getResourceId(v7, 0);
                    String s5 = typedArray1.getString(v7);
                    typedArray1.recycle();
                    while(xmlPullParser0.next() != 3) {
                        FontResourcesParserCompat.a(xmlPullParser0);
                    }
                    arrayList0.add(new FontFileResourceEntry(s5, v4, z, s4, v6, v8));
                }
                else {
                    FontResourcesParserCompat.a(xmlPullParser0);
                }
            }
            if(!arrayList0.isEmpty()) {
                return new FontFamilyFilesResourceEntry(((FontFileResourceEntry[])arrayList0.toArray(new FontFileResourceEntry[0])));
            }
        }
        else {
            FontResourcesParserCompat.a(xmlPullParser0);
        }
        return null;
    }

    @NonNull
    public static List readCerts(@NonNull Resources resources0, @ArrayRes int v) {
        if(v == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArray0 = resources0.obtainTypedArray(v);
        try {
            if(typedArray0.length() == 0) {
                return Collections.emptyList();
            }
            List list1 = new ArrayList();
            if(b.a(typedArray0, 0) == 1) {
                for(int v2 = 0; v2 < typedArray0.length(); ++v2) {
                    int v3 = typedArray0.getResourceId(v2, 0);
                    if(v3 != 0) {
                        String[] arr_s = resources0.getStringArray(v3);
                        ArrayList arrayList0 = new ArrayList();
                        for(int v4 = 0; v4 < arr_s.length; ++v4) {
                            arrayList0.add(Base64.decode(arr_s[v4], 0));
                        }
                        ((ArrayList)list1).add(arrayList0);
                    }
                }
            }
            else {
                String[] arr_s1 = resources0.getStringArray(v);
                ArrayList arrayList1 = new ArrayList();
                for(int v5 = 0; v5 < arr_s1.length; ++v5) {
                    arrayList1.add(Base64.decode(arr_s1[v5], 0));
                }
                ((ArrayList)list1).add(arrayList1);
            }
            return list1;
        }
        finally {
            typedArray0.recycle();
        }
    }
}

