package com.kakao.keditor.plugin.itemspec.contentsearch.attrs;

import com.kakao.keditor.plugin.itemspec.contentsearch.entity.ContentItem;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.n;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\r2\u0012\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000FJ\u0014\u0010\u0011\u001A\u00020\u0010*\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u0014H\u0002J\u001C\u0010\u0015\u001A\u00020\u0010*\u00020\u00102\u0006\u0010\u0016\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u0014H\u0002J\u0016\u0010\u0018\u001A\u0004\u0018\u00010\u0012*\u00020\u00142\u0006\u0010\u0019\u001A\u00020\u0010H\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0006\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001A"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/DataParser;", "", "()V", "DATE_FORMAT_FROM_DEFAULT", "Ljava/text/SimpleDateFormat;", "DATE_FORMAT_FROM_TV", "DATE_FORMAT_TO_DEFAULT", "DATE_FORMAT_TO_EXHIBITION", "DATE_FORMAT_TO_PLAY", "DATE_FORMAT_TO_TV", "parseBy", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/entity/ContentItem;", "kind", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind;", "data", "", "", "formatTo", "Ljava/util/Date;", "dateFormat", "Ljava/text/DateFormat;", "parseDate", "dateFormatFrom", "dateFormatTo", "parseOrNull", "source", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDataParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataParser.kt\ncom/kakao/keditor/plugin/itemspec/contentsearch/attrs/DataParser\n+ 2 DataParser.kt\ncom/kakao/keditor/plugin/itemspec/contentsearch/attrs/DataParserKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n103#2:106\n103#2:118\n103#2:130\n103#2:142\n103#2:154\n103#2:166\n103#2:178\n800#3,11:107\n800#3,11:119\n800#3,11:131\n800#3,11:143\n800#3,11:155\n800#3,11:167\n800#3,11:179\n*S KotlinDebug\n*F\n+ 1 DataParser.kt\ncom/kakao/keditor/plugin/itemspec/contentsearch/attrs/DataParser\n*L\n51#1:106\n52#1:118\n55#1:130\n59#1:142\n63#1:154\n68#1:166\n75#1:178\n51#1:107,11\n52#1:119,11\n55#1:131,11\n59#1:143,11\n63#1:155,11\n68#1:167,11\n75#1:179,11\n*E\n"})
public final class DataParser {
    @NotNull
    private static final SimpleDateFormat DATE_FORMAT_FROM_DEFAULT;
    @NotNull
    private static final SimpleDateFormat DATE_FORMAT_FROM_TV;
    @NotNull
    private static final SimpleDateFormat DATE_FORMAT_TO_DEFAULT;
    @NotNull
    private static final SimpleDateFormat DATE_FORMAT_TO_EXHIBITION;
    @NotNull
    private static final SimpleDateFormat DATE_FORMAT_TO_PLAY;
    @NotNull
    private static final SimpleDateFormat DATE_FORMAT_TO_TV;
    @NotNull
    public static final DataParser INSTANCE;

    static {
        DataParser.INSTANCE = new DataParser();
        Locale locale0 = Locale.KOREA;
        DataParser.DATE_FORMAT_FROM_DEFAULT = new SimpleDateFormat("yyyy-MM-dd", locale0);
        DataParser.DATE_FORMAT_FROM_TV = new SimpleDateFormat("HH:mm", locale0);
        DataParser.DATE_FORMAT_TO_DEFAULT = new SimpleDateFormat("yyyy.MM.dd", locale0);
        DataParser.DATE_FORMAT_TO_TV = new SimpleDateFormat("a hh:mm", locale0);
        DataParser.DATE_FORMAT_TO_PLAY = new SimpleDateFormat("yyyy.MM.dd(E)", locale0);
        DataParser.DATE_FORMAT_TO_EXHIBITION = new SimpleDateFormat("yyyy.MM.dd(E)", locale0);
    }

    private final String formatTo(Date date0, DateFormat dateFormat0) {
        String s = dateFormat0.format(date0);
        Intrinsics.checkNotNullExpressionValue(s, "format(...)");
        return s;
    }

    @NotNull
    public final ContentItem parseBy(@NotNull Kind kind0, @NotNull Map map0) {
        String s36;
        String s34;
        String s31;
        String s30;
        String s28;
        String s25;
        String s22;
        String s21;
        String s19;
        String s18;
        String s16;
        String s14;
        String s12;
        ArrayList arrayList4;
        String s10;
        ArrayList arrayList2;
        String s9;
        String s7;
        String s4;
        String s2;
        Intrinsics.checkNotNullParameter(kind0, "kind");
        Intrinsics.checkNotNullParameter(map0, "data");
        Object object0 = map0.get("url");
        Intrinsics.checkNotNull(object0);
        String s = object0.toString();
        Object object1 = map0.get("image");
        if(object1 == null) {
            s2 = "";
        }
        else {
            String s1 = object1.toString();
            s2 = s1 == null ? "" : s1;
        }
        ArrayList arrayList0 = null;
        Object object2 = map0.get("title");
        Intrinsics.checkNotNull(object2);
        ContentItem contentItem0 = new ContentItem(kind0, s, s2, object2.toString(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFFF0, null);
        String s3 = "-";
        if(kind0 instanceof Music) {
            Object object3 = map0.get("artist");
            if(object3 == null) {
                s4 = "-";
            }
            else {
                s4 = object3.toString();
                if(s4 == null) {
                    s4 = "-";
                }
            }
            contentItem0.setArtist(s4);
            Object object4 = map0.get("albumTitle");
            if(object4 != null) {
                String s5 = object4.toString();
                if(s5 != null) {
                    s3 = s5;
                }
            }
            contentItem0.setAlbumTitle(s3);
            return contentItem0;
        }
        if(kind0 instanceof Movie) {
            Object object5 = map0.get("rating");
            if(object5 == null) {
            label_46:
                s7 = "";
            }
            else {
                String s6 = object5.toString();
                if(s6 == null) {
                    goto label_46;
                }
                else {
                    Float float0 = n.toFloatOrNull(s6);
                    if(float0 == null) {
                        goto label_46;
                    }
                    else {
                        s7 = ((float)(((float)float0) / 10.0f)).toString();
                        if(s7 == null) {
                            s7 = "";
                        }
                    }
                }
            }
            contentItem0.setRating(s7);
            Object object6 = map0.get("releaseDate");
            if(object6 == null) {
            label_56:
                s9 = "";
            }
            else {
                String s8 = object6.toString();
                if(s8 == null) {
                    goto label_56;
                }
                else {
                    s9 = DataParser.INSTANCE.parseDate(s8, DataParser.DATE_FORMAT_FROM_DEFAULT, DataParser.DATE_FORMAT_TO_DEFAULT);
                    if(s9 == null) {
                        s9 = "";
                    }
                }
            }
            contentItem0.setReleaseDate(s9);
            Object object7 = map0.get("directors");
            if(object7 == null) {
            label_76:
                s10 = "-";
            }
            else {
                if(object7 instanceof List) {
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object8: ((Iterable)object7)) {
                        if(object8 instanceof String) {
                            arrayList1.add(object8);
                        }
                    }
                    arrayList2 = arrayList1;
                }
                else {
                    arrayList2 = null;
                }
                if(arrayList2 == null) {
                    goto label_76;
                }
                else {
                    s10 = CollectionsKt___CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, null, 0x3F, null);
                    if(s10 == null) {
                        s10 = "-";
                    }
                }
            }
            contentItem0.setDirectors(s10);
            Object object9 = map0.get("actors");
            if(object9 != null) {
                if(object9 instanceof List) {
                    arrayList0 = new ArrayList();
                    for(Object object10: ((Iterable)object9)) {
                        if(object10 instanceof String) {
                            arrayList0.add(object10);
                        }
                    }
                }
                if(arrayList0 != null) {
                    String s11 = CollectionsKt___CollectionsKt.joinToString$default(arrayList0, null, null, null, 0, null, null, 0x3F, null);
                    if(s11 != null) {
                        s3 = s11;
                    }
                }
            }
            contentItem0.setActors(s3);
            return contentItem0;
        }
        if(kind0 instanceof Tv) {
            Object object11 = map0.get("broadcastDayOfWeek");
            if(object11 == null) {
            label_113:
                s12 = "";
            }
            else {
                if(object11 instanceof List) {
                    ArrayList arrayList3 = new ArrayList();
                    for(Object object12: ((Iterable)object11)) {
                        if(object12 instanceof String) {
                            arrayList3.add(object12);
                        }
                    }
                    arrayList4 = arrayList3;
                }
                else {
                    arrayList4 = null;
                }
                if(arrayList4 == null) {
                    goto label_113;
                }
                else {
                    s12 = CollectionsKt___CollectionsKt.joinToString$default(arrayList4, null, null, null, 0, null, null, 0x3F, null);
                    if(s12 == null) {
                        s12 = "";
                    }
                }
            }
            contentItem0.setBroadcastDayOfWeek(s12);
            Object object13 = map0.get("broadcastTime");
            if(object13 == null) {
            label_123:
                s14 = "";
            }
            else {
                String s13 = object13.toString();
                if(s13 == null) {
                    goto label_123;
                }
                else {
                    s14 = DataParser.INSTANCE.parseDate(s13, DataParser.DATE_FORMAT_FROM_TV, DataParser.DATE_FORMAT_TO_TV);
                    if(s14 == null) {
                        s14 = "";
                    }
                }
            }
            contentItem0.setBroadcastTime(s14);
            Object object14 = map0.get("startDate");
            if(object14 == null) {
            label_133:
                s16 = "";
            }
            else {
                String s15 = object14.toString();
                if(s15 == null) {
                    goto label_133;
                }
                else {
                    s16 = DataParser.INSTANCE.parseDate(s15, DataParser.DATE_FORMAT_FROM_DEFAULT, DataParser.DATE_FORMAT_TO_DEFAULT);
                    if(s16 == null) {
                        s16 = "";
                    }
                }
            }
            contentItem0.setStartDate(s16);
            Object object15 = map0.get("endDate");
            if(object15 == null) {
            label_143:
                s18 = "";
            }
            else {
                String s17 = object15.toString();
                if(s17 == null) {
                    goto label_143;
                }
                else {
                    s18 = DataParser.INSTANCE.parseDate(s17, DataParser.DATE_FORMAT_FROM_DEFAULT, DataParser.DATE_FORMAT_TO_DEFAULT);
                    if(s18 == null) {
                        s18 = "";
                    }
                }
            }
            contentItem0.setEndDate(s18);
            Object object16 = map0.get("actors");
            if(object16 == null) {
            label_160:
                s19 = "-";
            }
            else {
                if(object16 instanceof List) {
                    arrayList0 = new ArrayList();
                    for(Object object17: ((Iterable)object16)) {
                        if(object17 instanceof String) {
                            arrayList0.add(object17);
                        }
                    }
                }
                if(arrayList0 == null) {
                    goto label_160;
                }
                else {
                    s19 = CollectionsKt___CollectionsKt.joinToString$default(arrayList0, null, null, null, 0, null, null, 0x3F, null);
                    if(s19 == null) {
                        s19 = "-";
                    }
                }
            }
            contentItem0.setActors(s19);
            Object object18 = map0.get("channel");
            if(object18 != null) {
                String s20 = object18.toString();
                if(s20 != null) {
                    s3 = s20;
                }
            }
            contentItem0.setChannel(s3);
            return contentItem0;
        }
        if(kind0 instanceof Book) {
            Object object19 = map0.get("authors");
            if(object19 == null) {
            label_185:
                s21 = "-";
            }
            else {
                if(object19 instanceof List) {
                    arrayList0 = new ArrayList();
                    for(Object object20: ((Iterable)object19)) {
                        if(object20 instanceof String) {
                            arrayList0.add(object20);
                        }
                    }
                }
                if(arrayList0 == null) {
                    goto label_185;
                }
                else {
                    s21 = CollectionsKt___CollectionsKt.joinToString$default(arrayList0, null, null, null, 0, null, null, 0x3F, null);
                    if(s21 == null) {
                        s21 = "-";
                    }
                }
            }
            contentItem0.setAuthors(s21);
            Object object21 = map0.get("publisher");
            if(object21 == null) {
                s22 = "-";
            }
            else {
                s22 = object21.toString();
                if(s22 == null) {
                    s22 = "-";
                }
            }
            contentItem0.setPublisher(s22);
            Object object22 = map0.get("publicationDate");
            if(object22 != null) {
                String s23 = object22.toString();
                if(s23 != null) {
                    String s24 = DataParser.INSTANCE.parseDate(s23, DataParser.DATE_FORMAT_FROM_DEFAULT, DataParser.DATE_FORMAT_TO_DEFAULT);
                    if(s24 != null) {
                        s3 = s24;
                    }
                }
            }
            contentItem0.setPublicationDate(s3);
            return contentItem0;
        }
        if(kind0 instanceof Person) {
            Object object23 = map0.get("jobTitles");
            if(object23 == null) {
            label_220:
                s25 = "-";
            }
            else {
                if(object23 instanceof List) {
                    arrayList0 = new ArrayList();
                    for(Object object24: ((Iterable)object23)) {
                        if(object24 instanceof String) {
                            arrayList0.add(object24);
                        }
                    }
                }
                if(arrayList0 == null) {
                    goto label_220;
                }
                else {
                    s25 = CollectionsKt___CollectionsKt.joinToString$default(arrayList0, null, null, null, 0, null, null, 0x3F, null);
                    if(s25 == null) {
                        s25 = "-";
                    }
                }
            }
            contentItem0.setJobTitles(s25);
            Object object25 = map0.get("memberOf");
            if(object25 != null) {
                String s26 = object25.toString();
                if(s26 != null) {
                    s3 = s26;
                }
            }
            contentItem0.setMemberOf(s3);
            return contentItem0;
        }
        if(kind0 instanceof Play) {
            Object object26 = map0.get("startDate");
            if(object26 == null) {
            label_238:
                s28 = "";
            }
            else {
                String s27 = object26.toString();
                if(s27 == null) {
                    goto label_238;
                }
                else {
                    s28 = DataParser.INSTANCE.parseDate(s27, DataParser.DATE_FORMAT_FROM_DEFAULT, DataParser.DATE_FORMAT_TO_PLAY);
                    if(s28 == null) {
                        s28 = "";
                    }
                }
            }
            contentItem0.setStartDate(s28);
            Object object27 = map0.get("endDate");
            if(object27 == null) {
            label_248:
                s30 = "";
            }
            else {
                String s29 = object27.toString();
                if(s29 == null) {
                    goto label_248;
                }
                else {
                    s30 = DataParser.INSTANCE.parseDate(s29, DataParser.DATE_FORMAT_FROM_DEFAULT, DataParser.DATE_FORMAT_TO_PLAY);
                    if(s30 == null) {
                        s30 = "";
                    }
                }
            }
            contentItem0.setEndDate(s30);
            Object object28 = map0.get("location");
            if(object28 == null) {
                s31 = "-";
            }
            else {
                s31 = object28.toString();
                if(s31 == null) {
                    s31 = "-";
                }
            }
            contentItem0.setLocation(s31);
            Object object29 = map0.get("actors");
            if(object29 != null) {
                if(object29 instanceof List) {
                    arrayList0 = new ArrayList();
                    for(Object object30: ((Iterable)object29)) {
                        if(object30 instanceof String) {
                            arrayList0.add(object30);
                        }
                    }
                }
                if(arrayList0 != null) {
                    String s32 = CollectionsKt___CollectionsKt.joinToString$default(arrayList0, null, null, null, 0, null, null, 0x3F, null);
                    if(s32 != null) {
                        s3 = s32;
                    }
                }
            }
            contentItem0.setActors(s3);
            return contentItem0;
        }
        if(kind0 instanceof Exhibition) {
            Object object31 = map0.get("startDate");
            if(object31 == null) {
            label_283:
                s34 = "";
            }
            else {
                String s33 = object31.toString();
                if(s33 == null) {
                    goto label_283;
                }
                else {
                    s34 = DataParser.INSTANCE.parseDate(s33, DataParser.DATE_FORMAT_FROM_DEFAULT, DataParser.DATE_FORMAT_TO_EXHIBITION);
                    if(s34 == null) {
                        s34 = "";
                    }
                }
            }
            contentItem0.setStartDate(s34);
            Object object32 = map0.get("endDate");
            if(object32 == null) {
            label_293:
                s36 = "";
            }
            else {
                String s35 = object32.toString();
                if(s35 == null) {
                    goto label_293;
                }
                else {
                    s36 = DataParser.INSTANCE.parseDate(s35, DataParser.DATE_FORMAT_FROM_DEFAULT, DataParser.DATE_FORMAT_TO_EXHIBITION);
                    if(s36 == null) {
                        s36 = "";
                    }
                }
            }
            contentItem0.setEndDate(s36);
            Object object33 = map0.get("location");
            if(object33 != null) {
                String s37 = object33.toString();
                if(s37 != null) {
                    s3 = s37;
                }
            }
            contentItem0.setLocation(s3);
        }
        return contentItem0;
    }

    private final String parseDate(String s, DateFormat dateFormat0, DateFormat dateFormat1) {
        Date date0 = this.parseOrNull(dateFormat0, s);
        if(date0 != null) {
            String s1 = this.formatTo(date0, dateFormat1);
            return s1 == null ? s : s1;
        }
        return s;
    }

    private final Date parseOrNull(DateFormat dateFormat0, String s) {
        try {
            return dateFormat0.parse(s);
        }
        catch(ParseException unused_ex) {
            return null;
        }
    }
}

