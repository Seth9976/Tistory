package com.kakao.keditor.cdm;

import a5.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002#$BA\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\b\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000BJ\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\u000F\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000B\u0010\u0017\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0018\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JG\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\b\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001A\u001A\u00020\u001B2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001D\u001A\u00020\u001EHÖ\u0001J\u0006\u0010\u001F\u001A\u00020\u001BJ\u0006\u0010 \u001A\u00020!J\b\u0010\"\u001A\u00020\u0003H\u0016R\u0017\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u001F\u0010\b\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u001C\u0010\u0007\u001A\u0004\u0018\u00010\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0011¨\u0006%"}, d2 = {"Lcom/kakao/keditor/cdm/CDM;", "", "version", "", "data", "", "Lcom/kakao/keditor/cdm/CDM$Item;", "representationImage", "representation", "", "Lcom/kakao/keditor/cdm/CDM$RepresentationItem;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "getData", "()Ljava/util/List;", "getRepresentation", "()Ljava/util/Map;", "getRepresentationImage", "()Ljava/lang/String;", "setRepresentationImage", "(Ljava/lang/String;)V", "getVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "isValidate", "restoreRepresentationImage", "", "toString", "Item", "RepresentationItem", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCDM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CDM.kt\ncom/kakao/keditor/cdm/CDM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1747#2,3:43\n766#2:46\n857#2,2:47\n1747#2,3:49\n*S KotlinDebug\n*F\n+ 1 CDM.kt\ncom/kakao/keditor/cdm/CDM\n*L\n32#1:43,3\n33#1:46\n33#1:47,2\n33#1:49,3\n*E\n"})
public final class CDM {
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010!\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\u0017\u0010\u0014\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0015\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007HÆ\u0003J=\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u0016\b\u0002\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001A\u00020\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001A\u001A\u00020\u001BHÖ\u0001J\t\u0010\u001C\u001A\u00020\u0003HÖ\u0001R(\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR\"\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u001D"}, d2 = {"Lcom/kakao/keditor/cdm/CDM$Item;", "", "type", "", "attribute", "", "children", "", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "getAttribute", "()Ljava/util/Map;", "setAttribute", "(Ljava/util/Map;)V", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Item {
        @Nullable
        private Map attribute;
        @Nullable
        private List children;
        @NotNull
        private final String type;

        public Item(@NotNull String s, @Nullable Map map0, @Nullable List list0) {
            Intrinsics.checkNotNullParameter(s, "type");
            super();
            this.type = s;
            this.attribute = map0;
            this.children = list0;
        }

        public Item(String s, Map map0, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                map0 = null;
            }
            if((v & 4) != 0) {
                list0 = null;
            }
            this(s, map0, list0);
        }

        @NotNull
        public final String component1() {
            return this.type;
        }

        @Nullable
        public final Map component2() {
            return this.attribute;
        }

        @Nullable
        public final List component3() {
            return this.children;
        }

        @NotNull
        public final Item copy(@NotNull String s, @Nullable Map map0, @Nullable List list0) {
            Intrinsics.checkNotNullParameter(s, "type");
            return new Item(s, map0, list0);
        }

        public static Item copy$default(Item cDM$Item0, String s, Map map0, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                s = cDM$Item0.type;
            }
            if((v & 2) != 0) {
                map0 = cDM$Item0.attribute;
            }
            if((v & 4) != 0) {
                list0 = cDM$Item0.children;
            }
            return cDM$Item0.copy(s, map0, list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Item)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.type, ((Item)object0).type)) {
                return false;
            }
            return Intrinsics.areEqual(this.attribute, ((Item)object0).attribute) ? Intrinsics.areEqual(this.children, ((Item)object0).children) : false;
        }

        @Nullable
        public final Map getAttribute() {
            return this.attribute;
        }

        @Nullable
        public final List getChildren() {
            return this.children;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        @Override
        public int hashCode() {
            int v = this.type.hashCode();
            int v1 = 0;
            int v2 = this.attribute == null ? 0 : this.attribute.hashCode();
            List list0 = this.children;
            if(list0 != null) {
                v1 = list0.hashCode();
            }
            return (v * 0x1F + v2) * 0x1F + v1;
        }

        public final void setAttribute(@Nullable Map map0) {
            this.attribute = map0;
        }

        public final void setChildren(@Nullable List list0) {
            this.children = list0;
        }

        @Override
        @NotNull
        public String toString() {
            Map map0 = this.attribute;
            List list0 = this.children;
            StringBuilder stringBuilder0 = new StringBuilder("Item(type=");
            stringBuilder0.append(this.type);
            stringBuilder0.append(", attribute=");
            stringBuilder0.append(map0);
            stringBuilder0.append(", children=");
            return a.e(stringBuilder0, list0, ")");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001A\u00020\rHÖ\u0001J\t\u0010\u000E\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u000F"}, d2 = {"Lcom/kakao/keditor/cdm/CDM$RepresentationItem;", "", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RepresentationItem {
        @NotNull
        private final String url;

        public RepresentationItem(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "url");
            super();
            this.url = s;
        }

        @NotNull
        public final String component1() {
            return this.url;
        }

        @NotNull
        public final RepresentationItem copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "url");
            return new RepresentationItem(s);
        }

        public static RepresentationItem copy$default(RepresentationItem cDM$RepresentationItem0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = cDM$RepresentationItem0.url;
            }
            return cDM$RepresentationItem0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RepresentationItem ? Intrinsics.areEqual(this.url, ((RepresentationItem)object0).url) : false;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        @Override
        public int hashCode() {
            return this.url.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "RepresentationItem(url=" + this.url + ")";
        }
    }

    @NotNull
    private final List data;
    @Nullable
    private final Map representation;
    @Nullable
    private transient String representationImage;
    @NotNull
    private final String version;

    public CDM(@NotNull String s, @NotNull List list0, @Nullable String s1, @Nullable Map map0) {
        Intrinsics.checkNotNullParameter(s, "version");
        Intrinsics.checkNotNullParameter(list0, "data");
        super();
        this.version = s;
        this.data = list0;
        this.representationImage = s1;
        this.representation = map0;
    }

    public CDM(String s, List list0, String s1, Map map0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            s = "1.4";
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        if((v & 8) != 0) {
            map0 = s1 == null || s1.length() == 0 ? null : w.mapOf(TuplesKt.to("image", new RepresentationItem(s1)));
        }
        this(s, list0, s1, map0);
    }

    @NotNull
    public final String component1() {
        return this.version;
    }

    @NotNull
    public final List component2() {
        return this.data;
    }

    @Nullable
    public final String component3() {
        return this.representationImage;
    }

    @Nullable
    public final Map component4() {
        return this.representation;
    }

    @NotNull
    public final CDM copy(@NotNull String s, @NotNull List list0, @Nullable String s1, @Nullable Map map0) {
        Intrinsics.checkNotNullParameter(s, "version");
        Intrinsics.checkNotNullParameter(list0, "data");
        return new CDM(s, list0, s1, map0);
    }

    public static CDM copy$default(CDM cDM0, String s, List list0, String s1, Map map0, int v, Object object0) {
        if((v & 1) != 0) {
            s = cDM0.version;
        }
        if((v & 2) != 0) {
            list0 = cDM0.data;
        }
        if((v & 4) != 0) {
            s1 = cDM0.representationImage;
        }
        if((v & 8) != 0) {
            map0 = cDM0.representation;
        }
        return cDM0.copy(s, list0, s1, map0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CDM)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.version, ((CDM)object0).version)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.data, ((CDM)object0).data)) {
            return false;
        }
        return Intrinsics.areEqual(this.representationImage, ((CDM)object0).representationImage) ? Intrinsics.areEqual(this.representation, ((CDM)object0).representation) : false;
    }

    @NotNull
    public final List getData() {
        return this.data;
    }

    @Nullable
    public final Map getRepresentation() {
        return this.representation;
    }

    @Nullable
    public final String getRepresentationImage() {
        return this.representationImage;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    @Override
    public int hashCode() {
        int v = b.c(this.data, this.version.hashCode() * 0x1F, 0x1F);
        int v1 = 0;
        int v2 = this.representationImage == null ? 0 : this.representationImage.hashCode();
        Map map0 = this.representation;
        if(map0 != null) {
            v1 = map0.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    public final boolean isValidate() {
        if(this.version != null && this.version.length() != 0 && Integer.parseInt(((String)StringsKt__StringsKt.split$default(this.version, new String[]{"."}, false, 0, 6, null).get(0))) <= 1) {
            Iterable iterable0 = this.data;
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                for(Object object0: iterable0) {
                    String s = ((Item)object0).getType();
                    if(s == null || s.length() == 0) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: this.data) {
                if(((Item)object1).getChildren() != null) {
                    arrayList0.add(object1);
                }
            }
            if(!arrayList0.isEmpty()) {
                for(Object object2: arrayList0) {
                    List list0 = ((Item)object2).getChildren();
                    Intrinsics.checkNotNull(list0);
                    Iterable iterable1 = list0;
                    if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
                        for(Object object3: iterable1) {
                            String s1 = ((Item)object3).getType();
                            if(s1 == null || s1.length() == 0) {
                                return false;
                            }
                            if(false) {
                                break;
                            }
                        }
                        if(false) {
                            break;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void restoreRepresentationImage() {
        String s;
        Map map0 = this.representation;
        if(map0 == null) {
            s = null;
        }
        else {
            RepresentationItem cDM$RepresentationItem0 = (RepresentationItem)map0.get("image");
            s = cDM$RepresentationItem0 == null ? null : cDM$RepresentationItem0.getUrl();
        }
        this.representationImage = s;
    }

    public final void setRepresentationImage(@Nullable String s) {
        this.representationImage = s;
    }

    @Override
    @NotNull
    public String toString() {
        return "CDM(version=\'" + this.version + "\', data=" + this.data + ", representation=" + this.representation + ")";
    }
}

