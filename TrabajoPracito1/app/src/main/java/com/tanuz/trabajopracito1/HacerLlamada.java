package com.tanuz.trabajopracito1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class HacerLlamada extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
         boolean conetarUsb = intent.getExtras().getBoolean("connected");

         if(conetarUsb) {
             Intent i = new Intent(Intent.ACTION_CALL);
             i.setData(Uri.parse("tel: 911"));
             context.startActivity(i);
             Toast.makeText(context, "Se ha iniciado un llamada", Toast.LENGTH_LONG).show();
         }else{
             Toast.makeText(context,"Debe conectar el cable USB para realizar la llamada",Toast.LENGTH_LONG).show();

         }
         }
    }

