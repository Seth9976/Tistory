package androidx.core.app;

import android.app.Notification.Action.Builder;
import android.app.Notification.Action;
import android.app.Notification.BubbleMetadata;
import android.app.Notification.Builder;
import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.collection.ArraySet;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Set;

public final class e2 implements NotificationBuilderWithBuilderAccessor {
    public final Context a;
    public final Notification.Builder b;
    public final Builder c;
    public final Bundle d;
    public final int e;

    public e2(Builder notificationCompat$Builder0) {
        Notification notification2;
        Bundle[] arr_bundle;
        Notification notification1;
        ArrayList arrayList4;
        ArrayList arrayList1;
        new ArrayList();
        this.d = new Bundle();
        this.c = notificationCompat$Builder0;
        Context context0 = notificationCompat$Builder0.mContext;
        this.a = context0;
        Notification.Builder notification$Builder0 = a2.a(context0, notificationCompat$Builder0.I);
        this.b = notification$Builder0;
        Notification notification0 = notificationCompat$Builder0.R;
        notification$Builder0.setWhen(notification0.when).setSmallIcon(notification0.icon, notification0.iconLevel).setContent(notification0.contentView).setTicker(notification0.tickerText, notificationCompat$Builder0.f).setVibrate(notification0.vibrate).setLights(notification0.ledARGB, notification0.ledOnMS, notification0.ledOffMS).setOngoing((notification0.flags & 2) != 0).setOnlyAlertOnce((notification0.flags & 8) != 0).setAutoCancel((notification0.flags & 16) != 0).setDefaults(notification0.defaults).setContentTitle(notificationCompat$Builder0.b).setContentText(notificationCompat$Builder0.c).setContentInfo(notificationCompat$Builder0.h).setContentIntent(notificationCompat$Builder0.d).setDeleteIntent(notification0.deleteIntent).setFullScreenIntent(notificationCompat$Builder0.e, (notification0.flags & 0x80) != 0).setNumber(notificationCompat$Builder0.i).setProgress(notificationCompat$Builder0.r, notificationCompat$Builder0.s, notificationCompat$Builder0.t);
        y1.b(notification$Builder0, (notificationCompat$Builder0.g == null ? null : notificationCompat$Builder0.g.toIcon(context0)));
        notification$Builder0.setSubText(notificationCompat$Builder0.o).setUsesChronometer(notificationCompat$Builder0.l).setPriority(notificationCompat$Builder0.j);
        Style notificationCompat$Style0 = notificationCompat$Builder0.n;
        if(notificationCompat$Style0 instanceof CallStyle) {
            for(Object object0: ((CallStyle)notificationCompat$Style0).getActionsListWithSystemActions()) {
                this.a(((Action)object0));
            }
        }
        else {
            for(Object object1: notificationCompat$Builder0.mActions) {
                this.a(((Action)object1));
            }
        }
        Bundle bundle0 = notificationCompat$Builder0.B;
        if(bundle0 != null) {
            this.d.putAll(bundle0);
        }
        int v = Build.VERSION.SDK_INT;
        this.b.setShowWhen(notificationCompat$Builder0.k);
        w1.i(this.b, notificationCompat$Builder0.x);
        w1.g(this.b, notificationCompat$Builder0.u);
        w1.j(this.b, notificationCompat$Builder0.w);
        w1.h(this.b, notificationCompat$Builder0.v);
        this.e = notificationCompat$Builder0.N;
        x1.b(this.b, notificationCompat$Builder0.A);
        x1.c(this.b, notificationCompat$Builder0.C);
        x1.f(this.b, notificationCompat$Builder0.D);
        x1.d(this.b, notificationCompat$Builder0.E);
        x1.e(this.b, notification0.sound, notification0.audioAttributes);
        if(v < 28) {
            ArrayList arrayList0 = notificationCompat$Builder0.mPersonList;
            if(arrayList0 == null) {
                arrayList1 = null;
            }
            else {
                arrayList1 = new ArrayList(arrayList0.size());
                for(Object object2: arrayList0) {
                    arrayList1.add(((Person)object2).resolveToLegacyUri());
                }
            }
            ArrayList arrayList2 = notificationCompat$Builder0.mPeople;
            if(arrayList1 == null) {
                arrayList1 = arrayList2;
            }
            else if(arrayList2 != null) {
                ArraySet arraySet0 = new ArraySet(arrayList2.size() + arrayList1.size());
                arraySet0.addAll(arrayList1);
                arraySet0.addAll(arrayList2);
                arrayList1 = new ArrayList(arraySet0);
            }
        }
        else {
            arrayList1 = notificationCompat$Builder0.mPeople;
        }
        if(arrayList1 != null && !arrayList1.isEmpty()) {
            for(Object object3: arrayList1) {
                x1.a(this.b, ((String)object3));
            }
        }
        ArrayList arrayList3 = notificationCompat$Builder0.a;
        if(arrayList3.size() > 0) {
            Bundle bundle1 = notificationCompat$Builder0.getExtras().getBundle("android.car.EXTENSIONS");
            if(bundle1 == null) {
                bundle1 = new Bundle();
            }
            Bundle bundle2 = new Bundle(bundle1);
            Bundle bundle3 = new Bundle();
            int v1 = 0;
            while(v1 < arrayList3.size()) {
                String s = Integer.toString(v1);
                Action notificationCompat$Action0 = (Action)arrayList3.get(v1);
                Bundle bundle4 = new Bundle();
                IconCompat iconCompat0 = notificationCompat$Action0.getIconCompat();
                bundle4.putInt("icon", (iconCompat0 == null ? 0 : iconCompat0.getResId()));
                bundle4.putCharSequence("title", notificationCompat$Action0.getTitle());
                bundle4.putParcelable("actionIntent", notificationCompat$Action0.getActionIntent());
                Bundle bundle5 = notificationCompat$Action0.getExtras() == null ? new Bundle() : new Bundle(notificationCompat$Action0.getExtras());
                bundle5.putBoolean("android.support.allowGeneratedReplies", notificationCompat$Action0.getAllowGeneratedReplies());
                bundle4.putBundle("extras", bundle5);
                RemoteInput[] arr_remoteInput = notificationCompat$Action0.getRemoteInputs();
                if(arr_remoteInput == null) {
                    arrayList4 = arrayList3;
                    notification1 = notification0;
                    arr_bundle = null;
                }
                else {
                    arr_bundle = new Bundle[arr_remoteInput.length];
                    arrayList4 = arrayList3;
                    for(int v2 = 0; v2 < arr_remoteInput.length; ++v2) {
                        RemoteInput remoteInput0 = arr_remoteInput[v2];
                        Bundle bundle6 = new Bundle();
                        bundle6.putString("resultKey", remoteInput0.getResultKey());
                        bundle6.putCharSequence("label", remoteInput0.getLabel());
                        bundle6.putCharSequenceArray("choices", remoteInput0.getChoices());
                        bundle6.putBoolean("allowFreeFormInput", remoteInput0.getAllowFreeFormInput());
                        bundle6.putBundle("extras", remoteInput0.getExtras());
                        Set set0 = remoteInput0.getAllowedDataTypes();
                        if(set0 != null && !set0.isEmpty()) {
                            ArrayList arrayList5 = new ArrayList(set0.size());
                            for(Object object4: set0) {
                                arrayList5.add(((String)object4));
                            }
                            bundle6.putStringArrayList("allowedDataTypes", arrayList5);
                        }
                        arr_bundle[v2] = bundle6;
                    }
                    notification1 = notification0;
                }
                bundle4.putParcelableArray("remoteInputs", arr_bundle);
                bundle4.putBoolean("showsUserInterface", notificationCompat$Action0.getShowsUserInterface());
                bundle4.putInt("semanticAction", notificationCompat$Action0.getSemanticAction());
                bundle3.putBundle(s, bundle4);
                ++v1;
                arrayList3 = arrayList4;
                notification0 = notification1;
            }
            notification2 = notification0;
            bundle1.putBundle("invisible_actions", bundle3);
            bundle2.putBundle("invisible_actions", bundle3);
            notificationCompat$Builder0.getExtras().putBundle("android.car.EXTENSIONS", bundle1);
            this.d.putBundle("android.car.EXTENSIONS", bundle2);
        }
        else {
            notification2 = notification0;
        }
        int v3 = Build.VERSION.SDK_INT;
        Icon icon0 = notificationCompat$Builder0.T;
        if(icon0 != null) {
            y1.c(this.b, icon0);
        }
        this.b.setExtras(notificationCompat$Builder0.B);
        z1.e(this.b, notificationCompat$Builder0.q);
        RemoteViews remoteViews0 = notificationCompat$Builder0.F;
        if(remoteViews0 != null) {
            z1.c(this.b, remoteViews0);
        }
        RemoteViews remoteViews1 = notificationCompat$Builder0.G;
        if(remoteViews1 != null) {
            z1.b(this.b, remoteViews1);
        }
        RemoteViews remoteViews2 = notificationCompat$Builder0.H;
        if(remoteViews2 != null) {
            z1.d(this.b, remoteViews2);
        }
        a2.b(this.b, notificationCompat$Builder0.J);
        a2.e(this.b, notificationCompat$Builder0.p);
        a2.f(this.b, notificationCompat$Builder0.K);
        a2.g(this.b, notificationCompat$Builder0.M);
        a2.d(this.b, notificationCompat$Builder0.N);
        if(notificationCompat$Builder0.z) {
            a2.c(this.b, notificationCompat$Builder0.y);
        }
        if(!TextUtils.isEmpty(notificationCompat$Builder0.I)) {
            this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if(v3 >= 28) {
            for(Object object5: notificationCompat$Builder0.mPersonList) {
                android.app.Person person0 = ((Person)object5).toAndroidPerson();
                b2.a(this.b, person0);
            }
        }
        int v4 = Build.VERSION.SDK_INT;
        if(v4 >= 29) {
            c2.a(this.b, notificationCompat$Builder0.P);
            Notification.BubbleMetadata notification$BubbleMetadata0 = BubbleMetadata.toPlatform(notificationCompat$Builder0.Q);
            c2.b(this.b, notification$BubbleMetadata0);
            LocusIdCompat locusIdCompat0 = notificationCompat$Builder0.L;
            if(locusIdCompat0 != null) {
                c2.d(this.b, locusIdCompat0.toLocusId());
            }
        }
        if(v4 >= 0x1F) {
            int v5 = notificationCompat$Builder0.O;
            if(v5 != 0) {
                d2.b(this.b, v5);
            }
        }
        if(notificationCompat$Builder0.S) {
            this.e = this.c.v ? 2 : 1;
            this.b.setVibrate(null);
            this.b.setSound(null);
            int v6 = notification2.defaults & -4;
            notification2.defaults = v6;
            this.b.setDefaults(v6);
            if(TextUtils.isEmpty(this.c.u)) {
                w1.g(this.b, "silent");
            }
            a2.d(this.b, this.e);
        }
    }

    public final void a(Action notificationCompat$Action0) {
        IconCompat iconCompat0 = notificationCompat$Action0.getIconCompat();
        Notification.Action.Builder notification$Action$Builder0 = y1.a((iconCompat0 == null ? null : iconCompat0.toIcon()), notificationCompat$Action0.getTitle(), notificationCompat$Action0.getActionIntent());
        if(notificationCompat$Action0.getRemoteInputs() != null) {
            android.app.RemoteInput[] arr_remoteInput = RemoteInput.b(notificationCompat$Action0.getRemoteInputs());
            for(int v = 0; v < arr_remoteInput.length; ++v) {
                w1.c(notification$Action$Builder0, arr_remoteInput[v]);
            }
        }
        Bundle bundle0 = notificationCompat$Action0.getExtras() == null ? new Bundle() : new Bundle(notificationCompat$Action0.getExtras());
        bundle0.putBoolean("android.support.allowGeneratedReplies", notificationCompat$Action0.getAllowGeneratedReplies());
        int v1 = Build.VERSION.SDK_INT;
        z1.a(notification$Action$Builder0, notificationCompat$Action0.getAllowGeneratedReplies());
        bundle0.putInt("android.support.action.semanticAction", notificationCompat$Action0.getSemanticAction());
        if(v1 >= 28) {
            b2.b(notification$Action$Builder0, notificationCompat$Action0.getSemanticAction());
        }
        if(v1 >= 29) {
            c2.c(notification$Action$Builder0, notificationCompat$Action0.isContextual());
        }
        if(v1 >= 0x1F) {
            d2.a(notification$Action$Builder0, notificationCompat$Action0.isAuthenticationRequired());
        }
        bundle0.putBoolean("android.support.action.showsUserInterface", notificationCompat$Action0.getShowsUserInterface());
        w1.b(notification$Action$Builder0, bundle0);
        Notification.Action notification$Action0 = w1.d(notification$Action$Builder0);
        w1.a(this.b, notification$Action0);
    }

    public final Notification b() {
        Builder notificationCompat$Builder0 = this.c;
        Style notificationCompat$Style0 = notificationCompat$Builder0.n;
        if(notificationCompat$Style0 != null) {
            notificationCompat$Style0.apply(this);
        }
        RemoteViews remoteViews0 = notificationCompat$Style0 == null ? null : notificationCompat$Style0.makeContentView(this);
        Notification notification0 = this.b.build();
        if(remoteViews0 == null) {
            RemoteViews remoteViews1 = notificationCompat$Builder0.F;
            if(remoteViews1 != null) {
                notification0.contentView = remoteViews1;
            }
        }
        else {
            notification0.contentView = remoteViews0;
        }
        if(notificationCompat$Style0 != null) {
            RemoteViews remoteViews2 = notificationCompat$Style0.makeBigContentView(this);
            if(remoteViews2 != null) {
                notification0.bigContentView = remoteViews2;
            }
        }
        if(notificationCompat$Style0 != null) {
            RemoteViews remoteViews3 = notificationCompat$Builder0.n.makeHeadsUpContentView(this);
            if(remoteViews3 != null) {
                notification0.headsUpContentView = remoteViews3;
            }
        }
        if(notificationCompat$Style0 != null) {
            Bundle bundle0 = NotificationCompat.getExtras(notification0);
            if(bundle0 != null) {
                notificationCompat$Style0.addCompatExtras(bundle0);
            }
        }
        return notification0;
    }

    @Override  // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public final Notification.Builder getBuilder() {
        return this.b;
    }
}

