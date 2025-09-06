package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import g6.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ResourceDecoderRegistry {
    public final ArrayList a;
    public final HashMap b;

    public ResourceDecoderRegistry() {
        this.a = new ArrayList();
        this.b = new HashMap();
    }

    public final List a(String s) {
        synchronized(this) {
            if(!this.a.contains(s)) {
                this.a.add(s);
            }
            List list0 = (List)this.b.get(s);
            if(list0 == null) {
                list0 = new ArrayList();
                this.b.put(s, list0);
            }
            return list0;
        }
    }

    public void append(@NonNull String s, @NonNull ResourceDecoder resourceDecoder0, @NonNull Class class0, @NonNull Class class1) {
        synchronized(this) {
            this.a(s).add(new b(class0, class1, resourceDecoder0));
        }
    }

    @NonNull
    public List getDecoders(@NonNull Class class0, @NonNull Class class1) {
        synchronized(this) {
            List list0 = new ArrayList();
            for(Object object0: this.a) {
                List list1 = (List)this.b.get(((String)object0));
                if(list1 != null) {
                    for(Object object1: list1) {
                        b b0 = (b)object1;
                        if(b0.a.isAssignableFrom(class0) && class1.isAssignableFrom(b0.b)) {
                            ((ArrayList)list0).add(b0.c);
                        }
                    }
                }
            }
            return list0;
        }
    }

    @NonNull
    public List getResourceClasses(@NonNull Class class0, @NonNull Class class1) {
        synchronized(this) {
            List list0 = new ArrayList();
            for(Object object0: this.a) {
                List list1 = (List)this.b.get(((String)object0));
                if(list1 != null) {
                    for(Object object1: list1) {
                        b b0 = (b)object1;
                        if(b0.a.isAssignableFrom(class0) && class1.isAssignableFrom(b0.b) && !((ArrayList)list0).contains(b0.b)) {
                            ((ArrayList)list0).add(b0.b);
                        }
                    }
                }
            }
            return list0;
        }
    }

    public void prepend(@NonNull String s, @NonNull ResourceDecoder resourceDecoder0, @NonNull Class class0, @NonNull Class class1) {
        synchronized(this) {
            this.a(s).add(0, new b(class0, class1, resourceDecoder0));
        }
    }

    public void setBucketPriorityList(@NonNull List list0) {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList(this.a);
            this.a.clear();
            for(Object object0: list0) {
                this.a.add(((String)object0));
            }
            for(Object object1: arrayList0) {
                String s = (String)object1;
                if(!list0.contains(s)) {
                    this.a.add(s);
                }
            }
        }
    }
}

