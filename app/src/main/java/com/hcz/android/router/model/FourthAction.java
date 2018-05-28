package com.hcz.android.router.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by shawn on 2018/5/28.
 */

public class FourthAction implements Parcelable{
    public int actCode;
    public String action;

    protected FourthAction(Parcel in) {
        actCode = in.readInt();
        action = in.readString();
    }

    public static final Creator<FourthAction> CREATOR = new Creator<FourthAction>() {
        @Override
        public FourthAction createFromParcel(Parcel in) {
            return new FourthAction(in);
        }

        @Override
        public FourthAction[] newArray(int size) {
            return new FourthAction[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(actCode);
        dest.writeString(action);
    }
}
