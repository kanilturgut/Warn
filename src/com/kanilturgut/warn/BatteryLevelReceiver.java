package com.kanilturgut.warn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;

/**
 * author kanilturgut
 * date 01/08/14
 * time 23:11
 */
public class BatteryLevelReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(
                context.getResources().getString(R.string.phoneNumber),
                null,
                context.getResources().getString(R.string.message),
                null,
                null);


    }
}
