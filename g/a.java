package g;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.EditText;
import androidx.compose.runtime.SlotTable;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.concurrent.futures.AbstractResolvableFuture;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.measurement.internal.zzab;
import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.DependencyCycleException;
import com.google.firebase.components.f;
import com.google.firebase.messaging.d;
import e4.b;
import e4.h;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader.Cache;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import w2.c;
import w2.g;

public abstract class a {
    public static ImageBitmap a;
    public static Canvas b;
    public static CanvasDrawScope c;
    public static zzab d;
    public static Class e;
    public static Method f;
    public static Method g;
    public static Method h;
    public static Method i;
    public static Method j;
    public static Java16SealedRecordLoader.Cache k;

    public abstract int A(CoordinatorLayout arg1);

    public static String B(int v, String[] arr_s, int[] arr_v, int[] arr_v1) {
        StringBuilder stringBuilder0 = new StringBuilder("$");
        for(int v1 = 0; v1 < v; ++v1) {
            switch(arr_v[v1]) {
                case 1: 
                case 2: {
                    stringBuilder0.append('[');
                    stringBuilder0.append(arr_v1[v1]);
                    stringBuilder0.append(']');
                    break;
                }
                case 3: 
                case 4: 
                case 5: {
                    stringBuilder0.append('.');
                    String s = arr_s[v1];
                    if(s != null) {
                        stringBuilder0.append(s);
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    public abstract int C();

    public static void D(byte b, byte b1, byte b2, byte b3, char[] arr_c, int v) {
        if(a.J(b1) || b1 + 0x70 + (b << 28) >> 30 != 0 || a.J(b2) || a.J(b3)) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        int v1 = (b & 7) << 18 | (b1 & 0x3F) << 12 | (b2 & 0x3F) << 6 | b3 & 0x3F;
        arr_c[v] = (char)((v1 >>> 10) + 0xD7C0);
        arr_c[v + 1] = (char)((v1 & 0x3FF) + 0xDC00);
    }

    public static void E(byte b, byte b1, byte b2, char[] arr_c, int v) {
        if(a.J(b1) || b == 0xFFFFFFE0 && b1 < 0xFFFFFFA0 || b == -19 && b1 >= 0xFFFFFFA0 || a.J(b2)) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        arr_c[v] = (char)((b & 15) << 12 | (b1 & 0x3F) << 6 | b2 & 0x3F);
    }

    public static void F(byte b, byte b1, char[] arr_c, int v) {
        if(b < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }
        if(a.J(b1)) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
        arr_c[v] = (char)((b & 0x1F) << 6 | b1 & 0x3F);
    }

    public static boolean G(int v, Rect rect0, Rect rect1) {
        switch(v) {
            case 17: {
                return (rect0.right > rect1.right || rect0.left >= rect1.right) && rect0.left > rect1.left;
            }
            case 33: {
                return (rect0.bottom > rect1.bottom || rect0.top >= rect1.bottom) && rect0.top > rect1.top;
            }
            case 66: {
                return (rect0.left < rect1.left || rect0.right <= rect1.left) && rect0.right < rect1.right;
            }
            case 130: {
                return (rect0.top < rect1.top || rect0.bottom <= rect1.top) && rect0.bottom < rect1.bottom;
            }
            default: {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
        }
    }

    public static boolean H(EditText editText0) {
        return editText0.getInputType() != 0;
    }

    public abstract boolean I(float arg1);

    public static boolean J(byte b) {
        return b > -65;
    }

    public static boolean K(byte b) {
        return b >= 0;
    }

    public abstract boolean L(View arg1);

    public abstract boolean M(float arg1, float arg2);

    public static int N(int v, Rect rect0, Rect rect1) {
        switch(v) {
            case 17: {
                return Math.max(0, rect0.left - rect1.right);
            }
            case 33: {
                return Math.max(0, rect0.top - rect1.bottom);
            }
            case 66: {
                return Math.max(0, rect1.left - rect0.right);
            }
            case 130: {
                return Math.max(0, rect1.top - rect0.bottom);
            }
            default: {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
        }
    }

    public static int O(int v, Rect rect0, Rect rect1) {
        switch(v) {
            case 17: 
            case 66: {
                int v1 = rect0.top;
                int v2 = rect0.height();
                int v3 = rect1.top;
                return Math.abs(v2 / 2 + v1 - (rect1.height() / 2 + v3));
            }
            case 33: 
            case 130: {
                int v4 = rect0.left;
                int v5 = rect0.width();
                int v6 = rect1.left;
                return Math.abs(v5 / 2 + v4 - (rect1.width() / 2 + v6));
            }
            default: {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
        }
    }

    public static void P(Context context0, String s) {
        FileOutputStream fileOutputStream0;
        if(s.equals("")) {
            context0.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            fileOutputStream0 = context0.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
        }
        catch(FileNotFoundException unused_ex) {
            Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            return;
        }
        XmlSerializer xmlSerializer0 = Xml.newSerializer();
        try {
            try {
                xmlSerializer0.setOutput(fileOutputStream0, null);
                xmlSerializer0.startDocument("UTF-8", Boolean.TRUE);
                xmlSerializer0.startTag(null, "locales");
                xmlSerializer0.attribute(null, "application_locales", s);
                xmlSerializer0.endTag(null, "locales");
                xmlSerializer0.endDocument();
                Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + s + " persisted successfully.");
            }
            catch(Exception exception0) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: " + s, exception0);
                if(fileOutputStream0 != null) {
                    goto label_25;
                }
                return;
            }
        }
        catch(Throwable throwable0) {
            if(fileOutputStream0 != null) {
                try {
                    fileOutputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            throw throwable0;
        }
        if(fileOutputStream0 != null) {
            try {
            label_25:
                fileOutputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
    }

    public static final Class Q(Type type0) {
        if(type0 instanceof Class) {
            return (Class)type0;
        }
        if(type0 instanceof ParameterizedType) {
            Type type1 = ((ParameterizedType)type0).getRawType();
            Intrinsics.checkNotNullExpressionValue(type1, "getRawType(...)");
            return a.Q(type1);
        }
        if(type0 instanceof WildcardType) {
            Type[] arr_type = ((WildcardType)type0).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(arr_type, "getUpperBounds(...)");
            Object object0 = ArraysKt___ArraysKt.first(arr_type);
            Intrinsics.checkNotNullExpressionValue(object0, "first(...)");
            return a.Q(((Type)object0));
        }
        if(!(type0 instanceof GenericArrayType)) {
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type0 + " has type " + Reflection.getOrCreateKotlinClass(type0.getClass()));
        }
        Type type2 = ((GenericArrayType)type0).getGenericComponentType();
        Intrinsics.checkNotNullExpressionValue(type2, "getGenericComponentType(...)");
        return a.Q(type2);
    }

    public abstract void R(g arg1, g arg2);

    public abstract void S(g arg1, Thread arg2);

    public static long T(Context context0, Uri uri0, String s, long v) {
        ContentResolver contentResolver0 = context0.getContentResolver();
        Cursor cursor0 = null;
        try {
            cursor0 = contentResolver0.query(uri0, new String[]{s}, null, null, null);
            return cursor0.moveToFirst() && !cursor0.isNull(0) ? cursor0.getLong(0) : v;
        }
        catch(Exception exception0) {
            Log.w("DocumentFile", "Failed query: " + exception0);
            return v;
        }
        finally {
            a.j(cursor0);
        }
    }

    public static String U(Context context0, Uri uri0, String s) {
        String s1;
        Cursor cursor0;
        ContentResolver contentResolver0 = context0.getContentResolver();
        try {
            cursor0 = null;
            cursor0 = contentResolver0.query(uri0, new String[]{s}, null, null, null);
            goto label_7;
        }
        catch(Exception exception0) {
            goto label_11;
        }
        catch(Throwable throwable0) {
        }
        Throwable throwable1 = throwable0;
        a.j(cursor0);
        throw throwable1;
        try {
            try {
            label_7:
                if(cursor0.moveToFirst() && !cursor0.isNull(0)) {
                    s1 = cursor0.getString(0);
                    goto label_17;
                }
                goto label_19;
            }
            catch(Exception exception0) {
            }
        label_11:
            Log.w("DocumentFile", "Failed query: " + exception0);
        }
        catch(Throwable throwable1) {
            a.j(cursor0);
            throw throwable1;
        }
        a.j(cursor0);
        return null;
    label_17:
        a.j(cursor0);
        return s1;
    label_19:
        a.j(cursor0);
        return null;
    }

    public static String V(Context context0) {
        FileInputStream fileInputStream0;
        String s = "";
        try {
            fileInputStream0 = context0.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
        }
        catch(FileNotFoundException unused_ex) {
            Log.w("AppLocalesStorageHelper", "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return "";
        }
        try {
            try {
                XmlPullParser xmlPullParser0 = Xml.newPullParser();
                xmlPullParser0.setInput(fileInputStream0, "UTF-8");
                int v = xmlPullParser0.getDepth();
                do {
                    int v1 = xmlPullParser0.next();
                    if(v1 == 1 || v1 == 3 && xmlPullParser0.getDepth() <= v) {
                        goto label_22;
                    }
                }
                while(v1 == 3 || v1 == 4 || !xmlPullParser0.getName().equals("locales"));
                s = xmlPullParser0.getAttributeValue(null, "application_locales");
                goto label_22;
            }
            catch(XmlPullParserException | IOException unused_ex) {
            }
            Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            if(fileInputStream0 != null) {
                goto label_17;
            }
            goto label_24;
        }
        catch(Throwable throwable0) {
            goto label_19;
        }
        try {
        label_17:
            fileInputStream0.close();
        }
        catch(IOException unused_ex) {
        }
        goto label_24;
    label_19:
        if(fileInputStream0 != null) {
            try {
                fileInputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable0;
    label_22:
        if(fileInputStream0 != null) {
            try {
                fileInputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
    label_24:
        if(!s.isEmpty()) {
            Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: " + s);
            return s;
        }
        context0.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
        return s;
    }

    public static final KSerializer W(SerializersModule serializersModule0, Class class0, List list0) {
        KSerializer[] arr_kSerializer = (KSerializer[])list0.toArray(new KSerializer[0]);
        KSerializer kSerializer0 = PlatformKt.constructSerializerForGivenTypeArgs(class0, ((KSerializer[])Arrays.copyOf(arr_kSerializer, arr_kSerializer.length)));
        if(kSerializer0 != null) {
            return kSerializer0;
        }
        KClass kClass0 = JvmClassMappingKt.getKotlinClass(class0);
        KSerializer kSerializer1 = PrimitivesKt.builtinSerializerOrNull(kClass0);
        return kSerializer1 == null ? serializersModule0.getContextual(kClass0, list0) : kSerializer1;
    }

    public static final KSerializer X(SerializersModule serializersModule0, Type type0, boolean z) {
        ArrayList arrayList0;
        KSerializer kSerializer2;
        KSerializer kSerializer1;
        KClass kClass0;
        KSerializer kSerializer0;
        if(type0 instanceof GenericArrayType) {
            Type type1 = ((GenericArrayType)type0).getGenericComponentType();
            if(type1 instanceof WildcardType) {
                Type[] arr_type = ((WildcardType)type1).getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(arr_type, "getUpperBounds(...)");
                type1 = (Type)ArraysKt___ArraysKt.first(arr_type);
            }
            Intrinsics.checkNotNull(type1);
            if(z) {
                kSerializer0 = SerializersKt.serializer(serializersModule0, type1);
            }
            else {
                kSerializer0 = SerializersKt.serializerOrNull(serializersModule0, type1);
                if(kSerializer0 != null) {
                    goto label_12;
                }
                return null;
            }
        label_12:
            if(type1 instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType)type1).getRawType();
                Intrinsics.checkNotNull(type2, "null cannot be cast to non-null type java.lang.Class<*>");
                kClass0 = JvmClassMappingKt.getKotlinClass(((Class)type2));
            }
            else if(type1 instanceof KClass) {
                kClass0 = (KClass)type1;
            }
            else {
                throw new IllegalStateException("unsupported type in GenericArray: " + Reflection.getOrCreateKotlinClass(type1.getClass()));
            }
            Intrinsics.checkNotNull(kClass0, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            kSerializer1 = BuiltinSerializersKt.ArraySerializer(kClass0, kSerializer0);
            Intrinsics.checkNotNull(kSerializer1, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializer1;
        }
        if(type0 instanceof Class) {
            if(((Class)type0).isArray() && !((Class)type0).getComponentType().isPrimitive()) {
                Class class0 = ((Class)type0).getComponentType();
                Intrinsics.checkNotNullExpressionValue(class0, "getComponentType(...)");
                if(z) {
                    kSerializer2 = SerializersKt.serializer(serializersModule0, class0);
                    goto label_33;
                }
                kSerializer2 = SerializersKt.serializerOrNull(serializersModule0, class0);
                if(kSerializer2 != null) {
                label_33:
                    KClass kClass1 = JvmClassMappingKt.getKotlinClass(class0);
                    Intrinsics.checkNotNull(kClass1, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    KSerializer kSerializer3 = BuiltinSerializersKt.ArraySerializer(kClass1, kSerializer2);
                    Intrinsics.checkNotNull(kSerializer3, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                    return kSerializer3;
                }
                return null;
            }
            Intrinsics.checkNotNull(((Class)type0), "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            return a.W(serializersModule0, ((Class)type0), CollectionsKt__CollectionsKt.emptyList());
        }
        if(type0 instanceof ParameterizedType) {
            Type type3 = ((ParameterizedType)type0).getRawType();
            Intrinsics.checkNotNull(type3, "null cannot be cast to non-null type java.lang.Class<*>");
            Type[] arr_type1 = ((ParameterizedType)type0).getActualTypeArguments();
            Intrinsics.checkNotNull(arr_type1);
            if(z) {
                arrayList0 = new ArrayList(arr_type1.length);
                for(int v = 0; v < arr_type1.length; ++v) {
                    Type type4 = arr_type1[v];
                    Intrinsics.checkNotNull(type4);
                    arrayList0.add(SerializersKt.serializer(serializersModule0, type4));
                }
            }
            else {
                arrayList0 = new ArrayList(arr_type1.length);
                for(int v1 = 0; v1 < arr_type1.length; ++v1) {
                    Type type5 = arr_type1[v1];
                    Intrinsics.checkNotNull(type5);
                    KSerializer kSerializer4 = SerializersKt.serializerOrNull(serializersModule0, type5);
                    if(kSerializer4 == null) {
                        return null;
                    }
                    arrayList0.add(kSerializer4);
                }
            }
            if(Set.class.isAssignableFrom(((Class)type3))) {
                kSerializer1 = BuiltinSerializersKt.SetSerializer(((KSerializer)arrayList0.get(0)));
                Intrinsics.checkNotNull(kSerializer1, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                return kSerializer1;
            }
            if(!List.class.isAssignableFrom(((Class)type3)) && !Collection.class.isAssignableFrom(((Class)type3))) {
                if(Map.class.isAssignableFrom(((Class)type3))) {
                    kSerializer1 = BuiltinSerializersKt.MapSerializer(((KSerializer)arrayList0.get(0)), ((KSerializer)arrayList0.get(1)));
                    Intrinsics.checkNotNull(kSerializer1, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                    return kSerializer1;
                }
                if(Map.Entry.class.isAssignableFrom(((Class)type3))) {
                    kSerializer1 = BuiltinSerializersKt.MapEntrySerializer(((KSerializer)arrayList0.get(0)), ((KSerializer)arrayList0.get(1)));
                    Intrinsics.checkNotNull(kSerializer1, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                    return kSerializer1;
                }
                if(Pair.class.isAssignableFrom(((Class)type3))) {
                    kSerializer1 = BuiltinSerializersKt.PairSerializer(((KSerializer)arrayList0.get(0)), ((KSerializer)arrayList0.get(1)));
                    Intrinsics.checkNotNull(kSerializer1, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                    return kSerializer1;
                }
                if(Triple.class.isAssignableFrom(((Class)type3))) {
                    kSerializer1 = BuiltinSerializersKt.TripleSerializer(((KSerializer)arrayList0.get(0)), ((KSerializer)arrayList0.get(1)), ((KSerializer)arrayList0.get(2)));
                    Intrinsics.checkNotNull(kSerializer1, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                    return kSerializer1;
                }
                ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
                for(Object object0: arrayList0) {
                    Intrinsics.checkNotNull(((KSerializer)object0), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                    arrayList1.add(((KSerializer)object0));
                }
                return a.W(serializersModule0, ((Class)type3), arrayList1);
            }
            kSerializer1 = BuiltinSerializersKt.ListSerializer(((KSerializer)arrayList0.get(0)));
            Intrinsics.checkNotNull(kSerializer1, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializer1;
        }
        if(!(type0 instanceof WildcardType)) {
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type0 + " has type " + Reflection.getOrCreateKotlinClass(type0.getClass()));
        }
        Type[] arr_type2 = ((WildcardType)type0).getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(arr_type2, "getUpperBounds(...)");
        Object object1 = ArraysKt___ArraysKt.first(arr_type2);
        Intrinsics.checkNotNullExpressionValue(object1, "first(...)");
        return a.X(serializersModule0, ((Type)object1), true);
    }

    public abstract boolean Y(View arg1, float arg2);

    public static byte[] Z(d d0) {
        ArrayDeque arrayDeque0 = new ArrayDeque(20);
        int v = 0x80;
        int v1 = 0;
        while(v1 < 0x7FFFFFF7) {
            int v2 = Math.min(v, 0x7FFFFFF7 - v1);
            byte[] arr_b = new byte[v2];
            arrayDeque0.add(arr_b);
            int v3 = 0;
            while(v3 < v2) {
                int v4 = d0.read(arr_b, v3, v2 - v3);
                if(v4 == -1) {
                    return a.l(arrayDeque0, v1);
                }
                v3 += v4;
                v1 += v4;
            }
            long v5 = ((long)v) * ((long)(v >= 0x1000 ? 2 : 4));
            if(v5 > 0x7FFFFFFFL) {
                v = 0x7FFFFFFF;
            }
            else if(v5 < 0xFFFFFFFF80000000L) {
                v = 0x80000000;
            }
            else {
                v = (int)v5;
            }
        }
        if(d0.read() != -1) {
            throw new OutOfMemoryError("input is too large to fit in a byte array");
        }
        return a.l(arrayDeque0, 0x7FFFFFF7);
    }

    public static boolean a(int v, Rect rect0, Rect rect1, Rect rect2) {
        boolean z = a.b(v, rect0, rect1);
        if(!a.b(v, rect0, rect2) && z) {
            switch(v) {
                case 17: {
                    if(rect0.left >= rect2.right) {
                        goto label_11;
                    }
                    break;
                }
                case 33: {
                    if(rect0.top >= rect2.bottom) {
                        goto label_11;
                    }
                    break;
                }
                case 66: {
                    if(rect0.right <= rect2.left) {
                        goto label_11;
                    }
                    break;
                }
                case 130: {
                    if(rect0.bottom <= rect2.top) {
                    label_11:
                        if(v != 17 && v != 66) {
                            int v1 = a.N(v, rect0, rect1);
                            switch(v) {
                                case 33: {
                                    return v1 < Math.max(1, rect0.top - rect2.top);
                                }
                                case 130: {
                                    return v1 < Math.max(1, rect2.bottom - rect0.bottom);
                                }
                                default: {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                            }
                        }
                    }
                    break;
                }
                default: {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
            }
            return true;
        }
        return false;
    }

    public abstract void a0(ViewGroup.MarginLayoutParams arg1, int arg2);

    public static boolean b(int v, Rect rect0, Rect rect1) {
        switch(v) {
            case 17: 
            case 66: {
                return rect1.bottom >= rect0.top && rect1.top <= rect0.bottom;
            }
            case 33: 
            case 130: {
                return rect1.right >= rect0.left && rect1.left <= rect0.right;
            }
            default: {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
        }
    }

    public abstract void b0(ViewGroup.MarginLayoutParams arg1, int arg2, int arg3);

    public abstract int c(ViewGroup.MarginLayoutParams arg1);

    public static int c0(int v) {
        for(int v1 = 0; v1 < 6; ++v1) {
            int v2 = new int[]{1, 2, 3, 4, 5, 6}[v1];
            if(v2 == 0) {
                throw null;
            }
            if(v2 - 1 == v) {
                return v2;
            }
        }
        return 1;
    }

    public abstract float d(int arg1);

    public static boolean e(Context context0, Uri uri0) {
        if(context0.checkCallingOrSelfUriPermission(uri0, 2) != 0) {
            return false;
        }
        String s = a.U(context0, uri0, "mime_type");
        int v = (int)a.T(context0, uri0, "flags", 0L);
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        if((v & 4) != 0) {
            return true;
        }
        return !"vnd.android.document/directory".equals(s) || (v & 8) == 0 ? !TextUtils.isEmpty(s) && (v & 2) != 0 : true;
    }

    public abstract boolean f(AbstractResolvableFuture arg1, c arg2, c arg3);

    public abstract boolean g(AbstractResolvableFuture arg1, Object arg2, Object arg3);

    public abstract boolean h(AbstractResolvableFuture arg1, g arg2, g arg3);

    public static void i(FileDescriptor fileDescriptor0) {
        try {
            h.a(fileDescriptor0);
        }
        catch(Exception unused_ex) {
            Log.e("ExifInterfaceUtils", "Error closing fd.");
        }
    }

    public static void j(Cursor cursor0) {
        if(cursor0 != null) {
            try {
                cursor0.close();
                return;
            }
            catch(RuntimeException runtimeException0) {
            }
            catch(Exception unused_ex) {
                return;
            }
            throw runtimeException0;
        }
    }

    public static void k(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
                return;
            }
            catch(RuntimeException runtimeException0) {
            }
            catch(Exception unused_ex) {
                return;
            }
            throw runtimeException0;
        }
    }

    public static byte[] l(ArrayDeque arrayDeque0, int v) {
        if(arrayDeque0.isEmpty()) {
            return new byte[0];
        }
        byte[] arr_b = (byte[])arrayDeque0.remove();
        if(arr_b.length == v) {
            return arr_b;
        }
        int v1 = v - arr_b.length;
        byte[] arr_b1 = Arrays.copyOf(arr_b, v);
        while(v1 > 0) {
            byte[] arr_b2 = (byte[])arrayDeque0.remove();
            int v2 = Math.min(v1, arr_b2.length);
            System.arraycopy(arr_b2, 0, arr_b1, v - v1, v2);
            v1 -= v2;
        }
        return arr_b1;
    }

    public static final int m(long v, long v1) {
        int v2 = 0;
        int v3 = ((int)(v & 0xFFFFFFFFL)) == 0 ? 0 : 1;
        if(((int)(0xFFFFFFFFL & v1)) != 0) {
            v2 = 1;
        }
        if(v3 != v2) {
            return v3 == 0 ? 1 : -1;
        }
        return (int)Math.signum(Float.intBitsToFloat(((int)(v >> 0x20))) - Float.intBitsToFloat(((int)(v1 >> 0x20))));
    }

    public static long[] n(Serializable serializable0) {
        if(serializable0 instanceof int[]) {
            long[] arr_v = new long[((int[])serializable0).length];
            for(int v = 0; v < ((int[])serializable0).length; ++v) {
                arr_v[v] = (long)((int[])serializable0)[v];
            }
            return arr_v;
        }
        return serializable0 instanceof long[] ? ((long[])serializable0) : null;
    }

    public static void o(b b0, e4.c c0, int v) {
        byte[] arr_b = new byte[0x2000];
        while(v > 0) {
            int v1 = Math.min(v, 0x2000);
            int v2 = b0.read(arr_b, 0, v1);
            if(v2 != v1) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            v -= v2;
            c0.write(arr_b, 0, v2);
        }
    }

    public static void p(InputStream inputStream0, OutputStream outputStream0) {
        byte[] arr_b = new byte[0x2000];
        int v;
        while((v = inputStream0.read(arr_b)) != -1) {
            outputStream0.write(arr_b, 0, v);
        }
    }

    public static Handler q() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }

    public static void r(ArrayList arrayList0) {
        HashMap hashMap0 = new HashMap(arrayList0.size());
        for(Object object0: arrayList0) {
            Component component0 = (Component)object0;
            f f0 = new f(component0);
            for(Object object1: component0.getProvidedInterfaces()) {
                Class class0 = (Class)object1;
                boolean z = component0.isValue();
                com.google.firebase.components.g g0 = new com.google.firebase.components.g(class0, !z);
                if(!hashMap0.containsKey(g0)) {
                    hashMap0.put(g0, new HashSet());
                }
                Set set0 = (Set)hashMap0.get(g0);
                if(!set0.isEmpty() && z) {
                    throw new IllegalArgumentException("Multiple components provide " + class0 + ".");
                }
                set0.add(f0);
            }
        }
        for(Object object2: hashMap0.values()) {
            for(Object object3: ((Set)object2)) {
                f f1 = (f)object3;
                for(Object object4: f1.a.getDependencies()) {
                    Dependency dependency0 = (Dependency)object4;
                    if(dependency0.isDirectInjection()) {
                        Set set1 = (Set)hashMap0.get(new com.google.firebase.components.g(dependency0.getInterface(), dependency0.isSet()));
                        if(set1 != null) {
                            for(Object object5: set1) {
                                f1.b.add(((f)object5));
                                ((f)object5).c.add(f1);
                            }
                        }
                    }
                }
                if(false) {
                    break;
                }
            }
            if(false) {
                break;
            }
        }
        HashSet hashSet0 = new HashSet();
        for(Object object6: hashMap0.values()) {
            hashSet0.addAll(((Set)object6));
        }
        HashSet hashSet1 = new HashSet();
        for(Object object7: hashSet0) {
            f f2 = (f)object7;
            if(f2.c.isEmpty()) {
                hashSet1.add(f2);
            }
        }
        int v = 0;
        while(!hashSet1.isEmpty()) {
            Object object8 = hashSet1.iterator().next();
            f f3 = (f)object8;
            hashSet1.remove(f3);
            ++v;
            for(Object object9: f3.b) {
                f f4 = (f)object9;
                f4.c.remove(f3);
                if(f4.c.isEmpty()) {
                    hashSet1.add(f4);
                }
            }
        }
        if(v == arrayList0.size()) {
            return;
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object10: hashSet0) {
            f f5 = (f)object10;
            if(!f5.c.isEmpty() && !f5.b.isEmpty()) {
                arrayList1.add(f5.a);
            }
        }
        throw new DependencyCycleException(arrayList1);
    }

    public static boolean s(Context context0, Uri uri0) {
        ContentResolver contentResolver0 = context0.getContentResolver();
        boolean z = false;
        Cursor cursor0 = null;
        try {
            cursor0 = contentResolver0.query(uri0, new String[]{"document_id"}, null, null, null);
            if(cursor0.getCount() > 0) {
                z = true;
            }
            return z;
        }
        catch(Exception exception0) {
            Log.w("DocumentFile", "Failed query: " + exception0);
            return false;
        }
        finally {
            a.j(cursor0);
        }
    }

    public abstract int t(ViewGroup.MarginLayoutParams arg1);

    public abstract int u();

    public abstract int v();

    public abstract Object w(SlotTable arg1);

    public abstract int x();

    public abstract int y();

    public abstract int z(View arg1);
}

