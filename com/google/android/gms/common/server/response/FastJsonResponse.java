package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
@ShowFirstParty
public abstract class FastJsonResponse {
    @KeepForSdk
    @ShowFirstParty
    @Class(creator = "FieldCreator")
    @VisibleForTesting
    public static class Field extends AbstractSafeParcelable {
        public static final zaj CREATOR;
        public final int a;
        public zan b;
        public final FieldConverter c;
        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTypeIn", id = 2)
        protected final int zaa;
        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isTypeInArray", id = 3)
        protected final boolean zab;
        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTypeOut", id = 4)
        protected final int zac;
        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isTypeOutArray", id = 5)
        protected final boolean zad;
        @NonNull
        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getOutputFieldName", id = 6)
        protected final String zae;
        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSafeParcelableFieldId", id = 7)
        protected final int zaf;
        @Nullable
        protected final java.lang.Class zag;
        @Nullable
        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getConcreteTypeName", id = 8)
        protected final String zah;

        static {
            Field.CREATOR = new zaj();
        }

        public Field(int v, int v1, boolean z, int v2, boolean z1, String s, int v3, String s1, zaa zaa0) {
            this.a = v;
            this.zaa = v1;
            this.zab = z;
            this.zac = v2;
            this.zad = z1;
            this.zae = s;
            this.zaf = v3;
            if(s1 == null) {
                this.zag = null;
                this.zah = null;
            }
            else {
                this.zag = SafeParcelResponse.class;
                this.zah = s1;
            }
            if(zaa0 == null) {
                this.c = null;
                return;
            }
            this.c = zaa0.zab();
        }

        public Field(int v, boolean z, int v1, boolean z1, @NonNull String s, int v2, @Nullable java.lang.Class class0, @Nullable FieldConverter fastJsonResponse$FieldConverter0) {
            this.a = 1;
            this.zaa = v;
            this.zab = z;
            this.zac = v1;
            this.zad = z1;
            this.zae = s;
            this.zaf = v2;
            this.zag = class0;
            this.zah = class0 == null ? null : class0.getCanonicalName();
            this.c = fastJsonResponse$FieldConverter0;
        }

        @NonNull
        @KeepForSdk
        @VisibleForTesting
        public static Field forBase64(@NonNull String s, int v) {
            return new Field(8, false, 8, false, s, v, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field forBoolean(@NonNull String s, int v) {
            return new Field(6, false, 6, false, s, v, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field forConcreteType(@NonNull String s, int v, @NonNull java.lang.Class class0) {
            return new Field(11, false, 11, false, s, v, class0, null);
        }

        @NonNull
        @KeepForSdk
        public static Field forConcreteTypeArray(@NonNull String s, int v, @NonNull java.lang.Class class0) {
            return new Field(11, true, 11, true, s, v, class0, null);
        }

        @NonNull
        @KeepForSdk
        public static Field forDouble(@NonNull String s, int v) {
            return new Field(4, false, 4, false, s, v, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field forFloat(@NonNull String s, int v) {
            return new Field(3, false, 3, false, s, v, null, null);
        }

        @NonNull
        @KeepForSdk
        @VisibleForTesting
        public static Field forInteger(@NonNull String s, int v) {
            return new Field(0, false, 0, false, s, v, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field forLong(@NonNull String s, int v) {
            return new Field(2, false, 2, false, s, v, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field forString(@NonNull String s, int v) {
            return new Field(7, false, 7, false, s, v, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field forStringMap(@NonNull String s, int v) {
            return new Field(10, false, 10, false, s, v, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field forStrings(@NonNull String s, int v) {
            return new Field(7, true, 7, true, s, v, null, null);
        }

        @KeepForSdk
        public int getSafeParcelableFieldId() {
            return this.zaf;
        }

        @Override
        @NonNull
        public final String toString() {
            ToStringHelper objects$ToStringHelper0 = Objects.toStringHelper(this).add("versionCode", this.a).add("typeIn", this.zaa).add("typeInArray", Boolean.valueOf(this.zab)).add("typeOut", this.zac).add("typeOutArray", Boolean.valueOf(this.zad)).add("outputFieldName", this.zae).add("safeParcelFieldId", this.zaf).add("concreteTypeName", (this.zah == null ? null : this.zah));
            java.lang.Class class0 = this.zag;
            if(class0 != null) {
                objects$ToStringHelper0.add("concreteType.class", class0.getCanonicalName());
            }
            FieldConverter fastJsonResponse$FieldConverter0 = this.c;
            if(fastJsonResponse$FieldConverter0 != null) {
                objects$ToStringHelper0.add("converterName", fastJsonResponse$FieldConverter0.getClass().getCanonicalName());
            }
            return objects$ToStringHelper0.toString();
        }

        @NonNull
        @KeepForSdk
        public static Field withConverter(@NonNull String s, int v, @NonNull FieldConverter fastJsonResponse$FieldConverter0, boolean z) {
            fastJsonResponse$FieldConverter0.zaa();
            fastJsonResponse$FieldConverter0.zab();
            return new Field(7, z, 0, false, s, v, null, fastJsonResponse$FieldConverter0);
        }

        @Override  // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel0, int v) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeInt(parcel0, 1, this.a);
            SafeParcelWriter.writeInt(parcel0, 2, this.zaa);
            SafeParcelWriter.writeBoolean(parcel0, 3, this.zab);
            SafeParcelWriter.writeInt(parcel0, 4, this.zac);
            SafeParcelWriter.writeBoolean(parcel0, 5, this.zad);
            SafeParcelWriter.writeString(parcel0, 6, this.zae, false);
            SafeParcelWriter.writeInt(parcel0, 7, this.getSafeParcelableFieldId());
            String s = this.zah;
            zaa zaa0 = null;
            if(s == null) {
                s = null;
            }
            SafeParcelWriter.writeString(parcel0, 8, s, false);
            FieldConverter fastJsonResponse$FieldConverter0 = this.c;
            if(fastJsonResponse$FieldConverter0 != null) {
                zaa0 = zaa.zaa(fastJsonResponse$FieldConverter0);
            }
            SafeParcelWriter.writeParcelable(parcel0, 9, zaa0, v, false);
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
        }

        @NonNull
        public final Field zab() {
            int v = this.zaa;
            boolean z = this.zab;
            int v1 = this.zac;
            boolean z1 = this.zad;
            String s = this.zae;
            int v2 = this.zaf;
            String s1 = this.zah;
            FieldConverter fastJsonResponse$FieldConverter0 = this.c;
            if(fastJsonResponse$FieldConverter0 == null) {
                return new Field(this.a, v, z, v1, z1, s, v2, s1, null);
            }
            zaa zaa0 = zaa.zaa(fastJsonResponse$FieldConverter0);
            return new Field(this.a, v, z, v1, z1, s, v2, s1, zaa0);
        }

        @NonNull
        public final FastJsonResponse zad() throws InstantiationException, IllegalAccessException {
            Preconditions.checkNotNull(this.zag);
            java.lang.Class class0 = this.zag;
            if(class0 == SafeParcelResponse.class) {
                Preconditions.checkNotNull(this.zah);
                Preconditions.checkNotNull(this.b, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
                return new SafeParcelResponse(this.b, this.zah);
            }
            return (FastJsonResponse)class0.newInstance();
        }

        @NonNull
        public final Object zae(@Nullable Object object0) {
            Preconditions.checkNotNull(this.c);
            return Preconditions.checkNotNull(this.c.zac(object0));
        }

        @NonNull
        public final Object zaf(@NonNull Object object0) {
            Preconditions.checkNotNull(this.c);
            return this.c.zad(object0);
        }

        @NonNull
        public final Map zah() {
            Preconditions.checkNotNull(this.zah);
            Preconditions.checkNotNull(this.b);
            return (Map)Preconditions.checkNotNull(this.b.zab(this.zah));
        }

        public final void zai(zan zan0) {
            this.b = zan0;
        }

        public final boolean zaj() {
            return this.c != null;
        }
    }

    @ShowFirstParty
    public interface FieldConverter {
        int zaa();

        int zab();

        @Nullable
        Object zac(@NonNull Object arg1);

        @NonNull
        Object zad(@NonNull Object arg1);
    }

    public final void a(Field fastJsonResponse$Field0, Object object0) {
        String s = fastJsonResponse$Field0.zae;
        Object object1 = fastJsonResponse$Field0.zae(object0);
        int v = fastJsonResponse$Field0.zac;
        switch(v) {
            case 0: {
                if(object1 != null) {
                    this.setIntegerInternal(fastJsonResponse$Field0, s, ((int)(((Integer)object1))));
                    return;
                }
                FastJsonResponse.c(s);
                return;
            }
            case 1: {
                this.zaf(fastJsonResponse$Field0, s, ((BigInteger)object1));
                return;
            }
            case 2: {
                if(object1 != null) {
                    this.setLongInternal(fastJsonResponse$Field0, s, ((long)(((Long)object1))));
                    return;
                }
                FastJsonResponse.c(s);
                return;
            }
            case 4: {
                if(object1 != null) {
                    this.zan(fastJsonResponse$Field0, s, ((double)(((Double)object1))));
                    return;
                }
                FastJsonResponse.c(s);
                return;
            }
            case 5: {
                this.zab(fastJsonResponse$Field0, s, ((BigDecimal)object1));
                return;
            }
            case 6: {
                if(object1 != null) {
                    this.setBooleanInternal(fastJsonResponse$Field0, s, ((Boolean)object1).booleanValue());
                    return;
                }
                FastJsonResponse.c(s);
                return;
            }
            case 7: {
                this.setStringInternal(fastJsonResponse$Field0, s, ((String)object1));
                return;
            }
            case 8: 
            case 9: {
                if(object1 != null) {
                    this.setDecodedBytesInternal(fastJsonResponse$Field0, s, ((byte[])object1));
                    return;
                }
                FastJsonResponse.c(s);
                return;
            }
            default: {
                throw new IllegalStateException("Unsupported type for conversion: " + v);
            }
        }
    }

    @KeepForSdk
    public void addConcreteTypeArrayInternal(@NonNull Field fastJsonResponse$Field0, @NonNull String s, @Nullable ArrayList arrayList0) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    @KeepForSdk
    public void addConcreteTypeInternal(@NonNull Field fastJsonResponse$Field0, @NonNull String s, @NonNull FastJsonResponse fastJsonResponse0) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public static final void b(StringBuilder stringBuilder0, Field fastJsonResponse$Field0, Object object0) {
        switch(fastJsonResponse$Field0.zaa) {
            case 7: {
                stringBuilder0.append("\"");
                stringBuilder0.append(JsonUtils.escapeString(((String)object0)));
                stringBuilder0.append("\"");
                return;
            }
            case 11: {
                Preconditions.checkNotNull(fastJsonResponse$Field0.zag);
                stringBuilder0.append(((FastJsonResponse)fastJsonResponse$Field0.zag.cast(object0)).toString());
                return;
            }
            default: {
                stringBuilder0.append(object0);
            }
        }
    }

    public static final void c(String s) {
        if(Log.isLoggable("FastJsonResponse", 6)) {
            Log.e("FastJsonResponse", "Output field (" + s + ") has a null value, but expected a primitive");
        }
    }

    @NonNull
    @KeepForSdk
    public abstract Map getFieldMappings();

    @Nullable
    @KeepForSdk
    public Object getFieldValue(@NonNull Field fastJsonResponse$Field0) {
        String s = fastJsonResponse$Field0.zae;
        if(fastJsonResponse$Field0.zag != null) {
            Preconditions.checkState(this.getValueObject(s) == null, "Concrete field shouldn\'t be value object: %s", new Object[]{fastJsonResponse$Field0.zae});
            try {
                return this.getClass().getMethod("get" + Character.toUpperCase(s.charAt(0)) + s.substring(1), null).invoke(this, null);
            }
            catch(Exception exception0) {
                throw new RuntimeException(exception0);
            }
        }
        return this.getValueObject(s);
    }

    @Nullable
    @KeepForSdk
    public abstract Object getValueObject(@NonNull String arg1);

    @KeepForSdk
    public boolean isFieldSet(@NonNull Field fastJsonResponse$Field0) {
        if(fastJsonResponse$Field0.zac == 11) {
            throw fastJsonResponse$Field0.zad ? new UnsupportedOperationException("Concrete type arrays not supported") : new UnsupportedOperationException("Concrete types not supported");
        }
        return this.isPrimitiveFieldSet(fastJsonResponse$Field0.zae);
    }

    @KeepForSdk
    public abstract boolean isPrimitiveFieldSet(@NonNull String arg1);

    @KeepForSdk
    public void setBooleanInternal(@NonNull Field fastJsonResponse$Field0, @NonNull String s, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    @KeepForSdk
    public void setDecodedBytesInternal(@NonNull Field fastJsonResponse$Field0, @NonNull String s, @Nullable byte[] arr_b) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    @KeepForSdk
    public void setIntegerInternal(@NonNull Field fastJsonResponse$Field0, @NonNull String s, int v) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    @KeepForSdk
    public void setLongInternal(@NonNull Field fastJsonResponse$Field0, @NonNull String s, long v) {
        throw new UnsupportedOperationException("Long not supported");
    }

    @KeepForSdk
    public void setStringInternal(@NonNull Field fastJsonResponse$Field0, @NonNull String s, @Nullable String s1) {
        throw new UnsupportedOperationException("String not supported");
    }

    @KeepForSdk
    public void setStringMapInternal(@NonNull Field fastJsonResponse$Field0, @NonNull String s, @Nullable Map map0) {
        throw new UnsupportedOperationException("String map not supported");
    }

    @KeepForSdk
    public void setStringsInternal(@NonNull Field fastJsonResponse$Field0, @NonNull String s, @Nullable ArrayList arrayList0) {
        throw new UnsupportedOperationException("String list not supported");
    }

    @Override
    @NonNull
    @KeepForSdk
    public String toString() {
        Map map0 = this.getFieldMappings();
        StringBuilder stringBuilder0 = new StringBuilder(100);
        for(Object object0: map0.keySet()) {
            String s = (String)object0;
            Field fastJsonResponse$Field0 = (Field)map0.get(s);
            if(this.isFieldSet(fastJsonResponse$Field0)) {
                Object object1 = FastJsonResponse.zaD(fastJsonResponse$Field0, this.getFieldValue(fastJsonResponse$Field0));
                if(stringBuilder0.length() == 0) {
                    stringBuilder0.append("{");
                }
                else {
                    stringBuilder0.append(",");
                }
                stringBuilder0.append("\"");
                stringBuilder0.append(s);
                stringBuilder0.append("\":");
                if(object1 == null) {
                    stringBuilder0.append("null");
                }
                else {
                    switch(fastJsonResponse$Field0.zac) {
                        case 8: {
                            stringBuilder0.append("\"");
                            stringBuilder0.append(Base64Utils.encode(((byte[])object1)));
                            stringBuilder0.append("\"");
                            break;
                        }
                        case 9: {
                            stringBuilder0.append("\"");
                            stringBuilder0.append(Base64Utils.encodeUrlSafe(((byte[])object1)));
                            stringBuilder0.append("\"");
                            break;
                        }
                        case 10: {
                            MapUtils.writeStringMapToJson(stringBuilder0, ((HashMap)object1));
                            break;
                        }
                        default: {
                            if(fastJsonResponse$Field0.zab) {
                                ArrayList arrayList0 = (ArrayList)object1;
                                stringBuilder0.append("[");
                                int v = arrayList0.size();
                                for(int v1 = 0; v1 < v; ++v1) {
                                    if(v1 > 0) {
                                        stringBuilder0.append(",");
                                    }
                                    Object object2 = arrayList0.get(v1);
                                    if(object2 != null) {
                                        FastJsonResponse.b(stringBuilder0, fastJsonResponse$Field0, object2);
                                    }
                                }
                                stringBuilder0.append("]");
                                continue;
                            }
                            else {
                                FastJsonResponse.b(stringBuilder0, fastJsonResponse$Field0, object1);
                                break;
                            }
                            stringBuilder0.append("\"");
                            stringBuilder0.append(Base64Utils.encode(((byte[])object1)));
                            stringBuilder0.append("\"");
                            break;
                        }
                    }
                }
            }
        }
        if(stringBuilder0.length() > 0) {
            stringBuilder0.append("}");
            return stringBuilder0.toString();
        }
        stringBuilder0.append("{}");
        return stringBuilder0.toString();
    }

    public final void zaA(@NonNull Field fastJsonResponse$Field0, @Nullable String s) {
        if(fastJsonResponse$Field0.c != null) {
            this.a(fastJsonResponse$Field0, s);
            return;
        }
        this.setStringInternal(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, s);
    }

    public final void zaB(@NonNull Field fastJsonResponse$Field0, @Nullable Map map0) {
        if(fastJsonResponse$Field0.c != null) {
            this.a(fastJsonResponse$Field0, map0);
            return;
        }
        this.setStringMapInternal(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, map0);
    }

    public final void zaC(@NonNull Field fastJsonResponse$Field0, @Nullable ArrayList arrayList0) {
        if(fastJsonResponse$Field0.c != null) {
            this.a(fastJsonResponse$Field0, arrayList0);
            return;
        }
        this.setStringsInternal(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, arrayList0);
    }

    @NonNull
    public static final Object zaD(@NonNull Field fastJsonResponse$Field0, @Nullable Object object0) {
        return fastJsonResponse$Field0.c == null ? object0 : fastJsonResponse$Field0.zaf(object0);
    }

    public final void zaa(@NonNull Field fastJsonResponse$Field0, @Nullable BigDecimal bigDecimal0) {
        if(fastJsonResponse$Field0.c != null) {
            this.a(fastJsonResponse$Field0, bigDecimal0);
            return;
        }
        this.zab(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, bigDecimal0);
    }

    public void zab(@NonNull Field fastJsonResponse$Field0, @NonNull String s, @Nullable BigDecimal bigDecimal0) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(@NonNull Field fastJsonResponse$Field0, @Nullable ArrayList arrayList0) {
        if(fastJsonResponse$Field0.c != null) {
            this.a(fastJsonResponse$Field0, arrayList0);
            return;
        }
        this.zad(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, arrayList0);
    }

    public void zad(@NonNull Field fastJsonResponse$Field0, @NonNull String s, @Nullable ArrayList arrayList0) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(@NonNull Field fastJsonResponse$Field0, @Nullable BigInteger bigInteger0) {
        if(fastJsonResponse$Field0.c != null) {
            this.a(fastJsonResponse$Field0, bigInteger0);
            return;
        }
        this.zaf(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, bigInteger0);
    }

    public void zaf(@NonNull Field fastJsonResponse$Field0, @NonNull String s, @Nullable BigInteger bigInteger0) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(@NonNull Field fastJsonResponse$Field0, @Nullable ArrayList arrayList0) {
        if(fastJsonResponse$Field0.c != null) {
            this.a(fastJsonResponse$Field0, arrayList0);
            return;
        }
        this.zah(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, arrayList0);
    }

    public void zah(@NonNull Field fastJsonResponse$Field0, @NonNull String s, @Nullable ArrayList arrayList0) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(@NonNull Field fastJsonResponse$Field0, boolean z) {
        if(fastJsonResponse$Field0.c != null) {
            this.a(fastJsonResponse$Field0, Boolean.valueOf(z));
            return;
        }
        this.setBooleanInternal(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, z);
    }

    public final void zaj(@NonNull Field fastJsonResponse$Field0, @Nullable ArrayList arrayList0) {
        if(fastJsonResponse$Field0.c != null) {
            this.a(fastJsonResponse$Field0, arrayList0);
            return;
        }
        this.zak(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, arrayList0);
    }

    public void zak(@NonNull Field fastJsonResponse$Field0, @NonNull String s, @Nullable ArrayList arrayList0) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(@NonNull Field fastJsonResponse$Field0, @Nullable byte[] arr_b) {
        if(fastJsonResponse$Field0.c != null) {
            this.a(fastJsonResponse$Field0, arr_b);
            return;
        }
        this.setDecodedBytesInternal(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, arr_b);
    }

    public final void zam(@NonNull Field fastJsonResponse$Field0, double f) {
        if(fastJsonResponse$Field0.c != null) {
            this.a(fastJsonResponse$Field0, f);
            return;
        }
        this.zan(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, f);
    }

    public void zan(@NonNull Field fastJsonResponse$Field0, @NonNull String s, double f) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(@NonNull Field fastJsonResponse$Field0, @Nullable ArrayList arrayList0) {
        if(fastJsonResponse$Field0.c != null) {
            this.a(fastJsonResponse$Field0, arrayList0);
            return;
        }
        this.zap(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, arrayList0);
    }

    public void zap(@NonNull Field fastJsonResponse$Field0, @NonNull String s, @Nullable ArrayList arrayList0) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(@NonNull Field fastJsonResponse$Field0, float f) {
        if(fastJsonResponse$Field0.c != null) {
            this.a(fastJsonResponse$Field0, f);
            return;
        }
        this.zar(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, f);
    }

    public void zar(@NonNull Field fastJsonResponse$Field0, @NonNull String s, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(@NonNull Field fastJsonResponse$Field0, @Nullable ArrayList arrayList0) {
        if(fastJsonResponse$Field0.c != null) {
            this.a(fastJsonResponse$Field0, arrayList0);
            return;
        }
        this.zat(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, arrayList0);
    }

    public void zat(@NonNull Field fastJsonResponse$Field0, @NonNull String s, @Nullable ArrayList arrayList0) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(@NonNull Field fastJsonResponse$Field0, int v) {
        if(fastJsonResponse$Field0.c != null) {
            this.a(fastJsonResponse$Field0, v);
            return;
        }
        this.setIntegerInternal(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, v);
    }

    public final void zav(@NonNull Field fastJsonResponse$Field0, @Nullable ArrayList arrayList0) {
        if(fastJsonResponse$Field0.c != null) {
            this.a(fastJsonResponse$Field0, arrayList0);
            return;
        }
        this.zaw(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, arrayList0);
    }

    public void zaw(@NonNull Field fastJsonResponse$Field0, @NonNull String s, @Nullable ArrayList arrayList0) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(@NonNull Field fastJsonResponse$Field0, long v) {
        if(fastJsonResponse$Field0.c != null) {
            this.a(fastJsonResponse$Field0, v);
            return;
        }
        this.setLongInternal(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, v);
    }

    public final void zay(@NonNull Field fastJsonResponse$Field0, @Nullable ArrayList arrayList0) {
        if(fastJsonResponse$Field0.c != null) {
            this.a(fastJsonResponse$Field0, arrayList0);
            return;
        }
        this.zaz(fastJsonResponse$Field0, fastJsonResponse$Field0.zae, arrayList0);
    }

    public void zaz(@NonNull Field fastJsonResponse$Field0, @NonNull String s, @Nullable ArrayList arrayList0) {
        throw new UnsupportedOperationException("Long list not supported");
    }
}

