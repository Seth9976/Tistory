package androidx.paging;

import a5.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001C\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\u000E\u000F\u0010\u0011JD\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00012\"\u0010\u0006\u001A\u001E\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00012(\u0010\u0006\u001A$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0096@¢\u0006\u0004\b\n\u0010\bJ:\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\f\u001A\u001E\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0096@¢\u0006\u0004\b\r\u0010\b\u0082\u0001\u0004\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Landroidx/paging/PageEvent;", "", "T", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "transform", "map", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "flatMap", "", "predicate", "filter", "Drop", "Insert", "LoadStateUpdate", "StaticList", "Landroidx/paging/PageEvent$Drop;", "Landroidx/paging/PageEvent$Insert;", "Landroidx/paging/PageEvent$LoadStateUpdate;", "Landroidx/paging/PageEvent$StaticList;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class PageEvent {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u000F\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\'\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\u0006¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J>\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u0010R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u0012R\u0017\u0010\b\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001A\u0004\b#\u0010\u0012R\u0017\u0010\t\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010 \u001A\u0004\b%\u0010\u0012R\u0011\u0010\'\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b&\u0010\u0012¨\u0006("}, d2 = {"Landroidx/paging/PageEvent$Drop;", "", "T", "Landroidx/paging/PageEvent;", "Landroidx/paging/LoadType;", "loadType", "", "minPageOffset", "maxPageOffset", "placeholdersRemaining", "<init>", "(Landroidx/paging/LoadType;III)V", "", "toString", "()Ljava/lang/String;", "component1", "()Landroidx/paging/LoadType;", "component2", "()I", "component3", "component4", "copy", "(Landroidx/paging/LoadType;III)Landroidx/paging/PageEvent$Drop;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/paging/LoadType;", "getLoadType", "b", "I", "getMinPageOffset", "c", "getMaxPageOffset", "d", "getPlaceholdersRemaining", "getPageCount", "pageCount", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nPageEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$Drop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,318:1\n1#2:319\n*E\n"})
    public static final class Drop extends PageEvent {
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
        public final class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] arr_v = new int[LoadType.values().length];
                try {
                    arr_v[LoadType.APPEND.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[LoadType.PREPEND.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                WhenMappings.$EnumSwitchMapping$0 = arr_v;
            }
        }

        public final LoadType a;
        public final int b;
        public final int c;
        public final int d;

        public Drop(@NotNull LoadType loadType0, int v, int v1, int v2) {
            Intrinsics.checkNotNullParameter(loadType0, "loadType");
            super(null);
            this.a = loadType0;
            this.b = v;
            this.c = v1;
            this.d = v2;
            if(loadType0 == LoadType.REFRESH) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            }
            if(this.getPageCount() <= 0) {
                throw new IllegalArgumentException(("Drop count must be > 0, but was " + this.getPageCount()).toString());
            }
            if(v2 < 0) {
                throw new IllegalArgumentException(("Invalid placeholdersRemaining " + v2).toString());
            }
        }

        @NotNull
        public final LoadType component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        public final int component3() {
            return this.c;
        }

        public final int component4() {
            return this.d;
        }

        @NotNull
        public final Drop copy(@NotNull LoadType loadType0, int v, int v1, int v2) {
            Intrinsics.checkNotNullParameter(loadType0, "loadType");
            return new Drop(loadType0, v, v1, v2);
        }

        public static Drop copy$default(Drop pageEvent$Drop0, LoadType loadType0, int v, int v1, int v2, int v3, Object object0) {
            if((v3 & 1) != 0) {
                loadType0 = pageEvent$Drop0.a;
            }
            if((v3 & 2) != 0) {
                v = pageEvent$Drop0.b;
            }
            if((v3 & 4) != 0) {
                v1 = pageEvent$Drop0.c;
            }
            if((v3 & 8) != 0) {
                v2 = pageEvent$Drop0.d;
            }
            return pageEvent$Drop0.copy(loadType0, v, v1, v2);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Drop)) {
                return false;
            }
            if(this.a != ((Drop)object0).a) {
                return false;
            }
            if(this.b != ((Drop)object0).b) {
                return false;
            }
            return this.c == ((Drop)object0).c ? this.d == ((Drop)object0).d : false;
        }

        @NotNull
        public final LoadType getLoadType() {
            return this.a;
        }

        public final int getMaxPageOffset() {
            return this.c;
        }

        public final int getMinPageOffset() {
            return this.b;
        }

        public final int getPageCount() {
            return this.c - this.b + 1;
        }

        public final int getPlaceholdersRemaining() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return this.d + a.c(this.c, a.c(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            String s;
            switch(WhenMappings.$EnumSwitchMapping$0[this.a.ordinal()]) {
                case 1: {
                    s = "end";
                    break;
                }
                case 2: {
                    s = "front";
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
                }
            }
            StringBuilder stringBuilder0 = b.v("PageEvent.Drop from the ", s, " (\n                    |   minPageOffset: ");
            stringBuilder0.append(this.b);
            stringBuilder0.append("\n                    |   maxPageOffset: ");
            stringBuilder0.append(this.c);
            stringBuilder0.append("\n                    |   placeholdersRemaining: ");
            return k.trimMargin$default(wb.a.c(this.d, "\n                    |)", stringBuilder0), null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001C\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\b\u0018\u0000 A*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001AJO\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00012*\u0010\b\u001A&\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00070\u00060\u0005H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\t\u0010\nJD\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00020\u0003\"\b\b\u0002\u0010\u0004*\u00020\u00012\"\u0010\b\u001A\u001E\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0096@\u00A2\u0006\u0004\b\u000E\u0010\u000FJJ\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00020\u0003\"\b\b\u0002\u0010\u0004*\u00020\u00012(\u0010\b\u001A$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00100\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0096@\u00A2\u0006\u0004\b\u0011\u0010\u000FJ:\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\u0013\u001A\u001E\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0096@\u00A2\u0006\u0004\b\u0014\u0010\u000FJ\u000F\u0010\u0016\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0018H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001C\u0010\u001B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001E\u001A\u00020\u001DH\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u001DH\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001FJ\u0010\u0010\"\u001A\u00020!H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001A\u0004\u0018\u00010!H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010#J`\u0010+\u001A\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010%\u001A\u00020\u00182\u0014\b\u0002\u0010&\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00062\b\b\u0002\u0010\'\u001A\u00020\u001D2\b\b\u0002\u0010(\u001A\u00020\u001D2\b\b\u0002\u0010)\u001A\u00020!2\n\b\u0002\u0010*\u001A\u0004\u0018\u00010!H\u00C6\u0001\u00A2\u0006\u0004\b+\u0010,J\u0010\u0010-\u001A\u00020\u001DH\u00D6\u0001\u00A2\u0006\u0004\b-\u0010\u001FJ\u001A\u0010/\u001A\u00020\u00122\b\u0010.\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b/\u00100R\u0017\u0010%\u001A\u00020\u00188\u0006\u00A2\u0006\f\n\u0004\b1\u00102\u001A\u0004\b3\u0010\u001AR#\u0010&\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0006\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u0010\u001CR\u0017\u0010\'\u001A\u00020\u001D8\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010\u001FR\u0017\u0010(\u001A\u00020\u001D8\u0006\u00A2\u0006\f\n\u0004\b:\u00108\u001A\u0004\b;\u0010\u001FR\u0017\u0010)\u001A\u00020!8\u0006\u00A2\u0006\f\n\u0004\b<\u0010=\u001A\u0004\b>\u0010#R\u0019\u0010*\u001A\u0004\u0018\u00010!8\u0006\u00A2\u0006\f\n\u0004\b?\u0010=\u001A\u0004\b@\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006B"}, d2 = {"Landroidx/paging/PageEvent$Insert;", "", "T", "Landroidx/paging/PageEvent;", "R", "Lkotlin/Function1;", "", "Landroidx/paging/TransformablePage;", "transform", "transformPages$paging_common_release", "(Lkotlin/jvm/functions/Function1;)Landroidx/paging/PageEvent$Insert;", "transformPages", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "map", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "flatMap", "", "predicate", "filter", "", "toString", "()Ljava/lang/String;", "Landroidx/paging/LoadType;", "component1", "()Landroidx/paging/LoadType;", "component2", "()Ljava/util/List;", "", "component3", "()I", "component4", "Landroidx/paging/LoadStates;", "component5", "()Landroidx/paging/LoadStates;", "component6", "loadType", "pages", "placeholdersBefore", "placeholdersAfter", "sourceLoadStates", "mediatorLoadStates", "copy", "(Landroidx/paging/LoadType;Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/paging/LoadType;", "getLoadType", "b", "Ljava/util/List;", "getPages", "c", "I", "getPlaceholdersBefore", "d", "getPlaceholdersAfter", "e", "Landroidx/paging/LoadStates;", "getSourceLoadStates", "f", "getMediatorLoadStates", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nPageEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$Insert\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 LogUtil.kt\nandroidx/paging/internal/LogUtilKt\n*L\n1#1,318:1\n116#1,3:319\n119#1,5:326\n112#1,7:331\n119#1,5:346\n112#1,7:351\n119#1,5:365\n112#1,7:370\n119#1,5:384\n1549#2:322\n1620#2,3:323\n1549#2:338\n1620#2,2:339\n1549#2:341\n1620#2,3:342\n1622#2:345\n1549#2:358\n1620#2,2:359\n1864#2,3:361\n1622#2:364\n1549#2:377\n1620#2,2:378\n1864#2,3:380\n1622#2:383\n1789#2,3:389\n27#3,5:392\n*S KotlinDebug\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$Insert\n*L\n112#1:319,3\n112#1:326,5\n125#1:331,7\n125#1:346,5\n136#1:351,7\n136#1:365,5\n154#1:370,7\n154#1:384,5\n112#1:322\n112#1:323,3\n125#1:338\n125#1:339,2\n128#1:341\n128#1:342,3\n125#1:345\n136#1:358\n136#1:359,2\n139#1:361,3\n136#1:364\n154#1:377\n154#1:378,2\n157#1:380,3\n154#1:383\n233#1:389,3\n236#1:392,5\n*E\n"})
    public static final class Insert extends PageEvent {
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001JU\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00020\f\"\b\b\u0002\u0010\u0002*\u00020\u00012\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u00032\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000EJM\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00020\f\"\b\b\u0002\u0010\u0002*\u00020\u00012\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u00032\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\t¢\u0006\u0004\b\u000F\u0010\u0010JM\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00020\f\"\b\b\u0002\u0010\u0002*\u00020\u00012\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00040\u00032\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0010R\u001D\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/paging/PageEvent$Insert$Companion;", "", "T", "", "Landroidx/paging/TransformablePage;", "pages", "", "placeholdersBefore", "placeholdersAfter", "Landroidx/paging/LoadStates;", "sourceLoadStates", "mediatorLoadStates", "Landroidx/paging/PageEvent$Insert;", "Refresh", "(Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;", "Prepend", "(Ljava/util/List;ILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;", "Append", "EMPTY_REFRESH_LOCAL", "Landroidx/paging/PageEvent$Insert;", "getEMPTY_REFRESH_LOCAL", "()Landroidx/paging/PageEvent$Insert;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final Insert Append(@NotNull List list0, int v, @NotNull LoadStates loadStates0, @Nullable LoadStates loadStates1) {
                Intrinsics.checkNotNullParameter(list0, "pages");
                Intrinsics.checkNotNullParameter(loadStates0, "sourceLoadStates");
                return new Insert(LoadType.APPEND, list0, -1, v, loadStates0, loadStates1, null);
            }

            public static Insert Append$default(Companion pageEvent$Insert$Companion0, List list0, int v, LoadStates loadStates0, LoadStates loadStates1, int v1, Object object0) {
                if((v1 & 8) != 0) {
                    loadStates1 = null;
                }
                return pageEvent$Insert$Companion0.Append(list0, v, loadStates0, loadStates1);
            }

            @NotNull
            public final Insert Prepend(@NotNull List list0, int v, @NotNull LoadStates loadStates0, @Nullable LoadStates loadStates1) {
                Intrinsics.checkNotNullParameter(list0, "pages");
                Intrinsics.checkNotNullParameter(loadStates0, "sourceLoadStates");
                return new Insert(LoadType.PREPEND, list0, v, -1, loadStates0, loadStates1, null);
            }

            public static Insert Prepend$default(Companion pageEvent$Insert$Companion0, List list0, int v, LoadStates loadStates0, LoadStates loadStates1, int v1, Object object0) {
                if((v1 & 8) != 0) {
                    loadStates1 = null;
                }
                return pageEvent$Insert$Companion0.Prepend(list0, v, loadStates0, loadStates1);
            }

            @NotNull
            public final Insert Refresh(@NotNull List list0, int v, int v1, @NotNull LoadStates loadStates0, @Nullable LoadStates loadStates1) {
                Intrinsics.checkNotNullParameter(list0, "pages");
                Intrinsics.checkNotNullParameter(loadStates0, "sourceLoadStates");
                return new Insert(LoadType.REFRESH, list0, v, v1, loadStates0, loadStates1, null);
            }

            public static Insert Refresh$default(Companion pageEvent$Insert$Companion0, List list0, int v, int v1, LoadStates loadStates0, LoadStates loadStates1, int v2, Object object0) {
                if((v2 & 16) != 0) {
                    loadStates1 = null;
                }
                return pageEvent$Insert$Companion0.Refresh(list0, v, v1, loadStates0, loadStates1);
            }

            @NotNull
            public final Insert getEMPTY_REFRESH_LOCAL() {
                return Insert.g;
            }
        }

        @NotNull
        public static final Companion Companion;
        public final LoadType a;
        public final List b;
        public final int c;
        public final int d;
        public final LoadStates e;
        public final LoadStates f;
        public static final Insert g;

        static {
            Companion pageEvent$Insert$Companion0 = new Companion(null);
            Insert.Companion = pageEvent$Insert$Companion0;
            Insert.g = Companion.Refresh$default(pageEvent$Insert$Companion0, kotlin.collections.k.listOf(TransformablePage.Companion.getEMPTY_INITIAL_PAGE()), 0, 0, new LoadStates(NotLoading.Companion.getIncomplete$paging_common_release(), NotLoading.Companion.getComplete$paging_common_release(), NotLoading.Companion.getComplete$paging_common_release()), null, 16, null);
        }

        public Insert(LoadType loadType0, List list0, int v, int v1, LoadStates loadStates0, LoadStates loadStates1) {
            super(null);
            this.a = loadType0;
            this.b = list0;
            this.c = v;
            this.d = v1;
            this.e = loadStates0;
            this.f = loadStates1;
            if(loadType0 != LoadType.APPEND && v < 0) {
                throw new IllegalArgumentException(("Prepend insert defining placeholdersBefore must be > 0, but was " + v).toString());
            }
            if(loadType0 != LoadType.PREPEND && v1 < 0) {
                throw new IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was " + v1).toString());
            }
            if(loadType0 == LoadType.REFRESH && list0.isEmpty()) {
                throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
            }
        }

        public Insert(LoadType loadType0, List list0, int v, int v1, LoadStates loadStates0, LoadStates loadStates1, DefaultConstructorMarker defaultConstructorMarker0) {
            this(loadType0, list0, v, v1, loadStates0, loadStates1);
        }

        @NotNull
        public final LoadType component1() {
            return this.a;
        }

        @NotNull
        public final List component2() {
            return this.b;
        }

        public final int component3() {
            return this.c;
        }

        public final int component4() {
            return this.d;
        }

        @NotNull
        public final LoadStates component5() {
            return this.e;
        }

        @Nullable
        public final LoadStates component6() {
            return this.f;
        }

        @NotNull
        public final Insert copy(@NotNull LoadType loadType0, @NotNull List list0, int v, int v1, @NotNull LoadStates loadStates0, @Nullable LoadStates loadStates1) {
            Intrinsics.checkNotNullParameter(loadType0, "loadType");
            Intrinsics.checkNotNullParameter(list0, "pages");
            Intrinsics.checkNotNullParameter(loadStates0, "sourceLoadStates");
            return new Insert(loadType0, list0, v, v1, loadStates0, loadStates1);
        }

        public static Insert copy$default(Insert pageEvent$Insert0, LoadType loadType0, List list0, int v, int v1, LoadStates loadStates0, LoadStates loadStates1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                loadType0 = pageEvent$Insert0.a;
            }
            if((v2 & 2) != 0) {
                list0 = pageEvent$Insert0.b;
            }
            if((v2 & 4) != 0) {
                v = pageEvent$Insert0.c;
            }
            if((v2 & 8) != 0) {
                v1 = pageEvent$Insert0.d;
            }
            if((v2 & 16) != 0) {
                loadStates0 = pageEvent$Insert0.e;
            }
            if((v2 & 0x20) != 0) {
                loadStates1 = pageEvent$Insert0.f;
            }
            return pageEvent$Insert0.copy(loadType0, list0, v, v1, loadStates0, loadStates1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Insert)) {
                return false;
            }
            if(this.a != ((Insert)object0).a) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((Insert)object0).b)) {
                return false;
            }
            if(this.c != ((Insert)object0).c) {
                return false;
            }
            if(this.d != ((Insert)object0).d) {
                return false;
            }
            return Intrinsics.areEqual(this.e, ((Insert)object0).e) ? Intrinsics.areEqual(this.f, ((Insert)object0).f) : false;
        }

        @Override  // androidx.paging.PageEvent
        @Nullable
        public Object filter(@NotNull Function2 function20, @NotNull Continuation continuation0) {
            TransformablePage transformablePage2;
            int v4;
            List list5;
            Iterator iterator4;
            Iterator iterator3;
            List list3;
            List list2;
            Object object3;
            int v3;
            TransformablePage transformablePage1;
            Function2 function22;
            Collection collection2;
            Iterator iterator2;
            Collection collection1;
            int v1;
            Iterator iterator0;
            Function2 function21;
            LoadType loadType0;
            Insert pageEvent$Insert0;
            Collection collection0;
            b0 b00;
            if(continuation0 instanceof b0) {
                b00 = (b0)continuation0;
                int v = b00.D;
                if((v & 0x80000000) == 0) {
                    b00 = new b0(this, continuation0);
                }
                else {
                    b00.D = v ^ 0x80000000;
                }
            }
            else {
                b00 = new b0(this, continuation0);
            }
            Object object0 = b00.B;
            Object object1 = qd.a.getCOROUTINE_SUSPENDED();
            switch(b00.D) {
                case 0: {
                    ResultKt.throwOnFailure(object0);
                    Iterable iterable0 = this.getPages();
                    collection0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
                    pageEvent$Insert0 = this;
                    loadType0 = this.getLoadType();
                    function21 = function20;
                    iterator0 = iterable0.iterator();
                    goto label_89;
                }
                case 1: {
                    v1 = b00.A;
                    int v2 = b00.z;
                    collection1 = b00.y;
                    Object object2 = b00.x;
                    Iterator iterator1 = b00.w;
                    List list0 = b00.v;
                    List list1 = b00.u;
                    TransformablePage transformablePage0 = b00.t;
                    iterator2 = b00.s;
                    collection2 = b00.r;
                    LoadType loadType1 = b00.q;
                    Insert pageEvent$Insert1 = b00.p;
                    function22 = b00.o;
                    ResultKt.throwOnFailure(object0);
                    pageEvent$Insert0 = pageEvent$Insert1;
                    loadType0 = loadType1;
                    transformablePage1 = transformablePage0;
                    v3 = v2;
                    object3 = object2;
                    list2 = list1;
                    list3 = list0;
                    iterator3 = iterator1;
                    break;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
            while(true) {
                if(((Boolean)object0).booleanValue()) {
                    list2.add(object3);
                    List list4 = transformablePage1.getHintOriginalIndices();
                    if(list4 != null) {
                        v1 = ((Number)list4.get(v1)).intValue();
                    }
                    list3.add(Boxing.boxInt(v1));
                }
                function21 = function22;
                iterator4 = iterator3;
                list5 = list3;
                v4 = v3;
                iterator0 = iterator2;
                collection0 = collection2;
                transformablePage2 = transformablePage1;
            label_56:
                if(!iterator4.hasNext()) {
                    break;
                }
                Object object4 = iterator4.next();
                if(v4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                b00.o = function21;
                b00.p = pageEvent$Insert0;
                b00.q = loadType0;
                b00.r = collection0;
                b00.s = iterator0;
                b00.t = transformablePage2;
                b00.u = list2;
                b00.v = list5;
                b00.w = iterator4;
                b00.x = object4;
                b00.y = collection1;
                b00.z = v4 + 1;
                b00.A = v4;
                b00.D = 1;
                Object object5 = function21.invoke(object4, b00);
                if(object5 == object1) {
                    return object1;
                }
                function22 = function21;
                object0 = object5;
                transformablePage1 = transformablePage2;
                v3 = v4 + 1;
                collection2 = collection0;
                v1 = v4;
                list3 = list5;
                iterator3 = iterator4;
                object3 = object4;
                iterator2 = iterator0;
            }
            collection1.add(new TransformablePage(transformablePage2.getOriginalPageOffsets(), list2, transformablePage2.getHintOriginalPageOffset(), list5));
        label_89:
            if(iterator0.hasNext()) {
                Object object6 = iterator0.next();
                list2 = new ArrayList();
                ArrayList arrayList0 = new ArrayList();
                Iterator iterator5 = ((TransformablePage)object6).getData().iterator();
                v4 = 0;
                transformablePage2 = (TransformablePage)object6;
                collection1 = collection0;
                list5 = arrayList0;
                iterator4 = iterator5;
                goto label_56;
            }
            return new Insert(loadType0, ((List)collection0), pageEvent$Insert0.getPlaceholdersBefore(), pageEvent$Insert0.getPlaceholdersAfter(), pageEvent$Insert0.getSourceLoadStates(), pageEvent$Insert0.getMediatorLoadStates(), null);
        }

        @Override  // androidx.paging.PageEvent
        @Nullable
        public Object flatMap(@NotNull Function2 function20, @NotNull Continuation continuation0) {
            TransformablePage transformablePage2;
            int v4;
            List list3;
            int v3;
            TransformablePage transformablePage1;
            Function2 function22;
            LoadType loadType1;
            Collection collection3;
            Iterator iterator2;
            List list1;
            List list0;
            Iterator iterator1;
            Collection collection2;
            Collection collection1;
            int v1;
            Iterator iterator0;
            Function2 function21;
            LoadType loadType0;
            Insert pageEvent$Insert0;
            Collection collection0;
            c0 c00;
            if(continuation0 instanceof c0) {
                c00 = (c0)continuation0;
                int v = c00.D;
                if((v & 0x80000000) == 0) {
                    c00 = new c0(this, continuation0);
                }
                else {
                    c00.D = v ^ 0x80000000;
                }
            }
            else {
                c00 = new c0(this, continuation0);
            }
            Object object0 = c00.B;
            Object object1 = qd.a.getCOROUTINE_SUSPENDED();
            switch(c00.D) {
                case 0: {
                    ResultKt.throwOnFailure(object0);
                    Iterable iterable0 = this.getPages();
                    collection0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
                    pageEvent$Insert0 = this;
                    loadType0 = this.getLoadType();
                    function21 = function20;
                    iterator0 = iterable0.iterator();
                    goto label_85;
                }
                case 1: {
                    v1 = c00.A;
                    int v2 = c00.z;
                    collection1 = c00.y;
                    collection2 = c00.x;
                    iterator1 = c00.w;
                    list0 = c00.v;
                    list1 = c00.u;
                    TransformablePage transformablePage0 = c00.t;
                    iterator2 = c00.s;
                    collection3 = c00.r;
                    loadType1 = c00.q;
                    Insert pageEvent$Insert1 = c00.p;
                    function22 = c00.o;
                    ResultKt.throwOnFailure(object0);
                    transformablePage1 = transformablePage0;
                    v3 = v2;
                    pageEvent$Insert0 = pageEvent$Insert1;
                    break;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
            while(true) {
                o.addAll(collection2, ((Iterable)object0));
                List list2 = transformablePage1.getHintOriginalIndices();
                if(list2 != null) {
                    v1 = ((Number)list2.get(v1)).intValue();
                }
                while(list0.size() < list1.size()) {
                    list0.add(Boxing.boxInt(v1));
                }
                function21 = function22;
                list3 = list1;
                v4 = v3;
                iterator0 = iterator2;
                collection0 = collection3;
                loadType0 = loadType1;
                transformablePage2 = transformablePage1;
            label_52:
                if(!iterator1.hasNext()) {
                    break;
                }
                Object object2 = iterator1.next();
                if(v4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                c00.o = function21;
                c00.p = pageEvent$Insert0;
                c00.q = loadType0;
                c00.r = collection0;
                c00.s = iterator0;
                c00.t = transformablePage2;
                c00.u = list3;
                c00.v = list0;
                c00.w = iterator1;
                c00.x = list3;
                c00.y = collection1;
                c00.z = v4 + 1;
                c00.A = v4;
                c00.D = 1;
                Object object3 = function21.invoke(object2, c00);
                if(object3 == object1) {
                    return object1;
                }
                transformablePage1 = transformablePage2;
                v3 = v4 + 1;
                collection3 = collection0;
                v1 = v4;
                list1 = list3;
                collection2 = list3;
                loadType1 = loadType0;
                function22 = function21;
                object0 = object3;
                iterator2 = iterator0;
            }
            collection1.add(new TransformablePage(transformablePage2.getOriginalPageOffsets(), list3, transformablePage2.getHintOriginalPageOffset(), list0));
        label_85:
            if(iterator0.hasNext()) {
                Object object4 = iterator0.next();
                list3 = new ArrayList();
                ArrayList arrayList0 = new ArrayList();
                Iterator iterator3 = ((TransformablePage)object4).getData().iterator();
                v4 = 0;
                transformablePage2 = (TransformablePage)object4;
                collection1 = collection0;
                list0 = arrayList0;
                iterator1 = iterator3;
                goto label_52;
            }
            return new Insert(loadType0, ((List)collection0), pageEvent$Insert0.getPlaceholdersBefore(), pageEvent$Insert0.getPlaceholdersAfter(), pageEvent$Insert0.getSourceLoadStates(), pageEvent$Insert0.getMediatorLoadStates(), null);
        }

        @NotNull
        public final LoadType getLoadType() {
            return this.a;
        }

        @Nullable
        public final LoadStates getMediatorLoadStates() {
            return this.f;
        }

        @NotNull
        public final List getPages() {
            return this.b;
        }

        public final int getPlaceholdersAfter() {
            return this.d;
        }

        public final int getPlaceholdersBefore() {
            return this.c;
        }

        @NotNull
        public final LoadStates getSourceLoadStates() {
            return this.e;
        }

        @Override
        public int hashCode() {
            int v = a.c(this.d, a.c(this.c, b.c(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F), 0x1F);
            int v1 = this.e.hashCode();
            return this.f == null ? (v1 + v) * 0x1F : (v1 + v) * 0x1F + this.f.hashCode();
        }

        @Override  // androidx.paging.PageEvent
        @Nullable
        public Object map(@NotNull Function2 function20, @NotNull Continuation continuation0) {
            TransformablePage transformablePage2;
            Collection collection7;
            Collection collection6;
            Iterator iterator4;
            Insert pageEvent$Insert2;
            Collection collection5;
            LoadType loadType2;
            Iterator iterator3;
            TransformablePage transformablePage1;
            Function2 function22;
            Collection collection4;
            Iterator iterator2;
            int[] arr_v;
            Collection collection2;
            Collection collection1;
            Iterator iterator0;
            Function2 function21;
            Insert pageEvent$Insert0;
            LoadType loadType0;
            Collection collection0;
            d0 d00;
            if(continuation0 instanceof d0) {
                d00 = (d0)continuation0;
                int v = d00.B;
                if((v & 0x80000000) == 0) {
                    d00 = new d0(this, continuation0);
                }
                else {
                    d00.B = v ^ 0x80000000;
                }
            }
            else {
                d00 = new d0(this, continuation0);
            }
            Object object0 = d00.z;
            Object object1 = qd.a.getCOROUTINE_SUSPENDED();
            switch(d00.B) {
                case 0: {
                    ResultKt.throwOnFailure(object0);
                    Iterable iterable0 = this.getPages();
                    collection0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
                    loadType0 = this.getLoadType();
                    pageEvent$Insert0 = this;
                    function21 = function20;
                    iterator0 = iterable0.iterator();
                    goto label_74;
                }
                case 1: {
                    collection1 = d00.y;
                    collection2 = d00.x;
                    Iterator iterator1 = d00.w;
                    Collection collection3 = d00.v;
                    arr_v = d00.u;
                    TransformablePage transformablePage0 = d00.t;
                    iterator2 = d00.s;
                    collection4 = d00.r;
                    LoadType loadType1 = d00.q;
                    Insert pageEvent$Insert1 = d00.p;
                    function22 = d00.o;
                    ResultKt.throwOnFailure(object0);
                    transformablePage1 = transformablePage0;
                    iterator3 = iterator1;
                    loadType2 = loadType1;
                    collection5 = collection3;
                    pageEvent$Insert2 = pageEvent$Insert1;
                    break;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
            while(true) {
                collection2.add(object0);
                function21 = function22;
                iterator4 = iterator2;
                collection6 = collection4;
                collection7 = collection5;
                transformablePage2 = transformablePage1;
            label_44:
                if(!iterator3.hasNext()) {
                    break;
                }
                Object object2 = iterator3.next();
                d00.o = function21;
                d00.p = pageEvent$Insert2;
                d00.q = loadType2;
                d00.r = collection6;
                d00.s = iterator4;
                d00.t = transformablePage2;
                d00.u = arr_v;
                d00.v = collection7;
                d00.w = iterator3;
                d00.x = collection7;
                d00.y = collection1;
                d00.B = 1;
                Object object3 = function21.invoke(object2, d00);
                if(object3 == object1) {
                    return object1;
                }
                transformablePage1 = transformablePage2;
                collection4 = collection6;
                collection2 = collection7;
                iterator2 = iterator4;
                function22 = function21;
                object0 = object3;
                collection5 = collection2;
            }
            collection1.add(new TransformablePage(arr_v, ((List)collection7), transformablePage2.getHintOriginalPageOffset(), transformablePage2.getHintOriginalIndices()));
            iterator0 = iterator4;
            collection0 = collection6;
            loadType0 = loadType2;
            pageEvent$Insert0 = pageEvent$Insert2;
        label_74:
            if(iterator0.hasNext()) {
                Object object4 = iterator0.next();
                arr_v = ((TransformablePage)object4).getOriginalPageOffsets();
                Iterable iterable1 = ((TransformablePage)object4).getData();
                collection7 = new ArrayList(l.collectionSizeOrDefault(iterable1, 10));
                iterator3 = iterable1.iterator();
                transformablePage2 = (TransformablePage)object4;
                pageEvent$Insert2 = pageEvent$Insert0;
                loadType2 = loadType0;
                collection6 = collection0;
                iterator4 = iterator0;
                collection1 = collection6;
                goto label_44;
            }
            return new Insert(loadType0, ((List)collection0), pageEvent$Insert0.getPlaceholdersBefore(), pageEvent$Insert0.getPlaceholdersAfter(), pageEvent$Insert0.getSourceLoadStates(), pageEvent$Insert0.getMediatorLoadStates(), null);
        }

        @Override
        @NotNull
        public String toString() {
            Object object2;
            Object object1;
            List list0 = this.b;
            int v = 0;
            for(Object object0: list0) {
                v += ((TransformablePage)object0).getData().size();
            }
            String s = "none";
            String s1 = this.c == -1 ? "none" : String.valueOf(this.c);
            int v1 = this.d;
            if(v1 != -1) {
                s = String.valueOf(v1);
            }
            StringBuilder stringBuilder0 = new StringBuilder("PageEvent.Insert for ");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", with ");
            stringBuilder0.append(v);
            stringBuilder0.append(" items (\n                    |   first item: ");
            TransformablePage transformablePage0 = (TransformablePage)CollectionsKt___CollectionsKt.firstOrNull(list0);
            if(transformablePage0 == null) {
                object1 = null;
            }
            else {
                List list1 = transformablePage0.getData();
                object1 = list1 == null ? null : CollectionsKt___CollectionsKt.firstOrNull(list1);
            }
            stringBuilder0.append(object1);
            stringBuilder0.append("\n                    |   last item: ");
            TransformablePage transformablePage1 = (TransformablePage)CollectionsKt___CollectionsKt.lastOrNull(list0);
            if(transformablePage1 == null) {
                object2 = null;
            }
            else {
                List list2 = transformablePage1.getData();
                object2 = list2 == null ? null : CollectionsKt___CollectionsKt.lastOrNull(list2);
            }
            stringBuilder0.append(object2);
            stringBuilder0.append("\n                    |   placeholdersBefore: ");
            stringBuilder0.append(s1);
            stringBuilder0.append("\n                    |   placeholdersAfter: ");
            stringBuilder0.append(s);
            stringBuilder0.append("\n                    |   sourceLoadStates: ");
            stringBuilder0.append(this.e);
            stringBuilder0.append("\n                    ");
            String s2 = stringBuilder0.toString();
            LoadStates loadStates0 = this.f;
            if(loadStates0 != null) {
                s2 = s2 + "|   mediatorLoadStates: " + loadStates0 + '\n';
            }
            return k.trimMargin$default((s2 + "|)"), null, 1, null);
        }

        @NotNull
        public final Insert transformPages$paging_common_release(@NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(function10, "transform");
            return new Insert(this.getLoadType(), ((List)function10.invoke(this.getPages())), this.getPlaceholdersBefore(), this.getPlaceholdersAfter(), this.getSourceLoadStates(), this.getMediatorLoadStates(), null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001B\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000E\u001A\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000E\u0010\rJ,\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0016\u001A\u00020\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\rR\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u0019\u001A\u0004\b\u001C\u0010\r¨\u0006\u001D"}, d2 = {"Landroidx/paging/PageEvent$LoadStateUpdate;", "", "T", "Landroidx/paging/PageEvent;", "Landroidx/paging/LoadStates;", "source", "mediator", "<init>", "(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Landroidx/paging/LoadStates;", "component2", "copy", "(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$LoadStateUpdate;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/paging/LoadStates;", "getSource", "b", "getMediator", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nPageEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$LoadStateUpdate\n+ 2 LogUtil.kt\nandroidx/paging/internal/LogUtilKt\n*L\n1#1,318:1\n27#2,5:319\n*S KotlinDebug\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$LoadStateUpdate\n*L\n300#1:319,5\n*E\n"})
    public static final class LoadStateUpdate extends PageEvent {
        public final LoadStates a;
        public final LoadStates b;

        public LoadStateUpdate(@NotNull LoadStates loadStates0, @Nullable LoadStates loadStates1) {
            Intrinsics.checkNotNullParameter(loadStates0, "source");
            super(null);
            this.a = loadStates0;
            this.b = loadStates1;
        }

        public LoadStateUpdate(LoadStates loadStates0, LoadStates loadStates1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                loadStates1 = null;
            }
            this(loadStates0, loadStates1);
        }

        @NotNull
        public final LoadStates component1() {
            return this.a;
        }

        @Nullable
        public final LoadStates component2() {
            return this.b;
        }

        @NotNull
        public final LoadStateUpdate copy(@NotNull LoadStates loadStates0, @Nullable LoadStates loadStates1) {
            Intrinsics.checkNotNullParameter(loadStates0, "source");
            return new LoadStateUpdate(loadStates0, loadStates1);
        }

        public static LoadStateUpdate copy$default(LoadStateUpdate pageEvent$LoadStateUpdate0, LoadStates loadStates0, LoadStates loadStates1, int v, Object object0) {
            if((v & 1) != 0) {
                loadStates0 = pageEvent$LoadStateUpdate0.a;
            }
            if((v & 2) != 0) {
                loadStates1 = pageEvent$LoadStateUpdate0.b;
            }
            return pageEvent$LoadStateUpdate0.copy(loadStates0, loadStates1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof LoadStateUpdate)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((LoadStateUpdate)object0).a) ? Intrinsics.areEqual(this.b, ((LoadStateUpdate)object0).b) : false;
        }

        @Nullable
        public final LoadStates getMediator() {
            return this.b;
        }

        @NotNull
        public final LoadStates getSource() {
            return this.a;
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            String s = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.a + "\n                    ";
            LoadStates loadStates0 = this.b;
            if(loadStates0 != null) {
                s = s + "|   mediatorLoadStates: " + loadStates0 + '\n';
            }
            return k.trimMargin$default((s + "|)"), null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001C\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000E\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\u0004\b\t\u0010\nJD\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00020\u0003\"\b\b\u0002\u0010\u000B*\u00020\u00012\"\u0010\u000E\u001A\u001E\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0096@\u00A2\u0006\u0004\b\u000F\u0010\u0010JJ\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00020\u0003\"\b\b\u0002\u0010\u000B*\u00020\u00012(\u0010\u000E\u001A$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00110\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0096@\u00A2\u0006\u0004\b\u0012\u0010\u0010J:\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\u0014\u001A\u001E\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0096@\u00A2\u0006\u0004\b\u0015\u0010\u0010J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0012\u0010\u001B\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0012\u0010\u001D\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001CJ>\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00010\u00002\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0006H\u00C6\u0001\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010!\u001A\u00020 H\u00D6\u0001\u00A2\u0006\u0004\b!\u0010\"J\u001A\u0010$\u001A\u00020\u00132\b\u0010#\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b$\u0010%R\u001D\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u001AR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010\u001CR\u0019\u0010\b\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b,\u0010*\u001A\u0004\b-\u0010\u001C\u00A8\u0006."}, d2 = {"Landroidx/paging/PageEvent$StaticList;", "", "T", "Landroidx/paging/PageEvent;", "", "data", "Landroidx/paging/LoadStates;", "sourceLoadStates", "mediatorLoadStates", "<init>", "(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "transform", "map", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "flatMap", "", "predicate", "filter", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/util/List;", "component2", "()Landroidx/paging/LoadStates;", "component3", "copy", "(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$StaticList;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getData", "b", "Landroidx/paging/LoadStates;", "getSourceLoadStates", "c", "getMediatorLoadStates", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nPageEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$StaticList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 LogUtil.kt\nandroidx/paging/internal/LogUtilKt\n*L\n1#1,318:1\n1549#2:319\n1620#2,3:320\n1360#2:323\n1446#2,5:324\n766#2:329\n857#2,2:330\n27#3,5:332\n*S KotlinDebug\n*F\n+ 1 PageEvent.kt\nandroidx/paging/PageEvent$StaticList\n*L\n48#1:319\n48#1:320,3\n58#1:323\n58#1:324,5\n66#1:329\n66#1:330,2\n73#1:332,5\n*E\n"})
    public static final class StaticList extends PageEvent {
        public final List a;
        public final LoadStates b;
        public final LoadStates c;

        public StaticList(@NotNull List list0, @Nullable LoadStates loadStates0, @Nullable LoadStates loadStates1) {
            Intrinsics.checkNotNullParameter(list0, "data");
            super(null);
            this.a = list0;
            this.b = loadStates0;
            this.c = loadStates1;
        }

        public StaticList(List list0, LoadStates loadStates0, LoadStates loadStates1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                loadStates0 = null;
            }
            if((v & 4) != 0) {
                loadStates1 = null;
            }
            this(list0, loadStates0, loadStates1);
        }

        @NotNull
        public final List component1() {
            return this.a;
        }

        @Nullable
        public final LoadStates component2() {
            return this.b;
        }

        @Nullable
        public final LoadStates component3() {
            return this.c;
        }

        @NotNull
        public final StaticList copy(@NotNull List list0, @Nullable LoadStates loadStates0, @Nullable LoadStates loadStates1) {
            Intrinsics.checkNotNullParameter(list0, "data");
            return new StaticList(list0, loadStates0, loadStates1);
        }

        public static StaticList copy$default(StaticList pageEvent$StaticList0, List list0, LoadStates loadStates0, LoadStates loadStates1, int v, Object object0) {
            if((v & 1) != 0) {
                list0 = pageEvent$StaticList0.a;
            }
            if((v & 2) != 0) {
                loadStates0 = pageEvent$StaticList0.b;
            }
            if((v & 4) != 0) {
                loadStates1 = pageEvent$StaticList0.c;
            }
            return pageEvent$StaticList0.copy(list0, loadStates0, loadStates1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof StaticList)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((StaticList)object0).a)) {
                return false;
            }
            return Intrinsics.areEqual(this.b, ((StaticList)object0).b) ? Intrinsics.areEqual(this.c, ((StaticList)object0).c) : false;
        }

        @Override  // androidx.paging.PageEvent
        @Nullable
        public Object filter(@NotNull Function2 function20, @NotNull Continuation continuation0) {
            Function2 function21;
            Object object2;
            Iterator iterator0;
            Collection collection0;
            StaticList pageEvent$StaticList0;
            e0 e00;
            if(continuation0 instanceof e0) {
                e00 = (e0)continuation0;
                int v = e00.v;
                if((v & 0x80000000) == 0) {
                    e00 = new e0(this, continuation0);
                }
                else {
                    e00.v = v ^ 0x80000000;
                }
            }
            else {
                e00 = new e0(this, continuation0);
            }
            Object object0 = e00.t;
            Object object1 = qd.a.getCOROUTINE_SUSPENDED();
            switch(e00.v) {
                case 0: {
                    ResultKt.throwOnFailure(object0);
                    pageEvent$StaticList0 = this;
                    collection0 = new ArrayList();
                    iterator0 = this.a.iterator();
                    goto label_27;
                }
                case 1: {
                    object2 = e00.s;
                    iterator0 = e00.r;
                    collection0 = e00.q;
                    function21 = e00.p;
                    pageEvent$StaticList0 = e00.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
            while(true) {
                if(((Boolean)object0).booleanValue()) {
                    collection0.add(object2);
                }
                function20 = function21;
            label_27:
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object3 = iterator0.next();
                e00.o = pageEvent$StaticList0;
                e00.p = function20;
                e00.q = collection0;
                e00.r = iterator0;
                e00.s = object3;
                e00.v = 1;
                Object object4 = function20.invoke(object3, e00);
                if(object4 == object1) {
                    return object1;
                }
                function21 = function20;
                object2 = object3;
                object0 = object4;
            }
            return new StaticList(((List)collection0), pageEvent$StaticList0.b, pageEvent$StaticList0.c);
        }

        @Override  // androidx.paging.PageEvent
        @Nullable
        public Object flatMap(@NotNull Function2 function20, @NotNull Continuation continuation0) {
            Function2 function22;
            Iterator iterator0;
            Function2 function21;
            StaticList pageEvent$StaticList0;
            Collection collection0;
            f0 f00;
            if(continuation0 instanceof f0) {
                f00 = (f0)continuation0;
                int v = f00.u;
                if((v & 0x80000000) == 0) {
                    f00 = new f0(this, continuation0);
                }
                else {
                    f00.u = v ^ 0x80000000;
                }
            }
            else {
                f00 = new f0(this, continuation0);
            }
            Object object0 = f00.s;
            Object object1 = qd.a.getCOROUTINE_SUSPENDED();
            switch(f00.u) {
                case 0: {
                    ResultKt.throwOnFailure(object0);
                    collection0 = new ArrayList();
                    pageEvent$StaticList0 = this;
                    function21 = function20;
                    iterator0 = this.a.iterator();
                    goto label_26;
                }
                case 1: {
                    iterator0 = f00.r;
                    collection0 = f00.q;
                    function22 = f00.p;
                    pageEvent$StaticList0 = f00.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
            while(true) {
                o.addAll(collection0, ((Iterable)object0));
                function21 = function22;
            label_26:
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object2 = iterator0.next();
                f00.o = pageEvent$StaticList0;
                f00.p = function21;
                f00.q = collection0;
                f00.r = iterator0;
                f00.u = 1;
                Object object3 = function21.invoke(object2, f00);
                if(object3 == object1) {
                    return object1;
                }
                function22 = function21;
                object0 = object3;
            }
            return new StaticList(((List)collection0), pageEvent$StaticList0.b, pageEvent$StaticList0.c);
        }

        @NotNull
        public final List getData() {
            return this.a;
        }

        @Nullable
        public final LoadStates getMediatorLoadStates() {
            return this.c;
        }

        @Nullable
        public final LoadStates getSourceLoadStates() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            int v1 = 0;
            int v2 = this.b == null ? 0 : this.b.hashCode();
            LoadStates loadStates0 = this.c;
            if(loadStates0 != null) {
                v1 = loadStates0.hashCode();
            }
            return (v * 0x1F + v2) * 0x1F + v1;
        }

        @Override  // androidx.paging.PageEvent
        @Nullable
        public Object map(@NotNull Function2 function20, @NotNull Continuation continuation0) {
            Function2 function22;
            Collection collection1;
            Iterator iterator0;
            Collection collection0;
            Function2 function21;
            StaticList pageEvent$StaticList0;
            g0 g00;
            if(continuation0 instanceof g0) {
                g00 = (g0)continuation0;
                int v = g00.v;
                if((v & 0x80000000) == 0) {
                    g00 = new g0(this, continuation0);
                }
                else {
                    g00.v = v ^ 0x80000000;
                }
            }
            else {
                g00 = new g0(this, continuation0);
            }
            Object object0 = g00.t;
            Object object1 = qd.a.getCOROUTINE_SUSPENDED();
            switch(g00.v) {
                case 0: {
                    ResultKt.throwOnFailure(object0);
                    pageEvent$StaticList0 = this;
                    function21 = function20;
                    collection0 = new ArrayList(l.collectionSizeOrDefault(this.a, 10));
                    iterator0 = this.a.iterator();
                    goto label_28;
                }
                case 1: {
                    collection0 = g00.s;
                    iterator0 = g00.r;
                    collection1 = g00.q;
                    function22 = g00.p;
                    pageEvent$StaticList0 = g00.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
            while(true) {
                collection0.add(object0);
                collection0 = collection1;
                function21 = function22;
            label_28:
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object2 = iterator0.next();
                g00.o = pageEvent$StaticList0;
                g00.p = function21;
                g00.q = collection0;
                g00.r = iterator0;
                g00.s = collection0;
                g00.v = 1;
                Object object3 = function21.invoke(object2, g00);
                if(object3 == object1) {
                    return object1;
                }
                function22 = function21;
                object0 = object3;
                collection1 = collection0;
            }
            return new StaticList(((List)collection0), pageEvent$StaticList0.b, pageEvent$StaticList0.c);
        }

        @Override
        @NotNull
        public String toString() {
            String s = "PageEvent.StaticList with " + this.a.size() + " items (\n                    |   first item: " + CollectionsKt___CollectionsKt.firstOrNull(this.a) + "\n                    |   last item: " + CollectionsKt___CollectionsKt.lastOrNull(this.a) + "\n                    |   sourceLoadStates: " + this.b + "\n                    ";
            LoadStates loadStates0 = this.c;
            if(loadStates0 != null) {
                s = s + "|   mediatorLoadStates: " + loadStates0 + '\n';
            }
            return k.trimMargin$default((s + "|)"), null, 1, null);
        }
    }

    public PageEvent(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @Nullable
    public Object filter(@NotNull Function2 function20, @NotNull Continuation continuation0) {
        return this;
    }

    @Nullable
    public Object flatMap(@NotNull Function2 function20, @NotNull Continuation continuation0) {
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.PageEvent.flatMap>");
        return this;
    }

    @Nullable
    public Object map(@NotNull Function2 function20, @NotNull Continuation continuation0) {
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.PageEvent.map>");
        return this;
    }
}

